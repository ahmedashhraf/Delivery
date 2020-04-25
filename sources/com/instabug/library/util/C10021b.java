package com.instabug.library.util;

import java.io.Closeable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.b */
/* compiled from: ClosableUtils */
public class C10021b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26668a;

    public C10021b() {
        m46632a()[0] = true;
    }

    /* renamed from: a */
    public static void m46631a(Closeable closeable) {
        boolean[] a = m46632a();
        if (closeable == null) {
            a[1] = true;
        } else {
            try {
                a[2] = true;
                closeable.close();
                a[3] = true;
            } catch (Throwable th) {
                a[4] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to close ");
                sb.append(closeable.getClass().getSimpleName());
                InstabugSDKLogger.m46624e(C10021b.class, sb.toString(), th);
                a[5] = true;
            }
        }
        a[6] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46632a() {
        boolean[] zArr = f26668a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2103626072459508328L, "com/instabug/library/util/ClosableUtils", 7);
        f26668a = a;
        return a;
    }
}
