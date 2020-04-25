package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.C0180b;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0711b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C6897c;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p187p.C6986o;
import java.util.List;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class ExtendedFloatingActionButton extends MaterialButton implements C0711b {

    /* renamed from: s0 */
    private static final int f19063s0 = C5582R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: t0 */
    private static final int f19064t0 = 0;

    /* renamed from: u0 */
    private static final int f19065u0 = 1;

    /* renamed from: v0 */
    private static final int f19066v0 = 2;

    /* renamed from: w0 */
    static final Property<View, Float> f19067w0 = new C6850d(Float.class, C14330v.f42318d0);

    /* renamed from: x0 */
    static final Property<View, Float> f19068x0 = new C6851e(Float.class, C14330v.f42320e0);
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public int f19069k0;

    /* renamed from: l0 */
    private final C6861a f19070l0;
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: m0 */
    public final C6881f f19071m0;
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: n0 */
    public final C6881f f19072n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public final C6881f f19073o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public final C6881f f19074p0;
    @C0193h0

    /* renamed from: q0 */
    private final C0712c<ExtendedFloatingActionButton> f19075q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public boolean f19076r0;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends C0712c<T> {

        /* renamed from: f */
        private static final boolean f19077f = false;

        /* renamed from: g */
        private static final boolean f19078g = true;

        /* renamed from: a */
        private Rect f19079a;
        @C0195i0

        /* renamed from: b */
        private C6854h f19080b;
        @C0195i0

        /* renamed from: c */
        private C6854h f19081c;

        /* renamed from: d */
        private boolean f19082d;

        /* renamed from: e */
        private boolean f19083e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f19082d = false;
            this.f19083e = true;
        }

        /* renamed from: c */
        public boolean mo27266c() {
            return this.f19083e;
        }

        /* renamed from: b */
        public boolean mo27265b() {
            return this.f19082d;
        }

        /* renamed from: a */
        public void mo27258a(boolean z) {
            this.f19082d = z;
        }

        /* renamed from: b */
        public void mo27264b(boolean z) {
            this.f19083e = z;
        }

        public ExtendedFloatingActionButtonBehavior(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.f19082d = obtainStyledAttributes.getBoolean(C5582R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f19083e = obtainStyledAttributes.getBoolean(C5582R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private static boolean m32829b(@C0193h0 View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0716g) {
                return ((C0716g) layoutParams).mo4027d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3996a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton, @C0193h0 Rect rect) {
            return super.mo3996a(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: a */
        public void mo3983a(@C0193h0 C0716g gVar) {
            if (gVar.f3354h == 0) {
                gVar.f3354h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo4004b(CoordinatorLayout coordinatorLayout, @C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m32828a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
            } else if (m32829b(view)) {
                m32830b(view, extendedFloatingActionButton);
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: b */
        public void mo27262b(@C0195i0 C6854h hVar) {
            this.f19081c = hVar;
        }

        /* renamed from: b */
        private boolean m32830b(@C0193h0 View view, @C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m32827a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((C0716g) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo27263b(extendedFloatingActionButton);
            } else {
                mo27257a(extendedFloatingActionButton);
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: a */
        public void mo27256a(@C0195i0 C6854h hVar) {
            this.f19080b = hVar;
        }

        /* renamed from: a */
        private boolean m32827a(@C0193h0 View view, @C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            C0716g gVar = (C0716g) extendedFloatingActionButton.getLayoutParams();
            if ((this.f19082d || this.f19083e) && gVar.mo4025c() == view.getId()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo27263b(@C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            C6881f fVar;
            C6854h hVar = this.f19083e ? this.f19081c : this.f19080b;
            if (this.f19083e) {
                fVar = extendedFloatingActionButton.f19071m0;
            } else {
                fVar = extendedFloatingActionButton.f19074p0;
            }
            extendedFloatingActionButton.m32799a(fVar, hVar);
        }

        /* renamed from: a */
        private boolean m32828a(CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, @C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m32827a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f19079a == null) {
                this.f19079a = new Rect();
            }
            Rect rect = this.f19079a;
            C6897c.m33153a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo27263b(extendedFloatingActionButton);
            } else {
                mo27257a(extendedFloatingActionButton);
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo27257a(@C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            C6881f fVar;
            C6854h hVar = this.f19083e ? this.f19081c : this.f19080b;
            if (this.f19083e) {
                fVar = extendedFloatingActionButton.f19072n0;
            } else {
                fVar = extendedFloatingActionButton.f19073o0;
            }
            extendedFloatingActionButton.m32799a(fVar, hVar);
        }

        /* renamed from: a */
        public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List b = coordinatorLayout.mo3938b((View) extendedFloatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m32829b(view) && m32830b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m32828a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3942c((View) extendedFloatingActionButton, i);
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C6847a implements C6856j {
        C6847a() {
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C6848b implements C6856j {
        C6848b() {
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C6849c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f19086a;

        /* renamed from: b */
        final /* synthetic */ C6881f f19087b;

        /* renamed from: c */
        final /* synthetic */ C6854h f19088c;

        C6849c(C6881f fVar, C6854h hVar) {
            this.f19087b = fVar;
            this.f19088c = hVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f19086a = true;
            this.f19087b.mo27287b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f19087b.mo27280a();
            if (!this.f19086a) {
                this.f19087b.mo27281a(this.f19088c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f19087b.onAnimationStart(animator);
            this.f19086a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    static class C6850d extends Property<View, Float> {
        C6850d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(@C0193h0 View view, @C0193h0 Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }

        @C0193h0
        /* renamed from: a */
        public Float get(@C0193h0 View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    static class C6851e extends Property<View, Float> {
        C6851e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(@C0193h0 View view, @C0193h0 Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }

        @C0193h0
        /* renamed from: a */
        public Float get(@C0193h0 View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    class C6852f extends C6862b {

        /* renamed from: g */
        private final C6856j f19090g;

        /* renamed from: h */
        private final boolean f19091h;

        C6852f(C6861a aVar, C6856j jVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f19090g = jVar;
            this.f19091h = z;
        }

        /* renamed from: a */
        public void mo27281a(@C0195i0 C6854h hVar) {
            if (hVar != null) {
                if (this.f19091h) {
                    hVar.mo27288a(ExtendedFloatingActionButton.this);
                } else {
                    hVar.mo27291d(ExtendedFloatingActionButton.this);
                }
            }
        }

        /* renamed from: d */
        public int mo27282d() {
            return C5582R.C5583animator.mtrl_extended_fab_change_size_motion_spec;
        }

        /* renamed from: e */
        public void mo27283e() {
            ExtendedFloatingActionButton.this.f19076r0 = this.f19091h;
            LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                if (this.f19091h) {
                    ExtendedFloatingActionButton.this.measure(0, 0);
                }
                layoutParams.width = this.f19090g.getWidth();
                layoutParams.height = this.f19090g.getHeight();
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: g */
        public boolean mo27284g() {
            return this.f19091h == ExtendedFloatingActionButton.this.f19076r0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @C0193h0
        /* renamed from: h */
        public AnimatorSet mo27285h() {
            C5594h c = mo27390c();
            String str = C14330v.f42318d0;
            if (c.mo22053c(str)) {
                PropertyValuesHolder[] a = c.mo22051a(str);
                a[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f19090g.getWidth()});
                c.mo22050a(str, a);
            }
            String str2 = C14330v.f42320e0;
            if (c.mo22053c(str2)) {
                PropertyValuesHolder[] a2 = c.mo22051a(str2);
                a2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f19090g.getHeight()});
                c.mo22050a(str2, a2);
            }
            return super.mo27388b(c);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f19076r0 = this.f19091h;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        /* renamed from: a */
        public void mo27280a() {
            super.mo27280a();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    class C6853g extends C6862b {

        /* renamed from: g */
        private boolean f19093g;

        public C6853g(C6861a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo27281a(@C0195i0 C6854h hVar) {
            if (hVar != null) {
                hVar.mo27289b(ExtendedFloatingActionButton.this);
            }
        }

        /* renamed from: b */
        public void mo27287b() {
            super.mo27287b();
            this.f19093g = true;
        }

        /* renamed from: d */
        public int mo27282d() {
            return C5582R.C5583animator.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: e */
        public void mo27283e() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: g */
        public boolean mo27284g() {
            return ExtendedFloatingActionButton.this.m32807h();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f19093g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f19069k0 = 1;
        }

        /* renamed from: a */
        public void mo27280a() {
            super.mo27280a();
            ExtendedFloatingActionButton.this.f19069k0 = 0;
            if (!this.f19093g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public static abstract class C6854h {
        /* renamed from: a */
        public void mo27288a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: b */
        public void mo27289b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: c */
        public void mo27290c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* renamed from: d */
        public void mo27291d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    class C6855i extends C6862b {
        public C6855i(C6861a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo27281a(@C0195i0 C6854h hVar) {
            if (hVar != null) {
                hVar.mo27290c(ExtendedFloatingActionButton.this);
            }
        }

        /* renamed from: d */
        public int mo27282d() {
            return C5582R.C5583animator.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: e */
        public void mo27283e() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: g */
        public boolean mo27284g() {
            return ExtendedFloatingActionButton.this.m32808i();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f19069k0 = 2;
        }

        /* renamed from: a */
        public void mo27280a() {
            super.mo27280a();
            ExtendedFloatingActionButton.this.f19069k0 = 0;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    interface C6856j {
        int getHeight();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@C0193h0 Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m32808i() {
        boolean z = false;
        if (getVisibility() != 0) {
            if (this.f19069k0 == 2) {
                z = true;
            }
            return z;
        }
        if (this.f19069k0 != 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    private boolean m32809j() {
        return C0962e0.m5540n0(this) && !isInEditMode();
    }

    @C0193h0
    public C0712c<ExtendedFloatingActionButton> getBehavior() {
        return this.f19075q0;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public int getCollapsedSize() {
        return (Math.min(C0962e0.m5405I(this), C0962e0.m5404H(this)) * 2) + getIconSize();
    }

    @C0195i0
    public C5594h getExtendMotionSpec() {
        return this.f19072n0.mo27391f();
    }

    @C0195i0
    public C5594h getHideMotionSpec() {
        return this.f19074p0.mo27391f();
    }

    @C0195i0
    public C5594h getShowMotionSpec() {
        return this.f19073o0.mo27391f();
    }

    @C0195i0
    public C5594h getShrinkMotionSpec() {
        return this.f19071m0.mo27391f();
    }

    /* renamed from: h */
    public void mo27246h(@C0193h0 AnimatorListener animatorListener) {
        this.f19071m0.mo27386a(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19076r0 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f19076r0 = false;
            this.f19071m0.mo27283e();
        }
    }

    public void setExtendMotionSpec(@C0195i0 C5594h hVar) {
        this.f19072n0.mo27387a(hVar);
    }

    public void setExtendMotionSpecResource(@C0180b int i) {
        setExtendMotionSpec(C5594h.m24263a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f19076r0 != z) {
            C6881f fVar = z ? this.f19072n0 : this.f19071m0;
            if (!fVar.mo27284g()) {
                fVar.mo27283e();
            }
        }
    }

    public void setHideMotionSpec(@C0195i0 C5594h hVar) {
        this.f19074p0.mo27387a(hVar);
    }

    public void setHideMotionSpecResource(@C0180b int i) {
        setHideMotionSpec(C5594h.m24263a(getContext(), i));
    }

    public void setShowMotionSpec(@C0195i0 C5594h hVar) {
        this.f19073o0.mo27387a(hVar);
    }

    public void setShowMotionSpecResource(@C0180b int i) {
        setShowMotionSpec(C5594h.m24263a(getContext(), i));
    }

    public void setShrinkMotionSpec(@C0195i0 C5594h hVar) {
        this.f19071m0.mo27387a(hVar);
    }

    public void setShrinkMotionSpecResource(@C0180b int i) {
        setShrinkMotionSpec(C5594h.m24263a(getContext(), i));
    }

    public ExtendedFloatingActionButton(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.extendedFloatingActionButtonStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public boolean m32807h() {
        boolean z = false;
        if (getVisibility() == 0) {
            if (this.f19069k0 == 1) {
                z = true;
            }
            return z;
        }
        if (this.f19069k0 != 2) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void mo27227b(@C0193h0 AnimatorListener animatorListener) {
        this.f19074p0.mo27389b(animatorListener);
    }

    /* renamed from: c */
    public void mo27230c(@C0193h0 AnimatorListener animatorListener) {
        this.f19073o0.mo27389b(animatorListener);
    }

    /* renamed from: d */
    public void mo27233d(@C0193h0 AnimatorListener animatorListener) {
        this.f19071m0.mo27389b(animatorListener);
    }

    /* renamed from: e */
    public final boolean mo27236e() {
        return this.f19076r0;
    }

    /* renamed from: f */
    public void mo27238f(@C0193h0 AnimatorListener animatorListener) {
        this.f19074p0.mo27386a(animatorListener);
    }

    /* renamed from: g */
    public void mo27240g(@C0193h0 AnimatorListener animatorListener) {
        this.f19073o0.mo27386a(animatorListener);
    }

    public ExtendedFloatingActionButton(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19069k0 = 0;
        this.f19070l0 = new C6861a();
        this.f19073o0 = new C6855i(this.f19070l0);
        this.f19074p0 = new C6853g(this.f19070l0);
        this.f19076r0 = true;
        this.f19075q0 = new ExtendedFloatingActionButtonBehavior(context, attributeSet);
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.ExtendedFloatingActionButton, i, f19063s0, new int[0]);
        C5594h a = C5594h.m24264a(context, c, C5582R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        C5594h a2 = C5594h.m24264a(context, c, C5582R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        C5594h a3 = C5594h.m24264a(context, c, C5582R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        C5594h a4 = C5594h.m24264a(context, c, C5582R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        C6861a aVar = new C6861a();
        this.f19072n0 = new C6852f(aVar, new C6847a(), true);
        this.f19071m0 = new C6852f(aVar, new C6848b(), false);
        this.f19073o0.mo27387a(a);
        this.f19074p0.mo27387a(a2);
        this.f19072n0.mo27387a(a3);
        this.f19071m0.mo27387a(a4);
        c.recycle();
        setShapeAppearanceModel(C6986o.m33528a(context, attributeSet, i, f19063s0, C6986o.f19598m).mo27878a());
    }

    /* renamed from: b */
    public void mo27228b(@C0193h0 C6854h hVar) {
        m32799a(this.f19074p0, hVar);
    }

    /* renamed from: c */
    public void mo27231c(@C0193h0 C6854h hVar) {
        m32799a(this.f19073o0, hVar);
    }

    /* renamed from: d */
    public void mo27232d() {
        m32799a(this.f19074p0, (C6854h) null);
    }

    /* renamed from: e */
    public void mo27235e(@C0193h0 AnimatorListener animatorListener) {
        this.f19072n0.mo27386a(animatorListener);
    }

    /* renamed from: f */
    public void mo27237f() {
        m32799a(this.f19073o0, (C6854h) null);
    }

    /* renamed from: g */
    public void mo27239g() {
        m32799a(this.f19071m0, (C6854h) null);
    }

    /* renamed from: c */
    public void mo27229c() {
        m32799a(this.f19072n0, (C6854h) null);
    }

    /* renamed from: d */
    public void mo27234d(@C0193h0 C6854h hVar) {
        m32799a(this.f19071m0, hVar);
    }

    /* renamed from: a */
    public void mo27225a(@C0193h0 AnimatorListener animatorListener) {
        this.f19072n0.mo27389b(animatorListener);
    }

    /* renamed from: a */
    public void mo27226a(@C0193h0 C6854h hVar) {
        m32799a(this.f19072n0, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m32799a(@C0193h0 C6881f fVar, @C0195i0 C6854h hVar) {
        if (!fVar.mo27284g()) {
            if (!m32809j()) {
                fVar.mo27283e();
                fVar.mo27281a(hVar);
                return;
            }
            measure(0, 0);
            AnimatorSet h = fVar.mo27285h();
            h.addListener(new C6849c(fVar, hVar));
            for (AnimatorListener addListener : fVar.mo27392i()) {
                h.addListener(addListener);
            }
            h.start();
        }
    }
}
