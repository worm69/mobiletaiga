package pt.dbmg.mobiletaiga.network;

import com.google.gson.JsonObject;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface WhatAnimeServices {
    @POST("search")
    Call<JsonObject> search(@Query("token") String token, @Body JsonObject encodedImage);//, @Field("filter") String filter

    @GET("me")
    Call<JsonObject> getQuota(@Query("token") String token);
}
