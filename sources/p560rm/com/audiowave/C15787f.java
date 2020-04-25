package p560rm.com.audiowave;

import android.os.Handler;
import android.os.Looper;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: rm.com.audiowave.f */
/* compiled from: Sampler.kt */
public final class C15787f {
    @C6003d

    /* renamed from: a */
    private static final Handler f45090a = new Handler(Looper.getMainLooper());
    @C6003d

    /* renamed from: b */
    private static final ExecutorService f45091b;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        C14445h0.m62453a((Object) newSingleThreadExecutor, "Executors.newSingleThreadExecutor()");
        f45091b = newSingleThreadExecutor;
    }

    /* renamed from: a */
    public static final byte m68781a(byte b) {
        if (b == Byte.MIN_VALUE) {
            return Byte.MAX_VALUE;
        }
        return (-127 <= b && b <= 0) ? (byte) (-b) : b;
    }

    @C6003d
    /* renamed from: a */
    public static final Handler m68782a() {
        return f45090a;
    }

    @C6003d
    /* renamed from: b */
    public static final ExecutorService m68784b() {
        return f45091b;
    }

    @C6003d
    /* renamed from: a */
    public static final byte[] m68783a(@C6003d byte[] bArr, @C6003d byte[] bArr2) {
        C14445h0.m62478f(bArr, "$receiver");
        C14445h0.m62478f(bArr2, FacebookRequestErrorClassification.KEY_OTHER);
        int i = 0;
        if (bArr.length == 0) {
            return new byte[0];
        }
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i2 + 1;
            bArr[i2] = (i2 < 0 || i2 > C14794o.m65302s(bArr2)) ? m68781a(bArr[i2]) : bArr2[i2];
            i++;
            i2 = i3;
        }
        return bArr;
    }
}
