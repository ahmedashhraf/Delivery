package com.google.android.gms.common.internal;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@C4056a
/* renamed from: com.google.android.gms.common.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4305c {
    @C0193h0
    @C4056a
    /* renamed from: a */
    public static ApiException m18635a(@C0193h0 Status status) {
        if (status.mo17614Q()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
