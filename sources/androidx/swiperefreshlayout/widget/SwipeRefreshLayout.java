package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0199k0;
import androidx.annotation.C0202m;
import androidx.annotation.C0224v0;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1048r;
import androidx.core.p034l.C1049s;
import androidx.core.p034l.C1052v;
import androidx.core.p034l.C1053w;
import androidx.core.widget.C1116i;
import p076c.p112d.p148d.p150g.C6637f;

public class SwipeRefreshLayout extends ViewGroup implements C1052v, C1048r {

    /* renamed from: C0 */
    public static final int f6972C0 = 0;

    /* renamed from: D0 */
    public static final int f6973D0 = 1;

    /* renamed from: E0 */
    public static final int f6974E0 = -1;
    @C0224v0

    /* renamed from: F0 */
    static final int f6975F0 = 40;
    @C0224v0

    /* renamed from: G0 */
    static final int f6976G0 = 56;

    /* renamed from: H0 */
    private static final String f6977H0 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: I0 */
    private static final int f6978I0 = 255;

    /* renamed from: J0 */
    private static final int f6979J0 = 76;

    /* renamed from: K0 */
    private static final float f6980K0 = 2.0f;

    /* renamed from: L0 */
    private static final int f6981L0 = -1;

    /* renamed from: M0 */
    private static final float f6982M0 = 0.5f;

    /* renamed from: N0 */
    private static final float f6983N0 = 0.8f;

    /* renamed from: O0 */
    private static final int f6984O0 = 150;

    /* renamed from: P0 */
    private static final int f6985P0 = 300;

    /* renamed from: Q0 */
    private static final int f6986Q0 = 200;

    /* renamed from: R0 */
    private static final int f6987R0 = 200;

    /* renamed from: S0 */
    private static final int f6988S0 = -328966;

    /* renamed from: T0 */
    private static final int f6989T0 = 64;

    /* renamed from: U0 */
    private static final int[] f6990U0 = {16842766};

    /* renamed from: A0 */
    private final Animation f6991A0;

    /* renamed from: B0 */
    private final Animation f6992B0;

    /* renamed from: N */
    boolean f6993N;

    /* renamed from: O */
    private int f6994O;

    /* renamed from: P */
    private float f6995P;

    /* renamed from: Q */
    private float f6996Q;

    /* renamed from: R */
    private final C1053w f6997R;

    /* renamed from: S */
    private final C1049s f6998S;

    /* renamed from: T */
    private final int[] f6999T;

    /* renamed from: U */
    private final int[] f7000U;

    /* renamed from: V */
    private boolean f7001V;

    /* renamed from: W */
    private int f7002W;

    /* renamed from: a */
    private View f7003a;

    /* renamed from: a0 */
    int f7004a0;

    /* renamed from: b */
    C1814j f7005b;

    /* renamed from: b0 */
    private float f7006b0;

    /* renamed from: c0 */
    private float f7007c0;

    /* renamed from: d0 */
    private boolean f7008d0;

    /* renamed from: e0 */
    private int f7009e0;

    /* renamed from: f0 */
    boolean f7010f0;

    /* renamed from: g0 */
    private boolean f7011g0;

    /* renamed from: h0 */
    private final DecelerateInterpolator f7012h0;

    /* renamed from: i0 */
    C1815a f7013i0;

    /* renamed from: j0 */
    private int f7014j0;

    /* renamed from: k0 */
    protected int f7015k0;

    /* renamed from: l0 */
    float f7016l0;

    /* renamed from: m0 */
    protected int f7017m0;

    /* renamed from: n0 */
    int f7018n0;

    /* renamed from: o0 */
    int f7019o0;

    /* renamed from: p0 */
    C1817b f7020p0;

    /* renamed from: q0 */
    private Animation f7021q0;

    /* renamed from: r0 */
    private Animation f7022r0;

    /* renamed from: s0 */
    private Animation f7023s0;

    /* renamed from: t0 */
    private Animation f7024t0;

