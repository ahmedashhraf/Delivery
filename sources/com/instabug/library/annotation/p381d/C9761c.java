package com.instabug.library.annotation.p381d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.d.c */
/* compiled from: DrawingUtility */
public class C9761c {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25899a;

    /* renamed from: a */
    public static void m45523a(Canvas canvas, PointF pointF, PointF pointF2, Paint paint) {
        boolean[] a = m45524a();
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, paint);
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45524a() {
        boolean[] zArr = f25899a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8604481990804161646L, "com/instabug/library/annotation/utility/DrawingUtility", 34);
        f25899a = a;
        return a;
    }

    /* renamed from: b */
    public static double m45525b(double[] dArr, double[] dArr2, double[] dArr3) {
        boolean[] a = m45524a();
        double a2 = m45516a(dArr, dArr2, dArr3);
        a[19] = true;
        double a3 = a2 / m45515a(dArr, dArr2);
        a[20] = true;
        double abs = Math.abs(a3);
        a[21] = true;
        return abs;
    }

    /* renamed from: a */
    public static float m45517a(float f, float f2, float f3, float f4) {
        boolean[] a = m45524a();
        double d = (double) (f - f3);
        double d2 = (double) (f2 - f4);
        a[2] = true;
        double atan2 = Math.atan2(d2, d);
        a[3] = true;
        float degrees = (float) Math.toDegrees(atan2);
        a[4] = true;
        return degrees;
    }

    /* renamed from: a */
    public static void m45522a(float f, float f2, PointF pointF, PointF pointF2) {
        boolean[] a = m45524a();
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        double d3 = (d2 * 3.141592653589793d) / 180.0d;
        double cos = Math.cos(d3);
        Double.isNaN(d);
        pointF2.x = ((float) (cos * d)) + pointF.x;
        a[5] = true;
        double sin = Math.sin(d3);
        Double.isNaN(d);
        pointF2.y = ((float) (d * sin)) + pointF.y;
        a[6] = true;
    }

    /* renamed from: a */
    public static PointF m45519a(float f, float f2, PointF pointF) {
        boolean[] a = m45524a();
        PointF pointF2 = new PointF();
        a[7] = true;
        m45522a(f, f2, pointF, pointF2);
        a[8] = true;
        return pointF2;
    }

    /* renamed from: a */
    public static PointF m45518a(float f, float f2, float f3, PointF pointF) {
        boolean[] a = m45524a();
        double d = (double) f3;
        Double.isNaN(d);
        double d2 = (d * 3.141592653589793d) / 180.0d;
        double sin = Math.sin(d2);
        a[9] = true;
        double cos = Math.cos(d2);
        pointF.x -= f;
        pointF.y -= f2;
        float f4 = pointF.x;
        double d3 = (double) f4;
        Double.isNaN(d3);
        double d4 = d3 * cos;
        float f5 = pointF.y;
        double d5 = (double) f5;
        Double.isNaN(d5);
        double d6 = d4 - (d5 * sin);
        double d7 = (double) f4;
        Double.isNaN(d7);
        double d8 = d7 * sin;
        double d9 = (double) f5;
        Double.isNaN(d9);
        double d10 = d8 + (d9 * cos);
        pointF.x = ((float) d6) + f;
        pointF.y = ((float) d10) + f2;
        a[10] = true;
        return pointF;
    }

    /* renamed from: a */
    public static double m45516a(double[] dArr, double[] dArr2, double[] dArr3) {
        double[] dArr4 = {dArr2[0] - dArr[0], dArr2[1] - dArr[1]};
        double[] dArr5 = {dArr3[0] - dArr[0], dArr3[1] - dArr[1]};
        double d = (dArr4[0] * dArr5[1]) - (dArr4[1] * dArr5[0]);
        m45524a()[12] = true;
        return d;
    }

    /* renamed from: a */
    public static double m45515a(double[] dArr, double[] dArr2) {
        boolean[] a = m45524a();
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        a[17] = true;
        double sqrt = Math.sqrt((d * d) + (d2 * d2));
        a[18] = true;
        return sqrt;
    }

    /* renamed from: a */
    public static double m45514a(PointF pointF, PointF pointF2, PointF pointF3) {
        boolean[] a = m45524a();
        double[] dArr = {(double) pointF.x, (double) pointF.y};
        double[] dArr2 = {(double) pointF2.x, (double) pointF2.y};
        double[] dArr3 = {(double) pointF3.x, (double) pointF3.y};
        a[22] = true;
        double b = m45525b(dArr, dArr2, dArr3);
        a[23] = true;
        return b;
    }

    /* renamed from: a */
    public static PointF m45520a(PointF pointF, PointF pointF2) {
        boolean[] a = m45524a();
        PointF pointF3 = new PointF();
        pointF3.x = (pointF.x + pointF2.x) / 2.0f;
        pointF3.y = (pointF.y + pointF2.y) / 2.0f;
        a[24] = true;
        return pointF3;
    }

    /* renamed from: a */
    public static List<PointF> m45521a(Path path) {
        boolean[] a = m45524a();
        ArrayList arrayList = new ArrayList();
        a[27] = true;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        a[28] = true;
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        a[29] = true;
        int i = 0;
        while (true) {
            float f = (float) i;
            if (f < length) {
                a[30] = true;
                pathMeasure.getPosTan(f, fArr, null);
                a[31] = true;
                arrayList.add(new PointF(fArr[0], fArr[1]));
                i++;
                a[32] = true;
            } else {
                a[33] = true;
                return arrayList;
            }
        }
    }
}
