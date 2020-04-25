package com.google.android.gms.internal.plus;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.internal.C4115e.C4117b;
import com.google.android.gms.plus.C5478b.C5479a;
import com.google.android.gms.plus.internal.C5521h;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.plus.q */
final class C5099q extends C5101s {

    /* renamed from: s */
    private final /* synthetic */ Collection f14587s;

    C5099q(C5095m mVar, C4086i iVar, Collection collection) {
        this.f14587s = collection;
        super(iVar, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo17535a(C4061b bVar) throws RemoteException {
        ((C5521h) bVar).mo21939a((C4117b<C5479a>) this, this.f14587s);
    }
}
