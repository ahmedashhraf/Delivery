package androidx.core.p034l;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.WindowInsets;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.l.n0 */
/* compiled from: WindowInsetsCompat */
public class C1006n0 {

    /* renamed from: a */
    private final Object f4453a;

    private C1006n0(Object obj) {
        this.f4453a = obj;
    }

    /* renamed from: a */
    public C1006n0 mo4874a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C1006n0((Object) ((WindowInsets) this.f4453a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public C1006n0 mo4876b() {
        if (VERSION.SDK_INT >= 21) {
            return new C1006n0((Object) ((WindowInsets) this.f4453a).consumeStableInsets());
        }
        return null;
    }

    /* renamed from: c */
    public C1006n0 mo4877c() {
        if (VERSION.SDK_INT >= 20) {
            return new C1006n0((Object) ((WindowInsets) this.f4453a).consumeSystemWindowInsets());
        }
        return null;
    }

    @C0195i0
    /* renamed from: d */
    public C0954c mo4878d() {
        if (VERSION.SDK_INT >= 28) {
            return C0954c.m5381a(((WindowInsets) this.f4453a).getDisplayCutout());
        }
        return null;
    }

    /* renamed from: e */
    public int mo4879e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4453a).getStableInsetBottom();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1006n0.class != obj.getClass()) {
            return false;
        }
        C1006n0 n0Var = (C1006n0) obj;
        Object obj2 = this.f4453a;
        Object obj3 = n0Var.f4453a;
        if (obj2 != null) {
            z = obj2.equals(obj3);
        } else if (obj3 != null) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public int mo4881f() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4453a).getStableInsetLeft();
        }
        return 0;
    }

    /* renamed from: g */
    public int mo4882g() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4453a).getStableInsetRight();
        }
        return 0;
    }

    /* renamed from: h */
    public int mo4883h() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4453a).getStableInsetTop();
        }
        return 0;
    }

    public int hashCode() {
        Object obj = this.f4453a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: i */
    public int mo4885i() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: j */
    public int mo4886j() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: k */
    public int mo4887k() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: l */
    public int mo4888l() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: m */
    public boolean mo4889m() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).hasInsets();
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo4890n() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4453a).hasStableInsets();
        }
        return false;
    }

    /* renamed from: o */
    public boolean mo4891o() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).hasSystemWindowInsets();
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo4892p() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f4453a).isConsumed();
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo4893q() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f4453a).isRound();
        }
        return false;
    }

    public C1006n0(C1006n0 n0Var) {
        WindowInsets windowInsets = null;
        if (VERSION.SDK_INT >= 20) {
            if (n0Var != null) {
                windowInsets = new WindowInsets((WindowInsets) n0Var.f4453a);
            }
            this.f4453a = windowInsets;
            return;
        }
        this.f4453a = null;
    }

    /* renamed from: a */
    public C1006n0 mo4875a(Rect rect) {
        if (VERSION.SDK_INT >= 21) {
            return new C1006n0((Object) ((WindowInsets) this.f4453a).replaceSystemWindowInsets(rect));
        }
        return null;
    }

    /* renamed from: a */
    public C1006n0 mo4873a() {
        return VERSION.SDK_INT >= 28 ? new C1006n0((Object) ((WindowInsets) this.f4453a).consumeDisplayCutout()) : this;
    }

    /* renamed from: a */
    static C1006n0 m5755a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1006n0(obj);
    }

    /* renamed from: a */
    static Object m5756a(C1006n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return n0Var.f4453a;
    }
}
