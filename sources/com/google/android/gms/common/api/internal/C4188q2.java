package com.google.android.gms.common.api.internal;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5543c;
import com.google.android.gms.tasks.C5560k;

/* renamed from: com.google.android.gms.common.api.internal.q2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4188q2 implements C5543c<Boolean, Void> {
    C4188q2() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17952a(@C0193h0 C5560k kVar) throws Exception {
        if (((Boolean) kVar.mo22008b()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
