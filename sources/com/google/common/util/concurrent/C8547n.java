package com.google.common.util.concurrent;

import com.google.common.base.C7344g0;
import com.google.common.base.C7397x;
import java.util.concurrent.Callable;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.util.concurrent.n */
/* compiled from: Callables */
public final class C8547n {

    /* renamed from: com.google.common.util.concurrent.n$a */
    /* compiled from: Callables */
    static class C8548a implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ Object f22512a;

        C8548a(Object obj) {
            this.f22512a = obj;
        }

        public T call() {
            return this.f22512a;
        }
    }

    /* renamed from: com.google.common.util.concurrent.n$b */
    /* compiled from: Callables */
    static class C8549b implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C7344g0 f22513a;

        /* renamed from: b */
        final /* synthetic */ Callable f22514b;

        C8549b(C7344g0 g0Var, Callable callable) {
            this.f22513a = g0Var;
            this.f22514b = callable;
        }

        public T call() throws Exception {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            boolean a = C8547n.m40371b((String) this.f22513a.get(), currentThread);
            try {
                return this.f22514b.call();
            } finally {
                if (a) {
                    C8547n.m40371b(name, currentThread);
                }
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.n$c */
    /* compiled from: Callables */
    static class C8550c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7344g0 f22515a;

        /* renamed from: b */
        final /* synthetic */ Runnable f22516b;

        C8550c(C7344g0 g0Var, Runnable runnable) {
            this.f22515a = g0Var;
            this.f22516b = runnable;
        }

        public void run() {
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            boolean a = C8547n.m40371b((String) this.f22515a.get(), currentThread);
            try {
                this.f22516b.run();
            } finally {
                if (a) {
                    C8547n.m40371b(name, currentThread);
                }
            }
        }
    }

    private C8547n() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m40371b(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <T> Callable<T> m40368a(@C5952h T t) {
        return new C8548a(t);
    }

    /* renamed from: a */
    static <T> Callable<T> m40369a(Callable<T> callable, C7344g0<String> g0Var) {
        C7397x.m35664a(g0Var);
        C7397x.m35664a(callable);
        return new C8549b(g0Var, callable);
    }

    /* renamed from: a */
    static Runnable m40367a(Runnable runnable, C7344g0<String> g0Var) {
        C7397x.m35664a(g0Var);
        C7397x.m35664a(runnable);
        return new C8550c(g0Var, runnable);
    }
}
