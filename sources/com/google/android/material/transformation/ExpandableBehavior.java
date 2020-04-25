package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p034l.C0962e0;
import com.google.android.material.p299i.C6885b;
import java.util.List;

public abstract class ExpandableBehavior extends C0712c<View> {

    /* renamed from: b */
    private static final int f20174b = 0;

    /* renamed from: c */
    private static final int f20175c = 1;

    /* renamed from: d */
    private static final int f20176d = 2;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f20177a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C7110a implements OnPreDrawListener {

        /* renamed from: N */
        final /* synthetic */ C6885b f20178N;

        /* renamed from: a */
        final /* synthetic */ View f20180a;

        /* renamed from: b */
        final /* synthetic */ int f20181b;

        C7110a(View view, int i, C6885b bVar) {
            this.f20180a = view;
            this.f20181b = i;
            this.f20178N = bVar;
        }

        public boolean onPreDraw() {
            this.f20180a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f20177a == this.f20181b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C6885b bVar = this.f20178N;
                expandableBehavior.mo28468a((View) bVar, this.f20180a, bVar.mo27296a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo28468a(View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    public abstract boolean mo3999a(CoordinatorLayout coordinatorLayout, View view, View view2);

    @C0194i
    /* renamed from: b */
    public boolean mo4004b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C6885b bVar = (C6885b) view2;
        if (!m34255a(bVar.mo27296a())) {
            return false;
        }
        this.f20177a = bVar.mo27296a() ? 1 : 2;
        return mo28468a((View) bVar, view, bVar.mo27296a(), true);
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: e */
    public C6885b mo28469e(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view) {
        List b = coordinatorLayout.mo3938b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (mo3999a(coordinatorLayout, view, view2)) {
                return (C6885b) view2;
            }
        }
        return null;
    }

    @C0194i
    /* renamed from: a */
    public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, int i) {
        if (!C0962e0.m5540n0(view)) {
            C6885b e = mo28469e(coordinatorLayout, view);
            if (e != null && m34255a(e.mo27296a())) {
                this.f20177a = e.mo27296a() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new C7110a(view, this.f20177a, e));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m34255a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f20177a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f20177a == 1) {
            z2 = true;
        }
        return z2;
    }

    @C0195i0
    /* renamed from: a */
    public static <T extends ExpandableBehavior> T m34254a(@C0193h0 View view, @C0193h0 Class<T> cls) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0716g) {
            C0712c d = ((C0716g) layoutParams).mo4027d();
            if (d instanceof ExpandableBehavior) {
                return (ExpandableBehavior) cls.cast(d);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }
}
