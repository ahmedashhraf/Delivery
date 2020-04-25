package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C7251a;

public class TokenResponseException extends HttpResponseException {
    private static final long serialVersionUID = 4020689092957439244L;

    /* renamed from: P */
    private final transient C7232r f20353P;

    TokenResponseException(C7251a aVar, C7232r rVar) {
        super(aVar);
        this.f20353P = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.auth.oauth2.TokenResponseException m34547a(p076c.p112d.p134b.p135a.p136d.C6290d r6, com.google.api.client.http.C7309x r7) {
        /*
            com.google.api.client.http.HttpResponseException$a r0 = new com.google.api.client.http.HttpResponseException$a
            int r1 = r7.mo29153j()
            java.lang.String r2 = r7.mo29154k()
            com.google.api.client.http.q r3 = r7.mo29150g()
            r0.<init>(r1, r2, r3)
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29663a(r6)
            java.lang.String r1 = r7.mo29149f()
            r2 = 0
            boolean r3 = r7.mo29158o()     // Catch:{ IOException -> 0x0054 }
            if (r3 != 0) goto L_0x004c
            if (r1 == 0) goto L_0x004c
            java.io.InputStream r3 = r7.mo29145b()     // Catch:{ IOException -> 0x0054 }
            if (r3 == 0) goto L_0x004c
            java.lang.String r3 = "application/json; charset=UTF-8"
            boolean r1 = com.google.api.client.http.C7303s.m35304b(r3, r1)     // Catch:{ IOException -> 0x0054 }
            if (r1 == 0) goto L_0x004c
            c.d.b.a.d.f r1 = new c.d.b.a.d.f     // Catch:{ IOException -> 0x0054 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0054 }
            java.io.InputStream r6 = r7.mo29145b()     // Catch:{ IOException -> 0x0054 }
            java.nio.charset.Charset r3 = r7.mo29146c()     // Catch:{ IOException -> 0x0054 }
            java.lang.Class<com.google.api.client.auth.oauth2.r> r4 = com.google.api.client.auth.oauth2.C7232r.class
            java.lang.Object r6 = r1.mo25503a(r6, r3, r4)     // Catch:{ IOException -> 0x0054 }
            com.google.api.client.auth.oauth2.r r6 = (com.google.api.client.auth.oauth2.C7232r) r6     // Catch:{ IOException -> 0x0054 }
            java.lang.String r1 = r6.mo25491e()     // Catch:{ IOException -> 0x004a }
            r2 = r1
            goto L_0x0059
        L_0x004a:
            r1 = move-exception
            goto L_0x0056
        L_0x004c:
            java.lang.String r6 = r7.mo29159p()     // Catch:{ IOException -> 0x0054 }
            r5 = r2
            r2 = r6
            r6 = r5
            goto L_0x0059
        L_0x0054:
            r1 = move-exception
            r6 = r2
        L_0x0056:
            r1.printStackTrace()
        L_0x0059:
            java.lang.StringBuilder r7 = com.google.api.client.http.HttpResponseException.m34952a(r7)
            boolean r1 = p076c.p112d.p134b.p135a.p143g.C6404o0.m29729a(r2)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r7.append(r1)
            r7.append(r2)
            r0.mo28844a(r2)
        L_0x006e:
            java.lang.String r7 = r7.toString()
            r0.mo28846b(r7)
            com.google.api.client.auth.oauth2.TokenResponseException r7 = new com.google.api.client.auth.oauth2.TokenResponseException
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.auth.oauth2.TokenResponseException.m34547a(c.d.b.a.d.d, com.google.api.client.http.x):com.google.api.client.auth.oauth2.TokenResponseException");
    }

    /* renamed from: h */
    public final C7232r mo28640h() {
        return this.f20353P;
    }
}
