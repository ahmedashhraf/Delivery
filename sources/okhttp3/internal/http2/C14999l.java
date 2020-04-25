package okhttp3.internal.http2;

import java.util.Arrays;

/* renamed from: okhttp3.internal.http2.l */
/* compiled from: Settings */
public final class C14999l {

    /* renamed from: c */
    static final int f43599c = 65535;

    /* renamed from: d */
    static final int f43600d = 1;

    /* renamed from: e */
    static final int f43601e = 2;

    /* renamed from: f */
    static final int f43602f = 4;

    /* renamed from: g */
    static final int f43603g = 5;

    /* renamed from: h */
    static final int f43604h = 6;

    /* renamed from: i */
    static final int f43605i = 7;

    /* renamed from: j */
    static final int f43606j = 10;

    /* renamed from: a */
    private int f43607a;

    /* renamed from: b */
    private final int[] f43608b = new int[10];

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46595a() {
        this.f43607a = 0;
        Arrays.fill(this.f43608b, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo46598b() {
        if ((this.f43607a & 2) != 0) {
            return this.f43608b[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo46601c(int i) {
        return (this.f43607a & 32) != 0 ? this.f43608b[5] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo46602d() {
        return Integer.bitCount(this.f43607a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo46604e(int i) {
        return ((1 << i) & this.f43607a) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo46599b(int i) {
        return (this.f43607a & 16) != 0 ? this.f43608b[4] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo46600c() {
        if ((this.f43607a & 128) != 0) {
            return this.f43608b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo46603d(int i) {
        return (this.f43607a & 64) != 0 ? this.f43608b[6] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C14999l mo46594a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f43608b;
            if (i < iArr.length) {
                this.f43607a = (1 << i) | this.f43607a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo46593a(int i) {
        return this.f43608b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo46597a(boolean z) {
        int i = (this.f43607a & 4) != 0 ? this.f43608b[2] : z ? 1 : 0;
        return i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46596a(C14999l lVar) {
        for (int i = 0; i < 10; i++) {
            if (lVar.mo46604e(i)) {
                mo46594a(i, lVar.mo46593a(i));
            }
        }
    }
}
