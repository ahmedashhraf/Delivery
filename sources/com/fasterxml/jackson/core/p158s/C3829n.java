package com.fasterxml.jackson.core.p158s;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.fasterxml.jackson.core.s.n */
/* compiled from: UTF8Writer */
public final class C3829n extends Writer {

    /* renamed from: R */
    static final int f12047R = 55296;

    /* renamed from: S */
    static final int f12048S = 56319;

    /* renamed from: T */
    static final int f12049T = 56320;

    /* renamed from: U */
    static final int f12050U = 57343;

    /* renamed from: N */
    byte[] f12051N;

    /* renamed from: O */
    final int f12052O;

    /* renamed from: P */
    int f12053P;

    /* renamed from: Q */
    int f12054Q = 0;

    /* renamed from: a */
    protected final C3819d f12055a;

    /* renamed from: b */
    OutputStream f12056b;

    public C3829n(C3819d dVar, OutputStream outputStream) {
        this.f12055a = dVar;
        this.f12056b = outputStream;
        this.f12051N = dVar.mo16887e();
        this.f12052O = this.f12051N.length - 4;
        this.f12053P = 0;
    }

    /* renamed from: a */
    private int m16341a(int i) throws IOException {
        int i2 = this.f12054Q;
        this.f12054Q = 0;
        if (i >= f12049T && i <= f12050U) {
            return ((i2 - f12047R) << 10) + 65536 + (i - f12049T);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Broken surrogate pair: first char 0x");
        sb.append(Integer.toHexString(i2));
        sb.append(", second 0x");
        sb.append(Integer.toHexString(i));
        sb.append("; illegal combination");
        throw new IOException(sb.toString());
    }

    /* renamed from: e */
    private void m16342e(int i) throws IOException {
        String str = "Illegal character point (0x";
        if (i > 1114111) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(Integer.toHexString(i));
            sb.append(") to output; max is 0x10FFFF as per RFC 4627");
            throw new IOException(sb.toString());
        } else if (i >= f12047R) {
            String str2 = ")";
            if (i <= f12048S) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unmatched first part of surrogate pair (0x");
                sb2.append(Integer.toHexString(i));
                sb2.append(str2);
                throw new IOException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unmatched second part of surrogate pair (0x");
            sb3.append(Integer.toHexString(i));
            sb3.append(str2);
            throw new IOException(sb3.toString());
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(Integer.toHexString(i));
            sb4.append(") to output");
            throw new IOException(sb4.toString());
        }
    }

    public void close() throws IOException {
        OutputStream outputStream = this.f12056b;
        if (outputStream != null) {
            int i = this.f12053P;
            if (i > 0) {
                outputStream.write(this.f12051N, 0, i);
                this.f12053P = 0;
            }
            OutputStream outputStream2 = this.f12056b;
            this.f12056b = null;
            byte[] bArr = this.f12051N;
            if (bArr != null) {
                this.f12051N = null;
                this.f12055a.mo16883c(bArr);
            }
            outputStream2.close();
            int i2 = this.f12054Q;
            this.f12054Q = 0;
            if (i2 > 0) {
                m16342e(i2);
            }
        }
    }

    public void flush() throws IOException {
        OutputStream outputStream = this.f12056b;
        if (outputStream != null) {
            int i = this.f12053P;
            if (i > 0) {
                outputStream.write(this.f12051N, 0, i);
                this.f12053P = 0;
            }
            this.f12056b.flush();
        }
    }

    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    public Writer append(char c) throws IOException {
        write((int) c);
        return this;
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write((int) cArr[i]);
            }
            return;
        }
        if (this.f12054Q > 0) {
            int i3 = i + 1;
            i2--;
            write(m16341a(cArr[i]));
            i = i3;
        }
        int i4 = this.f12053P;
        byte[] bArr = this.f12051N;
        int i5 = this.f12052O;
        int i6 = i2 + r9;
        while (r9 < i6) {
            if (i4 >= i5) {
                this.f12056b.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = r9 + 1;
            char c = cArr[r9];
            if (c < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) c;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 + i7;
                while (true) {
                    r9 = i7;
                    i4 = i8;
                    if (r9 >= i11) {
                        continue;
                        break;
                    }
                    i7 = r9 + 1;
                    c = cArr[r9];
                    if (c >= 128) {
                        break;
                    }
                    i8 = i4 + 1;
                    bArr[i4] = (byte) c;
                }
            }
            if (c < 2048) {
                int i12 = i4 + 1;
                bArr[i4] = (byte) ((c >> 6) | 192);
                i4 = i12 + 1;
                bArr[i12] = (byte) ((c & '?') | 128);
                r9 = i7;
            } else if (c < f12047R || c > f12050U) {
                int i13 = i4 + 1;
                bArr[i4] = (byte) ((c >> 12) | JpegConst.APP0);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((c >> 6) & 63) | 128);
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((c & '?') | 128);
                r9 = i7;
                i4 = i15;
            } else {
                if (c > f12048S) {
                    this.f12053P = i4;
                    m16342e(c);
                }
                this.f12054Q = c;
                if (i7 >= i6) {
                    break;
                }
                r9 = i7 + 1;
                int a = m16341a(cArr[i7]);
                if (a > 1114111) {
                    this.f12053P = i4;
                    m16342e(a);
                }
                int i16 = i4 + 1;
                bArr[i4] = (byte) ((a >> 18) | 240);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((a >> 12) & 63) | 128);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (((a >> 6) & 63) | 128);
                i4 = i18 + 1;
                bArr[i18] = (byte) ((a & 63) | 128);
            }
        }
        this.f12053P = i4;
    }

    public void write(int i) throws IOException {
        int i2;
        if (this.f12054Q > 0) {
            i = m16341a(i);
        } else if (i >= f12047R && i <= f12050U) {
            if (i > f12048S) {
                m16342e(i);
            }
            this.f12054Q = i;
            return;
        }
        int i3 = this.f12053P;
        if (i3 >= this.f12052O) {
            this.f12056b.write(this.f12051N, 0, i3);
            this.f12053P = 0;
        }
        if (i < 128) {
            byte[] bArr = this.f12051N;
            int i4 = this.f12053P;
            this.f12053P = i4 + 1;
            bArr[i4] = (byte) i;
        } else {
            int i5 = this.f12053P;
            if (i < 2048) {
                byte[] bArr2 = this.f12051N;
                int i6 = i5 + 1;
                bArr2[i5] = (byte) ((i >> 6) | 192);
                i2 = i6 + 1;
                bArr2[i6] = (byte) ((i & 63) | 128);
            } else if (i <= 65535) {
                byte[] bArr3 = this.f12051N;
                int i7 = i5 + 1;
                bArr3[i5] = (byte) ((i >> 12) | JpegConst.APP0);
                int i8 = i7 + 1;
                bArr3[i7] = (byte) (((i >> 6) & 63) | 128);
                int i9 = i8 + 1;
                bArr3[i8] = (byte) ((i & 63) | 128);
                i2 = i9;
            } else {
                if (i > 1114111) {
                    m16342e(i);
                }
                byte[] bArr4 = this.f12051N;
                int i10 = i5 + 1;
                bArr4[i5] = (byte) ((i >> 18) | 240);
                int i11 = i10 + 1;
                bArr4[i10] = (byte) (((i >> 12) & 63) | 128);
                int i12 = i11 + 1;
                bArr4[i11] = (byte) (((i >> 6) & 63) | 128);
                i2 = i12 + 1;
                bArr4[i12] = (byte) ((i & 63) | 128);
            }
            this.f12053P = i2;
        }
    }

    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    public void write(String str, int i, int i2) throws IOException {
        if (i2 < 2) {
            if (i2 == 1) {
                write((int) str.charAt(i));
            }
            return;
        }
        if (this.f12054Q > 0) {
            int i3 = i + 1;
            i2--;
            write(m16341a(str.charAt(i)));
            i = i3;
        }
        int i4 = this.f12053P;
        byte[] bArr = this.f12051N;
        int i5 = this.f12052O;
        int i6 = i2 + r9;
        while (r9 < i6) {
            if (i4 >= i5) {
                this.f12056b.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = r9 + 1;
            char charAt = str.charAt(r9);
            if (charAt < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) charAt;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                if (i9 > i10) {
                    i9 = i10;
                }
                int i11 = i9 + i7;
                while (true) {
                    r9 = i7;
                    i4 = i8;
                    if (r9 >= i11) {
                        continue;
                        break;
                    }
                    i7 = r9 + 1;
                    charAt = str.charAt(r9);
                    if (charAt >= 128) {
                        break;
                    }
                    i8 = i4 + 1;
                    bArr[i4] = (byte) charAt;
                }
            }
            if (charAt < 2048) {
                int i12 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i12 + 1;
                bArr[i12] = (byte) ((charAt & '?') | 128);
                r9 = i7;
            } else if (charAt < f12047R || charAt > f12050U) {
                int i13 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 12) | JpegConst.APP0);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (((charAt >> 6) & 63) | 128);
                int i15 = i14 + 1;
                bArr[i14] = (byte) ((charAt & '?') | 128);
                r9 = i7;
                i4 = i15;
            } else {
                if (charAt > f12048S) {
                    this.f12053P = i4;
                    m16342e(charAt);
                }
                this.f12054Q = charAt;
                if (i7 >= i6) {
                    break;
                }
                r9 = i7 + 1;
                int a = m16341a(str.charAt(i7));
                if (a > 1114111) {
                    this.f12053P = i4;
                    m16342e(a);
                }
                int i16 = i4 + 1;
                bArr[i4] = (byte) ((a >> 18) | 240);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (((a >> 12) & 63) | 128);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (((a >> 6) & 63) | 128);
                i4 = i18 + 1;
                bArr[i18] = (byte) ((a & 63) | 128);
            }
        }
        this.f12053P = i4;
    }
}
