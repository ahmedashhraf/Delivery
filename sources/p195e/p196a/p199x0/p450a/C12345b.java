package p195e.p196a.p199x0.p450a;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12330f;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.a.b */
/* compiled from: CancellableDisposable */
public final class C12345b extends AtomicReference<C12330f> implements C12314c {
    private static final long serialVersionUID = 5718521705281392066L;

    public C12345b(C12330f fVar) {
        super(fVar);
    }

    /* renamed from: d */
    public boolean mo41878d() {
        return get() == null;
    }

    public void dispose() {
        if (get() != null) {
            C12330f fVar = (C12330f) getAndSet(null);
            if (fVar != null) {
                try {
                    fVar.cancel();
                } catch (Exception e) {
                    C14398a.m62357b(e);
                    C12205a.m54894b((Throwable) e);
                }
            }
        }
    }
}
