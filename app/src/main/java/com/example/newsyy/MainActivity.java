package com.example.newsyy;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import androidx.fragment.app.FragmentTransaction;

import com.example.newsyy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    static final String ROOT_FRAGMENT_TAG = "root_fragment";

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    ActivityMainBinding binding;
    String api="465e243239604bdfa0adfa13ea22a8b1";
    TextView settings;




    @SuppressLint({"MissingInflatedId", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    settings = findViewById(R.id.Settings);


        replaceFragment(new HomeFragment(),0);

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    replaceFragment(new HomeFragment(),0);
                    break;
//                case R.id.articles:
//                    replaceFragment(new ArticleFragment(),1);
//                    break;
                case R.id.shorts:
                    replaceFragment(new ShortsFragment(),1);
                    break;
                case R.id.videos:
                    replaceFragment(new VideosFragment(),2);
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment(),3);
                    break;
            }
            return true;
        });
        }



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