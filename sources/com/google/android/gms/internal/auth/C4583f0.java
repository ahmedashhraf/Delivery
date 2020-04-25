package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.f0 */
final class C4583f0 extends C4589i0 {

    /* renamed from: b */
    private final /* synthetic */ C4581e0 f13841b;

    C4583f0(C4581e0 e0Var) {
        this.f13841b = e0Var;
    }

    /* renamed from: a */
    public final void mo17561a(Account account) {
        this.f13841b.mo17744a(new C4591j0(account != null ? Status.f12780P : C4577c0.f13838a, account));
    }
}
