package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import androidx.annotation.C0189f0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0211p;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0463e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0711b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.C1006n0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C5582R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.C6858b;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.internal.C6936w.C6941e;
import com.google.android.material.internal.C6936w.C6942f;
import com.google.android.material.p179a.C5597k;
import com.google.android.material.p187p.C6974g;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.theme.p307a.C7109a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements C0711b {

    /* renamed from: X0 */
    private static final int f16127X0 = C5582R.style.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: Y0 */
    private static final long f16128Y0 = 300;

    /* renamed from: Z0 */
    public static final int f16129Z0 = 0;

    /* renamed from: a1 */
    public static final int f16130a1 = 1;

    /* renamed from: b1 */
    public static final int f16131b1 = 0;

    /* renamed from: c1 */
    public static final int f16132c1 = 1;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public final int f16133E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public final C6978j f16134F0;
    @C0195i0

    /* renamed from: G0 */
    private Animator f16135G0;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: H0 */
    public Animator f16136H0;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public int f16137I0;

    /* renamed from: J0 */
    private int f16138J0;

    /* renamed from: K0 */
    private boolean f16139K0;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public final boolean f16140L0;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public final boolean f16141M0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public final boolean f16142N0;

    /* renamed from: O0 */
    private int f16143O0;

    /* renamed from: P0 */
    private ArrayList<C5639i> f16144P0;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public boolean f16145Q0;

    /* renamed from: R0 */
    private Behavior f16146R0;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public int f16147S0;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public int f16148T0;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public int f16149U0;
    @C0193h0

    /* renamed from: V0 */
    AnimatorListenerAdapter f16150V0;
    @C0193h0

    /* renamed from: W0 */
    C5597k<FloatingActionButton> f16151W0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */
        @C0193h0

        /* renamed from: i */
        public final Rect f16152i = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public WeakReference<BottomAppBar> f16153j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f16154k;

        /* renamed from: l */
        private final OnLayoutChangeListener f16155l = new C5628a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C5628a implements OnLayoutChangeListener {
            C5628a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f16153j.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo27300b(Behavior.this.f16152i);
                int height = Behavior.this.f16152i.height();
                bottomAppBar.mo22306c(height);
                C0716g gVar = (C0716g) view.getLayoutParams();
                if (Behavior.this.f16154k == 0) {
                    gVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    gVar.leftMargin = bottomAppBar.getLeftInset();
                    gVar.rightMargin = bottomAppBar.getRightInset();
                    if (C6936w.m33301e(floatingActionButton)) {
                        gVar.leftMargin += bottomAppBar.f16133E0;
                    } else {
                        gVar.rightMargin += bottomAppBar.f16133E0;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: a */
        public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 BottomAppBar bottomAppBar, int i) {
            this.f16153j = new WeakReference<>(bottomAppBar);
            View o = bottomAppBar.m24586s();
            if (o != null && !C0962e0.m5540n0(o)) {
                C0716g gVar = (C0716g) o.getLayoutParams();
                gVar.f3350d = 49;
                this.f16154k = gVar.bottomMargin;
                if (o instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) o;
                    floatingActionButton.addOnLayoutChangeListener(this.f16155l);
                    bottomAppBar.m24557a(floatingActionButton);
                }
                bottomAppBar.m24592v();
            }
            coordinatorLayout.mo3942c((View) bottomAppBar, i);
            return super.mo3994a(coordinatorLayout, bottomAppBar, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean mo4006b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 BottomAppBar bottomAppBar, @C0193h0 View view, @C0193h0 View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo4006b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C5629a();

        /* renamed from: a */
        int f16157a;

        /* renamed from: b */
        boolean f16158b;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        static class C5629a implements ClassLoaderCreator<SavedState> {
            C5629a() {
            }

            @C0193h0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0195i0
            public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f16157a);
            parcel.writeInt(this.f16158b ? 1 : 0);
        }

        public SavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16157a = parcel.readInt();
            this.f16158b = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C5630a extends AnimatorListenerAdapter {
        C5630a() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.m24552a(bottomAppBar.f16137I0, BottomAppBar.this.f16145Q0);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C5631b implements C5597k<FloatingActionButton> {
        C5631b() {
        }

        /* renamed from: a */
        public void mo22067a(@C0193h0 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f16134F0.mo27804c(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        /* renamed from: b */
        public void mo22068b(@C0193h0 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().mo22356g() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().mo22354e(translationX);
                BottomAppBar.this.f16134F0.invalidateSelf();
            }
            float f = -floatingActionButton.getTranslationY();
            if (BottomAppBar.this.getTopEdgeTreatment().mo22349c() != f) {
                BottomAppBar.this.getTopEdgeTreatment().mo22346a(f);
                BottomAppBar.this.f16134F0.invalidateSelf();
            }
            BottomAppBar.this.f16134F0.mo27804c(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C5632c implements C6941e {
        C5632c() {
        }

        @C0193h0
        /* renamed from: a */
        public C1006n0 mo22334a(View view, @C0193h0 C1006n0 n0Var, @C0193h0 C6942f fVar) {
            boolean z;
            if (BottomAppBar.this.f16140L0) {
                BottomAppBar.this.f16147S0 = n0Var.mo4885i();
            }
            boolean z2 = false;
            if (BottomAppBar.this.f16141M0) {
                z = BottomAppBar.this.f16149U0 != n0Var.mo4886j();
                BottomAppBar.this.f16149U0 = n0Var.mo4886j();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f16142N0) {
                if (BottomAppBar.this.f16148T0 != n0Var.mo4887k()) {
                    z2 = true;
                }
                BottomAppBar.this.f16148T0 = n0Var.mo4887k();
            }
            if (z || z2) {
                BottomAppBar.this.m24579o();
                BottomAppBar.this.m24592v();
                BottomAppBar.this.m24590u();
            }
            return n0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C5633d extends AnimatorListenerAdapter {
        C5633d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m24581p();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m24583q();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C5634e extends C6858b {

        /* renamed from: a */
        final /* synthetic */ int f16163a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        class C5635a extends C6858b {
            C5635a() {
            }

            /* renamed from: b */
            public void mo22338b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m24581p();
            }
        }

        C5634e(int i) {
            this.f16163a = i;
        }

        /* renamed from: a */
        public void mo22337a(@C0193h0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m24564d(this.f16163a));
            floatingActionButton.mo27302b((C6858b) new C5635a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    class C5636f extends AnimatorListenerAdapter {
        C5636f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m24581p();
            BottomAppBar.this.f16136H0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m24583q();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    class C5637g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f16167a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f16168b;

        /* renamed from: c */
        final /* synthetic */ int f16169c;

        /* renamed from: d */
        final /* synthetic */ boolean f16170d;

        C5637g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f16168b = actionMenuView;
            this.f16169c = i;
            this.f16170d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f16167a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f16167a) {
                BottomAppBar.this.m24560b(this.f16168b, this.f16169c, this.f16170d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    class C5638h extends AnimatorListenerAdapter {
        C5638h() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f16150V0.onAnimationStart(animator);
            FloatingActionButton i = BottomAppBar.this.m24584r();
            if (i != null) {
                i.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    interface C5639i {
        /* renamed from: a */
        void mo22344a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo22345b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    public @interface C5640j {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$k */
    public @interface C5641k {
    }

    public BottomAppBar(@C0193h0 Context context) {
        this(context, null, 0);
    }

    @C0195i0
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f16147S0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m24564d(this.f16137I0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo22349c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f16149U0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f16148T0;
    }

    /* access modifiers changed from: private */
    @C0193h0
    public C5642a getTopEdgeTreatment() {
        return (C5642a) this.f16134F0.getShapeAppearanceModel().mo27866h();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m24592v() {
        getTopEdgeTreatment().mo22354e(getFabTranslationX());
        View s = m24586s();
        this.f16134F0.mo27804c((!this.f16145Q0 || !m24589t()) ? 0.0f : 1.0f);
        if (s != null) {
            s.setTranslationY(getFabTranslationY());
            s.setTranslationX(getFabTranslationX());
        }
    }

    @C0195i0
    public ColorStateList getBackgroundTint() {
        return this.f16134F0.mo27842v();
    }

    @C0211p
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo22349c();
    }

    public int getFabAlignmentMode() {
        return this.f16137I0;
    }

    public int getFabAnimationMode() {
        return this.f16138J0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo22351d();
    }

    @C0211p
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo22353e();
    }

    public boolean getHideOnScroll() {
        return this.f16139K0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33515a((View) this, this.f16134F0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m24579o();
            m24592v();
        }
        m24590u();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f16137I0 = savedState.f16157a;
        this.f16145Q0 = savedState.f16158b;
    }

    /* access modifiers changed from: protected */
    @C0193h0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16157a = this.f16137I0;
        savedState.f16158b = this.f16145Q0;
        return savedState;
    }

    public void setBackgroundTint(@C0195i0 ColorStateList colorStateList) {
        C0892a.m5146a((Drawable) this.f16134F0, colorStateList);
    }

    public void setCradleVerticalOffset(@C0211p float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo22346a(f);
            this.f16134F0.invalidateSelf();
            m24592v();
        }
    }

    public void setElevation(float f) {
        this.f16134F0.mo27799b(f);
        getBehavior().mo22285a(this, this.f16134F0.mo27836p() - this.f16134F0.mo27834o());
    }

    public void setFabAlignmentMode(int i) {
        m24567e(i);
        m24552a(i, this.f16145Q0);
        this.f16137I0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f16138J0 = i;
    }

    public void setFabCradleMargin(@C0211p float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo22348b(f);
            this.f16134F0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@C0211p float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo22350c(f);
            this.f16134F0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f16139K0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.bottomAppBarStyle);
    }

    /* renamed from: e */
    private void m24567e(int i) {
        if (this.f16137I0 != i && C0962e0.m5540n0(this)) {
            Animator animator = this.f16135G0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f16138J0 == 1) {
                m24559b(i, (List<Animator>) arrayList);
            } else {
                mo22302a(i, (List<Animator>) arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f16135G0 = animatorSet;
            this.f16135G0.addListener(new C5633d());
            this.f16135G0.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m24579o() {
        Animator animator = this.f16136H0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f16135G0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m24581p() {
        int i = this.f16143O0 - 1;
        this.f16143O0 = i;
        if (i == 0) {
            ArrayList<C5639i> arrayList = this.f16144P0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5639i) it.next()).mo22345b(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m24583q() {
        int i = this.f16143O0;
        this.f16143O0 = i + 1;
        if (i == 0) {
            ArrayList<C5639i> arrayList = this.f16144P0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5639i) it.next()).mo22344a(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    @C0195i0
    /* renamed from: r */
    public FloatingActionButton m24584r() {
        View s = m24586s();
        if (s instanceof FloatingActionButton) {
            return (FloatingActionButton) s;
        }
        return null;
    }

    /* access modifiers changed from: private */
    @C0195i0
    /* renamed from: s */
    public View m24586s() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo3941c((View) this)) {
            if (!(view instanceof FloatingActionButton)) {
                if (view instanceof ExtendedFloatingActionButton) {
                }
            }
            return view;
        }
        return null;
    }

    /* renamed from: t */
    private boolean m24589t() {
        FloatingActionButton r = m24584r();
        return r != null && r.mo27309e();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m24590u() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m24589t()) {
                m24560b(actionMenuView, 0, false);
            } else {
                m24560b(actionMenuView, this.f16137I0, this.f16145Q0);
            }
        }
    }

    @C0193h0
    public Behavior getBehavior() {
        if (this.f16146R0 == null) {
            this.f16146R0 = new Behavior();
        }
        return this.f16146R0;
    }

    /* renamed from: m */
    public void mo22314m() {
        getBehavior().mo22286b(this);
    }

    /* renamed from: n */
    public void mo22315n() {
        getBehavior().mo22287c(this);
    }

    public BottomAppBar(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f16127X0), attributeSet, i);
        this.f16134F0 = new C6978j();
        this.f16143O0 = 0;
        this.f16145Q0 = true;
        this.f16150V0 = new C5630a();
        this.f16151W0 = new C5631b();
        Context context2 = getContext();
        TypedArray c = C6928p.m33264c(context2, attributeSet, C5582R.styleable.BottomAppBar, i, f16127X0, new int[0]);
        ColorStateList a = C6952c.m33332a(context2, c, C5582R.styleable.BottomAppBar_backgroundTint);
        int dimensionPixelSize = c.getDimensionPixelSize(C5582R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = (float) c.getDimensionPixelOffset(C5582R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = (float) c.getDimensionPixelOffset(C5582R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = (float) c.getDimensionPixelOffset(C5582R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f16137I0 = c.getInt(C5582R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.f16138J0 = c.getInt(C5582R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.f16139K0 = c.getBoolean(C5582R.styleable.BottomAppBar_hideOnScroll, false);
        this.f16140L0 = c.getBoolean(C5582R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.f16141M0 = c.getBoolean(C5582R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f16142N0 = c.getBoolean(C5582R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        c.recycle();
        this.f16133E0 = getResources().getDimensionPixelOffset(C5582R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        this.f16134F0.setShapeAppearanceModel(C6986o.m33529n().mo27901e((C6974g) new C5642a(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).mo27878a());
        this.f16134F0.mo27805c(2);
        this.f16134F0.mo27792a(Style.FILL);
        this.f16134F0.mo27789a(context2);
        setElevation((float) dimensionPixelSize);
        C0892a.m5146a((Drawable) this.f16134F0, a);
        C0962e0.m5440a((View) this, (Drawable) this.f16134F0);
        C6936w.m33296a(this, attributeSet, i, f16127X0, new C5632c());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public float m24564d(int i) {
        boolean e = C6936w.m33301e(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f16133E0 + (e ? this.f16149U0 : this.f16148T0));
        if (e) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: b */
    public void mo22304b(@C0189f0 int i) {
        getMenu().clear();
        mo2349a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo22306c(@C0199k0 int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo22355f()) {
            return false;
        }
        getTopEdgeTreatment().mo22352d(f);
        this.f16134F0.invalidateSelf();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo22305b(@C0193h0 C5639i iVar) {
        ArrayList<C5639i> arrayList = this.f16144P0;
        if (arrayList != null) {
            arrayList.remove(iVar);
        }
    }

    /* renamed from: b */
    private void m24559b(int i, @C0193h0 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m24584r(), "translationX", new float[]{m24564d(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22303a(@C0193h0 C5639i iVar) {
        if (this.f16144P0 == null) {
            this.f16144P0 = new ArrayList<>();
        }
        this.f16144P0.add(iVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24560b(@C0193h0 ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo22301a(actionMenuView, i, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22302a(int i, List<Animator> list) {
        FloatingActionButton r = m24584r();
        if (r != null && !r.mo27307d()) {
            m24583q();
            r.mo27294a((C6858b) new C5634e(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24552a(int i, boolean z) {
        if (C0962e0.m5540n0(this)) {
            Animator animator = this.f16136H0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m24589t()) {
                i = 0;
                z = false;
            }
            m24553a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f16136H0 = animatorSet;
            this.f16136H0.addListener(new C5636f());
            this.f16136H0.start();
        }
    }

    /* renamed from: a */
    private void m24553a(int i, boolean z, @C0193h0 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo22301a(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new C5637g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo22301a(@C0193h0 ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean e = C6936w.m33301e(this);
        int measuredWidth = e ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C0463e) && (((C0463e) childAt.getLayoutParams()).f866a & C0984g.f4396d) == 8388611) {
                if (e) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((e ? actionMenuView.getRight() : actionMenuView.getLeft()) + (e ? this.f16148T0 : -this.f16149U0));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m24557a(@C0193h0 FloatingActionButton floatingActionButton) {
        floatingActionButton.mo27292a((AnimatorListener) this.f16150V0);
        floatingActionButton.mo27299b((AnimatorListener) new C5638h());
        floatingActionButton.mo27293a(this.f16151W0);
    }
}
