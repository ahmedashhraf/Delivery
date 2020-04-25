package kotlin.p214b1.p216u;

import java.util.Arrays;
import java.util.List;
import kotlin.C6096e0;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.b1.u.h0 */
/* compiled from: Intrinsics */
public class C14445h0 {
    private C14445h0() {
    }

    /* renamed from: a */
    public static int m62444a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static int m62445a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* renamed from: a */
    public static String m62446a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m62464b() {
        throw ((AssertionError) m62447a((T) new AssertionError()));
    }

    /* renamed from: c */
    public static void m62469c(Object obj, String str) {
        if (obj == null) {
            m62479f(str);
        }
    }

    /* renamed from: d */
    public static void m62473d(String str) {
        throw ((IllegalArgumentException) m62447a((T) new IllegalArgumentException(str)));
    }

    /* renamed from: e */
    public static void m62474e() {
        throw ((KotlinNullPointerException) m62447a((T) new KotlinNullPointerException()));
    }

    /* renamed from: f */
    public static void m62479f(String str) {
        throw ((KotlinNullPointerException) m62447a((T) new KotlinNullPointerException(str)));
    }

    /* renamed from: g */
    public static void m62480g(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m62447a((T) new IllegalStateException(str)));
        }
    }

    /* renamed from: h */
    public static void m62482h(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: i */
    public static void m62483i(String str) {
        throw ((UninitializedPropertyAccessException) m62447a((T) new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: j */
    public static void m62484j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m62483i(sb.toString());
    }

    /* renamed from: a */
    public static void m62452a(Object obj) {
        if (obj == null) {
            m62474e();
        }
    }

    /* renamed from: b */
    public static void m62466b(Object obj, String str, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Method specified as non-null returned null: ");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            throw ((IllegalStateException) m62447a((T) new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: c */
    public static void m62470c(String str) {
        throw ((AssertionError) m62447a((T) new AssertionError(str)));
    }

    /* renamed from: d */
    public static void m62471d() {
        throw ((IllegalStateException) m62447a((T) new IllegalStateException()));
    }

    /* renamed from: e */
    public static void m62476e(String str) {
        throw ((IllegalStateException) m62447a((T) new IllegalStateException(str)));
    }

    /* renamed from: f */
    public static void m62478f(Object obj, String str) {
        if (obj == null) {
            m62481g(str);
        }
    }

    /* renamed from: g */
    private static void m62481g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        throw ((IllegalArgumentException) m62447a((T) new IllegalArgumentException(sb.toString())));
    }

    /* renamed from: a */
    public static void m62453a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) m62447a((T) new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: b */
    public static void m62465b(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m62447a((T) new IllegalStateException(str)));
        }
    }

    /* renamed from: c */
    public static void m62468c() {
        throw ((IllegalArgumentException) m62447a((T) new IllegalArgumentException()));
    }

    /* renamed from: d */
    public static void m62472d(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m62447a((T) new IllegalStateException(str)));
        }
    }

    /* renamed from: e */
    public static void m62475e(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalArgumentException) m62447a((T) new IllegalArgumentException(str)));
        }
    }

    /* renamed from: f */
    public static void m62477f() {
        m62482h("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: a */
    public static void m62454a(Object obj, String str, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field specified as non-null is null: ");
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            throw ((IllegalStateException) m62447a((T) new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: b */
    public static void m62467b(String str) {
        m62482h(str);
    }

    /* renamed from: a */
    public static boolean m62463a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static boolean m62460a(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static boolean m62459a(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static boolean m62457a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static boolean m62462a(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static boolean m62461a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static boolean m62458a(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    /* renamed from: a */
    public static void m62450a(int i, String str) {
        m62477f();
    }

    /* renamed from: a */
    public static void m62451a(int i, String str, String str2) {
        m62482h(str2);
    }

    /* renamed from: a */
    public static void m62449a() {
        m62477f();
    }

    /* renamed from: a */
    public static void m62455a(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Class ");
            sb.append(replace);
            sb.append(" is not found. Please update the Kotlin runtime to the latest version");
            throw ((ClassNotFoundException) m62447a((T) new ClassNotFoundException(sb.toString(), e)));
        }
    }

    /* renamed from: a */
    public static void m62456a(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Class ");
            sb.append(replace);
            sb.append(" is not found: this code requires the Kotlin runtime of version at least ");
            sb.append(str2);
            throw ((ClassNotFoundException) m62447a((T) new ClassNotFoundException(sb.toString(), e)));
        }
    }

    /* renamed from: a */
    private static <T extends Throwable> T m62447a(T t) {
        return m62448a(t, C14445h0.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m62448a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }
}
