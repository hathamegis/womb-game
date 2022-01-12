package com.example.android.womb_the_game;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import static android.view.View.OVER_SCROLL_NEVER;

public class adapter_help extends PagerAdapter {
    Context c;
    adapter_help(Context c)
    {
        this.c=c;

    }

    private int[] images = {R.drawable.he1,R.drawable.he2,R.drawable.he3,R.drawable.he4,R.drawable.he5,R.drawable.he6,R.drawable.he7};
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
        iv.setImageResource(images [position]);
        container.addView(v);
        return  v;
    }
    @Override
    public void destroyItem (ViewGroup container, int position, Object object) {
        (container).removeView((View) object);
    }}
