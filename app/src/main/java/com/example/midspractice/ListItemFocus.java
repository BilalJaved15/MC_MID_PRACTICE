package com.example.midspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ListItemFocus extends AppCompatActivity {

    TextView listItemFocusText;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_focus);

        intent = getIntent();
        String roll = intent.getStringExtra("roll");
        listItemFocusText = findViewById(R.id.listItemFocusText);
        listItemFocusText.setText(roll);
    }
}