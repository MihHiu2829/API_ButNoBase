package com.example.api_4.API.Res;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AuthRes implements Serializable {
    @SerializedName("success")
     public  boolean success ;
    @SerializedName("expires_at")
    public String expires_at ;
    @SerializedName("request_token")
    public String request_token ;


    @Override
    public String toString() {
        return "AuthRes{" +
                "success=" + success +
                ", expires_at='" + expires_at + '\'' +
                ", request_token='" + request_token + '\'' +
                '}';
    }
}
