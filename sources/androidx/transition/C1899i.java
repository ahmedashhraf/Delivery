package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.core.content.p020h.C0878h;
import androidx.core.p034l.C0962e0;
import androidx.transition.C1880f0.C1888h;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.i */
/* compiled from: ChangeTransform */
public class C1899i extends C1880f0 {

    /* renamed from: K0 */
    private static final String f7322K0 = "android:changeTransform:matrix";

    /* renamed from: L0 */
    private static final String f7323L0 = "android:changeTransform:transforms";

    /* renamed from: M0 */
    private static final String f7324M0 = "android:changeTransform:parent";

    /* renamed from: N0 */
    private static final String f7325N0 = "android:changeTransform:parentMatrix";

    /* renamed from: O0 */
    private static final String f7326O0 = "android:changeTransform:intermediateParentMatrix";

    /* renamed from: P0 */
    private static final String f7327P0 = "android:changeTransform:intermediateMatrix";

    /* renamed from: Q0 */
    private static final String[] f7328Q0 = {f7322K0, f7323L0, f7325N0};

    /* renamed from: R0 */
    private static final Property<C1904e, float[]> f7329R0 = new C1900a(float[].class, "nonTranslations");

    /* renamed from: S0 */
    private static final Property<C1904e, PointF> f7330S0 = new C1901b(PointF.class, "translations");

    /* renamed from: T0 */
    private static final boolean f7331T0;

    /* renamed from: H0 */
    boolean f7332H0 = true;

    /* renamed from: I0 */
    private boolean f7333I0 = true;

    /* renamed from: J0 */
    private Matrix f7334J0 = new Matrix();

    /* renamed from: androidx.transition.i$a */
    /* compiled from: ChangeTransform */
    static class C1900a extends Property<C1904e, float[]> {
        C1900a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(C1904e eVar, float[] fArr) {
            eVar.mo8413a(fArr);
        }

        /* renamed from: a */
        public float[] get(C1904e eVar) {
            return null;
        }
    }

