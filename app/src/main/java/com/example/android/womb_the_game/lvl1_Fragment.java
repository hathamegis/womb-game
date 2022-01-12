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

public class lvl1_Fragment extends Fragment{

    private ImageButton lvl1back;
    //private ImageView lvl1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        // Bundle bundle = getArguments();
        //if(bundle!=null) {
        //int resid1 = bundle.getInt("diser1");
        //lvl1.setImageResource(resid1);}


        View rootView = inflater.inflate(R.layout.fragment_lvl1_, container, false);



        lvl1back = (ImageButton) rootView.findViewById(R.id.lvl1back);
        //   lvl1 = (ImageView) rootView.findViewById(R.id.lvl1);


        //   Bundle bundle = getArguments();
        // if(bundle!=null) {
        //   int resid1 = bundle.getInt("diser1");
        // lvl1.setImageResource(resid1);

        //}

        //EZ MUKODIK ha ide kell utalni képet, csak az iputextra tenyleges kepet ker es nem egy változót:
        Bundle b1 = getActivity().getIntent().getExtras();
        if(b1!=null) {
            int resid = b1.getInt("diser1");
            lvl1back.setImageResource(resid);}



        lvl1back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Cabin_selection.class);

                //https://stackoverflow.com/questions/28885629/send-image-with-made-changes-to-another-activity-android


                // i.putExtra("resid1",R.drawable.c3);

                getActivity().finish();
            }

        });

        return rootView;
    }}
