package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: c.d.d.c.q */
/* compiled from: MessageDigestHashFunction */
final class C6582q extends C6535e implements Serializable {

    /* renamed from: N */
    private final boolean f18293N;

    /* renamed from: O */
    private final String f18294O;

    /* renamed from: a */
    private final MessageDigest f18295a;

    /* renamed from: b */
    private final int f18296b;

    /* renamed from: c.d.d.c.q$b */
    /* compiled from: MessageDigestHashFunction */
    private static final class C6584b extends C6528a {

        /* renamed from: b */
        private final MessageDigest f18297b;

        /* renamed from: c */
        private final int f18298c;

        /* renamed from: d */
        private boolean f18299d;

        /* renamed from: a */
        public C6558k mo26429a() {
            m31284b();
            this.f18299d = true;
            return this.f18298c == this.f18297b.getDigestLength() ? C6558k.m31199b(this.f18297b.digest()) : C6558k.m31199b(C6582q.m31280b(this.f18297b.digest(), this.f18298c));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26424b(byte b) {
            m31284b();
            this.f18297b.update(b);
        }

        private C6584b(MessageDigest messageDigest, int i) {
            this.f18297b = messageDigest;
            this.f18298c = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26425b(byte[] bArr) {
            m31284b();
            this.f18297b.update(bArr);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26426b(byte[] bArr, int i, int i2) {
            m31284b();
            this.f18297b.update(bArr, i, i2);
        }

        /* renamed from: b */
        private void m31284b() {
            C7397x.m35677b(!this.f18299d, (Object) "Cannot re-use a Hasher after calling hash() on it");
        }
    }

    /* renamed from: c.d.d.c.q$c */
    /* compiled from: MessageDigestHashFunction */
    private static final class C6585c implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final String f18300N;

        /* renamed from: a */
        private final String f18301a;

        /* renamed from: b */
        private final int f18302b;

        private Object readResolve() {
            return new C6582q(this.f18301a, this.f18302b, this.f18300N);
        }

        private C6585c(String str, int i, String str2) {
            this.f18301a = str;
            this.f18302b = i;
            this.f18300N = str2;
        }
    }

    C6582q(String str, String str2) {
        this.f18295a = m31279b(str);
        this.f18296b = this.f18295a.getDigestLength();
        this.f18294O = (String) C7397x.m35664a(str2);
        this.f18293N = m31281e();
    }

    /* renamed from: b */
    private static MessageDigest m31279b(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    private boolean m31281e() {
        try {
            this.f18295a.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public int mo26468d() {
        return this.f18296b * 8;
    }

    public String toString() {
        return this.f18294O;
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C6585c(this.f18295a.getAlgorithm(), this.f18296b, this.f18294O);
    }

    /* renamed from: a */
    public C6563m mo26428a() {
        if (this.f18293N) {
            try {
                return new C6584b((MessageDigest) this.f18295a.clone(), this.f18296b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C6584b(m31279b(this.f18295a.getAlgorithm()), this.f18296b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m31280b(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, Math.min(i, bArr.length));
        return bArr2;
    }

    C6582q(String str, int i, String str2) {
        this.f18294O = (String) C7397x.m35664a(str2);
        this.f18295a = m31279b(str);
        int digestLength = this.f18295a.getDigestLength();
        C7397x.m35672a(i >= 4 && i <= digestLength, "bytes (%s) must be >= 4 and < %s", Integer.valueOf(i), Integer.valueOf(digestLength));
        this.f18296b = i;
        this.f18293N = m31281e();
    }
}
