package com.clevertap.android.sdk;

import java.lang.ref.WeakReference;

@Deprecated
/* renamed from: com.clevertap.android.sdk.s0 */
/* compiled from: DataHandler */
public class C3216s0 {

    /* renamed from: a */
    private WeakReference<C3150p0> f11656a;

    C3216s0(C3150p0 p0Var) {
        this.f11656a = new WeakReference<>(p0Var);
    }

    @Deprecated
    /* renamed from: a */
    public void mo12581a(String str, boolean z) {
        C3150p0 p0Var = (C3150p0) this.f11656a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12449a(str, z);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo12582b(String str, boolean z) {
        C3150p0 p0Var = (C3150p0) this.f11656a.get();
        if (p0Var == null) {
            C3111h1.m14930d("CleverTap Instance is null.");
        } else {
            p0Var.mo12464b(str, z);
        }
    }
}
