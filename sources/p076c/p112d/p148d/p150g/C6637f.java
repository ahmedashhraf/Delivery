package p076c.p112d.p148d.p150g;

import com.google.common.base.C5785c;
import com.google.common.base.C7337g;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5942a;

@C2776b(emulated = true)
/* renamed from: c.d.d.g.f */
/* compiled from: Ints */
public final class C6637f {

    /* renamed from: a */
    public static final int f18604a = 4;

    /* renamed from: b */
    public static final int f18605b = 1073741824;

    /* renamed from: c */
    private static final byte[] f18606c = new byte[128];

    @C2776b
    /* renamed from: c.d.d.g.f$a */
    /* compiled from: Ints */
    private static class C6638a extends AbstractList<Integer> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18607N;

        /* renamed from: a */
        final int[] f18608a;

        /* renamed from: b */
        final int f18609b;

        C6638a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        /* renamed from: a */
        public Integer set(int i, Integer num) {
            C7397x.m35663a(i, size());
            int[] iArr = this.f18608a;
            int i2 = this.f18609b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C7397x.m35664a(num)).intValue();
            return Integer.valueOf(i3);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C6637f.m31680c(this.f18608a, ((Integer) obj).intValue(), this.f18609b, this.f18607N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int[] mo26662e() {
            int size = size();
            int[] iArr = new int[size];
            System.arraycopy(this.f18608a, this.f18609b, iArr, 0, size);
            return iArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6638a)) {
                return super.equals(obj);
            }
            C6638a aVar = (C6638a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18608a[this.f18609b + i] != aVar.f18608a[aVar.f18609b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18609b; i2 < this.f18607N; i2++) {
                i = (i * 31) + C6637f.m31657a(this.f18608a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int a = C6637f.m31680c(this.f18608a, ((Integer) obj).intValue(), this.f18609b, this.f18607N);
                if (a >= 0) {
                    return a - this.f18609b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int b = C6637f.m31682d(this.f18608a, ((Integer) obj).intValue(), this.f18609b, this.f18607N);
                if (b >= 0) {
                    return b - this.f18609b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18607N - this.f18609b;
        }

        public List<Integer> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f18608a;
            int i3 = this.f18609b;
            return new C6638a(iArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f18608a[this.f18609b]);
            int i = this.f18609b;
            while (true) {
                i++;
                if (i < this.f18607N) {
                    sb.append(", ");
                    sb.append(this.f18608a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6638a(int[] iArr, int i, int i2) {
            this.f18608a = iArr;
            this.f18609b = i;
            this.f18607N = i2;
        }

        public Integer get(int i) {
            C7397x.m35663a(i, size());
            return Integer.valueOf(this.f18608a[this.f18609b + i]);
        }
    }

    /* renamed from: c.d.d.g.f$b */
    /* compiled from: Ints */
    private static final class C6639b extends C7337g<String, Integer> implements Serializable {

        /* renamed from: N */
        static final C6639b f18610N = new C6639b();
        private static final long serialVersionUID = 1;

        private C6639b() {
        }

        private Object readResolve() {
            return f18610N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo26637f(Integer num) {
            return num.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Integer mo26638g(String str) {
            return Integer.decode(str);
        }

        public String toString() {
            return "Ints.stringConverter()";
        }
    }

    /* renamed from: c.d.d.g.f$c */
    /* compiled from: Ints */
    private enum C6640c implements Comparator<int[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6637f.m31658a(iArr[i], iArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return iArr.length - iArr2.length;
        }
    }

    static {
        Arrays.fill(f18606c, -1);
        for (int i = 0; i <= 9; i++) {
            f18606c[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 <= 26; i2++) {
            byte[] bArr = f18606c;
            byte b = (byte) (i2 + 10);
            bArr[i2 + 65] = b;
            bArr[i2 + 97] = b;
        }
    }

    private C6637f() {
    }

    @C2777c("doesn't work")
    /* renamed from: a */
    public static int m31655a(byte b, byte b2, byte b3, byte b4) {
        return (b << C5785c.f16669B) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* renamed from: a */
    public static int m31657a(int i) {
        return i;
    }

    /* renamed from: a */
    public static int m31658a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m31672b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    @C2777c("doesn't work")
    /* renamed from: b */
    public static byte[] m31676b(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* renamed from: c */
    public static int m31679c(int[] iArr, int i) {
        return m31680c(iArr, i, 0, iArr.length);
    }

    /* renamed from: d */
    public static int m31681d(int[] iArr, int i) {
        return m31682d(iArr, i, 0, iArr.length);
    }

    /* renamed from: a */
    public static int m31659a(long j) {
        int i = (int) j;
        if (((long) i) == j) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Out of range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m31673b(int... iArr) {
        C7397x.m35670a(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31680c(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31682d(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m31668a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m31678c(int... iArr) {
        C7397x.m35670a(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] < i) {
                i = iArr[i2];
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m31662a(int[] iArr, int[] iArr2) {
        C7397x.m35665a(iArr, (Object) "array");
        C7397x.m35665a(iArr2, (Object) "target");
        if (iArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (iArr.length - iArr2.length) + 1) {
            int i2 = 0;
            while (i2 < iArr2.length) {
                if (iArr[i + i2] != iArr2[i2]) {
                    i++;
                } else {
                    i2++;
                }
            }
            return i;
        }
        return -1;
    }

    @C2775a
    /* renamed from: b */
    public static C7337g<String, Integer> m31675b() {
        return C6639b.f18610N;
    }

    /* renamed from: b */
    private static int[] m31677b(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, Math.min(iArr.length, i));
        return iArr2;
    }

    /* renamed from: a */
    public static int[] m31671a(int[]... iArr) {
        int i = 0;
        for (int[] length : iArr) {
            i += length.length;
        }
        int[] iArr2 = new int[i];
        int i2 = 0;
        for (int[] iArr3 : iArr) {
            System.arraycopy(iArr3, 0, iArr2, i2, iArr3.length);
            i2 += iArr3.length;
        }
        return iArr2;
    }

    @C2777c("doesn't work")
    /* renamed from: a */
    public static int m31660a(byte[] bArr) {
        C7397x.m35672a(bArr.length >= 4, "array too small: %s < %s", Integer.valueOf(bArr.length), Integer.valueOf(4));
        return m31655a(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    /* renamed from: a */
    public static int[] m31670a(int[] iArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return iArr.length < i ? m31677b(iArr, i + i2) : iArr;
    }

    /* renamed from: a */
    public static String m31665a(String str, int... iArr) {
        C7397x.m35664a(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            sb.append(str);
            sb.append(iArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<int[]> m31666a() {
        return C6640c.INSTANCE;
    }

    /* renamed from: a */
    public static int[] m31669a(Collection<? extends Number> collection) {
        if (collection instanceof C6638a) {
            return ((C6638a) collection).mo26662e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C7397x.m35664a(array[i])).intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static List<Integer> m31667a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6638a(iArr);
    }

    /* renamed from: a */
    private static int m31656a(char c) {
        if (c < 128) {
            return f18606c[c];
        }
        return -1;
    }

    @C2777c("TODO")
    @C2775a
    @C5942a
    /* renamed from: a */
    public static Integer m31663a(String str) {
        return m31664a(str, 10);
    }

    @C2777c("TODO")
    @C5942a
    /* renamed from: a */
    static Integer m31664a(String str, int i) {
        if (((String) C7397x.m35664a(str)).length() == 0) {
            return null;
        }
        if (i < 2 || i > 36) {
            StringBuilder sb = new StringBuilder();
            sb.append("radix must be between MIN_RADIX and MAX_RADIX but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        int i2 = 0;
        if (str.charAt(0) == '-') {
            i2 = 1;
        }
        if (i2 == str.length()) {
            return null;
        }
        int i3 = i2 + 1;
        int a = m31656a(str.charAt(i2));
        if (a < 0 || a >= i) {
            return null;
        }
        int i4 = -a;
        int i5 = Integer.MIN_VALUE / i;
        while (i3 < str.length()) {
            int i6 = i3 + 1;
            int a2 = m31656a(str.charAt(i3));
            if (a2 < 0 || a2 >= i || i4 < i5) {
                return null;
            }
            int i7 = i4 * i;
            if (i7 < a2 - 2147483648) {
                return null;
            }
            i4 = i7 - a2;
            i3 = i6;
        }
        if (i2 != 0) {
            return Integer.valueOf(i4);
        }
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(-i4);
    }
}
