package com.brilliant.hxim;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.brilliant.hximlibrary.MainFragment;
import com.brilliant.hximlibrary.widget.BadgeActionProvider;

public class MainActivity extends AppCompatActivity {

    // 联系人点击的监听
    private static final int DELETE_WHAT = 0X01;

    // Toolbar菜单中的联系人按钮。
    private BadgeActionProvider mDeleteBadgeActionProvider;

    private MainFragment mMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar2();
        initFragment(savedInstanceState);
    }

    /**
     * toolbar初始化
     */
    private void initToolbar2() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar_2);
        // 必须添加，否则 onCreateOptionsMenu 不会执行
        setSupportActionBar(toolbar);
        // 设置 toolbar 背景色
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        //添加溢出菜单
        toolbar.inflateMenu(R.menu.setting_menu);
        // 添加菜单点击事件
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_search:
                        //点击菜单
                        break;
                    case R.id.item_contact:
                        //点击菜单
                        break;
                    case R.id.item_collect_qunliao:
                        //点击菜单
                        break;
                    case R.id.item_collect_addnew:
                        //点击菜单
                        break;
                    case R.id.item_collect_QR:
                        //点击菜单
                        break;
                }
                return false;
            }
        });
    }

    /**
     * 初始化fragmetn
     *
     * @param savedInstanceState
     */
    private void initFragment(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mMainFragment = (MainFragment) getSupportFragmentManager()
                    .getFragment(savedInstanceState, "MainFragment");
        } else {
            mMainFragment = MainFragment.newInstance();
        }

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_fragment, mMainFragment)
                .commit();
    }

    /**
     * 当活动被回收时，存储当前的状态。
     *
     * @param outState 状态数据。
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // 存储 Fragment 的状态。
        getSupportFragmentManager().putFragment(outState, "MainFragment", mMainFragment);
    }

    /**
     * Toolbar自定义菜单，点击监听。
     */
    private BadgeActionProvider.OnClickListener onClickListener = new BadgeActionProvider.OnClickListener() {
        @Override
        public void onClick(int what) {
            Toast.makeText(MainActivity.this, "删除", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.setting_menu, menu);

        // 联系人
        MenuItem menuItem = menu.findItem(R.id.item_contact);
        mDeleteBadgeActionProvider = (BadgeActionProvider) MenuItemCompat.getActionProvider(menuItem);
        mDeleteBadgeActionProvider.setOnClickListener(DELETE_WHAT, onClickListener);

        return true;
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //=== 控制展示红色标识
        if (mDeleteBadgeActionProvider != null) {
            mDeleteBadgeActionProvider.setIcon(R.mipmap.ic_favorite_more);
            mDeleteBadgeActionProvider.setBadge(99);
        }

    }

}
