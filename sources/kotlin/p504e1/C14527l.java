package kotlin.p504e1;

import kotlin.C6121u;
import kotlin.p213a1.C14403m;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p219v0.C14792m0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, mo24990d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.l */
/* compiled from: Progressions.kt */
public class C14527l implements Iterable<Long>, C14464a {

    /* renamed from: O */
    public static final C14528a f42687O = new C14528a(null);

    /* renamed from: N */
    private final long f42688N;

    /* renamed from: a */
    private final long f42689a;

    /* renamed from: b */
    private final long f42690b;

    /* renamed from: kotlin.e1.l$a */
    /* compiled from: Progressions.kt */
    public static final class C14528a {
        private C14528a() {
        }

        @C6003d
        /* renamed from: a */
        public final C14527l mo45733a(long j, long j2, long j3) {
            C14527l lVar = new C14527l(j, j2, j3);
            return lVar;
        }

        public /* synthetic */ C14528a(C14487u uVar) {
            this();
        }
    }

    public C14527l(long j, long j2, long j3) {
        if (j3 != 0) {
            this.f42689a = j;
            this.f42690b = C14403m.m62377b(j, j2, j3);
            this.f42688N = j3;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero");
    }

    /* renamed from: e */
    public final long mo45725e() {
        return this.f42688N;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r5.f42688N == r6.f42688N) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.p504e1.C14527l
            if (r0 == 0) goto L_0x002f
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlin.e1.l r0 = (kotlin.p504e1.C14527l) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002d
        L_0x0013:
            long r0 = r5.f42689a
            kotlin.e1.l r6 = (kotlin.p504e1.C14527l) r6
            long r2 = r6.f42689a
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002f
            long r0 = r5.f42690b
            long r2 = r6.f42690b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x002f
            long r0 = r5.f42688N
            long r2 = r6.f42688N
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14527l.equals(java.lang.Object):boolean");
    }

    public final long getFirst() {
        return this.f42689a;
    }

    public final long getLast() {
        return this.f42690b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = (long) 31;
        long j2 = this.f42689a;
        long j3 = (j2 ^ (j2 >>> 32)) * j;
        long j4 = this.f42690b;
        long j5 = j * (j3 + (j4 ^ (j4 >>> 32)));
        long j6 = this.f42688N;
        return (int) (j5 + (j6 ^ (j6 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.f42688N > 0 ? 1 : (this.f42688N == 0 ? 0 : -1));
        long j = this.f42689a;
        long j2 = this.f42690b;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    @C6003d
    public String toString() {
        StringBuilder sb;
        long j;
        String str = " step ";
        String str2 = "";
        if (this.f42688N > 0) {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f42689a);
            sb.append("..");
            sb.append(this.f42690b);
            sb.append(str);
            j = this.f42688N;
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            sb.append(this.f42689a);
            sb.append(" downTo ");
            sb.append(this.f42690b);
            sb.append(str);
            j = -this.f42688N;
        }
        sb.append(j);
        return sb.toString();
    }

    @C6003d
    public C14792m0 iterator() {
        C14529m mVar = new C14529m(this.f42689a, this.f42690b, this.f42688N);
        return mVar;
    }
}
