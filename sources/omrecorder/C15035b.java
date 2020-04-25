package omrecorder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: omrecorder.b */
/* compiled from: AudioChunk */
public interface C15035b {

    /* renamed from: omrecorder.b$a */
    /* compiled from: AudioChunk */
    public static final class C15036a implements C15035b {

        /* renamed from: c */
        private static final double f43759c = 0.6d;

        /* renamed from: a */
        private final byte[] f43760a;

        /* renamed from: b */
        private int f43761b;

        C15036a(byte[] bArr) {
            this.f43760a = bArr;
        }

        /* renamed from: a */
        public byte[] mo46690a() {
            return this.f43760a;
        }

        /* renamed from: b */
        public int mo46691b() {
            return this.f43761b;
        }

        /* renamed from: c */
        public short[] mo46692c() {
            byte[] bArr = this.f43760a;
            short[] sArr = new short[(bArr.length / 2)];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
            return sArr;
        }

        /* renamed from: d */
        public double mo46693d() {
            short[] c = mo46692c();
            int length = c.length;
            short s = 0;
            for (int i = 0; i < length; i++) {
                if (c[i] >= s) {
                    s = c[i];
                }
            }
            double d = (double) s;
            Double.isNaN(d);
            return (double) ((int) (Math.log10(d / f43759c) * 20.0d));
        }

        /* renamed from: a */
        public void mo46689a(int i) {
            this.f43761b = i;
        }
    }

    /* renamed from: omrecorder.b$b */
    /* compiled from: AudioChunk */
    public static final class C15037b implements C15035b {

        /* renamed from: c */
        private static final short f43762c = 2700;

        /* renamed from: d */
        private static final double f43763d = 0.6d;

        /* renamed from: a */
        private final short[] f43764a;

        /* renamed from: b */
        private int f43765b;

        C15037b(short[] sArr) {
            this.f43764a = sArr;
        }

        /* renamed from: a */
        public byte[] mo46690a() {
            byte[] bArr = new byte[(this.f43765b * 2)];
            int i = 0;
            int i2 = 0;
            while (i != this.f43765b) {
                short[] sArr = this.f43764a;
                bArr[i2] = (byte) (sArr[i] & 255);
                bArr[i2 + 1] = (byte) ((sArr[i] & 65280) >> 8);
                i++;
                i2 += 2;
            }
            return bArr;
        }

        /* renamed from: b */
        public int mo46691b() {
            return this.f43765b;
        }

        /* renamed from: c */
        public short[] mo46692c() {
            return this.f43764a;
        }

        /* renamed from: d */
        public double mo46693d() {
            int length = this.f43764a.length;
            short s = 0;
            for (int i = 0; i < length; i++) {
                short[] sArr = this.f43764a;
                if (sArr[i] >= s) {
                    s = sArr[i];
                }
            }
            double d = (double) s;
            Double.isNaN(d);
            return (double) ((int) (Math.log10(d / f43763d) * 20.0d));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo46694e() {
            int length = this.f43764a.length;
            for (int i = 0; i < length; i++) {
                short[] sArr = this.f43764a;
                if (sArr[i] >= 2700 || sArr[i] <= -2700) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo46689a(int i) {
            this.f43765b = i;
        }
    }

    /* renamed from: a */
    void mo46689a(int i);

    /* renamed from: a */
    byte[] mo46690a();

    /* renamed from: b */
    int mo46691b();

    /* renamed from: c */
    short[] mo46692c();

    /* renamed from: d */
    double mo46693d();
}
