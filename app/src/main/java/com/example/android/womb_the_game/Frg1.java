package com.example.android.womb_the_game;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Frg1 extends Fragment{


    private int buttonState = 1;
    private ImageButton current;
    private ImageButton next;






    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable final Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_frg1, container, false);


        current = (ImageButton) rootView.findViewById(R.id.current);
        next = (ImageButton) rootView.findViewById(R.id.next);







        final View.OnClickListener mListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.current:

//                        if(buttonState % 2 == 0){
  //                                  current.setImageResource(R.drawable.bs7);

    //                            }
      //                          else{
        //                            current.setImageResource(R.drawable.bs8);
          //                      }
            //                    buttonState++;

                        FragmentManager FM1 = getFragmentManager();
                        FragmentTransaction FT1 = FM1.beginTransaction();
                        frg_event F11 = new frg_event();
                        FT1.add(R.id.fragment_container3, F11);
                        onStop();
                        FT1.replace(R.id.fragment_container3, F11);
                        FT1.commit();


                        break;
                    case R.id.next:
                        FragmentManager FM = getFragmentManager();
                        FragmentTransaction FT = FM.beginTransaction();
                        frg_jump F1 = new frg_jump();
                        FT.add(R.id.fragment_container3, F1);
                        FT.replace(R.id.fragment_container3, F1);
                        FT.commit();
                        break;



                }

            }
        };




        rootView.findViewById(R.id.current).setOnClickListener(mListener);
        rootView.findViewById(R.id.next).setOnClickListener(mListener);




        current.performClick();
        return rootView;
    }

    @Override
    public void onPause() {
        current.performClick();

        super.onPause();
    }
}



//private ImageView e0;

  //  @Nullable
//    @Override
  //  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        super.onCreateView(inflater, container, savedInstanceState);

  //      View rootView = inflater.inflate(R.layout.fragment_frg1, container, false);
//        e0 = (ImageView) rootView.findViewById(R.id.e0);
//        Bundle bundle = getActivity().getIntent().getExtras();
  //      if (bundle == null & savedInstanceState == null)
    //    {
      //      e0.setImageResource(R.drawable.e0);
        //}
 //       else if(bundle!=null & getActivity().getIntent().hasExtra("frg_event")) {
   //         int resid = bundle.getInt("frg_event");
     //       e0.setImageResource(resid);
       // }
      //  else {
            //       Intent intent = new Intent(getActivity(), Circulation.class);
            //     intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            //   startActivity(intent);

        //}

      //  return rootView;
//    }
  //  @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
  //      super.onActivityResult(requestCode, resultCode, data);
        //     Bundle bundle = getActivity().getIntent().getExtras();

//        if (resultCode == RESULT_OK && requestCode == 13 && data !=null){
  //          int resi = data.getIntExtra("frg_event", 13);
    //        e0.setImageResource(resi);
//}}}
