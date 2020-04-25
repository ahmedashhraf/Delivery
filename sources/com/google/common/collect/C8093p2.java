package com.google.common.collect;

import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.p2 */
/* compiled from: Hashing */
final class C8093p2 {

    /* renamed from: a */
    private static final int f21891a = -862048943;

    /* renamed from: b */
    private static final int f21892b = 461845907;

    /* renamed from: c */
    private static int f21893c = 1073741824;

    private C8093p2() {
    }

    /* renamed from: a */
    static int m38750a(int i) {
        return Integer.rotateLeft(i * f21891a, 15) * f21892b;
    }

    /* renamed from: a */
    static int m38752a(@C5952h Object obj) {
        return m38750a(obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: a */
    static int m38751a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (max <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 <= 0) {
            i2 = f21893c;
        }
        return i2;
    }

    /* renamed from: a */
    static boolean m38753a(int i, int i2, double d) {
        double d2 = (double) i;
        double d3 = (double) i2;
        Double.isNaN(d3);
        return d2 > d * d3 && i2 < f21893c;
    }
}
