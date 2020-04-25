package com.fasterxml.jackson.core.p158s;

import com.google.common.base.C5785c;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.s.m */
/* compiled from: UTF32Reader */
public class C3828m extends C3816a {

    /* renamed from: U */
    protected final boolean f12042U;

    /* renamed from: V */
    protected char f12043V = 0;

    /* renamed from: W */
    protected int f12044W = 0;

    /* renamed from: X */
    protected int f12045X = 0;

    /* renamed from: Y */
    protected final boolean f12046Y;

    public C3828m(C3819d dVar, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(dVar, inputStream, bArr, i, i2);
        boolean z2 = false;
        this.f12042U = z;
        if (inputStream != null) {
            z2 = true;
        }
        this.f12046Y = z2;
    }

    /* renamed from: a */
    private void m16338a(int i, int i2) throws IOException {
        int i3 = this.f12045X + i;
        int i4 = this.f12044W;
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
        sb.append(i);
        sb.append(", needed ");
        sb.append(i2);
        sb.append(", at char #");
        sb.append(i4);
        sb.append(", byte #");
        sb.append(i3);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    public /* bridge */ /* synthetic */ int read() throws IOException {
        return super.read();
    }

    public int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte b;
        int i5;
        if (this.f11973N == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || i + i2 > cArr.length) {
            mo16869a(cArr, i, i2);
        }
        int i6 = i2 + i;
        char c = this.f12043V;
        if (c != 0) {
            i3 = i + 1;
            cArr[i] = c;
            this.f12043V = 0;
        } else {
            int i7 = this.f11975P - this.f11974O;
            if (i7 < 4 && !m16340a(i7)) {
                return -1;
            }
            i3 = i;
        }
        while (true) {
            if (i3 >= i6) {
                i4 = i3;
                break;
            }
            int i8 = this.f11974O;
            if (this.f12042U) {
                byte[] bArr = this.f11973N;
                b = (bArr[i8] << C5785c.f16669B) | ((bArr[i8 + 1] & 255) << 16) | ((bArr[i8 + 2] & 255) << 8);
                i5 = bArr[i8 + 3] & 255;
            } else {
                byte[] bArr2 = this.f11973N;
                b = (bArr2[i8] & 255) | ((bArr2[i8 + 1] & 255) << 8) | ((bArr2[i8 + 2] & 255) << 16);
                i5 = bArr2[i8 + 3] << C5785c.f16669B;
            }
            byte b2 = i5 | b;
            this.f11974O += 4;
            if (b2 > 65535) {
                if (b2 > 1114111) {
                    int i9 = i3 - i;
                    StringBuilder sb = new StringBuilder();
                    sb.append("(above ");
                    sb.append(Integer.toHexString(1114111));
                    sb.append(") ");
                    m16339a(b2, i9, sb.toString());
                }
                int i10 = b2 - 65536;
                i4 = i3 + 1;
                cArr[i3] = (char) ((i10 >> 10) + 55296);
                b2 = (i10 & 1023) | 56320;
                if (i4 >= i6) {
                    this.f12043V = (char) b2;
                    break;
                }
                i3 = i4;
            }
            i4 = i3 + 1;
            cArr[i3] = (char) b2;
            if (this.f11974O >= this.f11975P) {
                break;
            }
            i3 = i4;
        }
        int i11 = i4 - i;
        this.f12044W += i11;
        return i11;
    }

    /* renamed from: a */
    private void m16339a(int i, int i2, String str) throws IOException {
        int i3 = (this.f12045X + this.f11974O) - 1;
        int i4 = this.f12044W + i2;
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid UTF-32 character 0x");
        sb.append(Integer.toHexString(i));
        sb.append(str);
        sb.append(" at char #");
        sb.append(i4);
        sb.append(", byte #");
        sb.append(i3);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    /* renamed from: a */
    private boolean m16340a(int i) throws IOException {
        int i2;
        this.f12045X += this.f11975P - i;
        if (i > 0) {
            if (this.f11974O > 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    byte[] bArr = this.f11973N;
                    bArr[i3] = bArr[this.f11974O + i3];
                }
                this.f11974O = 0;
            }
            this.f11975P = i;
        } else {
            this.f11974O = 0;
            InputStream inputStream = this.f11978b;
            int read = inputStream == null ? -1 : inputStream.read(this.f11973N);
            if (read < 1) {
                this.f11975P = 0;
                if (read < 0) {
                    if (this.f12046Y) {
                        mo16868a();
                    }
                    return false;
                }
                mo16871d();
            }
            this.f11975P = read;
        }
        while (true) {
            int i4 = this.f11975P;
            if (i4 >= 4) {
                return true;
            }
            InputStream inputStream2 = this.f11978b;
            if (inputStream2 == null) {
                i2 = -1;
            } else {
                byte[] bArr2 = this.f11973N;
                i2 = inputStream2.read(bArr2, i4, bArr2.length - i4);
            }
            if (i2 < 1) {
                if (i2 < 0) {
                    if (this.f12046Y) {
                        mo16868a();
                    }
                    m16338a(this.f11975P, 4);
                }
                mo16871d();
            }
            this.f11975P += i2;
        }
    }
}
