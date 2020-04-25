package com.bogdwellers.pinchtozoom.p153g;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.bogdwellers.pinchtozoom.C2941b;

/* renamed from: com.bogdwellers.pinchtozoom.g.c */
/* compiled from: ScaleAnimatorHandler */
public class C2950c extends C2948a {

    /* renamed from: f */
    private static final String f10451f = C2950c.class.getSimpleName();

    /* renamed from: c */
    private float f10452c;

    /* renamed from: d */
    private float f10453d;

    /* renamed from: e */
    private boolean f10454e = false;

    public C2950c(C2941b bVar) {
        super(bVar);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2941b a = mo11729a();
        ImageView d = a.mo11680d();
        if (d.getDrawable() != null) {
            Matrix imageMatrix = d.getImageMatrix();
            float[] b = mo11730b();
            imageMatrix.getValues(b);
            float a2 = a.mo11714a(0, ((Float) valueAnimator.getAnimatedValue()).floatValue()) / b[0];
            if (this.f10454e) {
                imageMatrix.postScale(a2, a2, this.f10452c, this.f10453d);
            } else {
                imageMatrix.postScale(a2, a2);
            }
            a.mo11717c();
            d.invalidate();
        }
    }

    public C2950c(C2941b bVar, float f, float f2) {
        super(bVar);
        this.f10452c = f;
        this.f10453d = f2;
    }
}
