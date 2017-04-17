package com.example.lining.second.MyShopApplication;

import android.app.Application;


/**
 * Created by 李宁 on 2017/3/18.
 */
public class MyApplication extends Application {
    /**
     * 记录是否自动登录
     */
    private boolean IsCheckLogin;
    /**
     * 记录用户登录后的密钥KEY
     */
    private String loginKey;

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;

        // System.out.println("@@@@@@@@@@@@@@@@setLoginKey      loginKey:"+ loginKey);
        //        sysInitSharedPreferences.edit().putString("loginKey", this.loginKey).commit();
    }

    public String getLoginKey() {
        //        String loginKey = sysInitSharedPreferences.getString("loginKey", "");

        //System.out.println("@@@@@@@@@@@@@@@@@@getLoginKey      loginKey:"+ loginKey);
        return loginKey;
    }


}
