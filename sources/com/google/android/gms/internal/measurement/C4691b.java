package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@17.1.0 */
final class C4691b extends C4747a {

    /* renamed from: P */
    private final /* synthetic */ String f13987P;

    /* renamed from: Q */
    private final /* synthetic */ String f13988Q;

    /* renamed from: R */
    private final /* synthetic */ Context f13989R;

    /* renamed from: S */
    private final /* synthetic */ Bundle f13990S;

    /* renamed from: T */
    private final /* synthetic */ C4746ec f13991T;

    C4691b(C4746ec ecVar, String str, String str2, Context context, Bundle bundle) {
        this.f13991T = ecVar;
        this.f13987P = str;
        this.f13988Q = str2;
        this.f13989R = context;
        this.f13990S = bundle;
        super(ecVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r4 < r3) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ RemoteException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a A[Catch:{ RemoteException -> 0x0098 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18823a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            com.google.android.gms.internal.measurement.ec r2 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x0098 }
            r3.<init>()     // Catch:{ RemoteException -> 0x0098 }
            r2.f14076e = r3     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ec r2 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r3 = r14.f13987P     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r4 = r14.f13988Q     // Catch:{ RemoteException -> 0x0098 }
            boolean r2 = com.google.android.gms.internal.measurement.C4746ec.m20075c(r3, r4)     // Catch:{ RemoteException -> 0x0098 }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f13988Q     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r2 = r14.f13987P     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ec r4 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            java.lang.String r4 = r4.f14072a     // Catch:{ RemoteException -> 0x0098 }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f13989R     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.C4746ec.m20082i(r2)     // Catch:{ RemoteException -> 0x0098 }
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.C4746ec.f14065l     // Catch:{ RemoteException -> 0x0098 }
            boolean r2 = r2.booleanValue()     // Catch:{ RemoteException -> 0x0098 }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            com.google.android.gms.internal.measurement.ec r3 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ec r4 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            android.content.Context r5 = r14.f13989R     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ib r4 = r4.mo18938a(r5, r2)     // Catch:{ RemoteException -> 0x0098 }
            r3.f14080i = r4     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ec r3 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ib r3 = r3.f14080i     // Catch:{ RemoteException -> 0x0098 }
            if (r3 != 0) goto L_0x005a
            com.google.android.gms.internal.measurement.ec r2 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            r2.f14072a     // Catch:{ RemoteException -> 0x0098 }
            return
        L_0x005a:
            android.content.Context r3 = r14.f13989R     // Catch:{ RemoteException -> 0x0098 }
            int r3 = com.google.android.gms.internal.measurement.C4746ec.m20081h(r3)     // Catch:{ RemoteException -> 0x0098 }
            android.content.Context r4 = r14.f13989R     // Catch:{ RemoteException -> 0x0098 }
            int r4 = com.google.android.gms.internal.measurement.C4746ec.m20080g(r4)     // Catch:{ RemoteException -> 0x0098 }
            if (r2 == 0) goto L_0x0073
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ RemoteException -> 0x0098 }
            if (r4 >= r3) goto L_0x0070
        L_0x006e:
            r3 = 1
            goto L_0x0071
        L_0x0070:
            r3 = 0
        L_0x0071:
            r8 = r3
            goto L_0x007b
        L_0x0073:
            if (r3 <= 0) goto L_0x0077
            r2 = r3
            goto L_0x0078
        L_0x0077:
            r2 = r4
        L_0x0078:
            if (r3 <= 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            com.google.android.gms.internal.measurement.zzv r13 = new com.google.android.gms.internal.measurement.zzv     // Catch:{ RemoteException -> 0x0098 }
            r4 = 18102(0x46b6, double:8.9436E-320)
            long r6 = (long) r2     // Catch:{ RemoteException -> 0x0098 }
            android.os.Bundle r12 = r14.f13990S     // Catch:{ RemoteException -> 0x0098 }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ec r2 = r14.f13991T     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.internal.measurement.ib r2 = r2.f14080i     // Catch:{ RemoteException -> 0x0098 }
            android.content.Context r3 = r14.f13989R     // Catch:{ RemoteException -> 0x0098 }
            com.google.android.gms.dynamic.d r3 = com.google.android.gms.dynamic.C4523f.m19511a(r3)     // Catch:{ RemoteException -> 0x0098 }
            long r4 = r14.f14083a     // Catch:{ RemoteException -> 0x0098 }
            r2.initialize(r3, r13, r4)     // Catch:{ RemoteException -> 0x0098 }
            return
        L_0x0098:
            r2 = move-exception
            com.google.android.gms.internal.measurement.ec r3 = r14.f13991T
            r3.m20065a(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4691b.mo18823a():void");
    }
}
