package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.g0 */
public final class C7135g0 extends C7147s0 implements C7131e0 {
    C7135g0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* renamed from: a */
    public final void mo28501a(String str, int i, Bundle bundle, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeInt(i);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(4, d);
    }

    /* renamed from: a */
    public final void mo28502a(String str, int i, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeInt(i);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(5, d);
    }

    /* renamed from: a */
    public final void mo28503a(String str, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(6, d);
    }

    /* renamed from: a */
    public final void mo28504a(String str, List<Bundle> list, Bundle bundle, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeTypedList(list);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(14, d);
    }

    /* renamed from: b */
    public final void mo28505b(String str, List<Bundle> list, Bundle bundle, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeTypedList(list);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(13, d);
    }

    /* renamed from: c */
    public final void mo28506c(String str, List<Bundle> list, Bundle bundle, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeTypedList(list);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(8, d);
    }

    /* renamed from: d */
    public final void mo28507d(String str, List<Bundle> list, Bundle bundle, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeTypedList(list);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(7, d);
    }

    /* renamed from: e */
    public final void mo28508e(String str, List<Bundle> list, Bundle bundle, C7133f0 f0Var) throws RemoteException {
        Parcel d = mo28553d();
        d.writeString(str);
        d.writeTypedList(list);
        C7148u0.m34374a(d, (Parcelable) bundle);
        C7148u0.m34373a(d, (IInterface) f0Var);
        mo28551a(2, d);
    }
}
