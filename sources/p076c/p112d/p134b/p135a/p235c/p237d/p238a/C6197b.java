package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.auth.oauth2.C7236t;
import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7309x;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessControlException;
import java.util.Locale;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6292f;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h.C6209a;

@C2766f
/* renamed from: c.d.b.a.c.d.a.b */
/* compiled from: DefaultCredentialProvider */
class C6197b extends C6220p {

    /* renamed from: d */
    static final String f17444d = "GOOGLE_APPLICATION_CREDENTIALS";

    /* renamed from: e */
    static final String f17445e = "application_default_credentials.json";

    /* renamed from: f */
    static final String f17446f = "gcloud";

    /* renamed from: g */
    static final String f17447g = "https://developers.google.com/accounts/docs/application-default-credentials";

    /* renamed from: h */
    static final String f17448h = "com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential$AppEngineCredentialWrapper";

    /* renamed from: i */
    static final String f17449i = "DEVSHELL_CLIENT_PORT";

    /* renamed from: b */
    private C6208h f17450b = null;

    /* renamed from: c */
    private C6200c f17451c = null;

    /* renamed from: c.d.b.a.c.d.a.b$a */
    /* compiled from: DefaultCredentialProvider */
    static /* synthetic */ class C6198a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17452a = new int[C6200c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                c.d.b.a.c.d.a.b$c[] r0 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6200c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17452a = r0
                int[] r0 = f17452a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.d.b.a.c.d.a.b$c r1 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6200c.ENVIRONMENT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f17452a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.d.b.a.c.d.a.b$c r1 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6200c.WELL_KNOWN_FILE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f17452a     // Catch:{ NoSuchFieldError -> 0x002a }
                c.d.b.a.c.d.a.b$c r1 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6200c.APP_ENGINE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f17452a     // Catch:{ NoSuchFieldError -> 0x0035 }
                c.d.b.a.c.d.a.b$c r1 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6200c.CLOUD_SHELL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f17452a     // Catch:{ NoSuchFieldError -> 0x0040 }
                c.d.b.a.c.d.a.b$c r1 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6200c.COMPUTE_ENGINE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.C6198a.<clinit>():void");
        }
    }

    /* renamed from: c.d.b.a.c.d.a.b$b */
    /* compiled from: DefaultCredentialProvider */
    private static class C6199b extends C6208h {

        /* renamed from: w */
        private static final String f17453w = String.valueOf(C6219o.m28801a()).concat("/computeMetadata/v1/instance/service-accounts/default/token");

        C6199b(C7253a0 a0Var, C6290d dVar) {
            super(new C6209a().m28647a(a0Var).m28644a(dVar).m28651a(f17453w));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7236t mo25187a() throws IOException {
            C7305u b = mo28702m().mo28859b().mo29135b(new C7274j(mo28701l()));
            C6292f fVar = new C6292f(mo28696g());
            b.mo29079a((C6372e0) fVar);
            b.mo29111i().mo25098b("Metadata-Flavor", (Object) "Google");
            b.mo29108f(false);
            C7309x a = b.mo29092a();
            int j = a.mo29153j();
            if (j == 200) {
                InputStream b2 = a.mo29145b();
                if (b2 != null) {
                    return (C7236t) fVar.mo25503a(b2, a.mo29146c(), C7236t.class);
                }
                throw new IOException("Empty content from metadata token server request.");
            } else if (j == 404) {
                throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified.", new Object[]{Integer.valueOf(j)}));
            } else {
                throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", new Object[]{Integer.valueOf(j), a.mo29159p()}));
            }
        }
    }

    /* renamed from: c.d.b.a.c.d.a.b$c */
    /* compiled from: DefaultCredentialProvider */
    private enum C6200c {
        UNKNOWN,
        ENVIRONMENT_VARIABLE,
        WELL_KNOWN_FILE,
        CLOUD_SHELL,
        APP_ENGINE,
        COMPUTE_ENGINE
    }

    C6197b() {
    }

    /* renamed from: c */
    private boolean m28457c() {
        return mo25336a(f17449i) != null;
    }

    /* renamed from: d */
    private boolean m28459d() throws IOException {
        String str = f17444d;
        String a = mo25336a(str);
        if (!(a == null || a.length() == 0)) {
            try {
                File file = new File(a);
                if (file.exists() && !file.isDirectory()) {
                    return true;
                }
                throw new IOException(String.format("Error reading credential file from environment variable %s, value '%s': File does not exist.", new Object[]{str, a}));
            } catch (AccessControlException unused) {
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m28461e() {
        try {
            return mo25191a(m28453a());
        } catch (AccessControlException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private final C6208h m28462f(C7253a0 a0Var, C6290d dVar) throws IOException {
        if (this.f17451c == null) {
            this.f17451c = m28451a(a0Var);
        }
        int i = C6198a.f17452a[this.f17451c.ordinal()];
        if (i == 1) {
            return m28458d(a0Var, dVar);
        }
        if (i == 2) {
            return m28460e(a0Var, dVar);
        }
        if (i == 3) {
            return m28454b(a0Var, dVar);
        }
        if (i == 4) {
            return m28452a(dVar);
        }
        if (i != 5) {
            return null;
        }
        return m28456c(a0Var, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C6208h mo25189a(C7253a0 a0Var, C6290d dVar) throws IOException {
        synchronized (this) {
            if (this.f17450b == null) {
                this.f17450b = m28462f(a0Var, dVar);
            }
            if (this.f17450b != null) {
                C6208h hVar = this.f17450b;
                return hVar;
            }
            throw new IOException(String.format("The Application Default Credentials are not available. They are available if running on Google App Engine, Google Compute Engine, or Google Cloud Shell. Otherwise, the environment variable %s must be defined pointing to a file defining the credentials. See %s for more information.", new Object[]{f17444d, f17447g}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Class<?> mo25192b(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* renamed from: b */
    private boolean m28455b() {
        boolean z = false;
        try {
            try {
                Field field = mo25192b("com.google.appengine.api.utils.SystemProperty").getField("environment");
                if (field.getType().getMethod("value", new Class[0]).invoke(field.get(null), new Object[0]) != null) {
                    z = true;
                }
                return z;
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                throw ((RuntimeException) C6219o.m28803a(new RuntimeException(String.format("Unexpcted error trying to determine if runnning on Google App Engine: %s", new Object[]{e.getMessage()})), (Throwable) e));
            }
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private final C6208h m28456c(C7253a0 a0Var, C6290d dVar) {
        return new C6199b(a0Var, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h m28460e(com.google.api.client.http.C7253a0 r6, p076c.p112d.p134b.p135a.p136d.C6290d r7) throws java.io.IOException {
        /*
            r5 = this;
            java.io.File r0 = r5.m28453a()
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x001a }
            c.d.b.a.c.d.a.h r6 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h.m28606a(r2, r6, r7)     // Catch:{ IOException -> 0x0015, all -> 0x0012 }
            r2.close()
            return r6
        L_0x0012:
            r6 = move-exception
            r1 = r2
            goto L_0x0034
        L_0x0015:
            r6 = move-exception
            r1 = r2
            goto L_0x001b
        L_0x0018:
            r6 = move-exception
            goto L_0x0034
        L_0x001a:
            r6 = move-exception
        L_0x001b:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = "Error reading credential file from location %s: %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0018 }
            r4 = 0
            r3[r4] = r0     // Catch:{ all -> 0x0018 }
            r0 = 1
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0018 }
            r3[r0] = r6     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0018 }
            r7.<init>(r6)     // Catch:{ all -> 0x0018 }
            throw r7     // Catch:{ all -> 0x0018 }
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            r1.close()
        L_0x0039:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.m28460e(com.google.api.client.http.a0, c.d.b.a.d.d):c.d.b.a.c.d.a.h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h m28458d(com.google.api.client.http.C7253a0 r7, p076c.p112d.p134b.p135a.p136d.C6290d r8) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "GOOGLE_APPLICATION_CREDENTIALS"
            java.lang.String r1 = r6.mo25336a(r0)
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x001c }
            c.d.b.a.c.d.a.h r7 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6208h.m28606a(r3, r7, r8)     // Catch:{ IOException -> 0x0017, all -> 0x0014 }
            r3.close()
            return r7
        L_0x0014:
            r7 = move-exception
            r2 = r3
            goto L_0x003f
        L_0x0017:
            r7 = move-exception
            r2 = r3
            goto L_0x001d
        L_0x001a:
            r7 = move-exception
            goto L_0x003f
        L_0x001c:
            r7 = move-exception
        L_0x001d:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x001a }
            java.lang.String r3 = "Error reading credential file from environment variable %s, value '%s': %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r5 = 0
            r4[r5] = r0     // Catch:{ all -> 0x001a }
            r0 = 1
            r4[r0] = r1     // Catch:{ all -> 0x001a }
            r0 = 2
            java.lang.String r1 = r7.getMessage()     // Catch:{ all -> 0x001a }
            r4[r0] = r1     // Catch:{ all -> 0x001a }
            java.lang.String r0 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x001a }
            r8.<init>(r0)     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6219o.m28803a(r8, r7)     // Catch:{ all -> 0x001a }
            java.io.IOException r7 = (java.io.IOException) r7     // Catch:{ all -> 0x001a }
            throw r7     // Catch:{ all -> 0x001a }
        L_0x003f:
            if (r2 == 0) goto L_0x0044
            r2.close()
        L_0x0044:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p235c.p237d.p238a.C6197b.m28458d(com.google.api.client.http.a0, c.d.b.a.d.d):c.d.b.a.c.d.a.h");
    }

    /* renamed from: a */
    private final File m28453a() {
        File file;
        String str = "";
        int indexOf = mo25190a("os.name", str).toLowerCase(Locale.US).indexOf("windows");
        String str2 = f17446f;
        if (indexOf >= 0) {
            file = new File(new File(mo25336a("APPDATA")), str2);
        } else {
            file = new File(new File(mo25190a("user.home", str), ".config"), str2);
        }
        return new File(file, f17445e);
    }

    /* renamed from: b */
    private final C6208h m28454b(C7253a0 a0Var, C6290d dVar) throws IOException {
        String str = f17448h;
        try {
            return (C6208h) mo25192b(str).getConstructor(new Class[]{C7253a0.class, C6290d.class}).newInstance(new Object[]{a0Var, dVar});
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw ((IOException) C6219o.m28803a(new IOException(String.format("Application Default Credentials failed to create the Google App Engine service account credentials class %s. Check that the component 'google-api-client-appengine' is deployed.", new Object[]{str})), e));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25191a(File file) {
        return file.exists() && !file.isDirectory();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo25190a(String str, String str2) {
        return System.getProperty(str, str2);
    }

    /* renamed from: a */
    private final C6200c m28451a(C7253a0 a0Var) throws IOException {
        if (m28459d()) {
            return C6200c.ENVIRONMENT_VARIABLE;
        }
        if (m28461e()) {
            return C6200c.WELL_KNOWN_FILE;
        }
        if (m28455b()) {
            return C6200c.APP_ENGINE;
        }
        if (m28457c()) {
            return C6200c.CLOUD_SHELL;
        }
        if (C6219o.m28804a(a0Var, (C6220p) this)) {
            return C6200c.COMPUTE_ENGINE;
        }
        return C6200c.UNKNOWN;
    }

    /* renamed from: a */
    private C6208h m28452a(C6290d dVar) {
        return new C6196a(Integer.parseInt(mo25336a(f17449i)), dVar);
    }
}
