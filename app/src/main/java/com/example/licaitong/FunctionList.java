package com.example.licaitong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/6/5.
 */

public class FunctionList extends BaseAdapter {
    private Context mContext;


    public FunctionList(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


//        ImageView imageView;
//        if (convertView == null) {
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        } else {
//            imageView = (ImageView) convertView;
//        }
//
//        imageView.setImageResource(mThumbIds[position]);
//        return imageView;
//    }

        ImgTextWrapper wrapper;
        if(convertView==null) {
            wrapper = new ImgTextWrapper();

            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(R.layout.item, null);
            convertView.setLayoutParams(new GridView.LayoutParams(200, 200));
            convertView.setTag(wrapper);
            convertView.setPadding(8, 8, 8, 8);  //每格的间距
        } else {
            wrapper = (ImgTextWrapper)convertView.getTag();
        }

        wrapper.imageView = (ImageView)convertView.findViewById(R.id.imageView);
        wrapper.imageView.setBackgroundResource(mThumbIds[position]);
        wrapper.textView = (TextView)convertView.findViewById(R.id.textView);
        wrapper.textView.setText(texts[position]);

        return convertView;
    }

    private String[] texts = {
            "新增支出",
            "新增收入",
            "我的支出",
            "我的收入",
            "数据管理",
            "系统设置",
            "收支便签",
            "退出"
    };

    public Integer[] mThumbIds = {
            R.drawable.a
            , R.drawable.b
            , R.drawable.c
            , R.drawable.d
            , R.drawable.e
            , R.drawable.f
            , R.drawable.g
            , R.drawable.h
    };
}
class ImgTextWrapper{
    ImageView imageView;
    TextView textView;
}




