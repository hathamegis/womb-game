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

public class lvl2_Fragment extends Fragment {

    private ImageButton lvl2back;
    //private ImageView lvl2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_lvl2_, container, false);

        lvl2back = (ImageButton) rootView.findViewById(R.id.lvl2back);
        //      lvl2 = (ImageView) rootView.findViewById(R.id.lvl2);

        //    Bundle bundle = getArguments();
        //  if(bundle!=null) {
        //    int resid1 = bundle.getInt("diser2");
        //  lvl2.setImageResource(resid1);

//        }
        Bundle b1 = getActivity().getIntent().getExtras();
        if(b1!=null) {
            int resid = b1.getInt("diser2");
            lvl2back.setImageResource(resid);}


        lvl2back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Cabin_selection.class);
                // i.putExtra("resid1",R.drawable.c4);
                getActivity().finish();
            }

        });

        return rootView;
    }
}