package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0711b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p027g.C0890a;
import androidx.core.p033k.C0937e;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.C1048r;
import androidx.core.p034l.C1054x;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p179a.C5587a;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements C0711b {

    /* renamed from: f0 */
    static final int f15953f0 = 0;

    /* renamed from: g0 */
    static final int f15954g0 = 1;

    /* renamed from: h0 */
    static final int f15955h0 = 2;

    /* renamed from: i0 */
    static final int f15956i0 = 4;

    /* renamed from: j0 */
    static final int f15957j0 = 8;

    /* renamed from: k0 */
    private static final int f15958k0 = -1;

    /* renamed from: N */
    private int f15959N;

    /* renamed from: O */
    private int f15960O;

    /* renamed from: P */
    private boolean f15961P;

    /* renamed from: Q */
    private int f15962Q;
    @C0195i0

    /* renamed from: R */
    private C1006n0 f15963R;

    /* renamed from: S */
    private List<C5604c> f15964S;

    /* renamed from: T */
    private boolean f15965T;

    /* renamed from: U */
    private boolean f15966U;

    /* renamed from: V */
    private boolean f15967V;

    /* renamed from: W */
    private boolean f15968W;

    /* renamed from: a */
    private int f15969a;
    @C0225w

    /* renamed from: a0 */
    private int f15970a0;

    /* renamed from: b */
    private int f15971b;
    @C0195i0

    /* renamed from: b0 */
    private WeakReference<View> f15972b0;
    @C0195i0

    /* renamed from: c0 */
    private ValueAnimator f15973c0;

    /* renamed from: d0 */
    private int[] f15974d0;
    @C0195i0

    /* renamed from: e0 */
    private Drawable f15975e0;

    protected static class BaseBehavior<T extends AppBarLayout> extends C5613b<T> {

        /* renamed from: t */
        private static final int f15976t = 600;

        /* renamed from: u */
        private static final int f15977u = -1;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f15978l;

        /* renamed from: m */
        private int f15979m;

        /* renamed from: n */
        private ValueAnimator f15980n;

        /* renamed from: o */
        private int f15981o = -1;

        /* renamed from: p */
        private boolean f15982p;

        /* renamed from: q */
        private float f15983q;
        @C0195i0

        /* renamed from: r */
        private WeakReference<View> f15984r;

        /* renamed from: s */
        private C5600b f15985s;

        protected static class SavedState extends AbsSavedState {
            public static final Creator<SavedState> CREATOR = new C5598a();
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C5598a implements ClassLoaderCreator<SavedState> {
                C5598a() {
                }

                @C0193h0
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }

                @C0193h0
                public SavedState createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                @C0195i0
                public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                    return new SavedState(parcel, null);
                }
            }

            public SavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.firstVisibleChildIndex = parcel.readInt();
                this.firstVisibleChildPercentageShown = parcel.readFloat();
                this.firstVisibleChildAtMinimumHeight = parcel.readByte() != 0;
            }

            public void writeToParcel(@C0193h0 Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.firstVisibleChildIndex);
                parcel.writeFloat(this.firstVisibleChildPercentageShown);
                parcel.writeByte(this.firstVisibleChildAtMinimumHeight ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C5599a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f15986a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f15987b;

            C5599a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f15986a = coordinatorLayout;
                this.f15987b = appBarLayout;
            }

            public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
                BaseBehavior.this.mo22229c(this.f15986a, this.f15987b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C5600b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo22141a(@C0193h0 T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: a */
        private static boolean m24317a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo22135f() {
            return mo22147c() + this.f15978l;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: g */
        public boolean mo22136g() {
            ValueAnimator valueAnimator = this.f15980n;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo22133d(@C0193h0 T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: c */
        private int m24320c(@C0193h0 T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C5605d dVar = (C5605d) childAt.getLayoutParams();
                Interpolator b = dVar.mo22158b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = dVar.mo22155a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0962e0.m5399C(childAt);
                        }
                    }
                    if (C0962e0.m5554s(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: d */
        private void m24322d(CoordinatorLayout coordinatorLayout, @C0193h0 T t) {
            int f = mo22135f();
            int b = m24319b(t, f);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C5605d dVar = (C5605d) childAt.getLayoutParams();
                int a = dVar.mo22155a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m24317a(a, 2)) {
                        i2 += C0962e0.m5399C(childAt);
                    } else if (m24317a(a, 5)) {
                        int C = C0962e0.m5399C(childAt) + i2;
                        if (f < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m24317a(a, 32)) {
                        i += dVar.topMargin;
                        i2 -= dVar.bottomMargin;
                    }
                    if (f < (i2 + i) / 2) {
                        i = i2;
                    }
                    m24314a(coordinatorLayout, t, C0890a.m5110a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: b */
        private int m24319b(@C0193h0 T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C5605d dVar = (C5605d) childAt.getLayoutParams();
                if (m24317a(dVar.mo22155a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public boolean mo4006b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, @C0193h0 View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mo22081c() || m24318a(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.f15980n;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f15984r = null;
            this.f15979m = i2;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo22131c(@C0193h0 T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: a */
        private boolean m24318a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, @C0193h0 View view) {
            return t.mo22079b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: b */
        public Parcelable mo4009d(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t) {
            Parcelable d = super.mo4009d(coordinatorLayout, t);
            int c = mo22147c();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + c;
                if (childAt.getTop() + c > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(d);
                    savedState.firstVisibleChildIndex = i;
                    if (bottom == C0962e0.m5399C(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.firstVisibleChildAtMinimumHeight = z;
                    savedState.firstVisibleChildPercentageShown = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return d;
        }

        /* renamed from: a */
        public void mo3990a(CoordinatorLayout coordinatorLayout, @C0193h0 T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo22227a(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo22081c()) {
                t.mo22082c(t.mo22075a(view));
            }
        }

        /* renamed from: c */
        private boolean m24321c(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t) {
            List c = coordinatorLayout.mo3941c((View) t);
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C0712c d = ((C0716g) ((View) c.get(i)).getLayoutParams()).mo4027d();
                if (d instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) d).mo22234f() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo3988a(CoordinatorLayout coordinatorLayout, @C0193h0 T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo22227a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo3985a(CoordinatorLayout coordinatorLayout, @C0193h0 T t, View view, int i) {
            if (this.f15979m == 0 || i == 1) {
                m24322d(coordinatorLayout, t);
                if (t.mo22081c()) {
                    t.mo22082c(t.mo22075a(view));
                }
            }
            this.f15984r = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo22122a(@C0195i0 C5600b bVar) {
            this.f15985s = bVar;
        }

        /* renamed from: a */
        private void m24314a(CoordinatorLayout coordinatorLayout, @C0193h0 T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo22135f() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m24315a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m24315a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int f = mo22135f();
            if (f == i) {
                ValueAnimator valueAnimator = this.f15980n;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15980n.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f15980n;
            if (valueAnimator2 == null) {
                this.f15980n = new ValueAnimator();
                this.f15980n.setInterpolator(C5587a.f15933e);
                this.f15980n.addUpdateListener(new C5599a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f15980n.setDuration((long) Math.min(i2, 600));
            this.f15980n.setIntValues(new int[]{f, i});
            this.f15980n.start();
        }

        /* renamed from: a */
        public boolean mo3995a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, int i, int i2, int i3, int i4) {
            if (((C0716g) t.getLayoutParams()).height != -2) {
                return super.mo3995a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo3932a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, int i) {
            int i2;
            boolean a = super.mo3994a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f15981o;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f15982p) {
                    i2 = C0962e0.m5399C(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f15983q);
                }
                mo22229c(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m24314a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo22229c(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m24314a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo22229c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo22084d();
            this.f15981o = -1;
            mo22146b(C0890a.m5110a(mo22147c(), -t.getTotalScrollRange(), 0));
            m24316a(coordinatorLayout, t, mo22147c(), 0, true);
            t.mo22070a(mo22147c());
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo22130b(T t) {
            C5600b bVar = this.f15985s;
            if (bVar != null) {
                return bVar.mo22141a(t);
            }
            WeakReference<View> weakReference = this.f15984r;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo22134e(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t) {
            m24322d(coordinatorLayout, t);
            if (t.mo22081c()) {
                t.mo22082c(t.mo22075a(m24312a(coordinatorLayout)));
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo22127b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, int i, int i2, int i3) {
            int f = mo22135f();
            int i4 = 0;
            if (i2 == 0 || f < i2 || f > i3) {
                this.f15978l = 0;
            } else {
                int a = C0890a.m5110a(i, i2, i3);
                if (f != a) {
                    int c = t.mo22074a() ? m24320c(t, a) : a;
                    boolean b = mo22146b(c);
                    i4 = f - a;
                    this.f15978l = a - c;
                    if (!b && t.mo22074a()) {
                        coordinatorLayout.mo3931a((View) t);
                    }
                    t.mo22070a(mo22147c());
                    m24316a(coordinatorLayout, t, a, a < f ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* renamed from: a */
        private void m24316a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, int i, int i2, boolean z) {
            View a = m24313a((AppBarLayout) t, i);
            if (a != null) {
                int a2 = ((C5605d) a.getLayoutParams()).mo22155a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int C = C0962e0.m5399C(a);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a.getBottom() - C) - t.getTopInset()) : (-i) >= (a.getBottom() - C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo22081c()) {
                    z2 = t.mo22075a(m24312a(coordinatorLayout));
                }
                boolean c = t.mo22082c(z2);
                if (z || (c && m24321c(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        @C0195i0
        /* renamed from: a */
        private static View m24313a(@C0193h0 AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @C0195i0
        /* renamed from: a */
        private View m24312a(@C0193h0 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C1048r) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo3984a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo3984a(coordinatorLayout, t, savedState.getSuperState());
                this.f15981o = savedState.firstVisibleChildIndex;
                this.f15983q = savedState.firstVisibleChildPercentageShown;
                this.f15982p = savedState.firstVisibleChildAtMinimumHeight;
                return;
            }
            super.mo3984a(coordinatorLayout, t, parcelable);
            this.f15981o = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$a */
        public static abstract class C5601a extends C5600b<AppBarLayout> {
        }

        public Behavior() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo22123a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, int i) {
            return super.mo3994a(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo22144b() {
            return super.mo22144b();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ int mo22147c() {
            return super.mo22147c();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ boolean mo22148d() {
            return super.mo22148d();
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo22149e() {
            return super.mo22149e();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo22124a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo3995a(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ Parcelable mo22129b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout) {
            return super.mo4009d(coordinatorLayout, appBarLayout);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22121a(CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo3990a(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo22146b(int i) {
            return super.mo22146b(i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22120a(CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo3988a(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo22145b(boolean z) {
            super.mo22145b(z);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22118a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo3984a(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo22125a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, @C0193h0 View view, View view2, int i, int i2) {
            return super.mo4006b(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22119a(CoordinatorLayout coordinatorLayout, @C0193h0 AppBarLayout appBarLayout, View view, int i) {
            super.mo3985a(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22122a(@C0195i0 C5600b bVar) {
            super.mo22122a(bVar);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22142a(boolean z) {
            super.mo22142a(z);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo22143a(int i) {
            return super.mo22143a(i);
        }
    }

    public static class ScrollingViewBehavior extends C5615c {
        public ScrollingViewBehavior() {
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ int mo22144b() {
            return super.mo22144b();
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ int mo22147c() {
            return super.mo22147c();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ boolean mo22148d() {
            return super.mo22148d();
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo22149e() {
            return super.mo22149e();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.ScrollingViewBehavior_Layout);
            mo22233c(obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, int i) {
            return super.mo3994a(coordinatorLayout, view, i);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo22146b(int i) {
            return super.mo22146b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public float mo22151c(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m24370a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo22152d(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo22152d(view);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo3995a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, int i, int i2, int i3, int i4) {
            return super.mo3995a(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ void mo22145b(boolean z) {
            super.mo22145b(z);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo22142a(boolean z) {
            super.mo22142a(z);
        }

        /* renamed from: b */
        public boolean mo4004b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, @C0193h0 View view2) {
            m24371a(view, view2);
            m24372b(view, view2);
            return false;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo22143a(int i) {
            return super.mo22143a(i);
        }

        /* renamed from: b */
        private void m24372b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo22081c()) {
                    appBarLayout.mo22082c(appBarLayout.mo22075a(view));
                }
            }
        }

        /* renamed from: a */
        public boolean mo3999a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: a */
        public boolean mo3997a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 View view, @C0193h0 Rect rect, boolean z) {
            AppBarLayout a = mo22150a(coordinatorLayout.mo3938b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f16049d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo22073a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        private void m24371a(@C0193h0 View view, @C0193h0 View view2) {
            C0712c d = ((C0716g) view2.getLayoutParams()).mo4027d();
            if (d instanceof BaseBehavior) {
                C0962e0.m5513h(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f15978l) + mo22235g()) - mo22231b(view2));
            }
        }

        /* renamed from: a */
        private static int m24370a(@C0193h0 AppBarLayout appBarLayout) {
            C0712c d = ((C0716g) appBarLayout.getLayoutParams()).mo4027d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo22135f();
            }
            return 0;
        }

        /* access modifiers changed from: 0000 */
        @C0195i0
        /* renamed from: a */
        public AppBarLayout m24374a(@C0193h0 List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C5602a implements C1054x {
        C5602a() {
        }

        /* renamed from: a */
        public C1006n0 mo860a(View view, C1006n0 n0Var) {
            return AppBarLayout.this.mo22069a(n0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C5603b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C6978j f15990a;

        C5603b(C6978j jVar) {
            this.f15990a = jVar;
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            this.f15990a.mo27799b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C5604c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo22154a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C5605d extends LayoutParams {

        /* renamed from: c */
        public static final int f15992c = 0;

        /* renamed from: d */
        public static final int f15993d = 1;

        /* renamed from: e */
        public static final int f15994e = 2;

        /* renamed from: f */
        public static final int f15995f = 4;

        /* renamed from: g */
        public static final int f15996g = 8;

        /* renamed from: h */
        public static final int f15997h = 16;

        /* renamed from: i */
        public static final int f15998i = 32;

        /* renamed from: j */
        static final int f15999j = 5;

        /* renamed from: k */
        static final int f16000k = 17;

        /* renamed from: l */
        static final int f16001l = 10;

        /* renamed from: a */
        int f16002a = 1;

        /* renamed from: b */
        Interpolator f16003b;

        @C0207n0({C0208a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.material.appbar.AppBarLayout$d$a */
        public @interface C5606a {
        }

        public C5605d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.AppBarLayout_Layout);
            this.f16002a = obtainStyledAttributes.getInt(C5582R.styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C5582R.styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f16003b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C5582R.styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo22156a(int i) {
            this.f16002a = i;
        }

        /* renamed from: b */
        public Interpolator mo22158b() {
            return this.f16003b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo22159c() {
            int i = this.f16002a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: a */
        public int mo22155a() {
            return this.f16002a;
        }

        /* renamed from: a */
        public void mo22157a(Interpolator interpolator) {
            this.f16003b = interpolator;
        }

        public C5605d(int i, int i2) {
            super(i, i2);
        }

        public C5605d(int i, int i2, float f) {
            super(i, i2, f);
        }

        public C5605d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C5605d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @RequiresApi(19)
        public C5605d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        @RequiresApi(19)
        public C5605d(@C0193h0 C5605d dVar) {
            super(dVar);
            this.f16002a = dVar.f16002a;
            this.f16003b = dVar.f16003b;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface C5607e extends C5604c<AppBarLayout> {
        /* renamed from: a */
        void mo22154a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private boolean m24289d(boolean z) {
        if (this.f15966U == z) {
            return false;
        }
        this.f15966U = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private void m24290e() {
        WeakReference<View> weakReference = this.f15972b0;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f15972b0 = null;
    }

    /* renamed from: f */
    private boolean m24291f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C5605d) getChildAt(i).getLayoutParams()).mo22159c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m24292g() {
        this.f15971b = -1;
        this.f15959N = -1;
        this.f15960O = -1;
    }

    /* renamed from: h */
    private boolean m24293h() {
        return this.f15975e0 != null && getTopInset() > 0;
    }

    /* renamed from: i */
    private boolean m24294i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C0962e0.m5554s(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m24295j() {
        setWillNotDraw(!m24293h());
    }

    /* renamed from: a */
    public void mo22071a(@C0195i0 C5604c cVar) {
        if (this.f15964S == null) {
            this.f15964S = new ArrayList();
        }
        if (cVar != null && !this.f15964S.contains(cVar)) {
            this.f15964S.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo22077b(@C0195i0 C5604c cVar) {
        List<C5604c> list = this.f15964S;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo22082c(boolean z) {
        if (this.f15967V == z) {
            return false;
        }
        this.f15967V = z;
        refreshDrawableState();
        if (this.f15968W && (getBackground() instanceof C6978j)) {
            m24286a((C6978j) getBackground(), z);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C5605d;
    }

    public void draw(@C0193h0 Canvas canvas) {
        super.draw(canvas);
        if (m24293h()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f15969a));
            this.f15975e0.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f15975e0;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @C0193h0
    public C0712c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f15959N;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C5605d dVar = (C5605d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f16002a;
            if ((i4 & 5) == 5) {
                int i5 = dVar.topMargin + dVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    C = C0962e0.m5399C(childAt);
                } else if ((i4 & 2) != 0) {
                    C = measuredHeight - C0962e0.m5399C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C0962e0.m5554s(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + C;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f15959N = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.f15960O;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C5605d dVar = (C5605d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f16002a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0962e0.m5399C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f15960O = max;
        return max;
    }

    @C0225w
    public int getLiftOnScrollTargetViewId() {
        return this.f15970a0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = C0962e0.m5399C(this);
        if (C == 0) {
            int childCount = getChildCount();
            C = childCount >= 1 ? C0962e0.m5399C(getChildAt(childCount - 1)) : 0;
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f15962Q;
    }

    @C0195i0
    public Drawable getStatusBarForeground() {
        return this.f15975e0;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    public final int getTopInset() {
        C1006n0 n0Var = this.f15963R;
        if (n0Var != null) {
            return n0Var.mo4888l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f15971b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C5605d dVar = (C5605d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f16002a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i2 == 0 && C0962e0.m5554s(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C0962e0.m5399C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f15971b = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33513a((View) this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f15974d0 == null) {
            this.f15974d0 = new int[4];
        }
        int[] iArr = this.f15974d0;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f15966U ? C5582R.attr.state_liftable : -C5582R.attr.state_liftable;
        iArr[1] = (!this.f15966U || !this.f15967V) ? -C5582R.attr.state_lifted : C5582R.attr.state_lifted;
        iArr[2] = this.f15966U ? C5582R.attr.state_collapsible : -C5582R.attr.state_collapsible;
        iArr[3] = (!this.f15966U || !this.f15967V) ? -C5582R.attr.state_collapsed : C5582R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24290e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (C0962e0.m5554s(this) && m24294i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0962e0.m5513h(getChildAt(childCount), topInset);
            }
        }
        m24292g();
        boolean z2 = false;
        this.f15961P = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C5605d) getChildAt(i5).getLayoutParams()).mo22158b() != null) {
                this.f15961P = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f15975e0;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f15965T) {
            if (this.f15968W || m24291f()) {
                z2 = true;
            }
            m24289d(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0962e0.m5554s(this) && m24294i()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0890a.m5110a(getMeasuredHeight() + getTopInset(), 0, MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m24292g();
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C6982k.m33514a((View) this, f);
    }

    public void setExpanded(boolean z) {
        mo22073a(z, C0962e0.m5540n0(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f15968W = z;
    }

    public void setLiftOnScrollTargetViewId(@C0225w int i) {
        this.f15970a0 = i;
        m24290e();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@C0195i0 Drawable drawable) {
        Drawable drawable2 = this.f15975e0;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f15975e0 = drawable3;
            Drawable drawable4 = this.f15975e0;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.f15975e0.setState(getDrawableState());
                }
                C0892a.m5152a(this.f15975e0, C0962e0.m5566x(this));
                this.f15975e0.setVisible(getVisibility() == 0, false);
                this.f15975e0.setCallback(this);
            }
            m24295j();
            C0962e0.m5561u0(this);
        }
    }

    public void setStatusBarForegroundColor(@C0198k int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@C0213q int i) {
        setStatusBarForeground(C0242a.m1109c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C5618f.m24465a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f15975e0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(@C0193h0 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15975e0;
    }

    public AppBarLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f15971b = -1;
        this.f15959N = -1;
        this.f15960O = -1;
        this.f15962Q = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            C5618f.m24464a(this);
            C5618f.m24466a(this, attributeSet, i, C5582R.style.Widget_Design_AppBarLayout);
        }
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.AppBarLayout, i, C5582R.style.Widget_Design_AppBarLayout, new int[0]);
        C0962e0.m5440a((View) this, c.getDrawable(C5582R.styleable.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C6978j jVar = new C6978j();
            jVar.mo27790a(ColorStateList.valueOf(colorDrawable.getColor()));
            jVar.mo27789a(context);
            C0962e0.m5440a((View) this, (Drawable) jVar);
        }
        if (c.hasValue(C5582R.styleable.AppBarLayout_expanded)) {
            m24287a(c.getBoolean(C5582R.styleable.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && c.hasValue(C5582R.styleable.AppBarLayout_elevation)) {
            C5618f.m24465a(this, (float) c.getDimensionPixelSize(C5582R.styleable.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (c.hasValue(C5582R.styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c.getBoolean(C5582R.styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c.hasValue(C5582R.styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c.getBoolean(C5582R.styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f15968W = c.getBoolean(C5582R.styleable.AppBarLayout_liftOnScroll, false);
        this.f15970a0 = c.getResourceId(C5582R.styleable.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(c.getDrawable(C5582R.styleable.AppBarLayout_statusBarForeground));
        c.recycle();
        C0962e0.m5448a((View) this, (C1054x) new C5602a());
    }

    /* renamed from: b */
    public void mo22078b(C5607e eVar) {
        mo22077b((C5604c) eVar);
    }

    /* access modifiers changed from: protected */
    public C5605d generateDefaultLayoutParams() {
        return new C5605d(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo22079b() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo22084d() {
        this.f15962Q = 0;
    }

    /* renamed from: a */
    public void mo22072a(C5607e eVar) {
        mo22071a((C5604c) eVar);
    }

    /* renamed from: b */
    public boolean mo22080b(boolean z) {
        return mo22082c(z);
    }

    public C5605d generateLayoutParams(AttributeSet attributeSet) {
        return new C5605d(getContext(), attributeSet);
    }

    @C0195i0
    /* renamed from: b */
    private View m24288b(@C0195i0 View view) {
        if (this.f15972b0 == null) {
            int i = this.f15970a0;
            if (i != -1) {
                View findViewById = view != null ? view.findViewById(i) : null;
                if (findViewById == null && (getParent() instanceof ViewGroup)) {
                    findViewById = ((ViewGroup) getParent()).findViewById(this.f15970a0);
                }
                if (findViewById != null) {
                    this.f15972b0 = new WeakReference<>(findViewById);
                }
            }
        }
        WeakReference<View> weakReference = this.f15972b0;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public void mo22073a(boolean z, boolean z2) {
        m24287a(z, z2, true);
    }

    /* renamed from: c */
    public boolean mo22081c() {
        return this.f15968W;
    }

    /* access modifiers changed from: protected */
    public C5605d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (VERSION.SDK_INT >= 19 && (layoutParams instanceof LayoutParams)) {
            return new C5605d((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C5605d((MarginLayoutParams) layoutParams);
        }
        return new C5605d(layoutParams);
    }

    /* renamed from: a */
    private void m24287a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f15962Q = i2 | i;
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo22074a() {
        return this.f15961P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22070a(int i) {
        this.f15969a = i;
        if (!willNotDraw()) {
            C0962e0.m5561u0(this);
        }
        List<C5604c> list = this.f15964S;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C5604c cVar = (C5604c) this.f15964S.get(i2);
                if (cVar != null) {
                    cVar.mo22154a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo22076a(boolean z) {
        this.f15965T = true;
        return m24289d(z);
    }

    /* renamed from: a */
    private void m24286a(@C0193h0 C6978j jVar, boolean z) {
        float dimension = getResources().getDimension(C5582R.dimen.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f15973c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f15973c0 = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f15973c0.setDuration((long) getResources().getInteger(C5582R.integer.app_bar_elevation_anim_duration));
        this.f15973c0.setInterpolator(C5587a.f15929a);
        this.f15973c0.addUpdateListener(new C5603b(jVar));
        this.f15973c0.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo22075a(@C0195i0 View view) {
        View b = m24288b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1006n0 mo22069a(C1006n0 n0Var) {
        C1006n0 n0Var2 = C0962e0.m5554s(this) ? n0Var : null;
        if (!C0937e.m5328a(this.f15963R, n0Var2)) {
            this.f15963R = n0Var2;
            m24295j();
            requestLayout();
        }
        return n0Var;
    }
}
