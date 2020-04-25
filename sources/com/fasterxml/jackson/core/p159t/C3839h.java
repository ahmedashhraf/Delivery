package com.fasterxml.jackson.core.p159t;

import com.facebook.internal.ServerProtocol;
import com.fasterxml.jackson.core.C3785a;
import com.fasterxml.jackson.core.C3794h.C3796b;
import com.fasterxml.jackson.core.C3799j;
import com.fasterxml.jackson.core.C3800k;
import com.fasterxml.jackson.core.C3802m;
import com.fasterxml.jackson.core.C3804o;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.p156q.C3808b;
import com.fasterxml.jackson.core.p158s.C3817b;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p160u.C3842a;
import com.fasterxml.jackson.core.p160u.C3850f;
import com.fasterxml.jackson.core.p162w.C3857b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.fasterxml.jackson.core.t.h */
/* compiled from: UTF8StreamJsonParser */
public final class C3839h extends C3808b {

    /* renamed from: G1 */
    static final byte f12126G1 = 10;

    /* renamed from: H1 */
    private static final int[] f12127H1 = C3817b.m16266g();

    /* renamed from: I1 */
    private static final int[] f12128I1 = C3817b.m16264e();

    /* renamed from: A1 */
    protected int[] f12129A1 = new int[16];

    /* renamed from: B1 */
    protected boolean f12130B1 = false;

    /* renamed from: C1 */
    private int f12131C1;

    /* renamed from: D1 */
    protected InputStream f12132D1;

    /* renamed from: E1 */
    protected byte[] f12133E1;

    /* renamed from: F1 */
    protected boolean f12134F1;

    /* renamed from: y1 */
    protected C3800k f12135y1;

    /* renamed from: z1 */
    protected final C3842a f12136z1;

