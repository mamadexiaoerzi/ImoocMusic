package com.panj.imoocmusic.activity;

import android.os.Bundle;
import android.view.View;

import com.panj.imoocmusic.R;

public class ChangePasswordActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        initView();
    }

    private void initView() {
        initNavBar(true, "修改密码", false);
    }

    public void onCommitClick(View view) {

    }
}
