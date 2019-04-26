package com.example.trainingdemo;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs)
    {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                NotifiFragment notifiFragment = new NotifiFragment();
                return notifiFragment;
            case 2:
                SettingFragment settingFragment = new SettingFragment();
                return settingFragment;
             default:
                 return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
