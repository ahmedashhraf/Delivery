package com.google.android.gms.common.api;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4135h2;

/* renamed from: com.google.android.gms.common.api.t */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4249t<R extends C4246q, S extends C4246q> {
    @C0193h0
    /* renamed from: a */
    public final C4237l<S> mo18012a(@C0193h0 Status status) {
        return new C4135h2(status);
    }

    @C0226w0
    @C0195i0
    /* renamed from: a */
    public abstract C4237l<S> mo18013a(@C0193h0 R r);

    @C0193h0
    /* renamed from: b */
    public Status mo18014b(@C0193h0 Status status) {
        return status;
    }
}
