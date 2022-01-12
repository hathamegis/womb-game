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

public class Frg4 extends Fragment{



    private ImageButton prices;
    private ImageButton common;
    private ImageButton uncommon;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_frg4, container, false);


        prices = (ImageButton) rootView.findViewById(R.id.prices);
        common = (ImageButton) rootView.findViewById(R.id.common);
        uncommon = (ImageButton) rootView.findViewById(R.id.uncommon);






        final View.OnClickListener mListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.prices:

                        FragmentManager FM1 = getFragmentManager();
                        FragmentTransaction FT1 = FM1.beginTransaction();
                        frg_prices F11 = new frg_prices();
                        FT1.add(R.id.fragment_container2, F11);
                        onStop();
                        FT1.replace(R.id.fragment_container2, F11);
                        FT1.commit();


                        break;
                    case R.id.common:
                        FragmentManager FM = getFragmentManager();
                        FragmentTransaction FT = FM.beginTransaction();
                        frg_common F1 = new frg_common();
                        FT.add(R.id.fragment_container2, F1);
                        FT.replace(R.id.fragment_container2, F1);
                        FT.commit();
                        break;

                    case R.id.uncommon:
                        FragmentManager FM2 = getFragmentManager();
                        FragmentTransaction FT2 = FM2.beginTransaction();
                        frg_uncommon F2 = new frg_uncommon();
                        FT2.add(R.id.fragment_container2, F2);
                        FT2.replace(R.id.fragment_container2, F2);
                        FT2.commit();
                        break;

                }

            }
        };




        rootView.findViewById(R.id.prices).setOnClickListener(mListener);
        rootView.findViewById(R.id.common).setOnClickListener(mListener);
        rootView.findViewById(R.id.uncommon).setOnClickListener(mListener);



        prices.performClick();
        return rootView;
    }

    @Override
    public void onStop() {


        super.onStop();
    }
}
