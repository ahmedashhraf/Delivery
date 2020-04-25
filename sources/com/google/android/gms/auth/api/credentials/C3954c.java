package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.credentials.c */
public interface C3954c {

    /* renamed from: a */
    public static final int f12556a = 1000;

    /* renamed from: b */
    public static final int f12557b = 1001;

    /* renamed from: c */
    public static final int f12558c = 1002;

    /* renamed from: d */
    public static final int f12559d = 2000;

    /* renamed from: a */
    PendingIntent mo17403a(C4086i iVar, HintRequest hintRequest);

    /* renamed from: a */
    C4237l<Status> mo17404a(C4086i iVar);

    /* renamed from: a */
    C4237l<Status> mo17405a(C4086i iVar, Credential credential);

    /* renamed from: a */
    C4237l<C3952a> mo17406a(C4086i iVar, CredentialRequest credentialRequest);

    /* renamed from: b */
    C4237l<Status> mo17407b(C4086i iVar, Credential credential);
}
