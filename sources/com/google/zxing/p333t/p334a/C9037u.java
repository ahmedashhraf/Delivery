package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.t.a.u */
/* compiled from: ResultParser */
public abstract class C9037u {

    /* renamed from: a */
    private static final C9037u[] f23649a = {new C9016f(), new C9010c(), new C9024j(), new C9008b(), new C9017f0(), new C9014e(), new C9019g0(), new C9022i(), new C9041y(), new C9007a0(), new C9038v(), new C9040x(), new C9030n(), new C9027k0(), new C9015e0(), new C9013d0(), new C9032p(), new C9036t(), new C9028l(), new C9023i0()};

    /* renamed from: b */
    private static final Pattern f23650b = Pattern.compile("\\d+");

    /* renamed from: c */
    private static final Pattern f23651c = Pattern.compile("&");

    /* renamed from: d */
    private static final Pattern f23652d = Pattern.compile("=");

    /* renamed from: e */
    private static final String f23653e = "﻿";

    /* renamed from: a */
    protected static int m42245a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    protected static void m42248a(String str, StringBuilder sb) {
        if (str != null) {
            sb.append(10);
            sb.append(str);
        }
    }

    /* renamed from: a */
    protected static String[] m42251a(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: b */
    protected static String m42253b(C8985n nVar) {
        String f = nVar.mo32827f();
        return f.startsWith(f23653e) ? f.substring(1) : f;
    }

    /* renamed from: c */
    public static C9033q m42257c(C8985n nVar) {
        for (C9037u a : f23649a) {
            C9033q a2 = a.mo32876a(nVar);
            if (a2 != null) {
                return a2;
            }
        }
        return new C9009b0(nVar.mo32827f(), null);
    }

    /* renamed from: d */
    static String m42259d(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public abstract C9033q mo32876a(C8985n nVar);

    /* renamed from: a */
    protected static void m42249a(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(10);
                sb.append(str);
            }
        }
    }

    /* renamed from: b */
    protected static boolean m42256b(CharSequence charSequence, int i) {
        return charSequence != null && i > 0 && i == charSequence.length() && f23650b.matcher(charSequence).matches();
    }

    /* renamed from: c */
    protected static String m42258c(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    /* renamed from: b */
    static Map<String, String> m42255b(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String a : f23651c.split(str.substring(indexOf + 1))) {
            m42247a((CharSequence) a, (Map<String, String>) hashMap);
        }
        return hashMap;
    }

    /* renamed from: a */
    protected static boolean m42250a(CharSequence charSequence, int i, int i2) {
        if (charSequence != null && i2 > 0) {
            int i3 = i2 + i;
            if (charSequence.length() >= i3 && f23650b.matcher(charSequence.subSequence(i, i3)).matches()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m42247a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f23652d.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], m42259d(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    static String m42254b(String str, String str2, char c, boolean z) {
        String[] a = m42252a(str, str2, c, z);
        if (a == null) {
            return null;
        }
        return a[0];
    }

    /* renamed from: a */
    static String[] m42252a(String str, String str2, char c, boolean z) {
        int i;
        int length = str2.length();
        List list = null;
        for (int i2 = 0; i2 < length; i2 = i) {
            int indexOf = str2.indexOf(str, i2);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            boolean z2 = true;
            i = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i);
                if (indexOf2 < 0) {
                    i = str2.length();
                } else if (m42246a((CharSequence) str2, indexOf2) % 2 != 0) {
                    i = indexOf2 + 1;
                } else {
                    if (list == null) {
                        list = new ArrayList(3);
                    }
                    String c2 = m42258c(str2.substring(length2, indexOf2));
                    if (z) {
                        c2 = c2.trim();
                    }
                    if (!c2.isEmpty()) {
                        list.add(c2);
                    }
                    i = indexOf2 + 1;
                }
                z2 = false;
            }
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    private static int m42246a(CharSequence charSequence, int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (i2 >= 0 && charSequence.charAt(i2) == '\\') {
            i3++;
            i2--;
        }
        return i3;
    }
}
