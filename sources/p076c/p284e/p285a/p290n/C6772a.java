package p076c.p284e.p285a.p290n;

import androidx.core.p034l.C0986h;
import com.google.common.base.C5785c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: c.e.a.n.a */
/* compiled from: Base64 */
public class C6772a {

    /* renamed from: a */
    public static final int f18820a = 0;

    /* renamed from: b */
    public static final int f18821b = 1;

    /* renamed from: c */
    public static final int f18822c = 0;

    /* renamed from: d */
    public static final int f18823d = 2;

    /* renamed from: e */
    public static final int f18824e = 4;

    /* renamed from: f */
    public static final int f18825f = 8;

    /* renamed from: g */
    public static final int f18826g = 16;

    /* renamed from: h */
    public static final int f18827h = 32;

    /* renamed from: i */
    private static final int f18828i = 76;

    /* renamed from: j */
    private static final byte f18829j = 61;

    /* renamed from: k */
    private static final byte f18830k = 10;

    /* renamed from: l */
    private static final String f18831l = "US-ASCII";

    /* renamed from: m */
    private static final byte f18832m = -5;

    /* renamed from: n */
    private static final byte f18833n = -1;

    /* renamed from: o */
    private static final byte[] f18834o = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: p */
    private static final byte[] f18835p = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f18832m, f18832m, -9, -9, f18832m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f18832m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, f18829j, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, C5785c.f16694m, C5785c.f16695n, 13, C5785c.f16697p, C5785c.f16698q, 16, 17, C5785c.f16702u, 19, C5785c.f16705x, C5785c.f16706y, C5785c.f16707z, C5785c.f16668A, C5785c.f16669B, C5785c.f16670C, -9, -9, -9, -9, -9, -9, C5785c.f16671D, C5785c.f16672E, C5785c.f16673F, C5785c.f16674G, C5785c.f16675H, C5785c.f16676I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: q */
    private static final byte[] f18836q = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: r */
    private static final byte[] f18837r = {-9, -9, -9, -9, -9, -9, -9, -9, -9, f18832m, f18832m, -9, -9, f18832m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, f18832m, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, f18829j, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, C5785c.f16694m, C5785c.f16695n, 13, C5785c.f16697p, C5785c.f16698q, 16, 17, C5785c.f16702u, 19, C5785c.f16705x, C5785c.f16706y, C5785c.f16707z, C5785c.f16668A, C5785c.f16669B, C5785c.f16670C, -9, -9, -9, -9, 63, -9, C5785c.f16671D, C5785c.f16672E, C5785c.f16673F, C5785c.f16674G, C5785c.f16675H, C5785c.f16676I, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: s */
    private static final byte[] f18838s = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: t */
    private static final byte[] f18839t;

    /* renamed from: u */
    static final /* synthetic */ boolean f18840u = false;

    /* renamed from: c.e.a.n.a$a */
    /* compiled from: Base64 */
    static class C6773a extends ObjectInputStream {

        /* renamed from: a */
        final /* synthetic */ ClassLoader f18841a;

        C6773a(InputStream inputStream, ClassLoader classLoader) {
            this.f18841a = classLoader;
            super(inputStream);
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, this.f18841a);
            return cls == null ? super.resolveClass(objectStreamClass) : cls;
        }
    }

    /* renamed from: c.e.a.n.a$b */
    /* compiled from: Base64 */
    public static class C6774b extends FilterInputStream {

        /* renamed from: N */
        private byte[] f18842N;

        /* renamed from: O */
        private int f18843O;

        /* renamed from: P */
        private int f18844P;

        /* renamed from: Q */
        private int f18845Q;

        /* renamed from: R */
        private boolean f18846R;

        /* renamed from: S */
        private int f18847S;

        /* renamed from: T */
        private byte[] f18848T;

        /* renamed from: a */
        private boolean f18849a;

        /* renamed from: b */
        private int f18850b;

        public C6774b(InputStream inputStream) {
            this(inputStream, 0);
        }

        public int read() throws IOException {
            int read;
            if (this.f18850b < 0) {
                if (this.f18849a) {
                    byte[] bArr = new byte[3];
                    int i = 0;
                    for (int i2 = 0; i2 < 3; i2++) {
                        int read2 = this.in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i2] = (byte) read2;
                        i++;
                    }
                    if (i <= 0) {
                        return -1;
                    }
                    C6772a.m32416b(bArr, 0, i, this.f18842N, 0, this.f18847S);
                    this.f18850b = 0;
                    this.f18844P = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i3 = 0;
                    while (i3 < 4) {
                        do {
                            read = this.in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.f18848T[read & C13959t.f40827P1] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i3] = (byte) read;
                        i3++;
                    }
                    if (i3 == 4) {
                        this.f18844P = C6772a.m32410b(bArr2, 0, this.f18842N, 0, this.f18847S);
                        this.f18850b = 0;
                    } else if (i3 == 0) {
                        return -1;
                    } else {
                        throw new IOException("Improperly padded Base64 input.");
                    }
                }
            }
            int i4 = this.f18850b;
            if (i4 < 0) {
                throw new IOException("Error in Base64 code reading stream.");
            } else if (i4 >= this.f18844P) {
                return -1;
            } else {
                if (!this.f18849a || !this.f18846R || this.f18845Q < 76) {
                    this.f18845Q++;
                    byte[] bArr3 = this.f18842N;
                    int i5 = this.f18850b;
                    this.f18850b = i5 + 1;
                    byte b = bArr3[i5];
                    if (this.f18850b >= this.f18843O) {
                        this.f18850b = -1;
                    }
                    return b & 255;
                }
                this.f18845Q = 0;
                return 10;
            }
        }

