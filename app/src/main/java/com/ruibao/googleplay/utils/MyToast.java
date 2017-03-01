package com.ruibao.googleplay.utils;

import android.widget.Toast;

import com.ruibao.googleplay.base.MyApplication;

/**
 * Created by lenovo on 2017/2/28.
 */
public class MyToast {

    public static void show(String string){
        Toast.makeText(MyApplication.getContext(),string,Toast.LENGTH_SHORT).show();
    }
}
