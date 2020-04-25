package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
/* renamed from: c.d.d.g.c */
/* compiled from: Chars */
public final class C6626c {

    /* renamed from: a */
    public static final int f18589a = 2;

    @C2776b
    /* renamed from: c.d.d.g.c$a */
    /* compiled from: Chars */
    private static class C6627a extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18590N;

        /* renamed from: a */
        final char[] f18591a;

        /* renamed from: b */
        final int f18592b;

        C6627a(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        /* renamed from: a */
        public Character set(int i, Character ch) {
            C7397x.m35663a(i, size());
            char[] cArr = this.f18591a;
            int i2 = this.f18592b;
            char c = cArr[i2 + i];
            cArr[i2 + i] = ((Character) C7397x.m35664a(ch)).charValue();
            return Character.valueOf(c);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Character) && C6626c.m31591c(this.f18591a, ((Character) obj).charValue(), this.f18592b, this.f18590N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public char[] mo26609e() {
            int size = size();
            char[] cArr = new char[size];
            System.arraycopy(this.f18591a, this.f18592b, cArr, 0, size);
            return cArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6627a)) {
                return super.equals(obj);
            }
            C6627a aVar = (C6627a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18591a[this.f18592b + i] != aVar.f18591a[aVar.f18592b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18592b; i2 < this.f18590N; i2++) {
                i = (i * 31) + C6626c.m31572a(this.f18591a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                int a = C6626c.m31591c(this.f18591a, ((Character) obj).charValue(), this.f18592b, this.f18590N);
                if (a >= 0) {
                    return a - this.f18592b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                int b = C6626c.m31592d(this.f18591a, ((Character) obj).charValue(), this.f18592b, this.f18590N);
                if (b >= 0) {
                    return b - this.f18592b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18590N - this.f18592b;
        }

        public List<Character> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            char[] cArr = this.f18591a;
            int i3 = this.f18592b;
            return new C6627a(cArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
            sb.append('[');
            sb.append(this.f18591a[this.f18592b]);
            int i = this.f18592b;
            while (true) {
                i++;
                if (i < this.f18590N) {
                    sb.append(", ");
                    sb.append(this.f18591a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6627a(char[] cArr, int i, int i2) {
            this.f18591a = cArr;
            this.f18592b = i;
            this.f18590N = i2;
        }

        public Character get(int i) {
            C7397x.m35663a(i, size());
            return Character.valueOf(this.f18591a[this.f18592b + i]);
        }
    }

    /* renamed from: c.d.d.g.c$b */
    /* compiled from: Chars */
    private enum C6628b implements Comparator<char[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6626c.m31573a(cArr[i], cArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    private C6626c() {
    }

    @C2777c("doesn't work")
    /* renamed from: a */
    public static char m31569a(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    /* renamed from: a */
    public static int m31572a(char c) {
        return c;
    }

    /* renamed from: a */
    public static int m31573a(char c, char c2) {
        return c - c2;
    }

    /* renamed from: b */
    public static char m31584b(long j) {
        if (j > 65535) {
            return 65535;
        }
        if (j < 0) {
            return 0;
        }
        return (char) ((int) j);
    }

    @C2777c("doesn't work")
    /* renamed from: b */
    public static byte[] m31588b(char c) {
        return new byte[]{(byte) (c >> 8), (byte) c};
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31591c(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31592d(char[] cArr, char c, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static char m31570a(long j) {
        char c = (char) ((int) j);
        if (((long) c) == j) {
            return c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Out of range: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static int m31586b(char[] cArr, char c) {
        return m31591c(cArr, c, 0, cArr.length);
    }

    /* renamed from: c */
    public static int m31590c(char[] cArr, char c) {
        return m31592d(cArr, c, 0, cArr.length);
    }

    /* renamed from: a */
    public static boolean m31579a(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static char m31585b(char... cArr) {
        C7397x.m35670a(cArr.length > 0);
        char c = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            if (cArr[i] > c) {
                c = cArr[i];
            }
        }
        return c;
    }

    /* renamed from: c */
    public static char m31589c(char... cArr) {
        C7397x.m35670a(cArr.length > 0);
        char c = cArr[0];
        for (int i = 1; i < cArr.length; i++) {
            if (cArr[i] < c) {
                c = cArr[i];
            }
        }
        return c;
    }

    /* renamed from: a */
    public static int m31575a(char[] cArr, char[] cArr2) {
        C7397x.m35665a(cArr, (Object) "array");
        C7397x.m35665a(cArr2, (Object) "target");
        if (cArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (cArr.length - cArr2.length) + 1) {
            int i2 = 0;
            while (i2 < cArr2.length) {
                if (cArr[i + i2] != cArr2[i2]) {
                    i++;
                } else {
                    i2++;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: a */
    public static char[] m31583a(char[]... cArr) {
        int i = 0;
        for (char[] length : cArr) {
            i += length.length;
        }
        char[] cArr2 = new char[i];
        int i2 = 0;
        for (char[] cArr3 : cArr) {
            System.arraycopy(cArr3, 0, cArr2, i2, cArr3.length);
            i2 += cArr3.length;
        }
        return cArr2;
    }

    @C2777c("doesn't work")
    /* renamed from: a */
    public static char m31571a(byte[] bArr) {
        C7397x.m35672a(bArr.length >= 2, "array too small: %s < %s", Integer.valueOf(bArr.length), Integer.valueOf(2));
        return m31569a(bArr[0], bArr[1]);
    }

    /* renamed from: a */
    public static char[] m31582a(char[] cArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return cArr.length < i ? m31581a(cArr, i + i2) : cArr;
    }

    /* renamed from: a */
    private static char[] m31581a(char[] cArr, int i) {
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, Math.min(cArr.length, i));
        return cArr2;
    }

    /* renamed from: a */
    public static String m31576a(String str, char... cArr) {
        C7397x.m35664a(str);
        int length = cArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((str.length() * (length - 1)) + length);
        sb.append(cArr[0]);
        for (int i = 1; i < length; i++) {
            sb.append(str);
            sb.append(cArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<char[]> m31577a() {
        return C6628b.INSTANCE;
    }

    /* renamed from: a */
    public static char[] m31580a(Collection<Character> collection) {
        if (collection instanceof C6627a) {
            return ((C6627a) collection).mo26609e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = ((Character) C7397x.m35664a(array[i])).charValue();
        }
        return cArr;
    }

    /* renamed from: a */
    public static List<Character> m31578a(char... cArr) {
        if (cArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6627a(cArr);
    }
}
