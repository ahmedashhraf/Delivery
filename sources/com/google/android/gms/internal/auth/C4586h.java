package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.C3945b;
import com.google.android.gms.auth.api.C3946c;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.internal.auth.h */
public final class C4586h extends C4346k<C4592k> {

    /* renamed from: L */
    private final Bundle f13843L;

    public C4586h(Context context, Looper looper, C4329f fVar, C3946c cVar, C4088b bVar, C4089c cVar2) {
        super(context, looper, 16, fVar, bVar, cVar2);
        if (cVar == null) {
            this.f13843L = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C4592k) {
            return (C4592k) queryLocalInterface;
        }
        return new C4594l(iBinder);
    }

    /* renamed from: l */
    public final int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: o */
    public final boolean mo18251o() {
        C4329f D = mo18328D();
        return !TextUtils.isEmpty(D.mo18295b()) && !D.mo18293a(C3945b.f12492c).isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final Bundle mo18258v() {
        return this.f13843L;
    }
}
