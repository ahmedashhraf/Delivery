package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.d0 */
public abstract class C7129d0 extends C7149v0 implements C7131e0 {
    /* renamed from: a */
    public static C7131e0 m34326a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof C7131e0 ? (C7131e0) queryLocalInterface : new C7135g0(iBinder);
    }
}
