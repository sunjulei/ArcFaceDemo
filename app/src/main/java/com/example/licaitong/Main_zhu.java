package com.example.licaitong;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by Administrator on 2017/5/10.
 */

public class Main_zhu extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_zhu);
        GridView gridView= (GridView) findViewById(R.id.gridView);
        gridView. setAdapter(new FunctionList(this));
        gridView.setOnItemClickListener(this);
//        ImageView im1 = (ImageView) findViewById(R.id.im1);
//        im1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Xzzc1.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im2 = (ImageView) findViewById(R.id.im2);
//        im2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Xzsr2.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im3 = (ImageView) findViewById(R.id.im3);
//        im3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Wdzc3.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im4 = (ImageView) findViewById(R.id.im4);
//        im4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Wdsr4.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im5 = (ImageView) findViewById(R.id.im5);
//        im5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Sjgl5.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im6 = (ImageView) findViewById(R.id.im6);
//        im6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Xtsz6.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im7 = (ImageView) findViewById(R.id.im7);
//        im7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent =new Intent(Main_zhu.this,Szbq7.class);
//                startActivity(intent);
//            }
//        });
//
//        ImageView im8 = (ImageView) findViewById(R.id.im8);
//        im8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog dialog;
//                dialog =new AlertDialog.Builder(Main_zhu.this).setTitle("退出提示")
//                        .setMessage("\n是否确定退出？")
//                        .setIcon(R.drawable.h)
//                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                System.exit(0);
//                            }
//                        })
//                        .setNegativeButton("取消",null)
//                        .create();
//                dialog.show();
//            }
//        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position){

            case 0: Intent a =new Intent(Main_zhu.this,Xzzc1.class);
                     startActivity(a);
            break;

            case 1: Intent b =new Intent(Main_zhu.this,Xzsr2.class);
                startActivity(b);
            break;

            case 2:Intent c =new Intent(Main_zhu.this,Wdzc3.class);
                startActivity(c);
                break;

            case 3:Intent d =new Intent(Main_zhu.this,Wdsr4.class);
                startActivity(d);
                break;

            case 4:Intent e =new Intent(Main_zhu.this,Sjgl5.class);
                startActivity(e);
                break;

            case 5:Intent f =new Intent(Main_zhu.this,Xtsz6.class);
                startActivity(f);
                break;

            case 6:Intent g =new Intent(Main_zhu.this,Szbq7.class);
                startActivity(g);
                break;

            case 7:
                AlertDialog dialog;
                dialog =new AlertDialog.Builder(Main_zhu.this).setTitle("退出提示")
                        .setMessage("\n是否确定退出？")
                        .setIcon(R.drawable.h)
                        .setPositiveButton("确定",new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("取消",null)
                        .create();
                dialog.show();
                break;
        }
    }
}
