package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.common.util.concurrent.r0 */
/* compiled from: ThreadFactoryBuilder */
public final class C8586r0 {

    /* renamed from: a */
    private String f22576a = null;

    /* renamed from: b */
    private Boolean f22577b = null;

    /* renamed from: c */
    private Integer f22578c = null;

    /* renamed from: d */
    private UncaughtExceptionHandler f22579d = null;

    /* renamed from: e */
    private ThreadFactory f22580e = null;

    /* renamed from: com.google.common.util.concurrent.r0$a */
    /* compiled from: ThreadFactoryBuilder */
    static class C8587a implements ThreadFactory {

        /* renamed from: N */
        final /* synthetic */ AtomicLong f22581N;

        /* renamed from: O */
        final /* synthetic */ Boolean f22582O;

        /* renamed from: P */
        final /* synthetic */ Integer f22583P;

        /* renamed from: Q */
        final /* synthetic */ UncaughtExceptionHandler f22584Q;

        /* renamed from: a */
        final /* synthetic */ ThreadFactory f22585a;

        /* renamed from: b */
        final /* synthetic */ String f22586b;

        C8587a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f22585a = threadFactory;
            this.f22586b = str;
            this.f22581N = atomicLong;
            this.f22582O = bool;
            this.f22583P = num;
            this.f22584Q = uncaughtExceptionHandler;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f22585a.newThread(runnable);
            String str = this.f22586b;
            if (str != null) {
                newThread.setName(String.format(str, new Object[]{Long.valueOf(this.f22581N.getAndIncrement())}));
            }
            Boolean bool = this.f22582O;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f22583P;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            UncaughtExceptionHandler uncaughtExceptionHandler = this.f22584Q;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    /* renamed from: a */
    public C8586r0 mo31895a(String str) {
        String.format(str, new Object[]{Integer.valueOf(0)});
        this.f22576a = str;
        return this;
    }

    /* renamed from: a */
    public C8586r0 mo31898a(boolean z) {
        this.f22577b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: a */
    public C8586r0 mo31894a(int i) {
        C7397x.m35672a(i >= 1, "Thread priority (%s) must be >= %s", Integer.valueOf(i), Integer.valueOf(1));
        C7397x.m35672a(i <= 10, "Thread priority (%s) must be <= %s", Integer.valueOf(i), Integer.valueOf(10));
        this.f22578c = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public C8586r0 mo31896a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f22579d = (UncaughtExceptionHandler) C7397x.m35664a(uncaughtExceptionHandler);
        return this;
    }

    /* renamed from: a */
    public C8586r0 mo31897a(ThreadFactory threadFactory) {
        this.f22580e = (ThreadFactory) C7397x.m35664a(threadFactory);
        return this;
    }

    /* renamed from: a */
    public ThreadFactory mo31899a() {
        return m40461a(this);
    }

    /* renamed from: a */
    private static ThreadFactory m40461a(C8586r0 r0Var) {
        String str = r0Var.f22576a;
        Boolean bool = r0Var.f22577b;
        Integer num = r0Var.f22578c;
        UncaughtExceptionHandler uncaughtExceptionHandler = r0Var.f22579d;
        ThreadFactory threadFactory = r0Var.f22580e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        C8587a aVar = new C8587a(threadFactory, str, str != null ? new AtomicLong(0) : null, bool, num, uncaughtExceptionHandler);
        return aVar;
    }
}
