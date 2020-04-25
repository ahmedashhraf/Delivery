package com.google.android.gms.plus.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4314e;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.plus.C5478b.C5479a;

@C4476d0
/* renamed from: com.google.android.gms.plus.internal.j */
final class C5523j extends C5514a {

    /* renamed from: b */
    private final C4117b<C5479a> f15820b;

    public C5523j(C4117b<C5479a> bVar) {
        this.f15820b = bVar;
    }

    /* renamed from: a */
    public final void mo21925a(DataHolder dataHolder, String str) {
        Status status = new Status(dataHolder.mo18034N(), null, dataHolder.mo18051j() != null ? (PendingIntent) dataHolder.mo18051j().getParcelable(C4314e.f13400F) : null);
        if (!status.mo17617T() && dataHolder != null) {
            if (!dataHolder.isClosed()) {
                dataHolder.close();
            }
            dataHolder = null;
        }
        this.f15820b.mo17810a(new C5522i(status, dataHolder, str));
    }
}
