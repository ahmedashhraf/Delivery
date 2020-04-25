package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils.TruncateAt;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0215r;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.C1120m;
import androidx.viewpager.widget.ViewPager.C2014e;
import androidx.viewpager.widget.ViewPager.C2018i;
import androidx.viewpager.widget.ViewPager.C2019j;
import java.lang.ref.WeakReference;
import java.util.Locale;

@C2014e
/* renamed from: androidx.viewpager.widget.c */
/* compiled from: PagerTitleStrip */
public class C2028c extends ViewGroup {

    /* renamed from: c0 */
    private static final int[] f7798c0 = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: d0 */
    private static final int[] f7799d0 = {16843660};

    /* renamed from: e0 */
    private static final float f7800e0 = 0.6f;

    /* renamed from: f0 */
    private static final int f7801f0 = 16;

    /* renamed from: N */
    TextView f7802N;

    /* renamed from: O */
    TextView f7803O;

    /* renamed from: P */
    private int f7804P;

    /* renamed from: Q */
    float f7805Q;

    /* renamed from: R */
    private int f7806R;

    /* renamed from: S */
    private int f7807S;

    /* renamed from: T */
    private boolean f7808T;

    /* renamed from: U */
    private boolean f7809U;

    /* renamed from: V */
    private final C2029a f7810V;

    /* renamed from: W */
    private WeakReference<C2024a> f7811W;

    /* renamed from: a */
    ViewPager f7812a;

    /* renamed from: a0 */
    private int f7813a0;

    /* renamed from: b */
    TextView f7814b;

    /* renamed from: b0 */
    int f7815b0;

    /* renamed from: androidx.viewpager.widget.c$a */
    /* compiled from: PagerTitleStrip */
    private class C2029a extends DataSetObserver implements C2019j, C2018i {

        /* renamed from: a */
        private int f7816a;

        C2029a() {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            C2028c.this.mo8899a(i, f, false);
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            if (this.f7816a == 0) {
                C2028c cVar = C2028c.this;
                cVar.mo8916a(cVar.f7812a.getCurrentItem(), C2028c.this.f7812a.getAdapter());
                float f = C2028c.this.f7805Q;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                C2028c cVar2 = C2028c.this;
                cVar2.mo8899a(cVar2.f7812a.getCurrentItem(), f, true);
            }
        }

        public void onChanged() {
            C2028c cVar = C2028c.this;
            cVar.mo8916a(cVar.f7812a.getCurrentItem(), C2028c.this.f7812a.getAdapter());
            float f = C2028c.this.f7805Q;
            if (f < 0.0f) {
                f = 0.0f;
            }
            C2028c cVar2 = C2028c.this;
            cVar2.mo8899a(cVar2.f7812a.getCurrentItem(), f, true);
        }

        /* renamed from: a */
        public void mo8878a(int i) {
            this.f7816a = i;
        }

        /* renamed from: a */
        public void mo8877a(ViewPager viewPager, C2024a aVar, C2024a aVar2) {
            C2028c.this.mo8917a(aVar, aVar2);
        }
    }

    /* renamed from: androidx.viewpager.widget.c$b */
    /* compiled from: PagerTitleStrip */
    private static class C2030b extends SingleLineTransformationMethod {

        /* renamed from: a */
        private Locale f7818a;

