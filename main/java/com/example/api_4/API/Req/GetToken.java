package com.example.api_4.API.Req;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class GetToken implements Serializable {
        @SerializedName("username")
        public String username ;
   @SerializedName("password")
        public String password ;
   @SerializedName("request_token")
        public String request_token ;

    public GetToken(String username, String password, String request_token) {
        this.username = username;
        this.password = password;
        this.request_token = request_token;
    }

    @Override
    public String toString() {
        return "GetToken{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", request_token='" + request_token + '\'' +
                '}';
    }
}
