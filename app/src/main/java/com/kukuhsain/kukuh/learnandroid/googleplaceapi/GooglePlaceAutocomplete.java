package com.kukuhsain.kukuh.learnandroid.googleplaceapi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.Places;
import com.kukuhsain.kukuh.learnandroid.R;

/**
 * Created by kukuh on 02/08/16.
 */
public class GooglePlaceAutocomplete extends AppCompatActivity
        implements GoogleApiClient.OnConnectionFailedListener {
    private final String TAG = "GooglePlaceAutocomplete";
    private GoogleApiClient mGoogleApiClient;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_place_autocomplete);

        mGoogleApiClient = new GoogleApiClient
                .Builder(this)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .enableAutoManage(this, this)
                .build();

        Button btnAutocompleteSearch = (Button) findViewById(R.id.btn_autocomplete_search);
        btnAutocompleteSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button pressed.......");
            }
        });
    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Log.d(TAG, "connection failed: "+connectionResult.toString());
    }
}
