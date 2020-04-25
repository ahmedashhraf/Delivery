package p076c.p112d.p134b.p135a.p235c.p246i;

import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6373f0;
import p076c.p112d.p134b.p135a.p143g.C6373f0.C6375b;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.c.i.a */
/* compiled from: AbstractNotification */
public abstract class C6238a {

    /* renamed from: a */
    private long f17549a;

    /* renamed from: b */
    private String f17550b;

    /* renamed from: c */
    private String f17551c;

    /* renamed from: d */
    private String f17552d;

    /* renamed from: e */
    private String f17553e;

    /* renamed from: f */
    private String f17554f;

    /* renamed from: g */
    private String f17555g;

    /* renamed from: h */
    private String f17556h;

    protected C6238a(long j, String str, String str2, String str3, String str4) {
        mo25368a(j);
        mo25379f(str);
        mo25378e(str2);
        mo25381g(str3);
        mo25373c(str4);
    }

    /* renamed from: a */
    public C6238a mo25368a(long j) {
        C6381h0.m29666a(j >= 1);
        this.f17549a = j;
        return this;
    }

    /* renamed from: b */
    public final String mo25372b() {
        return this.f17554f;
    }

    /* renamed from: c */
    public final String mo25374c() {
        return this.f17553e;
    }

    /* renamed from: d */
    public final String mo25376d() {
        return this.f17555g;
    }

    /* renamed from: e */
    public final long mo25377e() {
        return this.f17549a;
    }

    /* renamed from: f */
    public C6238a mo25379f(String str) {
        this.f17550b = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: g */
    public final String mo25382g() {
        return this.f17550b;
    }

    /* renamed from: h */
    public final String mo25383h() {
        return this.f17552d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6375b mo25384i() {
        return C6373f0.m29650a(this).mo25752a("messageNumber", Long.valueOf(this.f17549a)).mo25752a("resourceState", this.f17550b).mo25752a("resourceId", this.f17551c).mo25752a("resourceUri", this.f17552d).mo25752a("channelId", this.f17553e).mo25752a("channelExpiration", this.f17554f).mo25752a("channelToken", this.f17555g).mo25752a("changed", this.f17556h);
    }

    public String toString() {
        return mo25384i().toString();
    }

    /* renamed from: b */
    public C6238a mo25371b(String str) {
        this.f17554f = str;
        return this;
    }

    /* renamed from: c */
    public C6238a mo25373c(String str) {
        this.f17553e = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: d */
    public C6238a mo25375d(String str) {
        this.f17555g = str;
        return this;
    }

    /* renamed from: e */
    public C6238a mo25378e(String str) {
        this.f17551c = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: f */
    public final String mo25380f() {
        return this.f17551c;
    }

    /* renamed from: g */
    public C6238a mo25381g(String str) {
        this.f17552d = (String) C6381h0.m29663a(str);
        return this;
    }

    /* renamed from: a */
    public final String mo25370a() {
        return this.f17556h;
    }

    /* renamed from: a */
    public C6238a mo25369a(String str) {
        this.f17556h = str;
        return this;
    }

    protected C6238a(C6238a aVar) {
        this(aVar.mo25377e(), aVar.mo25382g(), aVar.mo25380f(), aVar.mo25383h(), aVar.mo25374c());
        mo25371b(aVar.mo25372b());
        mo25375d(aVar.mo25376d());
        mo25369a(aVar.mo25370a());
    }
}
