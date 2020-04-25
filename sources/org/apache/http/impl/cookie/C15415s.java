package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.C15131b;
import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.client.p531l.C15160e;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p547h0.C15347x;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.cookie.s */
/* compiled from: NetscapeDraftSpec */
public class C15415s extends C15409o {

    /* renamed from: c */
    protected static final String f44546c = "EEE, dd-MMM-yyyy HH:mm:ss z";

    /* renamed from: b */
    private final String[] f44547b;

    public C15415s(String[] strArr) {
        if (strArr != null) {
            this.f44547b = (String[]) strArr.clone();
        } else {
            this.f44547b = new String[]{f44546c};
        }
        mo47666a(C15222a.f44141w, new C15403i());
        mo47666a(C15222a.f44142x, new C15413q());
        mo47666a(C15222a.f44143y, new C15402h());
        mo47666a(C15222a.f44144z, new C15404j());
        mo47666a(C15222a.f44135A, new C15396e());
        mo47666a(C15222a.f44136B, new C15400g(this.f44547b));
    }

    /* renamed from: a */
    public List<C15223b> mo47126a(C15133c cVar, C15226e eVar) throws MalformedCookieException {
        C15347x xVar;
        C15454b bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cVar.getName().equalsIgnoreCase("Set-Cookie")) {
            C15414r rVar = C15414r.f44543b;
            if (cVar instanceof C15131b) {
                C15131b bVar2 = (C15131b) cVar;
                bVar = bVar2.mo46910c();
                xVar = new C15347x(bVar2.mo46911d(), bVar.mo47772f());
            } else {
                String value = cVar.getValue();
                if (value != null) {
                    bVar = new C15454b(value.length());
                    bVar.mo47757a(value);
                    xVar = new C15347x(0, bVar.mo47772f());
                } else {
                    throw new MalformedCookieException("Header value is null");
                }
            }
            return mo47673a(new C15236d[]{rVar.mo47679a(bVar, xVar)}, eVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized cookie header '");
            sb.append(cVar.toString());
            sb.append("'");
            throw new MalformedCookieException(sb.toString());
        }
    }

    /* renamed from: a */
    public C15133c mo47127a() {
        return null;
    }

    /* renamed from: b */
    public int mo47129b() {
        return 0;
    }

    public String toString() {
        return C15160e.f44033b;
    }

    public C15415s() {
        this(null);
    }

    /* renamed from: a */
    public List<C15133c> mo47125a(List<C15223b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            C15454b bVar = new C15454b(list.size() * 20);
            bVar.mo47757a("Cookie");
            bVar.mo47757a(": ");
            for (int i = 0; i < list.size(); i++) {
                C15223b bVar2 = (C15223b) list.get(i);
                if (i > 0) {
                    bVar.mo47757a("; ");
                }
                bVar.mo47757a(bVar2.getName());
                String value = bVar2.getValue();
                if (value != null) {
                    bVar.mo47757a("=");
                    bVar.mo47757a(value);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C15341r(bVar));
            return arrayList;
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }
}
