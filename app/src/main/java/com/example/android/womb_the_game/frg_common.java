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


public class frg_common extends Fragment {

    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageView full;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_frg_common, container, false);


        b1 = (ImageButton) rootView.findViewById(R.id.b1);
        b2 = (ImageButton) rootView.findViewById(R.id.b2);
        b3 = (ImageButton) rootView.findViewById(R.id.b3);
        b4 = (ImageButton) rootView.findViewById(R.id.b4);
        b5 = (ImageButton) rootView.findViewById(R.id.b5);
        b6 = (ImageButton) rootView.findViewById(R.id.b6);
        b7 = (ImageButton) rootView.findViewById(R.id.b7);
        b8 = (ImageButton) rootView.findViewById(R.id.b8);
        full = (ImageView) rootView.findViewById(R.id.full);


b1.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch(event.getAction()) {
        case MotionEvent.ACTION_DOWN:
        full.setImageResource(R.drawable.itt1);
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
                        full.setImageResource(R.drawable.itt2);
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
                        full.setImageResource(R.drawable.itt3);
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
                        full.setImageResource(R.drawable.itt4);
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
                        full.setImageResource(R.drawable.itt5);
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
                        full.setImageResource(R.drawable.itt6);
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
                        full.setImageResource(R.drawable.itt7);
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
                        full.setImageResource(R.drawable.itt8);
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
