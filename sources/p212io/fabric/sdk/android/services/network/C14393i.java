package p212io.fabric.sdk.android.services.network;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.TreeMap;

/* renamed from: io.fabric.sdk.android.services.network.i */
/* compiled from: UrlUtils */
public final class C14393i {

    /* renamed from: a */
    public static final String f42526a = "UTF8";

    private C14393i() {
    }

    /* renamed from: a */
    public static TreeMap<String, String> m62344a(URI uri, boolean z) {
        return m62343a(uri.getRawQuery(), z);
    }

    /* renamed from: b */
    public static String m62345b(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, f42526a);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: c */
    public static String m62346c(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, f42526a);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static TreeMap<String, String> m62343a(String str, boolean z) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        if (str == null) {
            return treeMap;
        }
        for (String split : str.split("&")) {
            String[] split2 = split.split("=");
            if (split2.length == 2) {
                if (z) {
                    treeMap.put(m62345b(split2[0]), m62345b(split2[1]));
                } else {
                    treeMap.put(split2[0], split2[1]);
                }
            } else if (!TextUtils.isEmpty(split2[0])) {
                String str2 = "";
                if (z) {
                    treeMap.put(m62345b(split2[0]), str2);
                } else {
                    treeMap.put(split2[0], str2);
                }
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    public static String m62342a(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String c = m62346c(str);
        int length = c.length();
        int i = 0;
        while (i < length) {
            char charAt = c.charAt(i);
            if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else {
                if (charAt == '%') {
                    int i2 = i + 2;
                    if (i2 < length && c.charAt(i + 1) == '7' && c.charAt(i2) == 'E') {
                        sb.append('~');
                        i = i2;
                    }
                }
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }
}
