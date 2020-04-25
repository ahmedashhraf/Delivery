package com.google.common.util.concurrent;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.common.base.C7344g0;
import com.google.common.base.C7358i0;
import com.google.common.util.concurrent.Service.C8435b;
import com.google.common.util.concurrent.Service.State;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.d */
/* compiled from: AbstractIdleService */
public abstract class C8474d implements Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7344g0<String> f22389a = new C8475a();

    /* renamed from: b */
    private final Service f22390b = new C8476b();

    /* renamed from: com.google.common.util.concurrent.d$a */
    /* compiled from: AbstractIdleService */
    class C8475a implements C7344g0<String> {
        C8475a() {
        }

        public String get() {
            StringBuilder sb = new StringBuilder();
            sb.append(C8474d.this.mo31672h());
            sb.append(C3868i.f12248b);
            sb.append(C8474d.this.mo31597a());
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$b */
    /* compiled from: AbstractIdleService */
    class C8476b extends C8499g {

        /* renamed from: com.google.common.util.concurrent.d$b$a */
        /* compiled from: AbstractIdleService */
        class C8477a implements Runnable {
            C8477a() {
            }

            public void run() {
                try {
                    C8474d.this.mo31674j();
                    C8476b.this.mo31709i();
                } catch (Throwable th) {
                    C8476b.this.mo31708a(th);
                    throw C7358i0.m35589d(th);
                }
            }
        }

        /* renamed from: com.google.common.util.concurrent.d$b$b */
        /* compiled from: AbstractIdleService */
        class C8478b implements Runnable {
            C8478b() {
            }

            public void run() {
                try {
                    C8474d.this.mo31673i();
                    C8476b.this.mo31710j();
                } catch (Throwable th) {
                    C8476b.this.mo31708a(th);
                    throw C7358i0.m35589d(th);
                }
            }
        }

        C8476b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final void mo31648g() {
            C8520j0.m40268a(C8474d.this.mo31671g(), C8474d.this.f22389a).execute(new C8477a());
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo31649h() {
            C8520j0.m40268a(C8474d.this.mo31671g(), C8474d.this.f22389a).execute(new C8478b());
        }
    }

    /* renamed from: com.google.common.util.concurrent.d$c */
    /* compiled from: AbstractIdleService */
    class C8479c implements Executor {
        C8479c() {
        }

        public void execute(Runnable runnable) {
            C8520j0.m40267a((String) C8474d.this.f22389a.get(), runnable).start();
        }
    }

    protected C8474d() {
    }

    /* renamed from: b */
    public final void mo31600b() {
        this.f22390b.mo31600b();
    }

    /* renamed from: c */
    public final Throwable mo31602c() {
        return this.f22390b.mo31602c();
    }

    /* renamed from: d */
    public final Service mo31603d() {
        this.f22390b.mo31603d();
        return this;
    }

    /* renamed from: e */
    public final void mo31604e() {
        this.f22390b.mo31604e();
    }

    /* renamed from: f */
    public final Service mo31605f() {
        this.f22390b.mo31605f();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Executor mo31671g() {
        return new C8479c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo31672h() {
        return C8474d.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo31673i() throws Exception;

    public final boolean isRunning() {
        return this.f22390b.isRunning();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo31674j() throws Exception;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo31672h());
        sb.append(" [");
        sb.append(mo31597a());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final State mo31597a() {
        return this.f22390b.mo31597a();
    }

    /* renamed from: b */
    public final void mo31601b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22390b.mo31601b(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo31599a(C8435b bVar, Executor executor) {
        this.f22390b.mo31599a(bVar, executor);
    }

    /* renamed from: a */
    public final void mo31598a(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22390b.mo31598a(j, timeUnit);
    }
}
