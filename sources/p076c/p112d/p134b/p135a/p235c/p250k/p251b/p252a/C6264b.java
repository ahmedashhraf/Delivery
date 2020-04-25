package p076c.p112d.p134b.p135a.p235c.p250k.p251b.p252a;

import com.facebook.AccessToken;
import com.google.api.client.http.C7259d0;
import com.google.api.client.http.C7261e0;
import com.mrsool.utils.webservice.C11687c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p076c.p112d.p134b.p135a.p136d.C6288b;
import p076c.p112d.p134b.p135a.p136d.C6289c;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.p259k.C6297a;
import p076c.p112d.p134b.p135a.p136d.p261m.C6303a;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6214k;
import p076c.p112d.p134b.p135a.p235c.p250k.C6259a;
import p076c.p112d.p134b.p135a.p262f.p263a.C6338d;
import p076c.p112d.p134b.p135a.p262f.p263a.C6341f;
import p076c.p112d.p134b.p135a.p262f.p263a.C6342g;

@C2766f
/* renamed from: c.d.b.a.c.k.b.a.b */
/* compiled from: MockTokenServerTransport */
public class C6264b extends C6338d {

    /* renamed from: j */
    static final String f17616j = "urn:ietf:params:oauth:grant-type:jwt-bearer";

    /* renamed from: k */
    static final C6290d f17617k = new C6297a();

    /* renamed from: f */
    final String f17618f;

    /* renamed from: g */
    Map<String, String> f17619g;

    /* renamed from: h */
    Map<String, String> f17620h;

    /* renamed from: i */
    Map<String, String> f17621i;

    /* renamed from: c.d.b.a.c.k.b.a.b$a */
    /* compiled from: MockTokenServerTransport */
    class C6265a extends C6341f {
        C6265a(String str) {
            super(str);
        }

        /* renamed from: a */
        public C7261e0 mo25348a() throws IOException {
            String str;
            Map a = C6259a.m29053a(mo25653f());
            String str2 = (String) a.get("client_id");
            if (str2 == null) {
                String str3 = "grant_type";
                if (a.containsKey(str3)) {
                    if (C6264b.f17616j.equals((String) a.get(str3))) {
                        C6303a a2 = C6303a.m29299a(C6264b.f17617k, (String) a.get("assertion"));
                        String j = a2.mo25088b().mo25578j();
                        if (C6264b.this.f17619g.containsKey(j)) {
                            String str4 = (String) C6264b.this.f17619g.get(j);
                            String str5 = (String) a2.mo25088b().get("scope");
                            if (str5 == null || str5.length() == 0) {
                                throw new IOException("Scopes not found.");
                            }
                            str = str4;
                        } else {
                            throw new IOException("Service Account Email not found as issuer.");
                        }
                    } else {
                        throw new IOException("Unexpected Grant Type.");
                    }
                } else {
                    throw new IOException("Unknown token type.");
                }
            } else if (C6264b.this.f17620h.containsKey(str2)) {
                String str6 = (String) a.get(C11687c.f33834s0);
                String str7 = (String) C6264b.this.f17620h.get(str2);
                if (str6 == null || !str6.equals(str7)) {
                    throw new IOException("Client secret not found.");
                }
                String str8 = (String) a.get("refresh_token");
                if (C6264b.this.f17621i.containsKey(str8)) {
                    str = (String) C6264b.this.f17621i.get(str8);
                } else {
                    throw new IOException("Refresh Token not found.");
                }
            } else {
                throw new IOException("Client ID not found.");
            }
            C6288b bVar = new C6288b();
            bVar.mo25489a(C6264b.f17617k);
            bVar.put("access_token", str);
            bVar.put(AccessToken.EXPIRES_IN_KEY, Integer.valueOf(3600000));
            bVar.put("token_type", "Bearer");
            return new C6342g().mo25667c(C6289c.f17634a).mo25659a(bVar.mo25491e());
        }
    }

    public C6264b() {
        this(C6214k.f17489b);
    }

    /* renamed from: a */
    public C7259d0 mo25360a(String str, String str2) throws IOException {
        if (str2.equals(this.f17618f)) {
            return new C6265a(str2);
        }
        return super.mo25360a(str, str2);
    }

    /* renamed from: b */
    public void mo25480b(String str, String str2) {
        this.f17620h.put(str, str2);
    }

    /* renamed from: c */
    public void mo25481c(String str, String str2) {
        this.f17621i.put(str, str2);
    }

    /* renamed from: d */
    public void mo25482d(String str, String str2) {
        this.f17619g.put(str, str2);
    }

    public C6264b(String str) {
        this.f17619g = new HashMap();
        this.f17620h = new HashMap();
        this.f17621i = new HashMap();
        this.f17618f = str;
    }
}
