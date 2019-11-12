package com.luck.picture.lib.widget;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.wuhenzhizao.titlebar.statusbar.StatusBarUtils;

public class StatusBarLightMode {

    /**
     * 切换状态栏模式
     */
    public static void toggleStatusBarMode(Activity context) {
        Window window = context.getWindow();
        if (window == null) return;
        StatusBarUtils.transparentStatusBar(window);

    }

}
