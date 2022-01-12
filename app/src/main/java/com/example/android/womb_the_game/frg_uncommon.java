package com.example.android.womb_the_game;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;


public class frg_uncommon extends Fragment {

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
    private ImageView full;
    private ImageButton vanish;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_frg_uncommon, container, false);


        b1 = (ImageButton) rootView.findViewById(R.id.b1);
        b2 = (ImageButton) rootView.findViewById(R.id.b2);
        b3 = (ImageButton) rootView.findViewById(R.id.b3);
        b4 = (ImageButton) rootView.findViewById(R.id.b4);
        b5 = (ImageButton) rootView.findViewById(R.id.b5);
        b6 = (ImageButton) rootView.findViewById(R.id.b6);
        b7 = (ImageButton) rootView.findViewById(R.id.b7);
        b8 = (ImageButton) rootView.findViewById(R.id.b8);
        b9 = (ImageButton) rootView.findViewById(R.id.b9);
        b10 = (ImageButton) rootView.findViewById(R.id.b10);
        b11 = (ImageButton) rootView.findViewById(R.id.b11);
        full = (ImageView) rootView.findViewById(R.id.full);
        vanish = (ImageButton) rootView.findViewById(R.id.vanish);

        vanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vanish.setVisibility(View.GONE);
            }
        });




        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item1);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item2);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item3);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item4);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item5);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item6);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item7);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item8);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item9);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item10);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        b11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        full.setImageResource(R.drawable.item11);
                        return true;
                    // if you want to handle the touch frg_event
                    case MotionEvent.ACTION_UP:
                        full.setImageResource(android.R.color.transparent);



                        // RELEASED
                        return true;
                }
                return false;}
        });

        return rootView;

//        b16.setOnClickListener(new View.OnClickListener() {
        //         @Override
        //       public void onClick(View view) {
        //              Intent i = new Intent(Cabin_selection.this, Circulation.class);
        //            i.putExtra("resid",R.drawable.c16);
        //          i.putExtra("position2", 2);
        //        startActivity(i);
        //  }

        // });
        //       b16.setOnLongClickListener(new View.OnLongClickListener() {
        //         @Override
        //       public boolean onLongClick(View v) {
        //         Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
        //       i.putExtra("diser1",R.drawable.ak1);
        //     i.putExtra("diser2",R.drawable.ak2);
        //   i.putExtra("diser3",R.drawable.ak3);
        // startActivity(i);
        //return true;
        //}
        //});

        //visszacsatolós működő:

        //  Bundle bundle = getIntent().getExtras();
        //if(bundle!=null) {
        //  int resid1 = bundle.getInt("resid1");
        //im2.setImageResource(resid1);}
        //ide a visszautalasokat!

        //ez nem működik
        //Bundle b1=new Bundle();
        //b1.putInt("diser1", R.drawable.c1);
        //set Fragmentclass Arguments
        //lvl1_Fragment fragobj=new lvl1_Fragment();
        // fragobj.setArguments(b1);




    }
}
