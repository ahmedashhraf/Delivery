package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;

/* renamed from: com.google.android.gms.common.util.g0 */
public final class C4485g0 {

    /* renamed from: a */
    private static final IntentFilter f13728a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f13729b;

    /* renamed from: c */
    private static float f13730c = Float.NaN;

    @TargetApi(20)
    /* renamed from: a */
    public static int m19349a(Context context) {
        int i;
        boolean z;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f13728a);
        int i2 = 0;
        if (registerReceiver == null) {
            i = 0;
        } else {
            i = registerReceiver.getIntExtra("plugged", 0);
        }
        int i3 = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C4503v.m19415i()) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        if (z) {
            i2 = 2;
        }
        return i2 | i3;
    }

    /* renamed from: b */
    public static synchronized float m19350b(Context context) {
        synchronized (C4485g0.class) {
            if (SystemClock.elapsedRealtime() - f13729b >= 60000 || Float.isNaN(f13730c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f13728a);
                if (registerReceiver != null) {
                    f13730c = ((float) registerReceiver.getIntExtra(C5854b.f16935q, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f13729b = SystemClock.elapsedRealtime();
                float f = f13730c;
                return f;
            }
            float f2 = f13730c;
            return f2;
        }
    }
}
