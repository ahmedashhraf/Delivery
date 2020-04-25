package com.chauthai.swipereveallayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0978f;
import androidx.customview.p039a.C1138c;
import androidx.customview.p039a.C1138c.C1141c;

@SuppressLint({"RtlHardcoded"})
public class SwipeRevealLayout extends ViewGroup {

    /* renamed from: A0 */
    public static final int f10550A0 = 0;

    /* renamed from: B0 */
    public static final int f10551B0 = 1;

    /* renamed from: p0 */
    protected static final int f10552p0 = 0;

    /* renamed from: q0 */
    protected static final int f10553q0 = 1;

    /* renamed from: r0 */
    protected static final int f10554r0 = 2;

    /* renamed from: s0 */
    protected static final int f10555s0 = 3;

    /* renamed from: t0 */
    protected static final int f10556t0 = 4;

    /* renamed from: u0 */
    private static final int f10557u0 = 300;

    /* renamed from: v0 */
    private static final int f10558v0 = 1;

    /* renamed from: w0 */
    public static final int f10559w0 = 1;

    /* renamed from: x0 */
    public static final int f10560x0 = 2;

    /* renamed from: y0 */
    public static final int f10561y0 = 4;

    /* renamed from: z0 */
    public static final int f10562z0 = 8;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Rect f10563N = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: O */
    public Rect f10564O = new Rect();

    /* renamed from: P */
    private Rect f10565P = new Rect();

    /* renamed from: Q */
    private Rect f10566Q = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public int f10567R = 0;

    /* renamed from: S */
    private boolean f10568S = false;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public volatile boolean f10569T = false;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public volatile boolean f10570U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public volatile boolean f10571V = false;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f10572W = 300;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f10573a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public int f10574a0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f10575b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f10576b0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f10577c0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public int f10578d0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public int f10579e0 = 1;

    /* renamed from: f0 */
    private float f10580f0 = 0.0f;

    /* renamed from: g0 */
    private float f10581g0 = -1.0f;

    /* renamed from: h0 */
    private float f10582h0 = -1.0f;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public C1138c f10583i0;

    /* renamed from: j0 */
    private C0978f f10584j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C2987c f10585k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C2989e f10586l0;

    /* renamed from: m0 */
    private int f10587m0 = 0;

    /* renamed from: n0 */
    private final OnGestureListener f10588n0 = new C2985a();

    /* renamed from: o0 */
    private final C1141c f10589o0 = new C2986b();

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$a */
    class C2985a extends SimpleOnGestureListener {

        /* renamed from: a */
        boolean f10590a = false;

        C2985a() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            SwipeRevealLayout.this.f10570U = false;
            this.f10590a = false;
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            SwipeRevealLayout.this.f10570U = true;
            return false;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            SwipeRevealLayout.this.f10570U = true;
            if (SwipeRevealLayout.this.getParent() != null) {
                if (!this.f10590a) {
                    z = SwipeRevealLayout.this.getDistToClosestEdge() >= SwipeRevealLayout.this.f10567R;
                    if (z) {
                        this.f10590a = true;
                    }
                } else {
                    z = true;
                }
                SwipeRevealLayout.this.getParent().requestDisallowInterceptTouchEvent(z);
            }
            return false;
        }
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$b */
    class C2986b extends C1141c {
        C2986b() {
        }

        /* renamed from: a */
        public int mo5450a(View view, int i, int i2) {
            int q = SwipeRevealLayout.this.f10579e0;
            if (q == 1) {
                return Math.max(Math.min(i, SwipeRevealLayout.this.f10563N.left + SwipeRevealLayout.this.f10575b.getWidth()), SwipeRevealLayout.this.f10563N.left);
            }
            if (q != 2) {
                return view.getLeft();
            }
            return Math.max(Math.min(i, SwipeRevealLayout.this.f10563N.left), SwipeRevealLayout.this.f10563N.left - SwipeRevealLayout.this.f10575b.getWidth());
        }

