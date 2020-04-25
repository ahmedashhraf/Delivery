package com.hsalf.smilerating;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.C0198k;
import androidx.annotation.C0214q0;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0962e0;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.hsalf.smilerating.f */
/* compiled from: SmileRatingAr */
public class C9216f extends C9206b {

    /* renamed from: c1 */
    private static final String f24346c1 = "RatingView";

    /* renamed from: A0 */
    private ArgbEvaluator f24347A0 = new ArgbEvaluator();

    /* renamed from: B0 */
    private OvershootInterpolator f24348B0 = new OvershootInterpolator();

    /* renamed from: C0 */
    private C9219c f24349C0;

    /* renamed from: D0 */
    private Matrix f24350D0 = new Matrix();

    /* renamed from: E0 */
    private RectF f24351E0 = new RectF();

    /* renamed from: F0 */
    private RectF f24352F0 = new RectF();

    /* renamed from: G0 */
    private Path f24353G0 = new Path();

    /* renamed from: H0 */
    private Paint f24354H0 = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public int f24355I0 = -1;

    /* renamed from: J0 */
    private int f24356J0 = -1;

    /* renamed from: K0 */
    private int f24357K0 = -1;

    /* renamed from: L0 */
    private int f24358L0 = -1;

    /* renamed from: M0 */
    private C9212h f24359M0;

    /* renamed from: N0 */
    private float f24360N0;

    /* renamed from: O0 */
    private float f24361O0;

    /* renamed from: P0 */
    private float f24362P0;

    /* renamed from: Q0 */
    private float f24363Q0;

    /* renamed from: R0 */
    private float f24364R0;

    /* renamed from: S0 */
    private float f24365S0;

    /* renamed from: T0 */
    private boolean f24366T0 = false;

    /* renamed from: U0 */
    private C9214d f24367U0 = null;

    /* renamed from: V0 */
    private C9215e f24368V0 = null;

    /* renamed from: W0 */
    private float f24369W0 = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public boolean f24370X0 = true;

    /* renamed from: Y0 */
    private boolean f24371Y0 = false;

    /* renamed from: Z0 */
    private Context f24372Z0;

    /* renamed from: a0 */
    private int f24373a0 = -1;

    /* renamed from: a1 */
    private AnimatorUpdateListener f24374a1 = new C9217a();

    /* renamed from: b0 */
    private int f24375b0 = Color.parseColor("#ffb58c");

    /* renamed from: b1 */
    private AnimatorListener f24376b1 = new C9218b();

    /* renamed from: c0 */
    private int f24377c0 = Color.parseColor("#ffde8c");

    /* renamed from: d0 */
    private int f24378d0 = Color.parseColor("#353431");

    /* renamed from: e0 */
    private int f24379e0 = C0962e0.f4343t;

    /* renamed from: f0 */
    private int f24380f0 = Color.parseColor("#AEB3B5");

    /* renamed from: g0 */
    private int f24381g0 = Color.parseColor("#c8ced3");

    /* renamed from: h0 */
    private int f24382h0 = Color.parseColor("#efefef");

    /* renamed from: i0 */
    private String[] f24383i0 = getResources().getStringArray(C9189R.array.names_ar);

    /* renamed from: j0 */
    private C9220d[] f24384j0 = new C9220d[this.f24301a.length];
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public Map<Integer, C9210e> f24385k0 = new HashMap();

    /* renamed from: l0 */
    private float f24386l0;

    /* renamed from: m0 */
    private boolean f24387m0 = true;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public float f24388n0 = 1.0f;

    /* renamed from: o0 */
    private Paint f24389o0 = new Paint();

    /* renamed from: p0 */
    private Paint f24390p0 = new Paint();

    /* renamed from: q0 */
    private Paint f24391q0 = new Paint();

    /* renamed from: r0 */
    private Paint f24392r0 = new Paint();

    /* renamed from: s0 */
    private C9210e f24393s0 = new C9210e();

    /* renamed from: t0 */
    private Path f24394t0 = new Path();

    /* renamed from: u0 */
    private Paint f24395u0 = new Paint();

