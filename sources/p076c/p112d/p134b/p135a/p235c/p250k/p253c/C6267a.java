package p076c.p112d.p134b.p135a.p235c.p250k.p253c;

import com.facebook.AccessToken;
import com.google.api.client.http.C7259d0;
import com.google.api.client.http.C7261e0;
import java.io.IOException;
import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p136d.C6289c;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.p259k.C6297a;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6219o;
import p076c.p112d.p134b.p135a.p262f.p263a.C6338d;
import p076c.p112d.p134b.p135a.p262f.p263a.C6341f;
import p076c.p112d.p134b.p135a.p262f.p263a.C6342g;

@C2766f
/* renamed from: c.d.b.a.c.k.c.a */
/* compiled from: MockMetadataServerTransport */
public class C6267a extends C6338d {

    /* renamed from: h */
    private static final String f17623h = C6219o.m28801a();

    /* renamed from: i */
    private static final String f17624i = String.valueOf(f17623h).concat("/computeMetadata/v1/instance/service-accounts/default/token");

    /* renamed from: j */
    static final C6290d f17625j = new C6297a();

    /* renamed from: f */
    String f17626f;

    /* renamed from: g */
    Integer f17627g;

    /* renamed from: c.d.b.a.c.k.c.a$a */
    /* compiled from: MockMetadataServerTransport */
    class C6268a extends C6341f {
        C6268a(String str) {
            super(str);
        }

        /* renamed from: a */
        public C7261e0 mo25348a() throws IOException {
            if (C6267a.this.f17627g != null) {
                return new C6342g().mo25666c(C6267a.this.f17627g.intValue()).mo25659a("Token Fetch Error");
            }
            if ("Google".equals(mo25650c("Metadata-Flavor"))) {
                C6288b bVar = new C6288b();
                bVar.mo25489a(C6267a.f17625j);
                bVar.put("access_token", C6267a.this.f17626f);
                bVar.put(AccessToken.EXPIRES_IN_KEY, Integer.valueOf(3600000));
                bVar.put("token_type", "Bearer");
                return new C6342g().mo25667c(C6289c.f17634a).mo25659a(bVar.mo25491e());
            }
            throw new IOException("Metadata request header not found.");
        }
    }

    /* renamed from: c.d.b.a.c.k.c.a$b */
    /* compiled from: MockMetadataServerTransport */
    class C6269b extends C6341f {
        C6269b(String str) {
            super(str);
        }

        /* renamed from: a */
        public C7261e0 mo25348a() {
            C6342g gVar = new C6342g();
            gVar.mo25660a("Metadata-Flavor", "Google");
            return gVar;
        }
    }

    public C6267a(String str) {
        this.f17626f = str;
    }

    /* renamed from: a */
    public void mo25483a(Integer num) {
        this.f17627g = num;
    }

    /* renamed from: a */
    public C7259d0 mo25360a(String str, String str2) throws IOException {
        if (str2.equals(f17624i)) {
            return new C6268a(str2);
        }
        if (str2.equals(f17623h)) {
            return new C6269b(str2);
        }
        return super.mo25360a(str, str2);
    }
}
