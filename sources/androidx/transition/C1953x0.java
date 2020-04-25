package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Property;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.transition.x0 */
/* compiled from: ViewUtils */
class C1953x0 {

    /* renamed from: a */
    private static final C1848d1 f7479a;

    /* renamed from: b */
    private static final String f7480b = "ViewUtils";

    /* renamed from: c */
    static final Property<View, Float> f7481c = new C1954a(Float.class, "translationAlpha");

    /* renamed from: d */
    static final Property<View, Rect> f7482d = new C1955b(Rect.class, "clipBounds");

    /* renamed from: androidx.transition.x0$a */
    /* compiled from: ViewUtils */
    static class C1954a extends Property<View, Float> {
        C1954a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1953x0.m10268c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C1953x0.m10262a(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.x0$b */
    /* compiled from: ViewUtils */
    static class C1955b extends Property<View, Rect> {
        C1955b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C0962e0.m5545p(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C0962e0.m5439a(view, rect);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            f7479a = new C1835c1();
        } else if (i >= 23) {
            f7479a = new C1832b1();
        } else if (i >= 22) {
            f7479a = new C1829a1();
        } else if (i >= 21) {
            f7479a = new C1959z0();
        } else if (i >= 19) {
            f7479a = new C1957y0();
        } else {
            f7479a = new C1848d1();
        }
    }

    private C1953x0() {
    }

    /* renamed from: a */
    static void m10262a(@C0193h0 View view, float f) {
        f7479a.mo8255a(view, f);
    }

    /* renamed from: b */
    static C1951w0 m10266b(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C1949v0(view);
        }
        return C1946u0.m10242c(view);
    }

    /* renamed from: c */
    static float m10268c(@C0193h0 View view) {
        return f7479a.mo8257b(view);
    }

    /* renamed from: d */
    static C1909i1 m10270d(@C0193h0 View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C1898h1(view);
        }
        return new C1895g1(view.getWindowToken());
    }

    /* renamed from: e */
    static void m10271e(@C0193h0 View view) {
        f7479a.mo8269c(view);
    }

    /* renamed from: a */
    static void m10261a(@C0193h0 View view) {
        f7479a.mo8268a(view);
    }

    /* renamed from: c */
    static void m10269c(@C0193h0 View view, @C0193h0 Matrix matrix) {
        f7479a.mo8259c(view, matrix);
    }

    /* renamed from: a */
    static void m10263a(@C0193h0 View view, int i) {
        f7479a.mo8251a(view, i);
    }

    /* renamed from: a */
    static void m10265a(@C0193h0 View view, @C0195i0 Matrix matrix) {
        f7479a.mo8256a(view, matrix);
    }

    /* renamed from: b */
    static void m10267b(@C0193h0 View view, @C0193h0 Matrix matrix) {
        f7479a.mo8258b(view, matrix);
    }

    /* renamed from: a */
    static void m10264a(@C0193h0 View view, int i, int i2, int i3, int i4) {
        f7479a.mo8237a(view, i, i2, i3, i4);
    }
}
