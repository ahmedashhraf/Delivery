package p076c.p082c.p083a.p105v;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p076c.p082c.p083a.C2245q;

@TargetApi(11)
/* renamed from: c.c.a.v.j */
/* compiled from: RequestManagerFragment */
public class C2505j extends Fragment {

    /* renamed from: N */
    private C2245q f9523N;

    /* renamed from: O */
    private final HashSet<C2505j> f9524O;

    /* renamed from: P */
    private C2505j f9525P;

    /* renamed from: a */
    private final C2494a f9526a;

    /* renamed from: b */
    private final C2509l f9527b;

    /* renamed from: c.c.a.v.j$b */
    /* compiled from: RequestManagerFragment */
    private class C2507b implements C2509l {
        private C2507b() {
        }

        /* renamed from: a */
        public Set<C2245q> mo9936a() {
            Set<C2505j> a = C2505j.this.mo9937a();
            HashSet hashSet = new HashSet(a.size());
            for (C2505j jVar : a) {
                if (jVar.mo9940c() != null) {
                    hashSet.add(jVar.mo9940c());
                }
            }
            return hashSet;
        }
    }

    public C2505j() {
        this(new C2494a());
    }

    /* renamed from: a */
    public void mo9938a(C2245q qVar) {
        this.f9523N = qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C2494a mo9939b() {
        return this.f9526a;
    }

    /* renamed from: c */
    public C2245q mo9940c() {
        return this.f9523N;
    }

    /* renamed from: d */
    public C2509l mo9941d() {
        return this.f9527b;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9525P = C2508k.m12460a().mo9956a(getActivity().getFragmentManager());
        C2505j jVar = this.f9525P;
        if (jVar != this) {
            jVar.m12451a(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f9526a.mo9930a();
    }

    public void onDetach() {
        super.onDetach();
        C2505j jVar = this.f9525P;
        if (jVar != null) {
            jVar.m12453b(this);
            this.f9525P = null;
        }
    }

    public void onLowMemory() {
        C2245q qVar = this.f9523N;
        if (qVar != null) {
            qVar.mo9534j();
        }
    }

    public void onStart() {
        super.onStart();
        this.f9526a.mo9932b();
    }

    public void onStop() {
        super.onStop();
        this.f9526a.mo9933c();
    }

    public void onTrimMemory(int i) {
        C2245q qVar = this.f9523N;
        if (qVar != null) {
            qVar.mo9523a(i);
        }
    }

    @SuppressLint({"ValidFragment"})
    C2505j(C2494a aVar) {
        this.f9527b = new C2507b();
        this.f9524O = new HashSet<>();
        this.f9526a = aVar;
    }

    /* renamed from: a */
    private void m12451a(C2505j jVar) {
        this.f9524O.add(jVar);
    }

    /* renamed from: b */
    private void m12453b(C2505j jVar) {
        this.f9524O.remove(jVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    public Set<C2505j> mo9937a() {
        C2505j jVar = this.f9525P;
        if (jVar == this) {
            return Collections.unmodifiableSet(this.f9524O);
        }
        if (jVar == null || VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C2505j jVar2 : this.f9525P.mo9937a()) {
            if (m12452a(jVar2.getParentFragment())) {
                hashSet.add(jVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @TargetApi(17)
    /* renamed from: a */
    private boolean m12452a(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (fragment.getParentFragment() != null) {
            if (fragment.getParentFragment() == parentFragment) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
        return false;
    }
}
