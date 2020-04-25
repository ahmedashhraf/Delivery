package kotlin.p506g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo24990d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "startIndex", "", "endIndex", "(Lkotlin/sequences/Sequence;II)V", "count", "getCount", "()I", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.q */
/* compiled from: Sequences.kt */
public final class C14630q<T> implements C14594m<T>, C14580e<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42793a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f42794b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f42795c;

    /* renamed from: kotlin.g1.q$a */
    /* compiled from: Sequences.kt */
    public static final class C14631a implements Iterator<T>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14630q f42796N;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42797a;

        /* renamed from: b */
        private int f42798b;

        C14631a(C14630q qVar) {
            this.f42796N = qVar;
            this.f42797a = qVar.f42793a.iterator();
        }

        /* renamed from: d */
        private final void m63353d() {
            while (this.f42798b < this.f42796N.f42794b && this.f42797a.hasNext()) {
                this.f42797a.next();
                this.f42798b++;
            }
        }

        /* renamed from: a */
        public final void mo45827a(int i) {
            this.f42798b = i;
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T> mo45828b() {
            return this.f42797a;
        }

        /* renamed from: c */
        public final int mo45829c() {
            return this.f42798b;
        }

        public boolean hasNext() {
            m63353d();
            return this.f42798b < this.f42796N.f42795c && this.f42797a.hasNext();
        }

        public T next() {
            m63353d();
            if (this.f42798b < this.f42796N.f42795c) {
                this.f42798b++;
                return this.f42797a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14630q(@C6003d C14594m<? extends T> mVar, int i, int i2) {
        C14445h0.m62478f(mVar, "sequence");
        this.f42793a = mVar;
        this.f42794b = i;
        this.f42795c = i2;
        boolean z = true;
        if (this.f42794b >= 0) {
            if (this.f42795c >= 0) {
                if (this.f42795c < this.f42794b) {
                    z = false;
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("endIndex should be not less than startIndex, but was ");
                    sb.append(this.f42795c);
                    sb.append(" < ");
                    sb.append(this.f42794b);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex should be non-negative, but is ");
            sb2.append(this.f42795c);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("startIndex should be non-negative, but is ");
        sb3.append(this.f42794b);
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14631a(this);
    }

    /* renamed from: a */
    private final int m63347a() {
        return this.f42795c - this.f42794b;
    }

    @C6003d
    /* renamed from: b */
    public C14594m<T> mo45767b(int i) {
        return i >= m63347a() ? C14596o.m63175a() : new C14630q(this.f42793a, this.f42794b + i, this.f42795c);
    }

    @C6003d
    /* renamed from: a */
    public C14594m<T> mo45766a(int i) {
        if (i >= m63347a()) {
            return this;
        }
        C14594m<T> mVar = this.f42793a;
        int i2 = this.f42794b;
        return new C14630q(mVar, i2, i + i2);
    }
}
