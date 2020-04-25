package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.C15089a;
import org.apache.commons.logging.C15096h;
import org.apache.http.C15131b;
import org.apache.http.C15133c;
import org.apache.http.C15466r;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15119b;
import org.apache.http.auth.C15121d;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.C15135a;
import org.apache.http.client.p532m.C15162a;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15430e;
import org.apache.http.p549j0.C15431f;
import org.apache.http.p550k0.C15454b;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.BasicValidateElement;

@C6144b
/* renamed from: org.apache.http.impl.client.a */
/* compiled from: AbstractAuthenticationHandler */
public abstract class C15369a implements C15135a {

    /* renamed from: b */
    private static final List<String> f44454b = Collections.unmodifiableList(Arrays.asList(new String[]{"ntlm", "digest", BasicValidateElement.METHOD}));

    /* renamed from: a */
    private final C15089a f44455a = C15096h.m66940c(getClass());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, C15133c> mo47577a(C15133c[] cVarArr) throws MalformedChallengeException {
        C15454b bVar;
        int i;
        HashMap hashMap = new HashMap(cVarArr.length);
        for (C15133c cVar : cVarArr) {
            if (cVar instanceof C15131b) {
                C15131b bVar2 = (C15131b) cVar;
                bVar = bVar2.mo46910c();
                i = bVar2.mo46911d();
            } else {
                String value = cVar.getValue();
                if (value != null) {
                    bVar = new C15454b(value.length());
                    bVar.mo47757a(value);
                    i = 0;
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
            hashMap.put(bVar.mo47754a(i, i2).toLowerCase(Locale.ENGLISH), cVar);
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<String> mo47576a() {
        return f44454b;
    }

    /* renamed from: a */
    public C15119b mo46921a(Map<String, C15133c> map, C15466r rVar, C15431f fVar) throws AuthenticationException {
        C15121d dVar = (C15121d) fVar.mo47685a(C15162a.f44042f);
        if (dVar != null) {
            Collection collection = (Collection) fVar.mo47685a(C15162a.f44046j);
            if (collection == null) {
                collection = mo47576a();
            }
            if (this.f44455a.mo46785d()) {
                C15089a aVar = this.f44455a;
                StringBuilder sb = new StringBuilder();
                sb.append("Authentication schemes in the order of preference: ");
                sb.append(collection);
                aVar.mo46776a(sb.toString());
            }
            C15119b bVar = null;
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (((C15133c) map.get(str.toLowerCase(Locale.ENGLISH))) != null) {
                    if (this.f44455a.mo46785d()) {
                        C15089a aVar2 = this.f44455a;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" authentication scheme selected");
                        aVar2.mo46776a(sb2.toString());
                    }
                    try {
                        bVar = dVar.mo46875a(str, rVar.getParams());
                        break;
                    } catch (IllegalStateException unused) {
                        if (this.f44455a.mo46778a()) {
                            C15089a aVar3 = this.f44455a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Authentication scheme ");
                            sb3.append(str);
                            sb3.append(" not supported");
                            aVar3.mo46783d(sb3.toString());
                        }
                    }
                } else if (this.f44455a.mo46785d()) {
                    C15089a aVar4 = this.f44455a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Challenge for ");
                    sb4.append(str);
                    sb4.append(" authentication scheme not available");
                    aVar4.mo46776a(sb4.toString());
                }
            }
            if (bVar != null) {
                return bVar;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unable to respond to any of these challenges: ");
            sb5.append(map);
            throw new AuthenticationException(sb5.toString());
        }
        throw new IllegalStateException("AuthScheme registry not set in HTTP context");
    }
}
