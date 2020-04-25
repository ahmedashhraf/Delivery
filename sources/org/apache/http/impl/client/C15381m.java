package org.apache.http.impl.client;

import java.util.Map;
import org.apache.http.C15133c;
import org.apache.http.C15466r;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.p224d0.C6144b;
import org.apache.http.p549j0.C15431f;

@C6144b
/* renamed from: org.apache.http.impl.client.m */
/* compiled from: DefaultTargetAuthenticationHandler */
public class C15381m extends C15369a {
    /* renamed from: a */
    public boolean mo46922a(C15466r rVar, C15431f fVar) {
        if (rVar != null) {
            return rVar.mo47468l().mo46913c() == 401;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    /* renamed from: b */
    public Map<String, C15133c> mo46923b(C15466r rVar, C15431f fVar) throws MalformedChallengeException {
        if (rVar != null) {
            return mo47577a(rVar.mo47422c("WWW-Authenticate"));
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }
}
