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
import android.view.ViewConfiguration;
import androidx.core.p034l.C0983f0;
import androidx.core.p034l.C1007o;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;

public class UnderlinePageIndicator extends View implements C12113e {

    /* renamed from: d0 */
    private static final int f35059d0 = -1;

    /* renamed from: e0 */
    private static final int f35060e0 = 30;

    /* renamed from: N */
    private int f35061N;

    /* renamed from: O */
    private int f35062O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f35063P;

    /* renamed from: Q */
    private ViewPager f35064Q;

    /* renamed from: R */
    private C2019j f35065R;

    /* renamed from: S */
    private int f35066S;

    /* renamed from: T */
    private int f35067T;

    /* renamed from: U */
    private float f35068U;

    /* renamed from: V */
    private int f35069V;

    /* renamed from: W */
    private float f35070W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Paint f35071a;

    /* renamed from: a0 */
    private int f35072a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f35073b;

    /* renamed from: b0 */
    private boolean f35074b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final Runnable f35075c0;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C12105a();

        /* renamed from: a */
        int f35076a;

        /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$SavedState$a */
        static class C12105a implements Creator<SavedState> {
            C12105a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C12106a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f35076a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35076a = parcel.readInt();
        }
    }

    /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$a */
    class C12106a implements Runnable {
        C12106a() {
        }

        public void run() {
            if (UnderlinePageIndicator.this.f35073b) {
                int max = Math.max(UnderlinePageIndicator.this.f35071a.getAlpha() - UnderlinePageIndicator.this.f35063P, 0);
                UnderlinePageIndicator.this.f35071a.setAlpha(max);
                UnderlinePageIndicator.this.invalidate();
                if (max > 0) {
                    UnderlinePageIndicator.this.postDelayed(this, 30);
                }
            }
        }
    }

    /* renamed from: com.viewpagerindicator.UnderlinePageIndicator$b */
    class C12107b implements Runnable {
        C12107b() {
        }

        public void run() {
            if (UnderlinePageIndicator.this.f35073b) {
                UnderlinePageIndicator underlinePageIndicator = UnderlinePageIndicator.this;
                underlinePageIndicator.post(underlinePageIndicator.f35075c0);
            }
        }
    }

    public UnderlinePageIndicator(Context context) {
        this(context, null);
    }

    public int getFadeDelay() {
        return this.f35061N;
    }

    public int getFadeLength() {
        return this.f35062O;
    }

    public boolean getFades() {
        return this.f35073b;
    }

    public int getSelectedColor() {
        return this.f35071a.getColor();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ViewPager viewPager = this.f35064Q;
        if (viewPager != null) {
            int a = viewPager.getAdapter().mo8886a();
            if (a != 0) {
                if (this.f35067T >= a) {
                    setCurrentItem(a - 1);
                    return;
                }
                int paddingLeft = getPaddingLeft();
                float width = ((float) ((getWidth() - paddingLeft) - getPaddingRight())) / (((float) a) * 1.0f);
                float f = ((float) paddingLeft) + ((((float) this.f35067T) + this.f35068U) * width);
                Canvas canvas2 = canvas;
                canvas2.drawRect(f, (float) getPaddingTop(), f + width, (float) (getHeight() - getPaddingBottom()), this.f35071a);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35067T = savedState.f35076a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35076a = this.f35067T;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f35064Q;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().mo8886a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float d = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35072a0));
                    float f = d - this.f35070W;
                    if (!this.f35074b0 && Math.abs(f) > ((float) this.f35069V)) {
                        this.f35074b0 = true;
                    }
                    if (this.f35074b0) {
                        this.f35070W = d;
                        if (this.f35064Q.isFakeDragging() || this.f35064Q.beginFakeDrag()) {
                            this.f35064Q.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a = C1007o.m5777a(motionEvent);
                        this.f35070W = C1007o.m5783d(motionEvent, a);
                        this.f35072a0 = C1007o.m5782c(motionEvent, a);
                    } else if (action == 6) {
                        int a2 = C1007o.m5777a(motionEvent);
                        if (C1007o.m5782c(motionEvent, a2) == this.f35072a0) {
                            if (a2 == 0) {
                                i = 1;
                            }
                            this.f35072a0 = C1007o.m5782c(motionEvent, i);
                        }
                        this.f35070W = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35072a0));
                    }
                }
            }
            if (!this.f35074b0) {
                int a3 = this.f35064Q.getAdapter().mo8886a();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.f35067T > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.f35064Q.setCurrentItem(this.f35067T - 1);
                    }
                    return true;
                } else if (this.f35067T < a3 - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.f35064Q.setCurrentItem(this.f35067T + 1);
                    }
                    return true;
                }
            }
            this.f35074b0 = false;
            this.f35072a0 = -1;
            if (this.f35064Q.isFakeDragging()) {
                this.f35064Q.endFakeDrag();
            }
        } else {
            this.f35072a0 = C1007o.m5782c(motionEvent, 0);
            this.f35070W = motionEvent.getX();
        }
        return true;
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f35064Q;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.f35067T = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFadeDelay(int i) {
        this.f35061N = i;
    }

    public void setFadeLength(int i) {
        this.f35062O = i;
        this.f35063P = 255 / (this.f35062O / 30);
    }

    public void setFades(boolean z) {
        if (z != this.f35073b) {
            this.f35073b = z;
            if (z) {
                post(this.f35075c0);
                return;
            }
            removeCallbacks(this.f35075c0);
            this.f35071a.setAlpha(255);
            invalidate();
        }
    }

    public void setOnPageChangeListener(C2019j jVar) {
        this.f35065R = jVar;
    }

    public void setSelectedColor(int i) {
        this.f35071a.setColor(i);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f35064Q;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f35064Q = viewPager;
                this.f35064Q.setOnPageChangeListener(this);
                invalidate();
                post(new C12107b());
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12096R.attr.vpiUnderlinePageIndicatorStyle);
    }

    /* renamed from: a */
    public void mo41434a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    /* renamed from: b */
    public void mo41436b() {
        invalidate();
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        if (this.f35066S == 0) {
            this.f35067T = i;
            this.f35068U = 0.0f;
            invalidate();
            this.f35075c0.run();
        }
        C2019j jVar = this.f35065R;
        if (jVar != null) {
            jVar.mo8880c(i);
        }
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35071a = new Paint(1);
        this.f35070W = -1.0f;
        this.f35072a0 = -1;
        this.f35075c0 = new C12106a();
        if (!isInEditMode()) {
            Resources resources = getResources();
            boolean z = resources.getBoolean(C12096R.bool.default_underline_indicator_fades);
            int integer = resources.getInteger(C12096R.integer.default_underline_indicator_fade_delay);
            int integer2 = resources.getInteger(C12096R.integer.default_underline_indicator_fade_length);
            int color = resources.getColor(C12096R.C12097color.default_underline_indicator_selected_color);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12096R.styleable.UnderlinePageIndicator, i, 0);
            setFades(obtainStyledAttributes.getBoolean(C12096R.styleable.UnderlinePageIndicator_fades, z));
            setSelectedColor(obtainStyledAttributes.getColor(C12096R.styleable.UnderlinePageIndicator_selectedColor, color));
            setFadeDelay(obtainStyledAttributes.getInteger(C12096R.styleable.UnderlinePageIndicator_fadeDelay, integer));
            setFadeLength(obtainStyledAttributes.getInteger(C12096R.styleable.UnderlinePageIndicator_fadeLength, integer2));
            Drawable drawable = obtainStyledAttributes.getDrawable(C12096R.styleable.UnderlinePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f35069V = C0983f0.m5632b(ViewConfiguration.get(context));
        }
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        this.f35066S = i;
        C2019j jVar = this.f35065R;
        if (jVar != null) {
            jVar.mo8878a(i);
        }
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        this.f35067T = i;
        this.f35068U = f;
        if (this.f35073b) {
            if (i2 > 0) {
                removeCallbacks(this.f35075c0);
                this.f35071a.setAlpha(255);
            } else if (this.f35066S != 1) {
                postDelayed(this.f35075c0, (long) this.f35061N);
            }
        }
        invalidate();
        C2019j jVar = this.f35065R;
        if (jVar != null) {
            jVar.mo8879a(i, f, i2);
        }
    }
}
