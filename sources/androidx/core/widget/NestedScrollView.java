package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0953b0;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1038q;
import androidx.core.p034l.C1049s;
import androidx.core.p034l.C1051u;
import androidx.core.p034l.C1053w;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1024f;
import java.util.ArrayList;
import p076c.p112d.p148d.p150g.C6637f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class NestedScrollView extends FrameLayout implements C1051u, C1038q, C0953b0 {

    /* renamed from: o0 */
    static final int f4827o0 = 250;

    /* renamed from: p0 */
    static final float f4828p0 = 0.5f;

    /* renamed from: q0 */
    private static final String f4829q0 = "NestedScrollView";

    /* renamed from: r0 */
    private static final int f4830r0 = -1;

    /* renamed from: s0 */
    private static final C1102a f4831s0 = new C1102a();

    /* renamed from: t0 */
    private static final int[] f4832t0 = {16843130};

    /* renamed from: N */
    private OverScroller f4833N;

    /* renamed from: O */
    private EdgeEffect f4834O;

    /* renamed from: P */
    private EdgeEffect f4835P;

    /* renamed from: Q */
    private int f4836Q;

    /* renamed from: R */
    private boolean f4837R;

    /* renamed from: S */
    private boolean f4838S;

    /* renamed from: T */
    private View f4839T;

    /* renamed from: U */
    private boolean f4840U;

    /* renamed from: V */
    private VelocityTracker f4841V;

    /* renamed from: W */
    private boolean f4842W;

    /* renamed from: a */
    private long f4843a;

    /* renamed from: a0 */
    private boolean f4844a0;

    /* renamed from: b */
    private final Rect f4845b;

    /* renamed from: b0 */
    private int f4846b0;

    /* renamed from: c0 */
    private int f4847c0;

    /* renamed from: d0 */
    private int f4848d0;

    /* renamed from: e0 */
    private int f4849e0;

    /* renamed from: f0 */
    private final int[] f4850f0;

    /* renamed from: g0 */
    private final int[] f4851g0;

    /* renamed from: h0 */
    private int f4852h0;

    /* renamed from: i0 */
    private int f4853i0;

    /* renamed from: j0 */
    private SavedState f4854j0;

    /* renamed from: k0 */
    private final C1053w f4855k0;

    /* renamed from: l0 */
    private final C1049s f4856l0;

    /* renamed from: m0 */
    private float f4857m0;

    /* renamed from: n0 */
    private C1103b f4858n0;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C1101a();

        /* renamed from: a */
        public int f4859a;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        static class C1101a implements Creator<SavedState> {
            C1101a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f4859a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4859a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4859a = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C1102a extends C0947a {
        C1102a() {
        }

        /* renamed from: a */
        public boolean mo4750a(View view, int i, Bundle bundle) {
            if (super.mo4750a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo5286b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo5286b(0, max);
                return true;
            }
        }

        /* renamed from: b */
        public void mo4753b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4753b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1024f.m5985a((AccessibilityRecord) accessibilityEvent, nestedScrollView.getScrollX());
            C1024f.m5988b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public void mo4749a(View view, C1016d dVar) {
            super.mo4749a(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.mo4937a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    dVar.mo5024s(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        dVar.mo4930a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        dVar.mo4930a(4096);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C1103b {
        /* renamed from: a */
        void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m6236a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: c */
    private boolean m6248c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m6249d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m6251e(int i) {
        if (i == 0) {
            return;
        }
        if (this.f4844a0) {
            mo5276a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: f */
    private void m6252f() {
        if (getOverScrollMode() == 2) {
            this.f4834O = null;
            this.f4835P = null;
        } else if (this.f4834O == null) {
            Context context = getContext();
            this.f4834O = new EdgeEffect(context);
            this.f4835P = new EdgeEffect(context);
        }
    }

    /* renamed from: g */
    private void m6253g() {
        VelocityTracker velocityTracker = this.f4841V;
        if (velocityTracker == null) {
            this.f4841V = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f4857m0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f4857m0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f4857m0;
    }

    /* renamed from: h */
    private void m6254h() {
        this.f4833N = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4846b0 = viewConfiguration.getScaledTouchSlop();
        this.f4847c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4848d0 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: i */
    private void m6255i() {
        if (this.f4841V == null) {
            this.f4841V = VelocityTracker.obtain();
        }
    }

    /* renamed from: j */
    private void m6256j() {
        VelocityTracker velocityTracker = this.f4841V;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4841V = null;
        }
    }

    /* renamed from: a */
    public void mo1888a(@C0193h0 View view, int i, int i2, int i3, int i4, int i5, @C0193h0 int[] iArr) {
        m6238a(i4, i5, iArr);
    }

    /* renamed from: a */
    public boolean mo1890a(@C0193h0 View view, @C0193h0 View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo1892b(@C0193h0 View view, @C0193h0 View view2, int i, int i2) {
        this.f4855k0.mo5193a(view, view2, i, i2);
        startNestedScroll(2, i2);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f4833N.isFinished()) {
            this.f4833N.computeScrollOffset();
            int currY = this.f4833N.getCurrY();
            int i = currY - this.f4853i0;
            this.f4853i0 = currY;
            int[] iArr = this.f4851g0;
            boolean z = false;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i, iArr, null, 1);
            int i2 = i - this.f4851g0[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo5279a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f4851g0;
                iArr2[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i3, this.f4850f0, 1, iArr2);
                i2 = i3 - this.f4851g0[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m6252f();
                    if (i2 < 0) {
                        if (this.f4834O.isFinished()) {
                            this.f4834O.onAbsorb((int) this.f4833N.getCurrVelocity());
                        }
                    } else if (this.f4835P.isFinished()) {
                        this.f4835P.onAbsorb((int) this.f4833N.getCurrVelocity());
                    }
                }
                m6247c();
            }
            if (!this.f4833N.isFinished()) {
                C0962e0.m5561u0(this);
            }
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo5280a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4856l0.mo5177a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4856l0.mo5176a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f4856l0.mo5183a(i, i2, iArr, iArr2, i3);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5, @C0193h0 int[] iArr2) {
        this.f4856l0.mo5172a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f4834O != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f4834O.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f4834O.setSize(width, height);
                if (this.f4834O.draw(canvas)) {
                    C0962e0.m5561u0(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f4835P.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f4835P.setSize(width2, height2);
                if (this.f4835P.draw(canvas)) {
                    C0962e0.m5561u0(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f4855k0.mo5189a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent(int i) {
        return this.f4856l0.mo5178a(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f4856l0.mo5184b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4838S = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f4840U) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f4840U) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f4849e0;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            sb.toString();
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f4836Q) > this.f4846b0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f4840U = true;
                                this.f4836Q = y;
                                m6255i();
                                this.f4841V.addMovement(motionEvent);
                                this.f4852h0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m6239a(motionEvent);
                    }
                }
            }
            this.f4840U = false;
            this.f4849e0 = -1;
            m6256j();
            if (this.f4833N.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0962e0.m5561u0(this);
            }
            stopNestedScroll(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m6248c((int) motionEvent.getX(), y2)) {
                this.f4840U = false;
                m6256j();
            } else {
                this.f4836Q = y2;
                this.f4849e0 = motionEvent.getPointerId(0);
                m6253g();
                this.f4841V.addMovement(motionEvent);
                this.f4833N.computeScrollOffset();
                this.f4840U = !this.f4833N.isFinished();
                startNestedScroll(2, 0);
            }
        }
        return this.f4840U;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f4837R = false;
        View view = this.f4839T;
        if (view != null && m6244a(view, (View) this)) {
            m6245b(this.f4839T);
        }
        this.f4839T = null;
        if (!this.f4838S) {
            if (this.f4854j0 != null) {
                scrollTo(getScrollX(), this.f4854j0.f4859a);
                this.f4854j0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m6236a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4838S = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4842W && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, C6637f.f18605b));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo5285b((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1889a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m6238a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1892b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = C13959t.f40839S1;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m6242a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4854j0 = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4859a = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C1103b bVar = this.f4858n0;
        if (bVar != null) {
            bVar.mo710a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m6243a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f4845b);
            offsetDescendantRectToMyCoords(findFocus, this.f4845b);
            m6251e(mo5275a(this.f4845b));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1890a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1886a(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m6255i();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4852h0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f4852h0);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4841V;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f4848d0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4849e0);
                if (Math.abs(yVelocity) > this.f4847c0) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo5285b(i);
                    }
                } else if (this.f4833N.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0962e0.m5561u0(this);
                }
                this.f4849e0 = -1;
                m6250e();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f4849e0);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f4849e0);
                    sb.append(" in onTouchEvent");
                    sb.toString();
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f4836Q - y;
                    if (dispatchNestedPreScroll(0, i2, this.f4851g0, this.f4850f0, 0)) {
                        i2 -= this.f4851g0[1];
                        this.f4852h0 += this.f4850f0[1];
                    }
                    if (!this.f4840U && Math.abs(i2) > this.f4846b0) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4840U = true;
                        if (i2 > 0) {
                            i2 -= this.f4846b0;
                        } else {
                            i2 += this.f4846b0;
                        }
                    }
                    int i3 = i2;
                    if (this.f4840U) {
                        this.f4836Q = y - this.f4850f0[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i4 = scrollRange;
                        if (mo5279a(0, i3, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.f4841V.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i5 = i3 - scrollY2;
                        int[] iArr = this.f4851g0;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i5, this.f4850f0, 0, iArr);
                        int i6 = this.f4836Q;
                        int[] iArr2 = this.f4850f0;
                        this.f4836Q = i6 - iArr2[1];
                        this.f4852h0 += iArr2[1];
                        if (z) {
                            int i7 = i3 - this.f4851g0[1];
                            m6252f();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C1112e.m6324a(this.f4834O, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f4835P.isFinished()) {
                                    this.f4835P.onRelease();
                                }
                            } else if (i8 > i4) {
                                C1112e.m6324a(this.f4835P, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f4834O.isFinished()) {
                                    this.f4834O.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f4834O;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f4835P.isFinished())) {
                                C0962e0.m5561u0(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4840U && getChildCount() > 0 && this.f4833N.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0962e0.m5561u0(this);
                }
                this.f4849e0 = -1;
                m6250e();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4836Q = (int) motionEvent2.getY(actionIndex);
                this.f4849e0 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m6239a(motionEvent);
                this.f4836Q = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f4849e0));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f4833N.isFinished();
            this.f4840U = z2;
            if (z2) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.f4833N.isFinished()) {
                m6247c();
            }
            this.f4836Q = (int) motionEvent.getY();
            this.f4849e0 = motionEvent2.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f4841V;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4837R) {
            m6245b(view2);
        } else {
            this.f4839T = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m6241a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m6256j();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f4837R = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int a = m6236a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int a2 = m6236a(i2, height, height2);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f4842W) {
            this.f4842W = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f4856l0.mo5174a(z);
    }

    public void setOnScrollChangeListener(@C0195i0 C1103b bVar) {
        this.f4858n0 = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f4844a0 = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i, int i2) {
        return this.f4856l0.mo5179a(i, i2);
    }

    public void stopNestedScroll(int i) {
        this.f4856l0.mo5187c(i);
    }

    public NestedScrollView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m6238a(int i, int i2, @C0195i0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4856l0.mo5172a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f4856l0.mo5181a(i, i2, i3, i4, iArr, i5);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4845b = new Rect();
        this.f4837R = true;
        this.f4838S = false;
        this.f4839T = null;
        this.f4840U = false;
        this.f4844a0 = true;
        this.f4849e0 = -1;
        this.f4850f0 = new int[2];
        this.f4851g0 = new int[2];
        m6254h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4832t0, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4855k0 = new C1053w(this);
        this.f4856l0 = new C1049s(this);
        setNestedScrollingEnabled(true);
        C0962e0.m5443a((View) this, (C0947a) f4831s0);
    }

    /* renamed from: b */
    public boolean mo5287b() {
        return this.f4844a0;
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4856l0.mo5180a(i, i2, i3, i4, iArr);
    }

    /* renamed from: b */
    private boolean m6246b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m6237a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m6251e(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: e */
    private void m6250e() {
        this.f4840U = false;
        m6256j();
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.f4834O;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f4835P.onRelease();
        }
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: d */
    public boolean mo5290d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f4845b.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4845b;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4845b.top = getScrollY() - height;
            Rect rect2 = this.f4845b;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4845b;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m6246b(i, i2, rect3.bottom);
    }

    /* renamed from: a */
    public void mo1886a(@C0193h0 View view, int i) {
        this.f4855k0.mo5191a(view, i);
        stopNestedScroll(i);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: c */
    public boolean mo5288c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f4845b;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f4845b.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f4845b;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f4845b;
        return m6246b(i, rect3.top, rect3.bottom);
    }

    /* renamed from: a */
    public void mo1887a(@C0193h0 View view, int i, int i2, int i3, int i4, int i5) {
        m6238a(i4, i5, (int[]) null);
    }

    /* renamed from: b */
    public final void mo5286b(int i, int i2) {
        mo5276a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    private void m6245b(View view) {
        view.getDrawingRect(this.f4845b);
        offsetDescendantRectToMyCoords(view, this.f4845b);
        int a = mo5275a(this.f4845b);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: a */
    public void mo1889a(@C0193h0 View view, int i, int i2, @C0193h0 int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: a */
    public boolean mo5277a() {
        return this.f4842W;
    }

    /* renamed from: a */
    public boolean mo5280a(@C0193h0 KeyEvent keyEvent) {
        this.f4845b.setEmpty();
        boolean d = m6249d();
        boolean z = false;
        int i = C13959t.f40839S1;
        if (!d) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, C13959t.f40839S1);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(C13959t.f40839S1))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z = !keyEvent.isAltPressed() ? mo5278a(33) : mo5288c(33);
            } else if (keyCode == 20) {
                z = !keyEvent.isAltPressed() ? mo5278a((int) C13959t.f40839S1) : mo5288c(C13959t.f40839S1);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo5290d(i);
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo5285b(int i) {
        if (getChildCount() > 0) {
            this.f4833N.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m6240a(true);
        }
    }

    /* renamed from: c */
    private void m6247c() {
        this.f4833N.abortAnimation();
        stopNestedScroll(1);
    }

    /* renamed from: a */
    private void m6239a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4849e0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4836Q = (int) motionEvent.getY(i);
            this.f4849e0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4841V;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5279a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.hasNestedScrollingParent(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f4833N
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo5279a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private View m6237a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public boolean mo5278a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m6243a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m6251e(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f4845b);
            offsetDescendantRectToMyCoords(findNextFocus, this.f4845b);
            m6251e(mo5275a(this.f4845b));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m6242a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m6242a(View view) {
        return !m6243a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m6243a(View view, int i, int i2) {
        view.getDrawingRect(this.f4845b);
        offsetDescendantRectToMyCoords(view, this.f4845b);
        return this.f4845b.bottom + i >= getScrollY() && this.f4845b.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo5276a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f4843a > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f4833N.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                m6240a(false);
            } else {
                if (!this.f4833N.isFinished()) {
                    m6247c();
                }
                scrollBy(i, i2);
            }
            this.f4843a = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m6240a(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f4853i0 = getScrollY();
        C0962e0.m5561u0(this);
    }

    /* renamed from: a */
    private boolean m6241a(Rect rect, boolean z) {
        int a = mo5275a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo5276a(0, a);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo5275a(Rect rect) {
        int i;
        int i2;
        int i3 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i5;
            }
            i3 = Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top < scrollY && rect.bottom < i5) {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i3 = Math.max(i, -getScrollY());
        }
        return i3;
    }

    /* renamed from: a */
    private static boolean m6244a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m6244a((View) parent, view2)) {
            z = false;
        }
        return z;
    }
}
