package com.mrsool.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class WABottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: e0 */
    private boolean f32760e0 = false;

    public WABottomSheetBehavior() {
    }

    /* renamed from: a */
    public boolean mo3998a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!this.f32760e0) {
            return false;
        }
        return super.mo3998a(coordinatorLayout, v, motionEvent);
    }

    /* renamed from: e */
    public void mo39714e(boolean z) {
        this.f32760e0 = z;
    }

    public WABottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
