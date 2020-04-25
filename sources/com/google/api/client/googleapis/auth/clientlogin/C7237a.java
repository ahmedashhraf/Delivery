package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.http.C7309x;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6372e0;

@C2766f
/* renamed from: com.google.api.client.googleapis.auth.clientlogin.a */
/* compiled from: AuthKeyValueParser */
final class C7237a implements C6372e0 {

    /* renamed from: a */
    public static final C7237a f20451a = new C7237a();

    private C7237a() {
    }

    /* renamed from: a */
    public <T> T mo28755a(C7309x xVar, Class<T> cls) throws IOException {
        xVar.mo29139a(0);
        InputStream b = xVar.mo29145b();
        try {
            return mo28756a(b, cls);
        } finally {
            b.close();
        }
    }

    /* renamed from: a */
    public String mo28757a() {
        return "text/plain";
    }

    /* JADX WARNING: type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo28756a(java.io.InputStream r7, java.lang.Class<T> r8) throws java.io.IOException {
        /*
            r6 = this;
            c.d.b.a.g.k r0 = p076c.p112d.p134b.p135a.p143g.C6387k.m29691a(r8)
            java.lang.Object r1 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29766a(r8)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r7)
            r2.<init>(r3)
        L_0x0012:
            java.lang.String r7 = r2.readLine()
            if (r7 != 0) goto L_0x0019
            return r1
        L_0x0019:
            r3 = 61
            int r3 = r7.indexOf(r3)
            r4 = 0
            java.lang.String r4 = r7.substring(r4, r3)
            int r3 = r3 + 1
            java.lang.String r7 = r7.substring(r3)
            java.lang.reflect.Field r3 = r0.mo25767a(r4)
            if (r3 == 0) goto L_0x0044
            java.lang.Class r4 = r3.getType()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r4 == r5) goto L_0x003c
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r4 != r5) goto L_0x0040
        L_0x003c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x0040:
            p076c.p112d.p134b.p135a.p143g.C6412r.m29780a(r3, r1, r7)
            goto L_0x0012
        L_0x0044:
            java.lang.Class<c.d.b.a.g.s> r3 = p076c.p112d.p134b.p135a.p143g.C6413s.class
            boolean r3 = r3.isAssignableFrom(r8)
            if (r3 == 0) goto L_0x0053
            r3 = r1
            c.d.b.a.g.s r3 = (p076c.p112d.p134b.p135a.p143g.C6413s) r3
            r3.mo25098b(r4, r7)
            goto L_0x0012
        L_0x0053:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r8)
            if (r3 == 0) goto L_0x0012
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r4, r7)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.auth.clientlogin.C7237a.mo28756a(java.io.InputStream, java.lang.Class):java.lang.Object");
    }

    /* renamed from: a */
    public <T> T mo25503a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo25505a((Reader) new InputStreamReader(inputStream, charset), cls);
    }

    /* renamed from: a */
    public Object mo25504a(InputStream inputStream, Charset charset, Type type) {
        throw new UnsupportedOperationException("Type-based parsing is not yet supported -- use Class<T> instead");
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo25505a(java.io.Reader r8, java.lang.Class<T> r9) throws java.io.IOException {
        /*
            r7 = this;
            c.d.b.a.g.k r0 = p076c.p112d.p134b.p135a.p143g.C6387k.m29691a(r9)     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = p076c.p112d.p134b.p135a.p143g.C6409q0.m29766a(r9)     // Catch:{ all -> 0x0060 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0060 }
            r2.<init>(r8)     // Catch:{ all -> 0x0060 }
        L_0x000d:
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x0017
            r8.close()
            return r1
        L_0x0017:
            r4 = 61
            int r4 = r3.indexOf(r4)     // Catch:{ all -> 0x0060 }
            r5 = 0
            java.lang.String r5 = r3.substring(r5, r4)     // Catch:{ all -> 0x0060 }
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ all -> 0x0060 }
            java.lang.reflect.Field r4 = r0.mo25767a(r5)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x0042
            java.lang.Class r5 = r4.getType()     // Catch:{ all -> 0x0060 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0060 }
            if (r5 == r6) goto L_0x003a
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            if (r5 != r6) goto L_0x003e
        L_0x003a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0060 }
        L_0x003e:
            p076c.p112d.p134b.p135a.p143g.C6412r.m29780a(r4, r1, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x000d
        L_0x0042:
            java.lang.Class<c.d.b.a.g.s> r4 = p076c.p112d.p134b.p135a.p143g.C6413s.class
            boolean r4 = r4.isAssignableFrom(r9)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x0051
            r4 = r1
            c.d.b.a.g.s r4 = (p076c.p112d.p134b.p135a.p143g.C6413s) r4     // Catch:{ all -> 0x0060 }
            r4.mo25098b(r5, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x000d
        L_0x0051:
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r9)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x000d
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0060 }
            r4.put(r5, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x000d
        L_0x0060:
            r9 = move-exception
            r8.close()
            goto L_0x0066
        L_0x0065:
            throw r9
        L_0x0066:
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.auth.clientlogin.C7237a.mo25505a(java.io.Reader, java.lang.Class):java.lang.Object");
    }

    /* renamed from: a */
    public Object mo25506a(Reader reader, Type type) {
        throw new UnsupportedOperationException("Type-based parsing is not yet supported -- use Class<T> instead");
    }
}
