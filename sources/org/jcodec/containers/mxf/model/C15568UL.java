package org.jcodec.containers.mxf.model;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;

/* renamed from: org.jcodec.containers.mxf.model.UL */
public class C15568UL {
    private byte[] bytes;

    public C15568UL(byte... bArr) {
        this.bytes = bArr;
    }

    private char hex(int i) {
        return (char) (i < 10 ? i + 48 : (i - 10) + 65);
    }

    public static C15568UL read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        return new C15568UL(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C15568UL)) {
            return false;
        }
        byte[] bArr = ((C15568UL) obj).bytes;
        for (int i = 4; i < Math.min(this.bytes.length, bArr.length); i++) {
            if (this.bytes[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int get(int i) {
        return this.bytes[i];
    }

    public int hashCode() {
        byte[] bArr = this.bytes;
        return (bArr[7] & 255) | ((bArr[4] & 255) << C5785c.f16669B) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("06:0E:2B:34:");
        int i = 4;
        while (true) {
            byte[] bArr = this.bytes;
            if (i >= bArr.length) {
                return sb.toString();
            }
            sb.append(hex((bArr[i] >> 4) & 15));
            sb.append(hex(this.bytes[i] & C5785c.f16698q));
            if (i < this.bytes.length - 1) {
                sb.append(":");
            }
            i++;
        }
    }

    public C15568UL(int... iArr) {
        this.bytes = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            this.bytes[i] = (byte) iArr[i];
        }
    }

    public boolean equals(C15568UL ul, int i) {
        if (ul == null) {
            return false;
        }
        byte[] bArr = ul.bytes;
        int i2 = 4;
        int i3 = i >> 4;
        while (i2 < Math.min(this.bytes.length, bArr.length)) {
            if ((i3 & 1) == 1 && this.bytes[i2] != bArr[i2]) {
                return false;
            }
            i2++;
            i3 >>= 1;
        }
        return true;
    }
}
