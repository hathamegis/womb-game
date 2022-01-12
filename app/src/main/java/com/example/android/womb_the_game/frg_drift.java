package com.example.android.womb_the_game;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class frg_drift extends Fragment{


    //private ImageView lvl1;
    ViewPager vp;
    adapter_drift myAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);


        View rootView = inflater.inflate(R.layout.fragment_frg_drift, container, false);

        myAdapter = new adapter_drift(getActivity());

        vp = (ViewPager)rootView.findViewById(R.id.drift_ViewPager);
        vp.setAdapter(myAdapter);
        vp.setCurrentItem(1);
        vp.setRotation(+90);
        return rootView;
    }
    }
