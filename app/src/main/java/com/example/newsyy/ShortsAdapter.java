package com.example.newsyy;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import java.util.ArrayList;
import java.util.List;

//public class ShortsAdapter extends RecyclerView.Adapter<ShortsAdapter.ShortsViewHolder> {
//
//
//    List<ShortsData> shortsDataList;
//
//    public ShortsAdapter(List<ShortsData> shortsDataList) {
//        this.shortsDataList = shortsDataList;
//    }
//
//    @NonNull
//    @Override
//    public ShortsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shorts,parent,false);
//        return  new ShortsViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ShortsViewHolder holder, int position) {
//
//        holder.setShortsUser
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }
//
//    public class ShortsViewHolder extends RecyclerView.ViewHolder{
//
//        VideoView videoView;
//        TextView shortsUser,shortsTitle;
//        ImageView shortsImage;
//
//
//        public ShortsViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            videoView= itemView.findViewById(R.id.videoView);
//            shortsUser= itemView.findViewById(R.id.shortsUser);
//            shortsTitle=itemView.findViewById(R.id.shortsTitle);
//            shortsImage=itemView.findViewById(R.id.shorts_image);
//
//        }
//
//        public void setShortsUser(ShortsData shortsData){
//
//            shortsUser.setText(shortsData.getShortsUser());
//            shortsTitle.setText(shortsData.getShortsTitle());
//            videoView.setVideoPath(shortsData.getShortsPath());
//            shortsImage.setImageResource(shortsData.getShortsImage());
//
//            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                @Override
//                public void onPrepared(MediaPlayer mediaPlayer) {
//                    mediaPlayer.start();
//                    float videoRatio = mediaPlayer.getVideoWidth() / (float) mediaPlayer.getVideoHeight();
//                    float screenRatio = videoView.getWidth() / (float) mediaPlayer.getVideoHeight();
//                    float scale= videoRatio / screenRatio;
//                    if (scale >= 1f){
//                                     videoView.setScaleX(scale);
//                    }else {
//
//                        videoView.setScaleX(1f/scale);
//                    }
//                }
//            });
//
//            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                @Override
//                public void onCompletion(MediaPlayer mediaPlayer) {
//                    mediaPlayer.start();
//                }
//            });
//
//
//        }
//
//
//
//    }
//
//
//}



public class ShortsAdapter extends RecyclerView.Adapter<ShortsAdapter.ViewHolder>{


    private ArrayList<ShortsData> dataHandler;
    private Fragment fragment;

    public ShortsAdapter(ArrayList<ShortsData> dataHandler) {
        this.dataHandler = dataHandler;

    }

    @NonNull
    @Override
    public ShortsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shorts,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShortsAdapter.ViewHolder holder, int position) {

        holder.title.setText(dataHandler.get(position).shortsTitle);
        holder.subTitle.setText(dataHandler.get(position).shortsTitle);
        holder.videoView.setVideoPath((dataHandler.get(position).url));
        holder.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {

                holder.progressBar.setVisibility(View.GONE);
                mediaPlayer.start();
                float vidRatio = mediaPlayer.getVideoWidth() / (float) mediaPlayer.getVideoHeight();
                    float screenRatio = holder.videoView.getWidth() / (float) holder.videoView.getHeight();
                    float scale= vidRatio / screenRatio;
                    if (scale >= 1){
                                     holder.videoView.setScaleX(scale);
                    }else {

                        holder.videoView.setScaleX(1f/scale);
                    }

            }
        });

        holder.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataHandler.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        VideoView videoView;
        ProgressBar progressBar;
        Button saveBtn,favoriteBtn,shareBtn,moreBtn;
        TextView title,subTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView = itemView.findViewById(R.id.videoView);
            progressBar = itemView.findViewById(R.id.videoProgressBar);
//            favoriteBtn = itemView.findViewById(R.id.favorites);
//            saveBtn = itemView.findViewById(R.id.save);
//            shareBtn = itemView.findViewById(R.id.share);
//            moreBtn = itemView.findViewById(R.id.more);
            title = itemView.findViewById(R.id.textVideoTitle);
            subTitle =itemView.findViewById(R.id.textVideoDescription);
        }
    }
}

