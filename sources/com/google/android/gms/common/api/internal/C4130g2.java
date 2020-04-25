package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p173f0.C4482c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.api.internal.g2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4130g2 {

    /* renamed from: a */
    private static final ExecutorService f12942a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4482c("GAC_Transform"));
        f12942a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static ExecutorService m17821a() {
        return f12942a;
    }
}
