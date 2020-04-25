package com.google.common.collect;

import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(serializable = true)
/* renamed from: com.google.common.collect.i2 */
/* compiled from: GeneralRange */
final class C7898i2<T> implements Serializable {
    @C5952h

    /* renamed from: N */
    private final T f21630N;

    /* renamed from: O */
    private final C8209u f21631O;

    /* renamed from: P */
    private final boolean f21632P;
    @C5952h

    /* renamed from: Q */
    private final T f21633Q;

    /* renamed from: R */
    private final C8209u f21634R;

    /* renamed from: S */
    private transient C7898i2<T> f21635S;

    /* renamed from: a */
    private final Comparator<? super T> f21636a;

    /* renamed from: b */
    private final boolean f21637b;

    private C7898i2(Comparator<? super T> comparator, boolean z, @C5952h T t, C8209u uVar, boolean z2, @C5952h T t2, C8209u uVar2) {
        this.f21636a = (Comparator) C7397x.m35664a(comparator);
        this.f21637b = z;
        this.f21632P = z2;
        this.f21630N = t;
        this.f21631O = (C8209u) C7397x.m35664a(uVar);
        this.f21633Q = t2;
        this.f21634R = (C8209u) C7397x.m35664a(uVar2);
        if (z) {
            comparator.compare(t, t);
        }
        if (z2) {
            comparator.compare(t2, t2);
        }
        if (z && z2) {
            int compare = comparator.compare(t, t2);
            boolean z3 = true;
            C7397x.m35672a(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                boolean z4 = uVar != C8209u.OPEN;
                if (uVar2 == C8209u.OPEN) {
                    z3 = false;
                }
                C7397x.m35670a(z4 | z3);
            }
        }
    }

    /* renamed from: a */
    static <T extends Comparable> C7898i2<T> m37762a(C8235v4<T> v4Var) {
        Comparable comparable = null;
        Object g = v4Var.mo31148a() ? v4Var.mo31159g() : null;
        C8209u f = v4Var.mo31148a() ? v4Var.mo31158f() : C8209u.OPEN;
        if (v4Var.mo31156d()) {
            comparable = v4Var.mo31162i();
        }
        C7898i2 i2Var = new C7898i2(C8133r4.m38943j(), v4Var.mo31148a(), g, f, v4Var.mo31156d(), comparable, v4Var.mo31156d() ? v4Var.mo31160h() : C8209u.OPEN);
        return i2Var;
    }

