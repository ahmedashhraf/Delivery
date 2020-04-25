package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.C4081f;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.c */
public final class C3925c extends C4081f {

    /* renamed from: p */
    public static final int f12447p = 20500;

    /* renamed from: q */
    public static final int f12448q = 20501;

    /* renamed from: r */
    public static final int f12449r = 20502;

    /* renamed from: s */
    public static final int f12450s = 20503;

    /* renamed from: t */
    public static final int f12451t = 20504;

    private C3925c() {
    }

    /* renamed from: a */
    public static String m17121a(int i) {
        switch (i) {
            case f12447p /*20500*/:
                return "NOT_ALLOWED_SECURITY";
            case f12448q /*20501*/:
                return "NO_DATA_AVAILABLE";
            case f12449r /*20502*/:
                return "INVALID_REQUEST";
            case f12450s /*20503*/:
                return "CHALLENGE_NOT_ALLOWED";
            case f12451t /*20504*/:
                return "SESSION_INACTIVE";
            default:
                return C4081f.m17592a(i);
        }
    }
}
