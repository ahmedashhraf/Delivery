package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.annotation.C0213q;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.customview.p039a.C1138c;
import androidx.customview.p039a.C1138c.C1141c;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p076c.p112d.p148d.p150g.C6637f;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: l0 */
    private static final String f6934l0 = "SlidingPaneLayout";

    /* renamed from: m0 */
    private static final int f6935m0 = 32;

    /* renamed from: n0 */
    private static final int f6936n0 = -858993460;

    /* renamed from: o0 */
    private static final int f6937o0 = 400;

    /* renamed from: N */
    private Drawable f6938N;

    /* renamed from: O */
    private Drawable f6939O;

    /* renamed from: P */
    private final int f6940P;

    /* renamed from: Q */
    private boolean f6941Q;

    /* renamed from: R */
    View f6942R;

    /* renamed from: S */
    float f6943S;

    /* renamed from: T */
    private float f6944T;

    /* renamed from: U */
    int f6945U;

    /* renamed from: V */
    boolean f6946V;

    /* renamed from: W */
    private int f6947W;

    /* renamed from: a */
    private int f6948a;

    /* renamed from: a0 */
    private float f6949a0;

    /* renamed from: b */
    private int f6950b;

    /* renamed from: b0 */
    private float f6951b0;

    /* renamed from: c0 */
    private C1799e f6952c0;

    /* renamed from: d0 */
    final C1138c f6953d0;

    /* renamed from: e0 */
    boolean f6954e0;

    /* renamed from: f0 */
    private boolean f6955f0;

    /* renamed from: g0 */
    private final Rect f6956g0;

    /* renamed from: h0 */
    final ArrayList<C1796b> f6957h0;

    /* renamed from: i0 */
    private Method f6958i0;

    /* renamed from: j0 */
    private Field f6959j0;

    /* renamed from: k0 */
    private boolean f6960k0;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C1794a();

        /* renamed from: a */
        boolean f6961a;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        static class C1794a implements ClassLoaderCreator<SavedState> {
            C1794a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6961a ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6961a = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    class C1795a extends C0947a {

        /* renamed from: d */
        private final Rect f6962d = new Rect();

        C1795a() {
        }

        /* renamed from: a */
        public void mo4749a(View view, C1016d dVar) {
            C1016d a = C1016d.m5807a(dVar);
            super.mo4749a(view, a);
            m9682a(dVar, a);
            a.mo4971d0();
            dVar.mo4937a((CharSequence) SlidingPaneLayout.class.getName());
            dVar.mo4982f(view);
            ViewParent J = C0962e0.m5406J(view);
            if (J instanceof View) {
                dVar.mo4973e((View) J);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo8097c(childAt) && childAt.getVisibility() == 0) {
                    C0962e0.m5531l(childAt, 1);
                    dVar.mo4933a(childAt);
                }
            }
        }

        /* renamed from: b */
        public void mo4753b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4753b(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: c */
        public boolean mo8097c(View view) {
            return SlidingPaneLayout.this.mo8062e(view);
        }

        /* renamed from: a */
        public boolean mo4752a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo8097c(view)) {
                return super.mo4752a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: a */
        private void m9682a(C1016d dVar, C1016d dVar2) {
            Rect rect = this.f6962d;
            dVar2.mo4932a(rect);
            dVar.mo4957c(rect);
            dVar2.mo4947b(rect);
            dVar.mo4966d(rect);
            dVar.mo5033w(dVar2.mo4963c0());
            dVar.mo4975e(dVar2.mo5025t());
            dVar.mo4937a(dVar2.mo4972e());
            dVar.mo4948b(dVar2.mo4993h());
            dVar.mo5006j(dVar2.mo4918P());
            dVar.mo4976e(dVar2.mo4913K());
            dVar.mo5008k(dVar2.mo4919Q());
            dVar.mo5010l(dVar2.mo4920R());
            dVar.mo4940a(dVar2.mo4910H());
            dVar.mo5026t(dVar2.mo4928Z());
            dVar.mo5016o(dVar2.mo4923U());
            dVar.mo4930a(dVar2.mo4955c());
            dVar.mo5005j(dVar2.mo5023s());
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    private class C1796b implements Runnable {

        /* renamed from: a */
        final View f6964a;

        C1796b(View view) {
            this.f6964a = view;
        }

        public void run() {
            if (this.f6964a.getParent() == SlidingPaneLayout.this) {
                this.f6964a.setLayerType(0, null);
                SlidingPaneLayout.this.mo8057d(this.f6964a);
            }
            SlidingPaneLayout.this.f6957h0.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    private class C1797c extends C1141c {
        C1797c() {
        }

        /* renamed from: a */
        public void mo5453a(View view, int i) {
            SlidingPaneLayout.this.mo8065g();
        }

        /* renamed from: b */
        public boolean mo5459b(View view, int i) {
            if (SlidingPaneLayout.this.f6946V) {
                return false;
            }
            return ((C1798d) view.getLayoutParams()).f6969b;
        }

        /* renamed from: c */
        public void mo5460c(int i) {
            if (SlidingPaneLayout.this.f6953d0.mo5445h() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f6943S == 0.0f) {
                    slidingPaneLayout.mo8063f(slidingPaneLayout.f6942R);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.mo8047a(slidingPaneLayout2.f6942R);
                    SlidingPaneLayout.this.f6954e0 = false;
                    return;
                }
                slidingPaneLayout.mo8051b(slidingPaneLayout.f6942R);
                SlidingPaneLayout.this.f6954e0 = true;
            }
        }

        /* renamed from: a */
        public void mo5454a(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo8046a(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: b */
        public int mo5456b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo5452a(View view, float f, float f2) {
            int i;
            C1798d dVar = (C1798d) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo8054c()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + dVar.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f6943S > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f6945U;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f6942R.getWidth();
            } else {
                i = dVar.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && SlidingPaneLayout.this.f6943S > 0.5f)) {
                    i += SlidingPaneLayout.this.f6945U;
                }
            }
            SlidingPaneLayout.this.f6953d0.mo5442e(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: a */
        public int mo5449a(View view) {
            return SlidingPaneLayout.this.f6945U;
        }

        /* renamed from: a */
        public int mo5450a(View view, int i, int i2) {
            C1798d dVar = (C1798d) SlidingPaneLayout.this.f6942R.getLayoutParams();
            if (SlidingPaneLayout.this.mo8054c()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + dVar.rightMargin) + SlidingPaneLayout.this.f6942R.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f6945U);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + dVar.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f6945U + paddingLeft);
        }

        /* renamed from: a */
        public void mo5451a(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f6953d0.mo5422a(slidingPaneLayout.f6942R, i2);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public static class C1798d extends MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f6967e = {16843137};

        /* renamed from: a */
        public float f6968a = 0.0f;

        /* renamed from: b */
        boolean f6969b;

        /* renamed from: c */
        boolean f6970c;

        /* renamed from: d */
        Paint f6971d;

        public C1798d() {
            super(-1, -1);
        }

        public C1798d(int i, int i2) {
            super(i, i2);
        }

        public C1798d(@C0193h0 LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1798d(@C0193h0 MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1798d(@C0193h0 C1798d dVar) {
            super(dVar);
            this.f6968a = dVar.f6968a;
        }

        public C1798d(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6967e);
            this.f6968a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e */
    public interface C1799e {
        /* renamed from: a */
        void mo8099a(@C0193h0 View view);

        /* renamed from: a */
        void mo8100a(@C0193h0 View view, float f);

        /* renamed from: b */
        void mo8101b(@C0193h0 View view);
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$f */
    public static class C1800f implements C1799e {
        /* renamed from: a */
        public void mo8099a(View view) {
        }

        /* renamed from: a */
        public void mo8100a(View view, float f) {
        }

        /* renamed from: b */
        public void mo8101b(View view) {
        }
    }

    public SlidingPaneLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8047a(View view) {
        C1799e eVar = this.f6952c0;
        if (eVar != null) {
            eVar.mo8101b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8051b(View view) {
        C1799e eVar = this.f6952c0;
        if (eVar != null) {
            eVar.mo8099a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8053c(View view) {
        C1799e eVar = this.f6952c0;
        if (eVar != null) {
            eVar.mo8100a(view, this.f6943S);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C1798d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (this.f6953d0.mo5427a(true)) {
            if (!this.f6941Q) {
                this.f6953d0.mo5418a();
                return;
            }
            C0962e0.m5561u0(this);
        }
    }

    /* renamed from: d */
    public boolean mo8058d() {
        return !this.f6941Q || this.f6943S == 1.0f;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int i2;
        super.draw(canvas);
        if (mo8054c()) {
            drawable = this.f6939O;
        } else {
            drawable = this.f6938N;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo8054c()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C1798d dVar = (C1798d) view.getLayoutParams();
        int save = canvas.save();
        if (this.f6941Q && !dVar.f6969b && this.f6942R != null) {
            canvas.getClipBounds(this.f6956g0);
            if (mo8054c()) {
                Rect rect = this.f6956g0;
                rect.left = Math.max(rect.left, this.f6942R.getRight());
            } else {
                Rect rect2 = this.f6956g0;
                rect2.right = Math.min(rect2.right, this.f6942R.getLeft());
            }
            canvas.clipRect(this.f6956g0);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public boolean mo8061e() {
        return this.f6941Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8063f(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        View view2 = view;
        boolean c = mo8054c();
        int width = c ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = c ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m9663g(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount) {
                View childAt = getChildAt(i5);
                if (childAt != view2) {
                    if (childAt.getVisibility() == 8) {
                        z = c;
                    } else {
                        z = c;
                        childAt.setVisibility((Math.max(c ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(c ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                    }
                    i5++;
                    view2 = view;
                    c = z;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo8065g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C1798d();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C1798d((MarginLayoutParams) layoutParams) : new C1798d(layoutParams);
    }

    @C0198k
    public int getCoveredFadeColor() {
        return this.f6950b;
    }

    @C0199k0
    public int getParallaxDistance() {
        return this.f6947W;
    }

    @C0198k
    public int getSliderFadeColor() {
        return this.f6948a;
    }

    @Deprecated
    /* renamed from: h */
    public void mo8072h() {
        mo8052b();
    }

    @Deprecated
    /* renamed from: i */
    public void mo8073i() {
        mo8064f();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6955f0 = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6955f0 = true;
        int size = this.f6957h0.size();
        for (int i = 0; i < size; i++) {
            ((C1796b) this.f6957h0.get(i)).run();
        }
        this.f6957h0.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (!this.f6941Q && actionMasked == 0 && getChildCount() > 1) {
            View childAt = getChildAt(1);
            if (childAt != null) {
                this.f6954e0 = !this.f6953d0.mo5425a(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        }
        if (!this.f6941Q || (this.f6946V && actionMasked != 0)) {
            this.f6953d0.mo5429b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f6953d0.mo5429b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f6946V = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f6949a0 = x;
                this.f6951b0 = y;
                if (this.f6953d0.mo5425a(this.f6942R, (int) x, (int) y) && mo8062e(this.f6942R)) {
                    z = true;
                    if (!this.f6953d0.mo5431b(motionEvent) && !z) {
                        z2 = false;
                    }
                    return z2;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f6949a0);
                float abs2 = Math.abs(y2 - this.f6951b0);
                if (abs > ((float) this.f6953d0.mo5444g()) && abs2 > abs) {
                    this.f6953d0.mo5429b();
                    this.f6946V = true;
                    return false;
                }
            }
            z = false;
            z2 = false;
            return z2;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean c = mo8054c();
        if (c) {
            this.f6953d0.mo5441e(2);
        } else {
            this.f6953d0.mo5441e(1);
        }
        int i9 = i3 - i;
        int paddingRight = c ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = c ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f6955f0) {
            this.f6943S = (!this.f6941Q || !this.f6954e0) ? 0.0f : 1.0f;
        }
        int i10 = paddingRight;
        int i11 = i10;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C1798d dVar = (C1798d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f6969b) {
                    int i13 = i9 - paddingLeft;
                    int min = (Math.min(i10, i13 - this.f6940P) - i11) - (dVar.leftMargin + dVar.rightMargin);
                    this.f6945U = min;
                    int i14 = c ? dVar.rightMargin : dVar.leftMargin;
                    dVar.f6970c = ((i11 + i14) + min) + (measuredWidth / 2) > i13;
                    int i15 = (int) (((float) min) * this.f6943S);
                    i6 = i14 + i15 + i11;
                    this.f6943S = ((float) i15) / ((float) this.f6945U);
                    i5 = 0;
                } else {
                    if (this.f6941Q) {
                        int i16 = this.f6947W;
                        if (i16 != 0) {
                            i5 = (int) ((1.0f - this.f6943S) * ((float) i16));
                            i6 = i10;
                        }
                    }
                    i6 = i10;
                    i5 = 0;
                }
                if (c) {
                    i7 = (i9 - i6) + i5;
                    i8 = i7 - measuredWidth;
                } else {
                    i8 = i6 - i5;
                    i7 = i8 + measuredWidth;
                }
                childAt.layout(i8, paddingTop, i7, childAt.getMeasuredHeight() + paddingTop);
                i10 += childAt.getWidth();
                i11 = i6;
            }
        }
        if (this.f6955f0) {
            if (this.f6941Q) {
                if (this.f6947W != 0) {
                    m9659a(this.f6943S);
                }
                if (((C1798d) this.f6942R.getLayoutParams()).f6970c) {
                    m9660a(this.f6942R, this.f6943S, this.f6948a);
                }
            } else {
                for (int i17 = 0; i17 < childCount; i17++) {
                    m9660a(getChildAt(i17), 0.0f, this.f6948a);
                }
            }
            mo8063f(this.f6942R);
        }
        this.f6955f0 = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            } else if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            } else if (mode2 == 0) {
                mode2 = Integer.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z = false;
        if (mode2 == Integer.MIN_VALUE) {
            i3 = (size2 - getPaddingTop()) - getPaddingBottom();
            i4 = 0;
        } else if (mode2 != 1073741824) {
            i4 = 0;
            i3 = 0;
        } else {
            i4 = (size2 - getPaddingTop()) - getPaddingBottom();
            i3 = i4;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f6942R = null;
        int i13 = i4;
        int i14 = paddingLeft;
        int i15 = 0;
        boolean z2 = false;
        float f = 0.0f;
        while (true) {
            i5 = 8;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            C1798d dVar = (C1798d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                dVar.f6970c = z;
            } else {
                float f2 = dVar.f6968a;
                if (f2 > 0.0f) {
                    f += f2;
                    if (dVar.width == 0) {
                    }
                }
                int i16 = dVar.leftMargin + dVar.rightMargin;
                if (dVar.width == -2) {
                    i11 = MeasureSpec.makeMeasureSpec(paddingLeft - i16, Integer.MIN_VALUE);
                } else if (dVar.width == -1) {
                    i11 = MeasureSpec.makeMeasureSpec(paddingLeft - i16, C6637f.f18605b);
                } else {
                    i11 = MeasureSpec.makeMeasureSpec(dVar.width, C6637f.f18605b);
                }
                if (dVar.height == -2) {
                    i12 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                } else if (dVar.height == -1) {
                    i12 = MeasureSpec.makeMeasureSpec(i3, C6637f.f18605b);
                } else {
                    i12 = MeasureSpec.makeMeasureSpec(dVar.height, C6637f.f18605b);
                }
                childAt.measure(i11, i12);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == Integer.MIN_VALUE && measuredHeight > i13) {
                    i13 = Math.min(measuredHeight, i3);
                }
                i14 -= measuredWidth;
                boolean z3 = i14 < 0;
                dVar.f6969b = z3;
                boolean z4 = z3 | z2;
                if (dVar.f6969b) {
                    this.f6942R = childAt;
                }
                z2 = z4;
            }
            i15++;
            z = false;
        }
        if (z2 || f > 0.0f) {
            int i17 = paddingLeft - this.f6940P;
            int i18 = 0;
            while (i18 < childCount) {
                View childAt2 = getChildAt(i18);
                if (childAt2.getVisibility() != i5) {
                    C1798d dVar2 = (C1798d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i5) {
                        boolean z5 = dVar2.width == 0 && dVar2.f6968a > 0.0f;
                        if (z5) {
                            i7 = 0;
                        } else {
                            i7 = childAt2.getMeasuredWidth();
                        }
                        if (!z2 || childAt2 == this.f6942R) {
                            if (dVar2.f6968a > 0.0f) {
                                if (dVar2.width != 0) {
                                    i8 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), C6637f.f18605b);
                                } else if (dVar2.height == -2) {
                                    i8 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                } else if (dVar2.height == -1) {
                                    i8 = MeasureSpec.makeMeasureSpec(i3, C6637f.f18605b);
                                } else {
                                    i8 = MeasureSpec.makeMeasureSpec(dVar2.height, C6637f.f18605b);
                                }
                                if (z2) {
                                    int i19 = paddingLeft - (dVar2.leftMargin + dVar2.rightMargin);
                                    i6 = i17;
                                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i19, C6637f.f18605b);
                                    if (i7 != i19) {
                                        childAt2.measure(makeMeasureSpec, i8);
                                    }
                                    i18++;
                                    i17 = i6;
                                    i5 = 8;
                                } else {
                                    i6 = i17;
                                    childAt2.measure(MeasureSpec.makeMeasureSpec(i7 + ((int) ((dVar2.f6968a * ((float) Math.max(0, i14))) / f)), C6637f.f18605b), i8);
                                    i18++;
                                    i17 = i6;
                                    i5 = 8;
                                }
                            }
                        } else if (dVar2.width < 0 && (i7 > i17 || dVar2.f6968a > 0.0f)) {
                            if (!z5) {
                                i9 = C6637f.f18605b;
                                i10 = MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), C6637f.f18605b);
                            } else if (dVar2.height == -2) {
                                i10 = MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                                i9 = C6637f.f18605b;
                            } else if (dVar2.height == -1) {
                                i9 = C6637f.f18605b;
                                i10 = MeasureSpec.makeMeasureSpec(i3, C6637f.f18605b);
                            } else {
                                i9 = C6637f.f18605b;
                                i10 = MeasureSpec.makeMeasureSpec(dVar2.height, C6637f.f18605b);
                            }
                            childAt2.measure(MeasureSpec.makeMeasureSpec(i17, i9), i10);
                        }
                    }
                }
                i6 = i17;
                i18++;
                i17 = i6;
                i5 = 8;
            }
        }
        setMeasuredDimension(size, i13 + getPaddingTop() + getPaddingBottom());
        this.f6941Q = z2;
        if (this.f6953d0.mo5445h() != 0 && !z2) {
            this.f6953d0.mo5418a();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f6961a) {
            mo8064f();
        } else {
            mo8052b();
        }
        this.f6954e0 = savedState.f6961a;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6961a = mo8061e() ? mo8058d() : this.f6954e0;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f6955f0 = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6941Q) {
            return super.onTouchEvent(motionEvent);
        }
        this.f6953d0.mo5421a(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f6949a0 = x;
            this.f6951b0 = y;
        } else if (actionMasked == 1 && mo8062e(this.f6942R)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f6949a0;
            float f2 = y2 - this.f6951b0;
            int g = this.f6953d0.mo5444g();
            if ((f * f) + (f2 * f2) < ((float) (g * g)) && this.f6953d0.mo5425a(this.f6942R, (int) x2, (int) y2)) {
                m9661a(this.f6942R, 0);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f6941Q) {
            this.f6954e0 = view == this.f6942R;
        }
    }

    public void setCoveredFadeColor(@C0198k int i) {
        this.f6950b = i;
    }

    public void setPanelSlideListener(@C0195i0 C1799e eVar) {
        this.f6952c0 = eVar;
    }

    public void setParallaxDistance(@C0199k0 int i) {
        this.f6947W = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@C0195i0 Drawable drawable) {
        this.f6938N = drawable;
    }

    public void setShadowDrawableRight(@C0195i0 Drawable drawable) {
        this.f6939O = drawable;
    }

    @Deprecated
    public void setShadowResource(@C0213q int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0841b.m4928c(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0841b.m4928c(getContext(), i));
    }

    public void setSliderFadeColor(@C0198k int i) {
        this.f6948a = i;
    }

    public SlidingPaneLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8057d(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 17) {
            C0962e0.m5437a(view, ((C1798d) view.getLayoutParams()).f6971d);
            return;
        }
        if (i >= 16) {
            if (!this.f6960k0) {
                try {
                    this.f6958i0 = View.class.getDeclaredMethod("getDisplayList", null);
                } catch (NoSuchMethodException unused) {
                }
                try {
                    this.f6959j0 = View.class.getDeclaredField("mRecreateDisplayList");
                    this.f6959j0.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                this.f6960k0 = true;
            }
            if (this.f6958i0 != null) {
                Field field = this.f6959j0;
                if (field != null) {
                    try {
                        field.setBoolean(view, true);
                        this.f6958i0.invoke(view, null);
                    } catch (Exception unused3) {
                    }
                }
            }
            view.invalidate();
            return;
        }
        C0962e0.m5433a((View) this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo8062e(View view) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        C1798d dVar = (C1798d) view.getLayoutParams();
        if (this.f6941Q && dVar.f6970c && this.f6943S > 0.0f) {
            z = true;
        }
        return z;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1798d(getContext(), attributeSet);
    }

    public SlidingPaneLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6948a = f6936n0;
        this.f6955f0 = true;
        this.f6956g0 = new Rect();
        this.f6957h0 = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f6940P = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        C0962e0.m5443a((View) this, (C0947a) new C1795a());
        C0962e0.m5531l((View) this, 1);
        this.f6953d0 = C1138c.m6479a((ViewGroup) this, 0.5f, (C1141c) new C1797c());
        this.f6953d0.mo5419a(f * 400.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo8054c() {
        return C0962e0.m5566x(this) == 1;
    }

    /* renamed from: a */
    private boolean m9661a(View view, int i) {
        if (!this.f6955f0 && !mo8049a(0.0f, i)) {
            return false;
        }
        this.f6954e0 = false;
        return true;
    }

    /* renamed from: b */
    private boolean m9662b(View view, int i) {
        if (!this.f6955f0 && !mo8049a(1.0f, i)) {
            return false;
        }
        this.f6954e0 = true;
        return true;
    }

    /* renamed from: g */
    private static boolean m9663g(View view) {
        boolean z = true;
        if (view.isOpaque()) {
            return true;
        }
        if (VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background == null) {
            return false;
        }
        if (background.getOpacity() != -1) {
            z = false;
        }
        return z;
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo8048a() {
        return this.f6941Q;
    }

    /* renamed from: b */
    public boolean mo8052b() {
        return m9661a(this.f6942R, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8046a(int i) {
        if (this.f6942R == null) {
            this.f6943S = 0.0f;
            return;
        }
        boolean c = mo8054c();
        C1798d dVar = (C1798d) this.f6942R.getLayoutParams();
        int width = this.f6942R.getWidth();
        if (c) {
            i = (getWidth() - i) - width;
        }
        this.f6943S = ((float) (i - ((c ? getPaddingRight() : getPaddingLeft()) + (c ? dVar.rightMargin : dVar.leftMargin)))) / ((float) this.f6945U);
        if (this.f6947W != 0) {
            m9659a(this.f6943S);
        }
        if (dVar.f6970c) {
            m9660a(this.f6942R, this.f6943S, this.f6948a);
        }
        mo8053c(this.f6942R);
    }

    /* renamed from: a */
    private void m9660a(View view, float f, int i) {
        C1798d dVar = (C1798d) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & C0962e0.f4342s);
            if (dVar.f6971d == null) {
                dVar.f6971d = new Paint();
            }
            dVar.f6971d.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, dVar.f6971d);
            }
            mo8057d(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = dVar.f6971d;
            if (paint != null) {
                paint.setColorFilter(null);
            }
            C1796b bVar = new C1796b(view);
            this.f6957h0.add(bVar);
            C0962e0.m5451a((View) this, (Runnable) bVar);
        }
    }

    /* renamed from: f */
    public boolean mo8064f() {
        return m9662b(this.f6942R, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo8049a(float f, int i) {
        int i2;
        if (!this.f6941Q) {
            return false;
        }
        C1798d dVar = (C1798d) this.f6942R.getLayoutParams();
        if (mo8054c()) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + dVar.rightMargin)) + (f * ((float) this.f6945U))) + ((float) this.f6942R.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + dVar.leftMargin)) + (f * ((float) this.f6945U)));
        }
        C1138c cVar = this.f6953d0;
        View view = this.f6942R;
        if (!cVar.mo5433b(view, i2, view.getTop())) {
            return false;
        }
        mo8065g();
        C0962e0.m5561u0(this);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9659a(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo8054c()
            android.view.View r1 = r9.f6942R
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$d r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.C1798d) r1
            boolean r2 = r1.f6970c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f6942R
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f6944T
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f6947W
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f6944T = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f6944T
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f6950b
            r9.m9660a(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.m9659a(float):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r13.canScrollHorizontally(mo8054c() ? r15 : -r15) != false) goto L_0x0066;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8050a(android.view.View r13, boolean r14, int r15, int r16, int r17) {
        /*
            r12 = this;
            r0 = r13
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 1
            if (r1 == 0) goto L_0x0052
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r3 = r13.getScrollX()
            int r4 = r13.getScrollY()
            int r5 = r1.getChildCount()
            int r5 = r5 - r2
        L_0x0016:
            if (r5 < 0) goto L_0x0052
            android.view.View r7 = r1.getChildAt(r5)
            int r6 = r16 + r3
            int r8 = r7.getLeft()
            if (r6 < r8) goto L_0x004f
            int r8 = r7.getRight()
            if (r6 >= r8) goto L_0x004f
            int r8 = r17 + r4
            int r9 = r7.getTop()
            if (r8 < r9) goto L_0x004f
            int r9 = r7.getBottom()
            if (r8 >= r9) goto L_0x004f
            r9 = 1
            int r10 = r7.getLeft()
            int r10 = r6 - r10
            int r6 = r7.getTop()
            int r11 = r8 - r6
            r6 = r12
            r8 = r9
            r9 = r15
            boolean r6 = r6.mo8050a(r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x004f
            return r2
        L_0x004f:
            int r5 = r5 + -1
            goto L_0x0016
        L_0x0052:
            if (r14 == 0) goto L_0x0065
            boolean r1 = r12.mo8054c()
            if (r1 == 0) goto L_0x005c
            r1 = r15
            goto L_0x005e
        L_0x005c:
            r1 = r15
            int r1 = -r1
        L_0x005e:
            boolean r0 = r13.canScrollHorizontally(r1)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.mo8050a(android.view.View, boolean, int, int, int):boolean");
    }
}
