package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.collection.C0637b;
import androidx.collection.C0642f;
import androidx.core.p033k.C0944i;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1382h.C1384b;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.SavedState;
import androidx.lifecycle.C1457g;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1640i;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C2056j;

public abstract class FragmentStateAdapter extends C1638g<C2044a> implements C2045b {

    /* renamed from: k */
    private static final String f7819k = "f#";

    /* renamed from: l */
    private static final String f7820l = "s#";

    /* renamed from: m */
    private static final long f7821m = 10000;

    /* renamed from: c */
    final Lifecycle f7822c;

    /* renamed from: d */
    final C1382h f7823d;

    /* renamed from: e */
    final C0642f<Fragment> f7824e;

    /* renamed from: f */
    private final C0642f<SavedState> f7825f;

    /* renamed from: g */
    private final C0642f<Integer> f7826g;

    /* renamed from: h */
    private FragmentMaxLifecycleEnforcer f7827h;

    /* renamed from: i */
    boolean f7828i;

    /* renamed from: j */
    private boolean f7829j;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private C2056j f7835a;

        /* renamed from: b */
        private C1640i f7836b;

        /* renamed from: c */
        private C1457g f7837c;

        /* renamed from: d */
        private ViewPager2 f7838d;

        /* renamed from: e */
        private long f7839e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        class C2038a extends C2056j {
            C2038a() {
            }

            /* renamed from: a */
            public void mo8944a(int i) {
                FragmentMaxLifecycleEnforcer.this.mo8942a(false);
            }

            /* renamed from: b */
            public void mo8945b(int i) {
                FragmentMaxLifecycleEnforcer.this.mo8942a(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        class C2039b extends C2043d {
            C2039b() {
                super(null);
            }

            /* renamed from: a */
            public void mo7351a() {
                FragmentMaxLifecycleEnforcer.this.mo8942a(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        @C0193h0
        /* renamed from: c */
        private ViewPager2 m10656c(@C0193h0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ViewPager2 instance. Got: ");
            sb.append(parent);
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8941a(@C0193h0 RecyclerView recyclerView) {
            this.f7838d = m10656c(recyclerView);
            this.f7835a = new C2038a();
            this.f7838d.mo8953a(this.f7835a);
            this.f7836b = new C2039b();
            FragmentStateAdapter.this.mo7321a(this.f7836b);
            this.f7837c = new C1457g() {
                /* renamed from: a */
                public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                    FragmentMaxLifecycleEnforcer.this.mo8942a(false);
                }
            };
            FragmentStateAdapter.this.f7822c.mo6472a(this.f7837c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo8943b(@C0193h0 RecyclerView recyclerView) {
            m10656c(recyclerView).mo8959b(this.f7835a);
            FragmentStateAdapter.this.mo7331b(this.f7836b);
            FragmentStateAdapter.this.f7822c.mo6473b(this.f7837c);
            this.f7838d = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8942a(boolean z) {
            if (!FragmentStateAdapter.this.mo8940g() && this.f7838d.getScrollState() == 0 && !FragmentStateAdapter.this.f7824e.mo3285c() && FragmentStateAdapter.this.mo7325b() != 0) {
                int currentItem = this.f7838d.getCurrentItem();
                if (currentItem < FragmentStateAdapter.this.mo7325b()) {
                    long b = FragmentStateAdapter.this.mo7326b(currentItem);
                    if (b != this.f7839e || z) {
                        Fragment fragment = (Fragment) FragmentStateAdapter.this.f7824e.mo3283c(b);
                        if (fragment != null && fragment.isAdded()) {
                            this.f7839e = b;
                            C1406n a = FragmentStateAdapter.this.f7823d.mo6224a();
                            Fragment fragment2 = null;
                            for (int i = 0; i < FragmentStateAdapter.this.f7824e.mo3287d(); i++) {
                                long a2 = FragmentStateAdapter.this.f7824e.mo3270a(i);
                                Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f7824e.mo3282c(i);
                                if (fragment3.isAdded()) {
                                    if (a2 != this.f7839e) {
                                        a.mo6080a(fragment3, State.STARTED);
                                    } else {
                                        fragment2 = fragment3;
                                    }
                                    fragment3.setMenuVisibility(a2 == this.f7839e);
                                }
                            }
                            if (fragment2 != null) {
                                a.mo6080a(fragment2, State.RESUMED);
                            }
                            if (!a.mo6107k()) {
                                a.mo6103g();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    class C2040a implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f7844a;

        /* renamed from: b */
        final /* synthetic */ C2044a f7845b;

        C2040a(FrameLayout frameLayout, C2044a aVar) {
            this.f7844a = frameLayout;
            this.f7845b = aVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f7844a.getParent() != null) {
                this.f7844a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.mo8937d(this.f7845b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    class C2041b extends C1384b {

        /* renamed from: a */
        final /* synthetic */ Fragment f7847a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f7848b;

        C2041b(Fragment fragment, FrameLayout frameLayout) {
            this.f7847a = fragment;
            this.f7848b = frameLayout;
        }

        /* renamed from: a */
        public void mo6250a(@C0193h0 C1382h hVar, @C0193h0 Fragment fragment, @C0193h0 View view, @C0195i0 Bundle bundle) {
            if (fragment == this.f7847a) {
                hVar.mo6228a((C1384b) this);
                FragmentStateAdapter.this.mo8931a(view, this.f7848b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    class C2042c implements Runnable {
        C2042c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f7828i = false;
            fragmentStateAdapter.mo8938f();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    private static abstract class C2043d extends C1640i {
        private C2043d() {
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

        /* synthetic */ C2043d(C2040a aVar) {
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

    public FragmentStateAdapter(@C0193h0 C1376c cVar) {
        this(cVar.getSupportFragmentManager(), cVar.getLifecycle());
    }

    /* renamed from: h */
    private void m10630h(int i) {
        long b = mo7326b(i);
        if (!this.f7824e.mo3274a(b)) {
            Fragment g = mo8939g(i);
            g.setInitialSavedState((SavedState) this.f7825f.mo3283c(b));
            this.f7824e.mo3284c(b, g);
        }
    }

    /* renamed from: i */
    private Long m10631i(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f7826g.mo3287d(); i2++) {
            if (((Integer) this.f7826g.mo3282c(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f7826g.mo3270a(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: a */
    public final boolean mo7324a(@C0193h0 C2044a aVar) {
        return true;
    }

    /* renamed from: b */
    public long mo7326b(int i) {
        return (long) i;
    }

    /* renamed from: c */
    public final void mo7339d(@C0193h0 C2044a aVar) {
        Long i = m10631i(aVar.mo8948D().getId());
        if (i != null) {
            m10628c(i.longValue());
            this.f7826g.mo3290e(i.longValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo8938f() {
        if (this.f7829j && !mo8940g()) {
            C0637b<Long> bVar = new C0637b<>();
            for (int i = 0; i < this.f7824e.mo3287d(); i++) {
                long a = this.f7824e.mo3270a(i);
                if (!mo8933a(a)) {
                    bVar.add(Long.valueOf(a));
                    this.f7826g.mo3290e(a);
                }
            }
            if (!this.f7828i) {
                this.f7829j = false;
                for (int i2 = 0; i2 < this.f7824e.mo3287d(); i2++) {
                    long a2 = this.f7824e.mo3270a(i2);
                    if (!m10627b(a2)) {
                        bVar.add(Long.valueOf(a2));
                    }
                }
            }
            for (Long longValue : bVar) {
                m10628c(longValue.longValue());
            }
        }
    }

    @C0193h0
    /* renamed from: g */
    public abstract Fragment mo8939g(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo8940g() {
        return this.f7823d.mo6243h();
    }

    public FragmentStateAdapter(@C0193h0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @C0194i
    /* renamed from: a */
    public void mo7322a(@C0193h0 RecyclerView recyclerView) {
        C0944i.m5339a(this.f7827h == null);
        this.f7827h = new FragmentMaxLifecycleEnforcer();
        this.f7827h.mo8941a(recyclerView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8937d(@C0193h0 final C2044a aVar) {
        Fragment fragment = (Fragment) this.f7824e.mo3283c(aVar.mo7274g());
        String str = "Design assumption violated.";
        if (fragment != null) {
            FrameLayout D = aVar.mo8948D();
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException(str);
            } else if (fragment.isAdded() && view == null) {
                m10624a(fragment, D);
            } else if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != D) {
                    mo8931a(view, D);
                }
            } else if (fragment.isAdded()) {
                mo8931a(view, D);
            } else {
                if (!mo8940g()) {
                    m10624a(fragment, D);
                    C1406n a = this.f7823d.mo6224a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("f");
                    sb.append(aVar.mo7274g());
                    a.mo6398a(fragment, sb.toString()).mo6080a(fragment, State.STARTED).mo6103g();
                    this.f7827h.mo8942a(false);
                } else if (!this.f7823d.mo6242g()) {
                    this.f7822c.mo6472a(new C1457g() {
                        /* renamed from: a */
                        public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                            if (!FragmentStateAdapter.this.mo8940g()) {
                                iVar.getLifecycle().mo6473b(this);
                                if (C0962e0.m5515h0(aVar.mo8948D())) {
                                    FragmentStateAdapter.this.mo8937d(aVar);
                                }
                            }
                        }
                    });
                }
            }
        } else {
            throw new IllegalStateException(str);
        }
    }

    public FragmentStateAdapter(@C0193h0 C1382h hVar, @C0193h0 Lifecycle lifecycle) {
        this.f7824e = new C0642f<>();
        this.f7825f = new C0642f<>();
        this.f7826g = new C0642f<>();
        this.f7828i = false;
        this.f7829j = false;
        this.f7823d = hVar;
        this.f7822c = lifecycle;
        super.mo7323a(true);
    }

    @C0194i
    /* renamed from: b */
    public void mo7332b(@C0193h0 RecyclerView recyclerView) {
        this.f7827h.mo8943b(recyclerView);
        this.f7827h = null;
    }

    /* renamed from: c */
    private void m10628c(long j) {
        Fragment fragment = (Fragment) this.f7824e.mo3283c(j);
        if (fragment != null) {
            if (fragment.getView() != null) {
                ViewParent parent = fragment.getView().getParent();
                if (parent != null) {
                    ((FrameLayout) parent).removeAllViews();
                }
            }
            if (!mo8933a(j)) {
                this.f7825f.mo3290e(j);
            }
            if (!fragment.isAdded()) {
                this.f7824e.mo3290e(j);
            } else if (mo8940g()) {
                this.f7829j = true;
            } else {
                if (fragment.isAdded() && mo8933a(j)) {
                    this.f7825f.mo3284c(j, this.f7823d.mo6220a(fragment));
                }
                this.f7823d.mo6224a().mo6094d(fragment).mo6103g();
                this.f7824e.mo3290e(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo7330b(@C0193h0 C2044a aVar, int i) {
        long g = aVar.mo7274g();
        int id = aVar.mo8948D().getId();
        Long i2 = m10631i(id);
        if (!(i2 == null || i2.longValue() == g)) {
            m10628c(i2.longValue());
            this.f7826g.mo3290e(i2.longValue());
        }
        this.f7826g.mo3284c(g, Integer.valueOf(id));
        m10630h(i);
        FrameLayout D = aVar.mo8948D();
        if (C0962e0.m5515h0(D)) {
            if (D.getParent() == null) {
                D.addOnLayoutChangeListener(new C2040a(D, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo8938f();
    }

    /* renamed from: h */
    private void m10629h() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final C2042c cVar = new C2042c();
        this.f7822c.mo6472a(new C1457g() {
            /* renamed from: a */
            public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                if (aVar == C1441a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    iVar.getLifecycle().mo6473b(this);
                }
            }
        });
        handler.postDelayed(cVar, f7821m);
    }

    @C0193h0
    /* renamed from: b */
    public final C2044a m10643b(@C0193h0 ViewGroup viewGroup, int i) {
        return C2044a.m10671a(viewGroup);
    }

    /* renamed from: b */
    private boolean m10627b(long j) {
        if (this.f7826g.mo3274a(j)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f7824e.mo3283c(j);
        boolean z = false;
        if (fragment == null) {
            return false;
        }
        View view = fragment.getView();
        if (view == null) {
            return false;
        }
        if (view.getParent() != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public final void mo7329b(@C0193h0 C2044a aVar) {
        mo8937d(aVar);
        mo8938f();
    }

    /* renamed from: b */
    private static long m10626b(@C0193h0 String str, @C0193h0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: a */
    private void m10624a(Fragment fragment, @C0193h0 FrameLayout frameLayout) {
        this.f7823d.mo6229a((C1384b) new C2041b(fragment, frameLayout), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8931a(@C0193h0 View view, @C0193h0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: a */
    public boolean mo8933a(long j) {
        return j >= 0 && j < ((long) mo7325b());
    }

    /* renamed from: a */
    public final void mo7323a(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    @C0193h0
    /* renamed from: a */
    public final Parcelable mo8929a() {
        Bundle bundle = new Bundle(this.f7824e.mo3287d() + this.f7825f.mo3287d());
        for (int i = 0; i < this.f7824e.mo3287d(); i++) {
            long a = this.f7824e.mo3270a(i);
            Fragment fragment = (Fragment) this.f7824e.mo3283c(a);
            if (fragment != null && fragment.isAdded()) {
                this.f7823d.mo6226a(bundle, m10623a(f7819k, a), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f7825f.mo3287d(); i2++) {
            long a2 = this.f7825f.mo3270a(i2);
            if (mo8933a(a2)) {
                bundle.putParcelable(m10623a(f7820l, a2), (Parcelable) this.f7825f.mo3283c(a2));
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo8930a(@C0193h0 Parcelable parcelable) {
        if (!this.f7825f.mo3285c() || !this.f7824e.mo3285c()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(FragmentStateAdapter.class.getClassLoader());
        }
        for (String str : bundle.keySet()) {
            String str2 = f7819k;
            if (m10625a(str, str2)) {
                this.f7824e.mo3284c(m10626b(str, str2), this.f7823d.mo6222a(bundle, str));
            } else {
                String str3 = f7820l;
                if (m10625a(str, str3)) {
                    long b = m10626b(str, str3);
                    SavedState savedState = (SavedState) bundle.getParcelable(str);
                    if (mo8933a(b)) {
                        this.f7825f.mo3284c(b, savedState);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected key in savedState: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        if (!this.f7824e.mo3285c()) {
            this.f7829j = true;
            this.f7828i = true;
            mo8938f();
            m10629h();
        }
    }

    @C0193h0
    /* renamed from: a */
    private static String m10623a(@C0193h0 String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m10625a(@C0193h0 String str, @C0193h0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }
}
