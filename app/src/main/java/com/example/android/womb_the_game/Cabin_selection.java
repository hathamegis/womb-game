package com.example.android.womb_the_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Cabin_selection extends AppCompatActivity {

    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageButton b9;
    private ImageButton b10;
    private ImageButton b11;
    private ImageButton b12;
    private ImageButton b13;
    private ImageButton b14;
    private ImageButton b15;
    private ImageButton b16;

    private ImageView im1;
    private ImageView im2;
    private ImageView im3;
    private ImageView im4;
    private ImageView im5;
    private ImageView im6;
    private ImageView im7;
    private ImageView im8;
    private ImageView im9;
    private ImageView im10;
    private ImageView im11;
    private ImageView im12;
    private ImageView im13;
    private ImageView im14;
    private ImageView im15;
    private ImageView im16;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_cabin_selection);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);

        im1 = findViewById(R.id.im1);
        im2 = findViewById(R.id.im2);
        im3 = findViewById(R.id.im3);
        im4 = findViewById(R.id.im4);
        im5 = findViewById(R.id.im5);
        im6 = findViewById(R.id.im6);
        im7 = findViewById(R.id.im7);
        im8 = findViewById(R.id.im8);
        im9 = findViewById(R.id.im9);
        im10 = findViewById(R.id.im10);
        im11 = findViewById(R.id.im11);
        im12 = findViewById(R.id.im12);
        im13 = findViewById(R.id.im13);
        im14 = findViewById(R.id.im14);
        im15 = findViewById(R.id.im15);
        im16 = findViewById(R.id.im16);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("resid",R.drawable.c1);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.aa1);
                i.putExtra("diser2",R.drawable.aa2);
                i.putExtra("diser3",R.drawable.aa3);
                startActivity(i);
                return true;
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c2);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });

        b2.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);

                i.putExtra("diser1",R.drawable.ab1);
                i.putExtra("diser2",R.drawable.ab2);
                i.putExtra("diser3",R.drawable.ab3);
                startActivity(i);

                return true;

            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c3);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ac1);
                i.putExtra("diser2",R.drawable.ac2);
                i.putExtra("diser3",R.drawable.ac3);
                startActivity(i);
                return true;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c4);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ae1);
                i.putExtra("diser2",R.drawable.ae2);
                i.putExtra("diser3",R.drawable.ae3);
                startActivity(i);
                return true;
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c5);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ad1);
                i.putExtra("diser2",R.drawable.ad2);
                i.putExtra("diser3",R.drawable.ad3);
                startActivity(i);
                return true;
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c6);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.af1);
                i.putExtra("diser2",R.drawable.af2);
                i.putExtra("diser3",R.drawable.af3);
                startActivity(i);
                return true;
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c7);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.aj1);
                i.putExtra("diser2",R.drawable.aj2);
                i.putExtra("diser3",R.drawable.aj3);
                startActivity(i);
                return true;
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c8);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ah1);
                i.putExtra("diser2",R.drawable.ah2);
                i.putExtra("diser3",R.drawable.ah3);
                startActivity(i);
                return true;
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c9);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ai1);
                i.putExtra("diser2",R.drawable.ai2);
                i.putExtra("diser3",R.drawable.ai3);
                startActivity(i);
                return true;
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c10);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.an1);
                i.putExtra("diser2",R.drawable.an2);
                i.putExtra("diser3",R.drawable.an3);
                startActivity(i);
                return true;
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c11);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ag1);
                i.putExtra("diser2",R.drawable.ag2);
                i.putExtra("diser3",R.drawable.ag3);
                startActivity(i);
                return true;
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c12);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.al1);
                i.putExtra("diser2",R.drawable.al2);
                i.putExtra("diser3",R.drawable.al3);
                startActivity(i);
                return true;
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c13);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.am1);
                i.putExtra("diser2",R.drawable.am2);
                i.putExtra("diser3",R.drawable.am3);
                startActivity(i);
                return true;
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c15);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b14.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ao1);
                i.putExtra("diser2",R.drawable.ao2);
                i.putExtra("diser3",R.drawable.ao3);
                startActivity(i);
                return true;
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cabin_selection.this, Circulation.class);
                i.putExtra("resid",R.drawable.c16);
                i.putExtra("position2", 2);
                setResult(Activity.RESULT_OK, i);
                finish();
            }

        });
        b15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
                i.putExtra("diser1",R.drawable.ak1);
                i.putExtra("diser2",R.drawable.ak2);
                i.putExtra("diser3",R.drawable.ak3);
                startActivity(i);
                return true;
            }
        });

//        b16.setOnClickListener(new View.OnClickListener() {
   //         @Override
     //       public void onClick(View view) {
  //              Intent i = new Intent(Cabin_selection.this, Circulation.class);
    //            i.putExtra("resid",R.drawable.c16);
      //          i.putExtra("position2", 2);
        //        startActivity(i);
          //  }

       // });
 //       b16.setOnLongClickListener(new View.OnLongClickListener() {
   //         @Override
     //       public boolean onLongClick(View v) {
       //         Intent i = new Intent(Cabin_selection.this, Cabin_description.class);
         //       i.putExtra("diser1",R.drawable.ak1);
           //     i.putExtra("diser2",R.drawable.ak2);
             //   i.putExtra("diser3",R.drawable.ak3);
               // startActivity(i);
                //return true;
            //}
        //});

        //visszacsatolós működő:

        //  Bundle bundle = getIntent().getExtras();
        //if(bundle!=null) {
        //  int resid1 = bundle.getInt("resid1");
        //im2.setImageResource(resid1);}
        //ide a visszautalasokat!

        //ez nem működik
        //Bundle b1=new Bundle();
        //b1.putInt("diser1", R.drawable.c1);
        //set Fragmentclass Arguments
        //lvl1_Fragment fragobj=new lvl1_Fragment();
        // fragobj.setArguments(b1);




    }
}
