package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.annotation.C0180b;
import androidx.annotation.C0188f;
import androidx.annotation.C0192h;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.annotation.C0202m;
import androidx.annotation.C0209o;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.annotation.C0231x0;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.graphics.drawable.C0897e;
import androidx.core.p018c.C0821b;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p031j.C0908a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6923n;
import com.google.android.material.internal.C6923n.C6925b;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p179a.C5594h;
import com.google.android.material.p180b.C5619a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p297g.C6882a;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p302m.C6953d;
import com.google.android.material.p303n.C6961b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C5694a extends C6978j implements C0897e, Callback, C6925b {

    /* renamed from: w1 */
    private static final boolean f16475w1 = false;

    /* renamed from: x1 */
    private static final int[] f16476x1 = {16842910};

    /* renamed from: y1 */
    private static final String f16477y1 = "http://schemas.android.com/apk/res-auto";

    /* renamed from: z1 */
    private static final ShapeDrawable f16478z1 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private boolean f16479A0;
    @C0195i0

    /* renamed from: B0 */
    private Drawable f16480B0;
    @C0195i0

    /* renamed from: C0 */
    private Drawable f16481C0;
    @C0195i0

    /* renamed from: D0 */
    private ColorStateList f16482D0;

    /* renamed from: E0 */
    private float f16483E0;
    @C0195i0

    /* renamed from: F0 */
    private CharSequence f16484F0;

    /* renamed from: G0 */
    private boolean f16485G0;

    /* renamed from: H0 */
    private boolean f16486H0;
    @C0195i0

    /* renamed from: I0 */
    private Drawable f16487I0;
    @C0195i0

    /* renamed from: J0 */
    private C5594h f16488J0;
    @C0195i0

    /* renamed from: K0 */
    private C5594h f16489K0;

    /* renamed from: L0 */
    private float f16490L0;

    /* renamed from: M0 */
    private float f16491M0;

    /* renamed from: N0 */
    private float f16492N0;

    /* renamed from: O0 */
    private float f16493O0;

    /* renamed from: P0 */
    private float f16494P0;

    /* renamed from: Q0 */
    private float f16495Q0;

    /* renamed from: R0 */
    private float f16496R0;

    /* renamed from: S0 */
    private float f16497S0;
    @C0193h0

    /* renamed from: T0 */
    private final Context f16498T0;

    /* renamed from: U0 */
    private final Paint f16499U0 = new Paint(1);
    @C0195i0

    /* renamed from: V0 */
    private final Paint f16500V0;

    /* renamed from: W0 */
    private final FontMetrics f16501W0 = new FontMetrics();

    /* renamed from: X0 */
    private final RectF f16502X0 = new RectF();

    /* renamed from: Y0 */
    private final PointF f16503Y0 = new PointF();

    /* renamed from: Z0 */
    private final Path f16504Z0 = new Path();
    @C0193h0

    /* renamed from: a1 */
    private final C6923n f16505a1;
    @C0198k

    /* renamed from: b1 */
    private int f16506b1;
    @C0198k

    /* renamed from: c1 */
    private int f16507c1;
    @C0198k

    /* renamed from: d1 */
    private int f16508d1;
    @C0198k

    /* renamed from: e1 */
    private int f16509e1;
    @C0198k

    /* renamed from: f1 */
    private int f16510f1;
    @C0198k

    /* renamed from: g1 */
    private int f16511g1;

    /* renamed from: h1 */
    private boolean f16512h1;
    @C0198k

    /* renamed from: i1 */
    private int f16513i1;

    /* renamed from: j1 */
    private int f16514j1 = 255;
    @C0195i0

    /* renamed from: k1 */
    private ColorFilter f16515k1;
    @C0195i0

    /* renamed from: l1 */
    private PorterDuffColorFilter f16516l1;
    @C0195i0

    /* renamed from: m1 */
    private ColorStateList f16517m1;
    @C0195i0

    /* renamed from: n0 */
    private ColorStateList f16518n0;
    @C0195i0

    /* renamed from: n1 */
    private Mode f16519n1 = Mode.SRC_IN;
    @C0195i0

    /* renamed from: o0 */
    private ColorStateList f16520o0;

    /* renamed from: o1 */
    private int[] f16521o1;

    /* renamed from: p0 */
    private float f16522p0;

    /* renamed from: p1 */
    private boolean f16523p1;

    /* renamed from: q0 */
    private float f16524q0;
    @C0195i0

    /* renamed from: q1 */
    private ColorStateList f16525q1;
    @C0195i0

    /* renamed from: r0 */
    private ColorStateList f16526r0;
    @C0193h0

    /* renamed from: r1 */
    private WeakReference<C5695a> f16527r1 = new WeakReference<>(null);

    /* renamed from: s0 */
    private float f16528s0;

    /* renamed from: s1 */
    private TruncateAt f16529s1;
    @C0195i0

    /* renamed from: t0 */
    private ColorStateList f16530t0;

    /* renamed from: t1 */
    private boolean f16531t1;
    @C0195i0

    /* renamed from: u0 */
    private CharSequence f16532u0;

    /* renamed from: u1 */
    private int f16533u1;

    /* renamed from: v0 */
    private boolean f16534v0;

    /* renamed from: v1 */
    private boolean f16535v1;
    @C0195i0

    /* renamed from: w0 */
    private Drawable f16536w0;
    @C0195i0

    /* renamed from: x0 */
    private ColorStateList f16537x0;

    /* renamed from: y0 */
    private float f16538y0;

    /* renamed from: z0 */
    private boolean f16539z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C5695a {
        /* renamed from: a */
        void mo22676a();
    }

    private C5694a(@C0193h0 Context context, AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        super(context, attributeSet, i, i2);
        mo27789a(context);
        this.f16498T0 = context;
        this.f16505a1 = new C6923n(this);
        this.f16532u0 = "";
        this.f16505a1.mo27653b().density = context.getResources().getDisplayMetrics().density;
        this.f16500V0 = null;
        Paint paint = this.f16500V0;
        if (paint != null) {
            paint.setStyle(Style.STROKE);
        }
        setState(f16476x1);
        mo22902a(f16476x1);
        this.f16531t1 = true;
        if (C6961b.f19468a) {
            f16478z1.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private boolean m24977A0() {
        return this.f16479A0 && this.f16480B0 != null;
    }

    /* renamed from: B0 */
    private void m24978B0() {
        this.f16525q1 = this.f16523p1 ? C6961b.m33359b(this.f16530t0) : null;
    }

    @TargetApi(21)
    /* renamed from: C0 */
    private void m24979C0() {
        this.f16481C0 = new RippleDrawable(C6961b.m33359b(mo22912d0()), this.f16480B0, f16478z1);
    }

    @C0193h0
    /* renamed from: a */
    public static C5694a m24981a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        C5694a aVar = new C5694a(context, attributeSet, i, i2);
        aVar.m24984a(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: c */
    private void m24990c(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (m25009z0()) {
            m24983a(rect, this.f16502X0);
            RectF rectF = this.f16502X0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f16536w0.setBounds(0, 0, (int) this.f16502X0.width(), (int) this.f16502X0.height());
            this.f16536w0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: d */
    private void m24992d(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (this.f16528s0 > 0.0f && !this.f16535v1) {
            this.f16499U0.setColor(this.f16509e1);
            this.f16499U0.setStyle(Style.STROKE);
            if (!this.f16535v1) {
                this.f16499U0.setColorFilter(m25007x0());
            }
            RectF rectF = this.f16502X0;
            float f = (float) rect.left;
            float f2 = this.f16528s0;
            rectF.set(f + (f2 / 2.0f), ((float) rect.top) + (f2 / 2.0f), ((float) rect.right) - (f2 / 2.0f), ((float) rect.bottom) - (f2 / 2.0f));
            float f3 = this.f16524q0 - (this.f16528s0 / 2.0f);
            canvas.drawRoundRect(this.f16502X0, f3, f3, this.f16499U0);
        }
    }

    /* renamed from: e */
    private void m24995e(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (!this.f16535v1) {
            this.f16499U0.setColor(this.f16506b1);
            this.f16499U0.setStyle(Style.FILL);
            this.f16502X0.set(rect);
            canvas.drawRoundRect(this.f16502X0, mo22870I(), mo22870I(), this.f16499U0);
        }
    }

    /* renamed from: f */
    private void m24998f(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (m24977A0()) {
            m24991c(rect, this.f16502X0);
            RectF rectF = this.f16502X0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f16480B0.setBounds(0, 0, (int) this.f16502X0.width(), (int) this.f16502X0.height());
            if (C6961b.f19468a) {
                this.f16481C0.setBounds(this.f16480B0.getBounds());
                this.f16481C0.jumpToCurrentState();
                this.f16481C0.draw(canvas);
            } else {
                this.f16480B0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: g */
    private void m25000g(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        this.f16499U0.setColor(this.f16510f1);
        this.f16499U0.setStyle(Style.FILL);
        this.f16502X0.set(rect);
        if (!this.f16535v1) {
            canvas.drawRoundRect(this.f16502X0, mo22870I(), mo22870I(), this.f16499U0);
            return;
        }
        mo27793a(new RectF(rect), this.f16504Z0);
        super.mo27791a(canvas, this.f16499U0, this.f16504Z0, mo27808d());
    }

    /* renamed from: h */
    private void m25001h(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        Paint paint = this.f16500V0;
        if (paint != null) {
            paint.setColor(C0821b.m4811d(C0962e0.f4343t, C13959t.f40827P1));
            canvas.drawRect(rect, this.f16500V0);
            if (m25009z0() || m25008y0()) {
                m24983a(rect, this.f16502X0);
                canvas.drawRect(this.f16502X0, this.f16500V0);
            }
            if (this.f16532u0 != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f16500V0);
            }
            if (m24977A0()) {
                m24991c(rect, this.f16502X0);
                canvas.drawRect(this.f16502X0, this.f16500V0);
            }
            this.f16500V0.setColor(C0821b.m4811d(C0886a.f4059c, C13959t.f40827P1));
            m24988b(rect, this.f16502X0);
            canvas.drawRect(this.f16502X0, this.f16500V0);
            this.f16500V0.setColor(C0821b.m4811d(-16711936, C13959t.f40827P1));
            m24993d(rect, this.f16502X0);
            canvas.drawRect(this.f16502X0, this.f16500V0);
        }
    }

    /* renamed from: i */
    private void m25002i(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (this.f16532u0 != null) {
            Align a = mo22894a(rect, this.f16503Y0);
            m24996e(rect, this.f16502X0);
            if (this.f16505a1.mo27648a() != null) {
                this.f16505a1.mo27653b().drawableState = getState();
                this.f16505a1.mo27649a(this.f16498T0);
            }
            this.f16505a1.mo27653b().setTextAlign(a);
            int i = 0;
            boolean z = Math.round(this.f16505a1.mo27647a(mo22919f0().toString())) > Math.round(this.f16502X0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f16502X0);
            }
            CharSequence charSequence = this.f16532u0;
            if (z && this.f16529s1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f16505a1.mo27653b(), this.f16502X0.width(), this.f16529s1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f16503Y0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f16505a1.mo27653b());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: j */
    private void m25004j(@C0195i0 ColorStateList colorStateList) {
        if (this.f16518n0 != colorStateList) {
            this.f16518n0 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: v0 */
    private float m25005v0() {
        this.f16505a1.mo27653b().getFontMetrics(this.f16501W0);
        FontMetrics fontMetrics = this.f16501W0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: w0 */
    private boolean m25006w0() {
        return this.f16486H0 && this.f16487I0 != null && this.f16485G0;
    }

    @C0195i0
    /* renamed from: x0 */
    private ColorFilter m25007x0() {
        ColorFilter colorFilter = this.f16515k1;
        return colorFilter != null ? colorFilter : this.f16516l1;
    }

    /* renamed from: y0 */
    private boolean m25008y0() {
        return this.f16486H0 && this.f16487I0 != null && this.f16512h1;
    }

    /* renamed from: z0 */
    private boolean m25009z0() {
        return this.f16534v0 && this.f16536w0 != null;
    }

    /* renamed from: A */
    public void mo22858A(@C0209o int i) {
        mo22963p(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: B */
    public void mo22859B(@C0209o int i) {
        mo22966q(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: C */
    public void mo22860C(@C0202m int i) {
        mo22920g(C0242a.m1108b(this.f16498T0, i));
    }

    /* renamed from: D */
    public void mo22861D(@C0192h int i) {
        mo22945k(this.f16498T0.getResources().getBoolean(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public float mo22862E() {
        if (m25009z0() || m25008y0()) {
            return this.f16491M0 + this.f16538y0 + this.f16492N0;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public float mo22864F() {
        if (m24977A0()) {
            return this.f16495Q0 + this.f16483E0 + this.f16496R0;
        }
        return 0.0f;
    }

    @C0195i0
    /* renamed from: G */
    public Drawable mo22866G() {
        return this.f16487I0;
    }

    @C0195i0
    /* renamed from: H */
    public ColorStateList mo22868H() {
        return this.f16520o0;
    }

    /* renamed from: I */
    public float mo22870I() {
        return this.f16535v1 ? mo27843w() : this.f16524q0;
    }

    /* renamed from: J */
    public void mo22873J(@C0180b int i) {
        mo22906b(C5594h.m24263a(this.f16498T0, i));
    }

    /* renamed from: K */
    public void mo22875K(@C0216r0 int i) {
        mo22900a(new C6953d(this.f16498T0, i));
    }

    /* renamed from: L */
    public float mo22876L() {
        return this.f16538y0;
    }

    /* renamed from: M */
    public void mo22879M(@C0214q0 int i) {
        mo22907b((CharSequence) this.f16498T0.getResources().getString(i));
    }

    /* renamed from: N */
    public float mo22880N() {
        return this.f16522p0;
    }

    /* renamed from: O */
    public float mo22882O() {
        return this.f16490L0;
    }

    @C0195i0
    /* renamed from: P */
    public ColorStateList mo22883P() {
        return this.f16526r0;
    }

    /* renamed from: Q */
    public float mo22884Q() {
        return this.f16528s0;
    }

    @C0195i0
    /* renamed from: R */
    public Drawable mo22885R() {
        Drawable drawable = this.f16480B0;
        if (drawable != null) {
            return C0892a.m5160h(drawable);
        }
        return null;
    }

    @C0195i0
    /* renamed from: S */
    public CharSequence mo22886S() {
        return this.f16484F0;
    }

    /* renamed from: T */
    public float mo22887T() {
        return this.f16496R0;
    }

    /* renamed from: U */
    public float mo22888U() {
        return this.f16483E0;
    }

    /* renamed from: V */
    public float mo22889V() {
        return this.f16495Q0;
    }

    @C0193h0
    /* renamed from: W */
    public int[] mo22890W() {
        return this.f16521o1;
    }

    @C0195i0
    /* renamed from: X */
    public ColorStateList mo22891X() {
        return this.f16482D0;
    }

    /* renamed from: Y */
    public TruncateAt mo22892Y() {
        return this.f16529s1;
    }

    @C0195i0
    /* renamed from: Z */
    public C5594h mo22893Z() {
        return this.f16489K0;
    }

    /* renamed from: a0 */
    public float mo22903a0() {
        return this.f16492N0;
    }

    /* renamed from: b */
    public void mo22904b(@C0193h0 RectF rectF) {
        m24993d(getBounds(), rectF);
    }

    /* renamed from: b0 */
    public float mo22908b0() {
        return this.f16491M0;
    }

    @C0199k0
    /* renamed from: c0 */
    public int mo22910c0() {
        return this.f16533u1;
    }

    @C0195i0
    /* renamed from: d0 */
    public ColorStateList mo22912d0() {
        return this.f16530t0;
    }

    public void draw(@C0193h0 Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f16514j1;
            if (i2 < 255) {
                i = C5619a.m24467a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m24995e(canvas, bounds);
            m24987b(canvas, bounds);
            if (this.f16535v1) {
                super.draw(canvas);
            }
            m24992d(canvas, bounds);
            m25000g(canvas, bounds);
            m24990c(canvas, bounds);
            m24982a(canvas, bounds);
            if (this.f16531t1) {
                m25002i(canvas, bounds);
            }
            m24998f(canvas, bounds);
            m25001h(canvas, bounds);
            if (this.f16514j1 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    @C0195i0
    /* renamed from: e0 */
    public C5594h mo22916e0() {
        return this.f16488J0;
    }

    @C0195i0
    /* renamed from: f0 */
    public CharSequence mo22919f0() {
        return this.f16532u0;
    }

    @C0195i0
    /* renamed from: g0 */
    public C6953d mo22922g0() {
        return this.f16505a1.mo27648a();
    }

    public int getAlpha() {
        return this.f16514j1;
    }

    @C0195i0
    public ColorFilter getColorFilter() {
        return this.f16515k1;
    }

    public int getIntrinsicHeight() {
        return (int) this.f16522p0;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f16490L0 + mo22862E() + this.f16493O0 + this.f16505a1.mo27647a(mo22919f0().toString()) + this.f16494P0 + mo22864F() + this.f16497S0), this.f16533u1);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(@C0193h0 Outline outline) {
        if (this.f16535v1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f16524q0);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f16524q0);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h0 */
    public float mo22932h0() {
        return this.f16494P0;
    }

    /* renamed from: i0 */
    public float mo22936i0() {
        return this.f16493O0;
    }

    public void invalidateDrawable(@C0193h0 Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m25003i(this.f16518n0) || m25003i(this.f16520o0) || m25003i(this.f16526r0) || (this.f16523p1 && m25003i(this.f16525q1)) || m24989b(this.f16505a1.mo27648a()) || m25006w0() || m24997e(this.f16536w0) || m24997e(this.f16487I0) || m25003i(this.f16517m1);
    }

    /* renamed from: j0 */
    public boolean mo22942j0() {
        return this.f16523p1;
    }

    /* renamed from: k */
    public void mo22943k(float f) {
        if (this.f16538y0 != f) {
            float E = mo22862E();
            this.f16538y0 = f;
            float E2 = mo22862E();
            invalidateSelf();
            if (E != E2) {
                mo22981t0();
            }
        }
    }

    /* renamed from: k0 */
    public boolean mo22946k0() {
        return this.f16485G0;
    }

    /* renamed from: l */
    public void mo22948l(@C0202m int i) {
        mo22911d(C0242a.m1108b(this.f16498T0, i));
    }

    @Deprecated
    /* renamed from: l0 */
    public boolean mo22950l0() {
        return mo22954m0();
    }

    /* renamed from: m */
    public void mo22953m(boolean z) {
        if (this.f16523p1 != z) {
            this.f16523p1 = z;
            m24978B0();
            onStateChange(getState());
        }
    }

    /* renamed from: m0 */
    public boolean mo22954m0() {
        return this.f16486H0;
    }

    /* renamed from: n */
    public void mo22955n(float f) {
        if (this.f16528s0 != f) {
            this.f16528s0 = f;
            this.f16499U0.setStrokeWidth(f);
            if (this.f16535v1) {
                super.mo27816f(f);
            }
            invalidateSelf();
        }
    }

    @Deprecated
    /* renamed from: n0 */
    public boolean mo22957n0() {
        return mo22960o0();
    }

    @Deprecated
    /* renamed from: o */
    public void mo22959o(@C0192h int i) {
        mo22973s(i);
    }

    /* renamed from: o0 */
    public boolean mo22960o0() {
        return this.f16534v0;
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m25009z0()) {
            onLayoutDirectionChanged |= C0892a.m5152a(this.f16536w0, i);
        }
        if (m25008y0()) {
            onLayoutDirectionChanged |= C0892a.m5152a(this.f16487I0, i);
        }
        if (m24977A0()) {
            onLayoutDirectionChanged |= C0892a.m5152a(this.f16480B0, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m25009z0()) {
            onLevelChange |= this.f16536w0.setLevel(i);
        }
        if (m25008y0()) {
            onLevelChange |= this.f16487I0.setLevel(i);
        }
        if (m24977A0()) {
            onLevelChange |= this.f16480B0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(@C0193h0 int[] iArr) {
        if (this.f16535v1) {
            super.onStateChange(iArr);
        }
        return m24986a(iArr, mo22890W());
    }

    /* renamed from: p */
    public void mo22964p(@C0213q int i) {
        mo22905b(C0242a.m1109c(this.f16498T0, i));
    }

    @Deprecated
    /* renamed from: p0 */
    public boolean mo22965p0() {
        return mo22971r0();
    }

    /* renamed from: q */
    public void mo22967q(@C0209o int i) {
        mo22943k(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: q0 */
    public boolean mo22968q0() {
        return m24997e(this.f16480B0);
    }

    /* renamed from: r */
    public void mo22970r(@C0202m int i) {
        mo22914e(C0242a.m1108b(this.f16498T0, i));
    }

    /* renamed from: r0 */
    public boolean mo22971r0() {
        return this.f16479A0;
    }

    /* renamed from: s */
    public void mo22973s(@C0192h int i) {
        mo22935i(this.f16498T0.getResources().getBoolean(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s0 */
    public boolean mo22974s0() {
        return this.f16535v1;
    }

    public void scheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f16514j1 != i) {
            this.f16514j1 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(@C0195i0 ColorFilter colorFilter) {
        if (this.f16515k1 != colorFilter) {
            this.f16515k1 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(@C0195i0 ColorStateList colorStateList) {
        if (this.f16517m1 != colorStateList) {
            this.f16517m1 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(@C0193h0 Mode mode) {
        if (this.f16519n1 != mode) {
            this.f16519n1 = mode;
            this.f16516l1 = C6882a.m33051a((Drawable) this, this.f16517m1, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m25009z0()) {
            visible |= this.f16536w0.setVisible(z, z2);
        }
        if (m25008y0()) {
            visible |= this.f16487I0.setVisible(z, z2);
        }
        if (m24977A0()) {
            visible |= this.f16480B0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public void mo22980t(@C0209o int i) {
        mo22947l(this.f16498T0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public void mo22981t0() {
        C5695a aVar = (C5695a) this.f16527r1.get();
        if (aVar != null) {
            aVar.mo22676a();
        }
    }

    /* renamed from: u */
    public void mo22983u(@C0209o int i) {
        mo22951m(this.f16498T0.getResources().getDimension(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u0 */
    public boolean mo22984u0() {
        return this.f16531t1;
    }

    public void unscheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v */
    public void mo22986v(@C0202m int i) {
        mo22917f(C0242a.m1108b(this.f16498T0, i));
    }

    /* renamed from: w */
    public void mo22987w(@C0209o int i) {
        mo22955n(this.f16498T0.getResources().getDimension(i));
    }

    @Deprecated
    /* renamed from: x */
    public void mo22988x(@C0192h int i) {
        mo22861D(i);
    }

    /* renamed from: y */
    public void mo22989y(@C0209o int i) {
        mo22958o(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: z */
    public void mo22990z(@C0213q int i) {
        mo22909c(C0242a.m1109c(this.f16498T0, i));
    }

    /* renamed from: b */
    private void m24987b(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (!this.f16535v1) {
            this.f16499U0.setColor(this.f16507c1);
            this.f16499U0.setStyle(Style.FILL);
            this.f16499U0.setColorFilter(m25007x0());
            this.f16502X0.set(rect);
            canvas.drawRoundRect(this.f16502X0, mo22870I(), mo22870I(), this.f16499U0);
        }
    }

    /* renamed from: G */
    public void mo22867G(@C0209o int i) {
        mo22972s(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: H */
    public void mo22869H(@C0199k0 int i) {
        this.f16533u1 = i;
    }

    /* renamed from: I */
    public void mo22871I(@C0202m int i) {
        mo22930h(C0242a.m1108b(this.f16498T0, i));
    }

    /* renamed from: J */
    public float mo22872J() {
        return this.f16497S0;
    }

    @C0195i0
    /* renamed from: K */
    public Drawable mo22874K() {
        Drawable drawable = this.f16536w0;
        if (drawable != null) {
            return C0892a.m5160h(drawable);
        }
        return null;
    }

    /* renamed from: L */
    public void mo22877L(@C0209o int i) {
        mo22979t(this.f16498T0.getResources().getDimension(i));
    }

    @C0195i0
    /* renamed from: M */
    public ColorStateList mo22878M() {
        return this.f16537x0;
    }

    /* renamed from: N */
    public void mo22881N(@C0209o int i) {
        mo22982u(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: l */
    public void mo22947l(float f) {
        if (this.f16522p0 != f) {
            this.f16522p0 = f;
            invalidateSelf();
            mo22981t0();
        }
    }

    /* renamed from: o */
    public void mo22958o(float f) {
        if (this.f16496R0 != f) {
            this.f16496R0 = f;
            invalidateSelf();
            if (m24977A0()) {
                mo22981t0();
            }
        }
    }

    /* renamed from: p */
    public void mo22963p(float f) {
        if (this.f16483E0 != f) {
            this.f16483E0 = f;
            invalidateSelf();
            if (m24977A0()) {
                mo22981t0();
            }
        }
    }

    /* renamed from: q */
    public void mo22966q(float f) {
        if (this.f16495Q0 != f) {
            this.f16495Q0 = f;
            invalidateSelf();
            if (m24977A0()) {
                mo22981t0();
            }
        }
    }

    /* renamed from: r */
    public void mo22969r(float f) {
        if (this.f16492N0 != f) {
            float E = mo22862E();
            this.f16492N0 = f;
            float E2 = mo22862E();
            invalidateSelf();
            if (E != E2) {
                mo22981t0();
            }
        }
    }

    /* renamed from: s */
    public void mo22972s(float f) {
        if (this.f16491M0 != f) {
            float E = mo22862E();
            this.f16491M0 = f;
            float E2 = mo22862E();
            invalidateSelf();
            if (E != E2) {
                mo22981t0();
            }
        }
    }

    /* renamed from: t */
    public void mo22979t(float f) {
        if (this.f16494P0 != f) {
            this.f16494P0 = f;
            invalidateSelf();
            mo22981t0();
        }
    }

    /* renamed from: u */
    public void mo22982u(float f) {
        if (this.f16493O0 != f) {
            this.f16493O0 = f;
            invalidateSelf();
            mo22981t0();
        }
    }

    @C0193h0
    /* renamed from: a */
    public static C5694a m24980a(@C0193h0 Context context, @C0231x0 int i) {
        AttributeSet a = C6882a.m33052a(context, i, (CharSequence) "chip");
        int styleAttribute = a.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = C5582R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return m24981a(context, a, C5582R.attr.chipStandaloneStyle, styleAttribute);
    }

    /* renamed from: E */
    public void mo22863E(@C0180b int i) {
        mo22898a(C5594h.m24263a(this.f16498T0, i));
    }

    /* renamed from: F */
    public void mo22865F(@C0209o int i) {
        mo22969r(this.f16498T0.getResources().getDimension(i));
    }

    @Deprecated
    /* renamed from: j */
    public void mo22941j(boolean z) {
        mo22945k(z);
    }

    /* renamed from: j */
    public void mo22940j(@C0213q int i) {
        mo22896a(C0242a.m1109c(this.f16498T0, i));
    }

    @Deprecated
    /* renamed from: m */
    public void mo22952m(@C0209o int i) {
        mo22933i(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: e */
    private void m24996e(@C0193h0 Rect rect, @C0193h0 RectF rectF) {
        rectF.setEmpty();
        if (this.f16532u0 != null) {
            float E = this.f16490L0 + mo22862E() + this.f16493O0;
            float F = this.f16497S0 + mo22864F() + this.f16494P0;
            if (C0892a.m5157e(this) == 0) {
                rectF.left = ((float) rect.left) + E;
                rectF.right = ((float) rect.right) - F;
            } else {
                rectF.left = ((float) rect.left) + F;
                rectF.right = ((float) rect.right) - E;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: j */
    public void mo22939j(float f) {
        if (this.f16497S0 != f) {
            this.f16497S0 = f;
            invalidateSelf();
            mo22981t0();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo22949l(boolean z) {
        this.f16531t1 = z;
    }

    /* renamed from: m */
    public void mo22951m(float f) {
        if (this.f16490L0 != f) {
            this.f16490L0 = f;
            invalidateSelf();
            mo22981t0();
        }
    }

    /* renamed from: a */
    private void m24984a(@C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        TypedArray c = C6928p.m33264c(this.f16498T0, attributeSet, C5582R.styleable.Chip, i, i2, new int[0]);
        this.f16535v1 = c.hasValue(C5582R.styleable.Chip_shapeAppearance);
        m25004j(C6952c.m33332a(this.f16498T0, c, C5582R.styleable.Chip_chipSurfaceColor));
        mo22911d(C6952c.m33332a(this.f16498T0, c, C5582R.styleable.Chip_chipBackgroundColor));
        mo22947l(c.getDimension(C5582R.styleable.Chip_chipMinHeight, 0.0f));
        if (c.hasValue(C5582R.styleable.Chip_chipCornerRadius)) {
            mo22933i(c.getDimension(C5582R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        mo22917f(C6952c.m33332a(this.f16498T0, c, C5582R.styleable.Chip_chipStrokeColor));
        mo22955n(c.getDimension(C5582R.styleable.Chip_chipStrokeWidth, 0.0f));
        mo22930h(C6952c.m33332a(this.f16498T0, c, C5582R.styleable.Chip_rippleColor));
        mo22907b(c.getText(C5582R.styleable.Chip_android_text));
        mo22900a(C6952c.m33335c(this.f16498T0, c, C5582R.styleable.Chip_android_textAppearance));
        int i3 = c.getInt(C5582R.styleable.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            mo22897a(TruncateAt.START);
        } else if (i3 == 2) {
            mo22897a(TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            mo22897a(TruncateAt.END);
        }
        mo22935i(c.getBoolean(C5582R.styleable.Chip_chipIconVisible, false));
        String str = f16477y1;
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "chipIconEnabled") == null || attributeSet.getAttributeValue(str, "chipIconVisible") != null)) {
            mo22935i(c.getBoolean(C5582R.styleable.Chip_chipIconEnabled, false));
        }
        mo22905b(C6952c.m33334b(this.f16498T0, c, C5582R.styleable.Chip_chipIcon));
        if (c.hasValue(C5582R.styleable.Chip_chipIconTint)) {
            mo22914e(C6952c.m33332a(this.f16498T0, c, C5582R.styleable.Chip_chipIconTint));
        }
        mo22943k(c.getDimension(C5582R.styleable.Chip_chipIconSize, 0.0f));
        mo22945k(c.getBoolean(C5582R.styleable.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "closeIconEnabled") == null || attributeSet.getAttributeValue(str, "closeIconVisible") != null)) {
            mo22945k(c.getBoolean(C5582R.styleable.Chip_closeIconEnabled, false));
        }
        mo22909c(C6952c.m33334b(this.f16498T0, c, C5582R.styleable.Chip_closeIcon));
        mo22920g(C6952c.m33332a(this.f16498T0, c, C5582R.styleable.Chip_closeIconTint));
        mo22963p(c.getDimension(C5582R.styleable.Chip_closeIconSize, 0.0f));
        mo22915e(c.getBoolean(C5582R.styleable.Chip_android_checkable, false));
        mo22921g(c.getBoolean(C5582R.styleable.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue(str, "checkedIconEnabled") == null || attributeSet.getAttributeValue(str, "checkedIconVisible") != null)) {
            mo22921g(c.getBoolean(C5582R.styleable.Chip_checkedIconEnabled, false));
        }
        mo22896a(C6952c.m33334b(this.f16498T0, c, C5582R.styleable.Chip_checkedIcon));
        mo22906b(C5594h.m24264a(this.f16498T0, c, C5582R.styleable.Chip_showMotionSpec));
        mo22898a(C5594h.m24264a(this.f16498T0, c, C5582R.styleable.Chip_hideMotionSpec));
        mo22951m(c.getDimension(C5582R.styleable.Chip_chipStartPadding, 0.0f));
        mo22972s(c.getDimension(C5582R.styleable.Chip_iconStartPadding, 0.0f));
        mo22969r(c.getDimension(C5582R.styleable.Chip_iconEndPadding, 0.0f));
        mo22982u(c.getDimension(C5582R.styleable.Chip_textStartPadding, 0.0f));
        mo22979t(c.getDimension(C5582R.styleable.Chip_textEndPadding, 0.0f));
        mo22966q(c.getDimension(C5582R.styleable.Chip_closeIconStartPadding, 0.0f));
        mo22958o(c.getDimension(C5582R.styleable.Chip_closeIconEndPadding, 0.0f));
        mo22939j(c.getDimension(C5582R.styleable.Chip_chipEndPadding, 0.0f));
        mo22869H(c.getDimensionPixelSize(C5582R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        c.recycle();
    }

    /* renamed from: k */
    public void mo22945k(boolean z) {
        if (this.f16479A0 != z) {
            boolean A0 = m24977A0();
            this.f16479A0 = z;
            boolean A02 = m24977A0();
            if (A0 != A02) {
                if (A02) {
                    m24994d(this.f16480B0);
                } else {
                    m24999f(this.f16480B0);
                }
                invalidateSelf();
                mo22981t0();
            }
        }
    }

    /* renamed from: n */
    public void mo22956n(@C0209o int i) {
        mo22939j(this.f16498T0.getResources().getDimension(i));
    }

    /* renamed from: b */
    private void m24988b(@C0193h0 Rect rect, @C0193h0 RectF rectF) {
        rectF.set(rect);
        if (m24977A0()) {
            float f = this.f16497S0 + this.f16496R0 + this.f16483E0 + this.f16495Q0 + this.f16494P0;
            if (C0892a.m5157e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: g */
    public void mo22920g(@C0195i0 ColorStateList colorStateList) {
        if (this.f16482D0 != colorStateList) {
            this.f16482D0 = colorStateList;
            if (m24977A0()) {
                C0892a.m5146a(this.f16480B0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: c */
    private void m24991c(@C0193h0 Rect rect, @C0193h0 RectF rectF) {
        rectF.setEmpty();
        if (m24977A0()) {
            float f = this.f16497S0 + this.f16496R0;
            if (C0892a.m5157e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f16483E0;
            } else {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f16483E0;
            }
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f16483E0;
            rectF.top = exactCenterY - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* renamed from: d */
    private void m24993d(@C0193h0 Rect rect, @C0193h0 RectF rectF) {
        rectF.setEmpty();
        if (m24977A0()) {
            float f = this.f16497S0 + this.f16496R0 + this.f16483E0 + this.f16495Q0 + this.f16494P0;
            if (C0892a.m5157e(this) == 0) {
                rectF.right = (float) rect.right;
                rectF.left = rectF.right - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: f */
    private void m24999f(@C0195i0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: g */
    public void mo22921g(boolean z) {
        if (this.f16486H0 != z) {
            boolean y0 = m25008y0();
            this.f16486H0 = z;
            boolean y02 = m25008y0();
            if (y0 != y02) {
                if (y02) {
                    m24994d(this.f16487I0);
                } else {
                    m24999f(this.f16487I0);
                }
                invalidateSelf();
                mo22981t0();
            }
        }
    }

    /* renamed from: b */
    private static boolean m24989b(@C0195i0 C6953d dVar) {
        if (dVar != null) {
            ColorStateList colorStateList = dVar.f19445b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo22917f(@C0195i0 ColorStateList colorStateList) {
        if (this.f16526r0 != colorStateList) {
            this.f16526r0 = colorStateList;
            if (this.f16535v1) {
                mo27801b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: k */
    public void mo22944k(@C0192h int i) {
        mo22921g(this.f16498T0.getResources().getBoolean(i));
    }

    /* renamed from: b */
    public void mo22907b(@C0195i0 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f16532u0, charSequence)) {
            this.f16532u0 = charSequence;
            this.f16505a1.mo27652a(true);
            invalidateSelf();
            mo22981t0();
        }
    }

    /* renamed from: e */
    private static boolean m24997e(@C0195i0 Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: e */
    public void mo22914e(@C0195i0 ColorStateList colorStateList) {
        this.f16539z0 = true;
        if (this.f16537x0 != colorStateList) {
            this.f16537x0 = colorStateList;
            if (m25009z0()) {
                C0892a.m5146a(this.f16536w0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    private void m24994d(@C0195i0 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0892a.m5152a(drawable, C0892a.m5157e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f16480B0) {
                if (drawable.isStateful()) {
                    drawable.setState(mo22890W());
                }
                C0892a.m5146a(drawable, this.f16482D0);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f16536w0;
            if (drawable == drawable2 && this.f16539z0) {
                C0892a.m5146a(drawable2, this.f16537x0);
            }
        }
    }

    /* renamed from: c */
    public void mo22909c(@C0195i0 Drawable drawable) {
        Drawable R = mo22885R();
        if (R != drawable) {
            float F = mo22864F();
            this.f16480B0 = drawable != null ? C0892a.m5161i(drawable).mutate() : null;
            if (C6961b.f19468a) {
                m24979C0();
            }
            float F2 = mo22864F();
            m24999f(R);
            if (m24977A0()) {
                m24994d(this.f16480B0);
            }
            invalidateSelf();
            if (F != F2) {
                mo22981t0();
            }
        }
    }

    @Deprecated
    /* renamed from: f */
    public void mo22918f(boolean z) {
        mo22921g(z);
    }

    /* renamed from: i */
    private static boolean m25003i(@C0195i0 ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: h */
    public void mo22930h(@C0195i0 ColorStateList colorStateList) {
        if (this.f16530t0 != colorStateList) {
            this.f16530t0 = colorStateList;
            m24978B0();
            onStateChange(getState());
        }
    }

    /* renamed from: b */
    public void mo22905b(@C0195i0 Drawable drawable) {
        Drawable K = mo22874K();
        if (K != drawable) {
            float E = mo22862E();
            this.f16536w0 = drawable != null ? C0892a.m5161i(drawable).mutate() : null;
            float E2 = mo22862E();
            m24999f(K);
            if (m25009z0()) {
                m24994d(this.f16536w0);
            }
            invalidateSelf();
            if (E != E2) {
                mo22981t0();
            }
        }
    }

    @Deprecated
    /* renamed from: i */
    public void mo22933i(float f) {
        if (this.f16524q0 != f) {
            this.f16524q0 = f;
            setShapeAppearanceModel(getShapeAppearanceModel().mo27856a(f));
        }
    }

    /* renamed from: e */
    public void mo22915e(boolean z) {
        if (this.f16485G0 != z) {
            this.f16485G0 = z;
            float E = mo22862E();
            if (!z && this.f16512h1) {
                this.f16512h1 = false;
            }
            float E2 = mo22862E();
            invalidateSelf();
            if (E != E2) {
                mo22981t0();
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo22931h(boolean z) {
        mo22935i(z);
    }

    /* renamed from: i */
    public void mo22935i(boolean z) {
        if (this.f16534v0 != z) {
            boolean z0 = m25009z0();
            this.f16534v0 = z;
            boolean z02 = m25009z0();
            if (z0 != z02) {
                if (z02) {
                    m24994d(this.f16536w0);
                } else {
                    m24999f(this.f16536w0);
                }
                invalidateSelf();
                mo22981t0();
            }
        }
    }

    /* renamed from: h */
    public void mo22929h(@C0192h int i) {
        mo22915e(this.f16498T0.getResources().getBoolean(i));
    }

    /* renamed from: b */
    public void mo22906b(@C0195i0 C5594h hVar) {
        this.f16488J0 = hVar;
    }

    /* renamed from: d */
    public void mo22911d(@C0195i0 ColorStateList colorStateList) {
        if (this.f16520o0 != colorStateList) {
            this.f16520o0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: i */
    public void mo22934i(@C0192h int i) {
        mo22921g(this.f16498T0.getResources().getBoolean(i));
    }

    /* renamed from: a */
    public void mo22899a(@C0195i0 C5695a aVar) {
        this.f16527r1 = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public void mo22895a(@C0193h0 RectF rectF) {
        m24988b(getBounds(), rectF);
    }

    /* renamed from: a */
    private void m24982a(@C0193h0 Canvas canvas, @C0193h0 Rect rect) {
        if (m25008y0()) {
            m24983a(rect, this.f16502X0);
            RectF rectF = this.f16502X0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f16487I0.setBounds(0, 0, (int) this.f16502X0.width(), (int) this.f16502X0.height());
            this.f16487I0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: a */
    private void m24983a(@C0193h0 Rect rect, @C0193h0 RectF rectF) {
        rectF.setEmpty();
        if (m25009z0() || m25008y0()) {
            float f = this.f16490L0 + this.f16491M0;
            if (C0892a.m5157e(this) == 0) {
                rectF.left = ((float) rect.left) + f;
                rectF.right = rectF.left + this.f16538y0;
            } else {
                rectF.right = ((float) rect.right) - f;
                rectF.left = rectF.right - this.f16538y0;
            }
            float exactCenterY = rect.exactCenterY();
            float f2 = this.f16538y0;
            rectF.top = exactCenterY - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: a */
    public Align mo22894a(@C0193h0 Rect rect, @C0193h0 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Align align = Align.LEFT;
        if (this.f16532u0 != null) {
            float E = this.f16490L0 + mo22862E() + this.f16493O0;
            if (C0892a.m5157e(this) == 0) {
                pointF.x = ((float) rect.left) + E;
                align = Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - E;
                align = Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m25005v0();
        }
        return align;
    }

    /* renamed from: a */
    public boolean mo22902a(@C0193h0 int[] iArr) {
        if (!Arrays.equals(this.f16521o1, iArr)) {
            this.f16521o1 = iArr;
            if (m24977A0()) {
                return m24986a(getState(), iArr);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo22249a() {
        mo22981t0();
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x014b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m24986a(@androidx.annotation.C0193h0 int[] r7, @androidx.annotation.C0193h0 int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f16518n0
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f16506b1
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f16506b1
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f16506b1 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f16520o0
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f16507c1
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f16507c1
            if (r5 == r3) goto L_0x002c
            r6.f16507c1 = r3
            r0 = 1
        L_0x002c:
            int r1 = com.google.android.material.p185e.C5713a.m25186a(r1, r3)
            int r3 = r6.f16508d1
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo27815f()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004f
            r6.f16508d1 = r1
            int r0 = r6.f16508d1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r6.mo27790a(r0)
            r0 = 1
        L_0x004f:
            android.content.res.ColorStateList r1 = r6.f16526r0
            if (r1 == 0) goto L_0x005a
            int r3 = r6.f16509e1
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            int r3 = r6.f16509e1
            if (r3 == r1) goto L_0x0062
            r6.f16509e1 = r1
            r0 = 1
        L_0x0062:
            android.content.res.ColorStateList r1 = r6.f16525q1
            if (r1 == 0) goto L_0x0075
            boolean r1 = com.google.android.material.p303n.C6961b.m33358a(r7)
            if (r1 == 0) goto L_0x0075
            android.content.res.ColorStateList r1 = r6.f16525q1
            int r3 = r6.f16510f1
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            int r3 = r6.f16510f1
            if (r3 == r1) goto L_0x0081
            r6.f16510f1 = r1
            boolean r1 = r6.f16523p1
            if (r1 == 0) goto L_0x0081
            r0 = 1
        L_0x0081:
            com.google.android.material.internal.n r1 = r6.f16505a1
            com.google.android.material.m.d r1 = r1.mo27648a()
            if (r1 == 0) goto L_0x00a2
            com.google.android.material.internal.n r1 = r6.f16505a1
            com.google.android.material.m.d r1 = r1.mo27648a()
            android.content.res.ColorStateList r1 = r1.f19445b
            if (r1 == 0) goto L_0x00a2
            com.google.android.material.internal.n r1 = r6.f16505a1
            com.google.android.material.m.d r1 = r1.mo27648a()
            android.content.res.ColorStateList r1 = r1.f19445b
            int r3 = r6.f16511g1
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            int r3 = r6.f16511g1
            if (r3 == r1) goto L_0x00aa
            r6.f16511g1 = r1
            r0 = 1
        L_0x00aa:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m24985a(r1, r3)
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r6.f16485G0
            if (r1 == 0) goto L_0x00bd
            r1 = 1
            goto L_0x00be
        L_0x00bd:
            r1 = 0
        L_0x00be:
            boolean r3 = r6.f16512h1
            if (r3 == r1) goto L_0x00d8
            android.graphics.drawable.Drawable r3 = r6.f16487I0
            if (r3 == 0) goto L_0x00d8
            float r0 = r6.mo22862E()
            r6.f16512h1 = r1
            float r1 = r6.mo22862E()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            r0 = 1
            r1 = 1
            goto L_0x00d9
        L_0x00d7:
            r0 = 1
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            android.content.res.ColorStateList r3 = r6.f16517m1
            if (r3 == 0) goto L_0x00e4
            int r5 = r6.f16513i1
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e5
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            int r5 = r6.f16513i1
            if (r5 == r3) goto L_0x00f6
            r6.f16513i1 = r3
            android.content.res.ColorStateList r0 = r6.f16517m1
            android.graphics.PorterDuff$Mode r3 = r6.f16519n1
            android.graphics.PorterDuffColorFilter r0 = com.google.android.material.p297g.C6882a.m33051a(r6, r0, r3)
            r6.f16516l1 = r0
            r0 = 1
        L_0x00f6:
            android.graphics.drawable.Drawable r3 = r6.f16536w0
            boolean r3 = m24997e(r3)
            if (r3 == 0) goto L_0x0105
            android.graphics.drawable.Drawable r3 = r6.f16536w0
            boolean r3 = r3.setState(r7)
            r0 = r0 | r3
        L_0x0105:
            android.graphics.drawable.Drawable r3 = r6.f16487I0
            boolean r3 = m24997e(r3)
            if (r3 == 0) goto L_0x0114
            android.graphics.drawable.Drawable r3 = r6.f16487I0
            boolean r3 = r3.setState(r7)
            r0 = r0 | r3
        L_0x0114:
            android.graphics.drawable.Drawable r3 = r6.f16480B0
            boolean r3 = m24997e(r3)
            if (r3 == 0) goto L_0x0131
            int r3 = r7.length
            int r4 = r8.length
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r4 = r7.length
            java.lang.System.arraycopy(r7, r2, r3, r2, r4)
            int r7 = r7.length
            int r4 = r8.length
            java.lang.System.arraycopy(r8, r2, r3, r7, r4)
            android.graphics.drawable.Drawable r7 = r6.f16480B0
            boolean r7 = r7.setState(r3)
            r0 = r0 | r7
        L_0x0131:
            boolean r7 = com.google.android.material.p303n.C6961b.f19468a
            if (r7 == 0) goto L_0x0144
            android.graphics.drawable.Drawable r7 = r6.f16481C0
            boolean r7 = m24997e(r7)
            if (r7 == 0) goto L_0x0144
            android.graphics.drawable.Drawable r7 = r6.f16481C0
            boolean r7 = r7.setState(r8)
            r0 = r0 | r7
        L_0x0144:
            if (r0 == 0) goto L_0x0149
            r6.invalidateSelf()
        L_0x0149:
            if (r1 == 0) goto L_0x014e
            r6.mo22981t0()
        L_0x014e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C5694a.m24986a(int[], int[]):boolean");
    }

    /* renamed from: a */
    private static boolean m24985a(@C0195i0 int[] iArr, @C0188f int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo22900a(@C0195i0 C6953d dVar) {
        this.f16505a1.mo27651a(dVar, this.f16498T0);
    }

    /* renamed from: a */
    public void mo22897a(@C0195i0 TruncateAt truncateAt) {
        this.f16529s1 = truncateAt;
    }

    /* renamed from: a */
    public void mo22901a(@C0195i0 CharSequence charSequence) {
        if (this.f16484F0 != charSequence) {
            this.f16484F0 = C0908a.m5221c().mo4683b(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo22896a(@C0195i0 Drawable drawable) {
        if (this.f16487I0 != drawable) {
            float E = mo22862E();
            this.f16487I0 = drawable;
            float E2 = mo22862E();
            m24999f(this.f16487I0);
            m24994d(this.f16487I0);
            invalidateSelf();
            if (E != E2) {
                mo22981t0();
            }
        }
    }

    /* renamed from: a */
    public void mo22898a(@C0195i0 C5594h hVar) {
        this.f16489K0 = hVar;
    }
}
