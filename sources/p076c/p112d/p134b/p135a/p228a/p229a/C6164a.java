package p076c.p112d.p134b.p135a.p228a.p229a;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7273i0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7309x;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
/* renamed from: c.d.b.a.a.a.a */
/* compiled from: AbstractOAuthGetToken */
public abstract class C6164a extends C7274j {

    /* renamed from: U */
    public C7253a0 f17374U;

    /* renamed from: V */
    public String f17375V;

    /* renamed from: W */
    public C6173j f17376W;

    /* renamed from: X */
    protected boolean f17377X;

    protected C6164a(String str) {
        super(str);
    }

    public final C6167d execute() throws IOException {
        C7305u a = this.f17374U.mo28859b().mo29132a(this.f17377X ? "POST" : "GET", this, null);
        mo25076q().mo25080a(a);
        C7309x a2 = a.mo29092a();
        a2.mo29139a(0);
        C6167d dVar = new C6167d();
        C7273i0.m35101a(a2.mo29159p(), (Object) dVar);
        return dVar;
    }

    /* renamed from: q */
    public C6171h mo25076q() {
        C6171h hVar = new C6171h();
        hVar.f17393c = this.f17375V;
        hVar.f17391a = this.f17376W;
        return hVar;
    }
}
