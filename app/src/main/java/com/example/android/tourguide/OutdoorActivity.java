package com.example.android.tourguide;

public class OutdoorActivity {

    private String mActivityName;
    private int mImageResourceId;

    public OutdoorActivity(String activityName, int imageResourceId) {
        mActivityName = activityName;
        mImageResourceId = imageResourceId;
    }

    public String getActivityName() {
        return mActivityName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
