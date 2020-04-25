package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: com.google.common.collect.w4 */
/* compiled from: RegularContiguousSet */
final class C8249w4<C extends Comparable> extends C7879h0<C> {
    private static final long serialVersionUID = 0;

    /* renamed from: U */
    private final C8235v4<C> f22086U;

    /* renamed from: com.google.common.collect.w4$a */
    /* compiled from: RegularContiguousSet */
    class C8250a extends C7923j<C> {

        /* renamed from: b */
        final C f22088b = C8249w4.this.last();

        C8250a(Comparable comparable) {
            super(comparable);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C mo29469a(C c) {
            if (C8249w4.m39353d((Comparable<?>) c, (Comparable<?>) this.f22088b)) {
                return null;
            }
            return C8249w4.this.f21607T.mo30901a(c);
        }
    }

    /* renamed from: com.google.common.collect.w4$b */
    /* compiled from: RegularContiguousSet */
    class C8251b extends C7923j<C> {

        /* renamed from: b */
        final C f22090b = C8249w4.this.first();

        C8251b(Comparable comparable) {
            super(comparable);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C mo29469a(C c) {
            if (C8249w4.m39353d((Comparable<?>) c, (Comparable<?>) this.f22090b)) {
                return null;
            }
            return C8249w4.this.f21607T.mo30902b(c);
        }
    }

    @C2777c("serialization")
    /* renamed from: com.google.common.collect.w4$c */
    /* compiled from: RegularContiguousSet */
    private static final class C8252c<C extends Comparable> implements Serializable {

        /* renamed from: a */
        final C8235v4<C> f22091a;

        /* renamed from: b */
        final C8078o0<C> f22092b;

        /* synthetic */ C8252c(C8235v4 v4Var, C8078o0 o0Var, C8250a aVar) {
            this(v4Var, o0Var);
        }

        private Object readResolve() {
            return new C8249w4(this.f22091a, this.f22092b);
        }

        private C8252c(C8235v4<C> v4Var, C8078o0<C> o0Var) {
            this.f22091a = v4Var;
            this.f22092b = o0Var;
        }
    }

    C8249w4(C8235v4<C> v4Var, C8078o0<C> o0Var) {
        super(o0Var);
        this.f22086U = v4Var;
    }

    /* renamed from: a */
    private C7879h0<C> m39351a(C8235v4<C> v4Var) {
        return this.f22086U.mo31154c(v4Var) ? C7879h0.m37604a(this.f22086U.mo31152b(v4Var), this.f21607T) : new C8089p0(this.f21607T);
    }

    public boolean contains(@C5952h Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f22086U.mo31153b((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        return C8292z.m39593a((Collection<?>) this, collection);
    }

    @C2777c("NavigableSet")
    public C8023l6<C> descendingIterator() {
        return new C8251b(last());
    }

    public boolean equals(@C5952h Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8249w4) {
            C8249w4 w4Var = (C8249w4) obj;
            if (this.f21607T.equals(w4Var.f21607T)) {
                if (!first().equals(w4Var.first()) || !last().equals(w4Var.last())) {
                    z = false;
                }
                return z;
            }
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return C8047m5.m38502a((Set<?>) this);
    }

    /* access modifiers changed from: 0000 */
    @C2777c("not used by GWT emulation")
    public int indexOf(Object obj) {
        if (contains(obj)) {
            return (int) this.f21607T.mo30899a(first(), (Comparable) obj);
        }
        return -1;
    }

    public boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    /* renamed from: p */
    public C8235v4<C> mo30457p() {
        C8209u uVar = C8209u.CLOSED;
        return mo30540a(uVar, uVar);
    }

    public int size() {
        long a = this.f21607T.mo30899a(first(), last());
        if (a >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return ((int) a) + 1;
    }

    /* access modifiers changed from: 0000 */
    @C2777c("serialization")
    public Object writeReplace() {
        return new C8252c(this.f22086U, this.f21607T, null);
    }

    /* renamed from: a */
    public C7879h0<C> mo30535a(C7879h0<C> h0Var) {
        C7397x.m35664a(h0Var);
        C7397x.m35670a(this.f21607T.equals(h0Var.f21607T));
        if (h0Var.isEmpty()) {
            return h0Var;
        }
        Comparable comparable = (Comparable) C8133r4.m38943j().mo30558a(first(), h0Var.first());
        Comparable comparable2 = (Comparable) C8133r4.m38943j().mo30563b(last(), h0Var.last());
        return comparable.compareTo(comparable2) < 0 ? C7879h0.m37604a(C8235v4.m39283a(comparable, comparable2), this.f21607T) : new C8089p0<>(this.f21607T);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C7879h0<C> mo30444d(C c, boolean z) {
        return m39351a(C8235v4.m39281a(c, C8209u.m39166a(z)));
    }

    public C first() {
        return this.f22086U.f22076a.mo30648c(this.f21607T);
    }

    public C8023l6<C> iterator() {
        return new C8250a(first());
    }

    public C last() {
        return this.f22086U.f22077b.mo30646b(this.f21607T);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m39353d(Comparable<?> comparable, @C5952h Comparable<?> comparable2) {
        return comparable2 != null && C8235v4.m39288c(comparable, comparable2) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7879h0<C> mo30440b(C c, boolean z) {
        return m39351a(C8235v4.m39284b(c, C8209u.m39166a(z)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7879h0<C> mo30441b(C c, boolean z, C c2, boolean z2) {
        if (c.compareTo(c2) != 0 || z || z2) {
            return m39351a(C8235v4.m39282a(c, C8209u.m39166a(z), c2, C8209u.m39166a(z2)));
        }
        return new C8089p0(this.f21607T);
    }

    /* renamed from: a */
    public C8235v4<C> mo30540a(C8209u uVar, C8209u uVar2) {
        return C8235v4.m39280a(this.f22086U.f22076a.mo30642a(uVar, this.f21607T), this.f22086U.f22077b.mo30645b(uVar2, this.f21607T));
    }
}
