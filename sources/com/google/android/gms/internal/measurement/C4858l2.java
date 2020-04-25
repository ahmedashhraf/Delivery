package com.google.android.gms.internal.measurement;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4858l2 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f14247a;

    public C4858l2(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f14247a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4858l2.class) {
            if (this == obj) {
                return true;
            }
            C4858l2 l2Var = (C4858l2) obj;
            return this.f14247a == l2Var.f14247a && get() == l2Var.get();
        }
    }

    public final int hashCode() {
        return this.f14247a;
    }
}
