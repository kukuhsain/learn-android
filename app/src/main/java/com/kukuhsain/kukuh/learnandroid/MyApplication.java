package com.kukuhsain.kukuh.learnandroid;

import android.app.Application;
import android.util.Log;

import io.smooch.core.Smooch;

/**
 * Created by kukuh on 14/07/16.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("fromApplication", "onCreate.........");
        Smooch.init(this, getString(R.string.smooch_token));
    }
}
