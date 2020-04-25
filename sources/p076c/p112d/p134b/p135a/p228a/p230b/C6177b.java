package p076c.p112d.p134b.p135a.p228a.p230b;

import com.google.api.client.auth.oauth2.C7233s;
import com.google.api.client.auth.oauth2.C7236t;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.a.b.b */
/* compiled from: IdTokenResponse */
public class C6177b extends C7236t {
    @C2768v("id_token")

    /* renamed from: T */
    private String f17409T;

    /* renamed from: e */
    public C6177b mo25119e(String str) {
        this.f17409T = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: l */
    public final String mo25120l() {
        return this.f17409T;
    }

    /* renamed from: m */
    public C6175a mo25121m() throws IOException {
        return C6175a.m28320a(mo25490d(), this.f17409T);
    }

    /* renamed from: c */
    public C6177b m28373c(String str) {
        super.mo25117c(str);
        return this;
    }

    /* renamed from: d */
    public C6177b m28375d(String str) {
        super.mo25118d(str);
        return this;
    }

    /* renamed from: a */
    public C6177b m28365a(String str) {
        super.mo25115a(str);
        return this;
    }

    /* renamed from: a */
    public C6177b m28364a(Long l) {
        super.mo25114a(l);
        return this;
    }

    /* renamed from: a */
    public static C6177b m28361a(C7233s sVar) throws IOException {
        return (C6177b) sVar.mo28741d().mo29141a(C6177b.class);
    }

    /* renamed from: b */
    public C6177b m28370b(String str) {
        super.mo25116b(str);
        return this;
    }

    public C6177b clone() {
        return (C6177b) super.clone();
    }

    /* renamed from: b */
    public C6177b m28371b(String str, Object obj) {
        return (C6177b) super.m34821b(str, obj);
    }
}
