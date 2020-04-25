package androidx.customview.p039a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.core.p034l.C0962e0;
import java.util.Arrays;

/* renamed from: androidx.customview.a.c */
/* compiled from: ViewDragHelper */
public class C1138c {

    /* renamed from: A */
    public static final int f4970A = 2;

    /* renamed from: B */
    public static final int f4971B = 1;

    /* renamed from: C */
    public static final int f4972C = 2;

    /* renamed from: D */
    public static final int f4973D = 4;

    /* renamed from: E */
    public static final int f4974E = 8;

    /* renamed from: F */
    public static final int f4975F = 15;

    /* renamed from: G */
    public static final int f4976G = 1;

    /* renamed from: H */
    public static final int f4977H = 2;

    /* renamed from: I */
    public static final int f4978I = 3;

    /* renamed from: J */
    private static final int f4979J = 20;

    /* renamed from: K */
    private static final int f4980K = 256;

    /* renamed from: L */
    private static final int f4981L = 600;

    /* renamed from: M */
    private static final Interpolator f4982M = new C1139a();

    /* renamed from: w */
    private static final String f4983w = "ViewDragHelper";

    /* renamed from: x */
    public static final int f4984x = -1;

    /* renamed from: y */
    public static final int f4985y = 0;

    /* renamed from: z */
    public static final int f4986z = 1;

    /* renamed from: a */
    private int f4987a;

    /* renamed from: b */
    private int f4988b;

    /* renamed from: c */
    private int f4989c = -1;

    /* renamed from: d */
    private float[] f4990d;

    /* renamed from: e */
    private float[] f4991e;

    /* renamed from: f */
    private float[] f4992f;

    /* renamed from: g */
    private float[] f4993g;

    /* renamed from: h */
    private int[] f4994h;

    /* renamed from: i */
    private int[] f4995i;

    /* renamed from: j */
    private int[] f4996j;

    /* renamed from: k */
    private int f4997k;

    /* renamed from: l */
    private VelocityTracker f4998l;

    /* renamed from: m */
    private float f4999m;

    /* renamed from: n */
    private float f5000n;

    /* renamed from: o */
    private int f5001o;

    /* renamed from: p */
    private int f5002p;

    /* renamed from: q */
    private OverScroller f5003q;

    /* renamed from: r */
    private final C1141c f5004r;

    /* renamed from: s */
    private View f5005s;

    /* renamed from: t */
    private boolean f5006t;

    /* renamed from: u */
    private final ViewGroup f5007u;

    /* renamed from: v */
    private final Runnable f5008v = new C1140b();

    /* renamed from: androidx.customview.a.c$a */
    /* compiled from: ViewDragHelper */
    static class C1139a implements Interpolator {
        C1139a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.customview.a.c$b */
    /* compiled from: ViewDragHelper */
    class C1140b implements Runnable {
        C1140b() {
        }

        public void run() {
            C1138c.this.mo5438d(0);
        }
    }

