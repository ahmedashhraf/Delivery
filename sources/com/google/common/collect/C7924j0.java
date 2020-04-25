package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p150g.C6621a;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.j0 */
/* compiled from: Cut */
abstract class C7924j0<C extends Comparable> implements Comparable<C7924j0<C>>, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C f21664a;

    /* renamed from: com.google.common.collect.j0$a */
    /* compiled from: Cut */
    static /* synthetic */ class C7925a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21665a = new int[C8209u.values().length];

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
                f21665a = r0
                int[] r0 = f21665a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.u r1 = com.google.common.collect.C8209u.CLOSED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21665a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.u r1 = com.google.common.collect.C8209u.OPEN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7924j0.C7925a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.j0$b */
    /* compiled from: Cut */
    private static final class C7926b extends C7924j0<Comparable<?>> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final C7926b f21666b = new C7926b();
        private static final long serialVersionUID = 0;

        private C7926b() {
            super(null);
        }

        private Object readResolve() {
            return f21666b;
        }

        /* renamed from: a */
        public int compareTo(C7924j0<Comparable<?>> j0Var) {
            return j0Var == this ? 0 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7924j0<Comparable<?>> mo30642a(C8209u uVar, C8078o0<Comparable<?>> o0Var) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30644a(Comparable<?> comparable) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7924j0<Comparable<?>> mo30645b(C8209u uVar, C8078o0<Comparable<?>> o0Var) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Comparable<?> mo30648c(C8078o0<Comparable<?>> o0Var) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Comparable<?> mo30650d() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8209u mo30651e() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8209u mo30653f() {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30643a(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30647b(StringBuilder sb) {
            sb.append("+∞)");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Comparable<?> mo30646b(C8078o0<Comparable<?>> o0Var) {
            return o0Var.mo30900a();
        }
    }

    /* renamed from: com.google.common.collect.j0$c */
    /* compiled from: Cut */
    private static final class C7927c<C extends Comparable> extends C7924j0<C> {
        private static final long serialVersionUID = 0;

        C7927c(C c) {
            super((Comparable) C7397x.m35664a(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30644a(C c) {
            return C8235v4.m39288c(this.f21664a, c) < 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7924j0<C> mo30645b(C8209u uVar, C8078o0<C> o0Var) {
            int i = C7925a.f21665a[uVar.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                Comparable a = o0Var.mo30901a(this.f21664a);
                return a == null ? C7924j0.m37873g() : C7924j0.m37872c(a);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C mo30648c(C8078o0<C> o0Var) {
            return o0Var.mo30901a(this.f21664a);
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return C7924j0.super.compareTo((C7924j0) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8209u mo30651e() {
            return C8209u.OPEN;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8209u mo30653f() {
            return C8209u.CLOSED;
        }

        public int hashCode() {
            return this.f21664a.hashCode() ^ -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("/");
            sb.append(this.f21664a);
            sb.append("\\");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7924j0<C> mo30642a(C8209u uVar, C8078o0<C> o0Var) {
            int i = C7925a.f21665a[uVar.ordinal()];
            if (i == 1) {
                Comparable a = o0Var.mo30901a(this.f21664a);
                return a == null ? C7924j0.m37874h() : C7924j0.m37872c(a);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30647b(StringBuilder sb) {
            sb.append(this.f21664a);
            sb.append(']');
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30643a(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f21664a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C mo30646b(C8078o0<C> o0Var) {
            return this.f21664a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7924j0<C> mo30641a(C8078o0<C> o0Var) {
            Comparable c = mo30648c(o0Var);
            return c != null ? C7924j0.m37872c(c) : C7924j0.m37873g();
        }
    }

    /* renamed from: com.google.common.collect.j0$d */
    /* compiled from: Cut */
    private static final class C7928d extends C7924j0<Comparable<?>> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static final C7928d f21667b = new C7928d();
        private static final long serialVersionUID = 0;

        private C7928d() {
            super(null);
        }

        private Object readResolve() {
            return f21667b;
        }

        /* renamed from: a */
        public int compareTo(C7924j0<Comparable<?>> j0Var) {
            return j0Var == this ? 0 : -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7924j0<Comparable<?>> mo30642a(C8209u uVar, C8078o0<Comparable<?>> o0Var) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30644a(Comparable<?> comparable) {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7924j0<Comparable<?>> mo30645b(C8209u uVar, C8078o0<Comparable<?>> o0Var) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Comparable<?> mo30648c(C8078o0<Comparable<?>> o0Var) {
            return o0Var.mo30903d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Comparable<?> mo30650d() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8209u mo30651e() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8209u mo30653f() {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30643a(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30647b(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7924j0<Comparable<?>> mo30641a(C8078o0<Comparable<?>> o0Var) {
            try {
                return C7924j0.m37872c(o0Var.mo30903d());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Comparable<?> mo30646b(C8078o0<Comparable<?>> o0Var) {
            throw new AssertionError();
        }
    }

    /* renamed from: com.google.common.collect.j0$e */
    /* compiled from: Cut */
    private static final class C7929e<C extends Comparable> extends C7924j0<C> {
        private static final long serialVersionUID = 0;

        C7929e(C c) {
            super((Comparable) C7397x.m35664a(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo30644a(C c) {
            return C8235v4.m39288c(this.f21664a, c) <= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C7924j0<C> mo30645b(C8209u uVar, C8078o0<C> o0Var) {
            int i = C7925a.f21665a[uVar.ordinal()];
            if (i == 1) {
                Comparable b = o0Var.mo30902b(this.f21664a);
                return b == null ? C7924j0.m37873g() : new C7927c<>(b);
            } else if (i == 2) {
                return this;
            } else {
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C mo30648c(C8078o0<C> o0Var) {
            return this.f21664a;
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return C7924j0.super.compareTo((C7924j0) obj);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public C8209u mo30651e() {
            return C8209u.CLOSED;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C8209u mo30653f() {
            return C8209u.OPEN;
        }

        public int hashCode() {
            return this.f21664a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("\\");
            sb.append(this.f21664a);
            sb.append("/");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7924j0<C> mo30642a(C8209u uVar, C8078o0<C> o0Var) {
            int i = C7925a.f21665a[uVar.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                Comparable b = o0Var.mo30902b(this.f21664a);
                return b == null ? C7924j0.m37874h() : new C7927c<>(b);
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo30647b(StringBuilder sb) {
            sb.append(this.f21664a);
            sb.append(')');
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo30643a(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f21664a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C mo30646b(C8078o0<C> o0Var) {
            return o0Var.mo30902b(this.f21664a);
        }
    }

    C7924j0(@C5952h C c) {
        this.f21664a = c;
    }

    /* renamed from: b */
    static <C extends Comparable> C7924j0<C> m37871b(C c) {
        return new C7927c(c);
    }

    /* renamed from: c */
    static <C extends Comparable> C7924j0<C> m37872c(C c) {
        return new C7929e(c);
    }

    /* renamed from: g */
    static <C extends Comparable> C7924j0<C> m37873g() {
        return C7926b.f21666b;
    }

    /* renamed from: h */
    static <C extends Comparable> C7924j0<C> m37874h() {
        return C7928d.f21667b;
    }

    /* renamed from: a */
    public int compareTo(C7924j0<C> j0Var) {
        if (j0Var == m37874h()) {
            return 1;
        }
        if (j0Var == m37873g()) {
            return -1;
        }
        int c = C8235v4.m39288c(this.f21664a, j0Var.f21664a);
        if (c != 0) {
            return c;
        }
        return C6621a.m31533a(this instanceof C7927c, j0Var instanceof C7927c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7924j0<C> mo30641a(C8078o0<C> o0Var) {
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C7924j0<C> mo30642a(C8209u uVar, C8078o0<C> o0Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo30643a(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo30644a(C c);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C7924j0<C> mo30645b(C8209u uVar, C8078o0<C> o0Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C mo30646b(C8078o0<C> o0Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo30647b(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract C mo30648c(C8078o0<C> o0Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C mo30650d() {
        return this.f21664a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract C8209u mo30651e();

    public boolean equals(Object obj) {
        if (!(obj instanceof C7924j0)) {
            return false;
        }
        try {
            if (compareTo((C7924j0) obj) == 0) {
                return true;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract C8209u mo30653f();
}
