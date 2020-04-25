package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.signin.C3990e;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4239m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4137i;
import com.google.android.gms.common.p169n.C4432a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.i */
public final class C4004i {

    /* renamed from: a */
    private static C4432a f12694a = new C4432a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m17410a(Context context, GoogleSignInOptions googleSignInOptions) {
        f12694a.mo18430a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String str = "config";
        bundle.putParcelable(str, signInConfiguration);
        intent.putExtra(str, bundle);
        return intent;
    }

    /* renamed from: b */
    public static Intent m17415b(Context context, GoogleSignInOptions googleSignInOptions) {
        f12694a.mo18430a("getFallbackSignInIntent()", new Object[0]);
        Intent a = m17410a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return a;
    }

    /* renamed from: c */
    public static Intent m17417c(Context context, GoogleSignInOptions googleSignInOptions) {
        f12694a.mo18430a("getNoImplementationSignInIntent()", new Object[0]);
        Intent a = m17410a(context, googleSignInOptions);
        a.setAction("com.google.android.gms.auth.NO_IMPL");
        return a;
    }

    /* renamed from: b */
    public static C4237l<Status> m17416b(C4086i iVar, Context context, boolean z) {
        f12694a.mo18430a("Revoking access", new Object[0]);
        String d = C3997b.m17378a(context).mo17523d();
        m17414a(context);
        if (z) {
            return C4000e.m17393a(d);
        }
        return iVar.mo17705b(new C4009n(iVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.C4236k<com.google.android.gms.auth.api.signin.C3990e> m17412a(com.google.android.gms.common.api.C4086i r5, android.content.Context r6, com.google.android.gms.auth.api.signin.GoogleSignInOptions r7, boolean r8) {
        /*
            com.google.android.gms.common.n.a r0 = f12694a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.mo18430a(r3, r2)
            com.google.android.gms.common.n.a r0 = f12694a
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "getEligibleSavedSignInResult()"
            r0.mo18430a(r3, r2)
            com.google.android.gms.common.internal.C4300a0.m18620a(r7)
            com.google.android.gms.auth.api.signin.internal.q r0 = com.google.android.gms.auth.api.signin.internal.C4012q.m17427a(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.mo17540c()
            r2 = 0
            if (r0 == 0) goto L_0x0087
            android.accounts.Account r3 = r0.mo17470e()
            android.accounts.Account r4 = r7.mo17470e()
            if (r3 != 0) goto L_0x0031
            if (r4 != 0) goto L_0x002f
            r3 = 1
            goto L_0x0035
        L_0x002f:
            r3 = 0
            goto L_0x0035
        L_0x0031:
            boolean r3 = r3.equals(r4)
        L_0x0035:
            if (r3 == 0) goto L_0x0087
            boolean r3 = r7.mo17468U()
            if (r3 != 0) goto L_0x0087
            boolean r3 = r7.mo17467T()
            if (r3 == 0) goto L_0x0057
            boolean r3 = r0.mo17467T()
            if (r3 == 0) goto L_0x0087
            java.lang.String r3 = r7.mo17465R()
            java.lang.String r4 = r0.mo17465R()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0087
        L_0x0057:
            java.util.HashSet r3 = new java.util.HashSet
            java.util.ArrayList r0 = r0.mo17464Q()
            r3.<init>(r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.ArrayList r4 = r7.mo17464Q()
            r0.<init>(r4)
            boolean r0 = r3.containsAll(r0)
            if (r0 == 0) goto L_0x0087
            com.google.android.gms.auth.api.signin.internal.q r0 = com.google.android.gms.auth.api.signin.internal.C4012q.m17427a(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r0.mo17539b()
            if (r0 == 0) goto L_0x0087
            boolean r3 = r0.mo17453X()
            if (r3 != 0) goto L_0x0087
            com.google.android.gms.auth.api.signin.e r3 = new com.google.android.gms.auth.api.signin.e
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.f12780P
            r3.<init>(r0, r4)
            goto L_0x0088
        L_0x0087:
            r3 = r2
        L_0x0088:
            if (r3 == 0) goto L_0x0098
            com.google.android.gms.common.n.a r6 = f12694a
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r6.mo18430a(r8, r7)
            com.google.android.gms.common.api.k r5 = com.google.android.gms.common.api.C4239m.m18370b(r3, r5)
            return r5
        L_0x0098:
            if (r8 == 0) goto L_0x00aa
            com.google.android.gms.auth.api.signin.e r6 = new com.google.android.gms.auth.api.signin.e
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r8 = 4
            r7.<init>(r8)
            r6.<init>(r2, r7)
            com.google.android.gms.common.api.k r5 = com.google.android.gms.common.api.C4239m.m18370b(r6, r5)
            return r5
        L_0x00aa:
            com.google.android.gms.common.n.a r8 = f12694a
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r8.mo18430a(r1, r0)
            com.google.android.gms.auth.api.signin.internal.j r8 = new com.google.android.gms.auth.api.signin.internal.j
            r8.<init>(r5, r6, r7)
            com.google.android.gms.common.api.internal.e$a r5 = r5.mo17696a(r8)
            com.google.android.gms.common.api.internal.q r6 = new com.google.android.gms.common.api.internal.q
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.internal.C4004i.m17412a(com.google.android.gms.common.api.i, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.k");
    }

    /* renamed from: a */
    public static C4237l<Status> m17413a(C4086i iVar, Context context, boolean z) {
        f12694a.mo18430a("Signing out", new Object[0]);
        m17414a(context);
        if (z) {
            return C4239m.m18366a(Status.f12780P, iVar);
        }
        return iVar.mo17705b(new C4007l(iVar));
    }

    /* renamed from: a */
    private static void m17414a(Context context) {
        C4012q.m17427a(context).mo17537a();
        for (C4086i i : C4086i.m17622k()) {
            i.mo17720i();
        }
        C4137i.m17846d();
    }

    @C0195i0
    /* renamed from: a */
    public static C3990e m17411a(Intent intent) {
        if (intent != null) {
            String str = "googleSignInStatus";
            String str2 = "googleSignInAccount";
            if (intent.hasExtra(str) || intent.hasExtra(str2)) {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra(str2);
                Status status = (Status) intent.getParcelableExtra(str);
                if (googleSignInAccount != null) {
                    status = Status.f12780P;
                }
                return new C3990e(googleSignInAccount, status);
            }
        }
        return null;
    }
}
