package com.google.api.client.googleapis.json;

import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7309x;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C7251a;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

public class GoogleJsonResponseException extends HttpResponseException {
    private static final long serialVersionUID = 409811126989994864L;

    /* renamed from: P */
    private final transient C7245a f20476P;

    public GoogleJsonResponseException(C7251a aVar, C7245a aVar2) {
        super(aVar);
        this.f20476P = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[SYNTHETIC, Splitter:B:27:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ IOException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0089 A[SYNTHETIC, Splitter:B:44:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d A[Catch:{ IOException -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0098 A[Catch:{ IOException -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009e A[Catch:{ IOException -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.googleapis.json.GoogleJsonResponseException m34865a(p076c.p112d.p134b.p135a.p136d.C6290d r5, com.google.api.client.http.C7309x r6) {
        /*
            com.google.api.client.http.HttpResponseException$a r0 = new com.google.api.client.http.HttpResponseException$a
            int r1 = r6.mo29153j()
            java.lang.String r2 = r6.mo29154k()
            com.google.api.client.http.q r3 = r6.mo29150g()
            r0.<init>(r1, r2, r3)
            p076c.p112d.p134b.p135a.p143g.C6381h0.m29663a(r5)
            r1 = 0
            boolean r2 = r6.mo29158o()     // Catch:{ IOException -> 0x00ab }
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = "application/json; charset=UTF-8"
            java.lang.String r3 = r6.mo29149f()     // Catch:{ IOException -> 0x00ab }
            boolean r2 = com.google.api.client.http.C7303s.m35304b(r2, r3)     // Catch:{ IOException -> 0x00ab }
            if (r2 == 0) goto L_0x00a6
            java.io.InputStream r2 = r6.mo29145b()     // Catch:{ IOException -> 0x00ab }
            if (r2 == 0) goto L_0x00a6
            java.io.InputStream r2 = r6.mo29145b()     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            c.d.b.a.d.g r5 = r5.mo25141a(r2)     // Catch:{ IOException -> 0x0081, all -> 0x007d }
            c.d.b.a.d.j r2 = r5.mo25173e()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            if (r2 != 0) goto L_0x003f
            c.d.b.a.d.j r2 = r5.mo25182n()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
        L_0x003f:
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = "error"
            r5.mo25521a(r2)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            c.d.b.a.d.j r2 = r5.mo25173e()     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            c.d.b.a.d.j r3 = p076c.p112d.p134b.p135a.p136d.C6296j.END_OBJECT     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            if (r2 == r3) goto L_0x0068
            java.lang.Class<com.google.api.client.googleapis.json.a> r2 = com.google.api.client.googleapis.json.C7245a.class
            java.lang.Object r2 = r5.mo25524b(r2)     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            com.google.api.client.googleapis.json.a r2 = (com.google.api.client.googleapis.json.C7245a) r2     // Catch:{ IOException -> 0x007a, all -> 0x0077 }
            java.lang.String r1 = r2.mo25491e()     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0069
        L_0x005e:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0096
        L_0x0063:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0084
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r5 != 0) goto L_0x0071
            r6.mo29156m()     // Catch:{ IOException -> 0x006f }
            goto L_0x00b0
        L_0x006f:
            r5 = move-exception
            goto L_0x00ad
        L_0x0071:
            if (r1 != 0) goto L_0x00b0
            r5.mo25169a()     // Catch:{ IOException -> 0x006f }
            goto L_0x00b0
        L_0x0077:
            r2 = move-exception
            r3 = r1
            goto L_0x0096
        L_0x007a:
            r2 = move-exception
            r3 = r1
            goto L_0x0084
        L_0x007d:
            r2 = move-exception
            r5 = r1
            r3 = r5
            goto L_0x0096
        L_0x0081:
            r2 = move-exception
            r5 = r1
            r3 = r5
        L_0x0084:
            r2.printStackTrace()     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x008d
            r6.mo29156m()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x0092
        L_0x008d:
            if (r3 != 0) goto L_0x0092
            r5.mo25169a()     // Catch:{ IOException -> 0x00a2 }
        L_0x0092:
            r2 = r1
            r1 = r3
            goto L_0x00b0
        L_0x0095:
            r2 = move-exception
        L_0x0096:
            if (r5 == 0) goto L_0x009e
            if (r3 != 0) goto L_0x00a1
            r5.mo25169a()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a1
        L_0x009e:
            r6.mo29156m()     // Catch:{ IOException -> 0x00a2 }
        L_0x00a1:
            throw r2     // Catch:{ IOException -> 0x00a2 }
        L_0x00a2:
            r5 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x00ad
        L_0x00a6:
            java.lang.String r2 = r6.mo29159p()     // Catch:{ IOException -> 0x00ab }
            goto L_0x00b0
        L_0x00ab:
            r5 = move-exception
            r2 = r1
        L_0x00ad:
            r5.printStackTrace()
        L_0x00b0:
            java.lang.StringBuilder r5 = com.google.api.client.http.HttpResponseException.m34952a(r6)
            boolean r6 = p076c.p112d.p134b.p135a.p143g.C6404o0.m29729a(r2)
            if (r6 != 0) goto L_0x00c5
            java.lang.String r6 = p076c.p112d.p134b.p135a.p143g.C6399n0.f17828a
            r5.append(r6)
            r5.append(r2)
            r0.mo28844a(r2)
        L_0x00c5:
            java.lang.String r5 = r5.toString()
            r0.mo28846b(r5)
            com.google.api.client.googleapis.json.GoogleJsonResponseException r5 = new com.google.api.client.googleapis.json.GoogleJsonResponseException
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.json.GoogleJsonResponseException.m34865a(c.d.b.a.d.d, com.google.api.client.http.x):com.google.api.client.googleapis.json.GoogleJsonResponseException");
    }

    /* renamed from: h */
    public final C7245a mo28777h() {
        return this.f20476P;
    }

    /* renamed from: a */
    public static C7309x m34866a(C6290d dVar, C7305u uVar) throws GoogleJsonResponseException, IOException {
        C6381h0.m29663a(dVar);
        boolean u = uVar.mo29123u();
        if (u) {
            uVar.mo29108f(false);
        }
        C7309x a = uVar.mo29092a();
        uVar.mo29108f(u);
        if (!u || a.mo29158o()) {
            return a;
        }
        throw m34865a(dVar, a);
    }
}
