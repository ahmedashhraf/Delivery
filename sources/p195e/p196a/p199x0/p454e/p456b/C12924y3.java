package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12297q;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p465i.C13741i;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.y3 */
/* compiled from: FlowableSwitchIfEmpty */
public final class C12924y3<T> extends C12511a<T, T> {

    /* renamed from: N */
    final C6007b<? extends T> f37230N;

    /* renamed from: e.a.x0.e.b.y3$a */
    /* compiled from: FlowableSwitchIfEmpty */
    static final class C12925a<T> implements C12297q<T> {

        /* renamed from: N */
        final C13741i f37231N = new C13741i();

        /* renamed from: O */
        boolean f37232O = true;

        /* renamed from: a */
        final C14062c<? super T> f37233a;

        /* renamed from: b */
        final C6007b<? extends T> f37234b;

        C12925a(C14062c<? super T> cVar, C6007b<? extends T> bVar) {
            this.f37233a = cVar;
            this.f37234b = bVar;
        }

        /* renamed from: a */
        public void mo41788a(C14063d dVar) {
            this.f37231N.mo43130b(dVar);
        }

        public void onComplete() {
            if (this.f37232O) {
                this.f37232O = false;
                this.f37234b.mo24397a(this);
                return;
            }
            this.f37233a.onComplete();
        }

        public void onError(Throwable th) {
            this.f37233a.onError(th);
        }

        /* renamed from: a */
        public void mo41789a(T t) {
            if (this.f37232O) {
                this.f37232O = false;
            }
            this.f37233a.mo41789a(t);
        }
    }

    public C12924y3(C5929l<T> lVar, C6007b<? extends T> bVar) {
        super(lVar);
        this.f37230N = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24499e(C14062c<? super T> cVar) {
        C12925a aVar = new C12925a(cVar, this.f37230N);
        cVar.mo41788a((C14063d) aVar.f37231N);
        this.f35814b.mo24393a((C12297q<? super T>) aVar);
    }
}
