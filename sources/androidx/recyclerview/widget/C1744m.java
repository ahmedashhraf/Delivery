package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0978f;
import androidx.recyclerview.C1614R;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1641j;
import androidx.recyclerview.widget.RecyclerView.C1644l;
import androidx.recyclerview.widget.RecyclerView.C1644l.C1646b;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1657q;
import androidx.recyclerview.widget.RecyclerView.C1659s;
import androidx.recyclerview.widget.RecyclerView.State;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.m */
/* compiled from: ItemTouchHelper */
public class C1744m extends C1650n implements C1657q {

    /* renamed from: E */
    public static final int f6753E = 1;

    /* renamed from: F */
    public static final int f6754F = 2;

    /* renamed from: G */
    public static final int f6755G = 4;

    /* renamed from: H */
    public static final int f6756H = 8;

    /* renamed from: I */
    public static final int f6757I = 16;

    /* renamed from: J */
    public static final int f6758J = 32;

    /* renamed from: K */
    public static final int f6759K = 0;

    /* renamed from: L */
    public static final int f6760L = 1;

    /* renamed from: M */
    public static final int f6761M = 2;

    /* renamed from: N */
    public static final int f6762N = 2;

    /* renamed from: O */
    public static final int f6763O = 4;

    /* renamed from: P */
    public static final int f6764P = 8;

    /* renamed from: Q */
    private static final String f6765Q = "ItemTouchHelper";

    /* renamed from: R */
    private static final boolean f6766R = false;

    /* renamed from: S */
    private static final int f6767S = -1;

    /* renamed from: T */
    static final int f6768T = 8;

    /* renamed from: U */
    private static final int f6769U = 255;

    /* renamed from: V */
    static final int f6770V = 65280;

    /* renamed from: W */
    static final int f6771W = 16711680;

    /* renamed from: X */
    private static final int f6772X = 1000;

    /* renamed from: A */
    private C1753g f6773A;

    /* renamed from: B */
    private final C1659s f6774B = new C1746b();

    /* renamed from: C */
    private Rect f6775C;

    /* renamed from: D */
    private long f6776D;

    /* renamed from: a */
    final List<View> f6777a = new ArrayList();

    /* renamed from: b */
    private final float[] f6778b = new float[2];

    /* renamed from: c */
    C1635d0 f6779c = null;

    /* renamed from: d */
    float f6780d;

    /* renamed from: e */
    float f6781e;

    /* renamed from: f */
    private float f6782f;

    /* renamed from: g */
    private float f6783g;

    /* renamed from: h */
    float f6784h;

    /* renamed from: i */
    float f6785i;

    /* renamed from: j */
    private float f6786j;

    /* renamed from: k */
    private float f6787k;

    /* renamed from: l */
    int f6788l = -1;
    @C0193h0

    /* renamed from: m */
    C1750f f6789m;

    /* renamed from: n */
    private int f6790n = 0;

    /* renamed from: o */
    int f6791o;

    /* renamed from: p */
    List<C1754h> f6792p = new ArrayList();

    /* renamed from: q */
    private int f6793q;

    /* renamed from: r */
    RecyclerView f6794r;

    /* renamed from: s */
    final Runnable f6795s = new C1745a();

    /* renamed from: t */
    VelocityTracker f6796t;

    /* renamed from: u */
    private List<C1635d0> f6797u;

    /* renamed from: v */
    private List<Integer> f6798v;

    /* renamed from: w */
    private C1641j f6799w = null;

    /* renamed from: x */
    View f6800x = null;

    /* renamed from: y */
    int f6801y = -1;

    /* renamed from: z */
    C0978f f6802z;

    /* renamed from: androidx.recyclerview.widget.m$a */
    /* compiled from: ItemTouchHelper */
    class C1745a implements Runnable {
        C1745a() {
        }

