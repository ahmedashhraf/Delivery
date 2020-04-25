package p076c.p112d.p134b.p135a.p235c;

import com.google.api.client.http.C7262f;
import com.google.api.client.http.C7270h0;
import com.google.api.client.http.C7295m;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import java.io.IOException;

/* renamed from: c.d.b.a.c.b */
/* compiled from: MethodOverride */
public final class C6193b implements C7298p, C7308w {

    /* renamed from: b */
    public static final String f17435b = "X-HTTP-Method-Override";

    /* renamed from: c */
    static final int f17436c = 2048;

    /* renamed from: a */
    private final boolean f17437a;

    /* renamed from: c.d.b.a.c.b$a */
    /* compiled from: MethodOverride */
    public static final class C6194a {

        /* renamed from: a */
        private boolean f17438a;

        /* renamed from: a */
        public C6193b mo25185a() {
            return new C6193b(this.f17438a);
        }

        /* renamed from: b */
        public boolean mo25186b() {
            return this.f17438a;
        }

        /* renamed from: a */
        public C6194a mo25184a(boolean z) {
            this.f17438a = z;
            return this;
        }
    }

    public C6193b() {
        this(false);
    }

    /* renamed from: c */
    private boolean m28442c(C7305u uVar) throws IOException {
        String o = uVar.mo29117o();
        if (o.equals("POST")) {
            return false;
        }
        if (!o.equals("GET") ? !this.f17437a : uVar.mo29126x().mo28930d().length() <= 2048) {
            return !uVar.mo29124v().mo25637a(o);
        }
        return true;
    }

    /* renamed from: a */
    public void mo25080a(C7305u uVar) throws IOException {
        if (m28442c(uVar)) {
            String o = uVar.mo29117o();
            uVar.mo29090a("POST");
            uVar.mo29111i().mo25098b(f17435b, (Object) o);
            if (o.equals("GET")) {
                uVar.mo29084a((C7295m) new C7270h0(uVar.mo29126x().clone()));
                uVar.mo29126x().clear();
            } else if (uVar.mo29105e() == null) {
                uVar.mo29084a((C7295m) new C7262f());
            }
        }
    }

    /* renamed from: b */
    public void mo25083b(C7305u uVar) {
        uVar.mo29086a((C7298p) this);
    }

    C6193b(boolean z) {
        this.f17437a = z;
    }
}
