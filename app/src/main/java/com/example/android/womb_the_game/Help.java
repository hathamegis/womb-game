package com.example.android.womb_the_game;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Help extends AppCompatActivity {



    ViewPager vp;
//    ImageButton helpback;
    adapter_help myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_help);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);



        myAdapter = new adapter_help(this);

  //      helpback = (ImageButton)findViewById(R.id.helpback);
        vp = (ViewPager)findViewById(R.id.help_ViewPager);
        vp.setAdapter(myAdapter);
        vp.setCurrentItem(0);

  //      helpback.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
    //            Intent intent = new Intent(Help.this, Menu.class);
      //          startActivity(intent);
        //        onStartNewActivity();
   //         }
     //   });
    }
  //  protected void onStartNewActivity() {
    //    overridePendingTransition(R.anim.fade_in, R.anim.fade_out );
    //}
  @Override
  protected void onDestroy() {
      super.onDestroy();
  }}


