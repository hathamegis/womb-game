package com.example.android.womb_the_game;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
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




public class frg_aim extends Fragment {


    private ImageView second_dice;
    private Random rng = new Random();
    private ImageButton aim_letter;
    ViewPager vp;
    adapter_number myAdapter;
    private static int lSelectedPos = 0;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);


        View rootView = inflater.inflate(R.layout.fragment_frg_aim, container, false);

        myAdapter = new adapter_number(getActivity());

        vp = (ViewPager) rootView.findViewById(R.id.myViewPager);
        vp.setAdapter(myAdapter);
        vp.setRotation(+90);
        vp.setCurrentItem(lSelectedPos);




        aim_letter = rootView.findViewById(R.id.aim_letter);



        second_dice = rootView.findViewById(R.id.second_dice);

        aim_letter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDiceletter();
            }
        });




 //       aim_column.setOnLongClickListener(new View.OnLongClickListener() {
   //         @Override
     //       public boolean onLongClick(View v) {
       //         Intent i = new Intent(getActivity(), choose_dice_row.class);
         //       getActivity();
           //     startActivity(i);
             //   return true;

           // }
       // });

//        Bundle bundle1 = getActivity().getIntent().getExtras();
  //      if(bundle1==null) {
    //        first_dice.setImageResource(R.drawable.n0);}
      //  else if (bundle1 !=null & getActivity().getIntent().hasExtra("resid1")) {

        //    int resid1 = bundle1.getInt("resid1");
          //  first_dice.setImageResource(resid1);
        //}




//        Bundle bundle2 = getActivity().getIntent().getExtras();
  //      if(bundle2==null) {
    //        second_dice.setImageResource(R.drawable.n0);}
      //  else if (bundle2 !=null & getActivity().getIntent().hasExtra("resid2")) {

        //    int resid2 = bundle2.getInt("resid2");
          //  second_dice.setImageResource(resid2);
        //}




        return rootView;}


    private void rollDiceletter() {
        int randomnumbe = rng.nextInt(6)+1;

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

        }}


}