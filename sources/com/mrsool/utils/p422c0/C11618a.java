package com.mrsool.utils.p422c0;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0209o;
import androidx.annotation.C0214q0;
import com.google.android.material.badge.BadgeDrawable;
import com.mrsool.C10232R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.mrsool.utils.c0.a */
/* compiled from: Tooltip */
public final class C11618a {

    /* renamed from: a */
    public static boolean f32893a = false;

    /* renamed from: com.mrsool.utils.c0.a$a */
    /* compiled from: Tooltip */
    public static final class C11619a {

        /* renamed from: e */
        public static final C11619a f32894e = new C11619a().mo39874a();

        /* renamed from: f */
        public static final C11619a f32895f = new C11619a().mo39876a(600).mo39877b(4).mo39874a();

        /* renamed from: a */
        int f32896a = 8;

        /* renamed from: b */
        int f32897b = 0;

        /* renamed from: c */
        long f32898c = 400;

        /* renamed from: d */
        boolean f32899d;

        /* renamed from: a */
        public C11619a mo39875a(int i) {
            m52343b();
            this.f32897b = i;
            return this;
        }

        /* renamed from: b */
        public C11619a mo39877b(int i) {
            m52343b();
            this.f32896a = i;
            return this;
        }

        /* renamed from: b */
        private void m52343b() {
            if (this.f32899d) {
                throw new IllegalStateException("Builder cannot be modified");
            }
        }

        /* renamed from: a */
        public C11619a mo39876a(long j) {
            m52343b();
            this.f32898c = j;
            return this;
        }

        /* renamed from: a */
        public C11619a mo39874a() {
            m52343b();
            this.f32899d = true;
            return this;
        }
    }

    /* renamed from: com.mrsool.utils.c0.a$b */
    /* compiled from: Tooltip */
    public static final class C11620b {

        /* renamed from: x */
        private static int f32900x;

        /* renamed from: a */
        int f32901a;

        /* renamed from: b */
        CharSequence f32902b;

        /* renamed from: c */
        View f32903c;

        /* renamed from: d */
        C11623e f32904d;

        /* renamed from: e */
        int f32905e = 0;

        /* renamed from: f */
        int f32906f = C10232R.layout.tooltip_textview;

        /* renamed from: g */
        int f32907g = 0;

        /* renamed from: h */
        long f32908h;

        /* renamed from: i */
        Point f32909i;

        /* renamed from: j */
        long f32910j = 0;

        /* renamed from: k */
        boolean f32911k;

        /* renamed from: l */
        int f32912l = -1;

        /* renamed from: m */
        int f32913m = C10232R.style.ToolTipLayoutDefaultStyle;

        /* renamed from: n */
        int f32914n = C10232R.attr.ttlm_defaultStyle;

        /* renamed from: o */
        long f32915o = 0;

        /* renamed from: p */
        boolean f32916p;

        /* renamed from: q */
        boolean f32917q = true;

        /* renamed from: r */
        long f32918r = 200;

        /* renamed from: s */
        C11621c f32919s;

        /* renamed from: t */
        boolean f32920t;

        /* renamed from: u */
        boolean f32921u = true;

        /* renamed from: v */
        C11619a f32922v;

        /* renamed from: w */
        Typeface f32923w;

        public C11620b(int i) {
            this.f32901a = i;
        }

        /* renamed from: b */
        private void m52348b() {
            if (this.f32920t) {
                throw new IllegalStateException("Builder cannot be modified");
            }
        }

        /* renamed from: a */
        public C11620b mo39880a(int i, boolean z) {
            this.f32906f = i;
            this.f32916p = z;
            return this;
        }

        /* renamed from: c */
        public C11620b mo39895c(int i) {
            m52348b();
            return mo39880a(i, true);
        }

