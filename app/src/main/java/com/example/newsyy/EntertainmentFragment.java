package com.example.newsyy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EntertainmentFragment extends Fragment {

//    String api="cc6da580caec42d9bf203bbfdd99c1f3";
//    ArrayList<modelClass> modelClassArrayList;
//    NewsRecyclerAdapter adapter;
//    String country="us";
//    private RecyclerView recyclerViewofEntertainment;
//    private String category="entertainment";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.entertainmentfragment,null);
//        recyclerViewofEntertainment=v.findViewById(R.id.recyclerviewofentertainment);
//        modelClassArrayList=new ArrayList<>();
//        recyclerViewofEntertainment.setLayoutManager(new LinearLayoutManager(getContext()));
//        adapter= new NewsRecyclerAdapter(getContext(),modelClassArrayList);
//        recyclerViewofEntertainment.setAdapter(adapter);
//
//        findNews();

        return v;


    }

//    private void findNews(){
//        apiUtilities utilities=new apiUtilities();
//
//        apiUtilities.getApiInterface().getCategoryNews(country,category,100,api).enqueue(new Callback<mainNews>() {
//            @Override
//            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
//
//
//                if (response.isSuccessful()){
//                    modelClassArrayList.addAll(response.body().getArticles());
//                    adapter.notifyDataSetChanged();
//                }
//
//            }
//
//            @Override
//            public void onFailure(Call<mainNews> call, Throwable t) {
//
//            }
//        });




    }
//}
