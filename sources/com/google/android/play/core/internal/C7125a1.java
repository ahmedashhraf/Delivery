package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.a1 */
public final class C7125a1 extends C7147s0 implements C7152y0 {
    C7125a1(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: a */
    public final void mo28492a(String str, Bundle bundle, C7153z0 z0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) z0Var);
        mo28551a(2, d);
    }

    /* renamed from: b */
    public final void mo28493b(String str, Bundle bundle, C7153z0 z0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) z0Var);
        mo28551a(3, d);
    }
}
