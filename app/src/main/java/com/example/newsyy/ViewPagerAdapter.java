package com.example.newsyy;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ChildFragment child = new ChildFragment();
        Bundle bundle = new Bundle();
        bundle.putString("parent",String.valueOf(position));
        child.setArguments(bundle);
        return child;
    }

    @Override
    public int getCount() {
        return 10;
    }
}



