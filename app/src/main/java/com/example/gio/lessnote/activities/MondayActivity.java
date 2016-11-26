package com.example.gio.lessnote.activities;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.gio.lessnote.R;
import com.example.gio.lessnote.helpers.Connections;

public class MondayActivity extends AppCompatActivity {

    TimePicker timePicker1;
    //=========================================================================
    //les1
    final int Dialog_ID_MON1 = 1;
    int monHours1, monMinutes1;
    private TextView tv_time_1;

    //les2
    final int Dialog_ID_MON2 = 2;
    int monHours2, monMinutes2;
    private TextView tv_time_2;

    //les3
    final int Dialog_ID_MON3 = 3;
    int monHours3, monMinutes3;
    private TextView tv_time_3;

    //les4
    final int Dialog_ID_MON4 = 4;
    int monHours4, monMinutes4;
    private TextView tv_time_4;

    //les5
    final int Dialog_ID_MON5 = 5;
    int monHours5, monMinutes5;
    private TextView tv_time_5;

    //les6
    final int Dialog_ID_MON6 = 6;
    int monHours6, monMinutes6;
    private TextView tv_time_6;

    //les7
    final int Dialog_ID_MON7 = 7;
    int monHours7, monMinutes7;
    private TextView tv_time_7;
//=========================================================================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        initView();


    }


    public void timeDialog(View view) {
        switch (view.getId()) {
            case R.id.tv_time_1:
                showDialog(Dialog_ID_MON1);
                break;
            case R.id.tv_time_2:
                showDialog(Dialog_ID_MON2);
                break;
            case R.id.tv_time_3:
                showDialog(Dialog_ID_MON3);
                break;
            case R.id.tv_time_4:
                showDialog(Dialog_ID_MON4);
                break;
            case R.id.tv_time_5:
                showDialog(Dialog_ID_MON5);
                break;
            case R.id.tv_time_6:
                showDialog(Dialog_ID_MON6);
                break;
            case R.id.tv_time_7:
                showDialog(Dialog_ID_MON7);
                break;
        }

    }


    @Override
    protected Dialog onCreateDialog(int id) {

        if (id == Dialog_ID_MON1) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener1, monHours1, monMinutes1, false);
        }

         else if (id == Dialog_ID_MON2) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener2, monHours2, monMinutes2, false);
        }

         else if (id == Dialog_ID_MON3) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener3, monHours3, monMinutes3, false);
        }

         else if (id == Dialog_ID_MON4) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener4, monHours4, monMinutes4, false);
        }

         else if (id == Dialog_ID_MON5) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener5, monHours5, monMinutes5, false);
        }

        else if (id == Dialog_ID_MON6) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener6, monHours6, monMinutes6, false);
        }

        else if (id == Dialog_ID_MON7) {
            return new TimePickerDialog(MondayActivity.this, monTimePickerListener7, monHours7, monMinutes7, false);
        }
        return null;
    }

    //=========================================================================

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener1 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours1 = hourOfDay;
            monMinutes1 = minute;

            Connections.setTvTime(tv_time_1, monHours1, monMinutes1);
        }
    };

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener2 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours2 = hourOfDay;
            monMinutes2 = minute;

            Connections.setTvTime(tv_time_2, monHours2, monMinutes2);
        }
    };

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener3 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours3 = hourOfDay;
            monMinutes3 = minute;

            Connections.setTvTime(tv_time_3, monHours3, monMinutes3);
        }
    };

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener4 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours4 = hourOfDay;
            monMinutes4 = minute;

            Connections.setTvTime(tv_time_4, monHours4, monMinutes4);
        }
    };

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener5 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours5 = hourOfDay;
            monMinutes5 = minute;

            Connections.setTvTime(tv_time_5, monHours5, monMinutes5);
        }
    };

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener6 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours6 = hourOfDay;
            monMinutes6 = minute;

            Connections.setTvTime(tv_time_6, monHours6, monMinutes6);
        }
    };

    protected TimePickerDialog.OnTimeSetListener monTimePickerListener7 = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            monHours7 = hourOfDay;
            monMinutes7 = minute;

            Connections.setTvTime(tv_time_7, monHours7, monMinutes7);
        }
    };

    //=========================================================================

    private void initView() {
        tv_time_1 = (TextView) findViewById(R.id.tv_time_1);
        tv_time_2 = (TextView) findViewById(R.id.tv_time_2);
        tv_time_3 = (TextView) findViewById(R.id.tv_time_3);
        tv_time_4 = (TextView) findViewById(R.id.tv_time_4);
        tv_time_5 = (TextView) findViewById(R.id.tv_time_5);
        tv_time_6 = (TextView) findViewById(R.id.tv_time_6);
        tv_time_7 = (TextView) findViewById(R.id.tv_time_7);
    }
}
