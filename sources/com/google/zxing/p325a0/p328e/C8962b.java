package com.google.zxing.p325a0.p328e;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.a0.e.b */
/* compiled from: ByteMatrix */
public final class C8962b {

    /* renamed from: a */
    private final byte[][] f23428a;

    /* renamed from: b */
    private final int f23429b;

    /* renamed from: c */
    private final int f23430c;

    public C8962b(int i, int i2) {
        this.f23428a = (byte[][]) Array.newInstance(byte.class, new int[]{i2, i});
        this.f23429b = i;
        this.f23430c = i2;
    }

    /* renamed from: a */
    public byte mo32738a(int i, int i2) {
        return this.f23428a[i2][i];
    }

    /* renamed from: b */
    public int mo32744b() {
        return this.f23430c;
    }

    /* renamed from: c */
    public int mo32745c() {
        return this.f23429b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f23429b * 2 * this.f23430c) + 2);
        for (int i = 0; i < this.f23430c; i++) {
            for (int i2 = 0; i2 < this.f23429b; i2++) {
                byte b = this.f23428a[i][i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append(10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public byte[][] mo32743a() {
        return this.f23428a;
    }

    /* renamed from: a */
    public void mo32740a(int i, int i2, byte b) {
        this.f23428a[i2][i] = b;
    }

    /* renamed from: a */
    public void mo32741a(int i, int i2, int i3) {
        this.f23428a[i2][i] = (byte) i3;
    }

    /* renamed from: a */
    public void mo32742a(int i, int i2, boolean z) {
        this.f23428a[i2][i] = z ? (byte) 1 : 0;
    }

    /* renamed from: a */
    public void mo32739a(byte b) {
        for (int i = 0; i < this.f23430c; i++) {
            for (int i2 = 0; i2 < this.f23429b; i2++) {
                this.f23428a[i][i2] = b;
            }
        }
    }
}
