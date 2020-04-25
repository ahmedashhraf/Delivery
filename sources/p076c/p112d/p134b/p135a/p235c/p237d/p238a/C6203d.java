package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.auth.oauth2.C7211b;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p143g.C2768v;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.c.d.a.d */
/* compiled from: GoogleAuthorizationCodeRequestUrl */
public class C6203d extends C7211b {
    @C2768v("approval_prompt")

    /* renamed from: Z */
    private String f17458Z;
    @C2768v("access_type")

    /* renamed from: a0 */
    private String f17459a0;

    public C6203d(String str, String str2, Collection<String> collection) {
        this(C6214k.f17488a, str, str2, collection);
    }

    /* renamed from: n */
    public C6203d mo25223n(String str) {
        this.f17459a0 = str;
        return this;
    }

    /* renamed from: o */
    public C6203d mo25224o(String str) {
        this.f17458Z = str;
        return this;
    }

    /* renamed from: v */
    public final String mo25225v() {
        return this.f17459a0;
    }

    /* renamed from: w */
    public final String mo25226w() {
        return this.f17458Z;
    }

    public C6203d(String str, String str2, String str3, Collection<String> collection) {
        super(str, str2);
        m28528l(str3);
        m28521b(collection);
    }

    /* renamed from: a */
    public C6203d m28514a(Collection<String> collection) {
        return (C6203d) super.m34601a(collection);
    }

    /* renamed from: j */
    public C6203d m28525j(String str) {
        return (C6203d) super.m34609j(str);
    }

    /* renamed from: l */
    public C6203d m28528l(String str) {
        C6381h0.m29663a(str);
        return (C6203d) super.m34611l(str);
    }

    /* renamed from: m */
    public C6203d m28531m(String str) {
        return (C6203d) super.m34613m(str);
    }

    public C6203d(C6206g gVar, String str, Collection<String> collection) {
        this(gVar.mo25239f().mo25248g(), str, collection);
    }

    public C6203d clone() {
        return (C6203d) super.clone();
    }

    /* renamed from: b */
    public C6203d m28521b(Collection<String> collection) {
        C6381h0.m29666a(collection.iterator().hasNext());
        return (C6203d) super.m34606b(collection);
    }

    /* renamed from: b */
    public C6203d m28522b(String str, Object obj) {
        return (C6203d) super.m34607b(str, obj);
    }
}
