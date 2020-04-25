package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.C15236d;
import org.apache.http.C15472x;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.cookie.o */
/* compiled from: CookieSpecBase */
public abstract class C15409o extends C15390b {
    /* renamed from: a */
    protected static String m68317a(C15226e eVar) {
        return eVar.mo47118a();
    }

    /* renamed from: b */
    protected static String m68318b(C15226e eVar) {
        String b = eVar.mo47119b();
        int lastIndexOf = b.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return b;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return b.substring(0, lastIndexOf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<C15223b> mo47673a(C15236d[] dVarArr, C15226e eVar) throws MalformedCookieException {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (C15236d dVar : dVarArr) {
            String name = dVar.getName();
            String value = dVar.getValue();
            if (name == null || name.length() == 0) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            C15394d dVar2 = new C15394d(name, value);
            dVar2.mo47143b(m68318b(eVar));
            dVar2.mo47146e(m68317a(eVar));
            C15472x[] parameters = dVar.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                C15472x xVar = parameters[length];
                String lowerCase = xVar.getName().toLowerCase(Locale.ENGLISH);
                dVar2.mo47671a(lowerCase, xVar.getValue());
                C15224c a = mo47665a(lowerCase);
                if (a != null) {
                    a.mo47114a((C15233l) dVar2, xVar.getValue());
                }
            }
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean mo47130b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            for (C15224c b : mo47668c()) {
                if (!b.mo47115b(bVar, eVar)) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: a */
    public void mo47128a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar != null) {
            for (C15224c a : mo47668c()) {
                a.mo47113a(bVar, eVar);
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
