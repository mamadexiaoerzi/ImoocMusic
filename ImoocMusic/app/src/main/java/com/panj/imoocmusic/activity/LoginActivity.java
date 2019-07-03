package com.panj.imoocmusic.activity;

import android.os.Bundle;

import com.panj.imoocmusic.R;

// NavigationBar - IOS 统一风格
// ToolBar - MaterialDesign风格

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    /**
     * 初始化View
     */
    private void initView() {
        initNavBar(false, "登录", false);
    }
}
