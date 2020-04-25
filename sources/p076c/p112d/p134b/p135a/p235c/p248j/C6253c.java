package p076c.p112d.p134b.p135a.p235c.p248j;

import java.io.IOException;

/* renamed from: c.d.b.a.c.j.c */
/* compiled from: CommonGoogleClientRequestInitializer */
public class C6253c implements C6254d {

    /* renamed from: a */
    private final String f17606a;

    /* renamed from: b */
    private final String f17607b;

    public C6253c() {
        this(null);
    }

    /* renamed from: a */
    public void mo25473a(C6251b<?> bVar) throws IOException {
        String str = this.f17606a;
        if (str != null) {
            bVar.put("key", str);
        }
        String str2 = this.f17607b;
        if (str2 != null) {
            bVar.put("userIp", str2);
        }
    }

    /* renamed from: b */
    public final String mo25474b() {
        return this.f17607b;
    }

    public C6253c(String str) {
        this(str, null);
    }

    public C6253c(String str, String str2) {
        this.f17606a = str;
        this.f17607b = str2;
    }

    /* renamed from: a */
    public final String mo25472a() {
        return this.f17606a;
    }
}
