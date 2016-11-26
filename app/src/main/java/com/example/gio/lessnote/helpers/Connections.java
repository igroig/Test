package com.example.gio.lessnote.helpers;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Gio on 10/18/2016.
 */

public class Connections {

    public static void setTvTime(TextView textView, int hours, int minutes){
        if(hours < 12){
            textView.setText(Integer.toString(hours)  + ":" + Integer.toString(minutes) + " AM");
        }
        else {
            textView.setText(Integer.toString(hours - 12)  + ":" + Integer.toString(minutes) + " PM");
        }
    }

}
