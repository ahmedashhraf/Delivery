package p076c.p112d.p148d.p276c;

import com.google.common.base.C7344g0;
import com.google.common.base.C7397x;
import java.util.Iterator;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.jivesoftware.smack.util.StringUtils;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

@C2775a
/* renamed from: c.d.d.c.n */
/* compiled from: Hashing */
public final class C6564n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int f18277a = ((int) System.currentTimeMillis());

    /* renamed from: c.d.d.c.n$b */
    /* compiled from: Hashing */
    private static class C6566b {

        /* renamed from: a */
        static final C6562l f18278a = C6564n.m31261b(C6567c.ADLER_32, "Hashing.adler32()");

        private C6566b() {
        }
    }

    /* renamed from: c.d.d.c.n$c */
    /* compiled from: Hashing */
    enum C6567c implements C7344g0<Checksum> {
        CRC_32(32) {
            public Checksum get() {
                return new CRC32();
            }
        },
        ADLER_32(32) {
            public Checksum get() {
                return new Adler32();
            }
        };
        
        /* access modifiers changed from: private */
        public final int bits;

        public abstract Checksum get();

        private C6567c(int i) {
            this.bits = i;
        }
    }

    @C2778d
    /* renamed from: c.d.d.c.n$d */
    /* compiled from: Hashing */
    static final class C6570d extends C6529b {

        /* renamed from: N */
        private final int f18279N;

        C6570d(C6562l... lVarArr) {
            super(lVarArr);
            int i = 0;
            for (C6562l d : lVarArr) {
                i += d.mo26468d();
            }
            this.f18279N = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C6558k mo26427a(C6563m[] mVarArr) {
            byte[] bArr = new byte[(this.f18279N / 8)];
            int i = 0;
            for (C6563m a : mVarArr) {
                C6558k a2 = a.mo26429a();
                i += a2.mo26492a(bArr, i, a2.mo26498f() / 8);
            }
            return C6558k.m31199b(bArr);
        }

        /* renamed from: d */
        public int mo26468d() {
            return this.f18279N;
        }

        public boolean equals(@C5952h Object obj) {
            if (obj instanceof C6570d) {
                C6570d dVar = (C6570d) obj;
                if (this.f18279N == dVar.f18279N && this.f18243a.length == dVar.f18243a.length) {
                    int i = 0;
                    while (true) {
                        C6562l[] lVarArr = this.f18243a;
                        if (i >= lVarArr.length) {
                            return true;
                        }
                        if (!lVarArr[i].equals(dVar.f18243a[i])) {
                            return false;
                        }
                        i++;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f18279N;
            for (C6562l hashCode : this.f18243a) {
                i ^= hashCode.hashCode();
            }
            return i;
        }
    }

    /* renamed from: c.d.d.c.n$e */
    /* compiled from: Hashing */
    private static class C6571e {

        /* renamed from: a */
        static final C6562l f18280a = C6564n.m31261b(C6567c.CRC_32, "Hashing.crc32()");

        private C6571e() {
        }
    }

    /* renamed from: c.d.d.c.n$f */
    /* compiled from: Hashing */
    private static final class C6572f {

        /* renamed from: a */
        private long f18281a;

        public C6572f(long j) {
            this.f18281a = j;
        }

        /* renamed from: a */
        public double mo26505a() {
            this.f18281a = (this.f18281a * 2862933555777941757L) + 1;
            double d = (double) (((int) (this.f18281a >>> 33)) + 1);
            Double.isNaN(d);
            return d / 2.147483648E9d;
        }
    }

    /* renamed from: c.d.d.c.n$g */
    /* compiled from: Hashing */
    private static class C6573g {

        /* renamed from: a */
        static final C6562l f18282a = new C6582q(StringUtils.MD5, "Hashing.md5()");

        private C6573g() {
        }
    }

    /* renamed from: c.d.d.c.n$h */
    /* compiled from: Hashing */
    private static class C6574h {

        /* renamed from: a */
        static final C6562l f18283a = new C6586r(0);

        /* renamed from: b */
        static final C6562l f18284b = C6564n.m31263c(C6564n.f18277a);

        private C6574h() {
        }
    }

    /* renamed from: c.d.d.c.n$i */
    /* compiled from: Hashing */
    private static class C6575i {

        /* renamed from: a */
        static final C6562l f18285a = new C6588s(0);

        /* renamed from: b */
        static final C6562l f18286b = C6564n.m31265d(C6564n.f18277a);

        private C6575i() {
        }
    }

    /* renamed from: c.d.d.c.n$j */
    /* compiled from: Hashing */
    private static class C6576j {

        /* renamed from: a */
        static final C6562l f18287a = new C6582q("SHA-1", "Hashing.sha1()");

        private C6576j() {
        }
    }

    /* renamed from: c.d.d.c.n$k */
    /* compiled from: Hashing */
    private static class C6577k {

        /* renamed from: a */
        static final C6562l f18288a = new C6582q(C14248i.f42026i, "Hashing.sha256()");

        private C6577k() {
        }
    }

    /* renamed from: c.d.d.c.n$l */
    /* compiled from: Hashing */
    private static class C6578l {

        /* renamed from: a */
        static final C6562l f18289a = new C6582q("SHA-512", "Hashing.sha512()");

        private C6578l() {
        }
    }

    /* renamed from: c.d.d.c.n$m */
    /* compiled from: Hashing */
    private static class C6579m {

        /* renamed from: a */
        static final C6562l f18290a;

        static {
            C6591u uVar = new C6591u(2, 4, 506097522914230528L, 1084818905618843912L);
            f18290a = uVar;
        }

        private C6579m() {
        }
    }

    private C6564n() {
    }

    /* renamed from: b */
    public static C6562l m31260b(int i) {
        int a = m31252a(i);
        if (a == 32) {
            return C6575i.f18286b;
        }
        if (a <= 128) {
            return C6574h.f18284b;
        }
        int i2 = (a + C13959t.f40827P1) / 128;
        C6562l[] lVarArr = new C6562l[i2];
        lVarArr[0] = C6574h.f18284b;
        int i3 = f18277a;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 += 1500450271;
            lVarArr[i4] = m31263c(i3);
        }
        return new C6570d(lVarArr);
    }

    /* renamed from: c */
    public static C6562l m31263c(int i) {
        return new C6586r(i);
    }

    /* renamed from: d */
    public static C6562l m31265d(int i) {
        return new C6588s(i);
    }

    /* renamed from: e */
    public static C6562l m31266e() {
        return C6574h.f18283a;
    }

    /* renamed from: f */
    public static C6562l m31267f() {
        return C6575i.f18285a;
    }

    /* renamed from: g */
    public static C6562l m31268g() {
        return C6576j.f18287a;
    }

    /* renamed from: h */
    public static C6562l m31269h() {
        return C6577k.f18288a;
    }

    /* renamed from: i */
    public static C6562l m31270i() {
        return C6578l.f18289a;
    }

    /* renamed from: j */
    public static C6562l m31271j() {
        return C6579m.f18290a;
    }

    /* renamed from: c */
    public static C6562l m31262c() {
        return C6571e.f18280a;
    }

    /* renamed from: d */
    public static C6562l m31264d() {
        return C6573g.f18282a;
    }

    /* renamed from: a */
    public static C6562l m31256a(long j, long j2) {
        C6591u uVar = new C6591u(2, 4, j, j2);
        return uVar;
    }

    /* renamed from: a */
    public static int m31254a(C6558k kVar, int i) {
        return m31253a(kVar.mo26500h(), i);
    }

    /* renamed from: a */
    public static int m31253a(long j, int i) {
        int i2 = 0;
        C7397x.m35672a(i > 0, "buckets must be positive: %s", Integer.valueOf(i));
        C6572f fVar = new C6572f(j);
        while (true) {
            double d = (double) (i2 + 1);
            double a = fVar.mo26505a();
            Double.isNaN(d);
            int i3 = (int) (d / a);
            if (i3 < 0 || i3 >= i) {
                return i2;
            }
            i2 = i3;
        }
        return i2;
    }

    /* renamed from: a */
    public static C6558k m31255a(Iterable<C6558k> iterable) {
        Iterator it = iterable.iterator();
        C7397x.m35671a(it.hasNext(), (Object) "Must be at least 1 hash code to combine.");
        byte[] bArr = new byte[(((C6558k) it.next()).mo26498f() / 8)];
        for (C6558k a : iterable) {
            byte[] a2 = a.mo26493a();
            C7397x.m35671a(a2.length == bArr.length, (Object) "All hashcodes must have the same bit length.");
            for (int i = 0; i < a2.length; i++) {
                bArr[i] = (byte) ((bArr[i] * 37) ^ a2[i]);
            }
        }
        return C6558k.m31199b(bArr);
    }

    /* renamed from: b */
    public static C6562l m31259b() {
        return C6566b.f18278a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C6562l m31261b(C6567c cVar, String str) {
        return new C6545h(cVar, cVar.bits, str);
    }

    /* renamed from: b */
    public static C6558k m31258b(Iterable<C6558k> iterable) {
        Iterator it = iterable.iterator();
        C7397x.m35671a(it.hasNext(), (Object) "Must be at least 1 hash code to combine.");
        byte[] bArr = new byte[(((C6558k) it.next()).mo26498f() / 8)];
        for (C6558k a : iterable) {
            byte[] a2 = a.mo26493a();
            C7397x.m35671a(a2.length == bArr.length, (Object) "All hashcodes must have the same bit length.");
            for (int i = 0; i < a2.length; i++) {
                bArr[i] = (byte) (bArr[i] + a2[i]);
            }
        }
        return C6558k.m31199b(bArr);
    }

    /* renamed from: a */
    static int m31252a(int i) {
        C7397x.m35671a(i > 0, (Object) "Number of bits must be positive");
        return (i + 31) & -32;
    }
}
