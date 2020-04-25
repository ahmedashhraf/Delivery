package kotlin.p505f1;

import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo24990d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.f1.r */
/* compiled from: KType.kt */
public final class C14570r {
    /* access modifiers changed from: private */
    @C6003d

    /* renamed from: c */
    public static final C14570r f42697c = new C14570r(null, null);

    /* renamed from: d */
    public static final C14571a f42698d = new C14571a(null);
    @C6004e

    /* renamed from: a */
    private final C14572s f42699a;
    @C6004e

    /* renamed from: b */
    private final C14567p f42700b;

    /* renamed from: kotlin.f1.r$a */
    /* compiled from: KType.kt */
    public static final class C14571a {
        private C14571a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14570r mo45760a() {
            return C14570r.f42697c;
        }

        @C6003d
        /* renamed from: b */
        public final C14570r mo45762b(@C6003d C14567p pVar) {
            C14445h0.m62478f(pVar, "type");
            return new C14570r(C14572s.OUT, pVar);
        }

        @C6003d
        /* renamed from: c */
        public final C14570r mo45763c(@C6003d C14567p pVar) {
            C14445h0.m62478f(pVar, "type");
            return new C14570r(C14572s.INVARIANT, pVar);
        }

        public /* synthetic */ C14571a(C14487u uVar) {
            this();
        }

        @C6003d
        /* renamed from: a */
        public final C14570r mo45761a(@C6003d C14567p pVar) {
            C14445h0.m62478f(pVar, "type");
            return new C14570r(C14572s.IN, pVar);
        }
    }

    public C14570r(@C6004e C14572s sVar, @C6004e C14567p pVar) {
        this.f42699a = sVar;
        this.f42700b = pVar;
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ C14570r m63090a(C14570r rVar, C14572s sVar, C14567p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            sVar = rVar.f42699a;
        }
        if ((i & 2) != 0) {
            pVar = rVar.f42700b;
        }
        return rVar.mo45752a(sVar, pVar);
    }

    @C6003d
    /* renamed from: a */
    public final C14570r mo45752a(@C6004e C14572s sVar, @C6004e C14567p pVar) {
        return new C14570r(sVar, pVar);
    }

    @C6004e
    /* renamed from: a */
    public final C14572s mo45753a() {
        return this.f42699a;
    }

    @C6004e
    /* renamed from: b */
    public final C14567p mo45754b() {
        return this.f42700b;
    }

    @C6004e
    /* renamed from: c */
    public final C14567p mo45755c() {
        return this.f42700b;
    }

    @C6004e
    /* renamed from: d */
    public final C14572s mo45756d() {
        return this.f42699a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a((java.lang.Object) r2.f42700b, (java.lang.Object) r3.f42700b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.p505f1.C14570r
            if (r0 == 0) goto L_0x001d
            kotlin.f1.r r3 = (kotlin.p505f1.C14570r) r3
            kotlin.f1.s r0 = r2.f42699a
            kotlin.f1.s r1 = r3.f42699a
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.f1.p r0 = r2.f42700b
            kotlin.f1.p r3 = r3.f42700b
            boolean r3 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p505f1.C14570r.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C14572s sVar = this.f42699a;
        int i = 0;
        int hashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        C14567p pVar = this.f42700b;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KTypeProjection(variance=");
        sb.append(this.f42699a);
        sb.append(", type=");
        sb.append(this.f42700b);
        sb.append(")");
        return sb.toString();
    }
}
