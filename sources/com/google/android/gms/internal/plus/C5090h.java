package com.google.android.gms.internal.plus;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.C5477a;
import com.google.android.gms.plus.C5481c;
import com.google.android.gms.plus.internal.C5521h;

/* renamed from: com.google.android.gms.internal.plus.h */
public final class C5090h implements C5477a {
    @SuppressLint({"MissingRemoteException"})
    /* renamed from: a */
    public final C4237l<Status> mo19873a(C4086i iVar) {
        return iVar.mo17705b(new C5091i(this, iVar));
    }

    /* renamed from: b */
    public final String mo19874b(C4086i iVar) {
        return C5481c.m23895a(iVar, true).mo17532E();
    }

    /* renamed from: c */
    public final void mo19875c(C4086i iVar) {
        C5521h a = C5481c.m23895a(iVar, false);
        if (a != null) {
            a.mo18787F();
        }
    }
}
