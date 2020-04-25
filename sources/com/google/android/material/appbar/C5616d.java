package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;

/* renamed from: com.google.android.material.appbar.d */
/* compiled from: ViewOffsetBehavior */
class C5616d<V extends View> extends C0712c<V> {

    /* renamed from: a */
    private C5617e f16053a;

    /* renamed from: b */
    private int f16054b = 0;

    /* renamed from: c */
    private int f16055c = 0;

    public C5616d() {
    }

    /* renamed from: a */
    public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i) {
        mo22232b(coordinatorLayout, v, i);
        if (this.f16053a == null) {
            this.f16053a = new C5617e(v);
        }
        this.f16053a.mo22248h();
        this.f16053a.mo22237a();
        int i2 = this.f16054b;
        if (i2 != 0) {
            this.f16053a.mo22242b(i2);
            this.f16054b = 0;
        }
        int i3 = this.f16055c;
        if (i3 != 0) {
            this.f16053a.mo22239a(i3);
            this.f16055c = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo22232b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i) {
        coordinatorLayout.mo3942c((View) v, i);
    }

    /* renamed from: c */
    public int mo22147c() {
        C5617e eVar = this.f16053a;
        if (eVar != null) {
            return eVar.mo22245e();
        }
        return 0;
    }

    /* renamed from: d */
    public boolean mo22148d() {
        C5617e eVar = this.f16053a;
        return eVar != null && eVar.mo22246f();
    }

    /* renamed from: e */
    public boolean mo22149e() {
        C5617e eVar = this.f16053a;
        return eVar != null && eVar.mo22247g();
    }

    /* renamed from: b */
    public boolean mo22146b(int i) {
        C5617e eVar = this.f16053a;
        if (eVar != null) {
            return eVar.mo22242b(i);
        }
        this.f16054b = i;
        return false;
    }

    public C5616d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public int mo22144b() {
        C5617e eVar = this.f16053a;
        if (eVar != null) {
            return eVar.mo22244d();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo22145b(boolean z) {
        C5617e eVar = this.f16053a;
        if (eVar != null) {
            eVar.mo22241b(z);
        }
    }

    /* renamed from: a */
    public boolean mo22143a(int i) {
        C5617e eVar = this.f16053a;
        if (eVar != null) {
            return eVar.mo22239a(i);
        }
        this.f16055c = i;
        return false;
    }

    /* renamed from: a */
    public void mo22142a(boolean z) {
        C5617e eVar = this.f16053a;
        if (eVar != null) {
            eVar.mo22238a(z);
        }
    }
}
