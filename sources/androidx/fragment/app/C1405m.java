package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment.SavedState;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.C2024a;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.m */
/* compiled from: FragmentStatePagerAdapter */
public abstract class C1405m extends C2024a {

    /* renamed from: k */
    private static final String f5524k = "FragmentStatePagerAdapt";

    /* renamed from: l */
    private static final boolean f5525l = false;
    @Deprecated

    /* renamed from: m */
    public static final int f5526m = 0;

    /* renamed from: n */
    public static final int f5527n = 1;

    /* renamed from: e */
    private final C1382h f5528e;

    /* renamed from: f */
    private final int f5529f;

    /* renamed from: g */
    private C1406n f5530g;

    /* renamed from: h */
    private ArrayList<SavedState> f5531h;

    /* renamed from: i */
    private ArrayList<Fragment> f5532i;

    /* renamed from: j */
    private Fragment f5533j;

    @Deprecated
    public C1405m(@C0193h0 C1382h hVar) {
        this(hVar, 0);
    }

    @C0193h0
    /* renamed from: a */
    public Object mo6380a(@C0193h0 ViewGroup viewGroup, int i) {
        if (this.f5532i.size() > i) {
            Fragment fragment = (Fragment) this.f5532i.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f5530g == null) {
            this.f5530g = this.f5528e.mo6224a();
        }
        Fragment c = mo6390c(i);
        if (this.f5531h.size() > i) {
            SavedState savedState = (SavedState) this.f5531h.get(i);
            if (savedState != null) {
                c.setInitialSavedState(savedState);
            }
        }
        while (this.f5532i.size() <= i) {
            this.f5532i.add(null);
        }
        c.setMenuVisibility(false);
        if (this.f5529f == 0) {
            c.setUserVisibleHint(false);
        }
        this.f5532i.set(i, c);
        this.f5530g.mo6394a(viewGroup.getId(), c);
        if (this.f5529f == 1) {
            this.f5530g.mo6080a(c, State.STARTED);
        }
        return c;
    }

    /* renamed from: b */
    public void mo6385b(@C0193h0 ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    @C0195i0
    /* renamed from: c */
    public Parcelable mo6387c() {
        Bundle bundle;
        if (this.f5531h.size() > 0) {
            bundle = new Bundle();
            SavedState[] savedStateArr = new SavedState[this.f5531h.size()];
            this.f5531h.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f5532i.size(); i++) {
            Fragment fragment = (Fragment) this.f5532i.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("f");
                sb.append(i);
                this.f5528e.mo6226a(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    @C0193h0
    /* renamed from: c */
    public abstract Fragment mo6390c(int i);

    public C1405m(@C0193h0 C1382h hVar, int i) {
        this.f5530g = null;
        this.f5531h = new ArrayList<>();
        this.f5532i = new ArrayList<>();
        this.f5533j = null;
        this.f5528e = hVar;
        this.f5529f = i;
    }

    /* renamed from: b */
    public void mo6386b(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f5533j;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f5529f == 1) {
                    if (this.f5530g == null) {
                        this.f5530g = this.f5528e.mo6224a();
                    }
                    this.f5530g.mo6080a(this.f5533j, State.STARTED);
                } else {
                    this.f5533j.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f5529f == 1) {
                if (this.f5530g == null) {
                    this.f5530g = this.f5528e.mo6224a();
                }
                this.f5530g.mo6080a(fragment, State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f5533j = fragment;
        }
    }

    /* renamed from: a */
    public void mo6383a(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f5530g == null) {
            this.f5530g = this.f5528e.mo6224a();
        }
        while (this.f5531h.size() <= i) {
            this.f5531h.add(null);
        }
        this.f5531h.set(i, fragment.isAdded() ? this.f5528e.mo6220a(fragment) : null);
        this.f5532i.set(i, null);
        this.f5530g.mo6094d(fragment);
        if (fragment == this.f5533j) {
            this.f5533j = null;
        }
    }

    /* renamed from: a */
    public void mo6382a(@C0193h0 ViewGroup viewGroup) {
        C1406n nVar = this.f5530g;
        if (nVar != null) {
            nVar.mo6106h();
            this.f5530g = null;
        }
    }

    /* renamed from: a */
    public boolean mo6384a(@C0193h0 View view, @C0193h0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: a */
    public void mo6381a(@C0195i0 Parcelable parcelable, @C0195i0 ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f5531h.clear();
            this.f5532i.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f5531h.add((SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.f5528e.mo6222a(bundle, str);
                    if (a != null) {
                        while (this.f5532i.size() <= parseInt) {
                            this.f5532i.add(null);
                        }
                        a.setMenuVisibility(false);
                        this.f5532i.set(parseInt, a);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Bad fragment at key ");
                        sb.append(str);
                        sb.toString();
                    }
                }
            }
        }
    }
}
