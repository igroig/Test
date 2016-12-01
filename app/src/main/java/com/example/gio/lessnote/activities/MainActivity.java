package com.example.gio.lessnote.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.gio.lessnote.LanguagesFragment;
import com.example.gio.lessnote.R;
import com.example.gio.lessnote.application.LessNoteApplication;
import com.example.gio.lessnote.helpers.MyConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Animation.AnimationListener {

    public static final int MONDEY_REQUEST = 1;
    public static final int TUESTDAY_REQUEST = 2;
    public static final int WEDNESDAY_REQUEST = 3;
    public static final int THURSDAY_REQUEST = 4;
    public static final int FRIDAY_REQUEST = 5;
    public static final int SATURDAY_REQUEST = 6;
    public static final int SUNDAY_REQUEST = 7;

    private Button btnMonday;
    private ImageView ivMonday;
    private RelativeLayout rlMonday;
    private Button btnTuesday;
    private ImageView ivTuesday;
    private RelativeLayout rlTuesday;
    private Button btnWednesday;
    private ImageView ivWednesday;
    private RelativeLayout rlWednesday;
    private Button btnThursday;
    private ImageView ivThursday;
    private RelativeLayout rlThursday;
    private Button btnFriday;
    private ImageView ivFriday;
    private RelativeLayout rlFriday;
    private Button btnSaturday;
    private ImageView ivSaturday;
    private RelativeLayout rlSaturday;
    private Button btnSunday;
    private ImageView ivSunday;
    private RelativeLayout rlSunday;
    private LinearLayout activity_main;

    Animation slide_up2;
    Animation slide_up3;
    Animation slide_up4;
    Animation slide_up5;
    Animation slide_up6;
    Animation slide_up7;

    Animation fadeOut;
    Animation fadeIn;

    Animation fadeOutIternal; //        ????????????????????????????????????????????????????????????????????????????????

    LanguagesFragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        checkAppFirstStart();
    }

    //=========================================================================

    private void checkAppFirstStart() {

        if (LessNoteApplication.getInstce().getSharedBoolean(MyConstants.NOT_FIRST_START)==false) {
            showFragment();
            LessNoteApplication.getInstce().setSharedBoolean(MyConstants.NOT_FIRST_START, true);
        }
    }

    private void showFragment() {
        fragment = new LanguagesFragment();
        getSupportFragmentManager().beginTransaction().addToBackStack(null).setCustomAnimations(R.anim.slide_up_dialog,0, 0, R.anim.slide_down_dialog)
                .replace(R.id.fLanguages, fragment).commit();
        activity_main.setAnimation(fadeOutIternal);

    }

    //=========================================================================

    private void initView() {
        btnMonday = (Button) findViewById(R.id.btnMonday);
        ivMonday = (ImageView) findViewById(R.id.ivMonday);
        rlMonday = (RelativeLayout) findViewById(R.id.rlMonday);
        btnTuesday = (Button) findViewById(R.id.btnTuesday);
        ivTuesday = (ImageView) findViewById(R.id.ivTuesday);
        rlTuesday = (RelativeLayout) findViewById(R.id.rlTuesday);
        btnWednesday = (Button) findViewById(R.id.btnWednesday);
        ivWednesday = (ImageView) findViewById(R.id.ivWednesday);
        rlWednesday = (RelativeLayout) findViewById(R.id.rlWednesday);
        btnThursday = (Button) findViewById(R.id.btnThursday);
        ivThursday = (ImageView) findViewById(R.id.ivThursday);
        rlThursday = (RelativeLayout) findViewById(R.id.rlThursday);
        btnFriday = (Button) findViewById(R.id.btnFriday);
        ivFriday = (ImageView) findViewById(R.id.ivFriday);
        rlFriday = (RelativeLayout) findViewById(R.id.rlFriday);
        btnSaturday = (Button) findViewById(R.id.btnSaturday);
        ivSaturday = (ImageView) findViewById(R.id.ivSaturday);
        rlSaturday = (RelativeLayout) findViewById(R.id.rlSaturday);
        btnSunday = (Button) findViewById(R.id.btnSunday);
        ivSunday = (ImageView) findViewById(R.id.ivSunday);
        rlSunday = (RelativeLayout) findViewById(R.id.rlSunday);
        activity_main = (LinearLayout) findViewById(R.id.activity_main);

        fadeOut = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);

        fadeOutIternal = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out_iternal);  //  ????????????????????????????????????


        btnMonday.setOnClickListener(this);
        btnTuesday.setOnClickListener(this);
        btnWednesday.setOnClickListener(this);
        btnThursday.setOnClickListener(this);
        btnFriday.setOnClickListener(this);
        btnSaturday.setOnClickListener(this);
        btnSunday.setOnClickListener(this);
    }

    //=========================================================================

    //=========================================================================

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMonday:
                Intent i = new Intent(MainActivity.this, MondayActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivityForResult(i, MONDEY_REQUEST);

                break;
            case R.id.btnTuesday:
                slide_up2 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up2);
                slide_up2.setAnimationListener(this);

                rlSunday.startAnimation(fadeOut);
                rlSaturday.startAnimation(fadeOut);
                rlFriday.startAnimation(fadeOut);
                rlThursday.startAnimation(fadeOut);
                rlWednesday.startAnimation(fadeOut);
                rlMonday.startAnimation(fadeOut);

                rlTuesday.startAnimation(slide_up2);

                break;
            case R.id.btnWednesday:
                slide_up3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up3);
                slide_up3.setAnimationListener(this);

                rlSunday.startAnimation(fadeOut);
                rlSaturday.startAnimation(fadeOut);
                rlFriday.startAnimation(fadeOut);
                rlThursday.startAnimation(fadeOut);
                rlTuesday.startAnimation(fadeOut);
                rlMonday.startAnimation(fadeOut);

                rlWednesday.startAnimation(slide_up3);

                break;
            case R.id.btnThursday:
                slide_up4 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up4);
                slide_up4.setAnimationListener(this);

                rlSunday.startAnimation(fadeOut);
                rlSaturday.startAnimation(fadeOut);
                rlFriday.startAnimation(fadeOut);
                rlWednesday.startAnimation(fadeOut);
                rlTuesday.startAnimation(fadeOut);
                rlMonday.startAnimation(fadeOut);

                rlThursday.startAnimation(slide_up4);

                break;
            case R.id.btnFriday:
                slide_up5 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up5);
                slide_up5.setAnimationListener(this);

                rlSunday.startAnimation(fadeOut);
                rlSaturday.startAnimation(fadeOut);
                rlThursday.startAnimation(fadeOut);
                rlWednesday.startAnimation(fadeOut);
                rlTuesday.startAnimation(fadeOut);
                rlMonday.startAnimation(fadeOut);

                rlFriday.startAnimation(slide_up5);

                break;
            case R.id.btnSaturday:
                slide_up6 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up6);
                slide_up6.setAnimationListener(this);

                rlSunday.startAnimation(fadeOut);
                rlFriday.startAnimation(fadeOut);
                rlThursday.startAnimation(fadeOut);
                rlWednesday.startAnimation(fadeOut);
                rlTuesday.startAnimation(fadeOut);
                rlMonday.startAnimation(fadeOut);

                rlSaturday.startAnimation(slide_up6);

                break;
            case R.id.btnSunday:

                slide_up7 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_up7);
                slide_up7.setAnimationListener(this);

                rlSaturday.startAnimation(fadeOut);
                rlFriday.startAnimation(fadeOut);
                rlThursday.startAnimation(fadeOut);
                rlWednesday.startAnimation(fadeOut);
                rlTuesday.startAnimation(fadeOut);
                rlMonday.startAnimation(fadeOut);

                rlSunday.startAnimation(slide_up7);

                break;
        }
    }

    //=========================================================================

    //=========================================================================

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == SUNDAY_REQUEST) {
            rlSaturday.startAnimation(fadeIn);
            rlFriday.startAnimation(fadeIn);
            rlThursday.startAnimation(fadeIn);
            rlWednesday.startAnimation(fadeIn);
            rlTuesday.startAnimation(fadeIn);
            rlMonday.startAnimation(fadeIn);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down7);
            rlSunday.startAnimation(animation);
        } else if (requestCode == SATURDAY_REQUEST) {
            rlSunday.startAnimation(fadeIn);
            rlFriday.startAnimation(fadeIn);
            rlThursday.startAnimation(fadeIn);
            rlWednesday.startAnimation(fadeIn);
            rlTuesday.startAnimation(fadeIn);
            rlMonday.startAnimation(fadeIn);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down6);
            rlSaturday.startAnimation(animation);
        } else if (requestCode == FRIDAY_REQUEST) {
            rlSunday.startAnimation(fadeIn);
            rlSaturday.startAnimation(fadeIn);
            rlThursday.startAnimation(fadeIn);
            rlWednesday.startAnimation(fadeIn);
            rlTuesday.startAnimation(fadeIn);
            rlMonday.startAnimation(fadeIn);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down5);
            rlFriday.startAnimation(animation);
        } else if (requestCode == THURSDAY_REQUEST) {
            rlSunday.startAnimation(fadeIn);
            rlSaturday.startAnimation(fadeIn);
            rlFriday.startAnimation(fadeIn);
            rlWednesday.startAnimation(fadeIn);
            rlTuesday.startAnimation(fadeIn);
            rlMonday.startAnimation(fadeIn);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down4);
            rlThursday.startAnimation(animation);
        } else if (requestCode == WEDNESDAY_REQUEST) {
            rlSunday.startAnimation(fadeIn);
            rlSaturday.startAnimation(fadeIn);
            rlFriday.startAnimation(fadeIn);
            rlThursday.startAnimation(fadeIn);
            rlTuesday.startAnimation(fadeIn);
            rlMonday.startAnimation(fadeIn);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down3);
            rlWednesday.startAnimation(animation);
        } else if (requestCode == TUESTDAY_REQUEST) {
            rlSunday.startAnimation(fadeIn);
            rlSaturday.startAnimation(fadeIn);
            rlFriday.startAnimation(fadeIn);
            rlThursday.startAnimation(fadeIn);
            rlWednesday.startAnimation(fadeIn);
            rlMonday.startAnimation(fadeIn);

            Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide_down2);
            rlTuesday.startAnimation(animation);
        } else {

        }
    }

    //=========================================================================

    //=========================================================================

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        // formatt need

        if (animation.equals(slide_up7)) {
            Intent i = new Intent(MainActivity.this, SundayActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivityForResult(i, SUNDAY_REQUEST);
        } else if (animation.equals(slide_up6)) {
            Intent i = new Intent(MainActivity.this, SaturdayActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivityForResult(i, SATURDAY_REQUEST);
        } else if (animation.equals(slide_up5)) {
            Intent i = new Intent(MainActivity.this, FridayActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivityForResult(i, FRIDAY_REQUEST);
        } else if (animation.equals(slide_up4)) {
            Intent i = new Intent(MainActivity.this, ThursdayActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivityForResult(i, THURSDAY_REQUEST);
        } else if (animation.equals(slide_up3)) {
            Intent i = new Intent(MainActivity.this, WednesdayActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivityForResult(i, WEDNESDAY_REQUEST);
        } else if (animation.equals(slide_up2)) {
            Intent i = new Intent(MainActivity.this, TuesdayActivity.class);
            i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
            startActivityForResult(i, TUESTDAY_REQUEST);
        }
// else {
//            Intent i = new Intent(MainActivity.this, TuesdatActivity.class);
//            startActivityForResult(i, MONDEY_REQUEST);
//        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    //=========================================================================

    public void chooseLanguage(View view){
        showFragment();
    }


}
