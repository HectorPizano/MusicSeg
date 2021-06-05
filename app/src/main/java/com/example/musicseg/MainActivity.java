package com.example.musicseg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void play(View v){
        Intent intent= new Intent(this, Myservice.class);
        startService(intent);
    }


    public void stop(View v){
        Intent intent= new Intent(this, Myservice.class);
        stopService(intent);
    }





}