package kotlin.p504e1;

import kotlin.C6121u;
import kotlin.p213a1.C14403m;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p219v0.C14790l0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo24990d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.i */
/* compiled from: Progressions.kt */
public class C14522i implements Iterable<Integer>, C14464a {

    /* renamed from: O */
    public static final C14523a f42677O = new C14523a(null);

    /* renamed from: N */
    private final int f42678N;

    /* renamed from: a */
    private final int f42679a;

    /* renamed from: b */
    private final int f42680b;

    /* renamed from: kotlin.e1.i$a */
    /* compiled from: Progressions.kt */
    public static final class C14523a {
        private C14523a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14522i mo45720a(int i, int i2, int i3) {
            return new C14522i(i, i2, i3);
        }

        public /* synthetic */ C14523a(C14487u uVar) {
            this();
        }
    }

    public C14522i(int i, int i2, int i3) {
        if (i3 != 0) {
            this.f42679a = i;
            this.f42680b = C14403m.m62376b(i, i2, i3);
            this.f42678N = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero");
    }

    /* renamed from: e */
    public final int mo45712e() {
        return this.f42678N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f42678N == r3.f42678N) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p504e1.C14522i
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e1.i r0 = (kotlin.p504e1.C14522i) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f42679a
            kotlin.e1.i r3 = (kotlin.p504e1.C14522i) r3
            int r1 = r3.f42679a
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f42680b
            int r1 = r3.f42680b
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f42678N
            int r3 = r3.f42678N
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14522i.equals(java.lang.Object):boolean");
    }

    public final int getFirst() {
        return this.f42679a;
    }

    public final int getLast() {
        return this.f42680b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f42679a * 31) + this.f42680b) * 31) + this.f42678N;
    }

    public boolean isEmpty() {
        if (this.f42678N > 0) {
            if (this.f42679a > this.f42680b) {
                return true;
            }
        } else if (this.f42679a < this.f42680b) {
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
        if (this.f42678N > 0) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f42679a);
            sb.append("..");
            sb.append(this.f42680b);
            sb.append(str);
            i = this.f42678N;
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f42679a);
            sb.append(" downTo ");
            sb.append(this.f42680b);
            sb.append(str);
            i = -this.f42678N;
        }
        sb.append(i);
        return sb.toString();
    }

    @C6003d
    public C14790l0 iterator() {
        return new C14524j(this.f42679a, this.f42680b, this.f42678N);
    }
}
