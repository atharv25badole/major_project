package com.example.newsyy;



import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GeneralFragment extends Fragment {


    String API_KEY = "465e243239604bdfa0adfa13ea22a8b1";
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<Model> modelArrayList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.generalfragment, null);

        recyclerView = v.findViewById(R.id.general_recyclerView);
        modelArrayList = new ArrayList<>();
        adapter = new Adapter(getContext(), modelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        getNews();



        return v;


    }

    void getNews() {

        NewsApiUtilities.getApiInterface().getNews("us", 100, API_KEY).enqueue(new Callback<MainNewsContent>() {
            @Override
            public void onResponse(Call<MainNewsContent> call, Response<MainNewsContent> response) {
                if (response.isSuccessful()) {

                    modelArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();

                }
                }


            @Override
            public void onFailure(Call<MainNewsContent> call, Throwable t) {
                Log.i("GOT Failure News not fatched by app", Objects.requireNonNull(t.getMessage()));

            }
        });
    }
}
