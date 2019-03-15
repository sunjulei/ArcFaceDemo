package com.example.licaitong;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.*;
/**
 * Created by Administrator on 2017/6/4.
 */

public class SPQQ {
    public static boolean saveUserInfo(Context context,String number,String password){
        SharedPreferences sp = context.getSharedPreferences("data",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit =sp.edit();
        edit.putString("userName",number);
        edit.putString("pwd",password);
        edit.commit();
        return true;
    }

    public static Map<String, String> getUserInfo(Context context) {
        SharedPreferences sp=context.getSharedPreferences("data",Context.MODE_PRIVATE);
        String number =sp.getString("userName",null);
        String password =sp.getString("pwd",null);
        Map<String,String>userMap=new HashMap<String,String>();
        userMap.put("number",number);
        userMap.put("password",password);
        return userMap;
    }
}
