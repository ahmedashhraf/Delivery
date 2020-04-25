package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.g0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final /* synthetic */ class C8695g0 implements Runnable {

    /* renamed from: a */
    private final C8697h0 f22816a;

    /* renamed from: b */
    private final Intent f22817b;

    C8695g0(C8697h0 h0Var, Intent intent) {
        this.f22816a = h0Var;
        this.f22817b = intent;
    }

    public final void run() {
        C8697h0 h0Var = this.f22816a;
        String action = this.f22817b.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        sb.toString();
        h0Var.mo32126a();
    }
}
