package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import sun.misc.Unsafe;

/* renamed from: c.d.d.g.l */
/* compiled from: UnsignedBytes */
public final class C6653l {

    /* renamed from: a */
    public static final byte f18628a = Byte.MIN_VALUE;

    /* renamed from: b */
    public static final byte f18629b = -1;

    /* renamed from: c */
    private static final int f18630c = 255;

    @C2778d
    /* renamed from: c.d.d.g.l$a */
    /* compiled from: UnsignedBytes */
    static class C6654a {

        /* renamed from: a */
        static final String f18631a;

        /* renamed from: b */
        static final Comparator<byte[]> f18632b = m31781a();

        /* renamed from: c.d.d.g.l$a$a */
        /* compiled from: UnsignedBytes */
        enum C6655a implements Comparator<byte[]> {
            INSTANCE;

            /* renamed from: a */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i = 0; i < min; i++) {
                    int a = C6653l.m31773a(bArr[i], bArr2[i]);
                    if (a != 0) {
                        return a;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        @C2778d
        /* renamed from: c.d.d.g.l$a$b */
        /* compiled from: UnsignedBytes */
        enum C6656b implements Comparator<byte[]> {
            INSTANCE;
            
            static final boolean BIG_ENDIAN = false;
            static final int BYTE_ARRAY_BASE_OFFSET = 0;
            static final Unsafe theUnsafe = null;

            /* renamed from: c.d.d.g.l$a$b$a */
            /* compiled from: UnsignedBytes */
            static class C6657a implements PrivilegedExceptionAction<Unsafe> {
                C6657a() {
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

            static {
                Class<byte[]> cls;
                BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
                theUnsafe = m31783d();
                BYTE_ARRAY_BASE_OFFSET = theUnsafe.arrayBaseOffset(cls);
                if (theUnsafe.arrayIndexScale(cls) != 1) {
                    throw new AssertionError();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
                return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new p076c.p112d.p148d.p150g.C6653l.C6654a.C6656b.C6657a());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
                throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
            /* renamed from: d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static sun.misc.Unsafe m31783d() {
                /*
                    sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
                    return r0
                L_0x0005:
                    c.d.d.g.l$a$b$a r0 = new c.d.d.g.l$a$b$a     // Catch:{ PrivilegedActionException -> 0x0011 }
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
                throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p148d.p150g.C6653l.C6654a.C6656b.m31783d():sun.misc.Unsafe");
            }

            /* renamed from: a */
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i = min / 8;
                int i2 = 0;
                while (true) {
                    int i3 = i * 8;
                    if (i2 < i3) {
                        long j = (long) i2;
                        long j2 = theUnsafe.getLong(bArr, ((long) BYTE_ARRAY_BASE_OFFSET) + j);
                        long j3 = theUnsafe.getLong(bArr2, ((long) BYTE_ARRAY_BASE_OFFSET) + j);
                        if (j2 == j3) {
                            i2 += 8;
                        } else if (BIG_ENDIAN) {
                            return C6660p.m31800a(j2, j3);
                        } else {
                            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j2 ^ j3) & -8;
                            return (int) (((j2 >>> numberOfTrailingZeros) & 255) - ((j3 >>> numberOfTrailingZeros) & 255));
                        }
                    } else {
                        while (i3 < min) {
                            int a = C6653l.m31773a(bArr[i3], bArr2[i3]);
                            if (a != 0) {
                                return a;
                            }
                            i3++;
                        }
                        return bArr.length - bArr2.length;
                    }
                }
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(C6654a.class.getName());
            sb.append("$UnsafeComparator");
            f18631a = sb.toString();
        }

        C6654a() {
        }

        /* renamed from: a */
        static Comparator<byte[]> m31781a() {
            try {
                return (Comparator) Class.forName(f18631a).getEnumConstants()[0];
            } catch (Throwable unused) {
                return C6653l.m31780b();
            }
        }
    }

    private C6653l() {
    }

    /* renamed from: a */
    public static byte m31768a(long j) {
        if ((j >> 8) == 0) {
            return (byte) ((int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Out of range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static int m31772a(byte b) {
        return b & 255;
    }

    /* renamed from: b */
    public static byte m31777b(long j) {
        if (j > ((long) m31772a(-1))) {
            return -1;
        }
        if (j < 0) {
            return 0;
        }
        return (byte) ((int) j);
    }

    /* renamed from: a */
    public static int m31773a(byte b, byte b2) {
        return m31772a(b) - m31772a(b2);
    }

    /* renamed from: b */
    public static byte m31778b(byte... bArr) {
        C7397x.m35670a(bArr.length > 0);
        int a = m31772a(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            int a2 = m31772a(bArr[i]);
            if (a2 < a) {
                a = a2;
            }
        }
        return (byte) a;
    }

    /* renamed from: a */
    public static byte m31771a(byte... bArr) {
        C7397x.m35670a(bArr.length > 0);
        int a = m31772a(bArr[0]);
        for (int i = 1; i < bArr.length; i++) {
            int a2 = m31772a(bArr[i]);
            if (a2 > a) {
                a = a2;
            }
        }
        return (byte) a;
    }

    @C2775a
    /* renamed from: b */
    public static String m31779b(byte b) {
        return m31774a(b, 10);
    }

    @C2775a
    /* renamed from: a */
    public static String m31774a(byte b, int i) {
        C7397x.m35672a(i >= 2 && i <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", Integer.valueOf(i));
        return Integer.toString(m31772a(b), i);
    }

    @C2778d
    /* renamed from: b */
    static Comparator<byte[]> m31780b() {
        return C6655a.INSTANCE;
    }

    @C2775a
    /* renamed from: a */
    public static byte m31769a(String str) {
        return m31770a(str, 10);
    }

    @C2775a
    /* renamed from: a */
    public static byte m31770a(String str, int i) {
        int parseInt = Integer.parseInt((String) C7397x.m35664a(str), i);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("out of range: ");
        sb.append(parseInt);
        throw new NumberFormatException(sb.toString());
    }

    /* renamed from: a */
    public static String m31775a(String str, byte... bArr) {
        C7397x.m35664a(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * (str.length() + 3));
        sb.append(m31772a(bArr[0]));
        for (int i = 1; i < bArr.length; i++) {
            sb.append(str);
            sb.append(m31779b(bArr[i]));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<byte[]> m31776a() {
        return C6654a.f18632b;
    }
}
