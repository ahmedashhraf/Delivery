package p076c.p112d.p134b.p135a.p228a.p229a;

import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6371e;
import p076c.p112d.p134b.p135a.p143g.C6384i0;
import p076c.p112d.p134b.p135a.p143g.C6399n0;

@C2766f
/* renamed from: c.d.b.a.a.a.i */
/* compiled from: OAuthRsaSigner */
public final class C6172i implements C6173j {

    /* renamed from: a */
    public PrivateKey f17402a;

    /* renamed from: a */
    public String mo25077a() {
        return "RSA-SHA1";
    }

    /* renamed from: a */
    public String mo25078a(String str) throws GeneralSecurityException {
        return C6371e.m29643c(C6384i0.m29682a(C6384i0.m29686e(), this.f17402a, C6399n0.m29727a(str)));
    }
}
