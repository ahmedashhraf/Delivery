package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.C5562l;

/* renamed from: com.google.firebase.messaging.g */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
final /* synthetic */ class C8749g implements Runnable {

    /* renamed from: N */
    private final C5562l f22965N;

    /* renamed from: a */
    private final C8747e f22966a;

    /* renamed from: b */
    private final Intent f22967b;

    C8749g(C8747e eVar, Intent intent, C5562l lVar) {
        this.f22966a = eVar;
        this.f22967b = intent;
        this.f22965N = lVar;
    }

    public final void run() {
        C8747e eVar = this.f22966a;
        Intent intent = this.f22967b;
        C5562l lVar = this.f22965N;
        try {
            eVar.mo32195c(intent);
        } finally {
            lVar.mo22019a(null);
        }
    }
}
