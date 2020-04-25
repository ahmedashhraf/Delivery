package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.zzk;
import com.google.android.gms.dynamic.C4519d;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.common.internal.n1 */
public final class C4371n1 extends C2613a implements C4365l1 {
    C4371n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo18347a(zzk zzk, C4519d dVar) throws RemoteException {
        Parcel a = mo10127a();
        C2615c.m12725a(a, (Parcelable) zzk);
        C2615c.m12724a(a, (IInterface) dVar);
        Parcel a2 = mo10128a(5, a);
        boolean a3 = C2615c.m12727a(a2);
        a2.recycle();
        return a3;
    }
}
