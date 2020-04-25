package kotlin.p220y0.p221a;

import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p220y0.p221a.C14888e.C14889a;
import kotlin.p220y0.p221a.C14888e.C14891b;
import kotlin.p220y0.p221a.C14888e.C14893c;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0000H\u0002J\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J5\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u0002H\u00122\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016¢\u0006\u0002\u0010\u0016J(\u0010\u0017\u001a\u0004\u0018\u0001H\u0018\"\b\b\u0000\u0010\u0018*\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001aH\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0014\u0010\u001e\u001a\u00020\u00012\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\""}, mo24990d2 = {"Lkotlin/coroutines/experimental/CombinedContext;", "Lkotlin/coroutines/experimental/CoroutineContext;", "left", "element", "Lkotlin/coroutines/experimental/CoroutineContext$Element;", "(Lkotlin/coroutines/experimental/CoroutineContext;Lkotlin/coroutines/experimental/CoroutineContext$Element;)V", "getElement", "()Lkotlin/coroutines/experimental/CoroutineContext$Element;", "getLeft", "()Lkotlin/coroutines/experimental/CoroutineContext;", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/experimental/CoroutineContext$Key;", "(Lkotlin/coroutines/experimental/CoroutineContext$Key;)Lkotlin/coroutines/experimental/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.y0.a.b */
/* compiled from: CoroutineContextImpl.kt */
public final class C14882b implements C14888e {
    @C6003d

    /* renamed from: b */
    private final C14888e f43128b;
    @C6003d

    /* renamed from: c */
    private final C14891b f43129c;

    /* renamed from: kotlin.y0.a.b$a */
    /* compiled from: CoroutineContextImpl.kt */
    static final class C14883a extends C14448i0 implements C6084p<String, C14891b, String> {

        /* renamed from: a */
        public static final C14883a f43130a = new C14883a();

        C14883a() {
            super(2);
        }

        @C6003d
        /* renamed from: a */
        public final String mo24962d(@C6003d String str, @C6003d C14891b bVar) {
            C14445h0.m62478f(str, "acc");
            C14445h0.m62478f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(bVar);
            return sb.toString();
        }
    }

    public C14882b(@C6003d C14888e eVar, @C6003d C14891b bVar) {
        C14445h0.m62478f(eVar, "left");
        C14445h0.m62478f(bVar, "element");
        this.f43128b = eVar;
        this.f43129c = bVar;
    }

    /* renamed from: c */
    private final int m65948c() {
        C14888e eVar = this.f43128b;
        if (eVar instanceof C14882b) {
            return ((C14882b) eVar).m65948c() + 1;
        }
        return 2;
    }

    @C6003d
    /* renamed from: a */
    public final C14891b mo46342a() {
        return this.f43129c;
    }

    @C6003d
    /* renamed from: b */
    public final C14888e mo46343b() {
        return this.f43128b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r3.m65946a(r2) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001b
            boolean r0 = r3 instanceof kotlin.p220y0.p221a.C14882b
            if (r0 == 0) goto L_0x0019
            kotlin.y0.a.b r3 = (kotlin.p220y0.p221a.C14882b) r3
            int r0 = r3.m65948c()
            int r1 = r2.m65948c()
            if (r0 != r1) goto L_0x0019
            boolean r3 = r3.m65946a(r2)
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p220y0.p221a.C14882b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.f43128b.hashCode() + this.f43129c.hashCode();
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append((String) mo46337a("", C14883a.f43130a));
        sb.append("]");
        return sb.toString();
    }

    @C6003d
    /* renamed from: a */
    public C14888e mo46339a(@C6003d C14888e eVar) {
        C14445h0.m62478f(eVar, "context");
        return C14889a.m65969a(this, eVar);
    }

    @C6003d
    /* renamed from: b */
    public C14888e mo46340b(@C6003d C14893c<?> cVar) {
        C14888e eVar;
        C14445h0.m62478f(cVar, "key");
        if (this.f43129c.mo46338a(cVar) != null) {
            return this.f43128b;
        }
        C14888e b = this.f43128b.mo46340b(cVar);
        if (b == this.f43128b) {
            eVar = this;
        } else if (b == C14895g.f43134b) {
            eVar = this.f43129c;
        } else {
            eVar = new C14882b(b, this.f43129c);
        }
        return eVar;
    }

    @C6004e
    /* renamed from: a */
    public <E extends C14891b> E mo46338a(@C6003d C14893c<E> cVar) {
        C14445h0.m62478f(cVar, "key");
        C14882b bVar = this;
        while (true) {
            E a = bVar.f43129c.mo46338a(cVar);
            if (a != null) {
                return a;
            }
            C14888e eVar = bVar.f43128b;
            if (!(eVar instanceof C14882b)) {
                return eVar.mo46338a(cVar);
            }
            bVar = (C14882b) eVar;
        }
    }

    /* renamed from: a */
    public <R> R mo46337a(R r, @C6003d C6084p<? super R, ? super C14891b, ? extends R> pVar) {
        C14445h0.m62478f(pVar, "operation");
        return pVar.mo24962d(this.f43128b.mo46337a(r, pVar), this.f43129c);
    }

    /* renamed from: a */
    private final boolean m65947a(C14891b bVar) {
        return C14445h0.m62463a((Object) mo46338a(bVar.getKey()), (Object) bVar);
    }

    /* renamed from: a */
    private final boolean m65946a(C14882b bVar) {
        while (m65947a(bVar.f43129c)) {
            C14888e eVar = bVar.f43128b;
            if (eVar instanceof C14882b) {
                bVar = (C14882b) eVar;
            } else if (eVar != null) {
                return m65947a((C14891b) eVar);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.CoroutineContext.Element");
            }
        }
        return false;
    }
}
