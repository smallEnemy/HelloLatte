package com.example.hellolatte.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

import com.example.hellolatte.R;
import com.example.hellolatte.timer.BaseTimeTask;
import com.example.hellolatte.timer.ITimerListener;

import java.text.MessageFormat;
import java.util.Timer;

/**
 * Created by 57585 on 2019/2/24.
 */

public class SplashActivity extends AppCompatActivity implements ITimerListener {

    private AppCompatTextView mTimerView = null;
    private Timer mTimer;
    private int mCount = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
        initTimer();

    }

    private void initView() {
        mTimerView = findViewById(R.id.tv_launcher_timer);
        mTimerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashActivity.this, AdsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initTimer() {
        mTimer = new Timer();
        BaseTimeTask timeTask = new BaseTimeTask(this);
        mTimer.schedule(timeTask, 0, 1000);
    }

    @Override
    public void onTimer() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (mTimerView != null) {
                    mTimerView.setText(MessageFormat.format("跳过\n{0}s", mCount));
                    mCount--;
                    if (mCount < 0) {
                        if (mTimer != null) {
                            mTimer.cancel();
                            mTimer = null;
                        }
                    }
                }
            }
        });
    }
}
