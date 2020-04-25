package com.instabug.library.analytics.util;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.network.InstabugAnalyticsUploaderService;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.analytics.util.b */
/* compiled from: UploaderServiceLauncher */
public class C9713b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25723a;

    /* renamed from: a */
    public static void m45314a() {
        boolean[] b = m45315b();
        if (Instabug.getApplicationContext() == null) {
            b[1] = true;
        } else {
            b[2] = true;
            Context applicationContext = Instabug.getApplicationContext();
            b[3] = true;
            Intent intent = new Intent(Instabug.getApplicationContext(), InstabugAnalyticsUploaderService.class);
            b[4] = true;
            InstabugAnalyticsUploaderService.m45297a(applicationContext, intent);
            b[5] = true;
        }
        b[6] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45315b() {
        boolean[] zArr = f25723a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1159778370850129090L, "com/instabug/library/analytics/util/UploaderServiceLauncher", 7);
        f25723a = a;
        return a;
    }
}