        C2030b(Context context) {
            this.f7818a = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f7818a);
            }
            return null;
        }
    }

    public C2028c(@C0193h0 Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new C2030b(textView.getContext()));
    }

    /* renamed from: a */
    public void mo8915a(int i, float f) {
        this.f7814b.setTextSize(i, f);
        this.f7802N.setTextSize(i, f);
        this.f7803O.setTextSize(i, f);
    }

    /* access modifiers changed from: 0000 */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f7806R;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            C2024a adapter = viewPager.getAdapter();
            viewPager.setInternalPageChangeListener(this.f7810V);
            viewPager.addOnAdapterChangeListener(this.f7810V);
            this.f7812a = viewPager;
            WeakReference<C2024a> weakReference = this.f7811W;
            mo8917a(weakReference != null ? (C2024a) weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f7812a;
        if (viewPager != null) {
            mo8917a(viewPager.getAdapter(), (C2024a) null);
            this.f7812a.setInternalPageChangeListener(null);
            this.f7812a.removeOnAdapterChangeListener(this.f7810V);
            this.f7812a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f7812a != null) {
            float f = this.f7805Q;
            if (f < 0.0f) {
                f = 0.0f;
            }
            mo8899a(this.f7804P, f, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (MeasureSpec.getMode(i) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
            int size = MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.f7814b.measure(childMeasureSpec2, childMeasureSpec);
            this.f7802N.measure(childMeasureSpec2, childMeasureSpec);
            this.f7803O.measure(childMeasureSpec2, childMeasureSpec);
            if (MeasureSpec.getMode(i2) == 1073741824) {
                i3 = MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.f7802N.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.f7802N.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.f7808T) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f7807S = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        this.f7813a0 = ((int) (f * 255.0f)) & 255;
        int i = (this.f7813a0 << 24) | (this.f7815b0 & C0962e0.f4342s);
        this.f7814b.setTextColor(i);
        this.f7803O.setTextColor(i);
    }

    public void setTextColor(@C0198k int i) {
        this.f7815b0 = i;
        this.f7802N.setTextColor(i);
        int i2 = (this.f7813a0 << 24) | (this.f7815b0 & C0962e0.f4342s);
        this.f7814b.setTextColor(i2);
        this.f7803O.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f7806R = i;
        requestLayout();
    }

    public C2028c(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7804P = -1;
        this.f7805Q = -1.0f;
        this.f7810V = new C2029a();
        TextView textView = new TextView(context);
        this.f7814b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f7802N = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f7803O = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7798c0);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C1120m.m6391e(this.f7814b, resourceId);
            C1120m.m6391e(this.f7802N, resourceId);
            C1120m.m6391e(this.f7803O, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo8915a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f7814b.setTextColor(color);
            this.f7802N.setTextColor(color);
            this.f7803O.setTextColor(color);
        }
        this.f7807S = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f7815b0 = this.f7802N.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(f7800e0);
        this.f7814b.setEllipsize(TruncateAt.END);
        this.f7802N.setEllipsize(TruncateAt.END);
        this.f7803O.setEllipsize(TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f7799d0);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f7814b);
            setSingleLineAllCaps(this.f7802N);
            setSingleLineAllCaps(this.f7803O);
        } else {
            this.f7814b.setSingleLine();
            this.f7802N.setSingleLine();
            this.f7803O.setSingleLine();
        }
        this.f7806R = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8916a(int i, C2024a aVar) {
        int a = aVar != null ? aVar.mo8886a() : 0;
        this.f7808T = true;
        CharSequence charSequence = null;
        this.f7814b.setText((i < 1 || aVar == null) ? null : aVar.mo8888a(i - 1));
        this.f7802N.setText((aVar == null || i >= a) ? null : aVar.mo8888a(i));
        int i2 = i + 1;
        if (i2 < a && aVar != null) {
            charSequence = aVar.mo8888a(i2);
        }
        this.f7803O.setText(charSequence);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f7814b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f7802N.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f7803O.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f7804P = i;
        if (!this.f7809U) {
            mo8899a(i, this.f7805Q, false);
        }
        this.f7808T = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8917a(C2024a aVar, C2024a aVar2) {
        if (aVar != null) {
            aVar.mo8898c(this.f7810V);
            this.f7811W = null;
        }
        if (aVar2 != null) {
            aVar2.mo8890a((DataSetObserver) this.f7810V);
            this.f7811W = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.f7812a;
        if (viewPager != null) {
            this.f7804P = -1;
            this.f7805Q = -1.0f;
            mo8916a(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8899a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        float f2 = f;
        if (i6 != this.f7804P) {
            mo8916a(i6, this.f7812a.getAdapter());
        } else if (!z && f2 == this.f7805Q) {
            return;
        }
        this.f7809U = true;
        int measuredWidth = this.f7814b.getMeasuredWidth();
        int measuredWidth2 = this.f7802N.getMeasuredWidth();
        int measuredWidth3 = this.f7803O.getMeasuredWidth();
        int i7 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i8 = paddingRight + i7;
        int i9 = (width - (paddingLeft + i7)) - i8;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i10 = ((width - i8) - ((int) (((float) i9) * f3))) - i7;
        int i11 = measuredWidth2 + i10;
        int baseline = this.f7814b.getBaseline();
        int baseline2 = this.f7802N.getBaseline();
        int baseline3 = this.f7803O.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i12 = max - baseline;
        int i13 = max - baseline2;
        int i14 = max - baseline3;
        int i15 = measuredWidth3;
        int measuredHeight = this.f7803O.getMeasuredHeight() + i14;
        int max2 = Math.max(Math.max(this.f7814b.getMeasuredHeight() + i12, this.f7802N.getMeasuredHeight() + i13), measuredHeight);
        int i16 = this.f7807S & 112;
        if (i16 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i16 != 80) {
            i4 = i12 + paddingTop;
            i2 = i13 + paddingTop;
            i3 = paddingTop + i14;
            TextView textView = this.f7802N;
            textView.layout(i10, i2, i11, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i10 - this.f7806R) - measuredWidth);
            TextView textView2 = this.f7814b;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - i15, i11 + this.f7806R);
            TextView textView3 = this.f7803O;
            textView3.layout(max3, i3, max3 + i15, textView3.getMeasuredHeight() + i3);
            this.f7805Q = f;
            this.f7809U = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i12 + i5;
        i2 = i13 + i5;
        i3 = i5 + i14;
        TextView textView4 = this.f7802N;
        textView4.layout(i10, i2, i11, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i10 - this.f7806R) - measuredWidth);
        TextView textView22 = this.f7814b;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - i15, i11 + this.f7806R);
        TextView textView32 = this.f7803O;
        textView32.layout(max32, i3, max32 + i15, textView32.getMeasuredHeight() + i3);
        this.f7805Q = f;
        this.f7809U = false;
    }
}
