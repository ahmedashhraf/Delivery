package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0213q;
import androidx.annotation.C0216r0;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0238R;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p027g.C0890a;
import androidx.core.p033k.C0937e;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1054x;
import com.google.android.material.C5582R;
import com.google.android.material.appbar.AppBarLayout.C5607e;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C6893a;
import com.google.android.material.internal.C6897c;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p179a.C5587a;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: CollapsingToolbarLayout */
public class C5608a extends FrameLayout {

    /* renamed from: l0 */
    private static final int f16005l0 = 600;
    @C0195i0

    /* renamed from: N */
    private Toolbar f16006N;
    @C0195i0

    /* renamed from: O */
    private View f16007O;

    /* renamed from: P */
    private View f16008P;

    /* renamed from: Q */
    private int f16009Q;

    /* renamed from: R */
    private int f16010R;

    /* renamed from: S */
    private int f16011S;

    /* renamed from: T */
    private int f16012T;

    /* renamed from: U */
    private final Rect f16013U;
    @C0193h0

    /* renamed from: V */
    final C6893a f16014V;

    /* renamed from: W */
    private boolean f16015W;

    /* renamed from: a */
    private boolean f16016a;

    /* renamed from: a0 */
    private boolean f16017a0;

    /* renamed from: b */
    private int f16018b;
    @C0195i0

    /* renamed from: b0 */
    private Drawable f16019b0;
    @C0195i0

    /* renamed from: c0 */
    Drawable f16020c0;

    /* renamed from: d0 */
    private int f16021d0;

    /* renamed from: e0 */
    private boolean f16022e0;

    /* renamed from: f0 */
    private ValueAnimator f16023f0;

    /* renamed from: g0 */
    private long f16024g0;

    /* renamed from: h0 */
    private int f16025h0;

    /* renamed from: i0 */
    private C5607e f16026i0;

    /* renamed from: j0 */
    int f16027j0;
    @C0195i0

