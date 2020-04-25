package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.widget.C1113f;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.m */
/* compiled from: AppCompatImageHelper */
public class C0529m {

    /* renamed from: a */
    private final ImageView f2109a;

    /* renamed from: b */
    private C0545r0 f2110b;

    /* renamed from: c */
    private C0545r0 f2111c;

    /* renamed from: d */
    private C0545r0 f2112d;

    public C0529m(ImageView imageView) {
        this.f2109a = imageView;
    }

    /* renamed from: e */
    private boolean m2833e() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f2110b == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public void mo2796a(AttributeSet attributeSet, int i) {
        C0549t0 a = C0549t0.m2910a(this.f2109a.getContext(), attributeSet, C0238R.styleable.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f2109a.getDrawable();
            if (drawable == null) {
                int g = a.mo2888g(C0238R.styleable.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0242a.m1109c(this.f2109a.getContext(), g);
                    if (drawable != null) {
                        this.f2109a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0469a0.m2596b(drawable);
            }
            if (a.mo2892j(C0238R.styleable.AppCompatImageView_tint)) {
                C1113f.m6334a(this.f2109a, a.mo2868a(C0238R.styleable.AppCompatImageView_tint));
            }
            if (a.mo2892j(C0238R.styleable.AppCompatImageView_tintMode)) {
                C1113f.m6335a(this.f2109a, C0469a0.m2594a(a.mo2880d(C0238R.styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo2887f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2798b(ColorStateList colorStateList) {
        if (this.f2111c == null) {
            this.f2111c = new C0545r0();
        }
        C0545r0 r0Var = this.f2111c;
        r0Var.f2179a = colorStateList;
        r0Var.f2182d = true;
        mo2792a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo2799c() {
        C0545r0 r0Var = this.f2111c;
        if (r0Var != null) {
            return r0Var.f2180b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2800d() {
        return VERSION.SDK_INT < 21 || !(this.f2109a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo2797b() {
        C0545r0 r0Var = this.f2111c;
        if (r0Var != null) {
            return r0Var.f2179a;
        }
        return null;
    }

    /* renamed from: a */
    public void mo2793a(int i) {
        if (i != 0) {
            Drawable c = C0242a.m1109c(this.f2109a.getContext(), i);
            if (c != null) {
                C0469a0.m2596b(c);
            }
            this.f2109a.setImageDrawable(c);
        } else {
            this.f2109a.setImageDrawable(null);
        }
        mo2792a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2795a(Mode mode) {
        if (this.f2111c == null) {
            this.f2111c = new C0545r0();
        }
        C0545r0 r0Var = this.f2111c;
        r0Var.f2180b = mode;
        r0Var.f2181c = true;
        mo2792a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2792a() {
        Drawable drawable = this.f2109a.getDrawable();
        if (drawable != null) {
            C0469a0.m2596b(drawable);
        }
        if (drawable != null && (!m2833e() || !m2832a(drawable))) {
            C0545r0 r0Var = this.f2111c;
            if (r0Var != null) {
                C0510i.m2769a(drawable, r0Var, this.f2109a.getDrawableState());
            } else {
                C0545r0 r0Var2 = this.f2110b;
                if (r0Var2 != null) {
                    C0510i.m2769a(drawable, r0Var2, this.f2109a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2794a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2110b == null) {
                this.f2110b = new C0545r0();
            }
            C0545r0 r0Var = this.f2110b;
            r0Var.f2179a = colorStateList;
            r0Var.f2182d = true;
        } else {
            this.f2110b = null;
        }
        mo2792a();
    }

    /* renamed from: a */
    private boolean m2832a(@C0193h0 Drawable drawable) {
        if (this.f2112d == null) {
            this.f2112d = new C0545r0();
        }
        C0545r0 r0Var = this.f2112d;
        r0Var.mo2850a();
        ColorStateList a = C1113f.m6333a(this.f2109a);
        if (a != null) {
            r0Var.f2182d = true;
            r0Var.f2179a = a;
        }
        Mode b = C1113f.m6336b(this.f2109a);
        if (b != null) {
            r0Var.f2181c = true;
            r0Var.f2180b = b;
        }
        if (!r0Var.f2182d && !r0Var.f2181c) {
            return false;
        }
        C0510i.m2769a(drawable, r0Var, this.f2109a.getDrawableState());
        return true;
    }
}
