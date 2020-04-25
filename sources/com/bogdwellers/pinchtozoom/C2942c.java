package com.bogdwellers.pinchtozoom;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.bogdwellers.pinchtozoom.p153g.C2949b;
import com.bogdwellers.pinchtozoom.p153g.C2950c;

/* renamed from: com.bogdwellers.pinchtozoom.c */
/* compiled from: ImageMatrixTouchHandler */
public class C2942c extends C2947f {

    /* renamed from: l0 */
    public static final int f10409l0 = 0;

    /* renamed from: m0 */
    public static final int f10410m0 = 1;

    /* renamed from: n0 */
    public static final int f10411n0 = 2;

    /* renamed from: o0 */
    public static final int f10412o0 = 3;

    /* renamed from: p0 */
    private static final float f10413p0 = 10.0f;

    /* renamed from: q0 */
    public static final String f10414q0 = C2942c.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C2941b f10415O;

    /* renamed from: P */
    private Matrix f10416P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public int f10417Q;

    /* renamed from: R */
    private PointF f10418R;

    /* renamed from: S */
    private PointF f10419S;

    /* renamed from: T */
    private float f10420T;

    /* renamed from: U */
    private float f10421U;

    /* renamed from: V */
    private float f10422V;

    /* renamed from: W */
    private boolean f10423W;

    /* renamed from: X */
    private boolean f10424X;

    /* renamed from: Y */
    private boolean f10425Y;

    /* renamed from: Z */
    private boolean f10426Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public long f10427a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public long f10428b0;

    /* renamed from: c0 */
    private long f10429c0;

    /* renamed from: d0 */
    private long f10430d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public float f10431e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public float f10432f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public float f10433g0;

    /* renamed from: h0 */
    private float f10434h0;

    /* renamed from: i0 */
    private boolean f10435i0;

    /* renamed from: j0 */
    private GestureDetector f10436j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public ValueAnimator f10437k0;

