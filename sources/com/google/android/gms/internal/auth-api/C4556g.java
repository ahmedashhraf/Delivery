package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.C3917a;
import com.google.android.gms.auth.api.credentials.C3952a;
import com.google.android.gms.auth.api.credentials.C3954c;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.internal.auth-api.g */
public final class C4556g implements C3954c {
    /* renamed from: a */
    public final C4237l<C3952a> mo17406a(C4086i iVar, CredentialRequest credentialRequest) {
        C4300a0.m18621a(iVar, (Object) "client must not be null");
        C4300a0.m18621a(credentialRequest, (Object) "request must not be null");
        return iVar.mo17696a(new C4557h(this, iVar, credentialRequest));
    }

    /* renamed from: b */
    public final C4237l<Status> mo17407b(C4086i iVar, Credential credential) {
        C4300a0.m18621a(iVar, (Object) "client must not be null");
        C4300a0.m18621a(credential, (Object) "credential must not be null");
        return iVar.mo17705b(new C4559j(this, iVar, credential));
    }

    /* renamed from: a */
    public final PendingIntent mo17403a(C4086i iVar, HintRequest hintRequest) {
        C4300a0.m18621a(iVar, (Object) "client must not be null");
        C4300a0.m18621a(hintRequest, (Object) "request must not be null");
        return C4564o.m19613a(iVar.mo17716e(), ((C4565p) iVar.mo17695a((C4062c<C>) C3917a.f12414a)).mo17532E(), hintRequest);
    }

    /* renamed from: a */
    public final C4237l<Status> mo17405a(C4086i iVar, Credential credential) {
        C4300a0.m18621a(iVar, (Object) "client must not be null");
        C4300a0.m18621a(credential, (Object) "credential must not be null");
        return iVar.mo17705b(new C4560k(this, iVar, credential));
    }

    /* renamed from: a */
    public final C4237l<Status> mo17404a(C4086i iVar) {
        C4300a0.m18621a(iVar, (Object) "client must not be null");
        return iVar.mo17705b(new C4561l(this, iVar));
    }
}
