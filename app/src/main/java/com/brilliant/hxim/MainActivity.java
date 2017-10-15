package com.brilliant.hxim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar2();
    }

    /**
     * toolbar初始化
     */
    private void initToolbar2() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar_2);
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



}
