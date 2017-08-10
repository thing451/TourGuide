package com.example.android.tourguide;

public class OutdoorActivity {

    private String mActivityName, mDescription;
    private int mImageResourceId;

    public OutdoorActivity(String activityName, int imageResourceId, String description) {
        mActivityName = activityName;
        mImageResourceId = imageResourceId;
        mDescription = description;
    }

    public String getActivityName() {
        return mActivityName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }
}
