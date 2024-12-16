package com.example.newsyy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//public class webView extends AppCompatActivity {
//
//    Toolbar toolbar;
//    WebView webView;
//    ImageView backbtn;
//    GeneralFragment generalFragment = new GeneralFragment();
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_web_view);
////        toolbar.findViewById(R.id.toolbar1);
//        webView = findViewById(R.id.webview);
////        setSupportActionBar(toolbar);
//
//
//
//        Intent intent=getIntent();
//        String url=generalFragment.uri;
//        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl(url);
//        backbtn = findViewById(R.id.backBtn);
//        HomeFragment homeFragment = new HomeFragment();
//
//        backbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(webView.this,MainActivity.class);
//                startActivity(intent);
//
//            }
//        });
//
//
//
//
//
//    }
//}