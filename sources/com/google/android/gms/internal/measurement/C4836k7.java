package com.google.android.gms.internal.measurement;

import com.google.common.base.C5785c;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C4836k7 {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m20508b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m20511d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m20512e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m20513f(byte b) {
        return b < -16;
    }

    /* renamed from: g */
    private static boolean m20514g(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m20507b(byte b, byte b2, char[] cArr, int i) throws zzfn {
        if (b < -62 || m20514g(b2)) {
            throw zzfn.m22035j();
        }
        cArr[i] = (char) (((b & C5785c.f16676I) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m20506b(byte b, byte b2, byte b3, char[] cArr, int i) throws zzfn {
        if (m20514g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m20514g(b3)))) {
            throw zzfn.m22035j();
        }
        cArr[i] = (char) (((b & C5785c.f16698q) << C5785c.f16695n) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m20505b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzfn {
        if (m20514g(b2) || (((b << C5785c.f16673F) + (b2 + 112)) >> 30) != 0 || m20514g(b3) || m20514g(b4)) {
            throw zzfn.m22035j();
        }
        byte b5 = ((b & 7) << C5785c.f16702u) | ((b2 & 63) << C5785c.f16695n) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
