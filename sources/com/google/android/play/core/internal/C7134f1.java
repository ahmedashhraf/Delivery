package com.google.android.play.core.internal;

import android.os.IBinder.DeathRecipient;

/* renamed from: com.google.android.play.core.internal.f1 */
final /* synthetic */ class C7134f1 implements DeathRecipient {

    /* renamed from: a */
    private final C7128c1 f20239a;

    C7134f1(C7128c1 c1Var) {
        this.f20239a = c1Var;
    }

    public final void binderDied() {
        this.f20239a.mo28498c();
    }
}
