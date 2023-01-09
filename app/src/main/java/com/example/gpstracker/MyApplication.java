package com.example.gpstracker;

import android.app.Application;
import android.location.Location;

import java.util.ArrayList;
import java.util.List;

public class MyApplication extends Application {

    private static MyApplication myApplicationSingleton;

    List<Location> myLocationList;

    public List<Location> getMyLocationList() {
        return myLocationList;
    }

    public void setMyLocationList(List<Location> myLocationList) {
        this.myLocationList = myLocationList;
    }

    public MyApplication getInstance() {
        return myApplicationSingleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myApplicationSingleton = this;
        myLocationList = new ArrayList<>();
    }
}
