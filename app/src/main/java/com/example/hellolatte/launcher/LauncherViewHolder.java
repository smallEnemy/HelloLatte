package com.example.hellolatte.launcher;

import android.view.View;

import com.bigkoo.convenientbanner.holder.Holder;
import com.example.hellolatte.R;

/**
 * Created by 57585 on 2019/2/24.
 */

public class LauncherViewHolder extends Holder<Integer> {

//    private View mImageView = null;

    public LauncherViewHolder(View itemView){
        super(itemView);
    }

    @Override
    protected void initView(View itemView) {
//        mImageView = itemView;
    }

    @Override
    public void updateUI(Integer data) {
        itemView.setBackgroundResource(data);
    }
}
