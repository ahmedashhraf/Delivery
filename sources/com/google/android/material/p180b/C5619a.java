package com.google.android.material.p180b;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.b.a */
/* compiled from: CanvasCompat */
public class C5619a {
    private C5619a() {
    }

    /* renamed from: a */
    public static int m24468a(@C0193h0 Canvas canvas, @C0195i0 RectF rectF, int i) {
        if (VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(rectF, i);
        }
        return canvas.saveLayerAlpha(rectF, i, 31);
    }

    /* renamed from: a */
    public static int m24467a(@C0193h0 Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
