package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C5027vb;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5450x7 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ zzm f15608N;

    /* renamed from: O */
    private final /* synthetic */ C5027vb f15609O;

    /* renamed from: P */
    private final /* synthetic */ C5252f7 f15610P;

    /* renamed from: a */
    private final /* synthetic */ String f15611a;

    /* renamed from: b */
    private final /* synthetic */ String f15612b;

    C5450x7(C5252f7 f7Var, String str, String str2, zzm zzm, C5027vb vbVar) {
        this.f15610P = f7Var;
        this.f15611a = str;
        this.f15612b = str2;
        this.f15608N = zzm;
        this.f15609O = vbVar;
    }

    public final void run() {
        String str = "Failed to get conditional properties";
        ArrayList arrayList = new ArrayList();
        try {
            C5204b3 d = this.f15610P.f15029d;
            if (d == null) {
                this.f15610P.mo21205d().mo21533t().mo21551a(str, this.f15611a, this.f15612b);
                return;
            }
            arrayList = C5254f9.m22839b(d.mo21156a(this.f15611a, this.f15612b, this.f15608N));
            this.f15610P.m22767J();
            this.f15610P.mo21212k().mo21373a(this.f15609O, arrayList);
        } catch (RemoteException e) {
            this.f15610P.mo21205d().mo21533t().mo21552a(str, this.f15611a, this.f15612b, e);
        } finally {
            this.f15610P.mo21212k().mo21373a(this.f15609O, arrayList);
        }
    }
}
