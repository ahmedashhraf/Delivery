package p076c.p112d.p148d.p276c;

import java.io.Serializable;
import java.nio.ByteBuffer;
import p076c.p112d.p148d.p150g.C6653l;
import p201f.p202a.C5952h;

/* renamed from: c.d.d.c.s */
/* compiled from: Murmur3_32HashFunction */
final class C6588s extends C6535e implements Serializable {

    /* renamed from: N */
    private static final int f18310N = 461845907;

    /* renamed from: b */
    private static final int f18311b = -862048943;
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final int f18312a;

    /* renamed from: c.d.d.c.s$a */
    /* compiled from: Murmur3_32HashFunction */
    private static final class C6589a extends C6536a {

        /* renamed from: f */
        private static final int f18313f = 4;

        /* renamed from: d */
        private int f18314d;

        /* renamed from: e */
        private int f18315e = 0;

        C6589a(int i) {
            super(4);
            this.f18314d = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26445a(ByteBuffer byteBuffer) {
            this.f18314d = C6588s.m31303d(this.f18314d, C6588s.m31302d(byteBuffer.getInt()));
            this.f18315e += 4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26447b(ByteBuffer byteBuffer) {
            this.f18315e += byteBuffer.remaining();
            int i = 0;
            int i2 = 0;
            while (byteBuffer.hasRemaining()) {
                i ^= C6653l.m31772a(byteBuffer.get()) << i2;
                i2 += 8;
            }
            this.f18314d ^= C6588s.m31302d(i);
        }

        /* renamed from: b */
        public C6558k mo26446b() {
            return C6588s.m31301c(this.f18314d, this.f18315e);
        }
    }

    C6588s(int i) {
        this.f18312a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31302d(int i) {
        return Integer.rotateLeft(i * f18311b, 15) * f18310N;
    }

    /* renamed from: d */
    public int mo26468d() {
        return 32;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6588s)) {
            return false;
        }
        if (this.f18312a == ((C6588s) obj).f18312a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6588s.class.hashCode() ^ this.f18312a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hashing.murmur3_32(");
        sb.append(this.f18312a);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C6558k m31301c(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return C6558k.m31195a(i5 ^ (i5 >>> 16));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static int m31303d(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* renamed from: a */
    public C6563m mo26428a() {
        return new C6589a(this.f18312a);
    }

    /* renamed from: a */
    public C6558k mo26435a(int i) {
        return m31301c(m31303d(this.f18312a, m31302d(i)), 4);
    }

    /* renamed from: a */
    public C6558k mo26436a(long j) {
        int i = (int) (j >>> 32);
        return m31301c(m31303d(m31303d(this.f18312a, m31302d((int) j)), m31302d(i)), 8);
    }

    /* renamed from: a */
    public C6558k mo26437a(CharSequence charSequence) {
        int i = this.f18312a;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = m31303d(i, m31302d(charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= m31302d(charSequence.charAt(charSequence.length() - 1));
        }
        return m31301c(i, charSequence.length() * 2);
    }
}
