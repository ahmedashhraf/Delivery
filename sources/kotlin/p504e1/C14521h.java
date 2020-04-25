package kotlin.p504e1;

import com.mrsool.utils.C11644i;
import java.lang.Comparable;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p504e1.C14519g.C14520a;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.e1.h */
/* compiled from: Ranges.kt */
class C14521h<T extends Comparable<? super T>> implements C14519g<T> {
    @C6003d

    /* renamed from: a */
    private final T f42675a;
    @C6003d

    /* renamed from: b */
    private final T f42676b;

    public C14521h(@C6003d T t, @C6003d T t2) {
        C14445h0.m62478f(t, C11644i.f33457y3);
        C14445h0.m62478f(t2, "endInclusive");
        this.f42675a = t;
        this.f42676b = t2;
    }

    /* renamed from: a */
    public boolean mo45694a(@C6003d T t) {
        C14445h0.m62478f(t, "value");
        return C14520a.m62859a(this, t);
    }

    @C6003d
    /* renamed from: b */
    public T mo45695b() {
        return this.f42675a;
    }

    @C6003d
    /* renamed from: c */
    public T mo45696c() {
        return this.f42676b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (kotlin.p214b1.p216u.C14445h0.m62463a((java.lang.Object) mo45696c(), (java.lang.Object) r3.mo45696c()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@p205i.p209c.p210a.C6004e java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p504e1.C14521h
            if (r0 == 0) goto L_0x0033
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.e1.h r0 = (kotlin.p504e1.C14521h) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0031
        L_0x0013:
            java.lang.Comparable r0 = r2.mo45695b()
            kotlin.e1.h r3 = (kotlin.p504e1.C14521h) r3
            java.lang.Comparable r1 = r3.mo45695b()
            boolean r0 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r1)
            if (r0 == 0) goto L_0x0033
            java.lang.Comparable r0 = r2.mo45696c()
            java.lang.Comparable r3 = r3.mo45696c()
            boolean r3 = kotlin.p214b1.p216u.C14445h0.m62463a(r0, r3)
            if (r3 == 0) goto L_0x0033
        L_0x0031:
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p504e1.C14521h.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo45695b().hashCode() * 31) + mo45696c().hashCode();
    }

    public boolean isEmpty() {
        return C14520a.m62858a(this);
    }

    @C6003d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(mo45695b());
        sb.append("..");
        sb.append(mo45696c());
        return sb.toString();
    }
}
