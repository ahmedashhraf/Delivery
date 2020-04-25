package p212io.fabric.sdk.android.p493p.p496c;

import android.content.Context;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: io.fabric.sdk.android.p.c.n */
/* compiled from: TimeBasedFileRollOverRunnable */
public class C14298n implements Runnable {

    /* renamed from: a */
    private final Context f42150a;

    /* renamed from: b */
    private final C14294j f42151b;

    public C14298n(Context context, C14294j jVar) {
        this.f42150a = context;
        this.f42151b = jVar;
    }

    public void run() {
        try {
            C14248i.m61829c(this.f42150a, "Performing time based file roll over.");
            if (!this.f42151b.rollFileOver()) {
                this.f42151b.cancelTimeBasedFileRollOver();
            }
        } catch (Exception e) {
            C14248i.m61813a(this.f42150a, "Failed to roll over file", (Throwable) e);
        }
    }
}
