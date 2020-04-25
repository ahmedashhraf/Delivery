package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;

/* renamed from: com.google.android.gms.common.internal.m1 */
public abstract class C4368m1 extends C2614b implements C4365l1 {
    /* renamed from: a */
    public static C4365l1 m18867a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof C4365l1) {
            return (C4365l1) queryLocalInterface;
        }
        return new C4371n1(iBinder);
    }
}
