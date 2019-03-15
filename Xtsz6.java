package com.example.licaitong;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/6/5.
 */

public class Xtsz6 extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xtsz6);

        final EditText editText= (EditText) findViewById(R.id.editText);
        Button a= (Button) findViewById(R.id.a);
        Button b= (Button) findViewById(R.id.b);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String str=editText.getText().toString();
//                saveUserInfo(Xtsz6.this,str);
                SharedPreferences sharedPreferences = getSharedPreferences("jzc", Context.MODE_PRIVATE);//创建SharedPreferences对象
                SharedPreferences.Editor editor = sharedPreferences.edit(); //需要获取SharedPreferences的编辑对象
                //向preferences写入数据：
                editor.putString("Password", editText.getText().toString());
                editor.commit();// 向preferences文件中提交数据：

                Toast.makeText(Xtsz6.this,"修改成功",Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

    }
//    public boolean saveUserInfo(Context context, String number){
//        SharedPreferences sp=context.getSharedPreferences("data", Context.MODE_PRIVATE);
//        SharedPreferences.Editor edit=sp.edit();
//        edit.putString("userName",number);
//        edit.commit();
//
//        return true;
//
//    }

}