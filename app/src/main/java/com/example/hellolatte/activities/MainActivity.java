package com.example.hellolatte.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.hellolatte.R;
import com.example.hellolatte.net.RestClient;
import com.example.hellolatte.net.callback.IError;
import com.example.hellolatte.net.callback.IFailure;
import com.example.hellolatte.net.callback.IRequest;
import com.example.hellolatte.net.callback.ISuccess;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestClient restClient = RestClient.builder()
                .url("http://v.juhe.cn/weixin/query")
                .params("pno", "1")
                .params("ps","20")
                .params("dtype","json")
                .params("key","05ff0656018cf296a93737be6dc4a1e4")
                .loader(MainActivity.this)
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Toast.makeText(MainActivity.this,response,Toast.LENGTH_LONG).show();
                    }
                }).request(new IRequest() {
                    @Override
                    public void onRequestStart() {

                    }

                    @Override
                    public void onRequestEnd() {

                    }
                }).error(new IError() {
                    @Override
                    public void onError(int code, String msg) {

                    }
                }).failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                }).build();
        restClient.post();
    }
}
