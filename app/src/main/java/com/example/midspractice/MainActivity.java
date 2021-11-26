package com.example.midspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnList = findViewById(R.id.btnList);
        btnList.setOnClickListener(v -> {
            /*Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            startActivity(intent);*/
        });
    }
}