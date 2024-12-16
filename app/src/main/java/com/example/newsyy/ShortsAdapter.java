package com.example.newsyy;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

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
            title = itemView.findViewById(R.id.textVideoTitle);
            subTitle =itemView.findViewById(R.id.textVideoDescription);
        }
    }
}

