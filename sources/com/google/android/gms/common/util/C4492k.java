package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.util.k */
public class C4492k implements C4484g {

    /* renamed from: a */
    private static final C4492k f13739a = new C4492k();

    private C4492k() {
    }

    @C4056a
    /* renamed from: e */
    public static C4484g m19370e() {
        return f13739a;
    }

    /* renamed from: a */
    public long mo18569a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo18570b() {
        return System.nanoTime();
    }

    /* renamed from: c */
    public long mo18571c() {
        return SystemClock.currentThreadTimeMillis();
    }

    /* renamed from: d */
    public long mo18572d() {
        return SystemClock.elapsedRealtime();
    }
}