    /* renamed from: com.fasterxml.jackson.core.t.h$a */
    /* compiled from: UTF8StreamJsonParser */
    static /* synthetic */ class C3840a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12137a = new int[C3799j.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.fasterxml.jackson.core.j[] r0 = com.fasterxml.jackson.core.C3799j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12137a = r0
                int[] r0 = f12137a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.FIELD_NAME     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12137a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12137a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f12137a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f12137a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f12137a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.fasterxml.jackson.core.j r1 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.C3840a.<clinit>():void");
        }
    }

    public C3839h(C3819d dVar, int i, InputStream inputStream, C3800k kVar, C3842a aVar, byte[] bArr, int i2, int i3, boolean z) {
        super(dVar, i);
        this.f12132D1 = inputStream;
        this.f12135y1 = kVar;
        this.f12136z1 = aVar;
        this.f12133E1 = bArr;
        this.f11919p0 = i2;
        this.f11920q0 = i3;
        this.f12134F1 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ab  */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16497Q0() throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            int r0 = r8.f11919p0
            int r1 = r8.f11920q0
            r2 = 123(0x7b, float:1.72E-43)
            r3 = 91
            r4 = 34
            r5 = 1
            if (r0 >= r1) goto L_0x004b
            byte[] r1 = r8.f12133E1
            byte r6 = r1[r0]
            r7 = 58
            if (r6 != r7) goto L_0x004b
            int r0 = r0 + r5
            r8.f11919p0 = r0
            int r0 = r8.f11919p0
            int r6 = r0 + 1
            r8.f11919p0 = r6
            byte r0 = r1[r0]
            if (r0 != r4) goto L_0x0029
            r8.f12130B1 = r5
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.VALUE_STRING
            r8.f11928y0 = r0
            return
        L_0x0029:
            if (r0 != r2) goto L_0x0030
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.START_OBJECT
            r8.f11928y0 = r0
            return
        L_0x0030:
            if (r0 != r3) goto L_0x0037
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.START_ARRAY
            r8.f11928y0 = r0
            return
        L_0x0037:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 32
            if (r0 <= r1) goto L_0x0041
            r1 = 47
            if (r0 != r1) goto L_0x004f
        L_0x0041:
            int r0 = r8.f11919p0
            int r0 = r0 - r5
            r8.f11919p0 = r0
            int r0 = r8.m16503W0()
            goto L_0x004f
        L_0x004b:
            int r0 = r8.m16500T0()
        L_0x004f:
            if (r0 == r4) goto L_0x00ab
            r1 = 45
            if (r0 == r1) goto L_0x00a4
            if (r0 == r3) goto L_0x009f
            r1 = 93
            if (r0 == r1) goto L_0x0090
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x0086
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L_0x007c
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x0095
            if (r0 == r2) goto L_0x0077
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 == r1) goto L_0x0090
            switch(r0) {
                case 48: goto L_0x00a4;
                case 49: goto L_0x00a4;
                case 50: goto L_0x00a4;
                case 51: goto L_0x00a4;
                case 52: goto L_0x00a4;
                case 53: goto L_0x00a4;
                case 54: goto L_0x00a4;
                case 55: goto L_0x00a4;
                case 56: goto L_0x00a4;
                case 57: goto L_0x00a4;
                default: goto L_0x0070;
            }
        L_0x0070:
            com.fasterxml.jackson.core.j r0 = r8.mo16993j(r0)
            r8.f11928y0 = r0
            return
        L_0x0077:
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.START_OBJECT
            r8.f11928y0 = r0
            return
        L_0x007c:
            java.lang.String r0 = "null"
            r8.mo16990a(r0, r5)
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.VALUE_NULL
            r8.f11928y0 = r0
            return
        L_0x0086:
            java.lang.String r0 = "false"
            r8.mo16990a(r0, r5)
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.VALUE_FALSE
            r8.f11928y0 = r0
            return
        L_0x0090:
            java.lang.String r1 = "expected a value"
            r8.mo16839a(r0, r1)
        L_0x0095:
            java.lang.String r0 = "true"
            r8.mo16990a(r0, r5)
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.VALUE_TRUE
            r8.f11928y0 = r0
            return
        L_0x009f:
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.START_ARRAY
            r8.f11928y0 = r0
            return
        L_0x00a4:
            com.fasterxml.jackson.core.j r0 = r8.mo17001r(r0)
            r8.f11928y0 = r0
            return
        L_0x00ab:
            r8.f12130B1 = r5
            com.fasterxml.jackson.core.j r0 = com.fasterxml.jackson.core.C3799j.VALUE_STRING
            r8.f11928y0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.m16497Q0():void");
    }

    /* renamed from: R0 */
    private C3799j m16498R0() {
        this.f11904B0 = false;
        C3799j jVar = this.f11928y0;
        this.f11928y0 = null;
        if (jVar == C3799j.START_ARRAY) {
            this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
        } else if (jVar == C3799j.START_OBJECT) {
            this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
        }
        this.f11951Q = jVar;
        return jVar;
    }

    /* renamed from: S0 */
    private void m16499S0() throws IOException, JsonParseException {
        int[] d = C3817b.m16263d();
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                break;
            }
            byte[] bArr = this.f12133E1;
            int i = this.f11919p0;
            this.f11919p0 = i + 1;
            byte b = bArr[i] & 255;
            int i2 = d[b];
            if (i2 != 0) {
                if (i2 == 2) {
                    m16523x(b);
                } else if (i2 == 3) {
                    m16524y(b);
                } else if (i2 == 4) {
                    m16525z(b);
                } else if (i2 == 10) {
                    mo16981N0();
                } else if (i2 != 13) {
                    if (i2 == 42) {
                        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                            break;
                        }
                        byte[] bArr2 = this.f12133E1;
                        int i3 = this.f11919p0;
                        if (bArr2[i3] == 47) {
                            this.f11919p0 = i3 + 1;
                            return;
                        }
                    } else {
                        mo16997n(b);
                    }
                } else {
                    mo16980M0();
                }
            }
        }
        mo16846f(" in a comment");
    }

    /* renamed from: T0 */
    private int m16500T0() throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = this.f11919p0;
            if (i2 < this.f11920q0) {
                byte b2 = bArr[i2] & 255;
                if (b2 > 32 && b2 != 47) {
                    this.f11919p0 = i2 + 1;
                    return b2;
                }
            }
        } else {
            byte b3 = b & 255;
            while (true) {
                if (b3 != 9) {
                    if (b3 == 10) {
                        mo16981N0();
                    } else if (b3 == 13) {
                        mo16980M0();
                    } else if (b3 != 32) {
                        if (b3 != 47) {
                            break;
                        }
                        m16501U0();
                    }
                }
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr2 = this.f12133E1;
                int i3 = this.f11919p0;
                this.f11919p0 = i3 + 1;
                b3 = bArr2[i3] & 255;
            }
            if (b3 < 32) {
                mo16845f((int) b3);
            }
            if (b3 != 58) {
                mo16839a((int) b3, "was expecting a colon to separate field name and value");
            }
        }
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                byte[] bArr3 = this.f12133E1;
                int i4 = this.f11919p0;
                this.f11919p0 = i4 + 1;
                byte b4 = bArr3[i4] & 255;
                if (b4 > 32) {
                    if (b4 != 47) {
                        return b4;
                    }
                    m16501U0();
                } else if (b4 != 32) {
                    if (b4 == 10) {
                        mo16981N0();
                    } else if (b4 == 13) {
                        mo16980M0();
                    } else if (b4 != 9) {
                        mo16845f((int) b4);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end-of-input within/between ");
                sb.append(this.f11927x0.mo16739e());
                sb.append(" entries");
                throw mo16703b(sb.toString());
            }
        }
    }

    /* renamed from: U0 */
    private void m16501U0() throws IOException, JsonParseException {
        if (!mo16710c(C3796b.ALLOW_COMMENTS)) {
            mo16839a(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            mo16846f(" in a comment");
        }
        byte[] bArr = this.f12133E1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        byte b = bArr[i] & 255;
        if (b == 47) {
            m16502V0();
        } else if (b == 42) {
            m16499S0();
        } else {
            mo16839a((int) b, "was expecting either '*' or '/' for a comment");
        }
    }

    /* renamed from: V0 */
    private void m16502V0() throws IOException, JsonParseException {
        int[] d = C3817b.m16263d();
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                byte[] bArr = this.f12133E1;
                int i = this.f11919p0;
                this.f11919p0 = i + 1;
                byte b = bArr[i] & 255;
                int i2 = d[b];
                if (i2 != 0) {
                    if (i2 == 2) {
                        m16523x(b);
                    } else if (i2 == 3) {
                        m16524y(b);
                    } else if (i2 == 4) {
                        m16525z(b);
                    } else if (i2 == 10) {
                        mo16981N0();
                        return;
                    } else if (i2 == 13) {
                        mo16980M0();
                        return;
                    } else if (i2 != 42) {
                        mo16997n(b);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: W0 */
    private int m16503W0() throws IOException, JsonParseException {
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                byte[] bArr = this.f12133E1;
                int i = this.f11919p0;
                this.f11919p0 = i + 1;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b != 47) {
                        return b;
                    }
                    m16501U0();
                } else if (b != 32) {
                    if (b == 10) {
                        mo16981N0();
                    } else if (b == 13) {
                        mo16980M0();
                    } else if (b != 9) {
                        mo16845f((int) b);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected end-of-input within/between ");
                sb.append(this.f11927x0.mo16739e());
                sb.append(" entries");
                throw mo16703b(sb.toString());
            }
        }
    }

    /* renamed from: X0 */
    private int m16504X0() throws IOException, JsonParseException {
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                byte[] bArr = this.f12133E1;
                int i = this.f11919p0;
                this.f11919p0 = i + 1;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b != 47) {
                        return b;
                    }
                    m16501U0();
                } else if (b != 32) {
                    if (b == 10) {
                        mo16981N0();
                    } else if (b == 13) {
                        mo16980M0();
                    } else if (b != 9) {
                        mo16845f((int) b);
                    }
                }
            } else {
                mo16829o0();
                return -1;
            }
        }
    }

    /* renamed from: Y0 */
    private int m16505Y0() throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            return 48;
        }
        byte b = this.f12133E1[this.f11919p0] & 255;
        if (b < 48 || b > 57) {
            return 48;
        }
        if (!mo16710c(C3796b.ALLOW_NUMERIC_LEADING_ZEROS)) {
            mo16827g("Leading zeroes not allowed");
        }
        this.f11919p0++;
        if (b == 48) {
            do {
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    break;
                }
                byte[] bArr = this.f12133E1;
                int i = this.f11919p0;
                b = bArr[i] & 255;
                if (b < 48 || b > 57) {
                    return 48;
                }
                this.f11919p0 = i + 1;
            } while (b == 48);
        }
        return b;
    }

    /* renamed from: Z0 */
    private int m16506Z0() throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: s */
    private int m16518s(int i) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i2 = this.f11919p0;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    /* renamed from: t */
    private int m16519t(int i) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        int i2 = i & 15;
        byte[] bArr = this.f12133E1;
        int i3 = this.f11919p0;
        this.f11919p0 = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
        byte b2 = (i2 << 6) | (b & 63);
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr2 = this.f12133E1;
        int i4 = this.f11919p0;
        this.f11919p0 = i4 + 1;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            mo16989a((int) b3 & 255, this.f11919p0);
        }
        return (b2 << 6) | (b3 & 63);
    }

    /* renamed from: u */
    private int m16520u(int i) throws IOException, JsonParseException {
        int i2 = i & 15;
        byte[] bArr = this.f12133E1;
        int i3 = this.f11919p0;
        this.f11919p0 = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
        byte b2 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this.f12133E1;
        int i4 = this.f11919p0;
        this.f11919p0 = i4 + 1;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            mo16989a((int) b3 & 255, this.f11919p0);
        }
        return (b2 << 6) | (b3 & 63);
    }

    /* renamed from: v */
    private int m16521v(int i) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i2 = this.f11919p0;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
        byte b2 = ((i & 7) << 6) | (b & 63);
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr2 = this.f12133E1;
        int i3 = this.f11919p0;
        this.f11919p0 = i3 + 1;
        byte b3 = bArr2[i3];
        if ((b3 & 192) != 128) {
            mo16989a((int) b3 & 255, this.f11919p0);
        }
        byte b4 = (b2 << 6) | (b3 & 63);
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr3 = this.f12133E1;
        int i4 = this.f11919p0;
        this.f11919p0 = i4 + 1;
        byte b5 = bArr3[i4];
        if ((b5 & 192) != 128) {
            mo16989a((int) b5 & 255, this.f11919p0);
        }
        return ((b4 << 6) | (b5 & 63)) - 65536;
    }

    /* renamed from: w */
    private C3799j m16522w(int i) throws IOException, JsonParseException {
        if (i == 34) {
            this.f12130B1 = true;
            C3799j jVar = C3799j.VALUE_STRING;
            this.f11951Q = jVar;
            return jVar;
        }
        if (i != 45) {
            if (i != 91) {
                if (i != 93) {
                    if (i == 102) {
                        mo16990a("false", 1);
                        C3799j jVar2 = C3799j.VALUE_FALSE;
                        this.f11951Q = jVar2;
                        return jVar2;
                    } else if (i != 110) {
                        if (i != 116) {
                            if (i == 123) {
                                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
                                C3799j jVar3 = C3799j.START_OBJECT;
                                this.f11951Q = jVar3;
                                return jVar3;
                            } else if (i != 125) {
                                switch (i) {
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                        break;
                                    default:
                                        C3799j j = mo16993j(i);
                                        this.f11951Q = j;
                                        return j;
                                }
                            }
                        }
                        mo16990a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                        C3799j jVar4 = C3799j.VALUE_TRUE;
                        this.f11951Q = jVar4;
                        return jVar4;
                    } else {
                        mo16990a("null", 1);
                        C3799j jVar5 = C3799j.VALUE_NULL;
                        this.f11951Q = jVar5;
                        return jVar5;
                    }
                }
                mo16839a(i, "expected a value");
                mo16990a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                C3799j jVar42 = C3799j.VALUE_TRUE;
                this.f11951Q = jVar42;
                return jVar42;
            }
            this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            C3799j jVar6 = C3799j.START_ARRAY;
            this.f11951Q = jVar6;
            return jVar6;
        }
        C3799j r = mo17001r(i);
        this.f11951Q = r;
        return r;
    }

    /* renamed from: x */
    private void m16523x(int i) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i2 = this.f11919p0;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
    }

    /* renamed from: y */
    private void m16524y(int i) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i2 = this.f11919p0;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr2 = this.f12133E1;
        int i3 = this.f11919p0;
        this.f11919p0 = i3 + 1;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            mo16989a((int) b2 & 255, this.f11919p0);
        }
    }

    /* renamed from: z */
    private void m16525z(int i) throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr = this.f12133E1;
        int i2 = this.f11919p0;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            mo16989a((int) b & 255, this.f11919p0);
        }
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr2 = this.f12133E1;
        int i3 = this.f11919p0;
        this.f11919p0 = i3 + 1;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            mo16989a((int) b2 & 255, this.f11919p0);
        }
        if (this.f11919p0 >= this.f11920q0) {
            mo16814H0();
        }
        byte[] bArr3 = this.f12133E1;
        int i4 = this.f11919p0;
        this.f11919p0 = i4 + 1;
        byte b3 = bArr3[i4];
        if ((b3 & 192) != 128) {
            mo16989a((int) b3 & 255, this.f11919p0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public boolean mo16813G0() throws IOException {
        long j = this.f11921r0;
        int i = this.f11920q0;
        this.f11921r0 = j + ((long) i);
        this.f11923t0 -= i;
        InputStream inputStream = this.f12132D1;
        if (inputStream != null) {
            byte[] bArr = this.f12133E1;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this.f11919p0 = 0;
                this.f11920q0 = read;
                return true;
            }
            mo16830t0();
            if (read == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("InputStream.read() returned 0 characters when trying to read ");
                sb.append(this.f12133E1.length);
                sb.append(" bytes");
                throw new IOException(sb.toString());
            }
        }
        return false;
    }

    /* renamed from: J */
    public Object mo16667J() throws IOException, JsonParseException {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public C3799j mo16978K0() throws IOException, JsonParseException {
        char[] e = this.f11929z0.mo17124e();
        int[] iArr = f12127H1;
        byte[] bArr = this.f12133E1;
        int i = 0;
        while (true) {
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            if (i >= e.length) {
                e = this.f11929z0.mo17127h();
                i = 0;
            }
            int i2 = this.f11920q0;
            int length = this.f11919p0 + (e.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this.f11919p0;
                if (i3 >= i2) {
                    break;
                }
                this.f11919p0 = i3 + 1;
                int i4 = bArr[i3] & 255;
                if (i4 != 39 && iArr[i4] == 0) {
                    int i5 = i + 1;
                    e[i] = (char) i4;
                    i = i5;
                } else if (i4 == 39) {
                    this.f11929z0.mo17114a(i);
                    return C3799j.VALUE_STRING;
                } else {
                    int i6 = iArr[i4];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            i4 = m16518s(i4);
                        } else if (i6 == 3) {
                            i4 = this.f11920q0 - this.f11919p0 >= 2 ? m16520u(i4) : m16519t(i4);
                        } else if (i6 != 4) {
                            if (i4 < 32) {
                                mo16842b(i4, "string value");
                            }
                            mo16997n(i4);
                        } else {
                            int v = m16521v(i4);
                            int i7 = i + 1;
                            e[i] = (char) (55296 | (v >> 10));
                            if (i7 >= e.length) {
                                e = this.f11929z0.mo17127h();
                                i7 = 0;
                            }
                            int i8 = i7;
                            i4 = 56320 | (v & 1023);
                            i = i8;
                        }
                    } else if (i4 != 34) {
                        i4 = mo16831u0();
                    }
                    if (i >= e.length) {
                        e = this.f11929z0.mo17127h();
                        i = 0;
                    }
                    int i9 = i + 1;
                    e[i] = (char) i4;
                    i = i9;
                }
            }
        }
    }

    /* renamed from: L */
    public Object mo16669L() {
        return this.f12132D1;
    }

    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v3
      assigns: []
      uses: []
      mth insns count: 118
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
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.p160u.C3850f mo16979L0() throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r11 = this;
            int r0 = r11.f11919p0
            int r1 = r11.f11920q0
            if (r0 < r1) goto L_0x0011
            boolean r0 = r11.mo16813G0()
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = ": was expecting closing ''' for name"
            r11.mo16846f(r0)
        L_0x0011:
            byte[] r0 = r11.f12133E1
            int r1 = r11.f11919p0
            int r2 = r1 + 1
            r11.f11919p0 = r2
            byte r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 39
            if (r0 != r1) goto L_0x0026
            com.fasterxml.jackson.core.u.f r0 = com.fasterxml.jackson.core.p160u.C3842a.m16645k()
            return r0
        L_0x0026:
            int[] r2 = r11.f12129A1
            int[] r3 = f12128I1
            r4 = 0
            r6 = r2
            r2 = 0
            r5 = 0
            r7 = 0
        L_0x002f:
            if (r0 != r1) goto L_0x0051
            if (r2 <= 0) goto L_0x0043
            int r0 = r6.length
            if (r5 < r0) goto L_0x003e
            int r0 = r6.length
            int[] r0 = m16515a(r6, r0)
            r11.f12129A1 = r0
            r6 = r0
        L_0x003e:
            int r0 = r5 + 1
            r6[r5] = r7
            goto L_0x0044
        L_0x0043:
            r0 = r5
        L_0x0044:
            com.fasterxml.jackson.core.u.a r1 = r11.f12136z1
            com.fasterxml.jackson.core.u.f r1 = r1.mo17021b(r6, r0)
            if (r1 != 0) goto L_0x0050
            com.fasterxml.jackson.core.u.f r1 = r11.m16511a(r6, r0, r2)
        L_0x0050:
            return r1
        L_0x0051:
            r8 = 34
            r9 = 4
            r10 = 1
            if (r0 == r8) goto L_0x00b9
            r8 = r3[r0]
            if (r8 == 0) goto L_0x00b9
            r8 = 92
            if (r0 == r8) goto L_0x0065
            java.lang.String r8 = "name"
            r11.mo16842b(r0, r8)
            goto L_0x0069
        L_0x0065:
            char r0 = r11.mo16831u0()
        L_0x0069:
            r8 = 127(0x7f, float:1.78E-43)
            if (r0 <= r8) goto L_0x00b9
            if (r2 < r9) goto L_0x0080
            int r2 = r6.length
            if (r5 < r2) goto L_0x0079
            int r2 = r6.length
            int[] r6 = m16515a(r6, r2)
            r11.f12129A1 = r6
        L_0x0079:
            int r2 = r5 + 1
            r6[r5] = r7
            r5 = r2
            r2 = 0
            r7 = 0
        L_0x0080:
            r8 = 2048(0x800, float:2.87E-42)
            if (r0 >= r8) goto L_0x008e
            int r7 = r7 << 8
            int r8 = r0 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            r7 = r7 | r8
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x008e:
            int r7 = r7 << 8
            int r8 = r0 >> 12
            r8 = r8 | 224(0xe0, float:3.14E-43)
            r7 = r7 | r8
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x00ab
            int r2 = r6.length
            if (r5 < r2) goto L_0x00a4
            int r2 = r6.length
            int[] r2 = m16515a(r6, r2)
            r11.f12129A1 = r2
            r6 = r2
        L_0x00a4:
            int r2 = r5 + 1
            r6[r5] = r7
            r5 = r2
            r2 = 0
            r7 = 0
        L_0x00ab:
            int r7 = r7 << 8
            int r8 = r0 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7 = r7 | r8
            int r2 = r2 + r10
        L_0x00b5:
            r0 = r0 & 63
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x00b9:
            if (r2 >= r9) goto L_0x00c2
            int r2 = r2 + 1
            int r7 = r7 << 8
            r0 = r0 | r7
            r7 = r0
            goto L_0x00d3
        L_0x00c2:
            int r2 = r6.length
            if (r5 < r2) goto L_0x00cc
            int r2 = r6.length
            int[] r6 = m16515a(r6, r2)
            r11.f12129A1 = r6
        L_0x00cc:
            int r2 = r5 + 1
            r6[r5] = r7
            r7 = r0
            r5 = r2
            r2 = 1
        L_0x00d3:
            int r0 = r11.f11919p0
            int r8 = r11.f11920q0
            if (r0 < r8) goto L_0x00e4
            boolean r0 = r11.mo16813G0()
            if (r0 != 0) goto L_0x00e4
            java.lang.String r0 = " in field name"
            r11.mo16846f(r0)
        L_0x00e4:
            byte[] r0 = r11.f12133E1
            int r8 = r11.f11919p0
            int r9 = r8 + 1
            r11.f11919p0 = r9
            byte r0 = r0[r8]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.mo16979L0():com.fasterxml.jackson.core.u.f");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo16980M0() throws IOException {
        if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
            byte[] bArr = this.f12133E1;
            int i = this.f11919p0;
            if (bArr[i] == 10) {
                this.f11919p0 = i + 1;
            }
        }
        this.f11922s0++;
        this.f11923t0 = this.f11919p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo16981N0() throws IOException {
        this.f11922s0++;
        this.f11923t0 = this.f11919p0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo16982O0() throws IOException, JsonParseException {
        this.f12130B1 = false;
        int[] iArr = f12127H1;
        byte[] bArr = this.f12133E1;
        while (true) {
            int i = this.f11919p0;
            int i2 = this.f11920q0;
            if (i >= i2) {
                mo16814H0();
                i = this.f11919p0;
                i2 = this.f11920q0;
            }
            while (true) {
                if (i >= i2) {
                    this.f11919p0 = i;
                    break;
                }
                int i3 = i + 1;
                byte b = bArr[i] & 255;
                if (iArr[b] != 0) {
                    this.f11919p0 = i3;
                    if (b != 34) {
                        int i4 = iArr[b];
                        if (i4 == 1) {
                            mo16831u0();
                        } else if (i4 == 2) {
                            m16523x(b);
                        } else if (i4 == 3) {
                            m16524y(b);
                        } else if (i4 == 4) {
                            m16525z(b);
                        } else if (b < 32) {
                            mo16842b((int) b, "string value");
                        } else {
                            mo16997n(b);
                        }
                    } else {
                        return;
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public C3850f mo16983P0() throws IOException, JsonParseException {
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            mo16846f(": was expecting closing '\"' for name");
        }
        byte[] bArr = this.f12133E1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        byte b = bArr[i] & 255;
        if (b == 34) {
            return C3842a.m16645k();
        }
        return mo16987a(this.f12129A1, 0, 0, (int) b, 0);
    }

    /* renamed from: U */
    public String mo16678U() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != C3799j.VALUE_STRING) {
            return mo16988a(jVar);
        }
        if (this.f12130B1) {
            this.f12130B1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17123d();
    }

    /* renamed from: V */
    public char[] mo16679V() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == null) {
            return null;
        }
        int i = C3840a.f12137a[jVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (!(i == 3 || i == 4)) {
                    return this.f11951Q.mo16744e();
                }
            } else if (this.f12130B1) {
                this.f12130B1 = false;
                mo16832v0();
            }
            return this.f11929z0.mo17130k();
        }
        if (!this.f11904B0) {
            String b = this.f11927x0.mo16736b();
            int length = b.length();
            char[] cArr = this.f11903A0;
            if (cArr == null) {
                this.f11903A0 = this.f11917n0.mo16879a(length);
            } else if (cArr.length < length) {
                this.f11903A0 = new char[length];
            }
            b.getChars(0, length, this.f11903A0, 0);
            this.f11904B0 = true;
        }
        return this.f11903A0;
    }

    /* renamed from: W */
    public int mo16680W() throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar == null) {
            return 0;
        }
        int i = C3840a.f12137a[jVar.ordinal()];
        if (i == 1) {
            return this.f11927x0.mo16736b().length();
        }
        if (i != 2) {
            if (!(i == 3 || i == 4)) {
                return this.f11951Q.mo16744e().length;
            }
        } else if (this.f12130B1) {
            this.f12130B1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17135p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r0 != 4) goto L_0x002a;
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo16681X() throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.j r0 = r3.f11951Q
            r1 = 0
            if (r0 == 0) goto L_0x002a
            int[] r2 = com.fasterxml.jackson.core.p159t.C3839h.C3840a.f12137a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L_0x002a
            r2 = 2
            if (r0 == r2) goto L_0x001a
            r2 = 3
            if (r0 == r2) goto L_0x0023
            r2 = 4
            if (r0 == r2) goto L_0x0023
            goto L_0x002a
        L_0x001a:
            boolean r0 = r3.f12130B1
            if (r0 == 0) goto L_0x0023
            r3.f12130B1 = r1
            r3.mo16832v0()
        L_0x0023:
            com.fasterxml.jackson.core.w.j r0 = r3.f11929z0
            int r0 = r0.mo17131l()
            return r0
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.mo16681X():int");
    }

    /* renamed from: a */
    public void mo16695a(C3800k kVar) {
        this.f12135y1 = kVar;
    }

    /* renamed from: b */
    public int mo16701b(OutputStream outputStream) throws IOException {
        int i = this.f11920q0;
        int i2 = this.f11919p0;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        outputStream.write(this.f12133E1, i2, i3);
        return i3;
    }

    /* renamed from: c */
    public String mo16709c(String str) throws IOException, JsonParseException {
        if (this.f11951Q != C3799j.VALUE_STRING) {
            return super.mo16709c(str);
        }
        if (this.f12130B1) {
            this.f12130B1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17123d();
    }

    public void close() throws IOException {
        super.close();
        this.f12136z1.mo17026f();
    }

    /* renamed from: d0 */
    public String mo16715d0() throws IOException, JsonParseException {
        if (this.f11951Q != C3799j.VALUE_STRING) {
            return super.mo16709c(null);
        }
        if (this.f12130B1) {
            this.f12130B1 = false;
            mo16832v0();
        }
        return this.f11929z0.mo17123d();
    }

    /* renamed from: e */
    public int mo16716e(int i) throws IOException, JsonParseException {
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_NUMBER_INT) {
                return mo16670M();
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return i;
        }
        if (mo16728j0() == C3799j.VALUE_NUMBER_INT) {
            i = mo16670M();
        }
        return i;
    }

    /* renamed from: h0 */
    public Boolean mo16724h0() throws IOException, JsonParseException {
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jVar == C3799j.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return null;
        }
        int i = C3840a.f12137a[mo16728j0().ordinal()];
        if (i == 5) {
            return Boolean.TRUE;
        }
        if (i != 6) {
            return null;
        }
        return Boolean.FALSE;
    }

    /* renamed from: i */
    public C3800k mo16725i() {
        return this.f12135y1;
    }

    /* renamed from: i0 */
    public String mo16726i0() throws IOException, JsonParseException {
        String str = null;
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_STRING) {
                if (this.f12130B1) {
                    this.f12130B1 = false;
                    mo16832v0();
                }
                return this.f11929z0.mo17123d();
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return null;
        }
        if (mo16728j0() == C3799j.VALUE_STRING) {
            str = mo16678U();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C3799j mo16993j(int i) throws IOException, JsonParseException {
        if (i != 39) {
            if (i == 43) {
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    mo16849r0();
                }
                byte[] bArr = this.f12133E1;
                int i2 = this.f11919p0;
                this.f11919p0 = i2 + 1;
                return mo16985a((int) bArr[i2] & 255, false);
            } else if (i == 78) {
                String str = "NaN";
                mo16990a(str, 1);
                if (mo16710c(C3796b.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return mo16819a(str, Double.NaN);
                }
                mo16844e("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        } else if (mo16710c(C3796b.ALLOW_SINGLE_QUOTES)) {
            return mo16978K0();
        }
        mo16839a(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    /* renamed from: j0 */
    public C3799j mo16728j0() throws IOException, JsonParseException {
        C3799j jVar;
        this.f11907E0 = 0;
        if (this.f11951Q == C3799j.FIELD_NAME) {
            return m16498R0();
        }
        if (this.f12130B1) {
            mo16982O0();
        }
        int X0 = m16504X0();
        if (X0 < 0) {
            close();
            this.f11951Q = null;
            return null;
        }
        long j = this.f11921r0;
        int i = this.f11919p0;
        this.f11924u0 = (j + ((long) i)) - 1;
        this.f11925v0 = this.f11922s0;
        this.f11926w0 = (i - this.f11923t0) - 1;
        this.f11906D0 = null;
        if (X0 == 93) {
            if (!this.f11927x0.mo16740f()) {
                mo16823a(X0, '}');
            }
            this.f11927x0 = this.f11927x0.mo16738d();
            C3799j jVar2 = C3799j.END_ARRAY;
            this.f11951Q = jVar2;
            return jVar2;
        } else if (X0 == 125) {
            if (!this.f11927x0.mo16741g()) {
                mo16823a(X0, ']');
            }
            this.f11927x0 = this.f11927x0.mo16738d();
            C3799j jVar3 = C3799j.END_OBJECT;
            this.f11951Q = jVar3;
            return jVar3;
        } else {
            if (this.f11927x0.mo16942i()) {
                if (X0 != 44) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("was expecting comma to separate ");
                    sb.append(this.f11927x0.mo16739e());
                    sb.append(" entries");
                    mo16839a(X0, sb.toString());
                }
                X0 = m16503W0();
            }
            if (!this.f11927x0.mo16741g()) {
                return m16522w(X0);
            }
            this.f11927x0.mo16940a(mo16996m(X0).mo17051a());
            this.f11951Q = C3799j.FIELD_NAME;
            int W0 = m16503W0();
            if (W0 != 58) {
                mo16839a(W0, "was expecting a colon to separate field name and value");
            }
            int W02 = m16503W0();
            if (W02 == 34) {
                this.f12130B1 = true;
                this.f11928y0 = C3799j.VALUE_STRING;
                return this.f11951Q;
            }
            if (W02 != 45) {
                if (W02 != 91) {
                    if (W02 != 93) {
                        if (W02 == 102) {
                            mo16990a("false", 1);
                            jVar = C3799j.VALUE_FALSE;
                        } else if (W02 != 110) {
                            if (W02 != 116) {
                                if (W02 != 123) {
                                    if (W02 != 125) {
                                        switch (W02) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                break;
                                            default:
                                                jVar = mo16993j(W02);
                                                break;
                                        }
                                    }
                                } else {
                                    jVar = C3799j.START_OBJECT;
                                }
                            }
                            mo16990a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                            jVar = C3799j.VALUE_TRUE;
                        } else {
                            mo16990a("null", 1);
                            jVar = C3799j.VALUE_NULL;
                        }
                    }
                    mo16839a(W02, "expected a value");
                    mo16990a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                    jVar = C3799j.VALUE_TRUE;
                } else {
                    jVar = C3799j.START_ARRAY;
                }
                this.f11928y0 = jVar;
                return this.f11951Q;
            }
            jVar = mo17001r(W02);
            this.f11928y0 = jVar;
            return this.f11951Q;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C3850f mo16994k(int i) throws IOException, JsonParseException {
        if (i == 39 && mo16710c(C3796b.ALLOW_SINGLE_QUOTES)) {
            return mo16979L0();
        }
        if (!mo16710c(C3796b.ALLOW_UNQUOTED_FIELD_NAMES)) {
            mo16839a(i, "was expecting double-quote to start field name");
        }
        int[] h = C3817b.m16267h();
        if (h[i] != 0) {
            mo16839a(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this.f12129A1;
        int i2 = 0;
        byte b = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = (i4 << 8) | b;
            } else {
                if (i3 >= iArr.length) {
                    iArr = m16515a(iArr, iArr.length);
                    this.f12129A1 = iArr;
                }
                int i5 = i3 + 1;
                iArr[i3] = i4;
                i3 = i5;
                i4 = b;
                i2 = 1;
            }
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16846f(" in field name");
            }
            byte[] bArr = this.f12133E1;
            int i6 = this.f11919p0;
            b = bArr[i6] & 255;
            if (h[b] != 0) {
                break;
            }
            this.f11919p0 = i6 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] a = m16515a(iArr, iArr.length);
                this.f12129A1 = a;
                iArr = a;
            }
            int i7 = i3 + 1;
            iArr[i3] = i4;
            i3 = i7;
        }
        C3850f b2 = this.f12136z1.mo17021b(iArr, i3);
        if (b2 == null) {
            b2 = m16511a(iArr, i3, i2);
        }
        return b2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo16995l(int i) throws IOException {
        if (this.f12132D1 == null) {
            return false;
        }
        int i2 = this.f11920q0;
        int i3 = this.f11919p0;
        int i4 = i2 - i3;
        if (i4 <= 0 || i3 <= 0) {
            this.f11920q0 = 0;
        } else {
            this.f11921r0 += (long) i3;
            this.f11923t0 -= i3;
            byte[] bArr = this.f12133E1;
            System.arraycopy(bArr, i3, bArr, 0, i4);
            this.f11920q0 = i4;
        }
        this.f11919p0 = 0;
        while (true) {
            int i5 = this.f11920q0;
            if (i5 >= i) {
                return true;
            }
            InputStream inputStream = this.f12132D1;
            byte[] bArr2 = this.f12133E1;
            int read = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (read < 1) {
                mo16830t0();
                if (read != 0) {
                    return false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("InputStream.read() returned 0 characters when trying to read ");
                sb.append(i4);
                sb.append(" bytes");
                throw new IOException(sb.toString());
            }
            this.f11920q0 += read;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C3850f mo16996m(int i) throws IOException, JsonParseException {
        if (i != 34) {
            return mo16994k(i);
        }
        int i2 = this.f11919p0;
        if (i2 + 9 > this.f11920q0) {
            return mo16983P0();
        }
        byte[] bArr = this.f12133E1;
        int[] iArr = f12128I1;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            int i3 = this.f11919p0;
            this.f11919p0 = i3 + 1;
            byte b2 = bArr[i3] & 255;
            if (iArr[b2] == 0) {
                byte b3 = (b << 8) | b2;
                int i4 = this.f11919p0;
                this.f11919p0 = i4 + 1;
                byte b4 = bArr[i4] & 255;
                if (iArr[b4] == 0) {
                    byte b5 = (b3 << 8) | b4;
                    int i5 = this.f11919p0;
                    this.f11919p0 = i5 + 1;
                    byte b6 = bArr[i5] & 255;
                    if (iArr[b6] == 0) {
                        byte b7 = (b5 << 8) | b6;
                        int i6 = this.f11919p0;
                        this.f11919p0 = i6 + 1;
                        byte b8 = bArr[i6] & 255;
                        if (iArr[b8] == 0) {
                            this.f12131C1 = b7;
                            return mo16986a((int) b8, iArr);
                        } else if (b8 == 34) {
                            return m16516b(b7, 4);
                        } else {
                            return m16517b(b7, b8, 4);
                        }
                    } else if (b6 == 34) {
                        return m16516b(b5, 3);
                    } else {
                        return m16517b(b5, b6, 3);
                    }
                } else if (b4 == 34) {
                    return m16516b(b3, 2);
                } else {
                    return m16517b(b3, b4, 2);
                }
            } else if (b2 == 34) {
                return m16516b(b, 1);
            } else {
                return m16517b(b, b2, 1);
            }
        } else if (b == 34) {
            return C3842a.m16645k();
        } else {
            return m16517b(0, b, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo16997n(int i) throws JsonParseException {
        if (i < 32) {
            mo16845f(i);
        }
        mo16998o(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo16998o(int i) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-8 start byte 0x");
        sb.append(Integer.toHexString(i));
        mo16844e(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo16999p(int i) throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-8 middle byte 0x");
        sb.append(Integer.toHexString(i));
        mo16844e(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public C3850f mo17000q(int i) throws IOException, JsonParseException {
        int[] iArr = f12128I1;
        int i2 = 2;
        while (true) {
            int i3 = this.f11920q0;
            int i4 = this.f11919p0;
            if (i3 - i4 < 4) {
                return mo16987a(this.f12129A1, i2, 0, i, 0);
            }
            byte[] bArr = this.f12133E1;
            this.f11919p0 = i4 + 1;
            byte b = bArr[i4] & 255;
            if (iArr[b] == 0) {
                byte b2 = (i << 8) | b;
                int i5 = this.f11919p0;
                this.f11919p0 = i5 + 1;
                byte b3 = bArr[i5] & 255;
                if (iArr[b3] == 0) {
                    byte b4 = (b2 << 8) | b3;
                    int i6 = this.f11919p0;
                    this.f11919p0 = i6 + 1;
                    byte b5 = bArr[i6] & 255;
                    if (iArr[b5] == 0) {
                        int i7 = (b4 << 8) | b5;
                        int i8 = this.f11919p0;
                        this.f11919p0 = i8 + 1;
                        byte b6 = bArr[i8] & 255;
                        if (iArr[b6] == 0) {
                            int[] iArr2 = this.f12129A1;
                            if (i2 >= iArr2.length) {
                                this.f12129A1 = m16515a(iArr2, i2);
                            }
                            int i9 = i2 + 1;
                            this.f12129A1[i2] = i7;
                            i2 = i9;
                            i = b6;
                        } else if (b6 == 34) {
                            return m16512a(this.f12129A1, i2, i7, 4);
                        } else {
                            return mo16987a(this.f12129A1, i2, i7, (int) b6, 4);
                        }
                    } else if (b5 == 34) {
                        return m16512a(this.f12129A1, i2, (int) b4, 3);
                    } else {
                        return mo16987a(this.f12129A1, i2, (int) b4, (int) b5, 3);
                    }
                } else if (b3 == 34) {
                    return m16512a(this.f12129A1, i2, (int) b2, 2);
                } else {
                    return mo16987a(this.f12129A1, i2, (int) b2, (int) b3, 2);
                }
            } else if (b == 34) {
                return m16512a(this.f12129A1, i2, i, 1);
            } else {
                return mo16987a(this.f12129A1, i2, i, (int) b, 1);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C3799j mo17001r(int i) throws IOException, JsonParseException {
        byte b;
        char[] e = this.f11929z0.mo17124e();
        int i2 = 0;
        boolean z = i == 45;
        if (z) {
            e[0] = '-';
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            byte[] bArr = this.f12133E1;
            int i3 = this.f11919p0;
            this.f11919p0 = i3 + 1;
            i = bArr[i3] & 255;
            if (i < 48 || i > 57) {
                return mo16985a(i, true);
            }
            i2 = 1;
        }
        if (i == 48) {
            i = m16505Y0();
        }
        int i4 = i2 + 1;
        e[i2] = (char) i;
        int length = this.f11919p0 + e.length;
        int i5 = this.f11920q0;
        if (length > i5) {
            length = i5;
        }
        int i6 = 1;
        while (true) {
            int i7 = this.f11919p0;
            if (i7 >= length) {
                return m16508a(e, i4, z, i6);
            }
            byte[] bArr2 = this.f12133E1;
            this.f11919p0 = i7 + 1;
            b = bArr2[i7] & 255;
            if (b >= 48 && b <= 57) {
                i6++;
                int i8 = i4 + 1;
                e[i4] = (char) b;
                i4 = i8;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return m16507a(e, i4, (int) b, z, i6);
        }
        this.f11919p0--;
        this.f11929z0.mo17114a(i4);
        return mo16820a(z, i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public void mo16830t0() throws IOException {
        if (this.f12132D1 != null) {
            if (this.f11917n0.mo16891i() || mo16710c(C3796b.AUTO_CLOSE_SOURCE)) {
                this.f12132D1.close();
            }
            this.f12132D1 = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public char mo16831u0() throws IOException, JsonParseException {
        String str = " in character escape sequence";
        if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
            mo16846f(str);
        }
        byte[] bArr = this.f12133E1;
        int i = this.f11919p0;
        this.f11919p0 = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return 8;
        }
        if (b == 102) {
            return 12;
        }
        if (b == 110) {
            return 10;
        }
        if (b == 114) {
            return 13;
        }
        if (b == 116) {
            return 9;
        }
        if (b != 117) {
            return mo16837a((char) mo16963i(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16846f(str);
            }
            byte[] bArr2 = this.f12133E1;
            int i4 = this.f11919p0;
            this.f11919p0 = i4 + 1;
            byte b2 = bArr2[i4];
            int a = C3817b.m16258a(b2);
            if (a < 0) {
                mo16839a((int) b2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | a;
        }
        return (char) i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo16832v0() throws IOException, JsonParseException {
        int i = this.f11919p0;
        if (i >= this.f11920q0) {
            mo16814H0();
            i = this.f11919p0;
        }
        int i2 = 0;
        char[] e = this.f11929z0.mo17124e();
        int[] iArr = f12127H1;
        int min = Math.min(this.f11920q0, e.length + i);
        byte[] bArr = this.f12133E1;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (iArr[b] == 0) {
                i++;
                int i3 = i2 + 1;
                e[i2] = (char) b;
                i2 = i3;
            } else if (b == 34) {
                this.f11919p0 = i + 1;
                this.f11929z0.mo17114a(i2);
                return;
            }
        }
        this.f11919p0 = i;
        m16513a(e, i2);
    }

    public C3804o version() {
        return C3832b.f12070d.mo17137a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo16834x0() throws IOException {
        super.mo16834x0();
        if (this.f12134F1) {
            byte[] bArr = this.f12133E1;
            if (bArr != null) {
                this.f12133E1 = null;
                this.f11917n0.mo16880b(bArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16988a(C3799j jVar) {
        if (jVar == null) {
            return null;
        }
        int i = C3840a.f12137a[jVar.ordinal()];
        if (i == 1) {
            return this.f11927x0.mo16736b();
        }
        if (i == 2 || i == 3 || i == 4) {
            return this.f11929z0.mo17123d();
        }
        return jVar.mo16745f();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo16963i(int r7) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r6 = this;
            if (r7 >= 0) goto L_0x0064
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L_0x000e
            r7 = r7 & 31
        L_0x000c:
            r0 = 1
            goto L_0x0028
        L_0x000e:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L_0x0018
            r7 = r7 & 15
            r0 = 2
            goto L_0x0028
        L_0x0018:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L_0x0022
            r7 = r7 & 7
            r0 = 3
            goto L_0x0028
        L_0x0022:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6.mo16998o(r0)
            goto L_0x000c
        L_0x0028:
            int r3 = r6.m16506Z0()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 == r5) goto L_0x0037
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6.mo16999p(r4)
        L_0x0037:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L_0x0064
            int r2 = r6.m16506Z0()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L_0x004b
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6.mo16999p(r3)
        L_0x004b:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L_0x0064
            int r0 = r6.m16506Z0()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L_0x005f
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6.mo16999p(r1)
        L_0x005f:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L_0x0064:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.mo16963i(int):int");
    }

    /* renamed from: b */
    public long mo16702b(long j) throws IOException, JsonParseException {
        if (this.f11951Q == C3799j.FIELD_NAME) {
            this.f11904B0 = false;
            C3799j jVar = this.f11928y0;
            this.f11928y0 = null;
            this.f11951Q = jVar;
            if (jVar == C3799j.VALUE_NUMBER_INT) {
                return mo16672O();
            }
            if (jVar == C3799j.START_ARRAY) {
                this.f11927x0 = this.f11927x0.mo16938a(this.f11925v0, this.f11926w0);
            } else if (jVar == C3799j.START_OBJECT) {
                this.f11927x0 = this.f11927x0.mo16941b(this.f11925v0, this.f11926w0);
            }
            return j;
        }
        if (mo16728j0() == C3799j.VALUE_NUMBER_INT) {
            j = mo16672O();
        }
        return j;
    }

    /* renamed from: a */
    public byte[] mo16699a(C3785a aVar) throws IOException, JsonParseException {
        C3799j jVar = this.f11951Q;
        if (jVar != C3799j.VALUE_STRING && (jVar != C3799j.VALUE_EMBEDDED_OBJECT || this.f11906D0 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current token (");
            sb.append(this.f11951Q);
            sb.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            mo16844e(sb.toString());
        }
        if (this.f12130B1) {
            try {
                this.f11906D0 = mo16992b(aVar);
                this.f12130B1 = false;
            } catch (IllegalArgumentException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to decode VALUE_STRING as base64 (");
                sb2.append(aVar);
                sb2.append("): ");
                sb2.append(e.getMessage());
                throw mo16703b(sb2.toString());
            }
        } else if (this.f11906D0 == null) {
            C3857b w0 = mo16833w0();
            mo16841a(mo16678U(), w0, aVar);
            this.f11906D0 = w0.mo17095h();
        }
        return this.f11906D0;
    }

    /* renamed from: b */
    private C3850f m16517b(int i, int i2, int i3) throws IOException, JsonParseException {
        return mo16987a(this.f12129A1, 0, i, i2, i3);
    }

    /* renamed from: b */
    private C3850f m16516b(int i, int i2) throws JsonParseException {
        C3850f b = this.f12136z1.mo17019b(i);
        if (b != null) {
            return b;
        }
        int[] iArr = this.f12129A1;
        iArr[0] = i;
        return m16511a(iArr, 1, i2);
    }

    /* renamed from: a */
    public int mo16686a(C3785a aVar, OutputStream outputStream) throws IOException, JsonParseException {
        if (!this.f12130B1 || this.f11951Q != C3799j.VALUE_STRING) {
            byte[] a = mo16699a(aVar);
            outputStream.write(a);
            return a.length;
        }
        byte[] a2 = this.f11917n0.mo16878a();
        try {
            int a3 = mo16984a(aVar, outputStream, a2);
            return a3;
        } finally {
            this.f11917n0.mo16876a(a2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public byte[] mo16992b(C3785a aVar) throws IOException, JsonParseException {
        C3857b w0 = mo16833w0();
        while (true) {
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            byte[] bArr = this.f12133E1;
            int i = this.f11919p0;
            this.f11919p0 = i + 1;
            byte b = bArr[i] & 255;
            if (b > 32) {
                int a = aVar.mo16489a((int) b);
                if (a < 0) {
                    if (b == 34) {
                        return w0.mo17095h();
                    }
                    a = mo16818a(aVar, (int) b, 0);
                    if (a < 0) {
                        continue;
                    }
                }
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr2 = this.f12133E1;
                int i2 = this.f11919p0;
                this.f11919p0 = i2 + 1;
                byte b2 = bArr2[i2] & 255;
                int a2 = aVar.mo16489a((int) b2);
                if (a2 < 0) {
                    a2 = mo16818a(aVar, (int) b2, 1);
                }
                int i3 = (a << 6) | a2;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr3 = this.f12133E1;
                int i4 = this.f11919p0;
                this.f11919p0 = i4 + 1;
                byte b3 = bArr3[i4] & 255;
                int a3 = aVar.mo16489a((int) b3);
                if (a3 < 0) {
                    if (a3 != -2) {
                        if (b3 != 34 || aVar.mo16504f()) {
                            a3 = mo16818a(aVar, (int) b3, 2);
                        } else {
                            w0.mo17083a(i3 >> 4);
                            return w0.mo17095h();
                        }
                    }
                    if (a3 == -2) {
                        if (this.f11919p0 >= this.f11920q0) {
                            mo16814H0();
                        }
                        byte[] bArr4 = this.f12133E1;
                        int i5 = this.f11919p0;
                        this.f11919p0 = i5 + 1;
                        byte b4 = bArr4[i5] & 255;
                        if (aVar.mo16502d(b4)) {
                            w0.mo17083a(i3 >> 4);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(aVar.mo16503e());
                            sb.append("'");
                            throw mo16822a(aVar, (int) b4, 3, sb.toString());
                        }
                    }
                }
                int i6 = (i3 << 6) | a3;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr5 = this.f12133E1;
                int i7 = this.f11919p0;
                this.f11919p0 = i7 + 1;
                byte b5 = bArr5[i7] & 255;
                int a4 = aVar.mo16489a((int) b5);
                if (a4 < 0) {
                    if (a4 != -2) {
                        if (b5 != 34 || aVar.mo16504f()) {
                            a4 = mo16818a(aVar, (int) b5, 3);
                        } else {
                            w0.mo17090f(i6 >> 2);
                            return w0.mo17095h();
                        }
                    }
                    if (a4 == -2) {
                        w0.mo17090f(i6 >> 2);
                    }
                }
                w0.mo17088e((i6 << 6) | a4);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo16984a(C3785a aVar, OutputStream outputStream, byte[] bArr) throws IOException, JsonParseException {
        int i;
        int length = bArr.length - 3;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            byte[] bArr2 = this.f12133E1;
            int i4 = this.f11919p0;
            this.f11919p0 = i4 + 1;
            byte b = bArr2[i4] & 255;
            if (b > 32) {
                int a = aVar.mo16489a((int) b);
                if (a < 0) {
                    if (b == 34) {
                        break;
                    }
                    a = mo16818a(aVar, (int) b, 0);
                    if (a < 0) {
                        continue;
                    }
                }
                if (i3 > length) {
                    i2 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr3 = this.f12133E1;
                int i5 = this.f11919p0;
                this.f11919p0 = i5 + 1;
                byte b2 = bArr3[i5] & 255;
                int a2 = aVar.mo16489a((int) b2);
                if (a2 < 0) {
                    a2 = mo16818a(aVar, (int) b2, 1);
                }
                int i6 = (a << 6) | a2;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr4 = this.f12133E1;
                int i7 = this.f11919p0;
                this.f11919p0 = i7 + 1;
                byte b3 = bArr4[i7] & 255;
                int a3 = aVar.mo16489a((int) b3);
                if (a3 < 0) {
                    if (a3 != -2) {
                        if (b3 == 34 && !aVar.mo16504f()) {
                            int i8 = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i8;
                            break;
                        }
                        a3 = mo16818a(aVar, (int) b3, 2);
                    }
                    if (a3 == -2) {
                        if (this.f11919p0 >= this.f11920q0) {
                            mo16814H0();
                        }
                        byte[] bArr5 = this.f12133E1;
                        int i9 = this.f11919p0;
                        this.f11919p0 = i9 + 1;
                        byte b4 = bArr5[i9] & 255;
                        if (aVar.mo16502d(b4)) {
                            i = i3 + 1;
                            bArr[i3] = (byte) (i6 >> 4);
                            i3 = i;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected padding character '");
                            sb.append(aVar.mo16503e());
                            sb.append("'");
                            throw mo16822a(aVar, (int) b4, 3, sb.toString());
                        }
                    }
                }
                int i10 = (i6 << 6) | a3;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr6 = this.f12133E1;
                int i11 = this.f11919p0;
                this.f11919p0 = i11 + 1;
                byte b5 = bArr6[i11] & 255;
                int a4 = aVar.mo16489a((int) b5);
                if (a4 < 0) {
                    if (a4 != -2) {
                        if (b5 == 34 && !aVar.mo16504f()) {
                            int i12 = i10 >> 2;
                            int i13 = i3 + 1;
                            bArr[i3] = (byte) (i12 >> 8);
                            i3 = i13 + 1;
                            bArr[i13] = (byte) i12;
                            break;
                        }
                        a4 = mo16818a(aVar, (int) b5, 3);
                    }
                    if (a4 == -2) {
                        int i14 = i10 >> 2;
                        int i15 = i3 + 1;
                        bArr[i3] = (byte) (i14 >> 8);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) i14;
                    }
                }
                int i16 = (i10 << 6) | a4;
                int i17 = i3 + 1;
                bArr[i3] = (byte) (i16 >> 16);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (i16 >> 8);
                i = i18 + 1;
                bArr[i18] = (byte) i16;
                i3 = i;
            }
        }
        this.f12130B1 = false;
        if (i3 <= 0) {
            return i2;
        }
        int i19 = i2 + i3;
        outputStream.write(bArr, 0, i3);
        return i19;
    }

    /* renamed from: a */
    public boolean mo16697a(C3802m mVar) throws IOException, JsonParseException {
        int i = 0;
        this.f11907E0 = 0;
        if (this.f11951Q == C3799j.FIELD_NAME) {
            m16498R0();
            return false;
        }
        if (this.f12130B1) {
            mo16982O0();
        }
        int X0 = m16504X0();
        if (X0 < 0) {
            close();
            this.f11951Q = null;
            return false;
        }
        long j = this.f11921r0;
        int i2 = this.f11919p0;
        this.f11924u0 = (j + ((long) i2)) - 1;
        this.f11925v0 = this.f11922s0;
        this.f11926w0 = (i2 - this.f11923t0) - 1;
        this.f11906D0 = null;
        if (X0 == 93) {
            if (!this.f11927x0.mo16740f()) {
                mo16823a(X0, '}');
            }
            this.f11927x0 = this.f11927x0.mo16738d();
            this.f11951Q = C3799j.END_ARRAY;
            return false;
        } else if (X0 == 125) {
            if (!this.f11927x0.mo16741g()) {
                mo16823a(X0, ']');
            }
            this.f11927x0 = this.f11927x0.mo16738d();
            this.f11951Q = C3799j.END_OBJECT;
            return false;
        } else {
            if (this.f11927x0.mo16942i()) {
                if (X0 != 44) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("was expecting comma to separate ");
                    sb.append(this.f11927x0.mo16739e());
                    sb.append(" entries");
                    mo16839a(X0, sb.toString());
                }
                X0 = m16503W0();
            }
            if (!this.f11927x0.mo16741g()) {
                m16522w(X0);
                return false;
            }
            if (X0 == 34) {
                byte[] d = mVar.mo16781d();
                int length = d.length;
                int i3 = this.f11919p0;
                if (i3 + length < this.f11920q0) {
                    int i4 = i3 + length;
                    if (this.f12133E1[i4] == 34) {
                        while (i != length) {
                            if (d[i] == this.f12133E1[i3 + i]) {
                                i++;
                            }
                        }
                        this.f11919p0 = i4 + 1;
                        this.f11927x0.mo16940a(mVar.getValue());
                        this.f11951Q = C3799j.FIELD_NAME;
                        m16497Q0();
                        return true;
                    }
                }
            }
            return m16514a(X0, mVar);
        }
    }

    /* renamed from: a */
    private boolean m16514a(int i, C3802m mVar) throws IOException, JsonParseException {
        C3799j jVar;
        String a = mo16996m(i).mo17051a();
        this.f11927x0.mo16940a(a);
        boolean equals = a.equals(mVar.getValue());
        this.f11951Q = C3799j.FIELD_NAME;
        int W0 = m16503W0();
        if (W0 != 58) {
            mo16839a(W0, "was expecting a colon to separate field name and value");
        }
        int W02 = m16503W0();
        if (W02 == 34) {
            this.f12130B1 = true;
            this.f11928y0 = C3799j.VALUE_STRING;
            return equals;
        }
        if (W02 != 45) {
            if (W02 != 91) {
                if (W02 != 93) {
                    if (W02 == 102) {
                        mo16990a("false", 1);
                        jVar = C3799j.VALUE_FALSE;
                    } else if (W02 != 110) {
                        if (W02 != 116) {
                            if (W02 != 123) {
                                if (W02 != 125) {
                                    switch (W02) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            break;
                                        default:
                                            jVar = mo16993j(W02);
                                            break;
                                    }
                                }
                            } else {
                                jVar = C3799j.START_OBJECT;
                            }
                        }
                        mo16990a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                        jVar = C3799j.VALUE_TRUE;
                    } else {
                        mo16990a("null", 1);
                        jVar = C3799j.VALUE_NULL;
                    }
                }
                mo16839a(W02, "expected a value");
                mo16990a(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, 1);
                jVar = C3799j.VALUE_TRUE;
            } else {
                jVar = C3799j.START_ARRAY;
            }
            this.f11928y0 = jVar;
            return equals;
        }
        jVar = mo17001r(W02);
        this.f11928y0 = jVar;
        return equals;
    }

    /* renamed from: a */
    private C3799j m16508a(char[] cArr, int i, boolean z, int i2) throws IOException, JsonParseException {
        byte b;
        char[] cArr2 = cArr;
        int i3 = i;
        int i4 = i2;
        while (true) {
            if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
                byte[] bArr = this.f12133E1;
                int i5 = this.f11919p0;
                this.f11919p0 = i5 + 1;
                b = bArr[i5] & 255;
                if (b <= 57 && b >= 48) {
                    if (i3 >= cArr2.length) {
                        i3 = 0;
                        cArr2 = this.f11929z0.mo17127h();
                    }
                    int i6 = i3 + 1;
                    cArr2[i3] = (char) b;
                    i4++;
                    i3 = i6;
                }
            } else {
                this.f11929z0.mo17114a(i3);
                return mo16820a(z, i4);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return m16507a(cArr2, i3, (int) b, z, i4);
        }
        this.f11919p0--;
        this.f11929z0.mo17114a(i3);
        return mo16820a(z, i4);
    }

    /* renamed from: a */
    private C3799j m16507a(char[] cArr, int i, int i2, boolean z, int i3) throws IOException, JsonParseException {
        boolean z2;
        int i4;
        int i5;
        int i6 = 0;
        if (i2 == 46) {
            int i7 = i + 1;
            cArr[i] = (char) i2;
            i = i7;
            byte b = i2;
            char[] cArr2 = cArr;
            int i8 = 0;
            while (true) {
                if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.f12133E1;
                int i9 = this.f11919p0;
                this.f11919p0 = i9 + 1;
                b = bArr[i9] & 255;
                if (b < 48 || b > 57) {
                    z2 = false;
                } else {
                    i8++;
                    if (i >= cArr2.length) {
                        cArr2 = this.f11929z0.mo17127h();
                        i = 0;
                    }
                    int i10 = i + 1;
                    cArr2[i] = (char) b;
                    i = i10;
                }
            }
            if (i8 == 0) {
                mo16826c(b, "Decimal point not followed by a digit");
            }
            int i11 = b;
            i4 = i8;
            cArr = cArr2;
            i2 = i11;
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.f11929z0.mo17127h();
                i = 0;
            }
            int i12 = i + 1;
            cArr[i] = (char) i2;
            if (this.f11919p0 >= this.f11920q0) {
                mo16814H0();
            }
            byte[] bArr2 = this.f12133E1;
            int i13 = this.f11919p0;
            this.f11919p0 = i13 + 1;
            byte b2 = bArr2[i13] & 255;
            if (b2 == 45 || b2 == 43) {
                if (i12 >= cArr.length) {
                    cArr = this.f11929z0.mo17127h();
                    i12 = 0;
                }
                i5 = i12 + 1;
                cArr[i12] = (char) b2;
                if (this.f11919p0 >= this.f11920q0) {
                    mo16814H0();
                }
                byte[] bArr3 = this.f12133E1;
                int i14 = this.f11919p0;
                this.f11919p0 = i14 + 1;
                b2 = bArr3[i14] & 255;
            } else {
                i5 = i12;
            }
            char[] cArr3 = cArr;
            int i15 = 0;
            while (true) {
                if (b2 <= 57 && b2 >= 48) {
                    i15++;
                    if (i5 >= cArr3.length) {
                        cArr3 = this.f11929z0.mo17127h();
                        i5 = 0;
                    }
                    int i16 = i5 + 1;
                    cArr3[i5] = (char) b2;
                    if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                        i6 = i15;
                        i5 = i16;
                        z2 = true;
                        break;
                    }
                    byte[] bArr4 = this.f12133E1;
                    int i17 = this.f11919p0;
                    this.f11919p0 = i17 + 1;
                    b2 = bArr4[i17] & 255;
                    i5 = i16;
                } else {
                    i6 = i15;
                }
            }
            i6 = i15;
            if (i6 == 0) {
                mo16826c(b2, "Exponent indicator not followed by a digit");
            }
            i = i5;
        }
        if (!z2) {
            this.f11919p0--;
        }
        this.f11929z0.mo17114a(i);
        return mo16824b(z, i3, i4, i6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3850f mo16986a(int i, int[] iArr) throws IOException, JsonParseException {
        byte[] bArr = this.f12133E1;
        int i2 = this.f11919p0;
        this.f11919p0 = i2 + 1;
        byte b = bArr[i2] & 255;
        if (iArr[b] == 0) {
            byte b2 = (i << 8) | b;
            int i3 = this.f11919p0;
            this.f11919p0 = i3 + 1;
            byte b3 = bArr[i3] & 255;
            if (iArr[b3] == 0) {
                byte b4 = (b2 << 8) | b3;
                int i4 = this.f11919p0;
                this.f11919p0 = i4 + 1;
                byte b5 = bArr[i4] & 255;
                if (iArr[b5] == 0) {
                    int i5 = (b4 << 8) | b5;
                    int i6 = this.f11919p0;
                    this.f11919p0 = i6 + 1;
                    byte b6 = bArr[i6] & 255;
                    if (iArr[b6] == 0) {
                        int[] iArr2 = this.f12129A1;
                        iArr2[0] = this.f12131C1;
                        iArr2[1] = i5;
                        return mo17000q(b6);
                    } else if (b6 == 34) {
                        return m16509a(this.f12131C1, i5, 4);
                    } else {
                        return m16510a(this.f12131C1, i5, (int) b6, 4);
                    }
                } else if (b5 == 34) {
                    return m16509a(this.f12131C1, (int) b4, 3);
                } else {
                    return m16510a(this.f12131C1, (int) b4, (int) b5, 3);
                }
            } else if (b3 == 34) {
                return m16509a(this.f12131C1, (int) b2, 2);
            } else {
                return m16510a(this.f12131C1, (int) b2, (int) b3, 2);
            }
        } else if (b == 34) {
            return m16509a(this.f12131C1, i, 1);
        } else {
            return m16510a(this.f12131C1, i, (int) b, 1);
        }
    }

    /* renamed from: a */
    private C3850f m16510a(int i, int i2, int i3, int i4) throws IOException, JsonParseException {
        int[] iArr = this.f12129A1;
        iArr[0] = i;
        return mo16987a(iArr, 1, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3850f mo16987a(int[] iArr, int i, int i2, int i3, int i4) throws IOException, JsonParseException {
        int[] iArr2 = f12128I1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    mo16842b(i3, "name");
                } else {
                    i3 = mo16831u0();
                }
                if (i3 > 127) {
                    if (r10 >= 4) {
                        if (i >= iArr.length) {
                            iArr = m16515a(iArr, iArr.length);
                            this.f12129A1 = iArr;
                        }
                        int i5 = i + 1;
                        iArr[i] = r8;
                        i = i5;
                        r8 = 0;
                        r10 = 0;
                    }
                    if (i3 < 2048) {
                        r8 = (r8 << 8) | (i3 >> 6) | 192;
                        r10++;
                    } else {
                        int i6 = (r8 << 8) | (i3 >> 12) | JpegConst.APP0;
                        int i7 = r10 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = m16515a(iArr, iArr.length);
                                this.f12129A1 = iArr;
                            }
                            int i8 = i + 1;
                            iArr[i] = i6;
                            i = i8;
                            i6 = 0;
                            i7 = 0;
                        }
                        r8 = (i6 << 8) | ((i3 >> 6) & 63) | 128;
                        r10 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (r10 < 4) {
                i4 = r10 + 1;
                i2 = (r8 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = m16515a(iArr, iArr.length);
                    this.f12129A1 = iArr;
                }
                int i9 = i + 1;
                iArr[i] = r8;
                i2 = i3;
                i = i9;
                i4 = 1;
            }
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16846f(" in field name");
            }
            byte[] bArr = this.f12133E1;
            int i10 = this.f11919p0;
            this.f11919p0 = i10 + 1;
            i3 = bArr[i10] & 255;
        }
        if (r10 > 0) {
            if (i >= iArr.length) {
                iArr = m16515a(iArr, iArr.length);
                this.f12129A1 = iArr;
            }
            int i11 = i + 1;
            iArr[i] = r8;
            i = i11;
        }
        C3850f b = this.f12136z1.mo17021b(iArr, i);
        return b == null ? m16511a(iArr, i, r10) : b;
    }

    /* renamed from: a */
    private C3850f m16509a(int i, int i2, int i3) throws JsonParseException {
        C3850f b = this.f12136z1.mo17020b(i, i2);
        if (b != null) {
            return b;
        }
        int[] iArr = this.f12129A1;
        iArr[0] = i;
        iArr[1] = i2;
        return m16511a(iArr, 2, i3);
    }

    /* renamed from: a */
    private C3850f m16512a(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = m16515a(iArr, iArr.length);
            this.f12129A1 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = i2;
        C3850f b = this.f12136z1.mo17021b(iArr, i4);
        return b == null ? m16511a(iArr, i4, i3) : b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.fasterxml.jackson.core.p160u.C3850f m16511a(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r2 << 2
            r5 = 4
            int r4 = r4 - r5
            int r4 = r4 + r3
            r7 = 3
            if (r3 >= r5) goto L_0x001c
            int r8 = r2 + -1
            r9 = r1[r8]
            int r10 = 4 - r3
            int r10 = r10 << r7
            int r10 = r9 << r10
            r1[r8] = r10
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            com.fasterxml.jackson.core.w.j r8 = r0.f11929z0
            char[] r8 = r8.mo17124e()
            r10 = r8
            r8 = 0
            r11 = 0
        L_0x0026:
            if (r8 >= r4) goto L_0x00f7
            int r12 = r8 >> 2
            r12 = r1[r12]
            r13 = r8 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r12 = r12 >> r13
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r8 = r8 + 1
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L_0x00e4
            r13 = r12 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r5 = 1
            if (r13 != r14) goto L_0x0046
            r12 = r12 & 31
            r13 = r12
            r12 = 1
            goto L_0x0061
        L_0x0046:
            r13 = r12 & 240(0xf0, float:3.36E-43)
            r14 = 224(0xe0, float:3.14E-43)
            if (r13 != r14) goto L_0x0051
            r12 = r12 & 15
            r13 = r12
            r12 = 2
            goto L_0x0061
        L_0x0051:
            r13 = r12 & 248(0xf8, float:3.48E-43)
            r14 = 240(0xf0, float:3.36E-43)
            if (r13 != r14) goto L_0x005c
            r12 = r12 & 7
            r13 = r12
            r12 = 3
            goto L_0x0061
        L_0x005c:
            r0.mo16998o(r12)
            r12 = 1
            r13 = 1
        L_0x0061:
            int r14 = r8 + r12
            if (r14 <= r4) goto L_0x006a
            java.lang.String r14 = " in field name"
            r0.mo16846f(r14)
        L_0x006a:
            int r14 = r8 >> 2
            r14 = r1[r14]
            r16 = r8 & 3
            int r16 = 3 - r16
            int r16 = r16 << 3
            int r14 = r14 >> r16
            int r8 = r8 + 1
            r6 = r14 & 192(0xc0, float:2.69E-43)
            r15 = 128(0x80, float:1.794E-43)
            if (r6 == r15) goto L_0x0081
            r0.mo16999p(r14)
        L_0x0081:
            int r6 = r13 << 6
            r13 = r14 & 63
            r6 = r6 | r13
            if (r12 <= r5) goto L_0x00be
            int r5 = r8 >> 2
            r5 = r1[r5]
            r13 = r8 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r5 = r5 >> r13
            int r8 = r8 + 1
            r13 = r5 & 192(0xc0, float:2.69E-43)
            if (r13 == r15) goto L_0x009b
            r0.mo16999p(r5)
        L_0x009b:
            int r6 = r6 << 6
            r5 = r5 & 63
            r5 = r5 | r6
            r6 = 2
            if (r12 <= r6) goto L_0x00c0
            int r6 = r8 >> 2
            r6 = r1[r6]
            r13 = r8 & 3
            int r13 = 3 - r13
            int r13 = r13 << r7
            int r6 = r6 >> r13
            int r8 = r8 + 1
            r13 = r6 & 192(0xc0, float:2.69E-43)
            if (r13 == r15) goto L_0x00b8
            r13 = r6 & 255(0xff, float:3.57E-43)
            r0.mo16999p(r13)
        L_0x00b8:
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
            goto L_0x00bf
        L_0x00be:
            r5 = r6
        L_0x00bf:
            r6 = 2
        L_0x00c0:
            if (r12 <= r6) goto L_0x00e3
            r6 = 65536(0x10000, float:9.18355E-41)
            int r5 = r5 - r6
            int r6 = r10.length
            if (r11 < r6) goto L_0x00cf
            com.fasterxml.jackson.core.w.j r6 = r0.f11929z0
            char[] r6 = r6.mo17126g()
            r10 = r6
        L_0x00cf:
            int r6 = r11 + 1
            r12 = 55296(0xd800, float:7.7486E-41)
            int r13 = r5 >> 10
            int r13 = r13 + r12
            char r12 = (char) r13
            r10[r11] = r12
            r11 = 56320(0xdc00, float:7.8921E-41)
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            r12 = r5 | r11
            r11 = r6
            goto L_0x00e4
        L_0x00e3:
            r12 = r5
        L_0x00e4:
            int r5 = r10.length
            if (r11 < r5) goto L_0x00ee
            com.fasterxml.jackson.core.w.j r5 = r0.f11929z0
            char[] r5 = r5.mo17126g()
            r10 = r5
        L_0x00ee:
            int r5 = r11 + 1
            char r6 = (char) r12
            r10[r11] = r6
            r11 = r5
            r5 = 4
            goto L_0x0026
        L_0x00f7:
            java.lang.String r4 = new java.lang.String
            r5 = 0
            r4.<init>(r10, r5, r11)
            r5 = 4
            if (r3 >= r5) goto L_0x0104
            int r3 = r2 + -1
            r1[r3] = r9
        L_0x0104:
            com.fasterxml.jackson.core.u.a r3 = r0.f12136z1
            com.fasterxml.jackson.core.u.f r1 = r3.mo17017a(r4, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.m16511a(int[], int, int):com.fasterxml.jackson.core.u.f");
    }

    /* renamed from: a */
    private void m16513a(char[] cArr, int i) throws IOException, JsonParseException {
        int[] iArr = f12127H1;
        byte[] bArr = this.f12133E1;
        while (true) {
            int i2 = this.f11919p0;
            if (i2 >= this.f11920q0) {
                mo16814H0();
                i2 = this.f11919p0;
            }
            if (i >= cArr.length) {
                cArr = this.f11929z0.mo17127h();
                i = 0;
            }
            int min = Math.min(this.f11920q0, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.f11919p0 = i2;
                    break;
                }
                int i3 = i2 + 1;
                int i4 = bArr[i2] & 255;
                if (iArr[i4] != 0) {
                    this.f11919p0 = i3;
                    if (i4 == 34) {
                        this.f11929z0.mo17114a(i);
                        return;
                    }
                    int i5 = iArr[i4];
                    if (i5 == 1) {
                        i4 = mo16831u0();
                    } else if (i5 == 2) {
                        i4 = m16518s(i4);
                    } else if (i5 == 3) {
                        i4 = this.f11920q0 - this.f11919p0 >= 2 ? m16520u(i4) : m16519t(i4);
                    } else if (i5 == 4) {
                        int v = m16521v(i4);
                        int i6 = i + 1;
                        cArr[i] = (char) (55296 | (v >> 10));
                        if (i6 >= cArr.length) {
                            cArr = this.f11929z0.mo17127h();
                            i6 = 0;
                        }
                        i4 = (v & 1023) | 56320;
                        i = i6;
                    } else if (i4 < 32) {
                        mo16842b(i4, "string value");
                    } else {
                        mo16997n(i4);
                    }
                    if (i >= cArr.length) {
                        cArr = this.f11929z0.mo17127h();
                        i = 0;
                    }
                    int i7 = i + 1;
                    cArr[i] = (char) i4;
                    i = i7;
                } else {
                    int i8 = i + 1;
                    cArr[i] = (char) i4;
                    i2 = i3;
                    i = i8;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=byte, for r9v0, types: [int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.C3799j mo16985a(byte r9, boolean r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException {
        /*
            r8 = this;
            r0 = 73
            if (r9 != r0) goto L_0x008f
            int r9 = r8.f11919p0
            int r0 = r8.f11920q0
            if (r9 < r0) goto L_0x0013
            boolean r9 = r8.mo16813G0()
            if (r9 != 0) goto L_0x0013
            r8.mo16849r0()
        L_0x0013:
            byte[] r9 = r8.f12133E1
            int r0 = r8.f11919p0
            int r1 = r0 + 1
            r8.f11919p0 = r1
            byte r9 = r9[r0]
            r0 = 78
            r1 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            r3 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.String r5 = "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            java.lang.String r6 = "Non-standard token '"
            r7 = 3
            if (r9 != r0) goto L_0x005b
            if (r10 == 0) goto L_0x002f
            java.lang.String r0 = "-INF"
            goto L_0x0031
        L_0x002f:
            java.lang.String r0 = "+INF"
        L_0x0031:
            r8.mo16990a(r0, r7)
            com.fasterxml.jackson.core.h$b r7 = com.fasterxml.jackson.core.C3794h.C3796b.ALLOW_NON_NUMERIC_NUMBERS
            boolean r7 = r8.mo16710c(r7)
            if (r7 == 0) goto L_0x0045
            if (r10 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r3
        L_0x0040:
            com.fasterxml.jackson.core.j r9 = r8.mo16819a(r0, r1)
            return r9
        L_0x0045:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r8.mo16844e(r10)
            goto L_0x008f
        L_0x005b:
            r0 = 110(0x6e, float:1.54E-43)
            if (r9 != r0) goto L_0x008f
            if (r10 == 0) goto L_0x0064
            java.lang.String r0 = "-Infinity"
            goto L_0x0066
        L_0x0064:
            java.lang.String r0 = "+Infinity"
        L_0x0066:
            r8.mo16990a(r0, r7)
            com.fasterxml.jackson.core.h$b r7 = com.fasterxml.jackson.core.C3794h.C3796b.ALLOW_NON_NUMERIC_NUMBERS
            boolean r7 = r8.mo16710c(r7)
            if (r7 == 0) goto L_0x007a
            if (r10 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r1 = r3
        L_0x0075:
            com.fasterxml.jackson.core.j r9 = r8.mo16819a(r0, r1)
            return r9
        L_0x007a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r0)
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            r8.mo16844e(r10)
        L_0x008f:
            java.lang.String r10 = "expected digit (0-9) to follow minus sign, for valid numeric value"
            r8.mo16826c(r9, r10)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p159t.C3839h.mo16985a(int, boolean):com.fasterxml.jackson.core.j");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16990a(String str, int i) throws IOException, JsonParseException {
        String str2;
        int length = str.length();
        do {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                mo16846f(" in a value");
            }
            str2 = "'null', 'true', 'false' or NaN";
            if (this.f12133E1[this.f11919p0] != str.charAt(i)) {
                mo16991a(str.substring(0, i), str2);
            }
            this.f11919p0++;
            i++;
        } while (i < length);
        if (this.f11919p0 < this.f11920q0 || mo16813G0()) {
            byte b = this.f12133E1[this.f11919p0] & 255;
            if (b >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) mo16963i(b))) {
                this.f11919p0++;
                mo16991a(str.substring(0, i), str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16991a(String str, String str2) throws IOException, JsonParseException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.f11919p0 >= this.f11920q0 && !mo16813G0()) {
                break;
            }
            byte[] bArr = this.f12133E1;
            int i = this.f11919p0;
            this.f11919p0 = i + 1;
            char i2 = (char) mo16963i(bArr[i]);
            if (!Character.isJavaIdentifierPart(i2)) {
                break;
            }
            sb.append(i2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unrecognized token '");
        sb2.append(sb.toString());
        sb2.append("': was expecting ");
        sb2.append(str2);
        mo16844e(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16989a(int i, int i2) throws JsonParseException {
        this.f11919p0 = i2;
        mo16999p(i);
    }

    /* renamed from: a */
    public static int[] m16515a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        int[] iArr2 = new int[(i + length)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }
}
