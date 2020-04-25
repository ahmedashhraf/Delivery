package org.apache.http.client;

import java.util.Map;
import org.apache.http.C15133c;
import org.apache.http.C15466r;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.C15119b;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.client.a */
/* compiled from: AuthenticationHandler */
public interface C15135a {
    /* renamed from: a */
    C15119b mo46921a(Map<String, C15133c> map, C15466r rVar, C15431f fVar) throws AuthenticationException;

    /* renamed from: a */
    boolean mo46922a(C15466r rVar, C15431f fVar);

    /* renamed from: b */
    Map<String, C15133c> mo46923b(C15466r rVar, C15431f fVar) throws MalformedChallengeException;
}
