package kotlin.p506g1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo24990d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.g1.i */
/* compiled from: Sequences.kt */
public final class C14586i<T, R, E> implements C14594m<E> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14594m<T> f42727a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6080l<T, R> f42728b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6080l<R, Iterator<E>> f42729c;

    /* renamed from: kotlin.g1.i$a */
    /* compiled from: Sequences.kt */
    public static final class C14587a implements Iterator<E>, C14464a {

        /* renamed from: N */
        final /* synthetic */ C14586i f42730N;
        @C6003d

        /* renamed from: a */
        private final Iterator<T> f42731a;
        @C6004e

        /* renamed from: b */
        private Iterator<? extends E> f42732b;

        C14587a(C14586i iVar) {
            this.f42730N = iVar;
            this.f42731a = iVar.f42727a.iterator();
        }

        /* renamed from: d */
        private final boolean m63147d() {
            Iterator<? extends E> it = this.f42732b;
            if (it != null && !it.hasNext()) {
                this.f42732b = null;
            }
            while (true) {
                if (this.f42732b == null) {
                    if (this.f42731a.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f42730N.f42729c.invoke(this.f42730N.f42728b.invoke(this.f42731a.next()));
                        if (it2.hasNext()) {
                            this.f42732b = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        /* renamed from: a */
        public final void mo45790a(@C6004e Iterator<? extends E> it) {
            this.f42732b = it;
        }

        @C6004e
        /* renamed from: b */
        public final Iterator<E> mo45791b() {
            return this.f42732b;
        }

        @C6003d
        /* renamed from: c */
        public final Iterator<T> mo45792c() {
            return this.f42731a;
        }

        public boolean hasNext() {
            return m63147d();
        }

        public E next() {
            if (m63147d()) {
                Iterator<? extends E> it = this.f42732b;
                if (it == null) {
                    C14445h0.m62474e();
                }
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C14586i(@C6003d C14594m<? extends T> mVar, @C6003d C6080l<? super T, ? extends R> lVar, @C6003d C6080l<? super R, ? extends Iterator<? extends E>> lVar2) {
        C14445h0.m62478f(mVar, "sequence");
        C14445h0.m62478f(lVar, "transformer");
        C14445h0.m62478f(lVar2, "iterator");
        this.f42727a = mVar;
        this.f42728b = lVar;
        this.f42729c = lVar2;
    }

    @C6003d
    public Iterator<E> iterator() {
        return new C14587a(this);
    }
}
