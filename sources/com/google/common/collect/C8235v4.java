package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.v4 */
/* compiled from: Range */
public final class C8235v4<C extends Comparable> implements C5831y<C>, Serializable {

    /* renamed from: N */
    private static final C7380p<C8235v4, C7924j0> f22072N = new C8236a();

    /* renamed from: O */
    private static final C7380p<C8235v4, C7924j0> f22073O = new C8237b();

    /* renamed from: P */
    static final C8133r4<C8235v4<?>> f22074P = new C8238c();

    /* renamed from: Q */
    private static final C8235v4<Comparable> f22075Q = new C8235v4<>(C7924j0.m37874h(), C7924j0.m37873g());
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C7924j0<C> f22076a;

    /* renamed from: b */
    final C7924j0<C> f22077b;

    /* renamed from: com.google.common.collect.v4$a */
    /* compiled from: Range */
    static class C8236a implements C7380p<C8235v4, C7924j0> {
        C8236a() {
        }

        /* renamed from: a */
        public C7924j0 apply(C8235v4 v4Var) {
            return v4Var.f22076a;
        }
    }

    /* renamed from: com.google.common.collect.v4$b */
    /* compiled from: Range */
    static class C8237b implements C7380p<C8235v4, C7924j0> {
        C8237b() {
        }

        /* renamed from: a */
        public C7924j0 apply(C8235v4 v4Var) {
            return v4Var.f22077b;
        }
    }

    /* renamed from: com.google.common.collect.v4$c */
    /* compiled from: Range */
    static class C8238c extends C8133r4<C8235v4<?>> {
        C8238c() {
        }

        /* renamed from: a */
        public int compare(C8235v4<?> v4Var, C8235v4<?> v4Var2) {
            return C7551b0.m36254e().mo29672a((Comparable<?>) v4Var.f22076a, (Comparable<?>) v4Var2.f22076a).mo29672a((Comparable<?>) v4Var.f22077b, (Comparable<?>) v4Var2.f22077b).mo29667a();
        }
    }

    /* renamed from: com.google.common.collect.v4$d */
    /* compiled from: Range */
    static /* synthetic */ class C8239d {

        /* renamed from: a */
        static final /* synthetic */ int[] f22078a = new int[C8209u.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.collect.u[] r0 = com.google.common.collect.C8209u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22078a = r0
                int[] r0 = f22078a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.u r1 = com.google.common.collect.C8209u.OPEN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22078a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.u r1 = com.google.common.collect.C8209u.CLOSED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C8235v4.C8239d.<clinit>():void");
        }
    }

    private C8235v4(C7924j0<C> j0Var, C7924j0<C> j0Var2) {
        if (j0Var.compareTo(j0Var2) > 0 || j0Var == C7924j0.m37873g() || j0Var2 == C7924j0.m37874h()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid range: ");
            sb.append(m39286b(j0Var, j0Var2));
            throw new IllegalArgumentException(sb.toString());
        }
        this.f22076a = (C7924j0) C7397x.m35664a(j0Var);
        this.f22077b = (C7924j0) C7397x.m35664a(j0Var2);
    }

    /* renamed from: a */
    static <C extends Comparable<?>> C8235v4<C> m39280a(C7924j0<C> j0Var, C7924j0<C> j0Var2) {
        return new C8235v4<>(j0Var, j0Var2);
    }

    /* renamed from: b */
    public static <C extends Comparable<?>> C8235v4<C> m39285b(C c, C c2) {
        return m39280a(C7924j0.m37872c(c), C7924j0.m37872c(c2));
    }

    /* renamed from: c */
    public static <C extends Comparable<?>> C8235v4<C> m39289c(C c) {
        return m39280a(C7924j0.m37872c(c), C7924j0.m37873g());
    }

    /* renamed from: d */
    public static <C extends Comparable<?>> C8235v4<C> m39292d(C c, C c2) {
        return m39280a(C7924j0.m37871b(c), C7924j0.m37872c(c2));
    }

