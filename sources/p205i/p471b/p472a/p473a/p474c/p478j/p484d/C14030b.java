package p205i.p471b.p472a.p473a.p474c.p478j.p484d;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;
import p205i.p489f.C14069f;

/* renamed from: i.b.a.a.c.j.d.b */
/* compiled from: AgentOptions */
public final class C14030b {

    /* renamed from: b */
    public static final String f41227b = "destfile";

    /* renamed from: c */
    public static final String f41228c = "jacoco.exec";

    /* renamed from: d */
    public static final String f41229d = "append";

    /* renamed from: e */
    public static final String f41230e = "includes";

    /* renamed from: f */
    public static final String f41231f = "excludes";

    /* renamed from: g */
    public static final String f41232g = "exclclassloader";

    /* renamed from: h */
    public static final String f41233h = "inclbootstrapclasses";

    /* renamed from: i */
    public static final String f41234i = "inclnolocationclasses";

    /* renamed from: j */
    public static final String f41235j = "sessionid";

    /* renamed from: k */
    public static final String f41236k = "dumponexit";

    /* renamed from: l */
    public static final String f41237l = "output";

    /* renamed from: m */
    private static final Pattern f41238m = Pattern.compile(",(?=[a-zA-Z0-9_\\-]+=)");

    /* renamed from: n */
    public static final String f41239n = "address";

    /* renamed from: o */
    public static final String f41240o = null;

    /* renamed from: p */
    public static final String f41241p = "port";

    /* renamed from: q */
    public static final int f41242q = 6300;

    /* renamed from: r */
    public static final String f41243r = "classdumpdir";

    /* renamed from: s */
    public static final String f41244s = "jmx";

    /* renamed from: t */
    private static final Collection<String> f41245t = Arrays.asList(new String[]{f41227b, f41229d, f41230e, f41231f, f41232g, f41233h, f41234i, f41235j, f41236k, f41237l, "address", "port", f41243r, f41244s});

    /* renamed from: a */
    private final Map<String, String> f41246a;

    /* renamed from: i.b.a.a.c.j.d.b$a */
    /* compiled from: AgentOptions */
    public enum C14031a {
        file,
        tcpserver,
        tcpclient,
        none
    }

    public C14030b() {
        this.f41246a = new HashMap();
    }

