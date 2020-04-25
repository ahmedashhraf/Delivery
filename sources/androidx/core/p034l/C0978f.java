package androidx.core.p034l;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: androidx.core.l.f */
/* compiled from: GestureDetectorCompat */
public final class C0978f {

    /* renamed from: a */
    private final C0979a f4361a;

    /* renamed from: androidx.core.l.f$a */
    /* compiled from: GestureDetectorCompat */
    interface C0979a {
        /* renamed from: a */
        void mo4818a(OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        void mo4819a(boolean z);

        /* renamed from: a */
        boolean mo4820a();

        boolean onTouchEvent(MotionEvent motionEvent);
    }

    /* renamed from: androidx.core.l.f$b */
    /* compiled from: GestureDetectorCompat */
    static class C0980b implements C0979a {

        /* renamed from: A */
        private static final int f4362A = 3;

        /* renamed from: v */
        private static final int f4363v = ViewConfiguration.getLongPressTimeout();

        /* renamed from: w */
        private static final int f4364w = ViewConfiguration.getTapTimeout();

        /* renamed from: x */
        private static final int f4365x = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: y */
        private static final int f4366y = 1;

        /* renamed from: z */
        private static final int f4367z = 2;

        /* renamed from: a */
        private int f4368a;

        /* renamed from: b */
        private int f4369b;

        /* renamed from: c */
        private int f4370c;

        /* renamed from: d */
        private int f4371d;

        /* renamed from: e */
        private final Handler f4372e;

        /* renamed from: f */
        final OnGestureListener f4373f;

        /* renamed from: g */
        OnDoubleTapListener f4374g;

        /* renamed from: h */
        boolean f4375h;

        /* renamed from: i */
        boolean f4376i;

        /* renamed from: j */
        private boolean f4377j;

        /* renamed from: k */
        private boolean f4378k;

        /* renamed from: l */
        private boolean f4379l;

        /* renamed from: m */
        MotionEvent f4380m;

        /* renamed from: n */
        private MotionEvent f4381n;

        /* renamed from: o */
        private boolean f4382o;

        /* renamed from: p */
        private float f4383p;

        /* renamed from: q */
        private float f4384q;

        /* renamed from: r */
        private float f4385r;

        /* renamed from: s */
        private float f4386s;

        /* renamed from: t */
        private boolean f4387t;

        /* renamed from: u */
        private VelocityTracker f4388u;

        /* renamed from: androidx.core.l.f$b$a */
        /* compiled from: GestureDetectorCompat */
        private class C0981a extends Handler {
            C0981a() {
            }

            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    C0980b bVar = C0980b.this;
                    bVar.f4373f.onShowPress(bVar.f4380m);
                } else if (i == 2) {
                    C0980b.this.mo4822b();
                } else if (i == 3) {
                    C0980b bVar2 = C0980b.this;
                    OnDoubleTapListener onDoubleTapListener = bVar2.f4374g;
                    if (onDoubleTapListener == null) {
                        return;
                    }
                    if (!bVar2.f4375h) {
                        onDoubleTapListener.onSingleTapConfirmed(bVar2.f4380m);
                    } else {
                        bVar2.f4376i = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown message ");
                    sb.append(message);
                    throw new RuntimeException(sb.toString());
                }
            }

            C0981a(Handler handler) {
                super(handler.getLooper());
            }
        }

        C0980b(Context context, OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f4372e = new C0981a(handler);
            } else {
                this.f4372e = new C0981a();
            }
            this.f4373f = onGestureListener;
            if (onGestureListener instanceof OnDoubleTapListener) {
                mo4818a((OnDoubleTapListener) onGestureListener);
            }
            m5618a(context);
        }

