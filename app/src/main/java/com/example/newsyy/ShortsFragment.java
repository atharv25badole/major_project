package com.example.newsyy;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;


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
//        shortsDataList =new ArrayList<>();

        for (int i=0;i<100;i++) {

            r = (int) ((Math.random())*10);
            if (r==check){
                r=r+1;
                suffelVideo(r);
            }else{
            suffelVideo(r);
            }
            check=r;

//            ShortsData data = new ShortsData("android.resource://"+getActivity().getPackageName()+"/"+R.raw.newsreel8, "subTitle 1", "Title 1");
//           dataHandlers.add(data);
        }
//
//
//        ShortsData data2 = new ShortsData("https://video-aajtak.tosshub.com/aajtak/video/2024_10/28_oct_24_at_sim_cards_rule_vo_mm_1024_512.mp4","subTitle 2","Title 2");
//        ShortsData data3 = new ShortsData("https://video-aajtak.tosshub.com/aajtak/video/2024_10/28_oct_24_ayodhya_deepotsav_at_mm_gyanesh_1024_512.mp4","subTitle 3","Title 3");
//        ShortsData data4 = new ShortsData("https://video-indiatoday.tosshub.com/indiatoday/video/2024_10/28_oct_24_summary_ifrmit_1730125393_720.mp4","subTitle 4","Title 4");
//        ShortsData data5 = new ShortsData("https://video-indiatoday.tosshub.com/indiatoday/video/2024_10/28_oct_24_summary_ifrmit_1730126360_720.mp4","subTitle 5","Title 5");
//        ShortsData data6 = new ShortsData("https://www.youtube.com/shorts/gN5noF1ypUM?feature=share","subTitle 6","Title 6");
//        ShortsData data7 = new ShortsData("https://video-aajtak.tosshub.com/aajtak/video/2024_10/28_oct_24_at_road_ends_vo_mm_1024_512.mp4","subTitle 1","Title 1");
//        ShortsData data8 = new ShortsData("https://video-aajtak.tosshub.com/aajtak/video/2024_10/28_oct_24_at_road_ends_vo_mm_1024_512.mp4","subTitle 1","Title 1");
//        ShortsData data9= new ShortsData("https://video-aajtak.tosshub.com/aajtak/video/2024_10/28_oct_24_at_road_ends_vo_mm_1024_512.mp4","subTitle 1","Title 1");
//        ShortsData data10 = new ShortsData("https://video-aajtak.tosshub.com/aajtak/video/2024_10/28_oct_24_at_road_ends_vo_mm_1024_512.mp4","subTitle 1","Title 1");


//        dataHandlers.add(data);
//        dataHandlers.add(data2);
//        dataHandlers.add(data3);
//        dataHandlers.add(data4);
//        dataHandlers.add(data5);
//        dataHandlers.add(data6);
//        dataHandlers.add(data7);
//        dataHandlers.add(data8);
//        dataHandlers.add(data9);
//        dataHandlers.add(data10);




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

