package kotlin.p506g1;

import java.util.Iterator;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo24990d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.u */
/* compiled from: Sequences.kt */
public final class C14638u<T, R> implements C14594m<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42815a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6080l<T, R> f42816b;

    /* renamed from: kotlin.g1.u$a */
    /* compiled from: Sequences.kt */
    public static final class C14639a implements Iterator<R>, C14464a {
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42817a;

        /* renamed from: b */
        final /* synthetic */ C14638u f42818b;

        C14639a(C14638u uVar) {
            this.f42818b = uVar;
            this.f42817a = uVar.f42815a.iterator();
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T> mo45854b() {
            return this.f42817a;
        }

        public boolean hasNext() {
            return this.f42817a.hasNext();
        }

        public R next() {
            return this.f42818b.f42816b.invoke(this.f42817a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14638u(@C6003d C14594m<? extends T> mVar, @C6003d C6080l<? super T, ? extends R> lVar) {
        C14445h0.m62478f(mVar, "sequence");
        C14445h0.m62478f(lVar, "transformer");
        this.f42815a = mVar;
        this.f42816b = lVar;
    }

    @C6003d
    public Iterator<R> iterator() {
        return new C14639a(this);
    }

    @C6003d
    /* renamed from: a */
    public final <E> C14594m<E> mo45853a(@C6003d C6080l<? super R, ? extends Iterator<? extends E>> lVar) {
        C14445h0.m62478f(lVar, "iterator");
        return new C14586i(this.f42815a, this.f42816b, lVar);
    }
}
