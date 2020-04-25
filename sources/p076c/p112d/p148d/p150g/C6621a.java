package p076c.p112d.p148d.p150g;

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
/* renamed from: c.d.d.g.a */
/* compiled from: Booleans */
public final class C6621a {

    @C2776b
    /* renamed from: c.d.d.g.a$a */
    /* compiled from: Booleans */
    private static class C6622a extends AbstractList<Boolean> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18583N;

        /* renamed from: a */
        final boolean[] f18584a;

        /* renamed from: b */
        final int f18585b;

        C6622a(boolean[] zArr) {
            this(zArr, 0, zArr.length);
        }

        /* renamed from: a */
        public Boolean set(int i, Boolean bool) {
            C7397x.m35663a(i, size());
            boolean[] zArr = this.f18584a;
            int i2 = this.f18585b;
            boolean z = zArr[i2 + i];
            zArr[i2 + i] = ((Boolean) C7397x.m35664a(bool)).booleanValue();
            return Boolean.valueOf(z);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Boolean) && C6621a.m31548c(this.f18584a, ((Boolean) obj).booleanValue(), this.f18585b, this.f18583N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean[] mo26581e() {
            int size = size();
            boolean[] zArr = new boolean[size];
            System.arraycopy(this.f18584a, this.f18585b, zArr, 0, size);
            return zArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6622a)) {
                return super.equals(obj);
            }
            C6622a aVar = (C6622a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18584a[this.f18585b + i] != aVar.f18584a[aVar.f18585b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18585b; i2 < this.f18583N; i2++) {
                i = (i * 31) + C6621a.m31532a(this.f18584a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Boolean) {
                int a = C6621a.m31548c(this.f18584a, ((Boolean) obj).booleanValue(), this.f18585b, this.f18583N);
                if (a >= 0) {
                    return a - this.f18585b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Boolean) {
                int b = C6621a.m31549d(this.f18584a, ((Boolean) obj).booleanValue(), this.f18585b, this.f18583N);
                if (b >= 0) {
                    return b - this.f18585b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18583N - this.f18585b;
        }

        public List<Boolean> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            boolean[] zArr = this.f18584a;
            int i3 = this.f18585b;
            return new C6622a(zArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 7);
            sb.append(this.f18584a[this.f18585b] ? "[true" : "[false");
            int i = this.f18585b;
            while (true) {
                i++;
                if (i < this.f18583N) {
                    sb.append(this.f18584a[i] ? ", true" : ", false");
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6622a(boolean[] zArr, int i, int i2) {
            this.f18584a = zArr;
            this.f18585b = i;
            this.f18583N = i2;
        }

        public Boolean get(int i) {
            C7397x.m35663a(i, size());
            return Boolean.valueOf(this.f18584a[this.f18585b + i]);
        }
    }

    /* renamed from: c.d.d.g.a$b */
    /* compiled from: Booleans */
    private enum C6623b implements Comparator<boolean[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(boolean[] zArr, boolean[] zArr2) {
            int min = Math.min(zArr.length, zArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6621a.m31533a(zArr[i], zArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return zArr.length - zArr2.length;
        }
    }

    private C6621a() {
    }

    /* renamed from: a */
    public static int m31532a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static int m31533a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31548c(boolean[] zArr, boolean z, int i, int i2) {
        while (i < i2) {
            if (zArr[i] == z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31549d(boolean[] zArr, boolean z, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (zArr[i3] == z) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m31539a(boolean[] zArr, boolean z) {
        for (boolean z2 : zArr) {
            if (z2 == z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m31545b(boolean[] zArr, boolean z) {
        return m31548c(zArr, z, 0, zArr.length);
    }

    /* renamed from: c */
    public static int m31547c(boolean[] zArr, boolean z) {
        return m31549d(zArr, z, 0, zArr.length);
    }

    /* renamed from: a */
    public static int m31535a(boolean[] zArr, boolean[] zArr2) {
        C7397x.m35665a(zArr, (Object) "array");
        C7397x.m35665a(zArr2, (Object) "target");
        if (zArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (zArr.length - zArr2.length) + 1) {
            int i2 = 0;
            while (i2 < zArr2.length) {
                if (zArr[i + i2] != zArr2[i2]) {
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
    public static int m31544b(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static boolean[] m31543a(boolean[]... zArr) {
        int i = 0;
        for (boolean[] length : zArr) {
            i += length.length;
        }
        boolean[] zArr2 = new boolean[i];
        int i2 = 0;
        for (boolean[] zArr3 : zArr) {
            System.arraycopy(zArr3, 0, zArr2, i2, zArr3.length);
            i2 += zArr3.length;
        }
        return zArr2;
    }

    /* renamed from: a */
    public static boolean[] m31542a(boolean[] zArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return zArr.length < i ? m31541a(zArr, i + i2) : zArr;
    }

    /* renamed from: a */
    private static boolean[] m31541a(boolean[] zArr, int i) {
        boolean[] zArr2 = new boolean[i];
        System.arraycopy(zArr, 0, zArr2, 0, Math.min(zArr.length, i));
        return zArr2;
    }

    /* renamed from: a */
    public static String m31536a(String str, boolean... zArr) {
        C7397x.m35664a(str);
        if (zArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(zArr.length * 7);
        sb.append(zArr[0]);
        for (int i = 1; i < zArr.length; i++) {
            sb.append(str);
            sb.append(zArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<boolean[]> m31537a() {
        return C6623b.INSTANCE;
    }

    /* renamed from: a */
    public static boolean[] m31540a(Collection<Boolean> collection) {
        if (collection instanceof C6622a) {
            return ((C6622a) collection).mo26581e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = ((Boolean) C7397x.m35664a(array[i])).booleanValue();
        }
        return zArr;
    }

    /* renamed from: a */
    public static List<Boolean> m31538a(boolean... zArr) {
        if (zArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6622a(zArr);
    }
}
