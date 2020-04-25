package com.clevertap.android.sdk;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import java.net.URLDecoder;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.v1 */
/* compiled from: UriHelper */
final class C3232v1 {
    C3232v1() {
    }

    /* renamed from: a */
    static JSONObject m15648a(Uri uri) {
        String str = C5854b.f16905L;
        JSONObject jSONObject = new JSONObject();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.parseUrl(uri.toString());
            String a = m15646a("source", urlQuerySanitizer);
            String a2 = m15646a(str, urlQuerySanitizer);
            String a3 = m15646a(C5854b.f16903J, urlQuerySanitizer);
            jSONObject.put("us", a);
            jSONObject.put("um", a2);
            jSONObject.put("uc", a3);
            String c = m15650c(str, urlQuerySanitizer);
            if (c != null && c.matches("^email$|^social$|^search$")) {
                jSONObject.put("wm", c);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Referrer data: ");
            sb.append(jSONObject.toString(4));
            C3111h1.m14930d(sb.toString());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: b */
    private static String m15649b(String str, UrlQuerySanitizer urlQuerySanitizer) {
        StringBuilder sb = new StringBuilder();
        sb.append("utm_");
        sb.append(str);
        return m15647a(sb.toString(), urlQuerySanitizer, true);
    }

    /* renamed from: c */
    private static String m15650c(String str, UrlQuerySanitizer urlQuerySanitizer) {
        StringBuilder sb = new StringBuilder();
        sb.append("wzrk_");
        sb.append(str);
        return m15647a(sb.toString(), urlQuerySanitizer, true);
    }

    /* renamed from: a */
    private static String m15646a(String str, UrlQuerySanitizer urlQuerySanitizer) {
        String b = m15649b(str, urlQuerySanitizer);
        if (b == null) {
            b = m15650c(str, urlQuerySanitizer);
            if (b == null) {
                return null;
            }
        }
        return b;
    }

    /* renamed from: a */
    private static String m15647a(String str, UrlQuerySanitizer urlQuerySanitizer, boolean z) {
        if (!(str == null || urlQuerySanitizer == null)) {
            try {
                String value = urlQuerySanitizer.getValue(str);
                if (value == null) {
                    return null;
                }
                if (z && value.length() > 120) {
                    value = value.substring(0, 120);
                }
                return value;
            } catch (Throwable th) {
                C3111h1.m14941f("Couldn't parse the URI", th);
            }
        }
        return null;
    }

    /* renamed from: a */
    static Bundle m15645a(String str, boolean z) {
        if (str == null) {
            return new Bundle();
        }
        Bundle bundle = new Bundle();
        try {
            UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
            urlQuerySanitizer.setAllowUnregisteredParamaters(true);
            urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            urlQuerySanitizer.parseUrl(str);
            for (String str2 : urlQuerySanitizer.getParameterSet()) {
                String a = m15647a(str2, urlQuerySanitizer, false);
                if (a != null) {
                    if (!z) {
                        if (!str2.equals("wzrk_c2a")) {
                            bundle.putString(str2, URLDecoder.decode(a, "UTF-8"));
                        }
                    }
                    bundle.putString(str2, a);
                }
            }
        } catch (Throwable unused) {
        }
        return bundle;
    }
}
