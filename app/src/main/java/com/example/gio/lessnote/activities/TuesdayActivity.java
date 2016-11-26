package com.example.gio.lessnote.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gio.lessnote.R;

public class TuesdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);

        Intent returnIntent = new Intent();
        setResult(MainActivity.TUESTDAY_REQUEST, returnIntent);

    }
}
