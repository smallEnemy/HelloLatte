package com.example.hellolatte.launcher;

import android.view.View;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.example.hellolatte.R;

/**
 * Created by 57585 on 2019/2/24.
 */

public class LauncherHolderCreator implements CBViewHolderCreator {

    @Override
    public Holder createHolder(View itemView) {
        return new LauncherViewHolder(itemView);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }
}
