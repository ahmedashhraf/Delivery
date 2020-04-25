package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
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

public class LinePageIndicator extends View implements C12113e {

    /* renamed from: a0 */
    private static final int f35012a0 = -1;

    /* renamed from: N */
    private ViewPager f35013N;

    /* renamed from: O */
    private C2019j f35014O;

    /* renamed from: P */
    private int f35015P;

    /* renamed from: Q */
    private boolean f35016Q;

    /* renamed from: R */
    private float f35017R;

    /* renamed from: S */
    private float f35018S;

    /* renamed from: T */
    private int f35019T;

    /* renamed from: U */
    private float f35020U;

    /* renamed from: V */
    private int f35021V;

    /* renamed from: W */
    private boolean f35022W;

    /* renamed from: a */
    private final Paint f35023a;

    /* renamed from: b */
    private final Paint f35024b;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C12094a();

        /* renamed from: a */
        int f35025a;

        /* renamed from: com.viewpagerindicator.LinePageIndicator$SavedState$a */
        static class C12094a implements Creator<SavedState> {
            C12094a() {
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
            parcel.writeInt(this.f35025a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35025a = parcel.readInt();
        }
    }

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private int m54676d(int i) {
        float f;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            ViewPager viewPager = this.f35013N;
            if (viewPager != null) {
                int a = viewPager.getAdapter().mo8886a();
                f = ((float) (getPaddingLeft() + getPaddingRight())) + (((float) a) * this.f35017R) + (((float) (a - 1)) * this.f35018S);
                if (mode == Integer.MIN_VALUE) {
                    f = Math.min(f, (float) size);
                }
                return (int) Math.ceil((double) f);
            }
        }
        f = (float) size;
        return (int) Math.ceil((double) f);
    }

    /* renamed from: a */
    public boolean mo41463a() {
        return this.f35016Q;
    }

    /* renamed from: b */
    public void mo41436b() {
        invalidate();
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        this.f35015P = i;
        invalidate();
        C2019j jVar = this.f35014O;
        if (jVar != null) {
            jVar.mo8880c(i);
        }
    }

    public float getGapWidth() {
        return this.f35018S;
    }

    public float getLineWidth() {
        return this.f35017R;
    }

    public int getSelectedColor() {
        return this.f35024b.getColor();
    }

