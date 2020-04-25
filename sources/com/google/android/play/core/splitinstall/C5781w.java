package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.w */
public final class C5781w {

    /* renamed from: a */
    private static final AtomicReference<C5783y> f16662a = new AtomicReference<>(null);

    /* renamed from: a */
    static C5783y m25339a() {
        return (C5783y) f16662a.get();
    }

    /* renamed from: a */
    public static void m25340a(C5783y yVar) {
        f16662a.compareAndSet(null, yVar);
    }
}
