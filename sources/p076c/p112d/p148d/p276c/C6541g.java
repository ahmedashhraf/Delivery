package p076c.p112d.p148d.p276c;

import com.google.common.base.C7397x;
import java.math.RoundingMode;
import java.util.Arrays;
import p076c.p112d.p148d.p150g.C6637f;
import p076c.p112d.p148d.p150g.C6641g;
import p076c.p112d.p148d.p278e.C6604e;

/* renamed from: c.d.d.c.g */
/* compiled from: BloomFilterStrategies */
enum C6541g implements C6540c {
    MURMUR128_MITZ_32 {
        /* renamed from: a */
        public <T> boolean mo26457a(T t, C6548i<? super T> iVar, int i, C6544c cVar) {
            long b = cVar.mo26463b();
            long e = C6564n.m31266e().mo26439a(t, iVar).mo26496e();
            int i2 = (int) e;
            int i3 = (int) (e >>> 32);
            boolean z = false;
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 ^= -1;
                }
                z |= cVar.mo26464b(((long) i5) % b);
            }
            return z;
        }

        /* renamed from: b */
        public <T> boolean mo26458b(T t, C6548i<? super T> iVar, int i, C6544c cVar) {
            long b = cVar.mo26463b();
            long e = C6564n.m31266e().mo26439a(t, iVar).mo26496e();
            int i2 = (int) e;
            int i3 = (int) (e >>> 32);
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = (i4 * i3) + i2;
                if (i5 < 0) {
                    i5 ^= -1;
                }
                if (!cVar.mo26462a(((long) i5) % b)) {
                    return false;
                }
            }
            return true;
        }
    },
    MURMUR128_MITZ_64 {
        /* renamed from: a */
        public <T> boolean mo26457a(T t, C6548i<? super T> iVar, int i, C6544c cVar) {
            long b = cVar.mo26463b();
            byte[] g = C6564n.m31266e().mo26439a(t, iVar).mo26499g();
            long a = m31158a(g);
            long b2 = m31159b(g);
            long j = a;
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                z |= cVar.mo26464b((Long.MAX_VALUE & j) % b);
                j += b2;
            }
            return z;
        }

        /* renamed from: b */
        public <T> boolean mo26458b(T t, C6548i<? super T> iVar, int i, C6544c cVar) {
            long b = cVar.mo26463b();
            byte[] g = C6564n.m31266e().mo26439a(t, iVar).mo26499g();
            long a = m31158a(g);
            long b2 = m31159b(g);
            long j = a;
            for (int i2 = 0; i2 < i; i2++) {
                if (!cVar.mo26462a((Long.MAX_VALUE & j) % b)) {
                    return false;
                }
                j += b2;
            }
            return true;
        }

        /* renamed from: a */
        private long m31158a(byte[] bArr) {
            return C6641g.m31694a(bArr[7], bArr[6], bArr[5], bArr[4], bArr[3], bArr[2], bArr[1], bArr[0]);
        }

        /* renamed from: b */
        private long m31159b(byte[] bArr) {
            return C6641g.m31694a(bArr[15], bArr[14], bArr[13], bArr[12], bArr[11], bArr[10], bArr[9], bArr[8]);
        }
    };

    /* renamed from: c.d.d.c.g$c */
    /* compiled from: BloomFilterStrategies */
    static final class C6544c {

        /* renamed from: a */
        final long[] f18262a;

        /* renamed from: b */
        long f18263b;

        C6544c(long j) {
            this(new long[C6637f.m31659a(C6604e.m31396a(j, 64, RoundingMode.CEILING))]);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo26462a(long j) {
            return ((1 << ((int) j)) & this.f18262a[(int) (j >>> 6)]) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo26464b(long j) {
            if (mo26462a(j)) {
                return false;
            }
            long[] jArr = this.f18262a;
            int i = (int) (j >>> 6);
            jArr[i] = (1 << ((int) j)) | jArr[i];
            this.f18263b++;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C6544c mo26465c() {
            return new C6544c((long[]) this.f18262a.clone());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6544c)) {
                return false;
            }
            return Arrays.equals(this.f18262a, ((C6544c) obj).f18262a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f18262a);
        }

        C6544c(long[] jArr) {
            C7397x.m35671a(jArr.length > 0, (Object) "data length is zero!");
            this.f18262a = jArr;
            long j = 0;
            for (long bitCount : jArr) {
                j += (long) Long.bitCount(bitCount);
            }
            this.f18263b = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo26460a() {
            return this.f18263b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26461a(C6544c cVar) {
            int i = 0;
            C7397x.m35672a(this.f18262a.length == cVar.f18262a.length, "BitArrays must be of equal length (%s != %s)", Integer.valueOf(this.f18262a.length), Integer.valueOf(cVar.f18262a.length));
            this.f18263b = 0;
            while (true) {
                long[] jArr = this.f18262a;
                if (i < jArr.length) {
                    jArr[i] = jArr[i] | cVar.f18262a[i];
                    this.f18263b += (long) Long.bitCount(jArr[i]);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public long mo26463b() {
            return ((long) this.f18262a.length) * 64;
        }
    }
}
