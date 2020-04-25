package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.io.Serializable;
import java.nio.ByteBuffer;
import p201f.p202a.C5952h;

/* renamed from: c.d.d.c.u */
/* compiled from: SipHashFunction */
final class C6591u extends C6535e implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: N */
    private final long f18316N;

    /* renamed from: O */
    private final long f18317O;

    /* renamed from: a */
    private final int f18318a;

    /* renamed from: b */
    private final int f18319b;

    /* renamed from: c.d.d.c.u$a */
    /* compiled from: SipHashFunction */
    private static final class C6592a extends C6536a {

        /* renamed from: l */
        private static final int f18320l = 8;

        /* renamed from: d */
        private final int f18321d;

        /* renamed from: e */
        private final int f18322e;

        /* renamed from: f */
        private long f18323f = 8317987319222330741L;

        /* renamed from: g */
        private long f18324g = 7237128888997146477L;

        /* renamed from: h */
        private long f18325h = 7816392313619706465L;

        /* renamed from: i */
        private long f18326i = 8387220255154660723L;

        /* renamed from: j */
        private long f18327j = 0;

        /* renamed from: k */
        private long f18328k = 0;

        C6592a(int i, int i2, long j, long j2) {
            super(8);
            this.f18321d = i;
            this.f18322e = i2;
            this.f18323f ^= j;
            this.f18324g ^= j2;
            this.f18325h ^= j;
            this.f18326i ^= j2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26445a(ByteBuffer byteBuffer) {
            this.f18327j += 8;
            m31327b(byteBuffer.getLong());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo26447b(ByteBuffer byteBuffer) {
            this.f18327j += (long) byteBuffer.remaining();
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                this.f18328k ^= (((long) byteBuffer.get()) & 255) << i;
                i += 8;
            }
        }

        /* renamed from: b */
        public C6558k mo26446b() {
            this.f18328k ^= this.f18327j << 56;
            m31327b(this.f18328k);
            this.f18325h ^= 255;
            m31326b(this.f18322e);
            return C6558k.m31196a(((this.f18323f ^ this.f18324g) ^ this.f18325h) ^ this.f18326i);
        }

        /* renamed from: b */
        private void m31327b(long j) {
            this.f18326i ^= j;
            m31326b(this.f18321d);
            this.f18323f = j ^ this.f18323f;
        }

        /* renamed from: b */
        private void m31326b(int i) {
            for (int i2 = 0; i2 < i; i2++) {
                long j = this.f18323f;
                long j2 = this.f18324g;
                this.f18323f = j + j2;
                this.f18325h += this.f18326i;
                this.f18324g = Long.rotateLeft(j2, 13);
                this.f18326i = Long.rotateLeft(this.f18326i, 16);
                long j3 = this.f18324g;
                long j4 = this.f18323f;
                this.f18324g = j3 ^ j4;
                this.f18326i ^= this.f18325h;
                this.f18323f = Long.rotateLeft(j4, 32);
                long j5 = this.f18325h;
                long j6 = this.f18324g;
                this.f18325h = j5 + j6;
                this.f18323f += this.f18326i;
                this.f18324g = Long.rotateLeft(j6, 17);
                this.f18326i = Long.rotateLeft(this.f18326i, 21);
                long j7 = this.f18324g;
                long j8 = this.f18325h;
                this.f18324g = j7 ^ j8;
                this.f18326i ^= this.f18323f;
                this.f18325h = Long.rotateLeft(j8, 32);
            }
        }
    }

    C6591u(int i, int i2, long j, long j2) {
        C7397x.m35672a(i > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", Integer.valueOf(i));
        C7397x.m35672a(i2 > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", Integer.valueOf(i2));
        this.f18318a = i;
        this.f18319b = i2;
        this.f18316N = j;
        this.f18317O = j2;
    }

    /* renamed from: a */
    public C6563m mo26428a() {
        C6592a aVar = new C6592a(this.f18318a, this.f18319b, this.f18316N, this.f18317O);
        return aVar;
    }

    /* renamed from: d */
    public int mo26468d() {
        return 64;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6591u)) {
            return false;
        }
        C6591u uVar = (C6591u) obj;
        if (this.f18318a == uVar.f18318a && this.f18319b == uVar.f18319b && this.f18316N == uVar.f18316N && this.f18317O == uVar.f18317O) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) ((((long) ((C6591u.class.hashCode() ^ this.f18318a) ^ this.f18319b)) ^ this.f18316N) ^ this.f18317O);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hashing.sipHash");
        sb.append(this.f18318a);
        sb.append("");
        sb.append(this.f18319b);
        sb.append("(");
        sb.append(this.f18316N);
        sb.append(", ");
        sb.append(this.f18317O);
        sb.append(")");
        return sb.toString();
    }
}
