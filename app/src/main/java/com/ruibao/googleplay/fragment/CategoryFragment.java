package com.ruibao.googleplay.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ruibao.googleplay.utils.UIUtils;

/**
 * Created by lenovo on 2017/3/1.
 */
public class CategoryFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView tv = new TextView(UIUtils.getContext());
        tv.setText("CategoryFragment");
        tv.setGravity(Gravity.CENTER);
        return tv;
    }
}
