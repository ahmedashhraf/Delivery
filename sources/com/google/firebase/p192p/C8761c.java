package com.google.firebase.p192p;

import com.google.firebase.components.C8641e;
import com.google.firebase.components.C8644f;
import com.google.firebase.components.C8659o;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.p.c */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class C8761c implements C8764g {

    /* renamed from: a */
    private final String f22978a;

    /* renamed from: b */
    private final C8762d f22979b;

    C8761c(Set<C5859e> set, C8762d dVar) {
        this.f22978a = m41058a(set);
        this.f22979b = dVar;
    }

    /* renamed from: b */
    public static C8641e<C8764g> m41059b() {
        return C8641e.m40631a(C8764g.class).mo32002a(C8659o.m40698e(C5859e.class)).mo32001a(C8760b.m41055a()).mo32004b();
    }

    /* renamed from: a */
    public String mo32277a() {
        if (this.f22979b.mo32278a().isEmpty()) {
            return this.f22978a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22978a);
        sb.append(' ');
        sb.append(m41058a(this.f22979b.mo32278a()));
        return sb.toString();
    }

    /* renamed from: a */
    private static String m41058a(Set<C5859e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C5859e eVar = (C5859e) it.next();
            sb.append(eVar.mo23280a());
            sb.append('/');
            sb.append(eVar.mo23281b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static /* synthetic */ C8764g m41057a(C8644f fVar) {
        return new C8761c(fVar.mo31990d(C5859e.class), C8762d.m41061b());
    }
}
