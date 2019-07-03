package com.panj.imoocmusic.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.IdRes;

import com.panj.imoocmusic.R;

/**
 * 项目中所有Activity的父类，用来描述所有Activity的共性
 */
public class BaseActivity extends Activity {

    private ImageView mIvBack, mIvMe;
    private TextView mTvTitle;

    /**
     * findViewById
     *
     * @param id  资源id
     * @param <T> View
     * @return 资源id对应的View
     */
    protected <T extends View> T fd(@IdRes int id) {
        return findViewById(id);
    }

    /**
     * 初始化NavigationBar
     *
     * @param isShowBack 是否显示back图标
     * @param title      标题
     * @param isShowMe   是否显示me图标
     */
    protected void initNavBar(boolean isShowBack, String title, boolean isShowMe) {
        mIvBack = fd(R.id.iv_back);
        mIvMe = fd(R.id.iv_me);
        mTvTitle = fd(R.id.tv_title);

        mIvBack.setVisibility(isShowBack ? View.VISIBLE : View.GONE);
        mIvMe.setVisibility(isShowMe ? View.VISIBLE : View.GONE);
        mTvTitle.setText(title);

        mIvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        mIvMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                跳转到个人中心页面
                startActivity(new Intent(BaseActivity.this, MeActivity.class));
            }
        });
    }

}
