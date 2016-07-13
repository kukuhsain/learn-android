package com.kukuhsain.kukuh.learnandroid.todolist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realm_based_todolist);

        toDoListView = (ListView) findViewById(R.id.todolist_view);

        String[] toDos = setupToDoList();

        listAdapter = new ToDoListAdapter(getApplicationContext(), toDos);
        toDoListView.setAdapter(listAdapter);
    }

    private String[] setupToDoList() {
        List<String> toDoItems = new ArrayList<String>();
        toDoItems.add("One");
        toDoItems.add("Two");
        toDoItems.add("Three");
        toDoItems.add("Four");
        toDoItems.add("Five");

        String[] toDoArray = new String[toDoItems.size()];
        toDoItems.toArray(toDoArray);

        return toDoArray;
    }
}
