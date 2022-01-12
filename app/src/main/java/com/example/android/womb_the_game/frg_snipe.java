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




public class frg_snipe extends Fragment {

    private ImageView first_dice;
    private ImageView second_dice;
    private Random rng = new Random();
    private ImageButton snipe;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);


        View rootView = inflater.inflate(R.layout.fragment_frg_snipe, container, false);




        snipe = rootView.findViewById(R.id.snipe);

        first_dice = rootView.findViewById(R.id.first_dice);
        second_dice = rootView.findViewById(R.id.second_dice);

        snipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDicesnipe();
            }
        });


        return rootView;}
    private void rollDicesnipe() {
        int randomnumber = rng.nextInt(6)+1;


        switch (randomnumber) {
            case 1:
                first_dice.setImageResource(R.drawable.n3);
                break;
            case 2:
                first_dice.setImageResource(R.drawable.n4);
                break;
            case 3:
                first_dice.setImageResource(R.drawable.n5);
                break;
            case 4:
                first_dice.setImageResource(R.drawable.n6);
                break;
            case 5:
                first_dice.setImageResource(R.drawable.n7);
                break;
            case 6:
                first_dice.setImageResource(R.drawable.n8);
                break;
        }

        int randomnumbe = rng.nextInt(6)+1;

        switch (randomnumbe) {
            case 1:
                second_dice.setImageResource(R.drawable.l3);
                break;
            case 2:
                second_dice.setImageResource(R.drawable.l4);
                break;
            case 3:
                second_dice.setImageResource(R.drawable.l5);
                break;
            case 4:
                second_dice.setImageResource(R.drawable.l6);
                break;
            case 5:
                second_dice.setImageResource(R.drawable.l7);
                break;
            case 6:
                second_dice.setImageResource(R.drawable.l8);
                break;

        }}}