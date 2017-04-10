package me.shaohui.bottomdialogexample;

import android.view.View;

import me.shaohui.bottomdialog.BaseBottomDialog;

/**
 * Created by shaohui on 16/10/11.
 */

public class ShareBottomDialog extends BaseBottomDialog {

    @Override
    public int getLayoutRes() {
        return R.layout.layout;
    }

    @Override
    public void bindView(View v) {
        // do any thing you want
    }

    @Override
    public View getDialogView() {
        return null;
    }
}
