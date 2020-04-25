package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.x0 */
public abstract class C7151x0 extends C7149v0 implements C7152y0 {
    /* renamed from: a */
    public static C7152y0 m34376a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof C7152y0 ? (C7152y0) queryLocalInterface : new C7125a1(iBinder);
    }
}
