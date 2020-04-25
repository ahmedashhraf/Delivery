package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.util.concurrent.i */
/* compiled from: AsyncSettableFuture */
final class C8514i<V> extends C8600w<V> {

    /* renamed from: a */
    private final C8516b<V> f22458a = new C8516b<>();

    /* renamed from: b */
    private final C8473c0<V> f22459b = C8437a0.m40018a((C8473c0<? extends C8473c0<? extends V>>) this.f22458a);

    /* renamed from: com.google.common.util.concurrent.i$b */
    /* compiled from: AsyncSettableFuture */
    private static final class C8516b<V> extends C8471c<C8473c0<? extends V>> {
        private C8516b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo31728a(C8473c0<? extends V> c0Var) {
            boolean a = mo31654a(c0Var);
            if (isCancelled()) {
                c0Var.cancel(mo31656b());
            }
            return a;
        }
    }

    private C8514i() {
    }

    /* renamed from: A */
    public static <V> C8514i<V> m40209A() {
        return new C8514i<>();
    }

    /* renamed from: a */
    public boolean mo31724a(C8473c0<? extends V> c0Var) {
        return this.f22458a.mo31728a((C8473c0) C7397x.m35664a(c0Var));
    }

    public boolean setValue(@C5952h V v) {
        return mo31724a(C8437a0.m40043b(v));
    }

    /* renamed from: z */
    public boolean mo31727z() {
        return this.f22458a.isDone();
    }

    /* renamed from: a */
    public boolean mo31725a(Throwable th) {
        return mo31724a(C8437a0.m40025a(th));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C8473c0<V> m40214y() {
        return this.f22459b;
    }
}
