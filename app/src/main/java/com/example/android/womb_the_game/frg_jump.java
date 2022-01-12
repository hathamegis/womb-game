package com.example.android.womb_the_game;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class frg_jump extends Fragment{


    private ImageButton jump;
    private ImageView fadeout;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        final View rootView = inflater.inflate(R.layout.fragment_jump, container, false);

        jump = (ImageButton) rootView.findViewById(R.id.jump);
        fadeout = (ImageView) rootView.findViewById(R.id.fadeout);




        Bundle bundle = getActivity().getIntent().getExtras();
        if (bundle != null & getActivity().getIntent().hasExtra("e1"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j2", 2);
                    startActivity(i);
                    onStartNewActivity();

                }

            });


        else if (bundle != null & getActivity().getIntent().hasExtra("e2"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j3", 3);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e3"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j4", 4);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e4"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j5", 5);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e5"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j6", 6);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e6"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j7", 7);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e7"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j8", 8);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e8"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j9", 9);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e9"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j10", 10);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e10"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j11", 11);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e11"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j12", 12);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e12"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j13", 13);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e13"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j14", 14);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e15"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j16", 16);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e16"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j17", 17);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e17"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j18", 18);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e18"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j19", 19);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e19"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j20", 20);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e20"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j21", 21);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e21"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j22", 22);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e22"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j23", 23);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else if (bundle != null & getActivity().getIntent().hasExtra("e23"))
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);

                    i.putExtra("j24", 24);
                    startActivity(i);
                    onStartNewActivity();
                }

            });

        else
            jump.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), Inter.class);



                    i.putExtra("j1", 1);

                    startActivity(i);

                    onStartNewActivity();

                }

            });
//https://www.youtube.com/watch?v=CVME9yW54mY

        return rootView;
    }
    protected void onStartNewActivity() {
        getActivity().overridePendingTransition(R.anim.fade_in, R.anim.fade_out );
    }
}
