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

public class SmileRating extends C9199a {

    /* renamed from: b1 */
    private static final String f24174b1 = "RatingView";

    /* renamed from: A0 */
    private ArgbEvaluator f24175A0 = new ArgbEvaluator();

    /* renamed from: B0 */
    private OvershootInterpolator f24176B0 = new OvershootInterpolator();

    /* renamed from: C0 */
    private C9195c f24177C0;

    /* renamed from: D0 */
    private Matrix f24178D0 = new Matrix();

    /* renamed from: E0 */
    private RectF f24179E0 = new RectF();

    /* renamed from: F0 */
    private RectF f24180F0 = new RectF();

    /* renamed from: G0 */
    private Path f24181G0 = new Path();

    /* renamed from: H0 */
    private Paint f24182H0 = new Paint();
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public int f24183I0 = -1;

    /* renamed from: J0 */
    private int f24184J0 = -1;

    /* renamed from: K0 */
    private int f24185K0 = -1;

    /* renamed from: L0 */
    private int f24186L0 = -1;

    /* renamed from: M0 */
    private C9205h f24187M0;

    /* renamed from: N0 */
    private float f24188N0;

    /* renamed from: O0 */
    private float f24189O0;

    /* renamed from: P0 */
    private float f24190P0;

    /* renamed from: Q0 */
    private float f24191Q0;

    /* renamed from: R0 */
    private float f24192R0;

    /* renamed from: S0 */
    private float f24193S0;

    /* renamed from: T0 */
    private boolean f24194T0 = false;

    /* renamed from: U0 */
    private C9197e f24195U0 = null;

    /* renamed from: V0 */
    private C9198f f24196V0 = null;

    /* renamed from: W0 */
    private float f24197W0 = 1.0f;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public boolean f24198X0 = true;

    /* renamed from: Y0 */
    private boolean f24199Y0 = false;

    /* renamed from: Z0 */
    private AnimatorUpdateListener f24200Z0 = new C9193a();

    /* renamed from: a0 */
    private int f24201a0 = -1;

    /* renamed from: a1 */
    private AnimatorListener f24202a1 = new C9194b();

    /* renamed from: b0 */
    private int f24203b0 = Color.parseColor("#ffb58c");

    /* renamed from: c0 */
    private int f24204c0 = Color.parseColor("#ffde8c");

    /* renamed from: d0 */
    private int f24205d0 = Color.parseColor("#353431");

    /* renamed from: e0 */
    private int f24206e0 = C0962e0.f4343t;

    /* renamed from: f0 */
    private int f24207f0 = Color.parseColor("#AEB3B5");

    /* renamed from: g0 */
    private int f24208g0 = Color.parseColor("#c8ced3");

    /* renamed from: h0 */
    private int f24209h0 = Color.parseColor("#efefef");

    /* renamed from: i0 */
    private String[] f24210i0 = getResources().getStringArray(C9189R.array.names);

    /* renamed from: j0 */
    private C9196d[] f24211j0 = new C9196d[this.f24252a.length];
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public Map<Integer, C9203e> f24212k0 = new HashMap();

    /* renamed from: l0 */
    private float f24213l0;

    /* renamed from: m0 */
    private boolean f24214m0 = true;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public float f24215n0 = 1.0f;

    /* renamed from: o0 */
    private Paint f24216o0 = new Paint();

    /* renamed from: p0 */
    private Paint f24217p0 = new Paint();

    /* renamed from: q0 */
    private Paint f24218q0 = new Paint();

    /* renamed from: r0 */
    private Paint f24219r0 = new Paint();

    /* renamed from: s0 */
    private C9203e f24220s0 = new C9203e();

    /* renamed from: t0 */
    private Path f24221t0 = new Path();

    /* renamed from: u0 */
    private Paint f24222u0 = new Paint();

    /* renamed from: v0 */
    private Paint f24223v0 = new Paint();

    /* renamed from: w0 */
    private Paint f24224w0 = new Paint();

    /* renamed from: x0 */
    private float f24225x0;

