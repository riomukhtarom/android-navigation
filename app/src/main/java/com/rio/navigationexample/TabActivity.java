package com.rio.navigationexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TabActivity extends AppCompatActivity {

    private TabAdapter tabAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        tabLayout = findViewById(R.id.tab_layout_main);
        viewPager = findViewById(R.id.view_pager_main);

        tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.addFragment(new PresidentFragment(), "Movie");
        tabAdapter.addFragment(new VicePresidentFragment(), "TV");

        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
