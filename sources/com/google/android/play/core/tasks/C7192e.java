package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.e */
public final class C7192e {

    /* renamed from: a */
    public static final Executor f20325a = new C7193a();

    /* renamed from: b */
    static final Executor f20326b = new C7206p();

    /* renamed from: com.google.android.play.core.tasks.e$a */
    static final class C7193a implements Executor {

        /* renamed from: a */
        private final Handler f20327a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f20327a.post(runnable);
        }
    }

    private C7192e() {
    }
}
