package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4305c;
import com.google.android.gms.internal.location.C4645k;
import com.google.android.gms.internal.location.zzad;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.location.r0 */
final class C5155r0 extends C4645k {

    /* renamed from: b */
    private final /* synthetic */ C5562l f14801b;

    C5155r0(C5124e eVar, C5562l lVar) {
        this.f14801b = lVar;
    }

    /* renamed from: a */
    public final void mo18718a(zzad zzad) throws RemoteException {
        Status f = zzad.mo17504f();
        if (f == null) {
            this.f14801b.mo22020b((Exception) new ApiException(new Status(8, "Got null status from location service")));
        } else if (f.mo17612O() == 0) {
            this.f14801b.mo22019a(Boolean.valueOf(true));
        } else {
            this.f14801b.mo22020b((Exception) C4305c.m18635a(f));
        }
    }
}
