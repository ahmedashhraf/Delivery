package p076c.p112d.p134b.p135a.p228a.p229a;

import com.facebook.common.util.UriUtil;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7298p;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7308w;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.TreeMap;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.p269s0.C6419c;

@C2766f
/* renamed from: c.d.b.a.a.a.h */
/* compiled from: OAuthParameters */
public final class C6171h implements C7298p, C7308w {

    /* renamed from: l */
    private static final SecureRandom f17389l = new SecureRandom();

    /* renamed from: m */
    private static final C6419c f17390m = new C6419c("-_.~", false);

    /* renamed from: a */
    public C6173j f17391a;

    /* renamed from: b */
    public String f17392b;

    /* renamed from: c */
    public String f17393c;

    /* renamed from: d */
    public String f17394d;

    /* renamed from: e */
    public String f17395e;

    /* renamed from: f */
    public String f17396f;

    /* renamed from: g */
    public String f17397g;

    /* renamed from: h */
    public String f17398h;

    /* renamed from: i */
    public String f17399i;

    /* renamed from: j */
    public String f17400j;

    /* renamed from: k */
    public String f17401k;

    /* renamed from: a */
    public void mo25079a() {
        this.f17394d = Long.toHexString(Math.abs(f17389l.nextLong()));
    }

    /* renamed from: b */
    public void mo25082b() {
        this.f17398h = Long.toString(System.currentTimeMillis() / 1000);
    }

    /* renamed from: c */
    public String mo25084c() {
        StringBuilder sb = new StringBuilder("OAuth");
        m28307a(sb, "realm", this.f17395e);
        m28307a(sb, "oauth_callback", this.f17392b);
        m28307a(sb, "oauth_consumer_key", this.f17393c);
        m28307a(sb, "oauth_nonce", this.f17394d);
        m28307a(sb, "oauth_signature", this.f17396f);
        m28307a(sb, "oauth_signature_method", this.f17397g);
        m28307a(sb, "oauth_timestamp", this.f17398h);
        m28307a(sb, "oauth_token", this.f17399i);
        m28307a(sb, "oauth_verifier", this.f17400j);
        m28307a(sb, "oauth_version", this.f17401k);
        return sb.substring(0, sb.length() - 1);
    }

    /* renamed from: a */
    public void mo25081a(String str, C7274j jVar) throws GeneralSecurityException {
        C6173j jVar2 = this.f17391a;
        String a = jVar2.mo25077a();
        this.f17397g = a;
        TreeMap treeMap = new TreeMap();
        m28309a(treeMap, "oauth_callback", this.f17392b);
        m28309a(treeMap, "oauth_consumer_key", this.f17393c);
        m28309a(treeMap, "oauth_nonce", this.f17394d);
        m28309a(treeMap, "oauth_signature_method", a);
        m28309a(treeMap, "oauth_timestamp", this.f17398h);
        m28309a(treeMap, "oauth_token", this.f17399i);
        m28309a(treeMap, "oauth_verifier", this.f17400j);
        m28309a(treeMap, "oauth_version", this.f17401k);
        for (Entry entry : jVar.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                String str2 = (String) entry.getKey();
                if (value instanceof Collection) {
                    for (Object a2 : (Collection) value) {
                        m28308a(treeMap, str2, a2);
                    }
                } else {
                    m28308a(treeMap, str2, value);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Entry entry2 : treeMap.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(C14662d0.f42852c);
            }
            sb.append((String) entry2.getKey());
            String str3 = (String) entry2.getValue();
            if (str3 != null) {
                sb.append('=');
                sb.append(str3);
            }
        }
        String sb2 = sb.toString();
        C7274j jVar3 = new C7274j();
        String m = jVar.mo28946m();
        jVar3.mo28938g(m);
        jVar3.mo28933e(jVar.mo28939h());
        jVar3.mo28927a(jVar.mo28943i());
        int j = jVar.mo28944j();
        if (("http".equals(m) && j == 80) || (UriUtil.HTTPS_SCHEME.equals(m) && j == 443)) {
            j = -1;
        }
        jVar3.mo28925a(j);
        String d = jVar3.mo28930d();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m28306a(str));
        sb3.append(C14662d0.f42852c);
        sb3.append(m28306a(d));
        sb3.append(C14662d0.f42852c);
        sb3.append(m28306a(sb2));
        this.f17396f = jVar2.mo25078a(sb3.toString());
    }

    /* renamed from: b */
    public void mo25083b(C7305u uVar) throws IOException {
        uVar.mo29086a((C7298p) this);
    }

    /* renamed from: a */
    private void m28307a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(m28306a(str));
            sb.append("=\"");
            sb.append(m28306a(str2));
            sb.append("\",");
        }
    }

    /* renamed from: a */
    private void m28309a(TreeMap<String, String> treeMap, String str, String str2) {
        if (str2 != null) {
            m28308a(treeMap, str, (Object) str2);
        }
    }

    /* renamed from: a */
    private void m28308a(TreeMap<String, String> treeMap, String str, Object obj) {
        treeMap.put(m28306a(str), obj == null ? null : m28306a(obj.toString()));
    }

    /* renamed from: a */
    public static String m28306a(String str) {
        return f17390m.mo25853a(str);
    }

    /* renamed from: a */
    public void mo25080a(C7305u uVar) throws IOException {
        mo25079a();
        mo25082b();
        try {
            mo25081a(uVar.mo29117o(), uVar.mo29126x());
            uVar.mo29111i().mo29020f(mo25084c());
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }
}
