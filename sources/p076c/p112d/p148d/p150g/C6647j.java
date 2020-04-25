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
import kotlin.p214b1.p216u.C14449i1;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
/* renamed from: c.d.d.g.j */
/* compiled from: Shorts */
public final class C6647j {

    /* renamed from: a */
    public static final int f18621a = 2;

    /* renamed from: b */
    public static final short f18622b = 16384;

    /* renamed from: c.d.d.g.j$a */
    /* compiled from: Shorts */
    private enum C6648a implements Comparator<short[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(short[] sArr, short[] sArr2) {
            int min = Math.min(sArr.length, sArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6647j.m31729a(sArr[i], sArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return sArr.length - sArr2.length;
        }
    }

    @C2776b
    /* renamed from: c.d.d.g.j$b */
    /* compiled from: Shorts */
    private static class C6649b extends AbstractList<Short> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18623N;

        /* renamed from: a */
        final short[] f18624a;

        /* renamed from: b */
        final int f18625b;

        C6649b(short[] sArr) {
            this(sArr, 0, sArr.length);
        }

        /* renamed from: a */
        public Short set(int i, Short sh) {
            C7397x.m35663a(i, size());
            short[] sArr = this.f18624a;
            int i2 = this.f18625b;
            short s = sArr[i2 + i];
            sArr[i2 + i] = ((Short) C7397x.m35664a(sh)).shortValue();
            return Short.valueOf(s);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Short) && C6647j.m31750c(this.f18624a, ((Short) obj).shortValue(), this.f18625b, this.f18623N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public short[] mo26700e() {
            int size = size();
            short[] sArr = new short[size];
            System.arraycopy(this.f18624a, this.f18625b, sArr, 0, size);
            return sArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6649b)) {
                return super.equals(obj);
            }
            C6649b bVar = (C6649b) obj;
            int size = size();
            if (bVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18624a[this.f18625b + i] != bVar.f18624a[bVar.f18625b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18625b; i2 < this.f18623N; i2++) {
                i = (i * 31) + C6647j.m31728a(this.f18624a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Short) {
                int a = C6647j.m31750c(this.f18624a, ((Short) obj).shortValue(), this.f18625b, this.f18623N);
                if (a >= 0) {
                    return a - this.f18625b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Short) {
                int b = C6647j.m31752d(this.f18624a, ((Short) obj).shortValue(), this.f18625b, this.f18623N);
                if (b >= 0) {
                    return b - this.f18625b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18623N - this.f18625b;
        }

        public List<Short> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            short[] sArr = this.f18624a;
            int i3 = this.f18625b;
            return new C6649b(sArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 6);
            sb.append('[');
            sb.append(this.f18624a[this.f18625b]);
            int i = this.f18625b;
            while (true) {
                i++;
                if (i < this.f18623N) {
                    sb.append(", ");
                    sb.append(this.f18624a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6649b(short[] sArr, int i, int i2) {
            this.f18624a = sArr;
            this.f18625b = i;
            this.f18623N = i2;
        }

        public Short get(int i) {
            C7397x.m35663a(i, size());
            return Short.valueOf(this.f18624a[this.f18625b + i]);
        }
    }

    /* renamed from: c.d.d.g.j$c */
    /* compiled from: Shorts */
    private static final class C6650c extends C7337g<String, Short> implements Serializable {

        /* renamed from: N */
        static final C6650c f18626N = new C6650c();
        private static final long serialVersionUID = 1;

        private C6650c() {
        }

        private Object readResolve() {
            return f18626N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo26637f(Short sh) {
            return sh.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Short mo26638g(String str) {
            return Short.decode(str);
        }

        public String toString() {
            return "Shorts.stringConverter()";
        }
    }

    private C6647j() {
    }

    /* renamed from: a */
    public static int m31728a(short s) {
        return s;
    }

    /* renamed from: a */
    public static int m31729a(short s, short s2) {
        return s - s2;
    }

    @C2777c("doesn't work")
    /* renamed from: a */
    public static short m31735a(byte b, byte b2) {
        return (short) ((b << 8) | (b2 & 255));
    }

    /* renamed from: b */
    public static short m31746b(long j) {
        return j > 32767 ? C14449i1.f42576b : j < -32768 ? C14449i1.f42575a : (short) ((int) j);
    }

    @C2777c("doesn't work")
    /* renamed from: b */
    public static byte[] m31748b(short s) {
        return new byte[]{(byte) (s >> 8), (byte) s};
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31750c(short[] sArr, short s, int i, int i2) {
        while (i < i2) {
            if (sArr[i] == s) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31752d(short[] sArr, short s, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (sArr[i3] == s) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static short m31736a(long j) {
        short s = (short) ((int) j);
        if (((long) s) == j) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Out of range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m31743b(short[] sArr, short s) {
        return m31750c(sArr, s, 0, sArr.length);
    }

    /* renamed from: c */
    public static int m31749c(short[] sArr, short s) {
        return m31752d(sArr, s, 0, sArr.length);
    }

    /* renamed from: a */
    public static boolean m31738a(short[] sArr, short s) {
        for (short s2 : sArr) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static short m31747b(short... sArr) {
        C7397x.m35670a(sArr.length > 0);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            if (sArr[i] > s) {
                s = sArr[i];
            }
        }
        return s;
    }

    /* renamed from: c */
    public static short m31751c(short... sArr) {
        C7397x.m35670a(sArr.length > 0);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            if (sArr[i] < s) {
                s = sArr[i];
            }
        }
        return s;
    }

    /* renamed from: a */
    public static int m31731a(short[] sArr, short[] sArr2) {
        C7397x.m35665a(sArr, (Object) "array");
        C7397x.m35665a(sArr2, (Object) "target");
        if (sArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (sArr.length - sArr2.length) + 1) {
            int i2 = 0;
            while (i2 < sArr2.length) {
                if (sArr[i + i2] != sArr2[i2]) {
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
    public static C7337g<String, Short> m31745b() {
        return C6650c.f18626N;
    }

    /* renamed from: a */
    public static short[] m31742a(short[]... sArr) {
        int i = 0;
        for (short[] length : sArr) {
            i += length.length;
        }
        short[] sArr2 = new short[i];
        int i2 = 0;
        for (short[] sArr3 : sArr) {
            System.arraycopy(sArr3, 0, sArr2, i2, sArr3.length);
            i2 += sArr3.length;
        }
        return sArr2;
    }

    @C2777c("doesn't work")
    /* renamed from: a */
    public static short m31737a(byte[] bArr) {
        C7397x.m35672a(bArr.length >= 2, "array too small: %s < %s", Integer.valueOf(bArr.length), Integer.valueOf(2));
        return m31735a(bArr[0], bArr[1]);
    }

    /* renamed from: a */
    public static short[] m31741a(short[] sArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return sArr.length < i ? m31740a(sArr, i + i2) : sArr;
    }

    /* renamed from: a */
    private static short[] m31740a(short[] sArr, int i) {
        short[] sArr2 = new short[i];
        System.arraycopy(sArr, 0, sArr2, 0, Math.min(sArr.length, i));
        return sArr2;
    }

    /* renamed from: a */
    public static String m31732a(String str, short... sArr) {
        C7397x.m35664a(str);
        if (sArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(sArr.length * 6);
        sb.append(sArr[0]);
        for (int i = 1; i < sArr.length; i++) {
            sb.append(str);
            sb.append(sArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<short[]> m31733a() {
        return C6648a.INSTANCE;
    }

    /* renamed from: a */
    public static short[] m31739a(Collection<? extends Number> collection) {
        if (collection instanceof C6649b) {
            return ((C6649b) collection).mo26700e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        short[] sArr = new short[length];
        for (int i = 0; i < length; i++) {
            sArr[i] = ((Number) C7397x.m35664a(array[i])).shortValue();
        }
        return sArr;
    }

    /* renamed from: a */
    public static List<Short> m31734a(short... sArr) {
        if (sArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6649b(sArr);
    }
}
