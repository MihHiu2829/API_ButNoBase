package com.example.api_4.API;

import com.example.api_4.API.Req.GetToken;
import com.example.api_4.API.Res.AuthRes;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface API {
        final String KEY_API = "adee871a78e5736c792ff131a3a29566" ;


        @GET("authentication/token/new?api_key=" + KEY_API)
        @Headers("Content-Type: application/json")
        Call<AuthRes>sginUp() ;


        @POST("authentication/token/validate_with_login?api_key=" + KEY_API)
        @Headers("Content-Type: application/json")
        Call<AuthRes>createSission(@Body GetToken acc);






}
