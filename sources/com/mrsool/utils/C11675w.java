package com.mrsool.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.OverScroller;
import android.widget.Scroller;

/* renamed from: com.mrsool.utils.w */
/* compiled from: TouchImageView1 */
public class C11675w extends ImageView {

    /* renamed from: q0 */
    private static final String f33588q0 = "DEBUG";

    /* renamed from: r0 */
    private static final float f33589r0 = 0.75f;

    /* renamed from: s0 */
    private static final float f33590s0 = 1.25f;

    /* renamed from: N */
    private Matrix f33591N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C11684i f33592O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public float f33593P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public float f33594Q;

    /* renamed from: R */
    private float f33595R;

    /* renamed from: S */
    private float f33596S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public float[] f33597T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Context f33598U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C11679d f33599V;

    /* renamed from: W */
    private ScaleType f33600W;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public float f33601a;

    /* renamed from: a0 */
    private boolean f33602a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Matrix f33603b;

    /* renamed from: b0 */
    private boolean f33604b0;

    /* renamed from: c0 */
    private C11685j f33605c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public int f33606d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f33607e0;

    /* renamed from: f0 */
    private int f33608f0;

    /* renamed from: g0 */
    private int f33609g0;

    /* renamed from: h0 */
    private float f33610h0;

    /* renamed from: i0 */
    private float f33611i0;

    /* renamed from: j0 */
    private float f33612j0;

    /* renamed from: k0 */
    private float f33613k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public ScaleGestureDetector f33614l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public GestureDetector f33615m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public OnDoubleTapListener f33616n0 = null;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public OnTouchListener f33617o0 = null;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public C11681f f33618p0 = null;

