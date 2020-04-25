package com.bogdwellers.pinchtozoom.p153g;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import com.bogdwellers.pinchtozoom.C2941b;

/* renamed from: com.bogdwellers.pinchtozoom.g.b */
/* compiled from: FlingAnimatorHandler */
public class C2949b extends C2948a {

    /* renamed from: c */
    public static final String f10449c = "translateX";

    /* renamed from: d */
    public static final String f10450d = "translateY";

    public C2949b(C2941b bVar) {
        super(bVar);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2941b a = mo11729a();
        ImageView d = a.mo11680d();
        Matrix imageMatrix = d.getImageMatrix();
        float[] b = mo11730b();
        imageMatrix.getValues(b);
        imageMatrix.postTranslate(a.mo11714a(2, ((Float) valueAnimator.getAnimatedValue(f10449c)).floatValue()) - b[2], a.mo11714a(5, ((Float) valueAnimator.getAnimatedValue(f10450d)).floatValue()) - b[5]);
        d.invalidate();
    }
}
