package org.jacoco.agent.p551rt.internal_8ff85ea.core.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: org.jacoco.agent.rt.internal_8ff85ea.core.data.c */
/* compiled from: ExecutionDataStore */
public final class C15477c implements C15479e {

    /* renamed from: a */
    private final Map<Long, C15475a> f44701a = new HashMap();

    /* renamed from: b */
    private final Set<String> f44702b = new HashSet();

    /* renamed from: a */
    public void mo47820a(C15477c cVar) {
        for (C15475a c : cVar.mo47816a()) {
            mo47825c(c);
        }
    }

    /* renamed from: b */
    public void mo47824b(C15475a aVar) throws IllegalStateException {
        Long valueOf = Long.valueOf(aVar.mo47804a());
        C15475a aVar2 = (C15475a) this.f44701a.get(valueOf);
        if (aVar2 == null) {
            this.f44701a.put(valueOf, aVar);
            this.f44702b.add(aVar.mo47808b());
            return;
        }
        aVar2.mo47806a(aVar);
    }

    /* renamed from: c */
    public void mo47825c(C15475a aVar) throws IllegalStateException {
        C15475a aVar2 = (C15475a) this.f44701a.get(Long.valueOf(aVar.mo47804a()));
        if (aVar2 != null) {
            aVar2.mo47807a(aVar, false);
        }
    }

    /* renamed from: a */
    public C15475a mo47817a(long j) {
        return (C15475a) this.f44701a.get(Long.valueOf(j));
    }

    /* renamed from: a */
    public boolean mo47822a(String str) {
        return this.f44702b.contains(str);
    }

    /* renamed from: a */
    public C15475a mo47818a(Long l, String str, int i) {
        C15475a aVar = (C15475a) this.f44701a.get(l);
        if (aVar == null) {
            C15475a aVar2 = new C15475a(l.longValue(), str, i);
            this.f44701a.put(l, aVar2);
            this.f44702b.add(str);
            return aVar2;
        }
        aVar.mo47805a(l.longValue(), str, i);
        return aVar;
    }

    /* renamed from: b */
    public void mo47823b() {
        for (C15475a e : this.f44701a.values()) {
            e.mo47811e();
        }
    }

    /* renamed from: a */
    public Collection<C15475a> mo47816a() {
        return new ArrayList(this.f44701a.values());
    }

    /* renamed from: a */
    public void mo47821a(C15479e eVar) {
        for (C15475a a : mo47816a()) {
            eVar.mo47819a(a);
        }
    }

    /* renamed from: a */
    public void mo47819a(C15475a aVar) {
        mo47824b(aVar);
    }
}
