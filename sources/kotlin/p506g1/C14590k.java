package kotlin.p506g1;

import java.util.Iterator;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p219v0.C14783i0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo24990d2 = {"Lkotlin/sequences/IndexingSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/collections/IndexedValue;", "sequence", "(Lkotlin/sequences/Sequence;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.k */
/* compiled from: Sequences.kt */
public final class C14590k<T> implements C14594m<C14783i0<? extends T>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42738a;

    /* renamed from: kotlin.g1.k$a */
    /* compiled from: Sequences.kt */
    public static final class C14591a implements Iterator<C14783i0<? extends T>>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14590k f42739N;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42740a;

        /* renamed from: b */
        private int f42741b;

        C14591a(C14590k kVar) {
            this.f42739N = kVar;
            this.f42740a = kVar.f42738a.iterator();
        }

        /* renamed from: a */
        public final void mo45803a(int i) {
            this.f42741b = i;
        }

        /* renamed from: b */
        public final int mo45804b() {
            return this.f42741b;
        }

        @C6003d
        /* renamed from: c */
        public final Iterator<T> mo45805c() {
            return this.f42740a;
        }

        public boolean hasNext() {
            return this.f42740a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @C6003d
        public C14783i0<T> next() {
            int i = this.f42741b;
            this.f42741b = i + 1;
            return new C14783i0<>(i, this.f42740a.next());
        }
    }

    public C14590k(@C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(mVar, "sequence");
        this.f42738a = mVar;
    }

    @C6003d
    public Iterator<C14783i0<T>> iterator() {
        return new C14591a(this);
    }
}
