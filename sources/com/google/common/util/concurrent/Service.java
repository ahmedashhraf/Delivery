package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
public interface Service {

    @C2775a
    public enum State {
        NEW {
            /* access modifiers changed from: 0000 */
            public boolean isTerminal() {
                return false;
            }
        },
        STARTING {
            /* access modifiers changed from: 0000 */
            public boolean isTerminal() {
                return false;
            }
        },
        RUNNING {
            /* access modifiers changed from: 0000 */
            public boolean isTerminal() {
                return false;
            }
        },
        STOPPING {
            /* access modifiers changed from: 0000 */
            public boolean isTerminal() {
                return false;
            }
        },
        TERMINATED {
            /* access modifiers changed from: 0000 */
            public boolean isTerminal() {
                return true;
            }
        },
        FAILED {
            /* access modifiers changed from: 0000 */
            public boolean isTerminal() {
                return true;
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract boolean isTerminal();
    }

    @C2775a
    /* renamed from: com.google.common.util.concurrent.Service$b */
    public static abstract class C8435b {
        /* renamed from: a */
        public void mo31608a() {
        }

        /* renamed from: a */
        public void mo31609a(State state) {
        }

        /* renamed from: a */
        public void mo31610a(State state, Throwable th) {
        }

        /* renamed from: b */
        public void mo31611b() {
        }

        /* renamed from: b */
        public void mo31612b(State state) {
        }
    }

    /* renamed from: a */
    State mo31597a();

    /* renamed from: a */
    void mo31598a(long j, TimeUnit timeUnit) throws TimeoutException;

    /* renamed from: a */
    void mo31599a(C8435b bVar, Executor executor);

    /* renamed from: b */
    void mo31600b();

    /* renamed from: b */
    void mo31601b(long j, TimeUnit timeUnit) throws TimeoutException;

    /* renamed from: c */
    Throwable mo31602c();

    /* renamed from: d */
    Service mo31603d();

    /* renamed from: e */
    void mo31604e();

    /* renamed from: f */
    Service mo31605f();

    boolean isRunning();
}
