package com.ruibao.googleplay.base;

import android.support.v4.app.Fragment;

import com.ruibao.googleplay.fragment.AppFragment;
import com.ruibao.googleplay.fragment.CategoryFragment;
import com.ruibao.googleplay.fragment.GameFragment;
import com.ruibao.googleplay.fragment.HomeFragment;
import com.ruibao.googleplay.fragment.HotFragment;
import com.ruibao.googleplay.fragment.RecommondFragment;
import com.ruibao.googleplay.fragment.SubjectFragment;

/**
 * Created by lenovo on 2017/3/1.
 */

public class FragmentFactory {
    public static final int FRAGMENT_HOME = 0;//首页
    public static final int FRAGMENT_APP = 1;//应用
    public static final int FRAGMENT_GAME = 2;//游戏
    public static final int FRAGMENT_SUBJECT = 3;//专题
    public static final int FRAGMENT_RECOMMOND = 4;//推荐
    public static final int FRAGMENT_CATEGORY = 5;//分类
    public static final int FRAGMENT_HOT = 6;//排行

    public static Fragment createFragment(int position) {
        Fragment fragment = null;

        switch (position){
            case FRAGMENT_HOME:
                fragment = new HomeFragment();
                break;
            case FRAGMENT_APP:
                fragment = new AppFragment();
                break;
            case FRAGMENT_GAME:
                fragment = new GameFragment();
                break;
            case FRAGMENT_SUBJECT:
                fragment = new SubjectFragment();
                break;
            case FRAGMENT_RECOMMOND:
                fragment = new RecommondFragment();
                break;
            case FRAGMENT_CATEGORY:
                fragment = new CategoryFragment();
                break;
            case FRAGMENT_HOT:
                fragment = new HotFragment();
                break;
        }

        return fragment;
    }
}
