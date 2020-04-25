package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.location.C5149p;

/* renamed from: com.google.android.gms.internal.location.b0 */
final class C4622b0 extends C4651n {

    /* renamed from: b */
    private C4117b<Status> f13878b;

    public C4622b0(C4117b<Status> bVar) {
        this.f13878b = bVar;
    }

    /* renamed from: a */
    public final void mo18715a(int i, PendingIntent pendingIntent) {
    }

    /* renamed from: a */
    public final void mo18716a(int i, String[] strArr) {
        if (this.f13878b != null) {
            this.f13878b.mo17810a(C5149p.m22421b(C5149p.m22420a(i)));
            this.f13878b = null;
        }
    }

    /* renamed from: b */
    public final void mo18717b(int i, String[] strArr) {
    }
}