    /* renamed from: com.bogdwellers.pinchtozoom.c$b */
    /* compiled from: ImageMatrixTouchHandler */
    private class C2944b extends SimpleOnGestureListener {
        private C2944b() {
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            float f;
            if (C2942c.this.f10431e0 <= 0.0f || C2942c.this.mo11705f()) {
                return super.onDoubleTap(motionEvent);
            }
            float f2 = C2942c.this.f10415O.mo11722b()[0];
            float e = C2942c.this.f10415O.mo11681e();
            float g = C2942c.this.f10432f0 * e;
            C2950c cVar = new C2950c(C2942c.this.f10415O, motionEvent.getX(), motionEvent.getY());
            if (f2 > g) {
                f = e;
            } else {
                f = C2942c.this.f10431e0 * f2;
            }
            C2942c cVar2 = C2942c.this;
            cVar2.m14060a(f2, f, cVar2.f10427a0, cVar, (Interpolator) null);
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C2942c.this.f10417Q != 1 || C2942c.this.f10428b0 <= 0 || C2942c.this.mo11705f()) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            float b = (((float) C2942c.this.f10428b0) / 1000.0f) * C2942c.this.f10433g0;
            float[] b2 = C2942c.this.f10415O.mo11722b();
            float f3 = f2 * b * b2[4];
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(C2949b.f10449c, new float[]{b2[2], b2[2] + (f * b * b2[0])});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(C2949b.f10450d, new float[]{b2[5], b2[5] + f3});
            C2942c.this.f10437k0 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{ofFloat, ofFloat2});
            C2942c.this.f10437k0.setDuration(C2942c.this.f10428b0);
            C2942c.this.f10437k0.addUpdateListener(new C2949b(C2942c.this.f10415O));
            C2942c.this.f10437k0.setInterpolator(new DecelerateInterpolator());
            C2942c.this.f10437k0.start();
            return true;
        }
    }

    public C2942c(Context context) {
        this(context, new C2945d());
    }

    /* renamed from: i */
    public boolean mo11708i() {
        return this.f10424X;
    }

    /* renamed from: j */
    public boolean mo11709j() {
        return this.f10425Y;
    }

    /* renamed from: k */
    public void mo11710k() {
        this.f10435i0 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r1 != 6) goto L_0x0116;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            super.onTouch(r9, r10)
            android.view.GestureDetector r0 = r8.f10436j0
            r0.onTouchEvent(r10)
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ ClassCastException -> 0x0117 }
            android.graphics.Matrix r0 = r9.getImageMatrix()
            com.bogdwellers.pinchtozoom.b r1 = r8.f10415O
            android.widget.ImageView r1 = r1.mo11680d()
            if (r1 == r9) goto L_0x001c
            com.bogdwellers.pinchtozoom.b r1 = r8.f10415O
            r1.mo11679a(r9)
            goto L_0x002c
        L_0x001c:
            android.widget.ImageView$ScaleType r1 = r9.getScaleType()
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.MATRIX
            if (r1 == r2) goto L_0x002c
            r9.setScaleType(r2)
            com.bogdwellers.pinchtozoom.b r1 = r8.f10415O
            r1.mo11678a(r0)
        L_0x002c:
            int r1 = r10.getActionMasked()
            r2 = 1
            if (r1 == 0) goto L_0x0113
            if (r1 == r2) goto L_0x0113
            r3 = 5
            r4 = 2
            if (r1 == r4) goto L_0x0040
            if (r1 == r3) goto L_0x0113
            r9 = 6
            if (r1 == r9) goto L_0x0113
            goto L_0x0116
        L_0x0040:
            boolean r1 = r8.f10435i0
            r5 = 0
            if (r1 == 0) goto L_0x004a
            r8.m14061a(r10, r0)
            r8.f10435i0 = r5
        L_0x004a:
            android.graphics.Matrix r1 = r8.f10416P
            r0.set(r1)
            int r1 = r8.f10417Q
            if (r1 != r2) goto L_0x0082
            boolean r1 = r8.f10425Y
            if (r1 == 0) goto L_0x010f
            android.graphics.PointF r1 = r8.mo11727b(r5)
            int r5 = r8.mo11724a(r5)
            int r5 = r10.findPointerIndex(r5)
            float r6 = r10.getX(r5)
            float r7 = r1.x
            float r6 = r6 - r7
            com.bogdwellers.pinchtozoom.b r7 = r8.f10415O
            float r4 = r7.mo11721b(r4, r6)
            float r10 = r10.getY(r5)
            float r1 = r1.y
            float r10 = r10 - r1
            com.bogdwellers.pinchtozoom.b r1 = r8.f10415O
            float r10 = r1.mo11721b(r3, r10)
            r0.postTranslate(r4, r10)
            goto L_0x010f
        L_0x0082:
            if (r1 != r4) goto L_0x010f
            android.graphics.PointF r1 = r8.f10419S
            int r3 = r8.mo11724a(r5)
            int r4 = r8.mo11724a(r2)
            com.bogdwellers.pinchtozoom.C2947f.m14114a(r1, r10, r3, r4)
            boolean r1 = r8.f10423W
            if (r1 == 0) goto L_0x00b9
            float r1 = r8.f10421U
            int r3 = r8.mo11724a(r5)
            int r4 = r8.mo11724a(r2)
            android.graphics.PointF r6 = r8.mo11727b(r5)
            android.graphics.PointF r7 = r8.mo11727b(r2)
            boolean r6 = com.bogdwellers.pinchtozoom.C2947f.m14115a(r6, r7)
            float r3 = com.bogdwellers.pinchtozoom.C2947f.m14111a(r10, r3, r4, r6)
            float r1 = r1 - r3
            android.graphics.PointF r3 = r8.f10419S
            float r4 = r3.x
            float r3 = r3.y
            r0.postRotate(r1, r4, r3)
        L_0x00b9:
            boolean r1 = r8.f10424X
            if (r1 == 0) goto L_0x00f1
            int r1 = r8.mo11724a(r5)
            int r3 = r8.mo11724a(r2)
            float r1 = com.bogdwellers.pinchtozoom.C2947f.m14109a(r10, r1, r3)
            float r3 = r8.f10420T
            float r1 = r1 / r3
            com.bogdwellers.pinchtozoom.b r3 = r8.f10415O
            float r1 = r3.mo11721b(r5, r1)
            android.graphics.PointF r3 = r8.f10419S
            float r4 = r3.x
            float r3 = r3.y
            r0.postScale(r1, r1, r4, r3)
            int r1 = r10.getHistorySize()
            if (r1 <= 0) goto L_0x00f1
            int r1 = r8.mo11724a(r5)
            int r3 = r8.mo11724a(r2)
            long r4 = r8.f10430d0
            float r10 = com.bogdwellers.pinchtozoom.C2947f.m14110a(r10, r1, r3, r4)
            r8.f10422V = r10
        L_0x00f1:
            boolean r10 = r8.f10426Z
            if (r10 == 0) goto L_0x010a
            boolean r10 = r8.f10425Y
            if (r10 == 0) goto L_0x010a
            android.graphics.PointF r10 = r8.f10419S
            float r1 = r10.x
            android.graphics.PointF r3 = r8.f10418R
            float r4 = r3.x
            float r1 = r1 - r4
            float r10 = r10.y
            float r3 = r3.y
            float r10 = r10 - r3
            r0.postTranslate(r1, r10)
        L_0x010a:
            com.bogdwellers.pinchtozoom.b r10 = r8.f10415O
            r10.mo11717c()
        L_0x010f:
            r9.invalidate()
            goto L_0x0116
        L_0x0113:
            r8.m14061a(r10, r0)
        L_0x0116:
            return r2
        L_0x0117:
            r9 = move-exception
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "View must be an instance of ImageView"
            r10.<init>(r0, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bogdwellers.pinchtozoom.C2942c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C2942c(Context context, C2941b bVar) {
        this.f10415O = bVar;
        this.f10416P = new Matrix();
        this.f10417Q = 0;
        this.f10418R = new PointF();
        this.f10419S = new PointF();
        this.f10420T = 1.0f;
        this.f10421U = 0.0f;
        this.f10423W = false;
        this.f10424X = true;
        this.f10425Y = true;
        this.f10426Z = true;
        this.f10430d0 = 100;
        this.f10427a0 = 200;
        this.f10428b0 = 200;
        this.f10429c0 = 200;
        this.f10434h0 = 1.337f;
        this.f10433g0 = 0.1337f;
        this.f10431e0 = 2.5f;
        this.f10432f0 = 1.4f;
        C2944b bVar2 = new C2944b();
        this.f10436j0 = new GestureDetector(context, bVar2);
        this.f10436j0.setOnDoubleTapListener(bVar2);
    }

    /* renamed from: b */
    public void mo11694b(boolean z) {
        this.f10423W = z;
    }

    /* renamed from: c */
    public void mo11698c(boolean z) {
        this.f10424X = z;
    }

    /* renamed from: d */
    public C2941b mo11699d() {
        return this.f10415O;
    }

    /* renamed from: e */
    public int mo11703e() {
        return this.f10417Q;
    }

    /* renamed from: f */
    public boolean mo11705f() {
        ValueAnimator valueAnimator = this.f10437k0;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: g */
    public boolean mo11706g() {
        return this.f10426Z;
    }

    /* renamed from: h */
    public boolean mo11707h() {
        return this.f10423W;
    }

    /* renamed from: b */
    public void mo11693b(long j) {
        this.f10427a0 = j;
    }

    /* renamed from: c */
    public void mo11697c(long j) {
        this.f10428b0 = j;
    }

    /* renamed from: d */
    public void mo11702d(boolean z) {
        this.f10425Y = z;
    }

    /* renamed from: e */
    public void mo11704e(long j) {
        this.f10429c0 = j;
    }

    /* renamed from: a */
    public void mo11691a(boolean z) {
        this.f10426Z = z;
    }

    /* renamed from: b */
    public void mo11692b(float f) {
        this.f10432f0 = f;
    }

    /* renamed from: c */
    public void mo11696c(float f) {
        this.f10433g0 = f;
    }

    /* renamed from: d */
    public void mo11701d(long j) {
        this.f10430d0 = j;
    }

    /* renamed from: a */
    public void mo11685a(float f) {
        this.f10431e0 = f;
    }

    /* renamed from: c */
    public void mo11695c() {
        if (mo11705f()) {
            this.f10437k0.cancel();
        }
    }

    /* renamed from: d */
    public void mo11700d(float f) {
        this.f10434h0 = f;
    }

    /* renamed from: a */
    private void m14061a(MotionEvent motionEvent, Matrix matrix) {
        mo11725a(motionEvent);
        this.f10416P.set(matrix);
        int a = mo11723a();
        if (a == 0) {
            this.f10417Q = 0;
            return;
        }
        if (mo11705f()) {
            this.f10437k0.cancel();
        }
        if (a == 1) {
            if (this.f10417Q == 2 && this.f10429c0 > 0 && !mo11705f()) {
                float pow = (float) Math.pow(Math.pow(Math.pow((double) this.f10422V, 0.001d), (double) this.f10429c0), (double) this.f10434h0);
                long j = this.f10429c0;
                PointF pointF = this.f10419S;
                mo11688a(pow, j, pointF.x, pointF.y, (Interpolator) new DecelerateInterpolator());
            }
            this.f10417Q = 1;
        } else if (a > 1) {
            this.f10417Q = 2;
            this.f10420T = C2947f.m14109a(motionEvent, mo11724a(0), mo11724a(1));
            this.f10422V = 0.0f;
            if (this.f10420T > 10.0f) {
                C2947f.m14114a(this.f10418R, motionEvent, mo11724a(0), mo11724a(1));
                this.f10421U = C2947f.m14111a(motionEvent, mo11724a(0), mo11724a(1), C2947f.m14115a(mo11727b(0), mo11727b(1)));
            }
        }
    }

    /* renamed from: a */
    public void mo11686a(float f, long j) {
        float f2 = this.f10415O.mo11722b()[0];
        m14060a(f2, f2 * f, j, new C2950c(this.f10415O), (Interpolator) null);
    }

    /* renamed from: a */
    public void mo11687a(float f, long j, float f2, float f3) {
        mo11687a(f, j, f2, f3);
    }

    /* renamed from: a */
    public void mo11688a(float f, long j, float f2, float f3, Interpolator interpolator) {
        float f4 = this.f10415O.mo11722b()[0];
        m14060a(f4, f4 * f, j, new C2950c(this.f10415O, f2, f3), interpolator);
    }

    /* renamed from: a */
    public void mo11689a(long j) {
        m14060a(this.f10415O.mo11722b()[0], this.f10415O.mo11681e(), j, new C2950c(this.f10415O), (Interpolator) null);
    }

    /* renamed from: a */
    public void mo11690a(long j, float f, float f2) {
        m14060a(this.f10415O.mo11722b()[0], this.f10415O.mo11681e(), j, new C2950c(this.f10415O, f, f2), (Interpolator) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14060a(float f, float f2, long j, C2950c cVar, Interpolator interpolator) {
        if (!mo11705f()) {
            this.f10437k0 = ValueAnimator.ofFloat(new float[]{f, f2});
            this.f10437k0.setDuration(j);
            this.f10437k0.addUpdateListener(cVar);
            if (interpolator != null) {
                this.f10437k0.setInterpolator(interpolator);
            }
            this.f10437k0.start();
            return;
        }
        throw new IllegalStateException("An animation is currently running; Check isAnimating() first!");
    }
}
