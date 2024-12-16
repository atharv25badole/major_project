package com.example.newsyy;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;

public class HomeFragment extends Fragment  {

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

        mgeneral = v.findViewById(R.id.general);
        mscience = v.findViewById(R.id.science);
        mhealth = v.findViewById(R.id.health);
        msports =v.findViewById(R.id.sports);
        mentertainment = v.findViewById(R.id.entertainment);
//        mtech = v.findViewById(R.id.technology);

        ViewPager viewPager = v.findViewById(R.id.fragmentContainer);
        tabLayout = v.findViewById(R.id.tabsView);


        pagerAdapter = new PagerAdapter(getParentFragmentManager(),5);
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4 ){

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
}

//||tab.getPosition()==5