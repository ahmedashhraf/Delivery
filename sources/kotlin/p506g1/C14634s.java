package kotlin.p506g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo24990d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.s */
/* compiled from: Sequences.kt */
public final class C14634s<T> implements C14594m<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42804a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6080l<T, Boolean> f42805b;

    /* renamed from: kotlin.g1.s$a */
    /* compiled from: Sequences.kt */
    public static final class C14635a implements Iterator<T>, C14464a {
        @C6004e

        /* renamed from: N */
        private T f42806N;

        /* renamed from: O */
        final /* synthetic */ C14634s f42807O;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42808a;

        /* renamed from: b */
        private int f42809b = -1;

        C14635a(C14634s sVar) {
            this.f42807O = sVar;
            this.f42808a = sVar.f42804a.iterator();
        }

        /* renamed from: g */
        private final void m63366g() {
            if (this.f42808a.hasNext()) {
                T next = this.f42808a.next();
                if (((Boolean) this.f42807O.f42805b.invoke(next)).booleanValue()) {
                    this.f42809b = 1;
                    this.f42806N = next;
                    return;
                }
            }
            this.f42809b = 0;
        }

        /* renamed from: a */
        public final void mo45839a(int i) {
            this.f42809b = i;
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T> mo45840b() {
            return this.f42808a;
        }

        @C6004e
        /* renamed from: c */
        public final T mo45842c() {
            return this.f42806N;
        }

        /* renamed from: d */
        public final int mo45843d() {
            return this.f42809b;
        }

        public boolean hasNext() {
            if (this.f42809b == -1) {
                m63366g();
            }
            return this.f42809b == 1;
        }

        public T next() {
            if (this.f42809b == -1) {
                m63366g();
            }
            if (this.f42809b != 0) {
                T t = this.f42806N;
                this.f42806N = null;
                this.f42809b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public final void mo45841b(@C6004e T t) {
            this.f42806N = t;
        }
    }

    public C14634s(@C6003d C14594m<? extends T> mVar, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(mVar, "sequence");
        C14445h0.m62478f(lVar, "predicate");
        this.f42804a = mVar;
        this.f42805b = lVar;
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14635a(this);
    }
}
