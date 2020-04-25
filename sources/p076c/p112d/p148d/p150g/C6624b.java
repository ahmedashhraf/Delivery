package p076c.p112d.p148d.p150g;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: c.d.d.g.b */
/* compiled from: Bytes */
public final class C6624b {

    @C2776b
    /* renamed from: c.d.d.g.b$a */
    /* compiled from: Bytes */
    private static class C6625a extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18586N;

        /* renamed from: a */
        final byte[] f18587a;

        /* renamed from: b */
        final int f18588b;

        C6625a(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        /* renamed from: a */
        public Byte set(int i, Byte b) {
            C7397x.m35663a(i, size());
            byte[] bArr = this.f18587a;
            int i2 = this.f18588b;
            byte b2 = bArr[i2 + i];
            bArr[i2 + i] = ((Byte) C7397x.m35664a(b)).byteValue();
            return Byte.valueOf(b2);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Byte) && C6624b.m31565c(this.f18587a, ((Byte) obj).byteValue(), this.f18588b, this.f18586N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public byte[] mo26596e() {
            int size = size();
            byte[] bArr = new byte[size];
            System.arraycopy(this.f18587a, this.f18588b, bArr, 0, size);
            return bArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6625a)) {
                return super.equals(obj);
            }
            C6625a aVar = (C6625a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18587a[this.f18588b + i] != aVar.f18587a[aVar.f18588b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18588b; i2 < this.f18586N; i2++) {
                i = (i * 31) + C6624b.m31553a(this.f18587a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Byte) {
                int a = C6624b.m31565c(this.f18587a, ((Byte) obj).byteValue(), this.f18588b, this.f18586N);
                if (a >= 0) {
                    return a - this.f18588b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                int b = C6624b.m31566d(this.f18587a, ((Byte) obj).byteValue(), this.f18588b, this.f18586N);
                if (b >= 0) {
                    return b - this.f18588b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18586N - this.f18588b;
        }

        public List<Byte> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            byte[] bArr = this.f18587a;
            int i3 = this.f18588b;
            return new C6625a(bArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append(this.f18587a[this.f18588b]);
            int i = this.f18588b;
            while (true) {
                i++;
                if (i < this.f18586N) {
                    sb.append(", ");
                    sb.append(this.f18587a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6625a(byte[] bArr, int i, int i2) {
            this.f18587a = bArr;
            this.f18588b = i;
            this.f18586N = i2;
        }

        public Byte get(int i) {
            C7397x.m35663a(i, size());
            return Byte.valueOf(this.f18587a[this.f18588b + i]);
        }
    }

    private C6624b() {
    }

    /* renamed from: a */
    public static int m31553a(byte b) {
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31565c(byte[] bArr, byte b, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31566d(byte[] bArr, byte b, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (bArr[i3] == b) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m31557a(byte[] bArr, byte b) {
        for (byte b2 : bArr) {
            if (b2 == b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m31562b(byte[] bArr, byte b) {
        return m31565c(bArr, b, 0, bArr.length);
    }

    /* renamed from: c */
    public static int m31564c(byte[] bArr, byte b) {
        return m31566d(bArr, b, 0, bArr.length);
    }

    /* renamed from: a */
    public static int m31555a(byte[] bArr, byte[] bArr2) {
        C7397x.m35665a(bArr, (Object) "array");
        C7397x.m35665a(bArr2, (Object) "target");
        if (bArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (bArr.length - bArr2.length) + 1) {
            int i2 = 0;
            while (i2 < bArr2.length) {
                if (bArr[i + i2] != bArr2[i2]) {
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
    public static byte[] m31561a(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m31560a(byte[] bArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return bArr.length < i ? m31559a(bArr, i + i2) : bArr;
    }

    /* renamed from: a */
    private static byte[] m31559a(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        return bArr2;
    }

    /* renamed from: a */
    public static byte[] m31558a(Collection<? extends Number> collection) {
        if (collection instanceof C6625a) {
            return ((C6625a) collection).mo26596e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = ((Number) C7397x.m35664a(array[i])).byteValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public static List<Byte> m31556a(byte... bArr) {
        if (bArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6625a(bArr);
    }
}
