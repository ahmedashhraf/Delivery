package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5471z7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ boolean f15676N;

    /* renamed from: O */
    private final /* synthetic */ zzm f15677O;

    /* renamed from: P */
    private final /* synthetic */ C5027vb f15678P;

    /* renamed from: Q */
    private final /* synthetic */ C5252f7 f15679Q;

    /* renamed from: a */
    private final /* synthetic */ String f15680a;

    /* renamed from: b */
    private final /* synthetic */ String f15681b;

    C5471z7(C5252f7 f7Var, String str, String str2, boolean z, zzm zzm, C5027vb vbVar) {
        this.f15679Q = f7Var;
        this.f15680a = str;
        this.f15681b = str2;
        this.f15676N = z;
        this.f15677O = zzm;
        this.f15678P = vbVar;
    }

    public final void run() {
        String str = "Failed to get user properties";
        Bundle bundle = new Bundle();
        try {
            C5204b3 d = this.f15679Q.f15029d;
            if (d == null) {
                this.f15679Q.mo21205d().mo21533t().mo21551a(str, this.f15680a, this.f15681b);
                return;
            }
            bundle = C5254f9.m22825a(d.mo21159a(this.f15680a, this.f15681b, this.f15676N, this.f15677O));
            this.f15679Q.m22767J();
            this.f15679Q.mo21212k().mo21371a(this.f15678P, bundle);
        } catch (RemoteException e) {
            this.f15679Q.mo21205d().mo21533t().mo21551a(str, this.f15680a, e);
        } finally {
            this.f15679Q.mo21212k().mo21371a(this.f15678P, bundle);
        }
    }
}
