package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0215r;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.coordinatorlayout.C0705R;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p033k.C0937e;
import androidx.core.p033k.C0940h.C0941a;
import androidx.core.p033k.C0940h.C0943c;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1050t;
import androidx.core.p034l.C1051u;
import androidx.core.p034l.C1053w;
import androidx.core.p034l.C1054x;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C1050t, C1051u {

    /* renamed from: i0 */
    static final String f3314i0 = "CoordinatorLayout";

    /* renamed from: j0 */
    static final String f3315j0;

    /* renamed from: k0 */
    private static final int f3316k0 = 0;

    /* renamed from: l0 */
    private static final int f3317l0 = 1;

    /* renamed from: m0 */
    static final Class<?>[] f3318m0 = {Context.class, AttributeSet.class};

    /* renamed from: n0 */
    static final ThreadLocal<Map<String, Constructor<C0712c>>> f3319n0 = new ThreadLocal<>();

    /* renamed from: o0 */
    static final int f3320o0 = 0;

    /* renamed from: p0 */
    static final int f3321p0 = 1;

    /* renamed from: q0 */
    static final int f3322q0 = 2;

    /* renamed from: r0 */
    static final Comparator<View> f3323r0;

    /* renamed from: s0 */
    private static final C0941a<Rect> f3324s0 = new C0943c(12);

    /* renamed from: N */
    private final List<View> f3325N;

    /* renamed from: O */
    private final List<View> f3326O;

    /* renamed from: P */
    private Paint f3327P;

    /* renamed from: Q */
    private final int[] f3328Q;

    /* renamed from: R */
    private final int[] f3329R;

    /* renamed from: S */
    private boolean f3330S;

    /* renamed from: T */
    private boolean f3331T;

    /* renamed from: U */
    private int[] f3332U;

    /* renamed from: V */
    private View f3333V;

    /* renamed from: W */
    private View f3334W;

    /* renamed from: a */
    private final List<View> f3335a;

    /* renamed from: a0 */
    private C0717h f3336a0;

    /* renamed from: b */
    private final C0719a<View> f3337b;

    /* renamed from: b0 */
    private boolean f3338b0;

    /* renamed from: c0 */
    private C1006n0 f3339c0;

    /* renamed from: d0 */
    private boolean f3340d0;

    /* renamed from: e0 */
    private Drawable f3341e0;

    /* renamed from: f0 */
    OnHierarchyChangeListener f3342f0;

    /* renamed from: g0 */
    private C1054x f3343g0;

    /* renamed from: h0 */
    private final C1053w f3344h0;

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C0709a();
        SparseArray<Parcelable> behaviorStates;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0709a implements ClassLoaderCreator<SavedState> {
            C0709a() {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.behaviorStates = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.behaviorStates.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.behaviorStates;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.behaviorStates.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.behaviorStates.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0710a implements C1054x {
        C0710a() {
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, C1006n0 n0Var) {
            return CoordinatorLayout.this.mo3929a(n0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0711b {
        @C0193h0
        C0712c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0712c<V extends View> {
        public C0712c() {
        }

        @C0193h0
        /* renamed from: a */
        public C1006n0 mo3981a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 C1006n0 n0Var) {
            return n0Var;
        }

        /* renamed from: a */
        public void mo3982a() {
        }

        /* renamed from: a */
        public void mo3983a(@C0193h0 C0716g gVar) {
        }

        /* renamed from: a */
        public void mo3984a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo3986a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo3989a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, @C0193h0 int[] iArr) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo3991a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, @C0193h0 View view2, int i) {
        }

        /* renamed from: a */
        public boolean mo3993a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v) {
            return mo4007c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3995a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3996a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3997a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3998a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3999a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4000a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo4001a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, float f, float f2, boolean z) {
            return false;
        }

        @C0198k
        /* renamed from: b */
        public int mo4002b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v) {
            return C0962e0.f4343t;
        }

        /* renamed from: b */
        public boolean mo4003b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4004b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo4005b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, @C0193h0 View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4006b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, @C0193h0 View view2, int i, int i2) {
            if (i2 == 0) {
                return mo4005b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @C0215r(from = 0.0d, mo670to = 1.0d)
        /* renamed from: c */
        public float mo4007c(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void mo4008c(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view) {
        }

        @C0195i0
        /* renamed from: d */
        public Parcelable mo4009d(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v) {
            return BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void mo4010d(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view) {
        }

        public C0712c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public static void m4150a(@C0193h0 View view, @C0195i0 Object obj) {
            ((C0716g) view.getLayoutParams()).f3364r = obj;
        }

        @C0195i0
        /* renamed from: a */
        public static Object m4149a(@C0193h0 View view) {
            return ((C0716g) view.getLayoutParams()).f3364r;
        }

        /* renamed from: a */
        public void mo3992a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, @C0193h0 View view2, int i, int i2) {
            if (i2 == 0) {
                mo3991a(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo3985a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i) {
            if (i == 0) {
                mo4010d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo3987a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3986a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo3988a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, int i3, int i4, int i5, @C0193h0 int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo3987a(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public void mo3990a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, @C0193h0 int[] iArr, int i3) {
            if (i3 == 0) {
                mo3989a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0713d {
        Class<? extends C0712c> value();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public @interface C0714e {
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    private class C0715f implements OnHierarchyChangeListener {
        C0715f() {
        }

        public void onChildViewAdded(View view, View view2) {
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3342f0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo3930a(2);
            OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3342f0;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public static class C0716g extends MarginLayoutParams {

        /* renamed from: a */
        C0712c f3347a;

        /* renamed from: b */
        boolean f3348b = false;

        /* renamed from: c */
        public int f3349c = 0;

        /* renamed from: d */
        public int f3350d = 0;

        /* renamed from: e */
        public int f3351e = -1;

        /* renamed from: f */
        int f3352f = -1;

        /* renamed from: g */
        public int f3353g = 0;

        /* renamed from: h */
        public int f3354h = 0;

        /* renamed from: i */
        int f3355i;

        /* renamed from: j */
        int f3356j;

        /* renamed from: k */
        View f3357k;

        /* renamed from: l */
        View f3358l;

        /* renamed from: m */
        private boolean f3359m;

        /* renamed from: n */
        private boolean f3360n;

        /* renamed from: o */
        private boolean f3361o;

        /* renamed from: p */
        private boolean f3362p;

        /* renamed from: q */
        final Rect f3363q = new Rect();

        /* renamed from: r */
        Object f3364r;

        public C0716g(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo4017a(@C0195i0 C0712c cVar) {
            C0712c cVar2 = this.f3347a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo3982a();
                }
                this.f3347a = cVar;
                this.f3364r = null;
                this.f3348b = true;
                if (cVar != null) {
                    cVar.mo3983a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4023b() {
            if (this.f3347a == null) {
                this.f3359m = false;
            }
            return this.f3359m;
        }

        @C0225w
        /* renamed from: c */
        public int mo4025c() {
            return this.f3352f;
        }

        @C0195i0
        /* renamed from: d */
        public C0712c mo4027d() {
            return this.f3347a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo4028e() {
            return this.f3362p;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public Rect mo4029f() {
            return this.f3363q;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo4030g() {
            this.f3358l = null;
            this.f3357k = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4031h() {
            this.f3362p = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo4032i() {
            this.f3359m = false;
        }

        /* renamed from: c */
        public void mo4026c(@C0225w int i) {
            mo4030g();
            this.f3352f = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4024b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f3359m;
            if (z) {
                return true;
            }
            C0712c cVar = this.f3347a;
            boolean a = (cVar != null ? cVar.mo3993a(coordinatorLayout, view) : false) | z;
            this.f3359m = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4016a(Rect rect) {
            this.f3363q.set(rect);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4022b(int i) {
            mo4015a(i, false);
        }

        /* renamed from: b */
        private boolean m4183b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3357k.getId() != this.f3352f) {
                return false;
            }
            View view2 = this.f3357k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3358l = null;
                    this.f3357k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3358l = view2;
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4019a() {
            return this.f3357k == null && this.f3352f != -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4015a(int i, boolean z) {
            if (i == 0) {
                this.f3360n = z;
            } else if (i == 1) {
                this.f3361o = z;
            }
        }

        C0716g(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0705R.styleable.CoordinatorLayout_Layout);
            this.f3349c = obtainStyledAttributes.getInteger(C0705R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f3352f = obtainStyledAttributes.getResourceId(C0705R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f3350d = obtainStyledAttributes.getInteger(C0705R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f3351e = obtainStyledAttributes.getInteger(C0705R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f3353g = obtainStyledAttributes.getInt(C0705R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f3354h = obtainStyledAttributes.getInt(C0705R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.f3348b = obtainStyledAttributes.hasValue(C0705R.styleable.CoordinatorLayout_Layout_layout_behavior);
            if (this.f3348b) {
                this.f3347a = CoordinatorLayout.m4101a(context, attributeSet, obtainStyledAttributes.getString(C0705R.styleable.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0712c cVar = this.f3347a;
            if (cVar != null) {
                cVar.mo3983a(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4020a(int i) {
            if (i == 0) {
                return this.f3360n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3361o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4018a(boolean z) {
            this.f3362p = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4021a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 != this.f3358l && !m4182a(view2, C0962e0.m5566x(coordinatorLayout))) {
                C0712c cVar = this.f3347a;
                if (cVar == null || !cVar.mo3999a(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo4014a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3352f == -1) {
                this.f3358l = null;
                this.f3357k = null;
                return null;
            }
            if (this.f3357k == null || !m4183b(view, coordinatorLayout)) {
                m4181a(view, coordinatorLayout);
            }
            return this.f3357k;
        }

        /* renamed from: a */
        private void m4181a(View view, CoordinatorLayout coordinatorLayout) {
            this.f3357k = coordinatorLayout.findViewById(this.f3352f);
            View view2 = this.f3357k;
            if (view2 != null) {
                if (view2 != coordinatorLayout) {
                    ViewParent parent = view2.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f3358l = null;
                            this.f3357k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3358l = view2;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f3358l = null;
                    this.f3357k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f3358l = null;
                this.f3357k = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find CoordinatorLayout descendant view with id ");
                sb.append(coordinatorLayout.getResources().getResourceName(this.f3352f));
                sb.append(" to anchor view ");
                sb.append(view);
                throw new IllegalStateException(sb.toString());
            }
        }

        public C0716g(C0716g gVar) {
            super(gVar);
        }

        /* renamed from: a */
        private boolean m4182a(View view, int i) {
            int a = C0984g.m5636a(((C0716g) view.getLayoutParams()).f3353g, i);
            return a != 0 && (C0984g.m5636a(this.f3354h, i) & a) == a;
        }

        public C0716g(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0716g(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    class C0717h implements OnPreDrawListener {
        C0717h() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo3930a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0718i implements Comparator<View> {
        C0718i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float Z = C0962e0.m5422Z(view);
            float Z2 = C0962e0.m5422Z(view2);
            if (Z > Z2) {
                return -1;
            }
            return Z < Z2 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f3315j0 = packageR != null ? packageR.getName() : null;
        if (VERSION.SDK_INT >= 21) {
            f3323r0 = new C0718i();
        } else {
            f3323r0 = null;
        }
    }

    public CoordinatorLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m4100a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m4102a(@C0193h0 Rect rect) {
        rect.setEmpty();
        f3324s0.release(rect);
    }

    /* renamed from: b */
    private int m4110b(int i) {
        int[] iArr = this.f3332U;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            sb.toString();
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            sb2.toString();
            return 0;
        }
    }

    /* renamed from: c */
    private static int m4113c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m4114d(int i) {
        if ((i & 7) == 0) {
            i |= C0984g.f4394b;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: e */
    private static int m4116e(int i) {
        return i == 0 ? BadgeDrawable.f16064b0 : i;
    }

    /* renamed from: e */
    private void m4117e(View view, int i) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        int i2 = gVar.f3355i;
        if (i2 != i) {
            C0962e0.m5508g(view, i - i2);
            gVar.f3355i = i;
        }
    }

    /* renamed from: f */
    private void m4119f(View view, int i) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        int i2 = gVar.f3356j;
        if (i2 != i) {
            C0962e0.m5513h(view, i - i2);
            gVar.f3356j = i;
        }
    }

    @C0193h0
    /* renamed from: g */
    private static Rect m4120g() {
        Rect rect = (Rect) f3324s0.mo4743a();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: h */
    private void m4121h() {
        this.f3335a.clear();
        this.f3337b.mo4036a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0716g d = mo3945d(childAt);
            d.mo4014a(this, childAt);
            this.f3337b.mo4037a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo4021a(this, childAt, childAt2)) {
                        if (!this.f3337b.mo4040b(childAt2)) {
                            this.f3337b.mo4037a(childAt2);
                        }
                        this.f3337b.mo4038a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3335a.addAll(this.f3337b.mo4039b());
        Collections.reverse(this.f3335a);
    }

    /* renamed from: i */
    private void m4122i() {
        if (VERSION.SDK_INT >= 21) {
            if (C0962e0.m5554s(this)) {
                if (this.f3343g0 == null) {
                    this.f3343g0 = new C0710a();
                }
                C0962e0.m5448a((View) this, this.f3343g0);
                setSystemUiVisibility(1280);
            } else {
                C0962e0.m5448a((View) this, (C1054x) null);
            }
        }
    }

    /* renamed from: c */
    public void mo3942c(@C0193h0 View view, int i) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        if (!gVar.mo4019a()) {
            View view2 = gVar.f3357k;
            if (view2 != null) {
                m4105a(view, view2, i);
                return;
            }
            int i2 = gVar.f3351e;
            if (i2 >= 0) {
                m4112b(view, i2, i);
            } else {
                m4115d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0716g) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0716g mo3945d(View view) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        if (!gVar.f3348b) {
            if (view instanceof C0711b) {
                gVar.mo4017a(((C0711b) view).getBehavior());
                gVar.f3348b = true;
            } else {
                C0713d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0713d) cls.getAnnotation(C0713d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        gVar.mo4017a((C0712c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(dVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        sb.toString();
                    }
                }
                gVar.f3348b = true;
            }
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        C0712c cVar = gVar.f3347a;
        if (cVar != null) {
            float c = cVar.mo4007c(this, view);
            if (c > 0.0f) {
                if (this.f3327P == null) {
                    this.f3327P = new Paint();
                }
                this.f3327P.setColor(gVar.f3347a.mo4002b(this, view));
                this.f3327P.setAlpha(m4100a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3327P);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3341e0;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public final List<View> getDependencySortedChildren() {
        m4121h();
        return Collections.unmodifiableList(this.f3335a);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public final C1006n0 getLastWindowInsets() {
        return this.f3339c0;
    }

    public int getNestedScrollAxes() {
        return this.f3344h0.mo5189a();
    }

    @C0195i0
    public Drawable getStatusBarBackground() {
        return this.f3341e0;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4108a(false);
        if (this.f3338b0) {
            if (this.f3336a0 == null) {
                this.f3336a0 = new C0717h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3336a0);
        }
        if (this.f3339c0 == null && C0962e0.m5554s(this)) {
            C0962e0.m5563v0(this);
        }
        this.f3331T = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4108a(false);
        if (this.f3338b0 && this.f3336a0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3336a0);
        }
        View view = this.f3334W;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3331T = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3340d0 && this.f3341e0 != null) {
            C1006n0 n0Var = this.f3339c0;
            int l = n0Var != null ? n0Var.mo4888l() : 0;
            if (l > 0) {
                this.f3341e0.setBounds(0, 0, getWidth(), l);
                this.f3341e0.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m4108a(true);
        }
        boolean a = m4109a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m4108a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int x = C0962e0.m5566x(this);
        int size = this.f3335a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f3335a.get(i5);
            if (view.getVisibility() != 8) {
                C0712c d = ((C0716g) view.getLayoutParams()).mo4027d();
                if (d == null || !d.mo3994a(this, view, x)) {
                    mo3942c(view, x);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        if (r0.mo3995a(r30, r20, r11, r21, r23, 0) == false) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m4121h()
            r30.mo3949e()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = androidx.core.p034l.C0962e0.m5566x(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            androidx.core.l.n0 r3 = r7.f3339c0
            if (r3 == 0) goto L_0x004b
            boolean r3 = androidx.core.p034l.C0962e0.m5554s(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f3335a
            int r6 = r2.size()
            r4 = r0
            r2 = r1
            r3 = 0
            r5 = 0
        L_0x0057:
            if (r5 >= r6) goto L_0x016c
            java.util.List<android.view.View> r0 = r7.f3335a
            java.lang.Object r0 = r0.get(r5)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0071
            r22 = r5
            r29 = r6
            goto L_0x0166
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g) r1
            int r0 = r1.f3351e
            if (r0 < 0) goto L_0x00b8
            if (r13 == 0) goto L_0x00b8
            int r0 = r7.m4110b(r0)
            int r11 = r1.f3349c
            int r11 = m4116e(r11)
            int r11 = androidx.core.p034l.C0984g.m5636a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0095
            if (r12 == 0) goto L_0x009a
        L_0x0095:
            r2 = 5
            if (r11 != r2) goto L_0x00a6
            if (r12 == 0) goto L_0x00a6
        L_0x009a:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bd
        L_0x00a6:
            if (r11 != r2) goto L_0x00aa
            if (r12 == 0) goto L_0x00af
        L_0x00aa:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00af:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bd
        L_0x00b8:
            r22 = r2
        L_0x00ba:
            r11 = 0
            r21 = 0
        L_0x00bd:
            if (r19 == 0) goto L_0x00ef
            boolean r0 = androidx.core.p034l.C0962e0.m5554s(r20)
            if (r0 != 0) goto L_0x00ef
            androidx.core.l.n0 r0 = r7.f3339c0
            int r0 = r0.mo4886j()
            androidx.core.l.n0 r2 = r7.f3339c0
            int r2 = r2.mo4887k()
            int r0 = r0 + r2
            androidx.core.l.n0 r2 = r7.f3339c0
            int r2 = r2.mo4888l()
            androidx.core.l.n0 r11 = r7.f3339c0
            int r11 = r11.mo4885i()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f3
        L_0x00ef:
            r11 = r31
            r23 = r32
        L_0x00f3:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo4027d()
            if (r0 == 0) goto L_0x011a
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r27 = r3
            r3 = r11
            r28 = r4
            r4 = r21
            r22 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo3995a(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0133
            goto L_0x0126
        L_0x011a:
            r26 = r1
            r27 = r3
            r28 = r4
            r29 = r6
            r25 = r22
            r22 = r5
        L_0x0126:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo3932a(r1, r2, r3, r4, r5)
        L_0x0133:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            r2 = r28
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r25
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r27
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r4 = r0
            r3 = r2
            r2 = r1
        L_0x0166:
            int r5 = r22 + 1
            r6 = r29
            goto L_0x0057
        L_0x016c:
            r1 = r2
            r11 = r3
            r2 = r4
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r3 = r31
            int r0 = android.view.View.resolveSizeAndState(r2, r3, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0716g gVar = (C0716g) childAt.getLayoutParams();
                if (gVar.mo4020a(0)) {
                    C0712c d = gVar.mo4027d();
                    if (d != null) {
                        z2 |= d.mo4001a(this, childAt, view, f, f2, z);
                    }
                }
            }
        }
        if (z2) {
            mo3930a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0716g gVar = (C0716g) childAt.getLayoutParams();
                if (gVar.mo4020a(0)) {
                    C0712c d = gVar.mo4027d();
                    if (d != null) {
                        z |= d.mo4000a(this, childAt, view, f, f2);
                    }
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1889a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1887a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1892b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.behaviorStates;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0712c d = mo3945d(childAt).mo4027d();
            if (!(id == -1 || d == null)) {
                Parcelable parcelable2 = (Parcelable) sparseArray.get(id);
                if (parcelable2 != null) {
                    d.mo3984a(this, childAt, parcelable2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0712c d = ((C0716g) childAt.getLayoutParams()).mo4027d();
            if (!(id == -1 || d == null)) {
                Parcelable d2 = d.mo4009d(this, childAt);
                if (d2 != null) {
                    sparseArray.append(id, d2);
                }
            }
        }
        savedState.behaviorStates = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1890a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1886a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3333V
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m4109a(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f3333V
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo4027d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f3333V
            boolean r6 = r6.mo4003b(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f3333V
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m4108a(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0712c d = ((C0716g) view.getLayoutParams()).mo4027d();
        if (d == null || !d.mo3997a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3330S) {
            m4108a(false);
            this.f3330S = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m4122i();
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3342f0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@C0195i0 Drawable drawable) {
        Drawable drawable2 = this.f3341e0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3341e0 = drawable3;
            Drawable drawable4 = this.f3341e0;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f3341e0.setState(getDrawableState());
                }
                C0892a.m5152a(this.f3341e0, C0962e0.m5566x(this));
                this.f3341e0.setVisible(getVisibility() == 0, false);
                this.f3341e0.setCallback(this);
            }
            C0962e0.m5561u0(this);
        }
    }

    public void setStatusBarBackgroundColor(@C0198k int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@C0213q int i) {
        setStatusBarBackground(i != 0 ? C0841b.m4928c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3341e0;
        if (drawable != null && drawable.isVisible() != z) {
            this.f3341e0.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3341e0;
    }

    public CoordinatorLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C0705R.attr.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public C0716g generateDefaultLayoutParams() {
        return new C0716g(-2, -2);
    }

    public CoordinatorLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i) {
        TypedArray typedArray;
        super(context, attributeSet, i);
        this.f3335a = new ArrayList();
        this.f3337b = new C0719a<>();
        this.f3325N = new ArrayList();
        this.f3326O = new ArrayList();
        this.f3328Q = new int[2];
        this.f3329R = new int[2];
        this.f3344h0 = new C1053w(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C0705R.styleable.CoordinatorLayout, 0, C0705R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C0705R.styleable.CoordinatorLayout, i, 0);
        }
        if (VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C0705R.styleable.CoordinatorLayout, attributeSet, typedArray, 0, C0705R.style.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C0705R.styleable.CoordinatorLayout, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C0705R.styleable.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3332U = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3332U.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f3332U;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f3341e0 = typedArray.getDrawable(C0705R.styleable.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m4122i();
        super.setOnHierarchyChangeListener(new C0715f());
        if (C0962e0.m5557t(this) == 0) {
            C0962e0.m5531l((View) this, 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1006n0 mo3929a(C1006n0 n0Var) {
        if (C0937e.m5328a(this.f3339c0, n0Var)) {
            return n0Var;
        }
        this.f3339c0 = n0Var;
        boolean z = true;
        this.f3340d0 = n0Var != null && n0Var.mo4888l() > 0;
        if (this.f3340d0 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C1006n0 b = m4111b(n0Var);
        requestLayout();
        return b;
    }

    public C0716g generateLayoutParams(AttributeSet attributeSet) {
        return new C0716g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0716g generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0716g) {
            return new C0716g((C0716g) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0716g((MarginLayoutParams) layoutParams);
        }
        return new C0716g(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3949e() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m4118e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f3338b0) {
            return;
        }
        if (z) {
            mo3946d();
        } else {
            mo3950f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3950f() {
        if (this.f3331T && this.f3336a0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3336a0);
        }
        this.f3338b0 = false;
    }

    /* renamed from: b */
    private C1006n0 m4111b(C1006n0 n0Var) {
        if (n0Var.mo4892p()) {
            return n0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C0962e0.m5554s(childAt)) {
                C0712c d = ((C0716g) childAt.getLayoutParams()).mo4027d();
                if (d != null) {
                    n0Var = d.mo3981a(this, childAt, n0Var);
                    if (n0Var.mo4892p()) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return n0Var;
    }

    /* renamed from: a */
    private void m4108a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0712c d = ((C0716g) childAt.getLayoutParams()).mo4027d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo3998a(this, childAt, obtain);
                } else {
                    d.mo4003b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0716g) getChildAt(i2).getLayoutParams()).mo4032i();
        }
        this.f3333V = null;
        this.f3330S = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3943c(View view, Rect rect) {
        ((C0716g) view.getLayoutParams()).mo4016a(rect);
    }

    /* renamed from: e */
    private boolean m4118e(View view) {
        return this.f3337b.mo4044e(view);
    }

    @C0193h0
    /* renamed from: c */
    public List<View> mo3941c(@C0193h0 View view) {
        List c = this.f3337b.mo4042c(view);
        this.f3326O.clear();
        if (c != null) {
            this.f3326O.addAll(c);
        }
        return this.f3326O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3940b(View view, Rect rect) {
        rect.set(((C0716g) view.getLayoutParams()).mo4029f());
    }

    /* renamed from: d */
    private void m4115d(View view, int i) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        Rect g = m4120g();
        g.set(getPaddingLeft() + gVar.leftMargin, getPaddingTop() + gVar.topMargin, (getWidth() - getPaddingRight()) - gVar.rightMargin, (getHeight() - getPaddingBottom()) - gVar.bottomMargin);
        if (this.f3339c0 != null && C0962e0.m5554s(this) && !C0962e0.m5554s(view)) {
            g.left += this.f3339c0.mo4886j();
            g.top += this.f3339c0.mo4888l();
            g.right -= this.f3339c0.mo4887k();
            g.bottom -= this.f3339c0.mo4885i();
        }
        Rect g2 = m4120g();
        C0984g.m5638a(m4114d(gVar.f3349c), view.getMeasuredWidth(), view.getMeasuredHeight(), g, g2, i);
        view.layout(g2.left, g2.top, g2.right, g2.bottom);
        m4102a(g);
        m4102a(g2);
    }

    /* renamed from: b */
    private void m4112b(View view, int i, int i2) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        int a = C0984g.m5636a(m4116e(gVar.f3349c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m4110b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + gVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - gVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + gVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - gVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: a */
    private void m4107a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        int i = childCount - 1;
        while (i >= 0) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
            i--;
        }
        Comparator<View> comparator = f3323r0;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private boolean m4109a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3325N;
        m4107a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0716g gVar = (C0716g) view.getLayoutParams();
            C0712c d = gVar.mo4027d();
            boolean z3 = true;
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.mo3998a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.mo4003b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f3333V = view;
                    }
                }
                boolean b = gVar.mo4023b();
                boolean b2 = gVar.mo4024b(this, view);
                if (!b2 || b) {
                    z3 = false;
                }
                if (b2 && !z3) {
                    break;
                }
                z2 = z3;
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.mo3998a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.mo4003b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3946d() {
        if (this.f3331T) {
            if (this.f3336a0 == null) {
                this.f3336a0 = new C0717h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3336a0);
        }
        this.f3338b0 = true;
    }

    @C0193h0
    /* renamed from: b */
    public List<View> mo3938b(@C0193h0 View view) {
        List d = this.f3337b.mo4043d(view);
        this.f3326O.clear();
        if (d != null) {
            this.f3326O.addAll(d);
        }
        return this.f3326O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3939b(View view, int i) {
        View view2 = view;
        C0716g gVar = (C0716g) view.getLayoutParams();
        if (gVar.f3357k != null) {
            Rect g = m4120g();
            Rect g2 = m4120g();
            Rect g3 = m4120g();
            mo3934a(gVar.f3357k, g);
            boolean z = false;
            mo3935a(view2, false, g2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m4103a(view, i, g, g3, gVar, measuredWidth, measuredHeight);
            if (!(g3.left == g2.left && g3.top == g2.top)) {
                z = true;
            }
            m4106a(gVar, g3, measuredWidth, i2);
            int i3 = g3.left - g2.left;
            int i4 = g3.top - g2.top;
            if (i3 != 0) {
                C0962e0.m5508g(view2, i3);
            }
            if (i4 != 0) {
                C0962e0.m5513h(view2, i4);
            }
            if (z) {
                C0712c d = gVar.mo4027d();
                if (d != null) {
                    d.mo4004b(this, view2, gVar.f3357k);
                }
            }
            m4102a(g);
            m4102a(g2);
            m4102a(g3);
        }
    }

    /* renamed from: a */
    static C0712c m4101a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f3315j0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f3315j0);
            sb2.append('.');
            sb2.append(str);
            str = sb2.toString();
        }
        try {
            Map map = (Map) f3319n0.get();
            if (map == null) {
                map = new HashMap();
                f3319n0.set(map);
            }
            Constructor constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3318m0);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0712c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    /* renamed from: b */
    public void mo1892b(View view, View view2, int i, int i2) {
        this.f3344h0.mo5193a(view, view2, i, i2);
        this.f3334W = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0716g gVar = (C0716g) childAt.getLayoutParams();
            if (gVar.mo4020a(i2)) {
                C0712c d = gVar.mo4027d();
                if (d != null) {
                    d.mo3992a(this, childAt, view, view2, i, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3934a(View view, Rect rect) {
        C0720b.m4216a((ViewGroup) this, view, rect);
    }

    /* renamed from: a */
    public void mo3932a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3935a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
            return;
        }
        if (z) {
            mo3934a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private void m4103a(View view, int i, Rect rect, Rect rect2, C0716g gVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C0984g.m5636a(m4113c(gVar.f3349c), i);
        int a2 = C0984g.m5636a(m4114d(gVar.f3350d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: a */
    private void m4106a(C0716g gVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + gVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - gVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + gVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - gVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3933a(View view, int i, Rect rect, Rect rect2) {
        C0716g gVar = (C0716g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m4103a(view, i, rect, rect2, gVar, measuredWidth, measuredHeight);
        m4106a(gVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m4105a(View view, View view2, int i) {
        Rect g = m4120g();
        Rect g2 = m4120g();
        try {
            mo3934a(view2, g);
            mo3933a(view, i, g, g2);
            view.layout(g2.left, g2.top, g2.right, g2.bottom);
        } finally {
            m4102a(g);
            m4102a(g2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3930a(int i) {
        boolean z;
        int i2 = i;
        int x = C0962e0.m5566x(this);
        int size = this.f3335a.size();
        Rect g = m4120g();
        Rect g2 = m4120g();
        Rect g3 = m4120g();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.f3335a.get(i3);
            C0716g gVar = (C0716g) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (gVar.f3358l == ((View) this.f3335a.get(i4))) {
                        mo3939b(view, x);
                    }
                }
                mo3935a(view, true, g2);
                if (gVar.f3353g != 0 && !g2.isEmpty()) {
                    int a = C0984g.m5636a(gVar.f3353g, x);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        g.top = Math.max(g.top, g2.bottom);
                    } else if (i5 == 80) {
                        g.bottom = Math.max(g.bottom, getHeight() - g2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        g.left = Math.max(g.left, g2.right);
                    } else if (i6 == 5) {
                        g.right = Math.max(g.right, getWidth() - g2.left);
                    }
                }
                if (gVar.f3354h != 0 && view.getVisibility() == 0) {
                    m4104a(view, g, x);
                }
                if (i2 != 2) {
                    mo3940b(view, g3);
                    if (!g3.equals(g2)) {
                        mo3943c(view, g2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = (View) this.f3335a.get(i7);
                    C0716g gVar2 = (C0716g) view2.getLayoutParams();
                    C0712c d = gVar2.mo4027d();
                    if (d != null && d.mo3999a(this, view2, view)) {
                        if (i2 != 0 || !gVar2.mo4028e()) {
                            if (i2 != 2) {
                                z = d.mo4004b(this, view2, view);
                            } else {
                                d.mo4008c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                gVar2.mo4018a(z);
                            }
                        } else {
                            gVar2.mo4031h();
                        }
                    }
                }
            }
        }
        m4102a(g);
        m4102a(g2);
        m4102a(g3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4104a(android.view.View r9, android.graphics.Rect r10, int r11) {
        /*
            r8 = this;
            boolean r0 = androidx.core.p034l.C0962e0.m5540n0(r9)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = r9.getWidth()
            if (r0 <= 0) goto L_0x00fc
            int r0 = r9.getHeight()
            if (r0 > 0) goto L_0x0015
            goto L_0x00fc
        L_0x0015:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.mo4027d()
            android.graphics.Rect r2 = m4120g()
            android.graphics.Rect r3 = m4120g()
            int r4 = r9.getLeft()
            int r5 = r9.getTop()
            int r6 = r9.getRight()
            int r7 = r9.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r1.mo3996a(r8, r9, r2)
            if (r1 == 0) goto L_0x0070
            boolean r1 = r3.contains(r2)
            if (r1 == 0) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Rect should be within the child's bounds. Rect:"
            r10.append(r11)
            java.lang.String r11 = r2.toShortString()
            r10.append(r11)
            java.lang.String r11 = " | Bounds:"
            r10.append(r11)
            java.lang.String r11 = r3.toShortString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0070:
            r2.set(r3)
        L_0x0073:
            m4102a(r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0080
            m4102a(r2)
            return
        L_0x0080:
            int r1 = r0.f3354h
            int r11 = androidx.core.p034l.C0984g.m5636a(r1, r11)
            r1 = r11 & 48
            r3 = 48
            r4 = 1
            r5 = 0
            if (r1 != r3) goto L_0x00a0
            int r1 = r2.top
            int r3 = r0.topMargin
            int r1 = r1 - r3
            int r3 = r0.f3356j
            int r1 = r1 - r3
            int r3 = r10.top
            if (r1 >= r3) goto L_0x00a0
            int r3 = r3 - r1
            r8.m4119f(r9, r3)
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            r3 = r11 & 80
            r6 = 80
            if (r3 != r6) goto L_0x00bd
            int r3 = r8.getHeight()
            int r6 = r2.bottom
            int r3 = r3 - r6
            int r6 = r0.bottomMargin
            int r3 = r3 - r6
            int r6 = r0.f3356j
            int r3 = r3 + r6
            int r6 = r10.bottom
            if (r3 >= r6) goto L_0x00bd
            int r3 = r3 - r6
            r8.m4119f(r9, r3)
            r1 = 1
        L_0x00bd:
            if (r1 != 0) goto L_0x00c2
            r8.m4119f(r9, r5)
        L_0x00c2:
            r1 = r11 & 3
            r3 = 3
            if (r1 != r3) goto L_0x00d9
            int r1 = r2.left
            int r3 = r0.leftMargin
            int r1 = r1 - r3
            int r3 = r0.f3355i
            int r1 = r1 - r3
            int r3 = r10.left
            if (r1 >= r3) goto L_0x00d9
            int r3 = r3 - r1
            r8.m4117e(r9, r3)
            r1 = 1
            goto L_0x00da
        L_0x00d9:
            r1 = 0
        L_0x00da:
            r3 = 5
            r11 = r11 & r3
            if (r11 != r3) goto L_0x00f4
            int r11 = r8.getWidth()
            int r3 = r2.right
            int r11 = r11 - r3
            int r3 = r0.rightMargin
            int r11 = r11 - r3
            int r0 = r0.f3355i
            int r11 = r11 + r0
            int r10 = r10.right
            if (r11 >= r10) goto L_0x00f4
            int r11 = r11 - r10
            r8.m4117e(r9, r11)
            r1 = 1
        L_0x00f4:
            if (r1 != 0) goto L_0x00f9
            r8.m4117e(r9, r5)
        L_0x00f9:
            m4102a(r2)
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m4104a(android.view.View, android.graphics.Rect, int):void");
    }

    /* renamed from: a */
    public void mo3931a(@C0193h0 View view) {
        List c = this.f3337b.mo4042c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0712c d = ((C0716g) view2.getLayoutParams()).mo4027d();
                if (d != null) {
                    d.mo4004b(this, view2, view);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo3936a(@C0193h0 View view, int i, int i2) {
        Rect g = m4120g();
        mo3934a(view, g);
        try {
            return g.contains(i, i2);
        } finally {
            m4102a(g);
        }
    }

    /* renamed from: a */
    public boolean mo3937a(@C0193h0 View view, @C0193h0 View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect g = m4120g();
        mo3935a(view, view.getParent() != this, g);
        Rect g2 = m4120g();
        mo3935a(view2, view2.getParent() != this, g2);
        try {
            if (g.left <= g2.right && g.top <= g2.bottom && g.right >= g2.left && g.bottom >= g2.top) {
                z = true;
            }
            return z;
        } finally {
            m4102a(g);
            m4102a(g2);
        }
    }

    /* renamed from: a */
    public boolean mo1890a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0716g gVar = (C0716g) childAt.getLayoutParams();
                C0712c d = gVar.mo4027d();
                if (d != null) {
                    boolean b = d.mo4006b(this, childAt, view, view2, i, i2);
                    boolean z2 = z | b;
                    gVar.mo4015a(i3, b);
                    z = z2;
                } else {
                    gVar.mo4015a(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo1886a(View view, int i) {
        this.f3344h0.mo5191a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0716g gVar = (C0716g) childAt.getLayoutParams();
            if (gVar.mo4020a(i)) {
                C0712c d = gVar.mo4027d();
                if (d != null) {
                    d.mo3985a(this, childAt, view, i);
                }
                gVar.mo4022b(i);
                gVar.mo4031h();
            }
        }
        this.f3334W = null;
    }

    /* renamed from: a */
    public void mo1887a(View view, int i, int i2, int i3, int i4, int i5) {
        mo1888a(view, i, i2, i3, i4, 0, this.f3329R);
    }

    /* renamed from: a */
    public void mo1888a(@C0193h0 View view, int i, int i2, int i3, int i4, int i5, @C0193h0 int[] iArr) {
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0716g gVar = (C0716g) childAt.getLayoutParams();
                if (gVar.mo4020a(i5)) {
                    C0712c d = gVar.mo4027d();
                    if (d != null) {
                        int[] iArr2 = this.f3328Q;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        d.mo3988a(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                        int[] iArr3 = this.f3328Q;
                        if (i3 > 0) {
                            i6 = Math.max(i8, iArr3[0]);
                        } else {
                            i6 = Math.min(i8, iArr3[0]);
                        }
                        if (i4 > 0) {
                            i7 = Math.max(i9, this.f3328Q[1]);
                        } else {
                            i7 = Math.min(i9, this.f3328Q[1]);
                        }
                        i8 = i6;
                        i9 = i7;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo3930a(1);
        }
    }

    /* renamed from: a */
    public void mo1889a(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0716g gVar = (C0716g) childAt.getLayoutParams();
                if (gVar.mo4020a(i3)) {
                    C0712c d = gVar.mo4027d();
                    if (d != null) {
                        int[] iArr2 = this.f3328Q;
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                        d.mo3990a(this, childAt, view, i, i2, iArr2, i3);
                        int[] iArr3 = this.f3328Q;
                        if (i > 0) {
                            i4 = Math.max(i6, iArr3[0]);
                        } else {
                            i4 = Math.min(i6, iArr3[0]);
                        }
                        int[] iArr4 = this.f3328Q;
                        if (i2 > 0) {
                            i5 = Math.max(i7, iArr4[1]);
                        } else {
                            i5 = Math.min(i7, iArr4[1]);
                        }
                        i6 = i4;
                        i7 = i5;
                        z = true;
                    }
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo3930a(1);
        }
    }
}
