package com.google.android.play.core.tasks;

import com.google.android.play.core.internal.C5732a0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.q */
final class C7207q<ResultT> extends C7191d<ResultT> {

    /* renamed from: a */
    private final Object f20348a = new Object();

    /* renamed from: b */
    private final C7203m<ResultT> f20349b = new C7203m<>();

    /* renamed from: c */
    private boolean f20350c;

    /* renamed from: d */
    private ResultT f20351d;

    /* renamed from: e */
    private Exception f20352e;

    C7207q() {
    }

    /* renamed from: e */
    private final void m34529e() {
        C5732a0.m25205a(this.f20350c, (Object) "Task is not yet complete");
    }

    /* renamed from: f */
    private final void m34530f() {
        C5732a0.m25205a(!this.f20350c, (Object) "Task is already complete");
    }

    /* renamed from: g */
    private final void m34531g() {
        synchronized (this.f20348a) {
            if (this.f20350c) {
                this.f20349b.mo28630a((C7191d<ResultT>) this);
            }
        }
    }

    /* renamed from: a */
    public final C7191d<ResultT> mo28612a(C7188a<ResultT> aVar) {
        return mo28615a(C7192e.f20325a, aVar);
    }

    /* renamed from: a */
    public final C7191d<ResultT> mo28613a(C7189b bVar) {
        return mo28616a(C7192e.f20325a, bVar);
    }

    /* renamed from: a */
    public final C7191d<ResultT> mo28614a(C7190c<? super ResultT> cVar) {
        return mo28617a(C7192e.f20325a, cVar);
    }

    /* renamed from: a */
    public final C7191d<ResultT> mo28615a(Executor executor, C7188a<ResultT> aVar) {
        this.f20349b.mo28631a((C7204n<ResultT>) new C7197g<ResultT>(executor, aVar));
        m34531g();
        return this;
    }

    /* renamed from: a */
    public final C7191d<ResultT> mo28616a(Executor executor, C7189b bVar) {
        this.f20349b.mo28631a((C7204n<ResultT>) new C7200j<ResultT>(executor, bVar));
        m34531g();
        return this;
    }

    /* renamed from: a */
    public final C7191d<ResultT> mo28617a(Executor executor, C7190c<? super ResultT> cVar) {
        this.f20349b.mo28631a((C7204n<ResultT>) new C7201k<ResultT>(executor, cVar));
        m34531g();
        return this;
    }

    /* renamed from: a */
    public final Exception mo28618a() {
        Exception exc;
        synchronized (this.f20348a) {
            exc = this.f20352e;
        }
        return exc;
    }

    /* renamed from: a */
    public final <X extends Throwable> ResultT mo28619a(Class<X> cls) throws Throwable {
        ResultT resultt;
        synchronized (this.f20348a) {
            m34529e();
            if (cls.isInstance(this.f20352e)) {
                throw ((Throwable) cls.cast(this.f20352e));
            } else if (this.f20352e == null) {
                resultt = this.f20351d;
            } else {
                throw new RuntimeExecutionException(this.f20352e);
            }
        }
        return resultt;
    }

    /* renamed from: a */
    public final void mo28636a(Exception exc) {
        C5732a0.m25198a(exc, (Object) "Exception must not be null");
        synchronized (this.f20348a) {
            m34530f();
            this.f20350c = true;
            this.f20352e = exc;
        }
        this.f20349b.mo28630a((C7191d<ResultT>) this);
    }

    /* renamed from: a */
    public final void mo28637a(ResultT resultt) {
        synchronized (this.f20348a) {
            m34530f();
            this.f20350c = true;
            this.f20351d = resultt;
        }
        this.f20349b.mo28630a((C7191d<ResultT>) this);
    }

    /* renamed from: b */
    public final ResultT mo28620b() {
        ResultT resultt;
        synchronized (this.f20348a) {
            m34529e();
            if (this.f20352e == null) {
                resultt = this.f20351d;
            } else {
                throw new RuntimeExecutionException(this.f20352e);
            }
        }
        return resultt;
    }

    /* renamed from: b */
    public final boolean mo28638b(Exception exc) {
        C5732a0.m25198a(exc, (Object) "Exception must not be null");
        synchronized (this.f20348a) {
            if (this.f20350c) {
                return false;
            }
            this.f20350c = true;
            this.f20352e = exc;
            this.f20349b.mo28630a((C7191d<ResultT>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo28639b(ResultT resultt) {
        synchronized (this.f20348a) {
            if (this.f20350c) {
                return false;
            }
            this.f20350c = true;
            this.f20351d = resultt;
            this.f20349b.mo28630a((C7191d<ResultT>) this);
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo28621c() {
        boolean z;
        synchronized (this.f20348a) {
            z = this.f20350c;
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo28622d() {
        boolean z;
        synchronized (this.f20348a) {
            z = this.f20350c && this.f20352e == null;
        }
        return z;
    }
}
