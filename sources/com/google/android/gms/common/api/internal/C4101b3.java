package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.common.api.internal.b3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4101b3 extends C4229y2<Boolean> {

    /* renamed from: c */
    private final C4168a<?> f12893c;

    public C4101b3(C4168a<?> aVar, C5562l<Boolean> lVar) {
        super(4, lVar);
        this.f12893c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17769a(@C0193h0 C4205t3 t3Var, boolean z) {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17770a(@C0193h0 RuntimeException runtimeException) {
        super.mo17770a(runtimeException);
    }

    @C0195i0
    /* renamed from: b */
    public final Feature[] mo17771b(C4138a<?> aVar) {
        C4233z1 z1Var = (C4233z1) aVar.mo17872i().get(this.f12893c);
        if (z1Var == null) {
            return null;
        }
        return z1Var.f13219a.mo17957c();
    }

    /* renamed from: c */
    public final boolean mo17772c(C4138a<?> aVar) {
        C4233z1 z1Var = (C4233z1) aVar.mo17872i().get(this.f12893c);
        return z1Var != null && z1Var.f13219a.mo17958d();
    }

    /* renamed from: d */
    public final void mo17773d(C4138a<?> aVar) throws RemoteException {
        C4233z1 z1Var = (C4233z1) aVar.mo17872i().remove(this.f12893c);
        if (z1Var != null) {
            z1Var.f13220b.mo17776a(aVar.mo17869f(), this.f13188b);
            z1Var.f13219a.mo17955a();
            return;
        }
        this.f13188b.mo22021b(Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17768a(@C0193h0 Status status) {
        super.mo17768a(status);
    }
}
