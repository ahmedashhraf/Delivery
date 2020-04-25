package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1050t;
import androidx.core.p034l.C1051u;
import androidx.core.p034l.C1052v;
import androidx.core.p034l.C1053w;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements C0564y, C1052v, C1050t, C1051u {

    /* renamed from: p0 */
    private static final String f1487p0 = "ActionBarOverlayLayout";

    /* renamed from: q0 */
    private static final int f1488q0 = 600;

    /* renamed from: r0 */
    static final int[] f1489r0 = {C0238R.attr.actionBarSize, 16842841};

    /* renamed from: N */
    private ContentFrameLayout f1490N;

    /* renamed from: O */
    ActionBarContainer f1491O;

    /* renamed from: P */
    private C0566z f1492P;

    /* renamed from: Q */
    private Drawable f1493Q;

    /* renamed from: R */
    private boolean f1494R;

    /* renamed from: S */
    private boolean f1495S;

    /* renamed from: T */
    private boolean f1496T;

    /* renamed from: U */
    private boolean f1497U;

    /* renamed from: V */
    boolean f1498V;

    /* renamed from: W */
    private int f1499W;

    /* renamed from: a */
    private int f1500a;

    /* renamed from: a0 */
    private int f1501a0;

    /* renamed from: b */
    private int f1502b;

    /* renamed from: b0 */
    private final Rect f1503b0;

    /* renamed from: c0 */
    private final Rect f1504c0;

    /* renamed from: d0 */
    private final Rect f1505d0;

    /* renamed from: e0 */
    private final Rect f1506e0;

    /* renamed from: f0 */
    private final Rect f1507f0;

    /* renamed from: g0 */
    private final Rect f1508g0;

    /* renamed from: h0 */
    private final Rect f1509h0;

    /* renamed from: i0 */
    private C0401d f1510i0;

    /* renamed from: j0 */
    private OverScroller f1511j0;

    /* renamed from: k0 */
    ViewPropertyAnimator f1512k0;

    /* renamed from: l0 */
    final AnimatorListenerAdapter f1513l0;

    /* renamed from: m0 */
    private final Runnable f1514m0;

    /* renamed from: n0 */
    private final Runnable f1515n0;

    /* renamed from: o0 */
    private final C1053w f1516o0;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0398a extends AnimatorListenerAdapter {
        C0398a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1512k0 = null;
            actionBarOverlayLayout.f1498V = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1512k0 = null;
            actionBarOverlayLayout.f1498V = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0399b implements Runnable {
        C0399b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1882a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1512k0 = actionBarOverlayLayout.f1491O.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1513l0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0400c implements Runnable {
        C0400c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1882a();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1512k0 = actionBarOverlayLayout.f1491O.animate().translationY((float) (-ActionBarOverlayLayout.this.f1491O.getHeight())).setListener(ActionBarOverlayLayout.this.f1513l0);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0401d {
        /* renamed from: a */
        void mo1111a();

        /* renamed from: a */
        void mo1112a(int i);

        /* renamed from: a */
        void mo1113a(boolean z);

        /* renamed from: b */
        void mo1114b();

        /* renamed from: c */
        void mo1115c();

        /* renamed from: d */
        void mo1116d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0402e extends MarginLayoutParams {
        public C0402e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0402e(int i, int i2) {
            super(i, i2);
        }

        public C0402e(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0402e(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m2276a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1489r0);
        boolean z = false;
        this.f1500a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1493Q = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1493Q == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1494R = z;
        this.f1511j0 = new OverScroller(context);
    }

    /* renamed from: n */
    private void m2279n() {
        mo1882a();
        this.f1515n0.run();
    }

    /* renamed from: o */
    private void m2280o() {
        mo1882a();
        postDelayed(this.f1515n0, 600);
    }

    /* renamed from: p */
    private void m2281p() {
        mo1882a();
        postDelayed(this.f1514m0, 600);
    }

    /* renamed from: q */
    private void m2282q() {
        mo1882a();
        this.f1514m0.run();
    }

    /* renamed from: b */
    public void mo1892b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: c */
    public boolean mo1894c() {
        return this.f1497U;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0402e;
    }

    /* renamed from: d */
    public void mo1896d() {
        mo1913m();
        this.f1492P.mo2918d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1493Q != null && !this.f1494R) {
            int bottom = this.f1491O.getVisibility() == 0 ? (int) (((float) this.f1491O.getBottom()) + this.f1491O.getTranslationY() + 0.5f) : 0;
            this.f1493Q.setBounds(0, bottom, getWidth(), this.f1493Q.getIntrinsicHeight() + bottom);
            this.f1493Q.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1898e() {
        mo1913m();
        return this.f1492P.mo2922e();
    }

    /* renamed from: f */
    public boolean mo1899f() {
        mo1913m();
        return this.f1492P.mo2924f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo1913m();
        int W = C0962e0.m5419W(this) & 256;
        boolean a = m2278a((View) this.f1491O, rect, true, true, false, true);
        this.f1506e0.set(rect);
        C0567z0.m3140a(this, this.f1506e0, this.f1503b0);
        if (!this.f1507f0.equals(this.f1506e0)) {
            this.f1507f0.set(this.f1506e0);
            a = true;
        }
        if (!this.f1504c0.equals(this.f1503b0)) {
            this.f1504c0.set(this.f1503b0);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1901g() {
        mo1913m();
        return this.f1492P.mo2926g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1491O;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1516o0.mo5189a();
    }

    public CharSequence getTitle() {
        mo1913m();
        return this.f1492P.getTitle();
    }

    /* renamed from: h */
    public boolean mo1908h() {
        mo1913m();
        return this.f1492P.mo2929h();
    }

    /* renamed from: i */
    public boolean mo1909i() {
        mo1913m();
        return this.f1492P.mo2930i();
    }

    /* renamed from: j */
    public boolean mo1910j() {
        mo1913m();
        return this.f1492P.mo2931j();
    }

    /* renamed from: k */
    public void mo1911k() {
        mo1913m();
        this.f1492P.mo2932k();
    }

    /* renamed from: l */
    public boolean mo1912l() {
        return this.f1495S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo1913m() {
        if (this.f1490N == null) {
            this.f1490N = (ContentFrameLayout) findViewById(C0238R.C0241id.action_bar_activity_content);
            this.f1491O = (ActionBarContainer) findViewById(C0238R.C0241id.action_bar_container);
            this.f1492P = m2275a(findViewById(C0238R.C0241id.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m2276a(getContext());
        C0962e0.m5563v0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1882a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0402e eVar = (C0402e) childAt.getLayoutParams();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo1913m();
        measureChildWithMargins(this.f1491O, i, 0, i2, 0);
        C0402e eVar = (C0402e) this.f1491O.getLayoutParams();
        int max = Math.max(0, this.f1491O.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f1491O.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1491O.getMeasuredState());
        boolean z = (C0962e0.m5419W(this) & 256) != 0;
        if (z) {
            i3 = this.f1500a;
            if (this.f1496T && this.f1491O.getTabContainer() != null) {
                i3 += this.f1500a;
            }
        } else {
            i3 = this.f1491O.getVisibility() != 8 ? this.f1491O.getMeasuredHeight() : 0;
        }
        this.f1505d0.set(this.f1503b0);
        this.f1508g0.set(this.f1506e0);
        if (this.f1495S || z) {
            Rect rect = this.f1508g0;
            rect.top += i3;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f1505d0;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m2278a((View) this.f1490N, this.f1505d0, true, true, true, true);
        if (!this.f1509h0.equals(this.f1508g0)) {
            this.f1509h0.set(this.f1508g0);
            this.f1490N.mo2173a(this.f1508g0);
        }
        measureChildWithMargins(this.f1490N, i, 0, i2, 0);
        C0402e eVar2 = (C0402e) this.f1490N.getLayoutParams();
        int max3 = Math.max(max, this.f1490N.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f1490N.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1490N.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1497U || !z) {
            return false;
        }
        if (m2277a(f, f2)) {
            m2279n();
        } else {
            m2282q();
        }
        this.f1498V = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1499W += i2;
        setActionBarHideOffset(this.f1499W);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1516o0.mo5192a(view, view2, i);
        this.f1499W = getActionBarHideOffset();
        mo1882a();
        C0401d dVar = this.f1510i0;
        if (dVar != null) {
            dVar.mo1116d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1491O.getVisibility() != 0) {
            return false;
        }
        return this.f1497U;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1497U && !this.f1498V) {
            if (this.f1499W <= this.f1491O.getHeight()) {
                m2281p();
            } else {
                m2280o();
            }
        }
        C0401d dVar = this.f1510i0;
        if (dVar != null) {
            dVar.mo1114b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1913m();
        int i2 = this.f1501a0 ^ i;
        this.f1501a0 = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0401d dVar = this.f1510i0;
        if (dVar != null) {
            dVar.mo1113a(!z);
            if (z2 || !z) {
                this.f1510i0.mo1111a();
            } else {
                this.f1510i0.mo1115c();
            }
        }
        if ((i2 & 256) != 0 && this.f1510i0 != null) {
            C0962e0.m5563v0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1502b = i;
        C0401d dVar = this.f1510i0;
        if (dVar != null) {
            dVar.mo1112a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo1882a();
        this.f1491O.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1491O.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0401d dVar) {
        this.f1510i0 = dVar;
        if (getWindowToken() != null) {
            this.f1510i0.mo1112a(this.f1502b);
            int i = this.f1501a0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0962e0.m5563v0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1496T = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1497U) {
            this.f1497U = z;
            if (!z) {
                mo1882a();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1913m();
        this.f1492P.setIcon(i);
    }

    public void setLogo(int i) {
        mo1913m();
        this.f1492P.setLogo(i);
    }

    public void setOverlayMode(boolean z) {
        this.f1495S = z;
        this.f1494R = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo1913m();
        this.f1492P.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1913m();
        this.f1492P.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1502b = 0;
        this.f1503b0 = new Rect();
        this.f1504c0 = new Rect();
        this.f1505d0 = new Rect();
        this.f1506e0 = new Rect();
        this.f1507f0 = new Rect();
        this.f1508g0 = new Rect();
        this.f1509h0 = new Rect();
        this.f1513l0 = new C0398a();
        this.f1514m0 = new C0399b();
        this.f1515n0 = new C0400c();
        m2276a(context);
        this.f1516o0 = new C1053w(this);
    }

    /* renamed from: b */
    public boolean mo1893b() {
        mo1913m();
        return this.f1492P.mo2913b();
    }

    /* access modifiers changed from: protected */
    public C0402e generateDefaultLayoutParams() {
        return new C0402e(-1, -1);
    }

    public C0402e generateLayoutParams(AttributeSet attributeSet) {
        return new C0402e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0402e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo1913m();
        this.f1492P.setIcon(drawable);
    }

    /* renamed from: b */
    public void mo1891b(SparseArray<Parcelable> sparseArray) {
        mo1913m();
        this.f1492P.mo2910b(sparseArray);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2278a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0402e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            r5 = 1
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m2278a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: a */
    public void mo1888a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1887a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public boolean mo1890a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: a */
    public void mo1886a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public void mo1887a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo1889a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    private C0566z m2275a(View view) {
        if (view instanceof C0566z) {
            return (C0566z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1882a() {
        removeCallbacks(this.f1514m0);
        removeCallbacks(this.f1515n0);
        ViewPropertyAnimator viewPropertyAnimator = this.f1512k0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: a */
    private boolean m2277a(float f, float f2) {
        this.f1511j0.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1511j0.getFinalY() > this.f1491O.getHeight();
    }

    /* renamed from: a */
    public void mo1883a(int i) {
        mo1913m();
        if (i == 2) {
            this.f1492P.mo2950v();
        } else if (i == 5) {
            this.f1492P.mo2952x();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo1885a(Menu menu, C0387a aVar) {
        mo1913m();
        this.f1492P.mo2901a(menu, aVar);
    }

    /* renamed from: a */
    public void mo1884a(SparseArray<Parcelable> sparseArray) {
        mo1913m();
        this.f1492P.mo2900a(sparseArray);
    }
}
