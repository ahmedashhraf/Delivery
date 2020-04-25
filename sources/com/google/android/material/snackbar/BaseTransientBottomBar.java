package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0225w;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1054x;
import androidx.core.p034l.p035o0.C1016d;
import com.google.android.material.C5582R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.behavior.SwipeDismissBehavior.C5626c;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.theme.p307a.C7109a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: A */
    private static final int f19747A = 75;

    /* renamed from: B */
    private static final float f19748B = 0.8f;
    @C0193h0

    /* renamed from: C */
    static final Handler f19749C = new Handler(Looper.getMainLooper(), new C7021i());

    /* renamed from: D */
    static final int f19750D = 0;

    /* renamed from: E */
    static final int f19751E = 1;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static final boolean f19752F;

    /* renamed from: G */
    private static final int[] f19753G = {C5582R.attr.snackbarStyle};
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final String f19754H = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: s */
    public static final int f19755s = 0;

    /* renamed from: t */
    public static final int f19756t = 1;

    /* renamed from: u */
    public static final int f19757u = -2;

    /* renamed from: v */
    public static final int f19758v = -1;

    /* renamed from: w */
    public static final int f19759w = 0;

    /* renamed from: x */
    static final int f19760x = 250;

    /* renamed from: y */
    static final int f19761y = 180;

    /* renamed from: z */
    private static final int f19762z = 150;
    @C0193h0

    /* renamed from: a */
    private final ViewGroup f19763a;

    /* renamed from: b */
    private final Context f19764b;
    @C0193h0

    /* renamed from: c */
    protected final C7036y f19765c;
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: d */
    public final C7040a f19766d;

    /* renamed from: e */
    private int f19767e;

    /* renamed from: f */
    private boolean f19768f;
    @C0195i0

    /* renamed from: g */
    private View f19769g;
    @RequiresApi(29)

    /* renamed from: h */
    private final Runnable f19770h = new C7022j();
    @C0195i0

    /* renamed from: i */
    private Rect f19771i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f19772j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f19773k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f19774l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f19775m;

    /* renamed from: n */
    private int f19776n;

    /* renamed from: o */
    private List<C7031s<B>> f19777o;

    /* renamed from: p */
    private Behavior f19778p;
    @C0195i0

    /* renamed from: q */
    private final AccessibilityManager f19779q;
    @C0193h0

    /* renamed from: r */
    C7043b f19780r = new C7025m();

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public @interface C5719r {
    }

    @C0237z(from = 1)
    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    public @interface C5721v {
    }

    public static class Behavior extends SwipeDismissBehavior<View> {
        @C0193h0

        /* renamed from: t */
        private final C7032t f19781t = new C7032t(this);

        /* renamed from: b */
        public boolean mo22294b(View view) {
            return this.f19781t.mo28042a(view);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m33807a(@C0193h0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f19781t.mo28041a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo3998a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, @C0193h0 MotionEvent motionEvent) {
            this.f19781t.mo28040a(coordinatorLayout, view, motionEvent);
            return super.mo3998a(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C7013a extends AnimatorListenerAdapter {
        C7013a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28015o();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C7014b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f19783a;

        C7014b(int i) {
            this.f19783a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28000c(this.f19783a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C7015c implements AnimatorUpdateListener {
        C7015c() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f19765c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C7016d implements AnimatorUpdateListener {
        C7016d() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f19765c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f19765c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C7017e extends AnimatorListenerAdapter {
        C7017e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28015o();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f19766d.mo28075a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C7018f implements AnimatorUpdateListener {

        /* renamed from: a */
        private int f19788a = this.f19789b;

        /* renamed from: b */
        final /* synthetic */ int f19789b;

        C7018f(int i) {
            this.f19789b = i;
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f19752F) {
                C0962e0.m5513h((View) BaseTransientBottomBar.this.f19765c, intValue - this.f19788a);
            } else {
                BaseTransientBottomBar.this.f19765c.setTranslationY((float) intValue);
            }
            this.f19788a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C7019g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f19791a;

        C7019g(int i) {
            this.f19791a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo28000c(this.f19791a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f19766d.mo28076b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C7020h implements AnimatorUpdateListener {

        /* renamed from: a */
        private int f19793a = 0;

        C7020h() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f19752F) {
                C0962e0.m5513h((View) BaseTransientBottomBar.this.f19765c, intValue - this.f19793a);
            } else {
                BaseTransientBottomBar.this.f19765c.setTranslationY((float) intValue);
            }
            this.f19793a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C7021i implements Callback {
        C7021i() {
        }

        public boolean handleMessage(@C0193h0 Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo28018r();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo27998b(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C7022j implements Runnable {
        C7022j() {
        }

        public void run() {
            int a = (BaseTransientBottomBar.this.m33772v() - BaseTransientBottomBar.this.m33774x()) + ((int) BaseTransientBottomBar.this.f19765c.getTranslationY());
            if (a < BaseTransientBottomBar.this.f19775m) {
                LayoutParams layoutParams = BaseTransientBottomBar.this.f19765c.getLayoutParams();
                if (!(layoutParams instanceof MarginLayoutParams)) {
                    BaseTransientBottomBar.f19754H;
                    return;
                }
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin += BaseTransientBottomBar.this.f19775m - a;
                BaseTransientBottomBar.this.f19765c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C7023k implements C1054x {
        C7023k() {
        }

        @C0193h0
        /* renamed from: a */
        public C1006n0 mo860a(View view, @C0193h0 C1006n0 n0Var) {
            BaseTransientBottomBar.this.f19772j = n0Var.mo4885i();
            BaseTransientBottomBar.this.f19773k = n0Var.mo4886j();
            BaseTransientBottomBar.this.f19774l = n0Var.mo4887k();
            BaseTransientBottomBar.this.m33750D();
            return n0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C7024l extends C0947a {
        C7024l() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4930a(1048576);
            dVar.mo4998h(true);
        }

        /* renamed from: a */
        public boolean mo4750a(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo4750a(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo27997b();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C7025m implements C7043b {
        C7025m() {
        }

        /* renamed from: a */
        public void mo28031a(int i) {
            Handler handler = BaseTransientBottomBar.f19749C;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        /* renamed from: b */
        public void mo28032b() {
            Handler handler = BaseTransientBottomBar.f19749C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C7026n implements C7034w {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class C7027a implements Runnable {
            C7027a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo28000c(3);
            }
        }

        C7026n() {
        }

        public void onViewAttachedToWindow(View view) {
            if (VERSION.SDK_INT >= 29) {
                WindowInsets rootWindowInsets = BaseTransientBottomBar.this.f19765c.getRootWindowInsets();
                if (rootWindowInsets != null) {
                    BaseTransientBottomBar.this.f19775m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                    BaseTransientBottomBar.this.m33750D();
                }
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo28014n()) {
                BaseTransientBottomBar.f19749C.post(new C7027a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C7028o implements C7035x {
        C7028o() {
        }

        /* renamed from: a */
        public void mo28036a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f19765c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.m33747A();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C7029p implements C5626c {
        C7029p() {
        }

        /* renamed from: a */
        public void mo22299a(@C0193h0 View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo27995a(0);
        }

        /* renamed from: a */
        public void mo22298a(int i) {
            if (i == 0) {
                C7041b.m33857a().mo28089f(BaseTransientBottomBar.this.f19780r);
            } else if (i == 1 || i == 2) {
                C7041b.m33857a().mo28088e(BaseTransientBottomBar.this.f19780r);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C7030q implements Runnable {
        C7030q() {
        }

        public void run() {
            BaseTransientBottomBar.this.f19765c.setVisibility(0);
            if (BaseTransientBottomBar.this.f19765c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.m33748B();
            } else {
                BaseTransientBottomBar.this.m33749C();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static abstract class C7031s<B> {

        /* renamed from: a */
        public static final int f19804a = 0;

        /* renamed from: b */
        public static final int f19805b = 1;

        /* renamed from: c */
        public static final int f19806c = 2;

        /* renamed from: d */
        public static final int f19807d = 3;

        /* renamed from: e */
        public static final int f19808e = 4;

        @C0207n0({C0208a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s$a */
        public @interface C5720a {
        }

        /* renamed from: a */
        public void mo28038a(B b) {
        }

        /* renamed from: a */
        public void mo28039a(B b, int i) {
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    public static class C7032t {

        /* renamed from: a */
        private C7043b f19809a;

        public C7032t(@C0193h0 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo22297d(0.1f);
            swipeDismissBehavior.mo22293b(0.6f);
            swipeDismissBehavior.mo22290a(0);
        }

        /* renamed from: a */
        public void mo28041a(@C0193h0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f19809a = baseTransientBottomBar.f19780r;
        }

        /* renamed from: a */
        public boolean mo28042a(View view) {
            return view instanceof C7036y;
        }

        /* renamed from: a */
        public void mo28040a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, @C0193h0 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C7041b.m33857a().mo28089f(this.f19809a);
                }
            } else if (coordinatorLayout.mo3936a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C7041b.m33857a().mo28088e(this.f19809a);
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    public interface C7033u extends C7040a {
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$w */
    protected interface C7034w {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$x */
    protected interface C7035x {
        /* renamed from: a */
        void mo28036a(View view, int i, int i2, int i3, int i4);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$y */
    protected static class C7036y extends FrameLayout {

        /* renamed from: S */
        private static final OnTouchListener f19810S = new C7037a();

        /* renamed from: N */
        private int f19811N;

        /* renamed from: O */
        private final float f19812O;

        /* renamed from: P */
        private final float f19813P;

        /* renamed from: Q */
        private ColorStateList f19814Q;

        /* renamed from: R */
        private Mode f19815R;

        /* renamed from: a */
        private C7035x f19816a;

        /* renamed from: b */
        private C7034w f19817b;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$y$a */
        static class C7037a implements OnTouchListener {
            C7037a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C7036y(@C0193h0 Context context) {
            this(context, null);
        }

        @C0193h0
        /* renamed from: a */
        private Drawable m33824a() {
            float dimension = getResources().getDimension(C5582R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C5713a.m25192a(this, C5582R.attr.colorSurface, C5582R.attr.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f19814Q == null) {
                return C0892a.m5161i(gradientDrawable);
            }
            Drawable i = C0892a.m5161i(gradientDrawable);
            C0892a.m5146a(i, this.f19814Q);
            return i;
        }

        /* access modifiers changed from: 0000 */
        public float getActionTextColorAlpha() {
            return this.f19813P;
        }

        /* access modifiers changed from: 0000 */
        public int getAnimationMode() {
            return this.f19811N;
        }

        /* access modifiers changed from: 0000 */
        public float getBackgroundOverlayColorAlpha() {
            return this.f19812O;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C7034w wVar = this.f19817b;
            if (wVar != null) {
                wVar.onViewAttachedToWindow(this);
            }
            C0962e0.m5563v0(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C7034w wVar = this.f19817b;
            if (wVar != null) {
                wVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C7035x xVar = this.f19816a;
            if (xVar != null) {
                xVar.mo28036a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setAnimationMode(int i) {
            this.f19811N = i;
        }

        public void setBackground(@C0195i0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(@C0195i0 Drawable drawable) {
            if (!(drawable == null || this.f19814Q == null)) {
                drawable = C0892a.m5161i(drawable.mutate());
                C0892a.m5146a(drawable, this.f19814Q);
                C0892a.m5149a(drawable, this.f19815R);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
            this.f19814Q = colorStateList;
            if (getBackground() != null) {
                Drawable i = C0892a.m5161i(getBackground().mutate());
                C0892a.m5146a(i, colorStateList);
                C0892a.m5149a(i, this.f19815R);
                if (i != getBackground()) {
                    super.setBackgroundDrawable(i);
                }
            }
        }

        public void setBackgroundTintMode(@C0195i0 Mode mode) {
            this.f19815R = mode;
            if (getBackground() != null) {
                Drawable i = C0892a.m5161i(getBackground().mutate());
                C0892a.m5149a(i, mode);
                if (i != getBackground()) {
                    super.setBackgroundDrawable(i);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(C7034w wVar) {
            this.f19817b = wVar;
        }

        public void setOnClickListener(@C0195i0 OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f19810S);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(C7035x xVar) {
            this.f19816a = xVar;
        }

        protected C7036y(@C0193h0 Context context, AttributeSet attributeSet) {
            super(C7109a.m34252b(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C5582R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C5582R.styleable.SnackbarLayout_elevation)) {
                C0962e0.m5472b((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.SnackbarLayout_elevation, 0));
            }
            this.f19811N = obtainStyledAttributes.getInt(C5582R.styleable.SnackbarLayout_animationMode, 0);
            this.f19812O = obtainStyledAttributes.getFloat(C5582R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C6952c.m33332a(context2, obtainStyledAttributes, C5582R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C6936w.m33293a(obtainStyledAttributes.getInt(C5582R.styleable.SnackbarLayout_backgroundTintMode, -1), Mode.SRC_IN));
            this.f19813P = obtainStyledAttributes.getFloat(C5582R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f19810S);
            setFocusable(true);
            if (getBackground() == null) {
                C0962e0.m5440a((View) this, m33824a());
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        f19752F = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(@C0193h0 ViewGroup viewGroup, @C0193h0 View view, @C0193h0 C7040a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f19763a = viewGroup;
            this.f19766d = aVar;
            this.f19764b = viewGroup.getContext();
            C6928p.m33257a(this.f19764b);
            this.f19765c = (C7036y) LayoutInflater.from(this.f19764b).inflate(mo28009i(), this.f19763a, false);
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo28074a(this.f19765c.getActionTextColorAlpha());
            }
            this.f19765c.addView(view);
            LayoutParams layoutParams = this.f19765c.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                this.f19771i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C0962e0.m5527k((View) this.f19765c, 1);
            C0962e0.m5531l((View) this.f19765c, 1);
            C0962e0.m5486c((View) this.f19765c, true);
            C0962e0.m5448a((View) this.f19765c, (C1054x) new C7023k());
            C0962e0.m5443a((View) this.f19765c, (C0947a) new C7024l());
            this.f19779q = (AccessibilityManager) this.f19764b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m33747A() {
        if (mo28016p()) {
            mo27994a();
            return;
        }
        this.f19765c.setVisibility(0);
        mo28015o();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m33748B() {
        ValueAnimator a = m33753a(0.0f, 1.0f);
        ValueAnimator b = m33757b(f19748B, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, b});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C7013a());
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m33749C() {
        int w = m33773w();
        if (f19752F) {
            C0962e0.m5513h((View) this.f19765c, w);
        } else {
            this.f19765c.setTranslationY((float) w);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{w, 0});
        valueAnimator.setInterpolator(C5587a.f15930b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C7017e());
        valueAnimator.addUpdateListener(new C7018f(w));
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m33750D() {
        LayoutParams layoutParams = this.f19765c.getLayoutParams();
        if ((layoutParams instanceof MarginLayoutParams) && this.f19771i != null) {
            int i = this.f19769g != null ? this.f19776n : this.f19772j;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            Rect rect = this.f19771i;
            marginLayoutParams.bottomMargin = rect.bottom + i;
            marginLayoutParams.leftMargin = rect.left + this.f19773k;
            marginLayoutParams.rightMargin = rect.right + this.f19774l;
            this.f19765c.requestLayout();
            if (VERSION.SDK_INT >= 29 && m33776z()) {
                this.f19765c.removeCallbacks(this.f19770h);
                this.f19765c.post(this.f19770h);
            }
        }
    }

    /* renamed from: u */
    private int m33771u() {
        View view = this.f19769g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f19763a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f19763a.getHeight()) - i;
    }

    /* access modifiers changed from: private */
    @RequiresApi(17)
    /* renamed from: v */
    public int m33772v() {
        WindowManager windowManager = (WindowManager) this.f19764b.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: w */
    private int m33773w() {
        int height = this.f19765c.getHeight();
        LayoutParams layoutParams = this.f19765c.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public int m33774x() {
        int[] iArr = new int[2];
        this.f19765c.getLocationOnScreen(iArr);
        return iArr[1] + this.f19765c.getHeight();
    }

    /* renamed from: y */
    private boolean m33775y() {
        LayoutParams layoutParams = this.f19765c.getLayoutParams();
        return (layoutParams instanceof C0716g) && (((C0716g) layoutParams).mo4027d() instanceof SwipeDismissBehavior);
    }

    /* renamed from: z */
    private boolean m33776z() {
        return this.f19775m > 0 && !this.f19768f && m33775y();
    }

    /* access modifiers changed from: protected */
    @C0183c0
    /* renamed from: i */
    public int mo28009i() {
        return mo28011k() ? C5582R.layout.mtrl_layout_snackbar : C5582R.layout.design_layout_snackbar;
    }

    @C0193h0
    /* renamed from: j */
    public View mo28010j() {
        return this.f19765c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo28011k() {
        TypedArray obtainStyledAttributes = this.f19764b.obtainStyledAttributes(f19753G);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo28012l() {
        return this.f19768f;
    }

    /* renamed from: m */
    public boolean mo28013m() {
        return C7041b.m33857a().mo28084a(this.f19780r);
    }

    /* renamed from: n */
    public boolean mo28014n() {
        return C7041b.m33857a().mo28085b(this.f19780r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo28015o() {
        C7041b.m33857a().mo28087d(this.f19780r);
        List<C7031s<B>> list = this.f19777o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C7031s) this.f19777o.get(size)).mo28038a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo28016p() {
        List enabledAccessibilityServiceList = this.f19779q.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public void mo28017q() {
        C7041b.m33857a().mo28081a(mo28007g(), this.f19780r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo28018r() {
        this.f19765c.setOnAttachStateChangeListener(new C7026n());
        if (this.f19765c.getParent() == null) {
            LayoutParams layoutParams = this.f19765c.getLayoutParams();
            if (layoutParams instanceof C0716g) {
                m33754a((C0716g) layoutParams);
            }
            this.f19776n = m33771u();
            m33750D();
            this.f19765c.setVisibility(4);
            this.f19763a.addView(this.f19765c);
        }
        if (C0962e0.m5540n0(this.f19765c)) {
            m33747A();
        } else {
            this.f19765c.setOnLayoutChangeListener(new C7028o());
        }
    }

    /* renamed from: i */
    private void mo28068i(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m33773w()});
        valueAnimator.setInterpolator(C5587a.f15930b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C7019g(i));
        valueAnimator.addUpdateListener(new C7020h());
        valueAnimator.start();
    }

    @C0193h0
    /* renamed from: e */
    public B mo28004e(int i) {
        this.f19765c.setAnimationMode(i);
        return this;
    }

    @C0193h0
    /* renamed from: f */
    public B mo28006f(int i) {
        this.f19767e = i;
        return this;
    }

    /* renamed from: g */
    public int mo28007g() {
        return this.f19767e;
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: h */
    public SwipeDismissBehavior<? extends View> mo28008h() {
        return new Behavior();
    }

    /* renamed from: g */
    private void mo28066g(int i) {
        if (this.f19765c.getAnimationMode() == 1) {
            mo28067h(i);
        } else {
            mo28068i(i);
        }
    }

    /* renamed from: h */
    private void mo28067h(int i) {
        ValueAnimator a = m33753a(1.0f, 0.0f);
        a.setDuration(75);
        a.addListener(new C7014b(i));
        a.start();
    }

    @C0193h0
    /* renamed from: a */
    public B mo27993a(boolean z) {
        this.f19768f = z;
        return this;
    }

    /* renamed from: b */
    public void mo27997b() {
        mo27995a(3);
    }

    @C0195i0
    /* renamed from: c */
    public View mo27999c() {
        return this.f19769g;
    }

    /* renamed from: d */
    public int mo28001d() {
        return this.f19765c.getAnimationMode();
    }

    /* renamed from: e */
    public Behavior mo28003e() {
        return this.f19778p;
    }

    @C0193h0
    /* renamed from: f */
    public Context mo28005f() {
        return this.f19764b;
    }

    @C0193h0
    /* renamed from: a */
    public B mo27990a(@C0195i0 View view) {
        this.f19769g = view;
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public B mo27996b(@C0195i0 C7031s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        List<C7031s<B>> list = this.f19777o;
        if (list == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo28000c(int i) {
        C7041b.m33857a().mo28086c(this.f19780r);
        List<C7031s<B>> list = this.f19777o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C7031s) this.f19777o.get(size)).mo28039a(this, i);
            }
        }
        ViewParent parent = this.f19765c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f19765c);
        }
    }

    @C0193h0
    /* renamed from: d */
    public B mo28002d(@C0225w int i) {
        this.f19769g = this.f19763a.findViewById(i);
        if (this.f19769g != null) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find anchor view with id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @C0193h0
    /* renamed from: a */
    public B mo27991a(Behavior behavior) {
        this.f19778p = behavior;
        return this;
    }

    /* renamed from: b */
    private ValueAnimator m33757b(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5587a.f15932d);
        ofFloat.addUpdateListener(new C7016d());
        return ofFloat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27995a(int i) {
        C7041b.m33857a().mo28082a(this.f19780r, i);
    }

    @C0193h0
    /* renamed from: a */
    public B mo27992a(@C0195i0 C7031s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f19777o == null) {
            this.f19777o = new ArrayList();
        }
        this.f19777o.add(sVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo27998b(int i) {
        if (!mo28016p() || this.f19765c.getVisibility() != 0) {
            mo28000c(i);
        } else {
            mo28066g(i);
        }
    }

    /* renamed from: a */
    private void m33754a(C0716g gVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f19778p;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo28008h();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m33807a(this);
        }
        swipeDismissBehavior.mo22291a((C5626c) new C7029p());
        gVar.mo4017a((C0712c) swipeDismissBehavior);
        if (this.f19769g == null) {
            gVar.f3353g = 80;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo27994a() {
        this.f19765c.post(new C7030q());
    }

    /* renamed from: a */
    private ValueAnimator m33753a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C5587a.f15929a);
        ofFloat.addUpdateListener(new C7015c());
        return ofFloat;
    }
}
