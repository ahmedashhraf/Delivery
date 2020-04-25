package kotlin.p504e1;

import kotlin.C6121u;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, mo24990d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.c */
/* compiled from: Ranges.kt */
public final class C14513c extends C14510a implements C14519g<Character> {
    /* access modifiers changed from: private */
    @C6003d

    /* renamed from: P */
    public static final C14513c f42669P = new C14513c((char) 1, (char) 0);

    /* renamed from: Q */
    public static final C14514a f42670Q = new C14514a(null);

    /* renamed from: kotlin.e1.c$a */
    /* compiled from: Ranges.kt */
    public static final class C14514a {
        private C14514a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14513c mo45697a() {
            return C14513c.f42669P;
        }

        public /* synthetic */ C14514a(C14487u uVar) {
            this();
        }
    }

    public C14513c(char c, char c2) {
        super(c, c2, 1);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo45694a(Comparable comparable) {
        return mo45693a(((Character) comparable).charValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (getLast() == r3.getLast()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p504e1.C14513c
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e1.c r0 = (kotlin.p504e1.C14513c) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            char r0 = r2.getFirst()
            kotlin.e1.c r3 = (kotlin.p504e1.C14513c) r3
            char r1 = r3.getFirst()
            if (r0 != r1) goto L_0x002b
            char r0 = r2.getLast()
            char r3 = r3.getLast()
            if (r0 != r3) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14513c.equals(java.lang.Object):boolean");
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

    /* renamed from: a */
    public boolean mo45693a(char c) {
        return getFirst() <= c && c <= getLast();
    }

    @C6003d
    /* renamed from: b */
    public Character m62831b() {
        return Character.valueOf(getFirst());
    }

    @C6003d
    /* renamed from: c */
    public Character m62833c() {
        return Character.valueOf(getLast());
    }
}
