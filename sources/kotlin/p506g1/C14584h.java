package kotlin.p506g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo24990d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.h */
/* compiled from: Sequences.kt */
public final class C14584h<T> implements C14594m<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42720a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f42721b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6080l<T, Boolean> f42722c;

    /* renamed from: kotlin.g1.h$a */
    /* compiled from: Sequences.kt */
    public static final class C14585a implements Iterator<T>, C14464a {
        @C6004e

        /* renamed from: N */
        private T f42723N;

        /* renamed from: O */
        final /* synthetic */ C14584h f42724O;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42725a;

        /* renamed from: b */
        private int f42726b = -1;

        C14585a(C14584h hVar) {
            this.f42724O = hVar;
            this.f42725a = hVar.f42720a.iterator();
        }

        /* renamed from: g */
        private final void m63138g() {
            while (this.f42725a.hasNext()) {
                T next = this.f42725a.next();
                if (((Boolean) this.f42724O.f42722c.invoke(next)).booleanValue() == this.f42724O.f42721b) {
                    this.f42723N = next;
                    this.f42726b = 1;
                    return;
                }
            }
            this.f42726b = 0;
        }

        /* renamed from: a */
        public final void mo45782a(int i) {
            this.f42726b = i;
        }

        @C6003d
        /* renamed from: b */
        public final Iterator<T> mo45783b() {
            return this.f42725a;
        }

        @C6004e
        /* renamed from: c */
        public final T mo45785c() {
            return this.f42723N;
        }

        /* renamed from: d */
        public final int mo45786d() {
            return this.f42726b;
        }

        public boolean hasNext() {
            if (this.f42726b == -1) {
                m63138g();
            }
            return this.f42726b == 1;
        }

        public T next() {
            if (this.f42726b == -1) {
                m63138g();
            }
            if (this.f42726b != 0) {
                T t = this.f42723N;
                this.f42723N = null;
                this.f42726b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public final void mo45784b(@C6004e T t) {
            this.f42723N = t;
        }
    }

    public C14584h(@C6003d C14594m<? extends T> mVar, boolean z, @C6003d C6080l<? super T, Boolean> lVar) {
        C14445h0.m62478f(mVar, "sequence");
        C14445h0.m62478f(lVar, "predicate");
        this.f42720a = mVar;
        this.f42721b = z;
        this.f42722c = lVar;
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14585a(this);
    }

    public /* synthetic */ C14584h(C14594m mVar, boolean z, C6080l lVar, int i, C14487u uVar) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(mVar, z, lVar);
    }
}