    /* renamed from: androidx.transition.i$b */
    /* compiled from: ChangeTransform */
    static class C1901b extends Property<C1904e, PointF> {
        C1901b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1904e eVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1904e eVar, PointF pointF) {
            eVar.mo8412a(pointF);
        }
    }

    /* renamed from: androidx.transition.i$c */
    /* compiled from: ChangeTransform */
    class C1902c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7335a;

        /* renamed from: b */
        private Matrix f7336b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f7337c;

        /* renamed from: d */
        final /* synthetic */ Matrix f7338d;

        /* renamed from: e */
        final /* synthetic */ View f7339e;

        /* renamed from: f */
        final /* synthetic */ C1905f f7340f;

        /* renamed from: g */
        final /* synthetic */ C1904e f7341g;

        C1902c(boolean z, Matrix matrix, View view, C1905f fVar, C1904e eVar) {
            this.f7337c = z;
            this.f7338d = matrix;
            this.f7339e = view;
            this.f7340f = fVar;
            this.f7341g = eVar;
        }

        /* renamed from: a */
        private void m10062a(Matrix matrix) {
            this.f7336b.set(matrix);
            this.f7339e.setTag(C1822R.C1825id.transition_transform, this.f7336b);
            this.f7340f.mo8414a(this.f7339e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f7335a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7335a) {
                if (!this.f7337c || !C1899i.this.f7332H0) {
                    this.f7339e.setTag(C1822R.C1825id.transition_transform, null);
                    this.f7339e.setTag(C1822R.C1825id.parent_matrix, null);
                } else {
                    m10062a(this.f7338d);
                }
            }
            C1953x0.m10265a(this.f7339e, (Matrix) null);
            this.f7340f.mo8414a(this.f7339e);
        }

        public void onAnimationPause(Animator animator) {
            m10062a(this.f7341g.mo8411a());
        }

        public void onAnimationResume(Animator animator) {
            C1899i.m10049f(this.f7339e);
        }
    }

    /* renamed from: androidx.transition.i$d */
    /* compiled from: ChangeTransform */
    private static class C1903d extends C1897h0 {

        /* renamed from: a */
        private View f7343a;

        /* renamed from: b */
        private C1929o f7344b;

        C1903d(View view, C1929o oVar) {
            this.f7343a = view;
            this.f7344b = oVar;
        }

        /* renamed from: b */
        public void mo8301b(@C0193h0 C1880f0 f0Var) {
            this.f7344b.setVisibility(4);
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            f0Var.mo8342b((C1888h) this);
            C1939s.m10231a(this.f7343a);
            this.f7343a.setTag(C1822R.C1825id.transition_transform, null);
            this.f7343a.setTag(C1822R.C1825id.parent_matrix, null);
        }

        /* renamed from: e */
        public void mo8304e(@C0193h0 C1880f0 f0Var) {
            this.f7344b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.i$e */
    /* compiled from: ChangeTransform */
    private static class C1904e {

        /* renamed from: a */
        private final Matrix f7345a = new Matrix();

        /* renamed from: b */
        private final View f7346b;

        /* renamed from: c */
        private final float[] f7347c;

        /* renamed from: d */
        private float f7348d;

        /* renamed from: e */
        private float f7349e;

        C1904e(View view, float[] fArr) {
            this.f7346b = view;
            this.f7347c = (float[]) fArr.clone();
            float[] fArr2 = this.f7347c;
            this.f7348d = fArr2[2];
            this.f7349e = fArr2[5];
            m10066b();
        }

        /* renamed from: b */
        private void m10066b() {
            float[] fArr = this.f7347c;
            fArr[2] = this.f7348d;
            fArr[5] = this.f7349e;
            this.f7345a.setValues(fArr);
            C1953x0.m10265a(this.f7346b, this.f7345a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8413a(float[] fArr) {
            System.arraycopy(fArr, 0, this.f7347c, 0, fArr.length);
            m10066b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8412a(PointF pointF) {
            this.f7348d = pointF.x;
            this.f7349e = pointF.y;
            m10066b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Matrix mo8411a() {
            return this.f7345a;
        }
    }

    /* renamed from: androidx.transition.i$f */
    /* compiled from: ChangeTransform */
    private static class C1905f {

        /* renamed from: a */
        final float f7350a;

        /* renamed from: b */
        final float f7351b;

        /* renamed from: c */
        final float f7352c;

        /* renamed from: d */
        final float f7353d;

        /* renamed from: e */
        final float f7354e;

        /* renamed from: f */
        final float f7355f;

        /* renamed from: g */
        final float f7356g;

        /* renamed from: h */
        final float f7357h;

        C1905f(View view) {
            this.f7350a = view.getTranslationX();
            this.f7351b = view.getTranslationY();
            this.f7352c = C0962e0.m5418V(view);
            this.f7353d = view.getScaleX();
            this.f7354e = view.getScaleY();
            this.f7355f = view.getRotationX();
            this.f7356g = view.getRotationY();
            this.f7357h = view.getRotation();
        }

        /* renamed from: a */
        public void mo8414a(View view) {
            C1899i.m10044a(view, this.f7350a, this.f7351b, this.f7352c, this.f7353d, this.f7354e, this.f7355f, this.f7356g, this.f7357h);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C1905f)) {
                return false;
            }
            C1905f fVar = (C1905f) obj;
            if (fVar.f7350a == this.f7350a && fVar.f7351b == this.f7351b && fVar.f7352c == this.f7352c && fVar.f7353d == this.f7353d && fVar.f7354e == this.f7354e && fVar.f7355f == this.f7355f && fVar.f7356g == this.f7356g && fVar.f7357h == this.f7357h) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            float f = this.f7350a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f7351b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f7352c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f7353d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f7354e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f7355f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f7356g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f7357h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 21) {
            z = true;
        }
        f7331T0 = z;
    }

    public C1899i() {
    }

    /* renamed from: b */
    private void m10046b(ViewGroup viewGroup, C1922m0 m0Var, C1922m0 m0Var2) {
        View view = m0Var2.f7404b;
        Matrix matrix = new Matrix((Matrix) m0Var2.f7403a.get(f7325N0));
        C1953x0.m10269c(viewGroup, matrix);
        C1929o a = C1939s.m10230a(view, viewGroup, matrix);
        if (a != null) {
            a.mo8437a((ViewGroup) m0Var.f7403a.get(f7324M0), m0Var.f7404b);
            C1880f0 f0Var = this;
            while (true) {
                C1880f0 f0Var2 = f0Var.f7281c0;
                if (f0Var2 == null) {
                    break;
                }
                f0Var = f0Var2;
            }
            f0Var.mo8324a((C1888h) new C1903d(view, a));
            if (f7331T0) {
                View view2 = m0Var.f7404b;
                if (view2 != m0Var2.f7404b) {
                    C1953x0.m10262a(view2, 0.0f);
                }
                C1953x0.m10262a(view, 1.0f);
            }
        }
    }

    /* renamed from: f */
    static void m10049f(View view) {
        m10044a(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m10048d(m0Var);
    }

    /* renamed from: c */
    public void mo8396c(boolean z) {
        this.f7333I0 = z;
    }

    /* renamed from: d */
    public void mo8397d(boolean z) {
        this.f7332H0 = z;
    }

    /* renamed from: o */
    public String[] mo8272o() {
        return f7328Q0;
    }

    /* renamed from: r */
    public boolean mo8273r() {
        return this.f7333I0;
    }

    /* renamed from: s */
    public boolean mo8398s() {
        return this.f7332H0;
    }

    /* renamed from: d */
    private void m10048d(C1922m0 m0Var) {
        View view = m0Var.f7404b;
        if (view.getVisibility() != 8) {
            m0Var.f7403a.put(f7324M0, view.getParent());
            m0Var.f7403a.put(f7323L0, new C1905f(view));
            Matrix matrix = view.getMatrix();
            m0Var.f7403a.put(f7322K0, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f7333I0) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C1953x0.m10267b(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                m0Var.f7403a.put(f7325N0, matrix2);
                m0Var.f7403a.put(f7327P0, view.getTag(C1822R.C1825id.transition_transform));
                m0Var.f7403a.put(f7326O0, view.getTag(C1822R.C1825id.parent_matrix));
            }
        }
    }

    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, C1922m0 m0Var, C1922m0 m0Var2) {
        if (!(m0Var == null || m0Var2 == null)) {
            Map<String, Object> map = m0Var.f7403a;
            String str = f7324M0;
            if (map.containsKey(str) && m0Var2.f7403a.containsKey(str)) {
                ViewGroup viewGroup2 = (ViewGroup) m0Var.f7403a.get(str);
                boolean z = this.f7333I0 && !m10045a(viewGroup2, (ViewGroup) m0Var2.f7403a.get(str));
                Matrix matrix = (Matrix) m0Var.f7403a.get(f7327P0);
                if (matrix != null) {
                    m0Var.f7403a.put(f7322K0, matrix);
                }
                Matrix matrix2 = (Matrix) m0Var.f7403a.get(f7326O0);
                if (matrix2 != null) {
                    m0Var.f7403a.put(f7325N0, matrix2);
                }
                if (z) {
                    m10047b(m0Var, m0Var2);
                }
                ObjectAnimator a = m10043a(m0Var, m0Var2, z);
                if (z && a != null && this.f7332H0) {
                    m10046b(viewGroup, m0Var, m0Var2);
                } else if (!f7331T0) {
                    viewGroup2.endViewTransition(m0Var.f7404b);
                }
                return a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m10048d(m0Var);
        if (!f7331T0) {
            ((ViewGroup) m0Var.f7404b.getParent()).startViewTransition(m0Var.f7404b);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public C1899i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7192g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f7332H0 = C0878h.m5074a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f7333I0 = C0878h.m5074a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m10047b(C1922m0 m0Var, C1922m0 m0Var2) {
        Map<String, Object> map = m0Var2.f7403a;
        String str = f7325N0;
        Matrix matrix = (Matrix) map.get(str);
        m0Var2.f7404b.setTag(C1822R.C1825id.parent_matrix, matrix);
        Matrix matrix2 = this.f7334J0;
        matrix2.reset();
        matrix.invert(matrix2);
        Map<String, Object> map2 = m0Var.f7403a;
        String str2 = f7322K0;
        Matrix matrix3 = (Matrix) map2.get(str2);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            m0Var.f7403a.put(str2, matrix3);
        }
        matrix3.postConcat((Matrix) m0Var.f7403a.get(str));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: a */
    private ObjectAnimator m10043a(C1922m0 m0Var, C1922m0 m0Var2, boolean z) {
        Map<String, Object> map = m0Var.f7403a;
        String str = f7322K0;
        Matrix matrix = (Matrix) map.get(str);
        Matrix matrix2 = (Matrix) m0Var2.f7403a.get(str);
        if (matrix == null) {
            matrix = C1944u.f7464a;
        }
        if (matrix2 == null) {
            matrix2 = C1944u.f7464a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C1905f fVar = (C1905f) m0Var2.f7403a.get(f7323L0);
        View view = m0Var2.f7404b;
        m10049f(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1904e eVar = new C1904e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f7329R0, new C1921m(new float[9]), new float[][]{fArr, fArr2}), C1958z.m10284a(f7330S0, mo8365h().mo8239a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C1902c cVar = new C1902c(z, matrix3, view, fVar, eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C1826a.m9801a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    private boolean m10045a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (mo8350b((View) viewGroup) && mo8350b((View) viewGroup2)) {
            C1922m0 c = mo8353c(viewGroup, true);
            if (c == null || viewGroup2 != c.f7404b) {
                return false;
            }
        } else if (viewGroup != viewGroup2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static void m10044a(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C0962e0.m5530l(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }
}