    /* renamed from: androidx.customview.a.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C1141c {
        /* renamed from: a */
        public int mo5448a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo5449a(@C0193h0 View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo5450a(@C0193h0 View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo5451a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo5452a(@C0193h0 View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo5453a(@C0193h0 View view, int i) {
        }

        /* renamed from: a */
        public void mo5454a(@C0193h0 View view, int i, int i2, @C0199k0 int i3, @C0199k0 int i4) {
        }

        /* renamed from: b */
        public int mo5455b(@C0193h0 View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo5456b(@C0193h0 View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo5457b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo5458b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo5459b(@C0193h0 View view, int i);

        /* renamed from: c */
        public void mo5460c(int i) {
        }
    }

    private C1138c(@C0193h0 Context context, @C0193h0 ViewGroup viewGroup, @C0193h0 C1141c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f5007u = viewGroup;
            this.f5004r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f5001o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4988b = viewConfiguration.getScaledTouchSlop();
            this.f4999m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f5000n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f5003q = new OverScroller(context, f4982M);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public static C1138c m6480a(@C0193h0 ViewGroup viewGroup, @C0193h0 C1141c cVar) {
        return new C1138c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: i */
    private void m6495i() {
        float[] fArr = this.f4990d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4991e, 0.0f);
            Arrays.fill(this.f4992f, 0.0f);
            Arrays.fill(this.f4993g, 0.0f);
            Arrays.fill(this.f4994h, 0);
            Arrays.fill(this.f4995i, 0);
            Arrays.fill(this.f4996j, 0);
            this.f4997k = 0;
        }
    }

    /* renamed from: j */
    private void m6496j() {
        this.f4998l.computeCurrentVelocity(1000, this.f4999m);
        m6481a(m6476a(this.f4998l.getXVelocity(this.f4989c), this.f5000n, this.f4999m), m6476a(this.f4998l.getYVelocity(this.f4989c), this.f5000n, this.f4999m));
    }

    /* renamed from: b */
    public void mo5429b() {
        this.f4989c = -1;
        m6495i();
        VelocityTracker velocityTracker = this.f4998l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4998l = null;
        }
    }

    /* renamed from: c */
    public int mo5434c() {
        return this.f4989c;
    }

    @C0195i0
    /* renamed from: d */
    public View mo5437d() {
        return this.f5005s;
    }

    /* renamed from: e */
    public void mo5441e(int i) {
        this.f5002p = i;
    }

    /* renamed from: f */
    public float mo5443f() {
        return this.f5000n;
    }

    @C0199k0
    /* renamed from: g */
    public int mo5444g() {
        return this.f4988b;
    }

    /* renamed from: h */
    public int mo5445h() {
        return this.f4987a;
    }

    /* renamed from: a */
    public static C1138c m6479a(@C0193h0 ViewGroup viewGroup, float f, @C0193h0 C1141c cVar) {
        C1138c a = m6480a(viewGroup, cVar);
        a.f4988b = (int) (((float) a.f4988b) * (1.0f / f));
        return a;
    }

    /* renamed from: c */
    private boolean m6490c(int i, int i2, int i3, int i4) {
        int left = this.f5005s.getLeft();
        int top = this.f5005s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f5003q.abortAnimation();
            mo5438d(0);
            return false;
        }
        this.f5003q.startScroll(left, top, i5, i6, m6478a(this.f5005s, i5, i6, i3, i4));
        mo5438d(2);
        return true;
    }

    /* renamed from: f */
    private void m6492f(int i) {
        if (this.f4990d != null && mo5435c(i)) {
            this.f4990d[i] = 0.0f;
            this.f4991e[i] = 0.0f;
            this.f4992f[i] = 0.0f;
            this.f4993g[i] = 0.0f;
            this.f4994h[i] = 0;
            this.f4995i[i] = 0;
            this.f4996j[i] = 0;
            this.f4997k = ((1 << i) ^ -1) & this.f4997k;
        }
    }

    /* renamed from: g */
    private void m6493g(int i) {
        float[] fArr = this.f4990d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f4990d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f4991e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f4992f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f4993g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f4994h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4995i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4996j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4990d = fArr2;
            this.f4991e = fArr3;
            this.f4992f = fArr4;
            this.f4993g = fArr5;
            this.f4994h = iArr;
            this.f4995i = iArr2;
            this.f4996j = iArr3;
        }
    }

    /* renamed from: h */
    private boolean m6494h(int i) {
        if (mo5435c(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        sb.toString();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5438d(int i) {
        this.f5007u.removeCallbacks(this.f5008v);
        if (this.f4987a != i) {
            this.f4987a = i;
            this.f5004r.mo5460c(i);
            if (this.f4987a == 0) {
                this.f5005s = null;
            }
        }
    }

    @C0199k0
    /* renamed from: e */
    public int mo5440e() {
        return this.f5001o;
    }

    /* renamed from: e */
    public boolean mo5442e(int i, int i2) {
        if (this.f5006t) {
            return m6490c(i, i2, (int) this.f4998l.getXVelocity(this.f4989c), (int) this.f4998l.getYVelocity(this.f4989c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    public void mo5419a(float f) {
        this.f5000n = f;
    }

    /* renamed from: a */
    public void mo5422a(@C0193h0 View view, int i) {
        if (view.getParent() == this.f5007u) {
            this.f5005s = view;
            this.f4989c = i;
            this.f5004r.mo5453a(view, i);
            mo5438d(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f5007u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public boolean mo5433b(@C0193h0 View view, int i, int i2) {
        this.f5005s = view;
        this.f4989c = -1;
        boolean c = m6490c(i, i2, 0, 0);
        if (!c && this.f4987a == 0 && this.f5005s != null) {
            this.f5005s = null;
        }
        return c;
    }

    /* renamed from: d */
    public boolean mo5439d(int i, int i2) {
        return mo5435c(i2) && (i & this.f4994h[i2]) != 0;
    }

    /* renamed from: c */
    private void m6489c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m6494h(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f4992f[pointerId] = x;
                this.f4993g[pointerId] = y;
            }
        }
    }

    /* renamed from: b */
    private int m6486b(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f5007u.getWidth();
        float f = (float) (width / 2);
        float b = f + (m6485b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: f */
    private int m6491f(int i, int i2) {
        int i3 = i < this.f5007u.getLeft() + this.f5001o ? 1 : 0;
        if (i2 < this.f5007u.getTop() + this.f5001o) {
            i3 |= 4;
        }
        if (i > this.f5007u.getRight() - this.f5001o) {
            i3 |= 2;
        }
        return i2 > this.f5007u.getBottom() - this.f5001o ? i3 | 8 : i3;
    }

    /* renamed from: a */
    public void mo5418a() {
        mo5429b();
        if (this.f4987a == 2) {
            int currX = this.f5003q.getCurrX();
            int currY = this.f5003q.getCurrY();
            this.f5003q.abortAnimation();
            int currX2 = this.f5003q.getCurrX();
            int currY2 = this.f5003q.getCurrY();
            this.f5004r.mo5454a(this.f5005s, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo5438d(0);
    }

    /* renamed from: c */
    public boolean mo5435c(int i) {
        return ((1 << i) & this.f4997k) != 0;
    }

    /* renamed from: c */
    public boolean mo5436c(int i, int i2) {
        return mo5425a(this.f5005s, i, i2);
    }

    /* renamed from: b */
    private float m6485b(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    private int m6478a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m6477a(i3, (int) this.f5000n, (int) this.f4999m);
        int a2 = m6477a(i4, (int) this.f5000n, (int) this.f4999m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m6486b(i, a, this.f5004r.mo5449a(view))) * f5) + (((float) m6486b(i2, a2, this.f5004r.mo5455b(view))) * f6));
    }

    /* renamed from: b */
    private void m6487b(float f, float f2, int i) {
        m6493g(i);
        float[] fArr = this.f4990d;
        this.f4992f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f4991e;
        this.f4993g[i] = f2;
        fArr2[i] = f2;
        this.f4994h[i] = m6491f((int) f, (int) f2);
        this.f4997k |= 1 << i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5432b(View view, int i) {
        if (view == this.f5005s && this.f4989c == i) {
            return true;
        }
        if (view == null || !this.f5004r.mo5459b(view, i)) {
            return false;
        }
        this.f4989c = i;
        mo5422a(view, i);
        return true;
    }

    /* renamed from: a */
    private int m6477a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private float m6476a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5431b(@androidx.annotation.C0193h0 android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo5429b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f4998l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f4998l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f4998l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m6492f(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m6487b(r7, r1, r2)
            int r3 = r0.f4987a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f4994h
            r1 = r1[r2]
            int r3 = r0.f5002p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            androidx.customview.a.c$c r4 = r0.f5004r
            r1 = r1 & r3
            r4.mo5457b(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo5428b(r3, r1)
            android.view.View r3 = r0.f5005s
            if (r1 != r3) goto L_0x0031
            r0.mo5432b(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f4990d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f4991e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m6494h(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f4990d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f4991e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo5428b(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m6484a(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            androidx.customview.a.c$c r14 = r0.f5004r
            int r12 = r14.mo5450a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            androidx.customview.a.c$c r5 = r0.f5004r
            int r5 = r5.mo5456b(r7, r15, r14)
            androidx.customview.a.c$c r14 = r0.f5004r
            int r14 = r14.mo5449a(r7)
            androidx.customview.a.c$c r15 = r0.f5004r
            int r15 = r15.mo5455b(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m6482a(r9, r10, r4)
            int r5 = r0.f4987a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo5432b(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m6489c(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo5429b()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m6487b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo5428b(r2, r3)
            android.view.View r3 = r0.f5005s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f4987a
            if (r3 != r4) goto L_0x0125
            r0.mo5432b(r2, r1)
        L_0x0125:
            int[] r2 = r0.f4994h
            r2 = r2[r1]
            int r3 = r0.f5002p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            androidx.customview.a.c$c r4 = r0.f5004r
            r2 = r2 & r3
            r4.mo5457b(r2, r1)
        L_0x0135:
            int r1 = r0.f4987a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.p039a.C1138c.mo5431b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo5420a(int i, int i2, int i3, int i4) {
        if (this.f5006t) {
            this.f5003q.fling(this.f5005s.getLeft(), this.f5005s.getTop(), (int) this.f4998l.getXVelocity(this.f4989c), (int) this.f4998l.getYVelocity(this.f4989c), i, i3, i2, i4);
            mo5438d(2);
            return;
        }
        throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    public boolean mo5427a(boolean z) {
        if (this.f4987a == 2) {
            boolean computeScrollOffset = this.f5003q.computeScrollOffset();
            int currX = this.f5003q.getCurrX();
            int currY = this.f5003q.getCurrY();
            int left = currX - this.f5005s.getLeft();
            int top = currY - this.f5005s.getTop();
            if (left != 0) {
                C0962e0.m5508g(this.f5005s, left);
            }
            if (top != 0) {
                C0962e0.m5513h(this.f5005s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f5004r.mo5454a(this.f5005s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f5003q.getFinalX() && currY == this.f5003q.getFinalY()) {
                this.f5003q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f5007u.post(this.f5008v);
                } else {
                    mo5438d(0);
                }
            }
        }
        if (this.f4987a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m6481a(float f, float f2) {
        this.f5006t = true;
        this.f5004r.mo5452a(this.f5005s, f, f2);
        this.f5006t = false;
        if (this.f4987a == 1) {
            mo5438d(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5426a(@C0193h0 View view, boolean z, int i, int i2, int i3, int i4) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight()) {
                    int i6 = i4 + scrollY;
                    if (i6 >= childAt.getTop() && i6 < childAt.getBottom()) {
                        if (mo5426a(childAt, true, i, i2, i5 - childAt.getLeft(), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || (!view.canScrollHorizontally(-i) && !view.canScrollVertically(-i2))) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public void mo5421a(@C0193h0 MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo5429b();
        }
        if (this.f4998l == null) {
            this.f4998l = VelocityTracker.obtain();
        }
        this.f4998l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View b = mo5428b((int) x, (int) y);
            m6487b(x, y, pointerId);
            mo5432b(b, pointerId);
            int i3 = this.f4994h[pointerId];
            int i4 = this.f5002p;
            if ((i3 & i4) != 0) {
                this.f5004r.mo5457b(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f4987a == 1) {
                m6496j();
            }
            mo5429b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f4987a == 1) {
                    m6481a(0.0f, 0.0f);
                }
                mo5429b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m6487b(x2, y2, pointerId2);
                if (this.f4987a == 0) {
                    mo5432b(mo5428b((int) x2, (int) y2), pointerId2);
                    int i5 = this.f4994h[pointerId2];
                    int i6 = this.f5002p;
                    if ((i5 & i6) != 0) {
                        this.f5004r.mo5457b(i5 & i6, pointerId2);
                    }
                } else if (mo5436c((int) x2, (int) y2)) {
                    mo5432b(this.f5005s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f4987a == 1 && pointerId3 == this.f4989c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f4989c) {
                            View b2 = mo5428b((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f5005s;
                            if (b2 == view && mo5432b(view, pointerId4)) {
                                i = this.f4989c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m6496j();
                    }
                }
                m6492f(pointerId3);
            }
        } else if (this.f4987a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m6494h(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f4990d[pointerId5];
                    float f2 = y3 - this.f4991e[pointerId5];
                    m6482a(f, f2, pointerId5);
                    if (this.f4987a != 1) {
                        View b3 = mo5428b((int) x3, (int) y3);
                        if (m6484a(b3, f, f2) && mo5432b(b3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m6489c(motionEvent);
        } else if (m6494h(this.f4989c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4989c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f4992f;
            int i7 = this.f4989c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f4993g[i7]);
            m6488b(this.f5005s.getLeft() + i8, this.f5005s.getTop() + i9, i8, i9);
            m6489c(motionEvent);
        }
    }

    /* renamed from: b */
    public boolean mo5430b(int i) {
        int length = this.f4994h.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo5439d(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m6488b(int i, int i2, int i3, int i4) {
        int left = this.f5005s.getLeft();
        int top = this.f5005s.getTop();
        if (i3 != 0) {
            i = this.f5004r.mo5450a(this.f5005s, i, i3);
            C0962e0.m5508g(this.f5005s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f5004r.mo5456b(this.f5005s, i2, i4);
            C0962e0.m5513h(this.f5005s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f5004r.mo5454a(this.f5005s, i5, i6, i5 - left, i6 - top);
        }
    }

    @C0195i0
    /* renamed from: b */
    public View mo5428b(int i, int i2) {
        for (int childCount = this.f5007u.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f5007u.getChildAt(this.f5004r.mo5448a(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m6482a(float f, float f2, int i) {
        int i2 = 1;
        if (!m6483a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m6483a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m6483a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m6483a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f4995i;
            iArr[i] = iArr[i] | i2;
            this.f5004r.mo5451a(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m6483a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f4994h[i] & i2) != i2 || (this.f5002p & i2) == 0 || (this.f4996j[i] & i2) == i2 || (this.f4995i[i] & i2) == i2)) {
            int i3 = this.f4988b;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f5004r.mo5458b(i2)) {
                    int[] iArr = this.f4996j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f4995i[i] & i2) == 0 && abs > ((float) this.f4988b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m6484a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f5004r.mo5449a(view) > 0;
        boolean z3 = this.f5004r.mo5455b(view) > 0;
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f4988b;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f4988b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f4988b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public boolean mo5423a(int i) {
        int length = this.f4990d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo5424a(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo5424a(int i, int i2) {
        boolean z = false;
        if (!mo5435c(i2)) {
            return false;
        }
        boolean z2 = (i & 1) == 1;
        boolean z3 = (i & 2) == 2;
        float f = this.f4992f[i2] - this.f4990d[i2];
        float f2 = this.f4993g[i2] - this.f4991e[i2];
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i3 = this.f4988b;
            if (f3 > ((float) (i3 * i3))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f4988b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f4988b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    public boolean mo5425a(@C0195i0 View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }
}
