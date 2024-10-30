package com.example.newsyy;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class apiUtilities {

    public static Retrofit retrofit=null;

    public static apiInterface  getApiInterface(){


        if (retrofit==null){

            retrofit = new Retrofit.Builder().baseUrl(apiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(apiInterface.class);

    }









//        private static Retrofit retrofit= null;
//
//        public static Object getApiInterface(){
//
//
//            if(retrofit==null){
//
//                retrofit = new Retrofit.Builder().baseUrl(apiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
//                        .build();
//
//            }
//
//            return retrofit.create(apiInterface.class);
//
//        }

}
