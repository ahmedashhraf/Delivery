package androidx.core.provider;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0221u;
import androidx.annotation.C0224v0;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.provider.b */
/* compiled from: SelfDestructiveThread */
public class C1095b {

    /* renamed from: i */
    private static final int f4804i = 1;

    /* renamed from: j */
    private static final int f4805j = 0;

    /* renamed from: a */
    private final Object f4806a = new Object();
    @C0221u("mLock")

    /* renamed from: b */
    private HandlerThread f4807b;
    @C0221u("mLock")

    /* renamed from: c */
    private Handler f4808c;
    @C0221u("mLock")

    /* renamed from: d */
    private int f4809d;

    /* renamed from: e */
    private Callback f4810e = new C1096a();

    /* renamed from: f */
    private final int f4811f;

    /* renamed from: g */
    private final int f4812g;

    /* renamed from: h */
    private final String f4813h;

    /* renamed from: androidx.core.provider.b$a */
    /* compiled from: SelfDestructiveThread */
    class C1096a implements Callback {
        C1096a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C1095b.this.mo5270c();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C1095b.this.mo5267a((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: androidx.core.provider.b$b */
    /* compiled from: SelfDestructiveThread */
    class C1097b implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C1100d f4815N;

        /* renamed from: a */
        final /* synthetic */ Callable f4817a;

        /* renamed from: b */
        final /* synthetic */ Handler f4818b;

        /* renamed from: androidx.core.provider.b$b$a */
        /* compiled from: SelfDestructiveThread */
        class C1098a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f4819a;

            C1098a(Object obj) {
                this.f4819a = obj;
            }

            public void run() {
                C1097b.this.f4815N.mo5242a(this.f4819a);
            }
        }

        C1097b(Callable callable, Handler handler, C1100d dVar) {
            this.f4817a = callable;
            this.f4818b = handler;
            this.f4815N = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f4817a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f4818b.post(new C1098a(obj));
        }
    }

    /* renamed from: androidx.core.provider.b$c */
    /* compiled from: SelfDestructiveThread */
    class C1099c implements Runnable {

        /* renamed from: N */
        final /* synthetic */ ReentrantLock f4821N;

        /* renamed from: O */
        final /* synthetic */ AtomicBoolean f4822O;

        /* renamed from: P */
        final /* synthetic */ Condition f4823P;

        /* renamed from: a */
        final /* synthetic */ AtomicReference f4825a;

        /* renamed from: b */
        final /* synthetic */ Callable f4826b;

        C1099c(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f4825a = atomicReference;
            this.f4826b = callable;
            this.f4821N = reentrantLock;
            this.f4822O = atomicBoolean;
            this.f4823P = condition;
        }

        public void run() {
            try {
                this.f4825a.set(this.f4826b.call());
            } catch (Exception unused) {
            }
            this.f4821N.lock();
            try {
                this.f4822O.set(false);
                this.f4823P.signal();
            } finally {
                this.f4821N.unlock();
            }
        }
    }

    /* renamed from: androidx.core.provider.b$d */
    /* compiled from: SelfDestructiveThread */
    public interface C1100d<T> {
        /* renamed from: a */
        void mo5242a(T t);
    }

    public C1095b(String str, int i, int i2) {
        this.f4813h = str;
        this.f4812g = i;
        this.f4811f = i2;
        this.f4809d = 0;
    }

    @C0224v0
    /* renamed from: a */
    public int mo5265a() {
        int i;
        synchronized (this.f4806a) {
            i = this.f4809d;
        }
        return i;
    }

    @C0224v0
    /* renamed from: b */
    public boolean mo5269b() {
        boolean z;
        synchronized (this.f4806a) {
            z = this.f4807b != null;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5270c() {
        synchronized (this.f4806a) {
            if (!this.f4808c.hasMessages(1)) {
                this.f4807b.quit();
                this.f4807b = null;
                this.f4808c = null;
            }
        }
    }

    /* renamed from: b */
    private void m6228b(Runnable runnable) {
        synchronized (this.f4806a) {
            if (this.f4807b == null) {
                this.f4807b = new HandlerThread(this.f4813h, this.f4812g);
                this.f4807b.start();
                this.f4808c = new Handler(this.f4807b.getLooper(), this.f4810e);
                this.f4809d++;
            }
            this.f4808c.removeMessages(0);
            this.f4808c.sendMessage(this.f4808c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void mo5268a(Callable<T> callable, C1100d<T> dVar) {
        m6228b(new C1097b(callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo5266a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            androidx.core.provider.b$c r11 = new androidx.core.provider.b$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m6228b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            goto L_0x0062
        L_0x0061:
            throw r13
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.C1095b.mo5266a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5267a(Runnable runnable) {
        runnable.run();
        synchronized (this.f4806a) {
            this.f4808c.removeMessages(0);
            this.f4808c.sendMessageDelayed(this.f4808c.obtainMessage(0), (long) this.f4811f);
        }
    }
}
