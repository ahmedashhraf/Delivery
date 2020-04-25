package com.google.android.gms.auth;

import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.auth.a */
public final class C3912a {
    private C3912a() {
    }

    /* renamed from: a */
    private static boolean m17100a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    /* renamed from: a */
    public static String m17098a(String str, Boolean bool) {
        C4300a0.m18630b(str);
        String str2 = m17100a(bool) ? UriUtil.HTTPS_SCHEME : "http";
        StringBuilder sb = new StringBuilder(str2.length() + 3 + String.valueOf(str).length());
        sb.append(str2);
        sb.append("://");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m17099a(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('=');
        if (!TextUtils.isEmpty(str2)) {
            sb.append(str2);
        }
        if (m17100a(bool)) {
            sb.append(";HttpOnly");
        }
        if (m17100a(bool2)) {
            sb.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            sb.append(";Domain=");
            sb.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            sb.append(";Path=");
            sb.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            sb.append(";Max-Age=");
            sb.append(l);
        }
        return sb.toString();
    }
}
