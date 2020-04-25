package org.jcodec.common;

import java.lang.reflect.Array;

public class ArrayUtil {
    public static void add(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static int[] addAll(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return clone(iArr2);
        }
        if (iArr2 == null) {
            return clone(iArr);
        }
        int[] iArr3 = new int[(iArr.length + iArr2.length)];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    public static int[] clone(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public static <T> void reverse(T[] tArr) {
        int length = tArr.length - 1;
        int i = 0;
        while (i < (tArr.length >> 1)) {
            T t = tArr[i];
            tArr[i] = tArr[length];
            tArr[length] = t;
            i++;
            length--;
        }
    }

    public static <T> void shiftLeft(T[] tArr) {
        int i = 0;
        while (i < tArr.length - 1) {
            int i2 = i + 1;
            tArr[i] = tArr[i2];
            i = i2;
        }
        tArr[tArr.length - 1] = null;
    }

    public static <T> void shiftRight(T[] tArr) {
        for (int i = 1; i < tArr.length; i++) {
            tArr[i] = tArr[i - 1];
        }
        tArr[0] = null;
    }

    public static final int sum(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static byte[] toByteArray(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }

    public static int[] toUnsignedIntArray(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }

    public static long[] clone(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    public static Object[] clone(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) objArr.clone();
    }

    public static int sum(int[] iArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public static <T> void shiftLeft(T[] tArr, int i, int i2) {
        while (true) {
            int i3 = i2 - 1;
            if (i < i3) {
                int i4 = i + 1;
                tArr[i] = tArr[i4];
                i = i4;
            } else {
                tArr[i3] = null;
                return;
            }
        }
    }

    public static <T> void shiftRight(T[] tArr, int i, int i2) {
        for (int i3 = i2 - 1; i3 > i; i3--) {
            tArr[i3] = tArr[i3 - 1];
        }
        tArr[i] = null;
    }

    public static long[] addAll(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return clone(jArr2);
        }
        if (jArr2 == null) {
            return clone(jArr);
        }
        long[] jArr3 = new long[(jArr.length + jArr2.length)];
        System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
        System.arraycopy(jArr2, 0, jArr3, jArr.length, jArr2.length);
        return jArr3;
    }

    public static <T> void shiftLeft(T[] tArr, int i) {
        shiftLeft(tArr, i, tArr.length);
    }

    public static <T> void shiftRight(T[] tArr, int i) {
        shiftRight(tArr, 0, i);
    }

    public static Object[] addAll(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return clone(objArr2);
        }
        if (objArr2 == null) {
            return clone(objArr);
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + objArr2.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        return objArr3;
    }
}
