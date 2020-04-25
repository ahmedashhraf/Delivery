package com.google.android.material.p186j;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0202m;
import androidx.annotation.C0209o;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.C5582R;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p187p.C6990p;
import com.google.android.material.p187p.C7003s;
import com.google.android.material.p302m.C6952c;

@C5716a
/* renamed from: com.google.android.material.j.b */
/* compiled from: ShapeableImageView */
public class C6945b extends AppCompatImageView implements C7003s {

    /* renamed from: V */
    private static final int f19418V = C5582R.style.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: W */
    private static final String f19419W = "ShapeableImageView";

    /* renamed from: N */
    private final RectF f19420N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final RectF f19421O;

    /* renamed from: P */
    private final Paint f19422P;

    /* renamed from: Q */
    private final Paint f19423Q;

    /* renamed from: R */
    private final Path f19424R;

    /* renamed from: S */
    private ColorStateList f19425S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C6986o f19426T;
    @C0199k0

    /* renamed from: U */
    private int f19427U;

    /* renamed from: a */
    private final C6990p f19428a;

    /* renamed from: b */
    private final Matrix f19429b;

    @TargetApi(21)
    /* renamed from: com.google.android.material.j.b$a */
    /* compiled from: ShapeableImageView */
    class C6946a extends ViewOutlineProvider {

        /* renamed from: a */
        private Rect f19430a = new Rect();

        C6946a() {
        }

        public void getOutline(View view, Outline outline) {
            if (C6945b.this.f19426T != null && C6945b.this.f19426T.mo27859a(C6945b.this.f19421O)) {
                C6945b.this.f19421O.round(this.f19430a);
                outline.setRoundRect(this.f19430a, C6945b.this.f19426T.mo27861c().mo27763a(C6945b.this.f19421O));
            }
        }
    }

    public C6945b(Context context) {
        this(context, null, 0);
    }

    @C0193h0
    public C6986o getShapeAppearanceModel() {
        return this.f19426T;
    }

    @C0195i0
    public ColorStateList getStrokeColor() {
        return this.f19425S;
    }

    @C0199k0
    public int getStrokeWidth() {
        return this.f19427U;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getDrawable() instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            if (bitmap != null) {
                this.f19420N.set(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                m33310a(bitmap, canvas, this.f19420N, this.f19421O);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f19421O.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getMeasuredWidth() - getPaddingRight()), (float) (getMeasuredHeight() - getPaddingBottom()));
        this.f19428a.mo27902a(this.f19426T, 1.0f, this.f19421O, this.f19424R);
    }

    public void setShapeAppearanceModel(@C0193h0 C6986o oVar) {
        this.f19426T = oVar;
        requestLayout();
    }

    public void setStrokeColor(@C0195i0 ColorStateList colorStateList) {
        this.f19425S = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@C0202m int i) {
        setStrokeColor(C0242a.m1108b(getContext(), i));
    }

    public void setStrokeWidth(@C0199k0 int i) {
        if (this.f19427U != i) {
            this.f19427U = i;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@C0209o int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public C6945b(Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m33310a(Bitmap bitmap, Canvas canvas, RectF rectF, RectF rectF2) {
        TileMode tileMode = TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f19429b.reset();
        this.f19429b.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.f19429b);
        this.f19422P.setShader(bitmapShader);
        canvas.drawPath(this.f19424R, this.f19422P);
        this.f19423Q.setStrokeWidth((float) this.f19427U);
        int colorForState = this.f19425S.getColorForState(getDrawableState(), this.f19425S.getDefaultColor());
        if (this.f19427U > 0 && colorForState != 0) {
            this.f19423Q.setColor(colorForState);
            canvas.drawPath(this.f19424R, this.f19423Q);
        }
    }

    public C6945b(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19428a = new C6990p();
        this.f19424R = new Path();
        this.f19429b = new Matrix();
        this.f19420N = new RectF();
        this.f19421O = new RectF();
        this.f19422P = new Paint();
        this.f19422P.setAntiAlias(true);
        this.f19422P.setFilterBitmap(true);
        this.f19422P.setDither(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.ShapeableImageView, i, f19418V);
        this.f19425S = C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.ShapeableImageView_strokeColor);
        this.f19427U = obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.ShapeableImageView_strokeWidth, 0);
        this.f19423Q = new Paint();
        this.f19423Q.setStyle(Style.STROKE);
        this.f19423Q.setAntiAlias(true);
        this.f19426T = C6986o.m33526a(context, attributeSet, i, f19418V).mo27878a();
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C6946a());
        }
    }
}
