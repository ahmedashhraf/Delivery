package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.p165d.C4028b.C4029a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.j0 */
final class C4591j0 implements C4029a {

    /* renamed from: a */
    private final Status f13845a;

    /* renamed from: b */
    private final Account f13846b;

    public C4591j0(Status status, Account account) {
        this.f13845a = status;
        this.f13846b = account;
    }

    /* renamed from: e */
    public final Account mo17557e() {
        return this.f13846b;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f13845a;
    }
}
