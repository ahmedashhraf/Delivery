package p195e.p196a.p444s0;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.s0.a */
/* compiled from: MainThreadDisposable */
public abstract class C12300a implements C12314c {

    /* renamed from: a */
    private final AtomicBoolean f35482a = new AtomicBoolean();

    /* renamed from: e.a.s0.a$a */
    /* compiled from: MainThreadDisposable */
    class C12301a implements Runnable {
        C12301a() {
        }

        public void run() {
            C12300a.this.mo42053a();
        }
    }

    /* renamed from: b */
    public static void m55377b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to be called on the main thread but was ");
            sb.append(Thread.currentThread().getName());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42053a();

    /* renamed from: d */
    public final boolean mo41878d() {
        return this.f35482a.get();
    }

    public final void dispose() {
        if (!this.f35482a.compareAndSet(false, true)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo42053a();
        } else {
            C12304a.m55390a().mo42021a((Runnable) new C12301a());
        }
    }
}
