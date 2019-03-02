package com.example.hellolatte.recycler;

import android.text.TextUtils;

import java.util.ArrayList;

/**
 * Created by 57585 on 2019/2/26.
 */

public abstract class DataConverter {

    private String mJsonData = null;

    private final ArrayList<MultipleItemEntity> ENTITIES =
            new ArrayList<MultipleItemEntity>();

    protected abstract ArrayList<MultipleItemEntity> convert();

    public void setJsonData(String jsonData) {
        mJsonData = jsonData;
    }

    public String getJsonData() {
        if (TextUtils.isEmpty(mJsonData)) {
            throw new NullPointerException("JsonData不能为空");
        }
        return mJsonData;
    }

    public void clear() {
        ENTITIES.clear();
    }
}
