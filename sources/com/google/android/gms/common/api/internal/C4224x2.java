package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.api.internal.C4137i.C4138a;

/* renamed from: com.google.android.gms.common.api.internal.x2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4224x2<A extends C4116a<? extends C4246q, C4061b>> extends C4120e2 {

    /* renamed from: b */
    private final A f13180b;

    public C4224x2(int i, A a) {
        super(i);
        this.f13180b = a;
    }

    /* renamed from: a */
    public final void mo17816a(C4138a<?> aVar) throws DeadObjectException {
        try {
            this.f13180b.mo17811b(aVar.mo17869f());
        } catch (RuntimeException e) {
            mo17770a(e);
        }
    }

    /* renamed from: a */
    public final void mo17768a(@C0193h0 Status status) {
        this.f13180b.mo17809a(status);
    }

    /* renamed from: a */
    public final void mo17770a(@C0193h0 RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f13180b.mo17809a(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo17769a(@C0193h0 C4205t3 t3Var, boolean z) {
        t3Var.mo17971a((BasePendingResult<? extends C4246q>) this.f13180b, z);
    }
}
