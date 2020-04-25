package com.google.android.gms.common.p172q;

import android.content.Context;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4503v;

@C4056a
/* renamed from: com.google.android.gms.common.q.a */
public class C4437a {

    /* renamed from: a */
    private static Context f13604a;

    /* renamed from: b */
    private static Boolean f13605b;

    @C4056a
    /* renamed from: a */
    public static synchronized boolean m19100a(Context context) {
        synchronized (C4437a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f13604a == null || f13605b == null || f13604a != applicationContext) {
                f13605b = null;
                if (C4503v.m19420n()) {
                    f13605b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f13605b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        f13605b = Boolean.valueOf(false);
                    }
                }
                f13604a = applicationContext;
                boolean booleanValue = f13605b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f13605b.booleanValue();
            return booleanValue2;
        }
    }
}
