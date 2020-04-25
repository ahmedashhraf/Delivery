package bolts;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bolts.q */
/* compiled from: WebViewAppLinkResolver */
public class C2198q implements C2164d {

    /* renamed from: b */
    private static final String f8709b = "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())";

    /* renamed from: c */
    private static final String f8710c = "Prefer-Html-Meta-Tags";

    /* renamed from: d */
    private static final String f8711d = "al";

    /* renamed from: e */
    private static final String f8712e = "value";

    /* renamed from: f */
    private static final String f8713f = "app_name";

    /* renamed from: g */
    private static final String f8714g = "class";

    /* renamed from: h */
    private static final String f8715h = "package";

    /* renamed from: i */
    private static final String f8716i = "url";

    /* renamed from: j */
    private static final String f8717j = "should_fallback";

    /* renamed from: k */
    private static final String f8718k = "url";

    /* renamed from: l */
    private static final String f8719l = "web";

    /* renamed from: m */
    private static final String f8720m = "android";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f8721a;

    /* renamed from: bolts.q$a */
    /* compiled from: WebViewAppLinkResolver */
    class C2199a implements C2175l<JSONArray, C2159b> {

        /* renamed from: a */
        final /* synthetic */ Uri f8722a;

        C2199a(Uri uri) {
            this.f8722a = uri;
        }

        public C2159b then(C2177n<JSONArray> nVar) throws Exception {
            return C2198q.m11298b(C2198q.m11300b((JSONArray) nVar.mo9321c()), this.f8722a);
        }
    }

    /* renamed from: bolts.q$b */
    /* compiled from: WebViewAppLinkResolver */
    class C2200b implements C2175l<Void, C2177n<JSONArray>> {

        /* renamed from: a */
        final /* synthetic */ C2174k f8724a;

        /* renamed from: b */
        final /* synthetic */ Uri f8725b;

        /* renamed from: c */
        final /* synthetic */ C2174k f8726c;

        /* renamed from: bolts.q$b$a */
        /* compiled from: WebViewAppLinkResolver */
        class C2201a extends WebViewClient {

            /* renamed from: a */
            private boolean f8728a = false;

            C2201a() {
            }

            /* renamed from: a */
            private void m11301a(WebView webView) {
                if (!this.f8728a) {
                    this.f8728a = true;
                    webView.loadUrl(C2198q.f8709b);
                }
            }

            public void onLoadResource(WebView webView, String str) {
                super.onLoadResource(webView, str);
                m11301a(webView);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                m11301a(webView);
            }
        }

        /* renamed from: bolts.q$b$b */
        /* compiled from: WebViewAppLinkResolver */
        class C2202b {

            /* renamed from: a */
            final /* synthetic */ C2196o f8730a;

            C2202b(C2196o oVar) {
                this.f8730a = oVar;
            }

            @JavascriptInterface
            public void setValue(String str) {
                try {
                    this.f8730a.mo9343b(new JSONArray(str));
                } catch (JSONException e) {
                    this.f8730a.mo9342b((Exception) e);
                }
            }
        }

        C2200b(C2174k kVar, Uri uri, C2174k kVar2) {
            this.f8724a = kVar;
            this.f8725b = uri;
            this.f8726c = kVar2;
        }

        public C2177n<JSONArray> then(C2177n<Void> nVar) throws Exception {
            C2196o oVar = new C2196o();
            WebView webView = new WebView(C2198q.this.f8721a);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setNetworkAvailable(false);
            webView.setWebViewClient(new C2201a());
            webView.addJavascriptInterface(new C2202b(oVar), "boltsWebViewAppLinkResolverResult");
            webView.loadDataWithBaseURL(this.f8725b.toString(), (String) this.f8726c.mo9298a(), this.f8724a.mo9298a() != null ? ((String) this.f8724a.mo9298a()).split(";")[0] : null, null, null);
            return oVar.mo9338a();
        }
    }

    /* renamed from: bolts.q$c */
    /* compiled from: WebViewAppLinkResolver */
    class C2203c implements Callable<Void> {

