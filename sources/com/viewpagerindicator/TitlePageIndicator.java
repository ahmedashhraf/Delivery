package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import java.util.ArrayList;

public class TitlePageIndicator extends View implements C12113e {

    /* renamed from: p0 */
    private static final float f35026p0 = 0.25f;

    /* renamed from: q0 */
    private static final float f35027q0 = 0.05f;

    /* renamed from: r0 */
    private static final String f35028r0 = "";

    /* renamed from: s0 */
    private static final int f35029s0 = -1;

    /* renamed from: N */
    private int f35030N;

    /* renamed from: O */
    private float f35031O;

    /* renamed from: P */
    private int f35032P;

    /* renamed from: Q */
    private final Paint f35033Q;

    /* renamed from: R */
    private boolean f35034R;

    /* renamed from: S */
    private int f35035S;

    /* renamed from: T */
    private int f35036T;

    /* renamed from: U */
    private Path f35037U;

    /* renamed from: V */
    private final Rect f35038V;

    /* renamed from: W */
    private final Paint f35039W;

    /* renamed from: a */
    private ViewPager f35040a;

    /* renamed from: a0 */
    private C12102b f35041a0;

    /* renamed from: b */
    private C2019j f35042b;

    /* renamed from: b0 */
    private C12103c f35043b0;

    /* renamed from: c0 */
    private final Paint f35044c0;

    /* renamed from: d0 */
    private float f35045d0;

    /* renamed from: e0 */
    private float f35046e0;

    /* renamed from: f0 */
    private float f35047f0;

    /* renamed from: g0 */
    private float f35048g0;

    /* renamed from: h0 */
    private float f35049h0;

    /* renamed from: i0 */
    private float f35050i0;

    /* renamed from: j0 */
    private float f35051j0;

    /* renamed from: k0 */
    private int f35052k0;

    /* renamed from: l0 */
    private float f35053l0;

    /* renamed from: m0 */
    private int f35054m0;

    /* renamed from: n0 */
    private boolean f35055n0;

    /* renamed from: o0 */
    private C12104d f35056o0;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C12100a();

        /* renamed from: a */
        int f35057a;

