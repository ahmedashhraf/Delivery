package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* renamed from: com.google.android.gms.common.api.internal.c1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4105c1 extends C2612r {

    /* renamed from: b */
    private final /* synthetic */ C4232z0 f12900b;

    C4105c1(C4232z0 z0Var, Looper looper) {
        this.f12900b = z0Var;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f12900b.m18308r();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            sb.toString();
        } else {
            this.f12900b.m18306p();
        }
    }
}