        public C6774b(InputStream inputStream, int i) {
            super(inputStream);
            this.f18847S = i;
            boolean z = true;
            this.f18846R = (i & 8) > 0;
            if ((i & 1) <= 0) {
                z = false;
            }
            this.f18849a = z;
            this.f18843O = this.f18849a ? 4 : 3;
            this.f18842N = new byte[this.f18843O];
            this.f18850b = -1;
            this.f18845Q = 0;
            this.f18848T = C6772a.m32420c(i);
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i + i3] = (byte) read;
                    i3++;
                } else if (i3 == 0) {
                    return -1;
                }
            }
            return i3;
        }
    }

    /* renamed from: c.e.a.n.a$c */
    /* compiled from: Base64 */
    public static class C6775c extends FilterOutputStream {

        /* renamed from: N */
        private byte[] f18851N;

        /* renamed from: O */
        private int f18852O;

        /* renamed from: P */
        private int f18853P;

        /* renamed from: Q */
        private boolean f18854Q;

        /* renamed from: R */
        private byte[] f18855R;

        /* renamed from: S */
        private boolean f18856S;

        /* renamed from: T */
        private int f18857T;

        /* renamed from: U */
        private byte[] f18858U;

        /* renamed from: a */
        private boolean f18859a;

        /* renamed from: b */
        private int f18860b;

        public C6775c(OutputStream outputStream) {
            this(outputStream, 1);
        }

        /* renamed from: a */
        public void mo27050a() throws IOException {
            int i = this.f18860b;
            if (i <= 0) {
                return;
            }
            if (this.f18859a) {
                this.out.write(C6772a.m32417b(this.f18855R, this.f18851N, i, this.f18857T));
                this.f18860b = 0;
                return;
            }
            throw new IOException("Base64 input not properly padded.");
        }

        public void close() throws IOException {
            mo27050a();
            super.close();
            this.f18851N = null;
            this.out = null;
        }

        /* renamed from: d */
        public void mo27052d() {
            this.f18856S = false;
        }

        /* renamed from: e */
        public void mo27053e() throws IOException {
            mo27050a();
            this.f18856S = true;
        }

        public void write(int i) throws IOException {
            if (this.f18856S) {
                this.out.write(i);
                return;
            }
            if (this.f18859a) {
                byte[] bArr = this.f18851N;
                int i2 = this.f18860b;
                this.f18860b = i2 + 1;
                bArr[i2] = (byte) i;
                int i3 = this.f18860b;
                int i4 = this.f18852O;
                if (i3 >= i4) {
                    this.out.write(C6772a.m32417b(this.f18855R, bArr, i4, this.f18857T));
                    this.f18853P += 4;
                    if (this.f18854Q && this.f18853P >= 76) {
                        this.out.write(10);
                        this.f18853P = 0;
                    }
                    this.f18860b = 0;
                }
            } else {
                byte[] bArr2 = this.f18858U;
                int i5 = i & C13959t.f40827P1;
                if (bArr2[i5] > -5) {
                    byte[] bArr3 = this.f18851N;
                    int i6 = this.f18860b;
                    this.f18860b = i6 + 1;
                    bArr3[i6] = (byte) i;
                    if (this.f18860b >= this.f18852O) {
                        this.out.write(this.f18855R, 0, C6772a.m32410b(bArr3, 0, this.f18855R, 0, this.f18857T));
                        this.f18860b = 0;
                    }
                } else if (bArr2[i5] != -5) {
                    throw new IOException("Invalid character in Base64 data.");
                }
            }
        }

        public C6775c(OutputStream outputStream, int i) {
            super(outputStream);
            boolean z = true;
            this.f18854Q = (i & 8) != 0;
            if ((i & 1) == 0) {
                z = false;
            }
            this.f18859a = z;
            this.f18852O = this.f18859a ? 3 : 4;
            this.f18851N = new byte[this.f18852O];
            this.f18860b = 0;
            this.f18853P = 0;
            this.f18856S = false;
            this.f18855R = new byte[4];
            this.f18857T = i;
            this.f18858U = C6772a.m32420c(i);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.f18856S) {
                this.out.write(bArr, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(bArr[i + i3]);
            }
        }
    }

    static {
        byte[] bArr = new byte[C0986h.f4407i];
        // fill-array-data instruction
        bArr[0] = -9;
        bArr[1] = -9;
        bArr[2] = -9;
        bArr[3] = -9;
        bArr[4] = -9;
        bArr[5] = -9;
        bArr[6] = -9;
        bArr[7] = -9;
        bArr[8] = -9;
        bArr[9] = -5;
        bArr[10] = -5;
        bArr[11] = -9;
        bArr[12] = -9;
        bArr[13] = -5;
        bArr[14] = -9;
        bArr[15] = -9;
        bArr[16] = -9;
        bArr[17] = -9;
        bArr[18] = -9;
        bArr[19] = -9;
        bArr[20] = -9;
        bArr[21] = -9;
        bArr[22] = -9;
        bArr[23] = -9;
        bArr[24] = -9;
        bArr[25] = -9;
        bArr[26] = -9;
        bArr[27] = -9;
        bArr[28] = -9;
        bArr[29] = -9;
        bArr[30] = -9;
        bArr[31] = -9;
        bArr[32] = -5;
        bArr[33] = -9;
        bArr[34] = -9;
        bArr[35] = -9;
        bArr[36] = -9;
        bArr[37] = -9;
        bArr[38] = -9;
        bArr[39] = -9;
        bArr[40] = -9;
        bArr[41] = -9;
        bArr[42] = -9;
        bArr[43] = -9;
        bArr[44] = -9;
        bArr[45] = 0;
        bArr[46] = -9;
        bArr[47] = -9;
        bArr[48] = 1;
        bArr[49] = 2;
        bArr[50] = 3;
        bArr[51] = 4;
        bArr[52] = 5;
        bArr[53] = 6;
        bArr[54] = 7;
        bArr[55] = 8;
        bArr[56] = 9;
        bArr[57] = 10;
        bArr[58] = -9;
        bArr[59] = -9;
        bArr[60] = -9;
        bArr[61] = -1;
        bArr[62] = -9;
        bArr[63] = -9;
        bArr[64] = -9;
        bArr[65] = 11;
        bArr[66] = 12;
        bArr[67] = 13;
        bArr[68] = 14;
        bArr[69] = 15;
        bArr[70] = 16;
        bArr[71] = 17;
        bArr[72] = 18;
        bArr[73] = 19;
        bArr[74] = 20;
        bArr[75] = 21;
        bArr[76] = 22;
        bArr[77] = 23;
        bArr[78] = 24;
        bArr[79] = 25;
        bArr[80] = 26;
        bArr[81] = 27;
        bArr[82] = 28;
        bArr[83] = 29;
        bArr[84] = 30;
        bArr[85] = 31;
        bArr[86] = 32;
        bArr[87] = 33;
        bArr[88] = 34;
        bArr[89] = 35;
        bArr[90] = 36;
        bArr[91] = -9;
        bArr[92] = -9;
        bArr[93] = -9;
        bArr[94] = -9;
        bArr[95] = 37;
        bArr[96] = -9;
        bArr[97] = 38;
        bArr[98] = 39;
        bArr[99] = 40;
        bArr[100] = 41;
        bArr[101] = 42;
        bArr[102] = 43;
        bArr[103] = 44;
        bArr[104] = 45;
        bArr[105] = 46;
        bArr[106] = 47;
        bArr[107] = 48;
        bArr[108] = 49;
        bArr[109] = 50;
        bArr[110] = 51;
        bArr[111] = 52;
        bArr[112] = 53;
        bArr[113] = 54;
        bArr[114] = 55;
        bArr[115] = 56;
        bArr[116] = 57;
        bArr[117] = 58;
        bArr[118] = 59;
        bArr[119] = 60;
        bArr[120] = 61;
        bArr[121] = 62;
        bArr[122] = 63;
        bArr[123] = -9;
        bArr[124] = -9;
        bArr[125] = -9;
        bArr[126] = -9;
        bArr[127] = -9;
        bArr[128] = -9;
        bArr[129] = -9;
        bArr[130] = -9;
        bArr[131] = -9;
        bArr[132] = -9;
        bArr[133] = -9;
        bArr[134] = -9;
        bArr[135] = -9;
        bArr[136] = -9;
        bArr[137] = -9;
        bArr[138] = -9;
        bArr[139] = -9;
        bArr[140] = -9;
        bArr[141] = -9;
        bArr[142] = -9;
        bArr[143] = -9;
        bArr[144] = -9;
        bArr[145] = -9;
        bArr[146] = -9;
        bArr[147] = -9;
        bArr[148] = -9;
        bArr[149] = -9;
        bArr[150] = -9;
        bArr[151] = -9;
        bArr[152] = -9;
        bArr[153] = -9;
        bArr[154] = -9;
        bArr[155] = -9;
        bArr[156] = -9;
        bArr[157] = -9;
        bArr[158] = -9;
        bArr[159] = -9;
        bArr[160] = -9;
        bArr[161] = -9;
        bArr[162] = -9;
        bArr[163] = -9;
        bArr[164] = -9;
        bArr[165] = -9;
        bArr[166] = -9;
        bArr[167] = -9;
        bArr[168] = -9;
        bArr[169] = -9;
        bArr[170] = -9;
        bArr[171] = -9;
        bArr[172] = -9;
        bArr[173] = -9;
        bArr[174] = -9;
        bArr[175] = -9;
        bArr[176] = -9;
        bArr[177] = -9;
        bArr[178] = -9;
        bArr[179] = -9;
        bArr[180] = -9;
        bArr[181] = -9;
        bArr[182] = -9;
        bArr[183] = -9;
        bArr[184] = -9;
        bArr[185] = -9;
        bArr[186] = -9;
        bArr[187] = -9;
        bArr[188] = -9;
        bArr[189] = -9;
        bArr[190] = -9;
        bArr[191] = -9;
        bArr[192] = -9;
        bArr[193] = -9;
        bArr[194] = -9;
        bArr[195] = -9;
        bArr[196] = -9;
        bArr[197] = -9;
        bArr[198] = -9;
        bArr[199] = -9;
        bArr[200] = -9;
        bArr[201] = -9;
        bArr[202] = -9;
        bArr[203] = -9;
        bArr[204] = -9;
        bArr[205] = -9;
        bArr[206] = -9;
        bArr[207] = -9;
        bArr[208] = -9;
        bArr[209] = -9;
        bArr[210] = -9;
        bArr[211] = -9;
        bArr[212] = -9;
        bArr[213] = -9;
        bArr[214] = -9;
        bArr[215] = -9;
        bArr[216] = -9;
        bArr[217] = -9;
        bArr[218] = -9;
        bArr[219] = -9;
        bArr[220] = -9;
        bArr[221] = -9;
        bArr[222] = -9;
        bArr[223] = -9;
        bArr[224] = -9;
        bArr[225] = -9;
        bArr[226] = -9;
        bArr[227] = -9;
        bArr[228] = -9;
        bArr[229] = -9;
        bArr[230] = -9;
        bArr[231] = -9;
        bArr[232] = -9;
        bArr[233] = -9;
        bArr[234] = -9;
        bArr[235] = -9;
        bArr[236] = -9;
        bArr[237] = -9;
        bArr[238] = -9;
        bArr[239] = -9;
        bArr[240] = -9;
        bArr[241] = -9;
        bArr[242] = -9;
        bArr[243] = -9;
        bArr[244] = -9;
        bArr[245] = -9;
        bArr[246] = -9;
        bArr[247] = -9;
        bArr[248] = -9;
        bArr[249] = -9;
        bArr[250] = -9;
        bArr[251] = -9;
        bArr[252] = -9;
        bArr[253] = -9;
        bArr[254] = -9;
        bArr[255] = -9;
        bArr[256] = -9;
        f18839t = bArr;
    }

    private C6772a() {
    }

    /* renamed from: b */
    private static final byte[] m32414b(int i) {
        if ((i & 16) == 16) {
            return f18836q;
        }
        if ((i & 32) == 32) {
            return f18838s;
        }
        return f18834o;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final byte[] m32420c(int i) {
        if ((i & 16) == 16) {
            return f18837r;
        }
        if ((i & 32) == 32) {
            return f18839t;
        }
        return f18835p;
    }

    /* renamed from: d */
    public static String m32423d(String str) throws IOException {
        C6774b bVar = null;
        try {
            File file = new File(str);
            double length = (double) file.length();
            Double.isNaN(length);
            byte[] bArr = new byte[Math.max((int) ((length * 1.4d) + 1.0d), 40)];
            C6774b bVar2 = new C6774b(new BufferedInputStream(new FileInputStream(file)), 1);
            int i = 0;
            while (true) {
                try {
                    int read = bVar2.read(bArr, i, 4096);
                    if (read < 0) {
                        break;
                    }
                    i += read;
                } catch (IOException e) {
                    e = e;
                    bVar = bVar2;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    try {
                        bVar.close();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            }
            String str2 = new String(bArr, 0, i, "US-ASCII");
            try {
                bVar2.close();
            } catch (Exception unused2) {
            }
            return str2;
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m32417b(byte[] bArr, byte[] bArr2, int i, int i2) {
        m32416b(bArr2, 0, i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m32421c(byte[] bArr) {
        try {
            return m32422c(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m32400a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            m32417b(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static byte[] m32416b(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] b = m32414b(i4);
        int i5 = 0;
        int i6 = (i2 > 0 ? (bArr[i] << C5785c.f16669B) >>> 8 : 0) | (i2 > 1 ? (bArr[i + 1] << C5785c.f16669B) >>> 16 : 0);
        if (i2 > 2) {
            i5 = (bArr[i + 2] << C5785c.f16669B) >>> 24;
        }
        int i7 = i6 | i5;
        if (i2 == 1) {
            bArr2[i3] = b[i7 >>> 18];
            bArr2[i3 + 1] = b[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = f18829j;
            bArr2[i3 + 3] = f18829j;
            return bArr2;
        } else if (i2 == 2) {
            bArr2[i3] = b[i7 >>> 18];
            bArr2[i3 + 1] = b[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = b[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = f18829j;
            return bArr2;
        } else if (i2 != 3) {
            return bArr2;
        } else {
            bArr2[i3] = b[i7 >>> 18];
            bArr2[i3 + 1] = b[(i7 >>> 12) & 63];
            bArr2[i3 + 2] = b[(i7 >>> 6) & 63];
            bArr2[i3 + 3] = b[i7 & 63];
            return bArr2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r2v14, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r1v22, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.zip.GZIPOutputStream] */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: Can't wrap try/catch for region: R(12:13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:31|32|45|46|47|48|49|50|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x005f */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v15
      assigns: []
      uses: []
      mth insns count: 142
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m32422c(byte[] r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            r0 = r18
            r7 = r19
            r8 = r20
            if (r0 == 0) goto L_0x011e
            if (r7 < 0) goto L_0x0107
            if (r8 < 0) goto L_0x00f0
            int r1 = r7 + r8
            int r2 = r0.length
            r9 = 1
            r10 = 0
            if (r1 > r2) goto L_0x00cd
            r1 = r21 & 2
            if (r1 == 0) goto L_0x0063
            r1 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            r2.<init>()     // Catch:{ IOException -> 0x0052, all -> 0x004e }
            c.e.a.n.a$c r3 = new c.e.a.n.a$c     // Catch:{ IOException -> 0x0049, all -> 0x0046 }
            r4 = r21 | 1
            r3.<init>(r2, r4)     // Catch:{ IOException -> 0x0049, all -> 0x0046 }
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0043, all -> 0x0041 }
            r4.write(r0, r7, r8)     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            r4.close()     // Catch:{ IOException -> 0x003f, all -> 0x003d }
            r4.close()     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            r3.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r2.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x003d:
            r0 = move-exception
            goto L_0x0058
        L_0x003f:
            r0 = move-exception
            goto L_0x004c
        L_0x0041:
            r0 = move-exception
            goto L_0x0059
        L_0x0043:
            r0 = move-exception
            r4 = r1
            goto L_0x004c
        L_0x0046:
            r0 = move-exception
            r3 = r1
            goto L_0x0059
        L_0x0049:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x004c:
            r1 = r2
            goto L_0x0055
        L_0x004e:
            r0 = move-exception
            r2 = r1
            r3 = r2
            goto L_0x0059
        L_0x0052:
            r0 = move-exception
            r3 = r1
            r4 = r3
        L_0x0055:
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            r2 = r1
        L_0x0058:
            r1 = r4
        L_0x0059:
            r1.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r3.close()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            r2.close()     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r0
        L_0x0063:
            r1 = r21 & 8
            if (r1 == 0) goto L_0x0069
            r11 = 1
            goto L_0x006a
        L_0x0069:
            r11 = 0
        L_0x006a:
            int r1 = r8 / 3
            r12 = 4
            int r1 = r1 * 4
            int r2 = r8 % 3
            if (r2 <= 0) goto L_0x0075
            r2 = 4
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            int r1 = r1 + r2
            if (r11 == 0) goto L_0x007c
            int r2 = r1 / 76
            int r1 = r1 + r2
        L_0x007c:
            byte[] r13 = new byte[r1]
            int r14 = r8 + -2
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0085:
            if (r15 >= r14) goto L_0x00ae
            int r2 = r15 + r7
            r3 = 3
            r1 = r18
            r4 = r13
            r5 = r16
            r6 = r21
            m32416b(r1, r2, r3, r4, r5, r6)
            int r1 = r17 + 4
            if (r11 == 0) goto L_0x00a7
            r2 = 76
            if (r1 < r2) goto L_0x00a7
            int r1 = r16 + 4
            r2 = 10
            r13[r1] = r2
            int r16 = r16 + 1
            r17 = 0
            goto L_0x00a9
        L_0x00a7:
            r17 = r1
        L_0x00a9:
            int r15 = r15 + 3
            int r16 = r16 + 4
            goto L_0x0085
        L_0x00ae:
            if (r15 >= r8) goto L_0x00c0
            int r2 = r15 + r7
            int r3 = r8 - r15
            r1 = r18
            r4 = r13
            r5 = r16
            r6 = r21
            m32416b(r1, r2, r3, r4, r5, r6)
            int r16 = r16 + 4
        L_0x00c0:
            r0 = r16
            int r1 = r13.length
            int r1 = r1 - r9
            if (r0 > r1) goto L_0x00cc
            byte[] r1 = new byte[r0]
            java.lang.System.arraycopy(r13, r10, r1, r10, r0)
            return r1
        L_0x00cc:
            return r13
        L_0x00cd:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r2[r9] = r3
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 2
            r2[r3] = r0
            java.lang.String r0 = "Cannot have offset of %d and length of %d with array of length %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x00f0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have length offset: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0107:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot have negative offset: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x011e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Cannot serialize a null array."
            r0.<init>(r1)
            goto L_0x0127
        L_0x0126:
            throw r0
        L_0x0127:
            goto L_0x0126
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.p290n.C6772a.m32422c(byte[], int, int, int):byte[]");
    }

    /* renamed from: a */
    public static void m32401a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            m32417b(bArr2, bArr, min, 0);
            for (int i = 0; i < 4; i++) {
                charBuffer.put((char) (bArr2[i] & 255));
            }
        }
    }

    /* renamed from: a */
    public static String m32395a(Serializable serializable) throws IOException {
        return m32396a(serializable, 0);
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.ObjectOutputStream] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.ObjectOutputStream] */
    /* JADX WARNING: type inference failed for: r6v14, types: [java.io.ObjectOutputStream] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.ObjectOutputStream] */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|51|52|53|54|55|56|57|58|59) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:4|5|6|(5:8|9|10|11|12)(3:16|17|18)|19|20|21|22|23|24|25|26|27|28|29|30|31) */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:2|3|4|5|6|(5:8|9|10|11|12)(3:16|17|18)|19|20|21|22|23|24|25|26|27|28|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        return new java.lang.String(r1.toByteArray());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0035 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0038 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0077 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x007a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x007d */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v11
      assigns: []
      uses: []
      mth insns count: 81
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 14 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32396a(java.io.Serializable r5, int r6) throws java.io.IOException {
        /*
            if (r5 == 0) goto L_0x0081
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            r1.<init>()     // Catch:{ IOException -> 0x006b, all -> 0x0066 }
            c.e.a.n.a$c r2 = new c.e.a.n.a$c     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            r3 = r6 | 1
            r2.<init>(r1, r3)     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            r6 = r6 & 2
            if (r6 == 0) goto L_0x0027
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r0 = r3
            goto L_0x002f
        L_0x001f:
            r5 = move-exception
            goto L_0x0074
        L_0x0022:
            r5 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x006f
        L_0x0027:
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r6.<init>(r2)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r4 = r0
            r0 = r6
            r6 = r4
        L_0x002f:
            r0.writeObject(r5)     // Catch:{ IOException -> 0x0022, all -> 0x001f }
            r0.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r6.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r2.close()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            r1.close()     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            java.lang.String r5 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x004a }
            byte[] r6 = r1.toByteArray()     // Catch:{ UnsupportedEncodingException -> 0x004a }
            java.lang.String r0 = "US-ASCII"
            r5.<init>(r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x004a }
            return r5
        L_0x004a:
            java.lang.String r5 = new java.lang.String
            byte[] r6 = r1.toByteArray()
            r5.<init>(r6)
            return r5
        L_0x0054:
            r5 = move-exception
            r6 = r0
            goto L_0x0074
        L_0x0057:
            r5 = move-exception
            r6 = r0
            r0 = r1
            r1 = r6
            goto L_0x006f
        L_0x005c:
            r5 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x0074
        L_0x0060:
            r5 = move-exception
            r6 = r0
            r2 = r6
            r0 = r1
            r1 = r2
            goto L_0x006f
        L_0x0066:
            r5 = move-exception
            r6 = r0
            r1 = r6
            r2 = r1
            goto L_0x0074
        L_0x006b:
            r5 = move-exception
            r6 = r0
            r1 = r6
            r2 = r1
        L_0x006f:
            throw r5     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r5 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0074:
            r0.close()     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            r6.close()     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            r2.close()     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            r1.close()     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            throw r5
        L_0x0081:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Cannot serialize a null object."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.p290n.C6772a.m32396a(java.io.Serializable, int):java.lang.String");
    }

    /* renamed from: b */
    public static String m32411b(byte[] bArr) {
        try {
            return m32412b(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m32412b(byte[] bArr, int i, int i2, int i3) throws IOException {
        byte[] c = m32422c(bArr, i, i2, i3);
        try {
            return new String(c, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m32410b(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            throw new NullPointerException("Source array was null.");
        } else if (bArr2 != null) {
            if (i >= 0) {
                int i4 = i + 3;
                if (i4 < bArr.length) {
                    if (i2 >= 0) {
                        int i5 = i2 + 2;
                        if (i5 < bArr2.length) {
                            byte[] c = m32420c(i3);
                            int i6 = i + 2;
                            if (bArr[i6] == 61) {
                                bArr2[i2] = (byte) ((((c[bArr[i + 1]] & 255) << C5785c.f16695n) | ((c[bArr[i]] & 255) << C5785c.f16702u)) >>> 16);
                                return 1;
                            } else if (bArr[i4] == 61) {
                                int i7 = ((c[bArr[i6]] & 255) << 6) | ((c[bArr[i + 1]] & 255) << C5785c.f16695n) | ((c[bArr[i]] & 255) << C5785c.f16702u);
                                bArr2[i2] = (byte) (i7 >>> 16);
                                bArr2[i2 + 1] = (byte) (i7 >>> 8);
                                return 2;
                            } else {
                                byte b = (c[bArr[i4]] & 255) | ((c[bArr[i + 1]] & 255) << C5785c.f16695n) | ((c[bArr[i]] & 255) << C5785c.f16702u) | ((c[bArr[i6]] & 255) << 6);
                                bArr2[i2] = (byte) (b >> 16);
                                bArr2[i2 + 1] = (byte) (b >> 8);
                                bArr2[i5] = (byte) b;
                                return 3;
                            }
                        }
                    }
                    throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2)}));
                }
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i)}));
        } else {
            throw new NullPointerException("Destination array was null.");
        }
    }

    /* renamed from: c */
    public static Object m32418c(String str) throws IOException, ClassNotFoundException {
        return m32394a(str, 0, (ClassLoader) null);
    }

    /* renamed from: a */
    public static String m32397a(byte[] bArr, int i) throws IOException {
        return m32412b(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    public static void m32419c(String str, String str2) throws IOException {
        String d = m32423d(str);
        OutputStream outputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                bufferedOutputStream.write(d.getBytes("US-ASCII"));
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e) {
                e = e;
                outputStream = bufferedOutputStream;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = bufferedOutputStream;
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }

    /* renamed from: a */
    public static String m32398a(byte[] bArr, int i, int i2) {
        try {
            return m32412b(bArr, i, i2, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m32406a(byte[] bArr) throws IOException {
        return m32407a(bArr, 0, bArr.length, 0);
    }

    /* renamed from: a */
    public static byte[] m32407a(byte[] bArr, int i, int i2, int i3) throws IOException {
        if (bArr != null) {
            if (i >= 0) {
                int i4 = i + i2;
                if (i4 <= bArr.length) {
                    if (i2 == 0) {
                        return new byte[0];
                    }
                    if (i2 >= 4) {
                        byte[] c = m32420c(i3);
                        byte[] bArr2 = new byte[((i2 * 3) / 4)];
                        byte[] bArr3 = new byte[4];
                        int i5 = 0;
                        int i6 = 0;
                        while (i < i4) {
                            byte b = c[bArr[i] & 255];
                            if (b >= -5) {
                                if (b >= -1) {
                                    int i7 = i5 + 1;
                                    bArr3[i5] = bArr[i];
                                    if (i7 > 3) {
                                        i6 += m32410b(bArr3, 0, bArr2, i6, i3);
                                        if (bArr[i] == 61) {
                                            break;
                                        }
                                        i5 = 0;
                                    } else {
                                        i5 = i7;
                                    }
                                }
                                i++;
                            } else {
                                throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", new Object[]{Integer.valueOf(bArr[i] & 255), Integer.valueOf(i)}));
                            }
                        }
                        byte[] bArr4 = new byte[i6];
                        System.arraycopy(bArr2, 0, bArr4, 0, i6);
                        return bArr4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Base64-encoded string must have at least four characters, but length specified was ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    /* renamed from: b */
    public static void m32413b(String str, String str2) throws IOException {
        C6775c cVar = null;
        try {
            C6775c cVar2 = new C6775c(new FileOutputStream(str2), 0);
            try {
                cVar2.write(str.getBytes("US-ASCII"));
                try {
                    cVar2.close();
                } catch (Exception unused) {
                }
            } catch (IOException e) {
                e = e;
                cVar = cVar2;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                cVar = cVar2;
                try {
                    cVar.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }

    /* renamed from: b */
    public static byte[] m32415b(String str) throws IOException {
        C6774b bVar = null;
        try {
            File file = new File(str);
            if (file.length() <= 2147483647L) {
                byte[] bArr = new byte[((int) file.length())];
                C6774b bVar2 = new C6774b(new BufferedInputStream(new FileInputStream(file)), 0);
                int i = 0;
                while (true) {
                    try {
                        int read = bVar2.read(bArr, i, 4096);
                        if (read < 0) {
                            break;
                        }
                        i += read;
                    } catch (IOException e) {
                        e = e;
                        bVar = bVar2;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = bVar2;
                        try {
                            bVar.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                try {
                    bVar2.close();
                } catch (Exception unused2) {
                }
                return bArr2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("File is too big for this convenience method (");
            sb.append(file.length());
            sb.append(" bytes).");
            throw new IOException(sb.toString());
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }

    /* renamed from: a */
    public static byte[] m32404a(String str) throws IOException {
        return m32405a(str, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:16|17|18|19|20|(6:21|22|(3:23|24|(1:26)(1:67))|27|28|29)|30|31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:52|53|54|55|56|57|58|59|60|61) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0059 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0088 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v3
      assigns: []
      uses: []
      mth insns count: 82
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 11 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m32405a(java.lang.String r5, int r6) throws java.io.IOException {
        /*
            if (r5 == 0) goto L_0x008d
            java.lang.String r0 = "US-ASCII"
            byte[] r5 = r5.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x0009 }
            goto L_0x000d
        L_0x0009:
            byte[] r5 = r5.getBytes()
        L_0x000d:
            int r0 = r5.length
            r1 = 0
            byte[] r5 = m32407a(r5, r1, r0, r6)
            r0 = 4
            r6 = r6 & r0
            r2 = 1
            if (r6 == 0) goto L_0x001a
            r6 = 1
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            if (r5 == 0) goto L_0x008c
            int r3 = r5.length
            if (r3 < r0) goto L_0x008c
            if (r6 != 0) goto L_0x008c
            byte r6 = r5[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r0 = r5[r2]
            int r0 = r0 << 8
            r2 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r2
            r6 = r6 | r0
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r0 != r6) goto L_0x008c
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r6 = new byte[r6]
            r0 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0075, all -> 0x0071 }
            r2.<init>()     // Catch:{ IOException -> 0x0075, all -> 0x0071 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x006c, all -> 0x0069 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x006c, all -> 0x0069 }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
        L_0x0048:
            int r0 = r4.read(r6)     // Catch:{ IOException -> 0x0062, all -> 0x0060 }
            if (r0 < 0) goto L_0x0052
            r2.write(r6, r1, r0)     // Catch:{ IOException -> 0x0062, all -> 0x0060 }
            goto L_0x0048
        L_0x0052:
            byte[] r5 = r2.toByteArray()     // Catch:{ IOException -> 0x0062, all -> 0x0060 }
            r2.close()     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r4.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            r3.close()     // Catch:{ Exception -> 0x008c }
            goto L_0x008c
        L_0x0060:
            r5 = move-exception
            goto L_0x0081
        L_0x0062:
            r6 = move-exception
            goto L_0x006f
        L_0x0064:
            r5 = move-exception
            goto L_0x0082
        L_0x0066:
            r6 = move-exception
            r4 = r0
            goto L_0x006f
        L_0x0069:
            r5 = move-exception
            r3 = r0
            goto L_0x0082
        L_0x006c:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x006f:
            r0 = r2
            goto L_0x0078
        L_0x0071:
            r5 = move-exception
            r2 = r0
            r3 = r2
            goto L_0x0082
        L_0x0075:
            r6 = move-exception
            r3 = r0
            r4 = r3
        L_0x0078:
            r6.printStackTrace()     // Catch:{ all -> 0x007f }
            r0.close()     // Catch:{ Exception -> 0x0059 }
            goto L_0x0059
        L_0x007f:
            r5 = move-exception
            r2 = r0
        L_0x0081:
            r0 = r4
        L_0x0082:
            r2.close()     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            r0.close()     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            r3.close()     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            throw r5
        L_0x008c:
            return r5
        L_0x008d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "Input string was null."
            r5.<init>(r6)
            goto L_0x0096
        L_0x0095:
            throw r5
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.p290n.C6772a.m32405a(java.lang.String, int):byte[]");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.ClassLoader] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.ObjectInputStream] */
    /* JADX WARNING: type inference failed for: r0v0, types: [java.io.ByteArrayInputStream] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|30|31|32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(2:4|5)(1:6)|7|8|9|10|11|12) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.ClassLoader, code=null, for r3v0, types: [java.lang.ClassLoader] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x003c */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v3
      assigns: []
      uses: []
      mth insns count: 40
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m32394a(java.lang.String r1, int r2, java.lang.ClassLoader r3) throws java.io.IOException, java.lang.ClassNotFoundException {
        /*
            byte[] r1 = m32405a(r1, r2)
            r2 = 0
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0033, ClassNotFoundException -> 0x0030, all -> 0x002d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0033, ClassNotFoundException -> 0x0030, all -> 0x002d }
            if (r3 != 0) goto L_0x0012
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0029, ClassNotFoundException -> 0x0025, all -> 0x0023 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0029, ClassNotFoundException -> 0x0025, all -> 0x0023 }
            goto L_0x0017
        L_0x0012:
            c.e.a.n.a$a r1 = new c.e.a.n.a$a     // Catch:{ IOException -> 0x0029, ClassNotFoundException -> 0x0025, all -> 0x0023 }
            r1.<init>(r0, r3)     // Catch:{ IOException -> 0x0029, ClassNotFoundException -> 0x0025, all -> 0x0023 }
        L_0x0017:
            r2 = r1
            java.lang.Object r1 = r2.readObject()     // Catch:{ IOException -> 0x0029, ClassNotFoundException -> 0x0025, all -> 0x0023 }
            r0.close()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            r2.close()     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            return r1
        L_0x0023:
            r1 = move-exception
            goto L_0x0039
        L_0x0025:
            r1 = move-exception
            r3 = r2
            r2 = r0
            goto L_0x0032
        L_0x0029:
            r1 = move-exception
            r3 = r2
            r2 = r0
            goto L_0x0035
        L_0x002d:
            r1 = move-exception
            r0 = r2
            goto L_0x0039
        L_0x0030:
            r1 = move-exception
            r3 = r2
        L_0x0032:
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0033:
            r1 = move-exception
            r3 = r2
        L_0x0035:
            throw r1     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            r0 = r2
            r2 = r3
        L_0x0039:
            r0.close()     // Catch:{ Exception -> 0x003c }
        L_0x003c:
            r2.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.p290n.C6772a.m32394a(java.lang.String, int, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: a */
    public static void m32402a(byte[] bArr, String str) throws IOException {
        if (bArr != null) {
            C6775c cVar = null;
            try {
                C6775c cVar2 = new C6775c(new FileOutputStream(str), 1);
                try {
                    cVar2.write(bArr);
                    try {
                        cVar2.close();
                    } catch (Exception unused) {
                    }
                } catch (IOException e) {
                    e = e;
                    cVar = cVar2;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cVar = cVar2;
                    try {
                        cVar.close();
                    } catch (Exception unused2) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                throw e;
            }
        } else {
            throw new NullPointerException("Data to encode was null.");
        }
    }

    /* renamed from: a */
    public static void m32399a(String str, String str2) throws IOException {
        byte[] b = m32415b(str);
        OutputStream outputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                bufferedOutputStream.write(b);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e) {
                e = e;
                outputStream = bufferedOutputStream;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = bufferedOutputStream;
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            throw e;
        }
    }
}
