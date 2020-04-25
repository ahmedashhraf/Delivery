package org.apache.commons.codec.p524i;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.p523h.C15075c;
import org.jivesoftware.smack.util.StringUtils;

/* renamed from: org.apache.commons.codec.i.a */
/* compiled from: DigestUtils */
public class C15076a {
    /* renamed from: a */
    static MessageDigest m66778a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: b */
    private static MessageDigest m66781b() {
        return m66778a("SHA");
    }

    /* renamed from: c */
    public static String m66783c(String str) {
        return new String(C15075c.m66772c(m66782b(str)));
    }

    /* renamed from: d */
    public static byte[] m66786d(String str) {
        return m66784c(str.getBytes());
    }

    /* renamed from: e */
    public static String m66787e(String str) {
        return new String(C15075c.m66772c(m66786d(str)));
    }

    /* renamed from: b */
    public static byte[] m66782b(String str) {
        return m66779a(str.getBytes());
    }

    /* renamed from: c */
    public static byte[] m66784c(byte[] bArr) {
        return m66781b().digest(bArr);
    }

    /* renamed from: d */
    public static String m66785d(byte[] bArr) {
        return new String(C15075c.m66772c(m66784c(bArr)));
    }

    /* renamed from: a */
    private static MessageDigest m66777a() {
        return m66778a(StringUtils.MD5);
    }

    /* renamed from: b */
    public static String m66780b(byte[] bArr) {
        return new String(C15075c.m66772c(m66779a(bArr)));
    }

    /* renamed from: a */
    public static byte[] m66779a(byte[] bArr) {
        return m66777a().digest(bArr);
    }
}
