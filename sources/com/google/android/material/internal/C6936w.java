package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1054x;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.w */
/* compiled from: ViewUtils */
public class C6936w {

    /* renamed from: com.google.android.material.internal.w$a */
    /* compiled from: ViewUtils */
    static class C6937a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f19406a;

        C6937a(View view) {
            this.f19406a = view;
        }

        public void run() {
            ((InputMethodManager) this.f19406a.getContext().getSystemService("input_method")).showSoftInput(this.f19406a, 1);
        }
    }

    /* renamed from: com.google.android.material.internal.w$b */
    /* compiled from: ViewUtils */
    static class C6938b implements C6941e {

        /* renamed from: a */
        final /* synthetic */ boolean f19407a;

        /* renamed from: b */
        final /* synthetic */ boolean f19408b;

        /* renamed from: c */
        final /* synthetic */ boolean f19409c;

        /* renamed from: d */
        final /* synthetic */ C6941e f19410d;

        C6938b(boolean z, boolean z2, boolean z3, C6941e eVar) {
            this.f19407a = z;
            this.f19408b = z2;
            this.f19409c = z3;
            this.f19410d = eVar;
        }

        @C0193h0
        /* renamed from: a */
        public C1006n0 mo22334a(View view, @C0193h0 C1006n0 n0Var, @C0193h0 C6942f fVar) {
            if (this.f19407a) {
                fVar.f19416d += n0Var.mo4885i();
            }
            boolean e = C6936w.m33301e(view);
            if (this.f19408b) {
                if (e) {
                    fVar.f19415c += n0Var.mo4886j();
                } else {
                    fVar.f19413a += n0Var.mo4886j();
                }
            }
            if (this.f19409c) {
                if (e) {
                    fVar.f19413a += n0Var.mo4887k();
                } else {
                    fVar.f19415c += n0Var.mo4887k();
                }
            }
            fVar.mo27675a(view);
            C6941e eVar = this.f19410d;
            return eVar != null ? eVar.mo22334a(view, n0Var, fVar) : n0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.w$c */
    /* compiled from: ViewUtils */
    static class C6939c implements C1054x {

        /* renamed from: a */
        final /* synthetic */ C6941e f19411a;

        /* renamed from: b */
        final /* synthetic */ C6942f f19412b;

        C6939c(C6941e eVar, C6942f fVar) {
            this.f19411a = eVar;
            this.f19412b = fVar;
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, C1006n0 n0Var) {
            return this.f19411a.mo22334a(view, n0Var, new C6942f(this.f19412b));
        }
    }

    /* renamed from: com.google.android.material.internal.w$d */
    /* compiled from: ViewUtils */
    static class C6940d implements OnAttachStateChangeListener {
        C6940d() {
        }

        public void onViewAttachedToWindow(@C0193h0 View view) {
            view.removeOnAttachStateChangeListener(this);
            C0962e0.m5563v0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.w$e */
    /* compiled from: ViewUtils */
    public interface C6941e {
        /* renamed from: a */
        C1006n0 mo22334a(View view, C1006n0 n0Var, C6942f fVar);
    }

    /* renamed from: com.google.android.material.internal.w$f */
    /* compiled from: ViewUtils */
    public static class C6942f {

        /* renamed from: a */
        public int f19413a;

        /* renamed from: b */
        public int f19414b;

        /* renamed from: c */
        public int f19415c;

        /* renamed from: d */
        public int f19416d;

        public C6942f(int i, int i2, int i3, int i4) {
            this.f19413a = i;
            this.f19414b = i2;
            this.f19415c = i3;
            this.f19416d = i4;
        }

        /* renamed from: a */
        public void mo27675a(View view) {
            C0962e0.m5473b(view, this.f19413a, this.f19414b, this.f19415c, this.f19416d);
        }

        public C6942f(@C0193h0 C6942f fVar) {
            this.f19413a = fVar.f19413a;
            this.f19414b = fVar.f19414b;
            this.f19415c = fVar.f19415c;
            this.f19416d = fVar.f19416d;
        }
    }

    private C6936w() {
    }

    /* renamed from: a */
    public static Mode m33293a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    @C0195i0
    /* renamed from: b */
    public static C6935v m33298b(@C0193h0 View view) {
        return m33299c(m33294a(view));
    }

    @C0195i0
    /* renamed from: c */
    public static C6935v m33299c(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C6934u(view);
        }
        return C6932t.m33277c(view);
    }

    /* renamed from: d */
    public static float m33300d(@C0193h0 View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C0962e0.m5551r((View) parent);
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m33301e(View view) {
        return C0962e0.m5566x(view) == 1;
    }

    /* renamed from: f */
    public static void m33302f(@C0193h0 View view) {
        if (C0962e0.m5515h0(view)) {
            C0962e0.m5563v0(view);
        } else {
            view.addOnAttachStateChangeListener(new C6940d());
        }
    }

    /* renamed from: g */
    public static void m33303g(@C0193h0 View view) {
        view.requestFocus();
        view.post(new C6937a(view));
    }

    /* renamed from: a */
    public static float m33292a(@C0193h0 Context context, @C0211p(unit = 0) int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static void m33295a(@C0193h0 View view, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        m33296a(view, attributeSet, i, i2, null);
    }

    /* renamed from: a */
    public static void m33296a(@C0193h0 View view, @C0195i0 AttributeSet attributeSet, int i, int i2, @C0195i0 C6941e eVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C5582R.styleable.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C5582R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C5582R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(C5582R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m33297a(view, (C6941e) new C6938b(z, z2, z3, eVar));
    }

    /* renamed from: a */
    public static void m33297a(@C0193h0 View view, @C0193h0 C6941e eVar) {
        C0962e0.m5448a(view, (C1054x) new C6939c(eVar, new C6942f(C0962e0.m5405I(view), view.getPaddingTop(), C0962e0.m5404H(view), view.getPaddingBottom())));
        m33302f(view);
    }

    @C0195i0
    /* renamed from: a */
    public static ViewGroup m33294a(@C0195i0 View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }
}
