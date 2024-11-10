package com.example.newsyy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.newsyy.databinding.ActivityMainBinding;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.request.TopHeadlinesRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final String ROOT_FRAGMENT_TAG = "root_fragment";
    //    RecyclerView recyclerView;
//    List<Article> articleList= new ArrayList<>();
//    LinearProgressIndicator progressIndicator;
//    NewsRecyclerAdapter newsRecyclerAdapter;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    ActivityMainBinding binding;
    String api="465e243239604bdfa0adfa13ea22a8b1";




//
//    //For Tabs
//    TabLayout tabLayout;
//    TabItem mgeneral,msports,mscience,mhealth,mtech,mentertainment;
//    PagerAdapter pagerAdapter;
//    Toolbar mtoolbar;



    @SuppressLint({"MissingInflatedId", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        replaceFragment(new HomeFragment(),0);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomeFragment(),0);
                    break;
                case R.id.articles:
                    replaceFragment(new ArticleFragment(),1);
                    break;
                case R.id.shorts:
                    replaceFragment(new ShortsFragment(),2);
                    break;
                case R.id.videos:
                    replaceFragment(new VideosFragment(),3);
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment(),4);
                    break;
            }
            return true;
        });


//        mtoolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(mtoolbar);
//
//        mgeneral = findViewById(R.id.general);
//        mscience = findViewById(R.id.science);
//        mhealth = findViewById(R.id.health);
//        msports = findViewById(R.id.sports);
//        mentertainment = findViewById(R.id.entertainment);
//        mtech = findViewById(R.id.technology);
//
//        ViewPager viewPager = findViewById(R.id.fragmentContainer);
//        tabLayout = findViewById(R.id.tabsView);
//
//
//        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);
//        viewPager.setAdapter(pagerAdapter);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//
//                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 ||tab.getPosition()==4 ||tab.getPosition()==5){
//
//                    pagerAdapter.notifyDataSetChanged();
//
//                }
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));









//        recyclerView = findViewById(R.id.news_recycler_row);
//        progressIndicator = findViewById(R.id.progress_bar);
//        btn1=findViewById(R.id.btn_1);
//        btn2=findViewById(R.id.btn_2);
//        btn3=findViewById(R.id.btn_3);
//        btn4=findViewById(R.id.btn_4);
//        btn5=findViewById(R.id.btn_5);
//        btn6=findViewById(R.id.btn_6);
//        btn7=findViewById(R.id.btn_7);
//        btn1.setOnClickListener(this);
//        btn2.setOnClickListener(this);
//        btn3.setOnClickListener(this);
//        btn4.setOnClickListener(this);
//        btn5.setOnClickListener(this);
//        btn6.setOnClickListener(this);
//        btn7.setOnClickListener(this);





//        setupRecyclerView();
//        getNews("GENERAL");

//
//        ImageView navImage = (ImageView) findViewById(R.id.profImage);
//        TextView navName = (TextView) findViewById(R.id.profName);
//        TextView navEmail = (TextView) findViewById(R.id.profEmail);
//        DBHelper dbHelper = new DBHelper(this);
//        Cursor cursor = dbHelper.getUser();
//        if (cursor.getCount() == 0){
//            Toast.makeText(this, "No Profile Details", Toast.LENGTH_SHORT).show();
//        } else {
//            while (cursor.moveToNext()){
//                navName.setText(""+cursor.getString(0));
//                navEmail.setText(""+cursor.getString(1));
//                byte[] imageByte = cursor.getBlob(2);
//                Bitmap bitmap = BitmapFactory.decodeByteArray(imageByte,0,imageByte.length);
//                navImage.setImageBitmap(bitmap);
//            }
//        }






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

    HomeFragment homeFragment;

    @Override
    public void onClick(View v) {

        Button btn = (Button) v;
        String category = btn.getText().toString();
//        getNews(category);
    }


public void replaceFragment(Fragment fragment,int flag) {
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.frameLayout, fragment);

     if (flag == 0){

        fragmentManager.popBackStack(ROOT_FRAGMENT_TAG,FragmentManager.POP_BACK_STACK_INCLUSIVE);

     }else
         fragmentTransaction.addToBackStack(null);

    fragmentTransaction.commit();
}

}