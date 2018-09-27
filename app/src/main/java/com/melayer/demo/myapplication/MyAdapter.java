package com.melayer.demo.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by melayer on 27/9/18.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<MyItem> dataSet;
    private LayoutInflater inflater;


    public MyAdapter(Context context, List<MyItem> dataSet){
        this.context = context;
        this.dataSet = dataSet;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int position) {
        return dataSet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.single_list,null,false);
        ((ImageView)view.findViewById(R.id.imageView2)).setImageResource(dataSet.get(position).getImageId());
        ((TextView)view.findViewById(R.id.textView3)).setText(dataSet.get(position).getText());

        return view;
    }
}