    /* renamed from: u0 */
    private Animation f7025u0;

    /* renamed from: v0 */
    boolean f7026v0;

    /* renamed from: w0 */
    private int f7027w0;

    /* renamed from: x0 */
    boolean f7028x0;

    /* renamed from: y0 */
    private C1813i f7029y0;

    /* renamed from: z0 */
    private AnimationListener f7030z0;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C1805a implements AnimationListener {
        C1805a() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f6993N) {
                swipeRefreshLayout.f7020p0.setAlpha(255);
                SwipeRefreshLayout.this.f7020p0.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f7026v0) {
                    C1814j jVar = swipeRefreshLayout2.f7005b;
                    if (jVar != null) {
                        jVar.mo8147a();
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f7004a0 = swipeRefreshLayout3.f7013i0.getTop();
                return;
            }
            swipeRefreshLayout.mo8108c();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C1806b extends Animation {
        C1806b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C1807c extends Animation {
        C1807c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C1808d extends Animation {

        /* renamed from: a */
        final /* synthetic */ int f7035a;

        /* renamed from: b */
        final /* synthetic */ int f7036b;

        C1808d(int i, int i2) {
            this.f7035a = i;
            this.f7036b = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C1817b bVar = SwipeRefreshLayout.this.f7020p0;
            int i = this.f7035a;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f7036b - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C1809e implements AnimationListener {
        C1809e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7010f0) {
                swipeRefreshLayout.mo8103a((AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C1810f extends Animation {
        C1810f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7028x0) {
                i = swipeRefreshLayout.f7018n0 - Math.abs(swipeRefreshLayout.f7017m0);
            } else {
                i = swipeRefreshLayout.f7018n0;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f7015k0;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f7013i0.getTop());
            SwipeRefreshLayout.this.f7020p0.mo8156a(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C1811g extends Animation {
        C1811g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo8102a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C1812h extends Animation {
        C1812h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f7016l0;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo8102a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C1813i {
        /* renamed from: a */
        boolean mo8146a(@C0193h0 SwipeRefreshLayout swipeRefreshLayout, @C0195i0 View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C1814j {
        /* renamed from: a */
        void mo8147a();
    }

    public SwipeRefreshLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m9709b(AnimationListener animationListener) {
        this.f7013i0.setVisibility(0);
        this.f7020p0.setAlpha(255);
        this.f7021q0 = new C1806b();
        this.f7021q0.setDuration((long) this.f7002W);
        if (animationListener != null) {
            this.f7013i0.mo8149a(animationListener);
        }
        this.f7013i0.clearAnimation();
        this.f7013i0.startAnimation(this.f7021q0);
    }

    /* renamed from: d */
    private void m9712d() {
        this.f7013i0 = new C1815a(getContext(), f6988S0);
        this.f7020p0 = new C1817b(getContext());
        this.f7020p0.mo8166b(1);
        this.f7013i0.setImageDrawable(this.f7020p0);
        this.f7013i0.setVisibility(8);
        addView(this.f7013i0);
    }

    /* renamed from: e */
    private void m9714e() {
        if (this.f7003a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f7013i0)) {
                    this.f7003a = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m9715f() {
        this.f7024t0 = m9702a(this.f7020p0.getAlpha(), 255);
    }

    /* renamed from: g */
    private void m9716g() {
        this.f7023s0 = m9702a(this.f7020p0.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f7013i0.getBackground().setAlpha(i);
        this.f7020p0.setAlpha(i);
    }

    /* renamed from: a */
    public void mo8105a(boolean z, int i, int i2) {
        this.f7010f0 = z;
        this.f7017m0 = i;
        this.f7018n0 = i2;
        this.f7028x0 = true;
        mo8108c();
        this.f6993N = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8108c() {
        this.f7013i0.clearAnimation();
        this.f7020p0.stop();
        this.f7013i0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f7010f0) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f7017m0 - this.f7004a0);
        }
        this.f7004a0 = this.f7013i0.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f6998S.mo5177a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f6998S.mo5176a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f6998S.mo5182a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f6998S.mo5180a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f7014j0;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f6997R.mo5189a();
    }

    public int getProgressCircleDiameter() {
        return this.f7027w0;
    }

    public int getProgressViewEndOffset() {
        return this.f7018n0;
    }

    public int getProgressViewStartOffset() {
        return this.f7017m0;
    }

    public boolean hasNestedScrollingParent() {
        return this.f6998S.mo5175a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f6998S.mo5184b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo8108c();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m9714e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7011g0 && actionMasked == 0) {
            this.f7011g0 = false;
        }
        if (!isEnabled() || this.f7011g0 || mo8106a() || this.f6993N || this.f7001V) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f7009e0;
                    if (i == -1) {
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m9713d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m9704a(motionEvent);
                    }
                }
            }
            this.f7008d0 = false;
            this.f7009e0 = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f7017m0 - this.f7013i0.getTop());
            this.f7009e0 = motionEvent.getPointerId(0);
            this.f7008d0 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f7009e0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f7007c0 = motionEvent.getY(findPointerIndex2);
        }
        return this.f7008d0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f7003a == null) {
                m9714e();
            }
            View view = this.f7003a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f7013i0.getMeasuredWidth();
                int measuredHeight2 = this.f7013i0.getMeasuredHeight();
                C1815a aVar = this.f7013i0;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = i5 - i6;
                int i8 = this.f7004a0;
                aVar.layout(i7, i8, i5 + i6, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7003a == null) {
            m9714e();
        }
        View view = this.f7003a;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), C6637f.f18605b), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), C6637f.f18605b));
            this.f7013i0.measure(MeasureSpec.makeMeasureSpec(this.f7027w0, C6637f.f18605b), MeasureSpec.makeMeasureSpec(this.f7027w0, C6637f.f18605b));
            this.f7014j0 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f7013i0) {
                    this.f7014j0 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f6996Q;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f6996Q = 0.0f;
                } else {
                    this.f6996Q = f - f2;
                    iArr[1] = i2;
                }
                m9710c(this.f6996Q);
            }
        }
        if (this.f7028x0 && i2 > 0 && this.f6996Q == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f7013i0.setVisibility(8);
        }
        int[] iArr2 = this.f6999T;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f7000U);
        int i5 = i4 + this.f7000U[1];
        if (i5 < 0 && !mo8106a()) {
            this.f6996Q += (float) Math.abs(i5);
            m9710c(this.f6996Q);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f6997R.mo5192a(view, view2, i);
        startNestedScroll(i & 2);
        this.f6996Q = 0.0f;
        this.f7001V = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f7011g0 && !this.f6993N && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f6997R.mo5190a(view);
        this.f7001V = false;
        float f = this.f6996Q;
        if (f > 0.0f) {
            m9707b(f);
            this.f6996Q = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7011g0 && actionMasked == 0) {
            this.f7011g0 = false;
        }
        if (!isEnabled() || this.f7011g0 || mo8106a() || this.f6993N || this.f7001V) {
            return false;
        }
        if (actionMasked == 0) {
            this.f7009e0 = motionEvent.getPointerId(0);
            this.f7008d0 = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f7009e0);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f7008d0) {
                float y = (motionEvent.getY(findPointerIndex) - this.f7006b0) * 0.5f;
                this.f7008d0 = false;
                m9707b(y);
            }
            this.f7009e0 = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f7009e0);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m9713d(y2);
            if (this.f7008d0) {
                float f = (y2 - this.f7006b0) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m9710c(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f7009e0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m9704a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.f7003a instanceof AbsListView)) {
            View view = this.f7003a;
            if (view == null || C0962e0.m5547p0(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f7013i0.setScaleX(f);
        this.f7013i0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@C0202m int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@C0198k int... iArr) {
        m9714e();
        this.f7020p0.mo8163a(iArr);
    }

    public void setColorSchemeResources(@C0202m int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0841b.m4915a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f6995P = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo8108c();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f6998S.mo5174a(z);
    }

    public void setOnChildScrollUpCallback(@C0195i0 C1813i iVar) {
        this.f7029y0 = iVar;
    }

    public void setOnRefreshListener(@C0195i0 C1814j jVar) {
        this.f7005b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@C0198k int i) {
        this.f7013i0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@C0202m int i) {
        setProgressBackgroundColorSchemeColor(C0841b.m4915a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f6993N == z) {
            m9705a(z, false);
            return;
        }
        this.f6993N = z;
        if (!this.f7028x0) {
            i = this.f7018n0 + this.f7017m0;
        } else {
            i = this.f7018n0;
        }
        setTargetOffsetTopAndBottom(i - this.f7004a0);
        this.f7026v0 = false;
        m9709b(this.f7030z0);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f7027w0 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f7027w0 = (int) (displayMetrics.density * 40.0f);
            }
            this.f7013i0.setImageDrawable(null);
            this.f7020p0.mo8166b(i);
            this.f7013i0.setImageDrawable(this.f7020p0);
        }
    }

    public void setSlingshotDistance(@C0199k0 int i) {
        this.f7019o0 = i;
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f7013i0.bringToFront();
        C0962e0.m5513h((View) this.f7013i0, i);
        this.f7004a0 = this.f7013i0.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f6998S.mo5185b(i);
    }

    public void stopNestedScroll() {
        this.f6998S.mo5188d();
    }

    public SwipeRefreshLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6993N = false;
        this.f6995P = -1.0f;
        this.f6999T = new int[2];
        this.f7000U = new int[2];
        this.f7009e0 = -1;
        this.f7014j0 = -1;
        this.f7030z0 = new C1805a();
        this.f6991A0 = new C1810f();
        this.f6992B0 = new C1811g();
        this.f6994O = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7002W = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f7012h0 = new DecelerateInterpolator(f6980K0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f7027w0 = (int) (displayMetrics.density * 40.0f);
        m9712d();
        setChildrenDrawingOrderEnabled(true);
        this.f7018n0 = (int) (displayMetrics.density * 64.0f);
        this.f6995P = (float) this.f7018n0;
        this.f6997R = new C1053w(this);
        this.f6998S = new C1049s(this);
        setNestedScrollingEnabled(true);
        int i = -this.f7027w0;
        this.f7004a0 = i;
        this.f7017m0 = i;
        mo8102a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6990U0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m9713d(float f) {
        float f2 = this.f7007c0;
        float f3 = f - f2;
        int i = this.f6994O;
        if (f3 > ((float) i) && !this.f7008d0) {
            this.f7006b0 = f2 + ((float) i);
            this.f7008d0 = true;
            this.f7020p0.setAlpha(76);
        }
    }

    /* renamed from: a */
    public void mo8104a(boolean z, int i) {
        this.f7018n0 = i;
        this.f7010f0 = z;
        this.f7013i0.invalidate();
    }

    /* renamed from: b */
    public boolean mo8107b() {
        return this.f6993N;
    }

    /* renamed from: b */
    private void m9707b(float f) {
        if (f > this.f6995P) {
            m9705a(true, true);
            return;
        }
        this.f6993N = false;
        this.f7020p0.mo8165b(0.0f, 0.0f);
        C1809e eVar = null;
        if (!this.f7010f0) {
            eVar = new C1809e();
        }
        m9708b(this.f7004a0, eVar);
        this.f7020p0.mo8162a(false);
    }

    /* renamed from: c */
    private void m9710c(float f) {
        this.f7020p0.mo8162a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f6995P));
        double d = (double) min;
        Double.isNaN(d);
        float max = (((float) Math.max(d - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f6995P;
        int i = this.f7019o0;
        if (i <= 0) {
            i = this.f7028x0 ? this.f7018n0 - this.f7017m0 : this.f7018n0;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * f6980K0) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * f6980K0;
        int i2 = this.f7017m0 + ((int) ((f2 * min) + (f2 * f3 * f6980K0)));
        if (this.f7013i0.getVisibility() != 0) {
            this.f7013i0.setVisibility(0);
        }
        if (!this.f7010f0) {
            this.f7013i0.setScaleX(1.0f);
            this.f7013i0.setScaleY(1.0f);
        }
        if (this.f7010f0) {
            setAnimationProgress(Math.min(1.0f, f / this.f6995P));
        }
        if (f < this.f6995P) {
            if (this.f7020p0.getAlpha() > 76 && !m9706a(this.f7023s0)) {
                m9716g();
            }
        } else if (this.f7020p0.getAlpha() < 255 && !m9706a(this.f7024t0)) {
            m9715f();
        }
        this.f7020p0.mo8165b(0.0f, Math.min(f6983N0, max * f6983N0));
        this.f7020p0.mo8156a(Math.min(1.0f, max));
        this.f7020p0.mo8169c((((max * 0.4f) - 16.0f) + (f3 * f6980K0)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f7004a0);
    }

    /* renamed from: a */
    private void m9705a(boolean z, boolean z2) {
        if (this.f6993N != z) {
            this.f7026v0 = z2;
            m9714e();
            this.f6993N = z;
            if (this.f6993N) {
                m9703a(this.f7004a0, this.f7030z0);
            } else {
                mo8103a(this.f7030z0);
            }
        }
    }

    /* renamed from: b */
    private void m9708b(int i, AnimationListener animationListener) {
        if (this.f7010f0) {
            m9711c(i, animationListener);
            return;
        }
        this.f7015k0 = i;
        this.f6992B0.reset();
        this.f6992B0.setDuration(200);
        this.f6992B0.setInterpolator(this.f7012h0);
        if (animationListener != null) {
            this.f7013i0.mo8149a(animationListener);
        }
        this.f7013i0.clearAnimation();
        this.f7013i0.startAnimation(this.f6992B0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8103a(AnimationListener animationListener) {
        this.f7022r0 = new C1807c();
        this.f7022r0.setDuration(150);
        this.f7013i0.mo8149a(animationListener);
        this.f7013i0.clearAnimation();
        this.f7013i0.startAnimation(this.f7022r0);
    }

    /* renamed from: a */
    private Animation m9702a(int i, int i2) {
        C1808d dVar = new C1808d(i, i2);
        dVar.setDuration(300);
        this.f7013i0.mo8149a((AnimationListener) null);
        this.f7013i0.clearAnimation();
        this.f7013i0.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: a */
    public boolean mo8106a() {
        C1813i iVar = this.f7029y0;
        if (iVar != null) {
            return iVar.mo8146a(this, this.f7003a);
        }
        View view = this.f7003a;
        if (view instanceof ListView) {
            return C1116i.m6342a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: a */
    private boolean m9706a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: a */
    private void m9703a(int i, AnimationListener animationListener) {
        this.f7015k0 = i;
        this.f6991A0.reset();
        this.f6991A0.setDuration(200);
        this.f6991A0.setInterpolator(this.f7012h0);
        if (animationListener != null) {
            this.f7013i0.mo8149a(animationListener);
        }
        this.f7013i0.clearAnimation();
        this.f7013i0.startAnimation(this.f6991A0);
    }

    /* renamed from: c */
    private void m9711c(int i, AnimationListener animationListener) {
        this.f7015k0 = i;
        this.f7016l0 = this.f7013i0.getScaleX();
        this.f7025u0 = new C1812h();
        this.f7025u0.setDuration(150);
        if (animationListener != null) {
            this.f7013i0.mo8149a(animationListener);
        }
        this.f7013i0.clearAnimation();
        this.f7013i0.startAnimation(this.f7025u0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8102a(float f) {
        int i = this.f7015k0;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f7017m0 - i)) * f))) - this.f7013i0.getTop());
    }

    /* renamed from: a */
    private void m9704a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7009e0) {
            this.f7009e0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
