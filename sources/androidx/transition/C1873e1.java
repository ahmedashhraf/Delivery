package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.content.p020h.C0878h;
import androidx.transition.C1880f0.C1888h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* renamed from: androidx.transition.e1 */
/* compiled from: Visibility */
public abstract class C1873e1 extends C1880f0 {

    /* renamed from: I0 */
    static final String f7221I0 = "android:visibility:visibility";

    /* renamed from: J0 */
    private static final String f7222J0 = "android:visibility:parent";

    /* renamed from: K0 */
    private static final String f7223K0 = "android:visibility:screenLocation";

    /* renamed from: L0 */
    public static final int f7224L0 = 1;

    /* renamed from: M0 */
    public static final int f7225M0 = 2;

    /* renamed from: N0 */
    private static final String[] f7226N0 = {f7221I0, f7222J0};

    /* renamed from: H0 */
    private int f7227H0 = 3;

    /* renamed from: androidx.transition.e1$a */
    /* compiled from: Visibility */
    class C1874a extends C1897h0 {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7228a;

        /* renamed from: b */
        final /* synthetic */ View f7229b;

        /* renamed from: c */
        final /* synthetic */ View f7230c;

        C1874a(ViewGroup viewGroup, View view, View view2) {
            this.f7228a = viewGroup;
            this.f7229b = view;
            this.f7230c = view2;
        }

        /* renamed from: b */
        public void mo8301b(@C0193h0 C1880f0 f0Var) {
            C1940s0.m10233a(this.f7228a).mo8447b(this.f7229b);
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            this.f7230c.setTag(C1822R.C1825id.save_overlay_view, null);
            C1940s0.m10233a(this.f7228a).mo8447b(this.f7229b);
            f0Var.mo8342b((C1888h) this);
        }

        /* renamed from: e */
        public void mo8304e(@C0193h0 C1880f0 f0Var) {
            if (this.f7229b.getParent() == null) {
                C1940s0.m10233a(this.f7228a).mo8446a(this.f7229b);
            } else {
                C1873e1.this.cancel();
            }
        }
    }

    /* renamed from: androidx.transition.e1$b */
    /* compiled from: Visibility */
    private static class C1875b extends AnimatorListenerAdapter implements C1888h, C1827a {

        /* renamed from: a */
        private final View f7232a;

        /* renamed from: b */
        private final int f7233b;

        /* renamed from: c */
        private final ViewGroup f7234c;

        /* renamed from: d */
        private final boolean f7235d;

        /* renamed from: e */
        private boolean f7236e;

        /* renamed from: f */
        boolean f7237f = false;

        C1875b(View view, int i, boolean z) {
            this.f7232a = view;
            this.f7233b = i;
            this.f7234c = (ViewGroup) view.getParent();
            this.f7235d = z;
            m9909a(true);
        }

