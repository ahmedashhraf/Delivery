package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.Lifecycle.State;
import androidx.viewpager.widget.C2024a;

/* renamed from: androidx.fragment.app.l */
/* compiled from: FragmentPagerAdapter */
public abstract class C1404l extends C2024a {

    /* renamed from: i */
    private static final String f5516i = "FragmentPagerAdapter";

    /* renamed from: j */
    private static final boolean f5517j = false;
    @Deprecated

    /* renamed from: k */
    public static final int f5518k = 0;

    /* renamed from: l */
    public static final int f5519l = 1;

    /* renamed from: e */
    private final C1382h f5520e;

    /* renamed from: f */
    private final int f5521f;

    /* renamed from: g */
    private C1406n f5522g;

    /* renamed from: h */
    private Fragment f5523h;

    @Deprecated
    public C1404l(@C0193h0 C1382h hVar) {
        this(hVar, 0);
    }

    @C0193h0
    /* renamed from: a */
    public Object mo6380a(@C0193h0 ViewGroup viewGroup, int i) {
        if (this.f5522g == null) {
            this.f5522g = this.f5520e.mo6224a();
        }
        long d = mo6389d(i);
        Fragment a = this.f5520e.mo6223a(m7489a(viewGroup.getId(), d));
        if (a != null) {
            this.f5522g.mo6397a(a);
        } else {
            a = mo6388c(i);
            this.f5522g.mo6395a(viewGroup.getId(), a, m7489a(viewGroup.getId(), d));
        }
        if (a != this.f5523h) {
            a.setMenuVisibility(false);
            if (this.f5521f == 1) {
                this.f5522g.mo6080a(a, State.STARTED);
            } else {
                a.setUserVisibleHint(false);
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo6381a(@C0195i0 Parcelable parcelable, @C0195i0 ClassLoader classLoader) {
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
        return null;
    }

    @C0193h0
    /* renamed from: c */
    public abstract Fragment mo6388c(int i);

    /* renamed from: d */
    public long mo6389d(int i) {
        return (long) i;
    }

    public C1404l(@C0193h0 C1382h hVar, int i) {
        this.f5522g = null;
        this.f5523h = null;
        this.f5520e = hVar;
        this.f5521f = i;
    }

    /* renamed from: b */
    public void mo6386b(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f5523h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f5521f == 1) {
                    if (this.f5522g == null) {
                        this.f5522g = this.f5520e.mo6224a();
                    }
                    this.f5522g.mo6080a(this.f5523h, State.STARTED);
                } else {
                    this.f5523h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f5521f == 1) {
                if (this.f5522g == null) {
                    this.f5522g = this.f5520e.mo6224a();
                }
                this.f5522g.mo6080a(fragment, State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f5523h = fragment;
        }
    }

    /* renamed from: a */
    public void mo6383a(@C0193h0 ViewGroup viewGroup, int i, @C0193h0 Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f5522g == null) {
            this.f5522g = this.f5520e.mo6224a();
        }
        this.f5522g.mo6090b(fragment);
        if (fragment == this.f5523h) {
            this.f5523h = null;
        }
    }

    /* renamed from: a */
    public void mo6382a(@C0193h0 ViewGroup viewGroup) {
        C1406n nVar = this.f5522g;
        if (nVar != null) {
            nVar.mo6106h();
            this.f5522g = null;
        }
    }

    /* renamed from: a */
    public boolean mo6384a(@C0193h0 View view, @C0193h0 Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    /* renamed from: a */
    private static String m7489a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
