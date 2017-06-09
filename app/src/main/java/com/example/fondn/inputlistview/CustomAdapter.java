package com.example.fondn.inputlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Store> data = new ArrayList<>();
    private static LayoutInflater layoutInflater = null;
    public CustomAdapter(Context context, ArrayList<Store> data) {
        this.context = context;
        this.data = data;
        layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.layout,null);
        Store store = data.get(position);
        TextView textView;
        textView = (TextView) convertView.findViewById(R.id.textViewLayoutTextViewID);
        textView.setText(store.getName());
        return convertView;
    }
}
