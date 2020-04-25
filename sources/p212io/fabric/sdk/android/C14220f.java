package p212io.fabric.sdk.android;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: io.fabric.sdk.android.f */
/* compiled from: FabricKitsFinder */
class C14220f implements Callable<Map<String, C14227k>> {

    /* renamed from: N */
    private static final String f41953N = "fabric-identifier";

    /* renamed from: O */
    private static final String f41954O = "fabric-version";

    /* renamed from: P */
    private static final String f41955P = "fabric-build-type";

    /* renamed from: b */
    static final String f41956b = "fabric/";

    /* renamed from: a */
    final String f41957a;

    C14220f(String str) {
        this.f41957a = str;
    }

    /* renamed from: a */
    private C14227k m61703a(ZipEntry zipEntry, ZipFile zipFile) {
        InputStream inputStream;
        try {
            inputStream = zipFile.getInputStream(zipEntry);
            try {
                Properties properties = new Properties();
                properties.load(inputStream);
                String property = properties.getProperty(f41953N);
                String property2 = properties.getProperty(f41954O);
                String property3 = properties.getProperty(f41955P);
                if (TextUtils.isEmpty(property) || TextUtils.isEmpty(property2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid format of fabric file,");
                    sb.append(zipEntry.getName());
                    throw new IllegalStateException(sb.toString());
                }
                C14227k kVar = new C14227k(property, property2, property3);
                C14248i.m61814a((Closeable) inputStream);
                return kVar;
            } catch (IOException e) {
                e = e;
                try {
                    C14228l j = C14215d.m61672j();
                    String str = C14215d.f41919m;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error when parsing fabric properties ");
                    sb2.append(zipEntry.getName());
                    j.mo45045e(str, sb2.toString(), e);
                    C14248i.m61814a((Closeable) inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    C14248i.m61814a((Closeable) inputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            C14228l j2 = C14215d.m61672j();
            String str2 = C14215d.f41919m;
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Error when parsing fabric properties ");
            sb22.append(zipEntry.getName());
            j2.mo45045e(str2, sb22.toString(), e);
            C14248i.m61814a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C14248i.m61814a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: b */
    private Map<String, C14227k> m61704b() {
        HashMap hashMap = new HashMap();
        try {
            Class.forName("com.google.android.gms.ads.AdView");
            C14227k kVar = new C14227k("com.google.firebase.firebase-ads", "0.0.0", "binary");
            hashMap.put(kVar.mo45108b(), kVar);
            C14215d.m61672j().mo45049v(C14215d.f41919m, "Found kit: com.google.firebase.firebase-ads");
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: c */
    private Map<String, C14227k> m61705c() throws Exception {
        HashMap hashMap = new HashMap();
        ZipFile a = mo45087a();
        Enumeration entries = a.entries();
        while (entries.hasMoreElements()) {
            ZipEntry zipEntry = (ZipEntry) entries.nextElement();
            if (zipEntry.getName().startsWith(f41956b) && zipEntry.getName().length() > 7) {
                C14227k a2 = m61703a(zipEntry, a);
                if (a2 != null) {
                    hashMap.put(a2.mo45108b(), a2);
                    C14215d.m61672j().mo45049v(C14215d.f41919m, String.format("Found kit:[%s] version:[%s]", new Object[]{a2.mo45108b(), a2.mo45109c()}));
                }
            }
        }
        if (a != null) {
            try {
                a.close();
            } catch (IOException unused) {
            }
        }
        return hashMap;
    }

    public Map<String, C14227k> call() throws Exception {
        HashMap hashMap = new HashMap();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hashMap.putAll(m61704b());
        hashMap.putAll(m61705c());
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("finish scanning in ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        j.mo45049v(C14215d.f41919m, sb.toString());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ZipFile mo45087a() throws IOException {
        return new ZipFile(this.f41957a);
    }
}
