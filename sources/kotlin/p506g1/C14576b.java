package kotlin.p506g1;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p219v0.C14752c;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.g1.b */
/* compiled from: Sequences.kt */
final class C14576b<T, K> extends C14752c<T> {

    /* renamed from: N */
    private final HashSet<K> f42703N = new HashSet<>();

    /* renamed from: O */
    private final Iterator<T> f42704O;

    /* renamed from: P */
    private final C6080l<T, K> f42705P;

    public C14576b(@C6003d Iterator<? extends T> it, @C6003d C6080l<? super T, ? extends K> lVar) {
        C14445h0.m62478f(it, "source");
        C14445h0.m62478f(lVar, "keySelector");
        this.f42704O = it;
        this.f42705P = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45765b() {
        while (this.f42704O.hasNext()) {
            Object next = this.f42704O.next();
            if (this.f42703N.add(this.f42705P.invoke(next))) {
                mo46025b(next);
                return;
            }
        }
        mo46026c();
    }
}
