package com.google.api.client.repackaged.org.apache.commons.codec.p311e;

import java.io.UnsupportedEncodingException;
import org.apache.http.p549j0.C15430e;

/* renamed from: com.google.api.client.repackaged.org.apache.commons.codec.e.c */
/* compiled from: StringUtils */
public class C7318c {
    /* renamed from: a */
    public static byte[] m35457a(String str) {
        return m35458a(str, "ISO-8859-1");
    }

    /* renamed from: b */
    public static byte[] m35460b(String str) {
        return m35458a(str, "US-ASCII");
    }

    /* renamed from: c */
    public static byte[] m35462c(String str) {
        return m35458a(str, C15430e.f44594u);
    }

    /* renamed from: d */
    public static byte[] m35464d(String str) {
        return m35458a(str, "UTF-16BE");
    }

    /* renamed from: e */
    public static byte[] m35466e(String str) {
        return m35458a(str, "UTF-16LE");
    }

    /* renamed from: f */
    public static byte[] m35468f(String str) {
        return m35458a(str, "UTF-8");
    }

    /* renamed from: a */
    public static byte[] m35458a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e) {
            throw m35454a(str2, e);
        }
    }

    /* renamed from: b */
    public static String m35459b(byte[] bArr) {
        return m35456a(bArr, "US-ASCII");
    }

    /* renamed from: c */
    public static String m35461c(byte[] bArr) {
        return m35456a(bArr, C15430e.f44594u);
    }

    /* renamed from: d */
    public static String m35463d(byte[] bArr) {
        return m35456a(bArr, "UTF-16BE");
    }

    /* renamed from: e */
    public static String m35465e(byte[] bArr) {
        return m35456a(bArr, "UTF-16LE");
    }

    /* renamed from: f */
    public static String m35467f(byte[] bArr) {
        return m35456a(bArr, "UTF-8");
    }

    /* renamed from: a */
    private static IllegalStateException m35454a(String str, UnsupportedEncodingException unsupportedEncodingException) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": ");
        sb.append(unsupportedEncodingException);
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static String m35456a(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            throw m35454a(str, e);
        }
    }

    /* renamed from: a */
    public static String m35455a(byte[] bArr) {
        return m35456a(bArr, "ISO-8859-1");
    }
}
