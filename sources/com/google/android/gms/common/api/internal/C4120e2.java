package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4137i.C4138a;
import com.google.android.gms.common.util.C4503v;

/* renamed from: com.google.android.gms.common.api.internal.e2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4120e2 {

    /* renamed from: a */
    private final int f12928a;

    public C4120e2(int i) {
        this.f12928a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m17781a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C4503v.m19410d() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo17768a(@C0193h0 Status status);

    /* renamed from: a */
    public abstract void mo17816a(C4138a<?> aVar) throws DeadObjectException;

    /* renamed from: a */
    public abstract void mo17769a(@C0193h0 C4205t3 t3Var, boolean z);

    /* renamed from: a */
    public abstract void mo17770a(@C0193h0 RuntimeException runtimeException);
}
