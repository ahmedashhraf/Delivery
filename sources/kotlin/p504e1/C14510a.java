package kotlin.p504e1;

import kotlin.C6121u;
import kotlin.p213a1.C14403m;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p219v0.C14838s;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo24990d2 = {"Lkotlin/ranges/CharProgression;", "", "", "start", "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.a */
/* compiled from: Progressions.kt */
public class C14510a implements Iterable<Character>, C14464a {

    /* renamed from: O */
    public static final C14511a f42661O = new C14511a(null);

    /* renamed from: N */
    private final int f42662N;

    /* renamed from: a */
    private final char f42663a;

    /* renamed from: b */
    private final char f42664b;

    /* renamed from: kotlin.e1.a$a */
    /* compiled from: Progressions.kt */
    public static final class C14511a {
        private C14511a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14510a mo45690a(char c, char c2, int i) {
            return new C14510a(c, c2, i);
        }

        public /* synthetic */ C14511a(C14487u uVar) {
            this();
        }
    }

    public C14510a(char c, char c2, int i) {
        if (i != 0) {
            this.f42663a = c;
            this.f42664b = (char) C14403m.m62376b((int) c, (int) c2, i);
            this.f42662N = i;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero");
    }

    /* renamed from: e */
    public final int mo45682e() {
        return this.f42662N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f42662N == r3.f42662N) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p504e1.C14510a
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e1.a r0 = (kotlin.p504e1.C14510a) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            char r0 = r2.f42663a
            kotlin.e1.a r3 = (kotlin.p504e1.C14510a) r3
            char r1 = r3.f42663a
            if (r0 != r1) goto L_0x0029
            char r0 = r2.f42664b
            char r1 = r3.f42664b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f42662N
            int r3 = r3.f42662N
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14510a.equals(java.lang.Object):boolean");
    }

    public final char getFirst() {
        return this.f42663a;
    }

    public final char getLast() {
        return this.f42664b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f42663a * 31) + this.f42664b) * 31) + this.f42662N;
    }

    public boolean isEmpty() {
        if (this.f42662N > 0) {
            if (this.f42663a > this.f42664b) {
                return true;
            }
        } else if (this.f42663a < this.f42664b) {
            return true;
        }
        return false;
    }

    @C6003d
    public String toString() {
        int i;
        StringBuilder sb;
        String str = " step ";
        String str2 = "";
        if (this.f42662N > 0) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f42663a);
            sb.append("..");
            sb.append(this.f42664b);
            sb.append(str);
            i = this.f42662N;
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f42663a);
            sb.append(" downTo ");
            sb.append(this.f42664b);
            sb.append(str);
            i = -this.f42662N;
        }
        sb.append(i);
        return sb.toString();
    }

    @C6003d
    public C14838s iterator() {
        return new C14512b(this.f42663a, this.f42664b, this.f42662N);
    }
}
