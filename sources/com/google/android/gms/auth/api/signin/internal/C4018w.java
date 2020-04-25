package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.C4550a;
import com.google.android.gms.internal.auth-api.C4552c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.w */
public final class C4018w extends C4550a implements C4017v {
    C4018w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo17544a(C4015t tVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) tVar);
        C4552c.m19588a(G0, (Parcelable) googleSignInOptions);
        mo18649a(101, G0);
    }

    /* renamed from: b */
    public final void mo17545b(C4015t tVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) tVar);
        C4552c.m19588a(G0, (Parcelable) googleSignInOptions);
        mo18649a(102, G0);
    }

    /* renamed from: c */
    public final void mo17546c(C4015t tVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel G0 = mo18648G0();
        C4552c.m19587a(G0, (IInterface) tVar);
        C4552c.m19588a(G0, (Parcelable) googleSignInOptions);
        mo18649a(103, G0);
    }
}
