package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.client.p533n.C15173d;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15224c;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15233l;
import org.apache.http.cookie.MalformedCookieException;
import p205i.p489f.C14069f;

/* renamed from: org.apache.http.impl.cookie.u */
/* compiled from: PublicSuffixFilter */
public class C15417u implements C15224c {

    /* renamed from: a */
    private final C15224c f44548a;

    /* renamed from: b */
    private Set<String> f44549b;

    /* renamed from: c */
    private Set<String> f44550c;

    public C15417u(C15224c cVar) {
        this.f44548a = cVar;
    }

    /* renamed from: a */
    public void mo47681a(Collection<String> collection) {
        this.f44549b = new HashSet(collection);
    }

    /* renamed from: b */
    public void mo47682b(Collection<String> collection) {
        this.f44550c = new HashSet(collection);
    }

    /* renamed from: a */
    public void mo47114a(C15233l lVar, String str) throws MalformedCookieException {
        this.f44548a.mo47114a(lVar, str);
    }

    /* renamed from: b */
    public boolean mo47115b(C15223b bVar, C15226e eVar) {
        if (m68337a(bVar)) {
            return false;
        }
        return this.f44548a.mo47115b(bVar, eVar);
    }

    /* renamed from: a */
    public void mo47113a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        this.f44548a.mo47113a(bVar, eVar);
    }

    /* renamed from: a */
    private boolean m68337a(C15223b bVar) {
        String h = bVar.mo47111h();
        if (h.startsWith(".")) {
            h = h.substring(1);
        }
        String a = C15173d.m67279a(h);
        Set<String> set = this.f44549b;
        if ((set != null && set.contains(a)) || this.f44550c == null) {
            return false;
        }
        while (!this.f44550c.contains(a)) {
            if (a.startsWith("*.")) {
                a = a.substring(2);
            }
            int indexOf = a.indexOf(46);
            if (indexOf != -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(C14069f.f41343G);
                sb.append(a.substring(indexOf));
                a = sb.toString();
                if (a.length() <= 0) {
                }
            }
            return false;
        }
        return true;
    }
}
