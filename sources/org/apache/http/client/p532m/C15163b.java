package org.apache.http.client.p532m;

import java.util.List;
import org.apache.http.auth.C15121d;
import org.apache.http.client.C15136b;
import org.apache.http.client.C15137c;
import org.apache.http.cookie.C15230i;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p549j0.C15431f;

@C6145c
/* renamed from: org.apache.http.client.m.b */
/* compiled from: ClientContextConfigurer */
public class C15163b implements C15162a {

    /* renamed from: l */
    private final C15431f f44048l;

    public C15163b(C15431f fVar) {
        if (fVar != null) {
            this.f44048l = fVar;
            return;
        }
        throw new IllegalArgumentException("HTTP context may not be null");
    }

    /* renamed from: a */
    public void mo46974a(C15230i iVar) {
        this.f44048l.mo47686a(C15162a.f44038b, iVar);
    }

    /* renamed from: a */
    public void mo46971a(C15121d dVar) {
        this.f44048l.mo47686a(C15162a.f44042f, dVar);
    }

    /* renamed from: a */
    public void mo46972a(C15136b bVar) {
        this.f44048l.mo47686a(C15162a.f44041e, bVar);
    }

    /* renamed from: a */
    public void mo46973a(C15137c cVar) {
        this.f44048l.mo47686a(C15162a.f44043g, cVar);
    }

    @Deprecated
    /* renamed from: a */
    public void mo46970a(List<String> list) {
        this.f44048l.mo47686a(C15162a.f44046j, list);
    }
}
