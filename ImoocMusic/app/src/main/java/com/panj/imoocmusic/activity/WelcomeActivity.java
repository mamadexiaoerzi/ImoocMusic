package com.panj.imoocmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.panj.imoocmusic.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 欢迎界面
 * 延迟三秒后跳转到主界面
 */
public class WelcomeActivity extends BaseActivity {

    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        init();
    }

    /**
     * 初始化
     */
    private void init() {
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Log.e("WelcomeActivity", "当前线程为：" + Thread.currentThread());
                toMain();
            }
        }, 3 * 1000);
    }

    /**
     * 跳转到MainActivity
     */
    private void toMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
