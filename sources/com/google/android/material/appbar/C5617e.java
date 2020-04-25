package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p034l.C0962e0;

/* renamed from: com.google.android.material.appbar.e */
/* compiled from: ViewOffsetHelper */
class C5617e {

    /* renamed from: a */
    private final View f16056a;

    /* renamed from: b */
    private int f16057b;

    /* renamed from: c */
    private int f16058c;

    /* renamed from: d */
    private int f16059d;

    /* renamed from: e */
    private int f16060e;

    /* renamed from: f */
    private boolean f16061f = true;

    /* renamed from: g */
    private boolean f16062g = true;

    public C5617e(View view) {
        this.f16056a = view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22237a() {
        View view = this.f16056a;
        C0962e0.m5513h(view, this.f16059d - (view.getTop() - this.f16057b));
        View view2 = this.f16056a;
        C0962e0.m5508g(view2, this.f16060e - (view2.getLeft() - this.f16058c));
    }

    /* renamed from: b */
    public boolean mo22242b(int i) {
        if (!this.f16061f || this.f16059d == i) {
            return false;
        }
        this.f16059d = i;
        mo22237a();
        return true;
    }

    /* renamed from: c */
    public int mo22243c() {
        return this.f16057b;
    }

    /* renamed from: d */
    public int mo22244d() {
        return this.f16060e;
    }

    /* renamed from: e */
    public int mo22245e() {
        return this.f16059d;
    }

    /* renamed from: f */
    public boolean mo22246f() {
        return this.f16062g;
    }

    /* renamed from: g */
    public boolean mo22247g() {
        return this.f16061f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo22248h() {
        this.f16057b = this.f16056a.getTop();
        this.f16058c = this.f16056a.getLeft();
    }

    /* renamed from: a */
    public boolean mo22239a(int i) {
        if (!this.f16062g || this.f16060e == i) {
            return false;
        }
        this.f16060e = i;
        mo22237a();
        return true;
    }

    /* renamed from: b */
    public int mo22240b() {
        return this.f16058c;
    }

    /* renamed from: b */
    public void mo22241b(boolean z) {
        this.f16061f = z;
    }

    /* renamed from: a */
    public void mo22238a(boolean z) {
        this.f16062g = z;
    }
}