    /* renamed from: v0 */
    private Paint f24396v0 = new Paint();

    /* renamed from: w0 */
    private Paint f24397w0 = new Paint();

    /* renamed from: x0 */
    private float f24398x0;

    /* renamed from: y0 */
    private ValueAnimator f24399y0 = new ValueAnimator();

    /* renamed from: z0 */
    private FloatEvaluator f24400z0 = new FloatEvaluator();

    /* renamed from: com.hsalf.smilerating.f$a */
    /* compiled from: SmileRatingAr */
    class C9217a implements AnimatorUpdateListener {
        C9217a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C9216f.this.f24370X0) {
                C9216f.this.f24388n0 = valueAnimator.getAnimatedFraction();
                if (-1 == C9216f.this.f24355I0) {
                    C9216f fVar = C9216f.this;
                    fVar.f24388n0 = 1.0f - fVar.f24388n0;
                }
                C9216f.this.invalidate();
                return;
            }
            C9216f.this.m43143c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.hsalf.smilerating.f$b */
    /* compiled from: SmileRatingAr */
    class C9218b implements AnimatorListener {
        C9218b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C9216f.this.m43147e();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            if (-1 != C9216f.this.f24355I0) {
                C9216f fVar = C9216f.this;
                fVar.m43143c(((C9210e) fVar.f24385k0.get(Integer.valueOf(C9216f.this.f24355I0))).f24318a);
            }
        }
    }

    /* renamed from: com.hsalf.smilerating.f$c */
    /* compiled from: SmileRatingAr */
    protected static class C9219c {

        /* renamed from: g */
        private static final int f24403g = 20;

        /* renamed from: h */
        private static final int f24404h = 200;

        /* renamed from: a */
        private float f24405a;

        /* renamed from: b */
        private float f24406b;

        /* renamed from: c */
        private final float f24407c;

        /* renamed from: d */
        private long f24408d;

        /* renamed from: e */
        private boolean f24409e = false;

        /* renamed from: f */
        private boolean f24410f = true;

        public C9219c(float f) {
            this.f24407c = f;
        }

        /* renamed from: a */
        public static C9219c m43157a(float f) {
            return new C9219c(f);
        }

        /* renamed from: b */
        public void mo33397b(float f, float f2) {
            this.f24405a = f;
            this.f24406b = f2;
            this.f24409e = false;
            this.f24410f = true;
            this.f24408d = System.currentTimeMillis();
        }

        /* renamed from: c */
        public boolean mo33398c(float f, float f2) {
            mo33395a(f, f2);
            return this.f24410f;
        }

        /* renamed from: a */
        public void mo33395a(float f, float f2) {
            float a = m43156a(this.f24405a, this.f24406b, f, f2);
            long currentTimeMillis = System.currentTimeMillis() - this.f24408d;
            if (!this.f24409e && a > 20.0f) {
                this.f24409e = true;
            }
            if (currentTimeMillis > 200 || this.f24409e) {
                this.f24410f = false;
            }
        }

        /* renamed from: b */
        private float m43158b(float f) {
            return f / this.f24407c;
        }

        /* renamed from: a */
        private float m43156a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return m43158b((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
        }

        /* renamed from: a */
        public boolean mo33396a() {
            return this.f24409e;
        }
    }

    /* renamed from: com.hsalf.smilerating.f$d */
    /* compiled from: SmileRatingAr */
    private static class C9220d {

        /* renamed from: a */
        C9210e f24411a;

        /* renamed from: b */
        Path f24412b;

        /* renamed from: c */
        int f24413c;

        private C9220d() {
            this.f24411a = new C9210e();
            this.f24412b = new Path();
        }

        /* synthetic */ C9220d(C9217a aVar) {
            this();
        }
    }

    public C9216f(Context context) {
        super(context);
        this.f24372Z0 = context;
        m43145d();
    }

    /* renamed from: b */
    private float m43136b(float f) {
        return f * 0.8f;
    }

    /* renamed from: b */
    private float m43137b(int i) {
        if (i == 0) {
            return 0.0f;
        }
        if (i == 1) {
            return 1.0f;
        }
        if (i == 2) {
            return 0.25f;
        }
        if (i != 3) {
            return i != 4 ? 0.0f : 0.5f;
        }
        return 0.75f;
    }

    /* renamed from: f */
    private void m43149f() {
        int i = -1;
        if (-1 != this.f24355I0) {
            float f = this.f24393s0.f24318a;
            float f2 = 2.14748365E9f;
            C9210e eVar = null;
            for (Integer num : this.f24385k0.keySet()) {
                C9210e eVar2 = (C9210e) this.f24385k0.get(num);
                float abs = Math.abs(eVar2.f24318a - f);
                if (f2 > abs) {
                    i = num.intValue();
                    eVar = eVar2;
                    f2 = abs;
                }
            }
            m43129a(i, eVar, false, true);
        }
    }

    public int getRating() {
        int selectedSmile = getSelectedSmile() + 1;
        if (selectedSmile == 1) {
            return 5;
        }
        if (selectedSmile == 2) {
            return 4;
        }
        if (selectedSmile == 3) {
            return 3;
        }
        if (selectedSmile != 4) {
            return selectedSmile != 5 ? -1 : 1;
        }
        return 2;
    }

    public int getSelectedSmile() {
        return this.f24355I0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C9220d[] dVarArr;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        C9220d[] dVarArr2 = this.f24384j0;
        C9210e eVar = dVarArr2[0].f24411a;
        C9210e eVar2 = dVarArr2[dVarArr2.length - 1].f24411a;
        if (this.f24387m0) {
            canvas.drawLine(eVar.f24318a, eVar.f24319b, eVar2.f24318a, eVar2.f24319b, this.f24396v0);
        }
        for (C9220d dVar : this.f24384j0) {
            float c = m43140c(dVar.f24413c);
            C9210e eVar3 = dVar.f24411a;
            canvas2.drawCircle(eVar3.f24318a, eVar3.f24319b, (this.f24361O0 / 2.0f) * c, this.f24397w0);
            this.f24350D0.reset();
            dVar.f24412b.computeBounds(this.f24351E0, true);
            if (this.f24370X0) {
                float c2 = m43140c(-1);
                this.f24350D0.setScale(c2, c2, this.f24351E0.centerX(), this.f24351E0.centerY());
                if (this.f24355I0 == dVar.f24413c) {
                    c = this.f24400z0.evaluate(1.0f - this.f24388n0, Integer.valueOf(0), Float.valueOf(c2)).floatValue();
                }
            } else {
                this.f24350D0.setScale(c, c, this.f24351E0.centerX(), this.f24351E0.centerY());
            }
            this.f24353G0.reset();
            this.f24353G0.addPath(dVar.f24412b, this.f24350D0);
            canvas2.drawPath(this.f24353G0, this.f24395u0);
            float f = 0.15f - (c * 0.15f);
            this.f24354H0.setColor(((Integer) this.f24347A0.evaluate(((f / 0.15f) - 0.2f) / 0.8f, Integer.valueOf(this.f24380f0), Integer.valueOf(this.f24379e0))).intValue());
            String a = mo33366a(dVar.f24413c);
            C9210e eVar4 = dVar.f24411a;
            m43133a(a, eVar4.f24318a, (this.f24361O0 * (f + 0.7f)) + eVar4.f24319b, this.f24354H0, canvas);
        }
        if (this.f24394t0.isEmpty()) {
            return;
        }
        if (this.f24370X0) {
            this.f24389o0.setColor(((Integer) this.f24347A0.evaluate(this.f24388n0, Integer.valueOf(this.f24395u0.getColor()), Integer.valueOf(this.f24378d0))).intValue());
            this.f24390p0.setColor(((Integer) this.f24347A0.evaluate(this.f24388n0, Integer.valueOf(this.f24397w0.getColor()), Integer.valueOf((this.f24355I0 == 4 || this.f24356J0 == 4) ? this.f24375b0 : this.f24377c0))).intValue());
            this.f24350D0.reset();
            this.f24394t0.computeBounds(this.f24351E0, true);
            float floatValue = this.f24400z0.evaluate(this.f24348B0.getInterpolation(this.f24388n0), Float.valueOf(m43140c(-1)), Float.valueOf(1.0f)).floatValue();
            this.f24350D0.setScale(floatValue, floatValue, this.f24351E0.centerX(), this.f24351E0.centerY());
            this.f24353G0.reset();
            this.f24353G0.addPath(this.f24394t0, this.f24350D0);
            C9210e eVar5 = this.f24393s0;
            canvas2.drawCircle(eVar5.f24318a, eVar5.f24319b, floatValue * (this.f24361O0 / 2.0f), this.f24390p0);
            canvas2.drawPath(this.f24353G0, this.f24389o0);
            return;
        }
        C9210e eVar6 = this.f24393s0;
        canvas2.drawCircle(eVar6.f24318a, eVar6.f24319b, this.f24361O0 / 2.0f, this.f24390p0);
        canvas2.drawPath(this.f24394t0, this.f24389o0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24360N0 = (float) getMeasuredWidth();
        this.f24361O0 = this.f24360N0 / 6.89f;
        float f = this.f24361O0;
        this.f24362P0 = f / 2.0f;
        this.f24393s0.f24319b = this.f24362P0;
        this.f24398x0 = f / 32.0f;
        this.f24354H0.setTextSize(f / 4.5f);
        this.f24359M0 = C9212h.m43106a(Math.round(this.f24360N0), Math.round(this.f24361O0));
        int round = Math.round(this.f24360N0);
        float f2 = this.f24361O0;
        double d = (double) f2;
        double d2 = (double) f2;
        Double.isNaN(d2);
        double d3 = d2 * 0.48d;
        Double.isNaN(d);
        setMeasuredDimension(round, (int) Math.round(d + d3));
        m43142c();
        this.f24396v0.setStrokeWidth(this.f24361O0 * 0.05f);
        int i3 = this.f24358L0;
        m43129a(i3, (C9210e) this.f24385k0.get(Integer.valueOf(i3)), false, false);
        StringBuilder sb = new StringBuilder();
        sb.append("Selected smile:");
        sb.append(mo33366a(this.f24358L0));
        sb.toString();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24371Y0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f24349C0.mo33397b(x, y);
            C9210e eVar = this.f24393s0;
            this.f24366T0 = m43134a(eVar.f24318a, eVar.f24319b, x, y, this.f24362P0);
            this.f24365S0 = x;
        } else if (action == 1) {
            this.f24366T0 = false;
            this.f24349C0.mo33398c(x, y);
            if (!this.f24349C0.mo33396a()) {
                m43127a(x, y);
            } else {
                m43149f();
            }
        } else if (action == 2) {
            this.f24349C0.mo33395a(x, y);
            if (this.f24349C0.mo33396a() && this.f24366T0) {
                m43143c(this.f24393s0.f24318a - (this.f24365S0 - x));
            }
            this.f24365S0 = x;
        }
        return true;
    }

    public void setAngryColor(@C0198k int i) {
        this.f24375b0 = i;
        m43131a(this.f24359M0, m43137b(this.f24355I0), this.f24398x0, this.f24363Q0, this.f24364R0, this.f24393s0, this.f24394t0, this.f24362P0);
    }

    public void setDrawingColor(@C0198k int i) {
        this.f24378d0 = i;
        this.f24389o0.setColor(this.f24378d0);
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f24371Y0 = z;
    }

    public void setNormalColor(@C0198k int i) {
        this.f24377c0 = i;
        m43131a(this.f24359M0, m43137b(this.f24355I0), this.f24398x0, this.f24363Q0, this.f24364R0, this.f24393s0, this.f24394t0, this.f24362P0);
    }

    public void setOnRatingSelectedListener(C9214d dVar) {
        this.f24367U0 = dVar;
    }

    public void setOnSmileySelectionListener(C9215e eVar) {
        this.f24368V0 = eVar;
    }

    public void setPlaceHolderSmileColor(@C0198k int i) {
        this.f24373a0 = i;
        this.f24395u0.setColor(this.f24373a0);
        invalidate();
    }

    public void setPlaceholderBackgroundColor(@C0198k int i) {
        this.f24381g0 = i;
        this.f24396v0.setColor(this.f24381g0);
        this.f24397w0.setColor(this.f24381g0);
        invalidate();
    }

    public void setSelectedSmile(int i) {
        mo33369a(i, false);
    }

    public void setShowLine(boolean z) {
        this.f24387m0 = z;
        invalidate();
    }

    public void setTextNonSelectedColor(@C0198k int i) {
        this.f24380f0 = i;
        invalidate();
    }

    public void setTextSelectedColor(@C0198k int i) {
        this.f24379e0 = i;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        this.f24354H0.setTypeface(typeface);
    }

    /* renamed from: c */
    private void m43142c() {
        this.f24385k0.clear();
        float f = this.f24360N0;
        float f2 = f / 5.0f;
        float f3 = f2 / 2.0f;
        float f4 = this.f24361O0;
        this.f24386l0 = (f2 - f4) / 2.0f;
        float f5 = this.f24386l0;
        this.f24363Q0 = (f4 / 2.0f) + f5;
        this.f24364R0 = (f - (f4 / 2.0f)) - f5;
        int length = this.f24301a.length;
        for (int i = 0; i < length; i++) {
            this.f24384j0[i] = m43126a(i, this.f24362P0);
            this.f24385k0.put(Integer.valueOf(this.f24301a[i]), new C9210e((((float) i) * f2) + f3, this.f24362P0));
        }
    }

    /* renamed from: d */
    private void m43145d() {
        this.f24349C0 = C9219c.m43157a(getResources().getDisplayMetrics().density);
        this.f24354H0.setAntiAlias(true);
        this.f24354H0.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.f24389o0.setAntiAlias(true);
        this.f24389o0.setStrokeWidth(3.0f);
        this.f24389o0.setColor(this.f24378d0);
        this.f24389o0.setStyle(Style.FILL);
        this.f24391q0.setAntiAlias(true);
        this.f24391q0.setColor(C0886a.f4059c);
        this.f24391q0.setStyle(Style.FILL);
        this.f24392r0.setAntiAlias(true);
        this.f24392r0.setColor(-16776961);
        this.f24392r0.setStyle(Style.STROKE);
        this.f24390p0.setAntiAlias(true);
        this.f24390p0.setStyle(Style.FILL);
        this.f24395u0.setAntiAlias(true);
        this.f24395u0.setColor(this.f24373a0);
        this.f24395u0.setStyle(Style.FILL);
        this.f24397w0.setAntiAlias(true);
        this.f24397w0.setColor(this.f24381g0);
        this.f24397w0.setStyle(Style.FILL);
        this.f24396v0.setAntiAlias(true);
        this.f24396v0.setColor(this.f24382h0);
        this.f24396v0.setStyle(Style.STROKE);
        this.f24399y0.setDuration(250);
        this.f24399y0.addListener(this.f24376b1);
        this.f24399y0.addUpdateListener(this.f24374a1);
        this.f24399y0.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m43147e() {
        boolean z = this.f24356J0 == getSelectedSmile();
        int i = this.f24355I0;
        this.f24356J0 = i;
        this.f24358L0 = i;
        C9215e eVar = this.f24368V0;
        if (eVar != null) {
            eVar.mo33365a(i, z);
        }
        C9214d dVar = this.f24367U0;
        if (dVar != null) {
            dVar.mo33364a(getRating(), z);
        }
    }

    /* renamed from: a */
    private void m43130a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9189R.styleable.SmileRating);
            this.f24375b0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_angryColor, this.f24375b0);
            this.f24377c0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_normalColor, this.f24377c0);
            this.f24378d0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_drawingColor, this.f24378d0);
            this.f24373a0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_placeHolderSmileColor, this.f24373a0);
            this.f24381g0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_placeHolderBackgroundColor, this.f24381g0);
            this.f24379e0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_textSelectionColor, this.f24379e0);
            this.f24380f0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_textNonSelectionColor, this.f24380f0);
            this.f24387m0 = obtainStyledAttributes.getBoolean(C9189R.styleable.SmileRating_showLine, true);
            this.f24371Y0 = obtainStyledAttributes.getBoolean(C9189R.styleable.SmileRating_isIndicator, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public boolean mo33371b() {
        return this.f24387m0;
    }

    /* renamed from: c */
    private float m43140c(int i) {
        if (this.f24355I0 != -1 && i == this.f24357K0) {
            return this.f24369W0;
        }
        return 0.8f;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m43143c(float f) {
        float f2 = this.f24363Q0;
        m43146d((f - f2) / (this.f24364R0 - f2));
    }

    /* renamed from: a */
    private C9220d m43126a(int i, float f) {
        C9220d dVar = new C9220d(null);
        dVar.f24413c = i;
        m43131a(this.f24359M0, ((float) i) * 0.25f, this.f24398x0, this.f24363Q0, this.f24364R0, dVar.f24411a, dVar.f24412b, f);
        dVar.f24411a.f24319b = f;
        return dVar;
    }

    /* renamed from: a */
    private void m43133a(String str, float f, float f2, Paint paint, Canvas canvas) {
        canvas.drawText(str, f - (paint.measureText(str) / 2.0f), f2 - ((paint.descent() + paint.ascent()) / 2.0f), paint);
    }

    /* renamed from: a */
    public String mo33366a(int i) {
        String[] strArr = this.f24383i0;
        if (i >= strArr.length || i < 0) {
            return null;
        }
        return strArr[i];
    }

    /* renamed from: a */
    public boolean mo33370a() {
        return this.f24371Y0;
    }

    /* renamed from: a */
    public void mo33367a(int i, @C0214q0 int i2) {
        mo33368a(i, getResources().getString(i2));
    }

    /* renamed from: a */
    public void mo33368a(int i, String str) {
        String[] strArr = this.f24383i0;
        if (str == null) {
            str = "";
        }
        strArr[i] = str;
        invalidate();
    }

    /* renamed from: a */
    private void m43127a(float f, float f2) {
        for (Integer num : this.f24385k0.keySet()) {
            C9210e eVar = (C9210e) this.f24385k0.get(num);
            if (m43134a(eVar.f24318a, eVar.f24319b, f, f2, this.f24362P0)) {
                if (num.intValue() == getSelectedSmile()) {
                    m43147e();
                } else {
                    m43129a(num.intValue(), eVar, true, true);
                }
            }
        }
    }

    /* renamed from: d */
    private void m43146d(float f) {
        m43131a(this.f24359M0, Math.max(Math.min(f, 1.0f), 0.0f), this.f24398x0, this.f24363Q0, this.f24364R0, this.f24393s0, this.f24394t0, this.f24362P0);
        invalidate();
    }

    /* renamed from: a */
    private boolean m43134a(float f, float f2, float f3, float f4, float f5) {
        this.f24352F0.set(f - f5, 0.0f, f + f5, (float) getMeasuredHeight());
        return this.f24352F0.contains(f3, f4);
    }

    /* renamed from: a */
    public void mo33369a(int i, boolean z) {
        this.f24358L0 = i;
        m43129a(i, (C9210e) this.f24385k0.get(Integer.valueOf(i)), true, z);
    }

    /* renamed from: a */
    private void m43129a(int i, C9210e eVar, boolean z, boolean z2) {
        if (this.f24355I0 != i || !z) {
            if (this.f24355I0 == -1) {
                this.f24370X0 = true;
            } else if (i == -1) {
                this.f24370X0 = true;
            } else {
                this.f24370X0 = false;
            }
            this.f24355I0 = i;
            C9210e eVar2 = this.f24393s0;
            if (eVar2 != null) {
                ValueAnimator valueAnimator = this.f24399y0;
                float[] fArr = new float[2];
                fArr[0] = eVar2.f24318a;
                fArr[1] = eVar == null ? 0.0f : eVar.f24318a;
                valueAnimator.setFloatValues(fArr);
                if (z2) {
                    this.f24399y0.start();
                } else if (this.f24355I0 == -1) {
                    if (!this.f24394t0.isEmpty()) {
                        this.f24394t0.reset();
                    }
                    invalidate();
                } else if (eVar != null) {
                    m43143c(eVar.f24318a);
                }
            }
        }
    }

    public C9216f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24372Z0 = context;
        m43130a(attributeSet);
        m43145d();
    }

    /* renamed from: a */
    private void m43131a(C9212h hVar, float f, float f2, float f3, float f4, C9210e eVar, Path path, float f5) {
        float f6 = f;
        if (hVar != null) {
            float floatValue = this.f24400z0.evaluate(f, Float.valueOf(f3), Float.valueOf(f4)).floatValue();
            eVar.f24318a = floatValue;
            float f7 = floatValue - f5;
            if (f6 > 0.75f) {
                float f8 = (f6 - 0.75f) * 4.0f;
                m43128a(f8, 3, 4);
                this.f24390p0.setColor(((Integer) this.f24347A0.evaluate(f8, Integer.valueOf(this.f24377c0), Integer.valueOf(this.f24375b0))).intValue());
                mo33348a(f7, f8, path, hVar.mo33363b(3), hVar.mo33363b(4), this.f24400z0);
                m43132a(hVar, f2, f8, floatValue, 4, path, path, f5);
            } else if (f6 > 0.5f) {
                float f9 = (f6 - 0.5f) * 4.0f;
                m43128a(f9, 2, 3);
                this.f24390p0.setColor(this.f24377c0);
                mo33348a(f7, f9, path, hVar.mo33363b(2), hVar.mo33363b(3), this.f24400z0);
                m43132a(hVar, f2, f9, floatValue, 3, path, path, f5);
            } else if (f6 > 0.25f) {
                float f10 = (f6 - 0.25f) * 4.0f;
                m43128a(f10, 1, 2);
                this.f24390p0.setColor(this.f24377c0);
                mo33348a(f7, f10, path, hVar.mo33363b(1), hVar.mo33363b(2), this.f24400z0);
                m43132a(hVar, f2, f10, floatValue, 1, path, path, f5);
            } else if (f6 >= 0.0f) {
                float f11 = f6 * 4.0f;
                m43128a(f11, 0, 1);
                this.f24390p0.setColor(((Integer) this.f24347A0.evaluate(f11, Integer.valueOf(this.f24377c0), Integer.valueOf(this.f24377c0))).intValue());
                mo33348a(f7, f11, path, hVar.mo33363b(0), hVar.mo33363b(1), this.f24400z0);
                m43132a(hVar, f2, f11, floatValue, 0, path, path, f5);
            } else if (!this.f24394t0.isEmpty()) {
                this.f24394t0.reset();
            }
        }
    }

    /* renamed from: a */
    private void m43128a(float f, int i, int i2) {
        if (f < 0.5f) {
            this.f24369W0 = m43136b(f * 2.0f);
            this.f24357K0 = i;
            return;
        }
        this.f24369W0 = m43136b(1.0f - ((f - 0.5f) * 2.0f));
        this.f24357K0 = i2;
    }

    /* renamed from: a */
    private void m43132a(C9212h hVar, float f, float f2, float f3, int i, Path path, Path path2, float f4) {
        C9207b a = C9208c.m43093a(hVar.mo33361a(0), this.f24400z0, f2, i);
        C9207b a2 = C9208c.m43093a(hVar.mo33361a(1), this.f24400z0, f2, i);
        float f5 = 2.5f * f;
        a.f24308e = f5;
        a2.f24308e = f5;
        C9210e eVar = a.f24306c;
        eVar.f24318a = ((11.0f * f) + f3) - f4;
        float f6 = 0.7f * f4;
        eVar.f24319b = f6;
        C9210e eVar2 = a2.f24306c;
        eVar2.f24318a = ((f * 21.0f) + f3) - f4;
        eVar2.f24319b = f6;
        a.mo33352a(path);
        a2.mo33352a(path2);
    }

    public C9216f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24372Z0 = context;
        m43130a(attributeSet);
        m43145d();
    }
}
