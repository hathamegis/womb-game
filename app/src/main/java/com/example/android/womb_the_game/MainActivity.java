package com.example.android.womb_the_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.tomer.fadingtextview.FadingTextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

 //  Timer timer;
 //   private TextView presents;
    private FadingTextView fadingTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        fadingTextView = findViewById(R.id.fading_text_view);


 //     presents = findViewById(R.id.presents);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.kirakomini);
        mp.start();

        //ide a view_id-k
//        AlphaAnimation fadeIn = new AlphaAnimation(1.0f , 0.0f ) ;
  //      AlphaAnimation fadeOut = new AlphaAnimation( 0.0f , 1.0f ) ;
    //    presents.startAnimation(fadeIn);
      //  presents.startAnimation(fadeOut);
        //fadeIn.setDuration(1200);
        //fadeIn.setFillAfter(true);
        //fadeOut.setDuration(1200);
        //fadeOut.setFillAfter(true);
        //fadeOut.setStartOffset(4200+ fadeIn.getStartOffset());



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Create an intent that will start the main activity.
                Intent mainIntent = new Intent(MainActivity.this, Welcome.class);
                MainActivity.this.startActivity(mainIntent);


                //Finish splash activity so user cant go back to it.
                MainActivity.this.finish();

                //Apply splash exit (fade out) and main entry (fade in) animation transitions.

            }
            // set to 7000!!!
        }, 7000);


 //       timer = new Timer();
   //     timer.schedule(new TimerTask() {
     //       @Override
       //     public void run() {
         //       Intent intent = new Intent(MainActivity.this, Welcome.class);
           //     startActivity(intent);


             //   finish();
            //}
        //}, 5000);





    }
}
