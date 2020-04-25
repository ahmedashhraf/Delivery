package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth.a0 */
public abstract class C4573a0 extends C4614w implements C4617z {
    /* renamed from: a */
    public static C4617z m19635a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof C4617z) {
            return (C4617z) queryLocalInterface;
        }
        return new C4575b0(iBinder);
    }
}
