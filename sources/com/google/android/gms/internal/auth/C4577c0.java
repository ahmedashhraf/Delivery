package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.p165d.C4027a;
import com.google.android.gms.auth.p165d.C4028b;
import com.google.android.gms.auth.p165d.C4028b.C4029a;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.c0 */
public final class C4577c0 implements C4028b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Status f13838a = new Status(13);

    /* renamed from: a */
    public final void mo17555a(C4086i iVar, boolean z) {
        mo17556b(iVar, z);
    }

    /* renamed from: b */
    public final C4237l<C4246q> mo17556b(C4086i iVar, boolean z) {
        return iVar.mo17705b(new C4579d0(this, C4027a.f12717c, iVar, z));
    }

    /* renamed from: a */
    public final C4237l<C4029a> mo17554a(C4086i iVar, String str) {
        return iVar.mo17705b(new C4581e0(this, C4027a.f12717c, iVar, str));
    }

    /* renamed from: a */
    public final C4237l<C4246q> mo17553a(C4086i iVar, Account account) {
        return iVar.mo17705b(new C4585g0(this, C4027a.f12717c, iVar, account));
    }
}
