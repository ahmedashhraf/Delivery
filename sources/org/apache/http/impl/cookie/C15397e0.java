package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.C15472x;
import org.apache.http.client.p531l.C15160e;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15231j;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.cookie.e0 */
/* compiled from: RFC2965Spec */
public class C15397e0 extends C15420x {
    public C15397e0() {
        this(null, false);
    }

    /* renamed from: b */
    private List<C15223b> m68278b(C15236d[] dVarArr, C15226e eVar) throws MalformedCookieException {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C15236d dVar : dVarArr) {
            String name = dVar.getName();
            String value = dVar.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            C15392c cVar = new C15392c(name, value);
            cVar.mo47143b(C15409o.m68318b(eVar));
            cVar.mo47146e(C15409o.m68317a(eVar));
            cVar.mo47138a(new int[]{eVar.mo47120c()});
            C15472x[] parameters = dVar.getParameters();
            HashMap hashMap = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                C15472x xVar = parameters[length];
                hashMap.put(xVar.getName().toLowerCase(Locale.ENGLISH), xVar);
            }
            for (Entry value2 : hashMap.entrySet()) {
                C15472x xVar2 = (C15472x) value2.getValue();
                String lowerCase = xVar2.getName().toLowerCase(Locale.ENGLISH);
                cVar.mo47671a(lowerCase, xVar2.getValue());
                C15224c a = mo47665a(lowerCase);
                if (a != null) {
                    a.mo47114a((C15233l) cVar, xVar2.getValue());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    /* renamed from: c */
    private static C15226e m68279c(C15226e eVar) {
        String a = eVar.mo47118a();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a.length()) {
                z = true;
                break;
            }
            char charAt = a.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return eVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(".local");
        return new C15226e(sb.toString(), eVar.mo47120c(), eVar.mo47119b(), eVar.mo47121d());
    }

    /* renamed from: a */
    public List<C15223b> mo47126a(C15133c cVar, C15226e eVar) throws MalformedCookieException {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.getName().equalsIgnoreCase("Set-Cookie2")) {
            return m68278b(cVar.mo46915b(), m68279c(eVar));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cookie header '");
            sb.append(cVar.toString());
            sb.append("'");
            throw new MalformedCookieException(sb.toString());
        }
    }

    /* renamed from: b */
    public int mo47129b() {
        return 1;
    }

    public String toString() {
        return C15160e.f44035d;
    }

    public C15397e0(String[] strArr, boolean z) {
        super(strArr, z);
        mo47666a(C15222a.f44142x, new C15393c0());
        mo47666a("port", new C15395d0());
        mo47666a(C15222a.f44138D, new C15389a0());
        mo47666a(C15222a.f44139E, new C15391b0());
        mo47666a("version", new C15401g0());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C15223b> mo47673a(C15236d[] dVarArr, C15226e eVar) throws MalformedCookieException {
        return m68278b(dVarArr, m68279c(eVar));
    }

    /* renamed from: a */
    public void mo47128a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            super.mo47128a(bVar, m68279c(eVar));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47674a(C15454b bVar, C15223b bVar2, int i) {
        super.mo47674a(bVar, bVar2, i);
        if (bVar2 instanceof C15222a) {
            String a = ((C15222a) bVar2).mo47099a("port");
            if (a != null) {
                bVar.mo47757a("; $Port");
                bVar.mo47757a("=\"");
                if (a.trim().length() > 0) {
                    int[] e = bVar2.mo47105e();
                    if (e != null) {
                        int length = e.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            if (i2 > 0) {
                                bVar.mo47757a(",");
                            }
                            bVar.mo47757a(Integer.toString(e[i2]));
                        }
                    }
                }
                bVar.mo47757a("\"");
            }
        }
    }

    /* renamed from: b */
    public boolean mo47130b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            return super.mo47130b(bVar, m68279c(eVar));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    public C15133c mo47127a() {
        C15454b bVar = new C15454b(40);
        bVar.mo47757a(C15231j.f44151b);
        bVar.mo47757a(": ");
        bVar.mo47757a("$Version=");
        bVar.mo47757a(Integer.toString(mo47129b()));
        return new C15341r(bVar);
    }
}
