package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.location.C5149p;

/* renamed from: com.google.android.gms.internal.location.c0 */
final class C4625c0 extends C4651n {

    /* renamed from: b */
    private C4117b<Status> f13880b;

    public C4625c0(C4117b<Status> bVar) {
        this.f13880b = bVar;
    }

    /* renamed from: n */
    private final void m19750n(int i) {
        if (this.f13880b != null) {
            this.f13880b.mo17810a(C5149p.m22421b(C5149p.m22420a(i)));
            this.f13880b = null;
        }
    }

    /* renamed from: a */
    public final void mo18715a(int i, PendingIntent pendingIntent) {
        m19750n(i);
    }

    /* renamed from: a */
    public final void mo18716a(int i, String[] strArr) {
    }

    /* renamed from: b */
    public final void mo18717b(int i, String[] strArr) {
        m19750n(i);
    }
}
