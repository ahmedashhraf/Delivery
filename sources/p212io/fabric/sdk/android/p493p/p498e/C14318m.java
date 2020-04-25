package p212io.fabric.sdk.android.p493p.p498e;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: io.fabric.sdk.android.p.e.m */
/* compiled from: DefaultSettingsSpiCall */
class C14318m extends C14236a implements C14333y {

    /* renamed from: a */
    static final String f42228a = "build_version";

    /* renamed from: b */
    static final String f42229b = "display_version";

    /* renamed from: c */
    static final String f42230c = "instance";

    /* renamed from: d */
    static final String f42231d = "source";

    /* renamed from: e */
    static final String f42232e = "icon_hash";

    /* renamed from: f */
    static final String f42233f = "X-CRASHLYTICS-DEVICE-MODEL";

    /* renamed from: g */
    static final String f42234g = "X-CRASHLYTICS-OS-BUILD-VERSION";

    /* renamed from: h */
    static final String f42235h = "X-CRASHLYTICS-OS-DISPLAY-VERSION";

    /* renamed from: i */
    static final String f42236i = "X-CRASHLYTICS-INSTALLATION-ID";

    public C14318m(C14225i iVar, String str, String str2, C14388d dVar) {
        this(iVar, str, str2, dVar, C14387c.GET);
    }

    /* renamed from: b */
    private Map<String, String> m62039b(C14332x xVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(f42228a, xVar.f42370h);
        hashMap.put(f42229b, xVar.f42369g);
        hashMap.put("source", Integer.toString(xVar.f42371i));
        String str = xVar.f42372j;
        if (str != null) {
            hashMap.put(f42232e, str);
        }
        String str2 = xVar.f42368f;
        if (!C14248i.m61832c(str2)) {
            hashMap.put(f42230c, str2);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo45269a(p212io.fabric.sdk.android.p493p.p498e.C14332x r10) {
        /*
            r9 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            java.lang.String r1 = "Settings request ID: "
            java.lang.String r2 = "Fabric"
            r3 = 0
            java.util.Map r4 = r9.m62039b(r10)     // Catch:{ HttpRequestException -> 0x0075, all -> 0x0070 }
            io.fabric.sdk.android.services.network.HttpRequest r5 = r9.getHttpRequest(r4)     // Catch:{ HttpRequestException -> 0x0075, all -> 0x0070 }
            io.fabric.sdk.android.services.network.HttpRequest r10 = r9.m62036a(r5, r10)     // Catch:{ HttpRequestException -> 0x006d, all -> 0x006a }
            io.fabric.sdk.android.l r5 = p212io.fabric.sdk.android.C14215d.m61672j()     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0068 }
            r6.<init>()     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.String r7 = "Requesting settings from "
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.String r7 = r9.getUrl()     // Catch:{ HttpRequestException -> 0x0068 }
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.String r6 = r6.toString()     // Catch:{ HttpRequestException -> 0x0068 }
            r5.mo45042d(r2, r6)     // Catch:{ HttpRequestException -> 0x0068 }
            io.fabric.sdk.android.l r5 = p212io.fabric.sdk.android.C14215d.m61672j()     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0068 }
            r6.<init>()     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.String r7 = "Settings query params were: "
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0068 }
            r6.append(r4)     // Catch:{ HttpRequestException -> 0x0068 }
            java.lang.String r4 = r6.toString()     // Catch:{ HttpRequestException -> 0x0068 }
            r5.mo45042d(r2, r4)     // Catch:{ HttpRequestException -> 0x0068 }
            org.json.JSONObject r3 = r9.mo45270a(r10)     // Catch:{ HttpRequestException -> 0x0068 }
            if (r10 == 0) goto L_0x008c
            io.fabric.sdk.android.l r4 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L_0x0056:
            r5.append(r1)
            java.lang.String r10 = r10.mo45466k(r0)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r4.mo45042d(r2, r10)
            goto L_0x008c
        L_0x0068:
            r4 = move-exception
            goto L_0x0077
        L_0x006a:
            r3 = move-exception
            r10 = r5
            goto L_0x008e
        L_0x006d:
            r4 = move-exception
            r10 = r5
            goto L_0x0077
        L_0x0070:
            r10 = move-exception
            r8 = r3
            r3 = r10
            r10 = r8
            goto L_0x008e
        L_0x0075:
            r4 = move-exception
            r10 = r3
        L_0x0077:
            io.fabric.sdk.android.l r5 = p212io.fabric.sdk.android.C14215d.m61672j()     // Catch:{ all -> 0x008d }
            java.lang.String r6 = "Settings request failed."
            r5.mo45045e(r2, r6, r4)     // Catch:{ all -> 0x008d }
            if (r10 == 0) goto L_0x008c
            io.fabric.sdk.android.l r4 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L_0x0056
        L_0x008c:
            return r3
        L_0x008d:
            r3 = move-exception
        L_0x008e:
            if (r10 == 0) goto L_0x00aa
            io.fabric.sdk.android.l r4 = p212io.fabric.sdk.android.C14215d.m61672j()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r10 = r10.mo45466k(r0)
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            r4.mo45042d(r2, r10)
        L_0x00aa:
            goto L_0x00ac
        L_0x00ab:
            throw r3
        L_0x00ac:
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.fabric.sdk.android.p493p.p498e.C14318m.mo45269a(io.fabric.sdk.android.p.e.x):org.json.JSONObject");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo45271a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    C14318m(C14225i iVar, String str, String str2, C14388d dVar, C14387c cVar) {
        super(iVar, str, str2, dVar, cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo45270a(HttpRequest httpRequest) {
        int n = httpRequest.mo45471n();
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(n);
        String sb2 = sb.toString();
        String str = C14215d.f41919m;
        j.mo45042d(str, sb2);
        if (mo45271a(n)) {
            return m62037a(httpRequest.mo45446d());
        }
        C14228l j2 = C14215d.m61672j();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Failed to retrieve settings from ");
        sb3.append(getUrl());
        j2.mo45044e(str, sb3.toString());
        return null;
    }

    /* renamed from: a */
    private JSONObject m62037a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(getUrl());
            String sb2 = sb.toString();
            String str2 = C14215d.f41919m;
            j.mo45043d(str2, sb2, e);
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Settings response ");
            sb3.append(str);
            j2.mo45042d(str2, sb3.toString());
            return null;
        }
    }

    /* renamed from: a */
    private HttpRequest m62036a(HttpRequest httpRequest, C14332x xVar) {
        m62038a(httpRequest, C14236a.HEADER_API_KEY, xVar.f42363a);
        m62038a(httpRequest, C14236a.HEADER_CLIENT_TYPE, "android");
        m62038a(httpRequest, C14236a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        m62038a(httpRequest, "Accept", "application/json");
        m62038a(httpRequest, f42233f, xVar.f42364b);
        m62038a(httpRequest, f42234g, xVar.f42365c);
        m62038a(httpRequest, f42235h, xVar.f42366d);
        m62038a(httpRequest, f42236i, xVar.f42367e);
        return httpRequest;
    }

    /* renamed from: a */
    private void m62038a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.mo45444d(str, str2);
        }
    }
}