    /* renamed from: y0 */
    private ValueAnimator f24226y0 = new ValueAnimator();

    /* renamed from: z0 */
    private FloatEvaluator f24227z0 = new FloatEvaluator();

    /* renamed from: com.hsalf.smilerating.SmileRating$a */
    class C9193a implements AnimatorUpdateListener {
        C9193a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (SmileRating.this.f24198X0) {
                SmileRating.this.f24215n0 = valueAnimator.getAnimatedFraction();
                if (-1 == SmileRating.this.f24183I0) {
                    SmileRating smileRating = SmileRating.this;
                    smileRating.f24215n0 = 1.0f - smileRating.f24215n0;
                }
                SmileRating.this.invalidate();
                return;
            }
            SmileRating.this.m43021c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.hsalf.smilerating.SmileRating$b */
    class C9194b implements AnimatorListener {
        C9194b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            SmileRating.this.m43025e();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            if (-1 != SmileRating.this.f24183I0) {
                SmileRating smileRating = SmileRating.this;
                smileRating.m43021c(((C9203e) smileRating.f24212k0.get(Integer.valueOf(SmileRating.this.f24183I0))).f24269a);
            }
        }
    }

    /* renamed from: com.hsalf.smilerating.SmileRating$c */
    protected static class C9195c {

        /* renamed from: g */
        private static final int f24230g = 20;

        /* renamed from: h */
        private static final int f24231h = 200;

        /* renamed from: a */
        private float f24232a;

        /* renamed from: b */
        private float f24233b;

        /* renamed from: c */
        private final float f24234c;

        /* renamed from: d */
        private long f24235d;

        /* renamed from: e */
        private boolean f24236e = false;

        /* renamed from: f */
        private boolean f24237f = true;

        public C9195c(float f) {
            this.f24234c = f;
        }

        /* renamed from: a */
        public static C9195c m43035a(float f) {
            return new C9195c(f);
        }

        /* renamed from: b */
        public void mo33328b(float f, float f2) {
            this.f24232a = f;
            this.f24233b = f2;
            this.f24236e = false;
            this.f24237f = true;
            this.f24235d = System.currentTimeMillis();
        }

        /* renamed from: c */
        public boolean mo33329c(float f, float f2) {
            mo33326a(f, f2);
            return this.f24237f;
        }

        /* renamed from: a */
        public void mo33326a(float f, float f2) {
            float a = m43034a(this.f24232a, this.f24233b, f, f2);
            long currentTimeMillis = System.currentTimeMillis() - this.f24235d;
            if (!this.f24236e && a > 20.0f) {
                this.f24236e = true;
            }
            if (currentTimeMillis > 200 || this.f24236e) {
                this.f24237f = false;
            }
        }

        /* renamed from: b */
        private float m43036b(float f) {
            return f / this.f24234c;
        }

        /* renamed from: a */
        private float m43034a(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return m43036b((float) Math.sqrt((double) ((f5 * f5) + (f6 * f6))));
        }

        /* renamed from: a */
        public boolean mo33327a() {
            return this.f24236e;
        }
    }

    /* renamed from: com.hsalf.smilerating.SmileRating$d */
    private static class C9196d {

        /* renamed from: a */
        C9203e f24238a;

        /* renamed from: b */
        Path f24239b;

        /* renamed from: c */
        int f24240c;

        private C9196d() {
            this.f24238a = new C9203e();
            this.f24239b = new Path();
        }

        /* synthetic */ C9196d(C9193a aVar) {
            this();
        }
    }

    /* renamed from: com.hsalf.smilerating.SmileRating$e */
    public interface C9197e {
        /* renamed from: a */
        void mo33330a(int i, boolean z);
    }

    /* renamed from: com.hsalf.smilerating.SmileRating$f */
    public interface C9198f {
        /* renamed from: a */
        void mo33331a(int i, boolean z);
    }

    public SmileRating(Context context) {
        super(context);
        m43023d();
    }

