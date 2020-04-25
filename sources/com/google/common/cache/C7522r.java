package com.google.common.cache;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import sun.misc.Unsafe;

/* renamed from: com.google.common.cache.r */
/* compiled from: Striped64 */
abstract class C7522r extends Number {

    /* renamed from: O */
    static final C7526d f21052O = new C7526d();

    /* renamed from: P */
    static final int f21053P = Runtime.getRuntime().availableProcessors();

    /* renamed from: Q */
    private static final Unsafe f21054Q;

    /* renamed from: R */
    private static final long f21055R;

    /* renamed from: S */
    private static final long f21056S;

    /* renamed from: N */
    volatile transient int f21057N;

    /* renamed from: a */
    volatile transient C7524b[] f21058a;

    /* renamed from: b */
    volatile transient long f21059b;

    /* renamed from: com.google.common.cache.r$a */
    /* compiled from: Striped64 */
    static class C7523a implements PrivilegedExceptionAction<Unsafe> {
        C7523a() {
        }

        public Unsafe run() throws Exception {
            Field[] declaredFields;
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (cls.isInstance(obj)) {
                    return (Unsafe) cls.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* renamed from: com.google.common.cache.r$b */
    /* compiled from: Striped64 */
    static final class C7524b {

        /* renamed from: p */
        private static final Unsafe f21060p;

        /* renamed from: q */
        private static final long f21061q;

        /* renamed from: a */
        volatile long f21062a;

        /* renamed from: b */
        volatile long f21063b;

        /* renamed from: c */
        volatile long f21064c;

        /* renamed from: d */
        volatile long f21065d;

        /* renamed from: e */
        volatile long f21066e;

        /* renamed from: f */
        volatile long f21067f;

        /* renamed from: g */
        volatile long f21068g;

        /* renamed from: h */
        volatile long f21069h;

        /* renamed from: i */
        volatile long f21070i;

        /* renamed from: j */
        volatile long f21071j;

        /* renamed from: k */
        volatile long f21072k;

        /* renamed from: l */
        volatile long f21073l;

        /* renamed from: m */
        volatile long f21074m;

        /* renamed from: n */
        volatile long f21075n;

        /* renamed from: o */
        volatile long f21076o;

        static {
            try {
                f21060p = C7522r.mo29579g();
                Class<C7524b> cls = C7524b.class;
                f21061q = f21060p.objectFieldOffset(cls.getDeclaredField(XHTMLText.f45021H));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        C7524b(long j) {
            this.f21069h = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo29600a(long j, long j2) {
            return f21060p.compareAndSwapLong(this, f21061q, j, j2);
        }
    }

    /* renamed from: com.google.common.cache.r$c */
    /* compiled from: Striped64 */
    static final class C7525c {

        /* renamed from: b */
        static final Random f21077b = new Random();

        /* renamed from: a */
        int f21078a;

        C7525c() {
            int nextInt = f21077b.nextInt();
            if (nextInt == 0) {
                nextInt = 1;
            }
            this.f21078a = nextInt;
        }
    }

    /* renamed from: com.google.common.cache.r$d */
    /* compiled from: Striped64 */
    static final class C7526d extends ThreadLocal<C7525c> {
        C7526d() {
        }

        public C7525c initialValue() {
            return new C7525c();
        }
    }

    static {
        try {
            f21054Q = mo29579g();
            Class<C7522r> cls = C7522r.class;
            f21055R = f21054Q.objectFieldOffset(cls.getDeclaredField("b"));
            f21056S = f21054Q.objectFieldOffset(cls.getDeclaredField("N"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    C7522r() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.cache.C7522r.C7523a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe mo29579g() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.cache.r$a r0 = new com.google.common.cache.r$a     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7522r.mo29579g():sun.misc.Unsafe");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo29596a(long j, long j2) {
        return f21054Q.compareAndSwapLong(this, f21055R, j, j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract long mo29576b(long j, long j2);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo29597b(long j) {
        C7524b[] bVarArr = this.f21058a;
        this.f21059b = j;
        if (bVarArr != null) {
            for (C7524b bVar : bVarArr) {
                if (bVar != null) {
                    bVar.f21069h = j;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final boolean mo29598e() {
        return f21054Q.compareAndSwapInt(this, f21056S, 0, 1);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006f, code lost:
        if (r11.f21058a != r3) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0071, code lost:
        r2 = new com.google.common.cache.C7522r.C7524b[(r5 << 1)];
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0076, code lost:
        if (r4 >= r5) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r2[r4] = r3[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
        r11.f21058a = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cb A[EDGE_INSN: B:76:0x00cb->B:73:0x00cb ?: BREAK  
    EDGE_INSN: B:76:0x00cb->B:73:0x00cb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29595a(long r12, com.google.common.cache.C7522r.C7525c r14, boolean r15) {
        /*
            r11 = this;
            int r0 = r14.f21078a
            r1 = 0
        L_0x0003:
            r2 = 0
        L_0x0004:
            com.google.common.cache.r$b[] r3 = r11.f21058a
            r4 = 1
            if (r3 == 0) goto L_0x0094
            int r5 = r3.length
            if (r5 <= 0) goto L_0x0094
            int r6 = r5 + -1
            r6 = r6 & r0
            r6 = r3[r6]
            if (r6 != 0) goto L_0x0044
            int r3 = r11.f21057N
            if (r3 != 0) goto L_0x0042
            com.google.common.cache.r$b r3 = new com.google.common.cache.r$b
            r3.<init>(r12)
            int r5 = r11.f21057N
            if (r5 != 0) goto L_0x0042
            boolean r5 = r11.mo29598e()
            if (r5 == 0) goto L_0x0042
            com.google.common.cache.r$b[] r5 = r11.f21058a     // Catch:{ all -> 0x003e }
            if (r5 == 0) goto L_0x0037
            int r6 = r5.length     // Catch:{ all -> 0x003e }
            if (r6 <= 0) goto L_0x0037
            int r6 = r6 + -1
            r6 = r6 & r0
            r7 = r5[r6]     // Catch:{ all -> 0x003e }
            if (r7 != 0) goto L_0x0037
            r5[r6] = r3     // Catch:{ all -> 0x003e }
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            r11.f21057N = r1
            if (r4 == 0) goto L_0x0004
            goto L_0x00cb
        L_0x003e:
            r12 = move-exception
            r11.f21057N = r1
            throw r12
        L_0x0042:
            r2 = 0
            goto L_0x0089
        L_0x0044:
            if (r15 != 0) goto L_0x0048
            r15 = 1
            goto L_0x0089
        L_0x0048:
            long r7 = r6.f21069h
            long r9 = r11.mo29576b(r7, r12)
            boolean r6 = r6.mo29600a(r7, r9)
            if (r6 == 0) goto L_0x0056
            goto L_0x00cb
        L_0x0056:
            int r6 = f21053P
            if (r5 >= r6) goto L_0x0042
            com.google.common.cache.r$b[] r6 = r11.f21058a
            if (r6 == r3) goto L_0x005f
            goto L_0x0042
        L_0x005f:
            if (r2 != 0) goto L_0x0063
            r2 = 1
            goto L_0x0089
        L_0x0063:
            int r4 = r11.f21057N
            if (r4 != 0) goto L_0x0089
            boolean r4 = r11.mo29598e()
            if (r4 == 0) goto L_0x0089
            com.google.common.cache.r$b[] r2 = r11.f21058a     // Catch:{ all -> 0x0085 }
            if (r2 != r3) goto L_0x0081
            int r2 = r5 << 1
            com.google.common.cache.r$b[] r2 = new com.google.common.cache.C7522r.C7524b[r2]     // Catch:{ all -> 0x0085 }
            r4 = 0
        L_0x0076:
            if (r4 >= r5) goto L_0x007f
            r6 = r3[r4]     // Catch:{ all -> 0x0085 }
            r2[r4] = r6     // Catch:{ all -> 0x0085 }
            int r4 = r4 + 1
            goto L_0x0076
        L_0x007f:
            r11.f21058a = r2     // Catch:{ all -> 0x0085 }
        L_0x0081:
            r11.f21057N = r1
            goto L_0x0003
        L_0x0085:
            r12 = move-exception
            r11.f21057N = r1
            throw r12
        L_0x0089:
            int r3 = r0 << 13
            r0 = r0 ^ r3
            int r3 = r0 >>> 17
            r0 = r0 ^ r3
            int r3 = r0 << 5
            r0 = r0 ^ r3
            goto L_0x0004
        L_0x0094:
            int r5 = r11.f21057N
            if (r5 != 0) goto L_0x00bf
            com.google.common.cache.r$b[] r5 = r11.f21058a
            if (r5 != r3) goto L_0x00bf
            boolean r5 = r11.mo29598e()
            if (r5 == 0) goto L_0x00bf
            com.google.common.cache.r$b[] r5 = r11.f21058a     // Catch:{ all -> 0x00bb }
            if (r5 != r3) goto L_0x00b5
            r3 = 2
            com.google.common.cache.r$b[] r3 = new com.google.common.cache.C7522r.C7524b[r3]     // Catch:{ all -> 0x00bb }
            r5 = r0 & 1
            com.google.common.cache.r$b r6 = new com.google.common.cache.r$b     // Catch:{ all -> 0x00bb }
            r6.<init>(r12)     // Catch:{ all -> 0x00bb }
            r3[r5] = r6     // Catch:{ all -> 0x00bb }
            r11.f21058a = r3     // Catch:{ all -> 0x00bb }
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            r11.f21057N = r1
            if (r4 == 0) goto L_0x0004
            goto L_0x00cb
        L_0x00bb:
            r12 = move-exception
            r11.f21057N = r1
            throw r12
        L_0x00bf:
            long r3 = r11.f21059b
            long r5 = r11.mo29576b(r3, r12)
            boolean r3 = r11.mo29596a(r3, r5)
            if (r3 == 0) goto L_0x0004
        L_0x00cb:
            r14.f21078a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C7522r.mo29595a(long, com.google.common.cache.r$c, boolean):void");
    }
}
