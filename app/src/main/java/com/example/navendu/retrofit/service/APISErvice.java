package com.example.navendu.retrofit.service;

/**
 * Created by navendu on 09-02-2017.
 */



import com.example.navendu.retrofit.model.student;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;


public interface APISErvice {

    @GET("company/")
    Call<List<student>> getpeopledetails();

}
