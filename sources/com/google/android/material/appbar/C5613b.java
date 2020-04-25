package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p027g.C0890a;
import androidx.core.p034l.C0962e0;

/* renamed from: com.google.android.material.appbar.b */
/* compiled from: HeaderBehavior */
abstract class C5613b<V extends View> extends C5616d<V> {

    /* renamed from: k */
    private static final int f16038k = -1;
    @C0195i0

    /* renamed from: d */
    private Runnable f16039d;

    /* renamed from: e */
    OverScroller f16040e;

    /* renamed from: f */
    private boolean f16041f;

    /* renamed from: g */
    private int f16042g = -1;

    /* renamed from: h */
    private int f16043h;

    /* renamed from: i */
    private int f16044i = -1;
    @C0195i0

    /* renamed from: j */
    private VelocityTracker f16045j;

    /* renamed from: com.google.android.material.appbar.b$a */
    /* compiled from: HeaderBehavior */
    private class C5614a implements Runnable {

        /* renamed from: a */
        private final CoordinatorLayout f16047a;

        /* renamed from: b */
        private final V f16048b;

        C5614a(CoordinatorLayout coordinatorLayout, V v) {
            this.f16047a = coordinatorLayout;
            this.f16048b = v;
        }

        public void run() {
            if (this.f16048b != null) {
                OverScroller overScroller = C5613b.this.f16040e;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    C5613b bVar = C5613b.this;
                    bVar.mo22229c(this.f16047a, this.f16048b, bVar.f16040e.getCurrY());
                    C0962e0.m5451a((View) this.f16048b, (Runnable) this);
                    return;
                }
                C5613b.this.mo22134e(this.f16047a, this.f16048b);
            }
        }
    }

    public C5613b() {
    }

    /* renamed from: g */
    private void mo22136g() {
        if (this.f16045j == null) {
            this.f16045j = VelocityTracker.obtain();
        }
    }

    /* renamed from: a */
    public boolean mo3998a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 MotionEvent motionEvent) {
        if (this.f16044i < 0) {
            this.f16044i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f16041f) {
            int i = this.f16042g;
            if (i == -1) {
                return false;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f16043h) > this.f16044i) {
                this.f16043h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f16042g = -1;
            int y2 = (int) motionEvent.getY();
            this.f16041f = mo22130b(v) && coordinatorLayout.mo3936a((View) v, (int) motionEvent.getX(), y2);
            if (this.f16041f) {
                this.f16043h = y2;
                this.f16042g = motionEvent.getPointerId(0);
                mo22136g();
                OverScroller overScroller = this.f16040e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f16040e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f16045j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo22130b(V v) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4003b(@androidx.annotation.C0193h0 androidx.coordinatorlayout.widget.CoordinatorLayout r12, @androidx.annotation.C0193h0 V r13, @androidx.annotation.C0193h0 android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f16042g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f16043h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f16042g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f16043h
            int r7 = r1 - r0
            r11.f16043h = r0
            int r8 = r11.mo22131c(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo22227a(r5, (V) r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f16045j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f16045j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f16045j
            int r4 = r11.f16042g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo22133d(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo22228a(r6, (V) r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f16041f = r3
            r11.f16042g = r1
            android.view.VelocityTracker r13 = r11.f16045j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f16045j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f16045j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f16041f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C5613b.mo4003b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo22229c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo22127b(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo22133d(@C0193h0 V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo22134e(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo22135f() {
        return mo22147c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo22131c(@C0193h0 V v) {
        return -v.getHeight();
    }

    public C5613b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo22227a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo22127b(coordinatorLayout, v, mo22135f() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo22127b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int c = mo22147c();
        if (i2 != 0 && c >= i2 && c <= i3) {
            int a = C0890a.m5110a(i, i2, i3);
            if (c != a) {
                mo22146b(a);
                return c - a;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo22228a(CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f16039d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f16039d = null;
        }
        if (this.f16040e == null) {
            this.f16040e = new OverScroller(v.getContext());
        }
        this.f16040e.fling(0, mo22147c(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f16040e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f16039d = new C5614a(coordinatorLayout, v);
            C0962e0.m5451a((View) v, this.f16039d);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo22134e(coordinatorLayout, v);
        return false;
    }
}
