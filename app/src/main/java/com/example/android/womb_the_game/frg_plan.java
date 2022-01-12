package com.example.android.womb_the_game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import static android.app.Activity.RESULT_OK;
import static android.content.Context.MODE_PRIVATE;


public class frg_plan extends Fragment {

    ViewPager vp;
    ViewPager vvp;
    adapter_cabinactions mySecondApter;

    private static int lSelectedPos = 0;
    private static int twoSelectedPos = 0;
    private int buttonState = 1;
 //   private Switch mySwitch;

   private ImageButton jumpstay;
    private ImageButton to_control_panel;
    ImageView cabin;
    ImageView jumpbg;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);


        View rootView = inflater.inflate(R.layout.fragment_frg_plan, container, false);


        to_control_panel = (ImageButton) rootView.findViewById(R.id.to_control_panel);
        cabin = (ImageView) rootView.findViewById(R.id.cabin);
   //     jumpbg = (ImageView) rootView.findViewById(R.id.jumpbg);
       jumpstay = (ImageButton) rootView.findViewById(R.id.stayjump);
   //     mySwitch = (Switch) rootView.findViewById(R.id.switch1);


  //      vp = (ViewPager) rootView.findViewById(R.id.cabintype_ViewPager);
    //    vp.setAdapter(myAdapter);
      //  vp.setCurrentItem(lSelectedPos);


        mySecondApter = new adapter_cabinactions(getActivity());

        vvp = (ViewPager) rootView.findViewById(R.id.actions_myViewPager);
        vvp.setAdapter(mySecondApter);
        vvp.setRotation(+90);
        vvp.setCurrentItem(twoSelectedPos);

        to_control_panel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Cabin_selection.class);
                startActivityForResult(intent, 25);
//                lSelectedPos =vp.getCurrentItem();
                twoSelectedPos =vvp.getCurrentItem();
            }

        });

  //      final SharedPreferences sharedPreferences = getActivity().getSharedPreferences("isChecked", MODE_PRIVATE);
    //    mySwitch.setChecked(sharedPreferences.getBoolean("isChecked", true));



//                    <Switch
  //      android:id="@+id/switch1"
    //    android:layout_width="match_parent"
      //  android:layout_height="match_parent"
        //android:background="@null"
        //android:layout_weight="1"
        //android:textOff=""
        //android:showText="false"

       // android:button="@drawable/jump"
        //android:thumbTint="#00000000"
       // android:trackTint="#00000000" />











   //     mySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
       //     @Override
         //  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
     //          if (isChecked) {

   //                 SharedPreferences.Editor editor= sharedPreferences.edit();
     //                       editor.putBoolean("isChecked", true);
       //                             editor.apply();

           //     } else {

         //           SharedPreferences.Editor editor = sharedPreferences.edit();
           //         editor.putBoolean("isChecked", false);
             //               editor.apply();
             //  }

//https://stackoverflow.com/questions/43622571/how-to-save-resource-of-imagebutton-in-sharedpreferences
            //}

       // });


//        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity());


  //      final int drawableId = sharedPref.getInt("drawableId", 0);
    //    final int drawableId2 = sharedPref.getInt("drawableId2", 1);

        jumpstay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonState % 2 == 0){
                    jumpstay.setImageResource(R.drawable.bs7);

                }
                else{
                    jumpstay.setImageResource(R.drawable.bs8);
                }
                buttonState++;
            }
        });


//        jump.setOnClickListener(new View.OnClickListener() {
  //          @Override
    //        public void onClick(View v) {
      //          if(buttonState % 2 == 0){
        //            jump.setImageResource(drawableId);
          //          SharedPreferences.Editor editor = sharedPref.edit();
            //        editor.putInt("drawableId", R.drawable.bs7);
              //      editor.commit();

//               }
  //              else{
    //                jump.setImageResource(drawableId2);
      //              SharedPreferences.Editor editor = sharedPref.edit();
        //            editor.putInt("drawableId2", R.drawable.bs8);
          //          editor.commit();

            //    }
              //  buttonState++;
  //          }
//        });



        return rootView;}

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
   //     Bundle bundle = getActivity().getIntent().getExtras();

        if (resultCode == RESULT_OK && requestCode == 25 && data !=null){
            int resid = data.getIntExtra("resid", 25);
               cabin.setImageResource(resid);
//IIIIGGEEEEN!



 //           if (bundle == null)
   //         {
     //           cabin.setImageResource(R.drawable.bs9);
       //     }
         //   else if(bundle!=null & getActivity().getIntent().hasExtra("resid")) {
           //     int resid = bundle.getInt("resid");
             //   cabin.setImageResource(resid);

//            }
  //          else {
                //       Intent intent = new Intent(getActivity(), Circulation.class);
                //     intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                //   startActivity(intent);

    //        }
        }
    }



    @Override
    public void onStop() {

  //      lSelectedPos =vp.getCurrentItem();
        twoSelectedPos =vvp.getCurrentItem();


        super.onStop();
    }
}


