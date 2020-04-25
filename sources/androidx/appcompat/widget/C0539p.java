package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C0898f;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;

/* renamed from: androidx.appcompat.widget.p */
/* compiled from: AppCompatProgressBarHelper */
class C0539p {

    /* renamed from: c */
    private static final int[] f2165c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f2166a;

    /* renamed from: b */
    private Bitmap f2167b;

    C0539p(ProgressBar progressBar) {
        this.f2166a = progressBar;
    }

    /* renamed from: b */
    private Shape mo2858b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2833a(AttributeSet attributeSet, int i) {
        C0549t0 a = C0549t0.m2910a(this.f2166a.getContext(), attributeSet, f2165c, i, 0);
        Drawable c = a.mo2877c(0);
        if (c != null) {
            this.f2166a.setIndeterminateDrawable(mo2857a(c));
        }
        Drawable c2 = a.mo2877c(1);
        if (c2 != null) {
            this.f2166a.setProgressDrawable(m2887a(c2, false));
        }
        a.mo2887f();
    }

    /* renamed from: a */
    private Drawable m2887a(Drawable drawable, boolean z) {
        if (drawable instanceof C0898f) {
            C0898f fVar = (C0898f) drawable;
            Drawable a = fVar.mo4619a();
            if (a != null) {
                fVar.mo4620a(m2887a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m2887a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2167b == null) {
                this.f2167b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo2858b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            drawable = z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo2857a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m2887a(animationDrawable.getFrame(i), true);
            a.setLevel(C14236a.DEFAULT_TIMEOUT);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(C14236a.DEFAULT_TIMEOUT);
        return animationDrawable2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo2832a() {
        return this.f2167b;
    }
}
