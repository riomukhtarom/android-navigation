package com.rio.navigationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnBottomNav;
    Button btnTabLayout;
    Button btnNavDraw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBottomNav = findViewById(R.id.btn_bottom_nav);
        btnTabLayout = findViewById(R.id.btn_tab_layout);
        btnNavDraw = findViewById(R.id.btn_nav_draw);

        btnBottomNav.setOnClickListener(this);
        btnTabLayout.setOnClickListener(this);
        btnNavDraw.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bottom_nav:
                moveToActivity(BottomNavigationActivity.class);
                break;
            case R.id.btn_tab_layout:
                moveToActivity(TabActivity.class);
                break;
            case R.id.btn_nav_draw:
                break;
        }
    }

    private void moveToActivity(Class cls){
        Intent intent = new Intent(MainActivity.this, cls);
        startActivity(intent);
    }
}
