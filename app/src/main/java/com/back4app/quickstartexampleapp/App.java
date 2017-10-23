package com.back4app.quickstartexampleapp;

import com.parse.Parse;
import android.app.Application;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
    }
}