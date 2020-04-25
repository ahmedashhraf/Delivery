package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C5732a0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.play.core.tasks.f */
public final class C7194f {

    /* renamed from: com.google.android.play.core.tasks.f$a */
    interface C7195a extends C7189b, C7190c<Object> {
    }

    /* renamed from: com.google.android.play.core.tasks.f$b */
    static final class C7196b implements C7195a {

        /* renamed from: a */
        private final CountDownLatch f20328a;

        private C7196b() {
            this.f20328a = new CountDownLatch(1);
        }

        /* synthetic */ C7196b(byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo28624a() throws InterruptedException {
            this.f20328a.await();
        }

        /* renamed from: a */
        public final void mo28610a(Exception exc) {
            this.f20328a.countDown();
        }

        /* renamed from: a */
        public final boolean mo28625a(long j, TimeUnit timeUnit) throws InterruptedException {
            return this.f20328a.await(j, timeUnit);
        }

        public final void onSuccess(Object obj) {
            this.f20328a.countDown();
        }
    }

    private C7194f() {
    }

    /* renamed from: a */
    public static <ResultT> C7191d<ResultT> m34505a(Exception exc) {
        C7207q qVar = new C7207q();
        qVar.mo28636a(exc);
        return qVar;
    }

    /* renamed from: a */
    public static <ResultT> C7191d<ResultT> m34506a(ResultT resultt) {
        C7207q qVar = new C7207q();
        qVar.mo28637a(resultt);
        return qVar;
    }

    /* renamed from: a */
    private static <ResultT> ResultT m34507a(C7191d<ResultT> dVar) throws ExecutionException {
        if (dVar.mo28622d()) {
            return dVar.mo28620b();
        }
        throw new ExecutionException(dVar.mo28618a());
    }

    /* renamed from: a */
    public static <ResultT> ResultT m34508a(C7191d<ResultT> dVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        C5732a0.m25198a(dVar, (Object) "Task must not be null");
        C5732a0.m25198a(timeUnit, (Object) "TimeUnit must not be null");
        if (dVar.mo28621c()) {
            return m34507a(dVar);
        }
        C7196b bVar = new C7196b(0);
        m34509a(dVar, bVar);
        if (bVar.mo28625a(j, timeUnit)) {
            return m34507a(dVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m34509a(C7191d<?> dVar, C7195a aVar) {
        dVar.mo28617a(C7192e.f20326b, (C7190c<? super ResultT>) aVar);
        dVar.mo28616a(C7192e.f20326b, (C7189b) aVar);
    }

    /* renamed from: b */
    public static <ResultT> ResultT m34510b(C7191d<ResultT> dVar) throws ExecutionException, InterruptedException {
        C5732a0.m25198a(dVar, (Object) "Task must not be null");
        if (dVar.mo28621c()) {
            return m34507a(dVar);
        }
        C7196b bVar = new C7196b(0);
        m34509a(dVar, bVar);
        bVar.mo28624a();
        return m34507a(dVar);
    }
}
