package com.kukuhsain.kukuh.learnandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kukuhsain.kukuh.learnandroid.counter.SavedCounterActivity;
import com.kukuhsain.kukuh.learnandroid.todolist.RealmBasedToDoListActivity;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSavedCounter(View view) {
        Intent intent = new Intent(MainActivity.this, SavedCounterActivity.class);
        startActivity(intent);
    }

    public void goToToDoList(View view) {
        Intent intent = new Intent(MainActivity.this, RealmBasedToDoListActivity.class);
        startActivity(intent);
    }
}
