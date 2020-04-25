package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.x0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5042x0 extends ContentObserver {
    C5042x0(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C5055y0.f14522e.set(true);
    }
}
