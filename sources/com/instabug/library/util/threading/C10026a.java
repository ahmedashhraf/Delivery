package com.instabug.library.util.threading;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.threading.a */
/* compiled from: MainThreadExecutor */
public class C10026a implements Executor {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26680b;

    /* renamed from: a */
    private final Handler f26681a = new Handler(Looper.getMainLooper());

    public C10026a() {
        boolean[] a = m46645a();
        a[0] = true;
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46645a() {
        boolean[] zArr = f26680b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8705552303668424397L, "com/instabug/library/util/threading/MainThreadExecutor", 3);
        f26680b = a;
        return a;
    }

    public void execute(Runnable runnable) {
        boolean[] a = m46645a();
        this.f26681a.post(runnable);
        a[2] = true;
    }
}
