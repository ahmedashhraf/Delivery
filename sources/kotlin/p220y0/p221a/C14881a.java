package kotlin.p220y0.p221a;

import kotlin.C6096e0;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.C14888e.C14891b;
import kotlin.p220y0.p221a.C14888e.C14891b.C14892a;
import kotlin.p220y0.p221a.C14888e.C14893c;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
/* renamed from: kotlin.y0.a.a */
/* compiled from: CoroutineContextImpl.kt */
public abstract class C14881a implements C14891b {
    @C6003d

    /* renamed from: b */
    private final C14893c<?> f43127b;

    public C14881a(@C6003d C14893c<?> cVar) {
        C14445h0.m62478f(cVar, "key");
        this.f43127b = cVar;
    }

    /* renamed from: a */
    public <R> R mo46337a(R r, @C6003d C6084p<? super R, ? super C14891b, ? extends R> pVar) {
        C14445h0.m62478f(pVar, "operation");
        return C14892a.m65975a(this, r, pVar);
    }

    @C6003d
    /* renamed from: b */
    public C14888e mo46340b(@C6003d C14893c<?> cVar) {
        C14445h0.m62478f(cVar, "key");
        return C14892a.m65978b(this, cVar);
    }

    @C6003d
    public C14893c<?> getKey() {
        return this.f43127b;
    }

    @C6004e
    /* renamed from: a */
    public <E extends C14891b> E mo46338a(@C6003d C14893c<E> cVar) {
        C14445h0.m62478f(cVar, "key");
        return C14892a.m65976a((C14891b) this, cVar);
    }

    @C6003d
    /* renamed from: a */
    public C14888e mo46339a(@C6003d C14888e eVar) {
        C14445h0.m62478f(eVar, "context");
        return C14892a.m65977a((C14891b) this, eVar);
    }
}
