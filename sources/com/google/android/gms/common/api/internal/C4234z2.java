package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.common.api.internal.z2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4234z2<ResultT> extends C4112d1 {

    /* renamed from: b */
    private final C4230z<C4061b, ResultT> f13221b;

    /* renamed from: c */
    private final C5562l<ResultT> f13222c;

    /* renamed from: d */
    private final C4221x f13223d;

    public C4234z2(int i, C4230z<C4061b, ResultT> zVar, C5562l<ResultT> lVar, C4221x xVar) {
        super(i);
        this.f13222c = lVar;
        this.f13221b = zVar;
        this.f13223d = xVar;
    }

    /* renamed from: a */
    public final void mo17816a(C4138a<?> aVar) throws DeadObjectException {
        try {
            this.f13221b.mo10089a(aVar.mo17869f(), this.f13222c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo17768a(C4120e2.m17781a(e2));
        } catch (RuntimeException e3) {
            mo17770a(e3);
        }
    }

    @C0195i0
    /* renamed from: b */
    public final Feature[] mo17771b(C4138a<?> aVar) {
        return this.f13221b.mo17998b();
    }

    /* renamed from: c */
    public final boolean mo17772c(C4138a<?> aVar) {
        return this.f13221b.mo17997a();
    }

    /* renamed from: a */
    public final void mo17768a(@C0193h0 Status status) {
        this.f13222c.mo22020b(this.f13223d.mo17774a(status));
    }

    /* renamed from: a */
    public final void mo17770a(@C0193h0 RuntimeException runtimeException) {
        this.f13222c.mo22020b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo17769a(@C0193h0 C4205t3 t3Var, boolean z) {
        t3Var.mo17972a(this.f13222c, z);
    }
}
