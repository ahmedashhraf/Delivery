package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.customview.p039a.C1138c;
import androidx.customview.p039a.C1138c.C1141c;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p148d.p150g.C6637f;

public class DrawerLayout extends ViewGroup {

    /* renamed from: A0 */
    private static final int[] f5180A0 = {16843828};

    /* renamed from: B0 */
    public static final int f5181B0 = 0;

    /* renamed from: C0 */
    public static final int f5182C0 = 1;

    /* renamed from: D0 */
    public static final int f5183D0 = 2;

    /* renamed from: E0 */
    public static final int f5184E0 = 0;

    /* renamed from: F0 */
    public static final int f5185F0 = 1;

    /* renamed from: G0 */
    public static final int f5186G0 = 2;

    /* renamed from: H0 */
    public static final int f5187H0 = 3;

    /* renamed from: I0 */
    private static final int f5188I0 = 64;

    /* renamed from: J0 */
    private static final int f5189J0 = 10;

    /* renamed from: K0 */
    private static final int f5190K0 = -1728053248;

    /* renamed from: L0 */
    private static final int f5191L0 = 160;

    /* renamed from: M0 */
    private static final int f5192M0 = 400;

    /* renamed from: N0 */
    private static final boolean f5193N0 = false;

    /* renamed from: O0 */
    private static final boolean f5194O0 = true;

    /* renamed from: P0 */
    private static final float f5195P0 = 1.0f;

    /* renamed from: Q0 */
    static final int[] f5196Q0 = {16842931};

    /* renamed from: R0 */
    static final boolean f5197R0 = (VERSION.SDK_INT >= 19);

    /* renamed from: S0 */
    private static final boolean f5198S0;

    /* renamed from: z0 */
    private static final String f5199z0 = "DrawerLayout";

    /* renamed from: N */
    private int f5200N;

    /* renamed from: O */
    private int f5201O;

    /* renamed from: P */
    private float f5202P;

    /* renamed from: Q */
    private Paint f5203Q;

    /* renamed from: R */
    private final C1138c f5204R;

    /* renamed from: S */
    private final C1138c f5205S;

    /* renamed from: T */
    private final C1314g f5206T;

    /* renamed from: U */
    private final C1314g f5207U;

    /* renamed from: V */
    private int f5208V;

    /* renamed from: W */
    private boolean f5209W;

    /* renamed from: a */
    private final C1310c f5210a;

    /* renamed from: a0 */
    private boolean f5211a0;

    /* renamed from: b */
    private float f5212b;

    /* renamed from: b0 */
    private int f5213b0;

    /* renamed from: c0 */
    private int f5214c0;

    /* renamed from: d0 */
    private int f5215d0;

    /* renamed from: e0 */
    private int f5216e0;

    /* renamed from: f0 */
    private boolean f5217f0;

    /* renamed from: g0 */
    private boolean f5218g0;
    @C0195i0

    /* renamed from: h0 */
    private C1311d f5219h0;

    /* renamed from: i0 */
    private List<C1311d> f5220i0;

    /* renamed from: j0 */
    private float f5221j0;

    /* renamed from: k0 */
    private float f5222k0;

    /* renamed from: l0 */
    private Drawable f5223l0;

    /* renamed from: m0 */
    private Drawable f5224m0;

    /* renamed from: n0 */
    private Drawable f5225n0;

    /* renamed from: o0 */
    private CharSequence f5226o0;

    /* renamed from: p0 */
    private CharSequence f5227p0;

    /* renamed from: q0 */
    private Object f5228q0;

    /* renamed from: r0 */
    private boolean f5229r0;

    /* renamed from: s0 */
    private Drawable f5230s0;

    /* renamed from: t0 */
    private Drawable f5231t0;

    /* renamed from: u0 */
    private Drawable f5232u0;

    /* renamed from: v0 */
    private Drawable f5233v0;

    /* renamed from: w0 */
    private final ArrayList<View> f5234w0;

    /* renamed from: x0 */
    private Rect f5235x0;

