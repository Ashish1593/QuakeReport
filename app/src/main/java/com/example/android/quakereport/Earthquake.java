package com.example.android.quakereport;

/**
 * Created by ankit on 15/8/16.
 */
public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMillisecond;
    private String mUrl;


    public Earthquake(double magnitude, String location, long timeInMillisecond, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMillisecond = timeInMillisecond;
        mUrl = url;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMillisecond() {
        return mTimeInMillisecond;
    }
    public String getUri(){
        return mUrl;
    }

}