package com.example.hellolatte.timer;

import java.util.TimerTask;

/**
 * Created by 57585 on 2019/2/24.
 */

public class BaseTimeTask extends TimerTask {

    private ITimerListener mITimerListener;

    public BaseTimeTask(ITimerListener listener){
        mITimerListener = listener;
    }

    @Override
    public void run() {
        if (mITimerListener != null) {
            mITimerListener.onTimer();
        }
    }
}
