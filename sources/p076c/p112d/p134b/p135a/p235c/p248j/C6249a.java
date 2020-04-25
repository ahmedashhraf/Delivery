package p076c.p112d.p134b.p135a.p235c.p248j;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7307v;
import com.google.api.client.http.C7308w;
import java.io.IOException;
import java.util.logging.Logger;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6404o0;
import p076c.p112d.p134b.p135a.p235c.p239e.C6222b;

/* renamed from: c.d.b.a.c.j.a */
/* compiled from: AbstractGoogleClient */
public abstract class C6249a {

    /* renamed from: j */
    static final Logger f17570j = Logger.getLogger(C6249a.class.getName());

    /* renamed from: a */
    private final C7307v f17571a;

    /* renamed from: b */
    private final C6254d f17572b;

    /* renamed from: c */
    private final String f17573c;

    /* renamed from: d */
    private final String f17574d;

    /* renamed from: e */
    private final String f17575e;

    /* renamed from: f */
    private final String f17576f;

    /* renamed from: g */
    private final C6372e0 f17577g;

    /* renamed from: h */
    private final boolean f17578h;

    /* renamed from: i */
    private final boolean f17579i;

    /* renamed from: c.d.b.a.c.j.a$a */
    /* compiled from: AbstractGoogleClient */
    public static abstract class C6250a {

        /* renamed from: a */
        final C7253a0 f17580a;

        /* renamed from: b */
        C6254d f17581b;

        /* renamed from: c */
        C7308w f17582c;

        /* renamed from: d */
        final C6372e0 f17583d;

        /* renamed from: e */
        String f17584e;

        /* renamed from: f */
        String f17585f;

        /* renamed from: g */
        String f17586g;

        /* renamed from: h */
        String f17587h;

        /* renamed from: i */
        boolean f17588i;

        /* renamed from: j */
        boolean f17589j;

        protected C6250a(C7253a0 a0Var, String str, String str2, C6372e0 e0Var, C7308w wVar) {
            this.f17580a = (C7253a0) C6381h0.m29663a(a0Var);
            this.f17583d = e0Var;
            mo25430c(str);
            mo25433d(str2);
            this.f17582c = wVar;
        }

        /* renamed from: a */
        public C6250a mo25422a(C6254d dVar) {
            this.f17581b = dVar;
            return this;
        }

        /* renamed from: a */
        public abstract C6249a mo25426a();

        /* renamed from: b */
        public C6250a mo25427b(String str) {
            this.f17586g = str;
            return this;
        }

        /* renamed from: c */
        public C6250a mo25430c(String str) {
            this.f17584e = C6249a.m28943a(str);
            return this;
        }

        /* renamed from: d */
        public C6250a mo25433d(String str) {
            this.f17585f = C6249a.m28944b(str);
            return this;
        }

        /* renamed from: e */
        public C6372e0 mo25435e() {
            return this.f17583d;
        }

        /* renamed from: f */
        public final String mo25436f() {
            return this.f17584e;
        }

        /* renamed from: g */
        public final String mo25437g() {
            return this.f17585f;
        }

        /* renamed from: h */
        public final boolean mo25438h() {
            return this.f17588i;
        }

        /* renamed from: i */
        public final boolean mo25439i() {
            return this.f17589j;
        }

        /* renamed from: j */
        public final C7253a0 mo25440j() {
            return this.f17580a;
        }

        /* renamed from: a */
        public C6250a mo25423a(C7308w wVar) {
            this.f17582c = wVar;
            return this;
        }

        /* renamed from: b */
        public final String mo25429b() {
            return this.f17587h;
        }

        /* renamed from: c */
        public final C6254d mo25432c() {
            return this.f17581b;
        }

        /* renamed from: d */
        public final C7308w mo25434d() {
            return this.f17582c;
        }

        /* renamed from: a */
        public C6250a mo25424a(String str) {
            this.f17587h = str;
            return this;
        }

        /* renamed from: b */
        public C6250a mo25428b(boolean z) {
            this.f17588i = z;
            return this;
        }

        /* renamed from: c */
        public C6250a mo25431c(boolean z) {
            this.f17589j = z;
            return this;
        }

        /* renamed from: a */
        public C6250a mo25425a(boolean z) {
            return mo25428b(true).mo25431c(true);
        }
    }

    protected C6249a(C6250a aVar) {
        this.f17572b = aVar.f17581b;
        this.f17573c = m28943a(aVar.f17584e);
        this.f17574d = m28944b(aVar.f17585f);
        this.f17575e = aVar.f17586g;
        if (C6404o0.m29729a(aVar.f17587h)) {
            f17570j.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.f17576f = aVar.f17587h;
        C7308w wVar = aVar.f17582c;
        this.f17571a = wVar == null ? aVar.f17580a.mo28859b() : aVar.f17580a.mo28858a(wVar);
        this.f17577g = aVar.f17583d;
        this.f17578h = aVar.f17588i;
        this.f17579i = aVar.f17589j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25412a(C6251b<?> bVar) throws IOException {
        if (mo25415d() != null) {
            mo25415d().mo25473a(bVar);
        }
    }

    /* renamed from: b */
    public final String mo25413b() {
        return this.f17576f;
    }

    /* renamed from: c */
    public final String mo25414c() {
        String valueOf = String.valueOf(this.f17573c);
        String valueOf2 = String.valueOf(this.f17574d);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: d */
    public final C6254d mo25415d() {
        return this.f17572b;
    }

    /* renamed from: e */
    public C6372e0 mo25416e() {
        return this.f17577g;
    }

    /* renamed from: f */
    public final C7307v mo25417f() {
        return this.f17571a;
    }

    /* renamed from: g */
    public final String mo25418g() {
        return this.f17573c;
    }

    /* renamed from: h */
    public final String mo25419h() {
        return this.f17574d;
    }

    /* renamed from: i */
    public final boolean mo25420i() {
        return this.f17578h;
    }

    /* renamed from: j */
    public final boolean mo25421j() {
        return this.f17579i;
    }

    /* renamed from: b */
    static String m28944b(String str) {
        C6381h0.m29664a(str, (Object) "service path cannot be null");
        String str2 = "/";
        if (str.length() == 1) {
            C6381h0.m29667a(str2.equals(str), (Object) "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith(str2)) {
                str = String.valueOf(str).concat(str2);
            }
            return str.startsWith(str2) ? str.substring(1) : str;
        }
    }

    /* renamed from: a */
    public final C6222b mo25410a() {
        return mo25411a((C7308w) null);
    }

    /* renamed from: a */
    public final C6222b mo25411a(C7308w wVar) {
        C6222b bVar = new C6222b(mo25417f().mo29134b(), wVar);
        String valueOf = String.valueOf(mo25418g());
        String valueOf2 = String.valueOf(this.f17575e);
        bVar.mo25340a(new C7274j(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)));
        return bVar;
    }

    /* renamed from: a */
    static String m28943a(String str) {
        C6381h0.m29664a(str, (Object) "root URL cannot be null.");
        String str2 = "/";
        return !str.endsWith(str2) ? String.valueOf(str).concat(str2) : str;
    }
}
