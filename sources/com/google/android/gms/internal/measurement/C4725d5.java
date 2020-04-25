package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public abstract class C4725d5 extends C4707c1 implements C4722d2 {
    /* renamed from: a */
    public static C4722d2 m20020a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof C4722d2) {
            return (C4722d2) queryLocalInterface;
        }
        return new C4738e4(iBinder);
    }
}
