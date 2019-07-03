package com.panj.imoocmusic.Utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;

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
}
