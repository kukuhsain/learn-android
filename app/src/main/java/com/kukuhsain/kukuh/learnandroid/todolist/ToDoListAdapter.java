package com.kukuhsain.kukuh.learnandroid.todolist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kukuhsain.kukuh.learnandroid.R;

import java.util.List;

/**
 * Created by kukuh on 29/06/16.
 */
public class ToDoListAdapter extends BaseAdapter {
    private String TAG = "ToDoListAdapter";
    private List<String> toDoItems;
    private LayoutInflater inflater;

    public ToDoListAdapter(List<String> toDoItems, Context context) {
        super();
        this.toDoItems = toDoItems;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return toDoItems.size();
    }

    @Override
    public Object getItem(int position) {
        return toDoItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();

        convertView = inflater.inflate(R.layout.item_todolist, parent, false);
        holder.itemTitleView = (TextView) convertView.findViewById(R.id.item_title);
        holder.itemDescriptionView = (TextView) convertView.findViewById(R.id.item_description);

        convertView.setTag(holder);

        Log.d(TAG, "items: "+toDoItems.get(position));
        holder.itemTitleView.setText(toDoItems.get(position));
        return convertView;
    }

    static class Holder {
        TextView itemTitleView;
        TextView itemDescriptionView;
    }
}
