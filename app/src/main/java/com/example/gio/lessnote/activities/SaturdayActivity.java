package com.example.gio.lessnote.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gio.lessnote.R;

public class SaturdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday);

        Intent returnIntent = new Intent();
        setResult(MainActivity.SATURDAY_REQUEST, returnIntent);

    }
}
