package com.google.android.gms.common.api;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.annotation.C4056a;

@C4056a
/* renamed from: com.google.android.gms.common.api.f */
public class C4081f {

    /* renamed from: a */
    public static final int f12812a = -1;

    /* renamed from: b */
    public static final int f12813b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f12814c = 2;
    @Deprecated

    /* renamed from: d */
    public static final int f12815d = 3;

    /* renamed from: e */
    public static final int f12816e = 4;

    /* renamed from: f */
    public static final int f12817f = 5;

    /* renamed from: g */
    public static final int f12818g = 6;

    /* renamed from: h */
    public static final int f12819h = 7;

    /* renamed from: i */
    public static final int f12820i = 8;

    /* renamed from: j */
    public static final int f12821j = 10;

    /* renamed from: k */
    public static final int f12822k = 13;

    /* renamed from: l */
    public static final int f12823l = 14;

    /* renamed from: m */
    public static final int f12824m = 15;

    /* renamed from: n */
    public static final int f12825n = 16;

    /* renamed from: o */
    public static final int f12826o = 17;

    @C4056a
    protected C4081f() {
    }

    @C0193h0
    /* renamed from: a */
    public static String m17592a(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
        }
    }
}
