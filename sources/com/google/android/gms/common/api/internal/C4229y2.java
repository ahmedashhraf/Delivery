package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.android.gms.common.api.internal.y2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
abstract class C4229y2<T> extends C4112d1 {

    /* renamed from: b */
    protected final C5562l<T> f13188b;

    public C4229y2(int i, C5562l<T> lVar) {
        super(i);
        this.f13188b = lVar;
    }

    /* renamed from: a */
    public void mo17768a(@C0193h0 Status status) {
        this.f13188b.mo22020b((Exception) new ApiException(status));
    }

    /* renamed from: a */
    public void mo17769a(@C0193h0 C4205t3 t3Var, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo17773d(C4138a<?> aVar) throws RemoteException;

    /* renamed from: a */
    public void mo17770a(@C0193h0 RuntimeException runtimeException) {
        this.f13188b.mo22020b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo17816a(C4138a<?> aVar) throws DeadObjectException {
        try {
            mo17773d(aVar);
        } catch (DeadObjectException e) {
            mo17768a(C4120e2.m17781a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo17768a(C4120e2.m17781a(e2));
        } catch (RuntimeException e3) {
            mo17770a(e3);
        }
    }
}
