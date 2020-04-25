package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.C0193h0;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.core.widget.a */
/* compiled from: AutoScrollHelper */
public abstract class C1104a implements OnTouchListener {

    /* renamed from: c0 */
    public static final float f4860c0 = 0.0f;

    /* renamed from: d0 */
    public static final float f4861d0 = Float.MAX_VALUE;

    /* renamed from: e0 */
    public static final float f4862e0 = 0.0f;

    /* renamed from: f0 */
    public static final int f4863f0 = 0;

    /* renamed from: g0 */
    public static final int f4864g0 = 1;

    /* renamed from: h0 */
    public static final int f4865h0 = 2;

    /* renamed from: i0 */
    private static final int f4866i0 = 0;

    /* renamed from: j0 */
    private static final int f4867j0 = 1;

    /* renamed from: k0 */
    private static final int f4868k0 = 1;

    /* renamed from: l0 */
    private static final int f4869l0 = 315;

    /* renamed from: m0 */
    private static final int f4870m0 = 1575;

    /* renamed from: n0 */
    private static final float f4871n0 = Float.MAX_VALUE;

    /* renamed from: o0 */
    private static final float f4872o0 = 0.2f;

    /* renamed from: p0 */
    private static final float f4873p0 = 1.0f;

    /* renamed from: q0 */
    private static final int f4874q0 = ViewConfiguration.getTapTimeout();

    /* renamed from: r0 */
    private static final int f4875r0 = 500;

    /* renamed from: s0 */
    private static final int f4876s0 = 500;

    /* renamed from: N */
    final View f4877N;

    /* renamed from: O */
    private Runnable f4878O;

    /* renamed from: P */
    private float[] f4879P = {0.0f, 0.0f};

    /* renamed from: Q */
    private float[] f4880Q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: R */
    private int f4881R;

    /* renamed from: S */
    private int f4882S;

    /* renamed from: T */
    private float[] f4883T = {0.0f, 0.0f};

    /* renamed from: U */
    private float[] f4884U = {0.0f, 0.0f};

    /* renamed from: V */
    private float[] f4885V = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: W */
    private boolean f4886W;

    /* renamed from: X */
    boolean f4887X;

    /* renamed from: Y */
    boolean f4888Y;

    /* renamed from: Z */
    boolean f4889Z;

    /* renamed from: a */
    final C1105a f4890a = new C1105a();

    /* renamed from: a0 */
    private boolean f4891a0;

    /* renamed from: b */
    private final Interpolator f4892b = new AccelerateInterpolator();

    /* renamed from: b0 */
    private boolean f4893b0;

    /* renamed from: androidx.core.widget.a$a */
    /* compiled from: AutoScrollHelper */
    private static class C1105a {

        /* renamed from: a */
        private int f4894a;

        /* renamed from: b */
        private int f4895b;

        /* renamed from: c */
        private float f4896c;

        /* renamed from: d */
        private float f4897d;

        /* renamed from: e */
        private long f4898e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f4899f = 0;

        /* renamed from: g */
        private int f4900g = 0;

        /* renamed from: h */
        private int f4901h = 0;

        /* renamed from: i */
        private long f4902i = -1;

        /* renamed from: j */
        private float f4903j;

        /* renamed from: k */
        private int f4904k;

        C1105a() {
        }

        /* renamed from: a */
        private float m6303a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo5345a(int i) {
            this.f4895b = i;
        }

        /* renamed from: b */
        public void mo5347b(int i) {
            this.f4894a = i;
        }

        /* renamed from: c */
        public int mo5348c() {
            return this.f4901h;
        }

