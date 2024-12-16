package com.example.newsyy;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsApiUtilities {

public static Retrofit retrofit = null;

public static NewsApiInterface getApiInterface() {

    if (retrofit == null){

        retrofit = new  Retrofit.Builder().baseUrl(NewsApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    }

    return retrofit.create(NewsApiInterface.class);

}

}
