package com.google.android.gms.common.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.internal.d */
public final class C4311d {
    private C4311d() {
        throw new AssertionError("Uninstantiable");
    }

    @C4056a
    /* renamed from: a */
    public static void m18636a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @C4056a
    /* renamed from: b */
    public static void m18641b(Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18637a(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @C4056a
    /* renamed from: b */
    public static void m18642b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56 + String.valueOf(valueOf2).length());
            sb.append("checkNotMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            sb.toString();
            throw new IllegalStateException(str);
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18639a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18640a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m18638a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            String valueOf = String.valueOf(Thread.currentThread());
            String valueOf2 = String.valueOf(Looper.getMainLooper().getThread());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("checkMainThread: current thread ");
            sb.append(valueOf);
            sb.append(" IS NOT the main thread ");
            sb.append(valueOf2);
            sb.append("!");
            sb.toString();
            throw new IllegalStateException(str);
        }
    }
}
