package com.example.android.womb_the_game;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Frg0 extends Fragment{

    private ImageButton ru1;
    private ImageButton ru2;
    private ImageButton ru3;
    private ImageButton ru4;
    private ImageButton ru5;
    private ImageButton ru6;
    private ImageButton ru7;
    private ImageButton ru8;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_frg0, container, false);

        ru1 = (ImageButton) rootView.findViewById(R.id.ru1);
        ru2 = (ImageButton) rootView.findViewById(R.id.ru2);
        ru3 = (ImageButton) rootView.findViewById(R.id.ru3);
        ru4 = (ImageButton) rootView.findViewById(R.id.ru4);
        ru5 = (ImageButton) rootView.findViewById(R.id.ru5);
        ru6 = (ImageButton) rootView.findViewById(R.id.ru6);
        ru7 = (ImageButton) rootView.findViewById(R.id.ru7);
        ru8 = (ImageButton) rootView.findViewById(R.id.ru8);


       ru1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(getActivity(), Rules.class);
              intent.putExtra("resid10", 1);

             startActivity(intent);

            }

       });

        ru1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(getActivity(), Rules.class);
                i.putExtra("resid10.2", 1);
                startActivity(i);
                return true;
            }
        });


        ru2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid11", 2);

                startActivity(intent);

            }

        });

        ru2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(getActivity(), Rules.class);
                i.putExtra("resid11.2", 2);
                startActivity(i);
                return true;
            }
        });

        ru3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid12", 3);

                startActivity(intent);

            }

        });

        ru3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(getActivity(), Rules.class);
                i.putExtra("resid12.2", 3);
                startActivity(i);
                return true;
            }
        });

        ru4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid13", 4);

                startActivity(intent);

            }

        });

        ru4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(getActivity(), Rules.class);
                i.putExtra("resid13.2", 4);
                startActivity(i);
                return true;
            }
        });


        ru5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid14", 5);

                startActivity(intent);

            }

        });

        ru5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(getActivity(), Rules.class);
                i.putExtra("resid14.2", 5);
                startActivity(i);
                return true;
            }
        });


        ru6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid15", 6);

                startActivity(intent);

            }

        });


        ru7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid16", 7);

                startActivity(intent);

            }

        });



        ru8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Rules.class);
                intent.putExtra("resid17", 8);

                startActivity(intent);

            }

        });

        return rootView;
    }}
