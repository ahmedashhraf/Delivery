package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0183c0;
import androidx.annotation.C0192h;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.widget.C0557v0;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p033k.C0940h.C0941a;
import androidx.core.p033k.C0940h.C0942b;
import androidx.core.p033k.C0940h.C0943c;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.C0999l;
import androidx.core.p034l.C1056z;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1016d.C1018b;
import androidx.core.p034l.p035o0.C1016d.C1019c;
import androidx.core.widget.C1120m;
import androidx.viewpager.widget.C2024a;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2014e;
import androidx.viewpager.widget.ViewPager.C2018i;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.google.android.material.C5582R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C5622a;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p302m.C6952c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@C2014e
public class TabLayout extends HorizontalScrollView {
    @C0211p(unit = 0)

    /* renamed from: C0 */
    private static final int f19846C0 = 72;
    @C0211p(unit = 0)

    /* renamed from: D0 */
    static final int f19847D0 = 8;
    @C0211p(unit = 0)

    /* renamed from: E0 */
    private static final int f19848E0 = 48;
    @C0211p(unit = 0)

    /* renamed from: F0 */
    private static final int f19849F0 = 56;
    @C0211p(unit = 0)

    /* renamed from: G0 */
    private static final int f19850G0 = 24;
    @C0211p(unit = 0)

    /* renamed from: H0 */
    static final int f19851H0 = 16;

    /* renamed from: I0 */
    private static final int f19852I0 = -1;

    /* renamed from: J0 */
    private static final int f19853J0 = 300;

    /* renamed from: K0 */
    private static final C0941a<C7056k> f19854K0 = new C0943c(16);

    /* renamed from: L0 */
    private static final String f19855L0 = "androidx.appcompat.app.ActionBar.Tab";

    /* renamed from: M0 */
    public static final int f19856M0 = 0;

    /* renamed from: N0 */
    public static final int f19857N0 = 1;

    /* renamed from: O0 */
    public static final int f19858O0 = 2;

    /* renamed from: P0 */
    public static final int f19859P0 = 0;

    /* renamed from: Q0 */
    public static final int f19860Q0 = 1;

    /* renamed from: R0 */
    public static final int f19861R0 = 0;

    /* renamed from: S0 */
    public static final int f19862S0 = 1;

    /* renamed from: T0 */
    public static final int f19863T0 = 0;

    /* renamed from: U0 */
    public static final int f19864U0 = 1;

    /* renamed from: V0 */
    public static final int f19865V0 = 2;

    /* renamed from: W0 */
    public static final int f19866W0 = 3;

    /* renamed from: A0 */
    private boolean f19867A0;

    /* renamed from: B0 */
    private final C0941a<C7058o> f19868B0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final RectF f19869N;
    @C0193h0

    /* renamed from: O */
    final C7053j f19870O;

    /* renamed from: P */
    int f19871P;

    /* renamed from: Q */
    int f19872Q;

    /* renamed from: R */
    int f19873R;

    /* renamed from: S */
    int f19874S;

    /* renamed from: T */
    int f19875T;

    /* renamed from: U */
    ColorStateList f19876U;

    /* renamed from: V */
    ColorStateList f19877V;

    /* renamed from: W */
    ColorStateList f19878W;

    /* renamed from: a */
    private final ArrayList<C7056k> f19879a;
    @C0195i0

    /* renamed from: a0 */
    Drawable f19880a0;
    @C0195i0

    /* renamed from: b */
    private C7056k f19881b;

    /* renamed from: b0 */
    Mode f19882b0;

    /* renamed from: c0 */
    float f19883c0;

    /* renamed from: d0 */
    float f19884d0;

    /* renamed from: e0 */
    final int f19885e0;

    /* renamed from: f0 */
    int f19886f0;

    /* renamed from: g0 */
    private final int f19887g0;

    /* renamed from: h0 */
    private final int f19888h0;

    /* renamed from: i0 */
    private final int f19889i0;

    /* renamed from: j0 */
    private int f19890j0;

    /* renamed from: k0 */
    int f19891k0;

    /* renamed from: l0 */
    int f19892l0;

    /* renamed from: m0 */
    int f19893m0;

    /* renamed from: n0 */
    int f19894n0;

    /* renamed from: o0 */
    boolean f19895o0;

    /* renamed from: p0 */
    boolean f19896p0;

    /* renamed from: q0 */
    boolean f19897q0;

    /* renamed from: r0 */
    private final ArrayList<C7051h> f19898r0;
    @C0195i0

    /* renamed from: s0 */
    private C7051h f19899s0;

    /* renamed from: t0 */
    private final HashMap<C7050e<? extends C7056k>, C7051h> f19900t0;

    /* renamed from: u0 */
    private ValueAnimator f19901u0;
    @C0195i0

    /* renamed from: v0 */
    ViewPager f19902v0;
    @C0195i0

    /* renamed from: w0 */
    private C2024a f19903w0;

    /* renamed from: x0 */
    private DataSetObserver f19904x0;

    /* renamed from: y0 */
    private C7057n f19905y0;

