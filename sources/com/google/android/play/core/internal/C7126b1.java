package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.internal.b1 */
public abstract class C7126b1 extends C7149v0 implements C7153z0 {
    public C7126b1() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28494a(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            mo25052e((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo25051a((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
