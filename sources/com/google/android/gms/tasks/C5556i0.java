package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.api.internal.C4162m;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C4300a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.i0 */
final class C5556i0<TResult> extends C5560k<TResult> {

    /* renamed from: a */
    private final Object f15860a = new Object();

    /* renamed from: b */
    private final C5550f0<TResult> f15861b = new C5550f0<>();
    @C5966a("mLock")

    /* renamed from: c */
    private boolean f15862c;

    /* renamed from: d */
    private volatile boolean f15863d;
    @C5966a("mLock")

    /* renamed from: e */
    private TResult f15864e;
    @C5966a("mLock")

    /* renamed from: f */
    private Exception f15865f;

    /* renamed from: com.google.android.gms.tasks.i0$a */
    private static class C5557a extends LifecycleCallback {

        /* renamed from: b */
        private final List<WeakReference<C5548e0<?>>> f15866b = new ArrayList();

        private C5557a(C4162m mVar) {
            super(mVar);
            this.f12884a.mo17920a("TaskOnStopCallback", (LifecycleCallback) this);
        }

        /* renamed from: b */
        public static C5557a m24173b(Activity activity) {
            C4162m a = LifecycleCallback.m17696a(activity);
            C5557a aVar = (C5557a) a.mo17919a("TaskOnStopCallback", C5557a.class);
            return aVar == null ? new C5557a(a) : aVar;
        }

        /* renamed from: a */
        public final <T> void mo22015a(C5548e0<T> e0Var) {
            synchronized (this.f15866b) {
                this.f15866b.add(new WeakReference(e0Var));
            }
        }

        @C0187e0
        /* renamed from: e */
        public void mo17765e() {
            synchronized (this.f15866b) {
                for (WeakReference weakReference : this.f15866b) {
                    C5548e0 e0Var = (C5548e0) weakReference.get();
                    if (e0Var != null) {
                        e0Var.cancel();
                    }
                }
                this.f15866b.clear();
            }
        }
    }

    C5556i0() {
    }

    @C5966a("mLock")
    /* renamed from: g */
    private final void m24140g() {
        C4300a0.m18632b(this.f15862c, "Task is not yet complete");
    }

    @C5966a("mLock")
    /* renamed from: h */
    private final void m24141h() {
        C4300a0.m18632b(!this.f15862c, "Task is already complete");
    }

