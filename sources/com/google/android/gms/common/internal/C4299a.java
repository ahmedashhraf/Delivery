package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4375p.C4376a;

/* renamed from: com.google.android.gms.common.internal.a */
public class C4299a extends C4376a {
    @C4056a
    /* renamed from: a */
    public static Account m18614a(C4375p pVar) {
        if (pVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return pVar.mo18218e();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final Account mo18218e() {
        throw new NoSuchMethodError();
    }

    public boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
