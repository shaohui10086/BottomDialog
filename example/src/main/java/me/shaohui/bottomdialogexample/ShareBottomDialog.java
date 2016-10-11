package me.shaohui.bottomdialogexample;

import android.app.FragmentManager;
import android.view.View;
import me.shaohui.bottomdialog.BaseBottomDialog;

/**
 * Created by shaohui on 16/10/11.
 */

public class ShareBottomDialog extends BaseBottomDialog{

    @Override
    public int getLayoutRes() {
        return R.layout.dialog_layout;
    }

    @Override
    public void bindView(View v) {
        // do any thing you want
    }
}
