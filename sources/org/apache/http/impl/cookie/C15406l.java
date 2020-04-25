package org.apache.http.impl.cookie;

import java.util.Collection;
import org.apache.http.cookie.C15228g;
import org.apache.http.cookie.C15229h;
import org.apache.http.cookie.p539m.C15234a;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p548i0.C15357i;

@C6144b
/* renamed from: org.apache.http.impl.cookie.l */
/* compiled from: BestMatchSpecFactory */
public class C15406l implements C15229h {
    /* renamed from: a */
    public C15228g mo47131a(C15357i iVar) {
        if (iVar == null) {
            return new C15405k();
        }
        String[] strArr = null;
        Collection collection = (Collection) iVar.mo47549b(C15234a.f44154t);
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new C15405k(strArr, iVar.mo47543b(C15234a.f44155u, false));
    }
}
