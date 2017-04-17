package com.example.map;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by zhiyuan on 17/3/24.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
    }
}
