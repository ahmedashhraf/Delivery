package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.n */
public final class C5566n {

    /* renamed from: com.google.android.gms.tasks.n$a */
    private static final class C5567a implements C5568b {

        /* renamed from: a */
        private final CountDownLatch f15875a;

        private C5567a() {
            this.f15875a = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final void mo21979a(@C0193h0 Exception exc) {
            this.f15875a.countDown();
        }

        /* renamed from: b */
        public final void mo22024b() throws InterruptedException {
            this.f15875a.await();
        }

        public final void onSuccess(Object obj) {
            this.f15875a.countDown();
        }

        /* renamed from: a */
        public final void mo21978a() {
            this.f15875a.countDown();
        }

        /* synthetic */ C5567a(C5559j0 j0Var) {
            this();
        }

        /* renamed from: a */
        public final boolean mo22023a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f15875a.await(j, timeUnit);
        }
    }

    /* renamed from: com.google.android.gms.tasks.n$b */
    interface C5568b extends C5545d, C5549f, C5551g<Object> {
    }

    /* renamed from: com.google.android.gms.tasks.n$c */
    private static final class C5569c implements C5568b {

        /* renamed from: a */
        private final Object f15876a = new Object();

        /* renamed from: b */
        private final int f15877b;

        /* renamed from: c */
        private final C5556i0<Void> f15878c;
        @C5966a("mLock")

        /* renamed from: d */
        private int f15879d;
        @C5966a("mLock")

        /* renamed from: e */
        private int f15880e;
        @C5966a("mLock")

        /* renamed from: f */
        private int f15881f;
        @C5966a("mLock")

        /* renamed from: g */
        private Exception f15882g;
        @C5966a("mLock")

        /* renamed from: h */
        private boolean f15883h;

        public C5569c(int i, C5556i0<Void> i0Var) {
            this.f15877b = i;
            this.f15878c = i0Var;
        }

        @C5966a("mLock")
        /* renamed from: b */
        private final void m24228b() {
            int i = this.f15879d;
            int i2 = this.f15880e;
            int i3 = i + i2 + this.f15881f;
            int i4 = this.f15877b;
            if (i3 == i4) {
                if (this.f15882g != null) {
                    C5556i0<Void> i0Var = this.f15878c;
                    StringBuilder sb = new StringBuilder(54);
                    sb.append(i2);
                    sb.append(" out of ");
                    sb.append(i4);
                    sb.append(" underlying tasks failed");
                    i0Var.mo22004a((Exception) new ExecutionException(sb.toString(), this.f15882g));
                } else if (this.f15883h) {
                    this.f15878c.mo22014f();
                } else {
                    this.f15878c.mo22005a(null);
                }
            }
        }

        /* renamed from: a */
        public final void mo21979a(@C0193h0 Exception exc) {
            synchronized (this.f15876a) {
                this.f15880e++;
                this.f15882g = exc;
                m24228b();
            }
        }

        public final void onSuccess(Object obj) {
            synchronized (this.f15876a) {
                this.f15879d++;
                m24228b();
            }
        }

        /* renamed from: a */
        public final void mo21978a() {
            synchronized (this.f15876a) {
                this.f15881f++;
                this.f15883h = true;
                m24228b();
            }
        }
    }

    private C5566n() {
    }

    /* renamed from: a */
    public static <TResult> C5560k<TResult> m24211a(TResult tresult) {
        C5556i0 i0Var = new C5556i0();
        i0Var.mo22005a(tresult);
        return i0Var;
    }

    /* renamed from: b */
    public static C5560k<List<C5560k<?>>> m24219b(Collection<? extends C5560k<?>> collection) {
        return m24212a(collection).mo22006b(new C5563l0(collection));
    }

    /* renamed from: c */
    public static <TResult> C5560k<List<TResult>> m24222c(Collection<? extends C5560k<?>> collection) {
        return m24212a(collection).mo21990a((C5543c<TResult, TContinuationResult>) new C5561k0<TResult,TContinuationResult>(collection));
    }

