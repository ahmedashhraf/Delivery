package org.apache.http.impl.client;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.client.q */
/* compiled from: RedirectLocations */
public class C15385q {

    /* renamed from: a */
    private final Set<URI> f44505a = new HashSet();

    /* renamed from: a */
    public void mo47653a(URI uri) {
        this.f44505a.add(uri);
    }

    /* renamed from: b */
    public boolean mo47654b(URI uri) {
        return this.f44505a.contains(uri);
    }

    /* renamed from: c */
    public boolean mo47655c(URI uri) {
        return this.f44505a.remove(uri);
    }
}
