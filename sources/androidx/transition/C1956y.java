package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.p020h.C0878h;
import androidx.core.p018c.C0823d;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.y */
/* compiled from: PatternPathMotion */
public class C1956y extends C1950w {

    /* renamed from: a */
    private Path f7483a;

    /* renamed from: b */
    private final Path f7484b = new Path();

    /* renamed from: c */
    private final Matrix f7485c = new Matrix();

    public C1956y() {
        this.f7484b.lineTo(1.0f, 0.0f);
        this.f7483a = this.f7484b;
    }

    /* renamed from: a */
    public Path mo8511a() {
        return this.f7483a;
    }

    /* renamed from: a */
    public void mo8512a(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f7485c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float a = 1.0f / m10276a(f5, f6);
        this.f7485c.postScale(a, a);
        this.f7485c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f7485c, this.f7484b);
        this.f7483a = path;
    }

    @SuppressLint({"RestrictedApi"})
    public C1956y(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7196k);
        try {
            String a = C0878h.m5072a(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (a != null) {
                mo8512a(C0823d.m4822b(a));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C1956y(Path path) {
        mo8512a(path);
    }

    /* renamed from: a */
    public Path mo8239a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float a = m10276a(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f7485c.setScale(a, a);
        this.f7485c.postRotate((float) Math.toDegrees(atan2));
        this.f7485c.postTranslate(f, f2);
        Path path = new Path();
        this.f7484b.transform(this.f7485c, path);
        return path;
    }

    /* renamed from: a */
    private static float m10276a(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }
}
