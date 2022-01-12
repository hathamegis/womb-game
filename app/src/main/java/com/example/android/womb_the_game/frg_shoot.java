package com.example.android.womb_the_game;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;




    public class frg_shoot extends Fragment {

        private ImageView first_dice;
        private ImageView second_dice;
        private Random rng = new Random();
        private ImageButton dten;


        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            super.onCreateView(inflater, container, savedInstanceState);


            View rootView = inflater.inflate(R.layout.fragment_frg_shoot, container, false);




        dten = rootView.findViewById(R.id.dten);

        first_dice = rootView.findViewById(R.id.first_dice);
        second_dice = rootView.findViewById(R.id.second_dice);

        dten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });


            return rootView;}
    private void rollDice() {
        int randomnumber = rng.nextInt(10)+1;


        switch (randomnumber) {
            case 1:
                first_dice.setImageResource(R.drawable.n1);
                break;
            case 2:
                first_dice.setImageResource(R.drawable.n2);
                break;
            case 3:
                first_dice.setImageResource(R.drawable.n3);
                break;
            case 4:
                first_dice.setImageResource(R.drawable.n4);
                break;
            case 5:
                first_dice.setImageResource(R.drawable.n5);
                break;
            case 6:
                first_dice.setImageResource(R.drawable.n6);
                break;
            case 7:
                first_dice.setImageResource(R.drawable.n7);
                break;
            case 8:
                first_dice.setImageResource(R.drawable.n8);
                break;
            case 9:
                first_dice.setImageResource(R.drawable.n9);
                break;
            case 10:
                first_dice.setImageResource(R.drawable.n10);
                break;
        }

        int randomnumbe = rng.nextInt(10)+1;

        switch (randomnumbe) {
            case 1:
                second_dice.setImageResource(R.drawable.l1);
                break;
            case 2:
                second_dice.setImageResource(R.drawable.l2);
                break;
            case 3:
                second_dice.setImageResource(R.drawable.l3);
                break;
            case 4:
                second_dice.setImageResource(R.drawable.l4);
                break;
            case 5:
                second_dice.setImageResource(R.drawable.l5);
                break;
            case 6:
                second_dice.setImageResource(R.drawable.l6);
                break;
            case 7:
                second_dice.setImageResource(R.drawable.l7);
                break;
            case 8:
                second_dice.setImageResource(R.drawable.l8);
                break;
            case 9:
                second_dice.setImageResource(R.drawable.l9);
                break;
            case 10:
                second_dice.setImageResource(R.drawable.l10);
                break;
        }

    }


        }
