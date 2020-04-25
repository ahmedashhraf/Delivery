package okhttp3.internal.p516g;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.internal.C14910b;
import org.apache.http.p547h0.C15329f;
import org.apache.http.p549j0.C15430e;
import p076c.p112d.p148d.p279f.C6610c;
import p205i.p489f.C14069f;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13833h;
import p468g.C13851m;
import p468g.C13853n;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13868v;
import p470h.C13887c;
import p470h.C13896f;

/* renamed from: okhttp3.internal.g.e */
/* compiled from: HttpHeaders */
public final class C14947e {

    /* renamed from: a */
    private static final C13896f f43337a = C13896f.m59655e(C15329f.f44379c);

    /* renamed from: b */
    private static final C13896f f43338b = C13896f.m59655e("\t ,=");

    private C14947e() {
    }

    /* renamed from: a */
    public static long m66225a(C13823e0 e0Var) {
        return m66226a(e0Var.mo43427i());
    }

    /* renamed from: b */
    public static boolean m66238b(C13866u uVar) {
        return m66239c(uVar).contains(C14069f.f41343G);
    }

    /* renamed from: c */
    public static boolean m66240c(C13823e0 e0Var) {
        return m66238b(e0Var.mo43427i());
    }

    /* renamed from: d */
    private static Set<String> m66242d(C13823e0 e0Var) {
        return m66239c(e0Var.mo43427i());
    }

    /* renamed from: e */
    public static C13866u m66243e(C13823e0 e0Var) {
        return m66228a(e0Var.mo43409H().mo43414M().mo43354c(), e0Var.mo43427i());
    }

    /* renamed from: a */
    public static long m66226a(C13866u uVar) {
        return m66227a(uVar.mo43612a("Content-Length"));
    }

    /* renamed from: b */
    private static String m66236b(C13887c cVar) {
        try {
            long c = cVar.mo43871c(f43338b);
            if (c == -1) {
                c = cVar.size();
            }
            if (c != 0) {
                return cVar.mo43889g(c);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static Set<String> m66239c(C13866u uVar) {
        Set emptySet = Collections.emptySet();
        int d = uVar.mo43618d();
        Set set = emptySet;
        for (int i = 0; i < d; i++) {
            if (C6610c.f18436p0.equalsIgnoreCase(uVar.mo43611a(i))) {
                String b = uVar.mo43613b(i);
                if (set.isEmpty()) {
                    set = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    set.add(trim.trim());
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    private static long m66227a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static boolean m66234a(C13823e0 e0Var, C13866u uVar, C13813c0 c0Var) {
        for (String str : m66242d(e0Var)) {
            if (!C14910b.m66061a((Object) uVar.mo43617c(str), (Object) c0Var.mo43353b(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C13866u m66228a(C13866u uVar, C13866u uVar2) {
        Set c = m66239c(uVar2);
        if (c.isEmpty()) {
            return new C13867a().mo43627a();
        }
        C13867a aVar = new C13867a();
        int d = uVar.mo43618d();
        for (int i = 0; i < d; i++) {
            String a = uVar.mo43611a(i);
            if (c.contains(a)) {
                aVar.mo43625a(a, uVar.mo43613b(i));
            }
        }
        return aVar.mo43627a();
    }

    /* renamed from: b */
    public static boolean m66237b(C13823e0 e0Var) {
        if (e0Var.mo43414M().mo43356e().equals("HEAD")) {
            return false;
        }
        int g = e0Var.mo43425g();
        if (((g >= 100 && g < 200) || g == 204 || g == 304) && m66225a(e0Var) == -1) {
            if (C15430e.f44591r.equalsIgnoreCase(e0Var.mo43419b("Transfer-Encoding"))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m66235b(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: c */
    private static boolean m66241c(C13887c cVar) {
        boolean z = false;
        while (!cVar.mo43904p()) {
            byte a = cVar.mo43836a(0);
            if (a != 44) {
                if (a != 32 && a != 9) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static List<C13833h> m66231a(C13866u uVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uVar.mo43618d(); i++) {
            if (str.equalsIgnoreCase(uVar.mo43611a(i))) {
                m66233a((List<C13833h>) arrayList, new C13887c().m59515a(uVar.mo43613b(i)));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m66233a(List<C13833h> list, C13887c cVar) {
        String b;
        int a;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    m66241c(cVar);
                    str2 = m66236b(cVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean c = m66241c(cVar);
                b = m66236b(cVar);
                if (b != null) {
                    a = m66222a(cVar, 61);
                    boolean c2 = m66241c(cVar);
                    if (c || (!c2 && !cVar.mo43904p())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int a2 = a + m66222a(cVar, 61);
                        while (true) {
                            if (b == null) {
                                b = m66236b(cVar);
                                if (m66241c(cVar)) {
                                    continue;
                                    break;
                                }
                                a2 = m66222a(cVar, 61);
                            }
                            if (a2 == 0) {
                                continue;
                                break;
                            } else if (a2 <= 1 && !m66241c(cVar)) {
                                if (cVar.mo43904p() || cVar.mo43836a(0) != 34) {
                                    str = m66236b(cVar);
                                } else {
                                    str = m66230a(cVar);
                                }
                                if (str == null || ((String) linkedHashMap.put(b, str)) != null) {
                                    return;
                                }
                                if (m66241c(cVar) || cVar.mo43904p()) {
                                    b = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new C13833h(str2, (Map<String, String>) linkedHashMap));
                        str2 = b;
                    }
                } else if (cVar.mo43904p()) {
                    list.add(new C13833h(str2, Collections.emptyMap()));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append(m66229a('=', a));
            list.add(new C13833h(str2, Collections.singletonMap(null, sb.toString())));
        }
    }

    /* renamed from: a */
    private static int m66222a(C13887c cVar, byte b) {
        int i = 0;
        while (!cVar.mo43904p() && cVar.mo43836a(0) == b) {
            i++;
            cVar.readByte();
        }
        return i;
    }

    /* renamed from: a */
    private static String m66230a(C13887c cVar) {
        if (cVar.readByte() == 34) {
            C13887c cVar2 = new C13887c();
            while (true) {
                long c = cVar.mo43871c(f43337a);
                if (c == -1) {
                    return null;
                }
                if (cVar.mo43836a(c) == 34) {
                    cVar2.mo43815b(cVar, c);
                    cVar.readByte();
                    return cVar2.mo43923w();
                } else if (cVar.size() == c + 1) {
                    return null;
                } else {
                    cVar2.mo43815b(cVar, c);
                    cVar.readByte();
                    cVar2.mo43815b(cVar, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    private static String m66229a(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    /* renamed from: a */
    public static void m66232a(C13853n nVar, C13868v vVar, C13866u uVar) {
        if (nVar != C13853n.f40182a) {
            List a = C13851m.m59148a(vVar, uVar);
            if (!a.isEmpty()) {
                nVar.mo43556a(vVar, a);
            }
        }
    }

    /* renamed from: a */
    public static int m66224a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static int m66223a(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }
}
