package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.p020h.C0878h;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.b */
/* compiled from: ArcMotion */
public class C1830b extends C1950w {

    /* renamed from: g */
    private static final float f7105g = 0.0f;

    /* renamed from: h */
    private static final float f7106h = 70.0f;

    /* renamed from: i */
    private static final float f7107i = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    private float f7108a = 0.0f;

    /* renamed from: b */
    private float f7109b = 0.0f;

    /* renamed from: c */
    private float f7110c = f7106h;

    /* renamed from: d */
    private float f7111d = 0.0f;

    /* renamed from: e */
    private float f7112e = 0.0f;

    /* renamed from: f */
    private float f7113f = f7107i;

    public C1830b() {
    }

    /* renamed from: d */
    private static float m9805d(float f) {
        if (f >= 0.0f && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public void mo8240a(float f) {
        this.f7110c = f;
        this.f7113f = m9805d(f);
    }

    /* renamed from: b */
    public void mo8242b(float f) {
        this.f7108a = f;
        this.f7111d = m9805d(f);
    }

    /* renamed from: c */
    public void mo8244c(float f) {
        this.f7109b = f;
        this.f7112e = m9805d(f);
    }

    /* renamed from: a */
    public float mo8238a() {
        return this.f7110c;
    }

    /* renamed from: b */
    public float mo8241b() {
        return this.f7108a;
    }

    /* renamed from: c */
    public float mo8243c() {
        return this.f7109b;
    }

    /* renamed from: a */
    public Path mo8239a(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f10 = f3 - f;
        float f11 = f4 - f2;
        float f12 = (f10 * f10) + (f11 * f11);
        float f13 = (f + f3) / 2.0f;
        float f14 = (f2 + f4) / 2.0f;
        float f15 = 0.25f * f12;
        boolean z = f2 > f4;
        if (Math.abs(f10) < Math.abs(f11)) {
            float abs = Math.abs(f12 / (f11 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f7 = f3;
            } else {
                f6 = abs + f2;
                f7 = f;
            }
            f5 = this.f7112e;
        } else {
            float f16 = f12 / (f10 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f16 + f;
            } else {
                f8 = f3 - f16;
                f9 = f4;
            }
            f5 = this.f7111d;
        }
        float f17 = f15 * f5 * f5;
        float f18 = f13 - f7;
        float f19 = f14 - f6;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = this.f7113f;
        float f22 = f15 * f21 * f21;
        if (f20 < f17) {
            f22 = f17;
        } else if (f20 <= f22) {
            f22 = 0.0f;
        }
        if (f22 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f22 / f20));
            f7 = ((f7 - f13) * sqrt) + f13;
            f6 = f14 + (sqrt * (f6 - f14));
        }
        path.cubicTo((f + f7) / 2.0f, (f2 + f6) / 2.0f, (f7 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public C1830b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7195j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo8244c(C0878h.m5063a(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        mo8242b(C0878h.m5063a(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        mo8240a(C0878h.m5063a(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, (float) f7106h));
        obtainStyledAttributes.recycle();
    }
}
