package com.example.newsyy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ShortsFragment extends Fragment {

//   private List<ShortsData> shortsDataList;
   private ArrayList<ShortsData> dataHandlers = new ArrayList<>();
   ViewPager2 viewPager2;
   private int r;
   private int check=0;
   public ShortsFragment(){

   }

    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container,
                          Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_shorts,container,false);

        for (int i=0;i<100;i++) {

            r = (int) ((Math.random())*10);
            if (r==check){
                r=r+1;
                suffelVideo(r);
            }else{
            suffelVideo(r);
            }
            check=r;

        }

        viewPager2 = v.findViewById(R.id.viewPager);
        ShortsAdapter shortsAdapter = new ShortsAdapter(dataHandlers);
        viewPager2.setAdapter(shortsAdapter);

        return v;
    }
    

    public void suffelVideo(int a){

       if(a==0){
           ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel1, "subTitle 1", "Ajj TAK");
           dataHandlers.add(data);

       } if(a==1){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel2, "subTitle 2", "Ajj TAK");
            dataHandlers.add(data);

        } if(a==2){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel3, "subTitle 3", "Ajj TAK");
            dataHandlers.add(data);

        } else if(a==3){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel4, "subTitle 4", "Ajj TAK");
            dataHandlers.add(data);

        } else if(a==4){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel5, "subTitle 5", "Ajj TAK");
            dataHandlers.add(data);

        } else if(a==5){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel6, "subTitle 6", "Ajj TAK");
            dataHandlers.add(data);

        } else if(a==6){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel7, "subTitle 7", "Ajj TAK");
            dataHandlers.add(data);

        } else if(a==7){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel8, "subTitle 8", "Ajj TAK");
            dataHandlers.add(data);

        }else if(a==8){
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel9, "subTitle 9", "Ajj TAK");
            dataHandlers.add(data);

        }else{
            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel10, "subTitle 10", "Ajj TAK");
            dataHandlers.add(data);
        }
    }
}

