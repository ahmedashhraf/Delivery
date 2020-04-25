package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.C4300a0;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4078c implements C4246q {

    /* renamed from: a */
    private final Status f12807a;

    /* renamed from: b */
    private final C4237l<?>[] f12808b;

    C4078c(Status status, C4237l<?>[] lVarArr) {
        this.f12807a = status;
        this.f12808b = lVarArr;
    }

    /* renamed from: a */
    public final <R extends C4246q> R mo17656a(C4079d<R> dVar) {
        C4300a0.m18628a(dVar.f12809a < this.f12808b.length, (Object) "The result token does not belong to this batch");
        return this.f12808b[dVar.f12809a].mo17740a(0, TimeUnit.MILLISECONDS);
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f12807a;
    }
}
