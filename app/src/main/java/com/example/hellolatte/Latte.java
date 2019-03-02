package com.example.hellolatte;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by 57585 on 2019/2/23.
 */

public final class Latte {

    private static final HashMap<String,Context> CONTEXT = new HashMap<>();

    public static void init(Context context){
        CONTEXT.put("context",context.getApplicationContext());
    }

    public static Context getApplicationContext(){
        return CONTEXT.get("context");
    }
}
