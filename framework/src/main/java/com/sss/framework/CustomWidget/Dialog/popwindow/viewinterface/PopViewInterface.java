package com.sss.framework.CustomWidget.Dialog.popwindow.viewinterface;

import android.view.View;

import com.sss.framework.CustomWidget.Dialog.popwindow.PopItemAction;
import com.sss.framework.CustomWidget.Dialog.popwindow.PopWindow;


/**
 * Created by HMY on 2016/9/10.
 */
public interface PopViewInterface {

    void setTitleColor(int color);

    void setTitleTextSize(int textSize);

    void setMessageColor(int color);

    void setMessageTextSize(int textSize);

    void setTitleAndMessage(CharSequence title, CharSequence message);

    void addContentView(View view);

    void setPopWindow(PopWindow popWindow);

    void addItemAction(PopItemAction popItemAction);

    boolean showAble();

    void refreshBackground();

    void setIsShowLine(boolean isShowLine);

    void setIsShowCircleBackground(boolean isShow);
}
