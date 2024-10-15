package com.app.hubert.newbieguide;

import android.app.Application;

/**
 * Created by hubert on 2018/5/2.
 */
public class App extends Application {

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }
}
