package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5329m7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5252f7 f15316N;

    /* renamed from: a */
    private final /* synthetic */ zzm f15317a;

    /* renamed from: b */
    private final /* synthetic */ C5027vb f15318b;

    C5329m7(C5252f7 f7Var, zzm zzm, C5027vb vbVar) {
        this.f15316N = f7Var;
        this.f15317a = zzm;
        this.f15318b = vbVar;
    }

    public final void run() {
        String str = "Failed to get app instance id";
        try {
            C5204b3 d = this.f15316N.f15029d;
            if (d == null) {
                this.f15316N.mo21205d().mo21533t().mo21549a(str);
                return;
            }
            String c = d.mo21169c(this.f15317a);
            if (c != null) {
                this.f15316N.mo21228o().mo21762a(c);
                this.f15316N.mo21213l().f15577l.mo21143a(c);
            }
            this.f15316N.m22767J();
            this.f15316N.mo21212k().mo21372a(this.f15318b, c);
        } catch (RemoteException e) {
            this.f15316N.mo21205d().mo21533t().mo21550a(str, e);
        } finally {
            this.f15316N.mo21212k().mo21372a(this.f15318b, (String) null);
        }
    }
}
