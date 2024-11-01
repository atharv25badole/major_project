package com.example.newsyy;

import static com.example.newsyy.MainActivity.ROOT_FRAGMENT_TAG;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatCallback;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import com.google.android.material.navigation.NavigationView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;


import org.jetbrains.annotations.NotNull;

import java.util.Objects;


public class ProfileFragment extends Fragment {

    SwitchCompat switcher;
    SharedPreferences sharedPreferences;
    boolean nightMood;
    ImageView back_btn;


    SharedPreferences.Editor editor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        back_btn = v.findViewById(R.id.prof_back_btn);
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


//               EditProfile editProfile = new EditProfile();
//               FullscreenFragment fs = new FullscreenFragment();
//               FragmentManager fm = getActivity().getSupportFragmentManager();
//               FragmentTransaction ft = fm.beginTransaction();
//               ft.replace(R.id.frameLayout,editProfile);
//               fm.popBackStack(ROOT_FRAGMENT_TAG,FragmentManager.POP_BACK_STACK_INCLUSIVE);
//               ft.addToBackStack(ROOT_FRAGMENT_TAG);
//               ft.commit();


           }
       });


//
//        back_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(getParentFragment(),MainActivity.class);
//
//            }
//        });



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






        return v;
    }

}