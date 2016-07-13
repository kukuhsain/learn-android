package com.kukuhsain.kukuh.learnandroid.counter;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.kukuhsain.kukuh.learnandroid.R;

/**
 * Created by kukuh on 29/06/16.
 */
public class SavedCounterActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    private TextView counterTextView;
    private int counter;
    private SharedPreferences sharedPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_counter);

        sharedPreferences = getSharedPreferences("LearnAndroid", MODE_PRIVATE);
        counter = sharedPreferences.getInt("counter", 0);
        counterTextView = (TextView) findViewById(R.id.counter_value);
        counterTextView.setText(""+counter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "App stops");
        sharedPreferences.edit().putInt("counter", counter).apply();
    }

    public void counterUp(View view) {
        Log.d(TAG, "Up!!!");
        counter++;
        counterTextView.setText(""+counter);
    }

    public void counterDown(View view) {
        Log.d(TAG, "Down!!!");
        counter--;
        counterTextView.setText(""+counter);
    }
}
