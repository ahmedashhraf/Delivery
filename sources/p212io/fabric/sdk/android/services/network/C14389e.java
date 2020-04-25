package p212io.fabric.sdk.android.services.network;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: io.fabric.sdk.android.services.network.e */
/* compiled from: NetworkUtils */
public final class C14389e {
    private C14389e() {
    }

    /* renamed from: a */
    public static final SSLSocketFactory m62332a(C14390f fVar) throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new C14391g(new C14392h(fVar.getKeyStoreStream(), fVar.getKeyStorePassword()), fVar)}, null);
        return instance.getSocketFactory();
    }
}
