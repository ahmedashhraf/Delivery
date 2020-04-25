package com.google.common.util.concurrent;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2778d;

/* renamed from: com.google.common.util.concurrent.t0 */
/* compiled from: UncaughtExceptionHandlers */
public final class C8592t0 {

    @C2778d
    /* renamed from: com.google.common.util.concurrent.t0$a */
    /* compiled from: UncaughtExceptionHandlers */
    static final class C8593a implements UncaughtExceptionHandler {

        /* renamed from: b */
        private static final Logger f22588b = Logger.getLogger(C8593a.class.getName());

        /* renamed from: a */
        private final Runtime f22589a;

        C8593a(Runtime runtime) {
            this.f22589a = runtime;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            try {
                f22588b.log(Level.SEVERE, String.format("Caught an exception in %s.  Shutting down.", new Object[]{thread}), th);
            } catch (Throwable th2) {
                this.f22589a.exit(1);
                throw th2;
            }
            this.f22589a.exit(1);
        }
    }

    private C8592t0() {
    }

    /* renamed from: a */
    public static UncaughtExceptionHandler m40484a() {
        return new C8593a(Runtime.getRuntime());
    }
}
