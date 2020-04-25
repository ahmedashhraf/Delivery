package kotlin.p506g1;

import java.util.Iterator;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo24990d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.d */
/* compiled from: Sequences.kt */
public final class C14578d<T> implements C14594m<T>, C14580e<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42708a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f42709b;

    /* renamed from: kotlin.g1.d$a */
    /* compiled from: Sequences.kt */
    public static final class C14579a implements Iterator<T>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14578d f42710N;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42711a;

        /* renamed from: b */
        private int f42712b;

        C14579a(C14578d dVar) {
            this.f42710N = dVar;
            this.f42711a = dVar.f42708a.iterator();
            this.f42712b = dVar.f42709b;
        }

        /* renamed from: d */
        private final void m63117d() {
            while (this.f42712b > 0 && this.f42711a.hasNext()) {
                this.f42711a.next();
                this.f42712b--;
            }
        }

        /* renamed from: a */
        public final void mo45768a(int i) {
            this.f42712b = i;
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T> mo45769b() {
            return this.f42711a;
        }

        /* renamed from: c */
        public final int mo45770c() {
            return this.f42712b;
        }

        public boolean hasNext() {
            m63117d();
            return this.f42711a.hasNext();
        }

        public T next() {
            m63117d();
            return this.f42711a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14578d(@C6003d C14594m<? extends T> mVar, int i) {
        C14445h0.m62478f(mVar, "sequence");
        this.f42708a = mVar;
        this.f42709b = i;
        if (!(this.f42709b >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("count must be non-negative, but was ");
            sb.append(this.f42709b);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14579a(this);
    }

    @C6003d
    /* renamed from: a */
    public C14594m<T> mo45766a(int i) {
        C14594m<T> mVar = this.f42708a;
        int i2 = this.f42709b;
        return new C14630q(mVar, i2, i + i2);
    }

    @C6003d
    /* renamed from: b */
    public C14594m<T> mo45767b(int i) {
        return new C14578d(this.f42708a, this.f42709b + i);
    }
}
