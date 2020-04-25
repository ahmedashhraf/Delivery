package com.google.android.material.p299i;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0225w;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.i.c */
/* compiled from: ExpandableWidgetHelper */
public final class C6886c {
    @C0193h0

    /* renamed from: a */
    private final View f19229a;

    /* renamed from: b */
    private boolean f19230b = false;
    @C0225w

    /* renamed from: c */
    private int f19231c = 0;

    public C6886c(C6885b bVar) {
        this.f19229a = (View) bVar;
    }

    /* renamed from: d */
    private void m33068d() {
        ViewParent parent = this.f19229a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo3931a(this.f19229a);
        }
    }

    /* renamed from: a */
    public boolean mo27490a(boolean z) {
        if (this.f19230b == z) {
            return false;
        }
        this.f19230b = z;
        m33068d();
        return true;
    }

    /* renamed from: b */
    public boolean mo27491b() {
        return this.f19230b;
    }

    @C0193h0
    /* renamed from: c */
    public Bundle mo27492c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f19230b);
        bundle.putInt("expandedComponentIdHint", this.f19231c);
        return bundle;
    }

    /* renamed from: a */
    public void mo27489a(@C0193h0 Bundle bundle) {
        this.f19230b = bundle.getBoolean("expanded", false);
        this.f19231c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f19230b) {
            m33068d();
        }
    }

    /* renamed from: a */
    public void mo27488a(@C0225w int i) {
        this.f19231c = i;
    }

    @C0225w
    /* renamed from: a */
    public int mo27487a() {
        return this.f19231c;
    }
}
