package com.milkywaylhy.kakaologin;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Kakao SDK 초기화
        KakaoSdk.init(this, "aba9850ff5c03a3bbbcc924d44bdb86e");
    }
}
