package com.example.midspractice;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter {
    public final Activity context;
    public final ArrayList<String> rolls;

    CustomArrayAdapter(Activity context, ArrayList<String> rolls){
        super(context, R.layout.customized_list_view, rolls);
        this.context = context;
        this.rolls = rolls;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View singleEntityView = inflater.inflate(R.layout.customized_list_view, null, true);
        TextView textView = singleEntityView.findViewById(R.id.listItemText);
        textView.setText(rolls.get(position));
        singleEntityView.setClickable(true);
        ImageButton btn = singleEntityView.findViewById(R.id.listItemBtn);
        btn.setImageResource(R.drawable.ic_baseline_delete_24);
        btn.setOnClickListener(v->{
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Delete Item")
                    .setIcon(R.drawable.ic_baseline_delete_24)
                    .setMessage("Are you sure you want to delete?")
                    .setCancelable(false)
                    .setPositiveButton("Delete", (dialog, which) -> {
                        rolls.remove(position);
                        CustomArrayAdapter.this.notifyDataSetChanged();
                    })
                    .setNegativeButton("Cancel", (dialog, which) -> {
                        dialog.dismiss();
                    }).show();
        });
        singleEntityView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ListItemFocus.class);
            intent.putExtra("roll", rolls.get(position));
            context.startActivity(intent);
        });
        singleEntityView.setOnLongClickListener(v -> {
            Toast.makeText(context, "This is a long click", Toast.LENGTH_LONG).show();
            return false;
        });
        return singleEntityView;
    }
}
