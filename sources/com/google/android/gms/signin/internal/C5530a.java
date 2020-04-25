package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4314e.C4317c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;
import com.google.android.gms.common.internal.C4375p;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;

@C4056a
/* renamed from: com.google.android.gms.signin.internal.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C5530a extends C4346k<C5534e> implements C2683d {

    /* renamed from: L */
    private final boolean f15833L;

    /* renamed from: M */
    private final C4329f f15834M;

    /* renamed from: N */
    private final Bundle f15835N;

    /* renamed from: O */
    private Integer f15836O;

    private C5530a(Context context, Looper looper, boolean z, C4329f fVar, Bundle bundle, C4088b bVar, C4089c cVar) {
        super(context, looper, 44, fVar, bVar, cVar);
        this.f15833L = true;
        this.f15834M = fVar;
        this.f15835N = bundle;
        this.f15836O = fVar.mo18298e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo10082A() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo10083B() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: a */
    public final void mo10344a(C4375p pVar, boolean z) {
        try {
            ((C5534e) mo18262z()).mo21959a(pVar, this.f15836O.intValue(), z);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: b */
    public final void mo10346b() {
        mo18237a((C4317c) new C4318d());
    }

    /* renamed from: i */
    public final void mo10347i() {
        try {
            ((C5534e) mo18262z()).mo21961k(this.f15836O.intValue());
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: l */
    public int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: o */
    public boolean mo18251o() {
        return this.f15833L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Bundle mo18258v() {
        if (!mo18257u().getPackageName().equals(this.f15834M.mo18302i())) {
            this.f15835N.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f15834M.mo18302i());
        }
        return this.f15835N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.mo17908a(new com.google.android.gms.signin.internal.zak(8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10345a(com.google.android.gms.signin.internal.C5532c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Expecting a valid ISignInCallbacks"
            com.google.android.gms.common.internal.C4300a0.m18621a(r5, r0)
            com.google.android.gms.common.internal.f r0 = r4.f15834M     // Catch:{ RemoteException -> 0x003c }
            android.accounts.Account r0 = r0.mo18296c()     // Catch:{ RemoteException -> 0x003c }
            r1 = 0
            java.lang.String r2 = "<<default account>>"
            java.lang.String r3 = r0.name     // Catch:{ RemoteException -> 0x003c }
            boolean r2 = r2.equals(r3)     // Catch:{ RemoteException -> 0x003c }
            if (r2 == 0) goto L_0x0022
            android.content.Context r1 = r4.mo18257u()     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.auth.api.signin.internal.b r1 = com.google.android.gms.auth.api.signin.internal.C3997b.m17378a(r1)     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo17521b()     // Catch:{ RemoteException -> 0x003c }
        L_0x0022:
            com.google.android.gms.common.internal.ResolveAccountRequest r2 = new com.google.android.gms.common.internal.ResolveAccountRequest     // Catch:{ RemoteException -> 0x003c }
            java.lang.Integer r3 = r4.f15836O     // Catch:{ RemoteException -> 0x003c }
            int r3 = r3.intValue()     // Catch:{ RemoteException -> 0x003c }
            r2.<init>(r0, r3, r1)     // Catch:{ RemoteException -> 0x003c }
            android.os.IInterface r0 = r4.mo18262z()     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.signin.internal.e r0 = (com.google.android.gms.signin.internal.C5534e) r0     // Catch:{ RemoteException -> 0x003c }
            com.google.android.gms.signin.internal.zai r1 = new com.google.android.gms.signin.internal.zai     // Catch:{ RemoteException -> 0x003c }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x003c }
            r0.mo21960a(r1, r5)     // Catch:{ RemoteException -> 0x003c }
            return
        L_0x003c:
            com.google.android.gms.signin.internal.zak r0 = new com.google.android.gms.signin.internal.zak     // Catch:{ RemoteException -> 0x0046 }
            r1 = 8
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0046 }
            r5.mo17908a(r0)     // Catch:{ RemoteException -> 0x0046 }
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.signin.internal.C5530a.mo10345a(com.google.android.gms.signin.internal.c):void");
    }

    public C5530a(Context context, Looper looper, boolean z, C4329f fVar, C2679a aVar, C4088b bVar, C4089c cVar) {
        this(context, looper, true, fVar, m24089a(fVar), bVar, cVar);
    }

    @C4056a
    /* renamed from: a */
    public static Bundle m24089a(C4329f fVar) {
        C2679a k = fVar.mo18304k();
        Integer e = fVar.mo18298e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", fVar.mo18292a());
        if (e != null) {
            bundle.putInt(C4329f.f13453l, e.intValue());
        }
        if (k != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", k.mo10339h());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", k.mo10338g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", k.mo10335e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", k.mo10337f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", k.mo10332b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", k.mo10333c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", k.mo10342j());
            if (k.mo10331a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", k.mo10331a().longValue());
            }
            if (k.mo10334d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", k.mo10334d().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C5534e) {
            return (C5534e) queryLocalInterface;
        }
        return new C5536g(iBinder);
    }
}
