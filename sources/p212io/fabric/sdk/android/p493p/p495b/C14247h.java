package p212io.fabric.sdk.android.p493p.p495b;

import android.os.Process;

/* renamed from: io.fabric.sdk.android.p.b.h */
/* compiled from: BackgroundPriorityRunnable */
public abstract class C14247h implements Runnable {
    /* access modifiers changed from: protected */
    public abstract void onRun();

    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
