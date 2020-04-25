package p195e.p196a.p444s0.p446d;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12282j0.C12285c;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p447u0.C12315d;

/* renamed from: e.a.s0.d.b */
/* compiled from: HandlerScheduler */
final class C12307b extends C12282j0 {

    /* renamed from: b */
    private final Handler f35488b;

    /* renamed from: e.a.s0.d.b$a */
    /* compiled from: HandlerScheduler */
    private static final class C12308a extends C12285c {

        /* renamed from: a */
        private final Handler f35489a;

        /* renamed from: b */
        private volatile boolean f35490b;

        C12308a(Handler handler) {
            this.f35489a = handler;
        }

        /* renamed from: a */
        public C12314c mo41877a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f35490b) {
                return C12315d.m55413a();
            } else {
                C12309b bVar = new C12309b(this.f35489a, C12205a.m54881a(runnable));
                Message obtain = Message.obtain(this.f35489a, bVar);
                obtain.obj = this;
                this.f35489a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f35490b) {
                    return bVar;
                }
                this.f35489a.removeCallbacks(bVar);
                return C12315d.m55413a();
            }
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35490b;
        }

        public void dispose() {
            this.f35490b = true;
            this.f35489a.removeCallbacksAndMessages(this);
        }
    }

    /* renamed from: e.a.s0.d.b$b */
    /* compiled from: HandlerScheduler */
    private static final class C12309b implements Runnable, C12314c {

        /* renamed from: N */
        private volatile boolean f35491N;

        /* renamed from: a */
        private final Handler f35492a;

        /* renamed from: b */
        private final Runnable f35493b;

        C12309b(Handler handler, Runnable runnable) {
            this.f35492a = handler;
            this.f35493b = runnable;
        }

        /* renamed from: d */
        public boolean mo41878d() {
            return this.f35491N;
        }

        public void dispose() {
            this.f35491N = true;
            this.f35492a.removeCallbacks(this);
        }

        public void run() {
            try {
                this.f35493b.run();
            } catch (Throwable th) {
                C12205a.m54894b(th);
            }
        }
    }

    C12307b(Handler handler) {
        this.f35488b = handler;
    }

    /* renamed from: a */
    public C12314c mo42023a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C12309b bVar = new C12309b(this.f35488b, C12205a.m54881a(runnable));
            this.f35488b.postDelayed(bVar, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    public C12285c mo41871a() {
        return new C12308a(this.f35488b);
    }
}
