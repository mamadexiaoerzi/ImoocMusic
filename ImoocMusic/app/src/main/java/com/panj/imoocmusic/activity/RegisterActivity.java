package com.panj.imoocmusic.activity;

import android.os.Bundle;
import android.view.View;

import com.panj.imoocmusic.R;

public class RegisterActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        initNavBar(true, "注册", false);
    }

    public void onRegisterClick(View view) {
    }
}