    public float getStrokeWidth() {
        return this.f35024b.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.f35023a.getColor();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ViewPager viewPager = this.f35013N;
        if (viewPager != null) {
            int a = viewPager.getAdapter().mo8886a();
            if (a != 0) {
                if (this.f35015P >= a) {
                    setCurrentItem(a - 1);
                    return;
                }
                float f = this.f35017R;
                float f2 = this.f35018S;
                float f3 = f + f2;
                float f4 = (((float) a) * f3) - f2;
                float paddingTop = (float) getPaddingTop();
                float paddingLeft = (float) getPaddingLeft();
                float paddingRight = (float) getPaddingRight();
                float height = paddingTop + (((((float) getHeight()) - paddingTop) - ((float) getPaddingBottom())) / 2.0f);
                if (this.f35016Q) {
                    paddingLeft += (((((float) getWidth()) - paddingLeft) - paddingRight) / 2.0f) - (f4 / 2.0f);
                }
                int i = 0;
                while (i < a) {
                    float f5 = paddingLeft + (((float) i) * f3);
                    canvas.drawLine(f5, height, f5 + this.f35017R, height, i == this.f35015P ? this.f35024b : this.f35023a);
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(m54676d(i), m54675b(i2));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35015P = savedState.f35025a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35025a = this.f35015P;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f35013N;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().mo8886a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float d = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35021V));
                    float f = d - this.f35020U;
                    if (!this.f35022W && Math.abs(f) > ((float) this.f35019T)) {
                        this.f35022W = true;
                    }
                    if (this.f35022W) {
                        this.f35020U = d;
                        if (this.f35013N.isFakeDragging() || this.f35013N.beginFakeDrag()) {
                            this.f35013N.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a = C1007o.m5777a(motionEvent);
                        this.f35020U = C1007o.m5783d(motionEvent, a);
                        this.f35021V = C1007o.m5782c(motionEvent, a);
                    } else if (action == 6) {
                        int a2 = C1007o.m5777a(motionEvent);
                        if (C1007o.m5782c(motionEvent, a2) == this.f35021V) {
                            if (a2 == 0) {
                                i = 1;
                            }
                            this.f35021V = C1007o.m5782c(motionEvent, i);
                        }
                        this.f35020U = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35021V));
                    }
                }
            }
            if (!this.f35022W) {
                int a3 = this.f35013N.getAdapter().mo8886a();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.f35015P > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.f35013N.setCurrentItem(this.f35015P - 1);
                    }
                    return true;
                } else if (this.f35015P < a3 - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.f35013N.setCurrentItem(this.f35015P + 1);
                    }
                    return true;
                }
            }
            this.f35022W = false;
            this.f35021V = -1;
            if (this.f35013N.isFakeDragging()) {
                this.f35013N.endFakeDrag();
            }
        } else {
            this.f35021V = C1007o.m5782c(motionEvent, 0);
            this.f35020U = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.f35016Q = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f35013N;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.f35015P = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setGapWidth(float f) {
        this.f35018S = f;
        invalidate();
    }

    public void setLineWidth(float f) {
        this.f35017R = f;
        invalidate();
    }

    public void setOnPageChangeListener(C2019j jVar) {
        this.f35014O = jVar;
    }

    public void setSelectedColor(int i) {
        this.f35024b.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f35024b.setStrokeWidth(f);
        this.f35023a.setStrokeWidth(f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.f35023a.setColor(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f35013N;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f35013N = viewPager;
                this.f35013N.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12096R.attr.vpiLinePageIndicatorStyle);
    }

    /* renamed from: b */
    private int m54675b(int i) {
        float f;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            f = (float) size;
        } else {
            float strokeWidth = this.f35024b.getStrokeWidth() + ((float) getPaddingTop()) + ((float) getPaddingBottom());
            f = mode == Integer.MIN_VALUE ? Math.min(strokeWidth, (float) size) : strokeWidth;
        }
        return (int) Math.ceil((double) f);
    }

    /* renamed from: a */
    public void mo41434a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35023a = new Paint(1);
        this.f35024b = new Paint(1);
        this.f35020U = -1.0f;
        this.f35021V = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C12096R.C12097color.default_line_indicator_selected_color);
            int color2 = resources.getColor(C12096R.C12097color.default_line_indicator_unselected_color);
            float dimension = resources.getDimension(C12096R.dimen.default_line_indicator_line_width);
            float dimension2 = resources.getDimension(C12096R.dimen.default_line_indicator_gap_width);
            float dimension3 = resources.getDimension(C12096R.dimen.default_line_indicator_stroke_width);
            boolean z = resources.getBoolean(C12096R.bool.default_line_indicator_centered);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12096R.styleable.LinePageIndicator, i, 0);
            this.f35016Q = obtainStyledAttributes.getBoolean(C12096R.styleable.LinePageIndicator_centered, z);
            this.f35017R = obtainStyledAttributes.getDimension(C12096R.styleable.LinePageIndicator_lineWidth, dimension);
            this.f35018S = obtainStyledAttributes.getDimension(C12096R.styleable.LinePageIndicator_gapWidth, dimension2);
            setStrokeWidth(obtainStyledAttributes.getDimension(C12096R.styleable.LinePageIndicator_strokeWidth, dimension3));
            this.f35023a.setColor(obtainStyledAttributes.getColor(C12096R.styleable.LinePageIndicator_unselectedColor, color2));
            this.f35024b.setColor(obtainStyledAttributes.getColor(C12096R.styleable.LinePageIndicator_selectedColor, color));
            Drawable drawable = obtainStyledAttributes.getDrawable(C12096R.styleable.LinePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f35019T = C0983f0.m5632b(ViewConfiguration.get(context));
        }
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        C2019j jVar = this.f35014O;
        if (jVar != null) {
            jVar.mo8878a(i);
        }
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        C2019j jVar = this.f35014O;
        if (jVar != null) {
            jVar.mo8879a(i, f, i2);
        }
    }
}
