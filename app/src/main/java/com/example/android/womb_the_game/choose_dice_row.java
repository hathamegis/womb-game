package com.example.android.womb_the_game;


import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;


public class choose_dice_row extends FragmentActivity {



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






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_choose_dice_row);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1 = (ImageButton) findViewById(R.id.bu1);
        b2 = (ImageButton) findViewById(R.id.bu2);
        b3 = (ImageButton) findViewById(R.id.bu3);
        b4 = (ImageButton) findViewById(R.id.bu4);
        b5 = (ImageButton) findViewById(R.id.bu5);
        b6 = (ImageButton) findViewById(R.id.bu6);
        b7 = (ImageButton) findViewById(R.id.bu7);
        b8 = (ImageButton) findViewById(R.id.bu8);
        b9 = (ImageButton) findViewById(R.id.bu9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.bu11);
        b12 = (ImageButton) findViewById(R.id.b12);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l11);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);

                startActivity(i);
            }

        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l12);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l13);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l14);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l15);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l16);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l17);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l18);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l19);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_row.this, Circulation.class);
                i.putExtra("resid2",R.drawable.l110);
                i.putExtra("resid1",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });



    }

}
