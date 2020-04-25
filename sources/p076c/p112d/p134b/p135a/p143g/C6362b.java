package p076c.p112d.p134b.p135a.p143g;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: c.d.b.a.g.b */
/* compiled from: ArrayValueMap */
public final class C6362b {

    /* renamed from: a */
    private final Map<String, C6363a> f17776a = C6357a.m29612c();

    /* renamed from: b */
    private final Map<Field, C6363a> f17777b = C6357a.m29612c();

    /* renamed from: c */
    private final Object f17778c;

    /* renamed from: c.d.b.a.g.b$a */
    /* compiled from: ArrayValueMap */
    static class C6363a {

        /* renamed from: a */
        final Class<?> f17779a;

        /* renamed from: b */
        final ArrayList<Object> f17780b = new ArrayList<>();

        C6363a(Class<?> cls) {
            this.f17779a = cls;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Object mo25748a() {
            return C6409q0.m29767a((Collection<?>) this.f17780b, this.f17779a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo25749a(Class<?> cls, Object obj) {
            C6381h0.m29666a(cls == this.f17779a);
            this.f17780b.add(obj);
        }
    }

    public C6362b(Object obj) {
        this.f17778c = obj;
    }

    /* renamed from: a */
    public void mo25745a() {
        for (Entry entry : this.f17776a.entrySet()) {
            ((Map) this.f17778c).put(entry.getKey(), ((C6363a) entry.getValue()).mo25748a());
        }
        for (Entry entry2 : this.f17777b.entrySet()) {
            C6412r.m29780a((Field) entry2.getKey(), this.f17778c, ((C6363a) entry2.getValue()).mo25748a());
        }
    }

    /* renamed from: a */
    public void mo25747a(Field field, Class<?> cls, Object obj) {
        C6363a aVar = (C6363a) this.f17777b.get(field);
        if (aVar == null) {
            aVar = new C6363a(cls);
            this.f17777b.put(field, aVar);
        }
        aVar.mo25749a(cls, obj);
    }

    /* renamed from: a */
    public void mo25746a(String str, Class<?> cls, Object obj) {
        C6363a aVar = (C6363a) this.f17776a.get(str);
        if (aVar == null) {
            aVar = new C6363a(cls);
            this.f17776a.put(str, aVar);
        }
        aVar.mo25749a(cls, obj);
    }
}
