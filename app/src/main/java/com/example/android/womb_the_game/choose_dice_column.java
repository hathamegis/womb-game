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


public class choose_dice_column extends FragmentActivity {



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

        setContentView(R.layout.activity_choose_dice_column);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n11);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);

                startActivity(i);
            }

        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n12);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n13);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n14);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n15);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n16);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n17);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n18);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n19);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choose_dice_column.this, Circulation.class);
                i.putExtra("resid1",R.drawable.n110);
                i.putExtra("resid2",R.drawable.n0);
                i.putExtra("position", 3);
                startActivity(i);
            }

        });



    }

}
