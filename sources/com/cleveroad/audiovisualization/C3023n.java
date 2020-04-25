package com.cleveroad.audiovisualization;

import android.graphics.Color;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import java.util.Random;

/* renamed from: com.cleveroad.audiovisualization.n */
/* compiled from: Utils */
class C3023n {
    private C3023n() {
    }

    /* renamed from: a */
    public static float m14428a(float f, float f2, float f3) {
        return Math.max(Math.min(f, f3), f2);
    }

    /* renamed from: a */
    public static float m14430a(float f, float f2, float f3, float f4, float f5) {
        return f4 + (((f - f2) / (f3 - f2)) * (f5 - f4));
    }

    /* renamed from: b */
    public static float m14438b(float f, float f2, float f3) {
        if (f < f2) {
            return 0.0f;
        }
        if (f > f3) {
            return 1.0f;
        }
        return f / (f3 - f2);
    }

    /* renamed from: c */
    public static float m14439c(float f, float f2, float f3) {
        return m14430a(f, -1.0f, 1.0f, f2, f3);
    }

    /* renamed from: d */
    public static float m14440d(float f, float f2, float f3) {
        return (f2 * f3) + ((1.0f - f3) * f);
    }

    /* renamed from: a */
    public static int m14432a(int i, int i2, int i3) {
        return Math.max(Math.min(i, i3), i2);
    }

    /* renamed from: a */
    public static float[] m14437a(@C0198k int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f, ((float) Color.alpha(i)) / 255.0f};
    }

    /* renamed from: a */
    public static float m14427a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return (float) (Math.log10((double) f) * 20.0d);
    }

    /* renamed from: a */
    public static float m14429a(float f, float f2, float f3, float f4) {
        double d = (double) f2;
        float f5 = 1.0f - f;
        double pow = Math.pow((double) f5, 2.0d);
        Double.isNaN(d);
        double d2 = d * pow;
        double d3 = (double) (f3 * 2.0f * f * f5);
        Double.isNaN(d3);
        double d4 = d2 + d3;
        double d5 = (double) (f4 * f * f);
        Double.isNaN(d5);
        return (float) (d4 + d5);
    }

    /* renamed from: a */
    public static float m14431a(float f, Random random) {
        return m14428a((float) ((random.nextInt(100) + 70) / 100), 0.7f, 1.3f) * f;
    }

    /* renamed from: a */
    public static <T> boolean m14435a(T[] tArr) {
        for (T t : tArr) {
            if (t != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> int m14433a(@C0193h0 T[] tArr, @C0195i0 T t) {
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == t) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m14436a(@C0193h0 boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m14434a(byte[] bArr) {
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}
