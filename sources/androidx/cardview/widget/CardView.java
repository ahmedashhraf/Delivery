package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.cardview.C0622R;

public class CardView extends FrameLayout {

    /* renamed from: S */
    private static final int[] f2456S = {16842801};

    /* renamed from: T */
    private static final C0631e f2457T;

    /* renamed from: N */
    int f2458N;

    /* renamed from: O */
    int f2459O;

    /* renamed from: P */
    final Rect f2460P;

    /* renamed from: Q */
    final Rect f2461Q;

    /* renamed from: R */
    private final C0630d f2462R;

    /* renamed from: a */
    private boolean f2463a;

    /* renamed from: b */
    private boolean f2464b;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0624a implements C0630d {

        /* renamed from: a */
        private Drawable f2465a;

        C0624a() {
        }

        /* renamed from: a */
        public void mo3133a(Drawable drawable) {
            this.f2465a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo3135b() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: c */
        public Drawable mo3136c() {
            return this.f2465a;
        }

        /* renamed from: d */
        public View mo3137d() {
            return CardView.this;
        }

        /* renamed from: a */
        public boolean mo3134a() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: a */
        public void mo3132a(int i, int i2, int i3, int i4) {
            CardView.this.f2461Q.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f2460P;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: a */
        public void mo3131a(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f2458N) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f2459O) {
                CardView.super.setMinimumHeight(i2);
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f2457T = new C0627b();
        } else if (i >= 17) {
            f2457T = new C0625a();
        } else {
            f2457T = new C0628c();
        }
        f2457T.mo3138a();
    }

    public CardView(@C0193h0 Context context) {
        this(context, null);
    }

    @C0193h0
    public ColorStateList getCardBackgroundColor() {
        return f2457T.mo3149e(this.f2462R);
    }

    public float getCardElevation() {
        return f2457T.mo3140a(this.f2462R);
    }

    @C0199k0
    public int getContentPaddingBottom() {
        return this.f2460P.bottom;
    }

    @C0199k0
    public int getContentPaddingLeft() {
        return this.f2460P.left;
    }

    @C0199k0
    public int getContentPaddingRight() {
        return this.f2460P.right;
    }

    @C0199k0
    public int getContentPaddingTop() {
        return this.f2460P.top;
    }

    public float getMaxCardElevation() {
        return f2457T.mo3148d(this.f2462R);
    }

    public boolean getPreventCornerOverlap() {
        return this.f2464b;
    }

    public float getRadius() {
        return f2457T.mo3144b(this.f2462R);
    }

    public boolean getUseCompatPadding() {
        return this.f2463a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f2457T instanceof C0627b)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2457T.mo3152h(this.f2462R)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f2457T.mo3151g(this.f2462R)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@C0198k int i) {
        f2457T.mo3143a(this.f2462R, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        f2457T.mo3145b(this.f2462R, f);
    }

    public void setMaxCardElevation(float f) {
        f2457T.mo3147c(this.f2462R, f);
    }

    public void setMinimumHeight(int i) {
        this.f2459O = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f2458N = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2464b) {
            this.f2464b = z;
            f2457T.mo3153i(this.f2462R);
        }
    }

    public void setRadius(float f) {
        f2457T.mo3141a(this.f2462R, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2463a != z) {
            this.f2463a = z;
            f2457T.mo3146c(this.f2462R);
        }
    }

    public CardView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C0622R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(@C0195i0 ColorStateList colorStateList) {
        f2457T.mo3143a(this.f2462R, colorStateList);
    }

    public CardView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList valueOf;
        super(context, attributeSet, i);
        this.f2460P = new Rect();
        this.f2461Q = new Rect();
        this.f2462R = new C0624a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0622R.styleable.CardView, i, C0622R.style.CardView);
        if (obtainStyledAttributes.hasValue(C0622R.styleable.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C0622R.styleable.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2456S);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C0622R.C0623color.cardview_light_background);
            } else {
                i2 = getResources().getColor(C0622R.C0623color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C0622R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0622R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C0622R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f2463a = obtainStyledAttributes.getBoolean(C0622R.styleable.CardView_cardUseCompatPadding, false);
        this.f2464b = obtainStyledAttributes.getBoolean(C0622R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_contentPadding, 0);
        this.f2460P.left = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f2460P.top = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        this.f2460P.right = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        this.f2460P.bottom = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f2458N = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_android_minWidth, 0);
        this.f2459O = obtainStyledAttributes.getDimensionPixelSize(C0622R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f2457T.mo3142a(this.f2462R, context, colorStateList, dimension, dimension2, f);
    }

    /* renamed from: a */
    public void mo3108a(@C0199k0 int i, @C0199k0 int i2, @C0199k0 int i3, @C0199k0 int i4) {
        this.f2460P.set(i, i2, i3, i4);
        f2457T.mo3150f(this.f2462R);
    }
}
