package org.apache.http.impl.client;

import java.util.HashMap;
import org.apache.http.auth.C15122e;
import org.apache.http.auth.C15124g;
import org.apache.http.client.C15137c;
import org.apache.http.p224d0.C6143a;
import org.apache.http.p224d0.C6146d;

@C6146d
/* renamed from: org.apache.http.impl.client.d */
/* compiled from: BasicCredentialsProvider */
public class C15372d implements C15137c {
    @C6143a("this")

    /* renamed from: a */
    private final HashMap<C15122e, C15124g> f44475a = new HashMap<>();

    /* renamed from: a */
    public synchronized void mo46929a(C15122e eVar, C15124g gVar) {
        if (eVar != null) {
            this.f44475a.put(eVar, gVar);
        } else {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
    }

    public synchronized void clear() {
        this.f44475a.clear();
    }

    public String toString() {
        return this.f44475a.toString();
    }

    /* renamed from: a */
    private static C15124g m68152a(HashMap<C15122e, C15124g> hashMap, C15122e eVar) {
        C15124g gVar = (C15124g) hashMap.get(eVar);
        if (gVar != null) {
            return gVar;
        }
        int i = -1;
        C15122e eVar2 = null;
        for (C15122e eVar3 : hashMap.keySet()) {
            int a = eVar.mo46879a(eVar3);
            if (a > i) {
                eVar2 = eVar3;
                i = a;
            }
        }
        return eVar2 != null ? (C15124g) hashMap.get(eVar2) : gVar;
    }

    /* renamed from: a */
    public synchronized C15124g mo46928a(C15122e eVar) {
        if (eVar != null) {
        } else {
            throw new IllegalArgumentException("Authentication scope may not be null");
        }
        return m68152a(this.f44475a, eVar);
    }
}
