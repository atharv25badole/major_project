package com.example.newsyy;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about_us);

       textView = findViewById(R.id.PolicyText);
       String para = "Welcome to Newsy, your ultimate destination for staying informed, entertained, and connected with the world. At Newsy, we bring you the latest and most comprehensive news coverage, tailored to fit your lifestyle.\n" +
               "\n" +
               "From breaking headlines to in-depth blogs, from engaging reels to full-length videos, we deliver diverse content to ensure you’re updated anytime, anywhere. Our mission is to keep you informed about global events, trends, and stories that matter most, empowering you with knowledge and insights in real time.\n" +
               "\n" +
               "Whether it’s politics, technology, entertainment, sports, or world affairs, Newsy curates content to keep you ahead of the curve. With our user-friendly platform, you can explore news in formats that suit your preferences—short, sharp updates or deep dives into compelling stories.\n"+
              "What We Offer\n" +
               "Reels Page: Dive into quick, captivating updates through short, engaging video reels that keep you informed on the go.\n" +
               "Blogs: Explore in-depth articles and opinion pieces, crafted to provide context, analysis, and a deeper understanding of current events.\n" +
               "Long Video Headlines: Watch detailed video segments that break down complex stories into digestible and comprehensive reports.\n" +
               "Daily Latest News: Stay ahead of the curve with real-time updates and breaking news from around the globe, delivered fresh every day.\n" +
               "At Newsy, we are more than just a news platform—we are your companion for staying informed in a fast-paced world. Whether you’re looking for quick updates, deep dives, or visual storytelling, we’ve got it all.\n" +
               "\n"

        ;

                textView.setText(para);

        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}