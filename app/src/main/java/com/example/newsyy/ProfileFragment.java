package com.example.newsyy;

import static com.example.newsyy.MainActivity.ROOT_FRAGMENT_TAG;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.TextView;
import android.widget.Toast;


public class ProfileFragment extends Fragment {

    SwitchCompat switcher;
    SharedPreferences sharedPreferences;
    boolean nightMood;
    ImageView back_btn,languageBtn,feedbackBtn,abtUs,priPol,terms;



    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
//        back_btn = v.findViewById(R.id.prof_back_btn);
        switcher = v.findViewById(R.id.switchBtn);
         sharedPreferences = getActivity().getSharedPreferences("MODE",Context.MODE_PRIVATE);
        nightMood = sharedPreferences.getBoolean("night", false);

        if (nightMood) {
            switcher.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nightMood) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", false);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor = sharedPreferences.edit();
                    editor.putBoolean("night", true);
                }
                editor.apply();
            }
        });


       AppCompatButton editBtn = v.findViewById(R.id.edit_btn);

       editBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

                Intent in = new Intent(getActivity(),ProfEdit_Activity.class);
                startActivity(in);
           }
       });


                ImageView navImage = (ImageView) v.findViewById(R.id.profImage);
        TextView navName = (TextView) v.findViewById(R.id.profName);
        TextView navEmail = (TextView) v.findViewById(R.id.profEmail);
        DBHelper dbHelper = new DBHelper(getActivity());
        Cursor cursor = dbHelper.getUser();
        if (cursor.getCount() == 0){
            Toast.makeText(getActivity(), "No Profile Details", Toast.LENGTH_SHORT).show();
        } else {
            while (cursor.moveToNext()){
                navName.setText(""+cursor.getString(0));
                navEmail.setText(""+cursor.getString(1));
                byte[] imageByte = cursor.getBlob(2);
                Bitmap bitmap = BitmapFactory.decodeByteArray(imageByte,0,imageByte.length);
                navImage.setImageBitmap(bitmap);
            }
        }

        languageBtn = v.findViewById(R.id.language);

        languageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(),languageActivity.class);
                startActivity(i);


            }
        });

        feedbackBtn = v.findViewById(R.id.feedback);

        feedbackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(),Feedback.class);
                startActivity(i);

            }
        });

        abtUs = v.findViewById(R.id.aboutus);

        abtUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), AboutUs.class);
                startActivity(i);

            }
        });


        priPol = v.findViewById(R.id.pri_pol);

        priPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), PrivacyPolicy.class);
                startActivity(i);

            }
        });


        terms =v.findViewById(R.id.term_con);

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getActivity(), TermsCondition.class);
                startActivity(i);

            }
        });

        return v;
    }
}