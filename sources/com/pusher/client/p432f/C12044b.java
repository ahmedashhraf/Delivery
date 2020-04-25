package com.pusher.client.p432f;

import com.facebook.common.util.UriUtil;
import com.pusher.client.AuthorizationFailureException;
import com.pusher.client.C11993a;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p212io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: com.pusher.client.f.b */
/* compiled from: HttpAuthorizer */
public class C12044b implements C11993a {

    /* renamed from: a */
    private final URL f34713a;

    /* renamed from: b */
    private Map<String, String> f34714b = new HashMap();

    /* renamed from: c */
    private Map<String, String> f34715c = new HashMap();

    /* renamed from: d */
    private final String f34716d = "UTF-8";

    public C12044b(String str) {
        try {
            this.f34713a = new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Could not parse authentication end point into a valid URL", e);
        }
    }

    /* renamed from: a */
    public void mo41190a(Map<String, String> map) {
        this.f34714b = map;
    }

    /* renamed from: a */
    public Boolean mo41188a() {
        return Boolean.valueOf(this.f34713a.getProtocol().equals(UriUtil.HTTPS_SCHEME));
    }

    /* renamed from: a */
    public void mo41189a(HashMap<String, String> hashMap) {
        this.f34715c = hashMap;
    }

    /* renamed from: a */
    public String mo41078a(String str, String str2) throws AuthorizationFailureException {
        HttpURLConnection httpURLConnection;
        String str3 = "UTF-8";
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("channel_name=");
            stringBuffer.append(URLEncoder.encode(str, str3));
            stringBuffer.append("&socket_id=");
            stringBuffer.append(URLEncoder.encode(str2, str3));
            for (String str4 : this.f34715c.keySet()) {
                stringBuffer.append("&");
                stringBuffer.append(str4);
                stringBuffer.append("=");
                stringBuffer.append(URLEncoder.encode((String) this.f34715c.get(str4), str3));
            }
            if (mo41188a().booleanValue()) {
                httpURLConnection = (HttpsURLConnection) this.f34713a.openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) this.f34713a.openConnection();
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty(HttpRequest.f42450O, "utf-8");
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(Integer.toString(stringBuffer.toString().getBytes().length));
            httpURLConnection.setRequestProperty("Content-Length", sb.toString());
            for (String str5 : this.f34714b.keySet()) {
                httpURLConnection.setRequestProperty(str5, (String) this.f34714b.get(str5));
            }
            httpURLConnection.setUseCaches(false);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(stringBuffer.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuffer stringBuffer2 = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer2.append(readLine);
            }
            bufferedReader.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                if (responseCode != 201) {
                    throw new AuthorizationFailureException(stringBuffer2.toString());
                }
            }
            return stringBuffer2.toString();
        } catch (IOException e) {
            throw new AuthorizationFailureException((Exception) e);
        }
    }
}