        /* renamed from: com.viewpagerindicator.TitlePageIndicator$SavedState$a */
        static class C12100a implements Creator<SavedState> {
            C12100a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C12101a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f35057a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f35057a = parcel.readInt();
        }
    }

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$a */
    static /* synthetic */ class C12101a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35058a = new int[C12102b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.viewpagerindicator.TitlePageIndicator$b[] r0 = com.viewpagerindicator.TitlePageIndicator.C12102b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35058a = r0
                int[] r0 = f35058a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.viewpagerindicator.TitlePageIndicator$b r1 = com.viewpagerindicator.TitlePageIndicator.C12102b.Triangle     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f35058a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.viewpagerindicator.TitlePageIndicator$b r1 = com.viewpagerindicator.TitlePageIndicator.C12102b.Underline     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.viewpagerindicator.TitlePageIndicator.C12101a.<clinit>():void");
        }
    }

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$b */
    public enum C12102b {
        None(0),
        Triangle(1),
        Underline(2);
        
        public final int value;

        private C12102b(int i) {
            this.value = i;
        }

        /* renamed from: a */
        public static C12102b m54694a(int i) {
            C12102b[] values;
            for (C12102b bVar : values()) {
                if (bVar.value == i) {
                    return bVar;
                }
            }
            return null;
        }
    }

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$c */
    public enum C12103c {
        Bottom(0),
        Top(1);
        
        public final int value;

        private C12103c(int i) {
            this.value = i;
        }

        /* renamed from: a */
        public static C12103c m54695a(int i) {
            C12103c[] values;
            for (C12103c cVar : values()) {
                if (cVar.value == i) {
                    return cVar;
                }
            }
            return null;
        }
    }

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$d */
    public interface C12104d {
        /* renamed from: a */
        void mo41520a(int i);
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m54687b(Rect rect, float f, int i) {
        rect.right = (int) (((float) i) - this.f35050i0);
        rect.left = (int) (((float) rect.right) - f);
    }

    /* renamed from: a */
    public boolean mo41483a() {
        return this.f35034R;
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        if (this.f35032P == 0) {
            this.f35030N = i;
            invalidate();
        }
        C2019j jVar = this.f35042b;
        if (jVar != null) {
            jVar.mo8880c(i);
        }
    }

    public float getClipPadding() {
        return this.f35050i0;
    }

    public int getFooterColor() {
        return this.f35039W.getColor();
    }

    public float getFooterIndicatorHeight() {
        return this.f35045d0;
    }

    public float getFooterIndicatorPadding() {
        return this.f35047f0;
    }

    public C12102b getFooterIndicatorStyle() {
        return this.f35041a0;
    }

    public float getFooterLineHeight() {
        return this.f35051j0;
    }

    public C12103c getLinePosition() {
        return this.f35043b0;
    }

    public int getSelectedColor() {
        return this.f35036T;
    }

    public int getTextColor() {
        return this.f35035S;
    }

    public float getTextSize() {
        return this.f35033Q.getTextSize();
    }

    public float getTitlePadding() {
        return this.f35048g0;
    }

    public float getTopPadding() {
        return this.f35049h0;
    }

    public Typeface getTypeface() {
        return this.f35033Q.getTypeface();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f3;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ViewPager viewPager = this.f35040a;
        if (viewPager != null) {
            int a = viewPager.getAdapter().mo8886a();
            if (a != 0) {
                if (this.f35030N == -1) {
                    ViewPager viewPager2 = this.f35040a;
                    if (viewPager2 != null) {
                        this.f35030N = viewPager2.getCurrentItem();
                    }
                }
                ArrayList a2 = m54684a(this.f35033Q);
                int size = a2.size();
                if (this.f35030N >= size) {
                    setCurrentItem(size - 1);
                    return;
                }
                int i6 = a - 1;
                float width = ((float) getWidth()) / 2.0f;
                int left = getLeft();
                float f4 = ((float) left) + this.f35050i0;
                int width2 = getWidth();
                int height = getHeight();
                int i7 = left + width2;
                float f5 = ((float) i7) - this.f35050i0;
                int i8 = this.f35030N;
                float f6 = this.f35031O;
                float f7 = width;
                if (((double) f6) > 0.5d) {
                    i8++;
                    f6 = 1.0f - f6;
                }
                int i9 = i8;
                boolean z = f6 <= f35026p0;
                boolean z2 = f6 <= f35027q0;
                float f8 = (f35026p0 - f6) / f35026p0;
                Rect rect = (Rect) a2.get(this.f35030N);
                int i10 = rect.right;
                int i11 = rect.left;
                float f9 = (float) (i10 - i11);
                if (((float) i11) < f4) {
                    m54685a(rect, f9, left);
                }
                if (((float) rect.right) > f5) {
                    m54687b(rect, f9, i7);
                }
                int i12 = this.f35030N;
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    while (i13 >= 0) {
                        Rect rect2 = (Rect) a2.get(i13);
                        int i14 = rect2.left;
                        if (((float) i14) < f4) {
                            int i15 = rect2.right - i14;
                            m54685a(rect2, (float) i15, left);
                            Rect rect3 = (Rect) a2.get(i13 + 1);
                            f3 = f4;
                            float f10 = (float) rect2.right;
                            i5 = width2;
                            float f11 = this.f35048g0;
                            float f12 = f10 + f11;
                            int i16 = rect3.left;
                            if (f12 > ((float) i16)) {
                                rect2.left = (int) (((float) (i16 - i15)) - f11);
                                rect2.right = rect2.left + i15;
                            }
                        } else {
                            f3 = f4;
                            i5 = width2;
                        }
                        i13--;
                        Canvas canvas3 = canvas;
                        f4 = f3;
                        width2 = i5;
                    }
                }
                int i17 = width2;
                int i18 = this.f35030N;
                if (i18 < i6) {
                    for (int i19 = i18 + 1; i19 < a; i19++) {
                        Rect rect4 = (Rect) a2.get(i19);
                        int i20 = rect4.right;
                        if (((float) i20) > f5) {
                            int i21 = i20 - rect4.left;
                            m54687b(rect4, (float) i21, i7);
                            Rect rect5 = (Rect) a2.get(i19 - 1);
                            float f13 = (float) rect4.left;
                            float f14 = this.f35048g0;
                            float f15 = f13 - f14;
                            int i22 = rect5.right;
                            if (f15 < ((float) i22)) {
                                rect4.left = (int) (((float) i22) + f14);
                                rect4.right = rect4.left + i21;
                            }
                        }
                    }
                }
                int i23 = this.f35035S >>> 24;
                int i24 = 0;
                while (i24 < a) {
                    Rect rect6 = (Rect) a2.get(i24);
                    int i25 = rect6.left;
                    if (i25 <= left || i25 >= i7) {
                        int i26 = rect6.right;
                        if (i26 <= left || i26 >= i7) {
                            i3 = i7;
                            i2 = i23;
                            i4 = i17;
                            i24++;
                            i17 = i4;
                            i7 = i3;
                            i23 = i2;
                        }
                    }
                    boolean z3 = i24 == i9;
                    CharSequence b = m54686b(i24);
                    this.f35033Q.setFakeBoldText(z3 && z2 && this.f35034R);
                    this.f35033Q.setColor(this.f35035S);
                    if (z3 && z) {
                        this.f35033Q.setAlpha(i23 - ((int) (((float) i23) * f8)));
                    }
                    if (i24 < size - 1) {
                        Rect rect7 = (Rect) a2.get(i24 + 1);
                        int i27 = rect6.right;
                        float f16 = (float) i27;
                        float f17 = this.f35048g0;
                        float f18 = f16 + f17;
                        int i28 = rect7.left;
                        if (f18 > ((float) i28)) {
                            int i29 = i27 - rect6.left;
                            rect6.left = (int) (((float) (i28 - i29)) - f17);
                            rect6.right = rect6.left + i29;
                        }
                    }
                    i3 = i7;
                    i2 = i23;
                    i4 = i17;
                    canvas.drawText(b, 0, b.length(), (float) rect6.left, ((float) rect6.bottom) + this.f35049h0, this.f35033Q);
                    if (z3 && z) {
                        this.f35033Q.setColor(this.f35036T);
                        this.f35033Q.setAlpha((int) (((float) (this.f35036T >>> 24)) * f8));
                        canvas.drawText(b, 0, b.length(), (float) rect6.left, ((float) rect6.bottom) + this.f35049h0, this.f35033Q);
                    }
                    i24++;
                    i17 = i4;
                    i7 = i3;
                    i23 = i2;
                }
                int i30 = i17;
                float f19 = this.f35051j0;
                float f20 = this.f35045d0;
                if (this.f35043b0 == C12103c.Top) {
                    f = -f20;
                    f2 = -f19;
                    i = 0;
                } else {
                    f = f20;
                    f2 = f19;
                    i = height;
                }
                this.f35037U.reset();
                float f21 = (float) i;
                float f22 = f21 - (f2 / 2.0f);
                this.f35037U.moveTo(0.0f, f22);
                this.f35037U.lineTo((float) i30, f22);
                this.f35037U.close();
                Canvas canvas4 = canvas;
                canvas4.drawPath(this.f35037U, this.f35039W);
                float f23 = f21 - f2;
                int i31 = C12101a.f35058a[this.f35041a0.ordinal()];
                if (i31 == 1) {
                    this.f35037U.reset();
                    float f24 = f7;
                    this.f35037U.moveTo(f24, f23 - f);
                    this.f35037U.lineTo(f24 + f, f23);
                    this.f35037U.lineTo(f24 - f, f23);
                    this.f35037U.close();
                    canvas4.drawPath(this.f35037U, this.f35044c0);
                } else if (i31 == 2 && z && i9 < size) {
                    Rect rect8 = (Rect) a2.get(i9);
                    float f25 = (float) rect8.right;
                    float f26 = this.f35046e0;
                    float f27 = f25 + f26;
                    float f28 = ((float) rect8.left) - f26;
                    float f29 = f23 - f;
                    this.f35037U.reset();
                    this.f35037U.moveTo(f28, f23);
                    this.f35037U.lineTo(f27, f23);
                    this.f35037U.lineTo(f27, f29);
                    this.f35037U.lineTo(f28, f29);
                    this.f35037U.close();
                    this.f35044c0.setAlpha((int) (255.0f * f8));
                    canvas4.drawPath(this.f35037U, this.f35044c0);
                    this.f35044c0.setAlpha(255);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        int size = MeasureSpec.getSize(i);
        if (MeasureSpec.getMode(i2) == 1073741824) {
            f = (float) MeasureSpec.getSize(i2);
        } else {
            this.f35038V.setEmpty();
            this.f35038V.bottom = (int) (this.f35033Q.descent() - this.f35033Q.ascent());
            Rect rect = this.f35038V;
            f = ((float) (rect.bottom - rect.top)) + this.f35051j0 + this.f35047f0 + this.f35049h0;
            if (this.f35041a0 != C12102b.None) {
                f += this.f35045d0;
            }
        }
        setMeasuredDimension(size, (int) f);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f35030N = savedState.f35057a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f35057a = this.f35030N;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f35040a;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().mo8886a() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float d = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35054m0));
                    float f = d - this.f35053l0;
                    if (!this.f35055n0 && Math.abs(f) > ((float) this.f35052k0)) {
                        this.f35055n0 = true;
                    }
                    if (this.f35055n0) {
                        this.f35053l0 = d;
                        if (this.f35040a.isFakeDragging() || this.f35040a.beginFakeDrag()) {
                            this.f35040a.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int a = C1007o.m5777a(motionEvent);
                        this.f35053l0 = C1007o.m5783d(motionEvent, a);
                        this.f35054m0 = C1007o.m5782c(motionEvent, a);
                    } else if (action == 6) {
                        int a2 = C1007o.m5777a(motionEvent);
                        if (C1007o.m5782c(motionEvent, a2) == this.f35054m0) {
                            if (a2 == 0) {
                                i = 1;
                            }
                            this.f35054m0 = C1007o.m5782c(motionEvent, i);
                        }
                        this.f35053l0 = C1007o.m5783d(motionEvent, C1007o.m5778a(motionEvent, this.f35054m0));
                    }
                }
            }
            if (!this.f35055n0) {
                int a3 = this.f35040a.getAdapter().mo8886a();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                float f4 = f2 - f3;
                float f5 = f2 + f3;
                float x = motionEvent.getX();
                if (x < f4) {
                    int i2 = this.f35030N;
                    if (i2 > 0) {
                        if (action != 3) {
                            this.f35040a.setCurrentItem(i2 - 1);
                        }
                        return true;
                    }
                } else if (x > f5) {
                    int i3 = this.f35030N;
                    if (i3 < a3 - 1) {
                        if (action != 3) {
                            this.f35040a.setCurrentItem(i3 + 1);
                        }
                        return true;
                    }
                } else {
                    C12104d dVar = this.f35056o0;
                    if (!(dVar == null || action == 3)) {
                        dVar.mo41520a(this.f35030N);
                    }
                }
            }
            this.f35055n0 = false;
            this.f35054m0 = -1;
            if (this.f35040a.isFakeDragging()) {
                this.f35040a.endFakeDrag();
            }
        } else {
            this.f35054m0 = C1007o.m5782c(motionEvent, 0);
            this.f35053l0 = motionEvent.getX();
        }
        return true;
    }

    public void setClipPadding(float f) {
        this.f35050i0 = f;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f35040a;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.f35030N = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFooterColor(int i) {
        this.f35039W.setColor(i);
        this.f35044c0.setColor(i);
        invalidate();
    }

    public void setFooterIndicatorHeight(float f) {
        this.f35045d0 = f;
        invalidate();
    }

    public void setFooterIndicatorPadding(float f) {
        this.f35047f0 = f;
        invalidate();
    }

    public void setFooterIndicatorStyle(C12102b bVar) {
        this.f35041a0 = bVar;
        invalidate();
    }

    public void setFooterLineHeight(float f) {
        this.f35051j0 = f;
        this.f35039W.setStrokeWidth(this.f35051j0);
        invalidate();
    }

    public void setLinePosition(C12103c cVar) {
        this.f35043b0 = cVar;
        invalidate();
    }

    public void setOnCenterItemClickListener(C12104d dVar) {
        this.f35056o0 = dVar;
    }

    public void setOnPageChangeListener(C2019j jVar) {
        this.f35042b = jVar;
    }

    public void setSelectedBold(boolean z) {
        this.f35034R = z;
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.f35036T = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.f35033Q.setColor(i);
        this.f35035S = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f35033Q.setTextSize(f);
        invalidate();
    }

    public void setTitlePadding(float f) {
        this.f35048g0 = f;
        invalidate();
    }

    public void setTopPadding(float f) {
        this.f35049h0 = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f35033Q.setTypeface(typeface);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f35040a;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() != null) {
                this.f35040a = viewPager;
                this.f35040a.setOnPageChangeListener(this);
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12096R.attr.vpiTitlePageIndicatorStyle);
    }

    /* renamed from: a */
    private void m54685a(Rect rect, float f, int i) {
        float f2 = (float) i;
        float f3 = this.f35050i0;
        rect.left = (int) (f2 + f3);
        rect.right = (int) (f3 + f);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35030N = -1;
        this.f35033Q = new Paint();
        this.f35037U = new Path();
        this.f35038V = new Rect();
        this.f35039W = new Paint();
        this.f35044c0 = new Paint();
        this.f35053l0 = -1.0f;
        this.f35054m0 = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C12096R.C12097color.default_title_indicator_footer_color);
            float dimension = resources.getDimension(C12096R.dimen.default_title_indicator_footer_line_height);
            int integer = resources.getInteger(C12096R.integer.default_title_indicator_footer_indicator_style);
            float dimension2 = resources.getDimension(C12096R.dimen.default_title_indicator_footer_indicator_height);
            float dimension3 = resources.getDimension(C12096R.dimen.default_title_indicator_footer_indicator_underline_padding);
            float dimension4 = resources.getDimension(C12096R.dimen.default_title_indicator_footer_padding);
            int integer2 = resources.getInteger(C12096R.integer.default_title_indicator_line_position);
            int color2 = resources.getColor(C12096R.C12097color.default_title_indicator_selected_color);
            boolean z = resources.getBoolean(C12096R.bool.default_title_indicator_selected_bold);
            int color3 = resources.getColor(C12096R.C12097color.default_title_indicator_text_color);
            float dimension5 = resources.getDimension(C12096R.dimen.default_title_indicator_text_size);
            float dimension6 = resources.getDimension(C12096R.dimen.default_title_indicator_title_padding);
            float dimension7 = resources.getDimension(C12096R.dimen.default_title_indicator_clip_padding);
            float dimension8 = resources.getDimension(C12096R.dimen.default_title_indicator_top_padding);
            int i2 = color;
            boolean z2 = z;
            int i3 = color3;
            float f = dimension5;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12096R.styleable.TitlePageIndicator, i, 0);
            this.f35051j0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_footerLineHeight, dimension);
            this.f35041a0 = C12102b.m54694a(obtainStyledAttributes.getInteger(C12096R.styleable.TitlePageIndicator_footerIndicatorStyle, integer));
            this.f35045d0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_footerIndicatorHeight, dimension2);
            this.f35046e0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
            this.f35047f0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_footerPadding, dimension4);
            this.f35043b0 = C12103c.m54695a(obtainStyledAttributes.getInteger(C12096R.styleable.TitlePageIndicator_linePosition, integer2));
            this.f35049h0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_topPadding, dimension8);
            this.f35048g0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_titlePadding, dimension6);
            this.f35050i0 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_clipPadding, dimension7);
            this.f35036T = obtainStyledAttributes.getColor(C12096R.styleable.TitlePageIndicator_selectedColor, color2);
            this.f35035S = obtainStyledAttributes.getColor(C12096R.styleable.TitlePageIndicator_android_textColor, i3);
            this.f35034R = obtainStyledAttributes.getBoolean(C12096R.styleable.TitlePageIndicator_selectedBold, z2);
            float dimension9 = obtainStyledAttributes.getDimension(C12096R.styleable.TitlePageIndicator_android_textSize, f);
            int color4 = obtainStyledAttributes.getColor(C12096R.styleable.TitlePageIndicator_footerColor, i2);
            this.f35033Q.setTextSize(dimension9);
            this.f35033Q.setAntiAlias(true);
            this.f35039W.setStyle(Style.FILL_AND_STROKE);
            this.f35039W.setStrokeWidth(this.f35051j0);
            this.f35039W.setColor(color4);
            this.f35044c0.setStyle(Style.FILL_AND_STROKE);
            this.f35044c0.setColor(color4);
            Drawable drawable = obtainStyledAttributes.getDrawable(C12096R.styleable.TitlePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.f35052k0 = C0983f0.m5632b(ViewConfiguration.get(context));
        }
    }

    /* renamed from: b */
    public void mo41436b() {
        invalidate();
    }

    /* renamed from: a */
    private ArrayList<Rect> m54684a(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList<>();
        int a = this.f35040a.getAdapter().mo8886a();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < a; i2++) {
            Rect a2 = m54683a(i2, paint);
            int i3 = a2.right - a2.left;
            int i4 = a2.bottom - a2.top;
            a2.left = (int) ((((float) i) - (((float) i3) / 2.0f)) + ((((float) (i2 - this.f35030N)) - this.f35031O) * ((float) width)));
            a2.right = a2.left + i3;
            a2.top = 0;
            a2.bottom = i4;
            arrayList.add(a2);
        }
        return arrayList;
    }

    /* renamed from: b */
    private CharSequence m54686b(int i) {
        CharSequence a = this.f35040a.getAdapter().mo8888a(i);
        return a == null ? "" : a;
    }

    /* renamed from: a */
    private Rect m54683a(int i, Paint paint) {
        Rect rect = new Rect();
        CharSequence b = m54686b(i);
        rect.right = (int) paint.measureText(b, 0, b.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    /* renamed from: a */
    public void mo41434a(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        this.f35032P = i;
        C2019j jVar = this.f35042b;
        if (jVar != null) {
            jVar.mo8878a(i);
        }
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        this.f35030N = i;
        this.f35031O = f;
        invalidate();
        C2019j jVar = this.f35042b;
        if (jVar != null) {
            jVar.mo8879a(i, f, i2);
        }
    }
}
