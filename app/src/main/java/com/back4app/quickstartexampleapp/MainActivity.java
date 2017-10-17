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

        Parse.initialize(this);

        //The following lines create a test class to check your app's connection
        ParseObject b4atestClass = new ParseObject("b4atestClass");
        b4atestClass.put("TestColumn1", "Line1");
        b4atestClass.put("TestColumn2", "Line2");
        b4atestClass.put("TestColumn3", "Line3");
        b4atestClass.put("TestColumn4", "Line4");
        b4atestClass.saveInBackground();

    }

}
