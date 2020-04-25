package com.google.android.material.p306r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.core.p018c.C0821b;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6923n;
import com.google.android.material.internal.C6923n.C6925b;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p185e.C5713a;
import com.google.android.material.p187p.C6974g;
import com.google.android.material.p187p.C6977i;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6983l;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p302m.C6953d;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.r.a */
/* compiled from: TooltipDrawable */
public class C7006a extends C6978j implements C6925b {
    @C0188f

    /* renamed from: A0 */
    private static final int f19678A0 = C5582R.attr.tooltipStyle;
    @C0216r0

    /* renamed from: z0 */
    private static final int f19679z0 = C5582R.style.Widget_MaterialComponents_Tooltip;
    @C0195i0

    /* renamed from: n0 */
    private CharSequence f19680n0;
    @C0193h0

    /* renamed from: o0 */
    private final Context f19681o0;
    @C0195i0

    /* renamed from: p0 */
    private final FontMetrics f19682p0 = new FontMetrics();
    @C0193h0

    /* renamed from: q0 */
    private final C6923n f19683q0 = new C6923n(this);
    @C0193h0

    /* renamed from: r0 */
    private final OnLayoutChangeListener f19684r0 = new C7007a();
    @C0193h0

    /* renamed from: s0 */
    private final Rect f19685s0 = new Rect();

    /* renamed from: t0 */
    private int f19686t0;

    /* renamed from: u0 */
    private int f19687u0;

    /* renamed from: v0 */
    private int f19688v0;

    /* renamed from: w0 */
    private int f19689w0;

    /* renamed from: x0 */
    private int f19690x0;

    /* renamed from: y0 */
    private int f19691y0;

