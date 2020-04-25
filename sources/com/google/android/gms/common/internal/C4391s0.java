package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import p076c.p112d.p113a.p114a.p118d.p121c.C2596b;
import p076c.p112d.p113a.p114a.p118d.p121c.C2598d;

/* renamed from: com.google.android.gms.common.internal.s0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4391s0 extends C2596b implements C4405u {
    C4391s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    /* renamed from: a */
    public final C4519d mo18376a(C4519d dVar, int i, int i2) throws RemoteException {
        Parcel G0 = mo10093G0();
        C2598d.m12703a(G0, (IInterface) dVar);
        G0.writeInt(i);
        G0.writeInt(i2);
        Parcel a = mo10094a(1, G0);
        C4519d a2 = C4520a.m19510a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final C4519d mo18377a(C4519d dVar, SignInButtonConfig signInButtonConfig) throws RemoteException {
        Parcel G0 = mo10093G0();
        C2598d.m12703a(G0, (IInterface) dVar);
        C2598d.m12704a(G0, (Parcelable) signInButtonConfig);
        Parcel a = mo10094a(2, G0);
        C4519d a2 = C4520a.m19510a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
