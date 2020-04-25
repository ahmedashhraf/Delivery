package org.jcodec.common;

public class Assert {
    public static void assertArrayEquals(int[] iArr, int[] iArr2) {
        if (iArr != iArr2) {
            if (iArr == null || iArr2 == null) {
                throw new AssertionError();
            } else if (iArr.length == iArr2.length) {
                int i = 0;
                while (i < iArr.length) {
                    if (iArr[i] == iArr2[i]) {
                        i++;
                    } else {
                        throw new AssertionError();
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    public static void assertEquals(String str, int i, int i2) {
        if (i != i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" expected ");
            sb.append(i);
            sb.append(" actual ");
            sb.append(i2);
            throw new AssertionError(sb.toString());
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    public static void assertEquals(int i, int i2) {
        if (i != i2) {
            throw new AssertionError();
        }
    }

    public static void assertTrue(String str, boolean z) {
        if (!z) {
            throw new AssertionError(str);
        }
    }

    public static void assertEquals(long j, int i) {
        if (j != ((long) i)) {
            throw new AssertionError();
        }
    }
}
