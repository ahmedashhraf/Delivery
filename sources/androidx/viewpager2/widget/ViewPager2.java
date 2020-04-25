package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1016d.C1018b;
import androidx.core.p034l.p035o0.C1025g;
import androidx.core.p034l.p035o0.C1025g.C1026a;
import androidx.recyclerview.widget.C1778x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1640i;
import androidx.recyclerview.widget.RecyclerView.C1644l;
import androidx.recyclerview.widget.RecyclerView.C1650n;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import androidx.recyclerview.widget.RecyclerView.C1657q;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.viewpager2.C2031R;
import androidx.viewpager2.adapter.C2045b;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: i0 */
    public static final int f7851i0 = 0;

    /* renamed from: j0 */
    public static final int f7852j0 = 1;

    /* renamed from: k0 */
    public static final int f7853k0 = 0;

    /* renamed from: l0 */
    public static final int f7854l0 = 1;

    /* renamed from: m0 */
    public static final int f7855m0 = 2;

    /* renamed from: n0 */
    public static final int f7856n0 = -1;

    /* renamed from: o0 */
    static boolean f7857o0 = true;

    /* renamed from: N */
    private C2068b f7858N = new C2068b(3);

    /* renamed from: O */
    int f7859O;

    /* renamed from: P */
    boolean f7860P = false;

    /* renamed from: Q */
    private C1640i f7861Q = new C2047a();

    /* renamed from: R */
    private LinearLayoutManager f7862R;

    /* renamed from: S */
    private int f7863S = -1;

    /* renamed from: T */
    private Parcelable f7864T;

    /* renamed from: U */
    RecyclerView f7865U;

    /* renamed from: V */
    private C1778x f7866V;

    /* renamed from: W */
    C2073g f7867W;

    /* renamed from: a */
    private final Rect f7868a = new Rect();

    /* renamed from: a0 */
    private C2068b f7869a0;

    /* renamed from: b */
    private final Rect f7870b = new Rect();

    /* renamed from: b0 */
    private C2070d f7871b0;

    /* renamed from: c0 */
    private C2072f f7872c0;

    /* renamed from: d0 */
    private C1644l f7873d0 = null;

    /* renamed from: e0 */
    private boolean f7874e0 = false;

    /* renamed from: f0 */
    private boolean f7875f0 = true;

    /* renamed from: g0 */
    private int f7876g0 = -1;

    /* renamed from: h0 */
    C2051e f7877h0;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C2046a();

        /* renamed from: N */
        Parcelable f7878N;

        /* renamed from: a */
        int f7879a;

        /* renamed from: b */
        int f7880b;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        static class C2046a implements ClassLoaderCreator<SavedState> {
            C2046a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }
        }

        @RequiresApi(24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m10700a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m10700a(Parcel parcel, ClassLoader classLoader) {
            this.f7879a = parcel.readInt();
            this.f7880b = parcel.readInt();
            this.f7878N = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7879a);
            parcel.writeInt(this.f7880b);
            parcel.writeParcelable(this.f7878N, i);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m10700a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C2047a extends C2053g {
        C2047a() {
            super(null);
        }

        /* renamed from: a */
        public void mo7351a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f7860P = true;
            viewPager2.f7867W.mo9043g();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C2048b extends C2056j {
        C2048b() {
        }

        /* renamed from: a */
        public void mo8944a(int i) {
            if (i == 0) {
                ViewPager2.this.mo8978i();
            }
        }

        /* renamed from: b */
        public void mo8945b(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f7859O != i) {
                viewPager2.f7859O = i;
                viewPager2.f7877h0.mo9013g();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C2049c extends C2056j {
        C2049c() {
        }

        /* renamed from: b */
        public void mo8945b(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f7865U.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C2050d implements C1657q {
        C2050d() {
        }

        /* renamed from: a */
        public void mo7525a(@C0193h0 View view) {
        }

        /* renamed from: b */
        public void mo7526b(@C0193h0 View view) {
            C1656p pVar = (C1656p) view.getLayoutParams();
            if (pVar.width != -1 || pVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class C2051e {
        private C2051e() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8997a(@C0193h0 AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8998a(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8999a(@C0193h0 C1016d dVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9000a(@C0195i0 C1638g<?> gVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9001a(@C0193h0 C2068b bVar, @C0193h0 RecyclerView recyclerView) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9002a() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9003a(int i) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9004a(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9005b(@C0195i0 C1638g<?> gVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo9006b() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo9008b(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public String mo9009c() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo9010d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public CharSequence mo9011e() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo9012f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo9013g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo9014h() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo9015i() {
        }

        /* synthetic */ C2051e(ViewPager2 viewPager2, C2047a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo9007b(int i) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C2052f extends C2051e {
        C2052f() {
            super(ViewPager2.this, null);
        }

        /* renamed from: a */
        public boolean mo9003a(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.mo8967f();
        }

        /* renamed from: b */
        public boolean mo9006b() {
            return true;
        }

        /* renamed from: b */
        public boolean mo9007b(int i) {
            if (mo9003a(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public CharSequence mo9011e() {
            if (mo9006b()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo8999a(@C0193h0 C1016d dVar) {
            if (!ViewPager2.this.mo8967f()) {
                dVar.mo4953b(C1017a.f4626t);
                dVar.mo4953b(C1017a.f4625s);
                dVar.mo5024s(false);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class C2053g extends C1640i {
        private C2053g() {
        }

        /* renamed from: a */
        public abstract void mo7351a();

        /* renamed from: a */
        public final void mo7352a(int i, int i2) {
            mo7351a();
        }

        /* renamed from: b */
        public final void mo7355b(int i, int i2) {
            mo7351a();
        }

        /* renamed from: c */
        public final void mo7356c(int i, int i2) {
            mo7351a();
        }

        /* synthetic */ C2053g(C2047a aVar) {
            this();
        }

        /* renamed from: a */
        public final void mo7354a(int i, int i2, @C0195i0 Object obj) {
            mo7351a();
        }

        /* renamed from: a */
        public final void mo7353a(int i, int i2, int i3) {
            mo7351a();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C2054h extends LinearLayoutManager {
        C2054h(Context context) {
            super(context);
        }

        /* renamed from: a */
        public boolean mo7431a(@C0193h0 C1664w wVar, @C0193h0 State state, int i, @C0195i0 Bundle bundle) {
            if (ViewPager2.this.f7877h0.mo9003a(i)) {
                return ViewPager2.this.f7877h0.mo9007b(i);
            }
            return super.mo7431a(wVar, state, i, bundle);
        }

        /* renamed from: a */
        public boolean mo7434a(@C0193h0 RecyclerView recyclerView, @C0193h0 View view, @C0193h0 Rect rect, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: a */
        public void mo7421a(@C0193h0 C1664w wVar, @C0193h0 State state, @C0193h0 C1016d dVar) {
            super.mo7421a(wVar, state, dVar);
            ViewPager2.this.f7877h0.mo8999a(dVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6981a(@C0193h0 State state, @C0193h0 int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo6981a(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    @C0237z(from = 1)
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public @interface C2055i {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public static abstract class C2056j {
        /* renamed from: a */
        public void mo8944a(int i) {
        }

        /* renamed from: a */
        public void mo9016a(int i, float f, @C0199k0 int i2) {
        }

        /* renamed from: b */
        public void mo8945b(int i) {
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public @interface C2057k {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    class C2058l extends C2051e {

        /* renamed from: b */
        private final C1025g f7888b = new C2059a();

        /* renamed from: c */
        private final C1025g f7889c = new C2060b();

        /* renamed from: d */
        private C1640i f7890d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$a */
        class C2059a implements C1025g {
            C2059a() {
            }

            /* renamed from: a */
            public boolean mo5111a(@C0193h0 View view, @C0195i0 C1026a aVar) {
                C2058l.this.mo9017c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$b */
        class C2060b implements C1025g {
            C2060b() {
            }

            /* renamed from: a */
            public boolean mo5111a(@C0193h0 View view, @C0195i0 C1026a aVar) {
                C2058l.this.mo9017c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$l$c */
        class C2061c extends C2053g {
            C2061c() {
                super(null);
            }

            /* renamed from: a */
            public void mo7351a() {
                C2058l.this.mo9018j();
            }
        }

        C2058l() {
            super(ViewPager2.this, null);
        }

        /* renamed from: a */
        public void mo9001a(@C0193h0 C2068b bVar, @C0193h0 RecyclerView recyclerView) {
            C0962e0.m5531l((View) recyclerView, 2);
            this.f7890d = new C2061c();
            if (C0962e0.m5557t(ViewPager2.this) == 0) {
                C0962e0.m5531l((View) ViewPager2.this, 1);
            }
        }

        /* renamed from: a */
        public boolean mo9002a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo9004a(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: b */
        public void mo9005b(@C0195i0 C1638g<?> gVar) {
            if (gVar != null) {
                gVar.mo7331b(this.f7890d);
            }
        }

        /* renamed from: c */
        public String mo9009c() {
            if (mo9002a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: d */
        public void mo9010d() {
            mo9018j();
        }

        /* renamed from: f */
        public void mo9012f() {
            mo9018j();
        }

        /* renamed from: g */
        public void mo9013g() {
            mo9018j();
        }

        /* renamed from: h */
        public void mo9014h() {
            mo9018j();
        }

        /* renamed from: i */
        public void mo9015i() {
            mo9018j();
            if (VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo9018j() {
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            C0962e0.m5518i((View) viewPager2, 16908360);
            C0962e0.m5518i((View) viewPager2, 16908361);
            C0962e0.m5518i((View) viewPager2, 16908358);
            C0962e0.m5518i((View) viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null) {
                int b = ViewPager2.this.getAdapter().mo7325b();
                if (b != 0 && ViewPager2.this.mo8967f()) {
                    if (ViewPager2.this.getOrientation() == 0) {
                        boolean e = ViewPager2.this.mo8966e();
                        int i2 = e ? 16908360 : 16908361;
                        if (e) {
                            i = 16908361;
                        }
                        if (ViewPager2.this.f7859O < b - 1) {
                            C0962e0.m5446a((View) viewPager2, new C1017a(i2, null), (CharSequence) null, this.f7888b);
                        }
                        if (ViewPager2.this.f7859O > 0) {
                            C0962e0.m5446a((View) viewPager2, new C1017a(i, null), (CharSequence) null, this.f7889c);
                        }
                    } else {
                        if (ViewPager2.this.f7859O < b - 1) {
                            C0962e0.m5446a((View) viewPager2, new C1017a(16908359, null), (CharSequence) null, this.f7888b);
                        }
                        if (ViewPager2.this.f7859O > 0) {
                            C0962e0.m5446a((View) viewPager2, new C1017a(16908358, null), (CharSequence) null, this.f7889c);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public boolean mo9008b(int i, Bundle bundle) {
            int i2;
            if (mo9004a(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo9017c(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo9017c(int i) {
            if (ViewPager2.this.mo8967f()) {
                ViewPager2.this.mo8957b(i, true);
            }
        }

        /* renamed from: c */
        private void m10745c(AccessibilityNodeInfo accessibilityNodeInfo) {
            C1638g adapter = ViewPager2.this.getAdapter();
            if (adapter != null) {
                int b = adapter.mo7325b();
                if (b != 0 && ViewPager2.this.mo8967f()) {
                    if (ViewPager2.this.f7859O > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (ViewPager2.this.f7859O < b - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
            }
        }

        /* renamed from: a */
        public void mo9000a(@C0195i0 C1638g<?> gVar) {
            mo9018j();
            if (gVar != null) {
                gVar.mo7321a(this.f7890d);
            }
        }

        /* renamed from: a */
        public void mo8998a(AccessibilityNodeInfo accessibilityNodeInfo) {
            m10744b(accessibilityNodeInfo);
            if (VERSION.SDK_INT >= 16) {
                m10745c(accessibilityNodeInfo);
            }
        }

        /* renamed from: b */
        private void m10744b(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().mo7325b();
            } else {
                i = ViewPager2.this.getAdapter().mo7325b();
                i2 = 0;
                C1016d.m5806a(accessibilityNodeInfo).mo4939a((Object) C1018b.m5960a(i2, i, false, 0));
            }
            i = 0;
            C1016d.m5806a(accessibilityNodeInfo).mo4939a((Object) C1018b.m5960a(i2, i, false, 0));
        }

        /* renamed from: a */
        public void mo8997a(@C0193h0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo9009c());
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public interface C2062m {
        /* renamed from: a */
        void mo9019a(@C0193h0 View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    private class C2063n extends C1778x {
        C2063n() {
        }

        @C0195i0
        /* renamed from: c */
        public View mo7729c(C1651o oVar) {
            if (ViewPager2.this.mo8964d()) {
                return null;
            }
            return super.mo7729c(oVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$o */
    private class C2064o extends RecyclerView {
        C2064o(@C0193h0 Context context) {
            super(context);
        }

        @RequiresApi(23)
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f7877h0.mo9006b()) {
                return ViewPager2.this.f7877h0.mo9011e();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(@C0193h0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f7859O);
            accessibilityEvent.setToIndex(ViewPager2.this.f7859O);
            ViewPager2.this.f7877h0.mo8997a(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo8967f() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo8967f() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$p */
    private static class C2065p implements Runnable {

        /* renamed from: a */
        private final int f7897a;

        /* renamed from: b */
        private final RecyclerView f7898b;

        C2065p(int i, RecyclerView recyclerView) {
            this.f7897a = i;
            this.f7898b = recyclerView;
        }

        public void run() {
            this.f7898b.smoothScrollToPosition(this.f7897a);
        }
    }

    public ViewPager2(@C0193h0 Context context) {
        super(context);
        m10675a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m10675a(Context context, AttributeSet attributeSet) {
        this.f7877h0 = f7857o0 ? new C2058l() : new C2052f();
        this.f7865U = new C2064o(context);
        this.f7865U.setId(C0962e0.m5482c());
        this.f7865U.setDescendantFocusability(131072);
        this.f7862R = new C2054h(context);
        this.f7865U.setLayoutManager(this.f7862R);
        this.f7865U.setScrollingTouchSlop(1);
        m10677b(context, attributeSet);
        this.f7865U.setLayoutParams(new LayoutParams(-1, -1));
        this.f7865U.addOnChildAttachStateChangeListener(m10679j());
        this.f7867W = new C2073g(this);
        this.f7871b0 = new C2070d(this, this.f7867W, this.f7865U);
        this.f7866V = new C2063n();
        this.f7866V.mo7725a(this.f7865U);
        this.f7865U.addOnScrollListener(this.f7867W);
        this.f7869a0 = new C2068b(3);
        this.f7867W.mo9037a((C2056j) this.f7869a0);
        C2048b bVar = new C2048b();
        C2049c cVar = new C2049c();
        this.f7869a0.mo9025a((C2056j) bVar);
        this.f7869a0.mo9025a((C2056j) cVar);
        this.f7877h0.mo9001a(this.f7869a0, this.f7865U);
        this.f7869a0.mo9025a((C2056j) this.f7858N);
        this.f7872c0 = new C2072f(this.f7862R);
        this.f7869a0.mo9025a((C2056j) this.f7872c0);
        RecyclerView recyclerView = this.f7865U;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: b */
    private void m10677b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2031R.styleable.ViewPager2);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C2031R.styleable.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C2031R.styleable.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    private C1657q m10679j() {
        return new C2050d();
    }

    /* renamed from: k */
    private void m10680k() {
        if (this.f7863S != -1) {
            C1638g adapter = getAdapter();
            if (adapter != null) {
                Parcelable parcelable = this.f7864T;
                if (parcelable != null) {
                    if (adapter instanceof C2045b) {
                        ((C2045b) adapter).mo8930a(parcelable);
                    }
                    this.f7864T = null;
                }
                this.f7859O = Math.max(0, Math.min(this.f7863S, adapter.mo7325b() - 1));
                this.f7863S = -1;
                this.f7865U.scrollToPosition(this.f7859O);
                this.f7877h0.mo9010d();
            }
        }
    }

    /* renamed from: c */
    public void mo8961c() {
        this.f7865U.invalidateItemDecorations();
    }

    public boolean canScrollHorizontally(int i) {
        return this.f7865U.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f7865U.canScrollVertically(i);
    }

    /* renamed from: d */
    public boolean mo8964d() {
        return this.f7871b0.mo9032c();
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f7879a;
            sparseArray.put(this.f7865U.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m10680k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo8966e() {
        return this.f7862R.mo7485k() == 1;
    }

    /* renamed from: f */
    public boolean mo8967f() {
        return this.f7875f0;
    }

    /* renamed from: g */
    public void mo8968g() {
        if (this.f7872c0.mo9033a() != null) {
            double a = this.f7867W.mo9035a();
            int i = (int) a;
            double d = (double) i;
            Double.isNaN(d);
            float f = (float) (a - d);
            this.f7872c0.mo9016a(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    @RequiresApi(23)
    public CharSequence getAccessibilityClassName() {
        if (this.f7877h0.mo9002a()) {
            return this.f7877h0.mo9009c();
        }
        return super.getAccessibilityClassName();
    }

    @C0195i0
    public C1638g getAdapter() {
        return this.f7865U.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7859O;
    }

    public int getItemDecorationCount() {
        return this.f7865U.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7876g0;
    }

    public int getOrientation() {
        return this.f7862R.mo6963R();
    }

    /* access modifiers changed from: 0000 */
    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f7865U;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f7867W.mo9038b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo8977h() {
        View c = this.f7866V.mo7729c(this.f7862R);
        if (c != null) {
            int[] a = this.f7866V.mo7726a((C1651o) this.f7862R, c);
            if (!(a[0] == 0 && a[1] == 0)) {
                this.f7865U.smoothScrollBy(a[0], a[1]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo8978i() {
        C1778x xVar = this.f7866V;
        if (xVar != null) {
            View c = xVar.mo7729c(this.f7862R);
            if (c != null) {
                int p = this.f7862R.mo7496p(c);
                if (p != this.f7859O && getScrollState() == 0) {
                    this.f7869a0.mo8945b(p);
                }
                this.f7860P = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f7877h0.mo8998a(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f7865U.getMeasuredWidth();
        int measuredHeight = this.f7865U.getMeasuredHeight();
        this.f7868a.left = getPaddingLeft();
        this.f7868a.right = (i3 - i) - getPaddingRight();
        this.f7868a.top = getPaddingTop();
        this.f7868a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.f16065c0, measuredWidth, measuredHeight, this.f7868a, this.f7870b);
        RecyclerView recyclerView = this.f7865U;
        Rect rect = this.f7870b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f7860P) {
            mo8978i();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChild(this.f7865U, i, i2);
        int measuredWidth = this.f7865U.getMeasuredWidth();
        int measuredHeight = this.f7865U.getMeasuredHeight();
        int measuredState = this.f7865U.getMeasuredState();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7863S = savedState.f7880b;
        this.f7864T = savedState.f7878N;
    }

    /* access modifiers changed from: protected */
    @C0195i0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7879a = this.f7865U.getId();
        int i = this.f7863S;
        if (i == -1) {
            i = this.f7859O;
        }
        savedState.f7880b = i;
        Parcelable parcelable = this.f7864T;
        if (parcelable != null) {
            savedState.f7878N = parcelable;
        } else {
            C1638g adapter = this.f7865U.getAdapter();
            if (adapter instanceof C2045b) {
                savedState.f7878N = ((C2045b) adapter).mo8929a();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(ViewPager2.class.getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    @RequiresApi(16)
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f7877h0.mo9004a(i, bundle)) {
            return this.f7877h0.mo9008b(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(@C0195i0 C1638g gVar) {
        C1638g adapter = this.f7865U.getAdapter();
        this.f7877h0.mo9005b(adapter);
        m10678b(adapter);
        this.f7865U.setAdapter(gVar);
        this.f7859O = 0;
        m10680k();
        this.f7877h0.mo9000a(gVar);
        m10676a(gVar);
    }

    public void setCurrentItem(int i) {
        mo8950a(i, true);
    }

    @RequiresApi(17)
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f7877h0.mo9012f();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f7876g0 = i;
            this.f7865U.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f7862R.mo7000l(i);
        this.f7877h0.mo9014h();
    }

    public void setPageTransformer(@C0195i0 C2062m mVar) {
        if (mVar != null) {
            if (!this.f7874e0) {
                this.f7873d0 = this.f7865U.getItemAnimator();
                this.f7874e0 = true;
            }
            this.f7865U.setItemAnimator(null);
        } else if (this.f7874e0) {
            this.f7865U.setItemAnimator(this.f7873d0);
            this.f7873d0 = null;
            this.f7874e0 = false;
        }
        if (mVar != this.f7872c0.mo9033a()) {
            this.f7872c0.mo9034a(mVar);
            mo8968g();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f7875f0 = z;
        this.f7877h0.mo9015i();
    }

    /* renamed from: b */
    private void m10678b(@C0195i0 C1638g<?> gVar) {
        if (gVar != null) {
            gVar.mo7331b(this.f7861Q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8957b(int i, boolean z) {
        C1638g adapter = getAdapter();
        if (adapter == null) {
            if (this.f7863S != -1) {
                this.f7863S = Math.max(i, 0);
            }
        } else if (adapter.mo7325b() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.mo7325b() - 1);
            if (min == this.f7859O && this.f7867W.mo9041e()) {
                return;
            }
            if (min != this.f7859O || !z) {
                double d = (double) this.f7859O;
                this.f7859O = min;
                this.f7877h0.mo9013g();
                if (!this.f7867W.mo9041e()) {
                    d = this.f7867W.mo9035a();
                }
                this.f7867W.mo9036a(min, z);
                if (!z) {
                    this.f7865U.scrollToPosition(min);
                    return;
                }
                double d2 = (double) min;
                Double.isNaN(d2);
                if (Math.abs(d2 - d) > 3.0d) {
                    this.f7865U.scrollToPosition(d2 > d ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.f7865U;
                    recyclerView.post(new C2065p(min, recyclerView));
                } else {
                    this.f7865U.smoothScrollToPosition(min);
                }
            }
        }
    }

    public ViewPager2(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        m10675a(context, attributeSet);
    }

    public ViewPager2(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10675a(context, attributeSet);
    }

    /* renamed from: a */
    private void m10676a(@C0195i0 C1638g<?> gVar) {
        if (gVar != null) {
            gVar.mo7321a(this.f7861Q);
        }
    }

    /* renamed from: a */
    public void mo8950a(int i, boolean z) {
        if (!mo8964d()) {
            mo8957b(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: b */
    public boolean mo8960b() {
        return this.f7871b0.mo9031b();
    }

    /* renamed from: b */
    public void mo8959b(@C0193h0 C2056j jVar) {
        this.f7858N.mo9026b(jVar);
    }

    /* renamed from: a */
    public boolean mo8954a() {
        return this.f7871b0.mo9029a();
    }

    /* renamed from: b */
    public void mo8956b(int i) {
        this.f7865U.removeItemDecorationAt(i);
    }

    /* renamed from: a */
    public boolean mo8955a(@C0199k0 @SuppressLint({"SupportAnnotationUsage"}) float f) {
        return this.f7871b0.mo9030a(f);
    }

    /* renamed from: b */
    public void mo8958b(@C0193h0 C1650n nVar) {
        this.f7865U.removeItemDecoration(nVar);
    }

    /* renamed from: a */
    public void mo8953a(@C0193h0 C2056j jVar) {
        this.f7858N.mo9025a(jVar);
    }

    /* renamed from: a */
    public void mo8951a(@C0193h0 C1650n nVar) {
        this.f7865U.addItemDecoration(nVar);
    }

    /* renamed from: a */
    public void mo8952a(@C0193h0 C1650n nVar, int i) {
        this.f7865U.addItemDecoration(nVar, i);
    }

    @C0193h0
    /* renamed from: a */
    public C1650n mo8949a(int i) {
        return this.f7865U.getItemDecorationAt(i);
    }

    @RequiresApi(21)
    public ViewPager2(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m10675a(context, attributeSet);
    }
}
