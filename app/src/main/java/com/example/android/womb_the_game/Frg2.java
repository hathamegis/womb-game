package com.example.android.womb_the_game;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Frg2 extends Fragment{


    private ImageButton plan;
    private ImageButton debate;
    private ImageButton drift;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);




        View rootView = inflater.inflate(R.layout.fragment_frg2, container, false);




       plan = (ImageButton) rootView.findViewById(R.id.plan);
       debate = (ImageButton) rootView.findViewById(R.id.debate);
       drift = (ImageButton) rootView.findViewById(R.id.drift);



        final View.OnClickListener mListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.plan:
                        FragmentManager FM0 = getFragmentManager();
                        FragmentTransaction FT0 = FM0.beginTransaction();
                        frg_plan F10 = new frg_plan();
                        FT0.add(R.id.fragment_container, F10);
                        FT0.replace(R.id.fragment_container, F10);
                        FT0.commit();
                        break;
                    case R.id.debate:
                        FragmentManager FM = getFragmentManager();
                        FragmentTransaction FT = FM.beginTransaction();
                        frg_debate F1 = new frg_debate();
                        FT.add(R.id.fragment_container, F1);
                        FT.replace(R.id.fragment_container, F1);
                        FT.commit();
                        break;
                    case R.id.drift:
                        FragmentManager FM1 = getFragmentManager();
                        FragmentTransaction FT1 = FM1.beginTransaction();
                        frg_drift F11 = new frg_drift();
                        FT1.add(R.id.fragment_container, F11);
                        FT1.replace(R.id.fragment_container, F11);
                        FT1.commit();
                        break;
                }
            }
        };

        rootView.findViewById(R.id.plan).setOnClickListener(mListener);
        rootView.findViewById(R.id.debate).setOnClickListener(mListener);
        rootView.findViewById(R.id.drift).setOnClickListener(mListener);
        plan.performClick();
        return rootView;
    }}
