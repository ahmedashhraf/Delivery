package p470h;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jivesoftware.smack.util.MAC;
import org.jivesoftware.smack.util.StringUtils;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: h.n */
/* compiled from: HashingSource */
public final class C13904n extends C13899i {

    /* renamed from: a */
    private final MessageDigest f40381a;

    /* renamed from: b */
    private final Mac f40382b;

    private C13904n(C13883a0 a0Var, String str) {
        super(a0Var);
        try {
            this.f40381a = MessageDigest.getInstance(str);
            this.f40382b = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public static C13904n m59728a(C13883a0 a0Var) {
        return new C13904n(a0Var, StringUtils.MD5);
    }

    /* renamed from: b */
    public static C13904n m59730b(C13883a0 a0Var) {
        return new C13904n(a0Var, "SHA-1");
    }

    /* renamed from: c */
    public static C13904n m59732c(C13883a0 a0Var) {
        return new C13904n(a0Var, C14248i.f42026i);
    }

    public long read(C13887c cVar, long j) throws IOException {
        long read = super.read(cVar, j);
        if (read != -1) {
            long j2 = cVar.f40340b;
            long j3 = j2 - read;
            C13921w wVar = cVar.f40339a;
            while (j2 > j3) {
                wVar = wVar.f40432g;
                j2 -= (long) (wVar.f40428c - wVar.f40427b);
            }
            while (j2 < cVar.f40340b) {
                int i = (int) ((((long) wVar.f40427b) + j3) - j2);
                MessageDigest messageDigest = this.f40381a;
                if (messageDigest != null) {
                    messageDigest.update(wVar.f40426a, i, wVar.f40428c - i);
                } else {
                    this.f40382b.update(wVar.f40426a, i, wVar.f40428c - i);
                }
                j3 = ((long) (wVar.f40428c - wVar.f40427b)) + j2;
                wVar = wVar.f40431f;
                j2 = j3;
            }
        }
        return read;
    }

    /* renamed from: a */
    public static C13904n m59729a(C13883a0 a0Var, C13896f fVar) {
        return new C13904n(a0Var, fVar, MAC.HMACSHA1);
    }

    /* renamed from: b */
    public static C13904n m59731b(C13883a0 a0Var, C13896f fVar) {
        return new C13904n(a0Var, fVar, "HmacSHA256");
    }

    /* renamed from: a */
    public final C13896f mo44001a() {
        MessageDigest messageDigest = this.f40381a;
        return C13896f.m59656e(messageDigest != null ? messageDigest.digest() : this.f40382b.doFinal());
    }

    private C13904n(C13883a0 a0Var, C13896f fVar, String str) {
        super(a0Var);
        try {
            this.f40382b = Mac.getInstance(str);
            this.f40382b.init(new SecretKeySpec(fVar.mo43989u(), str));
            this.f40381a = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
