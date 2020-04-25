package com.google.common.cache;

import com.google.common.base.C7344g0;
import java.util.concurrent.atomic.AtomicLong;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
/* renamed from: com.google.common.cache.l */
/* compiled from: LongAddables */
final class C7506l {

    /* renamed from: a */
    private static final C7344g0<C7505k> f21043a;

    /* renamed from: com.google.common.cache.l$a */
    /* compiled from: LongAddables */
    static class C7507a implements C7344g0<C7505k> {
        C7507a() {
        }

        public C7505k get() {
            return new C7510m();
        }
    }

    /* renamed from: com.google.common.cache.l$b */
    /* compiled from: LongAddables */
    static class C7508b implements C7344g0<C7505k> {
        C7508b() {
        }

        public C7505k get() {
            return new C7509c(null);
        }
    }

    /* renamed from: com.google.common.cache.l$c */
    /* compiled from: LongAddables */
    private static final class C7509c extends AtomicLong implements C7505k {
        private C7509c() {
        }

        /* renamed from: a */
        public void mo29573a() {
            getAndIncrement();
        }

        /* renamed from: d */
        public long mo29575d() {
            return get();
        }

        /* synthetic */ C7509c(C7507a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo29574a(long j) {
            getAndAdd(j);
        }
    }

    static {
        C7344g0<C7505k> g0Var;
        try {
            new C7510m();
            g0Var = new C7507a<>();
        } catch (Throwable unused) {
            g0Var = new C7508b<>();
        }
        f21043a = g0Var;
    }

    C7506l() {
    }

    /* renamed from: a */
    public static C7505k m36155a() {
        return (C7505k) f21043a.get();
    }
}
