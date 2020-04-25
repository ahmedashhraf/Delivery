package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.android.gms.auth.api.credentials.C3958f;
import com.google.api.client.http.C7253a0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p228a.p230b.C6178c;
import p076c.p112d.p134b.p135a.p228a.p230b.C6178c.C6179a;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6215l.C6216a;

@C2766f
/* renamed from: c.d.b.a.c.d.a.j */
/* compiled from: GoogleIdTokenVerifier */
public class C6212j extends C6178c {

    /* renamed from: f */
    private final C6215l f17486f;

    @C2766f
    /* renamed from: c.d.b.a.c.d.a.j$a */
    /* compiled from: GoogleIdTokenVerifier */
    public static class C6213a extends C6179a {

        /* renamed from: e */
        C6215l f17487e;

        public C6213a(C7253a0 a0Var, C6290d dVar) {
            this(new C6215l(a0Var, dVar));
        }

        /* renamed from: g */
        public final C6290d mo25313g() {
            return this.f17487e.mo25320c();
        }

        /* renamed from: h */
        public final C6215l mo25314h() {
            return this.f17487e;
        }

        @Deprecated
        /* renamed from: i */
        public final String mo25315i() {
            return this.f17487e.mo25321d();
        }

        /* renamed from: j */
        public final C7253a0 mo25316j() {
            return this.f17487e.mo25323f();
        }

        public C6213a(C6215l lVar) {
            this.f17487e = (C6215l) C6381h0.m29663a(lVar);
            mo25134b((Collection) Arrays.asList(new String[]{"accounts.google.com", C3958f.f12562b}));
        }

        @Deprecated
        /* renamed from: b */
        public C6213a mo25312b(String str) {
            this.f17487e = new C6216a(mo25316j(), mo25313g()).mo25326a(str).mo25325a(this.f17487e.mo25318a()).mo25327a();
            return this;
        }

        /* renamed from: b */
        public C6213a m28743b(Collection<String> collection) {
            return (C6213a) super.mo25134b(collection);
        }

        /* renamed from: a */
        public C6212j m28740a() {
            return new C6212j(this);
        }

        /* renamed from: a */
        public C6213a m28738a(String str) {
            return (C6213a) super.mo25130a(str);
        }

        /* renamed from: a */
        public C6213a m28739a(Collection<String> collection) {
            return (C6213a) super.mo25131a(collection);
        }

        /* renamed from: a */
        public C6213a m28736a(long j) {
            return (C6213a) super.mo25128a(j);
        }

        /* renamed from: a */
        public C6213a m28737a(C6391l lVar) {
            return (C6213a) super.mo25129a(lVar);
        }
    }

    public C6212j(C7253a0 a0Var, C6290d dVar) {
        this(new C6213a(a0Var, dVar));
    }

    /* renamed from: a */
    public boolean mo25304a(C6210i iVar) throws GeneralSecurityException, IOException {
        if (!super.mo25123a(iVar)) {
            return false;
        }
        for (PublicKey a : this.f17486f.mo25322e()) {
            if (iVar.mo25541a(a)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: f */
    public final long mo25305f() {
        return this.f17486f.mo25319b();
    }

    /* renamed from: g */
    public final C6290d mo25306g() {
        return this.f17486f.mo25320c();
    }

    @Deprecated
    /* renamed from: h */
    public final String mo25307h() {
        return this.f17486f.mo25321d();
    }

    @Deprecated
    /* renamed from: i */
    public final List<PublicKey> mo25308i() throws GeneralSecurityException, IOException {
        return this.f17486f.mo25322e();
    }

    /* renamed from: j */
    public final C6215l mo25309j() {
        return this.f17486f;
    }

    /* renamed from: k */
    public final C7253a0 mo25310k() {
        return this.f17486f.mo25323f();
    }

    @Deprecated
    /* renamed from: l */
    public C6212j mo25311l() throws GeneralSecurityException, IOException {
        this.f17486f.mo25324g();
        return this;
    }

    public C6212j(C6215l lVar) {
        this(new C6213a(lVar));
    }

    protected C6212j(C6213a aVar) {
        super(aVar);
        this.f17486f = aVar.f17487e;
    }

    /* renamed from: a */
    public C6210i mo25303a(String str) throws GeneralSecurityException, IOException {
        C6210i a = C6210i.m28666a(mo25306g(), str);
        if (mo25304a(a)) {
            return a;
        }
        return null;
    }
}
