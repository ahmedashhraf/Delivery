package com.mrsool.offer;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.mrsool.offer.b */
/* compiled from: lambda */
public final /* synthetic */ class C10962b implements UncaughtExceptionHandler {

    /* renamed from: a */
    private final /* synthetic */ OfferOrderActivity f30220a;

    public /* synthetic */ C10962b(OfferOrderActivity offerOrderActivity) {
        this.f30220a = offerOrderActivity;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f30220a.mo38706a(thread, th);
    }
}
