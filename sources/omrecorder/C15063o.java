package omrecorder;

/* renamed from: omrecorder.o */
/* compiled from: WavHeader */
final class C15063o {

    /* renamed from: a */
    private final C15051i f43798a;

    /* renamed from: b */
    private final long f43799b;

    C15063o(C15051i iVar, long j) {
        this.f43798a = iVar;
        this.f43799b = j;
    }

    /* renamed from: a */
    public byte[] mo46718a() {
        long b = (long) this.f43798a.mo46715e().mo46696b();
        int i = this.f43798a.mo46715e().mo46697c() == 16 ? 1 : 2;
        byte d = this.f43798a.mo46715e().mo46698d();
        long j = this.f43799b;
        return m66740a(j - 44, (j - 44) + 36, b, i, ((((long) d) * b) * ((long) i)) / 8, d);
    }

    /* renamed from: a */
    private byte[] m66740a(long j, long j2, long j3, int i, long j4, byte b) {
        int i2 = i;
        return new byte[]{82, 73, 70, 70, (byte) ((int) (j2 & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) i2, 0, (byte) ((int) (j3 & 255)), (byte) ((int) ((j3 >> 8) & 255)), (byte) ((int) ((j3 >> 16) & 255)), (byte) ((int) ((j3 >> 24) & 255)), (byte) ((int) (j4 & 255)), (byte) ((int) ((j4 >> 8) & 255)), (byte) ((int) ((j4 >> 16) & 255)), (byte) ((int) ((j4 >> 24) & 255)), (byte) (i2 * (b / 8)), 0, b, 0, 100, 97, 116, 97, (byte) ((int) (j & 255)), (byte) ((int) ((j >> 8) & 255)), (byte) ((int) ((j >> 16) & 255)), (byte) ((int) ((j >> 24) & 255))};
    }
}
