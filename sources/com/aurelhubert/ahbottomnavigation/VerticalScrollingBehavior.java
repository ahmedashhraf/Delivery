package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.core.p034l.C1006n0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VerticalScrollingBehavior<V extends View> extends C0712c<V> {

    /* renamed from: a */
    private int f10330a = 0;

    /* renamed from: b */
    private int f10331b = 0;

    /* renamed from: c */
    private int f10332c = 0;

    /* renamed from: d */
    private int f10333d = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.aurelhubert.ahbottomnavigation.VerticalScrollingBehavior$a */
    public @interface C2907a {

        /* renamed from: h */
        public static final int f10334h = 1;

        /* renamed from: i */
        public static final int f10335i = -1;

        /* renamed from: j */
        public static final int f10336j = 0;
    }

    public VerticalScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public abstract void mo11562a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* renamed from: a */
    public void mo3991a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        super.mo3991a(coordinatorLayout, v, view, view2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo11565a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i);

    /* renamed from: b */
    public int mo11573b() {
        return this.f10332c;
    }

    /* renamed from: b */
    public abstract void mo11566b(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    /* renamed from: b */
    public boolean mo4005b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public int mo11574c() {
        return this.f10333d;
    }

    /* renamed from: d */
    public void mo4010d(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.mo4010d(coordinatorLayout, v, view);
    }

    /* renamed from: a */
    public void mo3986a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        super.mo3986a(coordinatorLayout, v, view, i, i2, i3, i4);
        if (i4 > 0 && this.f10330a < 0) {
            this.f10330a = 0;
            this.f10332c = 1;
        } else if (i4 < 0 && this.f10330a > 0) {
            this.f10330a = 0;
            this.f10332c = -1;
        }
        this.f10330a += i4;
        mo11562a(coordinatorLayout, v, this.f10332c, i2, this.f10330a);
    }

    /* renamed from: d */
    public Parcelable mo4009d(CoordinatorLayout coordinatorLayout, V v) {
        return super.mo4009d(coordinatorLayout, v);
    }

    public VerticalScrollingBehavior() {
    }

    /* renamed from: a */
    public void mo3989a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        super.mo3989a(coordinatorLayout, v, view, i, i2, iArr);
        if (i2 > 0 && this.f10331b < 0) {
            this.f10331b = 0;
            this.f10333d = 1;
        } else if (i2 < 0 && this.f10331b > 0) {
            this.f10331b = 0;
            this.f10333d = -1;
        }
        this.f10331b += i2;
        mo11566b(coordinatorLayout, v, view, i, i2, iArr, this.f10333d);
    }

    /* renamed from: a */
    public boolean mo4001a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        super.mo4001a(coordinatorLayout, v, view, f, f2, z);
        this.f10333d = f2 > 0.0f ? 1 : -1;
        return mo11565a(coordinatorLayout, v, view, f, f2, this.f10333d);
    }

    /* renamed from: a */
    public boolean mo4000a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return super.mo4000a(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: a */
    public C1006n0 mo3981a(CoordinatorLayout coordinatorLayout, V v, C1006n0 n0Var) {
        return super.mo3981a(coordinatorLayout, v, n0Var);
    }
}
