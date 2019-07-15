package com.panj.imoocmusic.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.panj.imoocmusic.R;
import com.panj.imoocmusic.activity.LoginActivity;

public class UserUtils {

    /**
     * 验证登陆用户合法性
     */
    public static boolean validateLogin(Context context, String phone, String password) {
//        简单的验证手机号
        RegexUtils.isMobileSimple(password);
//        精确的验证手机号
        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    public static void logout(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
//        添加Intent标志符，清理Task栈，并且新生成一个Task栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
//        定义Activity跳转动画
        ((Activity) context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    }
}
