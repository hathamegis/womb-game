package com.example.android.womb_the_game;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import static androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE;

public class Frg3 extends Fragment{



    private ImageButton snipe;
    private ImageButton shoot;
    private ImageButton number;
    private ImageButton letter;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_frg3, container, false);


        snipe = (ImageButton) rootView.findViewById(R.id.snipe);
        shoot = (ImageButton) rootView.findViewById(R.id.shoot);
        number = (ImageButton) rootView.findViewById(R.id.number);
        letter = (ImageButton) rootView.findViewById(R.id.letter);






        final View.OnClickListener mListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.shoot:

                        FragmentManager FM1 = getFragmentManager();
                        FragmentTransaction FT1 = FM1.beginTransaction();
                        frg_shoot F11 = new frg_shoot();
                        FT1.add(R.id.fragment_container1, F11);
                        onStop();
                        FT1.replace(R.id.fragment_container1, F11);
                        FT1.commit();


                        break;
                    case R.id.snipe:
                        FragmentManager FM = getFragmentManager();
                        FragmentTransaction FT = FM.beginTransaction();
                        frg_snipe F1 = new frg_snipe();
                        FT.add(R.id.fragment_container1, F1);
                        FT.replace(R.id.fragment_container1, F1);
                        FT.commit();
                        break;

                    case R.id.number:
                        FragmentManager FM2 = getFragmentManager();
                        FragmentTransaction FT2 = FM2.beginTransaction();
                        frg_aim F2 = new frg_aim();
                        FT2.add(R.id.fragment_container1, F2);
                        FT2.replace(R.id.fragment_container1, F2);
                        FT2.commit();
                        break;

                    case R.id.letter:
                        FragmentManager FM3 = getFragmentManager();
                        FragmentTransaction FT3 = FM3.beginTransaction();
                        frg_aim2 F3 = new frg_aim2();
                        FT3.add(R.id.fragment_container1, F3);
                        FT3.replace(R.id.fragment_container1, F3);
                        FT3.commit();
                        break;
                }

            }
        };




        rootView.findViewById(R.id.snipe).setOnClickListener(mListener);
        rootView.findViewById(R.id.shoot).setOnClickListener(mListener);
        rootView.findViewById(R.id.number).setOnClickListener(mListener);
        rootView.findViewById(R.id.letter).setOnClickListener(mListener);



        shoot.performClick();
        return rootView;
    }

    @Override
    public void onStop() {


        super.onStop();
    }
}