        /* renamed from: N */
        final /* synthetic */ C2174k f8732N;

        /* renamed from: a */
        final /* synthetic */ Uri f8734a;

        /* renamed from: b */
        final /* synthetic */ C2174k f8735b;

        C2203c(Uri uri, C2174k kVar, C2174k kVar2) {
            this.f8734a = uri;
            this.f8735b = kVar;
            this.f8732N = kVar2;
        }

        public Void call() throws Exception {
            URL url = new URL(this.f8734a.toString());
            URLConnection uRLConnection = null;
            while (url != null) {
                uRLConnection = url.openConnection();
                boolean z = uRLConnection instanceof HttpURLConnection;
                if (z) {
                    ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(true);
                }
                uRLConnection.setRequestProperty(C2198q.f8710c, C2198q.f8711d);
                uRLConnection.connect();
                if (z) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() < 400) {
                        URL url2 = new URL(httpURLConnection.getHeaderField("Location"));
                        httpURLConnection.disconnect();
                        url = url2;
                    }
                }
                url = null;
            }
            try {
                this.f8735b.mo9299a(C2198q.m11299b(uRLConnection));
                this.f8732N.mo9299a(uRLConnection.getContentType());
                return null;
            } finally {
                if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).disconnect();
                }
            }
        }
    }

    public C2198q(Context context) {
        this.f8721a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<String, Object> m11300b(JSONArray jSONArray) throws JSONException {
        Map hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String[] split = jSONObject.getString("property").split(":");
            if (split[0].equals(f8711d)) {
                Map map = hashMap;
                int i2 = 1;
                while (true) {
                    Map map2 = null;
                    if (i2 >= split.length) {
                        break;
                    }
                    List list = (List) map.get(split[i2]);
                    if (list == null) {
                        list = new ArrayList();
                        map.put(split[i2], list);
                    }
                    if (list.size() > 0) {
                        map2 = (Map) list.get(list.size() - 1);
                    }
                    if (map2 == null || i2 == split.length - 1) {
                        map = new HashMap();
                        list.add(map);
                    } else {
                        map = map2;
                    }
                    i2++;
                }
                String str = "content";
                if (jSONObject.has(str)) {
                    String str2 = "value";
                    if (jSONObject.isNull(str)) {
                        map.put(str2, null);
                    } else {
                        map.put(str2, jSONObject.getString(str));
                    }
                }
            }
        }
        return hashMap;
    }

    public C2177n<C2159b> getAppLinkFromUrlInBackground(Uri uri) {
        C2174k kVar = new C2174k();
        C2174k kVar2 = new C2174k();
        return C2177n.m11240b((Callable<TResult>) new C2203c<TResult>(uri, kVar, kVar2)).mo9324d((C2175l<TResult, C2177n<TContinuationResult>>) new C2200b<TResult,C2177n<TContinuationResult>>(kVar2, uri, kVar), C2177n.f8644k).mo9317c((C2175l<TResult, TContinuationResult>) new C2199a<TResult,TContinuationResult>(uri));
    }

    /* renamed from: a */
    private static List<Map<String, Object>> m11296a(Map<String, Object> map, String str) {
        List<Map<String, Object>> list = (List) map.get(str);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    private static Uri m11293a(String str) {
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0113, code lost:
        if (java.util.Arrays.asList(new java.lang.String[]{com.mrsool.utils.C11644i.f33271c3, "false", com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_NO}).contains(((java.lang.String) ((java.util.Map) r0.get(0)).get(r7)).toLowerCase()) != false) goto L_0x0118;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static bolts.C2159b m11298b(java.util.Map<java.lang.String, java.lang.Object> r16, android.net.Uri r17) {
        /*
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "android"
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0015
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x0015:
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "url"
            r5 = 0
            r6 = 0
            java.lang.String r7 = "value"
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r2.next()
            java.util.Map r3 = (java.util.Map) r3
            java.util.List r4 = m11296a(r3, r4)
            java.lang.String r8 = "package"
            java.util.List r8 = m11296a(r3, r8)
            java.lang.String r9 = "class"
            java.util.List r9 = m11296a(r3, r9)
            java.lang.String r10 = "app_name"
            java.util.List r3 = m11296a(r3, r10)
            int r10 = r4.size()
            int r11 = r8.size()
            int r12 = r9.size()
            int r13 = r3.size()
            int r12 = java.lang.Math.max(r12, r13)
            int r11 = java.lang.Math.max(r11, r12)
            int r10 = java.lang.Math.max(r10, r11)
        L_0x005d:
            if (r6 >= r10) goto L_0x0019
            int r11 = r4.size()
            if (r11 <= r6) goto L_0x0070
            java.lang.Object r11 = r4.get(r6)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r11.get(r7)
            goto L_0x0071
        L_0x0070:
            r11 = r5
        L_0x0071:
            java.lang.String r11 = (java.lang.String) r11
            android.net.Uri r11 = m11293a(r11)
            int r12 = r8.size()
            if (r12 <= r6) goto L_0x0088
            java.lang.Object r12 = r8.get(r6)
            java.util.Map r12 = (java.util.Map) r12
            java.lang.Object r12 = r12.get(r7)
            goto L_0x0089
        L_0x0088:
            r12 = r5
        L_0x0089:
            java.lang.String r12 = (java.lang.String) r12
            int r13 = r9.size()
            if (r13 <= r6) goto L_0x009c
            java.lang.Object r13 = r9.get(r6)
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r13 = r13.get(r7)
            goto L_0x009d
        L_0x009c:
            r13 = r5
        L_0x009d:
            java.lang.String r13 = (java.lang.String) r13
            int r14 = r3.size()
            if (r14 <= r6) goto L_0x00b0
            java.lang.Object r14 = r3.get(r6)
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r14 = r14.get(r7)
            goto L_0x00b1
        L_0x00b0:
            r14 = r5
        L_0x00b1:
            java.lang.String r14 = (java.lang.String) r14
            bolts.b$a r15 = new bolts.b$a
            r15.<init>(r12, r13, r11, r14)
            r1.add(r15)
            int r6 = r6 + 1
            goto L_0x005d
        L_0x00be:
            java.lang.String r2 = "web"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0135
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0135
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r2 = r0.get(r4)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "should_fallback"
            java.lang.Object r0 = r0.get(r3)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0116
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0116
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = "no"
            r3[r6] = r4
            r4 = 1
            java.lang.String r8 = "false"
            r3[r4] = r8
            r4 = 2
            java.lang.String r8 = "0"
            r3[r4] = r8
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0116
            goto L_0x0118
        L_0x0116:
            r5 = r17
        L_0x0118:
            if (r5 == 0) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0133
            java.lang.Object r0 = r2.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = m11293a(r0)
            goto L_0x0137
        L_0x0133:
            r0 = r5
            goto L_0x0137
        L_0x0135:
            r0 = r17
        L_0x0137:
            bolts.b r2 = new bolts.b
            r3 = r17
            r2.<init>(r3, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.C2198q.m11298b(java.util.Map, android.net.Uri):bolts.b");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m11299b(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        int i;
        if (uRLConnection instanceof HttpURLConnection) {
            try {
                inputStream = uRLConnection.getInputStream();
            } catch (Exception unused) {
                inputStream = ((HttpURLConnection) uRLConnection).getErrorStream();
            }
        } else {
            inputStream = uRLConnection.getInputStream();
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                i = 0;
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String contentEncoding = uRLConnection.getContentEncoding();
            if (contentEncoding == null) {
                String[] split = uRLConnection.getContentType().split(";");
                int length = split.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String trim = split[i].trim();
                    if (trim.startsWith("charset=")) {
                        contentEncoding = trim.substring(8);
                        break;
                    }
                    i++;
                }
                if (contentEncoding == null) {
                    contentEncoding = "UTF-8";
                }
            }
            return new String(byteArrayOutputStream.toByteArray(), contentEncoding);
        } finally {
            inputStream.close();
        }
    }
}
