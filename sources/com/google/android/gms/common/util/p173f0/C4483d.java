package com.google.android.gms.common.util.p173f0;

import android.os.Process;

/* renamed from: com.google.android.gms.common.util.f0.d */
final class C4483d implements Runnable {

    /* renamed from: a */
    private final Runnable f13726a;

    /* renamed from: b */
    private final int f13727b;

    public C4483d(Runnable runnable, int i) {
        this.f13726a = runnable;
        this.f13727b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f13727b);
        this.f13726a.run();
    }
}
