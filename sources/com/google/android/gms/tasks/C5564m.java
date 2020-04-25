package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0193h0;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.m */
public final class C5564m {

    /* renamed from: a */
    public static final Executor f15872a = new C5565a();

    /* renamed from: b */
    static final Executor f15873b = new C5554h0();

    /* renamed from: com.google.android.gms.tasks.m$a */
    private static final class C5565a implements Executor {

        /* renamed from: a */
        private final Handler f15874a = new Handler(Looper.getMainLooper());

        public final void execute(@C0193h0 Runnable runnable) {
            this.f15874a.post(runnable);
        }
    }

    private C5564m() {
    }
}
