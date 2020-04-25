package p076c.p082c.p083a.p088u.p090i.p092o;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p076c.p082c.p083a.p084a0.C2213f;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2272c;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: c.c.a.u.i.o.l */
/* compiled from: SafeKeyGenerator */
class C2373l {

    /* renamed from: a */
    private final C2213f<C2272c, String> f9306a = new C2213f<>(1000);

    C2373l() {
    }

    /* renamed from: a */
    public String mo9782a(C2272c cVar) {
        String str;
        synchronized (this.f9306a) {
            str = (String) this.f9306a.mo9385b(cVar);
        }
        if (str == null) {
            try {
                MessageDigest instance = MessageDigest.getInstance(C14248i.f42026i);
                cVar.mo9636a(instance);
                str = C2216i.m11346b(instance.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.f9306a) {
                this.f9306a.mo9386b(cVar, str);
            }
        }
        return str;
    }
}
