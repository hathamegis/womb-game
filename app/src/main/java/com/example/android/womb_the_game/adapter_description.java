package com.example.android.womb_the_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

public class adapter_description extends FragmentPagerAdapter {

    public adapter_description(FragmentManager fm) {
        super(fm);
    }
    //https://stackoverflow.com/questions/42022634/viewpager-in-recylerview-no-view-found-for-id

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new lvl1_Fragment(); //ChildFragment1 at position 0
            case 1:
                return new lvl2_Fragment(); //ChildFragment2 at position 1
            case 2:
                return new lvl3_Fragment(); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 3; //three fragments
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "LVL 1";
            case 1:
                return "LVL 2";
            case 2:
                return "LVL 3";
        }
        return null;
    }
}

