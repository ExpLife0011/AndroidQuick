package com.androidwind.androidquick.demo.features.architecture.segment.type2.mvp;

import android.view.View;

import com.androidwind.androidquick.demo.features.architecture.segment.type2.BaseModule;
import com.androidwind.androidquick.demo.tool.TUtil;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class BaseTModule<T extends BasePresenter> extends BaseModule {

    public T mPresenter;

    protected BaseTModule(View rootView) {
        super(rootView);
    }

    @Override
    protected void initView() {
        mPresenter = TUtil.getInstance(this, 0);
        mPresenter.initV(this);
    }

    @Override
    protected void release() {
        mPresenter.unInitV();
    }
}
