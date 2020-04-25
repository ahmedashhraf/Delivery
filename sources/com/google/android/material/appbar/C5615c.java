package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p027g.C0890a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.C1006n0;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.google.android.material.appbar.c */
/* compiled from: HeaderScrollingViewBehavior */
abstract class C5615c extends C5616d<View> {

    /* renamed from: d */
    final Rect f16049d = new Rect();

    /* renamed from: e */
    final Rect f16050e = new Rect();

    /* renamed from: f */
    private int f16051f = 0;

    /* renamed from: g */
    private int f16052g;

    public C5615c() {
    }

    /* renamed from: d */
    private static int m24431d(int i) {
        return i == 0 ? BadgeDrawable.f16065c0 : i;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: a */
    public abstract View mo22150a(List<View> list);

    /* renamed from: a */
    public boolean mo3995a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo22150a(coordinatorLayout.mo3938b(view));
            if (a != null) {
                int size = MeasureSpec.getSize(i3);
                if (size <= 0) {
                    size = coordinatorLayout.getHeight();
                } else if (C0962e0.m5554s(a)) {
                    C1006n0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
                    if (lastWindowInsets != null) {
                        size += lastWindowInsets.mo4888l() + lastWindowInsets.mo4885i();
                    }
                }
                int d = size + mo22152d(a);
                int measuredHeight = a.getMeasuredHeight();
                if (mo22236h()) {
                    view.setTranslationY((float) (-measuredHeight));
                } else {
                    d -= measuredHeight;
                }
                coordinatorLayout.mo3932a(view, i, i2, MeasureSpec.makeMeasureSpec(d, i5 == -1 ? C6637f.f18605b : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22232b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, int i) {
        View a = mo22150a(coordinatorLayout.mo3938b(view));
        if (a != null) {
            C0716g gVar = (C0716g) view.getLayoutParams();
            Rect rect = this.f16049d;
            rect.set(coordinatorLayout.getPaddingLeft() + gVar.leftMargin, a.getBottom() + gVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - gVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - gVar.bottomMargin);
            C1006n0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0962e0.m5554s(coordinatorLayout) && !C0962e0.m5554s(view)) {
                rect.left += lastWindowInsets.mo4886j();
                rect.right -= lastWindowInsets.mo4887k();
            }
            Rect rect2 = this.f16050e;
            C0984g.m5638a(m24431d(gVar.f3349c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int b = mo22231b(a);
            view.layout(rect2.left, rect2.top - b, rect2.right, rect2.bottom - b);
            this.f16051f = rect2.top - a.getBottom();
            return;
        }
        super.mo22232b(coordinatorLayout, view, i);
        this.f16051f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo22151c(View view) {
        return 1.0f;
    }

    /* renamed from: c */
    public final void mo22233c(int i) {
        this.f16052g = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo22152d(@C0193h0 View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: f */
    public final int mo22234f() {
        return this.f16052g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo22235g() {
        return this.f16051f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo22236h() {
        return false;
    }

    public C5615c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo22231b(View view) {
        if (this.f16052g == 0) {
            return 0;
        }
        float c = mo22151c(view);
        int i = this.f16052g;
        return C0890a.m5110a((int) (c * ((float) i)), 0, i);
    }
}
