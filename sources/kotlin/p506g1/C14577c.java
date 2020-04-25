package kotlin.p506g1;

import java.util.Iterator;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.g1.c */
/* compiled from: Sequences.kt */
public final class C14577c<T, K> implements C14594m<T> {

    /* renamed from: a */
    private final C14594m<T> f42706a;

    /* renamed from: b */
    private final C6080l<T, K> f42707b;

    public C14577c(@C6003d C14594m<? extends T> mVar, @C6003d C6080l<? super T, ? extends K> lVar) {
        C14445h0.m62478f(mVar, "source");
        C14445h0.m62478f(lVar, "keySelector");
        this.f42706a = mVar;
        this.f42707b = lVar;
    }

    @C6003d
    public Iterator<T> iterator() {
        return new C14576b(this.f42706a.iterator(), this.f42707b);
    }
}
