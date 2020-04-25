package com.aurelhubert.ahbottomnavigation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C1000l0;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation.C2898e;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar.SnackbarLayout;
import com.google.android.material.tabs.TabLayout;
import p053b.p065e.p066b.p067a.C2118c;

public class AHBottomNavigationBehavior<V extends View> extends VerticalScrollingBehavior<V> {

    /* renamed from: u */
    private static final Interpolator f10303u = new C2118c();

    /* renamed from: v */
    private static final int f10304v = 300;

    /* renamed from: e */
    private int f10305e;

    /* renamed from: f */
    private boolean f10306f = false;

    /* renamed from: g */
    private C0990i0 f10307g;

    /* renamed from: h */
    private ObjectAnimator f10308h;

    /* renamed from: i */
    private TabLayout f10309i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public SnackbarLayout f10310j;

    /* renamed from: k */
    private FloatingActionButton f10311k;

    /* renamed from: l */
    private int f10312l = -1;

    /* renamed from: m */
    private int f10313m = 0;

    /* renamed from: n */
    private boolean f10314n = false;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f10315o = 0.0f;

    /* renamed from: p */
    private float f10316p = 0.0f;

    /* renamed from: q */
    private float f10317q = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f10318r = 0.0f;

    /* renamed from: s */
    private boolean f10319s = true;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C2898e f10320t;

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigationBehavior$a */
    class C2900a implements C1000l0 {
        C2900a() {
        }

        /* renamed from: a */
        public void mo1120a(View view) {
            if (AHBottomNavigationBehavior.this.f10320t != null) {
                AHBottomNavigationBehavior.this.f10320t.mo11556a((int) ((((float) view.getMeasuredHeight()) - view.getTranslationY()) + AHBottomNavigationBehavior.this.f10318r));
            }
        }
    }

    /* renamed from: com.aurelhubert.ahbottomnavigation.AHBottomNavigationBehavior$b */
    class C2901b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f10322a;

