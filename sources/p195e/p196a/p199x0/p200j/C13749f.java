package p195e.p196a.p199x0.p200j;

import java.util.concurrent.CountDownLatch;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12331g;

/* renamed from: e.a.x0.j.f */
/* compiled from: BlockingIgnoringReceiver */
public final class C13749f extends CountDownLatch implements C12331g<Throwable>, C12325a {

    /* renamed from: a */
    public Throwable f39799a;

    public C13749f() {
        super(1);
    }

    /* renamed from: a */
    public void mo33410c(Throwable th) {
        this.f39799a = th;
        countDown();
    }

    public void run() {
        countDown();
    }
}
