package com.example.android.womb_the_game;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.tomer.fadingtextview.FadingTextView;


public class Inter extends AppCompatActivity {

    private ImageButton back;
    private FadingTextView fadingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_inter);
        back = (ImageButton) findViewById(R.id.back);
        fadingTextView = findViewById(R.id.fading_text_view_event);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                back.performClick();
            }
        }, 3000);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null & getIntent().hasExtra("j1")) {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inter.this, Circulation.class);
                intent.putExtra("e1", 1);
                intent.putExtra("position2", 1);
                intent.putExtra("frg_event", R.drawable.e1);
       //         intent.putExtra("voice", R.raw.kirakomini);
                intent.putExtra("story", R.drawable.st1);

                startActivity(intent);
                onStartNewActivity();

            }

        }); }

        else if (bundle != null & getIntent().hasExtra("j2")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e2", 2);
                    intent.putExtra("frg_event", R.drawable.e2);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st2);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j3")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e3", 3);
                    intent.putExtra("frg_event", R.drawable.e3);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j4")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e4", 4);
                    intent.putExtra("frg_event", R.drawable.e4);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st3);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j5")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e5", 5);
                    intent.putExtra("frg_event", R.drawable.e5);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j6")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e6", 6);
                    intent.putExtra("frg_event", R.drawable.e6);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st4);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j7")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e7", 7);
                    intent.putExtra("frg_event", R.drawable.e7);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j8")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e8", 8);
                    intent.putExtra("frg_event", R.drawable.e8);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st5);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j9")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e9", 9);
                    intent.putExtra("frg_event", R.drawable.e9);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j10")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e10", 10);
                    intent.putExtra("frg_event", R.drawable.e10);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st6);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j11")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e11", 11);
                    intent.putExtra("frg_event", R.drawable.e11);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j12")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e12", 12);
                    intent.putExtra("frg_event", R.drawable.e12);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st7);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("13")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e13", 13);
                    intent.putExtra("frg_event", R.drawable.e13);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j14")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e14", 14);
                    intent.putExtra("frg_event", R.drawable.e14);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st8);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j15")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e15", 15);
                    intent.putExtra("frg_event", R.drawable.e15);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j16")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e16", 16);
                    intent.putExtra("frg_event", R.drawable.e16);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st9);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j17")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e17", 17);
                    intent.putExtra("frg_event", R.drawable.e17);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j18")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e18", 18);
                    intent.putExtra("frg_event", R.drawable.e18);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st10);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j19")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e19", 19);
                    intent.putExtra("frg_event", R.drawable.e19);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j20")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e20", 20);
                    intent.putExtra("frg_event", R.drawable.e20);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st11);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j21")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e21", 21);
                    intent.putExtra("frg_event", R.drawable.e21);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st12);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j22")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e22", 22);
                    intent.putExtra("frg_event", R.drawable.e22);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j23")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e23", 23);
                    intent.putExtra("frg_event", R.drawable.e23);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    intent.putExtra("story", R.drawable.st13);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else if (bundle != null & getIntent().hasExtra("j24")){
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Inter.this, Circulation.class);
                    intent.putExtra("e24", 24);
                    intent.putExtra("frg_event", R.drawable.e24);
                    //innentől folyt "frg_event"eket berakni
                    intent.putExtra("position2", 1);
                    startActivity(intent);
                    onStartNewActivity();
                }

            });}

        else{
            back.setImageResource(R.drawable.e00);

        }

}
    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out );
    }
}

