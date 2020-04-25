package com.google.common.collect;

import com.google.common.base.C7397x;
import com.google.common.collect.C8068n3.C8069a;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.collect.h0 */
/* compiled from: ContiguousSet */
public abstract class C7879h0<C extends Comparable> extends C8068n3<C> {

    /* renamed from: T */
    final C8078o0<C> f21607T;

    C7879h0(C8078o0<C> o0Var) {
        super(C8133r4.m38943j());
        this.f21607T = o0Var;
    }

    @Deprecated
    /* renamed from: l */
    public static <E> C8069a<E> m37605l() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract C7879h0<C> mo30535a(C7879h0<C> h0Var);

    /* renamed from: a */
    public abstract C8235v4<C> mo30540a(C8209u uVar, C8209u uVar2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C7879h0<C> mo30440b(C c, boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C7879h0<C> mo30441b(C c, boolean z, C c2, boolean z2);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract C7879h0<C> mo30444d(C c, boolean z);

    /* renamed from: p */
    public abstract C8235v4<C> mo30457p();

    public String toString() {
        return mo30457p().toString();
    }

    /* renamed from: c */
    public C7879h0<C> tailSet(C c) {
        return mo30444d((C) (Comparable) C7397x.m35664a(c), true);
    }

    /* renamed from: a */
    public static <C extends Comparable> C7879h0<C> m37604a(C8235v4<C> v4Var, C8078o0<C> o0Var) {
        C7397x.m35664a(v4Var);
        C7397x.m35664a(o0Var);
        try {
            C8235v4<C> b = !v4Var.mo31148a() ? v4Var.mo31152b(C8235v4.m39289c(o0Var.mo30903d())) : v4Var;
            if (!v4Var.mo31156d()) {
                b = b.mo31152b(C8235v4.m39291d(o0Var.mo30900a()));
            }
            return b.mo31157e() || C8235v4.m39288c(v4Var.f22076a.mo30648c((C8078o0) o0Var), v4Var.f22077b.mo30646b((C8078o0) o0Var)) > 0 ? new C8089p0(o0Var) : new C8249w4(b, o0Var);
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public C7879h0<C> headSet(C c) {
        return mo30440b((C) (Comparable) C7397x.m35664a(c), false);
    }

    @C2777c("NavigableSet")
    /* renamed from: c */
    public C7879h0<C> mo30547c(C c, boolean z) {
        return mo30444d((C) (Comparable) C7397x.m35664a(c), z);
    }

    /* renamed from: b */
    public C7879h0<C> subSet(C c, C c2) {
        C7397x.m35664a(c);
        C7397x.m35664a(c2);
        C7397x.m35670a(comparator().compare(c, c2) <= 0);
        return mo30441b(c, true, c2, false);
    }

    @C2777c("NavigableSet")
    /* renamed from: a */
    public C7879h0<C> mo30538a(C c, boolean z) {
        return mo30440b((C) (Comparable) C7397x.m35664a(c), z);
    }

    @C2777c("NavigableSet")
    /* renamed from: a */
    public C7879h0<C> mo30539a(C c, boolean z, C c2, boolean z2) {
        C7397x.m35664a(c);
        C7397x.m35664a(c2);
        C7397x.m35670a(comparator().compare(c, c2) <= 0);
        return mo30441b(c, z, c2, z2);
    }
}
