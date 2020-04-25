package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.C4056a;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

@C4056a
/* renamed from: com.google.android.gms.common.util.p */
public class C4497p {

    /* renamed from: a */
    private static final Pattern f13760a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    private static final Pattern f13761b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    private static final Pattern f13762c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private C4497p() {
    }

    @C4056a
    /* renamed from: a */
    public static Map<String, String> m19391a(URI uri, String str) {
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            Scanner scanner = new Scanner(rawQuery);
            scanner.useDelimiter("&");
            while (scanner.hasNext()) {
                String[] split = scanner.next().split("=");
                if (split.length == 0 || split.length > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String a = m19390a(split[0], str);
                String str2 = null;
                if (split.length == 2) {
                    str2 = m19390a(split[1], str);
                }
                emptyMap.put(a, str2);
            }
        }
        return emptyMap;
    }

    /* renamed from: a */
    private static String m19390a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
