package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.content.p020h.C0878h;
import androidx.core.p034l.C0962e0;
import androidx.transition.C1880f0.C1888h;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.transition.e */
/* compiled from: ChangeBounds */
public class C1849e extends C1880f0 {

    /* renamed from: K0 */
    private static final String f7144K0 = "android:changeBounds:bounds";

    /* renamed from: L0 */
    private static final String f7145L0 = "android:changeBounds:clip";

    /* renamed from: M0 */
    private static final String f7146M0 = "android:changeBounds:parent";

    /* renamed from: N0 */
    private static final String f7147N0 = "android:changeBounds:windowX";

    /* renamed from: O0 */
    private static final String f7148O0 = "android:changeBounds:windowY";

    /* renamed from: P0 */
    private static final String[] f7149P0 = {f7144K0, f7145L0, f7146M0, f7147N0, f7148O0};

    /* renamed from: Q0 */
    private static final Property<Drawable, PointF> f7150Q0 = new C1851b(PointF.class, "boundsOrigin");

    /* renamed from: R0 */
    private static final Property<C1860k, PointF> f7151R0;

    /* renamed from: S0 */
    private static final Property<C1860k, PointF> f7152S0;

    /* renamed from: T0 */
    private static final Property<View, PointF> f7153T0;

    /* renamed from: U0 */
    private static final Property<View, PointF> f7154U0;

    /* renamed from: V0 */
    private static final Property<View, PointF> f7155V0 = new C1856g(PointF.class, "position");

    /* renamed from: W0 */
    private static C1828a0 f7156W0 = new C1828a0();

    /* renamed from: H0 */
    private int[] f7157H0 = new int[2];

    /* renamed from: I0 */
    private boolean f7158I0 = false;

    /* renamed from: J0 */
    private boolean f7159J0 = false;

    /* renamed from: androidx.transition.e$a */
    /* compiled from: ChangeBounds */
    class C1850a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f7160a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f7161b;

        /* renamed from: c */
        final /* synthetic */ View f7162c;

        /* renamed from: d */
        final /* synthetic */ float f7163d;

