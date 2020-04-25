package kotlin.p504e1;

import kotlin.C6121u;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, mo24990d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(JJ)V", "getEndInclusive", "()Ljava/lang/Long;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.n */
/* compiled from: Ranges.kt */
public final class C14530n extends C14527l implements C14519g<Long> {
    /* access modifiers changed from: private */
    @C6003d

    /* renamed from: P */
    public static final C14530n f42695P = new C14530n(1, 0);

    /* renamed from: Q */
    public static final C14531a f42696Q = new C14531a(null);

    /* renamed from: kotlin.e1.n$a */
    /* compiled from: Ranges.kt */
    public static final class C14531a {
        private C14531a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14530n mo45737a() {
            return C14530n.f42695P;
        }

        public /* synthetic */ C14531a(C14487u uVar) {
            this();
        }
    }

    public C14530n(long j, long j2) {
        super(j, j2, 1);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45694a(Comparable comparable) {
        return mo45736b(((Number) comparable).longValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (getLast() == r6.getLast()) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.p504e1.C14530n
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlin.e1.n r0 = (kotlin.p504e1.C14530n) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002d
        L_0x0013:
            long r0 = r5.getFirst()
            kotlin.e1.n r6 = (kotlin.p504e1.C14530n) r6
            long r2 = r6.getFirst()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002f
            long r0 = r5.getLast()
            long r2 = r6.getLast()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x002f
        L_0x002d:
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14530n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (getFirst() ^ (getFirst() >>> 32))) + (getLast() ^ (getLast() >>> 32)));
    }

    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(getFirst());
        sb.append("..");
        sb.append(getLast());
        return sb.toString();
    }

    @C6003d
    /* renamed from: b */
    public Long m62882b() {
        return Long.valueOf(getFirst());
    }

    @C6003d
    /* renamed from: c */
    public Long m62885c() {
        return Long.valueOf(getLast());
    }

    /* renamed from: b */
    public boolean mo45736b(long j) {
        return getFirst() <= j && j <= getLast();
    }
}