        /* renamed from: b */
        public boolean mo5459b(View view, int i) {
            SwipeRevealLayout.this.f10569T = false;
            if (SwipeRevealLayout.this.f10571V) {
                return false;
            }
            SwipeRevealLayout.this.f10583i0.mo5422a(SwipeRevealLayout.this.f10573a, i);
            return false;
        }

        /* renamed from: c */
        public void mo5460c(int i) {
            super.mo5460c(i);
            int j = SwipeRevealLayout.this.f10574a0;
            if (i != 0) {
                if (i == 1) {
                    SwipeRevealLayout.this.f10574a0 = 4;
                }
            } else if (SwipeRevealLayout.this.f10579e0 == 1 || SwipeRevealLayout.this.f10579e0 == 2) {
                if (SwipeRevealLayout.this.f10573a.getLeft() == SwipeRevealLayout.this.f10563N.left) {
                    SwipeRevealLayout.this.f10574a0 = 0;
                } else {
                    SwipeRevealLayout.this.f10574a0 = 2;
                }
            } else if (SwipeRevealLayout.this.f10573a.getTop() == SwipeRevealLayout.this.f10563N.top) {
                SwipeRevealLayout.this.f10574a0 = 0;
            } else {
                SwipeRevealLayout.this.f10574a0 = 2;
            }
            if (SwipeRevealLayout.this.f10585k0 != null && !SwipeRevealLayout.this.f10569T && j != SwipeRevealLayout.this.f10574a0) {
                SwipeRevealLayout.this.f10585k0.mo11813a(SwipeRevealLayout.this.f10574a0);
            }
        }

        /* renamed from: b */
        public int mo5456b(View view, int i, int i2) {
            int q = SwipeRevealLayout.this.f10579e0;
            if (q == 4) {
                return Math.max(Math.min(i, SwipeRevealLayout.this.f10563N.top + SwipeRevealLayout.this.f10575b.getHeight()), SwipeRevealLayout.this.f10563N.top);
            }
            if (q != 8) {
                return view.getTop();
            }
            return Math.max(Math.min(i, SwipeRevealLayout.this.f10563N.top), SwipeRevealLayout.this.f10563N.top - SwipeRevealLayout.this.f10575b.getHeight());
        }

        /* renamed from: a */
        public void mo5452a(View view, float f, float f2) {
            int i = (int) f;
            boolean z = false;
            boolean z2 = SwipeRevealLayout.this.m14265c(i) >= SwipeRevealLayout.this.f10572W;
            boolean z3 = SwipeRevealLayout.this.m14265c(i) <= (-SwipeRevealLayout.this.f10572W);
            int i2 = (int) f2;
            boolean z4 = SwipeRevealLayout.this.m14265c(i2) <= (-SwipeRevealLayout.this.f10572W);
            if (SwipeRevealLayout.this.m14265c(i2) >= SwipeRevealLayout.this.f10572W) {
                z = true;
            }
            int c = SwipeRevealLayout.this.getHalfwayPivotHorizontal();
            int d = SwipeRevealLayout.this.getHalfwayPivotVertical();
            int q = SwipeRevealLayout.this.f10579e0;
            if (q != 1) {
                if (q != 2) {
                    if (q != 4) {
                        if (q == 8) {
                            if (z4) {
                                SwipeRevealLayout.this.mo11792b(true);
                            } else if (z) {
                                SwipeRevealLayout.this.mo11791a(true);
                            } else if (SwipeRevealLayout.this.f10573a.getBottom() < d) {
                                SwipeRevealLayout.this.mo11792b(true);
                            } else {
                                SwipeRevealLayout.this.mo11791a(true);
                            }
                        }
                    } else if (z4) {
                        SwipeRevealLayout.this.mo11791a(true);
                    } else if (z) {
                        SwipeRevealLayout.this.mo11792b(true);
                    } else if (SwipeRevealLayout.this.f10573a.getTop() < d) {
                        SwipeRevealLayout.this.mo11791a(true);
                    } else {
                        SwipeRevealLayout.this.mo11792b(true);
                    }
                } else if (z2) {
                    SwipeRevealLayout.this.mo11791a(true);
                } else if (z3) {
                    SwipeRevealLayout.this.mo11792b(true);
                } else if (SwipeRevealLayout.this.f10573a.getRight() < c) {
                    SwipeRevealLayout.this.mo11792b(true);
                } else {
                    SwipeRevealLayout.this.mo11791a(true);
                }
            } else if (z2) {
                SwipeRevealLayout.this.mo11792b(true);
            } else if (z3) {
                SwipeRevealLayout.this.mo11791a(true);
            } else if (SwipeRevealLayout.this.f10573a.getLeft() < c) {
                SwipeRevealLayout.this.mo11791a(true);
            } else {
                SwipeRevealLayout.this.mo11792b(true);
            }
        }

