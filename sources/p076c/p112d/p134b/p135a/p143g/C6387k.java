package p076c.p112d.p134b.p135a.p143g;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* renamed from: c.d.b.a.g.k */
/* compiled from: ClassInfo */
public final class C6387k {

    /* renamed from: e */
    private static final Map<Class<?>, C6387k> f17806e = new WeakHashMap();

    /* renamed from: f */
    private static final Map<Class<?>, C6387k> f17807f = new WeakHashMap();

    /* renamed from: a */
    private final Class<?> f17808a;

    /* renamed from: b */
    private final boolean f17809b;

    /* renamed from: c */
    private final IdentityHashMap<String, C6412r> f17810c = new IdentityHashMap<>();

    /* renamed from: d */
    final List<String> f17811d;

    /* renamed from: c.d.b.a.g.k$a */
    /* compiled from: ClassInfo */
    class C6388a implements Comparator<String> {
        C6388a() {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    private C6387k(Class<?> cls, boolean z) {
        Field[] declaredFields;
        Field field;
        this.f17808a = cls;
        this.f17809b = z;
        boolean z2 = !z || !cls.isEnum();
        String valueOf = String.valueOf(String.valueOf(cls));
        StringBuilder sb = new StringBuilder(valueOf.length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        C6381h0.m29667a(z2, (Object) sb.toString());
        TreeSet treeSet = new TreeSet(new C6388a());
        for (Field field2 : cls.getDeclaredFields()) {
            C6412r a = C6412r.m29778a(field2);
            if (a != null) {
                String e = a.mo25834e();
                if (z) {
                    e = e.toLowerCase().intern();
                }
                C6412r rVar = (C6412r) this.f17810c.get(e);
                boolean z3 = rVar == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = e;
                objArr[2] = field2;
                if (rVar == null) {
                    field = null;
                } else {
                    field = rVar.mo25832c();
                }
                objArr[3] = field;
                C6381h0.m29668a(z3, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f17810c.put(e, a);
                treeSet.add(e);
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            C6387k a2 = m29692a(superclass, z);
            treeSet.addAll(a2.f17811d);
            for (Entry entry : a2.f17810c.entrySet()) {
                String str = (String) entry.getKey();
                if (!this.f17810c.containsKey(str)) {
                    this.f17810c.put(str, entry.getValue());
                }
            }
        }
        this.f17811d = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: a */
    public static C6387k m29691a(Class<?> cls) {
        return m29692a(cls, false);
    }

    /* renamed from: b */
    public final boolean mo25770b() {
        return this.f17809b;
    }

    /* renamed from: c */
    public Collection<String> mo25771c() {
        return this.f17811d;
    }

    /* renamed from: d */
    public Class<?> mo25772d() {
        return this.f17808a;
    }

    /* renamed from: e */
    public boolean mo25773e() {
        return this.f17808a.isEnum();
    }

    /* renamed from: a */
    public static C6387k m29692a(Class<?> cls, boolean z) {
        C6387k kVar;
        if (cls == null) {
            return null;
        }
        Map<Class<?>, C6387k> map = z ? f17807f : f17806e;
        synchronized (map) {
            kVar = (C6387k) map.get(cls);
            if (kVar == null) {
                kVar = new C6387k(cls, z);
                map.put(cls, kVar);
            }
        }
        return kVar;
    }

    /* renamed from: b */
    public C6412r mo25769b(String str) {
        if (str != null) {
            if (this.f17809b) {
                str = str.toLowerCase();
            }
            str = str.intern();
        }
        return (C6412r) this.f17810c.get(str);
    }

    /* renamed from: a */
    public Field mo25767a(String str) {
        C6412r b = mo25769b(str);
        if (b == null) {
            return null;
        }
        return b.mo25832c();
    }

    /* renamed from: a */
    public Collection<C6412r> mo25768a() {
        return Collections.unmodifiableCollection(this.f17810c.values());
    }
}
