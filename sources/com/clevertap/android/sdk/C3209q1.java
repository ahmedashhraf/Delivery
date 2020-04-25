package com.clevertap.android.sdk;

import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: com.clevertap.android.sdk.q1 */
/* compiled from: SessionHandler */
public class C3209q1 {

    /* renamed from: a */
    private WeakReference<C3150p0> f11622a;

    C3209q1(C3150p0 p0Var) {
        this.f11622a = new WeakReference<>(p0Var);
    }

    @Deprecated
    /* renamed from: a */
    public int mo12552a() {
        C3150p0 p0Var = (C3150p0) this.f11622a.get();
        if (p0Var != null) {
            return p0Var.mo12489n();
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: b */
    public int mo12553b() {
        C3150p0 p0Var = (C3150p0) this.f11622a.get();
        if (p0Var != null) {
            return p0Var.mo12490o();
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: c */
    public int mo12554c() {
        C3150p0 p0Var = (C3150p0) this.f11622a.get();
        if (p0Var != null) {
            return p0Var.mo12492q();
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: d */
    public int mo12555d() {
        C3150p0 p0Var = (C3150p0) this.f11622a.get();
        if (p0Var != null) {
            return p0Var.mo12493r();
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return 0;
    }

    @Deprecated
    /* renamed from: e */
    public C3228u1 mo12556e() {
        C3150p0 p0Var = (C3150p0) this.f11622a.get();
        if (p0Var != null) {
            return p0Var.mo12494s();
        }
        C3111h1.m14930d("CleverTap Instance is null.");
        return null;
    }
}
