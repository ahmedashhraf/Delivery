package com.google.android.gms.internal.plus;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.plus.C5478b;
import com.google.android.gms.plus.C5478b.C5479a;
import com.google.android.gms.plus.C5481c;
import com.google.android.gms.plus.p177g.p178a.C5495a;
import java.util.Collection;

/* renamed from: com.google.android.gms.internal.plus.m */
public final class C5095m implements C5478b {
    @SuppressLint({"MissingRemoteException"})
    @C4476d0
    /* renamed from: a */
    public final C4237l<C5479a> mo19876a(C4086i iVar, int i, String str) {
        return iVar.mo17696a(new C5096n(this, iVar, i, str));
    }

    @SuppressLint({"MissingRemoteException"})
    @C4476d0
    /* renamed from: a */
    public final C4237l<C5479a> mo19877a(C4086i iVar, String str) {
        return iVar.mo17696a(new C5097o(this, iVar, str));
    }

    @SuppressLint({"MissingRemoteException"})
    @C4476d0
    /* renamed from: a */
    public final C4237l<C5479a> mo19878a(C4086i iVar, Collection<String> collection) {
        return iVar.mo17696a(new C5099q(this, iVar, collection));
    }

    @SuppressLint({"MissingRemoteException"})
    @C4476d0
    /* renamed from: a */
    public final C4237l<C5479a> mo19879a(C4086i iVar, String... strArr) {
        return iVar.mo17696a(new C5100r(this, iVar, strArr));
    }

    /* renamed from: a */
    public final C5495a mo19880a(C4086i iVar) {
        return C5481c.m23895a(iVar, true).mo21936G();
    }

    @SuppressLint({"MissingRemoteException"})
    @C4476d0
    /* renamed from: b */
    public final C4237l<C5479a> mo19881b(C4086i iVar) {
        return iVar.mo17696a(new C5098p(this, iVar));
    }
}
