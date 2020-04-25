package p076c.p112d.p148d.p150g;

import com.google.common.base.C7337g;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: c.d.d.g.g */
/* compiled from: Longs */
public final class C6641g {

    /* renamed from: a */
    public static final int f18611a = 8;

    /* renamed from: b */
    public static final long f18612b = 4611686018427387904L;

    /* renamed from: c.d.d.g.g$a */
    /* compiled from: Longs */
    private enum C6642a implements Comparator<long[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6641g.m31691a(jArr[i], jArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    @C2776b
    /* renamed from: c.d.d.g.g$b */
    /* compiled from: Longs */
    private static class C6643b extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18613N;

        /* renamed from: a */
        final long[] f18614a;

        /* renamed from: b */
        final int f18615b;

        C6643b(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        /* renamed from: a */
        public Long set(int i, Long l) {
            C7397x.m35663a(i, size());
            long[] jArr = this.f18614a;
            int i2 = this.f18615b;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) C7397x.m35664a(l)).longValue();
            return Long.valueOf(j);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Long) && C6641g.m31711c(this.f18614a, ((Long) obj).longValue(), this.f18615b, this.f18613N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public long[] mo26682e() {
            int size = size();
            long[] jArr = new long[size];
            System.arraycopy(this.f18614a, this.f18615b, jArr, 0, size);
            return jArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6643b)) {
                return super.equals(obj);
            }
            C6643b bVar = (C6643b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18614a[this.f18615b + i] != bVar.f18614a[bVar.f18615b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18615b; i2 < this.f18613N; i2++) {
                i = (i * 31) + C6641g.m31690a(this.f18614a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                int a = C6641g.m31711c(this.f18614a, ((Long) obj).longValue(), this.f18615b, this.f18613N);
                if (a >= 0) {
                    return a - this.f18615b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                int b = C6641g.m31713d(this.f18614a, ((Long) obj).longValue(), this.f18615b, this.f18613N);
                if (b >= 0) {
                    return b - this.f18615b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18613N - this.f18615b;
        }

        public List<Long> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.f18614a;
            int i3 = this.f18615b;
            return new C6643b(jArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 10);
            sb.append('[');
            sb.append(this.f18614a[this.f18615b]);
            int i = this.f18615b;
            while (true) {
                i++;
                if (i < this.f18613N) {
                    sb.append(", ");
                    sb.append(this.f18614a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6643b(long[] jArr, int i, int i2) {
            this.f18614a = jArr;
            this.f18615b = i;
            this.f18613N = i2;
        }

        public Long get(int i) {
            C7397x.m35663a(i, size());
            return Long.valueOf(this.f18614a[this.f18615b + i]);
        }
    }

    /* renamed from: c.d.d.g.g$c */
    /* compiled from: Longs */
    private static final class C6644c extends C7337g<String, Long> implements Serializable {

        /* renamed from: N */
        static final C6644c f18616N = new C6644c();
        private static final long serialVersionUID = 1;

        private C6644c() {
        }

        private Object readResolve() {
            return f18616N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo26637f(Long l) {
            return l.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Long mo26638g(String str) {
            return Long.decode(str);
        }

        public String toString() {
            return "Longs.stringConverter()";
        }
    }

    private C6641g() {
    }

    /* renamed from: a */
    public static int m31690a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m31691a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* renamed from: a */
    public static long m31694a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8) {
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) b8) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31711c(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31713d(long[] jArr, long j, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m31700a(long[] jArr, long j) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (jArr[i] == j) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m31705b(long[] jArr, long j) {
        return m31711c(jArr, j, 0, jArr.length);
    }

    /* renamed from: c */
    public static int m31710c(long[] jArr, long j) {
        return m31713d(jArr, j, 0, jArr.length);
    }

    /* renamed from: a */
    public static int m31693a(long[] jArr, long[] jArr2) {
        C7397x.m35665a(jArr, (Object) "array");
        C7397x.m35665a(jArr2, (Object) "target");
        if (jArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (jArr.length - jArr2.length) + 1) {
            int i2 = 0;
            while (i2 < jArr2.length) {
                if (jArr[i + i2] != jArr2[i2]) {
                    i++;
                } else {
                    i2++;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public static long m31707b(long... jArr) {
        C7397x.m35670a(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }

    /* renamed from: c */
    public static long m31712c(long... jArr) {
        C7397x.m35670a(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] < j) {
                j = jArr[i];
            }
        }
        return j;
    }

    /* renamed from: b */
    public static byte[] m31709b(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) ((int) (255 & j));
            j >>= 8;
        }
        return bArr;
    }

    /* renamed from: a */
    public static long[] m31704a(long[]... jArr) {
        int i = 0;
        for (long[] length : jArr) {
            i += length.length;
        }
        long[] jArr2 = new long[i];
        int i2 = 0;
        for (long[] jArr3 : jArr) {
            System.arraycopy(jArr3, 0, jArr2, i2, jArr3.length);
            i2 += jArr3.length;
        }
        return jArr2;
    }

    @C2775a
    /* renamed from: b */
    public static C7337g<String, Long> m31708b() {
        return C6644c.f18616N;
    }

    /* renamed from: a */
    public static long m31695a(byte[] bArr) {
        C7397x.m35672a(bArr.length >= 8, "array too small: %s < %s", Integer.valueOf(bArr.length), Integer.valueOf(8));
        return m31694a(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    @C2775a
    /* renamed from: a */
    public static Long m31696a(String str) {
        if (((String) C7397x.m35664a(str)).length() == 0) {
            return null;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            i = 1;
        }
        if (i == str.length()) {
            return null;
        }
        int i2 = i + 1;
        int charAt = str.charAt(i) - '0';
        if (charAt < 0 || charAt > 9) {
            return null;
        }
        long j = (long) (-charAt);
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            int charAt2 = str.charAt(i2) - '0';
            if (charAt2 < 0 || charAt2 > 9 || j < -922337203685477580L) {
                return null;
            }
            long j2 = j * 10;
            long j3 = (long) charAt2;
            if (j2 < Long.MIN_VALUE + j3) {
                return null;
            }
            j = j2 - j3;
            i2 = i3;
        }
        if (i != 0) {
            return Long.valueOf(j);
        }
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j);
    }

    /* renamed from: a */
    public static long[] m31703a(long[] jArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return jArr.length < i ? m31702a(jArr, i + i2) : jArr;
    }

    /* renamed from: a */
    private static long[] m31702a(long[] jArr, int i) {
        long[] jArr2 = new long[i];
        System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, i));
        return jArr2;
    }

    /* renamed from: a */
    public static String m31697a(String str, long... jArr) {
        C7397x.m35664a(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 10);
        sb.append(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            sb.append(str);
            sb.append(jArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<long[]> m31698a() {
        return C6642a.INSTANCE;
    }

    /* renamed from: a */
    public static long[] m31701a(Collection<? extends Number> collection) {
        if (collection instanceof C6643b) {
            return ((C6643b) collection).mo26682e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) C7397x.m35664a(array[i])).longValue();
        }
        return jArr;
    }

    /* renamed from: a */
    public static List<Long> m31699a(long... jArr) {
        if (jArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6643b(jArr);
    }
}
