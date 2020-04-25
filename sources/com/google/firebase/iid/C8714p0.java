package com.google.firebase.iid;

import com.google.firebase.p314i.C8671a;
import com.google.firebase.p314i.C8672b;

/* renamed from: com.google.firebase.iid.p0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final /* synthetic */ class C8714p0 implements C8672b {

    /* renamed from: a */
    private final C8675a f22852a;

    C8714p0(C8675a aVar) {
        this.f22852a = aVar;
    }

    /* renamed from: a */
    public final void mo31978a(C8671a aVar) {
        C8675a aVar2 = this.f22852a;
        synchronized (aVar2) {
            if (aVar2.mo32084a()) {
                FirebaseInstanceId.this.m40760p();
            }
        }
    }
}
