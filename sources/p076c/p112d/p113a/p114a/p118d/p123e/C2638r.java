package p076c.p112d.p113a.p114a.p118d.p123e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: c.d.a.a.d.e.r */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C2638r extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f9753a;

    public C2638r(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f9753a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2638r.class) {
            if (this == obj) {
                return true;
            }
            C2638r rVar = (C2638r) obj;
            return this.f9753a == rVar.f9753a && get() == rVar.get();
        }
    }

    public final int hashCode() {
        return this.f9753a;
    }
}
