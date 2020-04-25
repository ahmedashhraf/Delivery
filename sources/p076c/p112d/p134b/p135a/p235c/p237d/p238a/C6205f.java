package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.auth.oauth2.C7219g;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.c.d.a.f */
/* compiled from: GoogleBrowserClientRequestUrl */
public class C6205f extends C7219g {
    @C2768v("approval_prompt")

    /* renamed from: Z */
    private String f17460Z;

    public C6205f(String str, String str2, Collection<String> collection) {
        super(C6214k.f17488a, str);
        m28575l(str2);
        m28568b(collection);
    }

    /* renamed from: n */
    public C6205f mo25235n(String str) {
        this.f17460Z = str;
        return this;
    }

    /* renamed from: v */
    public final String mo25236v() {
        return this.f17460Z;
    }

    /* renamed from: a */
    public C6205f m28561a(Collection<String> collection) {
        return (C6205f) super.mo25218a((Collection) collection);
    }

    /* renamed from: j */
    public C6205f m28572j(String str) {
        return (C6205f) super.mo25220j(str);
    }

    /* renamed from: l */
    public C6205f m28575l(String str) {
        return (C6205f) super.mo25221l(str);
    }

    /* renamed from: m */
    public C6205f m28578m(String str) {
        return (C6205f) super.mo25222m(str);
    }

    public C6205f(C6206g gVar, String str, Collection<String> collection) {
        this(gVar.mo25239f().mo25248g(), str, collection);
    }

    public C6205f clone() {
        return (C6205f) super.clone();
    }

    /* renamed from: b */
    public C6205f m28568b(Collection<String> collection) {
        C6381h0.m29666a(collection.iterator().hasNext());
        return (C6205f) super.mo25219b((Collection) collection);
    }

    /* renamed from: b */
    public C6205f m28569b(String str, Object obj) {
        return (C6205f) super.m34674b(str, obj);
    }
}
