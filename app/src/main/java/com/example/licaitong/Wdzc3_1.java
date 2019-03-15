package com.example.licaitong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/5.
 */

public class Wdzc3_1 extends BaseAdapter{
    List<Map<String,Object>>list;
    LayoutInflater inflater;

    public Wdzc3_1(Context context) {
        this.inflater=LayoutInflater.from(context);
    }

    public Wdzc3_1(List<Map<String, Object>> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =inflater.inflate(R.layout.wdzc3,null);
        

        return null;
    }
}
