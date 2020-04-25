package p076c.p112d.p148d.p276c;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p201f.p202a.C5952h;

/* renamed from: c.d.d.c.r */
/* compiled from: Murmur3_128HashFunction */
final class C6586r extends C6535e implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final int f18303a;

    /* renamed from: c.d.d.c.r$a */
    /* compiled from: Murmur3_128HashFunction */
    private static final class C6587a extends C6536a {

        /* renamed from: g */
        private static final int f18304g = 16;

        /* renamed from: h */
        private static final long f18305h = -8663945395140668459L;

        /* renamed from: i */
        private static final long f18306i = 5545529020109919103L;

        /* renamed from: d */
        private long f18307d;

        /* renamed from: e */
        private long f18308e;

        /* renamed from: f */
        private int f18309f = 0;

        C6587a(int i) {
            super(16);
            long j = (long) i;
            this.f18307d = j;
            this.f18308e = j;
        }

        /* renamed from: b */
        private static long m31292b(long j) {
            long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
            long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
            return j3 ^ (j3 >>> 33);
        }

        /* renamed from: c */
        private static long m31293c(long j) {
            return Long.rotateLeft(j * f18305h, 31) * f18306i;
        }

        /* renamed from: d */
        private static long m31294d(long j) {
            return Long.rotateLeft(j * f18306i, 33) * f18305h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26445a(ByteBuffer byteBuffer) {
            m31291a(byteBuffer.getLong(), byteBuffer.getLong());
            this.f18309f += 16;
        }

        /* JADX INFO: used method not loaded: c.d.d.g.l.a(byte):null, types can be incorrect */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(11))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0064, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(10))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(9))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0082, code lost:
            r0 = r0 ^ ((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(8)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
            r2 = r12.getLong() ^ 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a3, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(5))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(4))) << 32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c0, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(3))) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(2))) << 16);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(1))) << 8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ea, code lost:
            r2 = ((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(0))) ^ r0;
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f6, code lost:
            r11.f18307d = m31293c(r2) ^ r11.f18307d;
            r11.f18308e = m31294d(r0) ^ r11.f18308e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0108, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(13))) << 40);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0045, code lost:
            r0 = r0 ^ (((long) p076c.p112d.p148d.p150g.C6653l.m31772a(r12.get(12))) << 32);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26447b(java.nio.ByteBuffer r12) {
            /*
                r11 = this;
                int r0 = r11.f18309f
                int r1 = r12.remaining()
                int r0 = r0 + r1
                r11.f18309f = r0
                int r0 = r12.remaining()
                r1 = 48
                r2 = 40
                r3 = 32
                r4 = 24
                r5 = 16
                r6 = 0
                r8 = 8
                switch(r0) {
                    case 1: goto L_0x00e9;
                    case 2: goto L_0x00db;
                    case 3: goto L_0x00cd;
                    case 4: goto L_0x00bf;
                    case 5: goto L_0x00b0;
                    case 6: goto L_0x00a2;
                    case 7: goto L_0x0094;
                    case 8: goto L_0x008d;
                    case 9: goto L_0x0081;
                    case 10: goto L_0x0072;
                    case 11: goto L_0x0063;
                    case 12: goto L_0x0054;
                    case 13: goto L_0x0044;
                    case 14: goto L_0x0035;
                    case 15: goto L_0x0026;
                    default: goto L_0x001e;
                }
            L_0x001e:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                java.lang.String r0 = "Should never get here."
                r12.<init>(r0)
                throw r12
            L_0x0026:
                r0 = 14
                byte r0 = r12.get(r0)
                int r0 = p076c.p112d.p148d.p150g.C6653l.m31772a(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x0036
            L_0x0035:
                r0 = r6
            L_0x0036:
                r9 = 13
                byte r9 = r12.get(r9)
                int r9 = p076c.p112d.p148d.p150g.C6653l.m31772a(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x0045
            L_0x0044:
                r0 = r6
            L_0x0045:
                r2 = 12
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x0055
            L_0x0054:
                r0 = r6
            L_0x0055:
                r2 = 11
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x0064
            L_0x0063:
                r0 = r6
            L_0x0064:
                r2 = 10
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x0073
            L_0x0072:
                r0 = r6
            L_0x0073:
                r2 = 9
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x0082
            L_0x0081:
                r0 = r6
            L_0x0082:
                byte r2 = r12.get(r8)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r0 = r0 ^ r2
                goto L_0x008e
            L_0x008d:
                r0 = r6
            L_0x008e:
                long r2 = r12.getLong()
                long r2 = r2 ^ r6
                goto L_0x00f6
            L_0x0094:
                r0 = 6
                byte r0 = r12.get(r0)
                int r0 = p076c.p112d.p148d.p150g.C6653l.m31772a(r0)
                long r9 = (long) r0
                long r0 = r9 << r1
                long r0 = r0 ^ r6
                goto L_0x00a3
            L_0x00a2:
                r0 = r6
            L_0x00a3:
                r9 = 5
                byte r9 = r12.get(r9)
                int r9 = p076c.p112d.p148d.p150g.C6653l.m31772a(r9)
                long r9 = (long) r9
                long r9 = r9 << r2
                long r0 = r0 ^ r9
                goto L_0x00b1
            L_0x00b0:
                r0 = r6
            L_0x00b1:
                r2 = 4
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r9 = (long) r2
                long r2 = r9 << r3
                long r0 = r0 ^ r2
                goto L_0x00c0
            L_0x00bf:
                r0 = r6
            L_0x00c0:
                r2 = 3
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r2 = r2 << r4
                long r0 = r0 ^ r2
                goto L_0x00ce
            L_0x00cd:
                r0 = r6
            L_0x00ce:
                r2 = 2
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r2 = r2 << r5
                long r0 = r0 ^ r2
                goto L_0x00dc
            L_0x00db:
                r0 = r6
            L_0x00dc:
                r2 = 1
                byte r2 = r12.get(r2)
                int r2 = p076c.p112d.p148d.p150g.C6653l.m31772a(r2)
                long r2 = (long) r2
                long r2 = r2 << r8
                long r0 = r0 ^ r2
                goto L_0x00ea
            L_0x00e9:
                r0 = r6
            L_0x00ea:
                r2 = 0
                byte r12 = r12.get(r2)
                int r12 = p076c.p112d.p148d.p150g.C6653l.m31772a(r12)
                long r2 = (long) r12
                long r2 = r2 ^ r0
                r0 = r6
            L_0x00f6:
                long r4 = r11.f18307d
                long r2 = m31293c(r2)
                long r2 = r2 ^ r4
                r11.f18307d = r2
                long r2 = r11.f18308e
                long r0 = m31294d(r0)
                long r0 = r0 ^ r2
                r11.f18308e = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p148d.p276c.C6586r.C6587a.mo26447b(java.nio.ByteBuffer):void");
        }

        /* renamed from: a */
        private void m31291a(long j, long j2) {
            this.f18307d = m31293c(j) ^ this.f18307d;
            this.f18307d = Long.rotateLeft(this.f18307d, 27);
            long j3 = this.f18307d;
            long j4 = this.f18308e;
            this.f18307d = j3 + j4;
            this.f18307d = (this.f18307d * 5) + 1390208809;
            this.f18308e = m31294d(j2) ^ j4;
            this.f18308e = Long.rotateLeft(this.f18308e, 31);
            this.f18308e += this.f18307d;
            this.f18308e = (this.f18308e * 5) + 944331445;
        }

        /* renamed from: b */
        public C6558k mo26446b() {
            long j = this.f18307d;
            int i = this.f18309f;
            this.f18307d = j ^ ((long) i);
            this.f18308e ^= (long) i;
            long j2 = this.f18307d;
            long j3 = this.f18308e;
            this.f18307d = j2 + j3;
            long j4 = this.f18307d;
            this.f18308e = j3 + j4;
            this.f18307d = m31292b(j4);
            this.f18308e = m31292b(this.f18308e);
            long j5 = this.f18307d;
            long j6 = this.f18308e;
            this.f18307d = j5 + j6;
            this.f18308e = j6 + this.f18307d;
            return C6558k.m31199b(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f18307d).putLong(this.f18308e).array());
        }
    }

    C6586r(int i) {
        this.f18303a = i;
    }

    /* renamed from: a */
    public C6563m mo26428a() {
        return new C6587a(this.f18303a);
    }

    /* renamed from: d */
    public int mo26468d() {
        return 128;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6586r)) {
            return false;
        }
        if (this.f18303a == ((C6586r) obj).f18303a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6586r.class.hashCode() ^ this.f18303a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hashing.murmur3_128(");
        sb.append(this.f18303a);
        sb.append(")");
        return sb.toString();
    }
}
