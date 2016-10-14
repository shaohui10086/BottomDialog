# BottomDialog
[![build](https://img.shields.io/badge/build-1.1.9-brightgreen.svg?maxAge=2592000)](https://bintray.com/shaohui/maven/BottomDialog)
[![license](https://img.shields.io/badge/license-Apache%202-blue.svg?maxAge=2592000)](https://github.com/shaohui10086/BottomDialog/blob/master/LICENSE)

[中文版](/README_ZH.md)


`BottomDialog` is a bottom dialog layout implemented with `DialogFragment`，And supports pop-up animation, support any layout

## Preview
![BottomDialogShare](/preview/bottom_dialog_share.gif)
![BottomDialogShare](/preview/bottom_dialog_edit.gif)
## Import

Maven

    <dependency>
      <groupId>me.shaohui</groupId>
      <artifactId>bottomdialog</artifactId>
      <version>1.1.9</version>
      <type>pom</type>
    </dependency>
    
or Gradle

	compile 'me.shaohui:bottomdialog:1.1.9'

## Uasge

You can use `BottomDialog` in two different ways ：

### 1.Use directly `BottomDialog`

A simple three lines of code can be done:
    
    BottomDialog.create(getSupportFragmentManager())
                    .setLayoutRes(R.layout.dialog_layout)      // dialog layout
                    .show();
                    
Of course, you can also make simple settings:

    BottomDialog.create(getSupportFragmentManager())
                    .setViewListener(new BottomDialog.ViewListener() {    
                        @Override
                        public void bindView(View v) {
                            // // You can do any of the necessary the operation with the view
                        }
                    })
                    .setLayoutRes(R.layout.dialog_layout)  
                    .setDimAmount(0.1f)            // Dialog window dim amount(can change window background color）, range：0 to 1，default is : 0.2f
                    .setCancelOutside(false)     // click the external area whether is closed, default is : true
                    .setTag("BottomDialog")     // setting the DialogFragment tag
                    .show();

So Easy！

### 2.or extends `BaseBottomDialog` to use

First of all, according to your needs to define a class，extends `BaseBottomDialog`，For example below `ShareBottomDialog`
    
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

So simple, only two abstract methods needed to achieve, the rest is to add your logic. Of course, you can also rewrite some of the necessary methods to meet your needs, You can manipulate this Dialog as you would a Fragment

    int getHeight()                 // return your bottomDialog height

    float getDimAmount()            // set dialog dim amount（can change window background color）, default is 0.2f

    boolean getCancelOutside()      // click the external area whether is closed, default is : true

    String getFragmentTag()         // set dialogFragment tag

The rest is use it：

        ShareBottomDialog dialog = new ShareBottomDialog();
        dialog.show(getFragmentManager());

That is all！

## Issue

If you are in the process of using, encountered any problems, welcome to put forward issue

## License

    Copyright 2016 shaohui10086

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
	
 
 
