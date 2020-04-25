package kotlin.p506g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo24990d2 = {"Lkotlin/sequences/TakeSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.r */
/* compiled from: Sequences.kt */
public final class C14632r<T> implements C14594m<T>, C14580e<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42799a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f42800b;

    /* renamed from: kotlin.g1.r$a */
    /* compiled from: Sequences.kt */
    public static final class C14633a implements Iterator<T>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14632r f42801N;

        /* renamed from: a */
        private int f42802a;
        @C6003d

        /* renamed from: b */
        private final Iterator<T> f42803b;

        C14633a(C14632r rVar) {
            this.f42801N = rVar;
            this.f42802a = rVar.f42800b;
            this.f42803b = rVar.f42799a.iterator();
        }

        /* renamed from: a */
        public final void mo45833a(int i) {
            this.f42802a = i;
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T> mo45834b() {
            return this.f42803b;
        }

        /* renamed from: c */
        public final int mo45835c() {
            return this.f42802a;
        }

        public boolean hasNext() {
            return this.f42802a > 0 && this.f42803b.hasNext();
        }

        public T next() {
            int i = this.f42802a;
            if (i != 0) {
                this.f42802a = i - 1;
                return this.f42803b.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14632r(@C6003d C14594m<? extends T> mVar, int i) {
        C14445h0.m62478f(mVar, "sequence");
        this.f42799a = mVar;
        this.f42800b = i;
        if (!(this.f42800b >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.f42800b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14633a(this);
    }

    @C6003d
    /* renamed from: a */
    public C14594m<T> mo45766a(int i) {
        return i >= this.f42800b ? this : new C14632r(this.f42799a, i);
    }

    @C6003d
    /* renamed from: b */
    public C14594m<T> mo45767b(int i) {
        int i2 = this.f42800b;
        return i >= i2 ? C14596o.m63175a() : new C14630q(this.f42799a, i, i2);
    }
}
