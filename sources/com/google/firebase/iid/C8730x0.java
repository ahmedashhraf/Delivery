package com.google.firebase.iid;

import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.util.C4476d0;

/* renamed from: com.google.firebase.iid.x0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8730x0 {

    /* renamed from: a */
    private final String f22888a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f22889b;

    @C4476d0
    C8730x0(String str, long j) {
        this.f22888a = (String) C4300a0.m18620a(str);
        this.f22889b = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo32173a() {
        return this.f22888a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo32174b() {
        return this.f22889b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8730x0)) {
            return false;
        }
        C8730x0 x0Var = (C8730x0) obj;
        if (this.f22889b != x0Var.f22889b || !this.f22888a.equals(x0Var.f22888a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4413y.m19051a(this.f22888a, Long.valueOf(this.f22889b));
    }
}
