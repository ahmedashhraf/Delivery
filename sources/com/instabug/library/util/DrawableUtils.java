package com.instabug.library.util;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class DrawableUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    /* renamed from: com.instabug.library.util.DrawableUtils$a */
    static class C10019a extends LayerDrawable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26663N;

        /* renamed from: a */
        final /* synthetic */ float f26664a;

        /* renamed from: b */
        final /* synthetic */ Drawable f26665b;

        C10019a(Drawable[] drawableArr, float f, Drawable drawable) {
            boolean[] a = m46621a();
            this.f26664a = f;
            this.f26665b = drawable;
            super(drawableArr);
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46621a() {
            boolean[] zArr = f26663N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4812496877824863006L, "com/instabug/library/util/DrawableUtils$1", 5);
            f26663N = a;
            return a;
        }

        public void draw(Canvas canvas) {
            boolean[] a = m46621a();
            canvas.save();
            a[1] = true;
            canvas.rotate(this.f26664a, ((float) this.f26665b.getBounds().width()) / 2.0f, ((float) this.f26665b.getBounds().height()) / 2.0f);
            a[2] = true;
            super.draw(canvas);
            a[3] = true;
            canvas.restore();
            a[4] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6923161132566598854L, "com/instabug/library/util/DrawableUtils", 12);
        $jacocoData = a;
        return a;
    }

    public DrawableUtils() {
        $jacocoInit()[0] = true;
    }

    public static Drawable getRotateDrawable(Drawable drawable, float f) {
        boolean[] $jacocoInit = $jacocoInit();
        Drawable[] drawableArr = {drawable};
        $jacocoInit[10] = true;
        C10019a aVar = new C10019a(drawableArr, f, drawable);
        $jacocoInit[11] = true;
        return aVar;
    }

    public static void setColor(View view, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        Drawable background = view.getBackground();
        if (background instanceof ShapeDrawable) {
            $jacocoInit[1] = true;
            ((ShapeDrawable) background).getPaint().setColor(i);
            $jacocoInit[2] = true;
        } else if (background instanceof GradientDrawable) {
            $jacocoInit[3] = true;
            ((GradientDrawable) background).setColor(i);
            $jacocoInit[4] = true;
        } else if (!(background instanceof ColorDrawable)) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            ((ColorDrawable) background).setColor(i);
            $jacocoInit[7] = true;
        }
        $jacocoInit[8] = true;
    }

    public static void setDrawableTintColor(ImageView imageView, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        imageView.setColorFilter(i, Mode.SRC_ATOP);
        $jacocoInit[9] = true;
    }
}
