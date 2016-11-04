package com.example.miksten.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TAG", "Ollaan ekassa ikkunassa - onCreate() metodissa");
    }


    public void klikkaus(View v) {
        Intent intent = new Intent(this,AnotherActivity.class);
        Log.i("TAG", "Ollaan ekassa ikkunassa - klikkaus metodissa");
        startActivity(intent);
        finish();
    }

}