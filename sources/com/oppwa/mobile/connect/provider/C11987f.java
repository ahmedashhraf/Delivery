package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.p427b.C11779b;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.oppwa.mobile.connect.provider.f */
class C11987f {
    /* renamed from: a */
    static InputStream m54096a(Context context, String str, String str2, CharSequence charSequence, C11978a aVar) throws Exception {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str2).openConnection();
        httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        httpsURLConnection.setRequestProperty("Accept", "application/json");
        if (charSequence == null) {
            httpsURLConnection.setRequestMethod("GET");
        } else {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(C11779b.m52953a(charSequence));
            outputStream.flush();
            outputStream.close();
        }
        int responseCode = httpsURLConnection.getResponseCode();
        if (!(context == null || str == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[_");
            sb.append(responseCode);
            sb.append("] ");
            sb.append(httpsURLConnection.getRequestMethod());
            sb.append(": ");
            sb.append(str2);
            sb.append("\n");
            C11778a.m52935b(context, str, sb.toString(), aVar);
        }
        if (responseCode == 200) {
            return httpsURLConnection.getInputStream();
        }
        throw new Exception(C11988g.m54098a(httpsURLConnection.getErrorStream()).getString("result"));
    }

    /* renamed from: a */
    static StringBuilder m54097a(Map<String, String> map) throws Exception {
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
}
