package com.instabug.library.p384h.p385c;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.h.c.b */
/* compiled from: Memory */
public class C9819b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26029a;

    /* renamed from: a */
    public static long m45811a(Context context) {
        boolean[] a = m45812a();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        a[1] = true;
        MemoryInfo memoryInfo = new MemoryInfo();
        a[2] = true;
        activityManager.getMemoryInfo(memoryInfo);
        long j = memoryInfo.availMem;
        a[3] = true;
        return j;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45812a() {
        boolean[] zArr = f26029a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6097247686481251506L, "com/instabug/library/instacapture/utility/Memory", 4);
        f26029a = a;
        return a;
    }
}
