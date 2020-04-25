package com.google.android.gms.common.util.p173f0;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@C4056a
/* renamed from: com.google.android.gms.common.util.f0.b */
public class C4481b implements ThreadFactory {

    /* renamed from: N */
    private final ThreadFactory f13719N;

    /* renamed from: a */
    private final String f13720a;

    /* renamed from: b */
    private final int f13721b;

    @C4056a
    public C4481b(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f13719N.newThread(new C4483d(runnable, 0));
        newThread.setName(this.f13720a);
        return newThread;
    }

    private C4481b(String str, int i) {
        this.f13719N = Executors.defaultThreadFactory();
        this.f13720a = (String) C4300a0.m18621a(str, (Object) "Name must not be null");
        this.f13721b = 0;
    }
}
