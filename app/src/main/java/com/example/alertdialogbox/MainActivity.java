package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Single button
//        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
//        alertDialog.setTitle("Delete");
//        alertDialog.setIcon(R.drawable.baseline_delete_24);
//        alertDialog.setMessage("Are you sure to delete");
//
//        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "Hii Android", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        alertDialog.show();

//        2 and 3 button
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        builder.setTitle("Delete");
//        builder.setIcon(R.drawable.baseline_delete_24);
//        builder.setMessage("Are you sure to delete");
//
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        builder.show();

//        Custom AlertBox
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.custom_box);
        dialog.show();

    }
}