    @C5966a("mLock")
    /* renamed from: i */
    private final void m24142i() {
        if (this.f15863d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m24143j() {
        synchronized (this.f15860a) {
            if (this.f15862c) {
                this.f15861b.mo21983a((C5560k<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo22003a(@C0193h0 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f15860a) {
            m24140g();
            m24142i();
            if (cls.isInstance(this.f15865f)) {
                throw ((Throwable) cls.cast(this.f15865f));
            } else if (this.f15865f == null) {
                tresult = this.f15864e;
            } else {
                throw new RuntimeExecutionException(this.f15865f);
            }
        }
        return tresult;
    }

    /* renamed from: b */
    public final TResult mo22008b() {
        TResult tresult;
        synchronized (this.f15860a) {
            m24140g();
            m24142i();
            if (this.f15865f == null) {
                tresult = this.f15864e;
            } else {
                throw new RuntimeExecutionException(this.f15865f);
            }
        }
        return tresult;
    }

    /* renamed from: c */
    public final boolean mo22011c() {
        return this.f15863d;
    }

    /* renamed from: d */
    public final boolean mo22012d() {
        boolean z;
        synchronized (this.f15860a) {
            z = this.f15862c;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo22013e() {
        boolean z;
        synchronized (this.f15860a) {
            z = this.f15862c && !this.f15863d && this.f15865f == null;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo22014f() {
        synchronized (this.f15860a) {
            if (this.f15862c) {
                return false;
            }
            this.f15862c = true;
            this.f15863d = true;
            this.f15861b.mo21983a((C5560k<TResult>) this);
            return true;
        }
    }

    @C0193h0
    /* renamed from: b */
    public final <TContinuationResult> C5560k<TContinuationResult> mo22006b(@C0193h0 C5543c<TResult, C5560k<TContinuationResult>> cVar) {
        return mo22007b(C5564m.f15872a, cVar);
    }

    @C0193h0
    /* renamed from: b */
    public final <TContinuationResult> C5560k<TContinuationResult> mo22007b(@C0193h0 Executor executor, @C0193h0 C5543c<TResult, C5560k<TContinuationResult>> cVar) {
        C5556i0 i0Var = new C5556i0();
        this.f15861b.mo21982a((C5548e0<TResult>) new C5574s<TResult>(executor, cVar, i0Var));
        m24143j();
        return i0Var;
    }

    @C0195i0
    /* renamed from: a */
    public final Exception mo22002a() {
        Exception exc;
        synchronized (this.f15860a) {
            exc = this.f15865f;
        }
        return exc;
    }

    /* renamed from: b */
    public final boolean mo22010b(TResult tresult) {
        synchronized (this.f15860a) {
            if (this.f15862c) {
                return false;
            }
            this.f15862c = true;
            this.f15864e = tresult;
            this.f15861b.mo21983a((C5560k<TResult>) this);
            return true;
        }
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21994a(@C0193h0 C5551g<? super TResult> gVar) {
        return mo22000a(C5564m.f15872a, gVar);
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo22000a(@C0193h0 Executor executor, @C0193h0 C5551g<? super TResult> gVar) {
        this.f15861b.mo21982a((C5548e0<TResult>) new C5540a0<TResult>(executor, gVar));
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21989a(@C0193h0 Activity activity, @C0193h0 C5551g<? super TResult> gVar) {
        C5540a0 a0Var = new C5540a0(C5564m.f15872a, gVar);
        this.f15861b.mo21982a((C5548e0<TResult>) a0Var);
        C5557a.m24173b(activity).mo22015a(a0Var);
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21993a(@C0193h0 C5549f fVar) {
        return mo21999a(C5564m.f15872a, fVar);
    }

    /* renamed from: b */
    public final boolean mo22009b(@C0193h0 Exception exc) {
        C4300a0.m18621a(exc, (Object) "Exception must not be null");
        synchronized (this.f15860a) {
            if (this.f15862c) {
                return false;
            }
            this.f15862c = true;
            this.f15865f = exc;
            this.f15861b.mo21983a((C5560k<TResult>) this);
            return true;
        }
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21999a(@C0193h0 Executor executor, @C0193h0 C5549f fVar) {
        this.f15861b.mo21982a((C5548e0<TResult>) new C5580y<TResult>(executor, fVar));
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21988a(@C0193h0 Activity activity, @C0193h0 C5549f fVar) {
        C5580y yVar = new C5580y(C5564m.f15872a, fVar);
        this.f15861b.mo21982a((C5548e0<TResult>) yVar);
        C5557a.m24173b(activity).mo22015a(yVar);
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21992a(@C0193h0 C5547e<TResult> eVar) {
        return mo21998a(C5564m.f15872a, eVar);
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21998a(@C0193h0 Executor executor, @C0193h0 C5547e<TResult> eVar) {
        this.f15861b.mo21982a((C5548e0<TResult>) new C5578w<TResult>(executor, eVar));
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21987a(@C0193h0 Activity activity, @C0193h0 C5547e<TResult> eVar) {
        C5578w wVar = new C5578w(C5564m.f15872a, eVar);
        this.f15861b.mo21982a((C5548e0<TResult>) wVar);
        C5557a.m24173b(activity).mo22015a(wVar);
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final <TContinuationResult> C5560k<TContinuationResult> mo21990a(@C0193h0 C5543c<TResult, TContinuationResult> cVar) {
        return mo21996a(C5564m.f15872a, cVar);
    }

    @C0193h0
    /* renamed from: a */
    public final <TContinuationResult> C5560k<TContinuationResult> mo21996a(@C0193h0 Executor executor, @C0193h0 C5543c<TResult, TContinuationResult> cVar) {
        C5556i0 i0Var = new C5556i0();
        this.f15861b.mo21982a((C5548e0<TResult>) new C5572q<TResult>(executor, cVar, i0Var));
        m24143j();
        return i0Var;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21991a(@C0193h0 C5545d dVar) {
        return mo21997a(C5564m.f15872a, dVar);
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21997a(@C0193h0 Executor executor, @C0193h0 C5545d dVar) {
        this.f15861b.mo21982a((C5548e0<TResult>) new C5576u<TResult>(executor, dVar));
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final C5560k<TResult> mo21986a(@C0193h0 Activity activity, @C0193h0 C5545d dVar) {
        C5576u uVar = new C5576u(C5564m.f15872a, dVar);
        this.f15861b.mo21982a((C5548e0<TResult>) uVar);
        C5557a.m24173b(activity).mo22015a(uVar);
        m24143j();
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public final <TContinuationResult> C5560k<TContinuationResult> mo22001a(Executor executor, C5558j<TResult, TContinuationResult> jVar) {
        C5556i0 i0Var = new C5556i0();
        this.f15861b.mo21982a((C5548e0<TResult>) new C5544c0<TResult>(executor, jVar, i0Var));
        m24143j();
        return i0Var;
    }

    @C0193h0
    /* renamed from: a */
    public final <TContinuationResult> C5560k<TContinuationResult> mo21995a(@C0193h0 C5558j<TResult, TContinuationResult> jVar) {
        return mo22001a(C5564m.f15872a, jVar);
    }

    /* renamed from: a */
    public final void mo22005a(TResult tresult) {
        synchronized (this.f15860a) {
            m24141h();
            this.f15862c = true;
            this.f15864e = tresult;
        }
        this.f15861b.mo21983a((C5560k<TResult>) this);
    }

    /* renamed from: a */
    public final void mo22004a(@C0193h0 Exception exc) {
        C4300a0.m18621a(exc, (Object) "Exception must not be null");
        synchronized (this.f15860a) {
            m24141h();
            this.f15862c = true;
            this.f15865f = exc;
        }
        this.f15861b.mo21983a((C5560k<TResult>) this);
    }
}
