package p076c.p082c.p083a.p088u.p090i.p091n;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p076c.p082c.p083a.p088u.p090i.p091n.C2340h;

/* renamed from: c.c.a.u.i.n.e */
/* compiled from: GroupedLinkedMap */
class C2332e<K extends C2340h, V> {

    /* renamed from: a */
    private final C2333a<K, V> f9231a = new C2333a<>();

    /* renamed from: b */
    private final Map<K, C2333a<K, V>> f9232b = new HashMap();

    /* renamed from: c.c.a.u.i.n.e$a */
    /* compiled from: GroupedLinkedMap */
    private static class C2333a<K, V> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final K f9233a;

        /* renamed from: b */
        private List<V> f9234b;

        /* renamed from: c */
        C2333a<K, V> f9235c;

        /* renamed from: d */
        C2333a<K, V> f9236d;

        public C2333a() {
            this(null);
        }

        /* renamed from: b */
        public int mo9743b() {
            List<V> list = this.f9234b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C2333a(K k) {
            this.f9236d = this;
            this.f9235c = this;
            this.f9233a = k;
        }

        /* renamed from: a */
        public V mo9741a() {
            int b = mo9743b();
            if (b > 0) {
                return this.f9234b.remove(b - 1);
            }
            return null;
        }

        /* renamed from: a */
        public void mo9742a(V v) {
            if (this.f9234b == null) {
                this.f9234b = new ArrayList();
            }
            this.f9234b.add(v);
        }
    }

    C2332e() {
    }

    /* renamed from: b */
    private void m12067b(C2333a<K, V> aVar) {
        m12068c(aVar);
        C2333a<K, V> aVar2 = this.f9231a;
        aVar.f9236d = aVar2.f9236d;
        aVar.f9235c = aVar2;
        m12069d(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m12068c(C2333a<K, V> aVar) {
        C2333a<K, V> aVar2 = aVar.f9236d;
        aVar2.f9235c = aVar.f9235c;
        aVar.f9235c.f9236d = aVar2;
    }

    /* renamed from: d */
    private static <K, V> void m12069d(C2333a<K, V> aVar) {
        aVar.f9235c.f9236d = aVar;
        aVar.f9236d.f9235c = aVar;
    }

    /* renamed from: a */
    public void mo9739a(K k, V v) {
        C2333a aVar = (C2333a) this.f9232b.get(k);
        if (aVar == null) {
            aVar = new C2333a(k);
            m12067b(aVar);
            this.f9232b.put(k, aVar);
        } else {
            k.mo9721a();
        }
        aVar.mo9742a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C2333a<K, V> aVar = this.f9231a.f9235c; !aVar.equals(this.f9231a); aVar = aVar.f9235c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f9233a);
            sb.append(':');
            sb.append(aVar.mo9743b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    /* renamed from: a */
    public V mo9738a(K k) {
        C2333a aVar = (C2333a) this.f9232b.get(k);
        if (aVar == null) {
            aVar = new C2333a(k);
            this.f9232b.put(k, aVar);
        } else {
            k.mo9721a();
        }
        m12066a(aVar);
        return aVar.mo9741a();
    }

    /* renamed from: a */
    public V mo9737a() {
        for (C2333a<K, V> aVar = this.f9231a.f9236d; !aVar.equals(this.f9231a); aVar = aVar.f9236d) {
            V a = aVar.mo9741a();
            if (a != null) {
                return a;
            }
            m12068c(aVar);
            this.f9232b.remove(aVar.f9233a);
            ((C2340h) aVar.f9233a).mo9721a();
        }
        return null;
    }

    /* renamed from: a */
    private void m12066a(C2333a<K, V> aVar) {
        m12068c(aVar);
        C2333a<K, V> aVar2 = this.f9231a;
        aVar.f9236d = aVar2;
        aVar.f9235c = aVar2.f9235c;
        m12069d(aVar);
    }
}
