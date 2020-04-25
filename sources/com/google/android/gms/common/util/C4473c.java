package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.util.c */
public final class C4473c {
    @C4056a
    /* renamed from: a */
    public static byte[] m19316a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    @C4056a
    /* renamed from: b */
    public static byte[] m19318b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    @C4056a
    /* renamed from: c */
    public static byte[] m19320c(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    @C4056a
    /* renamed from: a */
    public static String m19315a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @C4056a
    /* renamed from: b */
    public static String m19317b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    @C4056a
    /* renamed from: c */
    public static String m19319c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
