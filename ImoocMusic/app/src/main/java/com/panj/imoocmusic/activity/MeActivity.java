package com.panj.imoocmusic.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.panj.imoocmusic.R;
import com.panj.imoocmusic.utils.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        initView();
    }

    private void initView() {
        initNavBar(true, "个人中心", false);
    }

    /**
     * 修改密码
     */
    public void onChangeClick(View view) {
        startActivity(new Intent(this, ChangePasswordActivity.class));
    }

    /**
     * 退出登录
     */
    public void onLogoutClick(View view) {
        UserUtils.logout(this);
    }
}
