package com.example.newsyy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class VideosFragment extends Fragment {

    private static final int REQUEST_PERMISSION = 1;

    private RecyclerView videoRecyclerView;
    private VideoView videoView;
    private List<VideoModel> videoList;
    private VideoAdapter videoAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_videos, container, false);

        Toolbar toolbar = v.findViewById(R.id.toolbar);
       // Customize the title if needed

        videoRecyclerView = v.findViewById(R.id.videoRecyclerView);
        videoView = v.findViewById(R.id.videoView);

        videoList = new ArrayList<>();
        videoAdapter = new VideoAdapter(videoList, this::playVideo);

        videoRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        videoRecyclerView.setAdapter(videoAdapter);

        // Check for storage permission
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, REQUEST_PERMISSION);
            } else {
                loadVideos();
            }
        } else {
            loadVideos();
        }



        return  v;

    }

    private void loadVideos() {
        ContentResolver contentResolver = getActivity().getContentResolver();
        Uri videoUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        String[] projection = {MediaStore.Video.Media.TITLE, MediaStore.Video.Media.DATA};

        Cursor cursor = contentResolver.query(videoUri, projection, null, null, null);
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String title = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.TITLE));
                String path = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DATA));
                videoList.add(new VideoModel(title, "android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel7));
                videoList.add(new VideoModel(title, path));
                videoList.add(new VideoModel(title, path));
                videoList.add(new VideoModel(title, path));
                //ADD title and path



            }
            cursor.close();
            videoAdapter.notifyDataSetChanged();
        }
    }

    private void playVideo(String videoPath) {
        videoView.setVideoPath(videoPath);

        // Add playback controls
        MediaController mediaController = new MediaController(getActivity());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_PERMISSION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                loadVideos();
            } else {
                System.out.println("Error");
                System.out.println("GO BACK");
            }
        }
    }

}