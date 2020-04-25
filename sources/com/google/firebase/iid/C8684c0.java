package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.C5547e;

/* renamed from: com.google.firebase.iid.c0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8684c0 extends Binder {

    /* renamed from: a */
    private final C8693f0 f22801a;

    public C8684c0(C8693f0 f0Var) {
        this.f22801a = f0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32114a(C8697h0 h0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
            this.f22801a.mo32122a(h0Var.f22819a).mo21998a(C8686d.m40830a(), (C5547e<TResult>) new C8681b0<TResult>(h0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
