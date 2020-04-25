package kotlin.p506g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo24990d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.j */
/* compiled from: Sequences.kt */
final class C14588j<T> implements C14594m<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6069a<T> f42733a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6080l<T, T> f42734b;

    /* renamed from: kotlin.g1.j$a */
    /* compiled from: Sequences.kt */
    public static final class C14589a implements Iterator<T>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14588j f42735N;
        @C6004e

        /* renamed from: a */
        private T f42736a;

        /* renamed from: b */
        private int f42737b = -2;

        C14589a(C14588j jVar) {
            this.f42735N = jVar;
        }

        /* renamed from: d */
        private final void m63153d() {
            T t;
            if (this.f42737b == -2) {
                t = this.f42735N.f42733a.mo24947p();
            } else {
                C6080l b = this.f42735N.f42734b;
                T t2 = this.f42736a;
                if (t2 == null) {
                    C14445h0.m62474e();
                }
                t = b.invoke(t2);
            }
            this.f42736a = t;
            this.f42737b = this.f42736a == null ? 0 : 1;
        }

        /* renamed from: a */
        public final void mo45796a(int i) {
            this.f42737b = i;
        }

        @C6004e
        /* renamed from: b */
        public final T mo45797b() {
            return this.f42736a;
        }

        /* renamed from: c */
        public final int mo45799c() {
            return this.f42737b;
        }

        public boolean hasNext() {
            if (this.f42737b < 0) {
                m63153d();
            }
            return this.f42737b == 1;
        }

        @C6003d
        public T next() {
            if (this.f42737b < 0) {
                m63153d();
            }
            if (this.f42737b != 0) {
                T t = this.f42736a;
                if (t != null) {
                    this.f42737b = -1;
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public final void mo45798b(@C6004e T t) {
            this.f42736a = t;
        }
    }

    public C14588j(@C6003d C6069a<? extends T> aVar, @C6003d C6080l<? super T, ? extends T> lVar) {
        C14445h0.m62478f(aVar, "getInitialValue");
        C14445h0.m62478f(lVar, "getNextValue");
        this.f42733a = aVar;
        this.f42734b = lVar;
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14589a(this);
    }
}
