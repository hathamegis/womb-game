package com.example.android.womb_the_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Load extends AppCompatActivity {

    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageButton b9;
    private ImageButton b10;
    private ImageButton b11;
    private ImageButton b12;
    private ImageButton b13;
    private ImageButton b14;
    private ImageButton b15;
    private ImageButton b16;
    private ImageButton b17;
    private ImageButton b18;
    private ImageButton b19;
    private ImageButton b20;
    private ImageButton b21;
    private ImageButton b22;
    private ImageButton b23;
    private ImageButton b24;
    private ImageView full;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_load);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1 = (ImageButton) findViewById(R.id.x1);
        b2 = (ImageButton) findViewById(R.id.x2);
        b3 = (ImageButton) findViewById(R.id.x3);
        b4 = (ImageButton) findViewById(R.id.x4);
        b5 = (ImageButton) findViewById(R.id.x5);
        b6 = (ImageButton) findViewById(R.id.x6);
        b7 = (ImageButton) findViewById(R.id.x7);
        b8 = (ImageButton) findViewById(R.id.x8);
        b9 = (ImageButton) findViewById(R.id.x9);
        b10 = (ImageButton) findViewById(R.id.x10);
        b11 = (ImageButton) findViewById(R.id.x11);
        b12 = (ImageButton) findViewById(R.id.x12);
        b13 = (ImageButton) findViewById(R.id.x13);
        b14 = (ImageButton) findViewById(R.id.x14);
        b15 = (ImageButton) findViewById(R.id.x15);
        b16 = (ImageButton) findViewById(R.id.x16);
        b17 = (ImageButton) findViewById(R.id.x17);
        b18 = (ImageButton) findViewById(R.id.x18);
        b19 = (ImageButton) findViewById(R.id.x19);
        b20 = (ImageButton) findViewById(R.id.x20);
        b21 = (ImageButton) findViewById(R.id.x21);
        b22 = (ImageButton) findViewById(R.id.x22);
        b23 = (ImageButton) findViewById(R.id.x23);
        b24 = (ImageButton) findViewById(R.id.x24);
        full = (ImageView) findViewById(R.id.full);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e1", 1);
                intent.putExtra("position2", 1);
                intent.putExtra("frg_event", R.drawable.e1);
                intent.putExtra("story", R.drawable.st1);
                startActivity(intent);
                onStartNewActivity();
            }

        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e2", 2);
                intent.putExtra("frg_event", R.drawable.e2);
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st2);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e3", 3);
                intent.putExtra("frg_event", R.drawable.e3);
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e4", 4);
                intent.putExtra("frg_event", R.drawable.e4);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st3);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e5", 5);
                intent.putExtra("frg_event", R.drawable.e5);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e6", 6);
                intent.putExtra("frg_event", R.drawable.e6);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st4);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e7", 7);
                intent.putExtra("frg_event", R.drawable.e7);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e8", 8);
                intent.putExtra("frg_event", R.drawable.e8);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st5);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e9", 9);
                intent.putExtra("frg_event", R.drawable.e9);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e10", 10);
                intent.putExtra("frg_event", R.drawable.e10);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st6);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e11", 11);
                intent.putExtra("frg_event", R.drawable.e11);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e12", 12);
                intent.putExtra("frg_event", R.drawable.e12);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st7);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e13", 13);
                intent.putExtra("frg_event", R.drawable.e13);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e14", 14);
                intent.putExtra("frg_event", R.drawable.e14);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st8);
                startActivity(intent);
                onStartNewActivity();
            }

        });


        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e15", 15);
                intent.putExtra("frg_event", R.drawable.e15);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e16", 16);
                intent.putExtra("frg_event", R.drawable.e16);
                intent.putExtra("story", R.drawable.st9);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e17", 17);
                intent.putExtra("frg_event", R.drawable.e17);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e18", 18);
                intent.putExtra("frg_event", R.drawable.e18);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("story", R.drawable.st10);
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e19", 19);
                intent.putExtra("frg_event", R.drawable.e19);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e20", 20);
                intent.putExtra("frg_event", R.drawable.e20);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("story", R.drawable.st11);
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e21", 21);
                intent.putExtra("frg_event", R.drawable.e21);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st12);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e22", 22);
                intent.putExtra("frg_event", R.drawable.e22);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e23", 23);
                intent.putExtra("frg_event", R.drawable.e23);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                intent.putExtra("story", R.drawable.st13);
                startActivity(intent);
                onStartNewActivity();
            }

        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Load.this, Circulation.class);
                intent.putExtra("e24", 24);
                intent.putExtra("frg_event", R.drawable.e24);
                //innentől folyt "frg_event"eket berakni
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }

        });


    }
    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out );
    }
}
