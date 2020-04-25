package com.google.common.base;

import java.util.BitSet;
import p076c.p112d.p148d.p149a.C2777c;
import p076c.p112d.p148d.p149a.C2778d;

@C2777c("no precomputation is done in GWT")
/* renamed from: com.google.common.base.b0 */
/* compiled from: SmallCharMatcher */
final class C7324b0 extends C5817r {

    /* renamed from: j0 */
    static final int f20771j0 = 1023;

    /* renamed from: k0 */
    private static final int f20772k0 = -862048943;

    /* renamed from: l0 */
    private static final int f20773l0 = 461845907;

    /* renamed from: m0 */
    private static final double f20774m0 = 0.5d;

    /* renamed from: g0 */
    private final char[] f20775g0;

    /* renamed from: h0 */
    private final boolean f20776h0;

    /* renamed from: i0 */
    private final long f20777i0;

    private C7324b0(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.f20775g0 = cArr;
        this.f20777i0 = j;
        this.f20776h0 = z;
    }

    /* renamed from: a */
    private boolean m35490a(int i) {
        return 1 == ((this.f20777i0 >> i) & 1);
    }

    @C2778d
    /* renamed from: b */
    static int m35491b(int i) {
        if (i == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(i - 1) << 1;
        while (true) {
            double d = (double) highestOneBit;
            Double.isNaN(d);
            if (d * 0.5d >= ((double) i)) {
                return highestOneBit;
            }
            highestOneBit <<= 1;
        }
    }

    /* renamed from: c */
    static int m35492c(int i) {
        return Integer.rotateLeft(i * f20772k0, 15) * f20773l0;
    }

    /* renamed from: a */
    static C5799e m35489a(BitSet bitSet, String str) {
        int i;
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        char[] cArr = new char[m35491b(cardinality)];
        int length = cArr.length - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit != -1) {
            long j2 = (1 << nextSetBit) | j;
            int c = m35492c(nextSetBit);
            while (true) {
                i = c & length;
                if (cArr[i] == 0) {
                    break;
                }
                c = i + 1;
            }
            cArr[i] = (char) nextSetBit;
            nextSetBit = bitSet.nextSetBit(nextSetBit + 1);
            j = j2;
        }
        C7324b0 b0Var = new C7324b0(cArr, j, z, str);
        return b0Var;
    }

    /* renamed from: a */
    public boolean mo23093a(char c) {
        if (c == 0) {
            return this.f20776h0;
        }
        if (!m35490a((int) c)) {
            return false;
        }
        int length = this.f20775g0.length - 1;
        int c2 = m35492c(c) & length;
        int i = c2;
        do {
            char[] cArr = this.f20775g0;
            if (cArr[i] == 0) {
                return false;
            }
            if (cArr[i] == c) {
                return true;
            }
            i = (i + 1) & length;
        } while (i != c2);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23092a(BitSet bitSet) {
        char[] cArr;
        if (this.f20776h0) {
            bitSet.set(0);
        }
        for (char c : this.f20775g0) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }
}
