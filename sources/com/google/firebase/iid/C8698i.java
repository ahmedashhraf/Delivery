package com.google.firebase.iid;

import android.os.Bundle;

/* renamed from: com.google.firebase.iid.i */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8698i extends C8703k<Void> {
    C8698i(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32127a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo32133a(null);
        } else {
            mo32132a(new zzag(4, "Invalid response to one way request"));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32128a() {
        return true;
    }
}
