package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.content.p020h.C0878h;
import androidx.core.p034l.C0962e0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.d0 */
/* compiled from: Slide */
public class C1837d0 extends C1873e1 {

    /* renamed from: Q0 */
    private static final TimeInterpolator f7126Q0 = new DecelerateInterpolator();

    /* renamed from: R0 */
    private static final TimeInterpolator f7127R0 = new AccelerateInterpolator();

    /* renamed from: S0 */
    private static final String f7128S0 = "android:slide:screenPosition";

    /* renamed from: T0 */
    private static final C1844g f7129T0 = new C1838a();

    /* renamed from: U0 */
    private static final C1844g f7130U0 = new C1839b();

    /* renamed from: V0 */
    private static final C1844g f7131V0 = new C1840c();

    /* renamed from: W0 */
    private static final C1844g f7132W0 = new C1841d();

    /* renamed from: X0 */
    private static final C1844g f7133X0 = new C1842e();

    /* renamed from: Y0 */
    private static final C1844g f7134Y0 = new C1843f();

    /* renamed from: O0 */
    private C1844g f7135O0 = f7134Y0;

    /* renamed from: P0 */
    private int f7136P0 = 80;

    /* renamed from: androidx.transition.d0$a */
    /* compiled from: Slide */
    static class C1838a extends C1845h {
        C1838a() {
            super(null);
        }

        /* renamed from: b */
        public float mo8266b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.d0$b */
    /* compiled from: Slide */
    static class C1839b extends C1845h {
        C1839b() {
            super(null);
        }

        /* renamed from: b */
        public float mo8266b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C0962e0.m5566x(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.d0$c */
    /* compiled from: Slide */
    static class C1840c extends C1846i {
        C1840c() {
            super(null);
        }

        /* renamed from: a */
        public float mo8267a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.d0$d */
    /* compiled from: Slide */
    static class C1841d extends C1845h {
        C1841d() {
            super(null);
        }

        /* renamed from: b */
        public float mo8266b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.d0$e */
    /* compiled from: Slide */
    static class C1842e extends C1845h {
        C1842e() {
            super(null);
        }

        /* renamed from: b */
        public float mo8266b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C0962e0.m5566x(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.d0$f */
    /* compiled from: Slide */
    static class C1843f extends C1846i {
        C1843f() {
            super(null);
        }

        /* renamed from: a */
        public float mo8267a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.d0$g */
    /* compiled from: Slide */
    private interface C1844g {
        /* renamed from: a */
        float mo8267a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo8266b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.d0$h */
    /* compiled from: Slide */
    private static abstract class C1845h implements C1844g {
        private C1845h() {
        }

        /* renamed from: a */
        public float mo8267a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ C1845h(C1838a aVar) {
            this();
        }
    }

    /* renamed from: androidx.transition.d0$i */
    /* compiled from: Slide */
    private static abstract class C1846i implements C1844g {
        private C1846i() {
        }

        /* renamed from: b */
        public float mo8266b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ C1846i(C1838a aVar) {
            this();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.d0$j */
    /* compiled from: Slide */
    public @interface C1847j {
    }

    public C1837d0() {
        mo8264d(80);
    }

    /* renamed from: e */
    private void m9837e(C1922m0 m0Var) {
        int[] iArr = new int[2];
        m0Var.f7404b.getLocationOnScreen(iArr);
        m0Var.f7403a.put(f7128S0, iArr);
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        super.mo8261a(m0Var);
        m9837e(m0Var);
    }

    /* renamed from: b */
    public Animator mo8262b(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        if (m0Var == null) {
            return null;
        }
        int[] iArr = (int[]) m0Var.f7403a.get(f7128S0);
        return C1930o0.m10194a(view, m0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f7135O0.mo8266b(viewGroup, view), this.f7135O0.mo8267a(viewGroup, view), f7127R0, this);
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        super.mo8263c(m0Var);
        m9837e(m0Var);
    }

    /* renamed from: d */
    public void mo8264d(int i) {
        if (i == 3) {
            this.f7135O0 = f7129T0;
        } else if (i == 5) {
            this.f7135O0 = f7132W0;
        } else if (i == 48) {
            this.f7135O0 = f7131V0;
        } else if (i == 80) {
            this.f7135O0 = f7134Y0;
        } else if (i == 8388611) {
            this.f7135O0 = f7130U0;
        } else if (i == 8388613) {
            this.f7135O0 = f7133X0;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f7136P0 = i;
        C1834c0 c0Var = new C1834c0();
        c0Var.mo8254a(i);
        mo8334a((C1911j0) c0Var);
    }

    /* renamed from: s */
    public int mo8265s() {
        return this.f7136P0;
    }

    /* renamed from: a */
    public Animator mo8260a(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        if (m0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) m0Var2.f7403a.get(f7128S0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1930o0.m10194a(view, m0Var2, iArr[0], iArr[1], this.f7135O0.mo8266b(viewGroup, view), this.f7135O0.mo8267a(viewGroup, view), translationX, translationY, f7126Q0, this);
    }

    public C1837d0(int i) {
        mo8264d(i);
    }

    @SuppressLint({"RestrictedApi"})
    public C1837d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7193h);
        int b = C0878h.m5077b(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo8264d(b);
    }
}
