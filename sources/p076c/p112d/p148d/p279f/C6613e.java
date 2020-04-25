package p076c.p112d.p148d.p279f;

import com.google.common.base.C5785c;
import com.google.common.base.C5786c0;
import com.google.common.base.C5799e;
import com.google.common.base.C5822s;
import com.google.common.base.C7397x;
import com.google.common.collect.C8257x2;
import java.util.List;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p282e.p283a.C6733a;
import p201f.p202a.C5952h;

@C2776b
@C2775a
/* renamed from: c.d.d.f.e */
/* compiled from: InternetDomainName */
public final class C6613e {

    /* renamed from: d */
    private static final C5799e f18465d = C5799e.m25416l(".。．｡");

    /* renamed from: e */
    private static final C5786c0 f18466e = C5786c0.m25366b('.');

    /* renamed from: f */
    private static final C5822s f18467f = C5822s.m25522a('.');

    /* renamed from: g */
    private static final int f18468g = -1;

    /* renamed from: h */
    private static final String f18469h = "\\.";

    /* renamed from: i */
    private static final int f18470i = 127;

    /* renamed from: j */
    private static final int f18471j = 253;

    /* renamed from: k */
    private static final int f18472k = 63;

    /* renamed from: l */
    private static final C5799e f18473l = C5799e.m25416l("-_");

    /* renamed from: m */
    private static final C5799e f18474m = C5799e.f16737T.mo23098b(f18473l);

    /* renamed from: a */
    private final String f18475a;

    /* renamed from: b */
    private final C8257x2<String> f18476b;

    /* renamed from: c */
    private final int f18477c;

    C6613e(String str) {
        String a = C5785c.m25356a(f18465d.mo23099b((CharSequence) str, '.'));
        if (a.endsWith(".")) {
            a = a.substring(0, a.length() - 1);
        }
        C7397x.m35672a(a.length() <= f18471j, "Domain name too long: '%s':", a);
        this.f18475a = a;
        this.f18476b = C8257x2.m39392a(f18466e.mo23075a((CharSequence) a));
        C7397x.m35672a(this.f18476b.size() <= 127, "Domain has too many parts: '%s'", a);
        C7397x.m35672a(m31475a((List<String>) this.f18476b), "Not a valid domain name: '%s'", a);
        this.f18477c = m31479j();
    }

    /* renamed from: a */
    private static boolean m31475a(List<String> list) {
        int size = list.size() - 1;
        if (!m31474a((String) list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!m31474a((String) list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C6613e m31476b(String str) {
        return new C6613e((String) C7397x.m35664a(str));
    }

    /* renamed from: j */
    private int m31479j() {
        int size = this.f18476b.size();
        for (int i = 0; i < size; i++) {
            String a = f18467f.mo23119a((Iterable<?>) this.f18476b.subList(i, size));
            if (C6733a.f18713a.containsKey(a)) {
                return i;
            }
            if (C6733a.f18715c.containsKey(a)) {
                return i + 1;
            }
            if (m31478d(a)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public boolean mo26548c() {
        return this.f18477c == 0;
    }

    /* renamed from: d */
    public boolean mo26549d() {
        return this.f18477c == 1;
    }

    /* renamed from: e */
    public boolean mo26550e() {
        return this.f18477c > 0;
    }

    public boolean equals(@C5952h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6613e)) {
            return false;
        }
        return this.f18475a.equals(((C6613e) obj).f18475a);
    }

    /* renamed from: f */
    public C6613e mo26552f() {
        C7397x.m35678b(mo26546a(), "Domain '%s' has no parent", this.f18475a);
        return m31473a(1);
    }

    /* renamed from: g */
    public C8257x2<String> mo26553g() {
        return this.f18476b;
    }

    /* renamed from: h */
    public C6613e mo26554h() {
        if (mo26547b()) {
            return m31473a(this.f18477c);
        }
        return null;
    }

    public int hashCode() {
        return this.f18475a.hashCode();
    }

    /* renamed from: i */
    public C6613e mo26556i() {
        if (mo26549d()) {
            return this;
        }
        C7397x.m35678b(mo26550e(), "Not under a public suffix: %s", this.f18475a);
        return m31473a(this.f18477c - 1);
    }

    public String toString() {
        return this.f18475a;
    }

    /* renamed from: c */
    public static boolean m31477c(String str) {
        try {
            m31476b(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m31478d(String str) {
        String[] split = str.split(f18469h, 2);
        return split.length == 2 && C6733a.f18714b.containsKey(split[1]);
    }

    /* renamed from: b */
    public boolean mo26547b() {
        return this.f18477c != -1;
    }

    /* renamed from: a */
    private static boolean m31474a(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (f18474m.mo23103d((CharSequence) C5799e.f16731N.mo23107h(str)) && !f18473l.mo23093a(str.charAt(0)) && !f18473l.mo23093a(str.charAt(str.length() - 1))) {
                return !z || !C5799e.f16734Q.mo23093a(str.charAt(0));
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo26546a() {
        return this.f18476b.size() > 1;
    }

    /* renamed from: a */
    private C6613e m31473a(int i) {
        C5822s sVar = f18467f;
        C8257x2<String> x2Var = this.f18476b;
        return m31476b(sVar.mo23119a((Iterable<?>) x2Var.subList(i, x2Var.size())));
    }

    /* renamed from: a */
    public C6613e mo26545a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) C7397x.m35664a(str));
        sb.append(".");
        sb.append(this.f18475a);
        return m31476b(sb.toString());
    }
}
