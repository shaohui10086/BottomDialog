package me.shaohui.bottomdialog;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.FragmentManager;
import android.view.View;

/**
 * Created by shaohui on 16/10/11.
 */

public class BottomDialog extends BaseBottomDialog {

    private static final String KEY_LAYOUT_RES = "bottom_layout_res";
    private static final String KEY_HEIGHT = "bottom_height";
    private static final String KEY_DIM = "bottom_dim";
    private static final String KEY_CANCEL_OUTSIDE = "bottom_cancel_outside";

    private FragmentManager mFragmentManager;

    private boolean mIsCancelOutside = super.getCancelOutside();

    private String mTag = super.getFragmentTag();

    private float mDimAmount = super.getDimAmount();

    private int mHeight = super.getHeight();

    @LayoutRes
    private int mLayoutRes;
    private View mView;
    private ViewListener mViewListener;

    public static BottomDialog create(FragmentManager manager) {
        BottomDialog dialog = new BottomDialog();
        dialog.setFragmentManager(manager);
        return dialog;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            mLayoutRes = savedInstanceState.getInt(KEY_LAYOUT_RES);
            mHeight = savedInstanceState.getInt(KEY_HEIGHT);
            mDimAmount = savedInstanceState.getFloat(KEY_DIM);
            mIsCancelOutside = savedInstanceState.getBoolean(KEY_CANCEL_OUTSIDE);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        if (mLayoutRes != 0) {

        outState.putInt(KEY_LAYOUT_RES, mLayoutRes);
        }
        outState.putInt(KEY_HEIGHT, mHeight);
        outState.putFloat(KEY_DIM, mDimAmount);
        outState.putBoolean(KEY_CANCEL_OUTSIDE, mIsCancelOutside);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void bindView(View v) {
        if (mViewListener != null) {
            mViewListener.bindView(v);
        }
    }

    @Override
    public int getLayoutRes() {
        return mLayoutRes;
    }

    public BottomDialog setFragmentManager(FragmentManager manager) {
        mFragmentManager = manager;
        return this;
    }

    public BottomDialog setViewListener(ViewListener listener) {
        mViewListener = listener;
        return this;
    }

    public BottomDialog setLayoutRes(@LayoutRes int layoutRes) {
        mLayoutRes = layoutRes;
        return this;
    }

    public BottomDialog setCancelOutside(boolean cancel) {
        mIsCancelOutside = cancel;
        return this;
    }

    public BottomDialog setTag(String tag) {
        mTag = tag;
        return this;
    }

    public BottomDialog setDimAmount(float dim) {
        mDimAmount = dim;
        return this;
    }

    public BottomDialog setHeight(int heightPx) {
        mHeight = heightPx;
        return this;
    }

    @Override
    public float getDimAmount() {
        return mDimAmount;
    }

    @Override
    public int getHeight() {
        return mHeight;
    }

    @Override
    public boolean getCancelOutside() {
        return mIsCancelOutside;
    }

    @Override
    public String getFragmentTag() {
        return mTag;
    }

    @Override
    public View getDialogView() {
        return mView;
    }

    public BottomDialog setDialogView(View view) {
//        getParentFragment().getFragmentManager().set
        mView = view;
        return this;
    }

    public interface ViewListener {
        void bindView(View v);
    }

    public BaseBottomDialog show() {
        show(mFragmentManager);
        return this;
    }
}
