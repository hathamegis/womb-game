package com.example.android.womb_the_game;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.content.Context;
import android.view.ViewGroup;

public class Adapter_Circulation extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 5;
    Context context;
    private Frg0 frg0;
    private Frg1 frg1;
    private Frg2 frg2;
    private Frg3 frg3;
    private Frg4 frg4;




    public Adapter_Circulation(FragmentManager fm, Context c) {
        super(fm);
        this.context = c;

    }


    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new  Frg0();
            case 1:
                return new Frg1();
            case 2:
                return new Frg2();
            case 3:
                return new  Frg3();
            case 4:
                return new Frg4();

        }
        return null; //does not happen
    }




    @Override
    public int getCount() {
        return NUM_ITEMS; //three fragments
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "RULES";
            case 1:
                return "EVENTS";
            case 2:
                return "PLAN";
            case 3:
                return "ATTACK";
            case 4:
                return "GROWTH";

        }
        return null;
    }

}


