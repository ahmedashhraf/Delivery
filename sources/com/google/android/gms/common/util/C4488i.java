package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import p201f.p202a.p203u.C5966a;

@C4056a
/* renamed from: com.google.android.gms.common.util.i */
public final class C4488i {

    /* renamed from: a */
    private static final String[] f13732a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static DropBoxManager f13733b = null;

    /* renamed from: c */
    private static boolean f13734c = false;

    /* renamed from: d */
    private static int f13735d = -1;
    @C5966a("CrashUtils.class")

    /* renamed from: e */
    private static int f13736e;
    @C5966a("CrashUtils.class")

    /* renamed from: f */
    private static int f13737f;

    @C4056a
    /* renamed from: a */
    public static boolean m19364a(Context context, Throwable th) {
        return m19365a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m19365a(Context context, Throwable th, int i) {
        try {
            C4300a0.m18620a(context);
            C4300a0.m18620a(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
