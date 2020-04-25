package p468g;

import com.google.api.client.http.C7304t;
import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.C14910b;
import okhttp3.internal.p516g.C14948f;
import p201f.p202a.C5952h;
import p468g.C13866u.C13867a;

/* renamed from: g.c0 */
/* compiled from: Request */
public final class C13813c0 {

    /* renamed from: a */
    final C13868v f39923a;

    /* renamed from: b */
    final String f39924b;

    /* renamed from: c */
    final C13866u f39925c;
    @C5952h

    /* renamed from: d */
    final C13817d0 f39926d;

    /* renamed from: e */
    final Map<Class<?>, Object> f39927e;
    @C5952h

    /* renamed from: f */
    private volatile C13815d f39928f;

    /* renamed from: g.c0$a */
    /* compiled from: Request */
    public static class C13814a {
        @C5952h

        /* renamed from: a */
        C13868v f39929a;

        /* renamed from: b */
        String f39930b;

        /* renamed from: c */
        C13867a f39931c;
        @C5952h

        /* renamed from: d */
        C13817d0 f39932d;

        /* renamed from: e */
        Map<Class<?>, Object> f39933e;

        public C13814a() {
            this.f39933e = Collections.emptyMap();
            this.f39930b = "GET";
            this.f39931c = new C13867a();
        }

        /* renamed from: a */
        public C13814a mo43364a(C13868v vVar) {
            if (vVar != null) {
                this.f39929a = vVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: b */
        public C13814a mo43374b(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                return mo43364a(C13868v.m59278f(str));
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: c */
        public C13814a mo43376c() {
            return mo43368a("GET", (C13817d0) null);
        }

        /* renamed from: d */
        public C13814a mo43378d() {
            return mo43368a("HEAD", (C13817d0) null);
        }

        /* renamed from: c */
        public C13814a mo43377c(C13817d0 d0Var) {
            return mo43368a("POST", d0Var);
        }

        /* renamed from: d */
        public C13814a mo43379d(C13817d0 d0Var) {
            return mo43368a("PUT", d0Var);
        }

        /* renamed from: a */
        public C13814a mo43370a(URL url) {
            if (url != null) {
                return mo43364a(C13868v.m59278f(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        C13814a(C13813c0 c0Var) {
            Map<Class<?>, Object> map;
            this.f39933e = Collections.emptyMap();
            this.f39929a = c0Var.f39923a;
            this.f39930b = c0Var.f39924b;
            this.f39932d = c0Var.f39926d;
            if (c0Var.f39927e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(c0Var.f39927e);
            }
            this.f39933e = map;
            this.f39931c = c0Var.f39925c.mo43616c();
        }

        /* renamed from: a */
        public C13814a mo43369a(String str, String str2) {
            this.f39931c.mo43625a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13814a mo43367a(String str) {
            this.f39931c.mo43633d(str);
            return this;
        }

        /* renamed from: a */
        public C13814a mo43363a(C13866u uVar) {
            this.f39931c = uVar.mo43616c();
            return this;
        }

        /* renamed from: b */
        public C13814a mo43375b(String str, String str2) {
            this.f39931c.mo43634d(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13814a mo43362a(C13815d dVar) {
            String dVar2 = dVar.toString();
            String str = "Cache-Control";
            if (dVar2.isEmpty()) {
                return mo43367a(str);
            }
            return mo43375b(str, dVar2);
        }

        /* renamed from: b */
        public C13814a mo43372b() {
            return mo43361a(C14910b.f43161d);
        }

        /* renamed from: b */
        public C13814a mo43373b(C13817d0 d0Var) {
            return mo43368a(C7304t.f20670f, d0Var);
        }

        /* renamed from: a */
        public C13814a mo43361a(@C5952h C13817d0 d0Var) {
            return mo43368a("DELETE", d0Var);
        }

        /* renamed from: a */
        public C13814a mo43368a(String str, @C5952h C13817d0 d0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() != 0) {
                String str2 = "method ";
                if (d0Var != null && !C14948f.m66245b(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    sb.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb.toString());
                } else if (d0Var != null || !C14948f.m66248e(str)) {
                    this.f39930b = str;
                    this.f39932d = d0Var;
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(" must have a request body.");
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("method.length() == 0");
            }
        }

        /* renamed from: a */
        public C13814a mo43366a(@C5952h Object obj) {
            return mo43365a(Object.class, (T) obj);
        }

        /* renamed from: a */
        public <T> C13814a mo43365a(Class<? super T> cls, @C5952h T t) {
            if (cls != null) {
                if (t == null) {
                    this.f39933e.remove(cls);
                } else {
                    if (this.f39933e.isEmpty()) {
                        this.f39933e = new LinkedHashMap();
                    }
                    this.f39933e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        /* renamed from: a */
        public C13813c0 mo43371a() {
            if (this.f39929a != null) {
                return new C13813c0(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    C13813c0(C13814a aVar) {
        this.f39923a = aVar.f39929a;
        this.f39924b = aVar.f39930b;
        this.f39925c = aVar.f39931c.mo43627a();
        this.f39926d = aVar.f39932d;
        this.f39927e = C14910b.m66051a(aVar.f39933e);
    }

    @C5952h
    /* renamed from: a */
    public String mo43351a(String str) {
        return this.f39925c.mo43612a(str);
    }

    /* renamed from: b */
    public List<String> mo43353b(String str) {
        return this.f39925c.mo43617c(str);
    }

    /* renamed from: c */
    public C13866u mo43354c() {
        return this.f39925c;
    }

    /* renamed from: d */
    public boolean mo43355d() {
        return this.f39923a.mo43651i();
    }

    /* renamed from: e */
    public String mo43356e() {
        return this.f39924b;
    }

    /* renamed from: f */
    public C13814a mo43357f() {
        return new C13814a(this);
    }

    @C5952h
    /* renamed from: g */
    public Object mo43358g() {
        return mo43350a(Object.class);
    }

    /* renamed from: h */
    public C13868v mo43359h() {
        return this.f39923a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f39924b);
        sb.append(", url=");
        sb.append(this.f39923a);
        sb.append(", tags=");
        sb.append(this.f39927e);
        sb.append('}');
        return sb.toString();
    }

    @C5952h
    /* renamed from: a */
    public C13817d0 mo43349a() {
        return this.f39926d;
    }

    /* renamed from: b */
    public C13815d mo43352b() {
        C13815d dVar = this.f39928f;
        if (dVar != null) {
            return dVar;
        }
        C13815d a = C13815d.m59005a(this.f39925c);
        this.f39928f = a;
        return a;
    }

    @C5952h
    /* renamed from: a */
    public <T> T mo43350a(Class<? extends T> cls) {
        return cls.cast(this.f39927e.get(cls));
    }
}
