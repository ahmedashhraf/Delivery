package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import androidx.core.p034l.C0983f0;
import androidx.core.p034l.C1007o;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;

public class CirclePageIndicator extends View implements C12113e {

    /* renamed from: f0 */
    private static final int f34993f0 = -1;

    /* renamed from: N */
    private final Paint f34994N;

    /* renamed from: O */
    private final Paint f34995O;

    /* renamed from: P */
    private ViewPager f34996P;

    /* renamed from: Q */
    private C2019j f34997Q;

    /* renamed from: R */
    private int f34998R;

    /* renamed from: S */
    private int f34999S;

    /* renamed from: T */
    private float f35000T;

    /* renamed from: U */
    private int f35001U;

    /* renamed from: V */
    private int f35002V;

    /* renamed from: W */
    private boolean f35003W;

    /* renamed from: a */
    private float f35004a;

    /* renamed from: a0 */
    private boolean f35005a0;

    /* renamed from: b */
    private final Paint f35006b;

    /* renamed from: b0 */
    private int f35007b0;

    /* renamed from: c0 */
    private float f35008c0;

    /* renamed from: d0 */
    private int f35009d0;

    /* renamed from: e0 */
    private boolean f35010e0;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C12092a();

        /* renamed from: a */
        int f35011a;

        /* renamed from: com.viewpagerindicator.CirclePageIndicator$SavedState$a */
        static class C12092a implements Creator<SavedState> {
            C12092a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f35011a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35011a = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private int m54667d(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f35004a * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    /* renamed from: a */
    public boolean mo41435a() {
        return this.f35003W;
    }

    /* renamed from: b */
    public void mo41436b() {
        invalidate();
    }

    /* renamed from: c */
    public boolean mo41437c() {
        return this.f35005a0;
    }

    public int getFillColor() {
        return this.f34995O.getColor();
    }

    public int getOrientation() {
        return this.f35002V;
    }

    public int getPageColor() {
        return this.f35006b.getColor();
    }

    public float getRadius() {
        return this.f35004a;
    }

    public int getStrokeColor() {
        return this.f34994N.getColor();
    }

    public float getStrokeWidth() {
        return this.f34994N.getStrokeWidth();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        super.onDraw(canvas);
        ViewPager viewPager = this.f34996P;
        if (viewPager != null) {
            int a = viewPager.getAdapter().mo8886a();
            if (a != 0) {
                if (this.f34998R >= a) {
                    setCurrentItem(a - 1);
                    return;
                }
                if (this.f35002V == 0) {
                    i4 = getWidth();
                    i3 = getPaddingLeft();
                    i2 = getPaddingRight();
                    i = getPaddingTop();
                } else {
                    i4 = getHeight();
                    i3 = getPaddingTop();
                    i2 = getPaddingBottom();
                    i = getPaddingLeft();
                }
                float f3 = this.f35004a;
                float f4 = 3.0f * f3;
                float f5 = ((float) i) + f3;
                float f6 = ((float) i3) + f3;
                if (this.f35003W) {
                    f6 += (((float) ((i4 - i3) - i2)) / 2.0f) - ((((float) a) * f4) / 2.0f);
                }
                float f7 = this.f35004a;
                if (this.f34994N.getStrokeWidth() > 0.0f) {
                    f7 -= this.f34994N.getStrokeWidth() / 2.0f;
                }
                for (int i5 = 0; i5 < a; i5++) {
                    float f8 = (((float) i5) * f4) + f6;
                    if (this.f35002V == 0) {
                        f2 = f5;
                    } else {
                        f2 = f8;
                        f8 = f5;
                    }
                    if (this.f35006b.getAlpha() > 0) {
                        canvas.drawCircle(f8, f2, f7, this.f35006b);
                    }
                    float f9 = this.f35004a;
                    if (f7 != f9) {
                        canvas.drawCircle(f8, f2, f9, this.f34994N);
                    }
                }
                float f10 = ((float) (this.f35005a0 ? this.f34999S : this.f34998R)) * f4;
                if (!this.f35005a0) {
                    f10 += this.f35000T * f4;
                }
                if (this.f35002V == 0) {
                    f = f10 + f6;
                } else {
                    float f11 = f5;
                    f5 = f10 + f6;
                    f = f11;
                }
                canvas.drawCircle(f, f5, this.f35004a, this.f34995O);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f35002V == 0) {
            setMeasuredDimension(m54666b(i), m54667d(i2));
        } else {
            setMeasuredDimension(m54667d(i), m54666b(i2));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f35011a;
        this.f34998R = i;
        this.f34999S = i;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35011a = this.f34998R;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f34996P;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().mo8886a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float d = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35009d0));
                    float f = d - this.f35008c0;
                    if (!this.f35010e0 && Math.abs(f) > ((float) this.f35007b0)) {
                        this.f35010e0 = true;
                    }
                    if (this.f35010e0) {
                        this.f35008c0 = d;
                        if (this.f34996P.isFakeDragging() || this.f34996P.beginFakeDrag()) {
                            this.f34996P.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a = C1007o.m5777a(motionEvent);
                        this.f35008c0 = C1007o.m5783d(motionEvent, a);
                        this.f35009d0 = C1007o.m5782c(motionEvent, a);
                    } else if (action == 6) {
                        int a2 = C1007o.m5777a(motionEvent);
                        if (C1007o.m5782c(motionEvent, a2) == this.f35009d0) {
                            if (a2 == 0) {
                                i = 1;
                            }
                            this.f35009d0 = C1007o.m5782c(motionEvent, i);
                        }
                        this.f35008c0 = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35009d0));
                    }
                }
            }
            if (!this.f35010e0) {
                int a3 = this.f34996P.getAdapter().mo8886a();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.f34998R > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.f34996P.setCurrentItem(this.f34998R - 1);
                    }
                    return true;
                } else if (this.f34998R < a3 - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.f34996P.setCurrentItem(this.f34998R + 1);
                    }
                    return true;
                }
            }
            this.f35010e0 = false;
            this.f35009d0 = -1;
            if (this.f34996P.isFakeDragging()) {
                this.f34996P.endFakeDrag();
            }
        } else {
            this.f35009d0 = C1007o.m5782c(motionEvent, 0);
            this.f35008c0 = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.f35003W = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f34996P;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.f34998R = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i) {
        this.f34995O.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(C2019j jVar) {
        this.f34997Q = jVar;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.f35002V = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i) {
        this.f35006b.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.f35004a = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.f35005a0 = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f34994N.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f34994N.setStrokeWidth(f);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f34996P;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f34996P = viewPager;
                this.f34996P.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12096R.attr.vpiCirclePageIndicatorStyle);
    }

    /* renamed from: b */
    private int m54666b(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        ViewPager viewPager = this.f34996P;
        if (viewPager == null) {
            return size;
        }
        int a = viewPager.getAdapter().mo8886a();
        float paddingLeft = (float) (getPaddingLeft() + getPaddingRight());
        float f = (float) (a * 2);
        float f2 = this.f35004a;
        int i2 = (int) (paddingLeft + (f * f2) + (((float) (a - 1)) * f2) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    /* renamed from: a */
    public void mo41434a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        if (this.f35005a0 || this.f35001U == 0) {
            this.f34998R = i;
            this.f34999S = i;
            invalidate();
        }
        C2019j jVar = this.f34997Q;
        if (jVar != null) {
            jVar.mo8880c(i);
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35006b = new Paint(1);
        this.f34994N = new Paint(1);
        this.f34995O = new Paint(1);
        this.f35008c0 = -1.0f;
        this.f35009d0 = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C12096R.C12097color.default_circle_indicator_page_color);
            int color2 = resources.getColor(C12096R.C12097color.default_circle_indicator_fill_color);
            int integer = resources.getInteger(C12096R.integer.default_circle_indicator_orientation);
            int color3 = resources.getColor(C12096R.C12097color.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(C12096R.dimen.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(C12096R.dimen.default_circle_indicator_radius);
            boolean z = resources.getBoolean(C12096R.bool.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(C12096R.bool.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12096R.styleable.CirclePageIndicator, i, 0);
            this.f35003W = obtainStyledAttributes.getBoolean(C12096R.styleable.CirclePageIndicator_centered, z);
            this.f35002V = obtainStyledAttributes.getInt(C12096R.styleable.CirclePageIndicator_android_orientation, integer);
            this.f35006b.setStyle(Style.FILL);
            this.f35006b.setColor(obtainStyledAttributes.getColor(C12096R.styleable.CirclePageIndicator_pageColor, color));
            this.f34994N.setStyle(Style.STROKE);
            this.f34994N.setColor(obtainStyledAttributes.getColor(C12096R.styleable.CirclePageIndicator_strokeColor, color3));
            this.f34994N.setStrokeWidth(obtainStyledAttributes.getDimension(C12096R.styleable.CirclePageIndicator_strokeWidth, dimension));
            this.f34995O.setStyle(Style.FILL);
            this.f34995O.setColor(obtainStyledAttributes.getColor(C12096R.styleable.CirclePageIndicator_fillColor, color2));
            this.f35004a = obtainStyledAttributes.getDimension(C12096R.styleable.CirclePageIndicator_radius, dimension2);
            this.f35005a0 = obtainStyledAttributes.getBoolean(C12096R.styleable.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(C12096R.styleable.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f35007b0 = C0983f0.m5632b(ViewConfiguration.get(context));
        }
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        this.f35001U = i;
        C2019j jVar = this.f34997Q;
        if (jVar != null) {
            jVar.mo8878a(i);
        }
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        this.f34998R = i;
        this.f35000T = f;
        invalidate();
        C2019j jVar = this.f34997Q;
        if (jVar != null) {
            jVar.mo8879a(i, f, i2);
        }
    }
}