        /* renamed from: a */
        public void mo5451a(int i, int i2) {
            super.mo5451a(i, i2);
            if (!SwipeRevealLayout.this.f10571V) {
                boolean z = false;
                boolean z2 = SwipeRevealLayout.this.f10579e0 == 2 && i == 1;
                boolean z3 = SwipeRevealLayout.this.f10579e0 == 1 && i == 2;
                boolean z4 = SwipeRevealLayout.this.f10579e0 == 8 && i == 4;
                if (SwipeRevealLayout.this.f10579e0 == 4 && i == 8) {
                    z = true;
                }
                if (z2 || z3 || z4 || z) {
                    SwipeRevealLayout.this.f10583i0.mo5422a(SwipeRevealLayout.this.f10573a, i2);
                }
            }
        }

        /* renamed from: a */
        public void mo5454a(View view, int i, int i2, int i3, int i4) {
            super.mo5454a(view, i, i2, i3, i4);
            boolean z = true;
            if (SwipeRevealLayout.this.f10576b0 == 1) {
                if (SwipeRevealLayout.this.f10579e0 == 1 || SwipeRevealLayout.this.f10579e0 == 2) {
                    SwipeRevealLayout.this.f10575b.offsetLeftAndRight(i3);
                } else {
                    SwipeRevealLayout.this.f10575b.offsetTopAndBottom(i4);
                }
            }
            if (SwipeRevealLayout.this.f10573a.getLeft() == SwipeRevealLayout.this.f10577c0 && SwipeRevealLayout.this.f10573a.getTop() == SwipeRevealLayout.this.f10578d0) {
                z = false;
            }
            if (SwipeRevealLayout.this.f10586l0 != null && z) {
                if (SwipeRevealLayout.this.f10573a.getLeft() == SwipeRevealLayout.this.f10563N.left && SwipeRevealLayout.this.f10573a.getTop() == SwipeRevealLayout.this.f10563N.top) {
                    SwipeRevealLayout.this.f10586l0.mo11816b(SwipeRevealLayout.this);
                } else if (SwipeRevealLayout.this.f10573a.getLeft() == SwipeRevealLayout.this.f10564O.left && SwipeRevealLayout.this.f10573a.getTop() == SwipeRevealLayout.this.f10564O.top) {
                    SwipeRevealLayout.this.f10586l0.mo11814a(SwipeRevealLayout.this);
                } else {
                    SwipeRevealLayout.this.f10586l0.mo11815a(SwipeRevealLayout.this, m14295a());
                }
            }
            SwipeRevealLayout swipeRevealLayout = SwipeRevealLayout.this;
            swipeRevealLayout.f10577c0 = swipeRevealLayout.f10573a.getLeft();
            SwipeRevealLayout swipeRevealLayout2 = SwipeRevealLayout.this;
            swipeRevealLayout2.f10578d0 = swipeRevealLayout2.f10573a.getTop();
            C0962e0.m5561u0(SwipeRevealLayout.this);
        }

