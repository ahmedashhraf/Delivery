package com.google.android.material.p296f;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.f.a */
/* compiled from: InsetDialogOnTouchListener */
public class C6844a implements OnTouchListener {

    /* renamed from: N */
    private final int f19054N;

    /* renamed from: O */
    private final int f19055O;
    @C0193h0

    /* renamed from: a */
    private final Dialog f19056a;

    /* renamed from: b */
    private final int f19057b;

    public C6844a(@C0193h0 Dialog dialog, @C0193h0 Rect rect) {
        this.f19056a = dialog;
        this.f19057b = rect.left;
        this.f19054N = rect.top;
        this.f19055O = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(@C0193h0 View view, @C0193h0 MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f19057b + findViewById.getLeft();
        int top = this.f19054N + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) (findViewById.getWidth() + left), (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(4);
        if (VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f19055O;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f19056a.onTouchEvent(obtain);
    }
}
