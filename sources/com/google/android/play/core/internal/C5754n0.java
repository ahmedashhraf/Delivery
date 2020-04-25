package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.play.core.internal.n0 */
final class C5754n0 extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f16621a;

    public C5754n0(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f16621a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C5754n0.class) {
            if (this == obj) {
                return true;
            }
            C5754n0 n0Var = (C5754n0) obj;
            return this.f16621a == n0Var.f16621a && get() == n0Var.get();
        }
    }

    public final int hashCode() {
        return this.f16621a;
    }
}
