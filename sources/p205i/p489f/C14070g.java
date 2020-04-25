package p205i.p489f;

import org.slf4j.impl.StaticMarkerBinder;
import p205i.p489f.p490h.C14073c;
import p205i.p489f.p490h.C14082l;

/* renamed from: i.f.g */
/* compiled from: MarkerFactory */
public class C14070g {

    /* renamed from: a */
    static C14065b f41345a;

    static {
        try {
            f41345a = StaticMarkerBinder.SINGLETON.getMarkerFactory();
        } catch (NoClassDefFoundError unused) {
            f41345a = new C14073c();
        } catch (Exception e) {
            C14082l.m60860a("Unexpected failure while binding MarkerFactory", e);
        }
    }

    private C14070g() {
    }

    /* renamed from: a */
    public static C14069f m60755a(String str) {
        return f41345a.mo44421b(str);
    }

    /* renamed from: b */
    public static C14069f m60756b(String str) {
        return f41345a.mo44420a(str);
    }

    /* renamed from: a */
    public static C14065b m60754a() {
        return f41345a;
    }
}
