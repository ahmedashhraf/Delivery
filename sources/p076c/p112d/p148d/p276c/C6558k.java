package p076c.p112d.p148d.p276c;

import com.google.common.base.C5785c;
import com.google.common.base.C7397x;
import java.io.Serializable;
import java.security.MessageDigest;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p150g.C6637f;
import p076c.p112d.p148d.p150g.C6658n;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.c.k */
/* compiled from: HashCode */
public abstract class C6558k {

    /* renamed from: a */
    private static final char[] f18273a = "0123456789abcdef".toCharArray();

    /* renamed from: c.d.d.c.k$a */
    /* compiled from: HashCode */
    private static final class C6559a extends C6558k implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final byte[] f18274b;

        C6559a(byte[] bArr) {
            this.f18274b = (byte[]) C7397x.m35664a(bArr);
        }

        /* renamed from: a */
        public byte[] mo26493a() {
            return (byte[]) this.f18274b.clone();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo26494b(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f18274b, 0, bArr, i, i2);
        }

        /* renamed from: d */
        public int mo26495d() {
            C7397x.m35678b(this.f18274b.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(this.f18274b.length));
            byte[] bArr = this.f18274b;
            return ((bArr[3] & 255) << C5785c.f16669B) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
        }

        /* renamed from: e */
        public long mo26496e() {
            C7397x.m35678b(this.f18274b.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", Integer.valueOf(this.f18274b.length));
            return mo26500h();
        }

        /* renamed from: f */
        public int mo26498f() {
            return this.f18274b.length * 8;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public byte[] mo26499g() {
            return this.f18274b;
        }

        /* renamed from: h */
        public long mo26500h() {
            long j = (long) (this.f18274b[0] & 255);
            for (int i = 1; i < Math.min(this.f18274b.length, 8); i++) {
                j |= (((long) this.f18274b[i]) & 255) << (i * 8);
            }
            return j;
        }
    }

    /* renamed from: c.d.d.c.k$b */
    /* compiled from: HashCode */
    private static final class C6560b extends C6558k implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final int f18275b;

        C6560b(int i) {
            this.f18275b = i;
        }

        /* renamed from: a */
        public byte[] mo26493a() {
            int i = this.f18275b;
            return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo26494b(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) (this.f18275b >> (i3 * 8));
            }
        }

        /* renamed from: d */
        public int mo26495d() {
            return this.f18275b;
        }

        /* renamed from: e */
        public long mo26496e() {
            throw new IllegalStateException("this HashCode only has 32 bits; cannot create a long");
        }

        /* renamed from: f */
        public int mo26498f() {
            return 32;
        }

        /* renamed from: h */
        public long mo26500h() {
            return C6658n.m31795b(this.f18275b);
        }
    }

    /* renamed from: c.d.d.c.k$c */
    /* compiled from: HashCode */
    private static final class C6561c extends C6558k implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final long f18276b;

        C6561c(long j) {
            this.f18276b = j;
        }

        /* renamed from: a */
        public byte[] mo26493a() {
            long j = this.f18276b;
            return new byte[]{(byte) ((int) j), (byte) ((int) (j >> 8)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 56))};
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo26494b(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                bArr[i + i3] = (byte) ((int) (this.f18276b >> (i3 * 8)));
            }
        }

        /* renamed from: d */
        public int mo26495d() {
            return (int) this.f18276b;
        }

        /* renamed from: e */
        public long mo26496e() {
            return this.f18276b;
        }

        /* renamed from: f */
        public int mo26498f() {
            return 64;
        }

        /* renamed from: h */
        public long mo26500h() {
            return this.f18276b;
        }
    }

    C6558k() {
    }

    /* renamed from: b */
    static C6558k m31199b(byte[] bArr) {
        return new C6559a(bArr);
    }

    /* renamed from: a */
    public int mo26492a(byte[] bArr, int i, int i2) {
        int c = C6637f.m31678c(i2, mo26498f() / 8);
        C7397x.m35675b(i, i + c, bArr.length);
        mo26494b(bArr, i, c);
        return c;
    }

    /* renamed from: a */
    public abstract byte[] mo26493a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo26494b(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract int mo26495d();

    /* renamed from: e */
    public abstract long mo26496e();

    public final boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6558k)) {
            return false;
        }
        return MessageDigest.isEqual(mo26493a(), ((C6558k) obj).mo26493a());
    }

    /* renamed from: f */
    public abstract int mo26498f();

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public byte[] mo26499g() {
        return mo26493a();
    }

    /* renamed from: h */
    public abstract long mo26500h();

    public final int hashCode() {
        if (mo26498f() >= 32) {
            return mo26495d();
        }
        byte[] a = mo26493a();
        byte b = a[0] & 255;
        for (int i = 1; i < a.length; i++) {
            b |= (a[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        byte[] a = mo26493a();
        StringBuilder sb = new StringBuilder(a.length * 2);
        for (byte b : a) {
            sb.append(f18273a[(b >> 4) & 15]);
            sb.append(f18273a[b & C5785c.f16698q]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C6558k m31198b(String str) {
        C7397x.m35672a(str.length() >= 2, "input string (%s) must have at least 2 characters", str);
        C7397x.m35672a(str.length() % 2 == 0, "input string (%s) must have an even number of characters", str);
        byte[] bArr = new byte[(str.length() / 2)];
        for (int i = 0; i < str.length(); i += 2) {
            bArr[i / 2] = (byte) ((m31194a(str.charAt(i)) << 4) + m31194a(str.charAt(i + 1)));
        }
        return m31199b(bArr);
    }

    /* renamed from: a */
    public static C6558k m31195a(int i) {
        return new C6560b(i);
    }

    /* renamed from: a */
    public static C6558k m31196a(long j) {
        return new C6561c(j);
    }

    /* renamed from: a */
    public static C6558k m31197a(byte[] bArr) {
        boolean z = true;
        if (bArr.length < 1) {
            z = false;
        }
        C7397x.m35671a(z, (Object) "A HashCode must contain at least 1 byte.");
        return m31199b((byte[]) bArr.clone());
    }

    /* renamed from: a */
    private static int m31194a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal hexadecimal character: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }
}
