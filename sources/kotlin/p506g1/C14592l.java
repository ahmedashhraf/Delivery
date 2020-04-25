package kotlin.p506g1;

import java.util.Iterator;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004B;\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo24990d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "sequence1", "sequence2", "transform", "Lkotlin/Function2;", "(Lkotlin/sequences/Sequence;Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.l */
/* compiled from: Sequences.kt */
public final class C14592l<T1, T2, V> implements C14594m<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T1> f42742a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14594m<T2> f42743b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6084p<T1, T2, V> f42744c;

    /* renamed from: kotlin.g1.l$a */
    /* compiled from: Sequences.kt */
    public static final class C14593a implements Iterator<V>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14592l f42745N;
        @C6003d

        /* renamed from: a */
        private final Iterator<T1> f42746a;
        @C6003d

        /* renamed from: b */
        private final Iterator<T2> f42747b;

        C14593a(C14592l lVar) {
            this.f42745N = lVar;
            this.f42746a = lVar.f42742a.iterator();
            this.f42747b = lVar.f42743b.iterator();
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T1> mo45809b() {
            return this.f42746a;
        }

        @C6003d
        /* renamed from: c */
        public final Iterator<T2> mo45810c() {
            return this.f42747b;
        }

        public boolean hasNext() {
            return this.f42746a.hasNext() && this.f42747b.hasNext();
        }

        public V next() {
            return this.f42745N.f42744c.mo24962d(this.f42746a.next(), this.f42747b.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14592l(@C6003d C14594m<? extends T1> mVar, @C6003d C14594m<? extends T2> mVar2, @C6003d C6084p<? super T1, ? super T2, ? extends V> pVar) {
        C14445h0.m62478f(mVar, "sequence1");
        C14445h0.m62478f(mVar2, "sequence2");
        C14445h0.m62478f(pVar, "transform");
        this.f42742a = mVar;
        this.f42743b = mVar2;
        this.f42744c = pVar;
    }

    @C6003d
    public Iterator<V> iterator() {
        return new C14593a(this);
    }
}
