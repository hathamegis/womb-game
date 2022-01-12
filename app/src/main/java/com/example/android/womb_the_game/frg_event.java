package com.example.android.womb_the_game;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import static android.app.Activity.RESULT_OK;

public class frg_event extends Fragment{


    private ImageButton current_event;
    private ImageView full;
    MediaPlayer mp;



      @Nullable
    @Override
      public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          super.onCreateView(inflater, container, savedInstanceState);

          View rootView = inflater.inflate(R.layout.fragment_frg_event, container, false);
          current_event = (ImageButton) rootView.findViewById(R.id.current_event);
          full = (ImageView) rootView.findViewById(R.id.full);

          Bundle bundle = getActivity().getIntent().getExtras();

          if (bundle != null & getActivity().getIntent().hasExtra("frg_event")) {
              int resid = bundle.getInt("frg_event");
              current_event.setImageResource(resid);
          }

          if (bundle != null & getActivity().getIntent().hasExtra("story")) {
              final int resid1 = bundle.getInt("story");

   //       if (bundle != null & getActivity().getIntent().hasExtra("voice")) {
     //         final int voice = bundle.getInt("voice");
       //       mp = MediaPlayer.create(getActivity(), voice);





                  current_event.setOnTouchListener(new View.OnTouchListener() {
                      public boolean onTouch(View v, MotionEvent event) {

                          switch (event.getAction()) {
                              case MotionEvent.ACTION_DOWN:


                                  full.setImageResource(resid1);
                                  return true;
                              // if you want to handle the touch frg_event
                              case MotionEvent.ACTION_UP:
                                  full.setImageResource(android.R.color.transparent);


                                  // RELEASED
                                  return true;
                          }
                          return false;
                      }
                  });


                  //          current_event.setOnClickListener(new View.OnClickListener() {
                  //            public void onClick(View v) {
                  //              mp.start();
                  //      }
                  //    });


              }
    //      }
          return rootView;
      }}




