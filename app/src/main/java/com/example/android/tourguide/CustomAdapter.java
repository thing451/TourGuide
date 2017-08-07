package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CustomAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeFragment();
            case 1:
                return new EventsFragment();
            case 2:
                return new FoodandDrinkFragment();
            case 3:
                return new ShoppingFragment();
            case 4:
                return new OutdoorActivitiesFragment();
            case 5:
                return new NightLifeFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.page_home);
            case 1:
                return mContext.getString(R.string.page_events);
            case 2:
                return mContext.getString(R.string.page_food_and_drinks);
            case 3:
                return mContext.getString(R.string.page_shopping);
            case 4:
                return mContext.getString(R.string.page_outdoor_activities);
            case 5:
                return mContext.getString(R.string.page_nightlife);
            default:
                return mContext.getString(R.string.page_home);
        }
    }
}