    /* renamed from: a */
    public static <TResult> C5560k<TResult> m24210a(@C0193h0 Exception exc) {
        C5556i0 i0Var = new C5556i0();
        i0Var.mo22004a(exc);
        return i0Var;
    }

    /* renamed from: b */
    public static C5560k<List<C5560k<?>>> m24220b(C5560k<?>... kVarArr) {
        return m24219b((Collection<? extends C5560k<?>>) Arrays.asList(kVarArr));
    }

    /* renamed from: c */
    public static <TResult> C5560k<List<TResult>> m24223c(C5560k<?>... kVarArr) {
        return m24222c((Collection<? extends C5560k<?>>) Arrays.asList(kVarArr));
    }

    /* renamed from: b */
    private static <TResult> TResult m24221b(C5560k<TResult> kVar) throws ExecutionException {
        if (kVar.mo22013e()) {
            return kVar.mo22008b();
        }
        if (kVar.mo22011c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(kVar.mo22002a());
    }

    /* renamed from: a */
    public static <TResult> C5560k<TResult> m24209a() {
        C5556i0 i0Var = new C5556i0();
        i0Var.mo22014f();
        return i0Var;
    }

    /* renamed from: a */
    public static <TResult> C5560k<TResult> m24213a(@C0193h0 Callable<TResult> callable) {
        return m24214a(C5564m.f15872a, callable);
    }

    /* renamed from: a */
    public static <TResult> C5560k<TResult> m24214a(@C0193h0 Executor executor, @C0193h0 Callable<TResult> callable) {
        C4300a0.m18621a(executor, (Object) "Executor must not be null");
        C4300a0.m18621a(callable, (Object) "Callback must not be null");
        C5556i0 i0Var = new C5556i0();
        executor.execute(new C5559j0(i0Var, callable));
        return i0Var;
    }

    /* renamed from: a */
    public static <TResult> TResult m24216a(@C0193h0 C5560k<TResult> kVar) throws ExecutionException, InterruptedException {
        C4300a0.m18623a();
        C4300a0.m18621a(kVar, (Object) "Task must not be null");
        if (kVar.mo22012d()) {
            return m24221b(kVar);
        }
        C5567a aVar = new C5567a(null);
        m24218a(kVar, (C5568b) aVar);
        aVar.mo22024b();
        return m24221b(kVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m24217a(@C0193h0 C5560k<TResult> kVar, long j, @C0193h0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C4300a0.m18623a();
        C4300a0.m18621a(kVar, (Object) "Task must not be null");
        C4300a0.m18621a(timeUnit, (Object) "TimeUnit must not be null");
        if (kVar.mo22012d()) {
            return m24221b(kVar);
        }
        C5567a aVar = new C5567a(null);
        m24218a(kVar, (C5568b) aVar);
        if (aVar.mo22023a(j, timeUnit)) {
            return m24221b(kVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    public static C5560k<Void> m24212a(Collection<? extends C5560k<?>> collection) {
        if (collection.isEmpty()) {
            return m24211a((TResult) null);
        }
        for (C5560k kVar : collection) {
            if (kVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        C5556i0 i0Var = new C5556i0();
        C5569c cVar = new C5569c(collection.size(), i0Var);
        for (C5560k a : collection) {
            m24218a(a, (C5568b) cVar);
        }
        return i0Var;
    }

    /* renamed from: a */
    public static C5560k<Void> m24215a(C5560k<?>... kVarArr) {
        if (kVarArr.length == 0) {
            return m24211a((TResult) null);
        }
        return m24212a((Collection<? extends C5560k<?>>) Arrays.asList(kVarArr));
    }

    /* renamed from: a */
    private static void m24218a(C5560k<?> kVar, C5568b bVar) {
        kVar.mo22000a(C5564m.f15873b, (C5551g<? super TResult>) bVar);
        kVar.mo21999a(C5564m.f15873b, (C5549f) bVar);
        kVar.mo21997a(C5564m.f15873b, (C5545d) bVar);
    }
}
