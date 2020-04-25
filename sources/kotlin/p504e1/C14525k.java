package kotlin.p504e1;

import kotlin.C6121u;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, mo24990d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.k */
/* compiled from: Ranges.kt */
public final class C14525k extends C14522i implements C14519g<Integer> {
    /* access modifiers changed from: private */
    @C6003d

    /* renamed from: P */
    public static final C14525k f42685P = new C14525k(1, 0);

    /* renamed from: Q */
    public static final C14526a f42686Q = new C14526a(null);

    /* renamed from: kotlin.e1.k$a */
    /* compiled from: Ranges.kt */
    public static final class C14526a {
        private C14526a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14525k mo45724a() {
            return C14525k.f42685P;
        }

        public /* synthetic */ C14526a(C14487u uVar) {
            this();
        }
    }

    public C14525k(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45694a(Comparable comparable) {
        return mo45723b(((Number) comparable).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (getLast() == r3.getLast()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p504e1.C14525k
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e1.k r0 = (kotlin.p504e1.C14525k) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            int r0 = r2.getFirst()
            kotlin.e1.k r3 = (kotlin.p504e1.C14525k) r3
            int r1 = r3.getFirst()
            if (r0 != r1) goto L_0x002b
            int r0 = r2.getLast()
            int r3 = r3.getLast()
            if (r0 != r3) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14525k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
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
    public Integer m62870b() {
        return Integer.valueOf(getFirst());
    }

    @C6003d
    /* renamed from: c */
    public Integer m62873c() {
        return Integer.valueOf(getLast());
    }

    /* renamed from: b */
    public boolean mo45723b(int i) {
        return getFirst() <= i && i <= getLast();
    }
}
