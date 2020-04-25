package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.Status;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;

/* renamed from: com.google.android.gms.common.api.internal.r2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4193r2 extends C2612r {

    /* renamed from: b */
    private final /* synthetic */ C4183p2 f13130b;

    public C4193r2(C4183p2 p2Var, Looper looper) {
        this.f13130b = p2Var;
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C4237l lVar = (C4237l) message.obj;
            synchronized (this.f13130b.f13097e) {
                if (lVar == null) {
                    this.f13130b.f13094b.m18111a(new Status(13, "Transform returned null"));
                } else if (lVar instanceof C4135h2) {
                    this.f13130b.f13094b.m18111a(((C4135h2) lVar).mo17842e());
                } else {
                    this.f13130b.f13094b.mo17947a(lVar);
                }
            }
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder(70);
            sb.append("TransformationResultHandler received unknown message type: ");
            sb.append(i);
            sb.toString();
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String str = "Runtime exception on the transformation worker thread: ";
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            throw runtimeException;
        }
    }
}
