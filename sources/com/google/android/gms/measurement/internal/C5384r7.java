package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5027vb;

/* renamed from: com.google.android.gms.measurement.internal.r7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5384r7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5027vb f15433N;

    /* renamed from: O */
    private final /* synthetic */ C5252f7 f15434O;

    /* renamed from: a */
    private final /* synthetic */ zzak f15435a;

    /* renamed from: b */
    private final /* synthetic */ String f15436b;

    C5384r7(C5252f7 f7Var, zzak zzak, String str, C5027vb vbVar) {
        this.f15434O = f7Var;
        this.f15435a = zzak;
        this.f15436b = str;
        this.f15433N = vbVar;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C5204b3 d = this.f15434O.f15029d;
            if (d == null) {
                this.f15434O.mo21205d().mo21533t().mo21549a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = d.mo21167a(this.f15435a, this.f15436b);
            this.f15434O.m22767J();
            this.f15434O.mo21212k().mo21375a(this.f15433N, bArr);
        } catch (RemoteException e) {
            this.f15434O.mo21205d().mo21533t().mo21550a("Failed to send event to the service to bundle", e);
        } finally {
            this.f15434O.mo21212k().mo21375a(this.f15433N, bArr);
        }
    }
}
