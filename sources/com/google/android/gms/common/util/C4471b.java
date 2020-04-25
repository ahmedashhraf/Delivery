package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4413y;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@C4056a
@C4476d0
/* renamed from: com.google.android.gms.common.util.b */
public final class C4471b {
    private C4471b() {
    }

    @C4056a
    /* renamed from: a */
    public static boolean m19305a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @C4056a
    /* renamed from: b */
    public static <T> boolean m19312b(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C4413y.m19053a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @C4056a
    /* renamed from: a */
    public static Integer[] m19308a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    @C4056a
    /* renamed from: a */
    public static <T> void m19302a(StringBuilder sb, T[] tArr) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(tArr[i].toString());
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19300a(StringBuilder sb, int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Integer.toString(iArr[i]));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19301a(StringBuilder sb, long[] jArr) {
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Long.toString(jArr[i]));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19299a(StringBuilder sb, float[] fArr) {
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Float.toString(fArr[i]));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19298a(StringBuilder sb, double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Double.toString(dArr[i]));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19304a(StringBuilder sb, boolean[] zArr) {
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(Boolean.toString(zArr[i]));
        }
    }

    @C4056a
    /* renamed from: a */
    public static void m19303a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(",");
            }
            String str = "\"";
            sb.append(str);
            sb.append(strArr[i]);
            sb.append(str);
        }
    }

    @C4056a
    /* renamed from: a */
    public static <T> T[] m19311a(T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i);
        int length2 = tArr[0].length;
        for (int i2 = 1; i2 < tArr.length; i2++) {
            T[] tArr2 = tArr[i2];
            System.arraycopy(tArr2, 0, copyOf, length2, tArr2.length);
            length2 += tArr2.length;
        }
        return copyOf;
    }

    @C4056a
    /* renamed from: a */
    public static byte[] m19306a(byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i);
        int length2 = bArr[0].length;
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte[] bArr2 = bArr[i2];
            System.arraycopy(bArr2, 0, copyOf, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return copyOf;
    }

    @C4056a
    /* renamed from: a */
    public static <T> T[] m19309a(T[] tArr, T t) {
        T[] tArr2;
        if (tArr == null && t == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        if (tArr == null) {
            tArr2 = (Object[]) Array.newInstance(t.getClass(), 1);
        } else {
            tArr2 = Arrays.copyOf(tArr, tArr.length + 1);
        }
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    @C4056a
    /* renamed from: a */
    public static <T> T[] m19310a(T[] tArr, T... tArr2) {
        int i;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || tArr2.length == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length);
        if (tArr2.length == 1) {
            i = 0;
            for (T t : tArr) {
                if (!C4413y.m19053a(tArr2[0], t)) {
                    int i2 = i + 1;
                    tArr3[i] = t;
                    i = i2;
                }
            }
        } else {
            i = 0;
            for (T t2 : tArr) {
                if (!m19312b(tArr2, t2)) {
                    int i3 = i + 1;
                    tArr3[i] = t2;
                    i = i3;
                }
            }
        }
        if (tArr3 == null) {
            return null;
        }
        if (i != tArr3.length) {
            tArr3 = Arrays.copyOf(tArr3, i);
        }
        return tArr3;
    }

    @C4056a
    /* renamed from: a */
    public static <T> ArrayList<T> m19296a() {
        return new ArrayList<>();
    }

    @C4056a
    /* renamed from: a */
    public static <T> ArrayList<T> m19297a(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(r0);
        for (T add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    @C4056a
    /* renamed from: a */
    public static int[] m19307a(Collection<Integer> collection) {
        int i = 0;
        if (collection == null || collection.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        for (Integer intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }
}
