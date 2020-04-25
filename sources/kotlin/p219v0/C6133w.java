package kotlin.p219v0;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0002\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n\u001a\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t0\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\n"}, mo24990d2 = {"forEach", "", "T", "", "operation", "Lkotlin/Function1;", "iterator", "Ljava/util/Enumeration;", "withIndex", "Lkotlin/collections/IndexedValue;", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.v0.w */
/* compiled from: Iterators.kt */
class C6133w extends C6131v {

    /* renamed from: kotlin.v0.w$a */
    /* compiled from: Iterators.kt */
    public static final class C6134a implements Iterator<T>, C14464a {

        /* renamed from: a */
        final /* synthetic */ Enumeration f17326a;

        C6134a(Enumeration<T> enumeration) {
            this.f17326a = enumeration;
        }

        public boolean hasNext() {
            return this.f17326a.hasMoreElements();
        }

        public T next() {
            return this.f17326a.nextElement();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C6003d
    /* renamed from: a */
    public static <T> Iterator<T> m28167a(@C6003d Enumeration<T> enumeration) {
        C14445h0.m62478f(enumeration, "$receiver");
        return new C6134a(enumeration);
    }

    @C6041f
    /* renamed from: a */
    private static final <T> Iterator<T> m28168a(@C6003d Iterator<? extends T> it) {
        C14445h0.m62478f(it, "$receiver");
        return it;
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Iterator<C14783i0<T>> m28170b(@C6003d Iterator<? extends T> it) {
        C14445h0.m62478f(it, "$receiver");
        return new C14788k0(it);
    }

    /* renamed from: a */
    public static final <T> void m28169a(@C6003d Iterator<? extends T> it, @C6003d C6080l<? super T, C14737p0> lVar) {
        C14445h0.m62478f(it, "$receiver");
        C14445h0.m62478f(lVar, "operation");
        while (it.hasNext()) {
            lVar.invoke(it.next());
        }
    }
}
