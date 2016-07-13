package com.kukuhsain.kukuh.learnandroid.todolist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kukuhsain.kukuh.learnandroid.R;

/**
 * Created by kukuh on 29/06/16.
 */
public class ToDoListAdapter extends ArrayAdapter<String> {
    private String TAG = "ToDoListAdapter";

    public ToDoListAdapter(Context context, String[] toDos) {
        super(context, R.layout.item_todolist, toDos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View itemView = inflater.inflate(R.layout.item_todolist, parent, false);

        Log.d(TAG, getItem(position));

        TextView toDoItemText = (TextView) itemView.findViewById(R.id.todoitem_text);
        toDoItemText.setText(getItem(position));

        return itemView;
    }
}
