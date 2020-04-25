package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.C3917a;
import com.google.android.gms.auth.api.signin.C3985b;
import com.google.android.gms.auth.api.signin.C3990e;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4236k;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C4002g implements C3985b {
    /* renamed from: e */
    private static GoogleSignInOptions m17397e(C4086i iVar) {
        return ((C4003h) iVar.mo17695a((C4062c<C>) C3917a.f12415b)).mo17532E();
    }

    /* renamed from: a */
    public final Intent mo17489a(C4086i iVar) {
        return C4004i.m17410a(iVar.mo17716e(), m17397e(iVar));
    }

    /* renamed from: b */
    public final C4237l<Status> mo17491b(C4086i iVar) {
        return C4004i.m17416b(iVar, iVar.mo17716e(), false);
    }

    /* renamed from: c */
    public final C4236k<C3990e> mo17492c(C4086i iVar) {
        return C4004i.m17412a(iVar, iVar.mo17716e(), m17397e(iVar), false);
    }

    /* renamed from: d */
    public final C4237l<Status> mo17493d(C4086i iVar) {
        return C4004i.m17413a(iVar, iVar.mo17716e(), false);
    }

    /* renamed from: a */
    public final C3990e mo17490a(Intent intent) {
        return C4004i.m17411a(intent);
    }
}
