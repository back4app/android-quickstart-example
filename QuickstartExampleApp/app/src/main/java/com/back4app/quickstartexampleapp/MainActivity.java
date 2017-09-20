package com.back4app.quickstartexampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8cQOhBQXiYrv5cnxVqRbUBJ53KfDIqHojw3U1N7s") //PASTE YOUR Back4App APPLICATION ID
                .clientKey("Dt0cVr0m9TD5MY3CC85JrnwmP33fJUJI90lM6Jny") //PASTE YOUR CLIENT KEY
                .server("https://parseapi.back4app.com/").build()
        );
    }
}
