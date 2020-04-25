package com.google.firebase.analytics;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.analytics.c */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
final class C8627c implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAnalytics f22645a;

    C8627c(FirebaseAnalytics firebaseAnalytics) {
        this.f22645a = firebaseAnalytics;
    }

    public final /* synthetic */ Object call() throws Exception {
        String str;
        String a = this.f22645a.m25722d();
        if (a != null) {
            return a;
        }
        if (this.f22645a.f16858c) {
            str = this.f22645a.f16857b.mo18969h();
        } else {
            str = this.f22645a.f16856a.mo21606t().mo21777c(120000);
        }
        if (str != null) {
            this.f22645a.m25717b(str);
            return str;
        }
        throw new TimeoutException();
    }
}
