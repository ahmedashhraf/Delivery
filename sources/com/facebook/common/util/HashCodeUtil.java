package com.facebook.common.util;

import p201f.p202a.C5952h;

public class HashCodeUtil {

    /* renamed from: X */
    private static final int f11783X = 31;

    public static int hashCode(int i) {
        return i + 31;
    }

    public static int hashCode(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    public static int hashCode(int i, int i2, int i3) {
        return ((((i + 31) * 31) + i2) * 31) + i3;
    }

    public static int hashCode(int i, int i2, int i3, int i4) {
        return ((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4;
    }

    public static int hashCode(int i, int i2, int i3, int i4, int i5) {
        return ((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5;
    }

    public static int hashCode(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    public static int hashCode(@C5952h Object obj) {
        return hashCode(obj == null ? 0 : obj.hashCode());
    }

    public static int hashCode(@C5952h Object obj, @C5952h Object obj2) {
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode(hashCode, i);
    }

    public static int hashCode(@C5952h Object obj, @C5952h Object obj2, @C5952h Object obj3) {
        int i;
        int i2 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 == null) {
            i = 0;
        } else {
            i = obj2.hashCode();
        }
        if (obj3 != null) {
            i2 = obj3.hashCode();
        }
        return hashCode(hashCode, i, i2);
    }

    public static int hashCode(@C5952h Object obj, @C5952h Object obj2, @C5952h Object obj3, @C5952h Object obj4) {
        int i;
        int i2;
        int i3 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 == null) {
            i = 0;
        } else {
            i = obj2.hashCode();
        }
        if (obj3 == null) {
            i2 = 0;
        } else {
            i2 = obj3.hashCode();
        }
        if (obj4 != null) {
            i3 = obj4.hashCode();
        }
        return hashCode(hashCode, i, i2, i3);
    }

    public static int hashCode(@C5952h Object obj, @C5952h Object obj2, @C5952h Object obj3, @C5952h Object obj4, @C5952h Object obj5) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 == null) {
            i = 0;
        } else {
            i = obj2.hashCode();
        }
        if (obj3 == null) {
            i2 = 0;
        } else {
            i2 = obj3.hashCode();
        }
        if (obj4 == null) {
            i3 = 0;
        } else {
            i3 = obj4.hashCode();
        }
        if (obj5 != null) {
            i4 = obj5.hashCode();
        }
        return hashCode(hashCode, i, i2, i3, i4);
    }

    public static int hashCode(@C5952h Object obj, @C5952h Object obj2, @C5952h Object obj3, @C5952h Object obj4, @C5952h Object obj5, @C5952h Object obj6) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int hashCode = obj == null ? 0 : obj.hashCode();
        if (obj2 == null) {
            i = 0;
        } else {
            i = obj2.hashCode();
        }
        if (obj3 == null) {
            i2 = 0;
        } else {
            i2 = obj3.hashCode();
        }
        if (obj4 == null) {
            i3 = 0;
        } else {
            i3 = obj4.hashCode();
        }
        if (obj5 == null) {
            i4 = 0;
        } else {
            i4 = obj5.hashCode();
        }
        if (obj6 == null) {
            i5 = 0;
        } else {
            i5 = obj6.hashCode();
        }
        return hashCode(hashCode, i, i2, i3, i4, i5);
    }
}
