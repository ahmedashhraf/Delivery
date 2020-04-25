package com.google.firebase;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4221x;

@C4056a
/* renamed from: com.google.firebase.f */
public class C8667f implements C4221x {
    /* renamed from: a */
    public Exception mo17774a(Status status) {
        if (status.mo17612O() == 8) {
            return new FirebaseException(status.zzg());
        }
        return new FirebaseApiNotAvailableException(status.zzg());
    }
}
