package me.shaohui.bottomdialogexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


public class UFPictureSelectedView extends LinearLayout {

    public UFPictureSelectedView(Context context) {
        super(context);
        initView(context);
    }

    public UFPictureSelectedView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public UFPictureSelectedView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View root = LayoutInflater.from(context).inflate(R.layout.popup_pictures, this);

    }


}