    /* renamed from: b */
    private void m60528b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("port must be positive");
        }
    }

    /* renamed from: o */
    private void m60532o() {
        m60528b(mo44350m());
        mo44349l();
    }

    /* renamed from: a */
    public void mo44326a(boolean z) {
        m60531b(f41229d, z);
    }

    /* renamed from: c */
    public void mo44332c(String str) {
        m60530b(f41227b, str);
    }

    /* renamed from: d */
    public String mo44334d() {
        return m60526a(f41227b, f41228c);
    }

    /* renamed from: e */
    public void mo44337e(String str) {
        m60530b(f41231f, str);
    }

    /* renamed from: f */
    public void mo44341f(String str) {
        m60530b(f41230e, str);
    }

    /* renamed from: g */
    public String mo44342g() {
        return m60526a(f41231f, "");
    }

    /* renamed from: h */
    public boolean mo44345h() {
        return m60527a(f41233h, false);
    }

    /* renamed from: i */
    public boolean mo44346i() {
        return m60527a(f41234i, false);
    }

    /* renamed from: j */
    public String mo44347j() {
        return m60526a(f41230e, C14069f.f41343G);
    }

    /* renamed from: k */
    public boolean mo44348k() {
        return m60527a(f41244s, false);
    }

    /* renamed from: l */
    public C14031a mo44349l() {
        String str = (String) this.f41246a.get(f41237l);
        return str == null ? C14031a.file : C14031a.valueOf(str);
    }

    /* renamed from: m */
    public int mo44350m() {
        return m60525a("port", (int) f41242q);
    }

    /* renamed from: n */
    public String mo44351n() {
        return m60526a(f41235j, (String) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : f41245t) {
            String str2 = (String) this.f41246a.get(str);
            if (str2 != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
                sb.append('=');
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo44323a(int i) {
        m60528b(i);
        m60529b("port", i);
    }

    /* renamed from: b */
    public boolean mo44330b() {
        return m60527a(f41229d, true);
    }

    /* renamed from: c */
    public void mo44333c(boolean z) {
        m60531b(f41233h, z);
    }

    /* renamed from: d */
    public void mo44335d(String str) {
        m60530b(f41232g, str);
    }

    /* renamed from: e */
    public boolean mo44339e() {
        return m60527a(f41236k, true);
    }

    /* renamed from: f */
    public String mo44340f() {
        return m60526a(f41232g, "sun.reflect.DelegatingClassLoader");
    }

    /* renamed from: g */
    public void mo44343g(String str) {
        mo44324a(C14031a.valueOf(str));
    }

    /* renamed from: h */
    public void mo44344h(String str) {
        m60530b(f41235j, str);
    }

    public C14030b(String str) {
        this();
        if (str != null && str.length() > 0) {
            String[] split = f41238m.split(str);
            int length = split.length;
            int i = 0;
            while (i < length) {
                String str2 = split[i];
                int indexOf = str2.indexOf(61);
                if (indexOf != -1) {
                    String substring = str2.substring(0, indexOf);
                    if (f41245t.contains(substring)) {
                        m60530b(substring, str2.substring(indexOf + 1));
                        i++;
                    } else {
                        throw new IllegalArgumentException(String.format("Unknown agent option \"%s\".", new Object[]{substring}));
                    }
                } else {
                    throw new IllegalArgumentException(String.format("Invalid agent option syntax \"%s\".", new Object[]{str}));
                }
            }
            m60532o();
        }
    }

    /* renamed from: b */
    public void mo44329b(boolean z) {
        m60531b(f41236k, z);
    }

    /* renamed from: c */
    public String mo44331c() {
        return m60526a(f41243r, (String) null);
    }

    /* renamed from: d */
    public void mo44336d(boolean z) {
        m60531b(f41234i, z);
    }

    /* renamed from: e */
    public void mo44338e(boolean z) {
        m60531b(f41244s, z);
    }

    /* renamed from: a */
    public String mo44320a() {
        return m60526a("address", f41240o);
    }

    /* renamed from: b */
    public void mo44328b(String str) {
        m60530b(f41243r, str);
    }

    /* renamed from: b */
    private void m60529b(String str, int i) {
        m60530b(str, Integer.toString(i));
    }

    /* renamed from: a */
    public void mo44325a(String str) {
        m60530b("address", str);
    }

    /* renamed from: b */
    private void m60531b(String str, boolean z) {
        m60530b(str, Boolean.toString(z));
    }

    /* renamed from: a */
    public void mo44324a(C14031a aVar) {
        m60530b(f41237l, aVar.name());
    }

    /* renamed from: a */
    private String m60526a(String str, String str2) {
        String str3 = (String) this.f41246a.get(str);
        return str3 == null ? str2 : str3;
    }

    /* renamed from: b */
    private void m60530b(String str, String str2) {
        this.f41246a.put(str, str2);
    }

    /* renamed from: a */
    private boolean m60527a(String str, boolean z) {
        String str2 = (String) this.f41246a.get(str);
        return str2 == null ? z : Boolean.parseBoolean(str2);
    }

    /* renamed from: b */
    public String mo44327b(File file) {
        return String.format("-javaagent:%s=%s", new Object[]{file, this});
    }

    /* renamed from: a */
    private int m60525a(String str, int i) {
        String str2 = (String) this.f41246a.get(str);
        return str2 == null ? i : Integer.parseInt(str2);
    }

    /* renamed from: a */
    public String mo44321a(File file) {
        return C14032c.m60565a(mo44327b(file));
    }

    /* renamed from: a */
    public String mo44322a(String str, File file) {
        List b = C14032c.m60568b(str);
        String format = String.format("-javaagent:%s", new Object[]{file});
        Iterator it = b.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(format)) {
                it.remove();
            }
        }
        b.add(0, mo44327b(file));
        return C14032c.m60566a(b);
    }

    public C14030b(Properties properties) {
        this();
        for (String str : f41245t) {
            String property = properties.getProperty(str);
            if (property != null) {
                m60530b(str, property);
            }
        }
    }
}
