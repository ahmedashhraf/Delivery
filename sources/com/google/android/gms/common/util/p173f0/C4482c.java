package com.google.android.gms.common.util.p173f0;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@C4056a
/* renamed from: com.google.android.gms.common.util.f0.c */
public class C4482c implements ThreadFactory {

    /* renamed from: N */
    private final AtomicInteger f13722N;

    /* renamed from: O */
    private final ThreadFactory f13723O;

    /* renamed from: a */
    private final String f13724a;

    /* renamed from: b */
    private final int f13725b;

    @C4056a
    public C4482c(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f13723O.newThread(new C4483d(runnable, 0));
        String str = this.f13724a;
        int andIncrement = this.f13722N.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }

    private C4482c(String str, int i) {
        this.f13722N = new AtomicInteger();
        this.f13723O = Executors.defaultThreadFactory();
        this.f13724a = (String) C4300a0.m18621a(str, (Object) "Name must not be null");
        this.f13725b = 0;
    }
}
