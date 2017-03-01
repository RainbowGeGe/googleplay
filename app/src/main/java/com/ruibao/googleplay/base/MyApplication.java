package com.ruibao.googleplay.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Process;

/**
 * Created by lenovo on 2017/2/28.
 */

public class MyApplication extends Application {

    private static Context mContext;
    private static Handler mMainThreadHandler;
    private static int mMainThreadId;

    @Override
    public void onCreate() {

        mContext = getApplicationContext();

        mMainThreadHandler = new Handler();

        /*
        * 获取主线程的id
        * mytid:thread
        * myPid:process
        * myUid:user
        * */
        mMainThreadId = Process.myTid();

        super.onCreate();
    }

    public static Context getContext(){
        return mContext;
    }

    public static Handler getMainThreadHandler() {
        return mMainThreadHandler;
    }

    public static int getMainThreadId() {
        return mMainThreadId;
    }
}
