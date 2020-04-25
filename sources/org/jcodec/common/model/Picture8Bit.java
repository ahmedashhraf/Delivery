package org.jcodec.common.model;

public class Picture8Bit {

    /* renamed from: cb */
    private byte[] f44824cb;

    /* renamed from: cr */
    private byte[] f44825cr;
    private int height;
    private int width;

    /* renamed from: y */
    private byte[] f44826y;

    public Picture8Bit(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.width = i;
        this.height = i2;
        this.f44826y = bArr;
        this.f44824cb = bArr2;
        this.f44825cr = bArr3;
    }

    public static Picture8Bit create420(int i, int i2) {
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        int i4 = i3 >> 2;
        Picture8Bit picture8Bit = new Picture8Bit(i, i2, bArr, new byte[i4], new byte[i4]);
        return picture8Bit;
    }

    public static Picture8Bit create422(int i, int i2) {
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        int i4 = i3 >> 1;
        Picture8Bit picture8Bit = new Picture8Bit(i, i2, bArr, new byte[i4], new byte[i4]);
        return picture8Bit;
    }

    public byte[] getCb() {
        return this.f44824cb;
    }

    public byte[] getCr() {
        return this.f44825cr;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public byte[] getY() {
        return this.f44826y;
    }

    public Picture8Bit(Picture8Bit picture8Bit) {
        this(picture8Bit.width, picture8Bit.height, picture8Bit.f44826y, picture8Bit.f44824cb, picture8Bit.f44825cr);
    }
}
