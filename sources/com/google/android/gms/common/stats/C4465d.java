package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4485g0;
import java.util.Arrays;
import java.util.List;

@C4056a
/* renamed from: com.google.android.gms.common.stats.d */
public class C4465d {

    /* renamed from: a */
    private static C4465d f13705a = new C4465d();

    /* renamed from: b */
    private static Boolean f13706b;
    @C4476d0

    /* renamed from: c */
    private static boolean f13707c = false;

    @C4056a
    /* renamed from: a */
    public static C4465d m19284a() {
        return f13705a;
    }

    /* renamed from: b */
    private static boolean m19286b() {
        if (f13706b == null) {
            f13706b = Boolean.valueOf(false);
        }
        return f13706b.booleanValue();
    }

    @C4056a
    /* renamed from: a */
    public void mo18554a(Context context, Intent intent, String str, String str2, String str3, int i, String str4) {
        Intent intent2 = intent;
        Context context2 = context;
        mo18555a(context2, intent.getStringExtra(C4463b.f13703i), 7, str, str2, str3, i, Arrays.asList(new String[]{str4}));
    }

    @C4056a
    /* renamed from: a */
    public void mo18553a(Context context, Intent intent) {
        mo18555a(context, intent.getStringExtra(C4463b.f13703i), 8, (String) null, (String) null, (String) null, 0, null);
    }

    @C4056a
    /* renamed from: a */
    public void mo18555a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        mo18556a(context, str, i, str2, str3, str4, i2, list, 0);
    }

    @C4056a
    /* renamed from: a */
    public void mo18556a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (m19286b()) {
            if (TextUtils.isEmpty(str)) {
                String str5 = "missing wakeLock key. ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str5.concat(valueOf);
                } else {
                    new String(str5);
                }
                return;
            }
            if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, C4464c.m19283a(list), str, SystemClock.elapsedRealtime(), C4485g0.m19349a(context), str3, C4464c.m19282a(context.getPackageName()), C4485g0.m19350b(context), j, str4, false);
                m19285a(context, wakeLockEvent);
            }
        }
    }

    @C4056a
    /* renamed from: a */
    public void mo18557a(Context context, String str, String str2, String str3, int i, List<String> list, boolean z, long j) {
        if (m19286b()) {
            WakeLockEvent wakeLockEvent = new WakeLockEvent(System.currentTimeMillis(), 16, str, i, C4464c.m19283a(list), null, j, C4485g0.m19349a(context), str2, C4464c.m19282a(context.getPackageName()), C4485g0.m19350b(context), 0, str3, z);
            m19285a(context, wakeLockEvent);
        }
    }

    /* renamed from: a */
    private static void m19285a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(C4463b.f13695a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception unused) {
        }
    }
}
