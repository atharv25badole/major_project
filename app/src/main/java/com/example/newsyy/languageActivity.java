package com.example.newsyy;

import static com.example.newsyy.R.id.*;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.text.CaseMap;
import android.media.RouteListingPreference;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Locale;

public class languageActivity extends AppCompatActivity {

    //initialising Variable
    TextView tvSelect,setting;
    RadioGroup rgLanguage;
    RadioButton rbEnglish,rbHindi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);


        //Assign Variable
        tvSelect = findViewById(R.id.tv_select);
        rgLanguage = findViewById(R.id.rg_language);
        rbEnglish = findViewById(R.id.rb_english);
        rbHindi = findViewById(R.id.rb_hindi);


        //Set Listener on radio group
       rgLanguage.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int i) {
               //Check Condition
               switch (i){

                   case R.id.rb_english:
                       //When english selected
                       //Initializing string
                       String language = "en";
                       //set locale
                       setLocale(language);
                       break;

                   case R.id.rb_hindi:
                       setLocale("hi");
                       break;
               }
           }
       });
    }

    private void setLocale(String language) {
        //Initialize resources
        Resources resources = getResources();
        //Initialize matrices
        DisplayMetrics metrics = resources.getDisplayMetrics();
        //Initialize configuration
        Configuration configuration = resources.getConfiguration();
        //Initialize locale
        configuration.locale= new Locale(language);
        //Update configuration
        resources.updateConfiguration(configuration,metrics);
        //Notify configuration
        onConfigurationChanged(configuration);

    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        tvSelect.setText(R.string.select_language);
        rbEnglish.setText(R.string.english);
        rbHindi.setText(R.string.hindi);

    }
}