    /* renamed from: com.google.android.material.r.a$a */
    /* compiled from: TooltipDrawable */
    class C7007a implements OnLayoutChangeListener {
        C7007a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C7006a.this.m33699c(view);
        }
    }

    private C7006a(@C0193h0 Context context, AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        super(context, attributeSet, i, i2);
        this.f19681o0 = context;
        this.f19683q0.mo27653b().density = context.getResources().getDisplayMetrics().density;
        this.f19683q0.mo27653b().setTextAlign(Align.CENTER);
    }

    /* renamed from: K */
    private float m33688K() {
        int i;
        if (((this.f19685s0.right - getBounds().right) - this.f19691y0) - this.f19689w0 < 0) {
            i = ((this.f19685s0.right - getBounds().right) - this.f19691y0) - this.f19689w0;
        } else if (((this.f19685s0.left - getBounds().left) - this.f19691y0) + this.f19689w0 <= 0) {
            return 0.0f;
        } else {
            i = ((this.f19685s0.left - getBounds().left) - this.f19691y0) + this.f19689w0;
        }
        return (float) i;
    }

    /* renamed from: L */
    private float m33689L() {
        this.f19683q0.mo27653b().getFontMetrics(this.f19682p0);
        FontMetrics fontMetrics = this.f19682p0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: M */
    private C6974g m33690M() {
        float f = -m33688K();
        double width = (double) getBounds().width();
        double d = (double) this.f19690x0;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        double d2 = d * sqrt;
        Double.isNaN(width);
        float f2 = ((float) (width - d2)) / 2.0f;
        return new C6983l(new C6977i((float) this.f19690x0), Math.min(Math.max(f, -f2), f2));
    }

    /* renamed from: N */
    private float m33691N() {
        CharSequence charSequence = this.f19680n0;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f19683q0.mo27647a(charSequence.toString());
    }

    @C0193h0
    /* renamed from: c */
    public static C7006a m33698c(@C0193h0 Context context) {
        return m33694a(context, null, f19678A0, f19679z0);
    }

    /* renamed from: E */
    public int mo22862E() {
        return this.f19689w0;
    }

    /* renamed from: F */
    public int mo22864F() {
        return this.f19688v0;
    }

    /* renamed from: G */
    public int mo22866G() {
        return this.f19687u0;
    }

    @C0195i0
    /* renamed from: H */
    public CharSequence mo22868H() {
        return this.f19680n0;
    }

    @C0195i0
    /* renamed from: I */
    public C6953d mo22870I() {
        return this.f19683q0.mo27648a();
    }

    /* renamed from: J */
    public int mo22872J() {
        return this.f19686t0;
    }

    /* renamed from: b */
    public void mo27938b(@C0193h0 View view) {
        m33699c(view);
        view.addOnLayoutChangeListener(this.f19684r0);
    }

    public void draw(@C0193h0 Canvas canvas) {
        canvas.save();
        float K = m33688K();
        double d = (double) this.f19690x0;
        double sqrt = Math.sqrt(2.0d);
        Double.isNaN(d);
        double d2 = d * sqrt;
        double d3 = (double) this.f19690x0;
        Double.isNaN(d3);
        canvas.translate(K, (float) (-(d2 - d3)));
        super.draw(canvas);
        m33695a(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f19683q0.mo27653b().getTextSize(), (float) this.f19688v0);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f19686t0 * 2)) + m33691N(), (float) this.f19687u0);
    }

    /* renamed from: h */
    public void mo22929h(@C0199k0 int i) {
        this.f19689w0 = i;
        invalidateSelf();
    }

    /* renamed from: i */
    public void mo27941i(@C0199k0 int i) {
        this.f19688v0 = i;
        invalidateSelf();
    }

    /* renamed from: j */
    public void mo27942j(@C0199k0 int i) {
        this.f19687u0 = i;
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo27943k(@C0216r0 int i) {
        mo27936a(new C6953d(this.f19681o0, i));
    }

    /* renamed from: l */
    public void mo27944l(@C0199k0 int i) {
        this.f19686t0 = i;
        invalidateSelf();
    }

    /* renamed from: m */
    public void mo27945m(@C0214q0 int i) {
        mo27937a((CharSequence) this.f19681o0.getResources().getString(i));
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().mo27871m().mo27884b(m33690M()).mo27878a());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @C0193h0
    /* renamed from: a */
    public static C7006a m33694a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        C7006a aVar = new C7006a(context, attributeSet, i, i2);
        aVar.m33696a(attributeSet, i, i2);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m33699c(@C0193h0 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f19691y0 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f19685s0);
    }

    @C0193h0
    /* renamed from: a */
    public static C7006a m33693a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        return m33694a(context, attributeSet, f19678A0, f19679z0);
    }

    /* renamed from: a */
    private void m33696a(@C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        TypedArray c = C6928p.m33264c(this.f19681o0, attributeSet, C5582R.styleable.Tooltip, i, i2, new int[0]);
        this.f19690x0 = this.f19681o0.getResources().getDimensionPixelSize(C5582R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().mo27871m().mo27884b(m33690M()).mo27878a());
        mo27937a(c.getText(C5582R.styleable.Tooltip_android_text));
        mo27936a(C6952c.m33335c(this.f19681o0, c, C5582R.styleable.Tooltip_android_textAppearance));
        mo27790a(ColorStateList.valueOf(c.getColor(C5582R.styleable.Tooltip_backgroundTint, C5713a.m25186a(C0821b.m4811d(C5713a.m25189a(this.f19681o0, 16842801, C7006a.class.getCanonicalName()), JpegConst.APP5), C0821b.m4811d(C5713a.m25189a(this.f19681o0, C5582R.attr.colorOnBackground, C7006a.class.getCanonicalName()), C13959t.f40941p2)))));
        this.f19686t0 = c.getDimensionPixelSize(C5582R.styleable.Tooltip_android_padding, 0);
        this.f19687u0 = c.getDimensionPixelSize(C5582R.styleable.Tooltip_android_minWidth, 0);
        this.f19688v0 = c.getDimensionPixelSize(C5582R.styleable.Tooltip_android_minHeight, 0);
        this.f19689w0 = c.getDimensionPixelSize(C5582R.styleable.Tooltip_android_layout_margin, 0);
        c.recycle();
    }

    /* renamed from: a */
    public void mo27937a(@C0195i0 CharSequence charSequence) {
        if (!TextUtils.equals(this.f19680n0, charSequence)) {
            this.f19680n0 = charSequence;
            this.f19683q0.mo27652a(true);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo27936a(@C0195i0 C6953d dVar) {
        this.f19683q0.mo27651a(dVar, this.f19681o0);
    }

    /* renamed from: a */
    public void mo27935a(@C0193h0 View view) {
        view.removeOnLayoutChangeListener(this.f19684r0);
    }

    /* renamed from: a */
    public void mo22249a() {
        invalidateSelf();
    }

    /* renamed from: a */
    private void m33695a(@C0193h0 Canvas canvas) {
        if (this.f19680n0 != null) {
            Rect bounds = getBounds();
            int a = (int) m33692a(bounds);
            if (this.f19683q0.mo27648a() != null) {
                this.f19683q0.mo27653b().drawableState = getState();
                this.f19683q0.mo27649a(this.f19681o0);
            }
            CharSequence charSequence = this.f19680n0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) a, this.f19683q0.mo27653b());
        }
    }

    /* renamed from: a */
    private float m33692a(@C0193h0 Rect rect) {
        return ((float) rect.centerY()) - m33689L();
    }
}
