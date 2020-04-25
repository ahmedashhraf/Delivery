package p470h;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jivesoftware.smack.util.MAC;
import org.jivesoftware.smack.util.StringUtils;
import p201f.p202a.C5952h;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: h.m */
/* compiled from: HashingSink */
public final class C13903m extends C13898h {
    @C5952h

    /* renamed from: N */
    private final Mac f40379N;
    @C5952h

    /* renamed from: b */
    private final MessageDigest f40380b;

    private C13903m(C13924z zVar, String str) {
        super(zVar);
        try {
            this.f40380b = MessageDigest.getInstance(str);
            this.f40379N = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static C13903m m59719a(C13924z zVar) {
        return new C13903m(zVar, StringUtils.MD5);
    }

    /* renamed from: b */
    public static C13903m m59721b(C13924z zVar) {
        return new C13903m(zVar, "SHA-1");
    }

    /* renamed from: c */
    public static C13903m m59723c(C13924z zVar) {
        return new C13903m(zVar, C14248i.f42026i);
    }

    /* renamed from: d */
    public static C13903m m59725d(C13924z zVar) {
        return new C13903m(zVar, "SHA-512");
    }

    /* renamed from: a */
    public static C13903m m59720a(C13924z zVar, C13896f fVar) {
        return new C13903m(zVar, fVar, MAC.HMACSHA1);
    }

    /* renamed from: b */
    public static C13903m m59722b(C13924z zVar, C13896f fVar) {
        return new C13903m(zVar, fVar, "HmacSHA256");
    }

    /* renamed from: c */
    public static C13903m m59724c(C13924z zVar, C13896f fVar) {
        return new C13903m(zVar, fVar, "HmacSHA512");
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) throws IOException {
        C13893d0.m59606a(cVar.f40340b, 0, j);
        C13921w wVar = cVar.f40339a;
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, (long) (wVar.f40428c - wVar.f40427b));
            MessageDigest messageDigest = this.f40380b;
            if (messageDigest != null) {
                messageDigest.update(wVar.f40426a, wVar.f40427b, min);
            } else {
                this.f40379N.update(wVar.f40426a, wVar.f40427b, min);
            }
            j2 += (long) min;
            wVar = wVar.f40431f;
        }
        super.mo43815b(cVar, j);
    }

    /* renamed from: c */
    public final C13896f mo44000c() {
        MessageDigest messageDigest = this.f40380b;
        return C13896f.m59656e(messageDigest != null ? messageDigest.digest() : this.f40379N.doFinal());
    }

    private C13903m(C13924z zVar, C13896f fVar, String str) {
        super(zVar);
        try {
            this.f40379N = Mac.getInstance(str);
            this.f40379N.init(new SecretKeySpec(fVar.mo43989u(), str));
            this.f40380b = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
