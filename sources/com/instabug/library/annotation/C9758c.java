package com.instabug.library.annotation;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.annotation.c */
/* compiled from: ControlButton */
public class C9758c {

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f25889d;

    /* renamed from: a */
    private final Paint f25890a;

    /* renamed from: b */
    private PointF f25891b = new PointF();

    /* renamed from: c */
    private int f25892c;

    public C9758c() {
        boolean[] a = m45497a();
        a[0] = true;
        a[1] = true;
        this.f25890a = new Paint(1);
        a[2] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45497a() {
        boolean[] zArr = f25889d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5151220819422389989L, "com/instabug/library/annotation/ControlButton", 16);
        f25889d = a;
        return a;
    }

    /* renamed from: a */
    public void mo34796a(int i) {
        boolean[] a = m45497a();
        this.f25892c = i;
        a[3] = true;
    }

    /* renamed from: b */
    public boolean mo34799b(PointF pointF) {
        boolean z;
        boolean[] a = m45497a();
        PointF pointF2 = this.f25891b;
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        if ((f * f) + (f2 * f2) <= 1764.0f) {
            a[6] = true;
            z = true;
        } else {
            z = false;
            a[7] = true;
        }
        a[8] = true;
        return z;
    }

    /* renamed from: a */
    public void mo34798a(PointF pointF) {
        boolean[] a = m45497a();
        this.f25891b = pointF;
        a[4] = true;
    }

    /* renamed from: a */
    public void mo34795a(float f, float f2) {
        boolean[] a = m45497a();
        this.f25891b = new PointF(f, f2);
        a[5] = true;
    }

    /* renamed from: a */
    public void mo34797a(Canvas canvas) {
        boolean[] a = m45497a();
        this.f25890a.setColor(this.f25892c);
        a[9] = true;
        this.f25890a.setStyle(Style.FILL);
        a[10] = true;
        PointF pointF = this.f25891b;
        canvas.drawCircle(pointF.x, pointF.y, 12.0f, this.f25890a);
        a[11] = true;
        this.f25890a.setColor(-1);
        a[12] = true;
        this.f25890a.setStyle(Style.STROKE);
        a[13] = true;
        this.f25890a.setStrokeWidth(2.0f);
        a[14] = true;
        PointF pointF2 = this.f25891b;
        canvas.drawCircle(pointF2.x, pointF2.y, 12.0f, this.f25890a);
        a[15] = true;
    }
}
