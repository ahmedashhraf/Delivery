package androidx.core.p033k;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.io.PrintWriter;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.k.k */
/* compiled from: TimeUtils */
public final class C0946k {
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})

    /* renamed from: a */
    public static final int f4276a = 19;

    /* renamed from: b */
    private static final int f4277b = 60;

    /* renamed from: c */
    private static final int f4278c = 3600;

    /* renamed from: d */
    private static final int f4279d = 86400;

    /* renamed from: e */
    private static final Object f4280e = new Object();

    /* renamed from: f */
    private static char[] f4281f = new char[24];

    private C0946k() {
    }

    /* renamed from: a */
    private static int m5343a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    /* renamed from: a */
    private static int m5345a(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    /* renamed from: a */
    private static int m5344a(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        int i7 = i;
        if (f4281f.length < i7) {
            f4281f = new char[i7];
        }
        char[] cArr = f4281f;
        if (j2 == 0) {
            int i8 = i7 - 1;
            while (i8 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i9 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > f4279d) {
            i2 = floor / f4279d;
            floor -= f4279d * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i10 = floor / 60;
            i4 = floor - (i10 * 60);
            i5 = i10;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i7 != 0) {
            int a = m5343a(i2, 1, false, 0);
            int a2 = a + m5343a(i3, 1, a > 0, 2);
            int a3 = a2 + m5343a(i5, 1, a2 > 0, 2);
            int a4 = a3 + m5343a(i4, 1, a3 > 0, 2);
            i6 = 0;
            for (int a5 = a4 + m5343a(i9, 2, true, a4 > 0 ? 3 : 0) + 1; a5 < i7; a5++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i11 = i6 + 1;
        boolean z = i7 != 0;
        int i12 = i11;
        int a6 = m5345a(cArr, i2, 'd', i11, false, 0);
        int a7 = m5345a(cArr, i3, 'h', a6, a6 != i12, z ? 2 : 0);
        int a8 = m5345a(cArr, i5, 'm', a7, a7 != i12, z ? 2 : 0);
        int a9 = m5345a(cArr, i4, 's', a8, a8 != i12, z ? 2 : 0);
        int a10 = m5345a(cArr, i9, 'm', a9, true, (!z || a9 == i12) ? 0 : 3);
        cArr[a10] = 's';
        return a10 + 1;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m5349a(long j, StringBuilder sb) {
        synchronized (f4280e) {
            sb.append(f4281f, 0, m5344a(j, 0));
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m5348a(long j, PrintWriter printWriter, int i) {
        synchronized (f4280e) {
            printWriter.print(new String(f4281f, 0, m5344a(j, i)));
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m5347a(long j, PrintWriter printWriter) {
        m5348a(j, printWriter, 0);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public static void m5346a(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            m5348a(j - j2, printWriter, 0);
        }
    }
}
