package com.mrsool.customeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

public class NonSwipeableViewPager extends ViewPager {

    /* renamed from: com.mrsool.customeview.NonSwipeableViewPager$a */
    public class C10699a extends Scroller {
        public C10699a(Context context) {
            super(context, new DecelerateInterpolator());
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, 350);
        }
    }

    public NonSwipeableViewPager(Context context) {
        super(context);
        m49301a();
    }

    /* renamed from: a */
    private void m49301a() {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, new C10699a(getContext()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49301a();
    }
}
