package p195e.p196a.p199x0.p450a;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.a.a */
/* compiled from: ArrayCompositeDisposable */
public final class C12344a extends AtomicReferenceArray<C12314c> implements C12314c {
    private static final long serialVersionUID = 2746389416410565408L;

    public C12344a(int i) {
        super(i);
    }

    /* renamed from: a */
    public C12314c mo42102a(int i, C12314c cVar) {
        C12314c cVar2;
        do {
            cVar2 = (C12314c) get(i);
            if (cVar2 == C12347d.DISPOSED) {
                cVar.dispose();
                return null;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        return cVar2;
    }

    /* renamed from: b */
    public boolean mo42103b(int i, C12314c cVar) {
        C12314c cVar2;
        do {
            cVar2 = (C12314c) get(i);
            if (cVar2 == C12347d.DISPOSED) {
                cVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        if (cVar2 != null) {
            cVar2.dispose();
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get(0) == C12347d.DISPOSED;
    }

    public void dispose() {
        if (get(0) != C12347d.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                C12314c cVar = (C12314c) get(i);
                C12347d dVar = C12347d.DISPOSED;
                if (cVar != dVar) {
                    C12314c cVar2 = (C12314c) getAndSet(i, dVar);
                    if (!(cVar2 == C12347d.DISPOSED || cVar2 == null)) {
                        cVar2.dispose();
                    }
                }
            }
        }
    }
}
