package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.o3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4179o3 implements C4218w1 {

    /* renamed from: a */
    private final /* synthetic */ C4156k3 f13088a;

    private C4179o3(C4156k3 k3Var) {
        this.f13088a = k3Var;
    }

    /* renamed from: a */
    public final void mo17928a(@C0195i0 Bundle bundle) {
        this.f13088a.f13040X.lock();
        try {
            this.f13088a.f13038V = ConnectionResult.f12763l0;
            this.f13088a.m18019g();
        } finally {
            this.f13088a.f13040X.unlock();
        }
    }

    /* synthetic */ C4179o3(C4156k3 k3Var, C4174n3 n3Var) {
        this(k3Var);
    }

    /* renamed from: a */
    public final void mo17929a(@C0193h0 ConnectionResult connectionResult) {
        this.f13088a.f13040X.lock();
        try {
            this.f13088a.f13038V = connectionResult;
            this.f13088a.m18019g();
        } finally {
            this.f13088a.f13040X.unlock();
        }
    }

    /* renamed from: a */
    public final void mo17927a(int i, boolean z) {
        this.f13088a.f13040X.lock();
        try {
            if (this.f13088a.f13039W) {
                this.f13088a.f13039W = false;
                this.f13088a.m18005a(i, z);
                return;
            }
            this.f13088a.f13039W = true;
            this.f13088a.f13031O.mo17778n(i);
            this.f13088a.f13040X.unlock();
        } finally {
            this.f13088a.f13040X.unlock();
        }
    }
}