        C2901b(View view) {
            this.f10322a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (AHBottomNavigationBehavior.this.f10310j != null && (AHBottomNavigationBehavior.this.f10310j.getLayoutParams() instanceof MarginLayoutParams)) {
                AHBottomNavigationBehavior.this.f10315o = ((float) this.f10322a.getMeasuredHeight()) - this.f10322a.getTranslationY();
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) AHBottomNavigationBehavior.this.f10310j.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) AHBottomNavigationBehavior.this.f10315o);
                AHBottomNavigationBehavior.this.f10310j.requestLayout();
            }
            if (AHBottomNavigationBehavior.this.f10320t != null) {
                AHBottomNavigationBehavior.this.f10320t.mo11556a((int) ((((float) this.f10322a.getMeasuredHeight()) - this.f10322a.getTranslationY()) + AHBottomNavigationBehavior.this.f10318r));
            }
        }
    }

    public AHBottomNavigationBehavior() {
    }

    /* renamed from: a */
    public void mo11562a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11565a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i) {
        return false;
    }

    /* renamed from: b */
    public void mo11566b(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
    }

    /* renamed from: e */
    public void mo11568e() {
        this.f10320t = null;
    }

    /* renamed from: b */
    private TabLayout m13875b(View view) {
        int i = this.f10305e;
        if (i == 0) {
            return null;
        }
        return (TabLayout) view.findViewById(i);
    }

    /* renamed from: c */
    public void mo4008c(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.mo4008c(coordinatorLayout, v, view);
    }

    /* renamed from: d */
    public boolean mo11567d() {
        return this.f10306f;
    }

    /* renamed from: c */
    public static <V extends View> AHBottomNavigationBehavior<V> m13878c(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0716g) {
            C0712c d = ((C0716g) layoutParams).mo4027d();
            if (d instanceof AHBottomNavigationBehavior) {
                return (AHBottomNavigationBehavior) d;
            }
            throw new IllegalArgumentException("The view is not associated with AHBottomNavigationBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: a */
    public boolean mo3994a(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean a = super.mo3994a(coordinatorLayout, v, i);
        if (this.f10309i == null && this.f10305e != -1) {
            this.f10309i = m13875b((View) v);
        }
        return a;
    }

    /* renamed from: b */
    public boolean mo4004b(CoordinatorLayout coordinatorLayout, V v, View view) {
        return super.mo4004b(coordinatorLayout, v, view);
    }

    /* renamed from: b */
    public boolean mo4005b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2 || super.mo4005b(coordinatorLayout, v, view, view2, i);
    }

    /* renamed from: b */
    private void m13877b(V v, boolean z) {
        C0990i0 i0Var = this.f10307g;
        long j = 300;
        if (i0Var == null) {
            this.f10307g = C0962e0.m5428a(v);
            C0990i0 i0Var2 = this.f10307g;
            if (!z) {
                j = 0;
            }
            i0Var2.mo4825a(j);
            this.f10307g.mo4828a((C1000l0) new C2900a());
            this.f10307g.mo4826a(f10303u);
            return;
        }
        if (!z) {
            j = 0;
        }
        i0Var.mo4825a(j);
        this.f10307g.mo4830a();
    }

    /* renamed from: a */
    public boolean mo3999a(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (view == null || !(view instanceof SnackbarLayout)) {
            return super.mo3999a(coordinatorLayout, v, view);
        }
        mo11560a((View) v, view);
        return true;
    }

    public AHBottomNavigationBehavior(boolean z, int i) {
        this.f10319s = z;
        this.f10313m = i;
    }

    /* renamed from: a */
    public void mo3986a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        super.mo3986a(coordinatorLayout, v, view, i, i2, i3, i4);
        if (i2 < 0) {
            m13872a(v, -1);
        } else if (i2 > 0) {
            m13872a(v, 1);
        }
    }

    /* renamed from: a */
    private void m13872a(V v, int i) {
        if (this.f10319s) {
            if (i == -1 && this.f10306f) {
                this.f10306f = false;
                m13873a(v, 0, false, true);
            } else if (i == 1 && !this.f10306f) {
                this.f10306f = true;
                m13873a(v, v.getHeight(), false, true);
            }
        }
    }

    /* renamed from: b */
    private void m13876b(V v, int i, boolean z) {
        ObjectAnimator objectAnimator = this.f10308h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f10308h = ObjectAnimator.ofFloat(v, View.TRANSLATION_Y, new float[]{(float) i});
        this.f10308h.setDuration(z ? 300 : 0);
        this.f10308h.setInterpolator(f10303u);
        this.f10308h.addUpdateListener(new C2901b(v));
    }

    public AHBottomNavigationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2902R.styleable.AHBottomNavigationBehavior_Params);
        this.f10305e = obtainStyledAttributes.getResourceId(C2902R.styleable.AHBottomNavigationBehavior_Params_tabLayoutId, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m13873a(V v, int i, boolean z, boolean z2) {
        if (this.f10319s || z) {
            if (VERSION.SDK_INT < 19) {
                m13876b(v, i, z2);
                this.f10308h.start();
            } else {
                m13877b(v, z2);
                this.f10307g.mo4851o((float) i).mo4840e();
            }
        }
    }

    /* renamed from: a */
    public void mo11558a(int i) {
        this.f10305e = i;
    }

    /* renamed from: a */
    public void mo11564a(boolean z, int i) {
        this.f10319s = z;
        this.f10313m = i;
    }

    /* renamed from: a */
    public void mo11563a(C2898e eVar) {
        this.f10320t = eVar;
    }

    /* renamed from: a */
    public void mo11559a(V v, int i, boolean z) {
        if (!this.f10306f) {
            this.f10306f = true;
            m13873a(v, i, true, z);
        }
    }

    /* renamed from: a */
    public void mo11561a(V v, boolean z) {
        if (this.f10306f) {
            this.f10306f = false;
            m13873a(v, 0, true, z);
        }
    }

    /* renamed from: a */
    public void mo11560a(View view, View view2) {
        if (view2 != null && (view2 instanceof SnackbarLayout)) {
            this.f10310j = (SnackbarLayout) view2;
            if (this.f10312l == -1) {
                this.f10312l = view2.getHeight();
            }
            int measuredHeight = (int) (((float) view.getMeasuredHeight()) - view.getTranslationY());
            if (VERSION.SDK_INT < 21) {
                view.bringToFront();
            }
            if (view2.getLayoutParams() instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view2.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, measuredHeight);
                view2.requestLayout();
            }
        }
    }
}
