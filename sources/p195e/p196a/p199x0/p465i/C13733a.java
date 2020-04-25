package p195e.p196a.p199x0.p465i;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.i.a */
/* compiled from: ArrayCompositeSubscription */
public final class C13733a extends AtomicReferenceArray<C14063d> implements C12314c {
    private static final long serialVersionUID = 2746389416410565408L;

    public C13733a(int i) {
        super(i);
    }

    /* renamed from: a */
    public C14063d mo43116a(int i, C14063d dVar) {
        C14063d dVar2;
        do {
            dVar2 = (C14063d) get(i);
            if (dVar2 == C13742j.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return null;
            }
        } while (!compareAndSet(i, dVar2, dVar));
        return dVar2;
    }

    /* renamed from: b */
    public boolean mo43117b(int i, C14063d dVar) {
        C14063d dVar2;
        do {
            dVar2 = (C14063d) get(i);
            if (dVar2 == C13742j.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                }
                return false;
            }
        } while (!compareAndSet(i, dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get(0) == C13742j.CANCELLED;
    }

    public void dispose() {
        if (get(0) != C13742j.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                C14063d dVar = (C14063d) get(i);
                C13742j jVar = C13742j.CANCELLED;
                if (dVar != jVar) {
                    C14063d dVar2 = (C14063d) getAndSet(i, jVar);
                    if (!(dVar2 == C13742j.CANCELLED || dVar2 == null)) {
                        dVar2.cancel();
                    }
                }
            }
        }
    }
}
