package org.apache.http.impl.auth;

import org.apache.http.C15131b;
import org.apache.http.C15133c;
import org.apache.http.auth.C15119b;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.auth.a */
/* compiled from: AuthSchemeBase */
public abstract class C15360a implements C15119b {

    /* renamed from: a */
    private boolean f44439a;

    /* renamed from: a */
    public void mo46868a(C15133c cVar) throws MalformedChallengeException {
        C15454b bVar;
        if (cVar != null) {
            String name = cVar.getName();
            int i = 0;
            if (name.equalsIgnoreCase("WWW-Authenticate")) {
                this.f44439a = false;
            } else if (name.equalsIgnoreCase("Proxy-Authenticate")) {
                this.f44439a = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected header name: ");
                sb.append(name);
                throw new MalformedChallengeException(sb.toString());
            }
            if (cVar instanceof C15131b) {
                C15131b bVar2 = (C15131b) cVar;
                bVar = bVar2.mo46910c();
                i = bVar2.mo46911d();
            } else {
                String value = cVar.getValue();
                if (value != null) {
                    bVar = new C15454b(value.length());
                    bVar.mo47757a(value);
                } else {
                    throw new MalformedChallengeException("Header value is null");
                }
            }
            while (i < bVar.mo47772f() && C15430e.m68400a(bVar.mo47752a(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < bVar.mo47772f() && !C15430e.m68400a(bVar.mo47752a(i2))) {
                i2++;
            }
            String a = bVar.mo47754a(i, i2);
            if (a.equalsIgnoreCase(mo46871c())) {
                mo47568a(bVar, i2, bVar.mo47772f());
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid scheme identifier: ");
            sb2.append(a);
            throw new MalformedChallengeException(sb2.toString());
        }
        throw new IllegalArgumentException("Header may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo47568a(C15454b bVar, int i, int i2) throws MalformedChallengeException;

    /* renamed from: e */
    public boolean mo47569e() {
        return this.f44439a;
    }

    public String toString() {
        return mo46871c();
    }
}
