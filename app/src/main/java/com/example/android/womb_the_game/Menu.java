package com.example.android.womb_the_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    ImageButton to_start;
    ImageButton to_load;
    ImageButton to_setup;
    ImageButton to_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu);

        //ide az initek

        to_start = (ImageButton) findViewById(R.id.to_start);
        to_load = (ImageButton) findViewById(R.id.to_load);
        to_setup = (ImageButton) findViewById(R.id.to_setup);
        to_help = (ImageButton) findViewById(R.id.to_help);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        to_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Circulation.class);
                intent.putExtra("position2", 1);
                startActivity(intent);
                onStartNewActivity();
            }
        });

        to_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Load.class);
                startActivity(intent);
                onStartNewActivity();
            }
        });

        to_setup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Rules.class);
                intent.putExtra("resid100", 100);
                startActivity(intent);
                onStartNewActivity();
            }
        });

        to_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Help.class);
                startActivity(intent);
                onStartNewActivity();
            }
        });
    }
    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out );
    }
}
