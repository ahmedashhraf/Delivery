package com.clevertap.android.sdk;

import android.app.FragmentManager;

/* renamed from: com.clevertap.android.sdk.l */
/* compiled from: CTInAppBasePartialFragment */
public abstract class C3128l extends C3107h {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12292a() {
        if (!this.f11149R.get()) {
            FragmentManager fragmentManager = this.f11148Q.getFragmentManager();
            try {
                fragmentManager.beginTransaction().remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
        this.f11149R.set(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12296b() {
        if (this.f11151b != null) {
            mo12294a((C3109b) C3150p0.m15209b(getActivity().getBaseContext(), this.f11151b));
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onStart() {
        super.onStart();
        if (this.f11149R.get()) {
            mo12292a();
        }
    }
}
