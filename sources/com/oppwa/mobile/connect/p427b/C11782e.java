package com.oppwa.mobile.connect.p427b;

import android.os.AsyncTask;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.b.e */
class C11782e extends AsyncTask<Void, Void, Boolean> {

    /* renamed from: a */
    private C11978a f34049a;

    /* renamed from: b */
    private List<C11781d> f34050b;

    /* renamed from: c */
    private File f34051c;

    C11782e(List<C11781d> list, C11978a aVar, File file) {
        this.f34050b = list;
        this.f34049a = aVar;
        this.f34051c = file;
    }

    /* renamed from: a */
    private static String m52967a(C11978a aVar) {
        return aVar == C11978a.LIVE ? "https://oppwa.com:443" : "https://test.oppwa.com:443";
    }

    /* renamed from: a */
    private static StringBuilder m52968a(Map<String, String> map) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            sb.append("=");
            sb.append(URLEncoder.encode((String) map.get(str), "UTF-8"));
        }
        return sb;
    }

    /* renamed from: a */
    private Map<String, String> m52969a(List<C11781d> list) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (C11781d dVar : list) {
            StringBuilder sb = new StringBuilder();
            String str = "messages[";
            sb.append(str);
            sb.append(i);
            sb.append("].logger");
            hashMap.put(sb.toString(), "mSDK");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i);
            sb2.append("].timestamp");
            hashMap.put(sb2.toString(), dVar.mo40306c());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(i);
            sb3.append("].message");
            hashMap.put(sb3.toString(), dVar.mo40307d());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(i);
            sb4.append("].level");
            hashMap.put(sb4.toString(), dVar.mo40305b());
            i++;
        }
        return hashMap;
    }

    /* renamed from: a */
    private static JSONObject m52970a(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new JSONObject(sb.toString());
            }
            sb.append(readLine);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0096, code lost:
        if (r1 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        if (r1 != null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m52971a() {
        /*
            r9 = this;
            java.lang.String r0 = "result"
            java.util.List<com.oppwa.mobile.connect.b.d> r1 = r9.f34050b
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.oppwa.mobile.connect.b.d r1 = (com.oppwa.mobile.connect.p427b.C11781d) r1
            java.lang.String r1 = r1.mo40304a()
            r3 = 1
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r6.<init>()     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            com.oppwa.mobile.connect.provider.a$a r7 = r9.f34049a     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.lang.String r7 = m52967a(r7)     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r6.append(r7)     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.lang.String r7 = "/v1/checkouts/%s/logs"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r8[r2] = r1     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.lang.String r1 = java.lang.String.format(r7, r8)     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r6.append(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            r5.<init>(r1)     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.net.URLConnection r1 = r5.openConnection()     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00a3, all -> 0x009b }
            java.lang.String r4 = "Content-Type"
            java.lang.String r5 = "application/x-www-form-urlencoded; charset=UTF-8"
            r1.setRequestProperty(r4, r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r4 = "Accept"
            java.lang.String r5 = "application/json"
            r1.setRequestProperty(r4, r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r4 = "POST"
            r1.setRequestMethod(r4)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r1.setDoOutput(r3)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.io.OutputStream r4 = r1.getOutputStream()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.util.List<com.oppwa.mobile.connect.b.d> r5 = r9.f34050b     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.util.Map r5 = r9.m52969a(r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.StringBuilder r5 = m52968a(r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            byte[] r6 = com.oppwa.mobile.connect.p427b.C11779b.m52953a(r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r4.write(r6)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r4.flush()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r4.close()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            com.oppwa.mobile.connect.p427b.C11779b.m52954b(r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            int r4 = r1.getResponseCode()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == r5) goto L_0x0096
            java.io.InputStream r4 = r1.getErrorStream()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            org.json.JSONObject r4 = m52970a(r4)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r5 = r4.getString(r0)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r6 = "200.300.404"
            boolean r5 = r5.contains(r6)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r5 == 0) goto L_0x008c
            goto L_0x0096
        L_0x008c:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            throw r5     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
        L_0x0096:
            if (r1 == 0) goto L_0x00aa
            goto L_0x00a6
        L_0x0099:
            r0 = move-exception
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            r1 = r4
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.disconnect()
        L_0x00a2:
            throw r0
        L_0x00a3:
            r1 = r4
        L_0x00a4:
            if (r1 == 0) goto L_0x00aa
        L_0x00a6:
            r1.disconnect()
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.p427b.C11782e.m52971a():boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(Void... voidArr) {
        return Boolean.valueOf(m52971a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Boolean bool) {
        super.onPostExecute(bool);
        if (bool.booleanValue()) {
            File file = this.f34051c;
            if (file != null && !file.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot delete the log file: ");
                sb.append(this.f34051c);
                sb.toString();
            }
        }
    }
}
