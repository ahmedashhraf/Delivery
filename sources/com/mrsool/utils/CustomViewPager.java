package com.mrsool.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {

    /* renamed from: a */
    private Boolean f32726a = Boolean.valueOf(false);

    public CustomViewPager(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo39695a(Boolean bool) {
        this.f32726a = bool;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f32726a.booleanValue() && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.f32726a.booleanValue() && super.onTouchEvent(motionEvent);
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
