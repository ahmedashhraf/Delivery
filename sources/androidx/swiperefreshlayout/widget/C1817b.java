package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0944i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p053b.p065e.p066b.p067a.C2117b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* compiled from: CircularProgressDrawable */
public class C1817b extends Drawable implements Animatable {

    /* renamed from: R */
    private static final Interpolator f7052R = new LinearInterpolator();

    /* renamed from: S */
    private static final Interpolator f7053S = new C2117b();

    /* renamed from: T */
    public static final int f7054T = 0;

    /* renamed from: U */
    private static final float f7055U = 11.0f;

    /* renamed from: V */
    private static final float f7056V = 3.0f;

    /* renamed from: W */
    private static final int f7057W = 12;

    /* renamed from: X */
    private static final int f7058X = 6;

    /* renamed from: Y */
    public static final int f7059Y = 1;

    /* renamed from: Z */
    private static final float f7060Z = 7.5f;

    /* renamed from: a0 */
    private static final float f7061a0 = 2.5f;

    /* renamed from: b0 */
    private static final int f7062b0 = 10;

    /* renamed from: c0 */
    private static final int f7063c0 = 5;

    /* renamed from: d0 */
    private static final int[] f7064d0 = {-16777216};

    /* renamed from: e0 */
    private static final float f7065e0 = 0.75f;

    /* renamed from: f0 */
    private static final float f7066f0 = 0.5f;

    /* renamed from: g0 */
    private static final int f7067g0 = 1332;

    /* renamed from: h0 */
    private static final float f7068h0 = 216.0f;

    /* renamed from: i0 */
    private static final float f7069i0 = 0.8f;

    /* renamed from: j0 */
    private static final float f7070j0 = 0.01f;

    /* renamed from: k0 */
    private static final float f7071k0 = 0.20999998f;

    /* renamed from: N */
    private Resources f7072N;

    /* renamed from: O */
    private Animator f7073O;

    /* renamed from: P */
    float f7074P;

    /* renamed from: Q */
    boolean f7075Q;

    /* renamed from: a */
    private final C1821d f7076a = new C1821d();

    /* renamed from: b */
    private float f7077b;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* compiled from: CircularProgressDrawable */
    class C1818a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1821d f7078a;