        /* renamed from: a */
        private void m5618a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f4373f != null) {
                this.f4387t = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f4370c = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f4371d = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f4368a = scaledTouchSlop * scaledTouchSlop;
                this.f4369b = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } else {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            }
        }

        /* renamed from: c */
        private void m5620c() {
            this.f4372e.removeMessages(1);
            this.f4372e.removeMessages(2);
            this.f4372e.removeMessages(3);
            this.f4388u.recycle();
            this.f4388u = null;
            this.f4382o = false;
            this.f4375h = false;
            this.f4378k = false;
            this.f4379l = false;
            this.f4376i = false;
            if (this.f4377j) {
                this.f4377j = false;
            }
        }

        /* renamed from: d */
        private void m5621d() {
            this.f4372e.removeMessages(1);
            this.f4372e.removeMessages(2);
            this.f4372e.removeMessages(3);
            this.f4382o = false;
            this.f4378k = false;
            this.f4379l = false;
            this.f4376i = false;
            if (this.f4377j) {
                this.f4377j = false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4822b() {
            this.f4372e.removeMessages(3);
            this.f4376i = false;
            this.f4377j = true;
            this.f4373f.onLongPress(this.f4380m);
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x0208  */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x021f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r13) {
            /*
                r12 = this;
                int r0 = r13.getAction()
                android.view.VelocityTracker r1 = r12.f4388u
                if (r1 != 0) goto L_0x000e
                android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
                r12.f4388u = r1
            L_0x000e:
                android.view.VelocityTracker r1 = r12.f4388u
                r1.addMovement(r13)
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 6
                r2 = 1
                r3 = 0
                if (r0 != r1) goto L_0x001c
                r4 = 1
                goto L_0x001d
            L_0x001c:
                r4 = 0
            L_0x001d:
                if (r4 == 0) goto L_0x0024
                int r5 = r13.getActionIndex()
                goto L_0x0025
            L_0x0024:
                r5 = -1
            L_0x0025:
                int r6 = r13.getPointerCount()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x002d:
                if (r8 >= r6) goto L_0x003f
                if (r5 != r8) goto L_0x0032
                goto L_0x003c
            L_0x0032:
                float r11 = r13.getX(r8)
                float r9 = r9 + r11
                float r11 = r13.getY(r8)
                float r10 = r10 + r11
            L_0x003c:
                int r8 = r8 + 1
                goto L_0x002d
            L_0x003f:
                if (r4 == 0) goto L_0x0044
                int r4 = r6 + -1
                goto L_0x0045
            L_0x0044:
                r4 = r6
            L_0x0045:
                float r4 = (float) r4
                float r9 = r9 / r4
                float r10 = r10 / r4
                r4 = 2
                r5 = 3
                if (r0 == 0) goto L_0x01bf
                r8 = 1000(0x3e8, float:1.401E-42)
                if (r0 == r2) goto L_0x0131
                if (r0 == r4) goto L_0x00ba
                if (r0 == r5) goto L_0x00b5
                r2 = 5
                if (r0 == r2) goto L_0x00a8
                if (r0 == r1) goto L_0x005b
                goto L_0x024e
            L_0x005b:
                r12.f4383p = r9
                r12.f4385r = r9
                r12.f4384q = r10
                r12.f4386s = r10
                android.view.VelocityTracker r0 = r12.f4388u
                int r1 = r12.f4371d
                float r1 = (float) r1
                r0.computeCurrentVelocity(r8, r1)
                int r0 = r13.getActionIndex()
                int r1 = r13.getPointerId(r0)
                android.view.VelocityTracker r2 = r12.f4388u
                float r2 = r2.getXVelocity(r1)
                android.view.VelocityTracker r4 = r12.f4388u
                float r1 = r4.getYVelocity(r1)
                r4 = 0
            L_0x0080:
                if (r4 >= r6) goto L_0x024e
                if (r4 != r0) goto L_0x0085
                goto L_0x00a5
            L_0x0085:
                int r5 = r13.getPointerId(r4)
                android.view.VelocityTracker r8 = r12.f4388u
                float r8 = r8.getXVelocity(r5)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r12.f4388u
                float r5 = r9.getYVelocity(r5)
                float r5 = r5 * r1
                float r8 = r8 + r5
                int r5 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r5 >= 0) goto L_0x00a5
                android.view.VelocityTracker r13 = r12.f4388u
                r13.clear()
                goto L_0x024e
            L_0x00a5:
                int r4 = r4 + 1
                goto L_0x0080
            L_0x00a8:
                r12.f4383p = r9
                r12.f4385r = r9
                r12.f4384q = r10
                r12.f4386s = r10
                r12.m5621d()
                goto L_0x024e
            L_0x00b5:
                r12.m5620c()
                goto L_0x024e
            L_0x00ba:
                boolean r0 = r12.f4377j
                if (r0 == 0) goto L_0x00c0
                goto L_0x024e
            L_0x00c0:
                float r0 = r12.f4383p
                float r0 = r0 - r9
                float r1 = r12.f4384q
                float r1 = r1 - r10
                boolean r6 = r12.f4382o
                if (r6 == 0) goto L_0x00d3
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f4374g
                boolean r13 = r0.onDoubleTapEvent(r13)
                r3 = r3 | r13
                goto L_0x024e
            L_0x00d3:
                boolean r6 = r12.f4378k
                if (r6 == 0) goto L_0x0111
                float r6 = r12.f4385r
                float r6 = r9 - r6
                int r6 = (int) r6
                float r7 = r12.f4386s
                float r7 = r10 - r7
                int r7 = (int) r7
                int r6 = r6 * r6
                int r7 = r7 * r7
                int r6 = r6 + r7
                int r7 = r12.f4368a
                if (r6 <= r7) goto L_0x0108
                android.view.GestureDetector$OnGestureListener r7 = r12.f4373f
                android.view.MotionEvent r8 = r12.f4380m
                boolean r13 = r7.onScroll(r8, r13, r0, r1)
                r12.f4383p = r9
                r12.f4384q = r10
                r12.f4378k = r3
                android.os.Handler r0 = r12.f4372e
                r0.removeMessages(r5)
                android.os.Handler r0 = r12.f4372e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f4372e
                r0.removeMessages(r4)
                goto L_0x0109
            L_0x0108:
                r13 = 0
            L_0x0109:
                int r0 = r12.f4368a
                if (r6 <= r0) goto L_0x01bc
                r12.f4379l = r3
                goto L_0x01bc
            L_0x0111:
                float r2 = java.lang.Math.abs(r0)
                r4 = 1065353216(0x3f800000, float:1.0)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 >= 0) goto L_0x0123
                float r2 = java.lang.Math.abs(r1)
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x024e
            L_0x0123:
                android.view.GestureDetector$OnGestureListener r2 = r12.f4373f
                android.view.MotionEvent r3 = r12.f4380m
                boolean r3 = r2.onScroll(r3, r13, r0, r1)
                r12.f4383p = r9
                r12.f4384q = r10
                goto L_0x024e
            L_0x0131:
                r12.f4375h = r3
                android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r13)
                boolean r1 = r12.f4382o
                if (r1 == 0) goto L_0x0143
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f4374g
                boolean r13 = r1.onDoubleTapEvent(r13)
                r13 = r13 | r3
                goto L_0x019b
            L_0x0143:
                boolean r1 = r12.f4377j
                if (r1 == 0) goto L_0x014f
                android.os.Handler r13 = r12.f4372e
                r13.removeMessages(r5)
                r12.f4377j = r3
                goto L_0x0191
            L_0x014f:
                boolean r1 = r12.f4378k
                if (r1 == 0) goto L_0x0166
                android.view.GestureDetector$OnGestureListener r1 = r12.f4373f
                boolean r1 = r1.onSingleTapUp(r13)
                boolean r5 = r12.f4376i
                if (r5 == 0) goto L_0x0164
                android.view.GestureDetector$OnDoubleTapListener r5 = r12.f4374g
                if (r5 == 0) goto L_0x0164
                r5.onSingleTapConfirmed(r13)
            L_0x0164:
                r13 = r1
                goto L_0x019b
            L_0x0166:
                android.view.VelocityTracker r1 = r12.f4388u
                int r5 = r13.getPointerId(r3)
                int r6 = r12.f4371d
                float r6 = (float) r6
                r1.computeCurrentVelocity(r8, r6)
                float r6 = r1.getYVelocity(r5)
                float r1 = r1.getXVelocity(r5)
                float r5 = java.lang.Math.abs(r6)
                int r7 = r12.f4370c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 > 0) goto L_0x0193
                float r5 = java.lang.Math.abs(r1)
                int r7 = r12.f4370c
                float r7 = (float) r7
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 <= 0) goto L_0x0191
                goto L_0x0193
            L_0x0191:
                r13 = 0
                goto L_0x019b
            L_0x0193:
                android.view.GestureDetector$OnGestureListener r5 = r12.f4373f
                android.view.MotionEvent r7 = r12.f4380m
                boolean r13 = r5.onFling(r7, r13, r1, r6)
            L_0x019b:
                android.view.MotionEvent r1 = r12.f4381n
                if (r1 == 0) goto L_0x01a2
                r1.recycle()
            L_0x01a2:
                r12.f4381n = r0
                android.view.VelocityTracker r0 = r12.f4388u
                if (r0 == 0) goto L_0x01ae
                r0.recycle()
                r0 = 0
                r12.f4388u = r0
            L_0x01ae:
                r12.f4382o = r3
                r12.f4376i = r3
                android.os.Handler r0 = r12.f4372e
                r0.removeMessages(r2)
                android.os.Handler r0 = r12.f4372e
                r0.removeMessages(r4)
            L_0x01bc:
                r3 = r13
                goto L_0x024e
            L_0x01bf:
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f4374g
                if (r0 == 0) goto L_0x01fb
                android.os.Handler r0 = r12.f4372e
                boolean r0 = r0.hasMessages(r5)
                if (r0 == 0) goto L_0x01d0
                android.os.Handler r1 = r12.f4372e
                r1.removeMessages(r5)
            L_0x01d0:
                android.view.MotionEvent r1 = r12.f4380m
                if (r1 == 0) goto L_0x01f3
                android.view.MotionEvent r6 = r12.f4381n
                if (r6 == 0) goto L_0x01f3
                if (r0 == 0) goto L_0x01f3
                boolean r0 = r12.m5619a(r1, r6, r13)
                if (r0 == 0) goto L_0x01f3
                r12.f4382o = r2
                android.view.GestureDetector$OnDoubleTapListener r0 = r12.f4374g
                android.view.MotionEvent r1 = r12.f4380m
                boolean r0 = r0.onDoubleTap(r1)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r1 = r12.f4374g
                boolean r1 = r1.onDoubleTapEvent(r13)
                r0 = r0 | r1
                goto L_0x01fc
            L_0x01f3:
                android.os.Handler r0 = r12.f4372e
                int r1 = f4365x
                long r6 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r6)
            L_0x01fb:
                r0 = 0
            L_0x01fc:
                r12.f4383p = r9
                r12.f4385r = r9
                r12.f4384q = r10
                r12.f4386s = r10
                android.view.MotionEvent r1 = r12.f4380m
                if (r1 == 0) goto L_0x020b
                r1.recycle()
            L_0x020b:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r13)
                r12.f4380m = r1
                r12.f4378k = r2
                r12.f4379l = r2
                r12.f4375h = r2
                r12.f4377j = r3
                r12.f4376i = r3
                boolean r1 = r12.f4387t
                if (r1 == 0) goto L_0x0237
                android.os.Handler r1 = r12.f4372e
                r1.removeMessages(r4)
                android.os.Handler r1 = r12.f4372e
                android.view.MotionEvent r3 = r12.f4380m
                long r5 = r3.getDownTime()
                int r3 = f4364w
                long r7 = (long) r3
                long r5 = r5 + r7
                int r3 = f4363v
                long r7 = (long) r3
                long r5 = r5 + r7
                r1.sendEmptyMessageAtTime(r4, r5)
            L_0x0237:
                android.os.Handler r1 = r12.f4372e
                android.view.MotionEvent r3 = r12.f4380m
                long r3 = r3.getDownTime()
                int r5 = f4364w
                long r5 = (long) r5
                long r3 = r3 + r5
                r1.sendEmptyMessageAtTime(r2, r3)
                android.view.GestureDetector$OnGestureListener r1 = r12.f4373f
                boolean r13 = r1.onDown(r13)
                r3 = r0 | r13
            L_0x024e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.p034l.C0978f.C0980b.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        public void mo4818a(OnDoubleTapListener onDoubleTapListener) {
            this.f4374g = onDoubleTapListener;
        }

        /* renamed from: a */
        public void mo4819a(boolean z) {
            this.f4387t = z;
        }

        /* renamed from: a */
        public boolean mo4820a() {
            return this.f4387t;
        }

        /* renamed from: a */
        private boolean m5619a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            boolean z = false;
            if (!this.f4379l || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f4365x)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            if ((x * x) + (y * y) < this.f4369b) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: androidx.core.l.f$c */
    /* compiled from: GestureDetectorCompat */
    static class C0982c implements C0979a {

        /* renamed from: a */
        private final GestureDetector f4390a;

        C0982c(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.f4390a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public boolean mo4820a() {
            return this.f4390a.isLongpressEnabled();
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.f4390a.onTouchEvent(motionEvent);
        }

        /* renamed from: a */
        public void mo4819a(boolean z) {
            this.f4390a.setIsLongpressEnabled(z);
        }

        /* renamed from: a */
        public void mo4818a(OnDoubleTapListener onDoubleTapListener) {
            this.f4390a.setOnDoubleTapListener(onDoubleTapListener);
        }
    }

    public C0978f(Context context, OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean mo4816a() {
        return this.f4361a.mo4820a();
    }

    public C0978f(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.f4361a = new C0982c(context, onGestureListener, handler);
        } else {
            this.f4361a = new C0980b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public boolean mo4817a(MotionEvent motionEvent) {
        return this.f4361a.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public void mo4815a(boolean z) {
        this.f4361a.mo4819a(z);
    }

    /* renamed from: a */
    public void mo4814a(OnDoubleTapListener onDoubleTapListener) {
        this.f4361a.mo4818a(onDoubleTapListener);
    }
}
