package bolts;

import java.io.Closeable;

/* renamed from: bolts.i */
/* compiled from: CancellationTokenRegistration */
public class C2171i implements Closeable {

    /* renamed from: N */
    private Runnable f8622N;

    /* renamed from: O */
    private boolean f8623O;

    /* renamed from: a */
    private final Object f8624a = new Object();

    /* renamed from: b */
    private C2172j f8625b;

    C2171i(C2172j jVar, Runnable runnable) {
        this.f8625b = jVar;
        this.f8622N = runnable;
    }

    /* renamed from: d */
    private void m11206d() {
        if (this.f8623O) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9286a() {
        synchronized (this.f8624a) {
            m11206d();
            this.f8622N.run();
            close();
        }
    }

    public void close() {
        synchronized (this.f8624a) {
            if (!this.f8623O) {
                this.f8623O = true;
                this.f8625b.mo9291a(this);
                this.f8625b = null;
                this.f8622N = null;
            }
        }
    }
}