        C1850a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f7160a = viewGroup;
            this.f7161b = bitmapDrawable;
            this.f7162c = view;
            this.f7163d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1953x0.m10266b(this.f7160a).mo8449b(this.f7161b);
            C1953x0.m10262a(this.f7162c, this.f7163d);
        }
    }

    /* renamed from: androidx.transition.e$b */
    /* compiled from: ChangeBounds */
    static class C1851b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f7165a = new Rect();

        C1851b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f7165a);
            this.f7165a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f7165a);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f7165a);
            Rect rect = this.f7165a;
            return new PointF((float) rect.left, (float) rect.top);
        }
    }

    /* renamed from: androidx.transition.e$c */
    /* compiled from: ChangeBounds */
    static class C1852c extends Property<C1860k, PointF> {
        C1852c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1860k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1860k kVar, PointF pointF) {
            kVar.mo8306b(pointF);
        }
    }

    /* renamed from: androidx.transition.e$d */
    /* compiled from: ChangeBounds */
    static class C1853d extends Property<C1860k, PointF> {
        C1853d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1860k kVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C1860k kVar, PointF pointF) {
            kVar.mo8305a(pointF);
        }
    }

    /* renamed from: androidx.transition.e$e */
    /* compiled from: ChangeBounds */
    static class C1854e extends Property<View, PointF> {
        C1854e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C1953x0.m10264a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.e$f */
    /* compiled from: ChangeBounds */
    static class C1855f extends Property<View, PointF> {
        C1855f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C1953x0.m10264a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.e$g */
    /* compiled from: ChangeBounds */
    static class C1856g extends Property<View, PointF> {
        C1856g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1953x0.m10264a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.e$h */
    /* compiled from: ChangeBounds */
    class C1857h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1860k f7166a;
        private C1860k mViewBounds = this.f7166a;

        C1857h(C1860k kVar) {
            this.f7166a = kVar;
        }
    }

    /* renamed from: androidx.transition.e$i */
    /* compiled from: ChangeBounds */
    class C1858i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7168a;

        /* renamed from: b */
        final /* synthetic */ View f7169b;

        /* renamed from: c */
        final /* synthetic */ Rect f7170c;

        /* renamed from: d */
        final /* synthetic */ int f7171d;

        /* renamed from: e */
        final /* synthetic */ int f7172e;

        /* renamed from: f */
        final /* synthetic */ int f7173f;

        /* renamed from: g */
        final /* synthetic */ int f7174g;

        C1858i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f7169b = view;
            this.f7170c = rect;
            this.f7171d = i;
            this.f7172e = i2;
            this.f7173f = i3;
            this.f7174g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7168a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7168a) {
                C0962e0.m5439a(this.f7169b, this.f7170c);
                C1953x0.m10264a(this.f7169b, this.f7171d, this.f7172e, this.f7173f, this.f7174g);
            }
        }
    }

    /* renamed from: androidx.transition.e$j */
    /* compiled from: ChangeBounds */
    class C1859j extends C1897h0 {

        /* renamed from: a */
        boolean f7176a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f7177b;

        C1859j(ViewGroup viewGroup) {
            this.f7177b = viewGroup;
        }

        /* renamed from: b */
        public void mo8301b(@C0193h0 C1880f0 f0Var) {
            C1940s0.m10235b(this.f7177b, false);
        }

        /* renamed from: c */
        public void mo8302c(@C0193h0 C1880f0 f0Var) {
            if (!this.f7176a) {
                C1940s0.m10235b(this.f7177b, false);
            }
            f0Var.mo8342b((C1888h) this);
        }

        /* renamed from: d */
        public void mo8303d(@C0193h0 C1880f0 f0Var) {
            C1940s0.m10235b(this.f7177b, false);
            this.f7176a = true;
        }

        /* renamed from: e */
        public void mo8304e(@C0193h0 C1880f0 f0Var) {
            C1940s0.m10235b(this.f7177b, true);
        }
    }

    /* renamed from: androidx.transition.e$k */
    /* compiled from: ChangeBounds */
    private static class C1860k {

        /* renamed from: a */
        private int f7179a;

        /* renamed from: b */
        private int f7180b;

        /* renamed from: c */
        private int f7181c;

        /* renamed from: d */
        private int f7182d;

        /* renamed from: e */
        private View f7183e;

        /* renamed from: f */
        private int f7184f;

        /* renamed from: g */
        private int f7185g;

        C1860k(View view) {
            this.f7183e = view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8305a(PointF pointF) {
            this.f7181c = Math.round(pointF.x);
            this.f7182d = Math.round(pointF.y);
            this.f7185g++;
            if (this.f7184f == this.f7185g) {
                m9888a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8306b(PointF pointF) {
            this.f7179a = Math.round(pointF.x);
            this.f7180b = Math.round(pointF.y);
            this.f7184f++;
            if (this.f7184f == this.f7185g) {
                m9888a();
            }
        }

        /* renamed from: a */
        private void m9888a() {
            C1953x0.m10264a(this.f7183e, this.f7179a, this.f7180b, this.f7181c, this.f7182d);
            this.f7184f = 0;
            this.f7185g = 0;
        }
    }

    static {
        String str = "topLeft";
        f7151R0 = new C1852c(PointF.class, str);
        String str2 = "bottomRight";
        f7152S0 = new C1853d(PointF.class, str2);
        f7153T0 = new C1854e(PointF.class, str2);
        f7154U0 = new C1855f(PointF.class, str);
    }

    public C1849e() {
    }

    /* renamed from: d */
    private void m9865d(C1922m0 m0Var) {
        View view = m0Var.f7404b;
        if (C0962e0.m5540n0(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            m0Var.f7403a.put(f7144K0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            m0Var.f7403a.put(f7146M0, m0Var.f7404b.getParent());
            if (this.f7159J0) {
                m0Var.f7404b.getLocationInWindow(this.f7157H0);
                m0Var.f7403a.put(f7147N0, Integer.valueOf(this.f7157H0[0]));
                m0Var.f7403a.put(f7148O0, Integer.valueOf(this.f7157H0[1]));
            }
            if (this.f7158I0) {
                m0Var.f7403a.put(f7145L0, C0962e0.m5545p(view));
            }
        }
    }

    /* renamed from: a */
    public void mo8261a(@C0193h0 C1922m0 m0Var) {
        m9865d(m0Var);
    }

    /* renamed from: c */
    public void mo8271c(boolean z) {
        this.f7158I0 = z;
    }

    @C0195i0
    /* renamed from: o */
    public String[] mo8272o() {
        return f7149P0;
    }

    /* renamed from: r */
    public boolean mo8273r() {
        return this.f7158I0;
    }

    /* renamed from: a */
    private boolean m9864a(View view, View view2) {
        if (!this.f7159J0) {
            return true;
        }
        C1922m0 c = mo8353c(view, true);
        if (c == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == c.f7404b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo8263c(@C0193h0 C1922m0 m0Var) {
        m9865d(m0Var);
    }

    @SuppressLint({"RestrictedApi"})
    public C1849e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1861e0.f7189d);
        boolean a = C0878h.m5074a(obtainStyledAttributes, (XmlPullParser) (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo8271c(a);
    }

    @C0195i0
    /* renamed from: a */
    public Animator mo8270a(@C0193h0 ViewGroup viewGroup, @C0195i0 C1922m0 m0Var, @C0195i0 C1922m0 m0Var2) {
        int i;
        View view;
        Animator animator;
        Animator animator2;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        C1922m0 m0Var3 = m0Var;
        C1922m0 m0Var4 = m0Var2;
        if (m0Var3 == null || m0Var4 == null) {
            return null;
        }
        Map<String, Object> map = m0Var3.f7403a;
        Map<String, Object> map2 = m0Var4.f7403a;
        String str = f7146M0;
        ViewGroup viewGroup2 = (ViewGroup) map.get(str);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(str);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = m0Var4.f7404b;
        if (m9864a(viewGroup2, viewGroup3)) {
            Map<String, Object> map3 = m0Var3.f7403a;
            String str2 = f7144K0;
            Rect rect2 = (Rect) map3.get(str2);
            Rect rect3 = (Rect) m0Var4.f7403a.get(str2);
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Map<String, Object> map4 = m0Var3.f7403a;
            View view3 = view2;
            String str3 = f7145L0;
            Rect rect4 = (Rect) map4.get(str3);
            Rect rect5 = (Rect) m0Var4.f7403a.get(str3);
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.f7158I0) {
                    view = view3;
                    C1953x0.m10264a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            animator = C1948v.m10254a(view, f7155V0, mo8365h().mo8239a((float) i3, (float) i5, (float) i4, (float) i6));
                        } else {
                            C1860k kVar = new C1860k(view);
                            ObjectAnimator a = C1948v.m10254a(kVar, f7151R0, mo8365h().mo8239a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = C1948v.m10254a(kVar, f7152S0, mo8365h().mo8239a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new C1857h(kVar));
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        animator = C1948v.m10254a(view, f7153T0, mo8365h().mo8239a((float) i7, (float) i9, (float) i8, (float) i10));
                    } else {
                        animator = C1948v.m10254a(view, f7154U0, mo8365h().mo8239a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                } else {
                    view = view3;
                    C1953x0.m10264a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    if (i3 == i4 && i5 == i6) {
                        animator2 = null;
                    } else {
                        animator2 = C1948v.m10254a(view, f7155V0, mo8365h().mo8239a((float) i3, (float) i5, (float) i4, (float) i6));
                    }
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        C0962e0.m5439a(view, rect);
                        C1828a0 a0Var = f7156W0;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", a0Var, objArr);
                        C1858i iVar = new C1858i(view, rect6, i4, i6, i8, i10);
                        objectAnimator.addListener(iVar);
                    } else {
                        objectAnimator = null;
                    }
                    animator = C1919l0.m10162a(animator2, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C1940s0.m10235b(viewGroup4, true);
                    mo8324a((C1888h) new C1859j(viewGroup4));
                }
                return animator;
            }
        } else {
            Map<String, Object> map5 = m0Var3.f7403a;
            String str4 = f7147N0;
            int intValue = ((Integer) map5.get(str4)).intValue();
            Map<String, Object> map6 = m0Var3.f7403a;
            String str5 = f7148O0;
            int intValue2 = ((Integer) map6.get(str5)).intValue();
            int intValue3 = ((Integer) m0Var4.f7403a.get(str4)).intValue();
            int intValue4 = ((Integer) m0Var4.f7403a.get(str5)).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f7157H0);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C1953x0.m10268c(view2);
                C1953x0.m10262a(view2, 0.0f);
                C1953x0.m10266b(viewGroup).mo8448a(bitmapDrawable);
                C1950w h = mo8365h();
                int[] iArr = this.f7157H0;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C1958z.m10284a(f7150Q0, h.mo8239a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
                C1850a aVar = new C1850a(viewGroup, bitmapDrawable, view2, c);
                ofPropertyValuesHolder.addListener(aVar);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }
}
