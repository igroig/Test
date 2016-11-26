package com.example.gio.lessnote.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gio.lessnote.R;

public class WednesdayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);

        Intent returnIntent = new Intent();
        setResult(MainActivity.WEDNESDAY_REQUEST, returnIntent);

    }
}