    /* renamed from: b */
    private float m43014b(float f) {
        return f * 0.8f;
    }

    /* renamed from: b */
    private float m43015b(int i) {
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
    private void m43027f() {
        int i = -1;
        if (-1 != this.f24183I0) {
            float f = this.f24220s0.f24269a;
            float f2 = 2.14748365E9f;
            C9203e eVar = null;
            for (Integer num : this.f24212k0.keySet()) {
                C9203e eVar2 = (C9203e) this.f24212k0.get(num);
                float abs = Math.abs(eVar2.f24269a - f);
                if (f2 > abs) {
                    i = num.intValue();
                    eVar = eVar2;
                    f2 = abs;
                }
            }
            m43007a(i, eVar, false, true);
        }
    }

    public int getRating() {
        return getSelectedSmile() + 1;
    }

    public int getSelectedSmile() {
        return this.f24183I0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C9196d[] dVarArr;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        C9196d[] dVarArr2 = this.f24211j0;
        C9203e eVar = dVarArr2[0].f24238a;
        C9203e eVar2 = dVarArr2[dVarArr2.length - 1].f24238a;
        if (this.f24214m0) {
            canvas.drawLine(eVar.f24269a, eVar.f24270b, eVar2.f24269a, eVar2.f24270b, this.f24223v0);
        }
        for (C9196d dVar : this.f24211j0) {
            float c = m43018c(dVar.f24240c);
            C9203e eVar3 = dVar.f24238a;
            canvas2.drawCircle(eVar3.f24269a, eVar3.f24270b, (this.f24189O0 / 2.0f) * c, this.f24224w0);
            this.f24178D0.reset();
            dVar.f24239b.computeBounds(this.f24179E0, true);
            if (this.f24198X0) {
                float c2 = m43018c(-1);
                this.f24178D0.setScale(c2, c2, this.f24179E0.centerX(), this.f24179E0.centerY());
                if (this.f24183I0 == dVar.f24240c) {
                    c = this.f24227z0.evaluate(1.0f - this.f24215n0, Integer.valueOf(0), Float.valueOf(c2)).floatValue();
                }
            } else {
                this.f24178D0.setScale(c, c, this.f24179E0.centerX(), this.f24179E0.centerY());
            }
            this.f24181G0.reset();
            this.f24181G0.addPath(dVar.f24239b, this.f24178D0);
            canvas2.drawPath(this.f24181G0, this.f24222u0);
            float f = 0.15f - (c * 0.15f);
            this.f24182H0.setColor(((Integer) this.f24175A0.evaluate(((f / 0.15f) - 0.2f) / 0.8f, Integer.valueOf(this.f24207f0), Integer.valueOf(this.f24206e0))).intValue());
            String a = mo33297a(dVar.f24240c);
            C9203e eVar4 = dVar.f24238a;
            m43011a(a, eVar4.f24269a, (this.f24189O0 * (f + 0.7f)) + eVar4.f24270b, this.f24182H0, canvas);
        }
        if (this.f24221t0.isEmpty()) {
            return;
        }
        if (this.f24198X0) {
            this.f24216o0.setColor(((Integer) this.f24175A0.evaluate(this.f24215n0, Integer.valueOf(this.f24222u0.getColor()), Integer.valueOf(this.f24205d0))).intValue());
            this.f24217p0.setColor(((Integer) this.f24175A0.evaluate(this.f24215n0, Integer.valueOf(this.f24224w0.getColor()), Integer.valueOf((this.f24183I0 == 0 || this.f24184J0 == 0) ? this.f24203b0 : this.f24204c0))).intValue());
            this.f24178D0.reset();
            this.f24221t0.computeBounds(this.f24179E0, true);
            float floatValue = this.f24227z0.evaluate(this.f24176B0.getInterpolation(this.f24215n0), Float.valueOf(m43018c(-1)), Float.valueOf(1.0f)).floatValue();
            this.f24178D0.setScale(floatValue, floatValue, this.f24179E0.centerX(), this.f24179E0.centerY());
            this.f24181G0.reset();
            this.f24181G0.addPath(this.f24221t0, this.f24178D0);
            C9203e eVar5 = this.f24220s0;
            canvas2.drawCircle(eVar5.f24269a, eVar5.f24270b, floatValue * (this.f24189O0 / 2.0f), this.f24217p0);
            canvas2.drawPath(this.f24181G0, this.f24216o0);
            return;
        }
        C9203e eVar6 = this.f24220s0;
        canvas2.drawCircle(eVar6.f24269a, eVar6.f24270b, this.f24189O0 / 2.0f, this.f24217p0);
        canvas2.drawPath(this.f24221t0, this.f24216o0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24188N0 = (float) getMeasuredWidth();
        this.f24189O0 = this.f24188N0 / 6.89f;
        float f = this.f24189O0;
        this.f24190P0 = f / 2.0f;
        this.f24220s0.f24270b = this.f24190P0;
        this.f24225x0 = f / 32.0f;
        this.f24182H0.setTextSize(f / 4.5f);
        this.f24187M0 = C9205h.m43066a(Math.round(this.f24188N0), Math.round(this.f24189O0));
        int round = Math.round(this.f24188N0);
        float f2 = this.f24189O0;
        double d = (double) f2;
        double d2 = (double) f2;
        Double.isNaN(d2);
        double d3 = d2 * 0.48d;
        Double.isNaN(d);
        setMeasuredDimension(round, (int) Math.round(d + d3));
        m43020c();
        this.f24223v0.setStrokeWidth(this.f24189O0 * 0.05f);
        int i3 = this.f24186L0;
        m43007a(i3, (C9203e) this.f24212k0.get(Integer.valueOf(i3)), false, false);
        StringBuilder sb = new StringBuilder();
        sb.append("Selected smile:");
        sb.append(mo33297a(this.f24186L0));
        sb.toString();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f24199Y0) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f24177C0.mo33328b(x, y);
            C9203e eVar = this.f24220s0;
            this.f24194T0 = m43012a(eVar.f24269a, eVar.f24270b, x, y, this.f24190P0);
            this.f24193S0 = x;
        } else if (action == 1) {
            this.f24194T0 = false;
            this.f24177C0.mo33329c(x, y);
            if (!this.f24177C0.mo33327a()) {
                m43005a(x, y);
            } else {
                m43027f();
            }
        } else if (action == 2) {
            this.f24177C0.mo33326a(x, y);
            if (this.f24177C0.mo33327a() && this.f24194T0) {
                m43021c(this.f24220s0.f24269a - (this.f24193S0 - x));
            }
            this.f24193S0 = x;
        }
        return true;
    }

