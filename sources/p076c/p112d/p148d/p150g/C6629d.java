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
import java.util.regex.Pattern;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true)
/* renamed from: c.d.d.g.d */
/* compiled from: Doubles */
public final class C6629d {

    /* renamed from: a */
    public static final int f18593a = 8;
    @C2777c("regular expressions")

    /* renamed from: b */
    static final Pattern f18594b = m31603a();

    @C2776b
    /* renamed from: c.d.d.g.d$a */
    /* compiled from: Doubles */
    private static class C6630a extends AbstractList<Double> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        final int f18595N;

        /* renamed from: a */
        final double[] f18596a;

        /* renamed from: b */
        final int f18597b;

        C6630a(double[] dArr) {
            this(dArr, 0, dArr.length);
        }

        /* renamed from: a */
        public Double set(int i, Double d) {
            C7397x.m35663a(i, size());
            double[] dArr = this.f18596a;
            int i2 = this.f18597b;
            double d2 = dArr[i2 + i];
            dArr[i2 + i] = ((Double) C7397x.m35664a(d)).doubleValue();
            return Double.valueOf(d2);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Double) && C6629d.m31616c(this.f18596a, ((Double) obj).doubleValue(), this.f18597b, this.f18595N) != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public double[] mo26624e() {
            int size = size();
            double[] dArr = new double[size];
            System.arraycopy(this.f18596a, this.f18597b, dArr, 0, size);
            return dArr;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6630a)) {
                return super.equals(obj);
            }
            C6630a aVar = (C6630a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f18596a[this.f18597b + i] != aVar.f18596a[aVar.f18597b + i]) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.f18597b; i2 < this.f18595N; i2++) {
                i = (i * 31) + C6629d.m31596a(this.f18596a[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Double) {
                int a = C6629d.m31616c(this.f18596a, ((Double) obj).doubleValue(), this.f18597b, this.f18595N);
                if (a >= 0) {
                    return a - this.f18597b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                int b = C6629d.m31618d(this.f18596a, ((Double) obj).doubleValue(), this.f18597b, this.f18595N);
                if (b >= 0) {
                    return b - this.f18597b;
                }
            }
            return -1;
        }

        public int size() {
            return this.f18595N - this.f18597b;
        }

        public List<Double> subList(int i, int i2) {
            C7397x.m35675b(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            double[] dArr = this.f18596a;
            int i3 = this.f18597b;
            return new C6630a(dArr, i + i3, i3 + i2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.f18596a[this.f18597b]);
            int i = this.f18597b;
            while (true) {
                i++;
                if (i < this.f18595N) {
                    sb.append(", ");
                    sb.append(this.f18596a[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        C6630a(double[] dArr, int i, int i2) {
            this.f18596a = dArr;
            this.f18597b = i;
            this.f18595N = i2;
        }

        public Double get(int i) {
            C7397x.m35663a(i, size());
            return Double.valueOf(this.f18596a[this.f18597b + i]);
        }
    }

    /* renamed from: c.d.d.g.d$b */
    /* compiled from: Doubles */
    private static final class C6631b extends C7337g<String, Double> implements Serializable {

        /* renamed from: N */
        static final C6631b f18598N = new C6631b();
        private static final long serialVersionUID = 1;

        private C6631b() {
        }

        private Object readResolve() {
            return f18598N;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo26637f(Double d) {
            return d.toString();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Double mo26638g(String str) {
            return Double.valueOf(str);
        }

        public String toString() {
            return "Doubles.stringConverter()";
        }
    }

    /* renamed from: c.d.d.g.d$c */
    /* compiled from: Doubles */
    private enum C6632c implements Comparator<double[]> {
        INSTANCE;

        /* renamed from: a */
        public int compare(double[] dArr, double[] dArr2) {
            int min = Math.min(dArr.length, dArr2.length);
            for (int i = 0; i < min; i++) {
                int a = C6629d.m31597a(dArr[i], dArr2[i]);
                if (a != 0) {
                    return a;
                }
            }
            return dArr.length - dArr2.length;
        }
    }

    private C6629d() {
    }

    /* renamed from: b */
    public static boolean m31613b(double d) {
        boolean z = true;
        boolean z2 = Double.NEGATIVE_INFINITY < d;
        if (d >= Double.POSITIVE_INFINITY) {
            z = false;
        }
        return z2 & z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static int m31616c(double[] dArr, double d, int i, int i2) {
        while (i < i2) {
            if (dArr[i] == d) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31618d(double[] dArr, double d, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (dArr[i3] == d) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static int m31596a(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* renamed from: b */
    public static int m31610b(double[] dArr, double d) {
        return m31616c(dArr, d, 0, dArr.length);
    }

    /* renamed from: c */
    public static int m31615c(double[] dArr, double d) {
        return m31618d(dArr, d, 0, dArr.length);
    }

    /* renamed from: a */
    public static int m31597a(double d, double d2) {
        return Double.compare(d, d2);
    }

    /* renamed from: b */
    public static double m31609b(double... dArr) {
        C7397x.m35670a(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.max(d, dArr[i]);
        }
        return d;
    }

    /* renamed from: c */
    public static double m31614c(double... dArr) {
        C7397x.m35670a(dArr.length > 0);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            d = Math.min(d, dArr[i]);
        }
        return d;
    }

    /* renamed from: a */
    public static boolean m31604a(double[] dArr, double d) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (dArr[i] == d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m31599a(double[] dArr, double[] dArr2) {
        C7397x.m35665a(dArr, (Object) "array");
        C7397x.m35665a(dArr2, (Object) "target");
        if (dArr2.length == 0) {
            return 0;
        }
        int i = 0;
        while (i < (dArr.length - dArr2.length) + 1) {
            int i2 = 0;
            while (i2 < dArr2.length) {
                if (dArr[i + i2] != dArr2[i2]) {
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
    public static Comparator<double[]> m31612b() {
        return C6632c.INSTANCE;
    }

    @C2775a
    /* renamed from: c */
    public static C7337g<String, Double> m31617c() {
        return C6631b.f18598N;
    }

    /* renamed from: a */
    public static double[] m31608a(double[]... dArr) {
        int i = 0;
        for (double[] length : dArr) {
            i += length.length;
        }
        double[] dArr2 = new double[i];
        int i2 = 0;
        for (double[] dArr3 : dArr) {
            System.arraycopy(dArr3, 0, dArr2, i2, dArr3.length);
            i2 += dArr3.length;
        }
        return dArr2;
    }

    /* renamed from: a */
    public static double[] m31607a(double[] dArr, int i, int i2) {
        C7397x.m35672a(i >= 0, "Invalid minLength: %s", Integer.valueOf(i));
        C7397x.m35672a(i2 >= 0, "Invalid padding: %s", Integer.valueOf(i2));
        return dArr.length < i ? m31606a(dArr, i + i2) : dArr;
    }

    /* renamed from: a */
    private static double[] m31606a(double[] dArr, int i) {
        double[] dArr2 = new double[i];
        System.arraycopy(dArr, 0, dArr2, 0, Math.min(dArr.length, i));
        return dArr2;
    }

    /* renamed from: a */
    public static String m31601a(String str, double... dArr) {
        C7397x.m35664a(str);
        if (dArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(dArr.length * 12);
        sb.append(dArr[0]);
        for (int i = 1; i < dArr.length; i++) {
            sb.append(str);
            sb.append(dArr[i]);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static double[] m31605a(Collection<? extends Number> collection) {
        if (collection instanceof C6630a) {
            return ((C6630a) collection).mo26624e();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = ((Number) C7397x.m35664a(array[i])).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public static List<Double> m31602a(double... dArr) {
        if (dArr.length == 0) {
            return Collections.emptyList();
        }
        return new C6630a(dArr);
    }

    @C2777c("regular expressions")
    /* renamed from: a */
    private static Pattern m31603a() {
        StringBuilder sb = new StringBuilder();
        sb.append("(?:\\d++(?:\\.\\d*+)?|\\.\\d++)");
        sb.append("(?:[eE][+-]?\\d++)?[fFdD]?");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("0[xX]");
        sb3.append("(?:\\p{XDigit}++(?:\\.\\p{XDigit}*+)?|\\.\\p{XDigit}++)");
        sb3.append("[pP][+-]?\\d++[fFdD]?");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("[+-]?(?:NaN|Infinity|");
        sb5.append(sb2);
        sb5.append("|");
        sb5.append(sb4);
        sb5.append(")");
        return Pattern.compile(sb5.toString());
    }

    @C5952h
    @C2777c("regular expressions")
    @C2775a
    /* renamed from: a */
    public static Double m31600a(String str) {
        if (f18594b.matcher(str).matches()) {
            try {
                return Double.valueOf(Double.parseDouble(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
