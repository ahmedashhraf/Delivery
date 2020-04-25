package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* renamed from: com.google.android.gms.common.api.internal.k1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4154k1 extends C2612r {

    /* renamed from: b */
    private final /* synthetic */ C4142i1 f13029b;

    C4154k1(C4142i1 i1Var, Looper looper) {
        this.f13029b = i1Var;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((C4134h1) message.obj).mo17841a(this.f13029b);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
