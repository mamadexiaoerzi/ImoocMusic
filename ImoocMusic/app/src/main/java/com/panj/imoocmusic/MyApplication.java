package com.panj.imoocmusic;

import android.app.Application;

import com.blankj.utilcode.util.Utils;

/**
 * 全局单例对象，存储系统信息
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化AndroidUtilCode
        Utils.init(this);
    }
}