        public void run() {
            C1744m mVar = C1744m.this;
            if (mVar.f6779c != null && mVar.mo7934c()) {
                C1744m mVar2 = C1744m.this;
                C1635d0 d0Var = mVar2.f6779c;
                if (d0Var != null) {
                    mVar2.mo7923a(d0Var);
                }
                C1744m mVar3 = C1744m.this;
                mVar3.f6794r.removeCallbacks(mVar3.f6795s);
                C0962e0.m5451a((View) C1744m.this.f6794r, (Runnable) this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$b */
    /* compiled from: ItemTouchHelper */
    class C1746b implements C1659s {
        C1746b() {
        }

        /* renamed from: a */
        public void mo7528a(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent) {
            C1744m.this.f6802z.mo4817a(motionEvent);
            VelocityTracker velocityTracker = C1744m.this.f6796t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1744m.this.f6788l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C1744m.this.f6788l);
                if (findPointerIndex >= 0) {
                    C1744m.this.mo7921a(actionMasked, motionEvent, findPointerIndex);
                }
                C1744m mVar = C1744m.this;
                C1635d0 d0Var = mVar.f6779c;
                if (d0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = mVar.f6796t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == C1744m.this.f6788l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    C1744m.this.f6788l = motionEvent.getPointerId(i);
                                    C1744m mVar2 = C1744m.this;
                                    mVar2.mo7922a(motionEvent, mVar2.f6791o, actionIndex);
                                }
                            }
                        } else if (findPointerIndex >= 0) {
                            mVar.mo7922a(motionEvent, mVar.f6791o, findPointerIndex);
                            C1744m.this.mo7923a(d0Var);
                            C1744m mVar3 = C1744m.this;
                            mVar3.f6794r.removeCallbacks(mVar3.f6795s);
                            C1744m.this.f6795s.run();
                            C1744m.this.f6794r.invalidate();
                        }
                    }
                    C1744m.this.mo7924a((C1635d0) null, 0);
                    C1744m.this.f6788l = -1;
                }
            }
        }

        /* renamed from: b */
        public boolean mo7530b(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent) {
            C1744m.this.f6802z.mo4817a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C1744m.this.f6788l = motionEvent.getPointerId(0);
                C1744m.this.f6780d = motionEvent.getX();
                C1744m.this.f6781e = motionEvent.getY();
                C1744m.this.mo7930b();
                C1744m mVar = C1744m.this;
                if (mVar.f6779c == null) {
                    C1754h a = mVar.mo7920a(motionEvent);
                    if (a != null) {
                        C1744m mVar2 = C1744m.this;
                        mVar2.f6780d -= a.f6831j;
                        mVar2.f6781e -= a.f6832k;
                        mVar2.mo7925a(a.f6826e, true);
                        if (C1744m.this.f6777a.remove(a.f6826e.f6294a)) {
                            C1744m mVar3 = C1744m.this;
                            mVar3.f6789m.mo7948a(mVar3.f6794r, a.f6826e);
                        }
                        C1744m.this.mo7924a(a.f6826e, a.f6827f);
                        C1744m mVar4 = C1744m.this;
                        mVar4.mo7922a(motionEvent, mVar4.f6791o, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C1744m mVar5 = C1744m.this;
                mVar5.f6788l = -1;
                mVar5.mo7924a((C1635d0) null, 0);
            } else {
                int i = C1744m.this.f6788l;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex >= 0) {
                        C1744m.this.mo7921a(actionMasked, motionEvent, findPointerIndex);
                    }
                }
            }
            VelocityTracker velocityTracker = C1744m.this.f6796t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1744m.this.f6779c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public void mo7529a(boolean z) {
            if (z) {
                C1744m.this.mo7924a((C1635d0) null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$c */
    /* compiled from: ItemTouchHelper */
    class C1747c extends C1754h {

        /* renamed from: o */
        final /* synthetic */ int f6805o;

        /* renamed from: p */
        final /* synthetic */ C1635d0 f6806p;

        /* renamed from: q */
        final /* synthetic */ C1744m f6807q;

        C1747c(C1744m mVar, C1635d0 d0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, C1635d0 d0Var2) {
            this.f6807q = mVar;
            this.f6805o = i3;
            this.f6806p = d0Var2;
            super(d0Var, i, i2, f, f2, f3, f4);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f6833l) {
                if (this.f6805o <= 0) {
                    C1744m mVar = this.f6807q;
                    mVar.f6789m.mo7948a(mVar.f6794r, this.f6806p);
                } else {
                    this.f6807q.f6777a.add(this.f6806p.f6294a);
                    this.f6830i = true;
                    int i = this.f6805o;
                    if (i > 0) {
                        this.f6807q.mo7927a((C1754h) this, i);
                    }
                }
                C1744m mVar2 = this.f6807q;
                View view = mVar2.f6800x;
                View view2 = this.f6806p.f6294a;
                if (view == view2) {
                    mVar2.mo7932c(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$d */
    /* compiled from: ItemTouchHelper */
    class C1748d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1754h f6809a;

        /* renamed from: b */
        final /* synthetic */ int f6810b;

        C1748d(C1754h hVar, int i) {
            this.f6809a = hVar;
            this.f6810b = i;
        }

        public void run() {
            RecyclerView recyclerView = C1744m.this.f6794r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C1754h hVar = this.f6809a;
                if (!hVar.f6833l && hVar.f6826e.mo7273f() != -1) {
                    C1644l itemAnimator = C1744m.this.f6794r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo7368a((C1646b) null)) && !C1744m.this.mo7928a()) {
                        C1744m.this.f6789m.mo7956b(this.f6809a.f6826e, this.f6810b);
                    } else {
                        C1744m.this.f6794r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$e */
    /* compiled from: ItemTouchHelper */
    class C1749e implements C1641j {
        C1749e() {
        }

        /* renamed from: a */
        public int mo7357a(int i, int i2) {
            C1744m mVar = C1744m.this;
            View view = mVar.f6800x;
            if (view == null) {
                return i2;
            }
            int i3 = mVar.f6801y;
            if (i3 == -1) {
                i3 = mVar.f6794r.indexOfChild(view);
                C1744m.this.f6801y = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                i2++;
            }
            return i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$f */
    /* compiled from: ItemTouchHelper */
    public static abstract class C1750f {

        /* renamed from: b */
        public static final int f6812b = 200;

        /* renamed from: c */
        public static final int f6813c = 250;

        /* renamed from: d */
        static final int f6814d = 3158064;

        /* renamed from: e */
        private static final int f6815e = 789516;

        /* renamed from: f */
        private static final Interpolator f6816f = new C1751a();

        /* renamed from: g */
        private static final Interpolator f6817g = new C1752b();

        /* renamed from: h */
        private static final long f6818h = 2000;

        /* renamed from: a */
        private int f6819a = -1;

        /* renamed from: androidx.recyclerview.widget.m$f$a */
        /* compiled from: ItemTouchHelper */
        static class C1751a implements Interpolator {
            C1751a() {
            }

            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.m$f$b */
        /* compiled from: ItemTouchHelper */
        static class C1752b implements Interpolator {
            C1752b() {
            }

            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: b */
        public static int m9441b(int i, int i2) {
            int i3;
            int i4 = i & f6815e;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & f6815e) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: c */
        public static int m9442c(int i, int i2) {
            return i2 << (i * 8);
        }

        @C0193h0
        /* renamed from: d */
        public static C1758n m9444d() {
            return C1759o.f6839a;
        }

        /* renamed from: a */
        public float mo7938a(float f) {
            return f;
        }

        /* renamed from: a */
        public float mo7939a(@C0193h0 C1635d0 d0Var) {
            return 0.5f;
        }

        /* renamed from: a */
        public int mo7940a() {
            return 0;
        }

        /* renamed from: a */
        public int mo7941a(int i, int i2) {
            int i3;
            int i4 = i & f6814d;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (i4 ^ -1);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & f6814d) >> 2;
            }
            return i5 | i3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1635d0 mo7944a(@androidx.annotation.C0193h0 androidx.recyclerview.widget.RecyclerView.C1635d0 r15, @androidx.annotation.C0193h0 java.util.List<androidx.recyclerview.widget.RecyclerView.C1635d0> r16, int r17, int r18) {
            /*
                r14 = this;
                r0 = r15
                android.view.View r1 = r0.f6294a
                int r1 = r1.getWidth()
                int r1 = r17 + r1
                android.view.View r2 = r0.f6294a
                int r2 = r2.getHeight()
                int r2 = r18 + r2
                android.view.View r3 = r0.f6294a
                int r3 = r3.getLeft()
                int r3 = r17 - r3
                android.view.View r4 = r0.f6294a
                int r4 = r4.getTop()
                int r4 = r18 - r4
                int r5 = r16.size()
                r6 = 0
                r7 = -1
                r8 = 0
            L_0x0028:
                if (r8 >= r5) goto L_0x00be
                r9 = r16
                java.lang.Object r10 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$d0 r10 = (androidx.recyclerview.widget.RecyclerView.C1635d0) r10
                if (r3 <= 0) goto L_0x0053
                android.view.View r11 = r10.f6294a
                int r11 = r11.getRight()
                int r11 = r11 - r1
                if (r11 >= 0) goto L_0x0053
                android.view.View r12 = r10.f6294a
                int r12 = r12.getRight()
                android.view.View r13 = r0.f6294a
                int r13 = r13.getRight()
                if (r12 <= r13) goto L_0x0053
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto L_0x0053
                r6 = r10
                goto L_0x0054
            L_0x0053:
                r11 = r7
            L_0x0054:
                if (r3 >= 0) goto L_0x0076
                android.view.View r7 = r10.f6294a
                int r7 = r7.getLeft()
                int r7 = r7 - r17
                if (r7 <= 0) goto L_0x0076
                android.view.View r12 = r10.f6294a
                int r12 = r12.getLeft()
                android.view.View r13 = r0.f6294a
                int r13 = r13.getLeft()
                if (r12 >= r13) goto L_0x0076
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x0076
                r11 = r7
                r6 = r10
            L_0x0076:
                if (r4 >= 0) goto L_0x0098
                android.view.View r7 = r10.f6294a
                int r7 = r7.getTop()
                int r7 = r7 - r18
                if (r7 <= 0) goto L_0x0098
                android.view.View r12 = r10.f6294a
                int r12 = r12.getTop()
                android.view.View r13 = r0.f6294a
                int r13 = r13.getTop()
                if (r12 >= r13) goto L_0x0098
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x0098
                r11 = r7
                r6 = r10
            L_0x0098:
                if (r4 <= 0) goto L_0x00b9
                android.view.View r7 = r10.f6294a
                int r7 = r7.getBottom()
                int r7 = r7 - r2
                if (r7 >= 0) goto L_0x00b9
                android.view.View r12 = r10.f6294a
                int r12 = r12.getBottom()
                android.view.View r13 = r0.f6294a
                int r13 = r13.getBottom()
                if (r12 <= r13) goto L_0x00b9
                int r7 = java.lang.Math.abs(r7)
                if (r7 <= r11) goto L_0x00b9
                r6 = r10
                goto L_0x00ba
            L_0x00b9:
                r7 = r11
            L_0x00ba:
                int r8 = r8 + 1
                goto L_0x0028
            L_0x00be:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1744m.C1750f.mo7944a(androidx.recyclerview.widget.RecyclerView$d0, java.util.List, int, int):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* renamed from: a */
        public boolean mo7950a(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var, @C0193h0 C1635d0 d0Var2) {
            return true;
        }

        /* renamed from: b */
        public float mo7951b(float f) {
            return f;
        }

        /* renamed from: b */
        public float mo7952b(@C0193h0 C1635d0 d0Var) {
            return 0.5f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo7953b(RecyclerView recyclerView, C1635d0 d0Var) {
            return mo7941a(mo7959c(recyclerView, d0Var), C0962e0.m5566x(recyclerView));
        }

        /* renamed from: b */
        public abstract void mo7956b(@C0193h0 C1635d0 d0Var, int i);

        /* renamed from: b */
        public boolean mo7957b() {
            return true;
        }

        /* renamed from: b */
        public abstract boolean mo7958b(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var, @C0193h0 C1635d0 d0Var2);

        /* renamed from: c */
        public abstract int mo7959c(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var);

        /* renamed from: c */
        public boolean mo7960c() {
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo7962e(RecyclerView recyclerView, C1635d0 d0Var) {
            return (mo7953b(recyclerView, d0Var) & 65280) != 0;
        }

        /* renamed from: d */
        public static int m9443d(int i, int i2) {
            return m9442c(2, i) | m9442c(1, i2) | m9442c(0, i2 | i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7955b(Canvas canvas, RecyclerView recyclerView, C1635d0 d0Var, List<C1754h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C1754h> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1754h hVar = (C1754h) list2.get(i2);
                int save = canvas.save();
                mo7954b(canvas, recyclerView, hVar.f6826e, hVar.f6831j, hVar.f6832k, hVar.f6827f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                mo7954b(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1754h hVar2 = (C1754h) list2.get(i3);
                if (hVar2.f6834m && !hVar2.f6830i) {
                    list2.remove(i3);
                } else if (!hVar2.f6834m) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo7961d(RecyclerView recyclerView, C1635d0 d0Var) {
            return (mo7953b(recyclerView, d0Var) & C1744m.f6771W) != 0;
        }

        /* renamed from: b */
        public void mo7954b(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView, C1635d0 d0Var, float f, float f2, int i, boolean z) {
            C1759o.f6839a.mo7981a(canvas, recyclerView, d0Var.f6294a, f, f2, i, z);
        }

        /* renamed from: a */
        public void mo7947a(@C0195i0 C1635d0 d0Var, int i) {
            if (d0Var != null) {
                C1759o.f6839a.mo7984b(d0Var.f6294a);
            }
        }

        /* renamed from: a */
        private int m9440a(RecyclerView recyclerView) {
            if (this.f6819a == -1) {
                this.f6819a = recyclerView.getResources().getDimensionPixelSize(C1614R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f6819a;
        }

        /* renamed from: a */
        public void mo7949a(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var, int i, @C0193h0 C1635d0 d0Var2, int i2, int i3, int i4) {
            C1651o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C1757j) {
                ((C1757j) layoutManager).mo6979a(d0Var.f6294a, d0Var2.f6294a, i3, i4);
                return;
            }
            if (layoutManager.mo6983a()) {
                if (layoutManager.mo7482i(d0Var2.f6294a) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.mo7488l(d0Var2.f6294a) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.mo6987b()) {
                if (layoutManager.mo7490m(d0Var2.f6294a) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.mo7479h(d0Var2.f6294a) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7946a(Canvas canvas, RecyclerView recyclerView, C1635d0 d0Var, List<C1754h> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1754h hVar = (C1754h) list.get(i2);
                hVar.mo7972c();
                int save = canvas.save();
                mo7945a(canvas, recyclerView, hVar.f6826e, hVar.f6831j, hVar.f6832k, hVar.f6827f, false);
                canvas.restoreToCount(save);
            }
            if (d0Var != null) {
                int save2 = canvas.save();
                mo7945a(canvas, recyclerView, d0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: a */
        public void mo7948a(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var) {
            C1759o.f6839a.mo7982a(d0Var.f6294a);
        }

        /* renamed from: a */
        public void mo7945a(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var, float f, float f2, int i, boolean z) {
            C1759o.f6839a.mo7983b(canvas, recyclerView, d0Var.f6294a, f, f2, i, z);
        }

        /* renamed from: a */
        public long mo7943a(@C0193h0 RecyclerView recyclerView, int i, float f, float f2) {
            long j;
            C1644l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                j = itemAnimator.mo7380e();
            } else {
                j = itemAnimator.mo7382f();
            }
            return j;
        }

        /* renamed from: a */
        public int mo7942a(@C0193h0 RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * m9440a(recyclerView))) * f6817g.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= f6818h) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f6816f.getInterpolation(f));
            if (interpolation == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$g */
    /* compiled from: ItemTouchHelper */
    private class C1753g extends SimpleOnGestureListener {

        /* renamed from: a */
        private boolean f6820a = true;

        C1753g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7965a() {
            this.f6820a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.f6820a) {
                View b = C1744m.this.mo7929b(motionEvent);
                if (b != null) {
                    C1635d0 childViewHolder = C1744m.this.f6794r.getChildViewHolder(b);
                    if (childViewHolder != null) {
                        C1744m mVar = C1744m.this;
                        if (mVar.f6789m.mo7961d(mVar.f6794r, childViewHolder)) {
                            int pointerId = motionEvent.getPointerId(0);
                            int i = C1744m.this.f6788l;
                            if (pointerId == i) {
                                int findPointerIndex = motionEvent.findPointerIndex(i);
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                C1744m mVar2 = C1744m.this;
                                mVar2.f6780d = x;
                                mVar2.f6781e = y;
                                mVar2.f6785i = 0.0f;
                                mVar2.f6784h = 0.0f;
                                if (mVar2.f6789m.mo7960c()) {
                                    C1744m.this.mo7924a(childViewHolder, 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$h */
    /* compiled from: ItemTouchHelper */
    private static class C1754h implements AnimatorListener {

        /* renamed from: a */
        final float f6822a;

        /* renamed from: b */
        final float f6823b;

        /* renamed from: c */
        final float f6824c;

        /* renamed from: d */
        final float f6825d;

        /* renamed from: e */
        final C1635d0 f6826e;

        /* renamed from: f */
        final int f6827f;

        /* renamed from: g */
        private final ValueAnimator f6828g;

        /* renamed from: h */
        final int f6829h;

        /* renamed from: i */
        boolean f6830i;

        /* renamed from: j */
        float f6831j;

        /* renamed from: k */
        float f6832k;

        /* renamed from: l */
        boolean f6833l = false;

        /* renamed from: m */
        boolean f6834m = false;

        /* renamed from: n */
        private float f6835n;

        /* renamed from: androidx.recyclerview.widget.m$h$a */
        /* compiled from: ItemTouchHelper */
        class C1755a implements AnimatorUpdateListener {
            C1755a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1754h.this.mo7969a(valueAnimator.getAnimatedFraction());
            }
        }

        C1754h(C1635d0 d0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f6827f = i2;
            this.f6829h = i;
            this.f6826e = d0Var;
            this.f6822a = f;
            this.f6823b = f2;
            this.f6824c = f3;
            this.f6825d = f4;
            this.f6828g = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f6828g.addUpdateListener(new C1755a());
            this.f6828g.setTarget(d0Var.f6294a);
            this.f6828g.addListener(this);
            mo7969a(0.0f);
        }

        /* renamed from: a */
        public void mo7970a(long j) {
            this.f6828g.setDuration(j);
        }

        /* renamed from: b */
        public void mo7971b() {
            this.f6826e.mo7266a(false);
            this.f6828g.start();
        }

        /* renamed from: c */
        public void mo7972c() {
            float f = this.f6822a;
            float f2 = this.f6824c;
            if (f == f2) {
                this.f6831j = this.f6826e.f6294a.getTranslationX();
            } else {
                this.f6831j = f + (this.f6835n * (f2 - f));
            }
            float f3 = this.f6823b;
            float f4 = this.f6825d;
            if (f3 == f4) {
                this.f6832k = this.f6826e.f6294a.getTranslationY();
            } else {
                this.f6832k = f3 + (this.f6835n * (f4 - f3));
            }
        }

        public void onAnimationCancel(Animator animator) {
            mo7969a(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6834m) {
                this.f6826e.mo7266a(true);
            }
            this.f6834m = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        /* renamed from: a */
        public void mo7968a() {
            this.f6828g.cancel();
        }

        /* renamed from: a */
        public void mo7969a(float f) {
            this.f6835n = f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$i */
    /* compiled from: ItemTouchHelper */
    public static abstract class C1756i extends C1750f {

        /* renamed from: i */
        private int f6837i;

        /* renamed from: j */
        private int f6838j;

        public C1756i(int i, int i2) {
            this.f6837i = i2;
            this.f6838j = i;
        }

        /* renamed from: a */
        public void mo7977a(int i) {
            this.f6838j = i;
        }

        /* renamed from: b */
        public void mo7978b(int i) {
            this.f6837i = i;
        }

        /* renamed from: c */
        public int mo7959c(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var) {
            return C1750f.m9443d(mo7979f(recyclerView, d0Var), mo7980g(recyclerView, d0Var));
        }

        /* renamed from: f */
        public int mo7979f(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var) {
            return this.f6838j;
        }

        /* renamed from: g */
        public int mo7980g(@C0193h0 RecyclerView recyclerView, @C0193h0 C1635d0 d0Var) {
            return this.f6837i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.m$j */
    /* compiled from: ItemTouchHelper */
    public interface C1757j {
        /* renamed from: a */
        void mo6979a(@C0193h0 View view, @C0193h0 View view2, int i, int i2);
    }

    public C1744m(@C0193h0 C1750f fVar) {
        this.f6789m = fVar;
    }

    /* renamed from: a */
    private static boolean m9404a(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    /* renamed from: d */
    private List<C1635d0> m9408d(C1635d0 d0Var) {
        C1635d0 d0Var2 = d0Var;
        List<C1635d0> list = this.f6797u;
        if (list == null) {
            this.f6797u = new ArrayList();
            this.f6798v = new ArrayList();
        } else {
            list.clear();
            this.f6798v.clear();
        }
        int a = this.f6789m.mo7940a();
        int round = Math.round(this.f6786j + this.f6784h) - a;
        int round2 = Math.round(this.f6787k + this.f6785i) - a;
        int i = a * 2;
        int width = d0Var2.f6294a.getWidth() + round + i;
        int height = d0Var2.f6294a.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        C1651o layoutManager = this.f6794r.getLayoutManager();
        int e = layoutManager.mo7467e();
        int i4 = 0;
        while (i4 < e) {
            View d = layoutManager.mo7462d(i4);
            if (d != d0Var2.f6294a && d.getBottom() >= round2 && d.getTop() <= height && d.getRight() >= round && d.getLeft() <= width) {
                C1635d0 childViewHolder = this.f6794r.getChildViewHolder(d);
                if (this.f6789m.mo7950a(this.f6794r, this.f6779c, childViewHolder)) {
                    int abs = Math.abs(i2 - ((d.getLeft() + d.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((d.getTop() + d.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f6797u.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > ((Integer) this.f6798v.get(i6)).intValue()) {
                        i7++;
                        i6++;
                        C1635d0 d0Var3 = d0Var;
                    }
                    this.f6797u.add(i7, childViewHolder);
                    this.f6798v.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            d0Var2 = d0Var;
        }
        return this.f6797u;
    }

    /* renamed from: e */
    private void m9411e() {
        this.f6794r.removeItemDecoration(this);
        this.f6794r.removeOnItemTouchListener(this.f6774B);
        this.f6794r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f6792p.size() - 1; size >= 0; size--) {
            this.f6789m.mo7948a(this.f6794r, ((C1754h) this.f6792p.get(0)).f6826e);
        }
        this.f6792p.clear();
        this.f6800x = null;
        this.f6801y = -1;
        m9412f();
        m9415i();
    }

    /* renamed from: f */
    private void m9412f() {
        VelocityTracker velocityTracker = this.f6796t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6796t = null;
        }
    }

    /* renamed from: g */
    private void m9413g() {
        this.f6793q = ViewConfiguration.get(this.f6794r.getContext()).getScaledTouchSlop();
        this.f6794r.addItemDecoration(this);
        this.f6794r.addOnItemTouchListener(this.f6774B);
        this.f6794r.addOnChildAttachStateChangeListener(this);
        m9414h();
    }

    /* renamed from: h */
    private void m9414h() {
        this.f6773A = new C1753g();
        this.f6802z = new C0978f(this.f6794r.getContext(), this.f6773A);
    }

    /* renamed from: i */
    private void m9415i() {
        C1753g gVar = this.f6773A;
        if (gVar != null) {
            gVar.mo7965a();
            this.f6773A = null;
        }
        if (this.f6802z != null) {
            this.f6802z = null;
        }
    }

    /* renamed from: b */
    public void mo7396b(Canvas canvas, RecyclerView recyclerView, State state) {
        float f;
        float f2;
        if (this.f6779c != null) {
            m9403a(this.f6778b);
            float[] fArr = this.f6778b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f6789m.mo7955b(canvas, recyclerView, this.f6779c, this.f6792p, this.f6790n, f2, f);
    }

    /* renamed from: b */
    public void mo7526b(@C0193h0 View view) {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c5, code lost:
        if (r1 > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0110  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7934c() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r0.f6779c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f6776D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f6776D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f6794r
            androidx.recyclerview.widget.RecyclerView$o r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f6775C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f6775C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r0.f6779c
            android.view.View r9 = r9.f6294a
            android.graphics.Rect r10 = r0.f6775C
            r1.mo7411a(r9, r10)
            boolean r9 = r1.mo6983a()
            r10 = 0
            if (r9 == 0) goto L_0x007f
            float r9 = r0.f6786j
            float r11 = r0.f6784h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f6775C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f6794r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f6784h
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x0080
        L_0x0059:
            float r11 = r0.f6784h
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007f
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f6779c
            android.view.View r11 = r11.f6294a
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f6775C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f6794r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f6794r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007f
            r12 = r9
            goto L_0x0080
        L_0x007f:
            r12 = 0
        L_0x0080:
            boolean r1 = r1.mo6987b()
            if (r1 == 0) goto L_0x00c8
            float r1 = r0.f6787k
            float r9 = r0.f6785i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f6775C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f6794r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f6785i
            int r11 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a3
            if (r9 >= 0) goto L_0x00a3
            r1 = r9
            goto L_0x00c9
        L_0x00a3:
            float r9 = r0.f6785i
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c8
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r0.f6779c
            android.view.View r9 = r9.f6294a
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f6775C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f6794r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f6794r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            if (r12 == 0) goto L_0x00e2
            androidx.recyclerview.widget.m$f r9 = r0.f6789m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f6794r
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f6779c
            android.view.View r11 = r11.f6294a
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f6794r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.mo7942a(r10, r11, r12, r13, r14)
        L_0x00e2:
            r14 = r12
            if (r1 == 0) goto L_0x0101
            androidx.recyclerview.widget.m$f r9 = r0.f6789m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f6794r
            androidx.recyclerview.widget.RecyclerView$d0 r11 = r0.f6779c
            android.view.View r11 = r11.f6294a
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f6794r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.mo7942a(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x0102
        L_0x0101:
            r12 = r14
        L_0x0102:
            if (r12 != 0) goto L_0x010a
            if (r1 == 0) goto L_0x0107
            goto L_0x010a
        L_0x0107:
            r0.f6776D = r3
            return r2
        L_0x010a:
            long r7 = r0.f6776D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0112
            r0.f6776D = r5
        L_0x0112:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f6794r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1744m.mo7934c():boolean");
    }

    /* renamed from: a */
    public void mo7926a(@C0195i0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6794r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m9411e();
            }
            this.f6794r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f6782f = resources.getDimension(C1614R.dimen.item_touch_helper_swipe_escape_velocity);
                this.f6783g = resources.getDimension(C1614R.dimen.item_touch_helper_swipe_escape_max_velocity);
                m9413g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7930b() {
        VelocityTracker velocityTracker = this.f6796t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f6796t = VelocityTracker.obtain();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo7929b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        C1635d0 d0Var = this.f6779c;
        if (d0Var != null) {
            View view = d0Var.f6294a;
            if (m9404a(view, x, y, this.f6786j + this.f6784h, this.f6787k + this.f6785i)) {
                return view;
            }
        }
        for (int size = this.f6792p.size() - 1; size >= 0; size--) {
            C1754h hVar = (C1754h) this.f6792p.get(size);
            View view2 = hVar.f6826e.f6294a;
            if (m9404a(view2, x, y, hVar.f6831j, hVar.f6832k)) {
                return view2;
            }
        }
        return this.f6794r.findChildViewUnder(x, y);
    }

    /* renamed from: a */
    private void m9403a(float[] fArr) {
        if ((this.f6791o & 12) != 0) {
            fArr[0] = (this.f6786j + this.f6784h) - ((float) this.f6779c.f6294a.getLeft());
        } else {
            fArr[0] = this.f6779c.f6294a.getTranslationX();
        }
        if ((this.f6791o & 3) != 0) {
            fArr[1] = (this.f6787k + this.f6785i) - ((float) this.f6779c.f6294a.getTop());
        } else {
            fArr[1] = this.f6779c.f6294a.getTranslationY();
        }
    }

    /* renamed from: e */
    private int m9410e(C1635d0 d0Var) {
        if (this.f6790n == 2) {
            return 0;
        }
        int c = this.f6789m.mo7959c(this.f6794r, d0Var);
        int a = (this.f6789m.mo7941a(c, C0962e0.m5566x(this.f6794r)) & 65280) >> 8;
        if (a == 0) {
            return 0;
        }
        int i = (c & 65280) >> 8;
        if (Math.abs(this.f6784h) > Math.abs(this.f6785i)) {
            int b = m9405b(d0Var, a);
            if (b > 0) {
                return (i & b) == 0 ? C1750f.m9441b(b, C0962e0.m5566x(this.f6794r)) : b;
            }
            int c2 = m9406c(d0Var, a);
            if (c2 > 0) {
                return c2;
            }
        } else {
            int c3 = m9406c(d0Var, a);
            if (c3 > 0) {
                return c3;
            }
            int b2 = m9405b(d0Var, a);
            if (b2 > 0) {
                if ((i & b2) == 0) {
                    b2 = C1750f.m9441b(b2, C0962e0.m5566x(this.f6794r));
                }
                return b2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo7392a(Canvas canvas, RecyclerView recyclerView, State state) {
        float f;
        float f2;
        this.f6801y = -1;
        if (this.f6779c != null) {
            m9403a(this.f6778b);
            float[] fArr = this.f6778b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f6789m.mo7946a(canvas, recyclerView, this.f6779c, this.f6792p, this.f6790n, f2, f);
    }

    /* renamed from: b */
    public void mo7931b(@C0193h0 C1635d0 d0Var) {
        if (this.f6789m.mo7961d(this.f6794r, d0Var) && d0Var.f6294a.getParent() == this.f6794r) {
            mo7930b();
            this.f6785i = 0.0f;
            this.f6784h = 0.0f;
            mo7924a(d0Var, 2);
        }
    }

    /* renamed from: b */
    private int m9405b(C1635d0 d0Var, int i) {
        if ((i & 12) != 0) {
            int i2 = 8;
            int i3 = this.f6784h > 0.0f ? 8 : 4;
            VelocityTracker velocityTracker = this.f6796t;
            if (velocityTracker != null && this.f6788l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f6789m.mo7951b(this.f6783g));
                float xVelocity = this.f6796t.getXVelocity(this.f6788l);
                float yVelocity = this.f6796t.getYVelocity(this.f6788l);
                if (xVelocity <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.f6789m.mo7938a(this.f6782f) && abs > Math.abs(yVelocity)) {
                    return i2;
                }
            }
            float width = ((float) this.f6794r.getWidth()) * this.f6789m.mo7952b(d0Var);
            if ((i & i3) != 0 && Math.abs(this.f6784h) > width) {
                return i3;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0137  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7924a(@androidx.annotation.C0195i0 androidx.recyclerview.widget.RecyclerView.C1635d0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r11.f6779c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f6790n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f6776D = r0
            int r4 = r11.f6790n
            r14 = 1
            r11.mo7925a(r12, r14)
            r11.f6790n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.f6294a
            r11.f6800x = r0
            r23.m9409d()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$d0 r9 = r11.f6779c
            r8 = 0
            if (r9 == 0) goto L_0x00ee
            android.view.View r0 = r9.f6294a
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00da
            if (r4 != r15) goto L_0x004a
            r7 = 0
            goto L_0x004f
        L_0x004a:
            int r0 = r11.m9410e(r9)
            r7 = r0
        L_0x004f:
            r23.m9412f()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007b
            if (r7 == r15) goto L_0x007b
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = 0
        L_0x0066:
            r18 = 0
            goto L_0x008e
        L_0x0069:
            float r2 = r11.f6784h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f6794r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r2
            goto L_0x0066
        L_0x007b:
            float r2 = r11.f6785i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f6794r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r2
            r17 = 0
        L_0x008e:
            if (r4 != r15) goto L_0x0093
            r6 = 8
            goto L_0x0098
        L_0x0093:
            if (r7 <= 0) goto L_0x0097
            r6 = 2
            goto L_0x0098
        L_0x0097:
            r6 = 4
        L_0x0098:
            float[] r0 = r11.f6778b
            r11.m9403a(r0)
            float[] r0 = r11.f6778b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.m$c r5 = new androidx.recyclerview.widget.m$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = 8
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.m$f r0 = r11.f6789m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6794r
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.mo7943a(r1, r15, r2, r3)
            r14.mo7970a(r0)
            java.util.List<androidx.recyclerview.widget.m$h> r0 = r11.f6792p
            r0.add(r14)
            r14.mo7971b()
            r8 = 1
            goto L_0x00ea
        L_0x00da:
            r0 = r9
            r21 = 8
            android.view.View r1 = r0.f6294a
            r11.mo7932c(r1)
            androidx.recyclerview.widget.m$f r1 = r11.f6789m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f6794r
            r1.mo7948a(r2, r0)
            r8 = 0
        L_0x00ea:
            r0 = 0
            r11.f6779c = r0
            goto L_0x00f1
        L_0x00ee:
            r21 = 8
            r8 = 0
        L_0x00f1:
            if (r12 == 0) goto L_0x0124
            androidx.recyclerview.widget.m$f r0 = r11.f6789m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6794r
            int r0 = r0.mo7953b(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f6790n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f6791o = r0
            android.view.View r0 = r12.f6294a
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f6786j = r0
            android.view.View r0 = r12.f6294a
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f6787k = r0
            r11.f6779c = r12
            r0 = 2
            if (r13 != r0) goto L_0x0124
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r11.f6779c
            android.view.View r0 = r0.f6294a
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0125
        L_0x0124:
            r1 = 0
        L_0x0125:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6794r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0135
            androidx.recyclerview.widget.RecyclerView$d0 r2 = r11.f6779c
            if (r2 == 0) goto L_0x0132
            r1 = 1
        L_0x0132:
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0135:
            if (r8 != 0) goto L_0x0140
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6794r
            androidx.recyclerview.widget.RecyclerView$o r0 = r0.getLayoutManager()
            r0.mo7402G()
        L_0x0140:
            androidx.recyclerview.widget.m$f r0 = r11.f6789m
            androidx.recyclerview.widget.RecyclerView$d0 r1 = r11.f6779c
            int r2 = r11.f6790n
            r0.mo7947a(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6794r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1744m.mo7924a(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    /* renamed from: d */
    private void m9409d() {
        if (VERSION.SDK_INT < 21) {
            if (this.f6799w == null) {
                this.f6799w = new C1749e();
            }
            this.f6794r.setChildDrawingOrderCallback(this.f6799w);
        }
    }

    /* renamed from: c */
    private C1635d0 m9407c(MotionEvent motionEvent) {
        C1651o layoutManager = this.f6794r.getLayoutManager();
        int i = this.f6788l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(findPointerIndex) - this.f6780d;
        float y = motionEvent.getY(findPointerIndex) - this.f6781e;
        float abs = Math.abs(x);
        float abs2 = Math.abs(y);
        int i2 = this.f6793q;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo6983a()) {
            return null;
        }
        if (abs2 > abs && layoutManager.mo6987b()) {
            return null;
        }
        View b = mo7929b(motionEvent);
        if (b == null) {
            return null;
        }
        return this.f6794r.getChildViewHolder(b);
    }

    /* renamed from: c */
    public void mo7933c(@C0193h0 C1635d0 d0Var) {
        if (this.f6789m.mo7962e(this.f6794r, d0Var) && d0Var.f6294a.getParent() == this.f6794r) {
            mo7930b();
            this.f6785i = 0.0f;
            this.f6784h = 0.0f;
            mo7924a(d0Var, 1);
        }
    }

    /* renamed from: c */
    private int m9406c(C1635d0 d0Var, int i) {
        if ((i & 3) != 0) {
            int i2 = 2;
            int i3 = this.f6785i > 0.0f ? 2 : 1;
            VelocityTracker velocityTracker = this.f6796t;
            if (velocityTracker != null && this.f6788l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f6789m.mo7951b(this.f6783g));
                float xVelocity = this.f6796t.getXVelocity(this.f6788l);
                float yVelocity = this.f6796t.getYVelocity(this.f6788l);
                if (yVelocity <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.f6789m.mo7938a(this.f6782f) && abs > Math.abs(xVelocity)) {
                    return i2;
                }
            }
            float height = ((float) this.f6794r.getHeight()) * this.f6789m.mo7952b(d0Var);
            if ((i & i3) != 0 && Math.abs(this.f6785i) > height) {
                return i3;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7927a(C1754h hVar, int i) {
        this.f6794r.post(new C1748d(hVar, i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7928a() {
        int size = this.f6792p.size();
        for (int i = 0; i < size; i++) {
            if (!((C1754h) this.f6792p.get(i)).f6834m) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7923a(C1635d0 d0Var) {
        if (!this.f6794r.isLayoutRequested() && this.f6790n == 2) {
            float a = this.f6789m.mo7939a(d0Var);
            int i = (int) (this.f6786j + this.f6784h);
            int i2 = (int) (this.f6787k + this.f6785i);
            if (((float) Math.abs(i2 - d0Var.f6294a.getTop())) >= ((float) d0Var.f6294a.getHeight()) * a || ((float) Math.abs(i - d0Var.f6294a.getLeft())) >= ((float) d0Var.f6294a.getWidth()) * a) {
                List d = m9408d(d0Var);
                if (d.size() != 0) {
                    C1635d0 a2 = this.f6789m.mo7944a(d0Var, d, i, i2);
                    if (a2 == null) {
                        this.f6797u.clear();
                        this.f6798v.clear();
                        return;
                    }
                    int f = a2.mo7273f();
                    int f2 = d0Var.mo7273f();
                    if (this.f6789m.mo7958b(this.f6794r, d0Var, a2)) {
                        this.f6789m.mo7949a(this.f6794r, d0Var, f2, a2, f, i, i2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7932c(View view) {
        if (view == this.f6800x) {
            this.f6800x = null;
            if (this.f6799w != null) {
                this.f6794r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* renamed from: a */
    public void mo7525a(@C0193h0 View view) {
        mo7932c(view);
        C1635d0 childViewHolder = this.f6794r.getChildViewHolder(view);
        if (childViewHolder != null) {
            C1635d0 d0Var = this.f6779c;
            if (d0Var == null || childViewHolder != d0Var) {
                mo7925a(childViewHolder, false);
                if (this.f6777a.remove(childViewHolder.f6294a)) {
                    this.f6789m.mo7948a(this.f6794r, childViewHolder);
                }
            } else {
                mo7924a((C1635d0) null, 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7925a(C1635d0 d0Var, boolean z) {
        for (int size = this.f6792p.size() - 1; size >= 0; size--) {
            C1754h hVar = (C1754h) this.f6792p.get(size);
            if (hVar.f6826e == d0Var) {
                hVar.f6833l |= z;
                if (!hVar.f6834m) {
                    hVar.mo7968a();
                }
                this.f6792p.remove(size);
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo7394a(Rect rect, View view, RecyclerView recyclerView, State state) {
        rect.setEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7921a(int i, MotionEvent motionEvent, int i2) {
        if (this.f6779c == null && i == 2 && this.f6790n != 2 && this.f6789m.mo7957b() && this.f6794r.getScrollState() != 1) {
            C1635d0 c = m9407c(motionEvent);
            if (c != null) {
                int b = (this.f6789m.mo7953b(this.f6794r, c) & 65280) >> 8;
                if (b != 0) {
                    float x = motionEvent.getX(i2);
                    float f = x - this.f6780d;
                    float y = motionEvent.getY(i2) - this.f6781e;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(y);
                    int i3 = this.f6793q;
                    if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                        if (abs > abs2) {
                            if (f < 0.0f && (b & 4) == 0) {
                                return;
                            }
                            if (f > 0.0f && (b & 8) == 0) {
                                return;
                            }
                        } else if (y < 0.0f && (b & 1) == 0) {
                            return;
                        } else {
                            if (y > 0.0f && (b & 2) == 0) {
                                return;
                            }
                        }
                        this.f6785i = 0.0f;
                        this.f6784h = 0.0f;
                        this.f6788l = motionEvent.getPointerId(0);
                        mo7924a(c, 1);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1754h mo7920a(MotionEvent motionEvent) {
        if (this.f6792p.isEmpty()) {
            return null;
        }
        View b = mo7929b(motionEvent);
        for (int size = this.f6792p.size() - 1; size >= 0; size--) {
            C1754h hVar = (C1754h) this.f6792p.get(size);
            if (hVar.f6826e.f6294a == b) {
                return hVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7922a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f6784h = x - this.f6780d;
        this.f6785i = y - this.f6781e;
        if ((i & 4) == 0) {
            this.f6784h = Math.max(0.0f, this.f6784h);
        }
        if ((i & 8) == 0) {
            this.f6784h = Math.min(0.0f, this.f6784h);
        }
        if ((i & 1) == 0) {
            this.f6785i = Math.max(0.0f, this.f6785i);
        }
        if ((i & 2) == 0) {
            this.f6785i = Math.min(0.0f, this.f6785i);
        }
    }
}
