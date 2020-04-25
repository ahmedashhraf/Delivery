package smartdevelop.p561ir.eram.showcaseviewlib;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15803c;
import smartdevelop.p561ir.eram.showcaseviewlib.p563e.C15804a;

/* renamed from: smartdevelop.ir.eram.showcaseviewlib.c */
/* compiled from: GuideView */
public class C15792c extends FrameLayout {

    /* renamed from: A0 */
    private static final int f45102A0 = 200;

    /* renamed from: B0 */
    private static final int f45103B0 = 400;

    /* renamed from: C0 */
    private static final int f45104C0 = 6;

    /* renamed from: D0 */
    private static final int f45105D0 = 3;

    /* renamed from: E0 */
    private static final int f45106E0 = 3;

    /* renamed from: F0 */
    private static int f45107F0 = 35;

    /* renamed from: G0 */
    private static final int f45108G0 = 15;

    /* renamed from: H0 */
    private static final int f45109H0 = 12;

    /* renamed from: I0 */
    private static final int f45110I0 = 0;

    /* renamed from: J0 */
    private static final int f45111J0 = -1728053248;

    /* renamed from: K0 */
    private static final int f45112K0 = -3355444;

    /* renamed from: L0 */
    private static final int f45113L0 = -1;

    /* renamed from: M0 */
    private static final int f45114M0 = -1;

    /* renamed from: w0 */
    static final String f45115w0 = "GuideView";

    /* renamed from: x0 */
    private static final int f45116x0 = 10;

    /* renamed from: y0 */
    private static final int f45117y0 = 5;

    /* renamed from: z0 */
    private static final int f45118z0 = 700;

    /* renamed from: N */
    private final Paint f45119N;

    /* renamed from: O */
    private final Paint f45120O;

    /* renamed from: P */
    private final Paint f45121P;

    /* renamed from: Q */
    private final Xfermode f45122Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public View f45123R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public RectF f45124S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final Rect f45125T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public float f45126U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public float f45127V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f45128W;

    /* renamed from: a */
    private final Paint f45129a;

    /* renamed from: a0 */
    private boolean f45130a0;

    /* renamed from: b */
    private final Paint f45131b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f45132b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public float f45133c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public float f45134d0;

    /* renamed from: e0 */
    private float f45135e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public float f45136f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public float f45137g0;

    /* renamed from: h0 */
    private int f45138h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public float f45139i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public float f45140j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public float f45141k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public float f45142l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public float f45143m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public boolean f45144n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C15804a f45145o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public C15802b f45146p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C15801a f45147q0;

    /* renamed from: r0 */
    private C15791b f45148r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public View f45149s0;

    /* renamed from: t0 */
    private View f45150t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C15803c f45151u0;

    /* renamed from: v0 */
    private int f45152v0;

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$a */
    /* compiled from: GuideView */
    class C15793a implements OnGlobalLayoutListener {
        C15793a() {
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT > 16) {
                C15792c.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C15792c.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            C15792c cVar = C15792c.this;
            cVar.setMessageLocation(cVar.m68818j());
            int[] iArr = new int[2];
            C15792c.this.f45123R.getLocationOnScreen(iArr);
            C15792c cVar2 = C15792c.this;
            cVar2.f45124S = new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + cVar2.f45123R.getWidth()), (float) (iArr[1] + C15792c.this.f45123R.getHeight()));
            C15792c.this.f45125T.set(C15792c.this.getPaddingLeft(), C15792c.this.getPaddingTop(), C15792c.this.getWidth() - C15792c.this.getPaddingRight(), C15792c.this.getHeight() - C15792c.this.getPaddingBottom());
            C15792c cVar3 = C15792c.this;
            cVar3.f45139i0 = (float) ((int) (cVar3.f45128W ? C15792c.this.f45139i0 : -C15792c.this.f45139i0));
            C15792c cVar4 = C15792c.this;
            cVar4.f45133c0 = (cVar4.f45128W ? C15792c.this.f45124S.bottom : C15792c.this.f45124S.top) + C15792c.this.f45139i0;
            C15792c cVar5 = C15792c.this;
            cVar5.f45127V = ((float) cVar5.f45132b0) + C15792c.this.f45143m0;
            C15792c.this.m68823l();
            C15792c.this.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$b */
    /* compiled from: GuideView */
    class C15794b implements OnGlobalLayoutListener {
        C15794b() {
        }

