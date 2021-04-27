package com.narine.android1less7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.narine.android1less7.firstFragment.FirstFragment;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager (viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        VPagerAdapter adapter = new VPagerAdapter(getSupportFragmentManager());
        adapter.addFragment("Exchange", new FirstFragment());
        adapter.addFragment("Date & Time", new SecondFragment());
        adapter.addFragment("More", new ThirdFragment());
        viewPager.setAdapter(adapter);
    }
}