package com.google.common.util.concurrent;

import com.google.common.base.C7344g0;
import com.google.common.base.C7358i0;
import com.google.common.util.concurrent.Service.C8435b;
import com.google.common.util.concurrent.Service.State;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.b */
/* compiled from: AbstractExecutionThreadService */
public abstract class C8463b implements Service {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Logger f22367b = Logger.getLogger(C8463b.class.getName());

    /* renamed from: a */
    private final Service f22368a = new C8464a();

    /* renamed from: com.google.common.util.concurrent.b$a */
    /* compiled from: AbstractExecutionThreadService */
    class C8464a extends C8499g {

        /* renamed from: com.google.common.util.concurrent.b$a$a */
        /* compiled from: AbstractExecutionThreadService */
        class C8465a implements C7344g0<String> {
            C8465a() {
            }

            public String get() {
                return C8463b.this.mo31643i();
            }
        }

        /* renamed from: com.google.common.util.concurrent.b$a$b */
        /* compiled from: AbstractExecutionThreadService */
        class C8466b implements Runnable {
            C8466b() {
            }

            public void run() {
                try {
                    C8463b.this.mo31645k();
                    C8464a.this.mo31709i();
                    if (C8464a.this.isRunning()) {
                        C8463b.this.mo31642h();
                    }
                    C8463b.this.mo31644j();
                    C8464a.this.mo31710j();
                } catch (Throwable th) {
                    C8464a.this.mo31708a(th);
                    throw C7358i0.m35589d(th);
                }
            }
        }

        C8464a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo31648g() {
            C8520j0.m40268a(C8463b.this.mo31641g(), (C7344g0<String>) new C8465a<String>()).execute(new C8466b());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo31649h() {
            C8463b.this.mo31646l();
        }
    }

    /* renamed from: com.google.common.util.concurrent.b$b */
    /* compiled from: AbstractExecutionThreadService */
    class C8467b implements Executor {
        C8467b() {
        }

        public void execute(Runnable runnable) {
            C8520j0.m40267a(C8463b.this.mo31643i(), runnable).start();
        }
    }

    protected C8463b() {
    }

    /* renamed from: a */
    public final State mo31597a() {
        return this.f22368a.mo31597a();
    }

    /* renamed from: b */
    public final void mo31600b() {
        this.f22368a.mo31600b();
    }

    /* renamed from: c */
    public final Throwable mo31602c() {
        return this.f22368a.mo31602c();
    }

    /* renamed from: d */
    public final Service mo31603d() {
        this.f22368a.mo31603d();
        return this;
    }

    /* renamed from: e */
    public final void mo31604e() {
        this.f22368a.mo31604e();
    }

    /* renamed from: f */
    public final Service mo31605f() {
        this.f22368a.mo31605f();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Executor mo31641g() {
        return new C8467b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo31642h() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo31643i() {
        return C8463b.class.getSimpleName();
    }

    public final boolean isRunning() {
        return this.f22368a.isRunning();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo31644j() throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo31645k() throws Exception {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo31646l() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo31643i());
        sb.append(" [");
        sb.append(mo31597a());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo31599a(C8435b bVar, Executor executor) {
        this.f22368a.mo31599a(bVar, executor);
    }

    /* renamed from: b */
    public final void mo31601b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22368a.mo31601b(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo31598a(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22368a.mo31598a(j, timeUnit);
    }
}