        C1818a(C1821d dVar) {
            this.f7078a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1817b.this.mo8158a(floatValue, this.f7078a);
            C1817b.this.mo8159a(floatValue, this.f7078a, false);
            C1817b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* compiled from: CircularProgressDrawable */
    class C1819b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1821d f7080a;

        C1819b(C1821d dVar) {
            this.f7080a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1817b.this.mo8159a(1.0f, this.f7080a, true);
            this.f7080a.mo8232v();
            this.f7080a.mo8230t();
            C1817b bVar = C1817b.this;
            if (bVar.f7075Q) {
                bVar.f7075Q = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f7080a.mo8202a(false);
                return;
            }
            bVar.f7074P += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C1817b.this.f7074P = 0.0f;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* compiled from: CircularProgressDrawable */
    public @interface C1820c {
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$d */
    /* compiled from: CircularProgressDrawable */
    private static class C1821d {

        /* renamed from: a */
        final RectF f7082a = new RectF();

        /* renamed from: b */
        final Paint f7083b = new Paint();

        /* renamed from: c */
        final Paint f7084c = new Paint();

        /* renamed from: d */
        final Paint f7085d = new Paint();

        /* renamed from: e */
        float f7086e = 0.0f;

        /* renamed from: f */
        float f7087f = 0.0f;

        /* renamed from: g */
        float f7088g = 0.0f;

        /* renamed from: h */
        float f7089h = 5.0f;

        /* renamed from: i */
        int[] f7090i;

        /* renamed from: j */
        int f7091j;

        /* renamed from: k */
        float f7092k;

        /* renamed from: l */
        float f7093l;

        /* renamed from: m */
        float f7094m;

        /* renamed from: n */
        boolean f7095n;

        /* renamed from: o */
        Path f7096o;

        /* renamed from: p */
        float f7097p = 1.0f;

        /* renamed from: q */
        float f7098q;

        /* renamed from: r */
        int f7099r;

        /* renamed from: s */
        int f7100s;

        /* renamed from: t */
        int f7101t = 255;

        /* renamed from: u */
        int f7102u;

        C1821d() {
            this.f7083b.setStrokeCap(Cap.SQUARE);
            this.f7083b.setAntiAlias(true);
            this.f7083b.setStyle(Style.STROKE);
            this.f7084c.setStyle(Style.FILL);
            this.f7084c.setAntiAlias(true);
            this.f7085d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8196a(float f, float f2) {
            this.f7099r = (int) f;
            this.f7100s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo8204b() {
            return (float) this.f7100s;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo8209c(int i) {
            this.f7102u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public float mo8210d() {
            return (float) this.f7099r;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo8213e() {
            return this.f7085d.getColor();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo8216f(float f) {
            this.f7089h = f;
            this.f7083b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int[] mo8217g() {
            return this.f7090i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public float mo8218h() {
            return this.f7087f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public int mo8219i() {
            return this.f7090i[mo8220j()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public int mo8220j() {
            return (this.f7091j + 1) % this.f7090i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public float mo8221k() {
            return this.f7088g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo8222l() {
            return this.f7095n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public float mo8223m() {
            return this.f7086e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public int mo8224n() {
            return this.f7090i[this.f7091j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public float mo8225o() {
            return this.f7093l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public float mo8226p() {
            return this.f7094m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public float mo8227q() {
            return this.f7092k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public Cap mo8228r() {
            return this.f7083b.getStrokeCap();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public float mo8229s() {
            return this.f7089h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public void mo8230t() {
            mo8212d(mo8220j());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public void mo8231u() {
            this.f7092k = 0.0f;
            this.f7093l = 0.0f;
            this.f7094m = 0.0f;
            mo8214e(0.0f);
            mo8208c(0.0f);
            mo8211d(0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo8232v() {
            this.f7092k = this.f7086e;
            this.f7093l = this.f7087f;
            this.f7094m = this.f7088g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8206b(int i) {
            this.f7085d.setColor(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo8208c(float f) {
            this.f7087f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo8212d(int i) {
            this.f7091j = i;
            this.f7102u = this.f7090i[this.f7091j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo8214e(float f) {
            this.f7086e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8201a(Cap cap) {
            this.f7083b.setStrokeCap(cap);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8205b(float f) {
            this.f7098q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public float mo8207c() {
            return this.f7097p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public float mo8215f() {
            return this.f7098q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8199a(Canvas canvas, Rect rect) {
            RectF rectF = this.f7082a;
            float f = this.f7098q;
            float f2 = (this.f7089h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f7099r) * this.f7097p) / 2.0f, this.f7089h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f7086e;
            float f4 = this.f7088g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f7087f + f4) * 360.0f) - f5;
            this.f7083b.setColor(this.f7102u);
            this.f7083b.setAlpha(this.f7101t);
            float f7 = this.f7089h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f7085d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f7083b);
            mo8198a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo8211d(float f) {
            this.f7088g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8198a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f7095n) {
                Path path = this.f7096o;
                if (path == null) {
                    this.f7096o = new Path();
                    this.f7096o.setFillType(FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f7099r) * this.f7097p) / 2.0f;
                this.f7096o.moveTo(0.0f, 0.0f);
                this.f7096o.lineTo(((float) this.f7099r) * this.f7097p, 0.0f);
                Path path2 = this.f7096o;
                float f4 = (float) this.f7099r;
                float f5 = this.f7097p;
                path2.lineTo((f4 * f5) / 2.0f, ((float) this.f7100s) * f5);
                this.f7096o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f7089h / 2.0f));
                this.f7096o.close();
                this.f7084c.setColor(this.f7102u);
                this.f7084c.setAlpha(this.f7101t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f7096o, this.f7084c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8203a(@C0193h0 int[] iArr) {
            this.f7090i = iArr;
            mo8212d(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8200a(ColorFilter colorFilter) {
            this.f7083b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8197a(int i) {
            this.f7101t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo8194a() {
            return this.f7101t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8202a(boolean z) {
            if (this.f7095n != z) {
                this.f7095n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8195a(float f) {
            if (f != this.f7097p) {
                this.f7097p = f;
            }
        }
    }

    public C1817b(@C0193h0 Context context) {
        this.f7072N = ((Context) C0944i.m5337a(context)).getResources();
        this.f7076a.mo8203a(f7064d0);
        mo8171d(f7061a0);
        m9735o();
    }

    /* renamed from: a */
    private int m9730a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m9731a(float f, float f2, float f3, float f4) {
        C1821d dVar = this.f7076a;
        float f5 = this.f7072N.getDisplayMetrics().density;
        dVar.mo8216f(f2 * f5);
        dVar.mo8205b(f * f5);
        dVar.mo8212d(0);
        dVar.mo8196a(f3 * f5, f4 * f5);
    }

    /* renamed from: n */
    private float m9734n() {
        return this.f7077b;
    }

    /* renamed from: o */
    private void m9735o() {
        C1821d dVar = this.f7076a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1818a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f7052R);
        ofFloat.addListener(new C1819b(dVar));
        this.f7073O = ofFloat;
    }

    /* renamed from: b */
    public void mo8166b(int i) {
        if (i == 0) {
            m9731a(f7055U, f7056V, 12.0f, 6.0f);
        } else {
            m9731a(f7060Z, f7061a0, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: c */
    public float mo8168c() {
        return this.f7076a.mo8204b();
    }

    /* renamed from: d */
    public void mo8171d(float f) {
        this.f7076a.mo8216f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f7077b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f7076a.mo8199a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public float mo8173e() {
        return this.f7076a.mo8210d();
    }

    /* renamed from: f */
    public int mo8174f() {
        return this.f7076a.mo8213e();
    }

    /* renamed from: g */
    public float mo8175g() {
        return this.f7076a.mo8215f();
    }

    public int getAlpha() {
        return this.f7076a.mo8194a();
    }

    public int getOpacity() {
        return -3;
    }

    @C0193h0
    /* renamed from: h */
    public int[] mo8178h() {
        return this.f7076a.mo8217g();
    }

    /* renamed from: i */
    public float mo8179i() {
        return this.f7076a.mo8218h();
    }

    public boolean isRunning() {
        return this.f7073O.isRunning();
    }

    /* renamed from: j */
    public float mo8181j() {
        return this.f7076a.mo8221k();
    }

    /* renamed from: k */
    public float mo8182k() {
        return this.f7076a.mo8223m();
    }

    @C0193h0
    /* renamed from: l */
    public Cap mo8183l() {
        return this.f7076a.mo8228r();
    }

    /* renamed from: m */
    public float mo8184m() {
        return this.f7076a.mo8229s();
    }

    public void setAlpha(int i) {
        this.f7076a.mo8197a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7076a.mo8200a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f7073O.cancel();
        this.f7076a.mo8232v();
        if (this.f7076a.mo8218h() != this.f7076a.mo8223m()) {
            this.f7075Q = true;
            this.f7073O.setDuration(666);
            this.f7073O.start();
            return;
        }
        this.f7076a.mo8212d(0);
        this.f7076a.mo8231u();
        this.f7073O.setDuration(1332);
        this.f7073O.start();
    }

    public void stop() {
        this.f7073O.cancel();
        m9733e(0.0f);
        this.f7076a.mo8202a(false);
        this.f7076a.mo8212d(0);
        this.f7076a.mo8231u();
        invalidateSelf();
    }

    /* renamed from: e */
    private void m9733e(float f) {
        this.f7077b = f;
    }

    /* renamed from: c */
    public void mo8169c(float f) {
        this.f7076a.mo8211d(f);
        invalidateSelf();
    }

    /* renamed from: d */
    public float mo8170d() {
        return this.f7076a.mo8207c();
    }

    /* renamed from: b */
    public void mo8164b(float f) {
        this.f7076a.mo8205b(f);
        invalidateSelf();
    }

    /* renamed from: b */
    public boolean mo8167b() {
        return this.f7076a.mo8222l();
    }

    /* renamed from: b */
    public void mo8165b(float f, float f2) {
        this.f7076a.mo8214e(f);
        this.f7076a.mo8208c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8161a(@C0193h0 Cap cap) {
        this.f7076a.mo8201a(cap);
        invalidateSelf();
    }

    /* renamed from: b */
    private void m9732b(float f, C1821d dVar) {
        mo8158a(f, dVar);
        float floor = (float) (Math.floor((double) (dVar.mo8226p() / f7069i0)) + 1.0d);
        dVar.mo8214e(dVar.mo8227q() + (((dVar.mo8225o() - f7070j0) - dVar.mo8227q()) * f));
        dVar.mo8208c(dVar.mo8225o());
        dVar.mo8211d(dVar.mo8226p() + ((floor - dVar.mo8226p()) * f));
    }

    /* renamed from: a */
    public void mo8157a(float f, float f2) {
        this.f7076a.mo8196a(f, f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8162a(boolean z) {
        this.f7076a.mo8202a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8156a(float f) {
        this.f7076a.mo8195a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8160a(int i) {
        this.f7076a.mo8206b(i);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8163a(@C0193h0 int... iArr) {
        this.f7076a.mo8203a(iArr);
        this.f7076a.mo8212d(0);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8158a(float f, C1821d dVar) {
        if (f > 0.75f) {
            dVar.mo8209c(m9730a((f - 0.75f) / 0.25f, dVar.mo8224n(), dVar.mo8219i()));
        } else {
            dVar.mo8209c(dVar.mo8224n());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8159a(float f, C1821d dVar, boolean z) {
        float f2;
        float f3;
        if (this.f7075Q) {
            m9732b(f, dVar);
        } else if (f != 1.0f || z) {
            float p = dVar.mo8226p();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                float q = dVar.mo8227q();
                float f5 = q;
                f2 = (f7053S.getInterpolation(f4) * 0.79f) + f7070j0 + q;
                f3 = f5;
            } else {
                f2 = dVar.mo8227q() + 0.79f;
                f3 = f2 - (((1.0f - f7053S.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + f7070j0);
            }
            float f6 = p + (f7071k0 * f);
            float f7 = (f + this.f7074P) * f7068h0;
            dVar.mo8214e(f3);
            dVar.mo8208c(f2);
            dVar.mo8211d(f6);
            m9733e(f7);
        }
    }
}
