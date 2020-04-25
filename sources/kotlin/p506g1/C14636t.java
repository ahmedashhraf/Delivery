package kotlin.p506g1;

import java.util.Iterator;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo24990d2 = {"Lkotlin/sequences/TransformingIndexedSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function2;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.t */
/* compiled from: Sequences.kt */
public final class C14636t<T, R> implements C14594m<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42810a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6084p<Integer, T, R> f42811b;

    /* renamed from: kotlin.g1.t$a */
    /* compiled from: Sequences.kt */
    public static final class C14637a implements Iterator<R>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14636t f42812N;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42813a;

        /* renamed from: b */
        private int f42814b;

        C14637a(C14636t tVar) {
            this.f42812N = tVar;
            this.f42813a = tVar.f42810a.iterator();
        }

        /* renamed from: a */
        public final void mo45847a(int i) {
            this.f42814b = i;
        }

        /* renamed from: b */
        public final int mo45848b() {
            return this.f42814b;
        }

        @C6003d
        /* renamed from: c */
        public final Iterator<T> mo45849c() {
            return this.f42813a;
        }

        public boolean hasNext() {
            return this.f42813a.hasNext();
        }

        public R next() {
            C6084p b = this.f42812N.f42811b;
            int i = this.f42814b;
            this.f42814b = i + 1;
            return b.mo24962d(Integer.valueOf(i), this.f42813a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14636t(@C6003d C14594m<? extends T> mVar, @C6003d C6084p<? super Integer, ? super T, ? extends R> pVar) {
        C14445h0.m62478f(mVar, "sequence");
        C14445h0.m62478f(pVar, "transformer");
        this.f42810a = mVar;
        this.f42811b = pVar;
    }

    @C6003d
    public Iterator<R> iterator() {
        return new C14637a(this);
    }
}
