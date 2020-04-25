package com.google.android.gms.location;

import com.google.android.gms.common.api.C4081f;

/* renamed from: com.google.android.gms.location.g */
public final class C5130g extends C4081f {

    /* renamed from: p */
    public static final int f14775p = 1000;

    /* renamed from: q */
    public static final int f14776q = 1001;

    /* renamed from: r */
    public static final int f14777r = 1002;

    private C5130g() {
    }

    /* renamed from: a */
    public static String m22394a(int i) {
        switch (i) {
            case 1000:
                return "GEOFENCE_NOT_AVAILABLE";
            case 1001:
                return "GEOFENCE_TOO_MANY_GEOFENCES";
            case 1002:
                return "GEOFENCE_TOO_MANY_PENDING_INTENTS";
            default:
                return C4081f.m17592a(i);
        }
    }
}
