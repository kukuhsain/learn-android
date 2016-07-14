package com.kukuhsain.kukuh.learnandroid.facebooklogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.kukuhsain.kukuh.learnandroid.R;

/**
 * Created by kukuh on 14/07/16.
 */
public class FacebookLoginActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Initialize the SDK before executing any other operations */
        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(getApplication());

        setContentView(R.layout.activity_facebook_login);
    }
}