    /* renamed from: com.mrsool.utils.w$a */
    /* compiled from: TouchImageView1 */
    static /* synthetic */ class C11676a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33619a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33619a = r0
                int[] r0 = f33619a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f33619a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f33619a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f33619a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f33619a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.C11675w.C11676a.<clinit>():void");
        }
    }

    @TargetApi(9)
    /* renamed from: com.mrsool.utils.w$b */
    /* compiled from: TouchImageView1 */
    private class C11677b {

        /* renamed from: a */
        Scroller f33620a;

        /* renamed from: b */
        OverScroller f33621b;

        /* renamed from: c */
        boolean f33622c;

        public C11677b(Context context) {
            if (VERSION.SDK_INT < 9) {
                this.f33622c = true;
                this.f33620a = new Scroller(context);
                return;
            }
            this.f33622c = false;
            this.f33621b = new OverScroller(context);
        }

        /* renamed from: a */
        public void mo40071a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f33622c) {
                this.f33620a.fling(i, i2, i3, i4, i5, i6, i7, i8);
            } else {
                this.f33621b.fling(i, i2, i3, i4, i5, i6, i7, i8);
            }
        }

        /* renamed from: b */
        public int mo40074b() {
            if (this.f33622c) {
                return this.f33620a.getCurrX();
            }
            return this.f33621b.getCurrX();
        }

        /* renamed from: c */
        public int mo40075c() {
            if (this.f33622c) {
                return this.f33620a.getCurrY();
            }
            return this.f33621b.getCurrY();
        }

        /* renamed from: d */
        public boolean mo40076d() {
            if (this.f33622c) {
                return this.f33620a.isFinished();
            }
            return this.f33621b.isFinished();
        }

        /* renamed from: a */
        public void mo40072a(boolean z) {
            if (this.f33622c) {
                this.f33620a.forceFinished(z);
            } else {
                this.f33621b.forceFinished(z);
            }
        }

        /* renamed from: a */
        public boolean mo40073a() {
            if (this.f33622c) {
                return this.f33620a.computeScrollOffset();
            }
            this.f33621b.computeScrollOffset();
            return this.f33621b.computeScrollOffset();
        }
    }

    /* renamed from: com.mrsool.utils.w$c */
    /* compiled from: TouchImageView1 */
    private class C11678c implements Runnable {

        /* renamed from: V */
        private static final float f33624V = 500.0f;

        /* renamed from: N */
        private float f33625N;

        /* renamed from: O */
        private float f33626O;

        /* renamed from: P */
        private float f33627P;

        /* renamed from: Q */
        private boolean f33628Q;

        /* renamed from: R */
        private AccelerateDecelerateInterpolator f33629R = new AccelerateDecelerateInterpolator();

        /* renamed from: S */
        private PointF f33630S;

        /* renamed from: T */
        private PointF f33631T;

        /* renamed from: a */
        private long f33633a;

        /* renamed from: b */
        private float f33634b;

        C11678c(float f, float f2, float f3, boolean z) {
            C11675w.this.setState(C11684i.ANIMATE_ZOOM);
            this.f33633a = System.currentTimeMillis();
            this.f33634b = C11675w.this.f33601a;
            this.f33625N = f;
            this.f33628Q = z;
            PointF a = C11675w.this.m52587a(f2, f3, false);
            this.f33626O = a.x;
            this.f33627P = a.y;
            this.f33630S = C11675w.this.m52600b(this.f33626O, this.f33627P);
            this.f33631T = new PointF((float) (C11675w.this.f33606d0 / 2), (float) (C11675w.this.f33607e0 / 2));
        }

        /* renamed from: a */
        private float m52638a() {
            return this.f33629R.getInterpolation(Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f33633a)) / f33624V));
        }

        /* renamed from: b */
        private void m52639b(float f) {
            PointF pointF = this.f33630S;
            float f2 = pointF.x;
            PointF pointF2 = this.f33631T;
            float f3 = f2 + ((pointF2.x - f2) * f);
            float f4 = pointF.y;
            float f5 = f4 + (f * (pointF2.y - f4));
            PointF a = C11675w.this.m52600b(this.f33626O, this.f33627P);
            C11675w.this.f33603b.postTranslate(f3 - a.x, f5 - a.y);
        }

        public void run() {
            float a = m52638a();
            C11675w.this.m52592a(m52637a(a), this.f33626O, this.f33627P, this.f33628Q);
            m52639b(a);
            C11675w.this.m52606d();
            C11675w wVar = C11675w.this;
            wVar.setImageMatrix(wVar.f33603b);
            if (C11675w.this.f33618p0 != null) {
                C11675w.this.f33618p0.mo40086b();
            }
            if (a < 1.0f) {
                C11675w.this.m52598a((Runnable) this);
            } else {
                C11675w.this.setState(C11684i.NONE);
            }
        }

        /* renamed from: a */
        private double m52637a(float f) {
            float f2 = this.f33634b;
            double d = (double) (f2 + (f * (this.f33625N - f2)));
            double q = (double) C11675w.this.f33601a;
            Double.isNaN(d);
            Double.isNaN(q);
            return d / q;
        }
    }

    /* renamed from: com.mrsool.utils.w$d */
    /* compiled from: TouchImageView1 */
    private class C11679d implements Runnable {

        /* renamed from: N */
        int f33635N;

        /* renamed from: a */
        C11677b f33637a;

        /* renamed from: b */
        int f33638b;

        C11679d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            C11675w.this.setState(C11684i.FLING);
            this.f33637a = new C11677b(C11675w.this.f33598U);
            C11675w.this.f33603b.getValues(C11675w.this.f33597T);
            int i7 = (int) C11675w.this.f33597T[2];
            int i8 = (int) C11675w.this.f33597T[5];
            if (C11675w.this.getImageWidth() > ((float) C11675w.this.f33606d0)) {
                i4 = C11675w.this.f33606d0 - ((int) C11675w.this.getImageWidth());
                i3 = 0;
            } else {
                i4 = i7;
                i3 = i4;
            }
            if (C11675w.this.getImageHeight() > ((float) C11675w.this.f33607e0)) {
                i6 = C11675w.this.f33607e0 - ((int) C11675w.this.getImageHeight());
                i5 = 0;
            } else {
                i6 = i8;
                i5 = i6;
            }
            this.f33637a.mo40071a(i7, i8, i, i2, i4, i3, i6, i5);
            this.f33638b = i7;
            this.f33635N = i8;
        }

        /* renamed from: a */
        public void mo40078a() {
            if (this.f33637a != null) {
                C11675w.this.setState(C11684i.NONE);
                this.f33637a.mo40072a(true);
            }
        }

        public void run() {
            if (C11675w.this.f33618p0 != null) {
                C11675w.this.f33618p0.mo40086b();
            }
            if (this.f33637a.mo40076d()) {
                this.f33637a = null;
                return;
            }
            if (this.f33637a.mo40073a()) {
                int b = this.f33637a.mo40074b();
                int c = this.f33637a.mo40075c();
                int i = b - this.f33638b;
                int i2 = c - this.f33635N;
                this.f33638b = b;
                this.f33635N = c;
                C11675w.this.f33603b.postTranslate((float) i, (float) i2);
                C11675w.this.m52608e();
                C11675w wVar = C11675w.this;
                wVar.setImageMatrix(wVar.f33603b);
                C11675w.this.m52598a((Runnable) this);
            }
        }
    }

    /* renamed from: com.mrsool.utils.w$e */
    /* compiled from: TouchImageView1 */
    private class C11680e extends SimpleOnGestureListener {
        private C11680e() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean onDoubleTap = C11675w.this.f33616n0 != null ? C11675w.this.f33616n0.onDoubleTap(motionEvent) : false;
            if (C11675w.this.f33592O != C11684i.NONE) {
                return onDoubleTap;
            }
            C11678c cVar = new C11678c(C11675w.this.f33601a == C11675w.this.f33593P ? C11675w.this.f33594Q : C11675w.this.f33593P, motionEvent.getX(), motionEvent.getY(), false);
            C11675w.this.m52598a((Runnable) cVar);
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (C11675w.this.f33616n0 != null) {
                return C11675w.this.f33616n0.onDoubleTapEvent(motionEvent);
            }
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C11675w.this.f33599V != null) {
                C11675w.this.f33599V.mo40078a();
            }
            C11675w wVar = C11675w.this;
            wVar.f33599V = new C11679d((int) f, (int) f2);
            C11675w wVar2 = C11675w.this;
            wVar2.m52598a((Runnable) wVar2.f33599V);
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            C11675w.this.performLongClick();
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (C11675w.this.f33616n0 != null) {
                return C11675w.this.f33616n0.onSingleTapConfirmed(motionEvent);
            }
            return C11675w.this.performClick();
        }

        /* synthetic */ C11680e(C11675w wVar, C11676a aVar) {
            this();
        }
    }

    /* renamed from: com.mrsool.utils.w$f */
    /* compiled from: TouchImageView1 */
    public interface C11681f {
        /* renamed from: a */
        void mo40085a();

        /* renamed from: b */
        void mo40086b();
    }

    /* renamed from: com.mrsool.utils.w$g */
    /* compiled from: TouchImageView1 */
    private class C11682g implements OnTouchListener {

        /* renamed from: a */
        private PointF f33640a;

        private C11682g() {
            this.f33640a = new PointF();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
            if (r1 != 6) goto L_0x00c2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
                r7 = this;
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                android.view.ScaleGestureDetector r0 = r0.f33614l0
                r0.onTouchEvent(r9)
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                android.view.GestureDetector r0 = r0.f33615m0
                r0.onTouchEvent(r9)
                android.graphics.PointF r0 = new android.graphics.PointF
                float r1 = r9.getX()
                float r2 = r9.getY()
                r0.<init>(r1, r2)
                com.mrsool.utils.w r1 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$i r1 = r1.f33592O
                com.mrsool.utils.w$i r2 = com.mrsool.utils.C11675w.C11684i.NONE
                r3 = 1
                if (r1 == r2) goto L_0x003e
                com.mrsool.utils.w r1 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$i r1 = r1.f33592O
                com.mrsool.utils.w$i r2 = com.mrsool.utils.C11675w.C11684i.DRAG
                if (r1 == r2) goto L_0x003e
                com.mrsool.utils.w r1 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$i r1 = r1.f33592O
                com.mrsool.utils.w$i r2 = com.mrsool.utils.C11675w.C11684i.FLING
                if (r1 != r2) goto L_0x00c2
            L_0x003e:
                int r1 = r9.getAction()
                if (r1 == 0) goto L_0x00a5
                if (r1 == r3) goto L_0x009d
                r2 = 2
                if (r1 == r2) goto L_0x004d
                r0 = 6
                if (r1 == r0) goto L_0x009d
                goto L_0x00c2
            L_0x004d:
                com.mrsool.utils.w r1 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$i r1 = r1.f33592O
                com.mrsool.utils.w$i r2 = com.mrsool.utils.C11675w.C11684i.DRAG
                if (r1 != r2) goto L_0x00c2
                float r1 = r0.x
                android.graphics.PointF r2 = r7.f33640a
                float r4 = r2.x
                float r1 = r1 - r4
                float r4 = r0.y
                float r2 = r2.y
                float r4 = r4 - r2
                com.mrsool.utils.w r2 = com.mrsool.utils.C11675w.this
                int r5 = r2.f33606d0
                float r5 = (float) r5
                com.mrsool.utils.w r6 = com.mrsool.utils.C11675w.this
                float r6 = r6.getImageWidth()
                float r1 = r2.m52599b(r1, r5, r6)
                com.mrsool.utils.w r2 = com.mrsool.utils.C11675w.this
                int r5 = r2.f33607e0
                float r5 = (float) r5
                com.mrsool.utils.w r6 = com.mrsool.utils.C11675w.this
                float r6 = r6.getImageHeight()
                float r2 = r2.m52599b(r4, r5, r6)
                com.mrsool.utils.w r4 = com.mrsool.utils.C11675w.this
                android.graphics.Matrix r4 = r4.f33603b
                r4.postTranslate(r1, r2)
                com.mrsool.utils.w r1 = com.mrsool.utils.C11675w.this
                r1.m52608e()
                android.graphics.PointF r1 = r7.f33640a
                float r2 = r0.x
                float r0 = r0.y
                r1.set(r2, r0)
                goto L_0x00c2
            L_0x009d:
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$i r1 = com.mrsool.utils.C11675w.C11684i.NONE
                r0.setState(r1)
                goto L_0x00c2
            L_0x00a5:
                android.graphics.PointF r1 = r7.f33640a
                r1.set(r0)
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$d r0 = r0.f33599V
                if (r0 == 0) goto L_0x00bb
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$d r0 = r0.f33599V
                r0.mo40078a()
            L_0x00bb:
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$i r1 = com.mrsool.utils.C11675w.C11684i.DRAG
                r0.setState(r1)
            L_0x00c2:
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                android.graphics.Matrix r1 = r0.f33603b
                r0.setImageMatrix(r1)
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                android.view.View$OnTouchListener r0 = r0.f33617o0
                if (r0 == 0) goto L_0x00dc
                com.mrsool.utils.w r0 = com.mrsool.utils.C11675w.this
                android.view.View$OnTouchListener r0 = r0.f33617o0
                r0.onTouch(r8, r9)
            L_0x00dc:
                com.mrsool.utils.w r8 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$f r8 = r8.f33618p0
                if (r8 == 0) goto L_0x00ed
                com.mrsool.utils.w r8 = com.mrsool.utils.C11675w.this
                com.mrsool.utils.w$f r8 = r8.f33618p0
                r8.mo40086b()
            L_0x00ed:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.utils.C11675w.C11682g.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }

        /* synthetic */ C11682g(C11675w wVar, C11676a aVar) {
            this();
        }
    }

    /* renamed from: com.mrsool.utils.w$h */
    /* compiled from: TouchImageView1 */
    private class C11683h extends SimpleOnScaleGestureListener {
        private C11683h() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C11675w.this.m52592a((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
            if (C11675w.this.f33618p0 != null) {
                C11675w.this.f33618p0.mo40086b();
                C11675w.this.f33618p0.mo40085a();
            }
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C11675w.this.setState(C11684i.ZOOM);
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            super.onScaleEnd(scaleGestureDetector);
            C11675w.this.setState(C11684i.NONE);
            float q = C11675w.this.f33601a;
            boolean z = true;
            if (C11675w.this.f33601a > C11675w.this.f33594Q) {
                q = C11675w.this.f33594Q;
            } else if (C11675w.this.f33601a < C11675w.this.f33593P) {
                q = C11675w.this.f33593P;
            } else {
                z = false;
            }
            float f = q;
            if (z) {
                C11675w wVar = C11675w.this;
                C11678c cVar = new C11678c(f, (float) (wVar.f33606d0 / 2), (float) (C11675w.this.f33607e0 / 2), true);
                C11675w.this.m52598a((Runnable) cVar);
            }
        }

        /* synthetic */ C11683h(C11675w wVar, C11676a aVar) {
            this();
        }
    }

    /* renamed from: com.mrsool.utils.w$i */
    /* compiled from: TouchImageView1 */
    private enum C11684i {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    /* renamed from: com.mrsool.utils.w$j */
    /* compiled from: TouchImageView1 */
    private class C11685j {

        /* renamed from: a */
        public float f33643a;

        /* renamed from: b */
        public float f33644b;

        /* renamed from: c */
        public float f33645c;

        /* renamed from: d */
        public ScaleType f33646d;

        public C11685j(float f, float f2, float f3, ScaleType scaleType) {
            this.f33643a = f;
            this.f33644b = f2;
            this.f33645c = f3;
            this.f33646d = scaleType;
        }
    }

    public C11675w(Context context) {
        super(context);
        m52594a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public float m52599b(float f, float f2, float f3) {
        if (f3 <= f2) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: c */
    private float m52602c(float f, float f2, float f3) {
        float f4;
        float f5;
        if (f3 <= f2) {
            f4 = f2 - f3;
            f5 = 0.0f;
        } else {
            f5 = f2 - f3;
            f4 = 0.0f;
        }
        if (f < f5) {
            return (-f) + f5;
        }
        if (f > f4) {
            return (-f) + f4;
        }
        return 0.0f;
    }

    /* access modifiers changed from: private */
    public float getImageHeight() {
        return this.f33611i0 * this.f33601a;
    }

    /* access modifiers changed from: private */
    public float getImageWidth() {
        return this.f33610h0 * this.f33601a;
    }

    /* access modifiers changed from: private */
    public void setState(C11684i iVar) {
        this.f33592O = iVar;
    }

    public boolean canScrollHorizontally(int i) {
        this.f33603b.getValues(this.f33597T);
        float f = this.f33597T[2];
        if (getImageWidth() < ((float) this.f33606d0)) {
            return false;
        }
        if (f >= -1.0f && i < 0) {
            return false;
        }
        if (Math.abs(f) + ((float) this.f33606d0) + 1.0f < getImageWidth() || i <= 0) {
            return true;
        }
        return false;
    }

    public float getCurrentZoom() {
        return this.f33601a;
    }

    public float getMaxZoom() {
        return this.f33594Q;
    }

    public float getMinZoom() {
        return this.f33593P;
    }

    public ScaleType getScaleType() {
        return this.f33600W;
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF a = m52587a((float) (this.f33606d0 / 2), (float) (this.f33607e0 / 2), true);
        a.x /= (float) intrinsicWidth;
        a.y /= (float) intrinsicHeight;
        return a;
    }

    public RectF getZoomedRect() {
        if (this.f33600W != ScaleType.FIT_XY) {
            PointF a = m52587a(0.0f, 0.0f, true);
            PointF a2 = m52587a((float) this.f33606d0, (float) this.f33607e0, true);
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            return new RectF(a.x / intrinsicWidth, a.y / intrinsicHeight, a2.x / intrinsicWidth, a2.y / intrinsicHeight);
        }
        throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m52612g();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            this.f33604b0 = true;
            this.f33602a0 = true;
            if (this.f33605c0 != null) {
                mo40043a(this.f33605c0.f33643a, this.f33605c0.f33644b, this.f33605c0.f33645c, this.f33605c0.f33646d);
                this.f33605c0 = null;
            }
        } catch (Exception unused) {
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        this.f33606d0 = m52586a(mode, size, intrinsicWidth);
        this.f33607e0 = m52586a(mode2, size2, intrinsicHeight);
        setMeasuredDimension(this.f33606d0, this.f33607e0);
        m52604c();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f33601a = bundle.getFloat("saveScale");
            this.f33597T = bundle.getFloatArray("matrix");
            this.f33591N.setValues(this.f33597T);
            this.f33613k0 = bundle.getFloat("matchViewHeight");
            this.f33612j0 = bundle.getFloat("matchViewWidth");
            this.f33609g0 = bundle.getInt("viewHeight");
            this.f33608f0 = bundle.getInt("viewWidth");
            this.f33602a0 = bundle.getBoolean("imageRendered");
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.f33601a);
        bundle.putFloat("matchViewHeight", this.f33611i0);
        bundle.putFloat("matchViewWidth", this.f33610h0);
        bundle.putInt("viewWidth", this.f33606d0);
        bundle.putInt("viewHeight", this.f33607e0);
        this.f33603b.getValues(this.f33597T);
        bundle.putFloatArray("matrix", this.f33597T);
        bundle.putBoolean("imageRendered", this.f33602a0);
        return bundle;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m52612g();
        m52604c();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m52612g();
        m52604c();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m52612g();
        m52604c();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m52612g();
        m52604c();
    }

    public void setMaxZoom(float f) {
        this.f33594Q = f;
        this.f33596S = this.f33594Q * f33590s0;
    }

    public void setMinZoom(float f) {
        this.f33593P = f;
        this.f33595R = this.f33593P * 0.75f;
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.f33616n0 = onDoubleTapListener;
    }

    public void setOnTouchImageViewListener(C11681f fVar) {
        this.f33618p0 = fVar;
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f33617o0 = onTouchListener;
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType == ScaleType.FIT_START || scaleType == ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        }
        ScaleType scaleType2 = ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.f33600W = scaleType;
        if (this.f33604b0) {
            setZoom(this);
        }
    }

    public void setZoom(float f) {
        mo40042a(f, 0.5f, 0.5f);
    }

    /* renamed from: c */
    private void m52604c() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.getIntrinsicWidth() != 0 && drawable.getIntrinsicHeight() != 0 && this.f33603b != null && this.f33591N != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = (float) intrinsicWidth;
            float f2 = ((float) this.f33606d0) / f;
            float f3 = (float) intrinsicHeight;
            float f4 = ((float) this.f33607e0) / f3;
            int i = C11676a.f33619a[this.f33600W.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f2 = Math.min(1.0f, Math.min(f2, f4));
                        f4 = f2;
                    } else if (i != 4) {
                        if (i != 5) {
                            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
                        }
                    }
                    f2 = Math.min(f2, f4);
                } else {
                    f2 = Math.max(f2, f4);
                }
                f4 = f2;
            } else {
                f2 = 1.0f;
                f4 = 1.0f;
            }
            int i2 = this.f33606d0;
            float f5 = ((float) i2) - (f2 * f);
            int i3 = this.f33607e0;
            float f6 = ((float) i3) - (f4 * f3);
            this.f33610h0 = ((float) i2) - f5;
            this.f33611i0 = ((float) i3) - f6;
            if (mo40044a() || this.f33602a0) {
                if (this.f33612j0 == 0.0f || this.f33613k0 == 0.0f) {
                    m52612g();
                }
                this.f33591N.getValues(this.f33597T);
                float[] fArr = this.f33597T;
                float f7 = this.f33610h0 / f;
                float f8 = this.f33601a;
                fArr[0] = f7 * f8;
                fArr[4] = (this.f33611i0 / f3) * f8;
                float f9 = fArr[2];
                float f10 = fArr[5];
                m52593a(2, f9, this.f33612j0 * f8, getImageWidth(), this.f33608f0, this.f33606d0, intrinsicWidth);
                m52593a(5, f10, this.f33613k0 * this.f33601a, getImageHeight(), this.f33609g0, this.f33607e0, intrinsicHeight);
                this.f33603b.setValues(this.f33597T);
            } else {
                this.f33603b.setScale(f2, f4);
                this.f33603b.postTranslate(f5 / 2.0f, f6 / 2.0f);
                this.f33601a = 1.0f;
            }
            m52608e();
            setImageMatrix(this.f33603b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m52606d() {
        m52608e();
        this.f33603b.getValues(this.f33597T);
        float imageWidth = getImageWidth();
        int i = this.f33606d0;
        if (imageWidth < ((float) i)) {
            this.f33597T[2] = (((float) i) - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        int i2 = this.f33607e0;
        if (imageHeight < ((float) i2)) {
            this.f33597T[5] = (((float) i2) - getImageHeight()) / 2.0f;
        }
        this.f33603b.setValues(this.f33597T);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m52608e() {
        this.f33603b.getValues(this.f33597T);
        float[] fArr = this.f33597T;
        float f = fArr[2];
        float f2 = fArr[5];
        float c = m52602c(f, (float) this.f33606d0, getImageWidth());
        float c2 = m52602c(f2, (float) this.f33607e0, getImageHeight());
        if (c != 0.0f || c2 != 0.0f) {
            this.f33603b.postTranslate(c, c2);
        }
    }

    /* renamed from: f */
    private void m52610f() {
        float[] fArr = new float[9];
        this.f33603b.getValues(fArr);
        StringBuilder sb = new StringBuilder();
        sb.append("Scale: ");
        sb.append(fArr[0]);
        sb.append(" TransX: ");
        sb.append(fArr[2]);
        sb.append(" TransY: ");
        sb.append(fArr[5]);
        sb.toString();
    }

    /* renamed from: g */
    private void m52612g() {
        Matrix matrix = this.f33603b;
        if (matrix != null && this.f33607e0 != 0 && this.f33606d0 != 0) {
            matrix.getValues(this.f33597T);
            this.f33591N.setValues(this.f33597T);
            this.f33613k0 = this.f33611i0;
            this.f33612j0 = this.f33610h0;
            this.f33609g0 = this.f33607e0;
            this.f33608f0 = this.f33606d0;
        }
    }

    /* renamed from: b */
    public void mo40046b() {
        this.f33601a = 1.0f;
        m52604c();
    }

    public void setZoom(C11675w wVar) {
        PointF scrollPosition = wVar.getScrollPosition();
        mo40043a(wVar.getCurrentZoom(), scrollPosition.x, scrollPosition.y, wVar.getScaleType());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public PointF m52600b(float f, float f2) {
        this.f33603b.getValues(this.f33597T);
        return new PointF(this.f33597T[2] + (getImageWidth() * (f / ((float) getDrawable().getIntrinsicWidth()))), this.f33597T[5] + (getImageHeight() * (f2 / ((float) getDrawable().getIntrinsicHeight()))));
    }

    public C11675w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m52594a(context);
    }

    /* renamed from: a */
    private void m52594a(Context context) {
        super.setClickable(true);
        this.f33598U = context;
        this.f33614l0 = new ScaleGestureDetector(context, new C11683h(this, null));
        this.f33615m0 = new GestureDetector(context, new C11680e(this, null));
        this.f33603b = new Matrix();
        this.f33591N = new Matrix();
        this.f33597T = new float[9];
        this.f33601a = 1.0f;
        if (this.f33600W == null) {
            this.f33600W = ScaleType.FIT_CENTER;
        }
        this.f33593P = 1.0f;
        this.f33594Q = 3.0f;
        this.f33595R = this.f33593P * 0.75f;
        this.f33596S = this.f33594Q * f33590s0;
        setImageMatrix(this.f33603b);
        setScaleType(ScaleType.MATRIX);
        setState(C11684i.NONE);
        this.f33604b0 = false;
        super.setOnTouchListener(new C11682g(this, null));
    }

    public C11675w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52594a(context);
    }

    /* renamed from: a */
    public boolean mo40044a() {
        return this.f33601a != 1.0f;
    }

    /* renamed from: a */
    public void mo40042a(float f, float f2, float f3) {
        mo40043a(f, f2, f3, this.f33600W);
    }

    /* renamed from: a */
    public void mo40043a(float f, float f2, float f3, ScaleType scaleType) {
        if (!this.f33604b0) {
            C11685j jVar = new C11685j(f, f2, f3, scaleType);
            this.f33605c0 = jVar;
            return;
        }
        if (scaleType != this.f33600W) {
            setScaleType(scaleType);
        }
        mo40046b();
        m52592a((double) f, (float) (this.f33606d0 / 2), (float) (this.f33607e0 / 2), true);
        this.f33603b.getValues(this.f33597T);
        this.f33597T[2] = -((f2 * getImageWidth()) - (((float) this.f33606d0) * 0.5f));
        this.f33597T[5] = -((f3 * getImageHeight()) - (((float) this.f33607e0) * 0.5f));
        this.f33603b.setValues(this.f33597T);
        m52608e();
        setImageMatrix(this.f33603b);
    }

    /* renamed from: a */
    public void mo40041a(float f, float f2) {
        mo40042a(this.f33601a, f, f2);
    }

    /* renamed from: a */
    private int m52586a(int i, int i2, int i3) {
        if (i != Integer.MIN_VALUE) {
            return i != 0 ? i2 : i3;
        }
        return Math.min(i3, i2);
    }

    /* renamed from: a */
    private void m52593a(int i, float f, float f2, float f3, int i2, int i3, int i4) {
        float f4 = (float) i3;
        if (f3 < f4) {
            float[] fArr = this.f33597T;
            fArr[i] = (f4 - (((float) i4) * fArr[0])) * 0.5f;
        } else if (f > 0.0f) {
            this.f33597T[i] = -((f3 - f4) * 0.5f);
        } else {
            this.f33597T[i] = -((((Math.abs(f) + (((float) i2) * 0.5f)) / f2) * f3) - (f4 * 0.5f));
        }
    }

    /* renamed from: a */
    public boolean mo40045a(int i) {
        return canScrollHorizontally(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52592a(double d, float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            f3 = this.f33595R;
            f4 = this.f33596S;
        } else {
            f3 = this.f33593P;
            f4 = this.f33594Q;
        }
        float f5 = this.f33601a;
        double d2 = (double) f5;
        Double.isNaN(d2);
        this.f33601a = (float) (d2 * d);
        float f6 = this.f33601a;
        if (f6 > f4) {
            this.f33601a = f4;
            d = (double) (f4 / f5);
        } else if (f6 < f3) {
            this.f33601a = f3;
            d = (double) (f3 / f5);
        }
        float f7 = (float) d;
        this.f33603b.postScale(f7, f7, f, f2);
        m52606d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public PointF m52587a(float f, float f2, boolean z) {
        this.f33603b.getValues(this.f33597T);
        float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
        float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
        float[] fArr = this.f33597T;
        float f3 = fArr[2];
        float imageWidth = ((f - f3) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f2 - fArr[5]) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, 0.0f), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, 0.0f), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    /* access modifiers changed from: private */
    @TargetApi(16)
    /* renamed from: a */
    public void m52598a(Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            postOnAnimation(runnable);
        } else {
            postDelayed(runnable, 16);
        }
    }
}
