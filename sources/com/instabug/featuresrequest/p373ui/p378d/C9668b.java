package com.instabug.featuresrequest.p373ui.p378d;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import androidx.annotation.C0193h0;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.p368a.C9533b;
import com.instabug.featuresrequest.p368a.C9534c;
import com.instabug.featuresrequest.p369b.C9535a;
import com.instabug.featuresrequest.p370c.C9546h;
import com.instabug.featuresrequest.p373ui.custom.C9659f;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9660a;
import com.instabug.featuresrequest.p373ui.custom.C9659f.C9661b;
import com.instabug.featuresrequest.p373ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.p373ui.p375b.C9612b;
import com.instabug.featuresrequest.p373ui.p375b.C9613c;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9601c.C9603b;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9604d;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9606e;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9610f;
import com.instabug.featuresrequest.p373ui.p378d.C9662a.C9666d;
import com.instabug.featuresrequest.p373ui.p379e.C9681b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.util.PlaceHolderUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.d.b */
/* compiled from: FeaturesMainFragment */
public class C9668b extends DynamicToolbarFragment<C9676c> implements OnClickListener, C9534c, C9664b {

    /* renamed from: W */
    private static transient /* synthetic */ boolean[] f25611W;

    /* renamed from: N */
    private LinearLayout f25612N;

    /* renamed from: O */
    private ViewPager f25613O;

    /* renamed from: P */
    private LinearLayout f25614P;

    /* renamed from: Q */
    private Button f25615Q;

    /* renamed from: R */
    protected Boolean f25616R = Boolean.valueOf(false);

    /* renamed from: S */
    private int f25617S = 1;

    /* renamed from: T */
    private ArrayList<C9533b> f25618T;

    /* renamed from: U */
    private C9666d f25619U;

    /* renamed from: V */
    private C9674f f25620V;

    /* renamed from: a */
    TabLayout f25621a;

    /* renamed from: b */
    private C9677d f25622b;

    /* renamed from: com.instabug.featuresrequest.ui.d.b$a */
    /* compiled from: FeaturesMainFragment */
    class C9669a implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25623b;

        /* renamed from: a */
        final /* synthetic */ C9668b f25624a;

