package com.rio.navigationexample;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class TabAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> listFragment = new ArrayList<>();
    private ArrayList<String> listFragmentTitle = new ArrayList<>();

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return listFragment.get(i);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listFragmentTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        listFragment.add(fragment);
        listFragmentTitle.add(title);
    }
}
