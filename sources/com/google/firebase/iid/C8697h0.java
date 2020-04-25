package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.h0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8697h0 {

    /* renamed from: a */
    final Intent f22819a;

    /* renamed from: b */
    private final PendingResult f22820b;

    /* renamed from: c */
    private boolean f22821c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f22822d;

    C8697h0(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f22819a = intent;
        this.f22820b = pendingResult;
        this.f22822d = scheduledExecutorService.schedule(new C8695g0(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo32126a() {
        if (!this.f22821c) {
            this.f22820b.finish();
            this.f22822d.cancel(false);
            this.f22821c = true;
        }
    }
}
