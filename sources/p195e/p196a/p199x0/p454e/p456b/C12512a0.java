package p195e.p196a.p199x0.p454e.p456b;

import java.util.concurrent.atomic.AtomicReference;
import p195e.p196a.C12268f;
import p195e.p196a.C12297q;
import p195e.p196a.C5927i;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p450a.C12347d;
import p195e.p196a.p199x0.p465i.C13742j;
import p195e.p196a.p447u0.C12314c;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.e.b.a0 */
/* compiled from: FlowableConcatWithCompletable */
public final class C12512a0<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C5927i f35815N;

    /* renamed from: e.a.x0.e.b.a0$a */
    /* compiled from: FlowableConcatWithCompletable */
    static final class C12513a<T> extends AtomicReference<C12314c> implements C12297q<T>, C12268f, C14063d {
        private static final long serialVersionUID = -7346385463600070225L;

        /* renamed from: N */
        C5927i f35816N;

        /* renamed from: O */
        boolean f35817O;

        /* renamed from: a */
        final C14062c<? super T> f35818a;

        /* renamed from: b */
        C14063d f35819b;

        C12513a(C14062c<? super T> cVar, C5927i iVar) {
            this.f35818a = cVar;
            this.f35816N = iVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            if (C13742j.m58673a(this.f35819b, dVar)) {
                this.f35819b = dVar;
                this.f35818a.mo41788a((C14063d) this);
            }
        }

        /* renamed from: c */
        public void mo41813c(long j) {
            this.f35819b.mo41813c(j);
        }

        public void cancel() {
            this.f35819b.cancel();
            C12347d.m55465a((AtomicReference<C12314c>) this);
        }

        public void onComplete() {
            if (this.f35817O) {
                this.f35818a.onComplete();
                return;
            }
            this.f35817O = true;
            this.f35819b = C13742j.CANCELLED;
            C5927i iVar = this.f35816N;
            this.f35816N = null;
            iVar.mo24122a(this);
        }

        public void onError(Throwable th) {
            this.f35818a.onError(th);
        }

        /* renamed from: a */
        public void mo41921a(C12314c cVar) {
            C12347d.m55468c(this, cVar);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            this.f35818a.mo41789a(t);
        }
    }

    public C12512a0(C5929l<T> lVar, C5927i iVar) {
        super(lVar);
        this.f35815N = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        this.f35814b.mo24393a((C12297q<? super T>) new C12513a<Object>(cVar, this.f35815N));
    }
}
