package com.example.newsyy;

import android.database.DataSetObserver;
import android.net.DnsResolver;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ProgressBar;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment  {

//    String api="cc6da580caec42d9bf203bbfdd99c1f3";
//    ArrayList<modelClass> modelClassArrayList;
//    NewsRecyclerAdapter adapter;
//    String country="us";
//    private RecyclerView recyclerViewofhome;




    //For Tabs
    TabLayout tabLayout;
    TabItem mgeneral,msports,mscience,mhealth,mtech,mentertainment;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;



    private  ImageCarousel carousel;


    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v = inflater.inflate(R.layout.fragment_home,null);

//      recyclerViewofhome=v.findViewById(R.id.news_recycler_view);
//      modelClassArrayList=new ArrayList<>();
//      recyclerViewofhome.setLayoutManager(new LinearLayoutManager(getContext()));
//      adapter= new NewsRecyclerAdapter(getContext(),modelClassArrayList);
//      recyclerViewofhome.setAdapter(adapter);
//      carousel = v.findViewById(R.id.carousel);

//      findNews();

//        ArrayList<CarouselItem> clist = new ArrayList<>();
//        clist.add(new CarouselItem(
//                "https://cdn.pixabay.com/photo/2017/11/27/21/31/computer-2982270__340.jpg",
//                "Best laptop in the world"
//        ));
//
//        clist.add(new CarouselItem(
//                "https://cdn.pixabay.com/photo/2015/06/24/15/45/hands-820272_960_720.jpg",
//                "Best laptop in the world to buy"
//        ));
//
//        clist.add(new CarouselItem(
//                "https://cdn.pixabay.com/photo/2016/06/25/12/52/laptop-1478822__340.jpg",
//                "Hello world Best laptop in the world"
//        ));
//
//        carousel.setData(clist);




//        mtoolbar = v.findViewById(R.id.toolbar);
//        setSupportActionBar(mtoolbar);

        mgeneral = v.findViewById(R.id.general);
        mscience = v.findViewById(R.id.science);
        mhealth = v.findViewById(R.id.health);
        msports =v.findViewById(R.id.sports);
        mentertainment = v.findViewById(R.id.entertainment);
        mtech = v.findViewById(R.id.technology);

        ViewPager viewPager = v.findViewById(R.id.fragmentContainer);
        tabLayout = v.findViewById(R.id.tabsView);


        pagerAdapter = new PagerAdapter(getParentFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 ||tab.getPosition()==4 ||tab.getPosition()==5){

                    pagerAdapter.notifyDataSetChanged();

                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));








        return v;
    }

//    private void findNews(){
//        apiUtilities utilities=new apiUtilities();
//
//        apiUtilities.getApiInterface().getNews(country,100,api).enqueue(new Callback<mainNews>() {
//            @Override
//            public void onResponse(Call<mainNews> call, Response<mainNews> response) {
//
//                if (response.isSuccessful()){
//                    modelClassArrayList.addAll(response.body().getArticles());
//                    adapter.notifyDataSetChanged();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<mainNews> call, Throwable t) {
//
//            }
//        });
//
//
//
//
//    }
}