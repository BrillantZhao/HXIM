package com.brilliant.hxim;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * description:
 * Date: 2017/10/15 18:11
 * User: zhaobrillant
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }

}