        C9669a(C9668b bVar) {
            boolean[] a = m45187a();
            this.f25624a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45187a() {
            boolean[] zArr = f25623b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3491044451583942547L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainFragment$1", 2);
            f25623b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m45187a();
            ((C9676c) C9668b.m45172a(this.f25624a)).mo34556c();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.b$b */
    /* compiled from: FeaturesMainFragment */
    class C9670b implements C9660a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25625b;

        /* renamed from: a */
        final /* synthetic */ C9668b f25626a;

        C9670b(C9668b bVar) {
            boolean[] a = m45189a();
            this.f25626a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45189a() {
            boolean[] zArr = f25625b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4013148297337637075L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainFragment$2", 2);
            f25625b = a;
            return a;
        }

        /* renamed from: d */
        public void mo34351d() {
            boolean[] a = m45189a();
            ((C9676c) C9668b.m45173b(this.f25626a)).mo34557d();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.b$c */
    /* compiled from: FeaturesMainFragment */
    class C9671c implements C7051h {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25627b;

        /* renamed from: a */
        final /* synthetic */ C9668b f25628a;

        C9671c(C9668b bVar) {
            boolean[] a = m45191a();
            this.f25628a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45191a() {
            boolean[] zArr = f25627b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1816959783445799273L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainFragment$3", 4);
            f25627b = a;
            return a;
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            m45191a()[3] = true;
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            boolean[] a = m45191a();
            C9668b.m45174c(this.f25628a).setCurrentItem(kVar.mo28203f());
            a[1] = true;
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
            m45191a()[2] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.b$d */
    /* compiled from: FeaturesMainFragment */
    class C9672d implements OnMenuItemClickListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25629b;

        /* renamed from: a */
        final /* synthetic */ C9668b f25630a;

        C9672d(C9668b bVar) {
            boolean[] a = m45195a();
            this.f25630a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45195a() {
            boolean[] zArr = f25629b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7178407168517769494L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainFragment$4", 15);
            f25629b = a;
            return a;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            boolean[] a = m45195a();
            menuItem.setChecked(true);
            a[1] = true;
            int itemId = menuItem.getItemId();
            if (itemId == C9525R.C9529id.sortBy_topRated) {
                a[2] = true;
                C9668b.m45175d(this.f25630a).setText(C9546h.m44647a(this.f25630a.getString(C9525R.string.sort_by_top_rated)));
                a[3] = true;
                this.f25630a.f25616R = Boolean.valueOf(true);
                a[4] = true;
                C9668b.m45171a(this.f25630a, 0);
                a[5] = true;
                C9535a.m44610a(C9668b.m45176e(this.f25630a));
                a[6] = true;
                C9668b bVar = this.f25630a;
                bVar.mo34552a(bVar.f25616R.booleanValue());
                a[7] = true;
                return true;
            } else if (itemId == C9525R.C9529id.sortBy_recentlyUpdated) {
                a[8] = true;
                C9668b.m45175d(this.f25630a).setText(C9546h.m44647a(this.f25630a.getString(C9525R.string.sort_by_recently_updated)));
                a[9] = true;
                this.f25630a.f25616R = Boolean.valueOf(false);
                a[10] = true;
                C9668b.m45171a(this.f25630a, 1);
                a[11] = true;
                C9535a.m44610a(C9668b.m45176e(this.f25630a));
                a[12] = true;
                C9668b bVar2 = this.f25630a;
                bVar2.mo34552a(bVar2.f25616R.booleanValue());
                a[13] = true;
                return true;
            } else {
                a[14] = true;
                return false;
            }
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.b$e */
    /* compiled from: MainMyFeaturesDao */
    public class C9673e extends C9612b {

        /* renamed from: d */
        private static volatile C9673e f25631d;

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f25632e;

        /* renamed from: c */
        private List<C9567a> f25633c;

        private C9673e() {
            boolean[] f = m45197f();
            if (f25631d == null) {
                this.f25633c = new ArrayList();
                f[2] = true;
                return;
            }
            f[0] = true;
            RuntimeException runtimeException = new RuntimeException("Use getInstance() method to get the single instance of this class");
            f[1] = true;
            throw runtimeException;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: e */
        public static C9673e m45196e() {
            boolean[] f = m45197f();
            if (f25631d != null) {
                f[3] = true;
            } else {
                synchronized (C9673e.class) {
                    try {
                        f[4] = true;
                        if (f25631d != null) {
                            f[5] = true;
                        } else {
                            f[6] = true;
                            f25631d = new C9673e();
                            f[7] = true;
                        }
                    } catch (Throwable th) {
                        while (true) {
                            f[9] = true;
                            throw th;
                        }
                    }
                }
                f[8] = true;
            }
            C9673e eVar = f25631d;
            f[10] = true;
            return eVar;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m45197f() {
            boolean[] zArr = f25632e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1303533078410524808L, "com/instabug/featuresrequest/ui/featuresmain/mainmyfeatures/MainMyFeaturesDao", 18);
            f25632e = a;
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9567a mo34420a(int i) {
            C9567a aVar = (C9567a) this.f25633c.get(i);
            m45197f()[14] = true;
            return aVar;
        }

        /* renamed from: b */
        public List<C9567a> mo34423b() {
            boolean[] f = m45197f();
            List<C9567a> list = this.f25633c;
            f[11] = true;
            return list;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo34424c() {
            boolean[] f = m45197f();
            int size = this.f25633c.size();
            f[13] = true;
            return size;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo34425d() {
            boolean[] f = m45197f();
            this.f25633c.clear();
            f[17] = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo34422a(List<C9567a> list) {
            boolean[] f = m45197f();
            this.f25633c.addAll(list);
            f[15] = true;
        }
    }

    @SuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
    /* renamed from: com.instabug.featuresrequest.ui.d.b$f */
    /* compiled from: MainMyFeaturesFragment */
    public class C9674f extends C9604d {

        /* renamed from: Y */
        private static transient /* synthetic */ boolean[] f25634Y;

        public C9674f() {
            m45204x()[0] = true;
        }

        /* renamed from: c */
        public static C9674f m45203c(boolean z) {
            boolean[] x = m45204x();
            Bundle bundle = new Bundle();
            x[1] = true;
            bundle.putBoolean("sort_by_top_voted", z);
            x[2] = true;
            bundle.putBoolean("my_posts", true);
            x[3] = true;
            C9674f fVar = new C9674f();
            x[4] = true;
            fVar.setArguments(bundle);
            x[5] = true;
            return fVar;
        }

        /* renamed from: x */
        private static /* synthetic */ boolean[] m45204x() {
            boolean[] zArr = f25634Y;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6151858717412941152L, "com/instabug/featuresrequest/ui/featuresmain/mainmyfeatures/MainMyFeaturesFragment", 8);
            f25634Y = a;
            return a;
        }

        @C0193h0
        /* renamed from: w */
        public C9606e mo34397w() {
            boolean[] x = m45204x();
            x[6] = true;
            C9675g gVar = new C9675g(this, new C9613c(C9673e.m45196e()));
            x[7] = true;
            return gVar;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.d.b$g */
    /* compiled from: MainMyFeaturesPresenter */
    public class C9675g extends C9610f {

        /* renamed from: e */
        private static transient /* synthetic */ boolean[] f25635e;

        public C9675g(C9603b bVar, C9613c cVar) {
            boolean[] l = m45206l();
            super(bVar, cVar, true);
            l[0] = true;
        }

        /* renamed from: l */
        private static /* synthetic */ boolean[] m45206l() {
            boolean[] zArr = f25635e;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6335039629878553359L, "com/instabug/featuresrequest/ui/featuresmain/mainmyfeatures/MainMyFeaturesPresenter", 1);
            f25635e = a;
            return a;
        }
    }

    public C9668b() {
        boolean[] i = m45180i();
        i[0] = true;
        i[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ int m45171a(C9668b bVar, int i) {
        boolean[] i2 = m45180i();
        bVar.f25617S = i;
        i2[99] = true;
        return i;
    }

    /* renamed from: b */
    static /* synthetic */ Presenter m45173b(C9668b bVar) {
        boolean[] i = m45180i();
        P p = bVar.presenter;
        i[96] = true;
        return p;
    }

    /* renamed from: c */
    static /* synthetic */ ViewPager m45174c(C9668b bVar) {
        boolean[] i = m45180i();
        ViewPager viewPager = bVar.f25613O;
        i[97] = true;
        return viewPager;
    }

    /* renamed from: d */
    static /* synthetic */ Button m45175d(C9668b bVar) {
        boolean[] i = m45180i();
        Button button = bVar.f25615Q;
        i[98] = true;
        return button;
    }

    /* renamed from: e */
    static /* synthetic */ int m45176e(C9668b bVar) {
        boolean[] i = m45180i();
        int i2 = bVar.f25617S;
        i[100] = true;
        return i2;
    }

    /* renamed from: f */
    private void m45177f() {
        boolean[] i = m45180i();
        this.f25614P = (LinearLayout) findViewById(C9525R.C9529id.sortingActionsLayoutRoot);
        i[21] = true;
        this.f25615Q = (Button) findViewById(C9525R.C9529id.btnSortActions);
        LinearLayout linearLayout = this.f25614P;
        if (linearLayout == null) {
            i[22] = true;
        } else {
            i[23] = true;
            linearLayout.setOnClickListener(this);
            i[24] = true;
        }
        if (this.f25616R.booleanValue()) {
            Button button = this.f25615Q;
            int i2 = C9525R.string.sort_by_top_rated;
            i[25] = true;
            String a = C9546h.m44647a(getString(i2));
            i[26] = true;
            button.setText(a);
            i[27] = true;
        } else {
            Button button2 = this.f25615Q;
            int i3 = C9525R.string.sort_by_recently_updated;
            i[28] = true;
            String a2 = C9546h.m44647a(getString(i3));
            i[29] = true;
            button2.setText(a2);
            i[30] = true;
        }
        i[31] = true;
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.material.tabs.TabLayout$e, com.instabug.featuresrequest.ui.d.b$c] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v9, types: [com.google.android.material.tabs.TabLayout$e, com.instabug.featuresrequest.ui.d.b$c]
      assigns: [com.instabug.featuresrequest.ui.d.b$c]
      uses: [com.google.android.material.tabs.TabLayout$e]
      mth insns count: 55
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45178g() {
        /*
            r5 = this;
            boolean[] r0 = m45180i()
            int r1 = com.instabug.featuresrequest.C9525R.C9529id.tab_layout
            android.view.View r1 = r5.findViewById(r1)
            com.google.android.material.tabs.TabLayout r1 = (com.google.android.material.tabs.TabLayout) r1
            r5.f25621a = r1
            r1 = 1
            r2 = 32
            r0[r2] = r1
            com.google.android.material.tabs.TabLayout r2 = r5.f25621a
            com.google.android.material.tabs.TabLayout$k r3 = r2.mo28126f()
            int r4 = com.instabug.featuresrequest.C9525R.string.features_rq_main_fragment_tab1
            java.lang.String r4 = r5.getString(r4)
            com.google.android.material.tabs.TabLayout$k r3 = r3.mo28195b(r4)
            r2.mo28105a(r3)
            r2 = 33
            r0[r2] = r1
            com.google.android.material.tabs.TabLayout r2 = r5.f25621a
            com.google.android.material.tabs.TabLayout$k r3 = r2.mo28126f()
            int r4 = com.instabug.featuresrequest.C9525R.string.features_rq_main_fragment_tab2
            java.lang.String r4 = r5.getString(r4)
            com.google.android.material.tabs.TabLayout$k r3 = r3.mo28195b(r4)
            r2.mo28105a(r3)
            r2 = 34
            r0[r2] = r1
            com.google.android.material.tabs.TabLayout r2 = r5.f25621a
            int r3 = com.instabug.library.Instabug.getPrimaryColor()
            r2.setBackgroundColor(r3)
            r2 = 35
            r0[r2] = r1
            com.google.android.material.tabs.TabLayout r2 = r5.f25621a
            r3 = 0
            r2.setTabMode(r3)
            r2 = 36
            r0[r2] = r1
            int r2 = com.instabug.featuresrequest.C9525R.C9529id.tabsContainer
            android.view.View r2 = r5.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5.f25612N = r2
            r2 = 37
            r0[r2] = r1
            android.widget.LinearLayout r2 = r5.f25612N
            int r3 = com.instabug.library.Instabug.getPrimaryColor()
            r2.setBackgroundColor(r3)
            r2 = 38
            r0[r2] = r1
            int r2 = com.instabug.featuresrequest.C9525R.C9529id.pager
            android.view.View r2 = r5.findViewById(r2)
            androidx.viewpager.widget.ViewPager r2 = (androidx.viewpager.widget.ViewPager) r2
            r5.f25613O = r2
            r2 = 39
            r0[r2] = r1
            androidx.viewpager.widget.ViewPager r2 = r5.f25613O
            com.instabug.featuresrequest.ui.d.d r3 = r5.f25622b
            r2.setAdapter(r3)
            r2 = 40
            r0[r2] = r1
            androidx.viewpager.widget.ViewPager r2 = r5.f25613O
            com.google.android.material.tabs.TabLayout$n r3 = new com.google.android.material.tabs.TabLayout$n
            com.google.android.material.tabs.TabLayout r4 = r5.f25621a
            r3.<init>(r4)
            r2.addOnPageChangeListener(r3)
            r2 = 41
            r0[r2] = r1
            com.google.android.material.tabs.TabLayout r2 = r5.f25621a
            com.instabug.featuresrequest.ui.d.b$c r3 = new com.instabug.featuresrequest.ui.d.b$c
            r3.<init>(r5)
            r2.mo28103a(r3)
            r2 = 42
            r0[r2] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.p378d.C9668b.m45178g():void");
    }

    /* renamed from: h */
    private void m45179h() {
        boolean[] i = m45180i();
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i[43] = true;
            this.f25612N.setBackgroundColor(Instabug.getPrimaryColor());
            i[44] = true;
            this.f25621a.setBackgroundColor(Instabug.getPrimaryColor());
            i[45] = true;
        } else {
            this.f25612N.setBackgroundColor(getResources().getColor(C9525R.C9527color.ib_fr_toolbar_dark_color));
            i[46] = true;
            this.f25621a.setBackgroundColor(getResources().getColor(C9525R.C9527color.ib_fr_toolbar_dark_color));
            i[47] = true;
        }
        i[48] = true;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m45180i() {
        boolean[] zArr = f25611W;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7329754739230437019L, "com/instabug/featuresrequest/ui/featuresmain/FeaturesMainFragment", 101);
        f25611W = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void addToolbarActionButtons() {
        boolean[] i = m45180i();
        this.toolbarActionButtons.add(new C9659f(C9525R.C9528drawable.ib_fr_ic_add_white_36dp, -1, new C9670b(this), C9661b.ICON));
        i[11] = true;
    }

    /* access modifiers changed from: protected */
    public int getContentLayout() {
        boolean[] i = m45180i();
        int i2 = C9525R.layout.ib_fr_features_main_fragment;
        i[15] = true;
        return i2;
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        boolean[] i = m45180i();
        Key key = Key.FEATURES_REQUEST;
        int i2 = C9525R.string.instabug_str_features_request_header;
        i[12] = true;
        String string = getString(i2);
        i[13] = true;
        String placeHolder = PlaceHolderUtils.getPlaceHolder(key, string);
        i[14] = true;
        return placeHolder;
    }

    /* access modifiers changed from: protected */
    public C9659f getToolbarCloseActionButton() {
        boolean[] i = m45180i();
        C9659f fVar = new C9659f(C9525R.C9528drawable.instabug_ic_close, C9525R.string.close, new C9669a(this), C9661b.ICON);
        i[10] = true;
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void initContentViews(View view, Bundle bundle) {
        boolean[] i = m45180i();
        i[16] = true;
        this.f25622b = new C9677d(getChildFragmentManager(), this);
        i[17] = true;
        m45178g();
        i[18] = true;
        m45177f();
        i[19] = true;
        m45179h();
        i[20] = true;
    }

    public void onClick(View view) {
        boolean[] i = m45180i();
        if (view.getId() != C9525R.C9529id.sortingActionsLayoutRoot) {
            i[49] = true;
        } else {
            i[50] = true;
            mo34551a(view);
            i[51] = true;
        }
        i[52] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean[] i = m45180i();
        super.onCreate(bundle);
        i[2] = true;
        setRetainInstance(true);
        i[3] = true;
        this.presenter = new C9676c(this);
        i[4] = true;
        this.f25618T = new ArrayList<>();
        i[5] = true;
        this.f25617S = C9535a.m44612d();
        i[6] = true;
        if (this.f25617S == 0) {
            i[7] = true;
            z = true;
        } else {
            z = false;
            i[8] = true;
        }
        this.f25616R = Boolean.valueOf(z);
        i[9] = true;
    }

    public void onDestroy() {
        boolean[] i = m45180i();
        super.onDestroy();
        this.f25618T = null;
        i[91] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Presenter m45172a(C9668b bVar) {
        boolean[] i = m45180i();
        P p = bVar.presenter;
        i[95] = true;
        return p;
    }

    /* renamed from: b */
    public Fragment mo34218b(int i) {
        boolean[] i2 = m45180i();
        if (i == 0) {
            if (this.f25619U != null) {
                i2[76] = true;
            } else {
                Boolean bool = this.f25616R;
                i2[77] = true;
                this.f25619U = C9666d.m45167c(bool.booleanValue());
                i2[78] = true;
                this.f25618T.add(this.f25619U);
                i2[79] = true;
            }
            C9666d dVar = this.f25619U;
            i2[80] = true;
            return dVar;
        } else if (i != 1) {
            i2[86] = true;
            return null;
        } else {
            if (this.f25620V != null) {
                i2[81] = true;
            } else {
                Boolean bool2 = this.f25616R;
                i2[82] = true;
                this.f25620V = C9674f.m45203c(bool2.booleanValue());
                i2[83] = true;
                this.f25618T.add(this.f25620V);
                i2[84] = true;
            }
            C9674f fVar = this.f25620V;
            i2[85] = true;
            return fVar;
        }
    }

    /* renamed from: c */
    public void mo34549c() {
        boolean[] i = m45180i();
        finishActivity();
        i[64] = true;
    }

    /* renamed from: d */
    public void mo34550d() {
        boolean[] i = m45180i();
        C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
        i[58] = true;
        C1406n a = supportFragmentManager.mo6224a();
        int i2 = C9525R.C9529id.instabug_fragment_container;
        C9681b bVar = new C9681b();
        i[59] = true;
        C1406n a2 = a.mo6394a(i2, (Fragment) bVar);
        i[60] = true;
        C1406n a3 = a2.mo6401a("search_features");
        i[61] = true;
        a3.mo6097e();
        i[62] = true;
    }

    /* renamed from: e */
    public void mo34553e() {
        boolean[] i = m45180i();
        this.f25613O.setCurrentItem(1);
        i[92] = true;
        ((C9666d) this.f25622b.mo6388c(0)).mo8147a();
        i[93] = true;
        ((C9674f) this.f25622b.mo6388c(1)).mo8147a();
        i[94] = true;
    }

    @TargetApi(11)
    /* renamed from: a */
    public void mo34551a(View view) {
        ContextThemeWrapper contextThemeWrapper;
        PopupMenu popupMenu;
        boolean[] i = m45180i();
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i[65] = true;
            contextThemeWrapper = new ContextThemeWrapper(getContext(), C9525R.style.IbFrPopupMenuOverlapAnchorLight);
            i[66] = true;
        } else {
            i[67] = true;
            contextThemeWrapper = new ContextThemeWrapper(getContext(), C9525R.style.IbFrPopupMenuOverlapAnchorDark);
            i[68] = true;
        }
        if (VERSION.SDK_INT >= 19) {
            i[69] = true;
            popupMenu = new PopupMenu(contextThemeWrapper, view, 5);
            i[70] = true;
        } else {
            popupMenu = new PopupMenu(contextThemeWrapper, view);
            i[71] = true;
        }
        popupMenu.getMenuInflater().inflate(C9525R.C9530menu.ib_fr_sorting_actions_pop_up, popupMenu.getMenu());
        i[72] = true;
        popupMenu.getMenu().getItem(this.f25617S).setChecked(true);
        i[73] = true;
        popupMenu.setOnMenuItemClickListener(new C9672d(this));
        i[74] = true;
        popupMenu.show();
        i[75] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34552a(boolean z) {
        boolean[] i = m45180i();
        Iterator it = this.f25618T.iterator();
        i[87] = true;
        while (it.hasNext()) {
            C9533b bVar = (C9533b) it.next();
            i[88] = true;
            bVar.mo34217a(Boolean.valueOf(z));
            i[89] = true;
        }
        i[90] = true;
    }
}
