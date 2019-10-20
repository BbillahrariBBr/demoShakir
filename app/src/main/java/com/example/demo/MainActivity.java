package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = getSupportActionBar();
        BottomNavigationView bottomNavigation = (BottomNavigationView) findViewById(R.id.navigation);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("Shop");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home:
                    toolbar.setTitle("Home");
                    return true;
                case R.id.abroad:
                    toolbar.setTitle("Abroad");
                    return true;
                case R.id.special:
                    toolbar.setTitle("Special");
                    return true;
                case R.id.notice:
                    toolbar.setTitle("Notice");
                    return true;
            }
            return false;
        }
    };


}
