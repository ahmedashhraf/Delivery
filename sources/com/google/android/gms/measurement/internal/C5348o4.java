package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4300a0;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5348o4 implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f15356a;

    /* renamed from: b */
    private final /* synthetic */ C5326m4 f15357b;

    public C5348o4(C5326m4 m4Var, String str) {
        this.f15357b = m4Var;
        C4300a0.m18620a(str);
        this.f15356a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f15357b.mo21205d().mo21533t().mo21550a(this.f15356a, th);
    }
}
