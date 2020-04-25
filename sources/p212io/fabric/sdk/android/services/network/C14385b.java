package p212io.fabric.sdk.android.services.network;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p212io.fabric.sdk.android.C14214c;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

/* renamed from: io.fabric.sdk.android.services.network.b */
/* compiled from: DefaultHttpRequestFactory */
public class C14385b implements C14388d {

    /* renamed from: e */
    private static final String f42510e = "https";

    /* renamed from: a */
    private final C14228l f42511a;

    /* renamed from: b */
    private C14390f f42512b;

    /* renamed from: c */
    private SSLSocketFactory f42513c;

    /* renamed from: d */
    private boolean f42514d;

    /* renamed from: io.fabric.sdk.android.services.network.b$a */
    /* compiled from: DefaultHttpRequestFactory */
    static /* synthetic */ class C14386a {

        /* renamed from: a */
        static final /* synthetic */ int[] f42515a = new int[C14387c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                io.fabric.sdk.android.services.network.c[] r0 = p212io.fabric.sdk.android.services.network.C14387c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42515a = r0
                int[] r0 = f42515a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.fabric.sdk.android.services.network.c r1 = p212io.fabric.sdk.android.services.network.C14387c.GET     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f42515a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.fabric.sdk.android.services.network.c r1 = p212io.fabric.sdk.android.services.network.C14387c.POST     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f42515a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.fabric.sdk.android.services.network.c r1 = p212io.fabric.sdk.android.services.network.C14387c.PUT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f42515a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.fabric.sdk.android.services.network.c r1 = p212io.fabric.sdk.android.services.network.C14387c.DELETE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.fabric.sdk.android.services.network.C14385b.C14386a.<clinit>():void");
        }
    }

    public C14385b() {
        this(new C14214c());
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m62321b() {
        if (this.f42513c == null && !this.f42514d) {
            this.f42513c = m62322c();
        }
        return this.f42513c;
    }

    /* renamed from: c */
    private synchronized SSLSocketFactory m62322c() {
        SSLSocketFactory a;
        this.f42514d = true;
        try {
            a = C14389e.m62332a(this.f42512b);
            this.f42511a.mo45042d(C14215d.f41919m, "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f42511a.mo45045e(C14215d.f41919m, "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }

    /* renamed from: d */
    private synchronized void m62323d() {
        this.f42514d = false;
        this.f42513c = null;
    }

    /* renamed from: a */
    public C14390f mo45502a() {
        return this.f42512b;
    }

    public C14385b(C14228l lVar) {
        this.f42511a = lVar;
    }

    /* renamed from: a */
    public void mo45503a(C14390f fVar) {
        if (this.f42512b != fVar) {
            this.f42512b = fVar;
            m62323d();
        }
    }

    /* renamed from: a */
    public HttpRequest mo45500a(C14387c cVar, String str) {
        return mo45501a(cVar, str, Collections.emptyMap());
    }

    /* renamed from: a */
    public HttpRequest mo45501a(C14387c cVar, String str, Map<String, String> map) {
        HttpRequest httpRequest;
        int i = C14386a.f42515a[cVar.ordinal()];
        if (i == 1) {
            httpRequest = HttpRequest.m62145b((CharSequence) str, map, true);
        } else if (i == 2) {
            httpRequest = HttpRequest.m62154d((CharSequence) str, map, true);
        } else if (i == 3) {
            httpRequest = HttpRequest.m62167h((CharSequence) str);
        } else if (i == 4) {
            httpRequest = HttpRequest.m62144b((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (m62320a(str) && this.f42512b != null) {
            SSLSocketFactory b = m62321b();
            if (b != null) {
                ((HttpsURLConnection) httpRequest.mo45487w()).setSSLSocketFactory(b);
            }
        }
        return httpRequest;
    }

    /* renamed from: a */
    private boolean m62320a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }
}
