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
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: c.d.d.g.e */
/* compiled from: Floats */
public final class C6633e {

    /* renamed from: a */
    public static final int f18599a = 4;

    @C2776b
    /* renamed from: c.d.d.g.e$a */
    /* compiled from: Floats */
    private static class C6634a extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18600N;

        /* renamed from: a */
        final float[] f18601a;

        /* renamed from: b */
        final int f18602b;

        C6634a(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        /* renamed from: a */
        public Float set(int i, Float f) {
            C7397x.m35663a(i, size());
            float[] fArr = this.f18601a;
            int i2 = this.f18602b;
            float f2 = fArr[i2 + i];
            fArr[i2 + i] = ((Float) C7397x.m35664a(f)).floatValue();
            return Float.valueOf(f2);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Float) && C6633e.m31646c(this.f18601a, ((Float) obj).floatValue(), this.f18602b, this.f18600N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float[] mo26644e() {
            int size = size();
            float[] fArr = new float[size];
            System.arraycopy(this.f18601a, this.f18602b, fArr, 0, size);
            return fArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6634a)) {
                return super.equals(obj);
            }
            C6634a aVar = (C6634a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18601a[this.f18602b + i] != aVar.f18601a[aVar.f18602b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18602b; i2 < this.f18600N; i2++) {
                i = (i * 31) + C6633e.m31626a(this.f18601a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Float) {
                int a = C6633e.m31646c(this.f18601a, ((Float) obj).floatValue(), this.f18602b, this.f18600N);
                if (a >= 0) {
                    return a - this.f18602b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                int b = C6633e.m31647d(this.f18601a, ((Float) obj).floatValue(), this.f18602b, this.f18600N);
                if (b >= 0) {
                    return b - this.f18602b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18600N - this.f18602b;
        }

        public List<Float> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            float[] fArr = this.f18601a;
            int i3 = this.f18602b;
            return new C6634a(fArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f18601a[this.f18602b]);
            int i = this.f18602b;
            while (true) {
                i++;
                if (i < this.f18600N) {
                    sb.append(", ");
                    sb.append(this.f18601a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6634a(float[] fArr, int i, int i2) {
            this.f18601a = fArr;
            this.f18602b = i;
            this.f18600N = i2;
        }

        public Float get(int i) {
            C7397x.m35663a(i, size());
            return Float.valueOf(this.f18601a[this.f18602b + i]);
        }
    }

    /* renamed from: c.d.d.g.e$b */
    /* compiled from: Floats */
    private static final class C6635b extends C7337g<String, Float> implements Serializable {

        /* renamed from: N */
        static final C6635b f18603N = new C6635b();
        private static final long serialVersionUID = 1;

        private C6635b() {
        }

        private Object readResolve() {
            return f18603N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo26637f(Float f) {
            return f.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Float mo26638g(String str) {
            return Float.valueOf(str);
        }

        public String toString() {
            return "Floats.stringConverter()";
        }
    }

    /* renamed from: c.d.d.g.e$c */
    /* compiled from: Floats */
    private enum C6636c implements Comparator<float[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6633e.m31627a(fArr[i], fArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    private C6633e() {
    }

    /* renamed from: b */
    public static boolean m31643b(float f) {
        boolean z = true;
        boolean z2 = Float.NEGATIVE_INFINITY < f;
        if (f >= Float.POSITIVE_INFINITY) {
            z = false;
        }
        return z2 & z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31646c(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31647d(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m31626a(float f) {
        return Float.valueOf(f).hashCode();
    }

    /* renamed from: b */
    public static int m31640b(float[] fArr, float f) {
        return m31646c(fArr, f, 0, fArr.length);
    }

    /* renamed from: c */
    public static int m31645c(float[] fArr, float f) {
        return m31647d(fArr, f, 0, fArr.length);
    }

    /* renamed from: a */
    public static int m31627a(float f, float f2) {
        return Float.compare(f, f2);
    }

    /* renamed from: b */
    public static float m31639b(float... fArr) {
        C7397x.m35670a(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        return f;
    }

    /* renamed from: c */
    public static float m31644c(float... fArr) {
        C7397x.m35670a(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.min(f, fArr[i]);
        }
        return f;
    }

    /* renamed from: a */
    public static boolean m31634a(float[] fArr, float f) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (fArr[i] == f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m31629a(float[] fArr, float[] fArr2) {
        C7397x.m35665a(fArr, (Object) "array");
        C7397x.m35665a(fArr2, (Object) "target");
        if (fArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (fArr.length - fArr2.length) + 1) {
            int i2 = 0;
            while (i2 < fArr2.length) {
                if (fArr[i + i2] != fArr2[i2]) {
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
    public static C7337g<String, Float> m31642b() {
        return C6635b.f18603N;
    }

    /* renamed from: a */
    public static float[] m31638a(float[]... fArr) {
        int i = 0;
        for (float[] length : fArr) {
            i += length.length;
        }
        float[] fArr2 = new float[i];
        int i2 = 0;
        for (float[] fArr3 : fArr) {
            System.arraycopy(fArr3, 0, fArr2, i2, fArr3.length);
            i2 += fArr3.length;
        }
        return fArr2;
    }

    /* renamed from: a */
    public static float[] m31637a(float[] fArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return fArr.length < i ? m31636a(fArr, i + i2) : fArr;
    }

    /* renamed from: a */
    private static float[] m31636a(float[] fArr, int i) {
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, Math.min(fArr.length, i));
        return fArr2;
    }

    /* renamed from: a */
    public static String m31631a(String str, float... fArr) {
        C7397x.m35664a(str);
        if (fArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(fArr.length * 12);
        sb.append(fArr[0]);
        for (int i = 1; i < fArr.length; i++) {
            sb.append(str);
            sb.append(fArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static Comparator<float[]> m31632a() {
        return C6636c.INSTANCE;
    }

    /* renamed from: a */
    public static float[] m31635a(Collection<? extends Number> collection) {
        if (collection instanceof C6634a) {
            return ((C6634a) collection).mo26644e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = ((Number) C7397x.m35664a(array[i])).floatValue();
        }
        return fArr;
    }

    /* renamed from: a */
    public static List<Float> m31633a(float... fArr) {
        if (fArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6634a(fArr);
    }

    @C5952h
    @C2777c("regular expressions")
    @C2775a
    /* renamed from: a */
    public static Float m31630a(String str) {
        if (C6629d.f18594b.matcher(str).matches()) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
