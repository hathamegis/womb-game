package com.example.android.womb_the_game;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;


public class Rules extends AppCompatActivity {
    PDFView pdfView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_rules);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        pdfView1 = findViewById(R.id.pdfView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null & getIntent().hasExtra("resid10")) {


            pdfView1.fromAsset("FLOW.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();}

        else if (bundle != null & getIntent().hasExtra("resid10.2")) {


            pdfView1.fromAsset("ENDGAME.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid11")) {


            pdfView1.fromAsset("SPACEAREA.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid11.2")) {


            pdfView1.fromAsset("BEACONS.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid12")) {


            pdfView1.fromAsset("SHIP.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();
        }

        else if (bundle != null & getIntent().hasExtra("resid12.2")) {


            pdfView1.fromAsset("WEAPONS.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid13")) {


            pdfView1.fromAsset("CREW.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();
        }

        else if (bundle != null & getIntent().hasExtra("resid13.2")) {


            pdfView1.fromAsset("CAPSULE.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid14")) {


            pdfView1.fromAsset("ACTIONS.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();
        }

        else if (bundle != null & getIntent().hasExtra("resid14.2")) {


            pdfView1.fromAsset("CABINDEVELOPMENT.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid15")) {


            pdfView1.fromAsset("ENCOUNTERY.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();
        }

        else if (bundle != null & getIntent().hasExtra("resid16")) {


            pdfView1.fromAsset("ENCOUNTERB.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

        else if (bundle != null & getIntent().hasExtra("resid17")) {


            pdfView1.fromAsset("ENCOUNTERR.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }


        else if (bundle != null & getIntent().hasExtra("resid100")) {


            pdfView1.fromAsset("SETUP.pdf")

                    .onRender(new OnRenderListener() {
                        @Override
                        public void onInitiallyRendered(int pages, float pageWidth,
                                                        float pageHeight) {
                            pdfView1.fitToWidth(); // optionally pass page number
                        }
                    })
                    .load();;
        }

    }}

    // a hasextra lett a megoldás