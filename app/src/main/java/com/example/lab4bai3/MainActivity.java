package com.example.lab4bai3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 vp2Frag = findViewById(R.id.vip_frag);
        TabLayout tabFrag = findViewById(R.id.tab_frag);

        ViewPager2Fragment vpf = new ViewPager2Fragment(this);
        vp2Frag.setAdapter(vpf);

        new TabLayoutMediator(tabFrag,vp2Frag,(tab, position) -> {
            switch (position){
                case 0 -> tab.setText("Fragment 1");
                case 1 -> tab.setText("Fragment 2");
                default -> {}
            }
        }).attach();

    }
}