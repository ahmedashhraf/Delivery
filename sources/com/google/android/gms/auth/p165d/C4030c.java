package com.google.android.gms.auth.p165d;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4059a.C4063d.C4067d;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.C4083h.C4084a;
import com.google.android.gms.common.internal.C4416z;
import com.google.android.gms.common.internal.C4416z.C4417a;
import com.google.android.gms.internal.auth.C4577c0;
import com.google.android.gms.tasks.C5560k;

/* renamed from: com.google.android.gms.auth.d.c */
public class C4030c extends C4083h<C4067d> {

    /* renamed from: j */
    private final C4028b f12719j = new C4577c0();

    C4030c(@C0193h0 Context context) {
        super(context, C4027a.f12717c, null, C4084a.f12836c);
    }

    /* renamed from: a */
    public C5560k<Void> mo17560a(boolean z) {
        return C4416z.m19055a(this.f12719j.mo17556b(mo17679c(), z));
    }

    C4030c(@C0193h0 Activity activity) {
        super(activity, C4027a.f12717c, null, C4084a.f12836c);
    }

    /* renamed from: a */
    public C5560k<Account> mo17559a(String str) {
        return C4416z.m19057a(this.f12719j.mo17554a(mo17679c(), str), (C4417a<R, T>) new C4037j<R,T>(this));
    }

    /* renamed from: a */
    public C5560k<Void> mo17558a(Account account) {
        return C4416z.m19055a(this.f12719j.mo17553a(mo17679c(), account));
    }
}
