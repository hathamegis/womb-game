package com.example.android.womb_the_game;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;


public class Circulation extends FragmentActivity {


    ViewPager vp;
    public static FragmentPagerAdapter adapterViewPager;
    public int extrasPosition;



    @Override
    protected void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_circulation);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    //    Fragment Frg3 = new Frg3();
  //      Frg3.setArguments( getIntent().getExtras() );



        Intent intent = getIntent();


        if(intent == null) {
            extrasPosition = 0;
        }

        else if (getIntent().hasExtra("position")) {
            extrasPosition = intent.getIntExtra("position", 0);


        }
        else if (getIntent().hasExtra("position2")) {
            extrasPosition = intent.getIntExtra("position2", 0);

        }



        vp = findViewById(R.id.view_pager);
        adapterViewPager=new Adapter_Circulation(getSupportFragmentManager(), this);
        vp.setAdapter(adapterViewPager);
        vp.setCurrentItem(extrasPosition);
        vp.setOffscreenPageLimit(4);



        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(vp);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

}