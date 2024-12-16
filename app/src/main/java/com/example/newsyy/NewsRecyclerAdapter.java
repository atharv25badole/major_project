package com.example.newsyy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kwabenaberko.newsapilib.models.Article;
import com.squareup.picasso.Picasso;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

//public class NewsRecyclerAdapter extends RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder> {
//
//    Context context;
//    ArrayList<modelClass> modelClassArrayList;
//
//
//    public NewsRecyclerAdapter(Context context, ArrayList<modelClass> modelClassArrayList) {
//        this.context = context;
//        this.modelClassArrayList = modelClassArrayList;
//    }
//
//    @NonNull
//    @Override
//    public NewsRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(context).inflate(R.layout.layout_item,null,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull NewsRecyclerAdapter.ViewHolder holder,  int position) {
//
//        holder.cardView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(context,webView.class);
//                intent.putExtra("url",modelClassArrayList.get(position).getUrl());
//                context.startActivity(intent);
//            }
//        });
//
//        holder.mtime.setText("Published At:-"+modelClassArrayList.get(position).getPublishedAt());
//        holder.mauthor.setText(modelClassArrayList.get(position).getAuthor());
//        holder.mheadingne.setText(modelClassArrayList.get(position).getTitle());
//        holder.mcontent.setText(modelClassArrayList.get(position).getDescription());
//        Glide.with(context).load(modelClassArrayList.get(position).getUrlToImage()).into(holder.imageView);
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return modelClassArrayList.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        TextView mheadingne,mcontent,mauthor,mtime;
//        CardView cardView;
//        ImageView imageView;
//        ImageView imageView3;
//
//
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            mheadingne=itemView.findViewById(R.id.mainheading);
//            mcontent=itemView.findViewById(R.id.content);
//            mauthor=itemView.findViewById(R.id.author);
//            mtime=itemView.findViewById(R.id.time);
//            imageView=itemView.findViewById(R.id.imageview);
//            cardView=itemView.findViewById(R.id.news_card_view);
//        }
//    }
//
//

//---------------------------------------------------------------------------------------

//}
