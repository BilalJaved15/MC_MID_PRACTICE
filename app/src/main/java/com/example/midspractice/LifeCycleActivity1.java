package com.example.midspractice;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LifeCycleActivity1 extends AppCompatActivity {

    Button btnNext;
    Button btnDialog;
    Button btnToast;
    String[] colors = {"RED", "GREEN", "BLUE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle1);
        Log.d(TAG, "onCreate LifeCycleActivity1");
        btnNext = findViewById(R.id.btnSecondActivity);
        btnDialog = findViewById(R.id.btnDialog);
        btnToast = findViewById(R.id.btnToast);
        btnNext.setOnClickListener(v -> startActivity(new Intent(this, LifeCycleActivity2.class)));
        btnDialog.setOnClickListener(v -> {
            /*AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("YOU CLICKED ME!")
                    //.setMessage("MESSAGE!")
                    .setCancelable(false)
                    .setIcon(R.drawable.ic_baseline_delete_24)
                    .setMultiChoiceItems(colors, null, new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            if (isChecked){
                                Toast.makeText(getApplicationContext(), colors[which], Toast.LENGTH_LONG).show();
                            }
                        }
                    })
                    .setPositiveButton("CANCEL!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .setNegativeButton("CANCEL!", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which){
                            dialogInterface.dismiss();
                        }
                    })
                    .setNeutralButton("CANCEL!", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                            dialog.dismiss();
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();*/
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            LayoutInflater inflater = getLayoutInflater();
            View myDialog = inflater.inflate(R.layout.custom_dialog, (ViewGroup) findViewById(R.id.customDialogRoot));
            builder.setTitle("LOGIN!")
                    .setView(myDialog)
                    .setPositiveButton("Login", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Login Cancelled", Toast.LENGTH_SHORT).show();
                        }
                    }).show();
        });
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View customToast = inflater.inflate(R.layout.new_custom_toast, (ViewGroup) findViewById(R.id.new_toast_root));
                ((ImageView) customToast.findViewById(R.id.newToastIcon)).setImageDrawable(getResources().getDrawable(R.drawable.ic_baseline_delete_24));
                ((TextView) customToast.findViewById(R.id.newToastText)).setText("CUSTOM TOAST BRO FULL BRO FULL BRO");
                Toast toast = new Toast(getApplicationContext());
                toast.setView(customToast);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER | Gravity.RIGHT, 100, 200);
                toast.show();
            }


        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart LifeCycleActivity1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume LifeCycleActivity1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause LifeCycleActivity1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop LifeCycleActivity1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy LifeCycleActivity1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart LifeCycleActivity1");
    }

}