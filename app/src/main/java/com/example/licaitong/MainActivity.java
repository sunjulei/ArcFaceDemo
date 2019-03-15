package com.example.licaitong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

//    public static Map<String,String>getUserInfo(Context context){
//        SharedPreferences sp= context.getSharedPreferences("data",Context.MODE_PRIVATE);
//        String number=sp.getString("userName",null);
//        Map<String,String>userMap=new HashMap<String,String>();
//        userMap.put("number",number);
//        String pas = userMap.get("number");
//        return userMap;
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);



        Button bt1= (Button) findViewById(R.id.btn_login);
        TextView tv_close= (TextView) findViewById(R.id.tv_close);
        final EditText ed1=(EditText)findViewById(R.id.et_number);


        SharedPreferences sharedPreferences = getSharedPreferences("jzc", Context.MODE_PRIVATE); //创建SharedPreferences对象
        //根据key获取对应的数据
        final String password=sharedPreferences.getString("Password","");
        //txtPassword.setText(password);//给TextView设置text的值

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(ed1.getText().toString().equals(password)) {
                    Intent i = new Intent(MainActivity.this, Main_zhu.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                    finish();
                }
                else if (ed1.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"请输入密码",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"密码错误",Toast.LENGTH_SHORT).show();
                }
            }
        });


        tv_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

    }
}
