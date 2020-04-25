package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C3983a;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C4003h extends C4346k<C4017v> {

    /* renamed from: L */
    private final GoogleSignInOptions f12693L;

    public C4003h(Context context, Looper looper, C4329f fVar, GoogleSignInOptions googleSignInOptions, C4088b bVar, C4089c cVar) {
        super(context, looper, 91, fVar, bVar, cVar);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C3983a().mo17478a();
        }
        if (!fVar.mo18297d().isEmpty()) {
            C3983a aVar = new C3983a(googleSignInOptions);
            for (Scope a : fVar.mo18297d()) {
                aVar.mo17475a(a, new Scope[0]);
            }
            googleSignInOptions = aVar.mo17478a();
        }
        this.f12693L = googleSignInOptions;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: E */
    public final GoogleSignInOptions mo17532E() {
        return this.f12693L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C4017v) {
            return (C4017v) queryLocalInterface;
        }
        return new C4018w(iBinder);
    }

    /* renamed from: f */
    public final boolean mo17533f() {
        return true;
    }

    /* renamed from: l */
    public final int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: n */
    public final Intent mo17534n() {
        return C4004i.m17410a(mo18257u(), this.f12693L);
    }
}
