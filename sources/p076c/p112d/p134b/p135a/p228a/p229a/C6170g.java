package p076c.p112d.p134b.p135a.p228a.p229a;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.p217i1.C14662d0;
import org.jivesoftware.smack.util.MAC;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6371e;
import p076c.p112d.p134b.p135a.p143g.C6399n0;

@C2766f
/* renamed from: c.d.b.a.a.a.g */
/* compiled from: OAuthHmacSigner */
public final class C6170g implements C6173j {

    /* renamed from: a */
    public String f17387a;

    /* renamed from: b */
    public String f17388b;

    /* renamed from: a */
    public String mo25077a() {
        return "HMAC-SHA1";
    }

    /* renamed from: a */
    public String mo25078a(String str) throws GeneralSecurityException {
        StringBuilder sb = new StringBuilder();
        String str2 = this.f17387a;
        if (str2 != null) {
            sb.append(C6171h.m28306a(str2));
        }
        sb.append(C14662d0.f42852c);
        String str3 = this.f17388b;
        if (str3 != null) {
            sb.append(C6171h.m28306a(str3));
        }
        byte[] a = C6399n0.m29727a(sb.toString());
        String str4 = MAC.HMACSHA1;
        SecretKeySpec secretKeySpec = new SecretKeySpec(a, str4);
        Mac instance = Mac.getInstance(str4);
        instance.init(secretKeySpec);
        return C6371e.m29643c(instance.doFinal(C6399n0.m29727a(str)));
    }
}
