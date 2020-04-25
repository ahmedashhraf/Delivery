package com.google.android.gms.internal.auth;

import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzaz extends FastSafeParcelableJsonResponse {

    /* renamed from: a */
    private static String f13870a = "AUTH";

    /* renamed from: O0 */
    public byte[] mo18519O0() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
