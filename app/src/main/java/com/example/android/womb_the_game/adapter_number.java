package com.example.android.womb_the_game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class adapter_number extends PagerAdapter {
    Context c;
    adapter_number(Context c)
    {
        this.c=c;


    }
//fragmenteset kell csinálni belőle, a kepeket visszakerekiteni es beallitani rendesen vagy backgroundcolornak fekete, meg az appbackground is az legyen

    private int[] images = {R.drawable.l00,R.drawable.n11,R.drawable.n12,R.drawable.n13,R.drawable.n14,R.drawable.n15,R.drawable.n16,R.drawable.n17,R.drawable.n18,R.drawable.n19,R.drawable.n110};
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @Override
    public int getCount() {
        return images.length;
    }



    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.alibi_layout,container,false);
        ImageView iv = (ImageView)v.findViewById(R.id.alibi_imageView);
        iv.setRotation(-90);
        iv.setImageResource(images [position]);
        container.addView(v);
        return  v;
    }
    @Override
    public void destroyItem (ViewGroup container, int position, Object object) {
        (container).removeView((View) object);
    }
}
