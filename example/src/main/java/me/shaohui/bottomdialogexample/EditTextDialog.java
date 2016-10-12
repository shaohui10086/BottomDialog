package me.shaohui.bottomdialogexample;

import android.view.View;
import me.shaohui.bottomdialog.BaseBottomDialog;

/**
 * Created by shaohui on 16/10/12.
 */

public class EditTextDialog extends BaseBottomDialog {
    @Override
    public int getLayoutRes() {
        return R.layout.dialog_edit_text;
    }

    @Override
    public void bindView(View v) {

    }
}
