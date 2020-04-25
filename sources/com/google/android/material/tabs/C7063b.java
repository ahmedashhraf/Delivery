package com.google.android.material.tabs;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1640i;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C2056j;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.b */
/* compiled from: TabLayoutMediator */
public final class C7063b {
    @C0193h0

    /* renamed from: a */
    private final TabLayout f19963a;
    @C0193h0

    /* renamed from: b */
    private final ViewPager2 f19964b;

    /* renamed from: c */
    private final boolean f19965c;

    /* renamed from: d */
    private final C7065b f19966d;
    @C0195i0

    /* renamed from: e */
    private C1638g<?> f19967e;

    /* renamed from: f */
    private boolean f19968f;
    @C0195i0

    /* renamed from: g */
    private C7066c f19969g;
    @C0195i0

    /* renamed from: h */
    private C7051h f19970h;
    @C0195i0

    /* renamed from: i */
    private C1640i f19971i;

    /* renamed from: com.google.android.material.tabs.b$a */
    /* compiled from: TabLayoutMediator */
    private class C7064a extends C1640i {
        C7064a() {
        }

        /* renamed from: a */
        public void mo7351a() {
            C7063b.this.mo28226c();
        }

        /* renamed from: b */
        public void mo7355b(int i, int i2) {
            C7063b.this.mo28226c();
        }

        /* renamed from: c */
        public void mo7356c(int i, int i2) {
            C7063b.this.mo28226c();
        }

        /* renamed from: a */
        public void mo7352a(int i, int i2) {
            C7063b.this.mo28226c();
        }

        /* renamed from: a */
        public void mo7354a(int i, int i2, @C0195i0 Object obj) {
            C7063b.this.mo28226c();
        }

        /* renamed from: a */
        public void mo7353a(int i, int i2, int i3) {
            C7063b.this.mo28226c();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b */
    /* compiled from: TabLayoutMediator */
    public interface C7065b {
        /* renamed from: a */
        void mo28227a(@C0193h0 C7056k kVar, int i);
    }

    /* renamed from: com.google.android.material.tabs.b$c */
    /* compiled from: TabLayoutMediator */
    private static class C7066c extends C2056j {
        @C0193h0

        /* renamed from: a */
        private final WeakReference<TabLayout> f19973a;

        /* renamed from: b */
        private int f19974b;

        /* renamed from: c */
        private int f19975c;

        C7066c(TabLayout tabLayout) {
            this.f19973a = new WeakReference<>(tabLayout);
            mo28228a();
        }

        /* renamed from: a */
        public void mo8944a(int i) {
            this.f19974b = this.f19975c;
            this.f19975c = i;
        }

        /* renamed from: b */
        public void mo8945b(int i) {
            TabLayout tabLayout = (TabLayout) this.f19973a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f19975c;
                tabLayout.mo28118b(tabLayout.mo28096a(i), i2 == 0 || (i2 == 2 && this.f19974b == 0));
            }
        }

        /* renamed from: a */
        public void mo9016a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f19973a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f19975c != 2 || this.f19974b == 1;
                if (!(this.f19975c == 2 && this.f19974b == 0)) {
                    z = true;
                }
                tabLayout.mo28099a(i, f, z2, z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo28228a() {
            this.f19975c = 0;
            this.f19974b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.b$d */
    /* compiled from: TabLayoutMediator */
    private static class C7067d implements C7051h {

        /* renamed from: a */
        private final ViewPager2 f19976a;

        C7067d(ViewPager2 viewPager2) {
            this.f19976a = viewPager2;
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
        }

        /* renamed from: b */
        public void mo12006b(@C0193h0 C7056k kVar) {
            this.f19976a.mo8950a(kVar.mo28203f(), true);
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    public C7063b(@C0193h0 TabLayout tabLayout, @C0193h0 ViewPager2 viewPager2, @C0193h0 C7065b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* renamed from: a */
    public void mo28224a() {
        if (!this.f19968f) {
            this.f19967e = this.f19964b.getAdapter();
            if (this.f19967e != null) {
                this.f19968f = true;
                this.f19969g = new C7066c(this.f19963a);
                this.f19964b.mo8953a((C2056j) this.f19969g);
                this.f19970h = new C7067d(this.f19964b);
                this.f19963a.mo28104a(this.f19970h);
                if (this.f19965c) {
                    this.f19971i = new C7064a();
                    this.f19967e.mo7321a(this.f19971i);
                }
                mo28226c();
                this.f19963a.mo28098a(this.f19964b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    public void mo28225b() {
        C1638g<?> gVar = this.f19967e;
        if (gVar != null) {
            gVar.mo7331b(this.f19971i);
        }
        this.f19963a.mo28117b(this.f19970h);
        this.f19964b.mo8959b((C2056j) this.f19969g);
        this.f19971i = null;
        this.f19970h = null;
        this.f19969g = null;
        this.f19967e = null;
        this.f19968f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo28226c() {
        this.f19963a.mo28139h();
        C1638g<?> gVar = this.f19967e;
        if (gVar != null) {
            int b = gVar.mo7325b();
            for (int i = 0; i < b; i++) {
                C7056k f = this.f19963a.mo28126f();
                this.f19966d.mo28227a(f, i);
                this.f19963a.mo28108a(f, false);
            }
            if (b > 0) {
                int min = Math.min(this.f19964b.getCurrentItem(), this.f19963a.getTabCount() - 1);
                if (min != this.f19963a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f19963a;
                    tabLayout.mo28123d(tabLayout.mo28096a(min));
                }
            }
        }
    }

    public C7063b(@C0193h0 TabLayout tabLayout, @C0193h0 ViewPager2 viewPager2, boolean z, @C0193h0 C7065b bVar) {
        this.f19963a = tabLayout;
        this.f19964b = viewPager2;
        this.f19965c = z;
        this.f19966d = bVar;
    }
}
