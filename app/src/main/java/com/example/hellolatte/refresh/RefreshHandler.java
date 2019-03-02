package com.example.hellolatte.refresh;

import android.support.v4.widget.SwipeRefreshLayout;

import com.alibaba.fastjson.JSONObject;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.hellolatte.net.RestClient;
import com.example.hellolatte.net.callback.ISuccess;
import com.example.hellolatte.recycler.DataConverter;

/**
 * Created by 57585 on 2019/2/26.
 */

public class RefreshHandler implements SwipeRefreshLayout.OnRefreshListener,
        BaseQuickAdapter.RequestLoadMoreListener {

    private final SwipeRefreshLayout REFRESH_LAYOUT;
    private final DataConverter CONVERTER;

    public RefreshHandler(SwipeRefreshLayout REFRESH_LAYOUT, DataConverter CONVERTER) {
        this.REFRESH_LAYOUT = REFRESH_LAYOUT;
        this.CONVERTER = CONVERTER;
    }

    public static RefreshHandler create(SwipeRefreshLayout swipeRefreshLayout, DataConverter converter) {
        return new RefreshHandler(swipeRefreshLayout, converter);
    }

    public void firstPage(String url){
        RestClient.builder()
                .url(url)
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        final JSONObject object = JSONObject.parseObject(response);
                    }
                }).build().get();
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMoreRequested() {

    }
}
