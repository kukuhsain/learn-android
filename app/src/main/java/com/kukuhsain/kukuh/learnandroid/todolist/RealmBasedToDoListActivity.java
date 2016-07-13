package com.kukuhsain.kukuh.learnandroid.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.kukuhsain.kukuh.learnandroid.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kukuh on 29/06/16.
 */
public class RealmBasedToDoListActivity extends AppCompatActivity {
    private String TAG = "RealmBasedToDoListActivity";
    private ListView toDoListView;
    private ListAdapter listAdapter;
    private List<String> toDoItems = new ArrayList<String>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_based_todolist);

        toDoListView = (ListView) findViewById(R.id.todolist_view);
        toDoItems.add("satu");
        toDoItems.add("dua");
        toDoItems.add("tiga");
        Log.d(TAG, "list size: "+toDoItems.size());
        listAdapter = new ToDoListAdapter(toDoItems, getApplicationContext());
        toDoListView.setAdapter(listAdapter);
    }
}
