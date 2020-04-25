package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p481d;

/* renamed from: i.b.a.a.c.j.c.d.a */
/* compiled from: CRC64 */
public final class C13999a {

    /* renamed from: a */
    private static final long f41151a = -2882303761517117440L;

    /* renamed from: b */
    private static final long[] f41152b = new long[256];

    static {
        for (int i = 0; i < 256; i++) {
            long j = (long) i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j & 1) == 1 ? (j >>> 1) ^ f41151a : j >>> 1;
            }
            f41152b[i] = j;
        }
    }

    private C13999a() {
    }

    /* renamed from: a */
    public static long m60371a(byte[] bArr) {
        long j = 0;
        for (byte b : bArr) {
            j = (j >>> 8) ^ f41152b[(b ^ ((int) j)) & 255];
        }
        return j;
    }
}
