package com.example.midspractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;
    CustomArrayAdapter arrayAdapter;
    ArrayList<String> rolls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        rolls = new ArrayList<>();
        rolls.add("BCSF18M001");
        rolls.add("BCSF18M002");
        rolls.add("BCSF18M003");
        rolls.add("BCSF18M004");
        rolls.add("BCSF18M005");
        rolls.add("BCSF18M006");
        rolls.add("BCSF18M007");
        rolls.add("BCSF18M008");
        rolls.add("BCSF18M009");
        rolls.add("BCSF18M0010");
        listView = findViewById(R.id.listView);
        arrayAdapter = new CustomArrayAdapter(this, rolls);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(ListViewActivity.this, ListItemFocus.class);
            intent.putExtra("roll", rolls.get(position));
            startActivity(intent);
        });
    }
}