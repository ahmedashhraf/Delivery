package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.C3977a;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.s */
final class C4608s extends C4584g {

    /* renamed from: b */
    private final /* synthetic */ C4606r f13852b;

    C4608s(C4606r rVar) {
        this.f13852b = rVar;
    }

    /* renamed from: b */
    public final void mo18690b(String str) {
        if (str != null) {
            this.f13852b.mo17744a(new C4612u(str));
        } else {
            this.f13852b.mo17744a(C4598n.m19687d(new Status(C3977a.f12608v)));
        }
    }
}
