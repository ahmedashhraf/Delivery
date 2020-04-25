package org.apache.http.impl.cookie;

import java.util.ArrayList;
import org.apache.http.C15236d;
import org.apache.http.C15472x;
import org.apache.http.ParseException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p547h0.C15326c;
import org.apache.http.p547h0.C15330g;
import org.apache.http.p547h0.C15347x;
import org.apache.http.p550k0.C15454b;

@C6144b
/* renamed from: org.apache.http.impl.cookie.r */
/* compiled from: NetscapeDraftHeaderParser */
public class C15414r {

    /* renamed from: b */
    public static final C15414r f44543b = new C15414r();

    /* renamed from: c */
    private static final char[] f44544c = {';'};

    /* renamed from: a */
    private final C15330g f44545a = C15330g.f44380a;

    /* renamed from: a */
    public C15236d mo47679a(C15454b bVar, C15347x xVar) throws ParseException {
        if (bVar == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (xVar != null) {
            C15472x a = this.f44545a.mo47454a(bVar, xVar, f44544c);
            ArrayList arrayList = new ArrayList();
            while (!xVar.mo47531a()) {
                arrayList.add(this.f44545a.mo47454a(bVar, xVar, f44544c));
            }
            return new C15326c(a.getName(), a.getValue(), (C15472x[]) arrayList.toArray(new C15472x[arrayList.size()]));
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
