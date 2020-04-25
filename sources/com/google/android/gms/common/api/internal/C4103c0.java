package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.C0187e0;
import androidx.annotation.C0224v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.api.internal.c0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4103c0 extends C4092a {

    /* renamed from: a */
    private final WeakReference<C4104a> f12898a;

    @C0224v0(otherwise = 2)
    /* renamed from: com.google.android.gms.common.api.internal.c0$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    static class C4104a extends LifecycleCallback {

        /* renamed from: b */
        private List<Runnable> f12899b = new ArrayList();

        private C4104a(C4162m mVar) {
            super(mVar);
            this.f12884a.mo17920a("LifecycleObserverOnStop", (LifecycleCallback) this);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final synchronized void m17739a(Runnable runnable) {
            this.f12899b.add(runnable);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C4104a m17740b(Activity activity) {
            C4104a aVar;
            synchronized (activity) {
                C4162m a = LifecycleCallback.m17696a(activity);
                aVar = (C4104a) a.mo17919a("LifecycleObserverOnStop", C4104a.class);
                if (aVar == null) {
                    aVar = new C4104a(a);
                }
            }
            return aVar;
        }

        @C0187e0
        /* renamed from: e */
        public void mo17765e() {
            List<Runnable> list;
            synchronized (this) {
                list = this.f12899b;
                this.f12899b = new ArrayList();
            }
            for (Runnable run : list) {
                run.run();
            }
        }
    }

    public C4103c0(Activity activity) {
        this(C4104a.m17740b(activity));
    }

    /* renamed from: a */
    public final C4092a mo17766a(Runnable runnable) {
        C4104a aVar = (C4104a) this.f12898a.get();
        if (aVar != null) {
            aVar.m17739a(runnable);
            return this;
        }
        throw new IllegalStateException("The target activity has already been GC'd");
    }

    @C0224v0(otherwise = 2)
    private C4103c0(C4104a aVar) {
        this.f12898a = new WeakReference<>(aVar);
    }
}
