package p076c.p112d.p134b.p135a.p136d;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6387k;
import p076c.p112d.p134b.p135a.p143g.C6398n;
import p076c.p112d.p134b.p135a.p143g.C6405p;
import p076c.p112d.p134b.p135a.p143g.C6409q0;
import p076c.p112d.p134b.p135a.p143g.C6412r;
import p076c.p112d.p134b.p135a.p143g.C6413s;

/* renamed from: c.d.b.a.d.e */
/* compiled from: JsonGenerator */
public abstract class C6291e {
    /* renamed from: a */
    public abstract void mo25145a() throws IOException;

    /* renamed from: a */
    public abstract void mo25146a(double d) throws IOException;

    /* renamed from: a */
    public abstract void mo25147a(float f) throws IOException;

    /* renamed from: a */
    public abstract void mo25148a(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo25149a(long j) throws IOException;

    /* renamed from: a */
    public final void mo25501a(Object obj) throws IOException {
        m29171a(false, obj);
    }

    /* renamed from: a */
    public abstract void mo25150a(String str) throws IOException;

    /* renamed from: a */
    public abstract void mo25151a(BigDecimal bigDecimal) throws IOException;

    /* renamed from: a */
    public abstract void mo25152a(BigInteger bigInteger) throws IOException;

    /* renamed from: a */
    public abstract void mo25153a(boolean z) throws IOException;

    /* renamed from: b */
    public void mo25154b() throws IOException {
    }

    /* renamed from: b */
    public abstract void mo25155b(String str) throws IOException;

    /* renamed from: c */
    public abstract void mo25156c() throws IOException;

    /* renamed from: c */
    public abstract void mo25157c(String str) throws IOException;

    /* renamed from: d */
    public abstract C6290d mo25158d();

    /* renamed from: e */
    public abstract void mo25159e() throws IOException;

    /* renamed from: f */
    public abstract void mo25160f() throws IOException;

    /* renamed from: g */
    public abstract void mo25161g() throws IOException;

    /* renamed from: h */
    public abstract void mo25162h() throws IOException;

    /* renamed from: i */
    public abstract void mo25163i() throws IOException;

    /* renamed from: a */
    private void m29171a(boolean z, Object obj) throws IOException {
        C6387k kVar;
        boolean z2;
        if (obj != null) {
            Class cls = obj.getClass();
            if (C6398n.m29723b(obj)) {
                mo25161g();
            } else if (obj instanceof String) {
                mo25157c((String) obj);
            } else {
                boolean z3 = true;
                if (obj instanceof Number) {
                    if (z) {
                        mo25157c(obj.toString());
                    } else if (obj instanceof BigDecimal) {
                        mo25151a((BigDecimal) obj);
                    } else if (obj instanceof BigInteger) {
                        mo25152a((BigInteger) obj);
                    } else if (obj instanceof Long) {
                        mo25149a(((Long) obj).longValue());
                    } else if (obj instanceof Float) {
                        float floatValue = ((Number) obj).floatValue();
                        if (Float.isInfinite(floatValue) || Float.isNaN(floatValue)) {
                            z3 = false;
                        }
                        C6381h0.m29666a(z3);
                        mo25147a(floatValue);
                    } else if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                        mo25148a(((Number) obj).intValue());
                    } else {
                        double doubleValue = ((Number) obj).doubleValue();
                        if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                            z3 = false;
                        }
                        C6381h0.m29666a(z3);
                        mo25146a(doubleValue);
                    }
                } else if (obj instanceof Boolean) {
                    mo25153a(((Boolean) obj).booleanValue());
                } else if (obj instanceof C6405p) {
                    mo25157c(((C6405p) obj).mo25801f());
                } else if ((obj instanceof Iterable) || cls.isArray()) {
                    mo25162h();
                    for (Object a : C6409q0.m29765a(obj)) {
                        m29171a(z, a);
                    }
                    mo25159e();
                } else if (cls.isEnum()) {
                    String e = C6412r.m29777a((Enum) obj).mo25834e();
                    if (e == null) {
                        mo25161g();
                    } else {
                        mo25157c(e);
                    }
                } else {
                    mo25163i();
                    boolean z4 = (obj instanceof Map) && !(obj instanceof C6413s);
                    if (z4) {
                        kVar = null;
                    } else {
                        kVar = C6387k.m29691a(cls);
                    }
                    for (Entry entry : C6398n.m29725d(obj).entrySet()) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str = (String) entry.getKey();
                            if (z4) {
                                z2 = z;
                            } else {
                                Field a2 = kVar.mo25767a(str);
                                z2 = (a2 == null || a2.getAnnotation(C2714i.class) == null) ? false : true;
                            }
                            mo25150a(str);
                            m29171a(z2, value);
                        }
                    }
                    mo25160f();
                }
            }
        }
    }
}
