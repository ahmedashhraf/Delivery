package org.apache.http.p550k0;

import java.io.UnsupportedEncodingException;

/* renamed from: org.apache.http.k0.c */
/* compiled from: EncodingUtils */
public final class C15455c {
    private C15455c() {
    }

    /* renamed from: a */
    public static String m68493a(byte[] bArr, int i, int i2, String str) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter may not be null");
        } else if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        } else {
            try {
                return new String(bArr, i, i2, str);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr, i, i2);
            }
        }
    }

    /* renamed from: a */
    public static String m68494a(byte[] bArr, String str) {
        if (bArr != null) {
            return m68493a(bArr, 0, bArr.length, str);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }

    /* renamed from: a */
    public static byte[] m68496a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("data may not be null");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("charset may not be null or empty");
        } else {
            try {
                return str.getBytes(str2);
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
    }

    /* renamed from: a */
    public static byte[] m68495a(String str) {
        if (str != null) {
            try {
                return str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                throw new Error("HttpClient requires ASCII support");
            }
        } else {
            throw new IllegalArgumentException("Parameter may not be null");
        }
    }

    /* renamed from: a */
    public static String m68492a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                return new String(bArr, i, i2, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                throw new Error("HttpClient requires ASCII support");
            }
        } else {
            throw new IllegalArgumentException("Parameter may not be null");
        }
    }

    /* renamed from: a */
    public static String m68491a(byte[] bArr) {
        if (bArr != null) {
            return m68492a(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Parameter may not be null");
    }
}
