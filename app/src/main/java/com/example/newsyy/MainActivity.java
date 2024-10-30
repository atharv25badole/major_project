package com.example.newsyy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsyy.databinding.ActivityMainBinding;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.request.TopHeadlinesRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    RecyclerView recyclerView;
//    List<Article> articleList= new ArrayList<>();
//    LinearProgressIndicator progressIndicator;
//    NewsRecyclerAdapter newsRecyclerAdapter;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    ActivityMainBinding binding;
    String api="465e243239604bdfa0adfa13ea22a8b1";





    @SuppressLint({"MissingInflatedId", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setBackground(null);
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.articles:
                    replaceFragment(new ArticleFragment());
                    break;
                case R.id.shorts:
                    replaceFragment(new ShortsFragment());
                    break;
                case R.id.videos:
                    replaceFragment(new VideosFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;
            }
            return true;
        });
//        recyclerView = findViewById(R.id.news_recycler_row);
//        progressIndicator = findViewById(R.id.progress_bar);
        btn1=findViewById(R.id.btn_1);
        btn2=findViewById(R.id.btn_2);
        btn3=findViewById(R.id.btn_3);
        btn4=findViewById(R.id.btn_4);
        btn5=findViewById(R.id.btn_5);
        btn6=findViewById(R.id.btn_6);
        btn7=findViewById(R.id.btn_7);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);





//        setupRecyclerView();
//        getNews("GENERAL");

        }

//    void setupRecyclerView(){
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        newsRecyclerAdapter = new NewsRecyclerAdapter(articleList);
//        recyclerView.setAdapter(newsRecyclerAdapter);
//    }




//    void changeInProgress(boolean show){
//        if(show)
//            progressIndicator.setVisibility(View.VISIBLE);
//        else
//            progressIndicator.setVisibility(View.INVISIBLE);
//    }




//    void getNews(String category){
//
//        changeInProgress(true);
//        NewsApiClient newsApiClient = new NewsApiClient("465e243239604bdfa0adfa13ea22a8b1");
//        newsApiClient.getTopHeadlines(
//        new  TopHeadlinesRequest.Builder()
//                .language("en")
//                .category(category)
//                .build(),
//        new NewsApiClient.ArticlesResponseCallback(){
//            @Override
//            public void onSuccess(ArticleResponse response){
//                runOnUiThread(()->{
//                    changeInProgress(false);
//                    articleList = response.getArticles();
//                    newsRecyclerAdapter.updateData(articleList);
//                    newsRecyclerAdapter.notifyDataSetChanged();
//                });
//
//            }
//            @Override
//            public  void onFailure(Throwable throwable){
//
//                Log.i("GOT FAILURE",throwable.getMessage());
//            }
//        });
//
//    }


    @Override
    public void onClick(View v) {

        Button btn = (Button) v;
        String category = btn.getText().toString();
//        getNews(category);
    }


public void replaceFragment(Fragment fragment) {
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frameLayout, fragment);
    fragmentTransaction.commit();
}
}