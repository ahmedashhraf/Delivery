package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;

/* renamed from: com.google.android.gms.internal.measurement.g9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public final class C4779g9 extends C5066yb {

    /* renamed from: N */
    private boolean f14148N;

    /* renamed from: b */
    private final AtomicReference<Bundle> f14149b = new AtomicReference<>();

    /* renamed from: a */
    public static <T> T m20242a(Bundle bundle, Class<T> cls) {
        if (bundle != null) {
            Object obj = bundle.get(AckRequest.ELEMENT);
            if (obj != null) {
                try {
                    return cls.cast(obj);
                } catch (ClassCastException e) {
                    String canonicalName = cls.getCanonicalName();
                    String canonicalName2 = obj.getClass().getCanonicalName();
                    String.format("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{canonicalName, canonicalName2});
                    throw e;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo19016c(Bundle bundle) {
        synchronized (this.f14149b) {
            try {
                this.f14149b.set(bundle);
                this.f14148N = true;
                this.f14149b.notify();
            } catch (Throwable th) {
                this.f14149b.notify();
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final String mo19017d(long j) {
        return (String) m20242a(mo19018e(j), String.class);
    }

    /* renamed from: e */
    public final Bundle mo19018e(long j) {
        Bundle bundle;
        synchronized (this.f14149b) {
            if (!this.f14148N) {
                try {
                    this.f14149b.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f14149b.get();
        }
        return bundle;
    }
}
