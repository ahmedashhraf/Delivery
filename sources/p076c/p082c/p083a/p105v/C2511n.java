package p076c.p082c.p083a.p105v;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p076c.p082c.p083a.C2245q;

/* renamed from: c.c.a.v.n */
/* compiled from: SupportRequestManagerFragment */
public class C2511n extends Fragment {

    /* renamed from: N */
    private final C2509l f9541N;

    /* renamed from: O */
    private final HashSet<C2511n> f9542O;

    /* renamed from: P */
    private C2511n f9543P;

    /* renamed from: a */
    private C2245q f9544a;

    /* renamed from: b */
    private final C2494a f9545b;

    /* renamed from: c.c.a.v.n$b */
    /* compiled from: SupportRequestManagerFragment */
    private class C2513b implements C2509l {
        private C2513b() {
        }

        /* renamed from: a */
        public Set<C2245q> mo9936a() {
            Set<C2511n> w = C2511n.this.mo9968w();
            HashSet hashSet = new HashSet(w.size());
            for (C2511n nVar : w) {
                if (nVar.mo9969x() != null) {
                    hashSet.add(nVar.mo9969x());
                }
            }
            return hashSet;
        }
    }

    public C2511n() {
        this(new C2494a());
    }

    /* renamed from: b */
    private void m12483b(C2511n nVar) {
        this.f9542O.remove(nVar);
    }

    /* renamed from: a */
    public void mo9967a(C2245q qVar) {
        this.f9544a = qVar;
    }

    /* access modifiers changed from: 0000 */
    public C2494a getLifecycle() {
        return this.f9545b;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f9543P = C2508k.m12460a().mo9957a(getActivity().getSupportFragmentManager());
        C2511n nVar = this.f9543P;
        if (nVar != this) {
            nVar.m12481a(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f9545b.mo9930a();
    }

    public void onDetach() {
        super.onDetach();
        C2511n nVar = this.f9543P;
        if (nVar != null) {
            nVar.m12483b(this);
            this.f9543P = null;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        C2245q qVar = this.f9544a;
        if (qVar != null) {
            qVar.mo9534j();
        }
    }

    public void onStart() {
        super.onStart();
        this.f9545b.mo9932b();
    }

    public void onStop() {
        super.onStop();
        this.f9545b.mo9933c();
    }

    /* renamed from: w */
    public Set<C2511n> mo9968w() {
        C2511n nVar = this.f9543P;
        if (nVar == null) {
            return Collections.emptySet();
        }
        if (nVar == this) {
            return Collections.unmodifiableSet(this.f9542O);
        }
        HashSet hashSet = new HashSet();
        for (C2511n nVar2 : this.f9543P.mo9968w()) {
            if (m12482a(nVar2.getParentFragment())) {
                hashSet.add(nVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: x */
    public C2245q mo9969x() {
        return this.f9544a;
    }

    /* renamed from: y */
    public C2509l mo9970y() {
        return this.f9541N;
    }

    @SuppressLint({"ValidFragment"})
    public C2511n(C2494a aVar) {
        this.f9541N = new C2513b();
        this.f9542O = new HashSet<>();
        this.f9545b = aVar;
    }

    /* renamed from: a */
    private void m12481a(C2511n nVar) {
        this.f9542O.add(nVar);
    }

    /* renamed from: a */
    private boolean m12482a(Fragment fragment) {
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
