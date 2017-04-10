package me.shaohui.bottomdialogexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import me.shaohui.bottomdialog.BottomDialog;

import static me.shaohui.bottomdialog.BottomDialog.create;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.show_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                showDialog();
                //shareDialog();
                showViewDialog();
            }
        });
    }

    private void shareDialog() {
        //ShareBottomDialog dialog = new ShareBottomDialog();
        //dialog.show(getSupportFragmentManager());
        EditTextDialog dialog = new EditTextDialog();
        dialog.show(getSupportFragmentManager());
    }

    private void showDialog() {
        create(getSupportFragmentManager())
                .setViewListener(new BottomDialog.ViewListener() {
                    @Override
                    public void bindView(View v) {
                        initView(v);
                    }
                })
                .setLayoutRes(R.layout.layout)
                .setDimAmount(0.9f)
                .setTag("BottomDialog")
                .show();
    }

    private void showViewDialog() {
        UFPictureSelectedView view = new UFPictureSelectedView(this);

        final BottomDialog dialog = BottomDialog.create(getSupportFragmentManager())
                .setViewListener(new BottomDialog.ViewListener() {
                    @Override
                    public void bindView(View v) {
                        v.findViewById(R.id.item_recommend).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();
                            }
                        });  v.findViewById(R.id.item_take_photo).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                            }
                        });  v.findViewById(R.id.item_get_photo).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                })
                .setDialogView(view)
                .setDimAmount(0.9f)
                .setTag("BottomDialog");
        dialog.show();
    }

    private void initView(final View view) {
        //final EditText editText = (EditText) view.findViewById(R.id.edit_text);
        //editText.post(new Runnable() {
        //    @Override
        //    public void run() {
        //        InputMethodManager inputMethodManager =
        //                (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        //        inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
        //    }
        //});
        //editText.setText("Hello world");
    }
}
