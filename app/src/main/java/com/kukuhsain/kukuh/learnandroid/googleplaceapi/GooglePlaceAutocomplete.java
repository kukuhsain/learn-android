package com.kukuhsain.kukuh.learnandroid.googleplaceapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.kukuhsain.kukuh.learnandroid.R;

/**
 * Created by kukuh on 02/08/16.
 */
public class GooglePlaceAutocomplete extends AppCompatActivity {
    private final String TAG = "GooglePlaceAutocomplete";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_place_autocomplete);

        Button btnAutocompleteSearch = (Button) findViewById(R.id.btn_autocomplete_search);
        btnAutocompleteSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button pressed.......");
            }
        });
    }
}
