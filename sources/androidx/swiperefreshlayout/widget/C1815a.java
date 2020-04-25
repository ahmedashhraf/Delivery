package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* compiled from: CircleImageView */
class C1815a extends ImageView {

    /* renamed from: N */
    private static final int f7041N = 503316480;

    /* renamed from: O */
    private static final int f7042O = 1023410176;

    /* renamed from: P */
    private static final float f7043P = 0.0f;

    /* renamed from: Q */
    private static final float f7044Q = 1.75f;

    /* renamed from: R */
    private static final float f7045R = 3.5f;

    /* renamed from: S */
    private static final int f7046S = 4;

    /* renamed from: a */
    private AnimationListener f7047a;

    /* renamed from: b */
    int f7048b;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* compiled from: CircleImageView */
    private class C1816a extends OvalShape {

        /* renamed from: a */
        private RadialGradient f7050a;

        /* renamed from: b */
        private Paint f7051b = new Paint();

        C1816a(int i) {
            C1815a.this.f7048b = i;
            m9729a((int) rect().width());
        }

        /* renamed from: a */
        private void m9729a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1815a.this.f7048b, new int[]{C1815a.f7042O, 0}, null, TileMode.CLAMP);
            this.f7050a = radialGradient;
            this.f7051b.setShader(this.f7050a);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C1815a.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1815a.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f7051b);
            canvas.drawCircle(f, height, (float) (width - C1815a.this.f7048b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m9729a((int) f);
        }
    }

    C1815a(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (f7044Q * f);
        int i3 = (int) (0.0f * f);
        this.f7048b = (int) (f7045R * f);
        if (m9726a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0962e0.m5472b((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1816a(this.f7048b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f7048b, (float) i3, (float) i2, f7041N);
            int i4 = this.f7048b;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0962e0.m5440a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m9726a() {
        return VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        AnimationListener animationListener = this.f7047a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        AnimationListener animationListener = this.f7047a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m9726a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f7048b * 2), getMeasuredHeight() + (this.f7048b * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* renamed from: a */
    public void mo8149a(AnimationListener animationListener) {
        this.f7047a = animationListener;
    }

    /* renamed from: a */
    public void mo8148a(int i) {
        setBackgroundColor(C0841b.m4915a(getContext(), i));
    }
}
