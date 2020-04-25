package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.C3917a.C3918a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.internal.auth-api.p */
public final class C4565p extends C4346k<C4569t> {
    @C0195i0

    /* renamed from: L */
    private final C3918a f13833L;

    public C4565p(Context context, Looper looper, C4329f fVar, C3918a aVar, C4088b bVar, C4089c cVar) {
        super(context, looper, 68, fVar, bVar, cVar);
        this.f13833L = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final C3918a mo17532E() {
        return this.f13833L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C4569t) {
            return (C4569t) queryLocalInterface;
        }
        return new C4570u(iBinder);
    }

    /* renamed from: l */
    public final int mo10085l() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Bundle mo18258v() {
        C3918a aVar = this.f13833L;
        return aVar == null ? new Bundle() : aVar.mo17296a();
    }
}
