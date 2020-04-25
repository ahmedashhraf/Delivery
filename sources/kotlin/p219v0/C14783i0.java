package kotlin.p219v0;

import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.i0 */
/* compiled from: IndexedValue.kt */
public final class C14783i0<T> {

    /* renamed from: a */
    private final int f43035a;

    /* renamed from: b */
    private final T f43036b;

    public C14783i0(int i, T t) {
        this.f43035a = i;
        this.f43036b = t;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Object, code=T, for r2v0, types: [java.lang.Object] */
    @p205i.p209c.p210a.C6003d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ kotlin.p219v0.C14783i0 m64051a(kotlin.p219v0.C14783i0 r0, int r1, T r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            int r1 = r0.f43035a
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            T r2 = r0.f43036b
        L_0x000c:
            kotlin.v0.i0 r0 = r0.mo46186a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p219v0.C14783i0.m64051a(kotlin.v0.i0, int, java.lang.Object, int, java.lang.Object):kotlin.v0.i0");
    }

    /* renamed from: a */
    public final int mo46185a() {
        return this.f43035a;
    }

    @C6003d
    /* renamed from: a */
    public final C14783i0<T> mo46186a(int i, T t) {
        return new C14783i0<>(i, t);
    }

    /* renamed from: b */
    public final T mo46187b() {
        return this.f43036b;
    }

    /* renamed from: c */
    public final int mo46188c() {
        return this.f43035a;
    }

    /* renamed from: d */
    public final T mo46189d() {
        return this.f43036b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C14783i0) {
                C14783i0 i0Var = (C14783i0) obj;
                if (!(this.f43035a == i0Var.f43035a) || !C14445h0.m62463a((Object) this.f43036b, (Object) i0Var.f43036b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f43035a * 31;
        T t = this.f43036b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.f43035a);
        sb.append(", value=");
        sb.append(this.f43036b);
        sb.append(")");
        return sb.toString();
    }
}
