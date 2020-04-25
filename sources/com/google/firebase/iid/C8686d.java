package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.d */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8686d {

    /* renamed from: a */
    private static final Executor f22802a = C8699i0.f22823a;

    /* renamed from: a */
    static Executor m40830a() {
        return f22802a;
    }

    /* renamed from: b */
    static Executor m40831b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C8702j0.f22826a);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m40829a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