    /* renamed from: e */
    public static <C extends Comparable<?>> C8235v4<C> m39294e(C c, C c2) {
        return m39280a(C7924j0.m37871b(c), C7924j0.m37871b(c2));
    }

    /* renamed from: f */
    public static <C extends Comparable<?>> C8235v4<C> m39295f(C c) {
        return m39280a(C7924j0.m37874h(), C7924j0.m37872c(c));
    }

    /* renamed from: g */
    public static <C extends Comparable<?>> C8235v4<C> m39296g(C c) {
        return m39283a(c, c);
    }

    /* renamed from: j */
    public static <C extends Comparable<?>> C8235v4<C> m39297j() {
        return f22075Q;
    }

    /* renamed from: k */
    static <C extends Comparable<?>> C7380p<C8235v4<C>, C7924j0<C>> m39298k() {
        return f22072N;
    }

    /* renamed from: l */
    static <C extends Comparable<?>> C7380p<C8235v4<C>, C7924j0<C>> m39299l() {
        return f22073O;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C8235v4)) {
            return false;
        }
        C8235v4 v4Var = (C8235v4) obj;
        if (!this.f22076a.equals(v4Var.f22076a) || !this.f22077b.equals(v4Var.f22077b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C8209u mo31160h() {
        return this.f22077b.mo30653f();
    }

    public int hashCode() {
        return (this.f22076a.hashCode() * 31) + this.f22077b.hashCode();
    }

    /* renamed from: i */
    public C mo31162i() {
        return this.f22077b.mo30650d();
    }

    /* access modifiers changed from: 0000 */
    public Object readResolve() {
        return equals(f22075Q) ? m39297j() : this;
    }

    public String toString() {
        return m39286b(this.f22076a, this.f22077b);
    }

    /* renamed from: a */
    public static <C extends Comparable<?>> C8235v4<C> m39283a(C c, C c2) {
        return m39280a(C7924j0.m37872c(c), C7924j0.m37871b(c2));
    }

    /* renamed from: b */
    public static <C extends Comparable<?>> C8235v4<C> m39284b(C c, C8209u uVar) {
        int i = C8239d.f22078a[uVar.ordinal()];
        if (i == 1) {
            return m39295f(c);
        }
        if (i == 2) {
            return m39291d(c);
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static <C extends Comparable<?>> C8235v4<C> m39290c(Iterable<C> iterable) {
        C7397x.m35664a(iterable);
        if (iterable instanceof C7879h0) {
            return ((C7879h0) iterable).mo30457p();
        }
        Iterator it = iterable.iterator();
        Comparable comparable = (Comparable) C7397x.m35664a(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) C7397x.m35664a(it.next());
            comparable = (Comparable) C8133r4.m38943j().mo30563b(comparable, comparable3);
            comparable2 = (Comparable) C8133r4.m38943j().mo30558a(comparable2, comparable3);
        }
        return m39283a((C) comparable, (C) comparable2);
    }

    /* renamed from: d */
    public static <C extends Comparable<?>> C8235v4<C> m39291d(C c) {
        return m39280a(C7924j0.m37874h(), C7924j0.m37871b(c));
    }

    /* renamed from: e */
    public static <C extends Comparable<?>> C8235v4<C> m39293e(C c) {
        return m39280a(C7924j0.m37871b(c), C7924j0.m37873g());
    }

    /* renamed from: f */
    public C8209u mo31158f() {
        return this.f22076a.mo30651e();
    }

    /* renamed from: g */
    public C mo31159g() {
        return this.f22076a.mo30650d();
    }

    /* renamed from: a */
    public static <C extends Comparable<?>> C8235v4<C> m39282a(C c, C8209u uVar, C c2, C8209u uVar2) {
        C7397x.m35664a(uVar);
        C7397x.m35664a(uVar2);
        return m39280a(uVar == C8209u.OPEN ? C7924j0.m37871b(c) : C7924j0.m37872c(c), uVar2 == C8209u.OPEN ? C7924j0.m37872c(c2) : C7924j0.m37871b(c2));
    }

    /* renamed from: d */
    public boolean mo31156d() {
        return this.f22077b != C7924j0.m37873g();
    }

    /* renamed from: e */
    public boolean mo31157e() {
        return this.f22076a.equals(this.f22077b);
    }

    /* renamed from: d */
    public C8235v4<C> mo31155d(C8235v4<C> v4Var) {
        int a = this.f22076a.compareTo(v4Var.f22076a);
        int a2 = this.f22077b.compareTo(v4Var.f22077b);
        if (a <= 0 && a2 >= 0) {
            return this;
        }
        if (a >= 0 && a2 <= 0) {
            return v4Var;
        }
        return m39280a(a <= 0 ? this.f22076a : v4Var.f22076a, a2 >= 0 ? this.f22077b : v4Var.f22077b);
    }

    /* renamed from: b */
    public boolean mo31153b(C c) {
        C7397x.m35664a(c);
        return this.f22076a.mo30644a(c) && !this.f22077b.mo30644a(c);
    }

    /* renamed from: a */
    public static <C extends Comparable<?>> C8235v4<C> m39281a(C c, C8209u uVar) {
        int i = C8239d.f22078a[uVar.ordinal()];
        if (i == 1) {
            return m39293e(c);
        }
        if (i == 2) {
            return m39289c(c);
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public C8235v4<C> mo31152b(C8235v4<C> v4Var) {
        int a = this.f22076a.compareTo(v4Var.f22076a);
        int a2 = this.f22077b.compareTo(v4Var.f22077b);
        if (a >= 0 && a2 <= 0) {
            return this;
        }
        if (a <= 0 && a2 >= 0) {
            return v4Var;
        }
        return m39280a(a >= 0 ? this.f22076a : v4Var.f22076a, a2 <= 0 ? this.f22077b : v4Var.f22077b);
    }

    /* renamed from: a */
    public boolean mo31148a() {
        return this.f22076a != C7924j0.m37874h();
    }

    /* renamed from: c */
    public boolean mo31154c(C8235v4<C> v4Var) {
        return this.f22076a.compareTo(v4Var.f22077b) <= 0 && v4Var.f22076a.compareTo(this.f22077b) <= 0;
    }

    /* renamed from: b */
    private static String m39286b(C7924j0<?> j0Var, C7924j0<?> j0Var2) {
        StringBuilder sb = new StringBuilder(16);
        j0Var.mo30643a(sb);
        sb.append(8229);
        j0Var2.mo30647b(sb);
        return sb.toString();
    }

    /* renamed from: c */
    static int m39288c(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Deprecated
    /* renamed from: a */
    public boolean apply(C c) {
        return mo31153b(c);
    }

    /* renamed from: a */
    public boolean mo31151a(Iterable<? extends C> iterable) {
        boolean z = true;
        if (C8145s3.m39042g(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet b = m39287b(iterable);
            Comparator comparator = b.comparator();
            if (C8133r4.m38943j().equals(comparator) || comparator == null) {
                if (!mo31153b((C) (Comparable) b.first()) || !mo31153b((C) (Comparable) b.last())) {
                    z = false;
                }
                return z;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (!mo31153b((C) (Comparable) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static <T> SortedSet<T> m39287b(Iterable<T> iterable) {
        return (SortedSet) iterable;
    }

    /* renamed from: a */
    public boolean mo31149a(C8235v4<C> v4Var) {
        return this.f22076a.compareTo(v4Var.f22076a) <= 0 && this.f22077b.compareTo(v4Var.f22077b) >= 0;
    }

    /* renamed from: a */
    public C8235v4<C> mo31147a(C8078o0<C> o0Var) {
        C7397x.m35664a(o0Var);
        C7924j0<C> a = this.f22076a.mo30641a(o0Var);
        C7924j0<C> a2 = this.f22077b.mo30641a(o0Var);
        return (a == this.f22076a && a2 == this.f22077b) ? this : m39280a(a, a2);
    }
}
