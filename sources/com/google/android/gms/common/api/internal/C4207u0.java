package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;

/* renamed from: com.google.android.gms.common.api.internal.u0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4207u0 implements C4088b, C4089c {

    /* renamed from: a */
    private final /* synthetic */ C4171n0 f13152a;

    private C4207u0(C4171n0 n0Var) {
        this.f13152a = n0Var;
    }

    /* renamed from: a */
    public final void mo17767a(@C0193h0 ConnectionResult connectionResult) {
        this.f13152a.f13059b.lock();
        try {
            if (this.f13152a.m18066a(connectionResult)) {
                this.f13152a.m18081g();
                this.f13152a.m18076e();
            } else {
                this.f13152a.m18070b(connectionResult);
            }
        } finally {
            this.f13152a.f13059b.unlock();
        }
    }

    /* renamed from: i */
    public final void mo17777i(Bundle bundle) {
        if (this.f13152a.f13075r.mo18306m()) {
            this.f13152a.f13059b.lock();
            try {
                if (this.f13152a.f13068k != null) {
                    this.f13152a.f13068k.mo10345a(new C4196s0(this.f13152a));
                    this.f13152a.f13059b.unlock();
                }
            } finally {
                this.f13152a.f13059b.unlock();
            }
        } else {
            this.f13152a.f13068k.mo10345a(new C4196s0(this.f13152a));
        }
    }

    /* renamed from: n */
    public final void mo17778n(int i) {
    }

    /* synthetic */ C4207u0(C4171n0 n0Var, C4163m0 m0Var) {
        this(n0Var);
    }
}
