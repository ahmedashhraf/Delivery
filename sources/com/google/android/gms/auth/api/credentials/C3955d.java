package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.auth.api.C3917a;
import com.google.android.gms.auth.api.C3917a.C3918a;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.internal.C4097b;
import com.google.android.gms.common.api.internal.C4221x;
import com.google.android.gms.common.internal.C4416z;
import com.google.android.gms.internal.auth-api.C4564o;
import com.google.android.gms.tasks.C5560k;

/* renamed from: com.google.android.gms.auth.api.credentials.d */
public class C3955d extends C4083h<C3918a> {
    C3955d(@C0193h0 Context context, @C0193h0 C3918a aVar) {
        super(context, C3917a.f12419f, aVar, (C4221x) new C4097b());
    }

    /* renamed from: a */
    public C5560k<CredentialRequestResponse> mo17410a(@C0193h0 CredentialRequest credentialRequest) {
        return C4416z.m19056a(C3917a.f12422i.mo17406a(mo17679c(), credentialRequest), new CredentialRequestResponse());
    }

    /* renamed from: b */
    public C5560k<Void> mo17411b(@C0193h0 Credential credential) {
        return C4416z.m19055a(C3917a.f12422i.mo17407b(mo17679c(), credential));
    }

    /* renamed from: k */
    public C5560k<Void> mo17412k() {
        return C4416z.m19055a(C3917a.f12422i.mo17404a(mo17679c()));
    }

    C3955d(@C0193h0 Activity activity, @C0193h0 C3918a aVar) {
        super(activity, C3917a.f12419f, aVar, (C4221x) new C4097b());
    }

    /* renamed from: a */
    public PendingIntent mo17408a(@C0193h0 HintRequest hintRequest) {
        return C4564o.m19613a(mo17686h(), (C3918a) mo17685g(), hintRequest);
    }

    /* renamed from: a */
    public C5560k<Void> mo17409a(@C0193h0 Credential credential) {
        return C4416z.m19055a(C3917a.f12422i.mo17405a(mo17679c(), credential));
    }
}
