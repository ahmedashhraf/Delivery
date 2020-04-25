package androidx.core.p021d.p023b;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.fingerprint.FingerprintManager.AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager.AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import androidx.annotation.RequiresApi;
import androidx.core.p038os.C1058b;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
/* renamed from: androidx.core.d.b.a */
/* compiled from: FingerprintManagerCompat */
public final class C0880a {

    /* renamed from: a */
    private final Context f4051a;

    /* renamed from: androidx.core.d.b.a$a */
    /* compiled from: FingerprintManagerCompat */
    static class C0881a extends AuthenticationCallback {

        /* renamed from: a */
        final /* synthetic */ C0882b f4052a;

        C0881a(C0882b bVar) {
            this.f4052a = bVar;
        }

        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f4052a.mo4566a(i, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f4052a.mo4565a();
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f4052a.mo4568b(i, charSequence);
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
            this.f4052a.mo4567a(new C0883c(C0880a.m5089a(authenticationResult.getCryptoObject())));
        }
    }

    /* renamed from: androidx.core.d.b.a$b */
    /* compiled from: FingerprintManagerCompat */
    public static abstract class C0882b {
        /* renamed from: a */
        public void mo4565a() {
        }

        /* renamed from: a */
        public void mo4566a(int i, CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo4567a(C0883c cVar) {
        }

        /* renamed from: b */
        public void mo4568b(int i, CharSequence charSequence) {
        }
    }

    /* renamed from: androidx.core.d.b.a$c */
    /* compiled from: FingerprintManagerCompat */
    public static final class C0883c {

        /* renamed from: a */
        private final C0884d f4053a;

        public C0883c(C0884d dVar) {
            this.f4053a = dVar;
        }

        /* renamed from: a */
        public C0884d mo4569a() {
            return this.f4053a;
        }
    }

    /* renamed from: androidx.core.d.b.a$d */
    /* compiled from: FingerprintManagerCompat */
    public static class C0884d {

        /* renamed from: a */
        private final Signature f4054a;

        /* renamed from: b */
        private final Cipher f4055b;

        /* renamed from: c */
        private final Mac f4056c;

        public C0884d(@C0193h0 Signature signature) {
            this.f4054a = signature;
            this.f4055b = null;
            this.f4056c = null;
        }

        @C0195i0
        /* renamed from: a */
        public Cipher mo4570a() {
            return this.f4055b;
        }

        @C0195i0
        /* renamed from: b */
        public Mac mo4571b() {
            return this.f4056c;
        }

        @C0195i0
        /* renamed from: c */
        public Signature mo4572c() {
            return this.f4054a;
        }

        public C0884d(@C0193h0 Cipher cipher) {
            this.f4055b = cipher;
            this.f4054a = null;
            this.f4056c = null;
        }

        public C0884d(@C0193h0 Mac mac) {
            this.f4056c = mac;
            this.f4055b = null;
            this.f4054a = null;
        }
    }

    private C0880a(Context context) {
        this.f4051a = context;
    }

    @C0193h0
    /* renamed from: a */
    public static C0880a m5090a(@C0193h0 Context context) {
        return new C0880a(context);
    }

    @C0203m0("android.permission.USE_FINGERPRINT")
    /* renamed from: b */
    public boolean mo4560b() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        FingerprintManager b = m5091b(this.f4051a);
        if (b == null || !b.isHardwareDetected()) {
            return false;
        }
        return true;
    }

    @C0203m0("android.permission.USE_FINGERPRINT")
    /* renamed from: a */
    public boolean mo4559a() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        FingerprintManager b = m5091b(this.f4051a);
        if (b == null || !b.hasEnrolledFingerprints()) {
            return false;
        }
        return true;
    }

    @RequiresApi(23)
    @C0195i0
    /* renamed from: b */
    private static FingerprintManager m5091b(@C0193h0 Context context) {
        int i = VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    @C0203m0("android.permission.USE_FINGERPRINT")
    /* renamed from: a */
    public void mo4558a(@C0195i0 C0884d dVar, int i, @C0195i0 C1058b bVar, @C0193h0 C0882b bVar2, @C0195i0 Handler handler) {
        if (VERSION.SDK_INT >= 23) {
            FingerprintManager b = m5091b(this.f4051a);
            if (b != null) {
                b.authenticate(m5088a(dVar), bVar != null ? (CancellationSignal) bVar.mo5201b() : null, i, m5087a(bVar2), handler);
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: a */
    private static CryptoObject m5088a(C0884d dVar) {
        CryptoObject cryptoObject = null;
        if (dVar == null) {
            return null;
        }
        if (dVar.mo4570a() != null) {
            return new CryptoObject(dVar.mo4570a());
        }
        if (dVar.mo4572c() != null) {
            return new CryptoObject(dVar.mo4572c());
        }
        if (dVar.mo4571b() != null) {
            cryptoObject = new CryptoObject(dVar.mo4571b());
        }
        return cryptoObject;
    }

    @RequiresApi(23)
    /* renamed from: a */
    static C0884d m5089a(CryptoObject cryptoObject) {
        C0884d dVar = null;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new C0884d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new C0884d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            dVar = new C0884d(cryptoObject.getMac());
        }
        return dVar;
    }

    @RequiresApi(23)
    /* renamed from: a */
    private static AuthenticationCallback m5087a(C0882b bVar) {
        return new C0881a(bVar);
    }
}