        /* renamed from: a */
        private float m14295a() {
            float left;
            int width;
            int q = SwipeRevealLayout.this.f10579e0;
            if (q == 1) {
                left = (float) (SwipeRevealLayout.this.f10573a.getLeft() - SwipeRevealLayout.this.f10563N.left);
                width = SwipeRevealLayout.this.f10575b.getWidth();
            } else if (q == 2) {
                left = (float) (SwipeRevealLayout.this.f10563N.left - SwipeRevealLayout.this.f10573a.getLeft());
                width = SwipeRevealLayout.this.f10575b.getWidth();
            } else if (q == 4) {
                left = (float) (SwipeRevealLayout.this.f10573a.getTop() - SwipeRevealLayout.this.f10563N.top);
                width = SwipeRevealLayout.this.f10575b.getHeight();
            } else if (q != 8) {
                return 0.0f;
            } else {
                left = (float) (SwipeRevealLayout.this.f10563N.top - SwipeRevealLayout.this.f10573a.getTop());
                width = SwipeRevealLayout.this.f10575b.getHeight();
            }
            return left / ((float) width);
        }
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$c */
    interface C2987c {
        /* renamed from: a */
        void mo11813a(int i);
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$d */
    public static class C2988d implements C2989e {
        /* renamed from: a */
        public void mo11814a(SwipeRevealLayout swipeRevealLayout) {
        }

        /* renamed from: a */
        public void mo11815a(SwipeRevealLayout swipeRevealLayout, float f) {
        }

        /* renamed from: b */
        public void mo11816b(SwipeRevealLayout swipeRevealLayout) {
        }
    }

    /* renamed from: com.chauthai.swipereveallayout.SwipeRevealLayout$e */
    public interface C2989e {
        /* renamed from: a */
        void mo11814a(SwipeRevealLayout swipeRevealLayout);

        /* renamed from: a */
        void mo11815a(SwipeRevealLayout swipeRevealLayout, float f);

        /* renamed from: b */
        void mo11816b(SwipeRevealLayout swipeRevealLayout);
    }

    public SwipeRevealLayout(Context context) {
        super(context);
        m14257a(context, (AttributeSet) null);
    }

    /* renamed from: b */
    public static String m14262b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "undefined" : "state_dragging" : "state_opening" : "state_open" : "state_closing" : "state_close";
    }

    /* access modifiers changed from: private */
    public int getDistToClosestEdge() {
        int i = this.f10579e0;
        if (i == 1) {
            return Math.min(this.f10573a.getLeft() - this.f10563N.left, (this.f10563N.left + this.f10575b.getWidth()) - this.f10573a.getLeft());
        } else if (i == 2) {
            return Math.min(this.f10573a.getRight() - (this.f10563N.right - this.f10575b.getWidth()), this.f10563N.right - this.f10573a.getRight());
        } else if (i == 4) {
            int height = this.f10563N.top + this.f10575b.getHeight();
            return Math.min(this.f10573a.getBottom() - height, height - this.f10573a.getTop());
        } else if (i != 8) {
            return 0;
        } else {
            return Math.min(this.f10563N.bottom - this.f10573a.getBottom(), this.f10573a.getBottom() - (this.f10563N.bottom - this.f10575b.getHeight()));
        }
    }

    /* access modifiers changed from: private */
    public int getHalfwayPivotHorizontal() {
        if (this.f10579e0 == 1) {
            return this.f10563N.left + (this.f10575b.getWidth() / 2);
        }
        return this.f10563N.right - (this.f10575b.getWidth() / 2);
    }

    /* access modifiers changed from: private */
    public int getHalfwayPivotVertical() {
        if (this.f10579e0 == 4) {
            return this.f10563N.top + (this.f10575b.getHeight() / 2);
        }
        return this.f10563N.bottom - (this.f10575b.getHeight() / 2);
    }

    private int getMainOpenLeft() {
        int i = this.f10579e0;
        if (i == 1) {
            return this.f10563N.left + this.f10575b.getWidth();
        }
        if (i == 2) {
            return this.f10563N.left - this.f10575b.getWidth();
        }
        if (i == 4) {
            return this.f10563N.left;
        }
        if (i != 8) {
            return 0;
        }
        return this.f10563N.left;
    }

    private int getMainOpenTop() {
        int i = this.f10579e0;
        if (i == 1) {
            return this.f10563N.top;
        }
        if (i == 2) {
            return this.f10563N.top;
        }
        if (i == 4) {
            return this.f10563N.top + this.f10575b.getHeight();
        }
        if (i != 8) {
            return 0;
        }
        return this.f10563N.top - this.f10575b.getHeight();
    }

