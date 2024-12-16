package com.example.newsyy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    Context context;
    ArrayList<Model> modelArrayList;

    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.layout_item,parent,false);

        return  new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.heading.setText(modelArrayList.get(position).getTitle());
        holder.mainnews.setText(modelArrayList.get(position).getDescription());
        holder.auther.setText(modelArrayList.get(position).getAuther());
        holder.publishedat.setText(modelArrayList.get(position).getPublishedAt());
        Glide.with(context).load(modelArrayList.get(position).getUrlToImage()).into(holder.newsimage);

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView heading,mainnews,auther,publishedat;
        ImageView newsimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            heading = itemView.findViewById(R.id.newsMainHeading);
            mainnews = itemView.findViewById(R.id.newsContent);
            auther = itemView.findViewById(R.id.newsAuth);
            publishedat = itemView.findViewById(R.id.newsTime);
            newsimage = itemView.findViewById(R.id.newsImage);

        }
    }




}
