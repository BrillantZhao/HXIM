package com.brilliant.hximlibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * description: im的主页面
 * Date: 2017/10/15 16:34
 * User: zhaobrillant
 */
public class MainFragment extends Fragment {

    /**
     * Fragment 的构造函数。
     */
    public MainFragment() {
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initViews(view);
        return view;
    }

    /**
     * 初始化 Views
     *
     * @param view Fragment 对应的布局控件。
     */
    private void initViews(View view) {
        // TODO: Init views.
    }
}

