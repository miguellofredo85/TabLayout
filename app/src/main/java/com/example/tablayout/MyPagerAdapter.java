package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {

private int numTabs;

    public MyPagerAdapter(@NonNull FragmentManager fm, int behavior, int numTabs) {
        super(fm, behavior);
        this.numTabs = numTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