    public void setAngryColor(@C0198k int i) {
        this.f24203b0 = i;
        m43009a(this.f24187M0, m43015b(this.f24183I0), this.f24225x0, this.f24191Q0, this.f24192R0, this.f24220s0, this.f24221t0, this.f24190P0);
    }

    public void setDrawingColor(@C0198k int i) {
        this.f24205d0 = i;
        this.f24216o0.setColor(this.f24205d0);
        invalidate();
    }

    public void setIndicator(boolean z) {
        this.f24199Y0 = z;
    }

    public void setNormalColor(@C0198k int i) {
        this.f24204c0 = i;
        m43009a(this.f24187M0, m43015b(this.f24183I0), this.f24225x0, this.f24191Q0, this.f24192R0, this.f24220s0, this.f24221t0, this.f24190P0);
    }

    public void setOnRatingSelectedListener(C9197e eVar) {
        this.f24195U0 = eVar;
    }

    public void setOnSmileySelectionListener(C9198f fVar) {
        this.f24196V0 = fVar;
    }

    public void setPlaceHolderSmileColor(@C0198k int i) {
        this.f24201a0 = i;
        this.f24222u0.setColor(this.f24201a0);
        invalidate();
    }

    public void setPlaceholderBackgroundColor(@C0198k int i) {
        this.f24208g0 = i;
        this.f24223v0.setColor(this.f24208g0);
        this.f24224w0.setColor(this.f24208g0);
        invalidate();
    }

