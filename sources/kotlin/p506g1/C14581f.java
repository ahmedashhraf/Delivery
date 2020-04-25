package kotlin.p506g1;

import java.util.Iterator;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo24990d2 = {"Lkotlin/sequences/DropWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.f */
/* compiled from: Sequences.kt */
public final class C14581f<T> implements C14594m<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42713a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6080l<T, Boolean> f42714b;

    /* renamed from: kotlin.g1.f$a */
    /* compiled from: Sequences.kt */
    public static final class C14582a implements Iterator<T>, C14464a {
        @C6004e

        /* renamed from: N */
        private T f42715N;

        /* renamed from: O */
        final /* synthetic */ C14581f f42716O;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42717a;

        /* renamed from: b */
        private int f42718b = -1;

        C14582a(C14581f fVar) {
            this.f42716O = fVar;
            this.f42717a = fVar.f42713a.iterator();
        }

        /* renamed from: g */
        private final void m63125g() {
            while (this.f42717a.hasNext()) {
                T next = this.f42717a.next();
                if (!((Boolean) this.f42716O.f42714b.invoke(next)).booleanValue()) {
                    this.f42715N = next;
                    this.f42718b = 1;
                    return;
                }
            }
            this.f42718b = 0;
        }

        /* renamed from: a */
        public final void mo45774a(int i) {
            this.f42718b = i;
        }

        /* renamed from: b */
        public final int mo45775b() {
            return this.f42718b;
        }

        @C6003d
        /* renamed from: c */
        public final Iterator<T> mo45777c() {
            return this.f42717a;
        }

        @C6004e
        /* renamed from: d */
        public final T mo45778d() {
            return this.f42715N;
        }

        public boolean hasNext() {
            if (this.f42718b == -1) {
                m63125g();
            }
            return this.f42718b == 1 || this.f42717a.hasNext();
        }

        public T next() {
            if (this.f42718b == -1) {
                m63125g();
            }
            if (this.f42718b != 1) {
                return this.f42717a.next();
            }
            T t = this.f42715N;
            this.f42715N = null;
            this.f42718b = 0;
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public final void mo45776b(@C6004e T t) {
            this.f42715N = t;
        }
    }

    public C14581f(@C6003d C14594m<? extends T> mVar, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(mVar, "sequence");
        C14445h0.m62478f(lVar, "predicate");
        this.f42713a = mVar;
        this.f42714b = lVar;
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14582a(this);
    }
}