    /* renamed from: y0 */
    private Matrix f5236y0;

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C1307a();
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity = 0;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        static class C1307a implements ClassLoaderCreator<SavedState> {
            C1307a() {
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

        public SavedState(@C0193h0 Parcel parcel, @C0195i0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }

        public SavedState(@C0193h0 Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C1308a implements OnApplyWindowInsetsListener {
        C1308a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).mo5723a((Object) windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class C1309b extends C0947a {

        /* renamed from: d */
        private final Rect f5238d = new Rect();

        C1309b() {
        }

        /* renamed from: a */
        public void mo4749a(View view, C1016d dVar) {
            if (DrawerLayout.f5197R0) {
                super.mo4749a(view, dVar);
            } else {
                C1016d a = C1016d.m5807a(dVar);
                super.mo4749a(view, a);
                dVar.mo4982f(view);
                ViewParent J = C0962e0.m5406J(view);
                if (J instanceof View) {
                    dVar.mo4973e((View) J);
                }
                m6976a(dVar, a);
                a.mo4971d0();
                m6975a(dVar, (ViewGroup) view);
            }
            dVar.mo4937a((CharSequence) DrawerLayout.class.getName());
            dVar.mo5008k(false);
            dVar.mo5010l(false);
            dVar.mo4953b(C1017a.f4613g);
            dVar.mo4953b(C1017a.f4614h);
        }

        /* renamed from: b */
        public void mo4753b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4753b(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: a */
        public boolean mo4751a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo4751a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View d = DrawerLayout.this.mo5743d();
            if (d != null) {
                CharSequence d2 = DrawerLayout.this.mo5744d(DrawerLayout.this.mo5747e(d));
                if (d2 != null) {
                    text.add(d2);
                }
            }
            return true;
        }

        /* renamed from: a */
        public boolean mo4752a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f5197R0 || DrawerLayout.m6934m(view)) {
                return super.mo4752a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: a */
        private void m6975a(C1016d dVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m6934m(childAt)) {
                    dVar.mo4933a(childAt);
                }
            }
        }

        /* renamed from: a */
        private void m6976a(C1016d dVar, C1016d dVar2) {
            Rect rect = this.f5238d;
            dVar2.mo4932a(rect);
            dVar.mo4957c(rect);
            dVar2.mo4947b(rect);
            dVar.mo4966d(rect);
            dVar.mo5033w(dVar2.mo4963c0());
            dVar.mo4975e(dVar2.mo5025t());
            dVar.mo4937a(dVar2.mo4972e());
            dVar.mo4948b(dVar2.mo4993h());
            dVar.mo5006j(dVar2.mo4918P());
            dVar.mo4976e(dVar2.mo4913K());
            dVar.mo5008k(dVar2.mo4919Q());
            dVar.mo5010l(dVar2.mo4920R());
            dVar.mo4940a(dVar2.mo4910H());
            dVar.mo5026t(dVar2.mo4928Z());
            dVar.mo5016o(dVar2.mo4923U());
            dVar.mo4930a(dVar2.mo4955c());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C1310c extends C0947a {
        C1310c() {
        }

        /* renamed from: a */
        public void mo4749a(View view, C1016d dVar) {
            super.mo4749a(view, dVar);
            if (!DrawerLayout.m6934m(view)) {
                dVar.mo4973e((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface C1311d {
        /* renamed from: a */
        void mo1015a(int i);

        /* renamed from: a */
        void mo1020a(@C0193h0 View view);

        /* renamed from: a */
        void mo1021a(@C0193h0 View view, float f);

        /* renamed from: b */
        void mo1027b(@C0193h0 View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public static class C1312e extends MarginLayoutParams {

        /* renamed from: e */
        private static final int f5240e = 1;

        /* renamed from: f */
        private static final int f5241f = 2;

        /* renamed from: g */
        private static final int f5242g = 4;

        /* renamed from: a */
        public int f5243a;

        /* renamed from: b */
        float f5244b;

        /* renamed from: c */
        boolean f5245c;

        /* renamed from: d */
        int f5246d;

        public C1312e(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5243a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f5196Q0);
            this.f5243a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C1312e(int i, int i2) {
            super(i, i2);
            this.f5243a = 0;
        }

        public C1312e(int i, int i2, int i3) {
            this(i, i2);
            this.f5243a = i3;
        }

        public C1312e(@C0193h0 C1312e eVar) {
            super(eVar);
            this.f5243a = 0;
            this.f5243a = eVar.f5243a;
        }

        public C1312e(@C0193h0 LayoutParams layoutParams) {
            super(layoutParams);
            this.f5243a = 0;
        }

        public C1312e(@C0193h0 MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5243a = 0;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static abstract class C1313f implements C1311d {
        /* renamed from: a */
        public void mo1015a(int i) {
        }

        /* renamed from: a */
        public void mo1020a(View view) {
        }

        /* renamed from: a */
        public void mo1021a(View view, float f) {
        }

        /* renamed from: b */
        public void mo1027b(View view) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    private class C1314g extends C1141c {

        /* renamed from: a */
        private final int f5247a;

        /* renamed from: b */
        private C1138c f5248b;

        /* renamed from: c */
        private final Runnable f5249c = new C1315a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g$a */
        class C1315a implements Runnable {
            C1315a() {
            }

            public void run() {
                C1314g.this.mo5787a();
            }
        }

        C1314g(int i) {
            this.f5247a = i;
        }

        /* renamed from: a */
        public void mo5788a(C1138c cVar) {
            this.f5248b = cVar;
        }

        /* renamed from: b */
        public void mo5789b() {
            DrawerLayout.this.removeCallbacks(this.f5249c);
        }

        /* renamed from: b */
        public boolean mo5458b(int i) {
            return false;
        }

        /* renamed from: c */
        public void mo5460c(int i) {
            DrawerLayout.this.mo5714a(this.f5247a, i, this.f5248b.mo5437d());
        }

        /* renamed from: c */
        private void m6990c() {
            int i = 3;
            if (this.f5247a == 3) {
                i = 5;
            }
            View b = DrawerLayout.this.mo5728b(i);
            if (b != null) {
                DrawerLayout.this.mo5719a(b);
            }
        }

        /* renamed from: a */
        public void mo5454a(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.mo5725a(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo5739c(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: b */
        public boolean mo5459b(View view, int i) {
            return DrawerLayout.this.mo5759i(view) && DrawerLayout.this.mo5725a(view, this.f5247a) && DrawerLayout.this.mo5742d(view) == 0;
        }

        /* renamed from: b */
        public void mo5457b(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f5249c, 160);
        }

        /* renamed from: b */
        public int mo5456b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo5453a(View view, int i) {
            ((C1312e) view.getLayoutParams()).f5245c = false;
            m6990c();
        }

        /* renamed from: a */
        public void mo5452a(View view, float f, float f2) {
            int i;
            float f3 = DrawerLayout.this.mo5749f(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo5725a(view, 3)) {
                i = (f > 0.0f || (f == 0.0f && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f5248b.mo5442e(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5787a() {
            View view;
            int i;
            int e = this.f5248b.mo5440e();
            int i2 = 0;
            boolean z = this.f5247a == 3;
            if (z) {
                view = DrawerLayout.this.mo5728b(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + e;
            } else {
                view = DrawerLayout.this.mo5728b(5);
                i = DrawerLayout.this.getWidth() - e;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo5742d(view) == 0) {
                C1312e eVar = (C1312e) view.getLayoutParams();
                this.f5248b.mo5433b(view, i, view.getTop());
                eVar.f5245c = true;
                DrawerLayout.this.invalidate();
                m6990c();
                DrawerLayout.this.mo5711a();
            }
        }

        /* renamed from: a */
        public void mo5451a(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo5728b(3);
            } else {
                view = DrawerLayout.this.mo5728b(5);
            }
            if (view != null && DrawerLayout.this.mo5742d(view) == 0) {
                this.f5248b.mo5422a(view, i2);
            }
        }

        /* renamed from: a */
        public int mo5449a(View view) {
            if (DrawerLayout.this.mo5759i(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: a */
        public int mo5450a(View view, int i, int i2) {
            if (DrawerLayout.this.mo5725a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }
    }

    static {
        boolean z = true;
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        f5198S0 = z;
    }

    public DrawerLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: g */
    private Drawable m6929g() {
        int x = C0962e0.m5566x(this);
        if (x == 0) {
            Drawable drawable = this.f5230s0;
            if (drawable != null) {
                m6925b(drawable, x);
                return this.f5230s0;
            }
        } else {
            Drawable drawable2 = this.f5231t0;
            if (drawable2 != null) {
                m6925b(drawable2, x);
                return this.f5231t0;
            }
        }
        return this.f5232u0;
    }

    /* renamed from: h */
    static String m6931h(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: i */
    private void m6932i() {
        if (!f5198S0) {
            this.f5224m0 = m6929g();
            this.f5225n0 = m6930h();
        }
    }

    /* renamed from: l */
    private static boolean m6933l(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    static boolean m6934m(View view) {
        return (C0962e0.m5557t(view) == 4 || C0962e0.m5557t(view) == 2) ? false : true;
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo5723a(Object obj, boolean z) {
        this.f5228q0 = obj;
        this.f5229r0 = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo5759i(childAt)) {
                    this.f5234w0.add(childAt);
                } else if (mo5758h(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f5234w0.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = (View) this.f5234w0.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f5234w0.clear();
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo5737c() != null || mo5759i(view)) {
            C0962e0.m5531l(view, 4);
        } else {
            C0962e0.m5531l(view, 1);
        }
        if (!f5197R0) {
            C0962e0.m5443a(view, (C0947a) this.f5210a);
        }
    }

    /* renamed from: b */
    public void mo5730b(@C0213q int i, int i2) {
        mo5718a(C0841b.m4928c(getContext(), i), i2);
    }

    /* renamed from: c */
    public int mo5736c(int i) {
        int x = C0962e0.m5566x(this);
        if (i == 3) {
            int i2 = this.f5213b0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = x == 0 ? this.f5215d0 : this.f5216e0;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.f5214c0;
            if (i4 != 3) {
                return i4;
            }
            int i5 = x == 0 ? this.f5216e0 : this.f5215d0;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.f5215d0;
            if (i6 != 3) {
                return i6;
            }
            int i7 = x == 0 ? this.f5213b0 : this.f5214c0;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.f5216e0;
            if (i8 != 3) {
                return i8;
            }
            int i9 = x == 0 ? this.f5214c0 : this.f5213b0;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C1312e) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C1312e) getChildAt(i).getLayoutParams()).f5244b);
        }
        this.f5202P = f;
        boolean a = this.f5204R.mo5427a(true);
        boolean a2 = this.f5205S.mo5427a(true);
        if (a || a2) {
            C0962e0.m5561u0(this);
        }
    }

    /* renamed from: d */
    public int mo5742d(@C0193h0 View view) {
        if (mo5759i(view)) {
            return mo5736c(((C1312e) view.getLayoutParams()).f5243a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f5202P <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = getChildAt(i);
                if (m6922a(x, y, childAt) && !mo5752g(childAt) && m6923a(motionEvent, childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean g = mo5752g(view2);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (g) {
            int childCount = getChildCount();
            i = width;
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view2 && childAt.getVisibility() == 0 && m6933l(childAt) && mo5759i(childAt) && childAt.getHeight() >= height) {
                    if (mo5725a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, i, getHeight());
            i2 = i3;
        } else {
            i = width;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f5202P;
        if (f > 0.0f && g) {
            int i5 = this.f5201O;
            this.f5203Q.setColor((i5 & C0962e0.f4342s) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) i, (float) getHeight(), this.f5203Q);
        } else if (this.f5224m0 != null && mo5725a(view2, 3)) {
            int intrinsicWidth = this.f5224m0.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f5204R.mo5440e()), 1.0f));
            this.f5224m0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f5224m0.setAlpha((int) (max * 255.0f));
            this.f5224m0.draw(canvas);
        } else if (this.f5225n0 != null && mo5725a(view2, 5)) {
            int intrinsicWidth2 = this.f5225n0.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f5205S.mo5440e()), 1.0f));
            this.f5225n0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f5225n0.setAlpha((int) (max2 * 255.0f));
            this.f5225n0.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo5747e(View view) {
        return C0984g.m5636a(((C1312e) view.getLayoutParams()).f5243a, C0962e0.m5566x(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo5749f(View view) {
        return ((C1312e) view.getLayoutParams()).f5244b;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C1312e(-1, -1);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C1312e) {
            return new C1312e((C1312e) layoutParams);
        }
        return layoutParams instanceof MarginLayoutParams ? new C1312e((MarginLayoutParams) layoutParams) : new C1312e(layoutParams);
    }

    public float getDrawerElevation() {
        if (f5198S0) {
            return this.f5212b;
        }
        return 0.0f;
    }

    @C0195i0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f5223l0;
    }

    /* renamed from: j */
    public boolean mo5760j(@C0193h0 View view) {
        if (mo5759i(view)) {
            return ((C1312e) view.getLayoutParams()).f5244b > 0.0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: k */
    public void mo5761k(@C0193h0 View view) {
        mo5734b(view, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5211a0 = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5211a0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f5229r0
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f5223l0
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f5228q0
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f5223l0
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f5223l0
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.a.c r1 = r6.f5204R
            boolean r1 = r1.mo5431b(r7)
            androidx.customview.a.c r2 = r6.f5205S
            boolean r2 = r2.mo5431b(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0038
        L_0x001e:
            androidx.customview.a.c r7 = r6.f5204R
            boolean r7 = r7.mo5423a(r4)
            if (r7 == 0) goto L_0x0038
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f5206T
            r7.mo5789b()
            androidx.drawerlayout.widget.DrawerLayout$g r7 = r6.f5207U
            r7.mo5789b()
            goto L_0x0038
        L_0x0031:
            r6.mo5724a(r2)
            r6.f5217f0 = r3
            r6.f5218g0 = r3
        L_0x0038:
            r7 = 0
            goto L_0x0064
        L_0x003a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f5221j0 = r0
            r6.f5222k0 = r7
            float r4 = r6.f5202P
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005f
            androidx.customview.a.c r4 = r6.f5204R
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo5428b(r0, r7)
            if (r7 == 0) goto L_0x005f
            boolean r7 = r6.mo5752g(r7)
            if (r7 == 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            r6.f5217f0 = r3
            r6.f5218g0 = r3
        L_0x0064:
            if (r1 != 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.m6927e()
            if (r7 != 0) goto L_0x0074
            boolean r7 = r6.f5218g0
            if (r7 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r2 = 0
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m6928f()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View d = mo5743d();
        if (d != null && mo5742d(d) == 0) {
            mo5729b();
        }
        return d != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f5209W = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1312e eVar = (C1312e) childAt.getLayoutParams();
                if (mo5752g(childAt)) {
                    int i8 = eVar.leftMargin;
                    childAt.layout(i8, eVar.topMargin, childAt.getMeasuredWidth() + i8, eVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo5725a(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (eVar.f5244b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i6 - ((int) (eVar.f5244b * f3));
                        f = ((float) (i6 - i9)) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != eVar.f5244b;
                    int i10 = eVar.f5243a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = eVar.topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = eVar.bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = eVar.topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - eVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - eVar.bottomMargin);
                    }
                    if (z2) {
                        mo5739c(childAt, f);
                    }
                    int i18 = eVar.f5244b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.f5209W = false;
        this.f5211a0 = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f5228q0 != null && C0962e0.m5554s(this);
        int x = C0962e0.m5566x(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C1312e eVar = (C1312e) childAt.getLayoutParams();
                if (z) {
                    int a = C0984g.m5636a(eVar.f5243a, x);
                    if (C0962e0.m5554s(childAt)) {
                        if (VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f5228q0;
                            if (a == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f5228q0;
                        if (a == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        eVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        eVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        eVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        eVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo5752g(childAt)) {
                    childAt.measure(MeasureSpec.makeMeasureSpec((size - eVar.leftMargin) - eVar.rightMargin, C6637f.f18605b), MeasureSpec.makeMeasureSpec((size2 - eVar.topMargin) - eVar.bottomMargin, C6637f.f18605b));
                } else if (mo5759i(childAt)) {
                    if (f5198S0) {
                        float r = C0962e0.m5551r(childAt);
                        float f = this.f5212b;
                        if (r != f) {
                            C0962e0.m5472b(childAt, f);
                        }
                    }
                    int e = mo5747e(childAt) & 7;
                    boolean z4 = e == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f5200N + eVar.leftMargin + eVar.rightMargin, eVar.width), ViewGroup.getChildMeasureSpec(i2, eVar.topMargin + eVar.bottomMargin, eVar.height));
                        i4++;
                        i3 = 0;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child drawer has absolute gravity ");
                        sb.append(m6931h(e));
                        sb.append(" but this ");
                        sb.append(f5199z0);
                        sb.append(" already has a ");
                        sb.append("drawer view along that edge");
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Child ");
                    sb2.append(childAt);
                    sb2.append(" at index ");
                    sb2.append(i4);
                    sb2.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
                    sb2.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.openDrawerGravity;
        if (i != 0) {
            View b = mo5728b(i);
            if (b != null) {
                mo5761k(b);
            }
        }
        int i2 = savedState.lockModeLeft;
        if (i2 != 3) {
            mo5713a(i2, 3);
        }
        int i3 = savedState.lockModeRight;
        if (i3 != 3) {
            mo5713a(i3, 5);
        }
        int i4 = savedState.lockModeStart;
        if (i4 != 3) {
            mo5713a(i4, (int) C0984g.f4394b);
        }
        int i5 = savedState.lockModeEnd;
        if (i5 != 3) {
            mo5713a(i5, (int) C0984g.f4395c);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m6932i();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            C1312e eVar = (C1312e) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = eVar.f5246d == 1;
            if (eVar.f5246d != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.openDrawerGravity = eVar.f5243a;
            } else {
                i++;
            }
        }
        savedState.lockModeLeft = this.f5213b0;
        savedState.lockModeRight = this.f5214c0;
        savedState.lockModeStart = this.f5215d0;
        savedState.lockModeEnd = this.f5216e0;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f5204R.mo5421a(motionEvent);
        this.f5205S.mo5421a(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5221j0 = x;
            this.f5222k0 = y;
            this.f5217f0 = false;
            this.f5218g0 = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View b = this.f5204R.mo5428b((int) x2, (int) y2);
            if (b != null && mo5752g(b)) {
                float f = x2 - this.f5221j0;
                float f2 = y2 - this.f5222k0;
                int g = this.f5204R.mo5444g();
                if ((f * f) + (f2 * f2) < ((float) (g * g))) {
                    View c = mo5737c();
                    if (!(c == null || mo5742d(c) == 2)) {
                        z = false;
                        mo5724a(z);
                        this.f5217f0 = false;
                    }
                }
            }
            z = true;
            mo5724a(z);
            this.f5217f0 = false;
        } else if (action == 3) {
            mo5724a(true);
            this.f5217f0 = false;
            this.f5218g0 = false;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f5217f0 = z;
        if (z) {
            mo5724a(true);
        }
    }

    public void requestLayout() {
        if (!this.f5209W) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f5212b = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo5759i(childAt)) {
                C0962e0.m5472b(childAt, this.f5212b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C1311d dVar) {
        C1311d dVar2 = this.f5219h0;
        if (dVar2 != null) {
            mo5735b(dVar2);
        }
        if (dVar != null) {
            mo5722a(dVar);
        }
        this.f5219h0 = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo5713a(i, 3);
        mo5713a(i, 5);
    }

    public void setScrimColor(@C0198k int i) {
        this.f5201O = i;
        invalidate();
    }

    public void setStatusBarBackground(@C0195i0 Drawable drawable) {
        this.f5223l0 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@C0198k int i) {
        this.f5223l0 = new ColorDrawable(i);
        invalidate();
    }

    public DrawerLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: h */
    private Drawable m6930h() {
        int x = C0962e0.m5566x(this);
        if (x == 0) {
            Drawable drawable = this.f5231t0;
            if (drawable != null) {
                m6925b(drawable, x);
                return this.f5231t0;
            }
        } else {
            Drawable drawable2 = this.f5230s0;
            if (drawable2 != null) {
                m6925b(drawable2, x);
                return this.f5230s0;
            }
        }
        return this.f5233v0;
    }

    /* renamed from: b */
    public void mo5735b(@C0193h0 C1311d dVar) {
        if (dVar != null) {
            List<C1311d> list = this.f5220i0;
            if (list != null) {
                list.remove(dVar);
            }
        }
    }

    /* renamed from: f */
    public boolean mo5750f(int i) {
        View b = mo5728b(i);
        if (b != null) {
            return mo5760j(b);
        }
        return false;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1312e(getContext(), attributeSet);
    }

    public DrawerLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5210a = new C1310c();
        this.f5201O = f5190K0;
        this.f5203Q = new Paint();
        this.f5211a0 = true;
        this.f5213b0 = 3;
        this.f5214c0 = 3;
        this.f5215d0 = 3;
        this.f5216e0 = 3;
        this.f5230s0 = null;
        this.f5231t0 = null;
        this.f5232u0 = null;
        this.f5233v0 = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f5200N = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f5206T = new C1314g(3);
        this.f5207U = new C1314g(5);
        this.f5204R = C1138c.m6479a((ViewGroup) this, 1.0f, (C1141c) this.f5206T);
        this.f5204R.mo5441e(1);
        this.f5204R.mo5419a(f2);
        this.f5206T.mo5788a(this.f5204R);
        this.f5205S = C1138c.m6479a((ViewGroup) this, 1.0f, (C1141c) this.f5207U);
        this.f5205S.mo5441e(2);
        this.f5205S.mo5419a(f2);
        this.f5207U.mo5788a(this.f5205S);
        setFocusableInTouchMode(true);
        C0962e0.m5531l((View) this, 1);
        C0962e0.m5443a((View) this, (C0947a) new C1309b());
        setMotionEventSplittingEnabled(false);
        if (C0962e0.m5554s(this)) {
            if (VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C1308a());
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f5180A0);
                try {
                    this.f5223l0 = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f5223l0 = null;
            }
        }
        this.f5212b = f * 10.0f;
        this.f5234w0 = new ArrayList<>();
    }

    /* renamed from: e */
    public boolean mo5748e(int i) {
        View b = mo5728b(i);
        if (b != null) {
            return mo5758h(b);
        }
        return false;
    }

    public void setStatusBarBackground(int i) {
        this.f5223l0 = i != 0 ? C0841b.m4928c(getContext(), i) : null;
        invalidate();
    }

    /* renamed from: b */
    private MotionEvent m6924b(MotionEvent motionEvent, View view) {
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f5236y0 == null) {
                this.f5236y0 = new Matrix();
            }
            matrix.invert(this.f5236y0);
            obtain.transform(this.f5236y0);
        }
        return obtain;
    }

    /* renamed from: f */
    private boolean m6928f() {
        return mo5743d() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo5759i(View view) {
        int a = C0984g.m5636a(((C1312e) view.getLayoutParams()).f5243a, C0962e0.m5566x(view));
        return ((a & 3) == 0 && (a & 5) == 0) ? false : true;
    }

    /* renamed from: e */
    private boolean m6927e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1312e) getChildAt(i).getLayoutParams()).f5245c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5718a(Drawable drawable, int i) {
        if (!f5198S0) {
            if ((i & C0984g.f4394b) == 8388611) {
                this.f5230s0 = drawable;
            } else if ((i & C0984g.f4395c) == 8388613) {
                this.f5231t0 = drawable;
            } else if ((i & 3) == 3) {
                this.f5232u0 = drawable;
            } else {
                if ((i & 5) == 5) {
                    this.f5233v0 = drawable;
                }
            }
            m6932i();
            invalidate();
        }
    }

    @C0195i0
    /* renamed from: d */
    public CharSequence mo5744d(int i) {
        int a = C0984g.m5636a(i, C0962e0.m5566x(this));
        if (a == 3) {
            return this.f5226o0;
        }
        if (a == 5) {
            return this.f5227p0;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo5743d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo5759i(childAt) && mo5760j(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo5752g(View view) {
        return ((C1312e) view.getLayoutParams()).f5243a == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5738c(View view) {
        C1312e eVar = (C1312e) view.getLayoutParams();
        if ((eVar.f5246d & 1) == 0) {
            eVar.f5246d = 1;
            List<C1311d> list = this.f5220i0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C1311d) this.f5220i0.get(size)).mo1020a(view);
                }
            }
            m6926c(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: g */
    public void mo5751g(int i) {
        mo5731b(i, true);
    }

    /* renamed from: h */
    public boolean mo5758h(@C0193h0 View view) {
        if (mo5759i(view)) {
            return (((C1312e) view.getLayoutParams()).f5246d & 1) == 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo5722a(@C0193h0 C1311d dVar) {
        if (dVar != null) {
            if (this.f5220i0 == null) {
                this.f5220i0 = new ArrayList();
            }
            this.f5220i0.add(dVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5732b(View view) {
        C1312e eVar = (C1312e) view.getLayoutParams();
        if ((eVar.f5246d & 1) == 1) {
            eVar.f5246d = 0;
            List<C1311d> list = this.f5220i0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C1311d) this.f5220i0.get(size)).mo1027b(view);
                }
            }
            m6926c(view, false);
            if (hasWindowFocus()) {
                View rootView = getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5713a(int i, int i2) {
        int a = C0984g.m5636a(i2, C0962e0.m5566x(this));
        if (i2 == 3) {
            this.f5213b0 = i;
        } else if (i2 == 5) {
            this.f5214c0 = i;
        } else if (i2 == 8388611) {
            this.f5215d0 = i;
        } else if (i2 == 8388613) {
            this.f5216e0 = i;
        }
        if (i != 0) {
            (a == 3 ? this.f5204R : this.f5205S).mo5429b();
        }
        if (i == 1) {
            View b = mo5728b(a);
            if (b != null) {
                mo5719a(b);
            }
        } else if (i == 2) {
            View b2 = mo5728b(a);
            if (b2 != null) {
                mo5761k(b2);
            }
        }
    }

    /* renamed from: c */
    private void m6926c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo5759i(childAt)) && (!z || childAt != view)) {
                C0962e0.m5531l(childAt, 4);
            } else {
                C0962e0.m5531l(childAt, 1);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5733b(View view, float f) {
        float width = (float) view.getWidth();
        int i = (int) (width * f);
        int f2 = i - ((int) (mo5749f(view) * width));
        if (!mo5725a(view, 3)) {
            f2 = -f2;
        }
        view.offsetLeftAndRight(f2);
        mo5739c(view, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5739c(View view, float f) {
        C1312e eVar = (C1312e) view.getLayoutParams();
        if (f != eVar.f5244b) {
            eVar.f5244b = f;
            mo5720a(view, f);
        }
    }

    /* renamed from: a */
    public void mo5715a(int i, @C0193h0 View view) {
        if (mo5759i(view)) {
            mo5713a(i, ((C1312e) view.getLayoutParams()).f5243a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a ");
        sb.append("drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo5737c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C1312e) childAt.getLayoutParams()).f5246d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo5728b(int i) {
        int a = C0984g.m5636a(i, C0962e0.m5566x(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo5747e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo5716a(int i, @C0195i0 CharSequence charSequence) {
        int a = C0984g.m5636a(i, C0962e0.m5566x(this));
        if (a == 3) {
            this.f5226o0 = charSequence;
        } else if (a == 5) {
            this.f5227p0 = charSequence;
        }
    }

    /* renamed from: b */
    private boolean m6925b(Drawable drawable, int i) {
        if (drawable == null || !C0892a.m5158f(drawable)) {
            return false;
        }
        C0892a.m5152a(drawable, i);
        return true;
    }

    /* renamed from: a */
    private boolean m6922a(float f, float f2, View view) {
        if (this.f5235x0 == null) {
            this.f5235x0 = new Rect();
        }
        view.getHitRect(this.f5235x0);
        return this.f5235x0.contains((int) f, (int) f2);
    }

    /* renamed from: b */
    public void mo5729b() {
        mo5724a(false);
    }

    /* renamed from: b */
    public void mo5734b(@C0193h0 View view, boolean z) {
        if (mo5759i(view)) {
            C1312e eVar = (C1312e) view.getLayoutParams();
            if (this.f5211a0) {
                eVar.f5244b = 1.0f;
                eVar.f5246d = 1;
                m6926c(view, true);
            } else if (z) {
                eVar.f5246d |= 2;
                if (mo5725a(view, 3)) {
                    this.f5204R.mo5433b(view, 0, view.getTop());
                } else {
                    this.f5205S.mo5433b(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo5733b(view, 1.0f);
                mo5714a(eVar.f5243a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private boolean m6923a(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent b = m6924b(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(b);
            b.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5714a(int i, int i2, View view) {
        int h = this.f5204R.mo5445h();
        int h2 = this.f5205S.mo5445h();
        int i3 = 2;
        if (h == 1 || h2 == 1) {
            i3 = 1;
        } else if (!(h == 2 || h2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((C1312e) view.getLayoutParams()).f5244b;
            if (f == 0.0f) {
                mo5732b(view);
            } else if (f == 1.0f) {
                mo5738c(view);
            }
        }
        if (i3 != this.f5208V) {
            this.f5208V = i3;
            List<C1311d> list = this.f5220i0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C1311d) this.f5220i0.get(size)).mo1015a(i3);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo5731b(int i, boolean z) {
        View b = mo5728b(i);
        if (b != null) {
            mo5734b(b, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(m6931h(i));
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5720a(View view, float f) {
        List<C1311d> list = this.f5220i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C1311d) this.f5220i0.get(size)).mo1021a(view, f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5725a(View view, int i) {
        return (mo5747e(view) & i) == i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5724a(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1312e eVar = (C1312e) childAt.getLayoutParams();
            if (mo5759i(childAt) && (!z || eVar.f5245c)) {
                int width = childAt.getWidth();
                if (mo5725a(childAt, 3)) {
                    z2 = this.f5204R.mo5433b(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f5205S.mo5433b(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                eVar.f5245c = false;
            }
        }
        this.f5206T.mo5789b();
        this.f5207U.mo5789b();
        if (z3) {
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo5719a(@C0193h0 View view) {
        mo5721a(view, true);
    }

    /* renamed from: a */
    public void mo5721a(@C0193h0 View view, boolean z) {
        if (mo5759i(view)) {
            C1312e eVar = (C1312e) view.getLayoutParams();
            if (this.f5211a0) {
                eVar.f5244b = 0.0f;
                eVar.f5246d = 0;
            } else if (z) {
                eVar.f5246d |= 4;
                if (mo5725a(view, 3)) {
                    this.f5204R.mo5433b(view, -view.getWidth(), view.getTop());
                } else {
                    this.f5205S.mo5433b(view, getWidth(), view.getTop());
                }
            } else {
                mo5733b(view, 0.0f);
                mo5714a(eVar.f5243a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo5712a(int i) {
        mo5717a(i, true);
    }

    /* renamed from: a */
    public void mo5717a(int i, boolean z) {
        View b = mo5728b(i);
        if (b != null) {
            mo5721a(b, z);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(m6931h(i));
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5711a() {
        if (!this.f5218g0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f5218g0 = true;
        }
    }
}
