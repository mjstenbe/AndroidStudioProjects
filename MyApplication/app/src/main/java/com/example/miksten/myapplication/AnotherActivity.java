package com.example.miksten.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.i("TAG", "Ollaan tokassa ikkunassa - onCreate() metodissa");
    }

    public void klikkaus(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        Log.i("TAG", "Ollaan tokassa ikkunassa - klikkaus () metodissa");
        startActivity(intent);
        finish();
    }
}

