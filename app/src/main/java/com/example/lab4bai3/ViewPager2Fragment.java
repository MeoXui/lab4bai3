package com.example.lab4bai3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPager2Fragment extends FragmentStateAdapter {

    public ViewPager2Fragment(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0) return new Fragment1();
        return new Fragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