        public void onGlobalLayout() {
            if (VERSION.SDK_INT > 16) {
                C15792c.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                C15792c.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
            if (C15792c.this.f45151u0 == C15803c.top) {
                C15792c cVar = C15792c.this;
                cVar.setMessageLocation(cVar.m68818j());
            } else if (C15792c.this.f45151u0 == C15803c.auto) {
                C15792c cVar2 = C15792c.this;
                cVar2.setMessageLocation(cVar2.m68820k());
            } else {
                C15792c cVar3 = C15792c.this;
                cVar3.setMessageLocation(cVar3.m68820k());
            }
            int[] iArr = new int[2];
            C15792c.this.f45123R.getLocationOnScreen(iArr);
            C15792c cVar4 = C15792c.this;
            cVar4.f45124S = new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + cVar4.f45123R.getWidth()), (float) (iArr[1] + C15792c.this.f45123R.getHeight()));
            C15792c.this.f45125T.set(C15792c.this.getPaddingLeft(), C15792c.this.getPaddingTop(), C15792c.this.getWidth() - C15792c.this.getPaddingRight(), C15792c.this.getHeight() - C15792c.this.getPaddingBottom());
            C15792c cVar5 = C15792c.this;
            cVar5.f45139i0 = (float) ((int) (cVar5.f45128W ? C15792c.this.f45139i0 : -C15792c.this.f45139i0));
            C15792c cVar6 = C15792c.this;
            cVar6.f45133c0 = (cVar6.f45128W ? C15792c.this.f45124S.bottom : C15792c.this.f45124S.top) + C15792c.this.f45139i0;
            C15792c cVar7 = C15792c.this;
            cVar7.f45127V = ((float) cVar7.f45132b0) + C15792c.this.f45143m0;
            C15792c.this.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$c */
    /* compiled from: GuideView */
    class C15795c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f45155a;