        /* renamed from: d */
        public int mo5349d() {
            float f = this.f4896c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo5350e() {
            float f = this.f4897d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo5351f() {
            return this.f4902i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4902i + ((long) this.f4904k);
        }

        /* renamed from: g */
        public void mo5352g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f4904k = C1104a.m6281a((int) (currentAnimationTimeMillis - this.f4898e), 0, this.f4895b);
            this.f4903j = m6304a(currentAnimationTimeMillis);
            this.f4902i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo5353h() {
            this.f4898e = AnimationUtils.currentAnimationTimeMillis();
            this.f4902i = -1;
            this.f4899f = this.f4898e;
            this.f4903j = 0.5f;
            this.f4900g = 0;
            this.f4901h = 0;
        }

        /* renamed from: a */
        private float m6304a(long j) {
            if (j < this.f4898e) {
                return 0.0f;
            }
            long j2 = this.f4902i;
            if (j2 < 0 || j < j2) {
                return C1104a.m6278a(((float) (j - this.f4898e)) / ((float) this.f4894a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f4903j;
            return (1.0f - f) + (f * C1104a.m6278a(((float) j3) / ((float) this.f4904k), 0.0f, 1.0f));
        }

        /* renamed from: b */
        public int mo5346b() {
            return this.f4900g;
        }

        /* renamed from: a */
        public void mo5343a() {
            if (this.f4899f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m6303a(m6304a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f4899f;
                this.f4899f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f4900g = (int) (this.f4896c * f);
                this.f4901h = (int) (f * this.f4897d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo5344a(float f, float f2) {
            this.f4896c = f;
            this.f4897d = f2;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    /* compiled from: AutoScrollHelper */
    private class C1106b implements Runnable {
        C1106b() {
        }

        public void run() {
            C1104a aVar = C1104a.this;
            if (aVar.f4889Z) {
                if (aVar.f4887X) {
                    aVar.f4887X = false;
                    aVar.f4890a.mo5353h();
                }
                C1105a aVar2 = C1104a.this.f4890a;
                if (aVar2.mo5351f() || !C1104a.this.mo5338d()) {
                    C1104a.this.f4889Z = false;
                    return;
                }
                C1104a aVar3 = C1104a.this;
                if (aVar3.f4888Y) {
                    aVar3.f4888Y = false;
                    aVar3.mo5326a();
                }
                aVar2.mo5343a();
                C1104a.this.mo5327a(aVar2.mo5346b(), aVar2.mo5348c());
                C0962e0.m5451a(C1104a.this.f4877N, (Runnable) this);
            }
        }
    }

    public C1104a(@C0193h0 View view) {
        this.f4877N = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo5329b(f2, f2);
        float f3 = (float) i;
        mo5333c(f3, f3);
        mo5337d(1);
        mo5324a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo5336d(0.2f, 0.2f);
        mo5339e(1.0f, 1.0f);
        mo5334c(f4874q0);
        mo5341f(500);
        mo5340e(500);
    }

    /* renamed from: a */
    static float m6278a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    static int m6281a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public C1104a mo5325a(boolean z) {
        if (this.f4891a0 && !z) {
            m6282e();
        }
        this.f4891a0 = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo5327a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo5328a(int i);

    /* renamed from: b */
    public boolean mo5331b() {
        return this.f4891a0;
    }

    /* renamed from: b */
    public abstract boolean mo5332b(int i);

    /* renamed from: c */
    public boolean mo5335c() {
        return this.f4893b0;
    }

    @C0193h0
    /* renamed from: d */
    public C1104a mo5337d(int i) {
        this.f4881R = i;
        return this;
    }

    @C0193h0
    /* renamed from: e */
    public C1104a mo5339e(float f, float f2) {
        float[] fArr = this.f4883T;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @C0193h0
    /* renamed from: f */
    public C1104a mo5341f(int i) {
        this.f4890a.mo5347b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f4891a0
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m6282e()
            goto L_0x0058
        L_0x001a:
            r5.f4888Y = r2
            r5.f4886W = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f4877N
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m6280a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f4877N
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m6280a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f4890a
            r7.mo5344a(r0, r6)
            boolean r6 = r5.f4889Z
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo5338d()
            if (r6 == 0) goto L_0x0058
            r5.m6284f()
        L_0x0058:
            boolean r6 = r5.f4893b0
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f4889Z
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C1104a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: f */
    private void m6284f() {
        if (this.f4878O == null) {
            this.f4878O = new C1106b();
        }
        this.f4889Z = true;
        this.f4887X = true;
        if (!this.f4886W) {
            int i = this.f4882S;
            if (i > 0) {
                C0962e0.m5452a(this.f4877N, this.f4878O, (long) i);
                this.f4886W = true;
            }
        }
        this.f4878O.run();
        this.f4886W = true;
    }

    /* renamed from: b */
    public C1104a mo5330b(boolean z) {
        this.f4893b0 = z;
        return this;
    }

    @C0193h0
    /* renamed from: c */
    public C1104a mo5333c(float f, float f2) {
        float[] fArr = this.f4884U;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @C0193h0
    /* renamed from: d */
    public C1104a mo5336d(float f, float f2) {
        float[] fArr = this.f4879P;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public C1104a mo5329b(float f, float f2) {
        float[] fArr = this.f4885V;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @C0193h0
    /* renamed from: e */
    public C1104a mo5340e(int i) {
        this.f4890a.mo5345a(i);
        return this;
    }

    /* renamed from: e */
    private void m6282e() {
        if (this.f4887X) {
            this.f4889Z = false;
        } else {
            this.f4890a.mo5352g();
        }
    }

    @C0193h0
    /* renamed from: a */
    public C1104a mo5324a(float f, float f2) {
        float[] fArr = this.f4880Q;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    @C0193h0
    /* renamed from: c */
    public C1104a mo5334c(int i) {
        this.f4882S = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5338d() {
        C1105a aVar = this.f4890a;
        int e = aVar.mo5350e();
        int d = aVar.mo5349d();
        return (e != 0 && mo5332b(e)) || (d != 0 && mo5328a(d));
    }

    /* renamed from: a */
    private float m6280a(int i, float f, float f2, float f3) {
        float a = m6279a(this.f4879P[i], f2, this.f4880Q[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f4883T[i];
        float f5 = this.f4884U[i];
        float f6 = this.f4885V[i];
        float f7 = f4 * f3;
        if (a > 0.0f) {
            return m6278a(a * f7, f5, f6);
        }
        return -m6278a((-a) * f7, f5, f6);
    }

    /* renamed from: f */
    private float m6283f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f4881R;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.f4889Z || this.f4881R != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: a */
    private float m6279a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m6278a(f * f2, 0.0f, f3);
        float f6 = m6283f(f2 - f4, a) - m6283f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f4892b.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f4892b.getInterpolation(f6);
        }
        return m6278a(f5, -1.0f, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5326a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f4877N.onTouchEvent(obtain);
        obtain.recycle();
    }
}
