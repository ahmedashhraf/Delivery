package p076c.p112d.p134b.p135a.p235c.p248j;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.google.api.client.http.C7254b;
import com.google.api.client.http.C7262f;
import com.google.api.client.http.C7267g0;
import com.google.api.client.http.C7271i;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7295m;
import com.google.api.client.http.C7296n;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7304t;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7307v;
import com.google.api.client.http.C7309x;
import com.google.api.client.http.C7310y;
import com.google.api.client.http.HttpResponseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6413s;
import p076c.p112d.p134b.p135a.p235c.C6193b;
import p076c.p112d.p134b.p135a.p235c.p239e.C6221a;
import p076c.p112d.p134b.p135a.p235c.p239e.C6222b;

/* renamed from: c.d.b.a.c.j.b */
/* compiled from: AbstractGoogleClientRequest */
public abstract class C6251b<T> extends C6413s {

    /* renamed from: Z */
    public static final String f17590Z = "Google-API-Java-Client";

    /* renamed from: N */
    private final C6249a f17591N;

    /* renamed from: O */
    private final String f17592O;

    /* renamed from: P */
    private final String f17593P;

    /* renamed from: Q */
    private final C7295m f17594Q;

    /* renamed from: R */
    private C7299q f17595R = new C7299q();

    /* renamed from: S */
    private C7299q f17596S;

    /* renamed from: T */
    private int f17597T = -1;

    /* renamed from: U */
    private String f17598U;

    /* renamed from: V */
    private boolean f17599V;

    /* renamed from: W */
    private Class<T> f17600W;

    /* renamed from: X */
    private MediaHttpUploader f17601X;

    /* renamed from: Y */
    private MediaHttpDownloader f17602Y;

    /* renamed from: c.d.b.a.c.j.b$a */
    /* compiled from: AbstractGoogleClientRequest */
    class C6252a implements C7310y {

        /* renamed from: a */
        final /* synthetic */ C7310y f17603a;

        /* renamed from: b */
        final /* synthetic */ C7305u f17604b;

        C6252a(C7310y yVar, C7305u uVar) {
            this.f17603a = yVar;
            this.f17604b = uVar;
        }

        /* renamed from: a */
        public void mo25471a(C7309x xVar) throws IOException {
            C7310y yVar = this.f17603a;
            if (yVar != null) {
                yVar.mo25471a(xVar);
            }
            if (!xVar.mo29158o() && this.f17604b.mo29123u()) {
                throw C6251b.this.mo25443a(xVar);
            }
        }
    }

