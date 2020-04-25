package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C4081f;

/* renamed from: com.google.android.gms.auth.api.signin.f */
public final class C3991f extends C4081f {

    /* renamed from: p */
    public static final int f12666p = 12500;

    /* renamed from: q */
    public static final int f12667q = 12501;

    /* renamed from: r */
    public static final int f12668r = 12502;

    private C3991f() {
    }

    /* renamed from: a */
    public static String m17364a(int i) {
        switch (i) {
            case f12666p /*12500*/:
                return "A non-recoverable sign in failure occurred";
            case f12667q /*12501*/:
                return "Sign in action cancelled";
            case f12668r /*12502*/:
                return "Sign-in in progress";
            default:
                return C4081f.m17592a(i);
        }
    }
}