        C15795c(ValueAnimator valueAnimator) {
            this.f45155a = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C15792c.this.f45134d0 = ((Float) this.f45155a.getAnimatedValue()).floatValue();
            C15792c.this.f45136f0 = ((Float) this.f45155a.getAnimatedValue()).floatValue() - C15792c.this.f45126U;
            C15792c.this.postInvalidate();
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$d */
    /* compiled from: GuideView */
    class C15796d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f45157a;

        C15796d(ValueAnimator valueAnimator) {
            this.f45157a = valueAnimator;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C15792c.this.f45133c0 = ((Float) this.f45157a.getAnimatedValue()).floatValue();
            C15792c.this.postInvalidate();
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$e */
    /* compiled from: GuideView */
    class C15797e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f45159a;

        C15797e(ValueAnimator valueAnimator) {
            this.f45159a = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f45159a.setDuration(700);
            this.f45159a.start();
            C15792c.this.f45144n0 = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$f */
    /* compiled from: GuideView */
    class C15798f implements Runnable {
        C15798f() {
        }

        public void run() {
            View childAt = ((LinearLayout) ((CardView) ((LinearLayout) C15792c.this.f45149s0).getChildAt(0)).getChildAt(0)).getChildAt(0);
            int height = childAt.getHeight();
            int h = ((((((int) C15792c.this.f45124S.top) - C15792c.this.getNavigationBarSize()) - ((int) C15792c.this.f45143m0)) - (C15792c.this.f45149s0.getHeight() - height)) - ((int) (C15792c.this.f45126U * 15.0f))) - 80;
            StringBuilder sb = new StringBuilder();
            sb.append(h);
            sb.append("");
            sb.toString();
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (h < height) {
                layoutParams.height = h;
            } else {
                layoutParams.height = -2;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$g */
    /* compiled from: GuideView */
    static /* synthetic */ class C15799g {

        /* renamed from: a */
        static final /* synthetic */ int[] f45162a = new int[C15801a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                smartdevelop.ir.eram.showcaseviewlib.d.a[] r0 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45162a = r0
                int[] r0 = f45162a     // Catch:{ NoSuchFieldError -> 0x0014 }
                smartdevelop.ir.eram.showcaseviewlib.d.a r1 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a.outside     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f45162a     // Catch:{ NoSuchFieldError -> 0x001f }
                smartdevelop.ir.eram.showcaseviewlib.d.a r1 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a.anywhere     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f45162a     // Catch:{ NoSuchFieldError -> 0x002a }
                smartdevelop.ir.eram.showcaseviewlib.d.a r1 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a.targetView     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f45162a     // Catch:{ NoSuchFieldError -> 0x0035 }
                smartdevelop.ir.eram.showcaseviewlib.d.a r1 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a.none     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: smartdevelop.p561ir.eram.showcaseviewlib.C15792c.C15799g.<clinit>():void");
        }
    }

    /* renamed from: smartdevelop.ir.eram.showcaseviewlib.c$h */
    /* compiled from: GuideView */
    public static class C15800h {

        /* renamed from: a */
        private View f45163a;

        /* renamed from: b */
        private String f45164b;

        /* renamed from: c */
        private String f45165c;

        /* renamed from: d */
        private C15802b f45166d;

        /* renamed from: e */
        private C15801a f45167e;

        /* renamed from: f */
        private Context f45168f;

        /* renamed from: g */
        private Spannable f45169g;

        /* renamed from: h */
        private Typeface f45170h;

        /* renamed from: i */
        private Typeface f45171i;

        /* renamed from: j */
        private C15804a f45172j;

        /* renamed from: k */
        private int f45173k;

        /* renamed from: l */
        private int f45174l;

        /* renamed from: m */
        private float f45175m;

        /* renamed from: n */
        private float f45176n;

        /* renamed from: o */
        private float f45177o;

        /* renamed from: p */
        private float f45178p;

        /* renamed from: q */
        private float f45179q;

        /* renamed from: r */
        private int f45180r;

        /* renamed from: s */
        private View f45181s;

        /* renamed from: t */
        private View f45182t;

        /* renamed from: u */
        private C15803c f45183u;

        /* renamed from: v */
        private int f45184v = 0;

        /* renamed from: w */
        private int f45185w = 0;

        /* renamed from: x */
        private int f45186x = 0;

        /* renamed from: y */
        private boolean f45187y = false;

        public C15800h(Context context) {
            this.f45168f = context;
        }

        /* renamed from: a */
        public C15800h mo52024a(C15802b bVar) {
            this.f45166d = bVar;
            return this;
        }

        /* renamed from: b */
        public C15800h mo52031b(View view) {
            this.f45163a = view;
            return this;
        }

        /* renamed from: c */
        public C15800h mo52033c(float f) {
            this.f45179q = f;
            return this;
        }

        /* renamed from: d */
        public C15800h mo52036d(float f) {
            this.f45175m = f;
            return this;
        }

        /* renamed from: e */
        public C15800h mo52038e(float f) {
            this.f45176n = f;
            return this;
        }

        /* renamed from: f */
        public C15800h mo52040f(int i) {
            this.f45173k = i;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52022a(String str) {
            this.f45165c = str;
            return this;
        }

        /* renamed from: b */
        public C15800h mo52032b(String str) {
            this.f45164b = str;
            return this;
        }

        /* renamed from: c */
        public C15800h mo52035c(View view) {
            this.f45182t = view;
            return this;
        }

        /* renamed from: d */
        public C15800h mo52037d(int i) {
            this.f45184v = i;
            return this;
        }

        /* renamed from: e */
        public C15800h mo52039e(int i) {
            this.f45187y = true;
            this.f45185w = i;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52020a(Spannable spannable) {
            this.f45169g = spannable;
            return this;
        }

        /* renamed from: b */
        public C15800h mo52030b(Typeface typeface) {
            this.f45170h = typeface;
            return this;
        }

        /* renamed from: c */
        public C15800h mo52034c(int i) {
            this.f45186x = i;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52019a(Typeface typeface) {
            this.f45171i = typeface;
            return this;
        }

        /* renamed from: b */
        public C15800h mo52029b(int i) {
            this.f45174l = i;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52026a(C15804a aVar) {
            this.f45172j = aVar;
            return this;
        }

        /* renamed from: b */
        public C15800h mo52028b(float f) {
            this.f45178p = f;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52023a(C15801a aVar) {
            this.f45167e = aVar;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52017a(float f) {
            this.f45177o = f;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52018a(int i) {
            this.f45180r = i;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52021a(View view) {
            this.f45181s = view;
            return this;
        }

        /* renamed from: a */
        public C15800h mo52025a(C15803c cVar) {
            this.f45183u = cVar;
            return this;
        }

        /* renamed from: a */
        public C15792c mo52027a() {
            C15792c cVar = new C15792c(this.f45168f, this.f45163a, this.f45181s, this.f45182t, null);
            C15802b bVar = this.f45166d;
            if (bVar == null) {
                bVar = C15802b.auto;
            }
            cVar.f45146p0 = bVar;
            C15801a aVar = this.f45167e;
            if (aVar == null) {
                aVar = C15801a.targetView;
            }
            cVar.f45147q0 = aVar;
            C15803c cVar2 = this.f45183u;
            if (cVar2 == null) {
                cVar2 = C15803c.top;
            }
            cVar.f45151u0 = cVar2;
            float f = this.f45168f.getResources().getDisplayMetrics().density;
            C15804a aVar2 = this.f45172j;
            if (aVar2 != null) {
                cVar.f45145o0 = aVar2;
            }
            float f2 = this.f45175m;
            if (f2 != 0.0f) {
                cVar.f45143m0 = f2 * f;
            }
            float f3 = this.f45176n;
            if (f3 != 0.0f) {
                cVar.f45137g0 = f3 * f;
            }
            float f4 = this.f45177o;
            if (f4 != 0.0f) {
                cVar.f45134d0 = f4 * f;
            }
            float f5 = this.f45178p;
            if (f5 != 0.0f) {
                cVar.f45136f0 = f5 * f;
            }
            float f6 = this.f45179q;
            if (f6 != 0.0f) {
                cVar.f45142l0 = f6 * f;
            }
            cVar.setRoundRadius(this.f45184v);
            cVar.setViewPosition(this.f45183u);
            cVar.f45141k0 = (float) this.f45186x;
            if (this.f45187y) {
                cVar.f45140j0 = (float) this.f45185w;
            }
            return cVar;
        }
    }

    /* synthetic */ C15792c(Context context, View view, View view2, View view3, C15793a aVar) {
        this(context, view, view2, view3);
    }

    /* access modifiers changed from: private */
    public int getNavigationBarSize() {
        Resources resources = getContext().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public void setMessageLocation(Point point) {
        this.f45148r0.setX((float) point.x);
        this.f45148r0.setY((float) point.y);
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f45123R != null) {
            this.f45129a.setColor(f45111J0);
            this.f45129a.setStyle(Style.FILL);
            this.f45129a.setAntiAlias(true);
            canvas.drawRect(this.f45125T, this.f45129a);
            this.f45121P.setXfermode(this.f45122Q);
            this.f45121P.setAntiAlias(true);
            RectF rectF = this.f45124S;
            int i = f45107F0;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f45121P);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() != 0) {
            return false;
        }
        int i = C15799g.f45162a[this.f45147q0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mo51999a();
            } else if (i == 3 && this.f45124S.contains(x, y)) {
                this.f45123R.performClick();
                mo51999a();
            }
        } else if (!m68795a(this.f45148r0, x, y)) {
            mo51999a();
        }
        return true;
    }

    public void setRoundRadius(int i) {
        this.f45152v0 = i;
        f45107F0 = i;
    }

    public void setViewPosition(C15803c cVar) {
        this.f45151u0 = cVar;
    }

    private C15792c(Context context, View view, View view2, View view3) {
        super(context);
        this.f45129a = new Paint();
        this.f45131b = new Paint();
        this.f45119N = new Paint();
        this.f45120O = new Paint();
        this.f45121P = new Paint(1);
        this.f45122Q = new PorterDuffXfermode(Mode.CLEAR);
        this.f45125T = new Rect();
        this.f45132b0 = 0;
        this.f45134d0 = 0.0f;
        this.f45136f0 = 0.0f;
        this.f45144n0 = false;
        this.f45152v0 = 0;
        setWillNotDraw(false);
        setLayerType(2, null);
        this.f45123R = view;
        this.f45149s0 = view2;
        this.f45150t0 = view3;
        this.f45126U = context.getResources().getDisplayMetrics().density;
        m68813h();
        int[] iArr = new int[2];
        this.f45123R.getLocationOnScreen(iArr);
        this.f45124S = new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + this.f45123R.getWidth()), (float) (iArr[1] + this.f45123R.getHeight()));
        m68807f();
        m68810g();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Point m68820k() {
        /*
            r4 = this;
            smartdevelop.ir.eram.showcaseviewlib.d.b r0 = r4.f45146p0
            smartdevelop.ir.eram.showcaseviewlib.d.b r1 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b.center
            if (r0 != r1) goto L_0x0020
            android.graphics.RectF r0 = r4.f45124S
            float r0 = r0.left
            smartdevelop.ir.eram.showcaseviewlib.b r1 = r4.f45148r0
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            float r0 = r0 - r1
            android.view.View r1 = r4.f45123R
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            float r0 = r0 + r1
        L_0x001e:
            int r0 = (int) r0
            goto L_0x0037
        L_0x0020:
            smartdevelop.ir.eram.showcaseviewlib.d.b r1 = smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b.start
            if (r0 != r1) goto L_0x0027
            float r0 = r4.f45140j0
            goto L_0x001e
        L_0x0027:
            android.graphics.RectF r0 = r4.f45124S
            float r0 = r0.right
            int r0 = (int) r0
            smartdevelop.ir.eram.showcaseviewlib.b r1 = r4.f45148r0
            int r1 = r1.getWidth()
            int r0 = r0 - r1
            float r1 = r4.f45141k0
            int r1 = (int) r1
            int r0 = r0 - r1
        L_0x0037:
            boolean r1 = r4.m68816i()
            if (r1 == 0) goto L_0x0042
            int r1 = r4.getNavigationBarSize()
            int r0 = r0 - r1
        L_0x0042:
            smartdevelop.ir.eram.showcaseviewlib.b r1 = r4.f45148r0
            int r1 = r1.getWidth()
            int r1 = r1 + r0
            int r2 = r4.getWidth()
            if (r1 <= r2) goto L_0x005a
            int r0 = r4.getWidth()
            smartdevelop.ir.eram.showcaseviewlib.b r1 = r4.f45148r0
            int r1 = r1.getWidth()
            int r0 = r0 - r1
        L_0x005a:
            r1 = 0
            if (r0 >= 0) goto L_0x005e
            r0 = 0
        L_0x005e:
            android.graphics.RectF r2 = r4.f45124S
            float r2 = r2.top
            float r3 = r4.f45143m0
            float r2 = r2 + r3
            int r3 = r4.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0085
            r4.f45128W = r1
            android.graphics.RectF r2 = r4.f45124S
            float r2 = r2.top
            smartdevelop.ir.eram.showcaseviewlib.b r3 = r4.f45148r0
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 - r3
            float r3 = r4.f45143m0
            float r2 = r2 - r3
            int r2 = (int) r2
            r4.f45132b0 = r2
            goto L_0x009a
        L_0x0085:
            r2 = 1
            r4.f45128W = r2
            android.graphics.RectF r2 = r4.f45124S
            float r2 = r2.top
            android.view.View r3 = r4.f45123R
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 + r3
            float r3 = r4.f45143m0
            float r2 = r2 + r3
            int r2 = (int) r2
            r4.f45132b0 = r2
        L_0x009a:
            int r2 = r4.f45132b0
            if (r2 >= 0) goto L_0x00a0
            r4.f45132b0 = r1
        L_0x00a0:
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.f45132b0
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: smartdevelop.p561ir.eram.showcaseviewlib.C15792c.m68820k():android.graphics.Point");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m68823l() {
        if (!this.f45144n0) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, this.f45135e0});
            ofFloat.addUpdateListener(new C15795c(ofFloat));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.f45127V, this.f45133c0});
            ofFloat2.addUpdateListener(new C15796d(ofFloat2));
            ofFloat2.setDuration(700);
            ofFloat2.start();
            ofFloat2.addListener(new C15797e(ofFloat));
        }
    }

    /* renamed from: f */
    private void m68807f() {
        if (this.f45149s0 != null) {
            this.f45148r0 = new C15791b(getContext());
            this.f45148r0.mo51997b(0);
            this.f45148r0.addView(this.f45149s0, new LinearLayout.LayoutParams(-1, -2));
            mo52003e();
            int i = ((MarginLayoutParams) ((LinearLayout) this.f45123R.getParent()).getLayoutParams()).leftMargin + 5;
            int i2 = ((MarginLayoutParams) ((LinearLayout) this.f45123R.getParent()).getLayoutParams()).rightMargin + 5;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(i, 0, i2, 0);
            addView(this.f45148r0, layoutParams);
            setMessageLocation(m68818j());
            getViewTreeObserver().addOnGlobalLayoutListener(new C15793a());
        }
    }

    /* renamed from: g */
    private void m68810g() {
        if (this.f45150t0 != null) {
            this.f45148r0 = new C15791b(getContext());
            this.f45148r0.mo51997b(0);
            this.f45148r0.addView(this.f45150t0, new LinearLayout.LayoutParams(-2, -2));
            int i = ((MarginLayoutParams) ((View) this.f45123R.getParent()).getLayoutParams()).leftMargin + 5;
            int i2 = ((MarginLayoutParams) ((View) this.f45123R.getParent()).getLayoutParams()).rightMargin + 5;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(i, 0, i2, 0);
            addView(this.f45148r0, layoutParams);
            C15803c cVar = this.f45151u0;
            if (cVar == C15803c.top) {
                setMessageLocation(m68818j());
            } else if (cVar == C15803c.auto) {
                setMessageLocation(m68820k());
            } else {
                setMessageLocation(m68820k());
            }
            getViewTreeObserver().addOnGlobalLayoutListener(new C15794b());
        }
    }

    /* renamed from: h */
    private void m68813h() {
        float f = this.f45126U;
        this.f45137g0 = f * 3.0f;
        this.f45139i0 = 15.0f * f;
        this.f45140j0 = 12.0f * f;
        this.f45141k0 = 0.0f * f;
        this.f45143m0 = 10.0f * f;
        this.f45138h0 = (int) (5.0f * f);
        this.f45142l0 = 3.0f * f;
        this.f45135e0 = f * 6.0f;
    }

    /* renamed from: i */
    private boolean m68816i() {
        return getResources().getConfiguration().orientation != 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public Point m68818j() {
        int i;
        if (this.f45146p0 == C15802b.center) {
            i = (int) ((this.f45124S.left - ((float) (this.f45148r0.getWidth() / 2))) + ((float) (this.f45123R.getWidth() / 2)));
        } else {
            i = ((int) this.f45124S.right) - this.f45148r0.getWidth();
        }
        if (m68816i()) {
            i -= getNavigationBarSize();
        }
        if (this.f45148r0.getWidth() + i > getWidth()) {
            i = getWidth() - this.f45148r0.getWidth();
        }
        if (i < 0) {
            i = 0;
        }
        this.f45128W = false;
        this.f45132b0 = (int) ((this.f45124S.top - ((float) this.f45148r0.getHeight())) - this.f45143m0);
        if (this.f45150t0 != null) {
            this.f45132b0 = (int) ((this.f45124S.top - ((float) this.f45148r0.getHeight())) + 5.0f);
        }
        if (this.f45132b0 < 0) {
            this.f45132b0 = 0;
        }
        return new Point(i, this.f45132b0);
    }

    /* renamed from: b */
    public boolean mo52000b() {
        return this.f45130a0;
    }

    /* renamed from: c */
    public void mo52001c() {
        setLayoutParams(new LayoutParams(-1, -1));
        setClickable(false);
        ((ViewGroup) ((Activity) getContext()).getWindow().getDecorView()).addView(this);
        if (this.f45149s0 != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f45123R.getPivotY() + ((float) this.f45123R.getHeight()), 0.0f);
            translateAnimation.setDuration(400);
            this.f45148r0.startAnimation(translateAnimation);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        alphaAnimation.setFillAfter(true);
        startAnimation(alphaAnimation);
        this.f45130a0 = true;
    }

    /* renamed from: d */
    public void mo52002d() {
        requestLayout();
    }

    /* renamed from: e */
    public void mo52003e() {
        View view = this.f45149s0;
        if (view != null) {
            view.post(new C15798f());
        }
    }

    /* renamed from: a */
    public void mo51999a() {
        ((ViewGroup) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
        this.f45130a0 = false;
        if (this.f45149s0 != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.f45123R.getPivotY() + ((float) this.f45123R.getHeight()));
            translateAnimation.setDuration(400);
            this.f45148r0.startAnimation(translateAnimation);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300);
        alphaAnimation.setFillAfter(true);
        startAnimation(alphaAnimation);
        C15804a aVar = this.f45145o0;
        if (aVar != null) {
            aVar.mo52041a(this.f45123R);
        }
    }

    /* renamed from: a */
    private boolean m68795a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < ((float) i) || f > ((float) (i + width)) || f2 < ((float) i2) || f2 > ((float) (i2 + height))) {
            return false;
        }
        return true;
    }
}
