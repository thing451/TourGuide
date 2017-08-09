package com.example.android.tourguide;

public class Business {

    private String mBusinessName, mPhoneNumber, mAddress, mWebsite, mDescription, mGeoLocation;
    private int mImageResourceId;

    public Business(String businessName, String phoneNumber, String address, String website,
                    String description, int imageResourceId, String geoLocation) {
        mBusinessName = businessName;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mWebsite = website;
        mDescription = description;
        mImageResourceId = imageResourceId;
        mGeoLocation = geoLocation;
    }

    public Business(String businessName, String phoneNumber, String address, String website,
                    int imageResourceId, String geoLocation) {
        mBusinessName = businessName;
        mPhoneNumber = phoneNumber;
        mAddress = address;
        mWebsite = website;
        mImageResourceId = imageResourceId;
        mGeoLocation = geoLocation;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getGeoLocation() {
        return mGeoLocation;
    }
}
