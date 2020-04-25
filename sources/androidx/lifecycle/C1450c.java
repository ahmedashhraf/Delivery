package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.annotation.C0226w0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p053b.p054a.p055a.p056b.C2076a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: androidx.lifecycle.c */
/* compiled from: ComputableLiveData */
public abstract class C1450c<T> {

    /* renamed from: a */
    final Executor f5701a;

    /* renamed from: b */
    final LiveData<T> f5702b;

    /* renamed from: c */
    final AtomicBoolean f5703c;

    /* renamed from: d */
    final AtomicBoolean f5704d;
    @C0224v0

    /* renamed from: e */
    final Runnable f5705e;
    @C0224v0

    /* renamed from: f */
    final Runnable f5706f;

    /* renamed from: androidx.lifecycle.c$a */
    /* compiled from: ComputableLiveData */
    class C1451a extends LiveData<T> {
        C1451a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo6486e() {
            C1450c cVar = C1450c.this;
            cVar.f5701a.execute(cVar.f5705e);
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    /* compiled from: ComputableLiveData */
    class C1452b implements Runnable {
        C1452b() {
        }

        @C0226w0
        public void run() {
            boolean z;
            do {
                if (C1450c.this.f5704d.compareAndSet(false, true)) {
                    Object obj = null;
                    z = false;
                    while (C1450c.this.f5703c.compareAndSet(true, false)) {
                        try {
                            obj = C1450c.this.mo6500a();
                            z = true;
                        } finally {
                            C1450c.this.f5704d.set(false);
                        }
                    }
                    if (z) {
                        C1450c.this.f5702b.mo6480a(obj);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (C1450c.this.f5703c.get());
        }
    }

    /* renamed from: androidx.lifecycle.c$c */
    /* compiled from: ComputableLiveData */
    class C1453c implements Runnable {
        C1453c() {
        }

        @C0187e0
        public void run() {
            boolean c = C1450c.this.f5702b.mo6484c();
            if (C1450c.this.f5703c.compareAndSet(false, true) && c) {
                C1450c cVar = C1450c.this;
                cVar.f5701a.execute(cVar.f5705e);
            }
        }
    }

    public C1450c() {
        this(C2076a.m10815b());
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public abstract T mo6500a();

    @C0193h0
    /* renamed from: b */
    public LiveData<T> mo6501b() {
        return this.f5702b;
    }

    /* renamed from: c */
    public void mo6502c() {
        C2076a.m10816c().mo9053b(this.f5706f);
    }

    public C1450c(@C0193h0 Executor executor) {
        this.f5703c = new AtomicBoolean(true);
        this.f5704d = new AtomicBoolean(false);
        this.f5705e = new C1452b();
        this.f5706f = new C1453c();
        this.f5701a = executor;
        this.f5702b = new C1451a();
    }
}
