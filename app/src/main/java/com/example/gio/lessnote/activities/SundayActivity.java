package com.example.gio.lessnote.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.gio.lessnote.R;
import com.example.gio.lessnote.activities.MainActivity;

public class SundayActivity extends AppCompatActivity {

    private Button button;
    private RelativeLayout activity_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday);

        Intent returnIntent = new Intent();
        setResult(MainActivity.SUNDAY_REQUEST, returnIntent);


    }





}