    /* renamed from: z0 */
    private C7049d f19906z0;

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public @interface C5722f {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public @interface C5723g {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$l */
    public @interface C5724l {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$m */
    public @interface C5725m {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C7046a extends C0947a {
        C7046a() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4939a((Object) C1018b.m5960a(1, TabLayout.this.getTabCount(), false, 1));
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    class C7047b implements C7051h {

        /* renamed from: a */
        final /* synthetic */ C7050e f19908a;

        C7047b(C7050e eVar) {
            this.f19908a = eVar;
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            this.f19908a.mo28169a(kVar);
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            this.f19908a.mo28170b(kVar);
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
            this.f19908a.mo28171c(kVar);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    class C7048c implements AnimatorUpdateListener {
        C7048c() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    private class C7049d implements C2018i {

        /* renamed from: a */
        private boolean f19911a;

        C7049d() {
        }

        /* renamed from: a */
        public void mo8877a(@C0193h0 ViewPager viewPager, @C0195i0 C2024a aVar, @C0195i0 C2024a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f19902v0 == viewPager) {
                tabLayout.mo28102a(aVar2, this.f19911a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28168a(boolean z) {
            this.f19911a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public interface C7050e<T extends C7056k> {
        /* renamed from: a */
        void mo28169a(T t);

        /* renamed from: b */
        void mo28170b(T t);

        /* renamed from: c */
        void mo28171c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public interface C7051h {
        /* renamed from: a */
        void mo12005a(C7056k kVar);

        /* renamed from: b */
        void mo12006b(C7056k kVar);

        /* renamed from: c */
        void mo12007c(C7056k kVar);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    private class C7052i extends DataSetObserver {
        C7052i() {
        }

        public void onChanged() {
            TabLayout.this.mo28127g();
        }

        public void onInvalidated() {
            TabLayout.this.mo28127g();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    class C7053j extends LinearLayout {
        @C0193h0

        /* renamed from: N */
        private final GradientDrawable f19914N;

        /* renamed from: O */
        int f19915O = -1;

        /* renamed from: P */
        float f19916P;

        /* renamed from: Q */
        private int f19917Q = -1;

        /* renamed from: R */
        int f19918R = -1;

        /* renamed from: S */
        int f19919S = -1;

        /* renamed from: T */
        ValueAnimator f19920T;
        /* access modifiers changed from: private */

        /* renamed from: U */
        public int f19921U = -1;
        /* access modifiers changed from: private */

        /* renamed from: V */
        public int f19922V = -1;

        /* renamed from: a */
        private int f19924a;
        @C0193h0

        /* renamed from: b */
        private final Paint f19925b;

        /* renamed from: com.google.android.material.tabs.TabLayout$j$a */
        class C7054a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f19926a;

            /* renamed from: b */
            final /* synthetic */ int f19927b;

            C7054a(int i, int i2) {
                this.f19926a = i;
                this.f19927b = i2;
            }

            public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C7053j jVar = C7053j.this;
                jVar.mo28180b(C5587a.m24252a(jVar.f19921U, this.f19926a, animatedFraction), C5587a.m24252a(C7053j.this.f19922V, this.f19927b, animatedFraction));
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$j$b */
        class C7055b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f19929a;

            C7055b(int i) {
                this.f19929a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C7053j jVar = C7053j.this;
                jVar.f19915O = this.f19929a;
                jVar.f19916P = 0.0f;
            }

            public void onAnimationStart(Animator animator) {
                C7053j.this.f19915O = this.f19929a;
            }
        }

        C7053j(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f19925b = new Paint();
            this.f19914N = new GradientDrawable();
        }

        /* renamed from: c */
        private void m33939c() {
            int i;
            int i2;
            View childAt = getChildAt(this.f19915O);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f19896p0 && (childAt instanceof C7058o)) {
                    m33936a((C7058o) childAt, tabLayout.f19869N);
                    i2 = (int) TabLayout.this.f19869N.left;
                    i = (int) TabLayout.this.f19869N.right;
                }
                if (this.f19916P > 0.0f && this.f19915O < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f19915O + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f19896p0 && (childAt2 instanceof C7058o)) {
                        m33936a((C7058o) childAt2, tabLayout2.f19869N);
                        left = (int) TabLayout.this.f19869N.left;
                        right = (int) TabLayout.this.f19869N.right;
                    }
                    float f = this.f19916P;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo28180b(i2, i);
        }

        public void draw(@C0193h0 Canvas canvas) {
            Drawable drawable = TabLayout.this.f19880a0;
            int i = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i2 = this.f19924a;
            if (i2 >= 0) {
                intrinsicHeight = i2;
            }
            int i3 = TabLayout.this.f19893m0;
            if (i3 == 0) {
                i = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i3 == 1) {
                i = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    intrinsicHeight = 0;
                } else {
                    intrinsicHeight = getHeight();
                }
            }
            int i4 = this.f19918R;
            if (i4 >= 0 && this.f19919S > i4) {
                Drawable drawable2 = TabLayout.this.f19880a0;
                if (drawable2 == null) {
                    drawable2 = this.f19914N;
                }
                Drawable i5 = C0892a.m5161i(drawable2);
                i5.setBounds(this.f19918R, i, this.f19919S, intrinsicHeight);
                Paint paint = this.f19925b;
                if (paint != null) {
                    if (VERSION.SDK_INT == 21) {
                        i5.setColorFilter(paint.getColor(), Mode.SRC_IN);
                    } else {
                        C0892a.m5154b(i5, paint.getColor());
                    }
                }
                i5.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f19920T;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m33939c();
            } else {
                m33937a(false, this.f19915O, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            boolean z;
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                if (tabLayout.f19891k0 == 1 || tabLayout.f19894n0 == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C6936w.m33292a(getContext(), 16)) * 2)) {
                            z = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z = true;
                                }
                            }
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f19891k0 = 0;
                            tabLayout2.mo28109a(false);
                            z = true;
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f19917Q != i) {
                requestLayout();
                this.f19917Q = i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28174a(int i) {
            if (this.f19925b.getColor() != i) {
                this.f19925b.setColor(i);
                C0962e0.m5561u0(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo28179b(int i) {
            if (this.f19924a != i) {
                this.f19924a = i;
                C0962e0.m5561u0(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo28177a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo28178b() {
            return ((float) this.f19915O) + this.f19916P;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo28180b(int i, int i2) {
            if (i != this.f19918R || i2 != this.f19919S) {
                this.f19918R = i;
                this.f19919S = i2;
                C0962e0.m5561u0(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28175a(int i, float f) {
            ValueAnimator valueAnimator = this.f19920T;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f19920T.cancel();
            }
            this.f19915O = i;
            this.f19916P = f;
            m33939c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28176a(int i, int i2) {
            ValueAnimator valueAnimator = this.f19920T;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f19920T.cancel();
            }
            m33937a(true, i, i2);
        }

        /* renamed from: a */
        private void m33937a(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m33939c();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f19896p0 && (childAt instanceof C7058o)) {
                m33936a((C7058o) childAt, tabLayout.f19869N);
                left = (int) TabLayout.this.f19869N.left;
                right = (int) TabLayout.this.f19869N.right;
            }
            int i3 = this.f19918R;
            int i4 = this.f19919S;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.f19921U = i3;
                    this.f19922V = i4;
                }
                C7054a aVar = new C7054a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f19920T = valueAnimator;
                    valueAnimator.setInterpolator(C5587a.f15930b);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new C7055b(i));
                    valueAnimator.start();
                } else {
                    this.f19920T.removeAllUpdateListeners();
                    this.f19920T.addUpdateListener(aVar);
                }
            }
        }

        /* renamed from: a */
        private void m33936a(@C0193h0 C7058o oVar, @C0193h0 RectF rectF) {
            int a = oVar.getContentWidth();
            int a2 = (int) C6936w.m33292a(getContext(), 24);
            if (a < a2) {
                a = a2;
            }
            int left = (oVar.getLeft() + oVar.getRight()) / 2;
            int i = a / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$k */
    public static class C7056k {

        /* renamed from: j */
        public static final int f19931j = -1;
        @C0195i0

        /* renamed from: a */
        private Object f19932a;
        @C0195i0

        /* renamed from: b */
        private Drawable f19933b;
        /* access modifiers changed from: private */
        @C0195i0

        /* renamed from: c */
        public CharSequence f19934c;
        /* access modifiers changed from: private */
        @C0195i0

        /* renamed from: d */
        public CharSequence f19935d;

        /* renamed from: e */
        private int f19936e = -1;
        @C0195i0

        /* renamed from: f */
        private View f19937f;
        /* access modifiers changed from: private */
        @C5722f

        /* renamed from: g */
        public int f19938g = 1;
        @C0195i0

        /* renamed from: h */
        public TabLayout f19939h;
        @C0193h0

        /* renamed from: i */
        public C7058o f19940i;

        @C0195i0
        /* renamed from: d */
        public Drawable mo28199d() {
            return this.f19933b;
        }

        @C0193h0
        /* renamed from: e */
        public BadgeDrawable mo28201e() {
            return this.f19940i.getOrCreateBadge();
        }

        /* renamed from: f */
        public int mo28203f() {
            return this.f19936e;
        }

        @C5722f
        /* renamed from: g */
        public int mo28205g() {
            return this.f19938g;
        }

        @C0195i0
        /* renamed from: h */
        public Object mo28206h() {
            return this.f19932a;
        }

        @C0195i0
        /* renamed from: i */
        public CharSequence mo28207i() {
            return this.f19934c;
        }

        /* renamed from: j */
        public boolean mo28208j() {
            TabLayout tabLayout = this.f19939h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f19936e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: k */
        public void mo28209k() {
            this.f19940i.m34001h();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo28210l() {
            this.f19939h = null;
            this.f19940i = null;
            this.f19932a = null;
            this.f19933b = null;
            this.f19934c = null;
            this.f19935d = null;
            this.f19936e = -1;
            this.f19937f = null;
        }

        /* renamed from: m */
        public void mo28211m() {
            TabLayout tabLayout = this.f19939h;
            if (tabLayout != null) {
                tabLayout.mo28123d(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public void mo28212n() {
            C7058o oVar = this.f19940i;
            if (oVar != null) {
                oVar.mo28215b();
            }
        }

        @C0193h0
        /* renamed from: a */
        public C7056k mo28193a(@C0195i0 Object obj) {
            this.f19932a = obj;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C7056k mo28194b(@C0183c0 int i) {
            return mo28191a(LayoutInflater.from(this.f19940i.getContext()).inflate(i, this.f19940i, false));
        }

        @C0195i0
        /* renamed from: c */
        public View mo28197c() {
            return this.f19937f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo28200d(int i) {
            this.f19936e = i;
        }

        @C0193h0
        /* renamed from: e */
        public C7056k mo28202e(@C5722f int i) {
            this.f19938g = i;
            TabLayout tabLayout = this.f19939h;
            if (tabLayout.f19891k0 == 1 || tabLayout.f19894n0 == 2) {
                this.f19939h.mo28109a(true);
            }
            mo28212n();
            if (C5622a.f16090a && this.f19940i.m33996e() && this.f19940i.f19946P.isVisible()) {
                this.f19940i.invalidate();
            }
            return this;
        }

        @C0193h0
        /* renamed from: f */
        public C7056k mo28204f(@C0214q0 int i) {
            TabLayout tabLayout = this.f19939h;
            if (tabLayout != null) {
                return mo28195b(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0193h0
        /* renamed from: a */
        public C7056k mo28191a(@C0195i0 View view) {
            this.f19937f = view;
            mo28212n();
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C7056k mo28198c(@C0213q int i) {
            TabLayout tabLayout = this.f19939h;
            if (tabLayout != null) {
                return mo28190a(C0242a.m1109c(tabLayout.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0193h0
        /* renamed from: b */
        public C7056k mo28195b(@C0195i0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f19935d) && !TextUtils.isEmpty(charSequence)) {
                this.f19940i.setContentDescription(charSequence);
            }
            this.f19934c = charSequence;
            mo28212n();
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C7056k mo28190a(@C0195i0 Drawable drawable) {
            this.f19933b = drawable;
            TabLayout tabLayout = this.f19939h;
            if (tabLayout.f19891k0 == 1 || tabLayout.f19894n0 == 2) {
                this.f19939h.mo28109a(true);
            }
            mo28212n();
            if (C5622a.f16090a && this.f19940i.m33996e() && this.f19940i.f19946P.isVisible()) {
                this.f19940i.invalidate();
            }
            return this;
        }

        @C0195i0
        /* renamed from: b */
        public CharSequence mo28196b() {
            C7058o oVar = this.f19940i;
            if (oVar == null) {
                return null;
            }
            return oVar.getContentDescription();
        }

        @C0195i0
        /* renamed from: a */
        public BadgeDrawable mo28188a() {
            return this.f19940i.getBadge();
        }

        @C0193h0
        /* renamed from: a */
        public C7056k mo28189a(@C0214q0 int i) {
            TabLayout tabLayout = this.f19939h;
            if (tabLayout != null) {
                return mo28192a(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @C0193h0
        /* renamed from: a */
        public C7056k mo28192a(@C0195i0 CharSequence charSequence) {
            this.f19935d = charSequence;
            mo28212n();
            return this;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$n */
    public static class C7057n implements C2019j {

        /* renamed from: N */
        private int f19941N;
        @C0193h0

        /* renamed from: a */
        private final WeakReference<TabLayout> f19942a;

        /* renamed from: b */
        private int f19943b;

        public C7057n(TabLayout tabLayout) {
            this.f19942a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo8878a(int i) {
            this.f19943b = this.f19941N;
            this.f19941N = i;
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            TabLayout tabLayout = (TabLayout) this.f19942a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f19941N;
                tabLayout.mo28118b(tabLayout.mo28096a(i), i2 == 0 || (i2 == 2 && this.f19943b == 0));
            }
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f19942a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f19941N != 2 || this.f19943b == 1;
                if (!(this.f19941N == 2 && this.f19943b == 0)) {
                    z = true;
                }
                tabLayout.mo28099a(i, f, z2, z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28213a() {
            this.f19941N = 0;
            this.f19943b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$o */
    public final class C7058o extends LinearLayout {

        /* renamed from: N */
        private ImageView f19944N;
        @C0195i0

        /* renamed from: O */
        private View f19945O;
        /* access modifiers changed from: private */
        @C0195i0

        /* renamed from: P */
        public BadgeDrawable f19946P;
        @C0195i0

        /* renamed from: Q */
        private View f19947Q;
        @C0195i0

        /* renamed from: R */
        private TextView f19948R;
        @C0195i0

        /* renamed from: S */
        private ImageView f19949S;
        @C0195i0

        /* renamed from: T */
        private Drawable f19950T;

        /* renamed from: U */
        private int f19951U = 2;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C7056k f19953a;

        /* renamed from: b */
        private TextView f19954b;

        /* renamed from: com.google.android.material.tabs.TabLayout$o$a */
        class C7059a extends C0947a {

            /* renamed from: d */
            final /* synthetic */ TabLayout f19955d;

            C7059a(TabLayout tabLayout) {
                this.f19955d = tabLayout;
            }

            /* renamed from: a */
            public void mo4749a(View view, @C0193h0 C1016d dVar) {
                super.mo4749a(view, dVar);
                dVar.mo4937a((CharSequence) TabLayout.f19855L0);
                if (C7058o.this.f19946P != null && C7058o.this.f19946P.isVisible()) {
                    CharSequence contentDescription = C7058o.this.getContentDescription();
                    StringBuilder sb = new StringBuilder();
                    sb.append(contentDescription);
                    sb.append(", ");
                    sb.append(C7058o.this.f19946P.mo22263f());
                    dVar.mo4948b((CharSequence) sb.toString());
                }
                dVar.mo4949b((Object) C1019c.m5966a(0, 1, ((C7058o) view).f19953a.mo28203f(), 1, false, C7058o.this.isSelected()));
                if (C7058o.this.isSelected()) {
                    dVar.mo4976e(false);
                    dVar.mo4953b(C1017a.f4617k);
                }
            }

            /* renamed from: b */
            public void mo4753b(View view, @C0193h0 AccessibilityEvent accessibilityEvent) {
                super.mo4753b(view, accessibilityEvent);
                accessibilityEvent.setClassName(TabLayout.f19855L0);
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$o$b */
        class C7060b implements OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ View f19957a;

            C7060b(View view) {
                this.f19957a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f19957a.getVisibility() == 0) {
                    C7058o.this.m33994d(this.f19957a);
                }
            }
        }

        public C7058o(@C0193h0 Context context) {
            super(context);
            m33981a(context);
            C0962e0.m5473b(this, TabLayout.this.f19871P, TabLayout.this.f19872Q, TabLayout.this.f19873R, TabLayout.this.f19874S);
            setGravity(17);
            setOrientation(TabLayout.this.f19895o0 ^ true ? 1 : 0);
            setClickable(true);
            C0962e0.m5449a((View) this, C1056z.m6138a(getContext(), 1002));
            C0962e0.m5443a((View) this, (C0947a) new C7059a(TabLayout.this));
        }

        /* access modifiers changed from: private */
        @C0195i0
        public BadgeDrawable getBadge() {
            return this.f19946P;
        }

        /* access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f19954b, this.f19944N, this.f19947Q};
            int length = viewArr.length;
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: private */
        @C0193h0
        public BadgeDrawable getOrCreateBadge() {
            if (this.f19946P == null) {
                this.f19946P = BadgeDrawable.m24470a(getContext());
            }
            m34003j();
            BadgeDrawable badgeDrawable = this.f19946P;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public void m34001h() {
            if (this.f19945O != null) {
                m34002i();
            }
            this.f19946P = null;
        }

        /* renamed from: i */
        private void m34002i() {
            if (m33996e() && this.f19945O != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeDrawable badgeDrawable = this.f19946P;
                View view = this.f19945O;
                C5622a.m24510b(badgeDrawable, view, m33988b(view));
                this.f19945O = null;
            }
        }

        /* renamed from: j */
        private void m34003j() {
            if (m33996e()) {
                if (this.f19947Q != null) {
                    m34002i();
                } else {
                    if (this.f19944N != null) {
                        C7056k kVar = this.f19953a;
                        if (!(kVar == null || kVar.mo28199d() == null)) {
                            View view = this.f19945O;
                            ImageView imageView = this.f19944N;
                            if (view != imageView) {
                                m34002i();
                                m33991c((View) this.f19944N);
                            } else {
                                m33994d((View) imageView);
                            }
                        }
                    }
                    if (this.f19954b != null) {
                        C7056k kVar2 = this.f19953a;
                        if (kVar2 != null && kVar2.mo28205g() == 1) {
                            View view2 = this.f19945O;
                            TextView textView = this.f19954b;
                            if (view2 != textView) {
                                m34002i();
                                m33991c((View) this.f19954b);
                            } else {
                                m33994d((View) textView);
                            }
                        }
                    }
                    m34002i();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f19950T;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f19950T.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        @C0195i0
        public C7056k getTab() {
            return this.f19953a;
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.f19886f0, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f19954b != null) {
                float f = TabLayout.this.f19883c0;
                int i3 = this.f19951U;
                ImageView imageView = this.f19944N;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f19954b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f19884d0;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f19954b.getTextSize();
                int lineCount = this.f19954b.getLineCount();
                int k = C1120m.m6397k(this.f19954b);
                if (f != textSize || (k >= 0 && i3 != k)) {
                    if (TabLayout.this.f19894n0 == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f19954b.getLayout();
                        if (layout == null || m33979a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f19954b.setTextSize(0, f);
                        this.f19954b.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f19953a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f19953a.mo28211m();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f19954b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f19944N;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f19947Q;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setTab(@C0195i0 C7056k kVar) {
            if (kVar != this.f19953a) {
                this.f19953a = kVar;
                mo28215b();
            }
        }

        /* renamed from: c */
        private void m33991c(@C0195i0 View view) {
            if (m33996e() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C5622a.m24509a(this.f19946P, view, m33988b(view));
                this.f19945O = view;
            }
        }

        @C0193h0
        /* renamed from: d */
        private FrameLayout m33992d() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public boolean m33996e() {
            return this.f19946P != null;
        }

        /* renamed from: f */
        private void m33998f() {
            ViewGroup viewGroup;
            if (C5622a.f16090a) {
                ViewGroup d = m33992d();
                addView(d, 0);
                viewGroup = d;
            } else {
                viewGroup = this;
            }
            this.f19944N = (ImageView) LayoutInflater.from(getContext()).inflate(C5582R.layout.design_layout_tab_icon, viewGroup, false);
            viewGroup.addView(this.f19944N, 0);
        }

        /* renamed from: g */
        private void m34000g() {
            ViewGroup viewGroup;
            if (C5622a.f16090a) {
                ViewGroup d = m33992d();
                addView(d);
                viewGroup = d;
            } else {
                viewGroup = this;
            }
            this.f19954b = (TextView) LayoutInflater.from(getContext()).inflate(C5582R.layout.design_layout_tab_text, viewGroup, false);
            viewGroup.addView(this.f19954b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo28215b() {
            C7056k kVar = this.f19953a;
            Drawable drawable = null;
            View c = kVar != null ? kVar.mo28197c() : null;
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f19947Q = c;
                TextView textView = this.f19954b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f19944N;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f19944N.setImageDrawable(null);
                }
                this.f19948R = (TextView) c.findViewById(16908308);
                TextView textView2 = this.f19948R;
                if (textView2 != null) {
                    this.f19951U = C1120m.m6397k(textView2);
                }
                this.f19949S = (ImageView) c.findViewById(16908294);
            } else {
                View view = this.f19947Q;
                if (view != null) {
                    removeView(view);
                    this.f19947Q = null;
                }
                this.f19948R = null;
                this.f19949S = null;
            }
            if (this.f19947Q == null) {
                if (this.f19944N == null) {
                    m33998f();
                }
                if (!(kVar == null || kVar.mo28199d() == null)) {
                    drawable = C0892a.m5161i(kVar.mo28199d()).mutate();
                }
                if (drawable != null) {
                    C0892a.m5146a(drawable, TabLayout.this.f19877V);
                    Mode mode = TabLayout.this.f19882b0;
                    if (mode != null) {
                        C0892a.m5149a(drawable, mode);
                    }
                }
                if (this.f19954b == null) {
                    m34000g();
                    this.f19951U = C1120m.m6397k(this.f19954b);
                }
                C1120m.m6391e(this.f19954b, TabLayout.this.f19875T);
                ColorStateList colorStateList = TabLayout.this.f19876U;
                if (colorStateList != null) {
                    this.f19954b.setTextColor(colorStateList);
                }
                m33984a(this.f19954b, this.f19944N);
                m34003j();
                m33983a((View) this.f19944N);
                m33983a((View) this.f19954b);
            } else if (!(this.f19948R == null && this.f19949S == null)) {
                m33984a(this.f19948R, this.f19949S);
            }
            if (kVar != null && !TextUtils.isEmpty(kVar.f19935d)) {
                setContentDescription(kVar.f19935d);
            }
            setSelected(kVar != null && kVar.mo28208j());
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v6, types: [android.graphics.drawable.Drawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m33981a(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f19885e0
                r1 = 0
                if (r0 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = androidx.appcompat.p006a.p007a.C0242a.m1109c(r7, r0)
                r6.f19950T = r7
                android.graphics.drawable.Drawable r7 = r6.f19950T
                if (r7 == 0) goto L_0x0023
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0023
                android.graphics.drawable.Drawable r7 = r6.f19950T
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0023
            L_0x0021:
                r6.f19950T = r1
            L_0x0023:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f19878W
                if (r2 == 0) goto L_0x007a
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f19878W
                android.content.res.ColorStateList r3 = com.google.android.material.p303n.C6961b.m33357a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x0065
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f19897q0
                if (r4 == 0) goto L_0x0058
                r7 = r1
            L_0x0058:
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f19897q0
                if (r4 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r1 = r2
            L_0x0060:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x007a
            L_0x0065:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.C0892a.m5161i(r2)
                androidx.core.graphics.drawable.C0892a.m5146a(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x007a:
                androidx.core.p034l.C0962e0.m5440a(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C7058o.m33981a(android.content.Context):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m33994d(@C0193h0 View view) {
            if (m33996e() && view == this.f19945O) {
                C5622a.m24511c(this.f19946P, view, m33988b(view));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo28216c() {
            setOrientation(TabLayout.this.f19895o0 ^ true ? 1 : 0);
            if (this.f19948R == null && this.f19949S == null) {
                m33984a(this.f19954b, this.f19944N);
            } else {
                m33984a(this.f19948R, this.f19949S);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m33982a(@C0193h0 Canvas canvas) {
            Drawable drawable = this.f19950T;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f19950T.draw(canvas);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28214a() {
            setTab(null);
            setSelected(false);
        }

        /* renamed from: a */
        private void m33983a(@C0195i0 View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C7060b(view));
            }
        }

        /* renamed from: a */
        private void m33984a(@C0195i0 TextView textView, @C0195i0 ImageView imageView) {
            C7056k kVar = this.f19953a;
            Drawable mutate = (kVar == null || kVar.mo28199d() == null) ? null : C0892a.m5161i(this.f19953a.mo28199d()).mutate();
            C7056k kVar2 = this.f19953a;
            CharSequence i = kVar2 != null ? kVar2.mo28207i() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(i);
            if (textView != null) {
                if (z) {
                    textView.setText(i);
                    if (this.f19953a.f19938g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int a = (!z || imageView.getVisibility() != 0) ? 0 : (int) C6936w.m33292a(getContext(), 8);
                if (TabLayout.this.f19895o0) {
                    if (a != C0999l.m5722b(marginLayoutParams)) {
                        C0999l.m5725c(marginLayoutParams, a);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a;
                    C0999l.m5725c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C7056k kVar3 = this.f19953a;
            CharSequence a2 = kVar3 != null ? kVar3.f19935d : null;
            if (z) {
                a2 = null;
            }
            C0557v0.m3031a(this, a2);
        }

        @C0195i0
        /* renamed from: b */
        private FrameLayout m33988b(@C0193h0 View view) {
            FrameLayout frameLayout = null;
            if (view != this.f19944N && view != this.f19954b) {
                return null;
            }
            if (C5622a.f16090a) {
                frameLayout = (FrameLayout) view.getParent();
            }
            return frameLayout;
        }

        /* renamed from: a */
        private float m33979a(@C0193h0 Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$p */
    public static class C7061p implements C7051h {

        /* renamed from: a */
        private final ViewPager f19959a;

        public C7061p(ViewPager viewPager) {
            this.f19959a = viewPager;
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
        }

        /* renamed from: b */
        public void mo12006b(@C0193h0 C7056k kVar) {
            this.f19959a.setCurrentItem(kVar.mo28203f());
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    public TabLayout(@C0193h0 Context context) {
        this(context, null);
    }

    @C0211p(unit = 0)
    private int getDefaultHeight() {
        int size = this.f19879a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C7056k kVar = (C7056k) this.f19879a.get(i);
            if (kVar != null && kVar.mo28199d() != null && !TextUtils.isEmpty(kVar.mo28207i())) {
                z = true;
                break;
            }
            i++;
        }
        return (!z || this.f19895o0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f19887g0;
        if (i != -1) {
            return i;
        }
        int i2 = this.f19894n0;
        return (i2 == 0 || i2 == 2) ? this.f19889i0 : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f19870O.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: i */
    private void m33890i(@C0193h0 C7056k kVar) {
        for (int size = this.f19898r0.size() - 1; size >= 0; size--) {
            ((C7051h) this.f19898r0.get(size)).mo12007c(kVar);
        }
    }

    @C0193h0
    /* renamed from: j */
    private LayoutParams m33891j() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m33878a(layoutParams);
        return layoutParams;
    }

    /* renamed from: k */
    private void m33892k() {
        if (this.f19901u0 == null) {
            this.f19901u0 = new ValueAnimator();
            this.f19901u0.setInterpolator(C5587a.f15930b);
            this.f19901u0.setDuration((long) this.f19892l0);
            this.f19901u0.addUpdateListener(new C7048c());
        }
    }

    /* renamed from: l */
    private void m33893l() {
        int size = this.f19879a.size();
        for (int i = 0; i < size; i++) {
            ((C7056k) this.f19879a.get(i)).mo28212n();
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f19870O.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f19870O.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    public void addView(View view) {
        m33877a(view);
    }

    /* renamed from: b */
    public void mo28117b(@C0193h0 C7051h hVar) {
        this.f19898r0.remove(hVar);
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0195i0
    /* renamed from: c */
    public C7051h mo28120c(@C0195i0 C7050e eVar) {
        if (eVar == null) {
            return null;
        }
        if (this.f19900t0.containsKey(eVar)) {
            return (C7051h) this.f19900t0.get(eVar);
        }
        C7047b bVar = new C7047b(eVar);
        this.f19900t0.put(eVar, bVar);
        return bVar;
    }

    /* renamed from: d */
    public boolean mo28124d() {
        return this.f19895o0;
    }

    /* renamed from: e */
    public boolean mo28125e() {
        return this.f19896p0;
    }

    @C0193h0
    /* renamed from: f */
    public C7056k mo28126f() {
        C7056k b = mo28114b();
        b.f19939h = this;
        b.f19940i = m33886f(b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo28127g() {
        mo28139h();
        C2024a aVar = this.f19903w0;
        if (aVar != null) {
            int a = aVar.mo8886a();
            for (int i = 0; i < a; i++) {
                mo28108a(mo28126f().mo28195b(this.f19903w0.mo8888a(i)), false);
            }
            ViewPager viewPager = this.f19902v0;
            if (viewPager != null && a > 0) {
                int currentItem = viewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo28123d(mo28096a(currentItem));
                }
            }
        }
    }

    public int getSelectedTabPosition() {
        C7056k kVar = this.f19881b;
        if (kVar != null) {
            return kVar.mo28203f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f19879a.size();
    }

    public int getTabGravity() {
        return this.f19891k0;
    }

    @C0195i0
    public ColorStateList getTabIconTint() {
        return this.f19877V;
    }

    public int getTabIndicatorGravity() {
        return this.f19893m0;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f19886f0;
    }

    public int getTabMode() {
        return this.f19894n0;
    }

    @C0195i0
    public ColorStateList getTabRippleColor() {
        return this.f19878W;
    }

    @C0195i0
    public Drawable getTabSelectedIndicator() {
        return this.f19880a0;
    }

    @C0195i0
    public ColorStateList getTabTextColors() {
        return this.f19876U;
    }

    /* renamed from: h */
    public void mo28139h() {
        for (int childCount = this.f19870O.getChildCount() - 1; childCount >= 0; childCount--) {
            m33884d(childCount);
        }
        Iterator it = this.f19879a.iterator();
        while (it.hasNext()) {
            C7056k kVar = (C7056k) it.next();
            it.remove();
            kVar.mo28210l();
            mo28119b(kVar);
        }
        this.f19881b = null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33513a((View) this);
        if (this.f19902v0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m33879a((ViewPager) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f19867A0) {
            setupWithViewPager(null);
            this.f19867A0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(@C0193h0 Canvas canvas) {
        for (int i = 0; i < this.f19870O.getChildCount(); i++) {
            View childAt = this.f19870O.getChildAt(i);
            if (childAt instanceof C7058o) {
                ((C7058o) childAt).m33982a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r0 != 2) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C6936w.m33292a(r0, r1)
            int r0 = (int) r0
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002b
            if (r1 == 0) goto L_0x001c
            goto L_0x003e
        L_0x001c:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x003e
        L_0x002b:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x003e
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x003e
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x003e:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005c
            int r1 = r6.f19888h0
            if (r1 <= 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C6936w.m33292a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005a:
            r6.f19886f0 = r1
        L_0x005c:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00aa
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f19894n0
            if (r0 == 0) goto L_0x007f
            if (r0 == r5) goto L_0x0073
            r1 = 2
            if (r0 == r1) goto L_0x007f
            goto L_0x008a
        L_0x0073:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008a
        L_0x007d:
            r4 = 1
            goto L_0x008a
        L_0x007f:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008a
            goto L_0x007d
        L_0x008a:
            if (r4 == 0) goto L_0x00aa
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C6982k.m33514a((View) this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f19895o0 != z) {
            this.f19895o0 = z;
            for (int i = 0; i < this.f19870O.getChildCount(); i++) {
                View childAt = this.f19870O.getChildAt(i);
                if (childAt instanceof C7058o) {
                    ((C7058o) childAt).mo28216c();
                }
            }
            m33889i();
        }
    }

    public void setInlineLabelResource(@C0192h int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@C0195i0 C7050e eVar) {
        mo28097a();
        mo28104a(mo28120c(eVar));
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m33892k();
        this.f19901u0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@C0195i0 Drawable drawable) {
        if (this.f19880a0 != drawable) {
            this.f19880a0 = drawable;
            C0962e0.m5561u0(this.f19870O);
        }
    }

    public void setSelectedTabIndicatorColor(@C0198k int i) {
        this.f19870O.mo28174a(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f19893m0 != i) {
            this.f19893m0 = i;
            C0962e0.m5561u0(this.f19870O);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f19870O.mo28179b(i);
    }

    public void setTabGravity(int i) {
        if (this.f19891k0 != i) {
            this.f19891k0 = i;
            m33889i();
        }
    }

    public void setTabIconTint(@C0195i0 ColorStateList colorStateList) {
        if (this.f19877V != colorStateList) {
            this.f19877V = colorStateList;
            m33893l();
        }
    }

    public void setTabIconTintResource(@C0202m int i) {
        setTabIconTint(C0242a.m1108b(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f19896p0 = z;
        C0962e0.m5561u0(this.f19870O);
    }

    public void setTabMode(int i) {
        if (i != this.f19894n0) {
            this.f19894n0 = i;
            m33889i();
        }
    }

    public void setTabRippleColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f19878W != colorStateList) {
            this.f19878W = colorStateList;
            for (int i = 0; i < this.f19870O.getChildCount(); i++) {
                View childAt = this.f19870O.getChildAt(i);
                if (childAt instanceof C7058o) {
                    ((C7058o) childAt).m33981a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@C0202m int i) {
        setTabRippleColor(C0242a.m1108b(getContext(), i));
    }

    public void setTabTextColors(@C0195i0 ColorStateList colorStateList) {
        if (this.f19876U != colorStateList) {
            this.f19876U = colorStateList;
            m33893l();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@C0195i0 C2024a aVar) {
        mo28102a(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f19897q0 != z) {
            this.f19897q0 = z;
            for (int i = 0; i < this.f19870O.getChildCount(); i++) {
                View childAt = this.f19870O.getChildAt(i);
                if (childAt instanceof C7058o) {
                    ((C7058o) childAt).m33981a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@C0192h int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@C0195i0 ViewPager viewPager) {
        mo28101a(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.tabStyle);
    }

    /* renamed from: d */
    private void m33884d(int i) {
        C7058o oVar = (C7058o) this.f19870O.getChildAt(i);
        this.f19870O.removeViewAt(i);
        if (oVar != null) {
            oVar.mo28214a();
            this.f19868B0.release(oVar);
        }
        requestLayout();
    }

    /* renamed from: e */
    private void m33885e(@C0193h0 C7056k kVar) {
        C7058o oVar = kVar.f19940i;
        oVar.setSelected(false);
        oVar.setActivated(false);
        this.f19870O.addView(oVar, kVar.mo28203f(), m33891j());
    }

    /* renamed from: a */
    public void mo28098a(int i, float f, boolean z) {
        mo28099a(i, f, z, true);
    }

    public void addView(View view, int i) {
        m33877a(view);
    }

    @Deprecated
    /* renamed from: b */
    public void mo28116b(@C0195i0 C7050e eVar) {
        mo28117b(mo28120c(eVar));
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19879a = new ArrayList<>();
        this.f19869N = new RectF();
        this.f19886f0 = Integer.MAX_VALUE;
        this.f19898r0 = new ArrayList<>();
        this.f19900t0 = new HashMap<>();
        this.f19868B0 = new C0942b(12);
        setHorizontalScrollBarEnabled(false);
        this.f19870O = new C7053j(context);
        super.addView(this.f19870O, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.TabLayout, i, C5582R.style.Widget_Design_TabLayout, C5582R.styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C6978j jVar = new C6978j();
            jVar.mo27790a(ColorStateList.valueOf(colorDrawable.getColor()));
            jVar.mo27789a(context);
            jVar.mo27799b(C0962e0.m5551r(this));
            C0962e0.m5440a((View) this, (Drawable) jVar);
        }
        this.f19870O.mo28179b(c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabIndicatorHeight, -1));
        this.f19870O.mo28174a(c.getColor(C5582R.styleable.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C6952c.m33334b(context, c, C5582R.styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(c.getInt(C5582R.styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(c.getBoolean(C5582R.styleable.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabPadding, 0);
        this.f19874S = dimensionPixelSize;
        this.f19873R = dimensionPixelSize;
        this.f19872Q = dimensionPixelSize;
        this.f19871P = dimensionPixelSize;
        this.f19871P = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabPaddingStart, this.f19871P);
        this.f19872Q = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabPaddingTop, this.f19872Q);
        this.f19873R = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabPaddingEnd, this.f19873R);
        this.f19874S = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabPaddingBottom, this.f19874S);
        this.f19875T = c.getResourceId(C5582R.styleable.TabLayout_tabTextAppearance, C5582R.style.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.f19875T, C0238R.styleable.TextAppearance);
        try {
            this.f19883c0 = (float) obtainStyledAttributes.getDimensionPixelSize(C0238R.styleable.TextAppearance_android_textSize, 0);
            this.f19876U = C6952c.m33332a(context, obtainStyledAttributes, C0238R.styleable.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (c.hasValue(C5582R.styleable.TabLayout_tabTextColor)) {
                this.f19876U = C6952c.m33332a(context, c, C5582R.styleable.TabLayout_tabTextColor);
            }
            if (c.hasValue(C5582R.styleable.TabLayout_tabSelectedTextColor)) {
                this.f19876U = m33881b(this.f19876U.getDefaultColor(), c.getColor(C5582R.styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.f19877V = C6952c.m33332a(context, c, C5582R.styleable.TabLayout_tabIconTint);
            this.f19882b0 = C6936w.m33293a(c.getInt(C5582R.styleable.TabLayout_tabIconTintMode, -1), (Mode) null);
            this.f19878W = C6952c.m33332a(context, c, C5582R.styleable.TabLayout_tabRippleColor);
            this.f19892l0 = c.getInt(C5582R.styleable.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f19887g0 = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabMinWidth, -1);
            this.f19888h0 = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabMaxWidth, -1);
            this.f19885e0 = c.getResourceId(C5582R.styleable.TabLayout_tabBackground, 0);
            this.f19890j0 = c.getDimensionPixelSize(C5582R.styleable.TabLayout_tabContentStart, 0);
            this.f19894n0 = c.getInt(C5582R.styleable.TabLayout_tabMode, 1);
            this.f19891k0 = c.getInt(C5582R.styleable.TabLayout_tabGravity, 0);
            this.f19895o0 = c.getBoolean(C5582R.styleable.TabLayout_tabInlineLabel, false);
            this.f19897q0 = c.getBoolean(C5582R.styleable.TabLayout_tabUnboundedRipple, false);
            c.recycle();
            Resources resources = getResources();
            this.f19884d0 = (float) resources.getDimensionPixelSize(C5582R.dimen.design_tab_text_size_2line);
            this.f19889i0 = resources.getDimensionPixelSize(C5582R.dimen.design_tab_scrollable_min_width);
            m33889i();
            C0962e0.m5443a((View) this, (C0947a) new C7046a());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: i */
    private void m33889i() {
        int i;
        int i2 = this.f19894n0;
        if (i2 == 0 || i2 == 2) {
            i = Math.max(0, this.f19890j0 - this.f19871P);
        } else {
            i = 0;
        }
        C0962e0.m5473b(this.f19870O, i, 0, 0, 0);
        int i3 = this.f19894n0;
        if (i3 == 0) {
            this.f19870O.setGravity(C0984g.f4394b);
        } else if (i3 == 1 || i3 == 2) {
            this.f19870O.setGravity(1);
        }
        mo28109a(true);
    }

    /* renamed from: a */
    public void mo28099a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f19870O.getChildCount()) {
            if (z2) {
                this.f19870O.mo28175a(i, f);
            }
            ValueAnimator valueAnimator = this.f19901u0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f19901u0.cancel();
            }
            scrollTo(m33875a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m33877a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C7056k mo28114b() {
        C7056k kVar = (C7056k) f19854K0.mo4743a();
        return kVar == null ? new C7056k() : kVar;
    }

    @C0193h0
    /* renamed from: f */
    private C7058o m33886f(@C0193h0 C7056k kVar) {
        C0941a<C7058o> aVar = this.f19868B0;
        C7058o oVar = aVar != null ? (C7058o) aVar.mo4743a() : null;
        if (oVar == null) {
            oVar = new C7058o(getContext());
        }
        oVar.setTab(kVar);
        oVar.setFocusable(true);
        oVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(kVar.f19935d)) {
            oVar.setContentDescription(kVar.f19934c);
        } else {
            oVar.setContentDescription(kVar.f19935d);
        }
        return oVar;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m33877a(view);
    }

    public void setSelectedTabIndicator(@C0213q int i) {
        if (i != 0) {
            setSelectedTabIndicator(C0242a.m1109c(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28119b(C7056k kVar) {
        return f19854K0.release(kVar);
    }

    /* renamed from: c */
    public void mo28121c(@C0193h0 C7056k kVar) {
        if (kVar.f19939h == this) {
            mo28115b(kVar.mo28203f());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    /* renamed from: b */
    public void mo28115b(int i) {
        C7056k kVar = this.f19881b;
        int f = kVar != null ? kVar.mo28203f() : 0;
        m33884d(i);
        C7056k kVar2 = (C7056k) this.f19879a.remove(i);
        if (kVar2 != null) {
            kVar2.mo28210l();
            mo28119b(kVar2);
        }
        int size = this.f19879a.size();
        for (int i2 = i; i2 < size; i2++) {
            ((C7056k) this.f19879a.get(i2)).mo28200d(i2);
        }
        if (f == i) {
            mo28123d(this.f19879a.isEmpty() ? null : (C7056k) this.f19879a.get(Math.max(0, i - 1)));
        }
    }

    /* renamed from: d */
    public void mo28123d(@C0195i0 C7056k kVar) {
        mo28118b(kVar, true);
    }

    /* renamed from: c */
    public boolean mo28122c() {
        return this.f19897q0;
    }

    /* renamed from: c */
    private void m33883c(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0962e0.m5540n0(this) || this.f19870O.mo28177a()) {
                mo28098a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m33875a(i, 0.0f);
            if (scrollX != a) {
                m33892k();
                this.f19901u0.setIntValues(new int[]{scrollX, a});
                this.f19901u0.start();
            }
            this.f19870O.mo28176a(i, this.f19892l0);
        }
    }

    /* renamed from: g */
    private void m33887g(@C0193h0 C7056k kVar) {
        for (int size = this.f19898r0.size() - 1; size >= 0; size--) {
            ((C7051h) this.f19898r0.get(size)).mo12005a(kVar);
        }
    }

    /* renamed from: h */
    private void m33888h(@C0193h0 C7056k kVar) {
        for (int size = this.f19898r0.size() - 1; size >= 0; size--) {
            ((C7051h) this.f19898r0.get(size)).mo12006b(kVar);
        }
    }

    /* renamed from: a */
    public void mo28105a(@C0193h0 C7056k kVar) {
        mo28108a(kVar, this.f19879a.isEmpty());
    }

    /* renamed from: a */
    public void mo28106a(@C0193h0 C7056k kVar, int i) {
        mo28107a(kVar, i, this.f19879a.isEmpty());
    }

    /* renamed from: a */
    public void mo28108a(@C0193h0 C7056k kVar, boolean z) {
        mo28107a(kVar, this.f19879a.size(), z);
    }

    /* renamed from: a */
    public void mo28107a(@C0193h0 C7056k kVar, int i, boolean z) {
        if (kVar.f19939h == this) {
            m33882b(kVar, i);
            m33885e(kVar);
            if (z) {
                kVar.mo28211m();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: b */
    private void m33882b(@C0193h0 C7056k kVar, int i) {
        kVar.mo28200d(i);
        this.f19879a.add(i, kVar);
        int size = this.f19879a.size();
        while (true) {
            i++;
            if (i < size) {
                ((C7056k) this.f19879a.get(i)).mo28200d(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m33880a(@C0193h0 C7062a aVar) {
        C7056k f = mo28126f();
        CharSequence charSequence = aVar.f19961a;
        if (charSequence != null) {
            f.mo28195b(charSequence);
        }
        Drawable drawable = aVar.f19962b;
        if (drawable != null) {
            f.mo28190a(drawable);
        }
        int i = aVar.f19960N;
        if (i != 0) {
            f.mo28194b(i);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            f.mo28192a(aVar.getContentDescription());
        }
        mo28105a(f);
    }

    /* renamed from: b */
    public void mo28118b(@C0195i0 C7056k kVar, boolean z) {
        C7056k kVar2 = this.f19881b;
        if (kVar2 != kVar) {
            int f = kVar != null ? kVar.mo28203f() : -1;
            if (z) {
                if ((kVar2 == null || kVar2.mo28203f() == -1) && f != -1) {
                    mo28098a(f, 0.0f, true);
                } else {
                    m33883c(f);
                }
                if (f != -1) {
                    setSelectedTabView(f);
                }
            }
            this.f19881b = kVar;
            if (kVar2 != null) {
                m33890i(kVar2);
            }
            if (kVar != null) {
                m33888h(kVar);
            }
        } else if (kVar2 != null) {
            m33887g(kVar);
            m33883c(kVar.mo28203f());
        }
    }

    /* renamed from: a */
    public void mo28104a(@C0193h0 C7051h hVar) {
        if (!this.f19898r0.contains(hVar)) {
            this.f19898r0.add(hVar);
        }
    }

    @C0193h0
    /* renamed from: b */
    private static ColorStateList m33881b(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    @Deprecated
    /* renamed from: a */
    public void mo28103a(@C0195i0 C7050e eVar) {
        mo28104a(mo28120c(eVar));
    }

    /* renamed from: a */
    public void mo28097a() {
        this.f19898r0.clear();
        this.f19900t0.clear();
    }

    @C0195i0
    /* renamed from: a */
    public C7056k mo28096a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C7056k) this.f19879a.get(i);
    }

    /* renamed from: a */
    public void mo28100a(int i, int i2) {
        setTabTextColors(m33881b(i, i2));
    }

    /* renamed from: a */
    public void mo28101a(@C0195i0 ViewPager viewPager, boolean z) {
        m33879a(viewPager, z, false);
    }

    /* renamed from: a */
    private void m33879a(@C0195i0 ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f19902v0;
        if (viewPager2 != null) {
            C7057n nVar = this.f19905y0;
            if (nVar != null) {
                viewPager2.removeOnPageChangeListener(nVar);
            }
            C7049d dVar = this.f19906z0;
            if (dVar != null) {
                this.f19902v0.removeOnAdapterChangeListener(dVar);
            }
        }
        C7051h hVar = this.f19899s0;
        if (hVar != null) {
            mo28117b(hVar);
            this.f19899s0 = null;
        }
        if (viewPager != null) {
            this.f19902v0 = viewPager;
            if (this.f19905y0 == null) {
                this.f19905y0 = new C7057n(this);
            }
            this.f19905y0.mo28213a();
            viewPager.addOnPageChangeListener(this.f19905y0);
            this.f19899s0 = new C7061p(viewPager);
            mo28104a(this.f19899s0);
            C2024a adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo28102a(adapter, z);
            }
            if (this.f19906z0 == null) {
                this.f19906z0 = new C7049d();
            }
            this.f19906z0.mo28168a(z);
            viewPager.addOnAdapterChangeListener(this.f19906z0);
            mo28098a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f19902v0 = null;
            mo28102a((C2024a) null, false);
        }
        this.f19867A0 = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28102a(@C0195i0 C2024a aVar, boolean z) {
        C2024a aVar2 = this.f19903w0;
        if (aVar2 != null) {
            DataSetObserver dataSetObserver = this.f19904x0;
            if (dataSetObserver != null) {
                aVar2.mo8898c(dataSetObserver);
            }
        }
        this.f19903w0 = aVar;
        if (z && aVar != null) {
            if (this.f19904x0 == null) {
                this.f19904x0 = new C7052i();
            }
            aVar.mo8890a(this.f19904x0);
        }
        mo28127g();
    }

    /* renamed from: a */
    private void m33877a(View view) {
        if (view instanceof C7062a) {
            m33880a((C7062a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: a */
    private void m33878a(@C0193h0 LayoutParams layoutParams) {
        if (this.f19894n0 == 1 && this.f19891k0 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* renamed from: a */
    private int m33875a(int i, float f) {
        int i2 = this.f19894n0;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f19870O.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f19870O.getChildCount() ? this.f19870O.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C0962e0.m5566x(this) == 0 ? left + i5 : left - i5;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28109a(boolean z) {
        for (int i = 0; i < this.f19870O.getChildCount(); i++) {
            View childAt = this.f19870O.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m33878a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }
}
