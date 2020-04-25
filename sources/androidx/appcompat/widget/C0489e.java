package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.appcompat.widget.e */
/* compiled from: AppCompatBackgroundHelper */
class C0489e {

    /* renamed from: a */
    private final View f1939a;

    /* renamed from: b */
    private final C0510i f1940b;

    /* renamed from: c */
    private int f1941c = -1;

    /* renamed from: d */
    private C0545r0 f1942d;

    /* renamed from: e */
    private C0545r0 f1943e;

    /* renamed from: f */
    private C0545r0 f1944f;

    C0489e(View view) {
        this.f1939a = view;
        this.f1940b = C0510i.m2770b();
    }

    /* renamed from: d */
    private boolean m2653d() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1942d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2531a(AttributeSet attributeSet, int i) {
        C0549t0 a = C0549t0.m2910a(this.f1939a.getContext(), attributeSet, C0238R.styleable.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo2892j(C0238R.styleable.ViewBackgroundHelper_android_background)) {
                this.f1941c = a.mo2888g(C0238R.styleable.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f1940b.mo2675b(this.f1939a.getContext(), this.f1941c);
                if (b != null) {
                    mo2528a(b);
                }
            }
            if (a.mo2892j(C0238R.styleable.ViewBackgroundHelper_backgroundTint)) {
                C0962e0.m5436a(this.f1939a, a.mo2868a(C0238R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo2892j(C0238R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                C0962e0.m5438a(this.f1939a, C0469a0.m2594a(a.mo2880d(C0238R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo2887f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2533b(ColorStateList colorStateList) {
        if (this.f1943e == null) {
            this.f1943e = new C0545r0();
        }
        C0545r0 r0Var = this.f1943e;
        r0Var.f2179a = colorStateList;
        r0Var.f2182d = true;
        mo2526a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo2534c() {
        C0545r0 r0Var = this.f1943e;
        if (r0Var != null) {
            return r0Var.f2180b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo2532b() {
        C0545r0 r0Var = this.f1943e;
        if (r0Var != null) {
            return r0Var.f2179a;
        }
        return null;
    }

    /* renamed from: b */
    private boolean m2652b(@C0193h0 Drawable drawable) {
        if (this.f1944f == null) {
            this.f1944f = new C0545r0();
        }
        C0545r0 r0Var = this.f1944f;
        r0Var.mo2850a();
        ColorStateList n = C0962e0.m5537n(this.f1939a);
        if (n != null) {
            r0Var.f2182d = true;
            r0Var.f2179a = n;
        }
        Mode o = C0962e0.m5541o(this.f1939a);
        if (o != null) {
            r0Var.f2181c = true;
            r0Var.f2180b = o;
        }
        if (!r0Var.f2182d && !r0Var.f2181c) {
            return false;
        }
        C0510i.m2769a(drawable, r0Var, this.f1939a.getDrawableState());
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2527a(int i) {
        this.f1941c = i;
        C0510i iVar = this.f1940b;
        mo2528a(iVar != null ? iVar.mo2675b(this.f1939a.getContext(), i) : null);
        mo2526a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2530a(Drawable drawable) {
        this.f1941c = -1;
        mo2528a((ColorStateList) null);
        mo2526a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2529a(Mode mode) {
        if (this.f1943e == null) {
            this.f1943e = new C0545r0();
        }
        C0545r0 r0Var = this.f1943e;
        r0Var.f2180b = mode;
        r0Var.f2181c = true;
        mo2526a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2526a() {
        Drawable background = this.f1939a.getBackground();
        if (background != null && (!m2653d() || !m2652b(background))) {
            C0545r0 r0Var = this.f1943e;
            if (r0Var != null) {
                C0510i.m2769a(background, r0Var, this.f1939a.getDrawableState());
            } else {
                C0545r0 r0Var2 = this.f1942d;
                if (r0Var2 != null) {
                    C0510i.m2769a(background, r0Var2, this.f1939a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2528a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1942d == null) {
                this.f1942d = new C0545r0();
            }
            C0545r0 r0Var = this.f1942d;
            r0Var.f2179a = colorStateList;
            r0Var.f2182d = true;
        } else {
            this.f1942d = null;
        }
        mo2526a();
    }
}
