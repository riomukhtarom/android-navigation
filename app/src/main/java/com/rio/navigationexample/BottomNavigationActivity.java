package com.rio.navigationexample;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class BottomNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private Fragment fragment;
    private BottomNavigationView bottomNavigationMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        bottomNavigationMain = findViewById(R.id.bottom_nav_main);
        bottomNavigationMain.setOnNavigationItemSelectedListener(this);
        bottomNavigationMain.setSelectedItemId(R.id.navigation_movie);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_movie:
                fragment = new PresidentFragment();
                loadFragment(fragment);
                return true;
            case R.id.navigation_tv:
                fragment = new VicePresidentFragment();
                loadFragment(fragment);
                return true;
        }
        return false;
    }

    private void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_mainFrame, fragment)
                    .commit();
        }
    }
}
