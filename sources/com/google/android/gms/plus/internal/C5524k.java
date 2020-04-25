package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.common.internal.C4314e;
import com.google.android.gms.common.util.C4476d0;

@C4476d0
/* renamed from: com.google.android.gms.plus.internal.k */
final class C5524k extends C5514a {

    /* renamed from: b */
    private final C4117b<Status> f15821b;

    public C5524k(C4117b<Status> bVar) {
        this.f15821b = bVar;
    }

    /* renamed from: c */
    public final void mo21928c(int i, Bundle bundle) {
        this.f15821b.mo17810a(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable(C4314e.f13400F) : null));
    }
}
