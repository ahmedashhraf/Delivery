package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5543c;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4093a0 {
    @C4056a
    /* renamed from: a */
    public static void m17711a(Status status, C5562l<Void> lVar) {
        m17712a(status, null, lVar);
    }

    @C4056a
    /* renamed from: a */
    public static <TResult> void m17712a(Status status, TResult tresult, C5562l<TResult> lVar) {
        if (status.mo17617T()) {
            lVar.mo22019a(tresult);
        } else {
            lVar.mo22018a((Exception) new ApiException(status));
        }
    }

    @C4056a
    @Deprecated
    /* renamed from: a */
    public static C5560k<Void> m17710a(C5560k<Boolean> kVar) {
        return kVar.mo21990a((C5543c<TResult, TContinuationResult>) new C4188q2<TResult,TContinuationResult>());
    }
}
