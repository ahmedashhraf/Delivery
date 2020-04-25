package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.auth.api.credentials.f */
public final class C3958f {

    /* renamed from: a */
    public static final String f12561a = "https://www.facebook.com";

    /* renamed from: b */
    public static final String f12562b = "https://accounts.google.com";

    /* renamed from: c */
    public static final String f12563c = "https://www.linkedin.com";

    /* renamed from: d */
    public static final String f12564d = "https://login.live.com";

    /* renamed from: e */
    public static final String f12565e = "https://www.paypal.com";

    /* renamed from: f */
    public static final String f12566f = "https://twitter.com";

    /* renamed from: g */
    public static final String f12567g = "https://login.yahoo.com";

    private C3958f() {
    }

    @C0195i0
    /* renamed from: a */
    public static final String m17251a(@C0193h0 Account account) {
        C4300a0.m18621a(account, (Object) "account cannot be null");
        if ("com.google".equals(account.type)) {
            return f12562b;
        }
        if ("com.facebook.auth.login".equals(account.type)) {
            return f12561a;
        }
        return null;
    }
}