        /* renamed from: d */
        public C11620b mo39899d(int i) {
            m52348b();
            this.f32914n = 0;
            this.f32913m = i;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39890a(boolean z) {
            m52348b();
            this.f32917q = z;
            return this;
        }

        /* renamed from: b */
        public C11620b mo39892b(long j) {
            m52348b();
            this.f32918r = j;
            return this;
        }

        /* renamed from: c */
        public C11620b mo39897c(Resources resources, @C0214q0 int i) {
            return mo39889a((CharSequence) resources.getString(i));
        }

        /* renamed from: c */
        public C11620b mo39898c(boolean z) {
            m52348b();
            this.f32911k = !z;
            return this;
        }

        /* renamed from: d */
        public C11620b mo39900d(boolean z) {
            m52348b();
            this.f32921u = z;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39887a(C11621c cVar) {
            m52348b();
            this.f32919s = cVar;
            return this;
        }

        /* renamed from: b */
        public C11620b mo39893b(Resources resources, @C0209o int i) {
            return mo39891b(resources.getDimensionPixelSize(i));
        }

        /* renamed from: b */
        public C11620b mo39891b(int i) {
            m52348b();
            this.f32912l = i;
            return this;
        }

        /* renamed from: c */
        public C11620b mo39896c(long j) {
            m52348b();
            this.f32910j = j;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39889a(CharSequence charSequence) {
            m52348b();
            this.f32902b = charSequence;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C11620b mo39894b(boolean z) {
            return mo39898c(z);
        }

        /* renamed from: a */
        public C11620b mo39884a(Typeface typeface) {
            m52348b();
            this.f32923w = typeface;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39886a(C11619a aVar) {
            m52348b();
            this.f32922v = aVar;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39885a(View view, C11623e eVar) {
            m52348b();
            this.f32909i = null;
            this.f32903c = view;
            this.f32904d = eVar;
            return this;
        }

        public C11620b() {
            int i = f32900x;
            f32900x = i + 1;
            this.f32901a = i;
        }

        /* renamed from: a */
        public C11620b mo39883a(Point point, C11623e eVar) {
            m52348b();
            this.f32903c = null;
            this.f32909i = new Point(point);
            this.f32904d = eVar;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39882a(Resources resources, int i) {
            return mo39879a(resources.getDimensionPixelSize(i));
        }

        /* renamed from: a */
        public C11620b mo39879a(int i) {
            m52348b();
            this.f32905e = i;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39888a(C11622d dVar, long j) {
            m52348b();
            this.f32907g = dVar.mo39905a();
            this.f32908h = j;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39881a(long j) {
            m52348b();
            this.f32915o = j;
            return this;
        }

        /* renamed from: a */
        public C11620b mo39878a() {
            m52348b();
            C11619a aVar = this.f32922v;
            if (aVar == null || aVar.f32899d) {
                boolean z = true;
                this.f32920t = true;
                if (!this.f32921u || this.f32904d == C11623e.CENTER) {
                    z = false;
                }
                this.f32921u = z;
                return this;
            }
            throw new IllegalStateException("Builder not closed");
        }
    }

    /* renamed from: com.mrsool.utils.c0.a$c */
    /* compiled from: Tooltip */
    public interface C11621c {
        /* renamed from: a */
        void mo39901a(C11624f fVar);

        /* renamed from: a */
        void mo39902a(C11624f fVar, boolean z, boolean z2);

        /* renamed from: b */
        void mo39903b(C11624f fVar);

        /* renamed from: c */
        void mo39904c(C11624f fVar);
    }

    /* renamed from: com.mrsool.utils.c0.a$d */
    /* compiled from: Tooltip */
    public static class C11622d {

        /* renamed from: b */
        static final int f32924b = 0;

        /* renamed from: c */
        static final int f32925c = 2;

        /* renamed from: d */
        static final int f32926d = 4;

        /* renamed from: e */
        static final int f32927e = 8;

        /* renamed from: f */
        static final int f32928f = 16;

        /* renamed from: g */
        public static final C11622d f32929g = new C11622d(0);

        /* renamed from: h */
        public static final C11622d f32930h = new C11622d(10);

        /* renamed from: i */
        public static final C11622d f32931i = new C11622d(2);

        /* renamed from: j */
        public static final C11622d f32932j = new C11622d(20);

        /* renamed from: k */
        public static final C11622d f32933k = new C11622d(4);

        /* renamed from: l */
        public static final C11622d f32934l = new C11622d(6);

        /* renamed from: m */
        public static final C11622d f32935m = new C11622d(30);

        /* renamed from: a */
        private int f32936a;

        public C11622d() {
            this.f32936a = 0;
        }

        /* renamed from: a */
        public static boolean m52376a(int i) {
            return (i & 8) == 8;
        }

        /* renamed from: b */
        public static boolean m52377b(int i) {
            return (i & 16) == 16;
        }

        /* renamed from: c */
        public static boolean m52378c(int i) {
            return (i & 2) == 2;
        }

        /* renamed from: d */
        public static boolean m52379d(int i) {
            return (i & 4) == 4;
        }

        /* renamed from: a */
        public C11622d mo39906a(boolean z, boolean z2) {
            this.f32936a = z ? this.f32936a | 2 : this.f32936a & -3;
            int i = this.f32936a;
            this.f32936a = z2 ? i | 8 : i & -9;
            return this;
        }

        /* renamed from: b */
        public C11622d mo39908b(boolean z, boolean z2) {
            this.f32936a = z ? this.f32936a | 4 : this.f32936a & -5;
            int i = this.f32936a;
            this.f32936a = z2 ? i | 16 : i & -17;
            return this;
        }

        /* renamed from: c */
        public int mo39909c() {
            return this.f32936a;
        }

        C11622d(int i) {
            this.f32936a = i;
        }

        /* renamed from: a */
        public int mo39905a() {
            return this.f32936a;
        }

        /* renamed from: b */
        public C11622d mo39907b() {
            this.f32936a = 0;
            return this;
        }
    }

    /* renamed from: com.mrsool.utils.c0.a$e */
    /* compiled from: Tooltip */
    public enum C11623e {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        CENTER
    }

    /* renamed from: com.mrsool.utils.c0.a$f */
    /* compiled from: Tooltip */
    public interface C11624f {
        /* renamed from: a */
        void mo39910a(float f);

        /* renamed from: a */
        void mo39911a(int i, int i2);

        /* renamed from: a */
        boolean mo39912a();

        /* renamed from: b */
        void mo39913b();

        /* renamed from: b */
        void mo39914b(float f);

        /* renamed from: b */
        void mo39915b(int i, int i2);

        /* renamed from: c */
        void mo39916c();

        int getTooltipId();

        boolean isShown();

        void remove();

        void requestLayout();

        void setText(@C0214q0 int i);

        void setText(CharSequence charSequence);

        void setTextColor(int i);

        void setTextColor(ColorStateList colorStateList);
    }

    @SuppressLint({"ViewConstructor"})
    /* renamed from: com.mrsool.utils.c0.a$g */
    /* compiled from: Tooltip */
    public static class C11625g extends ViewGroup implements C11624f {

        /* renamed from: M0 */
        public static final int f32937M0 = 10;

        /* renamed from: N0 */
        private static final String f32938N0 = "TooltipView";

        /* renamed from: O0 */
        private static final List<C11623e> f32939O0 = new ArrayList(Arrays.asList(new C11623e[]{C11623e.LEFT, C11623e.RIGHT, C11623e.TOP, C11623e.BOTTOM, C11623e.CENTER}));
        /* access modifiers changed from: private */

        /* renamed from: A0 */
        public Rect f32940A0;
        /* access modifiers changed from: private */

        /* renamed from: B0 */
        public View f32941B0;
        /* access modifiers changed from: private */

        /* renamed from: C0 */
        public C11633b f32942C0;

        /* renamed from: D0 */
        private final OnPreDrawListener f32943D0 = new C11629d();

        /* renamed from: E0 */
        private TextView f32944E0;

        /* renamed from: F0 */
        private Typeface f32945F0;

        /* renamed from: G0 */
        private int f32946G0;

        /* renamed from: H0 */
        private ValueAnimator f32947H0;

        /* renamed from: I0 */
        private C11619a f32948I0;

        /* renamed from: J0 */
        private boolean f32949J0;

        /* renamed from: K0 */
        private final OnGlobalLayoutListener f32950K0 = new C11630e();

        /* renamed from: L0 */
        private boolean f32951L0;

        /* renamed from: N */
        private final int f32952N;

        /* renamed from: O */
        private final int f32953O;

        /* renamed from: P */
        private final int f32954P;

        /* renamed from: Q */
        private final Rect f32955Q;

        /* renamed from: R */
        private final long f32956R;

        /* renamed from: S */
        private final int f32957S;

        /* renamed from: T */
        private final Point f32958T;

        /* renamed from: U */
        private final int f32959U;

        /* renamed from: V */
        private final int f32960V;

        /* renamed from: W */
        private final int f32961W;

        /* renamed from: a */
        private final List<C11623e> f32962a = new ArrayList(f32939O0);

        /* renamed from: a0 */
        private final boolean f32963a0;

        /* renamed from: b */
        private final long f32964b;
        /* access modifiers changed from: private */

        /* renamed from: b0 */
        public final long f32965b0;

        /* renamed from: c0 */
        private final boolean f32966c0;

        /* renamed from: d0 */
        private final long f32967d0;

        /* renamed from: e0 */
        private final C11637d f32968e0;
        /* access modifiers changed from: private */

        /* renamed from: f0 */
        public final Rect f32969f0 = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: g0 */
        public final int[] f32970g0 = new int[2];

        /* renamed from: h0 */
        private final Handler f32971h0 = new Handler();

        /* renamed from: i0 */
        private final Rect f32972i0 = new Rect();

        /* renamed from: j0 */
        private final Point f32973j0 = new Point();
        /* access modifiers changed from: private */

        /* renamed from: k0 */
        public final Rect f32974k0 = new Rect();

        /* renamed from: l0 */
        private final float f32975l0;
        /* access modifiers changed from: private */

        /* renamed from: m0 */
        public C11621c f32976m0;
        /* access modifiers changed from: private */

        /* renamed from: n0 */
        public int[] f32977n0;

        /* renamed from: o0 */
        private C11623e f32978o0;
        /* access modifiers changed from: private */

        /* renamed from: p0 */
        public Animator f32979p0;

        /* renamed from: q0 */
        private boolean f32980q0;
        /* access modifiers changed from: private */

        /* renamed from: r0 */
        public WeakReference<View> f32981r0;
        /* access modifiers changed from: private */

        /* renamed from: s0 */
        public boolean f32982s0;

        /* renamed from: t0 */
        private final OnAttachStateChangeListener f32983t0 = new C11626a();

        /* renamed from: u0 */
        private Runnable f32984u0 = new C11627b();

        /* renamed from: v0 */
        private boolean f32985v0;
        /* access modifiers changed from: private */

        /* renamed from: w0 */
        public boolean f32986w0;

        /* renamed from: x0 */
        Runnable f32987x0 = new C11628c();

        /* renamed from: y0 */
        private int f32988y0;

        /* renamed from: z0 */
        private CharSequence f32989z0;

        /* renamed from: com.mrsool.utils.c0.a$g$a */
        /* compiled from: Tooltip */
        class C11626a implements OnAttachStateChangeListener {
            C11626a() {
            }

            public void onViewAttachedToWindow(View view) {
            }

            @TargetApi(17)
            public void onViewDetachedFromWindow(View view) {
                C11625g.this.m52414d(view);
                if (C11625g.this.f32982s0) {
                    Activity a = C11639f.m52469a(C11625g.this.getContext());
                    if (a != null && !a.isFinishing()) {
                        if (VERSION.SDK_INT < 17 || !a.isDestroyed()) {
                            C11625g.this.m52399a(false, false, true);
                        }
                    }
                }
            }
        }

        /* renamed from: com.mrsool.utils.c0.a$g$b */
        /* compiled from: Tooltip */
        class C11627b implements Runnable {
            C11627b() {
            }

            public void run() {
                C11625g.this.m52399a(false, false, false);
            }
        }

        /* renamed from: com.mrsool.utils.c0.a$g$c */
        /* compiled from: Tooltip */
        class C11628c implements Runnable {
            C11628c() {
            }

            public void run() {
                C11625g.this.f32986w0 = true;
            }
        }

        /* renamed from: com.mrsool.utils.c0.a$g$d */
        /* compiled from: Tooltip */
        class C11629d implements OnPreDrawListener {
            C11629d() {
            }

            public boolean onPreDraw() {
                if (!C11625g.this.f32982s0) {
                    C11625g.this.m52409c((View) null);
                    return true;
                }
                if (C11625g.this.f32981r0 != null) {
                    View view = (View) C11625g.this.f32981r0.get();
                    if (view != null) {
                        view.getLocationOnScreen(C11625g.this.f32970g0);
                        if (C11625g.this.f32977n0 == null) {
                            C11625g gVar = C11625g.this;
                            gVar.f32977n0 = new int[]{gVar.f32970g0[0], C11625g.this.f32970g0[1]};
                        }
                        if (!(C11625g.this.f32977n0[0] == C11625g.this.f32970g0[0] && C11625g.this.f32977n0[1] == C11625g.this.f32970g0[1])) {
                            C11625g.this.f32941B0.setTranslationX(((float) (C11625g.this.f32970g0[0] - C11625g.this.f32977n0[0])) + C11625g.this.f32941B0.getTranslationX());
                            C11625g.this.f32941B0.setTranslationY(((float) (C11625g.this.f32970g0[1] - C11625g.this.f32977n0[1])) + C11625g.this.f32941B0.getTranslationY());
                            if (C11625g.this.f32942C0 != null) {
                                C11625g.this.f32942C0.setTranslationX(((float) (C11625g.this.f32970g0[0] - C11625g.this.f32977n0[0])) + C11625g.this.f32942C0.getTranslationX());
                                C11625g.this.f32942C0.setTranslationY(((float) (C11625g.this.f32970g0[1] - C11625g.this.f32977n0[1])) + C11625g.this.f32942C0.getTranslationY());
                            }
                        }
                        C11625g.this.f32977n0[0] = C11625g.this.f32970g0[0];
                        C11625g.this.f32977n0[1] = C11625g.this.f32970g0[1];
                    }
                }
                return true;
            }
        }

        /* renamed from: com.mrsool.utils.c0.a$g$e */
        /* compiled from: Tooltip */
        class C11630e implements OnGlobalLayoutListener {
            C11630e() {
            }

            public void onGlobalLayout() {
                if (!C11625g.this.f32982s0) {
                    C11625g.this.m52393a((View) null);
                    return;
                }
                if (C11625g.this.f32981r0 != null) {
                    View view = (View) C11625g.this.f32981r0.get();
                    if (view != null) {
                        view.getHitRect(C11625g.this.f32969f0);
                        view.getLocationOnScreen(C11625g.this.f32970g0);
                        if (!C11625g.this.f32969f0.equals(C11625g.this.f32974k0)) {
                            C11625g.this.f32974k0.set(C11625g.this.f32969f0);
                            C11625g.this.f32969f0.offsetTo(C11625g.this.f32970g0[0], C11625g.this.f32970g0[1]);
                            C11625g.this.f32940A0.set(C11625g.this.f32969f0);
                            C11625g.this.m52418f();
                        }
                    }
                }
            }
        }

        /* renamed from: com.mrsool.utils.c0.a$g$f */
        /* compiled from: Tooltip */
        class C11631f implements AnimatorListener {

            /* renamed from: a */
            boolean f32995a;

            C11631f() {
            }

            public void onAnimationCancel(Animator animator) {
                this.f32995a = true;
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.f32995a) {
                    if (C11625g.this.f32976m0 != null) {
                        C11625g.this.f32976m0.mo39903b(C11625g.this);
                    }
                    C11625g.this.remove();
                    C11625g.this.f32979p0 = null;
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                this.f32995a = false;
            }
        }

        /* renamed from: com.mrsool.utils.c0.a$g$g */
        /* compiled from: Tooltip */
        class C11632g implements AnimatorListener {

            /* renamed from: a */
            boolean f32997a;

            C11632g() {
            }

            public void onAnimationCancel(Animator animator) {
                this.f32997a = true;
            }

            public void onAnimationEnd(Animator animator) {
                if (!this.f32997a) {
                    if (C11625g.this.f32976m0 != null) {
                        C11625g.this.f32976m0.mo39904c(C11625g.this);
                    }
                    C11625g gVar = C11625g.this;
                    gVar.mo39928c(gVar.f32965b0);
                }
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                C11625g.this.setVisibility(0);
                this.f32997a = false;
            }
        }

        public C11625g(Context context, C11620b bVar) {
            super(context);
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C10232R.styleable.TooltipLayout, bVar.f32914n, bVar.f32913m);
            this.f32988y0 = obtainStyledAttributes.getDimensionPixelSize(8, 30);
            this.f32952N = obtainStyledAttributes.getResourceId(0, 0);
            this.f32953O = obtainStyledAttributes.getInt(1, BadgeDrawable.f16065c0);
            this.f32975l0 = obtainStyledAttributes.getDimension(5, 0.0f);
            int resourceId = obtainStyledAttributes.getResourceId(7, C10232R.style.ToolTipOverlayDefaultStyle);
            String string = obtainStyledAttributes.getString(6);
            obtainStyledAttributes.recycle();
            this.f32954P = bVar.f32901a;
            this.f32989z0 = bVar.f32902b;
            this.f32978o0 = bVar.f32904d;
            this.f32959U = bVar.f32906f;
            this.f32961W = bVar.f32912l;
            this.f32960V = bVar.f32905e;
            this.f32957S = bVar.f32907g;
            this.f32956R = bVar.f32908h;
            this.f32964b = bVar.f32910j;
            this.f32963a0 = bVar.f32911k;
            this.f32965b0 = bVar.f32915o;
            this.f32966c0 = bVar.f32917q;
            this.f32967d0 = bVar.f32918r;
            this.f32976m0 = bVar.f32919s;
            this.f32948I0 = bVar.f32922v;
            this.f32946G0 = (int) (context.getResources().getDisplayMetrics().density * 10.0f);
            Typeface typeface = bVar.f32923w;
            if (typeface != null) {
                this.f32945F0 = typeface;
            } else if (!TextUtils.isEmpty(string)) {
                this.f32945F0 = C11638e.m52468a(context, string);
            }
            setClipChildren(false);
            setClipToPadding(false);
            Point point = bVar.f32909i;
            if (point != null) {
                this.f32958T = new Point(point);
                this.f32958T.y += this.f32960V;
            } else {
                this.f32958T = null;
            }
            this.f32955Q = new Rect();
            if (bVar.f32903c != null) {
                this.f32940A0 = new Rect();
                bVar.f32903c.getHitRect(this.f32974k0);
                bVar.f32903c.getLocationOnScreen(this.f32970g0);
                this.f32940A0.set(this.f32974k0);
                Rect rect = this.f32940A0;
                int[] iArr = this.f32970g0;
                rect.offsetTo(iArr[0], iArr[1]);
                this.f32981r0 = new WeakReference<>(bVar.f32903c);
                if (bVar.f32903c.getViewTreeObserver().isAlive()) {
                    bVar.f32903c.getViewTreeObserver().addOnGlobalLayoutListener(this.f32950K0);
                    bVar.f32903c.getViewTreeObserver().addOnPreDrawListener(this.f32943D0);
                    bVar.f32903c.addOnAttachStateChangeListener(this.f32983t0);
                }
            }
            if (bVar.f32921u) {
                this.f32942C0 = new C11633b(getContext(), null, 0, resourceId);
                this.f32942C0.setAdjustViewBounds(true);
                this.f32942C0.setLayoutParams(new LayoutParams(-2, -2));
            }
            if (!bVar.f32916p) {
                this.f32968e0 = new C11637d(context, bVar);
            } else {
                this.f32968e0 = null;
                this.f32951L0 = true;
            }
            setVisibility(4);
        }

        /* renamed from: m */
        private void m52431m() {
            ValueAnimator valueAnimator = this.f32947H0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f32947H0 = null;
            }
        }

        public int getTooltipId() {
            return this.f32954P;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.f32982s0 = true;
            ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRectSize(this.f32972i0);
            m52420g();
            m52428k();
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            m52423i();
            m52431m();
            this.f32982s0 = false;
            this.f32981r0 = null;
            super.onDetachedFromWindow();
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            if (this.f32982s0) {
                super.onDraw(canvas);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            View view = this.f32941B0;
            if (view != null) {
                view.layout(view.getLeft(), this.f32941B0.getTop(), this.f32941B0.getMeasuredWidth(), this.f32941B0.getMeasuredHeight());
            }
            C11633b bVar = this.f32942C0;
            if (bVar != null) {
                bVar.layout(bVar.getLeft(), this.f32942C0.getTop(), this.f32942C0.getMeasuredWidth(), this.f32942C0.getMeasuredHeight());
            }
            if (z) {
                WeakReference<View> weakReference = this.f32981r0;
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 != null) {
                        view2.getHitRect(this.f32969f0);
                        view2.getLocationOnScreen(this.f32970g0);
                        Rect rect = this.f32969f0;
                        int[] iArr = this.f32970g0;
                        rect.offsetTo(iArr[0], iArr[1]);
                        this.f32940A0.set(this.f32969f0);
                    }
                }
                m52418f();
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i);
            int size2 = MeasureSpec.getSize(i2);
            int i3 = mode != 0 ? size : 0;
            int i4 = mode2 != 0 ? size2 : 0;
            C11639f.m52470a(f32938N0, 2, "[%d] onMeasure myWidth: %d, myHeight: %d", Integer.valueOf(this.f32954P), Integer.valueOf(i3), Integer.valueOf(i4));
            View view = this.f32941B0;
            if (view != null) {
                if (view.getVisibility() != 8) {
                    this.f32941B0.measure(MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                } else {
                    i3 = 0;
                    i4 = 0;
                }
            }
            C11633b bVar = this.f32942C0;
            if (!(bVar == null || bVar.getVisibility() == 8)) {
                this.f32942C0.measure(MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
            setMeasuredDimension(i3, i4);
        }

        public boolean onTouchEvent(@C0193h0 MotionEvent motionEvent) {
            if (this.f32982s0 && this.f32980q0 && isShown() && this.f32957S != 0) {
                int actionMasked = motionEvent.getActionMasked();
                if ((this.f32986w0 || this.f32965b0 <= 0) && actionMasked == 0) {
                    Rect rect = new Rect();
                    this.f32941B0.getGlobalVisibleRect(rect);
                    boolean contains = rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                    C11633b bVar = this.f32942C0;
                    if (bVar != null) {
                        bVar.getGlobalVisibleRect(rect);
                        contains |= rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
                    }
                    if (C11618a.f32893a) {
                        Object[] objArr = {Boolean.valueOf(C11622d.m52378c(this.f32957S))};
                        String str = f32938N0;
                        C11639f.m52470a(str, 3, "touchInside: %b", objArr);
                        C11639f.m52470a(str, 3, "consumeInside: %b", Boolean.valueOf(C11622d.m52376a(this.f32957S)));
                    }
                    if (contains) {
                        if (C11622d.m52378c(this.f32957S)) {
                            m52399a(true, true, false);
                        }
                        return C11622d.m52376a(this.f32957S);
                    }
                    if (C11622d.m52379d(this.f32957S)) {
                        m52399a(true, false, false);
                    }
                    return C11622d.m52377b(this.f32957S);
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void onVisibilityChanged(@C0193h0 View view, int i) {
            super.onVisibilityChanged(view, i);
            ValueAnimator valueAnimator = this.f32947H0;
            if (valueAnimator == null) {
                return;
            }
            if (i == 0) {
                valueAnimator.start();
            } else {
                valueAnimator.cancel();
            }
        }

        public void remove() {
            if (mo39912a()) {
                mo39930e();
            }
        }

        public void setText(@C0214q0 int i) {
            if (this.f32941B0 != null) {
                setText((CharSequence) getResources().getString(i));
            }
        }

        public void setTextColor(int i) {
            TextView textView = this.f32944E0;
            if (textView != null) {
                textView.setTextColor(-1);
            }
        }

        /* renamed from: d */
        private void m52413d(long j) {
            if (mo39912a()) {
                mo39927b(j);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m52418f() {
            m52397a(this.f32966c0);
        }

        /* renamed from: g */
        private void m52420g() {
            if (mo39912a() && !this.f32985v0) {
                this.f32985v0 = true;
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                this.f32941B0 = LayoutInflater.from(getContext()).inflate(this.f32959U, this, false);
                this.f32941B0.setLayoutParams(layoutParams);
                this.f32944E0 = (TextView) this.f32941B0.findViewById(C10232R.C10236id.tvInfo);
                this.f32944E0.setTextColor(-1);
                this.f32944E0.setText(this.f32989z0);
                int i = this.f32961W;
                if (i > -1) {
                    this.f32944E0.setMaxWidth(i);
                }
                this.f32944E0.setGravity(this.f32953O);
                Typeface typeface = this.f32945F0;
                if (typeface != null) {
                    this.f32944E0.setTypeface(typeface);
                }
                C11637d dVar = this.f32968e0;
                if (dVar != null) {
                    this.f32944E0.setBackgroundDrawable(dVar);
                    if (this.f32963a0) {
                        TextView textView = this.f32944E0;
                        int i2 = this.f32988y0;
                        textView.setPadding(i2 / 2, i2 / 2, i2 / 2, i2 / 2);
                    } else {
                        TextView textView2 = this.f32944E0;
                        int i3 = this.f32988y0;
                        textView2.setPadding(i3, i3, i3, i3);
                    }
                }
                addView(this.f32941B0);
                C11633b bVar = this.f32942C0;
                if (bVar != null) {
                    addView(bVar);
                }
                if (!this.f32951L0 && this.f32975l0 > 0.0f && VERSION.SDK_INT >= 21) {
                    m52425j();
                }
            }
        }

        /* renamed from: h */
        private void m52422h() {
            this.f32971h0.removeCallbacks(this.f32984u0);
            this.f32971h0.removeCallbacks(this.f32987x0);
        }

        /* renamed from: i */
        private void m52423i() {
            this.f32976m0 = null;
            WeakReference<View> weakReference = this.f32981r0;
            if (weakReference != null) {
                m52414d((View) weakReference.get());
            }
        }

        @SuppressLint({"NewApi"})
        /* renamed from: j */
        private void m52425j() {
            this.f32944E0.setElevation(this.f32975l0);
            this.f32944E0.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }

        /* renamed from: k */
        private void m52428k() {
            if (mo39912a()) {
                mo39925a(this.f32967d0);
            }
        }

        /* renamed from: l */
        private void m52430l() {
            if (this.f32944E0 != this.f32941B0) {
                C11619a aVar = this.f32948I0;
                if (aVar != null) {
                    float f = (float) aVar.f32896a;
                    long j = aVar.f32898c;
                    int i = aVar.f32897b;
                    if (i == 0) {
                        C11623e eVar = this.f32978o0;
                        i = (eVar == C11623e.TOP || eVar == C11623e.BOTTOM) ? 2 : 1;
                    }
                    this.f32947H0 = ObjectAnimator.ofFloat(this.f32944E0, i == 2 ? "translationY" : "translationX", new float[]{-f, f});
                    this.f32947H0.setDuration(j);
                    this.f32947H0.setInterpolator(new AccelerateDecelerateInterpolator());
                    this.f32947H0.setRepeatCount(-1);
                    this.f32947H0.setRepeatMode(2);
                    this.f32947H0.start();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo39930e() {
            ViewParent parent = getParent();
            m52422h();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
                Animator animator = this.f32979p0;
                if (animator != null && animator.isStarted()) {
                    this.f32979p0.cancel();
                }
            }
        }

        /* renamed from: b */
        public void mo39913b() {
            if (getParent() == null) {
                Activity a = C11639f.m52469a(getContext());
                LayoutParams layoutParams = new LayoutParams(-1, -1);
                if (a != null) {
                    ((ViewGroup) a.getWindow().getDecorView()).addView(this, layoutParams);
                }
            }
        }

        /* renamed from: c */
        public void mo39916c() {
            m52413d(this.f32967d0);
        }

        public void setText(CharSequence charSequence) {
            this.f32989z0 = charSequence;
            TextView textView = this.f32944E0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }

        public void setTextColor(ColorStateList colorStateList) {
            TextView textView = this.f32944E0;
            if (textView != null) {
                textView.setTextColor(-1);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m52409c(@C0195i0 View view) {
            if (view == null) {
                WeakReference<View> weakReference = this.f32981r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                }
            }
            if (view != null && view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnPreDrawListener(this.f32943D0);
            }
        }

        /* renamed from: d */
        public boolean mo39929d() {
            return this.f32980q0;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m52414d(View view) {
            m52393a(view);
            m52409c(view);
            m52405b(view);
        }

        /* renamed from: a */
        public void mo39911a(int i, int i2) {
            this.f32941B0.setTranslationX((float) (i + this.f32955Q.left));
            this.f32941B0.setTranslationY((float) (i2 + this.f32955Q.top));
        }

        /* renamed from: d */
        private boolean m52415d(boolean z, int i, int i2, int i3, int i4) {
            Rect rect = this.f32955Q;
            int i5 = i3 / 2;
            int centerX = this.f32940A0.centerX() - i5;
            Rect rect2 = this.f32940A0;
            rect.set(centerX, rect2.top - i4, rect2.centerX() + i5, this.f32940A0.top);
            if (this.f32940A0.height() / 2 < i) {
                this.f32955Q.offset(0, -(i - (this.f32940A0.height() / 2)));
            }
            if (z && !C11639f.m52471a(this.f32972i0, this.f32955Q, this.f32946G0)) {
                Rect rect3 = this.f32955Q;
                int i6 = rect3.right;
                Rect rect4 = this.f32972i0;
                int i7 = rect4.right;
                if (i6 > i7) {
                    rect3.offset(i7 - i6, 0);
                } else {
                    int i8 = rect3.left;
                    if (i8 < rect4.left) {
                        rect3.offset(-i8, 0);
                    }
                }
                Rect rect5 = this.f32955Q;
                if (rect5.top < i2) {
                    return true;
                }
                int i9 = rect5.bottom;
                int i10 = this.f32972i0.bottom;
                if (i9 > i10) {
                    rect5.offset(0, i10 - i9);
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo39927b(long j) {
            if (mo39912a() && this.f32980q0) {
                Animator animator = this.f32979p0;
                if (animator != null) {
                    animator.cancel();
                }
                this.f32980q0 = false;
                if (j > 0) {
                    this.f32979p0 = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f});
                    this.f32979p0.setDuration(j);
                    this.f32979p0.addListener(new C11631f());
                    this.f32979p0.start();
                    return;
                }
                setVisibility(4);
                remove();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo39928c(long j) {
            if (j <= 0) {
                this.f32986w0 = true;
            } else if (mo39912a()) {
                this.f32971h0.postDelayed(this.f32987x0, j);
            }
        }

        /* renamed from: a */
        public void mo39910a(float f) {
            View view = this.f32941B0;
            view.setTranslationX(f + view.getTranslationX());
        }

        /* renamed from: a */
        public boolean mo39912a() {
            return this.f32982s0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m52393a(@C0195i0 View view) {
            if (view == null) {
                WeakReference<View> weakReference = this.f32981r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                }
            }
            if (view != null && view.getViewTreeObserver().isAlive()) {
                if (VERSION.SDK_INT >= 16) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f32950K0);
                } else {
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this.f32950K0);
                }
            }
        }

        /* renamed from: c */
        private boolean m52411c(boolean z, int i, int i2, int i3, int i4) {
            Rect rect = this.f32955Q;
            Rect rect2 = this.f32940A0;
            int i5 = rect2.right;
            int i6 = i4 / 2;
            int centerY = rect2.centerY() - i6;
            Rect rect3 = this.f32940A0;
            rect.set(i5, centerY, rect3.right + i3, rect3.centerY() + i6);
            if (this.f32940A0.width() / 2 < i) {
                this.f32955Q.offset(i - (this.f32940A0.width() / 2), 0);
            }
            if (z && !C11639f.m52471a(this.f32972i0, this.f32955Q, this.f32946G0)) {
                Rect rect4 = this.f32955Q;
                int i7 = rect4.bottom;
                int i8 = this.f32972i0.bottom;
                if (i7 > i8) {
                    rect4.offset(0, i8 - i7);
                } else {
                    int i9 = rect4.top;
                    if (i9 < i2) {
                        rect4.offset(0, i2 - i9);
                    }
                }
                Rect rect5 = this.f32955Q;
                int i10 = rect5.right;
                Rect rect6 = this.f32972i0;
                if (i10 > rect6.right) {
                    return true;
                }
                int i11 = rect5.left;
                int i12 = rect6.left;
                if (i11 < i12) {
                    rect5.offset(i12 - i11, 0);
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo39925a(long j) {
            if (!this.f32980q0) {
                Animator animator = this.f32979p0;
                if (animator != null) {
                    animator.cancel();
                }
                this.f32980q0 = true;
                if (j > 0) {
                    this.f32979p0 = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
                    this.f32979p0.setDuration(j);
                    long j2 = this.f32964b;
                    if (j2 > 0) {
                        this.f32979p0.setStartDelay(j2);
                    }
                    this.f32979p0.addListener(new C11632g());
                    this.f32979p0.start();
                } else {
                    setVisibility(0);
                    if (!this.f32986w0) {
                        mo39928c(this.f32965b0);
                    }
                }
                if (this.f32956R > 0) {
                    this.f32971h0.removeCallbacks(this.f32984u0);
                    this.f32971h0.postDelayed(this.f32984u0, this.f32956R);
                }
            }
        }

        /* renamed from: b */
        public void mo39915b(int i, int i2) {
            View view = this.f32941B0;
            view.setTranslationX(((float) i) + view.getTranslationX());
            View view2 = this.f32941B0;
            view2.setTranslationY(((float) i2) + view2.getTranslationY());
        }

        /* renamed from: b */
        public void mo39914b(float f) {
            this.f32941B0.setTranslationX(f + ((float) this.f32955Q.left));
        }

        /* renamed from: b */
        private void m52405b(@C0195i0 View view) {
            if (view == null) {
                WeakReference<View> weakReference = this.f32981r0;
                if (weakReference != null) {
                    view = (View) weakReference.get();
                }
            }
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.f32983t0);
            }
        }

        /* renamed from: b */
        private boolean m52407b(boolean z, int i, int i2, int i3, int i4) {
            Rect rect = this.f32955Q;
            Rect rect2 = this.f32940A0;
            int i5 = rect2.left - i3;
            int i6 = i4 / 2;
            int centerY = rect2.centerY() - i6;
            Rect rect3 = this.f32940A0;
            rect.set(i5, centerY, rect3.left, rect3.centerY() + i6);
            if (this.f32940A0.width() / 2 < i) {
                this.f32955Q.offset(-(i - (this.f32940A0.width() / 2)), 0);
            }
            if (z && !C11639f.m52471a(this.f32972i0, this.f32955Q, this.f32946G0)) {
                Rect rect4 = this.f32955Q;
                int i7 = rect4.bottom;
                int i8 = this.f32972i0.bottom;
                if (i7 > i8) {
                    rect4.offset(0, i8 - i7);
                } else {
                    int i9 = rect4.top;
                    if (i9 < i2) {
                        rect4.offset(0, i2 - i9);
                    }
                }
                Rect rect5 = this.f32955Q;
                int i10 = rect5.left;
                Rect rect6 = this.f32972i0;
                if (i10 < rect6.left) {
                    return true;
                }
                int i11 = rect5.right;
                int i12 = rect6.right;
                if (i11 > i12) {
                    rect5.offset(i12 - i11, 0);
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m52397a(boolean z) {
            this.f32962a.clear();
            this.f32962a.addAll(f32939O0);
            this.f32962a.remove(this.f32978o0);
            this.f32962a.add(0, this.f32978o0);
            m52396a(this.f32962a, z);
        }

        /* renamed from: a */
        private void m52396a(List<C11623e> list, boolean z) {
            int i;
            int i2;
            if (mo39912a()) {
                if (list.size() < 1) {
                    C11621c cVar = this.f32976m0;
                    if (cVar != null) {
                        cVar.mo39901a(this);
                    }
                    setVisibility(8);
                    return;
                }
                int i3 = 0;
                C11623e eVar = (C11623e) list.remove(0);
                int i4 = this.f32972i0.top;
                C11633b bVar = this.f32942C0;
                if (bVar == null || eVar == C11623e.CENTER) {
                    i2 = 0;
                    i = 0;
                } else {
                    int layoutMargins = bVar.getLayoutMargins();
                    i = (this.f32942C0.getWidth() / 2) + layoutMargins;
                    i2 = (this.f32942C0.getHeight() / 2) + layoutMargins;
                }
                if (this.f32940A0 == null) {
                    this.f32940A0 = new Rect();
                    Rect rect = this.f32940A0;
                    Point point = this.f32958T;
                    int i5 = point.x;
                    int i6 = point.y;
                    rect.set(i5, i6 + i4, i5, i6 + i4);
                }
                int i7 = this.f32972i0.top + this.f32960V;
                int width = this.f32941B0.getWidth();
                int height = this.f32941B0.getHeight();
                if (eVar == C11623e.BOTTOM) {
                    if (m52402a(z, i2, i7, width, height)) {
                        m52396a(list, z);
                        return;
                    }
                } else if (eVar == C11623e.TOP) {
                    if (m52415d(z, i2, i7, width, height)) {
                        m52396a(list, z);
                        return;
                    }
                } else if (eVar == C11623e.RIGHT) {
                    if (m52411c(z, i, i7, width, height)) {
                        m52396a(list, z);
                        return;
                    }
                } else if (eVar == C11623e.LEFT) {
                    if (m52407b(z, i, i7, width, height)) {
                        m52396a(list, z);
                        return;
                    }
                } else if (eVar == C11623e.CENTER) {
                    m52398a(z, i7, width, height);
                }
                Point point2 = null;
                if (eVar != this.f32978o0) {
                    this.f32978o0 = eVar;
                    if (eVar == C11623e.CENTER) {
                        C11633b bVar2 = this.f32942C0;
                        if (bVar2 != null) {
                            removeView(bVar2);
                            this.f32942C0 = null;
                        }
                    }
                }
                C11633b bVar3 = this.f32942C0;
                if (bVar3 != null) {
                    bVar3.setTranslationX((float) (this.f32940A0.centerX() - (this.f32942C0.getWidth() / 2)));
                    this.f32942C0.setTranslationY((float) (this.f32940A0.centerY() - (this.f32942C0.getHeight() / 2)));
                }
                this.f32941B0.setTranslationX((float) this.f32955Q.left);
                this.f32941B0.setTranslationY((float) this.f32955Q.top);
                if (this.f32968e0 != null) {
                    mo39926a(eVar, this.f32973j0);
                    C11637d dVar = this.f32968e0;
                    if (!this.f32963a0) {
                        i3 = this.f32988y0 / 2;
                    }
                    if (!this.f32963a0) {
                        point2 = this.f32973j0;
                    }
                    dVar.mo39978a(eVar, i3, point2);
                }
                if (!this.f32949J0) {
                    this.f32949J0 = true;
                    m52430l();
                }
            }
        }

        /* renamed from: a */
        private void m52398a(boolean z, int i, int i2, int i3) {
            int i4 = i2 / 2;
            int i5 = i3 / 2;
            this.f32955Q.set(this.f32940A0.centerX() - i4, this.f32940A0.centerY() - i5, this.f32940A0.centerX() + i4, this.f32940A0.centerY() + i5);
            if (z && !C11639f.m52471a(this.f32972i0, this.f32955Q, this.f32946G0)) {
                Rect rect = this.f32955Q;
                int i6 = rect.bottom;
                int i7 = this.f32972i0.bottom;
                if (i6 > i7) {
                    rect.offset(0, i7 - i6);
                } else {
                    int i8 = rect.top;
                    if (i8 < i) {
                        rect.offset(0, i - i8);
                    }
                }
                Rect rect2 = this.f32955Q;
                int i9 = rect2.right;
                Rect rect3 = this.f32972i0;
                int i10 = rect3.right;
                if (i9 > i10) {
                    rect2.offset(i10 - i9, 0);
                    return;
                }
                int i11 = rect2.left;
                int i12 = rect3.left;
                if (i11 < i12) {
                    rect2.offset(i12 - i11, 0);
                }
            }
        }

        /* renamed from: a */
        private boolean m52402a(boolean z, int i, int i2, int i3, int i4) {
            Rect rect = this.f32955Q;
            int i5 = i3 / 2;
            int centerX = this.f32940A0.centerX() - i5;
            Rect rect2 = this.f32940A0;
            rect.set(centerX, rect2.bottom, rect2.centerX() + i5, this.f32940A0.bottom + i4);
            if (this.f32940A0.height() / 2 < i) {
                this.f32955Q.offset(0, i - (this.f32940A0.height() / 2));
            }
            if (z && !C11639f.m52471a(this.f32972i0, this.f32955Q, this.f32946G0)) {
                Rect rect3 = this.f32955Q;
                int i6 = rect3.right;
                Rect rect4 = this.f32972i0;
                int i7 = rect4.right;
                if (i6 > i7) {
                    rect3.offset(i7 - i6, 0);
                } else {
                    int i8 = rect3.left;
                    if (i8 < rect4.left) {
                        rect3.offset(-i8, 0);
                    }
                }
                Rect rect5 = this.f32955Q;
                if (rect5.bottom > this.f32972i0.bottom) {
                    return true;
                }
                int i9 = rect5.top;
                if (i9 < i2) {
                    rect5.offset(0, i2 - i9);
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo39926a(C11623e eVar, Point point) {
            if (eVar == C11623e.BOTTOM) {
                point.x = this.f32940A0.centerX();
                point.y = this.f32940A0.bottom;
            } else if (eVar == C11623e.TOP) {
                point.x = this.f32940A0.centerX();
                point.y = this.f32940A0.top;
            } else if (eVar == C11623e.RIGHT) {
                Rect rect = this.f32940A0;
                point.x = rect.right;
                point.y = rect.centerY();
            } else if (eVar == C11623e.LEFT) {
                Rect rect2 = this.f32940A0;
                point.x = rect2.left;
                point.y = rect2.centerY();
            } else if (this.f32978o0 == C11623e.CENTER) {
                point.x = this.f32940A0.centerX();
                point.y = this.f32940A0.centerY();
            }
            int i = point.x;
            Rect rect3 = this.f32955Q;
            point.x = i - rect3.left;
            point.y -= rect3.top;
            if (this.f32963a0) {
                return;
            }
            if (eVar == C11623e.LEFT || eVar == C11623e.RIGHT) {
                point.y -= this.f32988y0 / 2;
            } else if (eVar == C11623e.TOP || eVar == C11623e.BOTTOM) {
                point.x -= this.f32988y0 / 2;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m52399a(boolean z, boolean z2, boolean z3) {
            long j;
            Object[] objArr = {Integer.valueOf(this.f32954P), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
            String str = f32938N0;
            C11639f.m52470a(str, 4, "[%d] onClose. fromUser: %b, containsTouch: %b, immediate: %b", objArr);
            if (!mo39912a()) {
                C11639f.m52470a(str, 5, "not yet attached!", new Object[0]);
                return;
            }
            C11621c cVar = this.f32976m0;
            if (cVar != null) {
                cVar.mo39902a(this, z, z2);
            }
            if (z3) {
                j = 0;
            } else {
                j = this.f32967d0;
            }
            m52413d(j);
        }
    }

    private C11618a() {
    }

    /* renamed from: a */
    public static C11624f m52340a(Context context, C11620b bVar) {
        return new C11625g(context, bVar);
    }

    /* renamed from: a */
    public static boolean m52342a(Context context, int i) {
        Activity a = C11639f.m52469a(context);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a.getWindow().getDecorView();
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof C11624f) {
                    C11624f fVar = (C11624f) childAt;
                    if (fVar.getTooltipId() == i) {
                        fVar.remove();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m52341a(Context context) {
        Activity a = C11639f.m52469a(context);
        if (a != null) {
            ViewGroup viewGroup = (ViewGroup) a.getWindow().getDecorView();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof C11624f) {
                    ((C11624f) childAt).remove();
                }
            }
        }
        return false;
    }
}
