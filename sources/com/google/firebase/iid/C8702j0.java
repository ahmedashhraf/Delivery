package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.j0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final /* synthetic */ class C8702j0 implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f22826a = new C8702j0();

    private C8702j0() {
    }

    public final Thread newThread(Runnable runnable) {
        return C8686d.m40829a(runnable);
    }
}
