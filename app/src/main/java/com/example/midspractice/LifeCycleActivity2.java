package com.example.midspractice;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle2);
        Log.d(TAG, "onCreate LifeCycleActivity2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart LifeCycleActivity2");
    }

    @Override
    protected void onResume() {
        super. onResume();
        Log.d(TAG, "onResume LifeCycleActivity2");
    }

    @Override
    protected void onPause() {
        super. onPause();
        Log.d(TAG, "onPause LifeCycleActivity2");
    }

    @Override
    protected void onStop() {
        super. onStop();
        Log.d(TAG, "onStop LifeCycleActivity2");
    }

    @Override
    protected void onDestroy() {
        super. onDestroy();
        Log.d(TAG, "onDestroy LifeCycleActivity2");
    }

    @Override
    protected void onRestart() {
        super. onRestart();
        Log.d(TAG, "onRestart LifeCycleActivity2");
    }

}