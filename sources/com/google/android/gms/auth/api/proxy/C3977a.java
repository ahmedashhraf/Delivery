package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.C4058c;
import com.google.android.gms.common.api.C4081f;

@C4058c
/* renamed from: com.google.android.gms.auth.api.proxy.a */
public class C3977a extends C4081f {

    /* renamed from: p */
    public static final int f12602p = 3000;

    /* renamed from: q */
    public static final int f12603q = 3001;

    /* renamed from: r */
    public static final int f12604r = 3002;

    /* renamed from: s */
    public static final int f12605s = 3003;

    /* renamed from: t */
    public static final int f12606t = 3004;

    /* renamed from: u */
    public static final int f12607u = 3005;

    /* renamed from: v */
    public static final int f12608v = 3006;

    private C3977a() {
    }

    /* renamed from: a */
    public static String m17270a(int i) {
        switch (i) {
            case 3000:
                return "AUTH_API_INVALID_CREDENTIALS";
            case f12603q /*3001*/:
                return "AUTH_API_ACCESS_FORBIDDEN";
            case f12604r /*3002*/:
                return "AUTH_API_CLIENT_ERROR";
            case f12605s /*3003*/:
                return "AUTH_API_SERVER_ERROR";
            case f12606t /*3004*/:
                return "AUTH_TOKEN_ERROR";
            case f12607u /*3005*/:
                return "AUTH_URL_RESOLUTION";
            case f12608v /*3006*/:
                return "AUTH_APP_CERT_ERROR";
            default:
                return C4081f.m17592a(i);
        }
    }
}
