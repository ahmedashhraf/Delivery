package com.google.android.gms.auth.p165d;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.C4614w;

/* renamed from: com.google.android.gms.auth.d.g */
public abstract class C4034g extends C4614w implements C4033f {
    /* renamed from: a */
    public static C4033f m17482a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof C4033f) {
            return (C4033f) queryLocalInterface;
        }
        return new C4035h(iBinder);
    }
}
