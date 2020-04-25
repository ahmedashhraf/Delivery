package androidx.fragment.app;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.C1477t;
import androidx.lifecycle.C1478u;
import androidx.lifecycle.C1478u.C1480b;
import androidx.lifecycle.C1483v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.fragment.app.k */
/* compiled from: FragmentManagerViewModel */
class C1402k extends C1477t {

    /* renamed from: i */
    private static final C1480b f5509i = new C1403a();

    /* renamed from: c */
    private final HashSet<Fragment> f5510c = new HashSet<>();

    /* renamed from: d */
    private final HashMap<String, C1402k> f5511d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1483v> f5512e = new HashMap<>();

    /* renamed from: f */
    private final boolean f5513f;

    /* renamed from: g */
    private boolean f5514g = false;

    /* renamed from: h */
    private boolean f5515h = false;

    /* renamed from: androidx.fragment.app.k$a */
    /* compiled from: FragmentManagerViewModel */
    static class C1403a implements C1480b {
        C1403a() {
        }

        @C0193h0
        /* renamed from: a */
        public <T extends C1477t> T mo6379a(@C0193h0 Class<T> cls) {
            return new C1402k(true);
        }
    }

    C1402k(boolean z) {
        this.f5513f = z;
    }

    @C0193h0
    /* renamed from: a */
    static C1402k m7476a(C1483v vVar) {
        return (C1402k) new C1478u(vVar, f5509i).mo6536a(C1402k.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6367b() {
        if (C1386i.f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            sb.toString();
        }
        this.f5514g = true;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: c */
    public Collection<Fragment> mo6370c() {
        return this.f5510c;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: d */
    public C1483v mo6372d(@C0193h0 Fragment fragment) {
        C1483v vVar = (C1483v) this.f5512e.get(fragment.mWho);
        if (vVar != null) {
            return vVar;
        }
        C1483v vVar2 = new C1483v();
        this.f5512e.put(fragment.mWho, vVar2);
        return vVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo6373e() {
        return this.f5514g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1402k.class != obj.getClass()) {
            return false;
        }
        C1402k kVar = (C1402k) obj;
        if (!this.f5510c.equals(kVar.f5510c) || !this.f5511d.equals(kVar.f5511d) || !this.f5512e.equals(kVar.f5512e)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo6376f(@C0193h0 Fragment fragment) {
        if (!this.f5510c.contains(fragment)) {
            return true;
        }
        if (this.f5513f) {
            return this.f5514g;
        }
        return !this.f5515h;
    }

    public int hashCode() {
        return (((this.f5510c.hashCode() * 31) + this.f5511d.hashCode()) * 31) + this.f5512e.hashCode();
    }

    @C0193h0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f5510c.iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f5511d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f5512e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: c */
    public C1402k mo6369c(@C0193h0 Fragment fragment) {
        C1402k kVar = (C1402k) this.f5511d.get(fragment.mWho);
        if (kVar != null) {
            return kVar;
        }
        C1402k kVar2 = new C1402k(this.f5513f);
        this.f5511d.put(fragment.mWho, kVar2);
        return kVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo6374e(@C0193h0 Fragment fragment) {
        return this.f5510c.remove(fragment);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6366a(@C0193h0 Fragment fragment) {
        return this.f5510c.add(fragment);
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: a */
    public void mo6365a(@C0195i0 C1401j jVar) {
        this.f5510c.clear();
        this.f5511d.clear();
        this.f5512e.clear();
        if (jVar != null) {
            Collection b = jVar.mo6363b();
            if (b != null) {
                this.f5510c.addAll(b);
            }
            Map a = jVar.mo6361a();
            if (a != null) {
                for (Entry entry : a.entrySet()) {
                    C1402k kVar = new C1402k(this.f5513f);
                    kVar.mo6365a((C1401j) entry.getValue());
                    this.f5511d.put(entry.getKey(), kVar);
                }
            }
            Map c = jVar.mo6364c();
            if (c != null) {
                this.f5512e.putAll(c);
            }
        }
        this.f5515h = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6368b(@C0193h0 Fragment fragment) {
        if (C1386i.f5433t0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            sb.toString();
        }
        C1402k kVar = (C1402k) this.f5511d.get(fragment.mWho);
        if (kVar != null) {
            kVar.mo6367b();
            this.f5511d.remove(fragment.mWho);
        }
        C1483v vVar = (C1483v) this.f5512e.get(fragment.mWho);
        if (vVar != null) {
            vVar.mo6540a();
            this.f5512e.remove(fragment.mWho);
        }
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    @C0195i0
    /* renamed from: d */
    public C1401j mo6371d() {
        if (this.f5510c.isEmpty() && this.f5511d.isEmpty() && this.f5512e.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f5511d.entrySet()) {
            C1401j d = ((C1402k) entry.getValue()).mo6371d();
            if (d != null) {
                hashMap.put(entry.getKey(), d);
            }
        }
        this.f5515h = true;
        if (!this.f5510c.isEmpty() || !hashMap.isEmpty() || !this.f5512e.isEmpty()) {
            return new C1401j(new ArrayList(this.f5510c), hashMap, new HashMap(this.f5512e));
        }
        return null;
    }
}
