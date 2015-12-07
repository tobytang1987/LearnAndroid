package com.bys.devicemaster.network;

import com.bys.devicemaster.module.User;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;
import retrofit.http.GET;

/**
 * Created by tobytang on 15-12-4.
 */
public interface UserService {

    @GET("/user")
    Call<User> getUser();

}