    private int getSecOpenLeft() {
        if (this.f10576b0 != 0) {
            int i = this.f10579e0;
            if (!(i == 8 || i == 4)) {
                if (i == 1) {
                    return this.f10565P.left + this.f10575b.getWidth();
                }
                return this.f10565P.left - this.f10575b.getWidth();
            }
        }
        return this.f10565P.left;
    }

    private int getSecOpenTop() {
        if (this.f10576b0 != 0) {
            int i = this.f10579e0;
            if (!(i == 1 || i == 2)) {
                if (i == 4) {
                    return this.f10565P.top + this.f10575b.getHeight();
                }
                return this.f10565P.top - this.f10575b.getHeight();
            }
        }
        return this.f10565P.top;
    }

    public void computeScroll() {
        if (this.f10583i0.mo5427a(true)) {
            C0962e0.m5561u0(this);
        }
    }

    public int getDragEdge() {
        return this.f10579e0;
    }

    public int getMinFlingVelocity() {
        return this.f10572W;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() >= 2) {
            this.f10575b = getChildAt(0);
            this.f10573a = getChildAt(1);
        } else if (getChildCount() == 1) {
            this.f10573a = getChildAt(0);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (mo11794c()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.f10583i0.mo5421a(motionEvent);
        this.f10584j0.mo4817a(motionEvent);
        m14258a(motionEvent);
        boolean b = m14263b(motionEvent);
        boolean z = true;
        boolean z2 = this.f10583i0.mo5445h() == 2;
        boolean z3 = this.f10583i0.mo5445h() == 0 && this.f10570U;
        this.f10581g0 = motionEvent.getX();
        this.f10582h0 = motionEvent.getY();
        if (b || (!z2 && !z3)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        this.f10569T = false;
        int i10 = 0;
        while (i10 < getChildCount()) {
            View childAt = getChildAt(i10);
            int paddingLeft = getPaddingLeft();
            int max = Math.max((i3 - getPaddingRight()) - i, i9);
            int paddingTop = getPaddingTop();
            int max2 = Math.max((i4 - getPaddingBottom()) - i2, i9);
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredWidth = childAt.getMeasuredWidth();
            LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams != null) {
                int i11 = layoutParams.height;
                z2 = i11 == -1 || i11 == -1;
                int i12 = layoutParams.width;
                z3 = i12 == -1 || i12 == -1;
            } else {
                z3 = false;
                z2 = false;
            }
            if (z2) {
                measuredHeight = max2 - paddingTop;
                layoutParams.height = measuredHeight;
            }
            if (z3) {
                measuredWidth = max - paddingLeft;
                layoutParams.width = measuredWidth;
            }
            int i13 = this.f10579e0;
            if (i13 == 1) {
                i8 = Math.min(getPaddingLeft(), max);
                i7 = Math.min(getPaddingTop(), max2);
                i6 = Math.min(measuredWidth + getPaddingLeft(), max);
                i5 = Math.min(measuredHeight + getPaddingTop(), max2);
            } else if (i13 == 2) {
                i8 = Math.max(((i3 - measuredWidth) - getPaddingRight()) - i, paddingLeft);
                i7 = Math.min(getPaddingTop(), max2);
                i6 = Math.max((i3 - getPaddingRight()) - i, paddingLeft);
                i5 = Math.min(measuredHeight + getPaddingTop(), max2);
            } else if (i13 == 4) {
                i8 = Math.min(getPaddingLeft(), max);
                i7 = Math.min(getPaddingTop(), max2);
                i6 = Math.min(measuredWidth + getPaddingLeft(), max);
                i5 = Math.min(measuredHeight + getPaddingTop(), max2);
            } else if (i13 != 8) {
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
            } else {
                i8 = Math.min(getPaddingLeft(), max);
                i7 = Math.max(((i4 - measuredHeight) - getPaddingBottom()) - i2, paddingTop);
                i6 = Math.min(measuredWidth + getPaddingLeft(), max);
                i5 = Math.max((i4 - getPaddingBottom()) - i2, paddingTop);
            }
            childAt.layout(i8, i7, i6, i5);
            i10++;
            i9 = 0;
        }
        if (this.f10576b0 == 1) {
            int i14 = this.f10579e0;
            if (i14 == 1) {
                View view = this.f10575b;
                view.offsetLeftAndRight(-view.getWidth());
            } else if (i14 == 2) {
                View view2 = this.f10575b;
                view2.offsetLeftAndRight(view2.getWidth());
            } else if (i14 == 4) {
                View view3 = this.f10575b;
                view3.offsetTopAndBottom(-view3.getHeight());
            } else if (i14 == 8) {
                View view4 = this.f10575b;
                view4.offsetTopAndBottom(view4.getHeight());
            }
        }
        m14273f();
        if (this.f10568S) {
            mo11792b(false);
        } else {
            mo11791a(false);
        }
        this.f10577c0 = this.f10573a.getLeft();
        this.f10578d0 = this.f10573a.getTop();
        this.f10587m0++;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (getChildCount() >= 2) {
            LayoutParams layoutParams = getLayoutParams();
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                measureChild(childAt, i, i2);
                i3 = Math.max(childAt.getMeasuredWidth(), i3);
                i4 = Math.max(childAt.getMeasuredHeight(), i4);
            }
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, mode);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(i4, mode2);
            int size = MeasureSpec.getSize(makeMeasureSpec);
            int size2 = MeasureSpec.getSize(makeMeasureSpec2);
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt2 = getChildAt(i6);
                LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        childAt2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        childAt2.setMinimumWidth(size);
                    }
                }
                measureChild(childAt2, makeMeasureSpec, makeMeasureSpec2);
                i3 = Math.max(childAt2.getMeasuredWidth(), i3);
                i4 = Math.max(childAt2.getMeasuredHeight(), i4);
            }
            int paddingLeft = getPaddingLeft() + getPaddingRight() + i3;
            int paddingTop = getPaddingTop() + getPaddingBottom() + i4;
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingLeft = size;
                }
                if (mode != Integer.MIN_VALUE || paddingLeft <= size) {
                    size = paddingLeft;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingTop = size2;
                }
                if (mode2 != Integer.MIN_VALUE || paddingTop <= size2) {
                    size2 = paddingTop;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f10584j0.mo4817a(motionEvent);
        this.f10583i0.mo5421a(motionEvent);
        return true;
    }

    public void setDragEdge(int i) {
        this.f10579e0 = i;
    }

    /* access modifiers changed from: 0000 */
    public void setDragStateChangeListener(C2987c cVar) {
        this.f10585k0 = cVar;
    }

    public void setLockDrag(boolean z) {
        this.f10571V = z;
    }

    public void setMinFlingVelocity(int i) {
        this.f10572W = i;
    }

    public void setSwipeListener(C2989e eVar) {
        this.f10586l0 = eVar;
    }

    /* renamed from: f */
    private void m14273f() {
        this.f10563N.set(this.f10573a.getLeft(), this.f10573a.getTop(), this.f10573a.getRight(), this.f10573a.getBottom());
        this.f10565P.set(this.f10575b.getLeft(), this.f10575b.getTop(), this.f10575b.getRight(), this.f10575b.getBottom());
        this.f10564O.set(getMainOpenLeft(), getMainOpenTop(), getMainOpenLeft() + this.f10573a.getWidth(), getMainOpenTop() + this.f10573a.getHeight());
        this.f10566Q.set(getSecOpenLeft(), getSecOpenTop(), getSecOpenLeft() + this.f10575b.getWidth(), getSecOpenTop() + this.f10575b.getHeight());
    }

    /* renamed from: g */
    private boolean m14275g() {
        return this.f10580f0 >= ((float) this.f10583i0.mo5444g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo11797e() {
        return this.f10587m0 < 2;
    }

    /* renamed from: c */
    public boolean mo11794c() {
        return this.f10571V;
    }

    /* renamed from: d */
    public boolean mo11796d() {
        return this.f10574a0 == 2;
    }

    /* renamed from: c */
    private boolean m14268c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = ((float) this.f10573a.getTop()) <= y && y <= ((float) this.f10573a.getBottom());
        boolean z2 = ((float) this.f10573a.getLeft()) <= x && x <= ((float) this.f10573a.getRight());
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo11791a(boolean z) {
        this.f10568S = false;
        this.f10569T = false;
        if (z) {
            this.f10574a0 = 1;
            C1138c cVar = this.f10583i0;
            View view = this.f10573a;
            Rect rect = this.f10563N;
            cVar.mo5433b(view, rect.left, rect.top);
            C2987c cVar2 = this.f10585k0;
            if (cVar2 != null) {
                cVar2.mo11813a(this.f10574a0);
            }
        } else {
            this.f10574a0 = 0;
            this.f10583i0.mo5418a();
            View view2 = this.f10573a;
            Rect rect2 = this.f10563N;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f10575b;
            Rect rect3 = this.f10565P;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        C0962e0.m5561u0(this);
    }

    /* renamed from: b */
    public void mo11792b(boolean z) {
        this.f10568S = true;
        this.f10569T = false;
        if (z) {
            this.f10574a0 = 3;
            C1138c cVar = this.f10583i0;
            View view = this.f10573a;
            Rect rect = this.f10564O;
            cVar.mo5433b(view, rect.left, rect.top);
            C2987c cVar2 = this.f10585k0;
            if (cVar2 != null) {
                cVar2.mo11813a(this.f10574a0);
            }
        } else {
            this.f10574a0 = 2;
            this.f10583i0.mo5418a();
            View view2 = this.f10573a;
            Rect rect2 = this.f10564O;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.f10575b;
            Rect rect3 = this.f10566Q;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        C0962e0.m5561u0(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m14265c(int i) {
        return (int) (((float) i) / (((float) getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11790a() {
        this.f10569T = true;
        this.f10583i0.mo5418a();
    }

    /* renamed from: b */
    public boolean mo11793b() {
        return this.f10574a0 == 0;
    }

    /* renamed from: b */
    private boolean m14263b(MotionEvent motionEvent) {
        return m14268c(motionEvent) && !m14275g();
    }

    /* renamed from: a */
    private void m14258a(MotionEvent motionEvent) {
        float f;
        if (motionEvent.getAction() == 0) {
            this.f10580f0 = 0.0f;
            return;
        }
        boolean z = true;
        if (!(getDragEdge() == 1 || getDragEdge() == 2)) {
            z = false;
        }
        if (z) {
            f = Math.abs(motionEvent.getX() - this.f10581g0);
        } else {
            f = Math.abs(motionEvent.getY() - this.f10582h0);
        }
        this.f10580f0 += f;
    }

    public SwipeRevealLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14257a(context, attributeSet);
    }

    /* renamed from: a */
    private void m14257a(Context context, AttributeSet attributeSet) {
        if (!(attributeSet == null || context == null)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2983R.styleable.SwipeRevealLayout, 0, 0);
            this.f10579e0 = obtainStyledAttributes.getInteger(C2983R.styleable.SwipeRevealLayout_dragEdge, 1);
            this.f10572W = obtainStyledAttributes.getInteger(C2983R.styleable.SwipeRevealLayout_flingVelocity, 300);
            this.f10576b0 = obtainStyledAttributes.getInteger(C2983R.styleable.SwipeRevealLayout_mode, 0);
            this.f10567R = obtainStyledAttributes.getDimensionPixelSize(C2983R.styleable.SwipeRevealLayout_minDistRequestDisallowParent, m14254a(1));
        }
        this.f10583i0 = C1138c.m6479a((ViewGroup) this, 1.0f, this.f10589o0);
        this.f10583i0.mo5441e(15);
        this.f10584j0 = new C0978f(context, this.f10588n0);
    }

    /* renamed from: a */
    private int m14254a(int i) {
        return (int) (((float) i) * (((float) getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    public SwipeRevealLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
