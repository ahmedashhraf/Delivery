package com.oppwa.mobile.connect.checkout.dialog;

import android.os.AsyncTask;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.p0 */
class C11884p0 {

    /* renamed from: d */
    private static C11884p0 f34321d;

    /* renamed from: a */
    private Set<C11886b> f34322a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public BrandsValidation f34323b;

    /* renamed from: c */
    private Map<String, String[]> f34324c = new HashMap();

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.p0$a */
    class C11885a extends AsyncTask<String, Void, String[]> {

        /* renamed from: a */
        private String f34325a;

        C11885a(String str) {
            this.f34325a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
            if (r5 != null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return com.oppwa.mobile.connect.checkout.dialog.C11884p0.m53435a(r4.f34326b).mo40794a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
            if (r5 != null) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
            r5.disconnect();
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String[] m53449a(java.lang.String r5) {
            /*
                r4 = this;
                r0 = 0
                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0032, all -> 0x002d }
                r1.<init>(r5)     // Catch:{ Exception -> 0x0032, all -> 0x002d }
                java.net.URLConnection r5 = r1.openConnection()     // Catch:{ Exception -> 0x0032, all -> 0x002d }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Exception -> 0x0032, all -> 0x002d }
                r1 = 10000(0x2710, float:1.4013E-41)
                r5.setConnectTimeout(r1)     // Catch:{ Exception -> 0x002b }
                r5.setReadTimeout(r1)     // Catch:{ Exception -> 0x002b }
                java.io.InputStream r1 = r5.getInputStream()     // Catch:{ Exception -> 0x002b }
                java.lang.String r1 = com.oppwa.mobile.connect.p427b.C11779b.m52946a(r1)     // Catch:{ Exception -> 0x002b }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x002b }
                r2.<init>(r1)     // Catch:{ Exception -> 0x002b }
                java.lang.String[] r0 = r4.m53450a(r2)     // Catch:{ Exception -> 0x002b }
                if (r5 == 0) goto L_0x003a
            L_0x0027:
                r5.disconnect()
                goto L_0x003a
            L_0x002b:
                r1 = move-exception
                goto L_0x0034
            L_0x002d:
                r5 = move-exception
                r3 = r0
                r0 = r5
                r5 = r3
                goto L_0x0048
            L_0x0032:
                r1 = move-exception
                r5 = r0
            L_0x0034:
                r1.getMessage()     // Catch:{ all -> 0x0047 }
                if (r5 == 0) goto L_0x003a
                goto L_0x0027
            L_0x003a:
                if (r0 == 0) goto L_0x0046
                com.oppwa.mobile.connect.checkout.dialog.p0 r5 = com.oppwa.mobile.connect.checkout.dialog.C11884p0.this
                com.oppwa.mobile.connect.payment.BrandsValidation r5 = r5.f34323b
                java.lang.String[] r0 = r5.mo40794a(r0)
            L_0x0046:
                return r0
            L_0x0047:
                r0 = move-exception
            L_0x0048:
                if (r5 == 0) goto L_0x004d
                r5.disconnect()
            L_0x004d:
                goto L_0x004f
            L_0x004e:
                throw r0
            L_0x004f:
                goto L_0x004e
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C11884p0.C11885a.m53449a(java.lang.String):java.lang.String[]");
        }

        /* renamed from: a */
        private String[] m53450a(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray = jSONObject.getJSONArray("brands");
            String[] strArr = new String[0];
            if (jSONArray.length() > 0) {
                strArr = new String[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    strArr[i] = jSONArray.getString(i);
                }
            }
            return strArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(String... strArr) {
            return m53449a(strArr[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String[] strArr) {
            super.onPostExecute(strArr);
            if (strArr != null) {
                C11884p0.m53438b().m53437a(this.f34325a, strArr);
                C11884p0.this.m53440b(this.f34325a, strArr);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.p0$b */
    interface C11886b {
        /* renamed from: a */
        void mo40432a(String str, String[] strArr);
    }

    private C11884p0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53437a(String str, String[] strArr) {
        if (m53441c(str) == null) {
            this.f34324c.put(str, strArr);
        }
    }

    /* renamed from: b */
    static synchronized C11884p0 m53438b() {
        C11884p0 p0Var;
        synchronized (C11884p0.class) {
            if (f34321d == null) {
                f34321d = new C11884p0();
            }
            p0Var = f34321d;
        }
        return p0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m53440b(String str, String[] strArr) {
        for (C11886b a : this.f34322a) {
            a.mo40432a(str, strArr);
        }
    }

    /* renamed from: c */
    private String[] m53441c(String str) {
        return (String[]) this.f34324c.get(str);
    }

    /* renamed from: d */
    private static String m53442d(String str) {
        return str.equals(C11978a.LIVE.name()) ? "https://oppwa.com:443/" : "https://test.oppwa.com:443/";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40534a() {
        this.f34324c = new HashMap();
        this.f34323b = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40535a(C11886b bVar) {
        this.f34322a.add(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40536a(String str, String str2, String str3, BrandsValidation brandsValidation) {
        this.f34323b = brandsValidation;
        C11885a aVar = new C11885a(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(m53442d(str));
        sb.append("v1/checkouts/");
        sb.append(str2);
        sb.append("/bins/");
        sb.append(str3);
        String sb2 = sb.toString();
        try {
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{sb2});
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String[] mo40537a(String str) {
        String str2 = "";
        for (String str3 : this.f34324c.keySet()) {
            if (str.startsWith(str3) && str3.length() > str2.length()) {
                str2 = str3;
            }
        }
        if (str2.length() > 0) {
            return (String[]) this.f34324c.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40538b(C11886b bVar) {
        this.f34322a.remove(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo40539b(String str) {
        return this.f34324c.get(str) != null;
    }
}
