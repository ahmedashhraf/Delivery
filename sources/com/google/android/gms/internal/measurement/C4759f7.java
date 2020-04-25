package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.f7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4759f7 {

    /* renamed from: a */
    private static final Logger f14104a = Logger.getLogger(C4759f7.class.getName());

    /* renamed from: b */
    private static final Unsafe f14105b = m20161c();

    /* renamed from: c */
    private static final Class<?> f14106c = C4955s2.m21101b();

    /* renamed from: d */
    private static final boolean f14107d = m20169d(Long.TYPE);

    /* renamed from: e */
    private static final boolean f14108e = m20169d(Integer.TYPE);

    /* renamed from: f */
    private static final C4763d f14109f;

    /* renamed from: g */
    private static final boolean f14110g = m20172e();

    /* renamed from: h */
    private static final boolean f14111h = m20168d();

    /* renamed from: i */
    private static final long f14112i = ((long) m20155b(byte[].class));

    /* renamed from: j */
    private static final long f14113j;

    /* renamed from: k */
    private static final long f14114k;

    /* renamed from: l */
    private static final long f14115l;

    /* renamed from: m */
    private static final long f14116m;

    /* renamed from: n */
    private static final long f14117n;

    /* renamed from: o */
    private static final long f14118o;

    /* renamed from: p */
    private static final long f14119p;

    /* renamed from: q */
    private static final long f14120q;

    /* renamed from: r */
    private static final long f14121r;

    /* renamed from: s */
    private static final long f14122s;

    /* renamed from: t */
    private static final long f14123t;

    /* renamed from: u */
    private static final long f14124u;

    /* renamed from: v */
    private static final long f14125v;

    /* renamed from: w */
    private static final int f14126w = ((int) (f14112i & 7));

    /* renamed from: x */
    static final boolean f14127x = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.f7$a */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    static final class C4760a extends C4763d {
        C4760a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo18993a(Object obj, long j) {
            if (C4759f7.f14127x) {
                return C4759f7.m20179k(obj, j);
            }
            return C4759f7.m20180l(obj, j);
        }

        /* renamed from: b */
        public final boolean mo18998b(Object obj, long j) {
            if (C4759f7.f14127x) {
                return C4759f7.m20181m(obj, j);
            }
            return C4759f7.m20182n(obj, j);
        }

        /* renamed from: c */
        public final float mo18999c(Object obj, long j) {
            return Float.intBitsToFloat(mo19003e(obj, j));
        }

        /* renamed from: d */
        public final double mo19000d(Object obj, long j) {
            return Double.longBitsToDouble(mo19004f(obj, j));
        }

        /* renamed from: a */
        public final void mo18994a(Object obj, long j, byte b) {
            if (C4759f7.f14127x) {
                C4759f7.m20162c(obj, j, b);
            } else {
                C4759f7.m20166d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo18997a(Object obj, long j, boolean z) {
            if (C4759f7.f14127x) {
                C4759f7.m20167d(obj, j, z);
            } else {
                C4759f7.m20171e(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo18996a(Object obj, long j, float f) {
            mo19001a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo18995a(Object obj, long j, double d) {
            mo19002a(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f7$b */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    static final class C4761b extends C4763d {
        C4761b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo18993a(Object obj, long j) {
            return this.f14128a.getByte(obj, j);
        }

        /* renamed from: b */
        public final boolean mo18998b(Object obj, long j) {
            return this.f14128a.getBoolean(obj, j);
        }

        /* renamed from: c */
        public final float mo18999c(Object obj, long j) {
            return this.f14128a.getFloat(obj, j);
        }

        /* renamed from: d */
        public final double mo19000d(Object obj, long j) {
            return this.f14128a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo18994a(Object obj, long j, byte b) {
            this.f14128a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public final void mo18997a(Object obj, long j, boolean z) {
            this.f14128a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public final void mo18996a(Object obj, long j, float f) {
            this.f14128a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public final void mo18995a(Object obj, long j, double d) {
            this.f14128a.putDouble(obj, j, d);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f7$c */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    static final class C4762c extends C4763d {
        C4762c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final byte mo18993a(Object obj, long j) {
            if (C4759f7.f14127x) {
                return C4759f7.m20179k(obj, j);
            }
            return C4759f7.m20180l(obj, j);
        }

        /* renamed from: b */
        public final boolean mo18998b(Object obj, long j) {
            if (C4759f7.f14127x) {
                return C4759f7.m20181m(obj, j);
            }
            return C4759f7.m20182n(obj, j);
        }

        /* renamed from: c */
        public final float mo18999c(Object obj, long j) {
            return Float.intBitsToFloat(mo19003e(obj, j));
        }

        /* renamed from: d */
        public final double mo19000d(Object obj, long j) {
            return Double.longBitsToDouble(mo19004f(obj, j));
        }

        /* renamed from: a */
        public final void mo18994a(Object obj, long j, byte b) {
            if (C4759f7.f14127x) {
                C4759f7.m20162c(obj, j, b);
            } else {
                C4759f7.m20166d(obj, j, b);
            }
        }

        /* renamed from: a */
        public final void mo18997a(Object obj, long j, boolean z) {
            if (C4759f7.f14127x) {
                C4759f7.m20167d(obj, j, z);
            } else {
                C4759f7.m20171e(obj, j, z);
            }
        }

        /* renamed from: a */
        public final void mo18996a(Object obj, long j, float f) {
            mo19001a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public final void mo18995a(Object obj, long j, double d) {
            mo19002a(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.f7$d */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
    static abstract class C4763d {

        /* renamed from: a */
        Unsafe f14128a;

        C4763d(Unsafe unsafe) {
            this.f14128a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo18993a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo18994a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo18995a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo18996a(Object obj, long j, float f);

        /* renamed from: a */
        public final void mo19001a(Object obj, long j, int i) {
            this.f14128a.putInt(obj, j, i);
        }

        /* renamed from: a */
        public abstract void mo18997a(Object obj, long j, boolean z);

        /* renamed from: b */
        public abstract boolean mo18998b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo18999c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo19000d(Object obj, long j);

        /* renamed from: e */
        public final int mo19003e(Object obj, long j) {
            return this.f14128a.getInt(obj, j);
        }

        /* renamed from: f */
        public final long mo19004f(Object obj, long j) {
            return this.f14128a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo19002a(Object obj, long j, long j2) {
            this.f14128a.putLong(obj, j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00f2  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.measurement.f7> r6 = com.google.android.gms.internal.measurement.C4759f7.class
            java.lang.String r6 = r6.getName()
            java.util.logging.Logger r6 = java.util.logging.Logger.getLogger(r6)
            f14104a = r6
            sun.misc.Unsafe r6 = m20161c()
            f14105b = r6
            java.lang.Class r6 = com.google.android.gms.internal.measurement.C4955s2.m21101b()
            f14106c = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r6 = m20169d(r6)
            f14107d = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r6 = m20169d(r6)
            f14108e = r6
            sun.misc.Unsafe r6 = f14105b
            r7 = 0
            if (r6 != 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            boolean r6 = com.google.android.gms.internal.measurement.C4955s2.m21100a()
            if (r6 == 0) goto L_0x0058
            boolean r6 = f14107d
            if (r6 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.f7$c r7 = new com.google.android.gms.internal.measurement.f7$c
            sun.misc.Unsafe r6 = f14105b
            r7.<init>(r6)
            goto L_0x005f
        L_0x004c:
            boolean r6 = f14108e
            if (r6 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.f7$a r7 = new com.google.android.gms.internal.measurement.f7$a
            sun.misc.Unsafe r6 = f14105b
            r7.<init>(r6)
            goto L_0x005f
        L_0x0058:
            com.google.android.gms.internal.measurement.f7$b r7 = new com.google.android.gms.internal.measurement.f7$b
            sun.misc.Unsafe r6 = f14105b
            r7.<init>(r6)
        L_0x005f:
            f14109f = r7
            boolean r6 = m20172e()
            f14110g = r6
            boolean r6 = m20168d()
            f14111h = r6
            java.lang.Class<byte[]> r6 = byte[].class
            int r6 = m20155b(r6)
            long r6 = (long) r6
            f14112i = r6
            int r6 = m20155b(r5)
            long r6 = (long) r6
            f14113j = r6
            int r5 = m20160c(r5)
            long r5 = (long) r5
            f14114k = r5
            int r5 = m20155b(r4)
            long r5 = (long) r5
            f14115l = r5
            int r4 = m20160c(r4)
            long r4 = (long) r4
            f14116m = r4
            int r4 = m20155b(r3)
            long r4 = (long) r4
            f14117n = r4
            int r3 = m20160c(r3)
            long r3 = (long) r3
            f14118o = r3
            int r3 = m20155b(r2)
            long r3 = (long) r3
            f14119p = r3
            int r2 = m20160c(r2)
            long r2 = (long) r2
            f14120q = r2
            int r2 = m20155b(r1)
            long r2 = (long) r2
            f14121r = r2
            int r1 = m20160c(r1)
            long r1 = (long) r1
            f14122s = r1
            int r1 = m20155b(r0)
            long r1 = (long) r1
            f14123t = r1
            int r0 = m20160c(r0)
            long r0 = (long) r0
            f14124u = r0
            java.lang.reflect.Field r0 = m20174f()
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.internal.measurement.f7$d r1 = f14109f
            if (r1 != 0) goto L_0x00d5
            goto L_0x00dc
        L_0x00d5:
            sun.misc.Unsafe r1 = r1.f14128a
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00de
        L_0x00dc:
            r0 = -1
        L_0x00de:
            f14125v = r0
            long r0 = f14112i
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            f14126w = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f2
            r0 = 1
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            f14127x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4759f7.<clinit>():void");
    }

    private C4759f7() {
    }

    /* renamed from: a */
    static boolean m20154a() {
        return f14111h;
    }

    /* renamed from: b */
    static boolean m20159b() {
        return f14110g;
    }

    /* renamed from: c */
    private static int m20160c(Class<?> cls) {
        if (f14111h) {
            return f14109f.f14128a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: d */
    static float m20165d(Object obj, long j) {
        return f14109f.mo18999c(obj, j);
    }

    /* renamed from: e */
    static double m20170e(Object obj, long j) {
        return f14109f.mo19000d(obj, j);
    }

    /* renamed from: f */
    static Object m20173f(Object obj, long j) {
        return f14109f.f14128a.getObject(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m20179k(Object obj, long j) {
        return (byte) (m20143a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m20180l(Object obj, long j) {
        return (byte) (m20143a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m20181m(Object obj, long j) {
        return m20179k(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static boolean m20182n(Object obj, long j) {
        return m20180l(obj, j) != 0;
    }

    /* renamed from: a */
    static <T> T m20144a(Class<T> cls) {
        try {
            return f14105b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m20155b(Class<?> cls) {
        if (f14111h) {
            return f14109f.f14128a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: d */
    private static boolean m20168d() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f14105b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls2.getMethod("getInt", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putInt", new Class[]{cls, Long.TYPE, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putLong", new Class[]{cls, Long.TYPE, Long.TYPE});
            cls2.getMethod("getObject", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putObject", new Class[]{cls, Long.TYPE, cls});
            if (C4955s2.m21100a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putBoolean", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putFloat", new Class[]{cls, Long.TYPE, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, Long.TYPE});
            cls2.getMethod("putDouble", new Class[]{cls, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f14104a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m20172e() {
        String str = "copyMemory";
        String str2 = "getLong";
        Class<Object> cls = Object.class;
        Unsafe unsafe = f14105b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls2.getMethod(str2, new Class[]{cls, Long.TYPE});
            if (m20174f() == null) {
                return false;
            }
            if (C4955s2.m21100a()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{Long.TYPE});
            cls2.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{Long.TYPE});
            cls2.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls2.getMethod(str2, new Class[]{Long.TYPE});
            cls2.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls2.getMethod(str, new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f14104a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: c */
    static boolean m20164c(Object obj, long j) {
        return f14109f.mo18998b(obj, j);
    }

    /* renamed from: f */
    private static Field m20174f() {
        if (C4955s2.m21100a()) {
            Field a = m20145a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m20145a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    static int m20143a(Object obj, long j) {
        return f14109f.mo19003e(obj, j);
    }

    /* renamed from: b */
    static long m20156b(Object obj, long j) {
        return f14109f.mo19004f(obj, j);
    }

    /* renamed from: c */
    static Unsafe m20161c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4791h7());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    static void m20149a(Object obj, long j, int i) {
        f14109f.mo19001a(obj, j, i);
    }

    /* renamed from: a */
    static void m20150a(Object obj, long j, long j2) {
        f14109f.mo19002a(obj, j, j2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m20162c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m20149a(obj, j2, ((255 & b) << i) | (m20143a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* renamed from: a */
    static void m20152a(Object obj, long j, boolean z) {
        f14109f.mo18997a(obj, j, z);
    }

    /* renamed from: a */
    static void m20148a(Object obj, long j, float f) {
        f14109f.mo18996a(obj, j, f);
    }

    /* renamed from: a */
    static void m20147a(Object obj, long j, double d) {
        f14109f.mo18995a(obj, j, d);
    }

    /* renamed from: a */
    static void m20151a(Object obj, long j, Object obj2) {
        f14109f.f14128a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m20142a(byte[] bArr, long j) {
        return f14109f.mo18993a(bArr, f14112i + j);
    }

    /* renamed from: a */
    static void m20153a(byte[] bArr, long j, byte b) {
        f14109f.mo18994a((Object) bArr, f14112i + j, b);
    }

    /* renamed from: a */
    private static Field m20145a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m20171e(Object obj, long j, boolean z) {
        m20166d(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: d */
    private static boolean m20169d(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C4955s2.m21100a()) {
            return false;
        }
        try {
            Class<?> cls3 = f14106c;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m20166d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m20149a(obj, j2, ((255 & b) << i) | (m20143a(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m20167d(Object obj, long j, boolean z) {
        m20162c(obj, j, z ? (byte) 1 : 0);
    }
}