    protected C6251b(C6249a aVar, String str, String str2, C7295m mVar, Class<T> cls) {
        this.f17600W = (Class) C6381h0.m29663a(cls);
        this.f17591N = (C6249a) C6381h0.m29663a(aVar);
        this.f17592O = (String) C6381h0.m29663a(str);
        this.f17593P = (String) C6381h0.m29663a(str2);
        this.f17594Q = mVar;
        String b = aVar.mo25413b();
        String str3 = f17590Z;
        if (b != null) {
            C7299q qVar = this.f17595R;
            String valueOf = String.valueOf(String.valueOf(b));
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + str3.length());
            sb.append(valueOf);
            sb.append(C3868i.f12248b);
            sb.append(str3);
            qVar.mo29059z(sb.toString());
            return;
        }
        this.f17595R.mo29059z(str3);
    }

    /* renamed from: c */
    private C7309x m28977c(boolean z) throws IOException {
        C7309x xVar;
        if (this.f17601X == null) {
            xVar = m28976b(z).mo29092a();
        } else {
            C7274j e = mo25450e();
            boolean u = mo25458m().mo25417f().mo29132a(this.f17592O, e, this.f17594Q).mo29123u();
            xVar = this.f17601X.mo28816a(this.f17595R).mo28820b(this.f17599V).mo28819a(e);
            xVar.mo29152i().mo29079a(mo25458m().mo25416e());
            if (u && !xVar.mo29158o()) {
                throw mo25443a(xVar);
            }
        }
        this.f17596S = xVar.mo29150g();
        this.f17597T = xVar.mo29153j();
        this.f17598U = xVar.mo29154k();
        return xVar;
    }

    /* renamed from: a */
    public C6251b<T> mo25442a(boolean z) {
        this.f17599V = z;
        return this;
    }

    /* renamed from: d */
    public C7305u mo25449d() throws IOException {
        return m28976b(false);
    }

    /* renamed from: e */
    public C7274j mo25450e() {
        return new C7274j(C7267g0.m35074a(this.f17591N.mo25414c(), this.f17593P, (Object) this, true));
    }

    public T execute() throws IOException {
        return mo25456j().mo29141a(this.f17600W);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C7305u mo25452f() throws IOException {
        return m28976b(true);
    }

    /* renamed from: g */
    public InputStream mo25453g() throws IOException {
        return mo25456j().mo29145b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C7309x mo25454h() throws IOException {
        m28986b("alt", (Object) "media");
        return mo25456j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public InputStream mo25455i() throws IOException {
        return mo25454h().mo29145b();
    }

    /* renamed from: j */
    public C7309x mo25456j() throws IOException {
        return m28977c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C7309x mo25457l() throws IOException {
        C6381h0.m29666a(this.f17601X == null);
        C7309x c = m28977c(true);
        c.mo29156m();
        return c;
    }

    /* renamed from: m */
    public C6249a mo25458m() {
        return this.f17591N;
    }

    /* renamed from: n */
    public final boolean mo25459n() {
        return this.f17599V;
    }

    /* renamed from: o */
    public final C7295m mo25460o() {
        return this.f17594Q;
    }

    /* renamed from: p */
    public final C7299q mo25461p() {
        return this.f17596S;
    }

    /* renamed from: q */
    public final int mo25462q() {
        return this.f17597T;
    }

    /* renamed from: r */
    public final String mo25463r() {
        return this.f17598U;
    }

    /* renamed from: s */
    public final MediaHttpDownloader mo25464s() {
        return this.f17602Y;
    }

    /* renamed from: t */
    public final MediaHttpUploader mo25465t() {
        return this.f17601X;
    }

    /* renamed from: u */
    public final C7299q mo25466u() {
        return this.f17595R;
    }

    /* renamed from: v */
    public final String mo25467v() {
        return this.f17592O;
    }

    /* renamed from: w */
    public final Class<T> mo25468w() {
        return this.f17600W;
    }

    /* renamed from: x */
    public final String mo25469x() {
        return this.f17593P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo25470y() {
        C7307v f = this.f17591N.mo25417f();
        this.f17602Y = new MediaHttpDownloader(f.mo29134b(), f.mo29133a());
    }

    /* renamed from: b */
    private C7305u m28976b(boolean z) throws IOException {
        String str;
        boolean z2 = true;
        C6381h0.m29666a(this.f17601X == null);
        if (z && !this.f17592O.equals("GET")) {
            z2 = false;
        }
        C6381h0.m29666a(z2);
        if (z) {
            str = "HEAD";
        } else {
            str = this.f17592O;
        }
        C7305u a = mo25458m().mo25417f().mo29132a(str, mo25450e(), this.f17594Q);
        new C6193b().mo25080a(a);
        a.mo29079a(mo25458m().mo25416e());
        if (this.f17594Q == null && (this.f17592O.equals("POST") || this.f17592O.equals("PUT") || this.f17592O.equals(C7304t.f20670f))) {
            a.mo29084a((C7295m) new C7262f());
        }
        a.mo29111i().putAll(this.f17595R);
        if (!this.f17599V) {
            a.mo29085a((C7296n) new C7271i());
        }
        a.mo29089a((C7310y) new C6252a(a.mo29119q(), a));
        return a;
    }

    /* renamed from: a */
    public C6251b<T> mo25441a(C7299q qVar) {
        this.f17595R = qVar;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25445a(C7254b bVar) {
        C7307v f = this.f17591N.mo25417f();
        this.f17601X = new MediaHttpUploader(bVar, f.mo29134b(), f.mo29133a());
        this.f17601X.mo28817a(this.f17592O);
        C7295m mVar = this.f17594Q;
        if (mVar != null) {
            this.f17601X.mo28815a(mVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IOException mo25443a(C7309x xVar) {
        return new HttpResponseException(xVar);
    }

    /* renamed from: a */
    public void mo25446a(OutputStream outputStream) throws IOException {
        mo25456j().mo29144a(outputStream);
    }

    /* renamed from: a */
    public final <E> void mo25444a(C6222b bVar, Class<E> cls, C6221a<T, E> aVar) throws IOException {
        C6381h0.m29667a(this.f17601X == null, (Object) "Batching media requests is not supported");
        bVar.mo25341a(mo25449d(), mo25468w(), cls, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25447a(Object obj, String str) {
        C6381h0.m29668a(this.f17591N.mo25421j() || obj != null, "Required parameter %s must be specified", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25448b(OutputStream outputStream) throws IOException {
        MediaHttpDownloader mediaHttpDownloader = this.f17602Y;
        if (mediaHttpDownloader == null) {
            mo25454h().mo29144a(outputStream);
        } else {
            mediaHttpDownloader.mo28802a(mo25450e(), this.f17595R, outputStream);
        }
    }

    /* renamed from: b */
    public C6251b<T> m28986b(String str, Object obj) {
        return (C6251b) super.mo25098b(str, obj);
    }
}
