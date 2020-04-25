package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.common.api.internal.a3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4096a3 extends C4229y2<Void> {

    /* renamed from: c */
    private final C4195s<C4061b, ?> f12886c;

    /* renamed from: d */
    private final C4098b0<C4061b, ?> f12887d;

    public C4096a3(C4233z1 z1Var, C5562l<Void> lVar) {
        super(3, lVar);
        this.f12886c = z1Var.f13219a;
        this.f12887d = z1Var.f13220b;
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
        return this.f12886c.mo17957c();
    }

    /* renamed from: c */
    public final boolean mo17772c(C4138a<?> aVar) {
        return this.f12886c.mo17958d();
    }

    /* renamed from: d */
    public final void mo17773d(C4138a<?> aVar) throws RemoteException {
        this.f12886c.mo17829a(aVar.mo17869f(), this.f13188b);
        if (this.f12886c.mo17956b() != null) {
            aVar.mo17872i().put(this.f12886c.mo17956b(), new C4233z1(this.f12886c, this.f12887d));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17768a(@C0193h0 Status status) {
        super.mo17768a(status);
    }
}
