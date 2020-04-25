package com.google.api.client.http;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6399n0;

public class HttpResponseException extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;

    /* renamed from: N */
    private final transient C7299q f20528N;

    /* renamed from: O */
    private final String f20529O;

    /* renamed from: a */
    private final int f20530a;

    /* renamed from: b */
    private final String f20531b;

    /* renamed from: com.google.api.client.http.HttpResponseException$a */
    public static class C7251a {

        /* renamed from: a */
        int f20532a;

        /* renamed from: b */
        String f20533b;

        /* renamed from: c */
        C7299q f20534c;

        /* renamed from: d */
        String f20535d;

        /* renamed from: e */
        String f20536e;

        public C7251a(int i, String str, C7299q qVar) {
            mo28842a(i);
            mo28848c(str);
            mo28843a(qVar);
        }

        /* renamed from: a */
        public C7251a mo28842a(int i) {
            C6381h0.m29666a(i >= 0);
            this.f20532a = i;
            return this;
        }

        /* renamed from: b */
        public C7251a mo28846b(String str) {
            this.f20536e = str;
            return this;
        }

        /* renamed from: c */
        public C7251a mo28848c(String str) {
            this.f20533b = str;
            return this;
        }

        /* renamed from: d */
        public final String mo28850d() {
            return this.f20536e;
        }

        /* renamed from: e */
        public final int mo28851e() {
            return this.f20532a;
        }

        /* renamed from: f */
        public final String mo28852f() {
            return this.f20533b;
        }

        /* renamed from: b */
        public final String mo28847b() {
            return this.f20535d;
        }

        /* renamed from: c */
        public C7299q mo28849c() {
            return this.f20534c;
        }

        /* renamed from: a */
        public C7251a mo28843a(C7299q qVar) {
            this.f20534c = (C7299q) C6381h0.m29663a(qVar);
            return this;
        }

        /* renamed from: a */
        public C7251a mo28844a(String str) {
            this.f20535d = str;
            return this;
        }

        public C7251a(C7309x xVar) {
            this(xVar.mo29153j(), xVar.mo29154k(), xVar.mo29150g());
            try {
                this.f20535d = xVar.mo29159p();
                if (this.f20535d.length() == 0) {
                    this.f20535d = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            StringBuilder a = HttpResponseException.m34952a(xVar);
            if (this.f20535d != null) {
                a.append(C6399n0.f17828a);
                a.append(this.f20535d);
            }
            this.f20536e = a.toString();
        }

        /* renamed from: a */
        public HttpResponseException mo28845a() {
            return new HttpResponseException(this);
        }
    }

    public HttpResponseException(C7309x xVar) {
        this(new C7251a(xVar));
    }

    /* renamed from: a */
    public final String mo28837a() {
        return this.f20529O;
    }

    /* renamed from: d */
    public C7299q mo28838d() {
        return this.f20528N;
    }

    /* renamed from: e */
    public final int mo28839e() {
        return this.f20530a;
    }

    /* renamed from: f */
    public final String mo28840f() {
        return this.f20531b;
    }

    /* renamed from: g */
    public final boolean mo28841g() {
        return C7311z.m35406b(this.f20530a);
    }

    protected HttpResponseException(C7251a aVar) {
        super(aVar.f20536e);
        this.f20530a = aVar.f20532a;
        this.f20531b = aVar.f20533b;
        this.f20528N = aVar.f20534c;
        this.f20529O = aVar.f20535d;
    }

    /* renamed from: a */
    public static StringBuilder m34952a(C7309x xVar) {
        StringBuilder sb = new StringBuilder();
        int j = xVar.mo29153j();
        if (j != 0) {
            sb.append(j);
        }
        String k = xVar.mo29154k();
        if (k != null) {
            if (j != 0) {
                sb.append(' ');
            }
            sb.append(k);
        }
        return sb;
    }
}
