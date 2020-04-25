package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.m */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8707m extends C8703k<Bundle> {
    C8707m(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32127a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        mo32133a(bundle2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32128a() {
        return false;
    }
}
