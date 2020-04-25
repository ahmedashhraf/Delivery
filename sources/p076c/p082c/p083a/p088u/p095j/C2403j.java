package p076c.p082c.p083a.p088u.p095j;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: c.c.a.u.j.j */
/* compiled from: LazyHeaders */
public final class C2403j implements C2396e {

    /* renamed from: c */
    private final Map<String, List<C2402i>> f9372c;

    /* renamed from: d */
    private volatile Map<String, String> f9373d;

    /* renamed from: c.c.a.u.j.j$a */
    /* compiled from: LazyHeaders */
    public static final class C2404a {

        /* renamed from: e */
        private static final String f9374e = "User-Agent";

        /* renamed from: f */
        private static final String f9375f = System.getProperty("http.agent");

        /* renamed from: g */
        private static final String f9376g = "Accept-Encoding";

        /* renamed from: h */
        private static final String f9377h = "identity";

        /* renamed from: i */
        private static final Map<String, List<C2402i>> f9378i;

        /* renamed from: a */
        private boolean f9379a = true;

        /* renamed from: b */
        private Map<String, List<C2402i>> f9380b = f9378i;

        /* renamed from: c */
        private boolean f9381c = true;

        /* renamed from: d */
        private boolean f9382d = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f9375f)) {
                hashMap.put("User-Agent", Collections.singletonList(new C2405b(f9375f)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new C2405b("identity")));
            f9378i = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: c */
        private void m12251c() {
            if (this.f9379a) {
                this.f9379a = false;
                this.f9380b = m12250b();
            }
        }

        /* renamed from: a */
        public C2404a mo9834a(String str, String str2) {
            return mo9833a(str, (C2402i) new C2405b(str2));
        }

        /* renamed from: b */
        public C2404a mo9837b(String str, String str2) {
            return mo9836b(str, str2 == null ? null : new C2405b(str2));
        }

        /* renamed from: a */
        public C2404a mo9833a(String str, C2402i iVar) {
            if ((this.f9381c && "Accept-Encoding".equalsIgnoreCase(str)) || (this.f9382d && "User-Agent".equalsIgnoreCase(str))) {
                return mo9836b(str, iVar);
            }
            m12251c();
            m12249a(str).add(iVar);
            return this;
        }

        /* renamed from: b */
        public C2404a mo9836b(String str, C2402i iVar) {
            m12251c();
            if (iVar == null) {
                this.f9380b.remove(str);
            } else {
                List a = m12249a(str);
                a.clear();
                a.add(iVar);
            }
            if (this.f9381c && "Accept-Encoding".equalsIgnoreCase(str)) {
                this.f9381c = false;
            }
            if (this.f9382d && "User-Agent".equalsIgnoreCase(str)) {
                this.f9382d = false;
            }
            return this;
        }

        /* renamed from: a */
        private List<C2402i> m12249a(String str) {
            List<C2402i> list = (List) this.f9380b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f9380b.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: a */
        public C2403j mo9835a() {
            this.f9379a = true;
            return new C2403j(this.f9380b);
        }

        /* renamed from: b */
        private Map<String, List<C2402i>> m12250b() {
            HashMap hashMap = new HashMap(this.f9380b.size());
            for (Entry entry : this.f9380b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }
    }

    /* renamed from: c.c.a.u.j.j$b */
    /* compiled from: LazyHeaders */
    static final class C2405b implements C2402i {

        /* renamed from: a */
        private final String f9383a;

        C2405b(String str) {
            this.f9383a = str;
        }

        /* renamed from: a */
        public String mo9829a() {
            return this.f9383a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2405b)) {
                return false;
            }
            return this.f9383a.equals(((C2405b) obj).f9383a);
        }

        public int hashCode() {
            return this.f9383a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.f9383a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    C2403j(Map<String, List<C2402i>> map) {
        this.f9372c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private Map<String, String> m12247b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f9372c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List list = (List) entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                sb.append(((C2402i) list.get(i)).mo9829a());
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
            hashMap.put(entry.getKey(), sb.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo9825a() {
        if (this.f9373d == null) {
            synchronized (this) {
                if (this.f9373d == null) {
                    this.f9373d = Collections.unmodifiableMap(m12247b());
                }
            }
        }
        return this.f9373d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2403j)) {
            return false;
        }
        return this.f9372c.equals(((C2403j) obj).f9372c);
    }

    public int hashCode() {
        return this.f9372c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.f9372c);
        sb.append('}');
        return sb.toString();
    }
}
