package androidx.core.p018c;

import android.graphics.Color;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import androidx.annotation.C0215r;
import androidx.annotation.C0224v0;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.core.p034l.C0962e0;
import java.util.Objects;

/* renamed from: androidx.core.c.b */
/* compiled from: ColorUtils */
public final class C0821b {

    /* renamed from: a */
    private static final double f3901a = 95.047d;

    /* renamed from: b */
    private static final double f3902b = 100.0d;

    /* renamed from: c */
    private static final double f3903c = 108.883d;

    /* renamed from: d */
    private static final double f3904d = 0.008856d;

    /* renamed from: e */
    private static final double f3905e = 903.3d;

    /* renamed from: f */
    private static final int f3906f = 10;

    /* renamed from: g */
    private static final int f3907g = 1;

    /* renamed from: h */
    private static final ThreadLocal<double[]> f3908h = new ThreadLocal<>();

    private C0821b() {
    }

    /* renamed from: a */
    private static int m4791a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    @RequiresApi(26)
    @C0193h0
    /* renamed from: a */
    public static Color m4794a(@C0193h0 Color color, @C0193h0 Color color2) {
        if (Objects.equals(color.getModel(), color2.getModel())) {
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = color2.alpha() * (1.0f - alpha);
            int componentCount = color2.getComponentCount() - 1;
            components2[componentCount] = alpha + alpha2;
            if (components2[componentCount] > 0.0f) {
                alpha /= components2[componentCount];
                alpha2 /= components2[componentCount];
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components[i] * alpha) + (components2[i] * alpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Color models must match (");
        sb.append(color.getModel());
        sb.append(" vs. ");
        sb.append(color2.getModel());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private static float m4803b(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: b */
    private static int m4805b(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: c */
    public static int m4810c(@C0198k int i, @C0198k int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int b = m4805b(alpha2, alpha);
        return Color.argb(b, m4792a(Color.red(i), alpha2, Color.red(i2), alpha, b), m4792a(Color.green(i), alpha2, Color.green(i2), alpha, b), m4792a(Color.blue(i), alpha2, Color.blue(i2), alpha, b));
    }

    @C0198k
    /* renamed from: d */
    public static int m4811d(@C0198k int i, @C0237z(from = 0, mo691to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & C0962e0.f4342s) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: b */
    public static int m4806b(@C0198k int i, @C0198k int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m4786a(m4811d(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m4786a(m4811d(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static void m4809b(@C0198k int i, @C0193h0 double[] dArr) {
        m4808b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: b */
    public static void m4808b(@C0237z(from = 0, mo691to = 255) int i, @C0237z(from = 0, mo691to = 255) int i2, @C0237z(from = 0, mo691to = 255) int i3, @C0193h0 double[] dArr) {
        double d;
        double d2;
        double d3;
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d4 = (double) i;
            Double.isNaN(d4);
            double d5 = d4 / 255.0d;
            if (d5 < 0.04045d) {
                d = d5 / 12.92d;
            } else {
                d = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            }
            double d6 = d;
            double d7 = (double) i2;
            Double.isNaN(d7);
            double d8 = d7 / 255.0d;
            if (d8 < 0.04045d) {
                d2 = d8 / 12.92d;
            } else {
                d2 = Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
            }
            double d9 = d2;
            double d10 = (double) i3;
            Double.isNaN(d10);
            double d11 = d10 / 255.0d;
            if (d11 < 0.04045d) {
                d3 = d11 / 12.92d;
            } else {
                d3 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            dArr2[0] = ((0.4124d * d6) + (0.3576d * d9) + (0.1805d * d3)) * f3902b;
            dArr2[1] = ((0.2126d * d6) + (0.7152d * d9) + (0.0722d * d3)) * f3902b;
            dArr2[2] = ((d6 * 0.0193d) + (d9 * 0.1192d) + (d3 * 0.9505d)) * f3902b;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    /* renamed from: a */
    private static int m4792a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    @C0215r(from = 0.0d, mo670to = 1.0d)
    /* renamed from: a */
    public static double m4785a(@C0198k int i) {
        double[] a = m4802a();
        m4809b(i, a);
        return a[1] / f3902b;
    }

    /* renamed from: a */
    public static double m4786a(@C0198k int i, @C0198k int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m4810c(i, i2);
            }
            double a = m4785a(i) + 0.05d;
            double a2 = m4785a(i2) + 0.05d;
            return Math.max(a, a2) / Math.min(a, a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("background can not be translucent: #");
        sb.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static void m4807b(@C0215r(from = 0.0d, mo670to = 95.047d) double d, @C0215r(from = 0.0d, mo670to = 100.0d) double d2, @C0215r(from = 0.0d, mo670to = 108.883d) double d3, @C0193h0 double[] dArr) {
        if (dArr.length == 3) {
            double a = m4784a(d / f3901a);
            double a2 = m4784a(d2 / f3902b);
            double a3 = m4784a(d3 / f3903c);
            dArr[0] = Math.max(0.0d, (116.0d * a2) - 16.0d);
            dArr[1] = (a - a2) * 500.0d;
            dArr[2] = (a2 - a3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    /* renamed from: a */
    public static void m4797a(@C0237z(from = 0, mo691to = 255) int i, @C0237z(from = 0, mo691to = 255) int i2, @C0237z(from = 0, mo691to = 255) int i3, @C0193h0 float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f2 = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : ((f3 - f4) / f6) + 4.0f;
            f = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f2 * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = m4803b(f8, 0.0f, 360.0f);
        fArr[1] = m4803b(f, 0.0f, 1.0f);
        fArr[2] = m4803b(f7, 0.0f, 1.0f);
    }

    @C0198k
    /* renamed from: b */
    public static int m4804b(@C0215r(from = 0.0d, mo670to = 95.047d) double d, @C0215r(from = 0.0d, mo670to = 100.0d) double d2, @C0215r(from = 0.0d, mo670to = 108.883d) double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / f3902b;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / f3902b;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / f3902b;
        return Color.rgb(m4791a((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m4791a((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), m4791a((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: a */
    public static void m4799a(@C0198k int i, @C0193h0 float[] fArr) {
        m4797a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    @C0198k
    /* renamed from: a */
    public static int m4793a(@C0193h0 float[] fArr) {
        int i;
        int i2;
        int i3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 1:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round(f4 * 255.0f);
                break;
            case 2:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs + f4) * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                i3 = Math.round(f4 * 255.0f);
                i2 = Math.round((abs2 + f4) * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                i3 = Math.round((abs2 + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                i3 = Math.round((abs + f4) * 255.0f);
                i2 = Math.round(f4 * 255.0f);
                i = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                i = 0;
                i3 = 0;
                i2 = 0;
                break;
        }
        return Color.rgb(m4791a(i3, 0, 255), m4791a(i2, 0, 255), m4791a(i, 0, 255));
    }

    /* renamed from: a */
    public static void m4798a(@C0198k int i, @C0193h0 double[] dArr) {
        m4796a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: a */
    public static void m4796a(@C0237z(from = 0, mo691to = 255) int i, @C0237z(from = 0, mo691to = 255) int i2, @C0237z(from = 0, mo691to = 255) int i3, @C0193h0 double[] dArr) {
        m4808b(i, i2, i3, dArr);
        m4807b(dArr[0], dArr[1], dArr[2], dArr);
    }

    /* renamed from: a */
    public static void m4795a(@C0215r(from = 0.0d, mo670to = 100.0d) double d, @C0215r(from = -128.0d, mo670to = 127.0d) double d2, @C0215r(from = -128.0d, mo670to = 127.0d) double d3, @C0193h0 double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= f3904d) {
            pow = ((d5 * 116.0d) - 16.0d) / f3905e;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / f3905e;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= f3904d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / f3905e;
        }
        dArr[0] = pow * f3901a;
        dArr[1] = pow2 * f3902b;
        dArr[2] = pow3 * f3903c;
    }

    @C0198k
    /* renamed from: a */
    public static int m4789a(@C0215r(from = 0.0d, mo670to = 100.0d) double d, @C0215r(from = -128.0d, mo670to = 127.0d) double d2, @C0215r(from = -128.0d, mo670to = 127.0d) double d3) {
        double[] a = m4802a();
        m4795a(d, d2, d3, a);
        return m4804b(a[0], a[1], a[2]);
    }

    /* renamed from: a */
    public static double m4787a(@C0193h0 double[] dArr, @C0193h0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    /* renamed from: a */
    private static double m4784a(double d) {
        return d > f3904d ? Math.pow(d, 0.3333333333333333d) : ((d * f3905e) + 16.0d) / 116.0d;
    }

    @C0198k
    /* renamed from: a */
    public static int m4790a(@C0198k int i, @C0198k int i2, @C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    public static void m4801a(@C0193h0 float[] fArr, @C0193h0 float[] fArr2, @C0215r(from = 0.0d, mo670to = 1.0d) float f, @C0193h0 float[] fArr3) {
        if (fArr3.length == 3) {
            float f2 = 1.0f - f;
            fArr3[0] = m4788a(fArr[0], fArr2[0], f);
            fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
            fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    /* renamed from: a */
    public static void m4800a(@C0193h0 double[] dArr, @C0193h0 double[] dArr2, @C0215r(from = 0.0d, mo670to = 1.0d) double d, @C0193h0 double[] dArr3) {
        if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
            dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
            dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    @C0224v0
    /* renamed from: a */
    static float m4788a(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (f + ((f2 - f) * f3)) % 360.0f;
    }

    /* renamed from: a */
    private static double[] m4802a() {
        double[] dArr = (double[]) f3908h.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        f3908h.set(dArr2);
        return dArr2;
    }
}