        /* renamed from: a */
        private void m9908a() {
            if (!this.f7237f) {
                C1953x0.m10263a(this.f7232a, this.f7233b);
                ViewGroup viewGroup = this.f7234c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m9909a(false);
        }

        /* renamed from: a */
        public void mo8312a(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: b */
        public void mo8301b(@C0193h0 C1880f0 f0Var) {
            m9909a(false);
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            m9908a();
            f0Var.mo8342b((C1888h) this);
        }

        /* renamed from: d */
        public void mo8303d(@C0193h0 C1880f0 f0Var) {
        }

        /* renamed from: e */
        public void mo8304e(@C0193h0 C1880f0 f0Var) {
            m9909a(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f7237f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m9908a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f7237f) {
                C1953x0.m10263a(this.f7232a, this.f7233b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f7237f) {
                C1953x0.m10263a(this.f7232a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        private void m9909a(boolean z) {
            if (this.f7235d && this.f7236e != z) {
                ViewGroup viewGroup = this.f7234c;
                if (viewGroup != null) {
                    this.f7236e = z;
                    C1940s0.m10235b(viewGroup, z);
                }
            }
        }
    }

    @SuppressLint({"UniqueConstants"})
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.transition.e1$c */
    /* compiled from: Visibility */
    public @interface C1876c {
    }

    /* renamed from: androidx.transition.e1$d */
    /* compiled from: Visibility */
    private static class C1877d {

        /* renamed from: a */
        boolean f7238a;

        /* renamed from: b */
        boolean f7239b;

        /* renamed from: c */
        int f7240c;

        /* renamed from: d */
        int f7241d;

        /* renamed from: e */
        ViewGroup f7242e;

        /* renamed from: f */
        ViewGroup f7243f;

        C1877d() {
        }
    }

    public C1873e1() {
    }

    /* renamed from: b */
    private C1877d m9891b(C1922m0 m0Var, C1922m0 m0Var2) {
        C1877d dVar = new C1877d();
        dVar.f7238a = false;
        dVar.f7239b = false;
        String str = f7222J0;
        String str2 = f7221I0;
        if (m0Var == null || !m0Var.f7403a.containsKey(str2)) {
            dVar.f7240c = -1;
            dVar.f7242e = null;
        } else {
            dVar.f7240c = ((Integer) m0Var.f7403a.get(str2)).intValue();
            dVar.f7242e = (ViewGroup) m0Var.f7403a.get(str);
        }
        if (m0Var2 == null || !m0Var2.f7403a.containsKey(str2)) {
            dVar.f7241d = -1;
            dVar.f7243f = null;
        } else {
            dVar.f7241d = ((Integer) m0Var2.f7403a.get(str2)).intValue();
            dVar.f7243f = (ViewGroup) m0Var2.f7403a.get(str);
        }
        if (m0Var == null || m0Var2 == null) {
            if (m0Var == null && dVar.f7241d == 0) {
                dVar.f7239b = true;
                dVar.f7238a = true;
            } else if (m0Var2 == null && dVar.f7240c == 0) {
                dVar.f7239b = false;
                dVar.f7238a = true;
            }
        } else if (dVar.f7240c == dVar.f7241d && dVar.f7242e == dVar.f7243f) {
            return dVar;
        } else {
            int i = dVar.f7240c;
            int i2 = dVar.f7241d;
            if (i != i2) {
                if (i == 0) {
                    dVar.f7239b = false;
                    dVar.f7238a = true;
                } else if (i2 == 0) {
                    dVar.f7239b = true;
                    dVar.f7238a = true;
                }
            } else if (dVar.f7243f == null) {
                dVar.f7239b = false;
                dVar.f7238a = true;
            } else if (dVar.f7242e == null) {
                dVar.f7239b = true;
                dVar.f7238a = true;
            }
        }
        return dVar;
    }

    /* renamed from: e */
    private void m9892e(C1922m0 m0Var) {
        int visibility = m0Var.f7404b.getVisibility();
        m0Var.f7403a.put(f7221I0, Integer.valueOf(visibility));
        m0Var.f7403a.put(f7222J0, m0Var.f7404b.getParent());
        int[] iArr = new int[2];
        m0Var.f7404b.getLocationOnScreen(iArr);
        m0Var.f7403a.put(f7223K0, iArr);
    }

    /* renamed from: a */
    public Animator mo8260a(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        return null;
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m9892e(m0Var);
    }

    /* renamed from: b */
    public Animator mo8262b(ViewGroup viewGroup, View view, C1922m0 m0Var, C1922m0 m0Var2) {
        return null;
    }

    /* renamed from: c */
    public void mo8310c(int i) {
        if ((i & -4) == 0) {
            this.f7227H0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: d */
    public boolean mo8311d(C1922m0 m0Var) {
        boolean z = false;
        if (m0Var == null) {
            return false;
        }
        int intValue = ((Integer) m0Var.f7403a.get(f7221I0)).intValue();
        View view = (View) m0Var.f7403a.get(f7222J0);
        if (intValue == 0 && view != null) {
            z = true;
        }
        return z;
    }

    @C0195i0
    /* renamed from: o */
    public String[] mo8272o() {
        return f7226N0;
    }

    /* renamed from: r */
    public int mo8273r() {
        return this.f7227H0;
    }

    @C0195i0
    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1922m0 m0Var, @C0195i0 C1922m0 m0Var2) {
        C1877d b = m9891b(m0Var, m0Var2);
        if (!b.f7238a || (b.f7242e == null && b.f7243f == null)) {
            return null;
        }
        if (b.f7239b) {
            return mo8307a(viewGroup, m0Var, b.f7240c, m0Var2, b.f7241d);
        }
        return mo8309b(viewGroup, m0Var, b.f7240c, m0Var2, b.f7241d);
    }

    @SuppressLint({"RestrictedApi"})
    public C1873e1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7190e);
        int b = C0878h.m5077b(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (b != 0) {
            mo8310c(b);
        }
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m9892e(m0Var);
    }

    /* renamed from: a */
    public Animator mo8307a(ViewGroup viewGroup, C1922m0 m0Var, int i, C1922m0 m0Var2, int i2) {
        if ((this.f7227H0 & 1) != 1 || m0Var2 == null) {
            return null;
        }
        if (m0Var == null) {
            View view = (View) m0Var2.f7404b.getParent();
            if (m9891b(mo8353c(view, false), mo8360d(view, false)).f7238a) {
                return null;
            }
        }
        return mo8260a(viewGroup, m0Var2.f7404b, m0Var, m0Var2);
    }

    /* renamed from: a */
    public boolean mo8308a(C1922m0 m0Var, C1922m0 m0Var2) {
        boolean z = false;
        if (m0Var == null && m0Var2 == null) {
            return false;
        }
        if (!(m0Var == null || m0Var2 == null)) {
            Map<String, Object> map = m0Var2.f7403a;
            String str = f7221I0;
            if (map.containsKey(str) != m0Var.f7403a.containsKey(str)) {
                return false;
            }
        }
        C1877d b = m9891b(m0Var, m0Var2);
        if (b.f7238a && (b.f7240c == 0 || b.f7241d == 0)) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0080, code lost:
        if (r9.f7286h0 != false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo8309b(android.view.ViewGroup r10, androidx.transition.C1922m0 r11, int r12, androidx.transition.C1922m0 r13, int r14) {
        /*
            r9 = this;
            int r12 = r9.f7227H0
            r0 = 2
            r12 = r12 & r0
            r1 = 0
            if (r12 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r11 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r12 = r11.f7404b
            if (r13 == 0) goto L_0x0012
            android.view.View r2 = r13.f7404b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = androidx.transition.C1822R.C1825id.save_overlay_view
            java.lang.Object r3 = r12.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r6 = r1
            r2 = 1
            goto L_0x0084
        L_0x0023:
            if (r2 == 0) goto L_0x0035
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x0035
        L_0x002c:
            r3 = 4
            if (r14 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r12 != r2) goto L_0x003b
        L_0x0032:
            r3 = r1
            r6 = r2
            goto L_0x0039
        L_0x0035:
            if (r2 == 0) goto L_0x003b
            r6 = r1
            r3 = r2
        L_0x0039:
            r2 = 0
            goto L_0x003e
        L_0x003b:
            r3 = r1
            r6 = r3
            r2 = 1
        L_0x003e:
            if (r2 == 0) goto L_0x0083
            android.view.ViewParent r2 = r12.getParent()
            if (r2 != 0) goto L_0x0047
            goto L_0x0082
        L_0x0047:
            android.view.ViewParent r2 = r12.getParent()
            boolean r2 = r2 instanceof android.view.View
            if (r2 == 0) goto L_0x0083
            android.view.ViewParent r2 = r12.getParent()
            android.view.View r2 = (android.view.View) r2
            androidx.transition.m0 r7 = r9.mo8360d(r2, r5)
            androidx.transition.m0 r8 = r9.mo8353c(r2, r5)
            androidx.transition.e1$d r7 = r9.m9891b(r7, r8)
            boolean r7 = r7.f7238a
            if (r7 != 0) goto L_0x006b
            android.view.View r2 = androidx.transition.C1919l0.m10164a(r10, r12, r2)
            r3 = r2
            goto L_0x0083
        L_0x006b:
            int r7 = r2.getId()
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L_0x0083
            r2 = -1
            if (r7 == r2) goto L_0x0083
            android.view.View r2 = r10.findViewById(r7)
            if (r2 == 0) goto L_0x0083
            boolean r2 = r9.f7286h0
            if (r2 == 0) goto L_0x0083
        L_0x0082:
            r3 = r12
        L_0x0083:
            r2 = 0
        L_0x0084:
            if (r3 == 0) goto L_0x00d6
            if (r2 != 0) goto L_0x00b8
            java.util.Map<java.lang.String, java.lang.Object> r14 = r11.f7403a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r14 = r14.get(r1)
            int[] r14 = (int[]) r14
            r1 = r14[r4]
            r14 = r14[r5]
            int[] r0 = new int[r0]
            r10.getLocationOnScreen(r0)
            r4 = r0[r4]
            int r1 = r1 - r4
            int r4 = r3.getLeft()
            int r1 = r1 - r4
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r14 = r14 - r0
            int r0 = r3.getTop()
            int r14 = r14 - r0
            r3.offsetTopAndBottom(r14)
            androidx.transition.r0 r14 = androidx.transition.C1940s0.m10233a(r10)
            r14.mo8446a(r3)
        L_0x00b8:
            android.animation.Animator r11 = r9.mo8262b(r10, r3, r11, r13)
            if (r2 != 0) goto L_0x00d5
            if (r11 != 0) goto L_0x00c8
            androidx.transition.r0 r10 = androidx.transition.C1940s0.m10233a(r10)
            r10.mo8447b(r3)
            goto L_0x00d5
        L_0x00c8:
            int r13 = androidx.transition.C1822R.C1825id.save_overlay_view
            r12.setTag(r13, r3)
            androidx.transition.e1$a r13 = new androidx.transition.e1$a
            r13.<init>(r10, r3, r12)
            r9.mo8324a(r13)
        L_0x00d5:
            return r11
        L_0x00d6:
            if (r6 == 0) goto L_0x00f8
            int r12 = r6.getVisibility()
            androidx.transition.C1953x0.m10263a(r6, r4)
            android.animation.Animator r10 = r9.mo8262b(r10, r6, r11, r13)
            if (r10 == 0) goto L_0x00f4
            androidx.transition.e1$b r11 = new androidx.transition.e1$b
            r11.<init>(r6, r14, r5)
            r10.addListener(r11)
            androidx.transition.C1826a.m9801a(r10, r11)
            r9.mo8324a(r11)
            goto L_0x00f7
        L_0x00f4:
            androidx.transition.C1953x0.m10263a(r6, r12)
        L_0x00f7:
            return r10
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1873e1.mo8309b(android.view.ViewGroup, androidx.transition.m0, int, androidx.transition.m0, int):android.animation.Animator");
    }
}
