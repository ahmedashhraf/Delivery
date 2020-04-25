package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;
import androidx.annotation.C0224v0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0712c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0716g;
import androidx.core.p027g.C0890a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1025g;
import androidx.core.p034l.p035o0.C1025g.C1026a;
import androidx.customview.p039a.C1138c;
import androidx.customview.p039a.C1138c.C1141c;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C5582R;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p302m.C6952c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior<V extends View> extends C0712c<V> {

    /* renamed from: L */
    public static final int f16255L = 1;

    /* renamed from: M */
    public static final int f16256M = 2;

    /* renamed from: N */
    public static final int f16257N = 3;

    /* renamed from: O */
    public static final int f16258O = 4;

    /* renamed from: P */
    public static final int f16259P = 5;

    /* renamed from: Q */
    public static final int f16260Q = 6;

    /* renamed from: R */
    public static final int f16261R = -1;

    /* renamed from: S */
    public static final int f16262S = 1;

    /* renamed from: T */
    public static final int f16263T = 2;

    /* renamed from: U */
    public static final int f16264U = 4;

    /* renamed from: V */
    public static final int f16265V = 8;

    /* renamed from: W */
    public static final int f16266W = -1;

    /* renamed from: X */
    public static final int f16267X = 0;

    /* renamed from: Y */
    private static final String f16268Y = "BottomSheetBehavior";

    /* renamed from: Z */
    private static final int f16269Z = 500;

    /* renamed from: a0 */
    private static final float f16270a0 = 0.5f;

    /* renamed from: b0 */
    private static final float f16271b0 = 0.1f;

    /* renamed from: c0 */
    private static final int f16272c0 = 500;

    /* renamed from: d0 */
    private static final int f16273d0 = C5582R.style.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    int f16274A;

    /* renamed from: B */
    int f16275B;
    @C0195i0

    /* renamed from: C */
    WeakReference<V> f16276C;
    @C0195i0

    /* renamed from: D */
    WeakReference<View> f16277D;
    @C0193h0

    /* renamed from: E */
    private final ArrayList<C5662e> f16278E = new ArrayList<>();
    @C0195i0

    /* renamed from: F */
    private VelocityTracker f16279F;

    /* renamed from: G */
    int f16280G;

    /* renamed from: H */
    private int f16281H;

    /* renamed from: I */
    boolean f16282I;
    @C0195i0

    /* renamed from: J */
    private Map<View, Integer> f16283J;

    /* renamed from: K */
    private final C1141c f16284K = new C5660c();

    /* renamed from: a */
    private int f16285a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f16286b = true;

    /* renamed from: c */
    private boolean f16287c = false;

    /* renamed from: d */
    private float f16288d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f16289e;

    /* renamed from: f */
    private boolean f16290f;

    /* renamed from: g */
    private int f16291g;

    /* renamed from: h */
    private boolean f16292h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C6978j f16293i;

    /* renamed from: j */
    private C6986o f16294j;

    /* renamed from: k */
    private boolean f16295k;

    /* renamed from: l */
    private C5664g f16296l = null;
    @C0195i0

    /* renamed from: m */
    private ValueAnimator f16297m;

    /* renamed from: n */
    int f16298n;

    /* renamed from: o */
    int f16299o;

    /* renamed from: p */
    int f16300p;

    /* renamed from: q */
    float f16301q = 0.5f;

    /* renamed from: r */
    int f16302r;

    /* renamed from: s */
    float f16303s = -1.0f;

    /* renamed from: t */
    boolean f16304t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f16305u;

    /* renamed from: v */
    int f16306v = 4;
    @C0195i0

    /* renamed from: w */
    C1138c f16307w;

    /* renamed from: x */
    private boolean f16308x;

    /* renamed from: y */
    private int f16309y;

    /* renamed from: z */
    private boolean f16310z;

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C5657a();
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        static class C5657a implements ClassLoaderCreator<SavedState> {
            C5657a() {
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
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(@C0193h0 Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            boolean z = false;
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.skipCollapsed = z;
        }

        public SavedState(Parcelable parcelable, @C0193h0 BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.f16306v;
            this.peekHeight = bottomSheetBehavior.f16289e;
            this.fitToContents = bottomSheetBehavior.f16286b;
            this.hideable = bottomSheetBehavior.f16304t;
            this.skipCollapsed = bottomSheetBehavior.f16305u;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C5658a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f16312a;

        /* renamed from: b */
        final /* synthetic */ int f16313b;

        C5658a(View view, int i) {
            this.f16312a = view;
            this.f16313b = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo22456a(this.f16312a, this.f16313b);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C5659b implements AnimatorUpdateListener {
        C5659b() {
        }

        public void onAnimationUpdate(@C0193h0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f16293i != null) {
                BottomSheetBehavior.this.f16293i.mo27804c(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C5660c extends C1141c {
        C5660c() {
        }

        /* renamed from: a */
        public void mo5454a(@C0193h0 View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo22454a(i2);
        }

        /* renamed from: b */
        public boolean mo5459b(@C0193h0 View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f16306v;
            boolean z = true;
            if (i2 == 1 || bottomSheetBehavior.f16282I) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f16280G == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f16277D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f16276C;
            if (weakReference2 == null || weakReference2.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public void mo5460c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo22476f(1);
            }
        }

        /* renamed from: c */
        private boolean m24755c(@C0193h0 View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f16275B + bottomSheetBehavior.m24711o()) / 2;
        }

        /* renamed from: a */
        public void mo5452a(@C0193h0 View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f16304t || !bottomSheetBehavior.mo22460a(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f16286b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f16300p;
                            if (top < i4) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f16302r)) {
                                    i = BottomSheetBehavior.this.f16298n;
                                } else {
                                    i2 = BottomSheetBehavior.this.f16300p;
                                }
                            } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f16302r)) {
                                i2 = BottomSheetBehavior.this.f16300p;
                            } else {
                                i = BottomSheetBehavior.this.f16302r;
                                BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                            }
                            i3 = 6;
                            BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f16299o) < Math.abs(top - BottomSheetBehavior.this.f16302r)) {
                            i = BottomSheetBehavior.this.f16299o;
                        } else {
                            i = BottomSheetBehavior.this.f16302r;
                            BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.f16286b) {
                            i = BottomSheetBehavior.this.f16302r;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f16300p) < Math.abs(top2 - BottomSheetBehavior.this.f16302r)) {
                                i2 = BottomSheetBehavior.this.f16300p;
                                i3 = 6;
                            } else {
                                i = BottomSheetBehavior.this.f16302r;
                            }
                        }
                        BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m24755c(view)) {
                    i = BottomSheetBehavior.this.f16275B;
                    i3 = 5;
                    BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                } else if (BottomSheetBehavior.this.f16286b) {
                    i = BottomSheetBehavior.this.f16299o;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f16298n) < Math.abs(view.getTop() - BottomSheetBehavior.this.f16300p)) {
                    i = BottomSheetBehavior.this.f16298n;
                } else {
                    i2 = BottomSheetBehavior.this.f16300p;
                    i3 = 6;
                    BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f16286b) {
                i = BottomSheetBehavior.this.f16299o;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f16300p;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo22457a(view, i3, i, true);
                }
                i = bottomSheetBehavior3.f16298n;
            }
            i3 = 3;
            BottomSheetBehavior.this.mo22457a(view, i3, i, true);
        }

        /* renamed from: b */
        public int mo5456b(@C0193h0 View view, int i, int i2) {
            int b = BottomSheetBehavior.this.m24711o();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C0890a.m5110a(i, b, bottomSheetBehavior.f16304t ? bottomSheetBehavior.f16275B : bottomSheetBehavior.f16302r);
        }

        /* renamed from: b */
        public int mo5455b(@C0193h0 View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f16304t) {
                return bottomSheetBehavior.f16275B;
            }
            return bottomSheetBehavior.f16302r;
        }

        /* renamed from: a */
        public int mo5450a(@C0193h0 View view, int i, int i2) {
            return view.getLeft();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C5661d implements C1025g {

        /* renamed from: a */
        final /* synthetic */ int f16316a;

        C5661d(int i) {
            this.f16316a = i;
        }

        /* renamed from: a */
        public boolean mo5111a(@C0193h0 View view, @C0195i0 C1026a aVar) {
            BottomSheetBehavior.this.mo22474e(this.f16316a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C5662e {
        /* renamed from: a */
        public abstract void mo22486a(@C0193h0 View view, float f);

        /* renamed from: a */
        public abstract void mo22487a(@C0193h0 View view, int i);
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public @interface C5663f {
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    private class C5664g implements Runnable {

        /* renamed from: N */
        int f16318N;

        /* renamed from: a */
        private final View f16320a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f16321b;

        C5664g(View view, int i) {
            this.f16320a = view;
            this.f16318N = i;
        }

        public void run() {
            C1138c cVar = BottomSheetBehavior.this.f16307w;
            if (cVar == null || !cVar.mo5427a(true)) {
                BottomSheetBehavior.this.mo22476f(this.f16318N);
            } else {
                C0962e0.m5451a(this.f16320a, (Runnable) this);
            }
            this.f16321b = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: k */
    private void m24707k() {
        int m = m24709m();
        if (this.f16286b) {
            this.f16302r = Math.max(this.f16275B - m, this.f16299o);
        } else {
            this.f16302r = this.f16275B - m;
        }
    }

    /* renamed from: l */
    private void m24708l() {
        this.f16300p = (int) (((float) this.f16275B) * (1.0f - this.f16301q));
    }

    /* renamed from: m */
    private int m24709m() {
        if (this.f16290f) {
            return Math.max(this.f16291g, this.f16275B - ((this.f16274A * 9) / 16));
        }
        return this.f16289e;
    }

    /* renamed from: n */
    private void m24710n() {
        this.f16297m = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f16297m.setDuration(500);
        this.f16297m.addUpdateListener(new C5659b());
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public int m24711o() {
        return this.f16286b ? this.f16299o : this.f16298n;
    }

    /* renamed from: p */
    private float m24712p() {
        VelocityTracker velocityTracker = this.f16279F;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f16288d);
        return this.f16279F.getYVelocity(this.f16280G);
    }

    /* renamed from: q */
    private void m24713q() {
        this.f16280G = -1;
        VelocityTracker velocityTracker = this.f16279F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f16279F = null;
        }
    }

    /* renamed from: r */
    private void m24714r() {
        WeakReference<V> weakReference = this.f16276C;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                C0962e0.m5518i(view, 524288);
                C0962e0.m5518i(view, 262144);
                C0962e0.m5518i(view, 1048576);
                if (this.f16304t && this.f16306v != 5) {
                    m24697a((V) view, C1017a.f4599A, 5);
                }
                int i = this.f16306v;
                int i2 = 6;
                if (i == 3) {
                    if (this.f16286b) {
                        i2 = 4;
                    }
                    m24697a((V) view, C1017a.f4632z, i2);
                } else if (i == 4) {
                    if (this.f16286b) {
                        i2 = 3;
                    }
                    m24697a((V) view, C1017a.f4631y, i2);
                } else if (i == 6) {
                    m24697a((V) view, C1017a.f4632z, 4);
                    m24697a((V) view, C1017a.f4631y, 3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3988a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, int i3, int i4, int i5, @C0193h0 int[] iArr) {
    }

    /* renamed from: f */
    public int mo22475f() {
        return this.f16285a;
    }

    /* renamed from: g */
    public boolean mo22477g() {
        return this.f16305u;
    }

    /* renamed from: h */
    public int mo22478h() {
        return this.f16306v;
    }

    /* renamed from: i */
    public boolean mo22479i() {
        return this.f16286b;
    }

    /* renamed from: j */
    public boolean mo22480j() {
        return this.f16304t;
    }

    /* renamed from: g */
    private void m24705g(int i) {
        View view = (View) this.f16276C.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C0962e0.m5515h0(view)) {
                mo22456a(view, i);
            } else {
                view.post(new C5658a(view, i));
            }
        }
    }

    /* renamed from: h */
    private void m24706h(int i) {
        if (i != 2) {
            boolean z = i == 3;
            if (this.f16295k != z) {
                this.f16295k = z;
                if (this.f16293i != null) {
                    ValueAnimator valueAnimator = this.f16297m;
                    if (valueAnimator != null) {
                        if (valueAnimator.isRunning()) {
                            this.f16297m.reverse();
                        } else {
                            float f = z ? 0.0f : 1.0f;
                            this.f16297m.setFloatValues(new float[]{1.0f - f, f});
                            this.f16297m.start();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3984a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo3984a(coordinatorLayout, v, savedState.getSuperState());
        m24698a(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.f16306v = 4;
        } else {
            this.f16306v = i;
        }
    }

    /* renamed from: b */
    public boolean mo4003b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f16306v == 1 && actionMasked == 0) {
            return true;
        }
        C1138c cVar = this.f16307w;
        if (cVar != null) {
            cVar.mo5421a(motionEvent);
        }
        if (actionMasked == 0) {
            m24713q();
        }
        if (this.f16279F == null) {
            this.f16279F = VelocityTracker.obtain();
        }
        this.f16279F.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f16308x && Math.abs(((float) this.f16281H) - motionEvent.getY()) > ((float) this.f16307w.mo5444g())) {
            this.f16307w.mo5422a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f16308x;
    }

    /* renamed from: c */
    public void mo22467c(int i) {
        mo22455a(i, false);
    }

    @C0193h0
    /* renamed from: d */
    public Parcelable mo4009d(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v) {
        return new SavedState(super.mo4009d(coordinatorLayout, v), this);
    }

    /* renamed from: e */
    public void mo22474e(int i) {
        if (i != this.f16306v) {
            if (this.f16276C == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f16304t && i == 5)) {
                    this.f16306v = i;
                }
                return;
            }
            m24705g(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo22476f(int i) {
        if (this.f16306v != i) {
            this.f16306v = i;
            WeakReference<V> weakReference = this.f16276C;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view != null) {
                    if (i == 3) {
                        mo39714e(true);
                    } else if (i == 6 || i == 5 || i == 4) {
                        mo39714e(false);
                    }
                    m24706h(i);
                    for (int i2 = 0; i2 < this.f16278E.size(); i2++) {
                        ((C5662e) this.f16278E.get(i2)).mo22487a(view, i);
                    }
                    m24714r();
                }
            }
        }
    }

    @C0215r(from = 0.0d, mo670to = 1.0d)
    /* renamed from: c */
    public float mo22466c() {
        return this.f16301q;
    }

    /* renamed from: d */
    public int mo22470d() {
        if (this.f16290f) {
            return -1;
        }
        return this.f16289e;
    }

    /* renamed from: c */
    public void mo22469c(boolean z) {
        this.f16305u = z;
    }

    /* renamed from: d */
    public void mo22471d(int i) {
        this.f16285a = i;
    }

    @Deprecated
    /* renamed from: c */
    public void mo22468c(C5662e eVar) {
        this.f16278E.clear();
        if (eVar != null) {
            this.f16278E.add(eVar);
        }
    }

    /* renamed from: d */
    public void mo22472d(boolean z) {
        this.f16287c = z;
    }

    @C0193h0
    /* renamed from: c */
    public static <V extends View> BottomSheetBehavior<V> m24700c(@C0193h0 V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0716g) {
            C0712c d = ((C0716g) layoutParams).mo4027d();
            if (d instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) d;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: e */
    public int mo22473e() {
        return this.f16291g;
    }

    /* renamed from: e */
    private void mo39714e(boolean z) {
        WeakReference<V> weakReference = this.f16276C;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f16283J == null) {
                        this.f16283J = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f16276C.get()) {
                        if (z) {
                            if (VERSION.SDK_INT >= 16) {
                                this.f16283J.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f16287c) {
                                C0962e0.m5531l(childAt, 4);
                            }
                        } else if (this.f16287c) {
                            Map<View, Integer> map = this.f16283J;
                            if (map != null && map.containsKey(childAt)) {
                                C0962e0.m5531l(childAt, ((Integer) this.f16283J.get(childAt)).intValue());
                            }
                        }
                    }
                }
                if (!z) {
                    this.f16283J = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3983a(@C0193h0 C0716g gVar) {
        super.mo3983a(gVar);
        this.f16276C = null;
        this.f16307w = null;
    }

    public BottomSheetBehavior(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.BottomSheetBehavior_Layout);
        this.f16292h = obtainStyledAttributes.hasValue(C5582R.styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(C5582R.styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m24696a(context, attributeSet, hasValue, C6952c.m33332a(context, obtainStyledAttributes, C5582R.styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m24695a(context, attributeSet, hasValue);
        }
        m24710n();
        if (VERSION.SDK_INT >= 21) {
            this.f16303s = obtainStyledAttributes.getDimension(C5582R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(C5582R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null) {
            int i = peekValue.data;
            if (i == -1) {
                mo22467c(i);
                mo22465b(obtainStyledAttributes.getBoolean(C5582R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
                mo22459a(obtainStyledAttributes.getBoolean(C5582R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
                mo22469c(obtainStyledAttributes.getBoolean(C5582R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
                mo22471d(obtainStyledAttributes.getInt(C5582R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
                mo22453a(obtainStyledAttributes.getFloat(C5582R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
                mo22463b(obtainStyledAttributes.getInt(C5582R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
                obtainStyledAttributes.recycle();
                this.f16288d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            }
        }
        mo22467c(obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        mo22465b(obtainStyledAttributes.getBoolean(C5582R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo22459a(obtainStyledAttributes.getBoolean(C5582R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo22469c(obtainStyledAttributes.getBoolean(C5582R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo22471d(obtainStyledAttributes.getInt(C5582R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo22453a(obtainStyledAttributes.getFloat(C5582R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        mo22463b(obtainStyledAttributes.getInt(C5582R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        obtainStyledAttributes.recycle();
        this.f16288d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public void mo3982a() {
        super.mo3982a();
        this.f16276C = null;
        this.f16307w = null;
    }

    /* renamed from: a */
    public boolean mo3994a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, int i) {
        if (C0962e0.m5554s(coordinatorLayout) && !C0962e0.m5554s(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f16276C == null) {
            this.f16291g = coordinatorLayout.getResources().getDimensionPixelSize(C5582R.dimen.design_bottom_sheet_peek_height_min);
            this.f16276C = new WeakReference<>(v);
            if (this.f16292h) {
                C6978j jVar = this.f16293i;
                if (jVar != null) {
                    C0962e0.m5440a((View) v, (Drawable) jVar);
                }
            }
            C6978j jVar2 = this.f16293i;
            if (jVar2 != null) {
                float f = this.f16303s;
                if (f == -1.0f) {
                    f = C0962e0.m5551r(v);
                }
                jVar2.mo27799b(f);
                this.f16295k = this.f16306v == 3;
                this.f16293i.mo27804c(this.f16295k ? 0.0f : 1.0f);
            }
            m24714r();
            if (C0962e0.m5557t(v) == 0) {
                C0962e0.m5531l((View) v, 1);
            }
        }
        if (this.f16307w == null) {
            this.f16307w = C1138c.m6480a((ViewGroup) coordinatorLayout, this.f16284K);
        }
        int top = v.getTop();
        coordinatorLayout.mo3942c((View) v, i);
        this.f16274A = coordinatorLayout.getWidth();
        this.f16275B = coordinatorLayout.getHeight();
        this.f16299o = Math.max(0, this.f16275B - v.getHeight());
        m24708l();
        m24707k();
        int i2 = this.f16306v;
        if (i2 == 3) {
            C0962e0.m5513h((View) v, m24711o());
        } else if (i2 == 6) {
            C0962e0.m5513h((View) v, this.f16300p);
        } else if (!this.f16304t || i2 != 5) {
            int i3 = this.f16306v;
            if (i3 == 4) {
                C0962e0.m5513h((View) v, this.f16302r);
            } else if (i3 == 1 || i3 == 2) {
                C0962e0.m5513h((View) v, top - v.getTop());
            }
        } else {
            C0962e0.m5513h((View) v, this.f16275B);
        }
        this.f16277D = new WeakReference<>(mo22461b((View) v));
        return true;
    }

    /* renamed from: b */
    public boolean mo4006b(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, @C0193h0 View view2, int i, int i2) {
        this.f16309y = 0;
        this.f16310z = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo22463b(int i) {
        if (i >= 0) {
            this.f16298n = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: b */
    public void mo22465b(boolean z) {
        if (this.f16304t != z) {
            this.f16304t = z;
            if (!z && this.f16306v == 5) {
                mo22474e(4);
            }
            m24714r();
        }
    }

    /* renamed from: b */
    public void mo22464b(@C0193h0 C5662e eVar) {
        this.f16278E.remove(eVar);
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    @C0195i0
    /* renamed from: b */
    public View mo22461b(View view) {
        if (C0962e0.m5547p0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View b = mo22461b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    @C0224v0
    /* renamed from: b */
    public void mo22462b() {
        this.f16297m = null;
    }

    /* renamed from: a */
    public boolean mo3998a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f16308x = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m24713q();
        }
        if (this.f16279F == null) {
            this.f16279F = VelocityTracker.obtain();
        }
        this.f16279F.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f16281H = (int) motionEvent.getY();
            if (this.f16306v != 2) {
                WeakReference<View> weakReference = this.f16277D;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.mo3936a(view2, x, this.f16281H)) {
                    this.f16280G = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f16282I = true;
                }
            }
            this.f16308x = this.f16280G == -1 && !coordinatorLayout.mo3936a((View) v, x, this.f16281H);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16282I = false;
            this.f16280G = -1;
            if (this.f16308x) {
                this.f16308x = false;
                return false;
            }
        }
        if (!this.f16308x) {
            C1138c cVar = this.f16307w;
            if (cVar != null && cVar.mo5431b(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f16277D;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f16308x && this.f16306v != 1 && !coordinatorLayout.mo3936a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f16307w != null && Math.abs(((float) this.f16281H) - motionEvent.getY()) > ((float) this.f16307w.mo5444g())) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo3990a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i, int i2, @C0193h0 int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f16277D;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < m24711o()) {
                        iArr[1] = top - m24711o();
                        C0962e0.m5513h((View) v, -iArr[1]);
                        mo22476f(3);
                    } else {
                        iArr[1] = i2;
                        C0962e0.m5513h((View) v, -i2);
                        mo22476f(1);
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f16302r;
                    if (i4 <= i5 || this.f16304t) {
                        iArr[1] = i2;
                        C0962e0.m5513h((View) v, -i2);
                        mo22476f(1);
                    } else {
                        iArr[1] = top - i5;
                        C0962e0.m5513h((View) v, -iArr[1]);
                        mo22476f(4);
                    }
                }
                mo22454a(v.getTop());
                this.f16309y = i2;
                this.f16310z = true;
            }
        }
    }

    /* renamed from: a */
    public void mo3985a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == m24711o()) {
            mo22476f(3);
            return;
        }
        WeakReference<View> weakReference = this.f16277D;
        if (weakReference != null && view == weakReference.get() && this.f16310z) {
            if (this.f16309y > 0) {
                i2 = m24711o();
            } else if (!this.f16304t || !mo22460a((View) v, m24712p())) {
                if (this.f16309y == 0) {
                    int top = v.getTop();
                    if (!this.f16286b) {
                        int i5 = this.f16300p;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f16302r)) {
                                i2 = this.f16298n;
                            } else {
                                i2 = this.f16300p;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f16302r)) {
                            i2 = this.f16300p;
                        } else {
                            i3 = this.f16302r;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f16299o) < Math.abs(top - this.f16302r)) {
                        i2 = this.f16299o;
                    } else {
                        i3 = this.f16302r;
                    }
                } else if (this.f16286b) {
                    i3 = this.f16302r;
                } else {
                    int top2 = v.getTop();
                    if (Math.abs(top2 - this.f16300p) < Math.abs(top2 - this.f16302r)) {
                        i2 = this.f16300p;
                        i4 = 6;
                    } else {
                        i3 = this.f16302r;
                    }
                }
                i4 = 4;
            } else {
                i2 = this.f16275B;
                i4 = 5;
            }
            mo22457a((View) v, i4, i2, false);
            this.f16310z = false;
        }
    }

    /* renamed from: a */
    public boolean mo4000a(@C0193h0 CoordinatorLayout coordinatorLayout, @C0193h0 V v, @C0193h0 View view, float f, float f2) {
        WeakReference<View> weakReference = this.f16277D;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f16306v != 3 || super.mo4000a(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo22459a(boolean z) {
        if (this.f16286b != z) {
            this.f16286b = z;
            if (this.f16276C != null) {
                m24707k();
            }
            mo22476f((!this.f16286b || this.f16306v != 6) ? this.f16306v : 3);
            m24714r();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22455a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f16290f
            if (r4 != 0) goto L_0x0015
            r3.f16290f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f16290f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f16289e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f16290f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f16289e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f16276C
            if (r4 == 0) goto L_0x0042
            r3.m24707k()
            int r4 = r3.f16306v
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f16276C
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f16306v
            r3.m24705g(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo22455a(int, boolean):void");
    }

    /* renamed from: a */
    public void mo22453a(@C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f16301q = f;
        if (this.f16276C != null) {
            m24708l();
        }
    }

    /* renamed from: a */
    public void mo22458a(@C0193h0 C5662e eVar) {
        if (!this.f16278E.contains(eVar)) {
            this.f16278E.add(eVar);
        }
    }

    /* renamed from: a */
    private void m24698a(@C0193h0 SavedState savedState) {
        int i = this.f16285a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f16289e = savedState.peekHeight;
            }
            int i2 = this.f16285a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f16286b = savedState.fitToContents;
            }
            int i3 = this.f16285a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f16304t = savedState.hideable;
            }
            int i4 = this.f16285a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f16305u = savedState.skipCollapsed;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo22460a(@C0193h0 View view, float f) {
        boolean z = true;
        if (this.f16305u) {
            return true;
        }
        if (view.getTop() < this.f16302r) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f16302r)) / ((float) m24709m()) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private void m24695a(@C0193h0 Context context, AttributeSet attributeSet, boolean z) {
        m24696a(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: a */
    private void m24696a(@C0193h0 Context context, AttributeSet attributeSet, boolean z, @C0195i0 ColorStateList colorStateList) {
        if (this.f16292h) {
            this.f16294j = C6986o.m33526a(context, attributeSet, C5582R.attr.bottomSheetStyle, f16273d0).mo27878a();
            this.f16293i = new C6978j(this.f16294j);
            this.f16293i.mo27789a(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f16293i.setTint(typedValue.data);
                return;
            }
            this.f16293i.mo27790a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22456a(@C0193h0 View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f16302r;
        } else if (i == 6) {
            int i3 = this.f16300p;
            if (this.f16286b) {
                int i4 = this.f16299o;
                if (i3 <= i4) {
                    i2 = i4;
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = m24711o();
        } else if (!this.f16304t || i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f16275B;
        }
        mo22457a(view, i, i2, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22457a(View view, int i, int i2, boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f16307w.mo5442e(view.getLeft(), i2);
        } else {
            z2 = this.f16307w.mo5433b(view, view.getLeft(), i2);
        }
        if (z2) {
            mo22476f(2);
            m24706h(i);
            if (this.f16296l == null) {
                this.f16296l = new C5664g<>(view, i);
            }
            if (!this.f16296l.f16321b) {
                C5664g gVar = this.f16296l;
                gVar.f16318N = i;
                C0962e0.m5451a(view, (Runnable) gVar);
                this.f16296l.f16321b = true;
                return;
            }
            this.f16296l.f16318N = i;
            return;
        }
        mo22476f(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo22454a(int i) {
        float f;
        float f2;
        View view = (View) this.f16276C.get();
        if (view != null && !this.f16278E.isEmpty()) {
            int i2 = this.f16302r;
            if (i > i2 || i2 == m24711o()) {
                int i3 = this.f16302r;
                f = (float) (i3 - i);
                f2 = (float) (this.f16275B - i3);
            } else {
                int i4 = this.f16302r;
                f = (float) (i4 - i);
                f2 = (float) (i4 - m24711o());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f16278E.size(); i5++) {
                ((C5662e) this.f16278E.get(i5)).mo22486a(view, f3);
            }
        }
    }

    /* renamed from: a */
    private void m24697a(V v, C1017a aVar, int i) {
        C0962e0.m5446a((View) v, aVar, (CharSequence) null, (C1025g) new C5661d(i));
    }
}
