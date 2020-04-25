package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.j */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
final /* synthetic */ class C8752j implements Executor {

    /* renamed from: a */
    static final Executor f22971a = new C8752j();

    private C8752j() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
