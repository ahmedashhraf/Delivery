package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
@C2775a
/* renamed from: c.d.d.g.n */
/* compiled from: UnsignedInts */
public final class C6658n {

    /* renamed from: a */
    static final long f18633a = 4294967295L;

    /* renamed from: c.d.d.g.n$a */
    /* compiled from: UnsignedInts */
    enum C6659a implements Comparator<int[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                if (iArr[i] != iArr2[i]) {
                    return C6658n.m31786a(iArr[i], iArr2[i]);
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    private C6658n() {
    }

    /* renamed from: a */
    static int m31785a(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static int m31786a(int i, int i2) {
        return C6637f.m31658a(m31785a(i), m31785a(i2));
    }

    /* renamed from: b */
    public static int m31794b(int... iArr) {
        C7397x.m35670a(iArr.length > 0);
        int a = m31785a(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int a2 = m31785a(iArr[i]);
            if (a2 < a) {
                a = a2;
            }
        }
        return m31785a(a);
    }

    /* renamed from: b */
    public static long m31795b(int i) {
        return ((long) i) & f18633a;
    }

    /* renamed from: c */
    public static int m31796c(int i, int i2) {
        return (int) (m31795b(i) % m31795b(i2));
    }

    /* renamed from: d */
    public static String m31798d(int i, int i2) {
        return Long.toString(((long) i) & f18633a, i2);
    }

    /* renamed from: a */
    public static int m31789a(int... iArr) {
        C7397x.m35670a(iArr.length > 0);
        int a = m31785a(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int a2 = m31785a(iArr[i]);
            if (a2 > a) {
                a = a2;
            }
        }
        return m31785a(a);
    }

    /* renamed from: c */
    public static String m31797c(int i) {
        return m31798d(i, 10);
    }

    /* renamed from: b */
    public static int m31792b(int i, int i2) {
        return (int) (m31795b(i) / m31795b(i2));
    }

    /* renamed from: a */
    public static String m31790a(String str, int... iArr) {
        C7397x.m35664a(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(m31797c(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            sb.append(str);
            sb.append(m31797c(iArr[i]));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static int m31793b(String str) {
        return m31788a(str, 10);
    }

    /* renamed from: a */
    public static Comparator<int[]> m31791a() {
        return C6659a.INSTANCE;
    }

    /* renamed from: a */
    public static int m31787a(String str) {
        C6645h a = C6645h.m31721a(str);
        try {
            return m31788a(a.f18617a, a.f18618b);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing value: ");
            sb.append(str);
            NumberFormatException numberFormatException = new NumberFormatException(sb.toString());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    /* renamed from: a */
    public static int m31788a(String str, int i) {
        C7397x.m35664a(str);
        long parseLong = Long.parseLong(str, i);
        if ((f18633a & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }
}
