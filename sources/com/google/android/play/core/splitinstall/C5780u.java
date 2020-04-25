package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.u */
public enum C5780u implements C5779t {
    INSTANCE;
    

    /* renamed from: b */
    private static final AtomicReference<C5777r> f16661b = null;

    static {
        INSTANCE = new C5780u("INSTANCE", 0);
        new C5780u[1][0] = INSTANCE;
        f16661b = new AtomicReference<>(null);
    }

    /* renamed from: a */
    public static void m25337a(C5777r rVar) {
        f16661b.compareAndSet(null, rVar);
    }

    /* renamed from: d */
    public final C5777r mo23064d() {
        return (C5777r) f16661b.get();
    }
}
