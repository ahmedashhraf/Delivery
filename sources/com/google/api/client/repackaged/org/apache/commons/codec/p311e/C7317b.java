package com.google.api.client.repackaged.org.apache.commons.codec.p311e;

import com.google.api.client.repackaged.org.apache.commons.codec.C7312a;
import com.google.api.client.repackaged.org.apache.commons.codec.C7313b;
import com.google.api.client.repackaged.org.apache.commons.codec.DecoderException;
import com.google.api.client.repackaged.org.apache.commons.codec.EncoderException;

/* renamed from: com.google.api.client.repackaged.org.apache.commons.codec.e.b */
/* compiled from: BaseNCodec */
public abstract class C7317b implements C7313b, C7312a {

    /* renamed from: l */
    public static final int f20749l = 76;

    /* renamed from: m */
    public static final int f20750m = 64;

    /* renamed from: n */
    private static final int f20751n = 2;

    /* renamed from: o */
    private static final int f20752o = 8192;

    /* renamed from: p */
    protected static final int f20753p = 255;

    /* renamed from: q */
    protected static final byte f20754q = 61;

    /* renamed from: a */
    protected final byte f20755a = f20754q;

    /* renamed from: b */
    private final int f20756b;

    /* renamed from: c */
    private final int f20757c;

    /* renamed from: d */
    protected final int f20758d;

    /* renamed from: e */
    private final int f20759e;

    /* renamed from: f */
    protected byte[] f20760f;

    /* renamed from: g */
    protected int f20761g;

    /* renamed from: h */
    private int f20762h;

    /* renamed from: i */
    protected boolean f20763i;

    /* renamed from: j */
    protected int f20764j;

    /* renamed from: k */
    protected int f20765k;

    protected C7317b(int i, int i2, int i3, int i4) {
        this.f20756b = i;
        this.f20757c = i2;
        this.f20758d = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / i2) * i2;
        this.f20759e = i4;
    }

    /* renamed from: b */
    protected static boolean m35432b(byte b) {
        return b == 9 || b == 10 || b == 13 || b == 32;
    }

    /* renamed from: d */
    private void mo29167d() {
        this.f20760f = null;
        this.f20761g = 0;
        this.f20762h = 0;
        this.f20764j = 0;
        this.f20765k = 0;
        this.f20763i = false;
    }

    /* renamed from: e */
    private void m35434e() {
        byte[] bArr = this.f20760f;
        if (bArr == null) {
            this.f20760f = new byte[mo29172b()];
            this.f20761g = 0;
            this.f20762h = 0;
            return;
        }
        byte[] bArr2 = new byte[(bArr.length * 2)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f20760f = bArr2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29168a() {
        if (this.f20760f != null) {
            return this.f20761g - this.f20762h;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo29164a(byte[] bArr, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29165a(byte b);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo29172b() {
        return 8192;
    }

    /* renamed from: b */
    public Object mo29162b(Object obj) throws DecoderException {
        if (obj instanceof byte[]) {
            return mo29160a((byte[]) obj);
        }
        if (obj instanceof String) {
            return mo29171a((String) obj);
        }
        throw new DecoderException("Parameter supplied to Base-N decode is not a byte[] or a String");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo29166b(byte[] bArr, int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo29175c() {
        return this.f20760f != null;
    }

    /* renamed from: f */
    public long mo29179f(byte[] bArr) {
        int length = bArr.length;
        int i = this.f20756b;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.f20757c);
        int i2 = this.f20758d;
        return i2 > 0 ? j + ((((((long) i2) + j) - 1) / ((long) i2)) * ((long) this.f20759e)) : j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29169a(int i) {
        byte[] bArr = this.f20760f;
        if (bArr == null || bArr.length < this.f20761g + i) {
            m35434e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo29174c(byte[] bArr, int i, int i2) {
        if (this.f20760f != null) {
            int min = Math.min(mo29168a(), i2);
            System.arraycopy(this.f20760f, this.f20762h, bArr, i, min);
            this.f20762h += min;
            if (this.f20762h >= this.f20761g) {
                this.f20760f = null;
            }
            return min;
        }
        return this.f20763i ? -1 : 0;
    }

    /* renamed from: a */
    public Object mo29163a(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return mo29161b((byte[]) obj);
        }
        throw new EncoderException("Parameter supplied to Base-N encode is not a byte[]");
    }

    /* renamed from: b */
    public byte[] mo29161b(byte[] bArr) {
        mo29167d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo29166b(bArr, 0, bArr.length);
        mo29166b(bArr, 0, -1);
        byte[] bArr2 = new byte[(this.f20761g - this.f20762h)];
        mo29174c(bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* renamed from: a */
    public byte[] mo29171a(String str) {
        return mo29160a(C7318c.m35468f(str));
    }

    /* renamed from: d */
    public String mo29177d(byte[] bArr) {
        return C7318c.m35467f(mo29161b(bArr));
    }

    /* renamed from: a */
    public byte[] mo29160a(byte[] bArr) {
        mo29167d();
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        mo29164a(bArr, 0, bArr.length);
        mo29164a(bArr, 0, -1);
        byte[] bArr2 = new byte[this.f20761g];
        mo29174c(bArr2, 0, bArr2.length);
        return bArr2;
    }

    /* renamed from: e */
    public String mo29178e(byte[] bArr) {
        return C7318c.m35467f(mo29161b(bArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo29176c(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || mo29165a(b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo29173b(String str) {
        return mo29170a(C7318c.m35468f(str), true);
    }

    /* renamed from: a */
    public boolean mo29170a(byte[] bArr, boolean z) {
        for (int i = 0; i < bArr.length; i++) {
            if (!mo29165a(bArr[i]) && (!z || (bArr[i] != 61 && !m35432b(bArr[i])))) {
                return false;
            }
        }
        return true;
    }
}
