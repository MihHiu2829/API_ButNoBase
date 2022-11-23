package com.example.api_4.ViewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.api_4.API.API;
import com.example.api_4.API.Req.GetToken;
import com.example.api_4.API.Res.AuthRes;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class m001_LoginVM extends baseViewModel
{
    private  String TAG = m001_LoginVM.class.getName() ;
    private static final String BASE_URL = "https://api.themoviedb.org/3/" ;
   public void getAuthen()
    {

        Retrofit rs = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().callTimeout(30, TimeUnit.SECONDS).build()).build() ;

        API api = rs.create(API.class );
        api.sginUp().enqueue(new Callback<AuthRes>() {
            @Override
            public void onResponse(Call<AuthRes> call, Response<AuthRes> response) {
                if(response.code() == 200 || response.code() == 201)
                {
                    handleSuccess(response.body().request_token);
                }else handleFail(response.code(),response.errorBody()) ;
            }

            @Override
            public void onFailure(Call<AuthRes> call, Throwable t) {
                        Log.e(TAG,"Failure : " + t.getMessage());
            }
        });
    }

    private void handleFail(int code, ResponseBody errorBody) {
        Log.e(TAG,"HandleFail : "+ code);
        Log.e(TAG,"HandleFail : "+ errorBody.toString());
    }

    private void handleSuccess(String Token) {
        Log.e(TAG,"Success : " + Token) ;
        handleCheckLogin(Token,"minhhieu2__3","abc12345");
    }

    private void handleCheckLogin(String request_token, String un, String pw) {
        Retrofit rs = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().callTimeout(30, TimeUnit.SECONDS).build()).build() ;
        API api = rs.create(API.class );
        api.createSission(new GetToken(un,pw,request_token)).enqueue(new Callback<AuthRes>() {
            @Override
            public void onResponse(Call<AuthRes> call, Response<AuthRes> response) {
                if(response.code() == 200 || response.code() == 201)
                {
                    Log.e(TAG,"Success : "+ response.body().toString()) ;
                }else handleFail(response.code(),response.errorBody()) ;
            }

            @Override
            public void onFailure(Call<AuthRes> call, Throwable t) {
            Log.e(TAG,"Loi cm m: " + t.getMessage());
            }
        });

    }


}
