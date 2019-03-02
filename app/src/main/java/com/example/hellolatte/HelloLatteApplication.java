package com.example.hellolatte;

import android.app.Application;

/**
 * Created by 57585 on 2019/2/23.
 */

public class HelloLatteApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this);
    }

}
