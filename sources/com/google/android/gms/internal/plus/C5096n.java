package com.google.android.gms.internal.plus;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.plus.internal.C5521h;

/* renamed from: com.google.android.gms.internal.plus.n */
final class C5096n extends C5101s {

    /* renamed from: s */
    private final /* synthetic */ int f14584s;

    /* renamed from: t */
    private final /* synthetic */ String f14585t;

    C5096n(C5095m mVar, C4086i iVar, int i, String str) {
        this.f14584s = i;
        this.f14585t = str;
        super(iVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        mo17747a(((C5521h) bVar).mo21937a(this, this.f14584s, this.f14585t));
    }
}