    /* renamed from: b */
    static <T> C7898i2<T> m37766b(Comparator<? super T> comparator, @C5952h T t, C8209u uVar) {
        C7898i2 i2Var = new C7898i2(comparator, false, null, C8209u.OPEN, true, t, uVar);
        return i2Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo30606c(@C5952h T t) {
        if (!mo30612h()) {
            return false;
        }
        int compare = this.f21636a.compare(t, mo30608e());
        boolean z = true;
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (mo30607d() != C8209u.OPEN) {
            z = false;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C8209u mo30607d() {
        return this.f21631O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public T mo30608e() {
        return this.f21630N;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C7898i2)) {
            return false;
        }
        C7898i2 i2Var = (C7898i2) obj;
        if (!this.f21636a.equals(i2Var.f21636a) || this.f21637b != i2Var.f21637b || this.f21632P != i2Var.f21632P || !mo30607d().equals(i2Var.mo30607d()) || !mo30610f().equals(i2Var.mo30610f()) || !C5827t.m25562a(mo30608e(), i2Var.mo30608e()) || !C5827t.m25562a(mo30611g(), i2Var.mo30611g())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8209u mo30610f() {
        return this.f21634R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public T mo30611g() {
        return this.f21633Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo30612h() {
        return this.f21637b;
    }

    public int hashCode() {
        return C5827t.m25558a(this.f21636a, mo30608e(), mo30607d(), mo30611g(), mo30610f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo30614i() {
        return this.f21632P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo30615j() {
        return (mo30614i() && mo30606c(mo30611g())) || (mo30612h() && mo30605b(mo30608e()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C7898i2<T> mo30616k() {
        C7898i2<T> i2Var = this.f21635S;
        if (i2Var != null) {
            return i2Var;
        }
        C7898i2 i2Var2 = new C7898i2(C8133r4.m38939b(this.f21636a).mo30568g(), this.f21632P, mo30611g(), mo30610f(), this.f21637b, mo30608e(), mo30607d());
        i2Var2.f21635S = this;
        this.f21635S = i2Var2;
        return i2Var2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21636a);
        sb.append(":");
        sb.append(this.f21631O == C8209u.CLOSED ? '[' : '(');
        sb.append(this.f21637b ? this.f21630N : "-∞");
        sb.append(',');
        sb.append(this.f21632P ? this.f21633Q : "∞");
        sb.append(this.f21634R == C8209u.CLOSED ? ']' : ')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo30605b(@C5952h T t) {
        if (!mo30614i()) {
            return false;
        }
        int compare = this.f21636a.compare(t, mo30611g());
        boolean z = true;
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (mo30610f() != C8209u.OPEN) {
            z = false;
        }
        return (z3 & z) | z2;
    }

    /* renamed from: a */
    static <T> C7898i2<T> m37763a(Comparator<? super T> comparator) {
        C8209u uVar = C8209u.OPEN;
        C7898i2 i2Var = new C7898i2(comparator, false, null, uVar, false, null, uVar);
        return i2Var;
    }

    /* renamed from: a */
    static <T> C7898i2<T> m37764a(Comparator<? super T> comparator, @C5952h T t, C8209u uVar) {
        C7898i2 i2Var = new C7898i2(comparator, true, t, uVar, false, null, C8209u.OPEN);
        return i2Var;
    }

    /* renamed from: a */
    static <T> C7898i2<T> m37765a(Comparator<? super T> comparator, @C5952h T t, C8209u uVar, @C5952h T t2, C8209u uVar2) {
        C7898i2 i2Var = new C7898i2(comparator, true, t, uVar, true, t2, uVar2);
        return i2Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Comparator<? super T> mo30603a() {
        return this.f21636a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30604a(@C5952h T t) {
        return !mo30606c(t) && !mo30605b(t);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        if (r5 == r11) goto L_0x00ab;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.common.collect.C7898i2<T> mo30602a(com.google.common.collect.C7898i2<T> r11) {
        /*
            r10 = this;
            com.google.common.base.C7397x.m35664a(r11)
            java.util.Comparator<? super T> r0 = r10.f21636a
            java.util.Comparator<? super T> r1 = r11.f21636a
            boolean r0 = r0.equals(r1)
            com.google.common.base.C7397x.m35670a(r0)
            boolean r0 = r10.f21637b
            java.lang.Object r1 = r10.mo30608e()
            com.google.common.collect.u r2 = r10.mo30607d()
            boolean r3 = r10.mo30612h()
            if (r3 != 0) goto L_0x0029
            boolean r0 = r11.f21637b
            java.lang.Object r1 = r11.mo30608e()
            com.google.common.collect.u r2 = r11.mo30607d()
            goto L_0x0051
        L_0x0029:
            boolean r3 = r11.mo30612h()
            if (r3 == 0) goto L_0x0051
            java.util.Comparator<? super T> r3 = r10.f21636a
            java.lang.Object r4 = r10.mo30608e()
            java.lang.Object r5 = r11.mo30608e()
            int r3 = r3.compare(r4, r5)
            if (r3 < 0) goto L_0x0049
            if (r3 != 0) goto L_0x0051
            com.google.common.collect.u r3 = r11.mo30607d()
            com.google.common.collect.u r4 = com.google.common.collect.C8209u.OPEN
            if (r3 != r4) goto L_0x0051
        L_0x0049:
            java.lang.Object r1 = r11.mo30608e()
            com.google.common.collect.u r2 = r11.mo30607d()
        L_0x0051:
            r4 = r0
            boolean r0 = r10.f21632P
            java.lang.Object r3 = r10.mo30611g()
            com.google.common.collect.u r5 = r10.mo30610f()
            boolean r6 = r10.mo30614i()
            if (r6 != 0) goto L_0x006d
            boolean r0 = r11.f21632P
            java.lang.Object r3 = r11.mo30611g()
            com.google.common.collect.u r5 = r11.mo30610f()
            goto L_0x0095
        L_0x006d:
            boolean r6 = r11.mo30614i()
            if (r6 == 0) goto L_0x0095
            java.util.Comparator<? super T> r6 = r10.f21636a
            java.lang.Object r7 = r10.mo30611g()
            java.lang.Object r8 = r11.mo30611g()
            int r6 = r6.compare(r7, r8)
            if (r6 > 0) goto L_0x008d
            if (r6 != 0) goto L_0x0095
            com.google.common.collect.u r6 = r11.mo30610f()
            com.google.common.collect.u r7 = com.google.common.collect.C8209u.OPEN
            if (r6 != r7) goto L_0x0095
        L_0x008d:
            java.lang.Object r3 = r11.mo30611g()
            com.google.common.collect.u r5 = r11.mo30610f()
        L_0x0095:
            r7 = r0
            r8 = r3
            if (r4 == 0) goto L_0x00b3
            if (r7 == 0) goto L_0x00b3
            java.util.Comparator<? super T> r11 = r10.f21636a
            int r11 = r11.compare(r1, r8)
            if (r11 > 0) goto L_0x00ab
            if (r11 != 0) goto L_0x00b3
            com.google.common.collect.u r11 = com.google.common.collect.C8209u.OPEN
            if (r2 != r11) goto L_0x00b3
            if (r5 != r11) goto L_0x00b3
        L_0x00ab:
            com.google.common.collect.u r11 = com.google.common.collect.C8209u.OPEN
            com.google.common.collect.u r0 = com.google.common.collect.C8209u.CLOSED
            r6 = r11
            r9 = r0
            r5 = r8
            goto L_0x00b6
        L_0x00b3:
            r6 = r2
            r9 = r5
            r5 = r1
        L_0x00b6:
            com.google.common.collect.i2 r11 = new com.google.common.collect.i2
            java.util.Comparator<? super T> r3 = r10.f21636a
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7898i2.mo30602a(com.google.common.collect.i2):com.google.common.collect.i2");
    }
}