    /* renamed from: k0 */
    C1006n0 f16028k0;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* compiled from: CollapsingToolbarLayout */
    class C5609a implements C1054x {
        C5609a() {
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, @C0193h0 C1006n0 n0Var) {
            return C5608a.this.mo22163a(n0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.a$b */
    /* compiled from: CollapsingToolbarLayout */
    class C5610b implements AnimatorUpdateListener {
        C5610b() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            C5608a.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.a$c */
    /* compiled from: CollapsingToolbarLayout */
    public static class C5611c extends LayoutParams {

        /* renamed from: c */
        private static final float f16031c = 0.5f;

        /* renamed from: d */
        public static final int f16032d = 0;

        /* renamed from: e */
        public static final int f16033e = 1;

        /* renamed from: f */
        public static final int f16034f = 2;

        /* renamed from: a */
        int f16035a = 0;

        /* renamed from: b */
        float f16036b = 0.5f;

        public C5611c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.CollapsingToolbarLayout_Layout);
            this.f16035a = obtainStyledAttributes.getInt(C5582R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo22224a(obtainStyledAttributes.getFloat(C5582R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo22225a(int i) {
            this.f16035a = i;
        }

        /* renamed from: b */
        public float mo22226b() {
            return this.f16036b;
        }

        /* renamed from: a */
        public int mo22223a() {
            return this.f16035a;
        }

        /* renamed from: a */
        public void mo22224a(float f) {
            this.f16036b = f;
        }

        public C5611c(int i, int i2) {
            super(i, i2);
        }

        public C5611c(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public C5611c(@C0193h0 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5611c(@C0193h0 MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public C5611c(@C0193h0 LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.appbar.a$d */
    /* compiled from: CollapsingToolbarLayout */
    private class C5612d implements C5607e {
        C5612d() {
        }

        /* renamed from: a */
        public void mo22154a(AppBarLayout appBarLayout, int i) {
            C5608a aVar = C5608a.this;
            aVar.f16027j0 = i;
            C1006n0 n0Var = aVar.f16028k0;
            int l = n0Var != null ? n0Var.mo4888l() : 0;
            int childCount = C5608a.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = C5608a.this.getChildAt(i2);
                C5611c cVar = (C5611c) childAt.getLayoutParams();
                C5617e d = C5608a.m24403d(childAt);
                int i3 = cVar.f16035a;
                if (i3 == 1) {
                    d.mo22242b(C0890a.m5110a(-i, 0, C5608a.this.mo22162a(childAt)));
                } else if (i3 == 2) {
                    d.mo22242b(Math.round(((float) (-i)) * cVar.f16036b));
                }
            }
            C5608a.this.mo22167b();
            C5608a aVar2 = C5608a.this;
            if (aVar2.f16020c0 != null && l > 0) {
                C0962e0.m5561u0(aVar2);
            }
            C5608a.this.f16014V.mo27554c(((float) Math.abs(i)) / ((float) ((C5608a.this.getHeight() - C0962e0.m5399C(C5608a.this)) - l)));
        }
    }

    public C5608a(@C0193h0 Context context) {
        this(context, null);
    }

    @C0193h0
    /* renamed from: b */
    private View m24400b(@C0193h0 View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: c */
    private void m24402c() {
        if (this.f16016a) {
            Toolbar toolbar = null;
            this.f16006N = null;
            this.f16007O = null;
            int i = this.f16018b;
            if (i != -1) {
                this.f16006N = (Toolbar) findViewById(i);
                Toolbar toolbar2 = this.f16006N;
                if (toolbar2 != null) {
                    this.f16007O = m24400b(toolbar2);
                }
            }
            if (this.f16006N == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.f16006N = toolbar;
            }
            m24405e();
            this.f16016a = false;
        }
    }

    @C0193h0
    /* renamed from: d */
    static C5617e m24403d(@C0193h0 View view) {
        C5617e eVar = (C5617e) view.getTag(C5582R.C5586id.view_offset_helper);
        if (eVar != null) {
            return eVar;
        }
        C5617e eVar2 = new C5617e(view);
        view.setTag(C5582R.C5586id.view_offset_helper, eVar2);
        return eVar2;
    }

    /* renamed from: e */
    private boolean m24406e(View view) {
        View view2 = this.f16007O;
        if (view2 == null || view2 == this) {
            if (view == this.f16006N) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1006n0 mo22163a(@C0193h0 C1006n0 n0Var) {
        C1006n0 n0Var2 = C0962e0.m5554s(this) ? n0Var : null;
        if (!C0937e.m5328a(this.f16028k0, n0Var2)) {
            this.f16028k0 = n0Var2;
            requestLayout();
        }
        return n0Var.mo4877c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5611c;
    }

    public void draw(@C0193h0 Canvas canvas) {
        super.draw(canvas);
        m24402c();
        if (this.f16006N == null) {
            Drawable drawable = this.f16019b0;
            if (drawable != null && this.f16021d0 > 0) {
                drawable.mutate().setAlpha(this.f16021d0);
                this.f16019b0.draw(canvas);
            }
        }
        if (this.f16015W && this.f16017a0) {
            this.f16014V.mo27539a(canvas);
        }
        if (this.f16020c0 != null && this.f16021d0 > 0) {
            C1006n0 n0Var = this.f16028k0;
            int l = n0Var != null ? n0Var.mo4888l() : 0;
            if (l > 0) {
                this.f16020c0.setBounds(0, -this.f16027j0, getWidth(), l - this.f16027j0);
                this.f16020c0.mutate().setAlpha(this.f16021d0);
                this.f16020c0.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f16019b0 == null || this.f16021d0 <= 0 || !m24406e(view)) {
            z = false;
        } else {
            this.f16019b0.mutate().setAlpha(this.f16021d0);
            this.f16019b0.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f16020c0;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f16019b0;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C6893a aVar = this.f16014V;
        if (aVar != null) {
            z |= aVar.mo27544a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.f16014V.mo27553c();
    }

    @C0193h0
    public Typeface getCollapsedTitleTypeface() {
        return this.f16014V.mo27560f();
    }

    @C0195i0
    public Drawable getContentScrim() {
        return this.f16019b0;
    }

    public int getExpandedTitleGravity() {
        return this.f16014V.mo27563i();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f16012T;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f16011S;
    }

    public int getExpandedTitleMarginStart() {
        return this.f16009Q;
    }

    public int getExpandedTitleMarginTop() {
        return this.f16010R;
    }

    @C0193h0
    public Typeface getExpandedTitleTypeface() {
        return this.f16014V.mo27566l();
    }

    /* access modifiers changed from: 0000 */
    public int getScrimAlpha() {
        return this.f16021d0;
    }

    public long getScrimAnimationDuration() {
        return this.f16024g0;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f16025h0;
        if (i >= 0) {
            return i;
        }
        C1006n0 n0Var = this.f16028k0;
        int l = n0Var != null ? n0Var.mo4888l() : 0;
        int C = C0962e0.m5399C(this);
        if (C > 0) {
            return Math.min((C * 2) + l, getHeight());
        }
        return getHeight() / 3;
    }

    @C0195i0
    public Drawable getStatusBarScrim() {
        return this.f16020c0;
    }

    @C0195i0
    public CharSequence getTitle() {
        if (this.f16015W) {
            return this.f16014V.mo27568n();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C0962e0.m5486c((View) this, C0962e0.m5554s((View) parent));
            if (this.f16026i0 == null) {
                this.f16026i0 = new C5612d();
            }
            ((AppBarLayout) parent).mo22072a(this.f16026i0);
            C0962e0.m5563v0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        C5607e eVar = this.f16026i0;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo22078b(eVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C1006n0 n0Var = this.f16028k0;
        if (n0Var != null) {
            int l = n0Var.mo4888l();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C0962e0.m5554s(childAt) && childAt.getTop() < l) {
                    C0962e0.m5513h(childAt, l);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m24403d(getChildAt(i6)).mo22248h();
        }
        if (this.f16015W) {
            View view = this.f16008P;
            if (view != null) {
                boolean z2 = true;
                this.f16017a0 = C0962e0.m5515h0(view) && this.f16008P.getVisibility() == 0;
                if (this.f16017a0) {
                    if (C0962e0.m5566x(this) != 1) {
                        z2 = false;
                    }
                    View view2 = this.f16007O;
                    if (view2 == null) {
                        view2 = this.f16006N;
                    }
                    int a = mo22162a(view2);
                    C6897c.m33153a((ViewGroup) this, this.f16008P, this.f16013U);
                    this.f16014V.mo27536a(this.f16013U.left + (z2 ? this.f16006N.getTitleMarginEnd() : this.f16006N.getTitleMarginStart()), this.f16013U.top + a + this.f16006N.getTitleMarginTop(), this.f16013U.right + (z2 ? this.f16006N.getTitleMarginStart() : this.f16006N.getTitleMarginEnd()), (this.f16013U.bottom + a) - this.f16006N.getTitleMarginBottom());
                    this.f16014V.mo27548b(z2 ? this.f16011S : this.f16009Q, this.f16013U.top + this.f16010R, (i3 - i) - (z2 ? this.f16009Q : this.f16011S), (i4 - i2) - this.f16012T);
                    this.f16014V.mo27571q();
                }
            }
        }
        if (this.f16006N != null) {
            if (this.f16015W && TextUtils.isEmpty(this.f16014V.mo27568n())) {
                setTitle(this.f16006N.getTitle());
            }
            View view3 = this.f16007O;
            if (view3 == null || view3 == this) {
                setMinimumHeight(m24401c(this.f16006N));
            } else {
                setMinimumHeight(m24401c(view3));
            }
        }
        mo22167b();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m24403d(getChildAt(i7)).mo22237a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m24402c();
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        C1006n0 n0Var = this.f16028k0;
        int l = n0Var != null ? n0Var.mo4888l() : 0;
        if (mode == 0 && l > 0) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight() + l, C6637f.f18605b));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f16019b0;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f16014V.mo27547b(i);
    }

    public void setCollapsedTitleTextAppearance(@C0216r0 int i) {
        this.f16014V.mo27535a(i);
    }

    public void setCollapsedTitleTextColor(@C0198k int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(@C0195i0 Typeface typeface) {
        this.f16014V.mo27542a(typeface);
    }

    public void setContentScrim(@C0195i0 Drawable drawable) {
        Drawable drawable2 = this.f16019b0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f16019b0 = drawable3;
            Drawable drawable4 = this.f16019b0;
            if (drawable4 != null) {
                drawable4.setBounds(0, 0, getWidth(), getHeight());
                this.f16019b0.setCallback(this);
                this.f16019b0.setAlpha(this.f16021d0);
            }
            C0962e0.m5561u0(this);
        }
    }

    public void setContentScrimColor(@C0198k int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@C0213q int i) {
        setContentScrim(C0841b.m4928c(getContext(), i));
    }

    public void setExpandedTitleColor(@C0198k int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f16014V.mo27558d(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f16012T = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f16011S = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f16009Q = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f16010R = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@C0216r0 int i) {
        this.f16014V.mo27555c(i);
    }

    public void setExpandedTitleTextColor(@C0193h0 ColorStateList colorStateList) {
        this.f16014V.mo27550b(colorStateList);
    }

    public void setExpandedTitleTypeface(@C0195i0 Typeface typeface) {
        this.f16014V.mo27552b(typeface);
    }

    /* access modifiers changed from: 0000 */
    public void setScrimAlpha(int i) {
        if (i != this.f16021d0) {
            if (this.f16019b0 != null) {
                Toolbar toolbar = this.f16006N;
                if (toolbar != null) {
                    C0962e0.m5561u0(toolbar);
                }
            }
            this.f16021d0 = i;
            C0962e0.m5561u0(this);
        }
    }

    public void setScrimAnimationDuration(@C0237z(from = 0) long j) {
        this.f16024g0 = j;
    }

    public void setScrimVisibleHeightTrigger(@C0237z(from = 0) int i) {
        if (this.f16025h0 != i) {
            this.f16025h0 = i;
            mo22167b();
        }
    }

    public void setScrimsShown(boolean z) {
        mo22165a(z, C0962e0.m5540n0(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@C0195i0 Drawable drawable) {
        Drawable drawable2 = this.f16020c0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f16020c0 = drawable3;
            Drawable drawable4 = this.f16020c0;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f16020c0.setState(getDrawableState());
                }
                C0892a.m5152a(this.f16020c0, C0962e0.m5566x(this));
                this.f16020c0.setVisible(getVisibility() == 0, false);
                this.f16020c0.setCallback(this);
                this.f16020c0.setAlpha(this.f16021d0);
            }
            C0962e0.m5561u0(this);
        }
    }

    public void setStatusBarScrimColor(@C0198k int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@C0213q int i) {
        setStatusBarScrim(C0841b.m4928c(getContext(), i));
    }

    public void setTitle(@C0195i0 CharSequence charSequence) {
        this.f16014V.mo27543a(charSequence);
        m24404d();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f16015W) {
            this.f16015W = z;
            m24404d();
            m24405e();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f16020c0;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f16020c0.setVisible(z, false);
        }
        Drawable drawable2 = this.f16019b0;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f16019b0.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(@C0193h0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f16019b0 || drawable == this.f16020c0;
    }

    public C5608a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m24405e() {
        if (!this.f16015W) {
            View view = this.f16008P;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f16008P);
                }
            }
        }
        if (this.f16015W && this.f16006N != null) {
            if (this.f16008P == null) {
                this.f16008P = new View(getContext());
            }
            if (this.f16008P.getParent() == null) {
                this.f16006N.addView(this.f16008P, -1, -1);
            }
        }
    }

    public void setCollapsedTitleTextColor(@C0193h0 ColorStateList colorStateList) {
        this.f16014V.mo27538a(colorStateList);
    }

    public C5608a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16016a = true;
        this.f16013U = new Rect();
        this.f16025h0 = -1;
        this.f16014V = new C6893a(this);
        this.f16014V.mo27549b(C5587a.f15933e);
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.CollapsingToolbarLayout, i, C5582R.style.Widget_Design_CollapsingToolbar, new int[0]);
        this.f16014V.mo27558d(c.getInt(C5582R.styleable.CollapsingToolbarLayout_expandedTitleGravity, BadgeDrawable.f16067e0));
        this.f16014V.mo27547b(c.getInt(C5582R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = c.getDimensionPixelSize(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f16012T = dimensionPixelSize;
        this.f16011S = dimensionPixelSize;
        this.f16010R = dimensionPixelSize;
        this.f16009Q = dimensionPixelSize;
        if (c.hasValue(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f16009Q = c.getDimensionPixelSize(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (c.hasValue(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f16011S = c.getDimensionPixelSize(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (c.hasValue(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f16010R = c.getDimensionPixelSize(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (c.hasValue(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f16012T = c.getDimensionPixelSize(C5582R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f16015W = c.getBoolean(C5582R.styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(c.getText(C5582R.styleable.CollapsingToolbarLayout_title));
        this.f16014V.mo27555c(C5582R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f16014V.mo27535a(C0238R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (c.hasValue(C5582R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f16014V.mo27555c(c.getResourceId(C5582R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (c.hasValue(C5582R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f16014V.mo27535a(c.getResourceId(C5582R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f16025h0 = c.getDimensionPixelSize(C5582R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        this.f16024g0 = (long) c.getInt(C5582R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(c.getDrawable(C5582R.styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(c.getDrawable(C5582R.styleable.CollapsingToolbarLayout_statusBarScrim));
        this.f16018b = c.getResourceId(C5582R.styleable.CollapsingToolbarLayout_toolbarId, -1);
        c.recycle();
        setWillNotDraw(false);
        C0962e0.m5448a((View) this, (C1054x) new C5609a());
    }

    /* access modifiers changed from: protected */
    public C5611c generateDefaultLayoutParams() {
        return new C5611c(-1, -1);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C5611c(getContext(), attributeSet);
    }

    /* renamed from: d */
    private void m24404d() {
        setContentDescription(getTitle());
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C5611c(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo22167b() {
        if (this.f16019b0 != null || this.f16020c0 != null) {
            setScrimsShown(getHeight() + this.f16027j0 < getScrimVisibleHeightTrigger());
        }
    }

    /* renamed from: a */
    public boolean mo22166a() {
        return this.f16015W;
    }

    /* renamed from: a */
    public void mo22165a(boolean z, boolean z2) {
        if (this.f16022e0 != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m24399a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f16022e0 = z;
        }
    }

    /* renamed from: a */
    private void m24399a(int i) {
        m24402c();
        ValueAnimator valueAnimator = this.f16023f0;
        if (valueAnimator == null) {
            this.f16023f0 = new ValueAnimator();
            this.f16023f0.setDuration(this.f16024g0);
            this.f16023f0.setInterpolator(i > this.f16021d0 ? C5587a.f15931c : C5587a.f15932d);
            this.f16023f0.addUpdateListener(new C5610b());
        } else if (valueAnimator.isRunning()) {
            this.f16023f0.cancel();
        }
        this.f16023f0.setIntValues(new int[]{this.f16021d0, i});
        this.f16023f0.start();
    }

    /* renamed from: c */
    private static int m24401c(@C0193h0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            return view.getHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public void mo22164a(int i, int i2, int i3, int i4) {
        this.f16009Q = i;
        this.f16010R = i2;
        this.f16011S = i3;
        this.f16012T = i4;
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo22162a(@C0193h0 View view) {
        return ((getHeight() - m24403d(view).mo22243c()) - view.getHeight()) - ((C5611c) view.getLayoutParams()).bottomMargin;
    }
}
