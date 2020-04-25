package p076c.p082c.p083a.p088u.p090i;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import p076c.p082c.p083a.p084a0.C2216i;

/* renamed from: c.c.a.u.i.m */
/* compiled from: ResourceRecycler */
class C2323m {

    /* renamed from: a */
    private boolean f9220a;

    /* renamed from: b */
    private final Handler f9221b = new Handler(Looper.getMainLooper(), new C2325b());

    /* renamed from: c.c.a.u.i.m$b */
    /* compiled from: ResourceRecycler */
    private static class C2325b implements Callback {

        /* renamed from: a */
        public static final int f9222a = 1;

        private C2325b() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C2322l) message.obj).mo9702a();
            return true;
        }
    }

    C2323m() {
    }

    /* renamed from: a */
    public void mo9712a(C2322l<?> lVar) {
        C2216i.m11347b();
        if (this.f9220a) {
            this.f9221b.obtainMessage(1, lVar).sendToTarget();
            return;
        }
        this.f9220a = true;
        lVar.mo9702a();
        this.f9220a = false;
    }
}