    public void setSelectedSmile(int i) {
        mo33300a(i, false);
    }

    public void setShowLine(boolean z) {
        this.f24214m0 = z;
        invalidate();
    }

    public void setTextNonSelectedColor(@C0198k int i) {
        this.f24207f0 = i;
        invalidate();
    }

    public void setTextSelectedColor(@C0198k int i) {
        this.f24206e0 = i;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        this.f24182H0.setTypeface(typeface);
    }

    /* renamed from: c */
    private void m43020c() {
        this.f24212k0.clear();
        float f = this.f24188N0;
        float f2 = f / 5.0f;
        float f3 = f2 / 2.0f;
        float f4 = this.f24189O0;
        this.f24213l0 = (f2 - f4) / 2.0f;
        float f5 = this.f24213l0;
        this.f24191Q0 = (f4 / 2.0f) + f5;
        this.f24192R0 = (f - (f4 / 2.0f)) - f5;
        int length = this.f24252a.length;
        for (int i = 0; i < length; i++) {
            this.f24211j0[i] = m43004a(i, this.f24190P0);
            this.f24212k0.put(Integer.valueOf(this.f24252a[i]), new C9203e((((float) i) * f2) + f3, this.f24190P0));
        }
    }

    /* renamed from: d */
    private void m43023d() {
        this.f24177C0 = C9195c.m43035a(getResources().getDisplayMetrics().density);
        this.f24182H0.setAntiAlias(true);
        this.f24182H0.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        this.f24216o0.setAntiAlias(true);
        this.f24216o0.setStrokeWidth(3.0f);
        this.f24216o0.setColor(this.f24205d0);
        this.f24216o0.setStyle(Style.FILL);
        this.f24218q0.setAntiAlias(true);
        this.f24218q0.setColor(C0886a.f4059c);
        this.f24218q0.setStyle(Style.FILL);
        this.f24219r0.setAntiAlias(true);
        this.f24219r0.setColor(-16776961);
        this.f24219r0.setStyle(Style.STROKE);
        this.f24217p0.setAntiAlias(true);
        this.f24217p0.setStyle(Style.FILL);
        this.f24222u0.setAntiAlias(true);
        this.f24222u0.setColor(this.f24201a0);
        this.f24222u0.setStyle(Style.FILL);
        this.f24224w0.setAntiAlias(true);
        this.f24224w0.setColor(this.f24208g0);
        this.f24224w0.setStyle(Style.FILL);
        this.f24223v0.setAntiAlias(true);
        this.f24223v0.setColor(this.f24209h0);
        this.f24223v0.setStyle(Style.STROKE);
        this.f24226y0.setDuration(250);
        this.f24226y0.addListener(this.f24202a1);
        this.f24226y0.addUpdateListener(this.f24200Z0);
        this.f24226y0.setInterpolator(new AccelerateDecelerateInterpolator());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m43025e() {
        boolean z = this.f24184J0 == getSelectedSmile();
        int i = this.f24183I0;
        this.f24184J0 = i;
        this.f24186L0 = i;
        C9198f fVar = this.f24196V0;
        if (fVar != null) {
            fVar.mo33331a(i, z);
        }
        C9197e eVar = this.f24195U0;
        if (eVar != null) {
            eVar.mo33330a(getRating(), z);
        }
    }

    /* renamed from: a */
    private void m43008a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9189R.styleable.SmileRating);
            this.f24203b0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_angryColor, this.f24203b0);
            this.f24204c0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_normalColor, this.f24204c0);
            this.f24205d0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_drawingColor, this.f24205d0);
            this.f24201a0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_placeHolderSmileColor, this.f24201a0);
            this.f24208g0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_placeHolderBackgroundColor, this.f24208g0);
            this.f24206e0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_textSelectionColor, this.f24206e0);
            this.f24207f0 = obtainStyledAttributes.getColor(C9189R.styleable.SmileRating_textNonSelectionColor, this.f24207f0);
            this.f24214m0 = obtainStyledAttributes.getBoolean(C9189R.styleable.SmileRating_showLine, true);
            this.f24199Y0 = obtainStyledAttributes.getBoolean(C9189R.styleable.SmileRating_isIndicator, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public boolean mo33302b() {
        return this.f24214m0;
    }

    /* renamed from: c */
    private float m43018c(int i) {
        if (this.f24183I0 != -1 && i == this.f24185K0) {
            return this.f24197W0;
        }
        return 0.8f;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m43021c(float f) {
        float f2 = this.f24191Q0;
        m43024d((f - f2) / (this.f24192R0 - f2));
    }

    /* renamed from: a */
    private C9196d m43004a(int i, float f) {
        C9196d dVar = new C9196d(null);
        dVar.f24240c = i;
        m43009a(this.f24187M0, ((float) i) * 0.25f, this.f24225x0, this.f24191Q0, this.f24192R0, dVar.f24238a, dVar.f24239b, f);
        dVar.f24238a.f24270b = f;
        return dVar;
    }

    /* renamed from: a */
    private void m43011a(String str, float f, float f2, Paint paint, Canvas canvas) {
        canvas.drawText(str, f - (paint.measureText(str) / 2.0f), f2 - ((paint.descent() + paint.ascent()) / 2.0f), paint);
    }

    /* renamed from: a */
    public String mo33297a(int i) {
        String[] strArr = this.f24210i0;
        if (i >= strArr.length || i < 0) {
            return null;
        }
        return strArr[i];
    }

    /* renamed from: a */
    public boolean mo33301a() {
        return this.f24199Y0;
    }

    /* renamed from: a */
    public void mo33298a(int i, @C0214q0 int i2) {
        mo33299a(i, getResources().getString(i2));
    }

    /* renamed from: a */
    public void mo33299a(int i, String str) {
        String[] strArr = this.f24210i0;
        if (str == null) {
            str = "";
        }
        strArr[i] = str;
        invalidate();
    }

    /* renamed from: a */
    private void m43005a(float f, float f2) {
        for (Integer num : this.f24212k0.keySet()) {
            C9203e eVar = (C9203e) this.f24212k0.get(num);
            if (m43012a(eVar.f24269a, eVar.f24270b, f, f2, this.f24190P0)) {
                if (num.intValue() == getSelectedSmile()) {
                    m43025e();
                } else {
                    m43007a(num.intValue(), eVar, true, true);
                }
            }
        }
    }

    /* renamed from: d */
    private void m43024d(float f) {
        m43009a(this.f24187M0, Math.max(Math.min(f, 1.0f), 0.0f), this.f24225x0, this.f24191Q0, this.f24192R0, this.f24220s0, this.f24221t0, this.f24190P0);
        invalidate();
    }

    /* renamed from: a */
    private boolean m43012a(float f, float f2, float f3, float f4, float f5) {
        this.f24180F0.set(f - f5, 0.0f, f + f5, (float) getMeasuredHeight());
        return this.f24180F0.contains(f3, f4);
    }

    /* renamed from: a */
    public void mo33300a(int i, boolean z) {
        this.f24186L0 = i;
        m43007a(i, (C9203e) this.f24212k0.get(Integer.valueOf(i)), true, z);
    }

    /* renamed from: a */
    private void m43007a(int i, C9203e eVar, boolean z, boolean z2) {
        if (this.f24183I0 != i || !z) {
            if (this.f24183I0 == -1) {
                this.f24198X0 = true;
            } else if (i == -1) {
                this.f24198X0 = true;
            } else {
                this.f24198X0 = false;
            }
            this.f24183I0 = i;
            C9203e eVar2 = this.f24220s0;
            if (eVar2 != null) {
                ValueAnimator valueAnimator = this.f24226y0;
                float[] fArr = new float[2];
                fArr[0] = eVar2.f24269a;
                fArr[1] = eVar == null ? 0.0f : eVar.f24269a;
                valueAnimator.setFloatValues(fArr);
                if (z2) {
                    this.f24226y0.start();
                } else if (this.f24183I0 == -1) {
                    if (!this.f24221t0.isEmpty()) {
                        this.f24221t0.reset();
                    }
                    invalidate();
                } else if (eVar != null) {
                    m43021c(eVar.f24269a);
                }
            }
        }
    }

    public SmileRating(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43008a(attributeSet);
        m43023d();
    }

    /* renamed from: a */
    private void m43009a(C9205h hVar, float f, float f2, float f3, float f4, C9203e eVar, Path path, float f5) {
        float f6 = f;
        if (hVar != null) {
            float floatValue = this.f24227z0.evaluate(f, Float.valueOf(f3), Float.valueOf(f4)).floatValue();
            eVar.f24269a = floatValue;
            float f7 = floatValue - f5;
            if (f6 > 0.75f) {
                float f8 = (f6 - 0.75f) * 4.0f;
                m43006a(f8, 3, 4);
                this.f24217p0.setColor(this.f24204c0);
                mo33332a(f7, f8, path, hVar.mo33347b(3), hVar.mo33347b(4), this.f24227z0);
                m43010a(hVar, f2, f8, floatValue, 4, path, path, f5);
            } else if (f6 > 0.5f) {
                float f9 = (f6 - 0.5f) * 4.0f;
                m43006a(f9, 2, 3);
                this.f24217p0.setColor(this.f24204c0);
                mo33332a(f7, f9, path, hVar.mo33347b(2), hVar.mo33347b(3), this.f24227z0);
                m43010a(hVar, f2, f9, floatValue, 3, path, path, f5);
            } else if (f6 > 0.25f) {
                float f10 = (f6 - 0.25f) * 4.0f;
                m43006a(f10, 1, 2);
                this.f24217p0.setColor(this.f24204c0);
                mo33332a(f7, f10, path, hVar.mo33347b(1), hVar.mo33347b(2), this.f24227z0);
                m43010a(hVar, f2, f10, floatValue, 1, path, path, f5);
            } else if (f6 >= 0.0f) {
                float f11 = f6 * 4.0f;
                m43006a(f11, 0, 1);
                this.f24217p0.setColor(((Integer) this.f24175A0.evaluate(f11, Integer.valueOf(this.f24203b0), Integer.valueOf(this.f24204c0))).intValue());
                mo33332a(f7, f11, path, hVar.mo33347b(0), hVar.mo33347b(1), this.f24227z0);
                m43010a(hVar, f2, f11, floatValue, 0, path, path, f5);
            } else if (!this.f24221t0.isEmpty()) {
                this.f24221t0.reset();
            }
        }
    }

    /* renamed from: a */
    private void m43006a(float f, int i, int i2) {
        if (f < 0.5f) {
            this.f24197W0 = m43014b(f * 2.0f);
            this.f24185K0 = i;
            return;
        }
        this.f24197W0 = m43014b(1.0f - ((f - 0.5f) * 2.0f));
        this.f24185K0 = i2;
    }

    /* renamed from: a */
    private void m43010a(C9205h hVar, float f, float f2, float f3, int i, Path path, Path path2, float f4) {
        C9200b a = C9201c.m43053a(hVar.mo33345a(0), this.f24227z0, f2, i);
        C9200b a2 = C9201c.m43053a(hVar.mo33345a(1), this.f24227z0, f2, i);
        float f5 = 2.5f * f;
        a.f24259e = f5;
        a2.f24259e = f5;
        C9203e eVar = a.f24257c;
        eVar.f24269a = ((11.0f * f) + f3) - f4;
        float f6 = 0.7f * f4;
        eVar.f24270b = f6;
        C9203e eVar2 = a2.f24257c;
        eVar2.f24269a = ((f * 21.0f) + f3) - f4;
        eVar2.f24270b = f6;
        a.mo33336a(path);
        a2.mo33336a(path2);
    }

    public SmileRating(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m43008a(attributeSet);
        m43023d();
    }
}
