package com.example.android.womb_the_game;

import android.content.Context;
import android.content.Intent;
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

public class lvl3_Fragment extends Fragment {

    private ImageButton lvl3back;
    //private ImageView lvl3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_lvl3_, container, false);

        lvl3back = (ImageButton) rootView.findViewById(R.id.lvl3back);
        //  lvl3 = (ImageView) rootView.findViewById(R.id.lvl3);

//        Bundle bundle = getArguments();
        //      if(bundle!=null) {
        //        int resid1 = bundle.getInt("diser3");
        //      lvl3.setImageResource(resid1);
        //}

        Bundle b1 = getActivity().getIntent().getExtras();
        if(b1!=null) {
            int resid = b1.getInt("diser3");
            lvl3back.setImageResource(resid);}


        lvl3back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Cabin_description.class);
                //i.putExtra("resid1",R.drawable.c5);
                getActivity().finish();
            }

        });

        return rootView;
    }
}