package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import androidx.core.p033k.C0944i;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0953b0;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0983f0;
import androidx.core.p034l.C1007o;
import androidx.core.p034l.C1035p;
import androidx.core.p034l.C1038q;
import androidx.core.p034l.C1049s;
import androidx.core.p034l.p035o0.C1009b;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1018b;
import androidx.core.p034l.p035o0.C1016d.C1019c;
import androidx.core.p038os.C1072n;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.C1614R;
import androidx.recyclerview.widget.C1780y.C1781a;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p076c.p112d.p148d.p150g.C6637f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class RecyclerView extends ViewGroup implements C0953b0, C1035p, C1038q {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (VERSION.SDK_INT >= 21);
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new C1632c();
    C1780y mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    C1638g mAdapter;
    C1674a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C1641j mChildDrawingOrderCallback;
    C1705g mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    @C0193h0
    private C1642k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    @C0224v0
    boolean mFirstLayoutComplete;
    C1740l mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C1659s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    C1644l mItemAnimator;
    private C1647c mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C1650n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    @C0224v0
    C1651o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1666y mObserver;
    private List<C1657q> mOnChildAttachStateListeners;
    private C1658r mOnFlingListener;
    private final ArrayList<C1659s> mOnItemTouchListeners;
    @C0224v0
    final List<C1635d0> mPendingAccessibilityImportanceChange;
    private SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C1742b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1664w mRecycler;
    C1665x mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C1660t mScrollListener;
    private List<C1660t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C1049s mScrollingChildHelper;
    final State mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C1633c0 mViewFlinger;
    private final C1725b mViewInfoProcessCallback;
    final C1723h0 mViewInfoStore;

    @C0207n0({C0208a.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C1625a();
        Parcelable mLayoutState;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        static class C1625a implements ClassLoaderCreator<SavedState> {
            C1625a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C1651o.class.getClassLoader();
            }
            this.mLayoutState = parcel.readParcelable(classLoader);
        }

        /* access modifiers changed from: 0000 */
        public void copyFrom(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class State {
        static final int STEP_ANIMATIONS = 4;
        static final int STEP_LAYOUT = 2;
        static final int STEP_START = 1;
        private SparseArray<Object> mData;
        int mDeletedInvisibleItemCountSincePreviousLayout = 0;
        long mFocusedItemId;
        int mFocusedItemPosition;
        int mFocusedSubChildId;
        boolean mInPreLayout = false;
        boolean mIsMeasuring = false;
        int mItemCount = 0;
        int mLayoutStep = 1;
        int mPreviousLayoutItemCount = 0;
        int mRemainingScrollHorizontal;
        int mRemainingScrollVertical;
        boolean mRunPredictiveAnimations = false;
        boolean mRunSimpleAnimations = false;
        boolean mStructureChanged = false;
        int mTargetPosition = -1;
        boolean mTrackOldChangeHolders = false;

        /* access modifiers changed from: 0000 */
        public void assertLayoutStep(int i) {
            if ((this.mLayoutStep & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.mLayoutStep));
                throw new IllegalStateException(sb.toString());
            }
        }

        public boolean didStructureChange() {
            return this.mStructureChanged;
        }

        public <T> T get(int i) {
            SparseArray<Object> sparseArray = this.mData;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        public int getItemCount() {
            return this.mInPreLayout ? this.mPreviousLayoutItemCount - this.mDeletedInvisibleItemCountSincePreviousLayout : this.mItemCount;
        }

        public int getRemainingScrollHorizontal() {
            return this.mRemainingScrollHorizontal;
        }

        public int getRemainingScrollVertical() {
            return this.mRemainingScrollVertical;
        }

        public int getTargetScrollPosition() {
            return this.mTargetPosition;
        }

        public boolean hasTargetScrollPosition() {
            return this.mTargetPosition != -1;
        }

        public boolean isMeasuring() {
            return this.mIsMeasuring;
        }

        public boolean isPreLayout() {
            return this.mInPreLayout;
        }

        /* access modifiers changed from: 0000 */
        public void prepareForNestedPrefetch(C1638g gVar) {
            this.mLayoutStep = 1;
            this.mItemCount = gVar.mo7325b();
            this.mInPreLayout = false;
            this.mTrackOldChangeHolders = false;
            this.mIsMeasuring = false;
        }

        public void put(int i, Object obj) {
            if (this.mData == null) {
                this.mData = new SparseArray<>();
            }
            this.mData.put(i, obj);
        }

        public void remove(int i) {
            SparseArray<Object> sparseArray = this.mData;
            if (sparseArray != null) {
                sparseArray.remove(i);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.mTargetPosition);
            sb.append(", mData=");
            sb.append(this.mData);
            sb.append(", mItemCount=");
            sb.append(this.mItemCount);
            sb.append(", mIsMeasuring=");
            sb.append(this.mIsMeasuring);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.mPreviousLayoutItemCount);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.mDeletedInvisibleItemCountSincePreviousLayout);
            sb.append(", mStructureChanged=");
            sb.append(this.mStructureChanged);
            sb.append(", mInPreLayout=");
            sb.append(this.mInPreLayout);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.mRunSimpleAnimations);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.mRunPredictiveAnimations);
            sb.append('}');
            return sb.toString();
        }

        public boolean willRunPredictiveAnimations() {
            return this.mRunPredictiveAnimations;
        }

        public boolean willRunSimpleAnimations() {
            return this.mRunSimpleAnimations;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C1626a implements Runnable {
        C1626a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C1627a0 {

        /* renamed from: a */
        private int f6241a = -1;

        /* renamed from: b */
        private RecyclerView f6242b;

        /* renamed from: c */
        private C1651o f6243c;

        /* renamed from: d */
        private boolean f6244d;

        /* renamed from: e */
        private boolean f6245e;

        /* renamed from: f */
        private View f6246f;

        /* renamed from: g */
        private final C1628a f6247g = new C1628a(0, 0);

        /* renamed from: h */
        private boolean f6248h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$a */
        public static class C1628a {

            /* renamed from: h */
            public static final int f6249h = Integer.MIN_VALUE;

            /* renamed from: a */
            private int f6250a;

            /* renamed from: b */
            private int f6251b;

            /* renamed from: c */
            private int f6252c;

            /* renamed from: d */
            private int f6253d;

            /* renamed from: e */
            private Interpolator f6254e;

            /* renamed from: f */
            private boolean f6255f;

            /* renamed from: g */
            private int f6256g;

            public C1628a(@C0199k0 int i, @C0199k0 int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* renamed from: f */
            private void m8439f() {
                if (this.f6254e != null && this.f6252c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f6252c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo7232a(int i) {
                this.f6253d = i;
            }

            @C0199k0
            /* renamed from: b */
            public int mo7236b() {
                return this.f6250a;
            }

            /* renamed from: c */
            public void mo7239c(@C0199k0 int i) {
                this.f6255f = true;
                this.f6250a = i;
            }

            /* renamed from: d */
            public void mo7241d(@C0199k0 int i) {
                this.f6255f = true;
                this.f6251b = i;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: e */
            public boolean mo7242e() {
                return this.f6253d >= 0;
            }

            public C1628a(@C0199k0 int i, @C0199k0 int i2, int i3) {
                this(i, i2, i3, null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo7235a(RecyclerView recyclerView) {
                int i = this.f6253d;
                if (i >= 0) {
                    this.f6253d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f6255f = false;
                    return;
                }
                if (this.f6255f) {
                    m8439f();
                    recyclerView.mViewFlinger.mo7248a(this.f6250a, this.f6251b, this.f6252c, this.f6254e);
                    this.f6256g++;
                    int i2 = this.f6256g;
                    this.f6255f = false;
                } else {
                    this.f6256g = 0;
                }
            }

            /* renamed from: b */
            public void mo7237b(int i) {
                this.f6255f = true;
                this.f6252c = i;
            }

            public C1628a(@C0199k0 int i, @C0199k0 int i2, int i3, @C0195i0 Interpolator interpolator) {
                this.f6253d = -1;
                this.f6255f = false;
                this.f6256g = 0;
                this.f6250a = i;
                this.f6251b = i2;
                this.f6252c = i3;
                this.f6254e = interpolator;
            }

            @C0199k0
            /* renamed from: c */
            public int mo7238c() {
                return this.f6251b;
            }

            @C0195i0
            /* renamed from: d */
            public Interpolator mo7240d() {
                return this.f6254e;
            }

            /* renamed from: a */
            public int mo7231a() {
                return this.f6252c;
            }

            /* renamed from: a */
            public void mo7234a(@C0195i0 Interpolator interpolator) {
                this.f6255f = true;
                this.f6254e = interpolator;
            }

            /* renamed from: a */
            public void mo7233a(@C0199k0 int i, @C0199k0 int i2, int i3, @C0195i0 Interpolator interpolator) {
                this.f6250a = i;
                this.f6251b = i2;
                this.f6252c = i3;
                this.f6254e = interpolator;
                this.f6255f = true;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a0$b */
        public interface C1629b {
            @C0195i0
            /* renamed from: a */
            PointF mo6973a(int i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo7216a(@C0199k0 int i, @C0199k0 int i2, @C0193h0 State state, @C0193h0 C1628a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo7218a(@C0193h0 View view, @C0193h0 State state, @C0193h0 C1628a aVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7219a(RecyclerView recyclerView, C1651o oVar) {
            recyclerView.mViewFlinger.mo7249b();
            if (this.f6248h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
                sb.toString();
            }
            this.f6242b = recyclerView;
            this.f6243c = oVar;
            int i = this.f6241a;
            if (i != -1) {
                this.f6242b.mState.mTargetPosition = i;
                this.f6245e = true;
                this.f6244d = true;
                this.f6246f = mo7220b(mo7223c());
                mo7228f();
                this.f6242b.mViewFlinger.mo7246a();
                this.f6248h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        @C0195i0
        /* renamed from: b */
        public C1651o mo7221b() {
            return this.f6243c;
        }

        /* renamed from: c */
        public int mo7223c() {
            return this.f6241a;
        }

        /* renamed from: d */
        public void mo7225d(int i) {
            this.f6241a = i;
        }

        /* renamed from: e */
        public boolean mo7227e() {
            return this.f6245e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo7228f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo7229g();

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo7230h() {
            if (this.f6245e) {
                this.f6245e = false;
                mo7229g();
                this.f6242b.mState.mTargetPosition = -1;
                this.f6246f = null;
                this.f6241a = -1;
                this.f6244d = false;
                this.f6243c.mo7416a(this);
                this.f6243c = null;
                this.f6242b = null;
            }
        }

        /* renamed from: b */
        public View mo7220b(int i) {
            return this.f6242b.mLayout.mo6989c(i);
        }

        @Deprecated
        /* renamed from: c */
        public void mo7224c(int i) {
            this.f6242b.scrollToPosition(i);
        }

        /* renamed from: d */
        public boolean mo7226d() {
            return this.f6244d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo7222b(View view) {
            if (mo7213a(view) == mo7223c()) {
                this.f6246f = view;
            }
        }

        @C0195i0
        /* renamed from: a */
        public PointF mo7214a(int i) {
            C1651o b = mo7221b();
            if (b instanceof C1629b) {
                return ((C1629b) b).mo6973a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C1629b.class.getCanonicalName());
            sb.toString();
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7215a(int i, int i2) {
            RecyclerView recyclerView = this.f6242b;
            if (this.f6241a == -1 || recyclerView == null) {
                mo7230h();
            }
            if (this.f6244d && this.f6246f == null && this.f6243c != null) {
                PointF a = mo7214a(this.f6241a);
                if (!(a == null || (a.x == 0.0f && a.y == 0.0f))) {
                    recyclerView.scrollStep((int) Math.signum(a.x), (int) Math.signum(a.y), null);
                }
            }
            this.f6244d = false;
            View view = this.f6246f;
            if (view != null) {
                if (mo7213a(view) == this.f6241a) {
                    mo7218a(this.f6246f, recyclerView.mState, this.f6247g);
                    this.f6247g.mo7235a(recyclerView);
                    mo7230h();
                } else {
                    this.f6246f = null;
                }
            }
            if (this.f6245e) {
                mo7216a(i, i2, recyclerView.mState, this.f6247g);
                boolean e = this.f6247g.mo7242e();
                this.f6247g.mo7235a(recyclerView);
                if (e && this.f6245e) {
                    this.f6244d = true;
                    recyclerView.mViewFlinger.mo7246a();
                }
            }
        }

        /* renamed from: a */
        public int mo7213a(View view) {
            return this.f6242b.getChildLayoutPosition(view);
        }

        /* renamed from: a */
        public int mo7212a() {
            return this.f6242b.mLayout.mo7467e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7217a(@C0193h0 PointF pointF) {
            float f = pointF.x;
            float f2 = f * f;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) (f2 + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C1630b implements Runnable {
        C1630b() {
        }

        public void run() {
            C1644l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo7386i();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C1631b0 {
        @C0195i0
        /* renamed from: a */
        public abstract View mo7244a(@C0193h0 C1664w wVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C1632c implements Interpolator {
        C1632c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C1633c0 implements Runnable {

        /* renamed from: N */
        OverScroller f6258N;

        /* renamed from: O */
        Interpolator f6259O = RecyclerView.sQuinticInterpolator;

        /* renamed from: P */
        private boolean f6260P = false;

        /* renamed from: Q */
        private boolean f6261Q = false;

        /* renamed from: a */
        private int f6263a;

        /* renamed from: b */
        private int f6264b;

        C1633c0() {
            this.f6258N = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* renamed from: c */
        private void m8456c() {
            RecyclerView.this.removeCallbacks(this);
            C0962e0.m5451a((View) RecyclerView.this, (Runnable) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7246a() {
            if (this.f6260P) {
                this.f6261Q = true;
            } else {
                m8456c();
            }
        }

        /* renamed from: b */
        public void mo7249b() {
            RecyclerView.this.removeCallbacks(this);
            this.f6258N.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo7249b();
                return;
            }
            this.f6261Q = false;
            this.f6260P = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f6258N;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f6263a;
                int i4 = currY - this.f6264b;
                this.f6263a = currX;
                this.f6264b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C1627a0 a0Var = recyclerView4.mLayout.f6330g;
                    if (a0Var != null && !a0Var.mo7226d() && a0Var.mo7227e()) {
                        int itemCount = RecyclerView.this.mState.getItemCount();
                        if (itemCount == 0) {
                            a0Var.mo7230h();
                        } else if (a0Var.mo7223c() >= itemCount) {
                            a0Var.mo7225d(itemCount - 1);
                            a0Var.mo7215a(i, i2);
                        } else {
                            a0Var.mo7215a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C1627a0 a0Var2 = RecyclerView.this.mLayout.f6330g;
                if ((a0Var2 != null && a0Var2.mo7226d()) || !z) {
                    mo7246a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    C1740l lVar = recyclerView6.mGapWorker;
                    if (lVar != null) {
                        lVar.mo7910a(recyclerView6, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.mo7915a();
                    }
                }
            }
            C1627a0 a0Var3 = RecyclerView.this.mLayout.f6330g;
            if (a0Var3 != null && a0Var3.mo7226d()) {
                a0Var3.mo7215a(0, 0);
            }
            this.f6260P = false;
            if (this.f6261Q) {
                m8456c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        /* renamed from: a */
        public void mo7247a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f6264b = 0;
            this.f6263a = 0;
            Interpolator interpolator = this.f6259O;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f6259O = interpolator2;
                this.f6258N = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.f6258N.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo7246a();
        }

        /* renamed from: a */
        public void mo7248a(int i, int i2, int i3, @C0195i0 Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m8455a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f6259O != interpolator) {
                this.f6259O = interpolator;
                this.f6258N = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f6264b = 0;
            this.f6263a = 0;
            RecyclerView.this.setScrollState(2);
            this.f6258N.startScroll(0, 0, i, i2, i4);
            if (VERSION.SDK_INT < 23) {
                this.f6258N.computeScrollOffset();
            }
            mo7246a();
        }

        /* renamed from: a */
        private float m8454a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        private int m8455a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m8454a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C1634d implements C1725b {
        C1634d() {
        }

        /* renamed from: a */
        public void mo7252a(C1635d0 d0Var, C1648d dVar, C1648d dVar2) {
            RecyclerView.this.animateAppearance(d0Var, dVar, dVar2);
        }

        /* renamed from: b */
        public void mo7253b(C1635d0 d0Var, @C0193h0 C1648d dVar, @C0195i0 C1648d dVar2) {
            RecyclerView.this.mRecycler.mo7571c(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, dVar, dVar2);
        }

        /* renamed from: c */
        public void mo7254c(C1635d0 d0Var, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2) {
            d0Var.mo7266a(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo7365a(d0Var, d0Var, dVar, dVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo7376c(d0Var, dVar, dVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }

        /* renamed from: a */
        public void mo7251a(C1635d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.mo7446b(d0Var.f6294a, recyclerView.mRecycler);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C1635d0 {

        /* renamed from: d0 */
        static final int f6266d0 = 1;

        /* renamed from: e0 */
        static final int f6267e0 = 2;

        /* renamed from: f0 */
        static final int f6268f0 = 4;

        /* renamed from: g0 */
        static final int f6269g0 = 8;

        /* renamed from: h0 */
        static final int f6270h0 = 16;

        /* renamed from: i0 */
        static final int f6271i0 = 32;

        /* renamed from: j0 */
        static final int f6272j0 = 128;

        /* renamed from: k0 */
        static final int f6273k0 = 256;

        /* renamed from: l0 */
        static final int f6274l0 = 512;

        /* renamed from: m0 */
        static final int f6275m0 = 1024;

        /* renamed from: n0 */
        static final int f6276n0 = 2048;

        /* renamed from: o0 */
        static final int f6277o0 = 4096;

        /* renamed from: p0 */
        static final int f6278p0 = -1;

        /* renamed from: q0 */
        static final int f6279q0 = 8192;

        /* renamed from: r0 */
        private static final List<Object> f6280r0 = Collections.emptyList();

        /* renamed from: N */
        int f6281N = -1;

        /* renamed from: O */
        int f6282O = -1;

        /* renamed from: P */
        long f6283P = -1;

        /* renamed from: Q */
        int f6284Q = -1;

        /* renamed from: R */
        int f6285R = -1;

        /* renamed from: S */
        C1635d0 f6286S = null;

        /* renamed from: T */
        C1635d0 f6287T = null;

        /* renamed from: U */
        int f6288U;

        /* renamed from: V */
        List<Object> f6289V = null;

        /* renamed from: W */
        List<Object> f6290W = null;

        /* renamed from: X */
        private int f6291X = 0;

        /* renamed from: Y */
        C1664w f6292Y = null;

        /* renamed from: Z */
        boolean f6293Z = false;
        @C0193h0

        /* renamed from: a */
        public final View f6294a;

        /* renamed from: a0 */
        private int f6295a0 = 0;

        /* renamed from: b */
        WeakReference<RecyclerView> f6296b;
        @C0224v0

        /* renamed from: b0 */
        int f6297b0 = -1;

        /* renamed from: c0 */
        RecyclerView f6298c0;

        public C1635d0(@C0193h0 View view) {
            if (view != null) {
                this.f6294a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: D */
        private void mo8948D() {
            if (this.f6289V == null) {
                this.f6289V = new ArrayList();
                this.f6290W = Collections.unmodifiableList(this.f6289V);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public void mo7255A() {
            this.f6288U &= -129;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public void mo7256B() {
            this.f6292Y.mo7571c(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public boolean mo7257C() {
            return (this.f6288U & 32) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7261a(int i, int i2, boolean z) {
            mo7259a(8);
            mo7262a(i2, z);
            this.f6281N = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo7269b(int i) {
            return (i & this.f6288U) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7270c() {
            this.f6288U &= -33;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo7271d() {
            this.f6288U &= -257;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo7272e() {
            return (this.f6288U & 16) == 0 && C0962e0.m5505f0(this.f6294a);
        }

        /* renamed from: f */
        public final int mo7273f() {
            RecyclerView recyclerView = this.f6298c0;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: g */
        public final long mo7274g() {
            return this.f6283P;
        }

        /* renamed from: h */
        public final int mo7275h() {
            return this.f6284Q;
        }

        /* renamed from: i */
        public final int mo7276i() {
            int i = this.f6285R;
            return i == -1 ? this.f6281N : i;
        }

        /* renamed from: j */
        public final int mo7277j() {
            return this.f6282O;
        }

        @Deprecated
        /* renamed from: k */
        public final int mo7278k() {
            int i = this.f6285R;
            return i == -1 ? this.f6281N : i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public List<Object> mo7279l() {
            if ((this.f6288U & 1024) != 0) {
                return f6280r0;
            }
            List<Object> list = this.f6289V;
            if (list == null || list.size() == 0) {
                return f6280r0;
            }
            return this.f6290W;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public boolean mo7280m() {
            return (this.f6288U & 512) != 0 || mo7283p();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public boolean mo7281n() {
            return (this.f6294a.getParent() == null || this.f6294a.getParent() == this.f6298c0) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public boolean mo7282o() {
            return (this.f6288U & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public boolean mo7283p() {
            return (this.f6288U & 4) != 0;
        }

        /* renamed from: q */
        public final boolean mo7284q() {
            return (this.f6288U & 16) == 0 && !C0962e0.m5505f0(this.f6294a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public boolean mo7285r() {
            return (this.f6288U & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public boolean mo7286s() {
            return this.f6292Y != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public boolean mo7287t() {
            return (this.f6288U & 256) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.f6281N);
            sb.append(" id=");
            sb.append(this.f6283P);
            sb.append(", oldPos=");
            sb.append(this.f6282O);
            sb.append(", pLpos:");
            sb.append(this.f6285R);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (mo7286s()) {
                sb2.append(" scrap ");
                sb2.append(this.f6293Z ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo7283p()) {
                sb2.append(" invalid");
            }
            if (!mo7282o()) {
                sb2.append(" unbound");
            }
            if (mo7290v()) {
                sb2.append(" update");
            }
            if (mo7285r()) {
                sb2.append(" removed");
            }
            if (mo7294z()) {
                sb2.append(" ignored");
            }
            if (mo7287t()) {
                sb2.append(" tmpDetached");
            }
            if (!mo7284q()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.f6291X);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (mo7280m()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f6294a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public boolean mo7289u() {
            return (this.f6288U & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public boolean mo7290v() {
            return (this.f6288U & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo7291w() {
            this.f6288U = 0;
            this.f6281N = -1;
            this.f6282O = -1;
            this.f6283P = -1;
            this.f6285R = -1;
            this.f6291X = 0;
            this.f6286S = null;
            this.f6287T = null;
            mo7267b();
            this.f6295a0 = 0;
            this.f6297b0 = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public void mo7292x() {
            if (this.f6282O == -1) {
                this.f6282O = this.f6281N;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public boolean mo7293y() {
            return (this.f6288U & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public boolean mo7294z() {
            return (this.f6288U & 128) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7267b() {
            List<Object> list = this.f6289V;
            if (list != null) {
                list.clear();
            }
            this.f6288U &= -1025;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7262a(int i, boolean z) {
            if (this.f6282O == -1) {
                this.f6282O = this.f6281N;
            }
            if (this.f6285R == -1) {
                this.f6285R = this.f6281N;
            }
            if (z) {
                this.f6285R += i;
            }
            this.f6281N += i;
            if (this.f6294a.getLayoutParams() != null) {
                ((C1656p) this.f6294a.getLayoutParams()).f6350c = true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7268b(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.f6295a0);
            this.f6295a0 = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7258a() {
            this.f6282O = -1;
            this.f6285R = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7263a(C1664w wVar, boolean z) {
            this.f6292Y = wVar;
            this.f6293Z = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7260a(int i, int i2) {
            this.f6288U = (i & i2) | (this.f6288U & (i2 ^ -1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7259a(int i) {
            this.f6288U = i | this.f6288U;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7265a(Object obj) {
            if (obj == null) {
                mo7259a(1024);
            } else if ((1024 & this.f6288U) == 0) {
                mo8948D();
                this.f6289V.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7264a(RecyclerView recyclerView) {
            int i = this.f6297b0;
            if (i != -1) {
                this.f6295a0 = i;
            } else {
                this.f6295a0 = C0962e0.m5557t(this.f6294a);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* renamed from: a */
        public final void mo7266a(boolean z) {
            int i = this.f6291X;
            this.f6291X = z ? i - 1 : i + 1;
            int i2 = this.f6291X;
            if (i2 < 0) {
                this.f6291X = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                sb.toString();
            } else if (!z && i2 == 1) {
                this.f6288U |= 16;
            } else if (z && this.f6291X == 0) {
                this.f6288U &= -17;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C1636e implements C1707b {
        C1636e() {
        }

        /* renamed from: a */
        public int mo7295a() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: b */
        public int mo7300b(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: c */
        public void mo7304c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: d */
        public void mo7305d(View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo7268b(RecyclerView.this);
            }
        }

        /* renamed from: a */
        public void mo7298a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        /* renamed from: b */
        public void mo7301b() {
            int a = mo7295a();
            for (int i = 0; i < a; i++) {
                View a2 = mo7296a(i);
                RecyclerView.this.dispatchChildDetached(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: a */
        public View mo7296a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: a */
        public void mo7299a(View view, int i, LayoutParams layoutParams) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.mo7287t() || childViewHolderInt.mo7294z()) {
                    childViewHolderInt.mo7271d();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(childViewHolderInt);
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: c */
        public C1635d0 mo7303c(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        /* renamed from: b */
        public void mo7302b(int i) {
            View a = mo7296a(i);
            if (a != null) {
                C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(a);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.mo7287t() || childViewHolderInt.mo7294z()) {
                        childViewHolderInt.mo7259a(256);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: a */
        public void mo7297a(View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo7264a(RecyclerView.this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C1637f implements C1675a {
        C1637f() {
        }

        /* renamed from: a */
        public C1635d0 mo7306a(int i) {
            C1635d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo7818c(findViewHolderForPosition.f6294a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        /* renamed from: b */
        public void mo7310b(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7313c(C1676b bVar) {
            int i = bVar.f6445a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo6920a(recyclerView, bVar.f6446b, bVar.f6448d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo6928b(recyclerView2, bVar.f6446b, bVar.f6448d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo6922a(recyclerView3, bVar.f6446b, bVar.f6448d, bVar.f6447c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo6921a(recyclerView4, bVar.f6446b, bVar.f6448d, 1);
            }
        }

        /* renamed from: d */
        public void mo7314d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.mDeletedInvisibleItemCountSincePreviousLayout += i2;
        }

        /* renamed from: a */
        public void mo7308a(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: b */
        public void mo7311b(C1676b bVar) {
            mo7313c(bVar);
        }

        /* renamed from: a */
        public void mo7309a(C1676b bVar) {
            mo7313c(bVar);
        }

        /* renamed from: a */
        public void mo7307a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: c */
        public void mo7312c(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C1638g<VH extends C1635d0> {

        /* renamed from: a */
        private final C1639h f6301a = new C1639h();

        /* renamed from: b */
        private boolean f6302b = false;

        /* renamed from: a */
        public void mo7320a(@C0193h0 VH vh, int i, @C0193h0 List<Object> list) {
            mo7330b(vh, i);
        }

        /* renamed from: a */
        public void mo7322a(@C0193h0 RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public boolean mo7324a(@C0193h0 VH vh) {
            return false;
        }

        /* renamed from: b */
        public abstract int mo7325b();

        /* renamed from: b */
        public long mo7326b(int i) {
            return -1;
        }

        @C0193h0
        /* renamed from: b */
        public abstract VH mo7327b(@C0193h0 ViewGroup viewGroup, int i);

        /* renamed from: b */
        public void mo7329b(@C0193h0 VH vh) {
        }

        /* renamed from: b */
        public abstract void mo7330b(@C0193h0 VH vh, int i);

        /* renamed from: b */
        public void mo7331b(@C0193h0 C1640i iVar) {
            this.f6301a.unregisterObserver(iVar);
        }

        /* renamed from: b */
        public void mo7332b(@C0193h0 RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public int mo7333c(int i) {
            return 0;
        }

        /* renamed from: c */
        public void mo7335c(@C0193h0 VH vh) {
        }

        /* renamed from: c */
        public final boolean mo7336c() {
            return this.f6301a.mo7346a();
        }

        /* renamed from: d */
        public void mo7339d(@C0193h0 VH vh) {
        }

        /* renamed from: d */
        public final boolean mo7340d() {
            return this.f6302b;
        }

        /* renamed from: e */
        public final void mo7341e() {
            this.f6301a.mo7347b();
        }

        /* renamed from: f */
        public final void mo7343f(int i) {
            this.f6301a.mo7350d(i, 1);
        }

        @C0193h0
        /* renamed from: a */
        public final VH mo7315a(@C0193h0 ViewGroup viewGroup, int i) {
            try {
                C1072n.m6199a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH b = mo7327b(viewGroup, i);
                if (b.f6294a.getParent() == null) {
                    b.f6284Q = i;
                    return b;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1072n.m6198a();
            }
        }

        /* renamed from: b */
        public final void mo7328b(int i, int i2) {
            this.f6301a.mo7348b(i, i2);
        }

        /* renamed from: c */
        public final void mo7334c(int i, int i2) {
            this.f6301a.mo7349c(i, i2);
        }

        /* renamed from: d */
        public final void mo7337d(int i) {
            this.f6301a.mo7348b(i, 1);
        }

        /* renamed from: e */
        public final void mo7342e(int i) {
            this.f6301a.mo7349c(i, 1);
        }

        /* renamed from: d */
        public final void mo7338d(int i, int i2) {
            this.f6301a.mo7350d(i, i2);
        }

        /* renamed from: a */
        public final void mo7319a(@C0193h0 VH vh, int i) {
            vh.f6281N = i;
            if (mo7340d()) {
                vh.f6283P = mo7326b(i);
            }
            vh.mo7260a(1, 519);
            C1072n.m6199a(RecyclerView.TRACE_BIND_VIEW_TAG);
            mo7320a(vh, i, vh.mo7279l());
            vh.mo7267b();
            LayoutParams layoutParams = vh.f6294a.getLayoutParams();
            if (layoutParams instanceof C1656p) {
                ((C1656p) layoutParams).f6350c = true;
            }
            C1072n.m6198a();
        }

        /* renamed from: a */
        public void mo7323a(boolean z) {
            if (!mo7336c()) {
                this.f6302b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: a */
        public void mo7321a(@C0193h0 C1640i iVar) {
            this.f6301a.registerObserver(iVar);
        }

        /* renamed from: a */
        public final void mo7318a(int i, @C0195i0 Object obj) {
            this.f6301a.mo7345a(i, 1, obj);
        }

        /* renamed from: a */
        public final void mo7317a(int i, int i2, @C0195i0 Object obj) {
            this.f6301a.mo7345a(i, i2, obj);
        }

        /* renamed from: a */
        public final void mo7316a(int i, int i2) {
            this.f6301a.mo7344a(i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C1639h extends Observable<C1640i> {
        C1639h() {
        }

        /* renamed from: a */
        public boolean mo7346a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo7347b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1640i) this.mObservers.get(size)).mo7351a();
            }
        }

        /* renamed from: c */
        public void mo7349c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1640i) this.mObservers.get(size)).mo7355b(i, i2);
            }
        }

        /* renamed from: d */
        public void mo7350d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1640i) this.mObservers.get(size)).mo7356c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo7345a(int i, int i2, @C0195i0 Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1640i) this.mObservers.get(size)).mo7354a(i, i2, obj);
            }
        }

        /* renamed from: b */
        public void mo7348b(int i, int i2) {
            mo7345a(i, i2, null);
        }

        /* renamed from: a */
        public void mo7344a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1640i) this.mObservers.get(size)).mo7353a(i, i2, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C1640i {
        /* renamed from: a */
        public void mo7351a() {
        }

        /* renamed from: a */
        public void mo7352a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo7353a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo7354a(int i, int i2, @C0195i0 Object obj) {
            mo7352a(i, i2);
        }

        /* renamed from: b */
        public void mo7355b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo7356c(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C1641j {
        /* renamed from: a */
        int mo7357a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C1642k {

        /* renamed from: a */
        public static final int f6303a = 0;

        /* renamed from: b */
        public static final int f6304b = 1;

        /* renamed from: c */
        public static final int f6305c = 2;

        /* renamed from: d */
        public static final int f6306d = 3;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.recyclerview.widget.RecyclerView$k$a */
        public @interface C1643a {
        }

        /* access modifiers changed from: protected */
        @C0193h0
        /* renamed from: a */
        public EdgeEffect mo7358a(@C0193h0 RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1644l {

        /* renamed from: g */
        public static final int f6307g = 2;

        /* renamed from: h */
        public static final int f6308h = 8;

        /* renamed from: i */
        public static final int f6309i = 4;

        /* renamed from: j */
        public static final int f6310j = 2048;

        /* renamed from: k */
        public static final int f6311k = 4096;

        /* renamed from: a */
        private C1647c f6312a = null;

        /* renamed from: b */
        private ArrayList<C1646b> f6313b = new ArrayList<>();

        /* renamed from: c */
        private long f6314c = 120;

        /* renamed from: d */
        private long f6315d = 120;

        /* renamed from: e */
        private long f6316e = 250;

        /* renamed from: f */
        private long f6317f = 250;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public @interface C1645a {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface C1646b {
            /* renamed from: a */
            void mo7387a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        interface C1647c {
            /* renamed from: a */
            void mo7388a(@C0193h0 C1635d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$d */
        public static class C1648d {

            /* renamed from: a */
            public int f6318a;

            /* renamed from: b */
            public int f6319b;

            /* renamed from: c */
            public int f6320c;

            /* renamed from: d */
            public int f6321d;

            /* renamed from: e */
            public int f6322e;

            @C0193h0
            /* renamed from: a */
            public C1648d mo7389a(@C0193h0 C1635d0 d0Var) {
                return mo7390a(d0Var, 0);
            }

            @C0193h0
            /* renamed from: a */
            public C1648d mo7390a(@C0193h0 C1635d0 d0Var, int i) {
                View view = d0Var.f6294a;
                this.f6318a = view.getLeft();
                this.f6319b = view.getTop();
                this.f6320c = view.getRight();
                this.f6321d = view.getBottom();
                return this;
            }
        }

        /* renamed from: g */
        static int m8569g(C1635d0 d0Var) {
            int i = d0Var.f6288U & 14;
            if (d0Var.mo7283p()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int j = d0Var.mo7277j();
                int f = d0Var.mo7273f();
                if (!(j == -1 || f == -1 || j == f)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: a */
        public void mo7362a(long j) {
            this.f6314c = j;
        }

        /* renamed from: a */
        public boolean mo7364a(@C0193h0 C1635d0 d0Var) {
            return true;
        }

        /* renamed from: a */
        public abstract boolean mo7365a(@C0193h0 C1635d0 d0Var, @C0193h0 C1635d0 d0Var2, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2);

        /* renamed from: a */
        public abstract boolean mo7366a(@C0193h0 C1635d0 d0Var, @C0195i0 C1648d dVar, @C0193h0 C1648d dVar2);

        /* renamed from: b */
        public abstract void mo7369b();

        /* renamed from: b */
        public void mo7370b(long j) {
            this.f6317f = j;
        }

        /* renamed from: b */
        public abstract boolean mo7372b(@C0193h0 C1635d0 d0Var, @C0193h0 C1648d dVar, @C0195i0 C1648d dVar2);

        /* renamed from: c */
        public void mo7374c(long j) {
            this.f6316e = j;
        }

        /* renamed from: c */
        public abstract boolean mo7376c(@C0193h0 C1635d0 d0Var, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2);

        /* renamed from: d */
        public void mo7378d(long j) {
            this.f6315d = j;
        }

        /* renamed from: d */
        public abstract void mo7379d(@C0193h0 C1635d0 d0Var);

        /* renamed from: e */
        public long mo7380e() {
            return this.f6316e;
        }

        /* renamed from: e */
        public void mo7381e(@C0193h0 C1635d0 d0Var) {
        }

        /* renamed from: f */
        public long mo7382f() {
            return this.f6315d;
        }

        /* renamed from: f */
        public void mo7383f(@C0193h0 C1635d0 d0Var) {
        }

        /* renamed from: g */
        public abstract boolean mo7384g();

        @C0193h0
        /* renamed from: h */
        public C1648d mo7385h() {
            return new C1648d();
        }

        /* renamed from: i */
        public abstract void mo7386i();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7363a(C1647c cVar) {
            this.f6312a = cVar;
        }

        /* renamed from: b */
        public final void mo7371b(@C0193h0 C1635d0 d0Var) {
            mo7381e(d0Var);
            C1647c cVar = this.f6312a;
            if (cVar != null) {
                cVar.mo7388a(d0Var);
            }
        }

        /* renamed from: c */
        public long mo7373c() {
            return this.f6314c;
        }

        /* renamed from: d */
        public long mo7377d() {
            return this.f6317f;
        }

        @C0193h0
        /* renamed from: a */
        public C1648d mo7360a(@C0193h0 State state, @C0193h0 C1635d0 d0Var, int i, @C0193h0 List<Object> list) {
            return mo7385h().mo7389a(d0Var);
        }

        /* renamed from: c */
        public final void mo7375c(@C0193h0 C1635d0 d0Var) {
            mo7383f(d0Var);
        }

        @C0193h0
        /* renamed from: a */
        public C1648d mo7359a(@C0193h0 State state, @C0193h0 C1635d0 d0Var) {
            return mo7385h().mo7389a(d0Var);
        }

        /* renamed from: a */
        public final boolean mo7368a(@C0195i0 C1646b bVar) {
            boolean g = mo7384g();
            if (bVar != null) {
                if (!g) {
                    bVar.mo7387a();
                } else {
                    this.f6313b.add(bVar);
                }
            }
            return g;
        }

        /* renamed from: a */
        public boolean mo7367a(@C0193h0 C1635d0 d0Var, @C0193h0 List<Object> list) {
            return mo7364a(d0Var);
        }

        /* renamed from: a */
        public final void mo7361a() {
            int size = this.f6313b.size();
            for (int i = 0; i < size; i++) {
                ((C1646b) this.f6313b.get(i)).mo7387a();
            }
            this.f6313b.clear();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C1649m implements C1647c {
        C1649m() {
        }

        /* renamed from: a */
        public void mo7388a(C1635d0 d0Var) {
            d0Var.mo7266a(true);
            if (d0Var.f6286S != null && d0Var.f6287T == null) {
                d0Var.f6286S = null;
            }
            d0Var.f6287T = null;
            if (!d0Var.mo7293y() && !RecyclerView.this.removeAnimatingView(d0Var.f6294a) && d0Var.mo7287t()) {
                RecyclerView.this.removeDetachedView(d0Var.f6294a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C1650n {
        @Deprecated
        /* renamed from: a */
        public void mo7391a(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo7392a(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView, @C0193h0 State state) {
            mo7391a(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: b */
        public void mo7395b(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo7396b(@C0193h0 Canvas canvas, @C0193h0 RecyclerView recyclerView, @C0193h0 State state) {
            mo7395b(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void mo7393a(@C0193h0 Rect rect, int i, @C0193h0 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo7394a(@C0193h0 Rect rect, @C0193h0 View view, @C0193h0 RecyclerView recyclerView, @C0193h0 State state) {
            mo7393a(rect, ((C1656p) view.getLayoutParams()).mo7519b(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1651o {

        /* renamed from: a */
        C1705g f6324a;

        /* renamed from: b */
        RecyclerView f6325b;

        /* renamed from: c */
        private final C1710b f6326c = new C1652a();

        /* renamed from: d */
        private final C1710b f6327d = new C1653b();

        /* renamed from: e */
        C1708g0 f6328e = new C1708g0(this.f6326c);

        /* renamed from: f */
        C1708g0 f6329f = new C1708g0(this.f6327d);
        @C0195i0

        /* renamed from: g */
        C1627a0 f6330g;

        /* renamed from: h */
        boolean f6331h = false;

        /* renamed from: i */
        boolean f6332i = false;

        /* renamed from: j */
        boolean f6333j = false;

        /* renamed from: k */
        private boolean f6334k = true;

        /* renamed from: l */
        private boolean f6335l = true;

        /* renamed from: m */
        int f6336m;

        /* renamed from: n */
        boolean f6337n;

        /* renamed from: o */
        private int f6338o;

        /* renamed from: p */
        private int f6339p;

        /* renamed from: q */
        private int f6340q;

        /* renamed from: r */
        private int f6341r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C1652a implements C1710b {
            C1652a() {
            }

            /* renamed from: a */
            public View mo7514a(int i) {
                return C1651o.this.mo7462d(i);
            }

            /* renamed from: b */
            public int mo7515b() {
                return C1651o.this.mo7503t() - C1651o.this.mo7497q();
            }

            /* renamed from: a */
            public int mo7512a() {
                return C1651o.this.mo7495p();
            }

            /* renamed from: b */
            public int mo7516b(View view) {
                return C1651o.this.mo7488l(view) + ((C1656p) view.getLayoutParams()).rightMargin;
            }

            /* renamed from: a */
            public int mo7513a(View view) {
                return C1651o.this.mo7482i(view) - ((C1656p) view.getLayoutParams()).leftMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C1653b implements C1710b {
            C1653b() {
            }

            /* renamed from: a */
            public View mo7514a(int i) {
                return C1651o.this.mo7462d(i);
            }

            /* renamed from: b */
            public int mo7515b() {
                return C1651o.this.mo7478h() - C1651o.this.mo7491n();
            }

            /* renamed from: a */
            public int mo7512a() {
                return C1651o.this.mo7501s();
            }

            /* renamed from: a */
            public int mo7513a(View view) {
                return C1651o.this.mo7490m(view) - ((C1656p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo7516b(View view) {
                return C1651o.this.mo7479h(view) + ((C1656p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C1654c {
            /* renamed from: a */
            void mo7517a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C1655d {

            /* renamed from: a */
            public int f6344a;

            /* renamed from: b */
            public int f6345b;

            /* renamed from: c */
            public boolean f6346c;

            /* renamed from: d */
            public boolean f6347d;
        }

        /* renamed from: A */
        public final boolean mo7397A() {
            return this.f6335l;
        }

        /* renamed from: B */
        public boolean mo7398B() {
            return this.f6334k;
        }

        /* renamed from: C */
        public boolean mo7399C() {
            C1627a0 a0Var = this.f6330g;
            return a0Var != null && a0Var.mo7227e();
        }

        @C0195i0
        /* renamed from: D */
        public Parcelable mo6954D() {
            return null;
        }

        /* renamed from: E */
        public void mo7400E() {
            for (int e = mo7467e() - 1; e >= 0; e--) {
                this.f6324a.mo7821e(e);
            }
        }

        /* renamed from: F */
        public void mo7401F() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: G */
        public void mo7402G() {
            this.f6331h = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: H */
        public boolean mo6955H() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: I */
        public void mo7403I() {
            C1627a0 a0Var = this.f6330g;
            if (a0Var != null) {
                a0Var.mo7230h();
            }
        }

        /* renamed from: J */
        public boolean mo6906J() {
            return false;
        }

        /* renamed from: a */
        public int mo6908a(int i, C1664w wVar, State state) {
            return 0;
        }

        /* renamed from: a */
        public int mo6971a(@C0193h0 State state) {
            return 0;
        }

        @C0195i0
        /* renamed from: a */
        public View mo6910a(@C0193h0 View view, int i, @C0193h0 C1664w wVar, @C0193h0 State state) {
            return null;
        }

        /* renamed from: a */
        public void mo6976a(int i, int i2, State state, C1654c cVar) {
        }

        /* renamed from: a */
        public void mo6977a(int i, C1654c cVar) {
        }

        /* renamed from: a */
        public void mo6914a(Rect rect, int i, int i2) {
            mo7454c(m8609a(i, rect.width() + mo7495p() + mo7497q(), mo7489m()), m8609a(i2, rect.height() + mo7501s() + mo7491n(), mo7487l()));
        }

        /* renamed from: a */
        public void mo6978a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo7417a(@C0195i0 C1638g gVar, @C0195i0 C1638g gVar2) {
        }

        /* renamed from: a */
        public void mo6920a(@C0193h0 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo6921a(@C0193h0 RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo6982a(RecyclerView recyclerView, State state, int i) {
        }

        /* renamed from: a */
        public boolean mo6983a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo6923a(C1656p pVar) {
            return pVar != null;
        }

        /* renamed from: a */
        public boolean mo7432a(@C0193h0 C1664w wVar, @C0193h0 State state, @C0193h0 View view, int i, @C0195i0 Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo7437a(@C0193h0 RecyclerView recyclerView, @C0193h0 ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: b */
        public int mo6925b(int i, C1664w wVar, State state) {
            return 0;
        }

        /* renamed from: b */
        public int mo6926b(@C0193h0 State state) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7439b(int i, int i2) {
            this.f6340q = MeasureSpec.getSize(i);
            this.f6338o = MeasureSpec.getMode(i);
            if (this.f6338o == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f6340q = 0;
            }
            this.f6341r = MeasureSpec.getSize(i2);
            this.f6339p = MeasureSpec.getMode(i2);
            if (this.f6339p == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f6341r = 0;
            }
        }

        @C0194i
        /* renamed from: b */
        public void mo7449b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo6928b(@C0193h0 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo6987b() {
            return false;
        }

        /* renamed from: c */
        public int mo6930c(@C0193h0 State state) {
            return 0;
        }

        /* renamed from: c */
        public int mo7453c(@C0193h0 C1664w wVar, @C0193h0 State state) {
            return 0;
        }

        @C0195i0
        /* renamed from: c */
        public View mo6989c(int i) {
            int e = mo7467e();
            for (int i2 = 0; i2 < e; i2++) {
                View d = mo7462d(i2);
                C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(d);
                if (childViewHolderInt != null && childViewHolderInt.mo7276i() == i && !childViewHolderInt.mo7294z() && (this.f6325b.mState.isPreLayout() || !childViewHolderInt.mo7285r())) {
                    return d;
                }
            }
            return null;
        }

        /* renamed from: c */
        public abstract C1656p mo6931c();

        @Deprecated
        /* renamed from: c */
        public void mo7458c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo7459c(@C0193h0 RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo7461d() {
            return -1;
        }

        /* renamed from: d */
        public int mo6990d(@C0193h0 State state) {
            return 0;
        }

        @C0195i0
        /* renamed from: d */
        public View mo7463d(@C0193h0 View view, int i) {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo7464d(int i, int i2) {
            int e = mo7467e();
            if (e == 0) {
                this.f6325b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < e; i7++) {
                View d = mo7462d(i7);
                Rect rect = this.f6325b.mTempRect;
                mo7445b(d, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f6325b.mTempRect.set(i3, i4, i5, i6);
            mo6914a(this.f6325b.mTempRect, i, i2);
        }

        /* renamed from: d */
        public void mo6932d(@C0193h0 RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean mo7466d(@C0193h0 C1664w wVar, @C0193h0 State state) {
            return false;
        }

        /* renamed from: e */
        public int mo6933e(@C0193h0 State state) {
            return 0;
        }

        /* renamed from: e */
        public void mo7469e(View view) {
            C1644l lVar = this.f6325b.mItemAnimator;
            if (lVar != null) {
                lVar.mo7379d(RecyclerView.getChildViewHolderInt(view));
            }
        }

        /* renamed from: e */
        public void mo6934e(C1664w wVar, State state) {
        }

        /* renamed from: f */
        public int mo6935f(@C0193h0 State state) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo7473f(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f6325b = null;
                this.f6324a = null;
                this.f6340q = 0;
                this.f6341r = 0;
            } else {
                this.f6325b = recyclerView;
                this.f6324a = recyclerView.mChildHelper;
                this.f6340q = recyclerView.getWidth();
                this.f6341r = recyclerView.getHeight();
            }
            this.f6338o = C6637f.f18605b;
            this.f6339p = C6637f.f18605b;
        }

        @C0195i0
        /* renamed from: g */
        public View mo7476g() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.f6324a.mo7818c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g */
        public void mo7477g(int i) {
        }

        /* renamed from: g */
        public void mo6937g(State state) {
        }

        /* renamed from: h */
        public void mo7480h(int i) {
            if (mo7462d(i) != null) {
                this.f6324a.mo7821e(i);
            }
        }

        /* renamed from: i */
        public int mo7481i() {
            return this.f6339p;
        }

        /* renamed from: i */
        public void mo6997i(int i) {
        }

        /* renamed from: j */
        public int mo7483j() {
            RecyclerView recyclerView = this.f6325b;
            C1638g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo7325b();
            }
            return 0;
        }

        /* renamed from: k */
        public int mo7485k() {
            return C0962e0.m5566x(this.f6325b);
        }

        /* renamed from: l */
        public int mo7488l(@C0193h0 View view) {
            return view.getRight() + mo7498q(view);
        }

        /* renamed from: m */
        public int mo7490m(@C0193h0 View view) {
            return view.getTop() - mo7500r(view);
        }

        /* renamed from: n */
        public int mo7492n(@C0193h0 View view) {
            return RecyclerView.getChildViewHolderInt(view).mo7275h();
        }

        @C0199k0
        /* renamed from: o */
        public int mo7493o() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return C0962e0.m5404H(recyclerView);
            }
            return 0;
        }

        /* renamed from: p */
        public int mo7496p(@C0193h0 View view) {
            return ((C1656p) view.getLayoutParams()).mo7519b();
        }

        @C0199k0
        /* renamed from: q */
        public int mo7497q() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @C0199k0
        /* renamed from: r */
        public int mo7499r() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return C0962e0.m5405I(recyclerView);
            }
            return 0;
        }

        @C0199k0
        /* renamed from: s */
        public int mo7501s() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: t */
        public void mo7504t(@C0193h0 View view) {
            this.f6325b.removeDetachedView(view, false);
        }

        /* renamed from: u */
        public void mo7506u(View view) {
            this.f6324a.mo7820d(view);
        }

        /* renamed from: v */
        public void mo7507v(@C0193h0 View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mo7255A();
            childViewHolderInt.mo7291w();
            childViewHolderInt.mo7259a(4);
        }

        /* renamed from: w */
        public boolean mo7509w() {
            RecyclerView recyclerView = this.f6325b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        /* renamed from: x */
        public boolean mo7510x() {
            return this.f6332i;
        }

        /* renamed from: y */
        public boolean mo7001y() {
            return this.f6333j;
        }

        /* renamed from: z */
        public boolean mo7511z() {
            RecyclerView recyclerView = this.f6325b;
            return recyclerView != null && recyclerView.isFocused();
        }

        /* renamed from: i */
        public int mo7482i(@C0193h0 View view) {
            return view.getLeft() - mo7494o(view);
        }

        /* renamed from: k */
        public int mo7486k(@C0193h0 View view) {
            Rect rect = ((C1656p) view.getLayoutParams()).f6349b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        @C0199k0
        /* renamed from: l */
        public int mo7487l() {
            return C0962e0.m5399C(this.f6325b);
        }

        @C0199k0
        /* renamed from: m */
        public int mo7489m() {
            return C0962e0.m5400D(this.f6325b);
        }

        @C0199k0
        /* renamed from: n */
        public int mo7491n() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: o */
        public int mo7494o(@C0193h0 View view) {
            return ((C1656p) view.getLayoutParams()).f6349b.left;
        }

        @C0199k0
        /* renamed from: p */
        public int mo7495p() {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: q */
        public int mo7498q(@C0193h0 View view) {
            return ((C1656p) view.getLayoutParams()).f6349b.right;
        }

        /* renamed from: r */
        public int mo7500r(@C0193h0 View view) {
            return ((C1656p) view.getLayoutParams()).f6349b.top;
        }

        /* renamed from: s */
        public void mo7502s(@C0193h0 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f6325b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("View should be fully attached to be ignored");
                sb.append(this.f6325b.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mo7259a(128);
            this.f6325b.mViewInfoStore.mo7876h(childViewHolderInt);
        }

        @C0199k0
        /* renamed from: t */
        public int mo7503t() {
            return this.f6340q;
        }

        /* renamed from: u */
        public int mo7505u() {
            return this.f6338o;
        }

        /* renamed from: e */
        public int mo7467e() {
            C1705g gVar = this.f6324a;
            if (gVar != null) {
                return gVar.mo7807a();
            }
            return 0;
        }

        @C0199k0
        /* renamed from: h */
        public int mo7478h() {
            return this.f6341r;
        }

        /* renamed from: j */
        public int mo7484j(@C0193h0 View view) {
            Rect rect = ((C1656p) view.getLayoutParams()).f6349b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: e */
        public void mo7468e(@C0199k0 int i) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: g */
        public int mo7475g(@C0193h0 View view) {
            return ((C1656p) view.getLayoutParams()).f6349b.bottom;
        }

        /* renamed from: h */
        public int mo7479h(@C0193h0 View view) {
            return view.getBottom() + mo7475g(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public boolean mo7508v() {
            int e = mo7467e();
            for (int i = 0; i < e; i++) {
                LayoutParams layoutParams = mo7462d(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo7425a(String str) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        /* renamed from: c */
        public void mo7456c(@C0193h0 View view, int i) {
            mo7410a(view, i, (C1656p) view.getLayoutParams());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo7470e(RecyclerView recyclerView) {
            mo7439b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), C6637f.f18605b), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), C6637f.f18605b));
        }

        /* renamed from: c */
        public void mo7455c(@C0193h0 View view) {
            mo7456c(view, -1);
        }

        /* renamed from: a */
        public static int m8609a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7457c(C1664w wVar) {
            int e = wVar.mo7575e();
            for (int i = e - 1; i >= 0; i--) {
                View c = wVar.mo7567c(i);
                C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c);
                if (!childViewHolderInt.mo7294z()) {
                    childViewHolderInt.mo7266a(false);
                    if (childViewHolderInt.mo7287t()) {
                        this.f6325b.removeDetachedView(c, false);
                    }
                    C1644l lVar = this.f6325b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo7379d(childViewHolderInt);
                    }
                    childViewHolderInt.mo7266a(true);
                    wVar.mo7554a(c);
                }
            }
            wVar.mo7568c();
            if (e > 0) {
                this.f6325b.invalidate();
            }
        }

        /* renamed from: b */
        public void mo6986b(String str) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: b */
        public final void mo7450b(boolean z) {
            if (z != this.f6335l) {
                this.f6335l = z;
                this.f6336m = 0;
                RecyclerView recyclerView = this.f6325b;
                if (recyclerView != null) {
                    recyclerView.mRecycler.mo7582j();
                }
            }
        }

        /* renamed from: f */
        public boolean mo7474f() {
            RecyclerView recyclerView = this.f6325b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        @Deprecated
        /* renamed from: a */
        public void mo7426a(boolean z) {
            this.f6333j = z;
        }

        /* renamed from: d */
        public void mo7465d(@C0193h0 View view) {
            int b = this.f6324a.mo7814b(view);
            if (b >= 0) {
                m8613a(b, view);
            }
        }

        @C0195i0
        /* renamed from: f */
        public View mo7471f(@C0193h0 View view) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView == null) {
                return null;
            }
            View findContainingItemView = recyclerView.findContainingItemView(view);
            if (findContainingItemView != null && !this.f6324a.mo7818c(findContainingItemView)) {
                return findContainingItemView;
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7422a(RecyclerView recyclerView) {
            this.f6332i = true;
            mo7449b(recyclerView);
        }

        @C0195i0
        /* renamed from: d */
        public View mo7462d(int i) {
            C1705g gVar = this.f6324a;
            if (gVar != null) {
                return gVar.mo7816c(i);
            }
            return null;
        }

        /* renamed from: d */
        private boolean m8618d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int p = mo7495p();
            int s = mo7501s();
            int t = mo7503t() - mo7497q();
            int h = mo7478h() - mo7491n();
            Rect rect = this.f6325b.mTempRect;
            mo7445b(focusedChild, rect);
            if (rect.left - i >= t || rect.right - i <= p || rect.top - i2 >= h || rect.bottom - i2 <= s) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7423a(RecyclerView recyclerView, C1664w wVar) {
            this.f6332i = false;
            mo6985b(recyclerView, wVar);
        }

        /* renamed from: f */
        public void mo7472f(@C0199k0 int i) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: b */
        public boolean mo7452b(Runnable runnable) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: a */
        public void mo7424a(Runnable runnable) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null) {
                C0962e0.m5451a((View) recyclerView, runnable);
            }
        }

        @C0194i
        /* renamed from: b */
        public void mo6985b(RecyclerView recyclerView, C1664w wVar) {
            mo7458c(recyclerView);
        }

        /* renamed from: a */
        public C1656p mo6913a(LayoutParams layoutParams) {
            if (layoutParams instanceof C1656p) {
                return new C1656p((C1656p) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new C1656p((MarginLayoutParams) layoutParams);
            }
            return new C1656p(layoutParams);
        }

        /* renamed from: b */
        public void mo7447b(C1627a0 a0Var) {
            C1627a0 a0Var2 = this.f6330g;
            if (!(a0Var2 == null || a0Var == a0Var2 || !a0Var2.mo7227e())) {
                this.f6330g.mo7230h();
            }
            this.f6330g = a0Var;
            this.f6330g.mo7219a(this.f6325b, this);
        }

        /* renamed from: c */
        public void mo7460c(boolean z) {
            this.f6334k = z;
        }

        /* renamed from: c */
        private int[] m8617c(View view, Rect rect) {
            int[] iArr = new int[2];
            int p = mo7495p();
            int s = mo7501s();
            int t = mo7503t() - mo7497q();
            int h = mo7478h() - mo7491n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - p;
            int min = Math.min(0, i);
            int i2 = top - s;
            int min2 = Math.min(0, i2);
            int i3 = width - t;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h);
            if (mo7485k() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: a */
        public C1656p mo6912a(Context context, AttributeSet attributeSet) {
            return new C1656p(context, attributeSet);
        }

        /* renamed from: b */
        public void mo7441b(View view) {
            mo7442b(view, -1);
        }

        /* renamed from: a */
        public void mo7406a(View view) {
            mo7407a(view, -1);
        }

        /* renamed from: b */
        public void mo7442b(View view, int i) {
            m8614a(view, i, false);
        }

        /* renamed from: a */
        public void mo7407a(View view, int i) {
            m8614a(view, i, true);
        }

        /* renamed from: b */
        public void mo7438b(int i) {
            m8613a(i, mo7462d(i));
        }

        /* renamed from: a */
        private void m8614a(View view, int i, boolean z) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.mo7285r()) {
                this.f6325b.mViewInfoStore.mo7864a(childViewHolderInt);
            } else {
                this.f6325b.mViewInfoStore.mo7875g(childViewHolderInt);
            }
            C1656p pVar = (C1656p) view.getLayoutParams();
            if (childViewHolderInt.mo7257C() || childViewHolderInt.mo7286s()) {
                if (childViewHolderInt.mo7286s()) {
                    childViewHolderInt.mo7256B();
                } else {
                    childViewHolderInt.mo7270c();
                }
                this.f6324a.mo7810a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f6325b) {
                int b = this.f6324a.mo7814b(view);
                if (i == -1) {
                    i = this.f6324a.mo7807a();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f6325b.indexOfChild(view));
                    sb.append(this.f6325b.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.f6325b.mLayout.mo7404a(b, i);
                }
            } else {
                this.f6324a.mo7811a(view, i, false);
                pVar.f6350c = true;
                C1627a0 a0Var = this.f6330g;
                if (a0Var != null && a0Var.mo7227e()) {
                    this.f6330g.mo7222b(view);
                }
            }
            if (pVar.f6351d) {
                childViewHolderInt.f6294a.invalidate();
                pVar.f6351d = false;
            }
        }

        /* renamed from: b */
        public void mo7446b(@C0193h0 View view, @C0193h0 C1664w wVar) {
            mo7506u(view);
            wVar.mo7565b(view);
        }

        /* renamed from: b */
        public void mo7440b(int i, @C0193h0 C1664w wVar) {
            View d = mo7462d(i);
            mo7480h(i);
            wVar.mo7565b(d);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo7451b(View view, int i, int i2, C1656p pVar) {
            return !this.f6334k || !m8616b(view.getMeasuredWidth(), i, pVar.width) || !m8616b(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: b */
        private static boolean m8616b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: b */
        public void mo7443b(@C0193h0 View view, int i, int i2) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f6325b.getItemDecorInsetsForChild(view);
            int i3 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int a = m8610a(mo7503t(), mo7505u(), mo7495p() + mo7497q() + pVar.leftMargin + pVar.rightMargin + i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, pVar.width, mo6983a());
            int a2 = m8610a(mo7478h(), mo7481i(), mo7501s() + mo7491n() + pVar.topMargin + pVar.bottomMargin + i3, pVar.height, mo6987b());
            if (mo7428a(view, a, a2, pVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: c */
        public void mo7454c(int i, int i2) {
            this.f6325b.setMeasuredDimension(i, i2);
        }

        /* renamed from: a */
        private void m8613a(int i, @C0193h0 View view) {
            this.f6324a.mo7808a(i);
        }

        /* renamed from: a */
        public void mo7410a(@C0193h0 View view, int i, C1656p pVar) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo7285r()) {
                this.f6325b.mViewInfoStore.mo7864a(childViewHolderInt);
            } else {
                this.f6325b.mViewInfoStore.mo7875g(childViewHolderInt);
            }
            this.f6324a.mo7810a(view, i, pVar, childViewHolderInt.mo7285r());
        }

        /* renamed from: b */
        public void mo7444b(@C0193h0 View view, int i, int i2, int i3, int i4) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            Rect rect = pVar.f6349b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* renamed from: b */
        public void mo7445b(@C0193h0 View view, @C0193h0 Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: b */
        public void mo7448b(@C0193h0 C1664w wVar) {
            for (int e = mo7467e() - 1; e >= 0; e--) {
                if (!RecyclerView.getChildViewHolderInt(mo7462d(e)).mo7294z()) {
                    mo7440b(e, wVar);
                }
            }
        }

        /* renamed from: a */
        public void mo7404a(int i, int i2) {
            View d = mo7462d(i);
            if (d != null) {
                mo7438b(i);
                mo7456c(d, i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f6325b.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public int mo6927b(@C0193h0 C1664w wVar, @C0193h0 State state) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo6987b()) {
                return 1;
            }
            return this.f6325b.mAdapter.mo7325b();
        }

        /* renamed from: a */
        public void mo7413a(@C0193h0 View view, @C0193h0 C1664w wVar) {
            m8615a(wVar, this.f6324a.mo7814b(view), view);
        }

        /* renamed from: a */
        public void mo7405a(int i, @C0193h0 C1664w wVar) {
            m8615a(wVar, i, mo7462d(i));
        }

        /* renamed from: a */
        public void mo7418a(@C0193h0 C1664w wVar) {
            for (int e = mo7467e() - 1; e >= 0; e--) {
                m8615a(wVar, e, mo7462d(e));
            }
        }

        /* renamed from: a */
        private void m8615a(C1664w wVar, int i, View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo7294z()) {
                if (!childViewHolderInt.mo7283p() || childViewHolderInt.mo7285r() || this.f6325b.mAdapter.mo7340d()) {
                    mo7438b(i);
                    wVar.mo7570c(view);
                    this.f6325b.mViewInfoStore.mo7872d(childViewHolderInt);
                } else {
                    mo7480h(i);
                    wVar.mo7566b(childViewHolderInt);
                }
            }
        }

        /* renamed from: a */
        public void mo7408a(@C0193h0 View view, int i, int i2) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f6325b.getItemDecorInsetsForChild(view);
            int i3 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int a = m8610a(mo7503t(), mo7505u(), mo7495p() + mo7497q() + i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, pVar.width, mo6983a());
            int a2 = m8610a(mo7478h(), mo7481i(), mo7501s() + mo7491n() + i3, pVar.height, mo6987b());
            if (mo7428a(view, a, a2, pVar)) {
                view.measure(a, a2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7428a(View view, int i, int i2, C1656p pVar) {
            return view.isLayoutRequested() || !this.f6334k || !m8616b(view.getWidth(), i, pVar.width) || !m8616b(view.getHeight(), i2, pVar.height);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m8611a(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r1 = 0
                goto L_0x001e
            L_0x000f:
                if (r3 < 0) goto L_0x0015
            L_0x0011:
                r1 = r3
            L_0x0012:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x001e
            L_0x0015:
                r4 = -1
                if (r3 != r4) goto L_0x0019
                goto L_0x0012
            L_0x0019:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
            L_0x001e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1651o.m8611a(int, int, int, boolean):int");
        }

        /* renamed from: a */
        public static int m8610a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                        return MeasureSpec.makeMeasureSpec(max, i7);
                    }
                    max = 0;
                    return MeasureSpec.makeMeasureSpec(max, i7);
                }
            } else if (i4 < 0) {
                if (i4 == -1) {
                    i7 = i2;
                } else {
                    if (i4 == -2) {
                        if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                            i7 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return MeasureSpec.makeMeasureSpec(max, i7);
            }
            max = i4;
            i7 = C6637f.f18605b;
            return MeasureSpec.makeMeasureSpec(max, i7);
        }

        /* renamed from: a */
        public void mo7409a(@C0193h0 View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C1656p) view.getLayoutParams()).f6349b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        /* renamed from: a */
        public void mo7414a(@C0193h0 View view, boolean z, @C0193h0 Rect rect) {
            if (z) {
                Rect rect2 = ((C1656p) view.getLayoutParams()).f6349b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f6325b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f6325b.mTempRectF;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo7411a(@C0193h0 View view, @C0193h0 Rect rect) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: a */
        public boolean mo7433a(@C0193h0 RecyclerView recyclerView, @C0193h0 View view, @C0193h0 Rect rect, boolean z) {
            return mo7434a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo7434a(@C0193h0 RecyclerView recyclerView, @C0193h0 View view, @C0193h0 Rect rect, boolean z, boolean z2) {
            int[] c = m8617c(view, rect);
            int i = c[0];
            int i2 = c[1];
            if ((z2 && !m8618d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo7430a(@C0193h0 View view, boolean z, boolean z2) {
            boolean z3 = this.f6328e.mo7834a(view, 24579) && this.f6329f.mo7834a(view, 24579);
            return z ? z3 : !z3;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo7435a(@C0193h0 RecyclerView recyclerView, @C0193h0 View view, @C0195i0 View view2) {
            return mo7399C() || recyclerView.isComputingLayout();
        }

        /* renamed from: a */
        public boolean mo7436a(@C0193h0 RecyclerView recyclerView, @C0193h0 State state, @C0193h0 View view, @C0195i0 View view2) {
            return mo7435a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public void mo6922a(@C0193h0 RecyclerView recyclerView, int i, int i2, @C0195i0 Object obj) {
            mo7459c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo7419a(@C0193h0 C1664w wVar, @C0193h0 State state, int i, int i2) {
            this.f6325b.defaultOnMeasure(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7416a(C1627a0 a0Var) {
            if (this.f6330g == a0Var) {
                this.f6330g = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7415a(C1016d dVar) {
            RecyclerView recyclerView = this.f6325b;
            mo7421a(recyclerView.mRecycler, recyclerView.mState, dVar);
        }

        /* renamed from: a */
        public void mo7421a(@C0193h0 C1664w wVar, @C0193h0 State state, @C0193h0 C1016d dVar) {
            if (this.f6325b.canScrollVertically(-1) || this.f6325b.canScrollHorizontally(-1)) {
                dVar.mo4930a(8192);
                dVar.mo5024s(true);
            }
            if (this.f6325b.canScrollVertically(1) || this.f6325b.canScrollHorizontally(1)) {
                dVar.mo4930a(4096);
                dVar.mo5024s(true);
            }
            dVar.mo4939a((Object) C1018b.m5960a(mo6927b(wVar, state), mo6909a(wVar, state), mo7466d(wVar, state), mo7453c(wVar, state)));
        }

        /* renamed from: a */
        public void mo6980a(@C0193h0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6325b;
            mo7420a(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo7420a(@C0193h0 C1664w wVar, @C0193h0 State state, @C0193h0 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f6325b.canScrollVertically(-1) && !this.f6325b.canScrollHorizontally(-1) && !this.f6325b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C1638g gVar = this.f6325b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo7325b());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7412a(View view, C1016d dVar) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.mo7285r() && !this.f6324a.mo7818c(childViewHolderInt.f6294a)) {
                RecyclerView recyclerView = this.f6325b;
                mo6917a(recyclerView.mRecycler, recyclerView.mState, view, dVar);
            }
        }

        /* renamed from: a */
        public void mo6917a(@C0193h0 C1664w wVar, @C0193h0 State state, @C0193h0 View view, @C0193h0 C1016d dVar) {
            dVar.mo4949b((Object) C1019c.m5966a(mo6987b() ? mo7496p(view) : 0, 1, mo6983a() ? mo7496p(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public int mo6909a(@C0193h0 C1664w wVar, @C0193h0 State state) {
            RecyclerView recyclerView = this.f6325b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo6983a()) {
                return 1;
            }
            return this.f6325b.mAdapter.mo7325b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7427a(int i, @C0195i0 Bundle bundle) {
            RecyclerView recyclerView = this.f6325b;
            return mo7431a(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo7431a(@androidx.annotation.C0193h0 androidx.recyclerview.widget.RecyclerView.C1664w r8, @androidx.annotation.C0193h0 androidx.recyclerview.widget.RecyclerView.State r9, int r10, @androidx.annotation.C0195i0 android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f6325b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo7478h()
                int r11 = r7.mo7501s()
                int r8 = r8 - r11
                int r11 = r7.mo7491n()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f6325b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo7503t()
                int r11 = r7.mo7495p()
                int r10 = r10 - r11
                int r11 = r7.mo7497q()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo7478h()
                int r10 = r7.mo7501s()
                int r8 = r8 - r10
                int r10 = r7.mo7491n()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f6325b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo7503t()
                int r11 = r7.mo7495p()
                int r10 = r10 - r11
                int r11 = r7.mo7497q()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f6325b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1651o.mo7431a(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$State, int, android.os.Bundle):boolean");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7429a(@C0193h0 View view, int i, @C0195i0 Bundle bundle) {
            RecyclerView recyclerView = this.f6325b;
            return mo7432a(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: a */
        public static C1655d m8612a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i, int i2) {
            C1655d dVar = new C1655d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1614R.styleable.RecyclerView, i, i2);
            dVar.f6344a = obtainStyledAttributes.getInt(C1614R.styleable.RecyclerView_android_orientation, 1);
            dVar.f6345b = obtainStyledAttributes.getInt(C1614R.styleable.RecyclerView_spanCount, 1);
            dVar.f6346c = obtainStyledAttributes.getBoolean(C1614R.styleable.RecyclerView_reverseLayout, false);
            dVar.f6347d = obtainStyledAttributes.getBoolean(C1614R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C1656p extends MarginLayoutParams {

        /* renamed from: a */
        C1635d0 f6348a;

        /* renamed from: b */
        final Rect f6349b = new Rect();

        /* renamed from: c */
        boolean f6350c = true;

        /* renamed from: d */
        boolean f6351d = false;

        public C1656p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo7518a() {
            return this.f6348a.mo7273f();
        }

        /* renamed from: b */
        public int mo7519b() {
            return this.f6348a.mo7276i();
        }

        @Deprecated
        /* renamed from: c */
        public int mo7520c() {
            return this.f6348a.mo7278k();
        }

        /* renamed from: d */
        public boolean mo7521d() {
            return this.f6348a.mo7289u();
        }

        /* renamed from: e */
        public boolean mo7522e() {
            return this.f6348a.mo7285r();
        }

        /* renamed from: f */
        public boolean mo7523f() {
            return this.f6348a.mo7283p();
        }

        /* renamed from: g */
        public boolean mo7524g() {
            return this.f6348a.mo7290v();
        }

        public C1656p(int i, int i2) {
            super(i, i2);
        }

        public C1656p(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1656p(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1656p(C1656p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C1657q {
        /* renamed from: a */
        void mo7525a(@C0193h0 View view);

        /* renamed from: b */
        void mo7526b(@C0193h0 View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C1658r {
        /* renamed from: a */
        public abstract boolean mo7527a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C1659s {
        /* renamed from: a */
        void mo7528a(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent);

        /* renamed from: a */
        void mo7529a(boolean z);

        /* renamed from: b */
        boolean mo7530b(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C1660t {
        /* renamed from: a */
        public void mo7531a(@C0193h0 RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo7532a(@C0193h0 RecyclerView recyclerView, int i, int i2) {
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public @interface C1661u {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C1662v {

        /* renamed from: c */
        private static final int f6352c = 5;

        /* renamed from: a */
        SparseArray<C1663a> f6353a = new SparseArray<>();

        /* renamed from: b */
        private int f6354b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$v$a */
        static class C1663a {

            /* renamed from: a */
            final ArrayList<C1635d0> f6355a = new ArrayList<>();

            /* renamed from: b */
            int f6356b = 5;

            /* renamed from: c */
            long f6357c = 0;

            /* renamed from: d */
            long f6358d = 0;

            C1663a() {
            }
        }

        /* renamed from: a */
        public void mo7536a(int i, int i2) {
            C1663a c = m8799c(i);
            c.f6356b = i2;
            ArrayList<C1635d0> arrayList = c.f6355a;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* renamed from: b */
        public void mo7542b() {
            for (int i = 0; i < this.f6353a.size(); i++) {
                ((C1663a) this.f6353a.valueAt(i)).f6355a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7545c() {
            this.f6354b--;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo7546d() {
            int i = 0;
            for (int i2 = 0; i2 < this.f6353a.size(); i2++) {
                ArrayList<C1635d0> arrayList = ((C1663a) this.f6353a.valueAt(i2)).f6355a;
                if (arrayList != null) {
                    i += arrayList.size();
                }
            }
            return i;
        }

        /* renamed from: c */
        private C1663a m8799c(int i) {
            C1663a aVar = (C1663a) this.f6353a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1663a aVar2 = new C1663a();
            this.f6353a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public int mo7541b(int i) {
            return m8799c(i).f6355a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7543b(int i, long j) {
            C1663a c = m8799c(i);
            c.f6357c = mo7533a(c.f6357c, j);
        }

        @C0195i0
        /* renamed from: a */
        public C1635d0 mo7534a(int i) {
            C1663a aVar = (C1663a) this.f6353a.get(i);
            if (aVar != null && !aVar.f6355a.isEmpty()) {
                ArrayList<C1635d0> arrayList = aVar.f6355a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((C1635d0) arrayList.get(size)).mo7281n()) {
                        return (C1635d0) arrayList.remove(size);
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo7544b(int i, long j, long j2) {
            long j3 = m8799c(i).f6357c;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: a */
        public void mo7538a(C1635d0 d0Var) {
            int h = d0Var.mo7275h();
            ArrayList<C1635d0> arrayList = m8799c(h).f6355a;
            if (((C1663a) this.f6353a.get(h)).f6356b > arrayList.size()) {
                d0Var.mo7291w();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo7533a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7537a(int i, long j) {
            C1663a c = m8799c(i);
            c.f6358d = mo7533a(c.f6358d, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7540a(int i, long j, long j2) {
            long j3 = m8799c(i).f6358d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7535a() {
            this.f6354b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7539a(C1638g gVar, C1638g gVar2, boolean z) {
            if (gVar != null) {
                mo7545c();
            }
            if (!z && this.f6354b == 0) {
                mo7542b();
            }
            if (gVar2 != null) {
                mo7535a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public final class C1664w {

        /* renamed from: j */
        static final int f6359j = 2;

        /* renamed from: a */
        final ArrayList<C1635d0> f6360a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C1635d0> f6361b = null;

        /* renamed from: c */
        final ArrayList<C1635d0> f6362c = new ArrayList<>();

        /* renamed from: d */
        private final List<C1635d0> f6363d = Collections.unmodifiableList(this.f6360a);

        /* renamed from: e */
        private int f6364e = 2;

        /* renamed from: f */
        int f6365f = 2;

        /* renamed from: g */
        C1662v f6366g;

        /* renamed from: h */
        private C1631b0 f6367h;

        public C1664w() {
        }

        /* renamed from: e */
        private void m8816e(C1635d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f6294a;
                if (C0962e0.m5557t(view) == 0) {
                    C0962e0.m5531l(view, 1);
                }
                C1780y yVar = RecyclerView.this.mAccessibilityDelegate;
                if (yVar != null) {
                    C0947a b = yVar.mo8029b();
                    if (b instanceof C1781a) {
                        ((C1781a) b).mo8032d(view);
                    }
                    C0962e0.m5443a(view, b);
                }
            }
        }

        /* renamed from: a */
        public void mo7551a() {
            this.f6360a.clear();
            mo7581i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo7561b(int i, boolean z) {
            return mo7549a(i, z, Long.MAX_VALUE).f6294a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7570c(View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo7269b(12) && childViewHolderInt.mo7289u() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f6361b == null) {
                    this.f6361b = new ArrayList<>();
                }
                childViewHolderInt.mo7263a(this, true);
                this.f6361b.add(childViewHolderInt);
            } else if (!childViewHolderInt.mo7283p() || childViewHolderInt.mo7285r() || RecyclerView.this.mAdapter.mo7340d()) {
                childViewHolderInt.mo7263a(this, false);
                this.f6360a.add(childViewHolderInt);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo7574d(C1635d0 d0Var) {
            if (d0Var.mo7285r()) {
                return RecyclerView.this.mState.isPreLayout();
            }
            int i = d0Var.f6281N;
            if (i < 0 || i >= RecyclerView.this.mAdapter.mo7325b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(d0Var);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.mState.isPreLayout() && RecyclerView.this.mAdapter.mo7333c(d0Var.f6281N) != d0Var.mo7275h()) {
                return false;
            }
            if (!RecyclerView.this.mAdapter.mo7340d()) {
                return true;
            }
            if (d0Var.mo7274g() == RecyclerView.this.mAdapter.mo7326b(d0Var.f6281N)) {
                z = true;
            }
            return z;
        }

        /* renamed from: f */
        public void mo7578f(int i) {
            this.f6364e = i;
            mo7582j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo7579g() {
            int size = this.f6362c.size();
            for (int i = 0; i < size; i++) {
                C1656p pVar = (C1656p) ((C1635d0) this.f6362c.get(i)).f6294a.getLayoutParams();
                if (pVar != null) {
                    pVar.f6350c = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo7580h() {
            int size = this.f6362c.size();
            for (int i = 0; i < size; i++) {
                C1635d0 d0Var = (C1635d0) this.f6362c.get(i);
                if (d0Var != null) {
                    d0Var.mo7259a(6);
                    d0Var.mo7265a((Object) null);
                }
            }
            C1638g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.mo7340d()) {
                mo7581i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo7581i() {
            for (int size = this.f6362c.size() - 1; size >= 0; size--) {
                mo7576e(size);
            }
            this.f6362c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo7915a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo7582j() {
            C1651o oVar = RecyclerView.this.mLayout;
            this.f6365f = this.f6364e + (oVar != null ? oVar.f6336m : 0);
            for (int size = this.f6362c.size() - 1; size >= 0 && this.f6362c.size() > this.f6365f; size--) {
                mo7576e(size);
            }
        }

        /* renamed from: b */
        public void mo7565b(@C0193h0 View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo7287t()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.mo7286s()) {
                childViewHolderInt.mo7256B();
            } else if (childViewHolderInt.mo7257C()) {
                childViewHolderInt.mo7270c();
            }
            mo7566b(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.mo7284q()) {
                RecyclerView.this.mItemAnimator.mo7379d(childViewHolderInt);
            }
        }

        /* renamed from: a */
        private boolean m8815a(@C0193h0 C1635d0 d0Var, int i, int i2, long j) {
            d0Var.f6298c0 = RecyclerView.this;
            int h = d0Var.mo7275h();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f6366g.mo7540a(h, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.mo7319a(d0Var, i);
            this.f6366g.mo7537a(d0Var.mo7275h(), RecyclerView.this.getNanoTime() - nanoTime);
            m8816e(d0Var);
            if (RecyclerView.this.mState.isPreLayout()) {
                d0Var.f6285R = i2;
            }
            return true;
        }

        @C0193h0
        /* renamed from: f */
        public List<C1635d0> mo7577f() {
            return this.f6363d;
        }

        /* renamed from: f */
        private void m8817f(C1635d0 d0Var) {
            View view = d0Var.f6294a;
            if (view instanceof ViewGroup) {
                m8814a((ViewGroup) view, false);
            }
        }

        @C0193h0
        /* renamed from: d */
        public View mo7572d(int i) {
            return mo7561b(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo7576e(int i) {
            mo7558a((C1635d0) this.f6362c.get(i), true);
            this.f6362c.remove(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7566b(C1635d0 d0Var) {
            boolean z;
            boolean z2 = false;
            if (d0Var.mo7286s() || d0Var.f6294a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo7286s());
                sb.append(" isAttached:");
                if (d0Var.f6294a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo7287t()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(d0Var);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!d0Var.mo7294z()) {
                boolean e = d0Var.mo7272e();
                C1638g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && e && gVar.mo7324a(d0Var)) || d0Var.mo7284q()) {
                    if (this.f6365f <= 0 || d0Var.mo7269b(526)) {
                        z = false;
                    } else {
                        int size = this.f6362c.size();
                        if (size >= this.f6365f && size > 0) {
                            mo7576e(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo7917a(d0Var.f6281N)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo7917a(((C1635d0) this.f6362c.get(i)).f6281N)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f6362c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo7558a(d0Var, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.mo7876h(d0Var);
                if (!z && !z2 && e) {
                    d0Var.f6298c0 = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C1662v mo7573d() {
            if (this.f6366g == null) {
                this.f6366g = new C1662v();
            }
            return this.f6366g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7571c(C1635d0 d0Var) {
            if (d0Var.f6293Z) {
                this.f6361b.remove(d0Var);
            } else {
                this.f6360a.remove(d0Var);
            }
            d0Var.f6292Y = null;
            d0Var.f6293Z = false;
            d0Var.mo7270c();
        }

        /* renamed from: a */
        public void mo7555a(@C0193h0 View view, int i) {
            C1656p pVar;
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                int b = RecyclerView.this.mAdapterHelper.mo7683b(i);
                if (b < 0 || b >= RecyclerView.this.mAdapter.mo7325b()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistency detected. Invalid item position ");
                    sb.append(i);
                    sb.append("(offset:");
                    sb.append(b);
                    sb.append(").state:");
                    sb.append(RecyclerView.this.mState.getItemCount());
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                m8815a(childViewHolderInt, b, i, Long.MAX_VALUE);
                LayoutParams layoutParams = childViewHolderInt.f6294a.getLayoutParams();
                if (layoutParams == null) {
                    pVar = (C1656p) RecyclerView.this.generateDefaultLayoutParams();
                    childViewHolderInt.f6294a.setLayoutParams(pVar);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    pVar = (C1656p) RecyclerView.this.generateLayoutParams(layoutParams);
                    childViewHolderInt.f6294a.setLayoutParams(pVar);
                } else {
                    pVar = (C1656p) layoutParams;
                }
                boolean z = true;
                pVar.f6350c = true;
                pVar.f6348a = childViewHolderInt;
                if (childViewHolderInt.f6294a.getParent() != null) {
                    z = false;
                }
                pVar.f6351d = z;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo7575e() {
            return this.f6360a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public View mo7567c(int i) {
            return ((C1635d0) this.f6360a.get(i)).f6294a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7568c() {
            this.f6360a.clear();
            ArrayList<C1635d0> arrayList = this.f6361b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo7569c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f6362c.size() - 1; size >= 0; size--) {
                C1635d0 d0Var = (C1635d0) this.f6362c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f6281N;
                    if (i4 >= i && i4 < i3) {
                        d0Var.mo7259a(2);
                        mo7576e(size);
                    }
                }
            }
        }

        /* renamed from: a */
        public int mo7547a(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.getItemCount()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.mState.getItemCount());
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.mState.isPreLayout()) {
                return i;
            } else {
                return RecyclerView.this.mAdapterHelper.mo7683b(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01c4  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x01fd  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x020b  */
        @androidx.annotation.C0195i0
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C1635d0 mo7549a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022e
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                int r1 = r1.getItemCount()
                if (r3 >= r1) goto L_0x022e
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                boolean r1 = r1.isPreLayout()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo7562b(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo7548a(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo7574d(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo7259a(r5)
                boolean r5 = r1.mo7286s()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f6294a
                r5.removeDetachedView(r9, r8)
                r1.mo7256B()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo7257C()
                if (r5 == 0) goto L_0x0057
                r1.mo7270c()
            L_0x0057:
                r6.mo7566b(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.mo7683b(r3)
                if (r5 < 0) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo7325b()
                if (r5 >= r9) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo7333c(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.mo7340d()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.mo7326b(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo7550a(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f6281N = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f6367h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo7244a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.getChildViewHolder(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo7294z()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0101
                androidx.recyclerview.widget.RecyclerView$v r0 = r16.mo7573d()
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r0.mo7534a(r9)
                if (r1 == 0) goto L_0x0101
                r1.mo7291w()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r0 == 0) goto L_0x0101
                r6.m8817f(r1)
            L_0x0101:
                if (r1 != 0) goto L_0x0180
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x011f
                androidx.recyclerview.widget.RecyclerView$v r10 = r6.f6366g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo7544b(r11, r12, r14)
                if (r5 != 0) goto L_0x011f
                return r2
            L_0x011f:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo7315a(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x013a
                android.view.View r5 = r2.f6294a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x013a
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f6296b = r10
            L_0x013a:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$v r5 = r6.f6366g
                long r10 = r10 - r0
                r5.mo7543b(r9, r10)
                r10 = r2
                goto L_0x0181
            L_0x0148:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                int r2 = r2.getItemCount()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0180:
                r10 = r1
            L_0x0181:
                r9 = r4
                if (r9 == 0) goto L_0x01ba
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                if (r0 != 0) goto L_0x01ba
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.mo7269b(r0)
                if (r1 == 0) goto L_0x01ba
                r10.mo7260a(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.mRunSimpleAnimations
                if (r0 == 0) goto L_0x01ba
                int r0 = androidx.recyclerview.widget.RecyclerView.C1644l.m8569g(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$State r1 = r1.mState
                java.util.List r4 = r10.mo7279l()
                androidx.recyclerview.widget.RecyclerView$l$d r0 = r2.mo7360a(r1, r10, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r10, r0)
            L_0x01ba:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r0 = r0.mState
                boolean r0 = r0.isPreLayout()
                if (r0 == 0) goto L_0x01cd
                boolean r0 = r10.mo7282o()
                if (r0 == 0) goto L_0x01cd
                r10.f6285R = r3
                goto L_0x01e0
            L_0x01cd:
                boolean r0 = r10.mo7282o()
                if (r0 == 0) goto L_0x01e2
                boolean r0 = r10.mo7290v()
                if (r0 != 0) goto L_0x01e2
                boolean r0 = r10.mo7283p()
                if (r0 == 0) goto L_0x01e0
                goto L_0x01e2
            L_0x01e0:
                r0 = 0
                goto L_0x01f5
            L_0x01e2:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.mo7683b(r3)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.m8815a(r1, r2, r3, r4)
            L_0x01f5:
                android.view.View r1 = r10.f6294a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020b
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1656p) r1
                android.view.View r2 = r10.f6294a
                r2.setLayoutParams(r1)
                goto L_0x0223
            L_0x020b:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0221
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1656p) r1
                android.view.View r2 = r10.f6294a
                r2.setLayoutParams(r1)
                goto L_0x0223
            L_0x0221:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C1656p) r1
            L_0x0223:
                r1.f6348a = r10
                if (r9 == 0) goto L_0x022a
                if (r0 == 0) goto L_0x022a
                goto L_0x022b
            L_0x022a:
                r7 = 0
            L_0x022b:
                r1.f6351d = r7
                return r10
            L_0x022e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$State r2 = r2.mState
                int r2 = r2.getItemCount()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1664w.mo7549a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C1635d0 mo7562b(int i) {
            ArrayList<C1635d0> arrayList = this.f6361b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C1635d0 d0Var = (C1635d0) this.f6361b.get(i3);
                        if (d0Var.mo7257C() || d0Var.mo7276i() != i) {
                            i3++;
                        } else {
                            d0Var.mo7259a(32);
                            return d0Var;
                        }
                    }
                    if (RecyclerView.this.mAdapter.mo7340d()) {
                        int b = RecyclerView.this.mAdapterHelper.mo7683b(i);
                        if (b > 0 && b < RecyclerView.this.mAdapter.mo7325b()) {
                            long b2 = RecyclerView.this.mAdapter.mo7326b(b);
                            while (i2 < size) {
                                C1635d0 d0Var2 = (C1635d0) this.f6361b.get(i2);
                                if (d0Var2.mo7257C() || d0Var2.mo7274g() != b2) {
                                    i2++;
                                } else {
                                    d0Var2.mo7259a(32);
                                    return d0Var2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7564b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = i;
                i4 = i2;
                i3 = -1;
            } else {
                i4 = i;
                i5 = i2;
                i3 = 1;
            }
            int size = this.f6362c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C1635d0 d0Var = (C1635d0) this.f6362c.get(i6);
                if (d0Var != null) {
                    int i7 = d0Var.f6281N;
                    if (i7 >= i5 && i7 <= i4) {
                        if (i7 == i) {
                            d0Var.mo7262a(i2 - i, false);
                        } else {
                            d0Var.mo7262a(i3, false);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7563b() {
            int size = this.f6362c.size();
            for (int i = 0; i < size; i++) {
                ((C1635d0) this.f6362c.get(i)).mo7258a();
            }
            int size2 = this.f6360a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C1635d0) this.f6360a.get(i2)).mo7258a();
            }
            ArrayList<C1635d0> arrayList = this.f6361b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C1635d0) this.f6361b.get(i3)).mo7258a();
                }
            }
        }

        /* renamed from: a */
        private void m8814a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m8814a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7558a(@C0193h0 C1635d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f6294a;
            C1780y yVar = RecyclerView.this.mAccessibilityDelegate;
            if (yVar != null) {
                C0947a b = yVar.mo8029b();
                C0962e0.m5443a(view, b instanceof C1781a ? ((C1781a) b).mo8031c(view) : null);
            }
            if (z) {
                mo7557a(d0Var);
            }
            d0Var.f6298c0 = null;
            mo7573d().mo7538a(d0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7554a(View view) {
            C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f6292Y = null;
            childViewHolderInt.f6293Z = false;
            childViewHolderInt.mo7270c();
            mo7566b(childViewHolderInt);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1635d0 mo7548a(int i, boolean z) {
            int size = this.f6360a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C1635d0 d0Var = (C1635d0) this.f6360a.get(i3);
                if (d0Var.mo7257C() || d0Var.mo7276i() != i || d0Var.mo7283p() || (!RecyclerView.this.mState.mInPreLayout && d0Var.mo7285r())) {
                    i3++;
                } else {
                    d0Var.mo7259a(32);
                    return d0Var;
                }
            }
            if (!z) {
                View b = RecyclerView.this.mChildHelper.mo7815b(i);
                if (b != null) {
                    C1635d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(b);
                    RecyclerView.this.mChildHelper.mo7823f(b);
                    int b2 = RecyclerView.this.mChildHelper.mo7814b(b);
                    if (b2 != -1) {
                        RecyclerView.this.mChildHelper.mo7808a(b2);
                        mo7570c(b);
                        childViewHolderInt.mo7259a(8224);
                        return childViewHolderInt;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(childViewHolderInt);
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f6362c.size();
            while (i2 < size2) {
                C1635d0 d0Var2 = (C1635d0) this.f6362c.get(i2);
                if (d0Var2.mo7283p() || d0Var2.mo7276i() != i || d0Var2.mo7281n()) {
                    i2++;
                } else {
                    if (!z) {
                        this.f6362c.remove(i2);
                    }
                    return d0Var2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1635d0 mo7550a(long j, int i, boolean z) {
            for (int size = this.f6360a.size() - 1; size >= 0; size--) {
                C1635d0 d0Var = (C1635d0) this.f6360a.get(size);
                if (d0Var.mo7274g() == j && !d0Var.mo7257C()) {
                    if (i == d0Var.mo7275h()) {
                        d0Var.mo7259a(32);
                        if (d0Var.mo7285r() && !RecyclerView.this.mState.isPreLayout()) {
                            d0Var.mo7260a(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f6360a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f6294a, false);
                        mo7554a(d0Var.f6294a);
                    }
                }
            }
            int size2 = this.f6362c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C1635d0 d0Var2 = (C1635d0) this.f6362c.get(size2);
                if (d0Var2.mo7274g() == j && !d0Var2.mo7281n()) {
                    if (i == d0Var2.mo7275h()) {
                        if (!z) {
                            this.f6362c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo7576e(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7557a(@C0193h0 C1635d0 d0Var) {
            C1665x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.mo7583a(d0Var);
            }
            C1638g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.mo7339d(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo7876h(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7559a(C1638g gVar, C1638g gVar2, boolean z) {
            mo7551a();
            mo7573d().mo7539a(gVar, gVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7552a(int i, int i2) {
            int size = this.f6362c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1635d0 d0Var = (C1635d0) this.f6362c.get(i3);
                if (d0Var != null && d0Var.f6281N >= i) {
                    d0Var.mo7262a(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7553a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f6362c.size() - 1; size >= 0; size--) {
                C1635d0 d0Var = (C1635d0) this.f6362c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f6281N;
                    if (i4 >= i3) {
                        d0Var.mo7262a(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo7259a(8);
                        mo7576e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7556a(C1631b0 b0Var) {
            this.f6367h = b0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7560a(C1662v vVar) {
            C1662v vVar2 = this.f6366g;
            if (vVar2 != null) {
                vVar2.mo7545c();
            }
            this.f6366g = vVar;
            if (this.f6366g != null && RecyclerView.this.getAdapter() != null) {
                this.f6366g.mo7535a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public interface C1665x {
        /* renamed from: a */
        void mo7583a(@C0193h0 C1635d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    private class C1666y extends C1640i {
        C1666y() {
        }

        /* renamed from: a */
        public void mo7351a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.mStructureChanged = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo7686c()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: b */
        public void mo7355b(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo7685b(i, i2)) {
                mo7584b();
            }
        }

        /* renamed from: c */
        public void mo7356c(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo7688c(i, i2)) {
                mo7584b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo7584b() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C0962e0.m5451a((View) recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        /* renamed from: a */
        public void mo7354a(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo7682a(i, i2, obj)) {
                mo7584b();
            }
        }

        /* renamed from: a */
        public void mo7353a(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo7681a(i, i2, i3)) {
                mo7584b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C1667z implements C1659s {
        /* renamed from: a */
        public void mo7528a(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent) {
        }

        /* renamed from: a */
        public void mo7529a(boolean z) {
        }

        /* renamed from: b */
        public boolean mo7530b(@C0193h0 RecyclerView recyclerView, @C0193h0 MotionEvent motionEvent) {
            return false;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i == 18 || i == 19 || i == 20;
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(@C0193h0 Context context) {
        this(context, null);
    }

    private void addAnimatingView(C1635d0 d0Var) {
        View view = d0Var.f6294a;
        boolean z = view.getParent() == this;
        this.mRecycler.mo7571c(getChildViewHolder(view));
        if (d0Var.mo7287t()) {
            this.mChildHelper.mo7810a(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.mo7812a(view, true);
        } else {
            this.mChildHelper.mo7809a(view);
        }
    }

    private void animateChange(@C0193h0 C1635d0 d0Var, @C0193h0 C1635d0 d0Var2, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2, boolean z, boolean z2) {
        d0Var.mo7266a(false);
        if (z) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                addAnimatingView(d0Var2);
            }
            d0Var.f6286S = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.mo7571c(d0Var);
            d0Var2.mo7266a(false);
            d0Var2.f6287T = d0Var;
        }
        if (this.mItemAnimator.mo7365a(d0Var, d0Var2, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(@C0193h0 C1635d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f6296b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != d0Var.f6294a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            d0Var.f6296b = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(C1651o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1651o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(fullClassName);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(fullClassName);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(fullClassName);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(fullClassName);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(fullClassName);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(fullClassName);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C1009b.m5794c(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.assertLayoutStep(1);
        fillRemainingScrollValues(this.mState);
        this.mState.mIsMeasuring = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo7862a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        State state = this.mState;
        if (!state.mRunSimpleAnimations || !this.mItemsChanged) {
            z = false;
        }
        state.mTrackOldChangeHolders = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        State state2 = this.mState;
        state2.mInPreLayout = state2.mRunPredictiveAnimations;
        state2.mItemCount = this.mAdapter.mo7325b();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.mRunSimpleAnimations) {
            int a = this.mChildHelper.mo7807a();
            for (int i = 0; i < a; i++) {
                C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7816c(i));
                if (!childViewHolderInt.mo7294z() && (!childViewHolderInt.mo7283p() || this.mAdapter.mo7340d())) {
                    this.mViewInfoStore.mo7870c(childViewHolderInt, this.mItemAnimator.mo7360a(this.mState, childViewHolderInt, C1644l.m8569g(childViewHolderInt), childViewHolderInt.mo7279l()));
                    if (this.mState.mTrackOldChangeHolders && childViewHolderInt.mo7289u() && !childViewHolderInt.mo7285r() && !childViewHolderInt.mo7294z() && !childViewHolderInt.mo7283p()) {
                        this.mViewInfoStore.mo7863a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.mRunPredictiveAnimations) {
            saveOldPositions();
            State state3 = this.mState;
            boolean z2 = state3.mStructureChanged;
            state3.mStructureChanged = false;
            this.mLayout.mo6934e(this.mRecycler, state3);
            this.mState.mStructureChanged = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo7807a(); i2++) {
                C1635d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo7816c(i2));
                if (!childViewHolderInt2.mo7294z() && !this.mViewInfoStore.mo7871c(childViewHolderInt2)) {
                    int g = C1644l.m8569g(childViewHolderInt2);
                    boolean b = childViewHolderInt2.mo7269b(8192);
                    if (!b) {
                        g |= 4096;
                    }
                    C1648d a2 = this.mItemAnimator.mo7360a(this.mState, childViewHolderInt2, g, childViewHolderInt2.mo7279l());
                    if (b) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a2);
                    } else {
                        this.mViewInfoStore.mo7865a(childViewHolderInt2, a2);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.mLayoutStep = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.assertLayoutStep(6);
        this.mAdapterHelper.mo7684b();
        this.mState.mItemCount = this.mAdapter.mo7325b();
        State state = this.mState;
        state.mDeletedInvisibleItemCountSincePreviousLayout = 0;
        state.mInPreLayout = false;
        this.mLayout.mo6934e(this.mRecycler, state);
        State state2 = this.mState;
        state2.mStructureChanged = false;
        this.mPendingSavedState = null;
        state2.mRunSimpleAnimations = state2.mRunSimpleAnimations && this.mItemAnimator != null;
        this.mState.mLayoutStep = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.assertLayoutStep(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        State state = this.mState;
        state.mLayoutStep = 1;
        if (state.mRunSimpleAnimations) {
            for (int a = this.mChildHelper.mo7807a() - 1; a >= 0; a--) {
                C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7816c(a));
                if (!childViewHolderInt.mo7294z()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C1648d a2 = this.mItemAnimator.mo7359a(this.mState, childViewHolderInt);
                    C1635d0 a3 = this.mViewInfoStore.mo7861a(changedHolderKey);
                    if (a3 == null || a3.mo7294z()) {
                        this.mViewInfoStore.mo7868b(childViewHolderInt, a2);
                    } else {
                        boolean b = this.mViewInfoStore.mo7869b(a3);
                        boolean b2 = this.mViewInfoStore.mo7869b(childViewHolderInt);
                        if (!b || a3 != childViewHolderInt) {
                            C1648d f = this.mViewInfoStore.mo7874f(a3);
                            this.mViewInfoStore.mo7868b(childViewHolderInt, a2);
                            C1648d e = this.mViewInfoStore.mo7873e(childViewHolderInt);
                            if (f == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a3);
                            } else {
                                animateChange(a3, childViewHolderInt, f, e, b, b2);
                            }
                        } else {
                            this.mViewInfoStore.mo7868b(childViewHolderInt, a2);
                        }
                    }
                }
            }
            this.mViewInfoStore.mo7866a(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo7457c(this.mRecycler);
        State state2 = this.mState;
        state2.mPreviousLayoutItemCount = state2.mItemCount;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        state2.mRunSimpleAnimations = false;
        state2.mRunPredictiveAnimations = false;
        this.mLayout.f6331h = false;
        ArrayList<C1635d0> arrayList = this.mRecycler.f6361b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C1651o oVar = this.mLayout;
        if (oVar.f6337n) {
            oVar.f6336m = 0;
            oVar.f6337n = false;
            this.mRecycler.mo7582j();
        }
        this.mLayout.mo6937g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo7862a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C1659s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo7528a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C1659s sVar = (C1659s) this.mOnItemTouchListeners.get(i);
            if (!sVar.mo7530b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.mo7807a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < a; i3++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7816c(i3));
            if (!childViewHolderInt.mo7294z()) {
                int i4 = childViewHolderInt.mo7276i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @C0195i0
    static RecyclerView findNestedRecyclerView(@C0193h0 View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @C0195i0
    private View findNextViewToFocus() {
        int i = this.mState.mFocusedItemPosition;
        if (i == -1) {
            i = 0;
        }
        int itemCount = this.mState.getItemCount();
        int i2 = i;
        while (i2 < itemCount) {
            C1635d0 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition == null) {
                break;
            } else if (findViewHolderForAdapterPosition.f6294a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f6294a;
            } else {
                i2++;
            }
        }
        int min = Math.min(itemCount, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C1635d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
            if (findViewHolderForAdapterPosition2 == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition2.f6294a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f6294a;
            }
        }
    }

    static C1635d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C1656p) view.getLayoutParams()).f6348a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C1656p pVar = (C1656p) view.getLayoutParams();
        Rect rect2 = pVar.f6349b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    private C1049s getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1049s(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C1635d0 d0Var, C1635d0 d0Var2) {
        int a = this.mChildHelper.mo7807a();
        for (int i = 0; i < a; i++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7816c(i));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C1638g gVar = this.mAdapter;
                String str = " \n View Holder 2:";
                if (gVar == null || !gVar.mo7340d()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(str);
                    sb.append(d0Var);
                    sb.append(exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(str);
                sb2.append(d0Var);
                sb2.append(exceptionLabel());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(d0Var2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(d0Var);
        sb3.append(exceptionLabel());
        sb3.toString();
    }

    private boolean hasUpdatedView() {
        int a = this.mChildHelper.mo7807a();
        for (int i = 0; i < a; i++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7816c(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo7294z() && childViewHolderInt.mo7289u()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0962e0.m5560u(this) == 0) {
            C0962e0.m5535m((View) this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1705g(new C1636e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (findContainingItemView(view2) == null) {
                return false;
            }
            if (view == null || findContainingItemView(view) == null) {
                return true;
            }
            this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
            this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.mTempRect);
            offsetDescendantRectToMyCoords(view2, this.mTempRect2);
            char c = 65535;
            int i3 = this.mLayout.mo7485k() == 1 ? -1 : 1;
            Rect rect = this.mTempRect;
            int i4 = rect.left;
            int i5 = this.mTempRect2.left;
            if ((i4 < i5 || rect.right <= i5) && this.mTempRect.right < this.mTempRect2.right) {
                i2 = 1;
            } else {
                Rect rect2 = this.mTempRect;
                int i6 = rect2.right;
                int i7 = this.mTempRect2.right;
                i2 = ((i6 > i7 || rect2.left >= i7) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
            }
            Rect rect3 = this.mTempRect;
            int i8 = rect3.top;
            int i9 = this.mTempRect2.top;
            if ((i8 < i9 || rect3.bottom <= i9) && this.mTempRect.bottom < this.mTempRect2.bottom) {
                c = 1;
            } else {
                Rect rect4 = this.mTempRect;
                int i10 = rect4.bottom;
                int i11 = this.mTempRect2.bottom;
                if ((i10 <= i11 && rect4.top < i11) || this.mTempRect.top <= this.mTempRect2.top) {
                    c = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                        z = true;
                    }
                    return z;
                } else if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 130) {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    sb.append(exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                z = true;
            }
        }
        return z;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo6906J();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo7691f();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo6932d(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo7690e();
        } else {
            this.mAdapterHelper.mo7684b();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.mRunSimpleAnimations = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f6331h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.mo7340d());
        State state = this.mState;
        if (state.mRunSimpleAnimations && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        state.mRunPredictiveAnimations = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C1112e.m6324a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C1112e.m6324a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C1112e.m6324a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C1112e.m6324a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            androidx.core.p034l.C0962e0.m5561u0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        if (r0.isFocusable() != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void recoverFocusFromState() {
        /*
            r7 = this;
            boolean r0 = r7.mPreserveFocusAfterLayout
            if (r0 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView$g r0 = r7.mAdapter
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r7.hasFocus()
            if (r0 == 0) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x00b2
            int r0 = r7.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x0026
            boolean r0 = r7.isFocused()
            if (r0 == 0) goto L_0x0026
            goto L_0x00b2
        L_0x0026:
            boolean r0 = r7.isFocused()
            if (r0 != 0) goto L_0x0055
            android.view.View r0 = r7.getFocusedChild()
            boolean r1 = IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L_0x004c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x0040
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L_0x004c
        L_0x0040:
            androidx.recyclerview.widget.g r0 = r7.mChildHelper
            int r0 = r0.mo7807a()
            if (r0 != 0) goto L_0x0055
            r7.requestFocus()
            return
        L_0x004c:
            androidx.recyclerview.widget.g r1 = r7.mChildHelper
            boolean r0 = r1.mo7818c(r0)
            if (r0 != 0) goto L_0x0055
            return
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            long r0 = r0.mFocusedItemId
            r2 = -1
            r4 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$g r0 = r7.mAdapter
            boolean r0 = r0.mo7340d()
            if (r0 == 0) goto L_0x0071
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            long r0 = r0.mFocusedItemId
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r7.findViewHolderForItemId(r0)
            goto L_0x0072
        L_0x0071:
            r0 = r4
        L_0x0072:
            if (r0 == 0) goto L_0x008a
            androidx.recyclerview.widget.g r1 = r7.mChildHelper
            android.view.View r5 = r0.f6294a
            boolean r1 = r1.mo7818c(r5)
            if (r1 != 0) goto L_0x008a
            android.view.View r1 = r0.f6294a
            boolean r1 = r1.hasFocusable()
            if (r1 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            android.view.View r4 = r0.f6294a
            goto L_0x0096
        L_0x008a:
            androidx.recyclerview.widget.g r0 = r7.mChildHelper
            int r0 = r0.mo7807a()
            if (r0 <= 0) goto L_0x0096
            android.view.View r4 = r7.findNextViewToFocus()
        L_0x0096:
            if (r4 == 0) goto L_0x00b2
            androidx.recyclerview.widget.RecyclerView$State r0 = r7.mState
            int r0 = r0.mFocusedSubChildId
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00ae
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x00ae
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            r0.requestFocus()
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.recoverFocusFromState():void");
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0962e0.m5561u0(this);
        }
    }

    private void requestChildOnScreen(@C0193h0 View view, @C0195i0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C1656p) {
            C1656p pVar = (C1656p) layoutParams;
            if (!pVar.f6350c) {
                Rect rect = pVar.f6349b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo7434a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        State state = this.mState;
        state.mFocusedItemId = -1;
        state.mFocusedItemPosition = -1;
        state.mFocusedSubChildId = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i;
        C1635d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.mFocusedItemId = this.mAdapter.mo7340d() ? d0Var.mo7274g() : -1;
        State state = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i = -1;
        } else if (d0Var.mo7285r()) {
            i = d0Var.f6282O;
        } else {
            i = d0Var.mo7273f();
        }
        state.mFocusedItemPosition = i;
        this.mState.mFocusedSubChildId = getDeepestFocusedViewWithId(d0Var.f6294a);
    }

    private void setAdapterInternal(@C0195i0 C1638g gVar, boolean z, boolean z2) {
        C1638g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.mo7331b((C1640i) this.mObserver);
            this.mAdapter.mo7332b(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo7691f();
        C1638g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.mo7321a((C1640i) this.mObserver);
            gVar.mo7322a(this);
        }
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo7417a(gVar3, this.mAdapter);
        }
        this.mRecycler.mo7559a(gVar3, this.mAdapter, z);
        this.mState.mStructureChanged = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo7249b();
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo7403I();
        }
    }

    /* access modifiers changed from: 0000 */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C0962e0.m5561u0(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1651o oVar = this.mLayout;
        if (oVar == null || !oVar.mo7437a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(@C0193h0 C1650n nVar, int i) {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo6986b("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@C0193h0 C1657q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(@C0193h0 C1659s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(@C0193h0 C1660t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: 0000 */
    public void animateAppearance(@C0193h0 C1635d0 d0Var, @C0195i0 C1648d dVar, @C0193h0 C1648d dVar2) {
        d0Var.mo7266a(false);
        if (this.mItemAnimator.mo7366a(d0Var, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: 0000 */
    public void animateDisappearance(@C0193h0 C1635d0 d0Var, @C0193h0 C1648d dVar, @C0195i0 C1648d dVar2) {
        addAnimatingView(d0Var);
        d0Var.mo7266a(false);
        if (this.mItemAnimator.mo7372b(d0Var, dVar, dVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: 0000 */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(exceptionLabel());
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(exceptionLabel());
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(exceptionLabel());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(exceptionLabel());
            new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean canReuseUpdatedViewHolder(C1635d0 d0Var) {
        C1644l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo7367a(d0Var, d0Var.mo7279l());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C1656p) && this.mLayout.mo6923a((C1656p) layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void clearOldPositions() {
        int b = this.mChildHelper.mo7813b();
        for (int i = 0; i < b; i++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i));
            if (!childViewHolderInt.mo7294z()) {
                childViewHolderInt.mo7258a();
            }
        }
        this.mRecycler.mo7563b();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C1657q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C1660t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C1651o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo6983a()) {
            i = this.mLayout.mo6971a(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        C1651o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo6983a()) {
            i = this.mLayout.mo6926b(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        C1651o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo6983a()) {
            i = this.mLayout.mo6930c(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        C1651o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo6987b()) {
            i = this.mLayout.mo6990d(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        C1651o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo6987b()) {
            i = this.mLayout.mo6933e(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        C1651o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo6987b()) {
            i = this.mLayout.mo6935f(this.mState);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C0962e0.m5561u0(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void consumePendingUpdateOperations() {
        boolean z = this.mFirstLayoutComplete;
        String str = TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG;
        if (!z || this.mDataSetHasChangedAfterLayout) {
            C1072n.m6199a(str);
            dispatchLayout();
            C1072n.m6198a();
        } else if (this.mAdapterHelper.mo7686c()) {
            if (this.mAdapterHelper.mo7687c(4) && !this.mAdapterHelper.mo7687c(11)) {
                C1072n.m6199a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.mo7690e();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.mo7677a();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
                C1072n.m6198a();
            } else if (this.mAdapterHelper.mo7686c()) {
                C1072n.m6199a(str);
                dispatchLayout();
                C1072n.m6198a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C1651o.m8609a(i, getPaddingLeft() + getPaddingRight(), C0962e0.m5400D(this)), C1651o.m8609a(i2, getPaddingTop() + getPaddingBottom(), C0962e0.m5399C(this)));
    }

    /* access modifiers changed from: 0000 */
    public void dispatchChildAttached(View view) {
        C1635d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C1638g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo7329b(childViewHolderInt);
        }
        List<C1657q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1657q) this.mOnChildAttachStateListeners.get(size)).mo7526b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchChildDetached(View view) {
        C1635d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C1638g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo7335c(childViewHolderInt);
        }
        List<C1657q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1657q) this.mOnChildAttachStateListeners.get(size)).mo7525a(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchLayout() {
        if (this.mAdapter != null && this.mLayout != null) {
            State state = this.mState;
            state.mIsMeasuring = false;
            if (state.mLayoutStep == 1) {
                dispatchLayoutStep1();
                this.mLayout.mo7470e(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.mo7689d() && this.mLayout.mo7503t() == getWidth() && this.mLayout.mo7478h() == getHeight()) {
                this.mLayout.mo7470e(this);
            } else {
                this.mLayout.mo7470e(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo5177a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo5176a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo5182a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo5180a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnScrollStateChanged(int i) {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo7477g(i);
        }
        onScrollStateChanged(i);
        C1660t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo7531a(this, i);
        }
        List<C1660t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1660t) this.mScrollListeners.get(size)).mo7531a(this, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C1660t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo7532a(this, i, i2);
        }
        List<C1660t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1660t) this.mScrollListeners.get(size)).mo7532a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchPendingImportantForAccessibilityChanges() {
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C1635d0 d0Var = (C1635d0) this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f6294a.getParent() == this && !d0Var.mo7294z()) {
                int i = d0Var.f6297b0;
                if (i != -1) {
                    C0962e0.m5531l(d0Var.f6294a, i);
                    d0Var.f6297b0 = -1;
                }
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((C1650n) this.mItemDecorations.get(i)).mo7396b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z2 = z;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 = z3 | z;
            canvas.restoreToCount(save4);
        }
        if (!z2 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.mo7384g()) {
            z2 = true;
        }
        if (z2) {
            C0962e0.m5561u0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: 0000 */
    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            this.mBottomGlow = this.mEdgeEffectFactory.mo7358a(this, 3);
            if (this.mClipToPadding) {
                this.mBottomGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mBottomGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            this.mLeftGlow = this.mEdgeEffectFactory.mo7358a(this, 0);
            if (this.mClipToPadding) {
                this.mLeftGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mLeftGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            this.mRightGlow = this.mEdgeEffectFactory.mo7358a(this, 2);
            if (this.mClipToPadding) {
                this.mRightGlow.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.mRightGlow.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            this.mTopGlow = this.mEdgeEffectFactory.mo7358a(this, 1);
            if (this.mClipToPadding) {
                this.mTopGlow.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.mTopGlow.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public String exceptionLabel() {
        StringBuilder sb = new StringBuilder();
        sb.append(C3868i.f12248b);
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.mAdapter);
        sb.append(", layout:");
        sb.append(this.mLayout);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final void fillRemainingScrollValues(State state) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f6258N;
            state.mRemainingScrollHorizontal = overScroller.getFinalX() - overScroller.getCurrX();
            state.mRemainingScrollVertical = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        state.mRemainingScrollHorizontal = 0;
        state.mRemainingScrollVertical = 0;
    }

    @C0195i0
    public View findChildViewUnder(float f, float f2) {
        for (int a = this.mChildHelper.mo7807a() - 1; a >= 0; a--) {
            View c = this.mChildHelper.mo7816c(a);
            float translationX = c.getTranslationX();
            float translationY = c.getTranslationY();
            if (f >= ((float) c.getLeft()) + translationX && f <= ((float) c.getRight()) + translationX && f2 >= ((float) c.getTop()) + translationY && f2 <= ((float) c.getBottom()) + translationY) {
                return c;
            }
        }
        return null;
    }

    @C0195i0
    public View findContainingItemView(@C0193h0 View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @C0195i0
    public C1635d0 findContainingViewHolder(@C0193h0 View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @C0195i0
    public C1635d0 findViewHolderForAdapterPosition(int i) {
        C1635d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b = this.mChildHelper.mo7813b();
        for (int i2 = 0; i2 < b; i2++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo7285r() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo7818c(childViewHolderInt.f6294a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public C1635d0 findViewHolderForItemId(long j) {
        C1638g gVar = this.mAdapter;
        C1635d0 d0Var = null;
        if (gVar != null && gVar.mo7340d()) {
            int b = this.mChildHelper.mo7813b();
            for (int i = 0; i < b; i++) {
                C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo7285r() && childViewHolderInt.mo7274g() == j) {
                    if (!this.mChildHelper.mo7818c(childViewHolderInt.f6294a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    @C0195i0
    public C1635d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    @C0195i0
    public C1635d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public boolean fling(int i, int i2) {
        C1651o oVar = this.mLayout;
        int i3 = 0;
        if (oVar == null || this.mLayoutSuppressed) {
            return false;
        }
        boolean a = oVar.mo6983a();
        boolean b = this.mLayout.mo6987b();
        if (!a || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!b || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        float f = (float) i;
        float f2 = (float) i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = a || b;
            dispatchNestedFling(f, f2, z);
            C1658r rVar = this.mOnFlingListener;
            if (rVar != null && rVar.mo7527a(i, i2)) {
                return true;
            }
            if (z) {
                if (a) {
                    i3 = 1;
                }
                if (b) {
                    i3 |= 2;
                }
                startNestedScroll(i3, 1);
                int i4 = this.mMaxFlingVelocity;
                int max = Math.max(-i4, Math.min(i, i4));
                int i5 = this.mMaxFlingVelocity;
                this.mViewFlinger.mo7247a(max, Math.max(-i5, Math.min(i2, i5)));
                return true;
            }
        }
        return false;
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.mLayout.mo7463d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z2 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z2) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo6910a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo6987b()) {
                int i2 = i == 2 ? C13959t.f40839S1 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo6983a()) {
                int i3 = (this.mLayout.mo7485k() == 1) ^ (i == 2) ? 66 : 17;
                z = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo6910a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!isPreferredNextFocus(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo6931c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo6912a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @C0195i0
    public C1638g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: 0000 */
    public int getAdapterPositionFor(C1635d0 d0Var) {
        if (d0Var.mo7269b(524) || !d0Var.mo7282o()) {
            return -1;
        }
        return this.mAdapterHelper.mo7673a(d0Var.f6281N);
    }

    public int getBaseline() {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo7461d();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    public long getChangedHolderKey(C1635d0 d0Var) {
        return this.mAdapter.mo7340d() ? d0Var.mo7274g() : (long) d0Var.f6281N;
    }

    public int getChildAdapterPosition(@C0193h0 View view) {
        C1635d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo7273f();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C1641j jVar = this.mChildDrawingOrderCallback;
        if (jVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return jVar.mo7357a(i, i2);
    }

    public long getChildItemId(@C0193h0 View view) {
        C1638g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo7340d()) {
            return -1;
        }
        C1635d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo7274g();
        }
        return -1;
    }

    public int getChildLayoutPosition(@C0193h0 View view) {
        C1635d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo7276i();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@C0193h0 View view) {
        return getChildAdapterPosition(view);
    }

    public C1635d0 getChildViewHolder(@C0193h0 View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @C0195i0
    public C1780y getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@C0193h0 View view, @C0193h0 Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @C0193h0
    public C1642k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @C0195i0
    public C1644l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: 0000 */
    public Rect getItemDecorInsetsForChild(View view) {
        C1656p pVar = (C1656p) view.getLayoutParams();
        if (!pVar.f6350c) {
            return pVar.f6349b;
        }
        if (this.mState.isPreLayout() && (pVar.mo7521d() || pVar.mo7523f())) {
            return pVar.f6349b;
        }
        Rect rect = pVar.f6349b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((C1650n) this.mItemDecorations.get(i)).mo7394a(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f6350c = false;
        return rect;
    }

    @C0193h0
    public C1650n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (C1650n) this.mItemDecorations.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @C0195i0
    public C1651o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    @C0195i0
    public C1658r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @C0193h0
    public C1662v getRecycledViewPool() {
        return this.mRecycler.mo7573d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo5175a();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo7686c();
    }

    /* access modifiers changed from: 0000 */
    public void initAdapterManager() {
        this.mAdapterHelper = new C1674a(new C1637f());
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C1735k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C1614R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(C1614R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(C1614R.dimen.fastscroll_margin));
    }

    /* access modifiers changed from: 0000 */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C1651o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo6986b("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C1644l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo7384g();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo5184b();
    }

    /* access modifiers changed from: 0000 */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo6997i(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    public void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.mo7813b();
        for (int i = 0; i < b; i++) {
            ((C1656p) this.mChildHelper.mo7819d(i).getLayoutParams()).f6350c = true;
        }
        this.mRecycler.mo7579g();
    }

    /* access modifiers changed from: 0000 */
    public void markKnownViewsInvalid() {
        int b = this.mChildHelper.mo7813b();
        for (int i = 0; i < b; i++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo7294z()) {
                childViewHolderInt.mo7259a(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo7580h();
    }

    public void offsetChildrenHorizontal(@C0199k0 int i) {
        int a = this.mChildHelper.mo7807a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo7816c(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@C0199k0 int i) {
        int a = this.mChildHelper.mo7807a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo7816c(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int b = this.mChildHelper.mo7813b();
        for (int i3 = 0; i3 < b; i3++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo7294z() && childViewHolderInt.f6281N >= i) {
                childViewHolderInt.mo7262a(i2, false);
                this.mState.mStructureChanged = true;
            }
        }
        this.mRecycler.mo7552a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int b = this.mChildHelper.mo7813b();
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i6 = 0; i6 < b; i6++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i6));
            if (childViewHolderInt != null) {
                int i7 = childViewHolderInt.f6281N;
                if (i7 >= i5 && i7 <= i4) {
                    if (i7 == i) {
                        childViewHolderInt.mo7262a(i2 - i, false);
                    } else {
                        childViewHolderInt.mo7262a(i3, false);
                    }
                    this.mState.mStructureChanged = true;
                }
            }
        }
        this.mRecycler.mo7564b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.mo7813b();
        for (int i4 = 0; i4 < b; i4++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo7294z()) {
                int i5 = childViewHolderInt.f6281N;
                if (i5 >= i3) {
                    childViewHolderInt.mo7262a(-i2, z);
                    this.mState.mStructureChanged = true;
                } else if (i5 >= i) {
                    childViewHolderInt.mo7261a(i - 1, -i2, z);
                    this.mState.mStructureChanged = true;
                }
            }
        }
        this.mRecycler.mo7553a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L_0x0014
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r4.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r4.mLayout
            if (r1 == 0) goto L_0x001e
            r1.mo7422a(r4)
        L_0x001e:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L_0x0067
            java.lang.ThreadLocal<androidx.recyclerview.widget.l> r0 = androidx.recyclerview.widget.C1740l.f6738P
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.l r0 = (androidx.recyclerview.widget.C1740l) r0
            r4.mGapWorker = r0
            androidx.recyclerview.widget.l r0 = r4.mGapWorker
            if (r0 != 0) goto L_0x0062
            androidx.recyclerview.widget.l r0 = new androidx.recyclerview.widget.l
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = androidx.core.p034l.C0962e0.m5548q(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L_0x0052
            if (r0 == 0) goto L_0x0052
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r0 = 1114636288(0x42700000, float:60.0)
        L_0x0054:
            androidx.recyclerview.widget.l r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f6740N = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.l> r0 = androidx.recyclerview.widget.C1740l.f6738P
            r0.set(r1)
        L_0x0062:
            androidx.recyclerview.widget.l r0 = r4.mGapWorker
            r0.mo7909a(r4)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(@C0193h0 View view) {
    }

    public void onChildDetachedFromWindow(@C0193h0 View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1644l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo7369b();
        }
        stopScroll();
        this.mIsAttached = false;
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo7423a(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo7867b();
        if (ALLOW_THREAD_GAP_WORK) {
            C1740l lVar2 = this.mGapWorker;
            if (lVar2 != null) {
                lVar2.mo7911b(this);
                this.mGapWorker = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((C1650n) this.mItemDecorations.get(i)).mo7392a(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: 0000 */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.mo6987b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo6983a()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo6987b()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo6983a()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C1651o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean a = oVar.mo6983a();
        boolean b = this.mLayout.mo6987b();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.mScrollPointerId);
                sb.append(" not found. Did any MotionEvents get skipped?");
                sb.toString();
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!a || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1072n.m6199a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C1072n.m6198a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C1651o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo7001y()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.mLayout.mo7419a(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.mLayoutStep == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo7439b(i, i2);
                this.mState.mIsMeasuring = true;
                dispatchLayoutStep2();
                this.mLayout.mo7464d(i, i2);
                if (this.mLayout.mo6955H()) {
                    this.mLayout.mo7439b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), C6637f.f18605b), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), C6637f.f18605b));
                    this.mState.mIsMeasuring = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo7464d(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo7419a(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                State state = this.mState;
                if (state.mRunPredictiveAnimations) {
                    state.mInPreLayout = true;
                } else {
                    this.mAdapterHelper.mo7684b();
                    this.mState.mInPreLayout = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.mRunPredictiveAnimations) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C1638g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.mItemCount = gVar.mo7325b();
            } else {
                this.mState.mItemCount = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo7419a(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.mInPreLayout = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (SavedState) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.getSuperState());
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            Parcelable parcelable2 = this.mPendingSavedState.mLayoutState;
            if (parcelable2 != null) {
                oVar.mo6978a(parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.copyFrom(savedState2);
        } else {
            C1651o oVar = this.mLayout;
            if (oVar != null) {
                savedState.mLayoutState = oVar.mo6954D();
            } else {
                savedState.mLayoutState = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@C0199k0 int i, @C0199k0 int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01e2
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01e2
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo6983a()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.mo6987b()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b1
            if (r0 == r9) goto L_0x016f
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d7
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d7
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d7
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d7
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            r0.toString()
            return r8
        L_0x00ac:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f5
            if (r10 == 0) goto L_0x00d9
            if (r0 <= 0) goto L_0x00ce
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d5
        L_0x00ce:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d5:
            if (r0 == 0) goto L_0x00d9
            r2 = 1
            goto L_0x00da
        L_0x00d9:
            r2 = 0
        L_0x00da:
            if (r11 == 0) goto L_0x00f0
            if (r1 <= 0) goto L_0x00e6
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ed
        L_0x00e6:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ed:
            if (r1 == 0) goto L_0x00f0
            r2 = 1
        L_0x00f0:
            if (r2 == 0) goto L_0x00f5
            r6.setScrollState(r9)
        L_0x00f5:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d7
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0106
            r1 = r15
            goto L_0x0107
        L_0x0106:
            r1 = 0
        L_0x0107:
            if (r11 == 0) goto L_0x010c
            r2 = r16
            goto L_0x010d
        L_0x010c:
            r2 = 0
        L_0x010d:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = 0
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.l r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d7
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d7
        L_0x0169:
            androidx.recyclerview.widget.l r1 = r6.mGapWorker
            r1.mo7910a(r6, r15, r0)
            goto L_0x01d7
        L_0x016f:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018b
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018c
        L_0x018b:
            r1 = 0
        L_0x018c:
            if (r11 == 0) goto L_0x0198
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0199
        L_0x0198:
            r2 = 0
        L_0x0199:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a9
        L_0x01a1:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01ac
        L_0x01a9:
            r6.setScrollState(r8)
        L_0x01ac:
            r17.resetScroll()
            r8 = 1
            goto L_0x01d7
        L_0x01b1:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r10 == 0) goto L_0x01cf
            r0 = 1
            goto L_0x01d0
        L_0x01cf:
            r0 = 0
        L_0x01d0:
            if (r11 == 0) goto L_0x01d4
            r0 = r0 | 2
        L_0x01d4:
            r6.startNestedScroll(r0, r8)
        L_0x01d7:
            if (r8 != 0) goto L_0x01de
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01de:
            r12.recycle()
            return r9
        L_0x01e2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C0962e0.m5451a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: 0000 */
    public void recordAnimationInfoIfBouncedHiddenView(C1635d0 d0Var, C1648d dVar) {
        d0Var.mo7260a(0, 8192);
        if (this.mState.mTrackOldChangeHolders && d0Var.mo7289u() && !d0Var.mo7285r() && !d0Var.mo7294z()) {
            this.mViewInfoStore.mo7863a(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.mo7870c(d0Var, dVar);
    }

    /* access modifiers changed from: 0000 */
    public void removeAndRecycleViews() {
        C1644l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo7369b();
        }
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo7448b(this.mRecycler);
            this.mLayout.mo7457c(this.mRecycler);
        }
        this.mRecycler.mo7551a();
    }

    /* access modifiers changed from: 0000 */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean e = this.mChildHelper.mo7822e(view);
        if (e) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo7571c(childViewHolderInt);
            this.mRecycler.mo7566b(childViewHolderInt);
        }
        stopInterceptRequestLayout(!e);
        return e;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C1635d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo7287t()) {
                childViewHolderInt.mo7271d();
            } else if (!childViewHolderInt.mo7294z()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                sb.append(exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@C0193h0 C1650n nVar) {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo6986b("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(@C0193h0 C1657q qVar) {
        List<C1657q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(@C0193h0 C1659s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@C0193h0 C1660t tVar) {
        List<C1660t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void repositionShadowingViews() {
        int a = this.mChildHelper.mo7807a();
        for (int i = 0; i < a; i++) {
            View c = this.mChildHelper.mo7816c(i);
            C1635d0 childViewHolder = getChildViewHolder(c);
            if (childViewHolder != null) {
                C1635d0 d0Var = childViewHolder.f6287T;
                if (d0Var != null) {
                    View view = d0Var.f6294a;
                    int left = c.getLeft();
                    int top = c.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.mo7436a(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo7433a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((C1659s) this.mOnItemTouchListeners.get(i)).mo7529a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public void saveOldPositions() {
        int b = this.mChildHelper.mo7813b();
        for (int i = 0; i < b; i++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i));
            if (!childViewHolderInt.mo7294z()) {
                childViewHolderInt.mo7292x();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C1651o oVar = this.mLayout;
        if (oVar != null && !this.mLayoutSuppressed) {
            boolean a = oVar.mo6983a();
            boolean b = this.mLayout.mo6987b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        int i11 = i6;
        dispatchNestedScroll(i6, i5, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = i4 - iArr4[0];
        int i13 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i14 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C1007o.m5787f(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        int i15 = i11;
        if (!(i15 == 0 && i5 == 0)) {
            dispatchOnScrolled(i15, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i15 == 0 && i5 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void scrollStep(int i, int i2, @C0195i0 int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C1072n.m6199a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a = i != 0 ? this.mLayout.mo6908a(i, this.mRecycler, this.mState) : 0;
        int b = i2 != 0 ? this.mLayout.mo6925b(i2, this.mRecycler, this.mState) : 0;
        C1072n.m6198a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    public void scrollTo(int i, int i2) {
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C1651o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo6997i(i);
                awakenScrollBars();
            }
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(@C0195i0 C1780y yVar) {
        this.mAccessibilityDelegate = yVar;
        C0962e0.m5443a((View) this, (C0947a) this.mAccessibilityDelegate);
    }

    public void setAdapter(@C0195i0 C1638g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@C0195i0 C1641j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public boolean setChildImportantForAccessibilityInternal(C1635d0 d0Var, int i) {
        if (isComputingLayout()) {
            d0Var.f6297b0 = i;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        C0962e0.m5531l(d0Var.f6294a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@C0193h0 C1642k kVar) {
        C0944i.m5337a(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@C0195i0 C1644l lVar) {
        C1644l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo7369b();
            this.mItemAnimator.mo7363a((C1647c) null);
        }
        this.mItemAnimator = lVar;
        C1644l lVar3 = this.mItemAnimator;
        if (lVar3 != null) {
            lVar3.mo7363a(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo7578f(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@C0195i0 C1651o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C1644l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo7369b();
                }
                this.mLayout.mo7448b(this.mRecycler);
                this.mLayout.mo7457c(this.mRecycler);
                this.mRecycler.mo7551a();
                if (this.mIsAttached) {
                    this.mLayout.mo7423a(this, this.mRecycler);
                }
                this.mLayout.mo7473f((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo7551a();
            }
            this.mChildHelper.mo7817c();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f6325b == null) {
                    this.mLayout.mo7473f(this);
                    if (this.mIsAttached) {
                        this.mLayout.mo7422a(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(oVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(oVar.f6325b.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mRecycler.mo7582j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo5174a(z);
    }

    public void setOnFlingListener(@C0195i0 C1658r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(@C0195i0 C1660t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@C0195i0 C1662v vVar) {
        this.mRecycler.mo7560a(vVar);
    }

    public void setRecyclerListener(@C0195i0 C1665x xVar) {
        this.mRecyclerListener = xVar;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                sb.toString();
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@C0195i0 C1631b0 b0Var) {
        this.mRecycler.mo7556a(b0Var);
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int c = accessibilityEvent != null ? C1009b.m5793c(accessibilityEvent) : 0;
        if (c == 0) {
            c = 0;
        }
        this.mEatenAccessibilityChangeFlags = c | this.mEatenAccessibilityChangeFlags;
        return true;
    }

    public void smoothScrollBy(@C0199k0 int i, @C0199k0 int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C1651o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo6982a(this, this.mState, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void startInterceptRequestLayout() {
        this.mInterceptRequestLayoutDepth++;
        if (this.mInterceptRequestLayoutDepth == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo5185b(i);
    }

    /* access modifiers changed from: 0000 */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo5188d();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(@C0195i0 C1638g gVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int b = this.mChildHelper.mo7813b();
        int i3 = i + i2;
        for (int i4 = 0; i4 < b; i4++) {
            View d = this.mChildHelper.mo7819d(i4);
            C1635d0 childViewHolderInt = getChildViewHolderInt(d);
            if (childViewHolderInt != null && !childViewHolderInt.mo7294z()) {
                int i5 = childViewHolderInt.f6281N;
                if (i5 >= i && i5 < i3) {
                    childViewHolderInt.mo7259a(2);
                    childViewHolderInt.mo7265a(obj);
                    ((C1656p) d.getLayoutParams()).f6350c = true;
                }
            }
        }
        this.mRecycler.mo7569c(i, i2);
    }

    public RecyclerView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C1614R.attr.recyclerViewStyle);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo5183a(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo5181a(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    public C1635d0 findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.mo7813b();
        C1635d0 d0Var = null;
        for (int i2 = 0; i2 < b; i2++) {
            C1635d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo7819d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo7285r()) {
                if (z) {
                    if (childViewHolderInt.f6281N != i) {
                        continue;
                    }
                } else if (childViewHolderInt.mo7276i() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo7818c(childViewHolderInt.f6294a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo5178a(i);
    }

    /* access modifiers changed from: 0000 */
    public void onExitLayoutOrScroll(boolean z) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@C0199k0 int i, @C0199k0 int i2, @C0195i0 Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo5179a(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo5187c(i);
    }

    public RecyclerView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C1666y();
        this.mRecycler = new C1664w();
        this.mViewInfoStore = new C1723h0();
        this.mUpdateChildViewsRunnable = new C1626a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C1642k();
        this.mItemAnimator = new C1712h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C1633c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1742b() : null;
        this.mState = new State();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1649m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C1630b();
        this.mViewInfoProcessCallback = new C1634d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C0983f0.m5631b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C0983f0.m5633c(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo7363a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0962e0.m5557t(this) == 0) {
            C0962e0.m5531l((View) this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1780y(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1614R.styleable.RecyclerView, i, 0);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C1614R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C1614R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C1614R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C1614R.styleable.RecyclerView_android_clipToPadding, true);
        this.mEnableFastScroller = obtainStyledAttributes.getBoolean(C1614R.styleable.RecyclerView_fastScrollEnabled, false);
        if (this.mEnableFastScroller) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C1614R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C1614R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C1614R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C1614R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
            if (VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @C0193h0 int[] iArr2) {
        getScrollingChildHelper().mo5172a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(@C0199k0 int i, @C0199k0 int i2, @C0195i0 Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        C1651o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo6913a(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void smoothScrollBy(@C0199k0 int i, @C0199k0 int i2, @C0195i0 Interpolator interpolator, int i3, boolean z) {
        C1651o oVar = this.mLayout;
        if (oVar != null && !this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo6983a()) {
                i = 0;
            }
            if (!this.mLayout.mo6987b()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo7248a(i, i2, i3, interpolator);
                } else {
                    scrollBy(i, i2);
                }
            }
        }
    }

    public void addItemDecoration(@C0193h0 C1650n nVar) {
        addItemDecoration(nVar, -1);
    }
}
