package com.fasterxml.jackson.core.p158s;

import java.util.Arrays;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: com.fasterxml.jackson.core.s.b */
/* compiled from: CharTypes */
public final class C3817b {

    /* renamed from: a */
    private static final char[] f11979a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    private static final byte[] f11980b;

    /* renamed from: c */
    static final int[] f11981c;

    /* renamed from: d */
    static final int[] f11982d;

    /* renamed from: e */
    static final int[] f11983e;

    /* renamed from: f */
    static final int[] f11984f;

    /* renamed from: g */
    static final int[] f11985g = new int[256];

    /* renamed from: h */
    static final int[] f11986h;

    /* renamed from: i */
    static final int[] f11987i = new int[128];

    static {
        int length = f11979a.length;
        f11980b = new byte[length];
        for (int i = 0; i < length; i++) {
            f11980b[i] = (byte) f11979a[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        f11981c = iArr;
        int[] iArr2 = f11981c;
        int[] iArr3 = new int[iArr2.length];
        System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        for (int i3 = 128; i3 < 256; i3++) {
            int i4 = (i3 & JpegConst.APP0) == 192 ? 2 : (i3 & 240) == 224 ? 3 : (i3 & 248) == 240 ? 4 : -1;
            iArr3[i3] = i4;
        }
        f11982d = iArr3;
        int[] iArr4 = new int[256];
        Arrays.fill(iArr4, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr4[i5] = 0;
            }
        }
        iArr4[64] = 0;
        iArr4[35] = 0;
        iArr4[42] = 0;
        iArr4[45] = 0;
        iArr4[43] = 0;
        f11983e = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = f11983e;
        System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
        Arrays.fill(iArr5, 128, 128, 0);
        f11984f = iArr5;
        System.arraycopy(f11982d, 128, f11985g, 128, 128);
        Arrays.fill(f11985g, 0, 32, -1);
        int[] iArr7 = f11985g;
        iArr7[9] = 0;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[42] = 42;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f11986h = iArr8;
        Arrays.fill(f11987i, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f11987i[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr9 = f11987i;
            int i9 = i8 + 10;
            iArr9[i8 + 97] = i9;
            iArr9[i8 + 65] = i9;
        }
    }

    /* renamed from: a */
    public static int m16258a(int i) {
        if (i > 127) {
            return -1;
        }
        return f11987i[i];
    }

    /* renamed from: b */
    public static char[] m16261b() {
        return (char[]) f11979a.clone();
    }

    /* renamed from: c */
    public static int[] m16262c() {
        return f11986h;
    }

    /* renamed from: d */
    public static int[] m16263d() {
        return f11985g;
    }

    /* renamed from: e */
    public static int[] m16264e() {
        return f11981c;
    }

    /* renamed from: f */
    public static int[] m16265f() {
        return f11983e;
    }

    /* renamed from: g */
    public static int[] m16266g() {
        return f11982d;
    }

    /* renamed from: h */
    public static int[] m16267h() {
        return f11984f;
    }

    /* renamed from: a */
    public static void m16259a(StringBuilder sb, String str) {
        int[] iArr = f11986h;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                int i2 = iArr[charAt];
                if (i2 < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    int i3 = -(i2 + 1);
                    sb.append(f11979a[i3 >> 4]);
                    sb.append(f11979a[i3 & 15]);
                } else {
                    sb.append((char) i2);
                }
            }
        }
    }

    /* renamed from: a */
    public static byte[] m16260a() {
        return (byte[]) f11980b.clone();
    }
}
