package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0391q;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.d0 */
/* compiled from: ForwardingListener */
public abstract class C0486d0 implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: N */
    private final int f1928N;

    /* renamed from: O */
    final View f1929O;

    /* renamed from: P */
    private Runnable f1930P;

    /* renamed from: Q */
    private Runnable f1931Q;

    /* renamed from: R */
    private boolean f1932R;

    /* renamed from: S */
    private int f1933S;

    /* renamed from: T */
    private final int[] f1934T = new int[2];

    /* renamed from: a */
    private final float f1935a;

    /* renamed from: b */
    private final int f1936b;

    /* renamed from: androidx.appcompat.widget.d0$a */
    /* compiled from: ForwardingListener */
    private class C0487a implements Runnable {
        C0487a() {
        }

        public void run() {
            ViewParent parent = C0486d0.this.f1929O.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    /* compiled from: ForwardingListener */
    private class C0488b implements Runnable {
        C0488b() {
        }

        public void run() {
            C0486d0.this.mo2520d();
        }
    }

    public C0486d0(View view) {
        this.f1929O = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1935a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1936b = ViewConfiguration.getTapTimeout();
        this.f1928N = (this.f1936b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m2642a(MotionEvent motionEvent) {
        View view = this.f1929O;
        C0391q a = mo1408a();
        if (a != null && a.mo1515d()) {
            C0472b0 b0Var = (C0472b0) a.mo1518f();
            if (b0Var != null && b0Var.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                m2644a(view, obtainNoHistory);
                m2646b(b0Var, obtainNoHistory);
                boolean a2 = b0Var.mo2474a(obtainNoHistory, this.f1933S);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z = true;
                boolean z2 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (!a2 || !z2) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m2647e() {
        Runnable runnable = this.f1931Q;
        if (runnable != null) {
            this.f1929O.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1930P;
        if (runnable2 != null) {
            this.f1929O.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0391q mo1408a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1409b() {
        C0391q a = mo1408a();
        if (a != null && !a.mo1515d()) {
            a.mo1509b();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1967c() {
        C0391q a = mo1408a();
        if (a != null && a.mo1515d()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2520d() {
        m2647e();
        View view = this.f1929O;
        if (view.isEnabled() && !view.isLongClickable() && mo1409b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1932R = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1932R;
        if (z2) {
            z = m2642a(motionEvent) || !mo1967c();
        } else {
            z = m2645b(motionEvent) && mo1409b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1929O.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1932R = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1932R = false;
        this.f1933S = -1;
        Runnable runnable = this.f1930P;
        if (runnable != null) {
            this.f1929O.removeCallbacks(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2645b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1929O
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1933S
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1935a
            boolean r6 = m2643a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2647e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2647e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1933S = r6
            java.lang.Runnable r6 = r5.f1930P
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.d0$a r6 = new androidx.appcompat.widget.d0$a
            r6.<init>()
            r5.f1930P = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1930P
            int r1 = r5.f1936b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1931Q
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.d0$b r6 = new androidx.appcompat.widget.d0$b
            r6.<init>()
            r5.f1931Q = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1931Q
            int r1 = r5.f1928N
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0486d0.m2645b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private static boolean m2643a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m2644a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1934T;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: b */
    private boolean m2646b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1934T;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }
}
