package com.example.newsyy;

import static com.example.newsyy.R.*;

import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
//import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArticleFragment extends Fragment {


//    private RecyclerView recyclerView;
//    private BlogAdapter blogAdapter;
//    private List<blog> blogList;
//    private ProgressBar progressBar;

//    VerticalViewPager verticalViewPager;
//    ViewPagerAdapter viewPagerAdapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_article, container, false);













//        recyclerView = v.findViewById(R.id.recyclerView);
//        progressBar = v.findViewById(R.id.progressBar);
//        blogList = new ArrayList<>();
//        blogAdapter = new BlogAdapter(blogList);
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyclerView.setAdapter(blogAdapter);
//
//        fetchBlogs();


        return v;
    }

//    private void fetchBlogs() {
//        progressBar.setVisibility(View.VISIBLE);
//        String url = "https://newsapi.org/v2/everything?q=tesla&from=2024-10-06&sortBy=publishedAt&apiKey=465e243239604bdfa0adfa13ea22a8b1";
//        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
//                Request.Method.GET, url, null,
//                new Response.Listener<JSONArray>() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        progressBar.setVisibility(View.GONE);
//                        try {
//                            for (int i = 0; i < response.length(); i++) {
//                                JSONObject blogObject = response.getJSONObject(i);
//                                String title = blogObject.getString("title");
//                                String content = blogObject.getString("content");
//                                String author = blogObject.getString("author");
//
//                                blogList.add(new blog(title, content, author));
//                            }
//                            blogAdapter.notifyDataSetChanged();
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        progressBar.setVisibility(View.GONE);
//                        error.printStackTrace();
//                    }
//                }
//        );
//
//        requestQueue.add(jsonArrayRequest);
//    }

}