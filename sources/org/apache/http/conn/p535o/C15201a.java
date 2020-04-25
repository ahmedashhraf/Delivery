package org.apache.http.conn.p535o;

import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.conn.o.a */
/* compiled from: BasicRouteDirector */
public class C15201a implements C15203c {
    /* renamed from: a */
    public int mo47044a(C15205e eVar, C15205e eVar2) {
        if (eVar == null) {
            throw new IllegalArgumentException("Planned route may not be null.");
        } else if (eVar2 == null || eVar2.mo47049c() < 1) {
            return mo47043a(eVar);
        } else {
            if (eVar.mo47049c() > 1) {
                return mo47046c(eVar, eVar2);
            }
            return mo47045b(eVar, eVar2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo47045b(C15205e eVar, C15205e eVar2) {
        if (eVar2.mo47049c() > 1 || !eVar.mo47048b().equals(eVar2.mo47048b()) || eVar.mo47051d() != eVar2.mo47051d()) {
            return -1;
        }
        if (eVar.getLocalAddress() == null || eVar.getLocalAddress().equals(eVar2.getLocalAddress())) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo47046c(C15205e eVar, C15205e eVar2) {
        if (eVar2.mo47049c() <= 1 || !eVar.mo47048b().equals(eVar2.mo47048b())) {
            return -1;
        }
        int c = eVar.mo47049c();
        int c2 = eVar2.mo47049c();
        if (c < c2) {
            return -1;
        }
        for (int i = 0; i < c2 - 1; i++) {
            if (!eVar.mo47047a(i).equals(eVar2.mo47047a(i))) {
                return -1;
            }
        }
        if (c > c2) {
            return 4;
        }
        if ((eVar2.mo47054f() && !eVar.mo47054f()) || (eVar2.mo47059i() && !eVar.mo47059i())) {
            return -1;
        }
        if (eVar.mo47054f() && !eVar2.mo47054f()) {
            return 3;
        }
        if (eVar.mo47059i() && !eVar2.mo47059i()) {
            return 5;
        }
        if (eVar.mo47051d() != eVar2.mo47051d()) {
            return -1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo47043a(C15205e eVar) {
        return eVar.mo47049c() > 1 ? 2 : 1;
    }
}
