package kotlin;

import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.p214b1.C6053c;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0000H\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo24990d2 = {"Lkotlin/KotlinVersion;", "", "major", "", "minor", "(II)V", "patch", "(III)V", "getMajor", "()I", "getMinor", "getPatch", "version", "compareTo", "other", "equals", "", "", "hashCode", "isAtLeast", "toString", "", "versionOf", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.k */
/* compiled from: KotlinVersion.kt */
public final class C14725k implements Comparable<C14725k> {

    /* renamed from: P */
    public static final int f42968P = 255;
    @C6003d
    @C6053c

    /* renamed from: Q */
    public static final C14725k f42969Q = new C14725k(1, 2, 41);

    /* renamed from: R */
    public static final C14726a f42970R = new C14726a(null);

    /* renamed from: N */
    private final int f42971N;

    /* renamed from: O */
    private final int f42972O;

    /* renamed from: a */
    private final int f42973a;

    /* renamed from: b */
    private final int f42974b;

    /* renamed from: kotlin.k$a */
    /* compiled from: KotlinVersion.kt */
    public static final class C14726a {
        private C14726a() {
        }

        public /* synthetic */ C14726a(C14487u uVar) {
            this();
        }
    }

    public C14725k(int i, int i2, int i3) {
        this.f42974b = i;
        this.f42971N = i2;
        this.f42972O = i3;
        this.f42973a = m63851b(this.f42974b, this.f42971N, this.f42972O);
    }

    /* renamed from: a */
    public int compareTo(@C6003d C14725k kVar) {
        C14445h0.m62478f(kVar, FacebookRequestErrorClassification.KEY_OTHER);
        return this.f42973a - kVar.f42973a;
    }

    /* renamed from: b */
    public final int mo45978b() {
        return this.f42974b;
    }

    /* renamed from: c */
    public final int mo45979c() {
        return this.f42971N;
    }

    /* renamed from: d */
    public final int mo45981d() {
        return this.f42972O;
    }

    public boolean equals(@C6004e Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14725k)) {
            obj = null;
        }
        C14725k kVar = (C14725k) obj;
        if (kVar == null) {
            return false;
        }
        if (this.f42973a != kVar.f42973a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f42973a;
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f42974b);
        sb.append('.');
        sb.append(this.f42971N);
        sb.append('.');
        sb.append(this.f42972O);
        return sb.toString();
    }

    /* renamed from: b */
    private final int m63851b(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Version components are out of range: ");
        sb.append(i);
        sb.append('.');
        sb.append(i2);
        sb.append('.');
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final boolean mo45976a(int i, int i2) {
        int i3 = this.f42974b;
        return i3 > i || (i3 == i && this.f42971N >= i2);
    }

    public C14725k(int i, int i2) {
        this(i, i2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1.f42972O < r4) goto L_0x0011;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45977a(int r2, int r3, int r4) {
        /*
            r1 = this;
            int r0 = r1.f42974b
            if (r0 > r2) goto L_0x0013
            if (r0 != r2) goto L_0x0011
            int r2 = r1.f42971N
            if (r2 > r3) goto L_0x0013
            if (r2 != r3) goto L_0x0011
            int r2 = r1.f42972O
            if (r2 < r4) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r2 = 0
            goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C14725k.mo45977a(int, int, int):boolean");
    }
}
