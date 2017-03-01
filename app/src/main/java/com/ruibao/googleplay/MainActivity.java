package com.ruibao.googleplay;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.astuetz.PagerSlidingTabStrip;
import com.ruibao.googleplay.base.FragmentFactory;
import com.ruibao.googleplay.utils.UIUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_left)
    FrameLayout mMainLeft;
    @BindView(R.id.main_right)
    FrameLayout mMainRight;
    @BindView(R.id.drawerlayout)
    DrawerLayout mDrawerlayout;
    @BindView(R.id.main_viewpager)
    ViewPager mMainViewpager;
    @BindView(R.id.main_tabs)
    PagerSlidingTabStrip mMainTabs;


    private ActionBar mActionBar;
    private ActionBarDrawerToggle mToggle;
    private String[] mMainTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTabs();
        initActionBar();
        initActionBarDrawerToggle();
        initData();
    }

    private void initTabs() {
    }

    private void initActionBar() {
        mActionBar = getSupportActionBar();
        mActionBar.setTitle("googleplay");
        mActionBar.setDisplayHomeAsUpEnabled(true);
    }

    /*
    * 初始化ActionBarDrawerToggle
    * */
    private void initActionBarDrawerToggle() {
        mToggle = new ActionBarDrawerToggle(this,
                mDrawerlayout, R.string.open, R.string.close);

        mToggle.syncState();

        mDrawerlayout.setDrawerListener(mToggle);
    }

    private void initData() {
        mMainTitles = UIUtils.getStrings(R.array.main_titles);
        MainFragmentPagerAdapter adapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mMainViewpager.setAdapter(adapter);

mMainTabs.setViewPager(mMainViewpager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                //MyToast.show("点击了返回键");

                mToggle.onOptionsItemSelected(item);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    class MainFragmentPagerAdapter extends FragmentStatePagerAdapter {

        public MainFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Fragment fragment = FragmentFactory.createFragment(position);
            return fragment;
        }

        @Override
        public int getCount() {
            if (mMainTitles != null) {
                return mMainTitles.length;
            }
            return 0;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mMainTitles[position];
        }
    }
}
