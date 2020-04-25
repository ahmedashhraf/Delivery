package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.util.BitSet;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2717c;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2718d;

@C2717c("no precomputation is done in GWT")
/* renamed from: c.d.b.a.e.a.a.a.b.n */
/* compiled from: SmallCharMatcher */
final class C6331n extends C2737r {

    /* renamed from: A */
    private static final int f17701A = 461845907;

    /* renamed from: B */
    private static final double f17702B = 0.5d;

    /* renamed from: y */
    static final int f17703y = 1023;

    /* renamed from: z */
    private static final int f17704z = -862048943;

    /* renamed from: v */
    private final char[] f17705v;

    /* renamed from: w */
    private final boolean f17706w;

    /* renamed from: x */
    private final long f17707x;

    private C6331n(char[] cArr, long j, boolean z, String str) {
        super(str);
        this.f17705v = cArr;
        this.f17707x = j;
        this.f17706w = z;
    }

    /* renamed from: a */
    private boolean m29460a(int i) {
        return 1 == ((this.f17707x >> i) & 1);
    }

    @C2718d
    /* renamed from: b */
    static int m29461b(int i) {
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
    static int m29462c(int i) {
        return Integer.rotateLeft(i * f17704z, 15) * f17701A;
    }

    /* renamed from: a */
    static C2719c m29459a(BitSet bitSet, String str) {
        int i;
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        char[] cArr = new char[m29461b(cardinality)];
        int length = cArr.length - 1;
        int nextSetBit = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit != -1) {
            long j2 = (1 << nextSetBit) | j;
            int c = m29462c(nextSetBit);
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
        C6331n nVar = new C6331n(cArr, j, z, str);
        return nVar;
    }

    /* renamed from: a */
    public boolean mo10401a(char c) {
        if (c == 0) {
            return this.f17706w;
        }
        if (!m29460a((int) c)) {
            return false;
        }
        int length = this.f17705v.length - 1;
        int c2 = m29462c(c) & length;
        int i = c2;
        do {
            char[] cArr = this.f17705v;
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
    public void mo10400a(BitSet bitSet) {
        char[] cArr;
        if (this.f17706w) {
            bitSet.set(0);
        }
        for (char c : this.f17705v) {
            if (c != 0) {
                bitSet.set(c);
            }
        }
    }
}
