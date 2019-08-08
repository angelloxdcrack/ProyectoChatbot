package com.example.aplicacionchatbot;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

public class Chatbotapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
    }
}
