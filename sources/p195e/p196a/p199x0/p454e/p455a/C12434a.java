package p195e.p196a.p199x0.p454e.p455a;

import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.C12268f;
import p195e.p196a.C5925c;
import p195e.p196a.C5927i;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.a.a */
/* compiled from: CompletableAmb */
public final class C12434a extends C5925c {

    /* renamed from: a */
    private final C5927i[] f35638a;

    /* renamed from: b */
    private final Iterable<? extends C5927i> f35639b;

    /* renamed from: e.a.x0.e.a.a$a */
    /* compiled from: CompletableAmb */
    static final class C12435a implements C12268f {

        /* renamed from: N */
        private final C12268f f35640N;

        /* renamed from: a */
        private final AtomicBoolean f35641a;

        /* renamed from: b */
        private final C12313b f35642b;

        C12435a(AtomicBoolean atomicBoolean, C12313b bVar, C12268f fVar) {
            this.f35641a = atomicBoolean;
            this.f35642b = bVar;
            this.f35640N = fVar;
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            this.f35642b.mo42072b(cVar);
        }

        public void onComplete() {
            if (this.f35641a.compareAndSet(false, true)) {
                this.f35642b.dispose();
                this.f35640N.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f35641a.compareAndSet(false, true)) {
                this.f35642b.dispose();
                this.f35640N.onError(th);
                return;
            }
            C12205a.m54894b(th);
        }
    }

    public C12434a(C5927i[] iVarArr, Iterable<? extends C5927i> iterable) {
        this.f35638a = iVarArr;
        this.f35639b = iterable;
    }

    /* renamed from: b */
    public void mo24134b(C12268f fVar) {
        int i;
        C5927i[] iVarArr = this.f35638a;
        String str = "One of the sources is null";
        if (iVarArr == null) {
            iVarArr = new C5927i[8];
            try {
                i = 0;
                for (C5927i iVar : this.f35639b) {
                    if (iVar == null) {
                        C12348e.m55475a((Throwable) new NullPointerException(str), fVar);
                        return;
                    }
                    if (i == iVarArr.length) {
                        C5927i[] iVarArr2 = new C5927i[((i >> 2) + i)];
                        System.arraycopy(iVarArr, 0, iVarArr2, 0, i);
                        iVarArr = iVarArr2;
                    }
                    int i2 = i + 1;
                    iVarArr[i] = iVar;
                    i = i2;
                }
            } catch (Throwable th) {
                C14398a.m62357b(th);
                C12348e.m55475a(th, fVar);
                return;
            }
        } else {
            i = iVarArr.length;
        }
        C12313b bVar = new C12313b();
        fVar.mo41921a(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C12435a aVar = new C12435a(atomicBoolean, bVar, fVar);
        int i3 = 0;
        while (i3 < i) {
            C5927i iVar2 = iVarArr[i3];
            if (!bVar.mo41878d()) {
                if (iVar2 == null) {
                    NullPointerException nullPointerException = new NullPointerException(str);
                    if (atomicBoolean.compareAndSet(false, true)) {
                        bVar.dispose();
                        fVar.onError(nullPointerException);
                    } else {
                        C12205a.m54894b((Throwable) nullPointerException);
                    }
                    return;
                }
                iVar2.mo24122a(aVar);
                i3++;
            } else {
                return;
            }
        }
        if (i == 0) {
            fVar.onComplete();
        }
    }
}
